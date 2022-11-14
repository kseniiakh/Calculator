 class ArabicCalculate {

     public static void getArabicNumber() {

         Main.arr = Main.inputLine.split(" ");

         for (int i = 0; i < Main.arr.length; i++) {
         }
         Main.a = Integer.parseInt(Main.arr[0]);
         Main.symbol = (Main.arr[1]);
         Main.b = Integer.parseInt(Main.arr[2]);


         for (int i = 0; i <= Main.arr.length; i++) {
             if ((Main.a < 1 || Main.a > 10) || (Main.b < 1 || Main.b > 10)) {
                 throw new IllegalArgumentException("Ограничение ввода: операнд должен быть в диапозоне 1-10");
             }
             if (i == ',') {
                 throw new IllegalArgumentException("Ограничение ввода: операнд должен быть целым числом");
             }
             if (!Main.symbol.contains("+") && !Main.symbol.contains("-") && !Main.symbol.contains("*") && !Main.symbol.contains("/")) {
                 throw new NumberFormatException("Ограничение ввода: допустимые арифметические операции: a+b, a-b, a*b, a/b");
             }
             if (Main.inputLine.length() > 7 || Main.inputLine.length() < 4) {
                 throw new NumberFormatException("Ограничения ввода: необходимо ввести два операнда");
             }
         }
     }
     public static void arabicCalculate() {

        switch (Main.symbol) {
            case "+" -> {
                Main.c = Main.a + Main.b;
                Main.result = String.valueOf(Main.c);
                System.out.println(Main.result);
                break;
            }
            case "-" -> {
                Main.c = Main.a - Main.b;
                Main.result = String.valueOf(Main.c);
                System.out.println(Main.result);
                break;
            }
            case "*" -> {
                Main.c = Main.a * Main.b;
                Main.result = String.valueOf(Main.c);
                System.out.println(Main.result);
                break;
            }
            case "/" -> {
                Main.c = Main.a / Main.b;
                Main.result = String.valueOf(Main.c);
                System.out.println(Main.result);
                break;
            }
        }
    }
}
