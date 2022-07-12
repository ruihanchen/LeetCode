//Solution One
public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++)
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]); 
                    if (isInList(res, temp)) {
                        continue;
                    }
                    res.add(temp);
                }
            }
    }
    return res;

}

public boolean isInList(List<List<Integer>> l, List<Integer> a) {
    for (int i = 0; i < l.size(); i++) {
        if (isSame(l.get(i), a)) {
            return true;
        }
    }
    return false;
}

public boolean isSame(List<Integer> a, List<Integer> b) {
    int count = 0;
    Collections.sort(a);
    Collections.sort(b);
    for (int i = 0; i < a.size(); i++) {
        if (a.get(i) != b.get(i)) {
            return false;
        }
    }
    return true;
}
//End
