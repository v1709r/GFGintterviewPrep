package Recursion;

public class GenerateSubsetsString {
    public static void main(String [] args)
    {
        String str = "ABC";
        String empt = "";
        subSet(str, empt, 0);
    }

    private static void subSet(String str, String empt, int count) {
        if(str.length() == count)
        {
            System.out.println(empt);
            return;
        }
        subSet(str,
                include(empt, str.charAt(count)),
                count+1);
        subSet(str,
                nInclude(empt),
            count+1);
    }

    private static String nInclude(String empt) {
        return empt;
    }

    private static String include(String empt, char c) {
        return empt+c;
    }
}
