package Calculator;

public class Convert {
    private String k;


    public void setK(String k) {
        this.k = k;
    }




    public String calculationATR(int n) {
        String lastNumR;
        String firstNumR;
        String result = "";

        if ((n > 11) && (n <= 19)) {
            int b = n - 10;
            lastNumR = Convert.convert(b);
            int k = 10;
            firstNumR = Convert.convert(k);
            result = firstNumR + lastNumR;
        }else
        if ((n >= 21) && (n <= 29)){
            int b = n - 20;
            lastNumR = Convert.convert(b);
            int k = 20;
            firstNumR = Convert.convert(k);
            result = firstNumR + lastNumR;

        } else
        if ((n >= 31) && (n <= 39)){
            int b = n - 30;
            lastNumR = Convert.convert(b);
            int k = 30;
            firstNumR = Convert.convert(k);
            result = firstNumR + lastNumR;
        } else
        if ((n >= 41) && (n <= 49)){
            int b = n - 40;
            lastNumR = Convert.convert(b);
            int k = 40;
            firstNumR = Convert.convert(k);
            result = firstNumR + lastNumR;
        } else
        if ((n >= 51) && (n <= 59)){
            int b = n - 50;
            lastNumR = Convert.convert(b);
            int k = 50;
            firstNumR = Convert.convert(k);
            result = firstNumR + lastNumR;
        } else
        if ((n >= 61) && (n <= 69)){
            int b = n - 60;
            lastNumR = Convert.convert(b);
            int k = 60;
            firstNumR = Convert.convert(k);
            result = firstNumR + lastNumR;
        } else
        if ((n >= 71) && (n <= 79)){
            int b = n - 70;
            lastNumR = Convert.convert(b);
            int k = 70;
            firstNumR = Convert.convert(k);
            result = firstNumR + lastNumR;
        } else
        if ((n >= 81) && (n <= 89)){
            int b = n - 80;
            lastNumR = Convert.convert(b);
            int k = 80;
            firstNumR = Convert.convert(k);
            result = firstNumR + lastNumR;
        } else
        if ((n >= 91) && (n <= 99)){
            int b = n - 90;
            lastNumR = Convert.convert(b);
            int k = 90;
            firstNumR = Convert.convert(k);
            result = firstNumR + lastNumR;
        } else {
            result = Convert.convert(n);
        }
        return result;
    }

    public static String convert(int a) {
        String result = "";
        switch (a) {
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
            case 10:
                result = "X";
                break;
            case 20:
                result = "XX";
                break;
            case 30:
                result = "XXX";
                break;
            case 40:
                result = "XXXX";
                break;
            case 50:
                result = "L";
                break;
            case 60:
                result = "LX";
                break;
            case 70:
                result = "LXX";
                break;
            case 80:
                result = "LXX";
                break;
            case 90:
                result = "LXXX";
                break;
            case 100:
                result = "C";
                break;
            default:
                System.out.println("Что то пошло не так");
        }
        return result;
    }

    public int convertRomeToArabic() {
        int result = 0;
        switch (k) {
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            case "IV":
                result = 4;
                break;
            case "V":
                result = 5;
                break;
            case "VI":
                result = 6;
                break;
            case "VII":
                result = 7;
                break;
            case "VIII":
                result = 8;
                break;
            case "IX":
                result = 9;
                break;
            case "X":
                result = 10;
                break;
            default:
                System.out.println("Вы ввели число более 10");
        }
        return result;
    }


}
