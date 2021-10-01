
import java.awt.*;

class Main{

    public static void main(String[] args){
        System.out.println("Shape!");

        circle C = new circle(new Point(2,5), 5);

        triangle T = new triangle(new Point(5,6), 3);

        rectangle R = new rectangle(new Point(7,8), 3, 6);

        System.out.println(C.getPosition());
        System.out.println(C.withIn(new Point(2,10)));

        System.out.println(R.withIn(new Point(8,9)));
    }

}
