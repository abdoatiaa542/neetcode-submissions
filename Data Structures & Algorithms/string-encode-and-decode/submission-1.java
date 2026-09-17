class Solution {

    public String encode(List<String> strs) {
         StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length())            
                    .append(":")             
                    .append(s);              
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
             List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int colonIndex = str.indexOf(':', i);       
            int length = Integer.parseInt(str.substring(i, colonIndex));
            String word = str.substring(colonIndex + 1, colonIndex + 1 + length);
            result.add(word);
            i = colonIndex + 1 + length;                
        }

        return result;

    }
}
