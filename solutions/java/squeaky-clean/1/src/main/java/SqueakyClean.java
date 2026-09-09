import java.util.Map;

class SqueakyClean {
    private static final Map<Character, Character> LEET_MAP = Map.of(
        '4', 'a',
        '3', 'e',
        '0', 'o',
        '1', 'l',
        '7', 't'
    );

    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder(identifier.length());

        for (int i = 0; i < identifier.length(); i++) {
            char currChr = identifier.charAt(i);

            if (currChr == ' ') {
                builder.append('_');
                continue;
            }

            if (currChr == '-') {
                i++;
                builder.append(Character.toUpperCase(identifier.charAt(i)));
                continue;
            }

            if (!Character.isLetter(currChr)
               && !Character.isDigit(currChr)
               ) {
                continue;
            }

            builder.append(LEET_MAP.getOrDefault(currChr, currChr));
        }

        return builder.toString();
    }
}
