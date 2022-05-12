public class box{
    
    int width;
    int height;

    box(int w, int h) {
        width =w;
        height = h;
    }

    box(box b) {
        this.width = b.width;
        this.height = b.height; 
    }

    boolean isEqual(box b) {
        if(this.width == b.width && this.height == b.height)
            return true;
            else 
            return false;
    }

    box duplicate () {
        box temp = new box(this.width, this.height);
        return temp;
    }

    static boolean isTwoObjectsEqual(box b1, box b2) {
        if(b1.width == b2.width && b1.height == b2.height)
            return true;
        else
            return false;
    }

    void display() {
        System.out.println("width is " + this.width+ " and height is "+ this.height);
    }

}