package AllHomeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day18_ArrayListTasks {
    public static void main(String[] args) {

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        String arr[] = {
                "Purple",
                "Red",
                "Black",
                "Green",
                "Yellow"
        };
        List<String> aList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            aList.add(arr[i]);
//2. Write a Java program to iterate through all elements in a array list.
            ArrayList<String> colors1 = new ArrayList<>();
            colors1.add("red");
            colors1.add("white");
            colors1.add("black");
            colors1.add("green");
            for (String color : colors1) {
                System.out.println(color);

//3. Write a Java program to insert an element into the array list at the first position.
                ArrayList<String> colors = new ArrayList<>();
                colors.add("red");
                colors.add("white");
                colors.add("black");
                colors.add("green");
                colors.add(0, "Yellow");
                System.out.println(colors);
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
                ArrayList<String> colors2 = new ArrayList<>();
                colors.add("Red"); //0
                colors.add("White");//1
                colors.add("Black");//2
                colors.add("Green");//3
                System.out.println(colors);
//5. Write a Java program to update specific array element by given element.
                ArrayList<String> colors3 = new ArrayList<>();
                colors.add("Red"); // 0
                colors.add("White");// 1
                colors.add("Black"); // 2
                colors.add("Green");
                System.out.println(colors);
                colors.set(2, "Blue");
                System.out.println(colors);
//6. Write a Java program to remove the third element from a array list.
                ArrayList<String> colors4 = new ArrayList<>();
                colors.add("Red");
                colors.add("White");
                colors.add("Black");
                colors.add("Green");
                System.out.println(colors);
                colors.remove(2);
                System.out.println(colors);
//7. Write a Java program to search an element in a array list.
                ArrayList<String> colors5 = new ArrayList<>();
                colors.add("Red"); // 0
                colors.add("White");// 1
                colors.add("Black"); // 2
                colors.add("Green");
                System.out.println(colors);
                boolean containsBlack1 = false;
                for (String color5 : colors) {
                    if (color.equals("Black")) {
                        containsBlack1 = true;
                    }

                }
                if (containsBlack1) {
                    System.out.println("It has Black color");
                } else {
                    System.out.println("It doesn't have Black color");
                }
//8. Write a Java program to sort a given array list.
                ArrayList<String> letters = new ArrayList<>();
                letters.add("D"); // 0
                letters.add("C");// 1
                letters.add("A"); // 2
                letters.add("B");
                System.out.println("List before sort: " + letters);
                Collections.sort(letters);
                System.out.println("List after sort: " + letters);
//9. Write a Java program to copy one array list into another.
                ArrayList<String> list1 = new ArrayList<>();
                list1.add("Red"); // 0
                list1.add("White");// 1
                list1.add("Black"); // 2
                list1.add("Green");
                System.out.println("List 1: " + list1);
                ArrayList<String> list2 = new ArrayList<>(3);
                System.out.println("COPY");
                String element0 = list1.get(0);
                list2.add(element0);
                list2.add(list1.get(1));
//10. Write a Java program to shuffle elements in a array list.[advanced]
                List<String> list_Strings = new ArrayList<String>();
                list_Strings.add("Red");
                list_Strings.add("Green");
                list_Strings.add("Orange");
                list_Strings.add("White");
                list_Strings.add("Black");
                System.out.println("List before shuffling:\n" + list_Strings);
                Collections.shuffle(list_Strings);
                System.out.println("List after shuffling:\n" + list_Strings);

//11. Write a Java program to reverse elements in a array list.
//                ArrayList<String> list3 = new ArrayList<>();
//                for (int i = list1.size() - 1; i >= 0; i--) {
//                    String element = list1.get(i);
//                    list2.add(element);
//                }
//                list1 = list2;
//
//                System.out.println("List 1 reverse : " + list1);
//12. Write a Java program to extract a portion of a array list.
//                List<String> list_Strings = new ArrayList<String>();
//                list_Strings.add("Red");
//                list_Strings.add("Green");
//                list_Strings.add("Orange");
//                list_Strings.add("White");
//                list_Strings.add("Black");
//                System.out.println("Original list: " + list_Strings);
//                List<String> sub_List = list_Strings.subList(0, 3);
//                System.out.println("List of first three elements: " + sub_List);

//13. Write a Java program to compare two array lists.
                ArrayList<String> c1 = new ArrayList<String>();
                c1.add("Red");
                c1.add("Green");
                c1.add("Black");
                c1.add("White");
                c1.add("Pink");

                ArrayList<String> c2 = new ArrayList<String>();
                c2.add("Red");
                c2.add("Green");
                c2.add("Black");
                c2.add("Pink");


                ArrayList<String> c3 = new ArrayList<String>();
                for (String e : c1)
                    c3.add(c2.contains(e) ? "Yes" : "No");
                System.out.println(c3);
//14. Write a Java program of swap two elements in an array list.
//                ArrayList<String> c1= new ArrayList<String>();
//                c1.add("Red");
//                c1.add("Green");
//                c1.add("Black");
//                c1.add("White");
//                c1.add("Pink");
//
//                System.out.println("Array list before Swap:");
//                for(String a: c1){
//                    System.out.println(a);
//                }
//
//                Collections.swap(c1, 0, 2);
//                System.out.println("Array list after swap:");
//                for(String b: c1){
//                    System.out.println(b);

//15. Write a Java program to join two array lists.
//                ArrayList<String> c1= new ArrayList<String>();
//                c1.add("Red");
//                c1.add("Green");
//                c1.add("Black");
//                c1.add("White");
//                c1.add("Pink");
//                System.out.println("List of first array: " + c1);
//                ArrayList<String> c2= new ArrayList<String>();
//                c2.add("Red");
//                c2.add("Green");
//                c2.add("Black");
//                c2.add("Pink");
//                System.out.println("List of second array: " + c2);
//
//
//                ArrayList<String> a = new ArrayList<String>();
//                a.addAll(c1);
//                a.addAll(c2);
//                System.out.println("New array: " + a);

//16. Write a Java program to clone an array list to another array list.
//                ArrayList<String> c1= new ArrayList<String>();
//                c1.add("Red");
//                c1.add("Green");
//                c1.add("Black");
//                c1.add("White");
//                c1.add("Pink");
//                System.out.println("Original array list: " + c1);
//                ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
//                System.out.println("Cloned array list: " + newc1)
// 17. Write a Java program to empty an array list.
//                ArrayList<String> color_list = new ArrayList<String>(7);
//                color_list.add("White");
//                color_list.add("Black");
//                color_list.add("Red");
//                color_list.add("White");
//                color_list.add("Yellow");
//                color_list.add("Red");
//                color_list.add("White");
//                System.out.println("****Color list****");
//                for (int i = 0; i < 7; i++)
//                {
//                    System.out.println(color_list.get(i).toString());
//                }
//
//
//                color_list.clear();
//
//
//                System.out.println("After using clear() method, the size of the list is: " + color_list.size());
//
//            }
//        }

//18. Write a Java program to test an array list is empty or not.
//                        ArrayList myArrayList = new ArrayList();
//                if (myArrayList.isEmpty()) {
//                    System.out.println("The ArrayList is empty");
//                } else {
//                    System.out.println("The ArrayList is not empty");
//
//                }
//19. Write a Java program to trim the capacity of an array list the current list size.
//                ArrayList<String> c1= new ArrayList<String>();
//                c1.add("Red");
//                c1.add("Green");
//                c1.add("Black");
//                c1.add("White");
//                c1.add("Pink");
//                System.out.println("Original array list: " + c1);
//                System.out.println("Let trim to size the above array: ");
//                c1.trimToSize();
//                System.out.println(c1);

//20. Write a Java program to increase the size of an array list.
                ArrayList<Integer> numbers = new ArrayList<Integer>();
                numbers.add(5);
                numbers.add(4);
                numbers.add(3);
                numbers.add(9);
                System.out.println("size of numberes is "+numbers.size());
                numbers.ensureCapacity(15);

//21. Write a Java program to replace the second element of a ArrayList with the specified element.
//                ArrayList<String>  color = new ArrayList<String>();
//
//                color.add("Red");
//                color.add("Green");
//
//                System.out.println("Original array list: " + color);
//                String new_color = "White";
//                color.set(1,new_color);
//
//                int num=color.size();
//                System.out.println("Replace second element with 'White'.");
//                for(int i=0;i<num;i++)
//                    System.out.println(color.get(i));

//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
//                ArrayList <String> c1 = new ArrayList <String> ();
//                c1.add("Red");
//                c1.add("Green");
//                c1.add("Black");
//                c1.add("White");
//                c1.add("Pink");
//                System.out.println("\nOriginal array list: " + c1);
//                System.out.println("\nPrint using index of an element: ");
//                int no_of_elements = c1.size();
//                for (int index = 0; index < no_of_elements; index++)
//                    System.out.println(c1.get(index));
            }
        }

            }
        }


