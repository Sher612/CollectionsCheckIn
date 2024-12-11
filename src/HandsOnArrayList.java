import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {
    public HandsOnArrayList(){
        ArrayList<String> students = new ArrayList<>();
        //Adding seven names to the list
        students.add("Sher");
        students.add("Amanda");
        students.add("Jeremy");
        students.add("Becky");
        students.add("Nelson");
        students.add("Fiona");
        students.add("Jack");
        System.out.println(students);
        students.remove("Sher");
        System.out.println("Student list after removing Sher : " + students);
        Collections.sort(students);
        System.out.println("Sorting updated student list alphabetically : " + students);
    }

//Method to print the list of students
    //public static void printStudentList (ArrayList<String> students){
        //System.out.println("List of Students : " + students);
    //}

    //Method to remove a student from the list
    //public static void removeStudent (ArrayList<String> students){
        //students.remove("Sher");
        //System.out.println("List of Updated Students : " + students);
       // }

    //Creating a method to sort the names of students in the array list
    //public static void sortStudent(ArrayList<String> students) {
        //Collections.sort(students);
        //System.out.println("List of Sorted Students : " + students);
}

