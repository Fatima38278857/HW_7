public class Main {
    public static void main(String[] args) {
        // Блок 1
        System.out.println("Задание 1");
        int lad = 15_000; // Ежемесячное пополнение
        int Summa = 0; // Сумма накоплений
        int Month = 0; // Месяц
        while (Summa < 2_459_000) {
            Month++;
            Summa = Summa + (Summa / 100) + lad;
            System.out.println("Месяц" + " " + Month + " " + "сумма накоплений равна" + " " + Summa + "рублей");

        }
        // Задание 2
        System.out.println(" Задание 2");

        byte i = 0;
        while (i < 10) {
            i++;
            System.out.println(i + " ");

        }
        for (; i >= 1; i--) {
            System.out.println(i + " ");


        }
        System.out.println("Задание 3");

        int Y = 12000000; // Население
        int perYear = 17;  // 17 челове на 1000
        byte dying = 8;  // 8 человек на 1000
        int Y_perYear_dying = perYear - dying * Y / 1000;
        for (int j = 1; j <= 10; j++) {
            Y = Y + Y_perYear_dying;
            System.out.println("Год " + " " + j + " " + ". Численность населения составляет " + "" + Y + "" + " человек.");

        }

        // Блок 2
        System.out.println(" Задание 4");

        double Schet = 15000;
        int month = 1;
        while (Schet <= 12000000) {
            Schet = Schet + Schet * 0.07;
            Schet = Math.round(Schet * 100.0) / 100.0;
            System.out.println("Сумма накоплений " + Schet + " руб. Месяц " + month);
            month++;

        }
        System.out.println(" Задание 5");
        double Schet2 = 15000;
        int month2 = 0;
        while (Schet2 <= 12000000) {
            month2++;
            Schet2 = Schet2 + Schet2 * 0.07;
            Schet2 = Math.round(Schet2 * 100.0) / 100.0;
            if (month2 % 6 == 0) {
                System.out.println("Сумма накоплений " + Schet2 + " руб. Месяц " + month2);

            }

        }
    }

}




