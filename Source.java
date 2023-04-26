import java.io.*;
import java.util.*;
import java.util.zip.Inflater;

/**
 * Source.java: The Artificial Neural Network that is a handwriting recognizer
 */
public class Source{
    //take code from ANN P2 and rework it to read that csv file
    public static void main(String [] args) throws FileNotFoundException{
        //include File and Scanner obj to read this damn file
        File inFile = new File("A_Z Handwritten Data.csv");
        Scanner readInContents = new Scanner(inFile);

        //declare strings to read in the inFile, to split contents, and to collect each of the individual string
        String contextInfo = readInContents.nextLine();
        String [] splitInfo = contextInfo.split(",");
        String [] collectStrings = new String[splitInfo.length];

        //read in contents (to be passed in first layer)
    }

    public static void firstLayer(){
        //first layer
    }

    public static void secondLayer(){
        //second layer
    }

    public static void finalLayer(){
        //final layer
    }

    //additional methods
    public static double sigmoidal(){
        return 0.0;
    }

    public static double derivative(){
        return 0.0;
    }

    public static double calculateErrorPrecentage(){
        return 0.0;
    }
}