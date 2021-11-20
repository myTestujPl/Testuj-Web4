package PracaDomowa;

public class String4 {

    //1. Z wykorzystaniem metody substring klasy String wyłącz wiek użytkownika ze zmiennej text
    //2. Z wykorzystaniem klasy Integer zamień wiek użytkownika na liczbę

    public static void main(String[] args) {
        String text = "Mam 35 lat";

        System.out.println("Podpunkt 1");
        String wiekWFormieString = text.substring(4,6);
        System.out.println(wiekWFormieString);
        System.out.println("Podpunkt 2");
        int wiek = Integer.parseInt(wiekWFormieString);
        System.out.println(wiek);
    }
}
