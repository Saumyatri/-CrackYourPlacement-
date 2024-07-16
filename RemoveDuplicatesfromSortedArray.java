class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int nums[]) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String args[]) {
        int num[] = {1, 1, 2};
        RemoveDuplicatesfromSortedArray obj = new RemoveDuplicatesfromSortedArray();
        int newLength = obj.removeDuplicates(num);
        System.out.println(newLength);
    }
}
