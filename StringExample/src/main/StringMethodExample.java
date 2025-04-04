package main;

public class StringMethodExample {
    public static void main(String[] args) {
        String s1 = "This is a test";
        String s2 = "This can be a TEST";
        int start = 10;
        int start2 = 14;
        int numChars = 4;
        System.out.println("Case 1: " +
                s1.regionMatches(start, s2, start2, numChars));
        int pos = 10;
        int pos1 = 14;
        System.out.println("Case 2: " + 
                s1.regionMatches(true, pos, s2, pos1, numChars));
    }
}
