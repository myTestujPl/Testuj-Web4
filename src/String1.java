public class String1 {

    //wyświetl na ekranie:
    //1. długość zmiennej text
    //2. Informację, czy zawiera słowo "Python"
    //3. Informację, czy zawiera słowo "Java"
    //4. Miejsce pierwszego wystąpienia litery "i"
    //5. Zamień wszystkie wystąpienia litery 'ę' na '*'


    public static void main(String[] args) {
        String text = "Uczę się Java i chcę automatyzować testy";

        System.out.println("Podpunkt 1");
        System.out.println(text.length());

        System.out.println("Podpunkt 2");
        System.out.println(text.contains("Python"));
        
        System.out.println("Podpunkt 3");
        System.out.println(text.contains("Java"));

        System.out.println("Podpunkt 4");
        System.out.println(text.indexOf('i'));

        System.out.println("Podpunkt 5");
        System.out.println(text.replace('ę','*'));


    }
}

