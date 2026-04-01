import java.awt.*;

public class HighestMark {
    public static void main(){
        int [] marksArray = {50 , 40 , 60 , 85 , 55 , 28 , 11 , 70};
        int highestMark = marksArray[0];
        int LowestMark = marksArray[0];

        for(int i=0 ; i < marksArray.length; i++){
//            int middleMark = ( i +  marksArray.length - 1)/2;

            if(marksArray[i]> highestMark){
//                highestMark = middleMark + 1 ;
                highestMark = marksArray[i];
//                System.out.println("Highest mark is: " + highestMark);
            }
            else if (marksArray[i] < highestMark) {
//                highestMark = middleMark - 1 ;
                LowestMark = marksArray[i];
//                System.out.println("Lowest mark is: " + LowestMark);
            }
            else {
//                System.out.print("Empty Array");
            }
        }
        System.out.println("________________________________________\n\n");
//        System.out.println("Lowest Mark is: " + LowestMark + "\n");
        System.out.println("Highest Mark is: " + highestMark + "\n");
        System.out.println("________________________________________");
    }
}
