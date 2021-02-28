

package com.lavenberg;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    
    public static void main(String[] args) {

    String[] countries = { "France", "Belgium", "The Netherlands", "Luxembourg", "Monaco", "Iceland", "Norway",
            "Sweden", "Finland", "Denmark" };
        
        // TODO Auto-generated method stub

            System.out.println("Sort by length - shortest to longest: ");
            Arrays.sort(countries, (s1, s2) -> s1.length() - s2.length());
            Arrays.asList(countries).forEach(System.out::println);

            System.out.println("\nSort by length - longest to shortest: ");
            Arrays.sort(countries, (s1, s2) -> (s2.length() - s1.length()));
            Arrays.asList(countries).forEach(System.out::println);

            System.out.println("\nSort alphabetically - by the first character only: ");
            Arrays.sort(countries, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
            Arrays.asList(countries).forEach(System.out::println);
    
            System.out.println("\nSort by strings that contain “e” first, everything else second: ");
            Arrays.sort(countries, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
            for(String c : countries) {
                System.out.println(c);
            }
            
        }
}


//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class ArraySort {
//  
//  public static void main(String[] args) {
//      
//      List<String> countries = new ArrayList<>();
//      countries.add("France");
//      countries.add("Belgium");
//      countries.add("The Netherlands");
//      countries.add("Luxembourg");
//      countries.add("Monaco");
//      countries.add("Iceland");
//      countries.add("Norway");
//      countries.add("Sweden");
//      countries.add("Findland");
//      countries.add("Denmark");
//      
//      System.out.println(countries.stream()
//                      .filter(str -> str.contains("e"))
//                      .collect(Collectors.toList()));
//  }
//}
