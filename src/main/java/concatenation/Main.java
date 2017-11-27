package concatenation;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        hashSetImplementation();
    }


    /**
     * Reading file, searching for concatenated words, measuring metrics
     * for HashSet implementation.
     * @return
     * @throws IOException
     */
    public static boolean hashSetImplementation() throws IOException {
        System.out.println("\nFINDING CONCATENATED WORDS WITH HASHSET IMPLEMENTATION\n");

        ConcatenatedWordsWithHashSet concatenationHashSet = new ConcatenatedWordsWithHashSet();
        concatenationHashSet.readFileToHashSet("words.txt");
        Metrics.start();
        concatenationHashSet.findConcatenatedWords();
        Metrics.stop();
        Metrics.getAllMetrics();
        getConcatenatedWordsInfo(concatenationHashSet);
        concatenationHashSet.free();
        return true;
    }

    /**
     * Prints the longest, the second longest concatenated words and the
     * number of concatenated words.
     * @param concatenation - instance of ConcatenatedWords with particular
     *                      implementation.
     */
    private static void getConcatenatedWordsInfo(ConcatenatedWords concatenation) {
        System.out.println("The first longest concatenated word is " +
                concatenation.getFirstLongestConcatenatedWord());
        System.out.println("The second longest concatenated word is " +
                concatenation.getSecondLongestConcatenatedWord());
        System.out.println("The number of concatenated words is " +
                concatenation.getNumberOfConcatenatedWords());
    }
}
