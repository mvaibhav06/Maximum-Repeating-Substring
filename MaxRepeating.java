public class MaxRepeating {
    public static int maxRepeating(String sequence, String word) {
        int out = word.length()*(sequence.length()/word.length());
        String temp = "";
        for(int i=0; i<out; i++){
            temp += word;
        }
        while(!sequence.contains(temp)){
            out--;
            temp = temp.substring(word.length());
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }
}
