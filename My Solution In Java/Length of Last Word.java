//Solution 1
public int lengthOfLastWord(String s) {
    int count = 0;
    int index = s.length() - 1;
    //Filtering the blank space
    while (true) {
        if (index < 0 || s.charAt(index) != ' ')
            break;
        index--;
    }
    //Count the length of the last word
    for (int i = index; i >= 0; i--) {
        if (s.charAt(i) == ' ') {
            break;
        }
        count++;
    }
    return count;
}
//End
