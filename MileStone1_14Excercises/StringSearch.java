/**
 * Created by pujithapabbaraju on 16/05/18.
 */
/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
If inputs are "abcXY123XYijk" and "XY", output should be "c13i". If inputs are "XY123XY" and "XY", output should be "13".
If inputs are "XY1XY" and "XY", output should be "11".
 */
public class StringSearch {
    public static String StringSearchIgnoreCase(String str1, String str2){
        String returnString = "";
        int beginIndex =  str1.indexOf(str2);
        int lastOccuranceIndex = str1.lastIndexOf(str2);
        if(beginIndex == lastOccuranceIndex) {
            if (beginIndex == 0 && (beginIndex + str2.length() == str1.length())) {
                System.out.println("str1 & str2 are equal.");
                return "";
            }
            if (beginIndex == 0 && (beginIndex + str2.length() != str1.length())) {
                returnString += str1.charAt(str2.length());
                return returnString;
            }
            if (beginIndex != 0 && (beginIndex + str2.length() != str1.length())) {
                returnString += str1.charAt(beginIndex - 1);
                returnString += str1.charAt(beginIndex + str2.length());
                return returnString;
            }
            if (beginIndex != 0 && (beginIndex + str2.length() == str1.length())) {
                returnString += str1.charAt(beginIndex - 1);
                return returnString;
            }
        }
        else {

            char ar1[] = str1.toCharArray();
            char ar2[] = str2.toCharArray();
            for(int i=0; i<ar1.length ; i++) {
                if(ar1[i] == ar2[0]) {
                    if(i!=0)
                        returnString +=ar1[i-1];
                }
                if(ar1[i] == ar2[ar2.length -1]) {
                    if(i!=ar1.length-1)
                        returnString +=ar1[i+1];
                }

            }
            return returnString;

        }
        return "";
    }

    public static void main(String args[]){
        System.out.println(StringSearch.StringSearchIgnoreCase("abcXY123XYijk","XY"));
        System.out.println(StringSearch.StringSearchIgnoreCase("XY123XY", "XY"));
        System.out.println(StringSearch.StringSearchIgnoreCase("XY1XY","XY"));
        System.out.println(StringSearch.StringSearchIgnoreCase("XY","XY"));
        System.out.println(StringSearch.StringSearchIgnoreCase("XY1","XY"));
        System.out.println(StringSearch.StringSearchIgnoreCase("1XY","XY"));
        System.out.println(StringSearch.StringSearchIgnoreCase("1XY1","XY"));

    }
}
