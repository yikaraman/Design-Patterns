
package org.developer.pattern.Observer;

public class Test {
   public static void main(String[] args) {
      Newspaper newyork = new NewYorkTimes();

      Subscriber musteri1 = new Member("Tarik", "Akan");
      musteri1.becomeAMember(newyork);

      Subscriber musteri2 = new Member("Filiz", "Akin");
      musteri2.becomeAMember(newyork);

      newyork.sendNewspaper();
      musteri2.cancelSubs();
      newyork.sendNewspaper();

   }
}
