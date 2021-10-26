import java.util.Random;
import java.util.Scanner;

public class Enemy {
  private int health;
  private String name;
  private Weapon weapon;
  private Room startRoom;


  public Enemy(String name, int health,Weapon weapon, Room startRoom){
    this.name = name;
    this.health = health;
    this.weapon = weapon;
    this.startRoom = startRoom;
  }

}
