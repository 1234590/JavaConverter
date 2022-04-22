package Maps;
import  java.util.*;
import java.util.Map;
import java.util.HashMap;


public class Converter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, char[]> myMap = new HashMap<>();

        int[] decimals = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81,
                82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104,
                105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z'};

        for (int currentInt : decimals)
            myMap.put(currentInt, alphabet);

        int press=Integer.parseInt(scanner.nextLine());
        switch (press) {
             case 1: {
                int b = scanner.nextInt();
                String str = "";
                for (int j = 0; j < decimals.length; j++) {
                    if (decimals[j] == b) {
                        str = str + alphabet[j] + "";
                    }
                }

                System.out.println(str);
            }
            case 2: {
                String text = scanner.nextLine();
                char[] chars = text.toCharArray();
                String str = "";
                for (int i = 0; i < chars.length; i++) {
                    for (int j = 0; j < alphabet.length; j++){
                        if (alphabet[j] == chars[i]) {
                            str = str + decimals[j] + " ";
                        }
                    }
                }
                System.out.println(str);

            }
        }
    }
}
