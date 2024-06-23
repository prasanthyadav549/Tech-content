package solid

import java.util.ArrayList;

-principles.LSP.problematicCode;

public class Main {

    public static void main(String[] args) {
        MasterCard card = new MasterCard();
        RupeeCard rupeeCard = new RupeeCard();

        List<Card> cards = new ArrayList<>();
        cards.push(card);
        cards.push(rupeeCard);

        for (Card card : cards) {
            if (card instanceof MasterCard) {
                card.internationalPay();
            }
        }
    }
}

/**
 * the above should not be done it voilates the LSP
 * LSP : it states that the child classes should be substituted for their base
 * classes
 * without altering the correctness of the program.
 * 
 * solution : create two Abstract classes InternationlSupportedCards ,
 * UpiSupportedCards
 * in the main class create the two lists one with the international supported
 * arralist and one
 * with the upi supported card list and iterate through the each list call the
 * make payment method.
 */
