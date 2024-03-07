package newday.test.diamond;

public class Diamond {
    public static String create(char letter) {
        if (letter < 'A' || letter > 'Z') {
            return "Invalid input. Please provide a letter between A and Z.";
        }

        StringBuilder result = new StringBuilder();

        // Print the top half of the diamond
        result.append(createLine(letter, 'A'));
        for (char current = 'B'; current <= letter; current++) {
            result.append(createLine(letter, current));
        }
        
        // Print the bottom half of the diamond
        for (char current = (char)(letter - 1); current >= 'A'; current--) {
            result.append(createLine(letter, current));
        }

        return result.toString();
    }

    private static String createLine(char letter, char current) {
        StringBuilder line = new StringBuilder();

        // Leading spaces
        for (char c = current; c < letter; c++) {
            line.append(" ");
        }

        // Current character
        line.append(current);

        // Special handling for characters after 'A'
        if (current != 'A') {
            int spaces = (current - 'A') * 2 - 1;
            for (int i = 0; i < spaces; i++) {
                line.append(" ");
            }
            line.append(current);
        }

        // Newline
        line.append("\n");

        return line.toString();
    }
}
