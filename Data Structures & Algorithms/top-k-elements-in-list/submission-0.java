class Solution
 {
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue()
                );

        maxHeap.addAll(freq.entrySet());

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }

        return result;
    }
    public static void main(String[] argc)
    {
        int[] nums_for_test = {1,2,2,3,3,3};
        int k = 2;
        int[] result = topKFrequent(nums_for_test,k);
    }





}
