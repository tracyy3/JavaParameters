public class tutorial {
    public static void main (String[] args){

        box b1 = new box(10,20);
        box b2 = new box(30,40);

        box b3 = new box(b1);

        box b4 = b2.duplicate();

        b1.display();
        b3.display();

        b2.display();
        b4.display();

        if (b1.isEqual(b2)){
            System.out.println("Both b1 and b2 are equal");
        }else{
            System.out.println("Both b1 and b2 are not equal");
        }
        
        if (box.isTwoObjectsEqual(b1, b2)){
            System.out.println("Both b1 and b3 are equal");
        }else{
            System.out.println("Both b1 and b3 are equal");
    }

    }
}