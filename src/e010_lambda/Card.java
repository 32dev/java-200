package e010_lambda;
public class Card {
    private String dataVal;

    public Card(String dataVal) {
        this.dataVal = dataVal;
    }

    public String getDataVal() {
        return dataVal;
    }

    public static int compareCard(Card c1, Card c2) {
        return c1.getDataVal().compareTo(c2.getDataVal());
    }
}

