package C;

public class NewArticle implements Article {

    private String NameOfTheArticle;

    private String AutherOfTheArticle;

    public String Name() {
        return null;
    }

    public String Auther() {
        return null;
    }


    public NewArticle(String NameOfTheArticle, String AutherOfTheArticle){
        this.NameOfTheArticle = NameOfTheArticle;
        this.AutherOfTheArticle = AutherOfTheArticle;

    }

    @Override
    public String toString() {
        return "NewArticle{" +
                "NameOfTheArticle='" + NameOfTheArticle + '\'' +
                ", AutherOfTheArticle='" + AutherOfTheArticle + '\'' +
                '}';
    }
}
