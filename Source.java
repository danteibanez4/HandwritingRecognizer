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

        //collect info to the string with for loop (this is gonna take a looong while)
        for(int i = 0; i < splitInfo.length; i++){
            collectStrings[i] = splitInfo[i];
        }
        //read in contents (to be passed in first layer) and close infile
        firstLayer(collectStrings);
        inFile.close();
    }

    public static void firstLayer(String [] collectedStrings){
        int networkStructureLength = 5; //do only 5 letters of the alphabet
        //first layer (read in all contents of )
        for(int i = 0; i < collectedStrings.length; i++){

        }
    }

    public static void secondLayer(){
        //second layer
        int networkStructureLength = 2

    }

    public static void finalLayer(){
        int epochs = 100; //can be modified by the user
        double learningRate = 0.0; //learning rate from the system
        //final layer
        System.out.println("Current data imported");

        for(int i = 0; i <= epochs; i++){
            //display epoch, learning rate, and error percentage values onto the console
            System.out.println("epoch=" + epochs +"lrate = " + "error = " calculateErrorPrecentage());
        }
    }

    //additional methods
    //sigmoidal method to recalculate the weights
    public static double sigmoidal(){
        //declare weight to be used in calculating sigmoid
        double weight = Math.random();
        double sigmoidalFunction = weight / (1+ Math.exp(weight));
        return sigmoidalFunction;
    }

    public static double derivative(){
        double returnDerivative = Math.random() * (1 - Math.random())
        return returnDerivative;
    }

    public static double calculateErrorPrecentage(int expectedResult, double collectedResult){
        double errorPercentage = Math.exp(expectedResult - collectedResult);
        return 0.0;
    }
}