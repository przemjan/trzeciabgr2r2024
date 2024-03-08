public class Stringi {
    public static void main(String[] args) {

        String imie = "Bogusław";

        int dlugosc = imie.length();

        char inicjal = imie.charAt(0);
        System.out.println(inicjal);


        String duze, male;

        duze = imie.toUpperCase();
        male = imie.toLowerCase();

        System.out.println(imie);

    }
}
