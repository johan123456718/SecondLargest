
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.secondLargest(new int[]{54, 23, 11, 17, 10}));
    }
    
    public int secondLargest(int[] arr){
        Arrays.sort(arr); // 10, 20, 30 , 40, 50
        
        int value = arr[0];
        int highestValueOne = 0;
        int highestValueTwo = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(value < arr[i]){
                highestValueOne = arr[i];
                index = i;
            }
        }
        
        arr[index] = 0;
        for(int i = 0; i < arr.length; i++){
            
            if(value < arr[i]){
                highestValueTwo = arr[i];
            }
        }
        
        if(highestValueOne > highestValueTwo){
            return highestValueTwo;
        }else{
            return highestValueOne;
        }
    }
    
}
