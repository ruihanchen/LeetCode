//Solution 1
public List<String> generateParenthesis(int n) {
    List<String> combinations = new ArrayList();
    generateAll(new char[2 * n], 0, combinations);
    return combinations;
}

public void generateAll(char[] current, int pos, List<String> result) {
    if (pos == current.length) {
        if (valid(current))
            result.add(new String(current));
    } else {
        current[pos] = '(';
        generateAll(current, pos+1, result);
        current[pos] = ')';
        generateAll(current, pos+1, result);
    }
}

public boolean valid(char[] current) {
    int balance = 0;
    for (char c: current) {
        if (c == '(') balance++;
        else balance--;
        if (balance < 0) return false;
    }
    return (balance == 0);
}

//Solution 2
public List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList();
    backtrack(ans, "", 0, 0, n);
    return ans;
}

public void backtrack(List<String> ans, String cur, int left, int right, int n){
    if (cur.length() == n * 2) {
        ans.add(cur);
        return;
    }
  
    if (left < n)
        backtrack(ans, cur+"(", left+1, right, n);
  
    if (right < left)
        backtrack(ans, cur+")", left, right+1, n);
}
//End
