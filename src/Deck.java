import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    Card[] cards;

    public Deck() {
        this.cards = new Card[56];

        int index = 0;
        for (int g = 0; g < 4; g++) {
            for (int h = 0; h < 14; h++) {
                switch (h) {
                    case 7:
                    case 8:
                        cards[index] = new Card(h, "peak");
                        break;
                    case 9:
                    case 10:
                        cards[index] = new Card(h, "spy");
                        break;
                    case 11:
                    case 12:
                        cards[index] = new Card(h, "swap");
                        break;
                    default:
                        cards[index] = new Card(h, "");
                        break;
                }
                index++;
            }
        }
        shuffle();
    }

    public void shuffle() {
        List<Card> cardList = Arrays.asList(this.cards);
        Collections.shuffle(cardList);
        this.cards = cardList.toArray(new Card[0]);
    }

    public void print() {
        int index = 0;
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println(
                    this.cards[0 + index].value + "+" + this.cards[0 + index].func + "\t\t" +
                            this.cards[1 + index].value + "+" + this.cards[1 + index].func + "\t\t" +
                            this.cards[2 + index].value + "+" + this.cards[2 + index].func + "\t\t" +
                            this.cards[3 + index].value + "+" + this.cards[3 + index].func + "\t\t");
            System.out.println(
                    this.cards[4 + index].value + "+" + this.cards[4 + index].func + "\t\t" +
                            this.cards[5 + index].value + "+" + this.cards[5 + index].func + "\t\t" +
                            this.cards[6 + index].value + "+" + this.cards[6 + index].func + "\t\t" +
                            this.cards[7 + index].value + "+" + this.cards[7 + index].func + "\t\t");
            System.out.println(
                    this.cards[8 + index].value + "+" + this.cards[8 + index].func + "\t\t" +
                            this.cards[9 + index].value + "+" + this.cards[9 + index].func + "\t\t" +
                            this.cards[10 + index].value + "+" + this.cards[10 + index].func + "\t\t");
            System.out.println(
                    this.cards[11 + index].value + "+" + this.cards[11 + index].func + "\t\t" +
                            this.cards[12 + index].value + "+" + this.cards[12 + index].func + "\t\t" +
                            this.cards[13 + index].value + "+" + this.cards[13 + index].func + "\t\t");
            System.out.println("-------------------------------------------------------");
            index = index + 12;
        }
    }

    public Card next() {
        Card next = this.cards[0];
        Card[] newArr = new Card[this.cards.length - 1];
        for (int i = 0 + 1; i < this.cards.length; i++) {
            newArr[i - 1] = this.cards[i];
        }
        this.cards = newArr;
        return next;
    }
}
