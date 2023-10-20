public class WordCounter {
    public int countWords(String essay) {
        String[] words = essay.split("\\s+");
        return words.length;
    }
}
