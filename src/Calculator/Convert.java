package Calculator;

public class Convert {
    private String k;

    public void setK(String k) {
        this.k = k;
    }

    public static String calculationATR(int n) {
        String result;

        if ((n > 11) && (n <= 19)) {
            int k = 10;
            result = converted(k, n);
        }else
        if ((n >= 21) && (n <= 29)){
            int k = 20;
            result = converted(k, n);
        } else
        if ((n >= 31) && (n <= 39)){
            int k = 30;
            result = converted(k, n);
        } else
        if ((n >= 41) && (n <= 49)){
            int k = 40;
            result = converted(k, n);
        } else
        if ((n >= 51) && (n <= 59)){
            int k = 50;
            result = converted(k, n);
        } else
        if ((n >= 61) && (n <= 69)){
            int k = 60;
            result = converted(k, n);
        } else
        if ((n >= 71) && (n <= 79)){
            int k = 70;
            result = converted(k, n);
        } else
        if ((n >= 81) && (n <= 89)){
            int k = 80;
            result = converted(k, n);
        } else
        if ((n >= 91) && (n <= 99)){
            int k = 90;
            result = converted(k, n);
        } else {
            result = convert(n);
        }
        return result;
    }

    public static String converted(int k, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Convert.convert(k));
        int b = n - k;
        sb.append(Convert.convert(b));
        return sb.toString();
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
                result = "XL";
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
                result = "LXXX";
                break;
            case 90:
                result = "XC";
                break;
            case 100:
                result = "C";
                break;
            default:
                System.out.println("Ответ больше 100.");
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
