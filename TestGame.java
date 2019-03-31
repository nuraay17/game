package Game;

import java.io.IOException;
import java.util.HashMap;

public class TestGame {

    public static void main(String args[]) throws IOException {
        Capitals capital = new Capitals();

        String cap = capital.readFromFile();
        System.out.println("file: "+ cap);
        String[] arr = capital.spliit(cap);

        for (int i=0; i<arr.length; i++){
           System.out.println( i + " " + arr[i]);
        }

        HashMap<String, HashMap> questions = capital.dictionary(arr);

        System.out.println("size: "+ questions.size());

        System.out.println("20"+(questions.get("20")).get("Asem"));
//        HashMap<String, String> hash = new HashMap<String, String>();
//        hash.put("Assem", "Gaukhar");
//        System.out.println(hash.size());
//        System.out.println(hash.get("Assem"));
//        hash.get(0);

    }
}
