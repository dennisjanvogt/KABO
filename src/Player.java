public class Player {

    String name;
    Card[] blatt;
    int score;

    Player(String name, Deck deck) {
        this.name = name;
        this.blatt = new Card[4];
        drawInitialblatt(deck);
        getScore();
    }

    private void drawInitialblatt(Deck deck) {
        blatt[0] = deck.next();
        blatt[1] = deck.next();
        blatt[2] = deck.next();
        blatt[3] = deck.next();
    }

    public Card draw (Deck deck) {
        Card card = deck.next();
        System.out.println("Drawn Card: " + card.value + "+" + card.func);
        return card;
    }

    public void getScore() {
        int score = 0;
        for (int i = 0; i < blatt.length; i++) {
            score = score + blatt[i].value;
        }
        this.score = score;
    }

    public void printBlatt() {
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\tBlatt Player: " + this.name);
        System.out.println(
                this.blatt[0].value + "+" + this.blatt[0].func + "\t\t" +
                        this.blatt[1].value + "+" + this.blatt[1].func + "\t\t" +
                        this.blatt[2].value + "+" + this.blatt[2].func + "\t\t" +
                        this.blatt[3].value + "+" + this.blatt[3].func + "\t\t");
        System.out.println("-------------------------------------------------------");
    }

    public void peak(int card) {
        System.out.println(this.blatt[card - 1].value);
    }

    public void spy(int card, Player player) {
        System.out.println(player.blatt[card - 1].value);
    }

    public void swap(int myCard, int other, Player player) {
        Card temp;
        temp = this.blatt[myCard - 1];
        this.blatt[myCard - 1] = player.blatt[other - 1];
        player.blatt[other - 1] = temp;
    }

    public void takeDrawnCard(int myCard, Card drawnCard) {
        this.blatt[myCard - 1] = drawnCard;
    }
}
