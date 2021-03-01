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

...............................................................................................................

/*
Given an array of ints, is it possible to choose a group of some of the ints, such that 
the group sums to the given target, with this additional constraint: if there are numbers in 
the array that are adjacent and the identical value, they must either all be chosen, or none of 
them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle 
must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values).
*/

