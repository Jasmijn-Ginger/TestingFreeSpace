public class Main {
    public static void main(String[] args) {

        Zelf zelf = new Zelf();
        System.out.println(zelf.WoordFlip("Hallo"));
        System.out.println(zelf.NummerFlip());

        Magic8Ball magic8Ball = new Magic8Ball();
        magic8Ball.output(256);
        magic8Ball.print("Hello world!");


        CreateEssay createEssay = new CreateEssay();
        String writtenEssay = createEssay.writeEssay(createEssay.randomInt(), createEssay.listWords());
        System.out.println(writtenEssay);
        WordCounter wordCounter = new WordCounter();
        System.out.println(wordCounter.countWords(writtenEssay));
        System.out.println(createEssay.listWords().length);
    }
}
