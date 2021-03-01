/*Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]*/

public List<Integer> rightDigit(List<Integer>nums) {
    nums.replaceAll(n -> n % 10);
    return nums;
}

..................................................................................................................

/*Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
*/

public List<Integer> doubling(List<Integer>nums) {
    nums.replaceAll(n -> n * 2);
    return nums;
}

.................................................................................................................

/*Given a list of strings, return a list where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
*/

public List<String> noX(List<String>strings) {
    strings.replaceAll(n -> n.replace("x", ""));
    return strings;
}


