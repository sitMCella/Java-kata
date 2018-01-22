package it.mcella.kata.bingo;

public class Player {

    private final String name;
    private final Card card;

    private int cardNumbersCount;

    public Player(String name, CardGenerator cardGenerator) {
        this.name = name;
        this.card = cardGenerator.create();
        this.cardNumbersCount = 24;
    }

    public boolean checkBingo(int number) {
        boolean numberIsPresent = card.checkIfNumberIsPresent(number);
        if(numberIsPresent) {
            cardNumbersCount--;
        }
        return cardNumbersCount == 0;
    }

    public String getName() {
        return name;
    }

    public Card getCard() {
        return card;
    }

    int getCardNumbersCount() {
        return cardNumbersCount;
    }

}
