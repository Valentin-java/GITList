package Calculator;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Convert cl1 = new Convert();
        Convert cl2 = new Convert();
        Convert cl3 = new Convert();
        Scanner sc = new Scanner(System.in);
        String[] calc = new String[2];

        System.out.println("Введите число: ");
        String data = sc.nextLine();
        calc = data.split(" ");




            if (Character.isDigit(calc[0].charAt(0)) && Character.isDigit(calc[2].charAt(0))) {

                int a = Integer.parseInt(calc[0]);
                int b = Integer.parseInt(calc[2]);
                System.out.println("Ответ: " + Calc.getResult(a, b, calc[1]));


            } else
                if (Character.isLetter(calc[0].charAt(0)) && Character.isLetter(calc[2].charAt(0))){

                cl1.setK(calc[0]);
                int a = cl1.convertRomeToArabic();

                cl2.setK(calc[2]);
                int b = cl2.convertRomeToArabic();

                System.out.println("Ответ: " + cl3.calculationATR(Calc.getResult(a, b, calc[1])));

            } else {System.out.println("Так это не работает!");}



    }

    public static int getResult(int a, int b, String zn) {
        int result = 0;
        switch (zn) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        return result;

    }
}










