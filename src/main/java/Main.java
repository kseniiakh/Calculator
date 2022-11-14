import java.util.Scanner;

public class Main {
    public static String result;
    public static String inputLine;
    public static String symbol;
    public static String[] arr;
    public static int a;
    public static int b;
    public static int c;

    public static void main(String[] args) {

        calc(inputLine);
    }

    public static String calc(String input) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел арифметическое выражение арабскими или римскими цифрами");
        System.out.println("в формате a + b, a - b, a * b, a / b ");
        System.out.println("в интервале чисел 1-10 или I-X");
        inputLine = scanner.nextLine();



        if (inputLine.contains("1") || inputLine.contains("2") || inputLine.contains("3") ||
                inputLine.contains("4") || inputLine.contains("5") || inputLine.contains("6") ||
                inputLine.contains("7") || inputLine.contains("8") || inputLine.contains("9") || inputLine.contains("10")) {

            ArabicCalculate.getArabicNumber();
            ArabicCalculate.arabicCalculate();
        } else {
            RomanCalculate.getRomanNumber();
            RomanCalculate.romanCalculate();
            RomanCalculate.toRomanNumber();
        }
        return result;
    }
}



