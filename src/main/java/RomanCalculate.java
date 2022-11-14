class RomanCalculate {
    public static void getRomanNumber() {

        String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabicNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        Main.arr = Main.inputLine.split(" ");

        for (int i = 0; i < Main.arr.length; i++) {
        }
        String a = Main.arr[0];
        Main.symbol = (Main.arr[1]);
        String b = Main.arr[2];

        for (int i = 0; i < arabicNumbers.length; i++) {
            if (romanNumbers[i].equals(a)) {
                a = arabicNumbers[i];
            }
            if (romanNumbers[i].equals(b)) {
                b = arabicNumbers[i];
            }
        }

        Main.a = Integer.parseInt(a);
        Main.b = Integer.parseInt(b);

        int size = 0;
        for (char element : Main.inputLine.toCharArray()) {
            if (element == ' ')
                size++;
        }

        if (size > 2) {
            throw new NumberFormatException("Ограничения ввода: необходимо ввести два операнда");
        }
        if (Main.inputLine.length() > 11 || Main.inputLine.length() < 4) {
            throw new NumberFormatException("Ограничения ввода: необходимо ввести два операнда");
        }
        if (!Main.symbol.contains("+") && !Main.symbol.contains("-") && !Main.symbol.contains("*") && !Main.symbol.contains("/")) {
            throw new NumberFormatException("Ограничение ввода: допустимые арифметические операции: a+b, a-b, a*b, a/b");
        }
        if ((Main.a < Main.b) && (Main.inputLine.contains("-") || Main.inputLine.contains("/")) ) {
            throw new NumberFormatException("В римской системе счисления нет отрицательных чисел");
        }
    }

    public static void romanCalculate() {

        if (Main.symbol.equals("+")) {
            Main.c = Main.a + Main.b;
        } else if (Main.symbol.equals("-")) {
            Main.c = Main.a - Main.b;
        } else if (Main.symbol.equals("*")) {
            Main.c = Main.a * Main.b;
        } else if (Main.symbol.equals("/")) {
            Main.c = Main.a / Main.b;
        }
    }

    public static void toRomanNumber() {

        int units = Main.c % 10;
        int tenths = (Main.c % 100) / 10;
        int hundredths = (Main.c % 1000) / 100;


        String lineToUnits = "";
        switch (units) {
            case 1:
                lineToUnits =  "I";
                break;
            case 2:
                lineToUnits =  "II";
                break;
            case 3:
                lineToUnits =  "III";
                break;
            case 4:
                lineToUnits =  "IV";
                break;
            case 5:
                lineToUnits =  "V";
                break;
            case 6:
                lineToUnits =  "VI";
                break;
            case 7:
                lineToUnits =  "VII";
                break;
            case 8:
                lineToUnits =  "VIII";
                break;
            case 9:
                lineToUnits =  "IX";
                break;
        }



        String lineToTenths = "";
        switch (tenths) {
            case 1:
                lineToTenths =  "X";
                break;
            case 2:
                lineToTenths =  "XX";
                break;
            case 3:
                lineToTenths =  "XXX";
                break;
            case 4:
                lineToTenths =  "XL";
                break;
            case 5:
                lineToTenths =  "L";
                break;
            case 6:
                lineToTenths =  "LX";
                break;
            case 7:
                lineToTenths =  "LXX";
                break;
            case 8:
                lineToTenths =  "LXXX";
                break;
            case 9:
                lineToTenths =  "XC";
                break;
        }



        String lineToHundredths = "";
        switch (hundredths) {
            case 1:
                lineToHundredths =  "C";
                break;
        }

        Main.result = lineToHundredths + lineToTenths + lineToUnits;
        System.out.println(Main.result);
    }
}


