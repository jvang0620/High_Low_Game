public class Card {

    // instance variables (Part 1 Step 5)
    private int value;
    private String suit;

    // constructor (Part 1 Step 6-8)
    public Card(int val, String sut) {
        this.value = val;
        this.suit = sut;
    }

    // Step 9 (Part 1 add getter)
    public String getSuit() {
        return this.suit;
    }

    // Step 9 (Part 1 last part) //Lab 12 step 6
    public int getValue(boolean isBlackjack) {
        if (!isBlackjack) {
            return value;
        } else {
            if (value == 1) {
                return 11;
            } else {
                if (value > 10) {
                    return 10;
                } else {
                    return value;
                }
            }
        }
    }

    // Part 1 Step 10
    public String declareCard() {
        String result = null;
        switch (this.value) {
            case 11:
                result = "the Jack of " + this.suit;
                break;
            case 12:
                result = "the Queen of " + this.suit;
                break;
            case 13:
                result = "the King of " + this.suit;
                break;
            case 1:
                result = "the Ace of " + this.suit;
            default:
                result = "the " + this.value + " of " + this.suit;
        }
        return result;
    }

}
