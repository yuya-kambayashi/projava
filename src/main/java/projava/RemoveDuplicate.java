package projava;

public class RemoveDuplicate {
    public static void main(String[] args){
        var data = "abccbassbcc";

        var result = removeDuplicateString(data);

        System.out.println(data);
        System.out.println(result);
    }

    public static String removeDuplicateString(String data){

        char prev = 0;
        var builder = new StringBuilder();

        for (char ch : data.toCharArray()) {

            if (prev == ch){

                continue;
            }
            builder.append(ch);
            prev = ch;
        }
        var result = builder.toString();

        return result;
    }
}
