import java.util.ArrayList;
import java.util.List;

public class SpreadsheetNotation {
    public static void main(String[] args) {
        SpreadsheetNotation notation = new SpreadsheetNotation();
        String spreedsgeet = notation.getSpreadsheetNotation(729);
    }

    private String getSpreadsheetNotation(long n) {
        List<String> alefbet = new ArrayList<String>(){{
            add("A");
            add("B");
            add("C");
            add("D");
            add("E");
            add("F");
            add("G");
            add("H");
            add("I");
            add("J");
            add("K");
            add("L");
            add("M");
            add("N");
            add("O");
            add("P");
            add("Q");
            add("R");
            add("S");
            add("T");
            add("U");
            add("V");
            add("W");
            add("X");
            add("Y");
            add("Z");
        }};

        // Write your code here
        String leftPart;
        String rightPart;
        if (n / 702 == 0) {
            leftPart = "1";
            int rightPartI = (int)(n % 702);
            rightPart = getRightPart(alefbet, rightPartI);
        } else {
            leftPart = Long.toString((n / 702) + 1);
            int rightPartI = (int)(n % 702);
            rightPart = getRightPart(alefbet, rightPartI);
            System.out.println("");
        }
        return leftPart + rightPart;
    }

    private static String getRightPart(List<String> alefbet, int rightPartI) {
        String rightPart;
        if (rightPartI <=26) {
            rightPart = alefbet.get(rightPartI-1);
        } else {
            int start = rightPartI/26;
            int end = rightPartI%26;
            rightPart = alefbet.get(start-1) + alefbet.get(end-1);
        }
        return rightPart;
    }
}
