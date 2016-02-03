package lang.mml;

import lang.mml.input.FileManager;
import lang.mml.output.Terminal;
import lang.mml.parse.LanguageLexer;

public class MultimediaLanguage {

    public static void main(String args[]) {
        Terminal.print("Thank-you for using MML!");
        LanguageLexer lexer = new LanguageLexer();
        if(args.length < 1) {
            Terminal.print("Not enough arguments. ( mml.jar [Filepath] )");
        } else if(args.length > 1) {
            Terminal.print("Too many arguments. ( mml.jar [Filepath] )");
        } else {
            lexer.lex(FileManager.openMMLFile(args[0]));
        }
    }
}
