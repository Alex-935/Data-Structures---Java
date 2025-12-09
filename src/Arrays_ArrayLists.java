import java.util.ArrayList;

public class Arrays_ArrayLists {

    public static void main(String[] args) {


        /*
            Arrays:
                - Datatype[] variableName = new Datatype[size];
                - Datatype[] variableName = {a, b, c, d, ..., z};

                array.length



            ArrayList:
                - ArrayList<classType> variableName = new ArrayList<>(initialSize);
                - ArrayList<classType> variableName = new ArrayList<>(Arrays.asList(a, b, c));
        */
        ArrayList<Integer> myArray = new ArrayList<>(5);

        myArray.add(15);
        myArray.set(0, 6);// update index 0  to have value 6
        myArray.remove(0);
        myArray.contains(76);


        System.out.println(myArray);
    }
}
