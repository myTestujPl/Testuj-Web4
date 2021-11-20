public class Char3 {

    //za pomocą metod dostępnych w klasie Character, sprawdź czy poniższe zmienne są literami czy numerami

    public static void main(String[] args) {
        char small = 'a';
        char big = 'A';
        char num = '1';

        System.out.println(Character.isDigit(small));
        System.out.println(Character.isDigit(big));
        System.out.println(Character.isDigit(num));

        System.out.println(Character.isLetter(small));
        System.out.println(Character.isLetter(big));
        System.out.println(Character.isLetter(num));
    }
}
