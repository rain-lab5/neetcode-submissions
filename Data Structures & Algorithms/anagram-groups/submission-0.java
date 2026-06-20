class Solution
{
    public static List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> MainMapper = new HashMap<>();
        for(String s : strs)
        {
            char[] ToGetSorted = s.toCharArray();
            Arrays.sort(ToGetSorted);
            String SortedString = new String(ToGetSorted);
            if(!MainMapper.containsKey(SortedString))
            {
                MainMapper.put(SortedString, new ArrayList<>());
            }
            MainMapper.get(SortedString).add(s);

        }

    return new ArrayList<>(MainMapper.values());
    }


    public static void main(String[] argc)
    {
        String[] Input = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> Output = groupAnagrams(Input);
        //The brute force solution - > O(n^2) for the loops, O(k log k) for comparasions
        //While the HashMap solution where the sorted String is the key takes O(n * k log k)
        //Therefor the HashMap is the optimal solution! 


    }
}
