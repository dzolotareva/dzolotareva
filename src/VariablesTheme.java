public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        byte guaranteePeriod = 4;
        short cpuFrequency = 2200;
        int amountOfRam = 262_144;
        long price = 93_039;
        float screenDiagonal = 15.6f;
        double weight = 1.675d;
        char numberOfCores = '4';
        System.out.println("Гарантийный срок: " + guaranteePeriod + " мес.");
        System.out.println("Частота процессора: " + cpuFrequency + " Ггц");
        System.out.println("Объем памяти: " + amountOfRam + " Мб");
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Диагональ экрана: " + screenDiagonal + "'");
        System.out.println("Вес: " + weight + " кг.");

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int totalCost = penPrice + bookPrice;
        int discount = (totalCost * 11 / 100);
        int discountedPrice = totalCost - discount;
        System.out.println("Общая стоимость товаров без скидки: " + totalCost);
        System.out.println("Сумма скидки: " + discount);
        System.out.println("Общая стоимость товаров со скидкой: " + discountedPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNumberMax = 127;
        short shortNumberMax = 32767;
        int intNumberMax = 2147483647;
        long longNumberMax = 9223372036854775807l;
        System.out.println("Ряд для byte: " + byteNumberMax + "," + ++byteNumberMax + "," + --byteNumberMax);
        System.out.println("Ряд для short: " + shortNumberMax + "," + ++shortNumberMax + "," + --shortNumberMax);
        System.out.println("Ряд для int: " + intNumberMax + "," + ++intNumberMax + "," + --intNumberMax);
        System.out.println("Ряд для long: " + longNumberMax + "," + ++longNumberMax + "," + --longNumberMax);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c;
        System.out.println("Метод перестановки с использованием третьей переменной: " + "До: a,b = " + a + "," + b);
        c = a;
        a = b;
        b = c;
        System.out.println("После: a,b = " + a + "," + b);

        System.out.println("Метод перестановки с использованием арифметических операций: " + "До: a,b = " + a + "," + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("После: a,b = " + a + "," + b);

        System.out.println("Метод перестановки с помощью побитовой операции ^: " + "До: a,b = " + a + "," + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("После: a,b = " + a + "," + b);

        System.out.println("\n6. Вывод символов и их кодов");

        char symbol1 = 35;
        int srcNum1 = 35;
        char symbol2 = 38;
        int srcNum2 = 38;
        char symbol3 = 64;
        int srcNum3 = 64;
        char symbol4 = 94;
        int srcNum4 = 94;
        char symbol5 = 95;
        int srcNum5 = 95;
        System.out.println(srcNum1 + " " + symbol1);
        System.out.println(srcNum2 + " " + symbol2);
        System.out.println(srcNum3 + " " + symbol3);
        System.out.println(srcNum4 + " " + symbol4);
        System.out.println(srcNum5 + " " + symbol5);

        System.out.println("\n7. Вывод в консоль ASCll-арт Дюка");
        char slash1 = '\\';
        char slash2 = '/';
        char underscore = '_';
        char bracketOpen = '(';
        char bracketClose = ')';
        System.out.println("     " + '/' + '\\' + "    ");
        System.out.println("    " + '/' + "  " + '\\' + "   ");
        System.out.println("   " + '/' + '_' + '(' + " " + ')' + '\\' + "  ");
        System.out.println("  " + '/' + "      " + '\\' + " ");
        System.out.println(" " + '/' + '_' + '_' + '_' + '_' + '/' + '\\' + '_' + '_' + '\\');

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int numberOfHundreds = number / 100;
        int numberOfTens = number / 10 % 10;
        int numberOfUnits = number % 10;
        System.out.println("Число 123 содержит:\n" + "      " + numberOfHundreds + " сотню\n" + "      " + numberOfTens + " десятка\n" + "      " + numberOfUnits + " единицы");
        System.out.println("Сумма его цифр = " + (numberOfHundreds + numberOfTens + numberOfUnits));
        System.out.println("Произведение = " + (numberOfHundreds * numberOfTens * numberOfUnits));

        System.out.println("\n9. Вывод времени");
        int srcNum = 86399;
        int hours = srcNum / 3600;
        int minutes = srcNum % 3600 / 60;
        int seconds = minutes % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}