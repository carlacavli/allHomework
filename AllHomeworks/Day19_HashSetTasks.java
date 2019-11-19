package AllHomeworks;

//    https://beginnersbook.com/2013/12/hashset-class-in-java-with-example/

//1. Write a Java program to append the specified element to the end of a hash set.
//
//
//2. Write a Java program to iterate through all elements in a hash list.
//
//
//3. Write a Java program to get the number of elements in a hash set.
//
//
//4. Write a Java program to empty an hash set.
//
//
//5. Write a Java program to test a hash set is empty or not.
//
//
//6. Write a Java program to clone a hash set to another hash set.
//
//
//7. Write a Java program to convert a hash set to an array.
//
//
//8. Write a Java program to convert a hash set to a tree set.
//
//
//9. Write a Java program to convert a hash set to a List/ArrayList.
//
//
//10. Write a Java program to compare two hash set.
//
//
//11. Write a Java program to compare two sets and retain elements which are same on both sets.
//
//
//12. Write a Java program to remove all of the elements from a hash set.

//13. Write a Java Program to find duplications


import java.util.*;

public class Day19_HashSetTasks {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a hash set.

        HashSet<String> set1 = new HashSet<String>();
        set1.add("car");
        set1.add("truck");
        set1.add("van");
        set1.add("usv");
        System.out.println(set1);

        //  2. Write a Java program to iterate through all elements in a hash list.

        HashSet<String> list = new HashSet<String>();
        list.add("car");
        list.add("truck");
        list.add("van");
        list.add("usv");
        Iterator<String> a = list.iterator();
        while (a.hasNext()) {
            System.out.println(a.next());
        }

        //3. Write a Java program to get the number of elements in a hash set.
        System.out.println(list.size());


        //4. Write a Java program to empty an hash set.
        list.clear();
        System.out.println(list);

        //5. Write a Java program to test a hash set is empty or not.
        list.add("car");
        list.add("truck");
        list.add("van");
        list.add("usv");
        System.out.println(list.isEmpty());

        //6. Write a Java program to clone a hash set to another hash set.
        //HashSet<String> b = new HashSet<String>();
        //b = (HashSet)list.clone();
        System.out.println(list.clone());

        //7. Write a Java program to convert a hash set to an array.

        String[] array = new String[list.size()];
        list.toArray(array);
        System.out.println(Arrays.toString(array));

        //8. Write a Java program to convert a hash set to a tree set.

        TreeSet<String> newset = new TreeSet<String>();
        newset.addAll(list);
        System.out.println(newset);

        //9. Write a Java program to convert a hash set to a List/ArrayList.
        System.out.println("arraylist......");
        String[] new_array = new String[list.size()];
        list.toArray(new_array);
        for (String set : set1) {
            System.out.println(set);
        }
        //10. Write a Java program to compare two hash set.
        //? task 11 i did comparing i didnt understand this


        //11. Write a Java program to compare two sets and retain elements which are same on both sets.
        HashSet<String> hs = new HashSet<String>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        hs.add("fourth");
        hs.add("fifth");
        System.out.println(hs);
        HashSet<String> compset = new HashSet<String>();
        compset.add("six");
        compset.add("second");
        compset.add("first");
        hs.retainAll(compset);
        System.out.println("same elements are : " + hs);

        // 12. Write a Java program to remove all of the elements from a hash set.
        list.removeAll(list);
        System.out.println(list);

        //13. Write a Java Program to find duplications

        HashSet<String> mySet = new HashSet<String>();
        set1.add("car");
        set1.add("truck");
        set1.add("van");
        set1.add("usv");

        HashSet<String> list2 = new HashSet<String>();
        list.add("car");
        list.add("truck");
        list.add("van");
        list.add("usv");

        if (mySet.size() != list.size()) {
            System.out.println("has duplications");
        } else {
            System.out.println("no duplications");
        }
            }

        }

