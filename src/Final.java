public class Final {


    // energia potencjalna ciężkości wyliczana jest ze wzoru E = m*g*h, gdzie:
    // m to masa ciała,
    // h to wysokość na jakiej znajduje się ciało,
    // g to stała wartość przyspieszenia ziemskiego - wynosi około 9,81

    // zdefiniuj stałą g
    // napisz metodę, która wylicza wartość energii potencjalnej (masę i wysokość przyjmij jako argumenty funkcji)

    public static void main(String[] args) {
        System.out.println(countEnergy(10, 15));
        System.out.println(countEnergy(100, 10000));
    }

    public static double countEnergy(double mass, double height) {
        final double GRAVITATIONAL_CONSTANT = 9.81;
        return mass * height * GRAVITATIONAL_CONSTANT;
    }
}
