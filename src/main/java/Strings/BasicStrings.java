package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2 + string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String str = "";
        for(int i = 0; i < string.length(); i++){
            str = str + " ";
        }
        return str;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        String str = "";
        for(int i = 0; i < string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))) {
                str += Character.toLowerCase(string.charAt(i));
            }
            else if(Character.isLowerCase(string.charAt(i))){
                str += Character.toUpperCase(string.charAt(i));
            }
        }
        return str;
    }

    public String oneAtATime(String string1, String string2) {
        int i1 = 0;
        int i2 = 0;

    }
}
