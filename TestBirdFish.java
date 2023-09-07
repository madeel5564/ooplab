/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author fa20-bse-163
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

abstract  class  Animal  {
// abstract methods
abstract  void  move();
abstract  void  eat();
// concrete method
void  label()  {
System.out.println("Animal's data:");
}
}
class  Bird  extends Animal {
void  move()  {
System.out.println("Moves by flying.");
}
void  eat()  {
System.out.println("Eats birdfood.");
}
}

class Fish extends Animal {
    void move() {
        System.out.println("Move by swimming.");
    }
    void eat() {
        System.out.println("Eats seafood.");
    }
}

public class TestBirdFish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal myBird =  new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();
         Animal myFish = new Fish();
        myFish.label();
        myFish.move();
        myFish.eat();
    }
    
}