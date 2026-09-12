class ReverseString {
    String reverse(String inputString) {
        String revString = "";
        int inputStringLength = inputString.length();

        for (int i = inputStringLength - 1; i >= 0; i--) {
            revString += inputString.charAt(i);
        }

        return revString;
    }
}
