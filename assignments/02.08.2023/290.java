class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();  
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            if(!map1.containsKey(c)){
                map1.put(c,words[i]);
            }
            if(!map2.containsKey(words[i])){
                map2.put(words[i],c);
            }
            if(!map1.get(c).equals(words[i]) || !map2.get(words[i]).equals(c)){
                return false;
            }
        }   
        return true;
    }
}