package lang.mml.parse;

import lang.mml.output.Terminal;

public class LanguageLexer {

    public String[] lex(String content) {
        String[] lines = content.split(System.lineSeparator());
        String[] tokens = new String[lines.length * 16];
        for(String line : lines) {
            char[] chars = line.toCharArray();
            String token = "";
            int index = 0;
            for(char character : chars) {
                token += character;
                token = token.toLowerCase();
                if(character == ' ') {
                    token = "";
                    tokens[index] = "" + character;
                    index++;
                }
                Terminal.print(" > " + character);
            }
        }
        return tokens;
    }
}
