package D;

public class NewSquare implements Square{

    private int HeightOfTheSquare;

    private int WidthOfTheSquare;

    public int Height() {
        return 0;
    }

    public int Width() {
        return 0;
    }


    public NewSquare(int HeightOfTheSquare, int WidthOfTheSquare){
        this.HeightOfTheSquare = HeightOfTheSquare;
        this.WidthOfTheSquare = WidthOfTheSquare;

    }

    @Override
    public String toString() {
        return "NewSquare{" +
                "HeightOfTheSquare=" + HeightOfTheSquare +
                ", WidthOfTheSquare=" + WidthOfTheSquare +
                '}';
    }
}
