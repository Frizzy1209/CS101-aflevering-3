package C;

public class C {

    public static void main(String[] args) {


        NewArticle FirstArticle = new NewArticle("Tophattens mysterie", "Prins Henrik");
        NewArticle SecondArticle = new NewArticle("Hvem sagde wuff", "Felix Smith");
        NewArticle ThirdArticle = new NewArticle("Du gætter aldrig hvad han sagde", "Fritz");
        NewArticle ForthArticle = new NewArticle("JAVA 101", "En tilfældig lærer");
        NewArticle FifthArticle = new NewArticle("Den 5 artikel", "Den 5 forfatter");


        System.out.println(FirstArticle);
        System.out.println(SecondArticle);
        System.out.println(ThirdArticle);
        System.out.println(ForthArticle);
        System.out.println(FifthArticle);

    }

}
