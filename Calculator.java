import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Добро пожаловать в калькулятор");// приветствие
            System.out.println("Введите выражение");// предложение для пользователя начать работу
            Scanner scanner = new Scanner(System.in);// для того чтобы программа могла видеть(сканировать для себя) что написано в консоле
            String input = scanner.nextLine();// выдает в строке(String) то выражение, которое напишет пользователь в консоле.
            System.out.println("Ответ: " + calc(input));
        }
    }

    public static String calc(String input) throws Exception {
        String str0 = "0";
        String str1 = "1";
        int numberOne = Integer.parseInt(str0);
        int numberTwo = Integer.parseInt(str1);
        boolean getRom;
        String operator;
        String result;

        input = input.replaceAll(" ", "");
        String[] arr = input.split("[+\\-*/]");


        if (arr.length<2) {
            throw new Exception("Ваше выражение не является математической операцией");
        } else if (arr.length > 2) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор");
        }


        if (!getStringOrInt(arr[0]) && !getStringOrInt(arr[1])) {
            numberOne = Integer.parseInt(String.valueOf(Integer.parseInt(arr[0])));
            numberTwo = Integer.parseInt(String.valueOf(Integer.parseInt(arr[1])));
            if ( numberOne > 10 || numberOne < 0 || numberTwo  > 10 ||numberTwo  < 0) {
                throw new Exception("Числа должны быть от 1 до 10");
            } else if (input.contains("+")) {
                result = String.valueOf((numberOne + numberTwo));
            } else if (input.contains("-")) {
                result = (String.valueOf(numberOne - numberTwo));
            } else if (input.contains("*")) {
                result = String.valueOf((numberOne * numberTwo));
            } else result = String.valueOf((numberOne / numberTwo));
            return result;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr[0].equals(arr1[i])) {
                    numberOne = Integer.parseInt(String.valueOf(i));
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                if (arr[1].equals(arr1[i])) {
                    numberTwo = Integer.parseInt(String.valueOf(i));
                }
            }
            if (numberOne > 10 || numberOne < 1 || numberTwo > 10 || numberTwo < 1) {
                throw new Exception("Числа должны быть от 1 до 10");
            } else if (input.contains("+")) {
                result = String.valueOf(arr1[Integer.parseInt(String.valueOf(numberOne + numberTwo))]);
            } else if (input.contains("-")) {
                result = String.valueOf(arr1[Integer.parseInt(String.valueOf(numberOne - numberTwo))]);
            } else if (input.contains("*")) {
                result = String.valueOf(arr1[Integer.parseInt(String.valueOf(numberOne * numberTwo))]);
            } else result = String.valueOf(arr1[Integer.parseInt(String.valueOf(numberOne / numberTwo))]);
            return result;
        }
    }


    public static String[] arr1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
            "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
            "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
            "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
            "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
            "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
            "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
            "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
            "XCVIII", "XCIX", "C"};

    static boolean getStringOrInt(String a) { // объяснение для строки
        for (int i = 0; i < arr1.length; i++) {
            if (a.equals(arr1[i])) {
                return true;
            }
        }
        return false;
    }

}
