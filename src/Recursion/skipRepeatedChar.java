package Recursion;

public class skipRepeatedChar {
    public  static void skip(int i, String s, String ans){
        if(i==s.length()) {
            System.out.println(ans); return;
        }

        if(s.charAt(i)!='a') ans+=s.charAt(i);
        skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s="Shailesh Kumar";
        skip(0,s,"");
    }
}
