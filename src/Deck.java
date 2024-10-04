public class Deck {

    // part 1 Step 13
    public Card drawCard() {
        // Fill in the contents of this method
        // Part 1 Step 14

        int value = (int) (Math.random() * 13) + 1; // determine the vaule of the card (1 -13)
        int suit2 = (int) (Math.random() * 4) + 1; // determine the suit (1-4)

        String suit = ""; // decalre a string called suit but set it equal to null

        if (suit2 == 1) // I used if/else/if instead of switch
        {
            suit = "Spades";
        } else if (suit2 == 2) {
            suit = "Clubs";
        } else if (suit2 == 3) {
            suit = "Hearts";
        } else {
            suit = "Dimonds";
        }

        return new Card(value, suit);
    }

}
