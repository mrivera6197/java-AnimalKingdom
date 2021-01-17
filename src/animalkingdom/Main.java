package animalkingdom;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Main {
  public static void printAnimal(List<Animal> animals, Filter tester) {
    for (Animal a : animals) {
      if (tester.test(a)) {
        System.out.println(a.getName() + " " + a.getYear() + " " + a.move() + " " + a.breath() + " " + a.reproduce());
      }
    }
  }
  public static void main(String[] args) {
    List<Animal> animalsArrayList = new ArrayList<>();

    //mammals
    animalsArrayList.add(new Mammals("Panda", 1869));
    animalsArrayList.add(new Mammals("Zebra", 1778));
    animalsArrayList.add(new Mammals("Koala", 1816));
    animalsArrayList.add(new Mammals("Sloth", 1804));
    animalsArrayList.add(new Mammals("Armadillo", 1758));
    animalsArrayList.add(new Mammals("Raccoon", 1758));
    animalsArrayList.add(new Mammals("Bigfoot", 2021));

    //birds
    animalsArrayList.add(new Birds("Pigeon", 1837));
    animalsArrayList.add(new Birds("Peacock", 1821));
    animalsArrayList.add(new Birds("Toucan", 1758));
    animalsArrayList.add(new Birds("Parrot", 1824));
    animalsArrayList.add(new Birds("Swan", 1758));

    //fish
    animalsArrayList.add(new Fish("Salmon", 1758));
    animalsArrayList.add(new Fish("Catfish", 1817));
    animalsArrayList.add(new Fish("Perch", 1758));

    // list animals in descending order
    System.out.println("List all animals in descending order");
    animalsArrayList.sort((a1, a2) -> a2.getYear() - a1.getYear());
    System.out.println(animalsArrayList.toString());

    // list animals alphabetically
    System.out.println();
    System.out.println("List all animals alphabetically");
    animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    System.out.println(animalsArrayList.toString());

    // list animals by how they move
    System.out.println();
    System.out.println("List animals by how they move");
    animalsArrayList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    System.out.println(animalsArrayList.toString());

    // list aniamls that breath with lungs
    System.out.println();
    System.out.println("List animals that breath with lungs");
    printAnimal(animalsArrayList, a -> a.breath().equalsIgnoreCase("lungs"));

    // list animals that breath with lungs and were named in 1758
    System.out.println();
    System.out.println("List animals that breath with lungs and were named in 1758");
    printAnimal(animalsArrayList, a -> (a.breath().equalsIgnoreCase("lungs") && a.getYear() == 1758));

    // list animals that lay eggs and breath with lungs
    System.out.println();
    System.out.println("List animals that lay eggs and breath with lungs");
    printAnimal(animalsArrayList, a -> (a.reproduce().equalsIgnoreCase("eggs") && a.breath().equalsIgnoreCase("lungs")));

    // list animals that were named in 1758 alphabetically
    System.out.println();
    System.out.println("List animals that were named in 1758 alphabetically");
    animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimal(animalsArrayList, a -> (a.getYear() == 1758));

  }
}
