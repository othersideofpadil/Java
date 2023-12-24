/**
 * GFG2
 */
public class GFG2 {

    public static void main(String[] args) {
        // creating inatance of Bicycle
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBreaks(1);

        System.out.println("Bicycle present state : ");
        bicycle.printStates();
    }
}