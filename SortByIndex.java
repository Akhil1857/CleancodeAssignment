import java.util.*;
public class SortByIndex
{
    public static int[] calculateIndex(int []originalArray)
    {
       int valueAtIndex=0;
       //making the duplicate copy of the original array so that original array will not get affected
       int [] duplicateArray=Arrays.copyOf(originalArray,originalArray.length); 
       Arrays.sort(duplicateArray);
       HashMap<Integer,Integer> index=new HashMap<>();
       for(valueAtIndex=0;valueAtIndex<duplicateArray.length;valueAtIndex++)
       {
        //mapping value into the map using key and value.
        index.put(duplicateArray[valueAtIndex], valueAtIndex);  
       }
       int [] sortedValueAtIndex=new int[originalArray.length];
       for(valueAtIndex=0;valueAtIndex<originalArray.length;valueAtIndex++)
       {
        //getting the index value from the original array
        sortedValueAtIndex[valueAtIndex]=index.get(originalArray[valueAtIndex]); 
       }
       return sortedValueAtIndex;
    }
    public static void main(String[] args) {
        int []originalArray={5,10,40,30,20};
        int [] requiredArray=calculateIndex(originalArray);
        System.out.println(Arrays.toString(requiredArray));
    }
}