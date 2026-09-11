public class GameMaster {
    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " "
            + character.getCharacterClass() + " with " + character.getHitPoints()
            + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has "
            + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod tm) {
        return switch(tm) {
            case tm.HORSEBACK -> "You're traveling to your destination on horseback.";
            case tm.WALKING -> "You're traveling to your destination by walking.";
            default -> "";
        };
    }

    public String describe(Character character, Destination destination, TravelMethod tm) {
        return this.describe(character) + " "
            + this.describe(tm) + " "
            + this.describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return this.describe(character, destination, TravelMethod.WALKING);
    }
}
