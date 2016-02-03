package lang.mml.str;

import java.util.ArrayList;

public class LanguageLine {
    private ArrayList<LanguageToken> tokens = new ArrayList<>();

    //Adds token to 'tokens'
    public void addToken(LanguageToken token) {
        tokens.add(token);
    }

    //Clears tokens in 'tokens#
    public void clear() {
        tokens.clear();
    }

    //Removes token to 'tokens'
    public void removeToken(LanguageToken token) {
        tokens.remove(token);
    }

    //Gets token to 'tokens'
    public ArrayList<LanguageToken> getTokens() {
        return tokens;
    }

    //Ammount of tokens in 'tokens'
    public int tokenAmmount() {
        return tokens.size();
    }
}
