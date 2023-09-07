/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author fa20-bse-163
 */

interface  Animal  {
public  void  eat();
public  void  sound();
}
interface  Bird  {
int numberOfLegs = 2;
String outerCovering =  "feather";
public  void  fly();
}

class  Eagle  implements Animal, Bird {
public  void  eat()  {
System.out.println("Eats reptiles and amphibians.");
}
public  void  sound()  {
System.out.println("Has a high-pitched whistling sound.");
}
public  void  fly()  {
System.out.println("Flies up to 10,000 feet.");
}
}

public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eagle myEagle =  new Eagle();

myEagle.eat();
myEagle.sound();
myEagle.fly();

System.out.println("Number of legs: "  + Bird.numberOfLegs);
System.out.println("Outer covering: "  + Bird.outerCovering);
    }
    
}
