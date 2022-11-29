package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Mary");
        myList.add("Paul");
        myList.add(2, "Vand");
        myList.add(3,"George");
        myList.add("Joe");

        System.out.println("Total members in list: "+myList.size());

        System.out.println("Members are: "+myList);
      /*  for(String s:myList){
            System.out.println(s);
        }*/

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Checking Vand presence in list: " + myList.contains("Vand"));
        System.out.println("Checking Vandana presence in list: " + myList.contains("Vandana"));

        myList.remove("Joe");
        System.out.println("Total members in list: "+myList.size());


    }
}
