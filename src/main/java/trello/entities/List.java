package trello.entities;

import java.util.ArrayList;
import java.util.Comparator;

public class List {

    private String id;
    private String title;
    private java.util.List<Card> cards;

    /**
     * Public constructor of the class' instances.
     */
    public List() {
        cards = new ArrayList<>();
    }

    /**
     * Sets the list title.
     *
     * @param listTitle is the name of a list to be set.
     */
    public void setTitle(final String listTitle) {
        this.title = listTitle;
    }

    /**
     * Gets the list's title.
     *
     * @return the title of the list.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the id of a list.
     *
     * @return the id of a list.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id to the user.
     *
     * @param id of the username.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Sets cards of the list.
     *
     * @param cards is the ArrayList that contains the cards.
     */
    public void setCards(final java.util.List<Card> cards) {
        this.cards = cards;
    }

    /**
     * Gets the cards in the list.
     *
     * @return an ArrayList with all cards in the list.
     */
    public java.util.List<Card> getCards() {
        return cards;
    }

    /**
     * Compares the list with ArrayList of cards.
     *
     * @param listCards is the list of cards to compare.
     * @return true if the ArrayList is equal to this list's cards.
     */
    public boolean areListsEquals(final java.util.List<Card> listCards) {
        boolean answer = true;
        for (int index = 0; index < cards.size(); index++) {
            if (!cards.get(index).getTitle().equals(listCards.get(index).getTitle())) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    /**
     * Gets only cards titles.
     *
     * @return an ArrayList with all cards' titles.
     */
    public java.util.List<String> getCardsTitles() {
        ArrayList<String> cardsTitles = new ArrayList<>();
        for (int index = 0; index < cards.size(); index++) {
            cardsTitles.add(cards.get(index).getTitle());
        }
        return cardsTitles;
    }

    /**
     * Verifies if the cards in given ArrayList are sorted according on the present list.
     *
     * @param listToCompare is the list which is wanted to ve verified.
     * @return true if the given ArrayList of cards is sorted.
     */
    public boolean isSortedByName(final java.util.List<Card> listToCompare) {
        java.util.List<String> cardsTitles = getCardsTitles();
        cardsTitles.sort(Comparator.comparing(String::toString));
        boolean answer = true;
        for (int index = 0; index < cards.size(); index++) {
            if (!cardsTitles.get(index).equals(listToCompare.get(index).getTitle())) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
