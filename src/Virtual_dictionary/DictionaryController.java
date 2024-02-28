package Virtual_dictionary;

public class DictionaryController {
    private DictionaryModel dictionary;

    public DictionaryController() {
        this.dictionary = new DictionaryModel();
    }

    public void addWord(String word, String meaning) {
        dictionary.addWord(word, meaning);
    }

    public String searchWord(String word) {
        return dictionary.searchWord(word);
    }

    public static void main(String[] args) {
        DictionaryView.launch(DictionaryView.class);
    }
}
