package Calculator;

public class Convert {
    private int a;
    private String k;


    public void setK(String k) {
        this.k = k;
    }
    public void setA(int a) {
        this.a = a;
    }




    public String convertFrArabicToRome() {
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
            default:
                System.out.println("Получилось больше 10");
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
