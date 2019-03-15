/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings, using an array of Objects
 */

public class List_inArraySlots {
    private Object[] refArray;
    public int filledElements;

    private static final int INITIAL_CAPACITY = 10;

    public List_inArraySlots () {
        refArray = new Object[INITIAL_CAPACITY];
        filledElements = 0;
    }

    public int size () {
        return filledElements;
    }

    public String toString () {
        String toReturn = "";
        for (int index = 0; index < filledElements; index++) {
            toReturn += "\t" + refArray[index] + "\n";
        }
        return toReturn;
    }

    public void set ( int index, Object object ){
      refArray[index] = object;
    }

    public boolean add ( Object object) {
        if (filledElements >= refArray.length){ //If before adding this object, the array is full;
            expand();
        } else {}
        refArray[filledElements] = object; //appended the new object to the next available position
        filledElements++;
        return true;
    }

    private void expand () {
        Object[] newRefArray = new Object[refArray.length * 2]; //Created the new array with double the length of the old one
        for (int index = 0; index < filledElements; index++) { //copy each element of the old array into the corresponding
                                                               //index in the new Array
            newRefArray[index] = refArray[index];
        }
        refArray = newRefArray;
        //Switched refArray from the old, small array to the
        //new, twice as big array
     }




}
