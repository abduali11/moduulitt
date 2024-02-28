package Virtual_dictionary;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class DictionaryModel {
    private Map<String, String> dictionary;

    public DictionaryModel() {
        dictionary = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        dictionary.put(word, meaning);
    }

    public String searchWord(String word) {
        return dictionary.get(word);
    }
}


