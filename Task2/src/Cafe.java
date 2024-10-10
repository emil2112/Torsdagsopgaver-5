import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<String>();

    public Cafe(){
        try{
            File file = new File("Data/Coffee.csv");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String s = scan.nextLine();
                coffeeMenu.add(s);
            }
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("File not found");
        }
    }

    public void loadMenuData(){
        for(String s : coffeeMenu){
            System.out.println(s);
        }
    }
}
