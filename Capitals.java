package Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Capitals implements Questions{

    Capitals(){
    }
    @Override
    public String getGuestion() {
        return null;
    }
    @Override
    public boolean verifyAnswer() {
        return false;
    }
    public String readFromFile() throws IOException {
        String filename = "C:/Users/Админ/Desktop/Prog abs/project/capitals.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String l;
        String line = "";

        while((l = reader.readLine()) != null) {
            line += l;
        }
        reader.close();
        return line;
    }
    public String[] spliit(String txt){
        return txt.split(",|\\{|\\}|\\:");
    }
    public HashMap<String, HashMap> dictionary(String[] arr) {
//        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
        HashMap<String,String> quest = new HashMap<>();
        HashMap<String, HashMap> difficulty = new HashMap<>();

        for (int i = 3; i<arr.length; i=+2){
            quest.put(arr[i],arr[i+1]);
        }
        difficulty.put(arr[1],quest);
        difficulty.get("20");

        return difficulty;

    }
}
