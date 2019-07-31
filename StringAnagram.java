public class StringAnagaram {
    public static boolean isAnagram(String word,String anagram){
        if(word.length()!=anagram.length()){
            return false;
        }
        char[] chars = word.toCharArray();
        for(char c:chars){
            int index = anagram.indexOf(c);
            if(index!=-1){
                anagram = anagram.substring(0,index)+anagram.substring(index+1);
            }
            else{
                return false;
            }
        }
            return anagram.isEmpty();
    }
    public static void main(String[] args){
        String anagram = "rome";
        String word = "more";
        if(isAnagram(word,anagram)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
