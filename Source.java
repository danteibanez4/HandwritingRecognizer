import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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
        readInContents.close();
    }

    /**
     * Pass on info to the firstLayer
     * @param collectedStrings the read in to be taken in and collected
     */
    public static void firstLayer(String [] collectedStrings){
        int networkStructureLength = 5; //do only 5 letters of the alphabet (A-E)
        int [] collectedValues = new int[collectedStrings.length];
        //first layer (read in all contents of )
        for(int i = 0; i < collectedStrings.length; i++){
            collectedValues[i] *= collectedStrings.length * networkStructureLength;
        }

        secondLayer(collectedValues);
    }

    /**
     * Second layer, to call in sigmoidal to execute and readjust the weights
     * @param collectedValues values to be read in from first layer
     */
    public static void secondLayer(int [] collectedValues){
        //second layer (should only contain 2 nodes at this point )
        int networkStructureLength = 2;
        double inputValue = 0; //value to be collected for sigmoidal function
        double finalValue = 0;
        double errorPercentage = 0;
        for(int i = 0; i < collectedValues.length; i++){
            inputValue = collectedValues[i] * networkStructureLength;
            finalValue = sigmoidal(inputValue);
            errorPercentage = calculateErrorPrecentage(inputValue, i);
        }

        finalLayer(inputValue, errorPercentage);
        
    }

    /**
     * Pass onto final layer (mainly to display ephochs, learning rate, and error percentage onto the console)
     * WARNING: This is gonna take a while.
     */
    public static void finalLayer(double finalResult, double errorPercentage){
        int epochs = 100; //can be modified by the user
        double learningRate = 0.0; //learning rate from the system
        //final layer
        System.out.println("Current data imported");

        for(int i = 0; i <= epochs; i++){
            //display epoch, learning rate, and error percentage values onto the console
            System.out.println("epoch=" + epochs +"lrate = " +learningRate + "error = " + errorPercentage);
            i++;
        }
    }

    //additional methods
    //sigmoidal method to recalculate the weights
    public static double sigmoidal(double input){
        //declare weight to be used in calculating sigmoid (shoule be a 0 or a 1 initially as DOUBLE)
        //double weight = Math.random();
        double weight = ThreadLocalRandom.current().nextDouble(0, 1 + 1);
        double sigmoidalFunction = weight / (1+ Math.exp(input)); //calculate the sigmoidal method
        return sigmoidalFunction;
    }

    public static double derivative(){
        double returnDerivative = Math.random() * (1 - Math.random());
        return returnDerivative;
    }

    public static double calculateErrorPrecentage(double expectedResult, double collectedResult){
        double errorPercentage = Math.exp(expectedResult - collectedResult);
        return errorPercentage;
    }
}