
import java.awt.*;

class Main{

    public static void main(String[] args){

        //Creating the Shapes
        circle C = new circle(new Point(2,5), 5);

        triangle T = new triangle(new Point(5,6), 3);

        rectangle R = new rectangle(new Point(7,8), 3, 6);


        //Testing the different methods
        System.out.println("Euclidean distance between T and R: " + T.getEuclidean(R));

        System.out.println("The Area of the triangle is: " + T.getArea());

        System.out.println("Is the point (5,8) inside the circle? " +  C.withIn(new Point(5,8)));

        System.out.println("The circumference of C is: " +  C.getCircumference());

        System.out.println("The Center of R is: " +  R.getCenter());

    }

}
