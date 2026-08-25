class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        }

        return 6;
    }
}

class Wizard extends Fighter {
    boolean isSpellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        this.isSpellPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        return !isSpellPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return this.isSpellPrepared ? 12 : 3;
    }
}