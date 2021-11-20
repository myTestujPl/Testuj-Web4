package PracaDomowa;

public class Cwiczenie3 {
    public static void main(String[] args) {
        String contact = "Kontakt: 111-222-333";
        String phoneNumber = contact.substring(9);
        System.out.println(phoneNumber);

        //wersja rozszerzona - usunięcie myślników - wtedy możemy zapisać numer jako liczbę
        phoneNumber = phoneNumber.replace("-", ""); //usuń myślniki
        int phoneNumber2 = Integer.parseInt(phoneNumber); //zamień na typ int
        System.out.println(phoneNumber2);
    }
}
