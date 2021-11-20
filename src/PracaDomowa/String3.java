package PracaDomowa;

public class String3 {
    // oprócz operatora '+', do łączenia wielu zmiennych typu String można wykorzystać metodę:
    // String.join(delimiter, String1, String2, PracaDomowa.String3...);
    // do której jako pierwszy argument wpisujemy znak którym będą oddzielone wszystkie Stringi
    // wpisane jako kolejne argumenty funkcji

    //1. Spróbuj za pomocą funkcji join klasy String połączyć dane pracownika z zadania String2
    //2. Spróbuj za pomocą funkcji join klasy String połączyć myślnikami numer telefonu użytkownika

    public static void main(String[] args) {
        String name = "Jan";
        String secondName = "Józef";
        String surname = "Nowak";

        String numbers1 = "111";
        String numbers2 = "222";
        String numbers3 = "333";

        System.out.println(String.join(" ",name, secondName, surname));
        System.out.println(String.join("-", numbers1, numbers2, numbers3));
    }
}
