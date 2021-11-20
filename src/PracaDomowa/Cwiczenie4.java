package PracaDomowa;

public class Cwiczenie4 {
    public static void main(String[] args) {
        System.out.println(whichIsLonger("dluszszy", "krotki"));
        System.out.println(whichIsLonger("short", "looong"));
    }

    public static int whichIsLonger(String first, String second){
        return first.length()>second.length()?1:2;
    }
}
