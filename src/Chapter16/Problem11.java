package Chapter16;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by YangHC on 2018-01-08.
 */
public class Problem11 {
    private HashMap<String, Integer> tagHashMap;
    private boolean startTag;
    private boolean startValue;
    private boolean endTag;

    private String result;

    public Problem11() {
        tagHashMap = new HashMap<>();
        tagHashMap.put("family", 1);
        tagHashMap.put("person", 2);
        tagHashMap.put("firstName", 3);
        tagHashMap.put("lastName", 4);
        tagHashMap.put("state", 5);

        startTag = false;
        endTag = false;
        result = "";
    }

    public static void main(String[] args) {
        Problem11 p11 = new Problem11();

        File file = new File("resources\\family.xml");
        try {
            FileReader fr = new FileReader(file);
            System.out.println(p11.getWord(fr));
            String s = "";
            while (fr.ready()) {
                char c = (char)fr.read();
                p11.manageEachChar(c);
            }
            s += '\n';
            System.out.println(s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    String word;

    public void manageEachChar(char c) {
        switch (c) {
            case '<':
                startTag = true;
                break;
            case '>':
                startTag = false;
                endTag = false;
                startValue = false;
                result += '0';
                break;
            case '=':
                startValue = true;
                break;
            case '/':
                endTag = true;
                break;
            case ' ':
                startValue = false;
                break;
            case '\"':
                break;
            default:
//                getWord();
                break;
        }
    }

    public String getWord(FileReader fr) throws IOException {
        char c = (char) fr.read();
        String word = "";
        do {
            c = (char) fr.read();
            word += c;
        } while (c != ' ' && c != '=' && c != '>');
        return word;
    }
}
