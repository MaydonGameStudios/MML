package lang.mml.input;

import lang.mml.output.Terminal;

import java.io.*;

public class FileManager {

    //Opens .MML Files using BufferedReader
    public static String openMMLFile(String inputPath) {
        String content = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(inputPath));
        } catch (FileNotFoundException e) {
            Terminal.print("FileNotFound, failed to read file");
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = null;
            if (br != null) {
                line = br.readLine();
            } else {
                Terminal.print("NullPointer, failed to read file");
            }
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            content = sb.toString();
        } catch (IOException e) {
            Terminal.print("IOException, failed to read file");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                Terminal.print("IOException, failed to close File Reader");
            }
        }
        assert content != null;
        return content;
    }

}

