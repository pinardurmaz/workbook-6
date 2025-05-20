package com.pluralsight.collection;

import java.time.LocalDate;

 class CustomCollectionsApplication {
     public static void main(String[] args) {
         FixedList<Integer> numbers = new FixedList<>(3);
         numbers.add(10);
         numbers.add(3);
         numbers.add(92);
         numbers.add(43); // bu eklenmeyecek
         System.out.println("Number list size: " + numbers.getItems().size());

         FixedList<LocalDate> dates = new FixedList<>(2);
         dates.add(LocalDate.now());
         dates.add(LocalDate.now());
         // dates.add(15); // Hatalı satır, çünkü 15 bir LocalDate değil
     }
 }
