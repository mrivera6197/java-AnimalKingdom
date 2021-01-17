package animalkingdom;

abstract class Animal {
  // fields
  private static int maxId = 0;
  private int id;
  private String name;
  private int year;

  //constructor
  public Animal(String name, int year) {
    this.id = maxId++;
    this.name = name;
    this.year = year;
  }

  public String eat() {
    return "Food";
  }

  //getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  public abstract String move();
  public abstract String breath();
  public abstract String reproduce();

  @Override
  public String toString() {
    return "Animals{" + "id: " + id + ", name: " + name + ", year: " + year + "}" + "\n";
  }

}
