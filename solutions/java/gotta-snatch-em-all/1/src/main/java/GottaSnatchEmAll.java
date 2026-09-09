import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {
    private Set<String> cardCollection = new HashSet<>();

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> intersection = new HashSet<>(myCollection);
        intersection.retainAll(theirCollection);

        return myCollection.size() > intersection.size()
            && theirCollection.size() > intersection.size();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> intersection = new HashSet<>(collections.get(0));

        for (Set<String> collection : collections) {
            intersection.retainAll(collection);
        }

        return intersection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allUniqueCards = new HashSet<>();

        for (Set<String> collection : collections) {
            allUniqueCards.addAll(collection);
        }

        return allUniqueCards;
    }
}
