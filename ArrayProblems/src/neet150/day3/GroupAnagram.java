package neet150.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]



Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
 */
public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> ans=solveAnagram(strs);
        System.out.print(ans);
    }

    private static List<List<String>> solveAnagram(String[] strs) {
        if(strs==null||strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            char[] ca=new char[26];
            for(char c:str.toCharArray()) ca[c-'a']++;

            String keyStr=String.valueOf(ca);
            if(!map.containsKey(keyStr))
                map.put(keyStr,new ArrayList<>());
            map.get(keyStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
