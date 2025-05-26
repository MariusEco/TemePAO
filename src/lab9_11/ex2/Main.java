package lab9_11.ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CountingHashSet hashSet = new CountingHashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("Dupa add: " + hashSet.getTotalElementsAdded());
        hashSet.addAll(Arrays.asList(4, 5, 5));
        System.out.println("Dupa addAll: " + hashSet.getTotalElementsAdded());
        
        // addAll in HashSet apeleaza intern metoda add() pentru fiecare element
        // Asta inseamna ca fiecare element adaugat prin addAll va declansa si incrementarea din metoda noastra suprascrisa add()
        
        CountingLinkedList linkedList = new CountingLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("Dupa add: " + linkedList.getTotalElementsAdded());
        linkedList.addAll(Arrays.asList(4, 5, 5));
        System.out.println("Dupa addAll: " + linkedList.getTotalElementsAdded());
        
        // addAll in LinkedList nu apeleaza metoda add() intern in implementarea sa de addAll
        // in schimb, adauga elementele direct în structura de date fara a folosi add() pentru fiecare element
        // astfel, counter-ul este incrementat doar o singura data
        
    }
}
