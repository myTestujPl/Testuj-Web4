public class Char1 {

    // za pomocą metod dostępnych w klasie Character, sprawdź czy znaki small i big są napisane z małej czy z wielkiej litery

    public static void main(String[] args) {
        char small = 'a';
        char big = 'A';

        //1 sposób
        System.out.println(Character.isUpperCase(small));
        System.out.println(Character.isUpperCase(big));

        //2 sposób
        boolean isSmallUpperCase = Character.isUpperCase(small);
        System.out.println(isSmallUpperCase);

        boolean isBigUpperCase = Character.isUpperCase(big);
        System.out.println(isBigUpperCase);

    }

}
