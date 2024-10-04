# High and Low Game

## Description

The High and Low Game is a simple console-based card game implemented in Java. The objective is to guess whether the next drawn card from the deck will be higher or lower in value compared to the current card. This game provides a fun way to get familiar with object-oriented programming concepts such as classes, objects, and methods.

## How to Play

1. The game starts by drawing the first card from a shuffled deck.
2. The player is shown the first card and is prompted to guess whether the next card will have a higher or lower value.
3. Enter `1` if you think the next card will be lower, or `2` if you think it will be higher.
4. The next card is drawn from the deck, and the outcome is displayed based on your guess.
5. If your guess is correct, you win the round! Otherwise, you lose the round.
6. If both cards have the same value, no one wins the round.

## Project Structure

The project consists of three Java classes:

1. **HighLowGame**: The main driver class that handles the game flow, user input, and output.
2. **Card**: Represents a single playing card with a suit and value. It includes methods to retrieve card information and to display the card as a string.
3. **Deck**: Represents a deck of cards and provides a method to draw a random card.

### Class Details

#### 1. `HighLowGame.java`

- This is the main class that starts and controls the game.
- It initializes a `Deck` object, draws cards, prompts the user for input, and evaluates the result based on the user's guess.
- **Methods**:
  - `public static void main(String[] args)`: Entry point of the application that controls the game flow.

#### 2. `Card.java`

- Represents a card with a value and suit.
- **Methods**:
  - `Card(int val, String sut)`: Constructor to create a card with the specified value and suit.
  - `getSuit()`: Returns the suit of the card.
  - `getValue(boolean isBlackjack)`: Returns the value of the card. If the `isBlackjack` parameter is true, it returns the blackjack value.
  - `declareCard()`: Returns a string representation of the card.

#### 3. `Deck.java`

- Represents a deck of 52 playing cards.
- **Methods**:
  - `drawCard()`: Generates and returns a random card from the deck by selecting a random value (1-13) and a random suit (Spades, Clubs, Hearts, Diamonds).

## Running the Game

To play the game, follow these steps:

1. Clone or download the project source code.
2. Compile the `.java` files using a Java compiler:

   ```bash
   javac HighLowGame.java Card.java Deck.java
   ```

3. Run the game:

   ```bash
   java HighLowGame
   ```

4. Follow the on-screen instructions to play the game.

   ### Example Output

   ```bash
   The first card is the 8 of Spades
   Will the next card be higher or lower?
   Enter 1 for lower, 2 for higher:
   2
   The next card is the Jack of Hearts
   Winner!
   ```

## Enhancements

- Extend the game by adding a scoring system or allowing multiple rounds.
- Implement a graphical user interface (GUI) using JavaFX or Swing for a more interactive experience.
- Add more options, such as guessing the suit of the next card or predicting if the next card will be red or black.
