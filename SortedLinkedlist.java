

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/**
 * This class saves a list of integers to a Linkedlist from smallest to largest.
 * @author Jyotsna Pradhan
 */

public class SortedLinkedlist {
/**
 * This is main method of SortedLinkedlist class
 * @param args default parameter of a main - not used
 */
    public static void main(String[] args){
        //object creation for Integer types with Linkedlist and ArrayList
        LinkedList<Integer> linkedList = new LinkedList<>();  //Eg of Code reuse
        ArrayList<Integer> listOfNum = new ArrayList<>();  //Eg of Code reuse

        Random rand = new Random();

        int numberOfInteger = 10; // defines the number of chains in linkedList
        int upperBound = 200; //defines max limit to get random integers


        for(int i = 0; i < numberOfInteger; i++){
            listOfNum.add(rand.nextInt(upperBound));
        }

        System.out.print("List of unsorted integer: [" );
        for(int i = 0; i < listOfNum.size(); i++){    //Eg of Code reuse
            System.out.print( listOfNum.get(i));       //Eg of Code reuse
            if(i < listOfNum.size() - 1){
                    System.out.print(", ");
                }

        }
        System.out.print("]");

        for (int num : listOfNum){
            sortedLinkedlist(linkedList, num);
        }
        System.out.println();
        System.out.println("Sorted Linkedlist:" + linkedList);

    }
/**
 * It inserts the given integer into linkedlist in ascending order.
 * @param list the Linkedlist where the integer should be inserted
 * @param num  the integer to be inserted into Linkedlist
 */
    public static void sortedLinkedlist(LinkedList<Integer> list, int num){
        ListIterator<Integer> iterator = list.listIterator();  //Eg of Code reuse
        while(iterator.hasNext()){  //hasNext() checks if there are numbers(integers) to iterate or not //Eg of Code reuse
            if(num < iterator.next()){   //Eg of Code reuse
                iterator.previous();     //Eg of Code reuse
                iterator.add(num);       //Eg of Code reuse
                return;
            }
        }
        list.add(num);                //Eg of Code reuse
    }

}
