public class AlphabetValues {

    private static char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private static int[] abcValue = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 34, 35};

    public static int getLetterValue(char letter) {
        if (letter == 'A') {
            return 10;
        } else {
            int i = 0;
            do {
                i++;
            } while (alphabet[i] != letter);
            return abcValue[i];
        }
    }
    public static int getLetterValue(String letter) {
        if (letter == "A") {
            return 10;
        } else {
            int i = 0;
            do {
                i++;
            } while (alphabet[i] != letter.charAt(0));
            return abcValue[i];
        }
    }
    public static String  getLetterFromValue(int value) {
        if (value == 10) {
            return "A";
        } else {
            int i = 0;
            do {
                i++;
            } while (abcValue[i] != value);
            String letter = String.valueOf(alphabet[i]);
            return letter;
        }
    }
}
