public class Weapon {
  private String type;
  private String name;
  private int damage;

  public Weapon(String type, String name, int damage){
    this.type = type;
    this.name = name;
    this.damage = damage;
  }

  @Override
  public String toString() {
    return "Weapon{" +
        "type='" + type + '\'' +
        ", name='" + name + '\'' +
        ", damage=" + damage +
        ", dagger=" + dagger +
        ", sword=" + sword +
        '}';
  }

  Weapon dagger = new Weapon("Dagger","Dagger of galaxies",15);
  Weapon sword = new Weapon("Sword","Sword of space",30);
}
