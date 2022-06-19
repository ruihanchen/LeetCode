//Solution 1
public int myAtoi(String str) {
        int sign = 1;
        int ans = 0, pop = 0;
        boolean hasSign = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-' && !hasSign) {
                sign = -1;
                hasSign = true;
                continue;
            }
            if (str.charAt(i) == '+' && !hasSign) {
                sign = 1;
                hasSign = true;
                continue;
            }
            if (str.charAt(i) == ' ' && !hasSign) {
                continue;
            }

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                hasSign = true;
                pop = str.charAt(i) - '0';
                if (ans * sign > Integer.MAX_VALUE / 10 || (ans * sign == Integer.MAX_VALUE / 10 && pop * sign > 7))
                    return 2147483647;
                if (ans * sign < Integer.MIN_VALUE / 10 || (ans * sign == Integer.MIN_VALUE / 10 && pop * sign < -8))
                    return -2147483648;
                ans = ans * 10 + pop;
            } else {
                return ans * sign;
            }
        }
        return ans * sign;
    }
//END
