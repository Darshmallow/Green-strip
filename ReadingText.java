import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingText {
    public static void main(String[] args) throws IOException {
        //Copy each sentence in the file to an arrayList
        ArrayList<String> sentences = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            sentences.add(line);
        }
        br.close();

        //Use the method
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word that you'd like to search");
        String word = s.nextLine();
        String found = search(word, sentences);
        System.out.println(found);
    }
    public static String search(String word, ArrayList<String> sentences){
        //Search and return all appearances of a word in the list of sentences
        ArrayList<Integer[]> indexes = new ArrayList<>();
        String found = "The word \"" + word + "\" is found in:";
        for (int i = 0; i < sentences.size(); i++){
            String line = sentences.get(i);
            String[] words = line.split(" ");
            for (int j = 0; j < words.length; j++){
                String w = words[j];
                if (w.contains(word)){
                    indexes.add(new Integer[]{(Integer) i, (Integer) j});
                }
            }
        }
        for (Integer[] position: indexes){
            found += "\nthe " + (position[1] + 1) + "th word of line " + (position[0] + 1);
        }
        return found;
    }
}
