public class Char2 {

    // za pomocą operatora porównania '==' oraz metody 'equals' sprawdź czy zmienne small i small2 są sobie równe

    public static void main(String[] args) {
        char small = 'a';
        Character small2 = 'a';

        System.out.println(small == small2); //czy są identyczne? czy to jest ten sam obiekt?
        System.out.println(small2.equals(small)); // czy wartość tych obiektów jest taka sama?


        //to samo dla typu String:

        String text = new String("Ania");
        String text2 = "Ania";

        System.out.println(text == text2); //czy są identyczne? czy to jest ten sam obiekt?
        System.out.println(text.equals(text2)); // czy wartość tych obiektów jest taka sama?


    }
}
