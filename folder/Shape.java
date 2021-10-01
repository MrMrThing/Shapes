
import java.awt.*;



public abstract class Shape{

    Point position;
    double lenght;

    public Shape(Point pos, double len){
        this.position = pos;
        this.lenght = len;
    }

    public Point getPosition(){
        return this.position;
    }

    //Using abstract, to creat methods, that all sub classes shall have
    //without going into the different calculations here
    public abstract double getArea();

    public abstract double getCircumference();

    public abstract boolean withIn(Point pos);

    public abstract Point getCenter();

    public abstract double getEuclidean(Shape shape);

}

//
//-------------------------------------------------------------------------------------
//

class triangle extends Shape{

    double lenght;

    Point A;
    Point B;
    Point C;

    //initializer the triangle class
    public triangle(Point pos, Integer len){
        super (pos, len);

        this.lenght = len;

        this.A = pos;

        //What I do here is creating the 3 Points a Triangle has
        //Becouse this is a Right sided triangle, I can use this simple Calculation 
        //to get the 2 next points from A and the sides lenght
        Integer X = (int) (this.A.getX() + this.lenght);
        Integer Y = (int) (this.A.getY() + this.lenght);

        this.B = (new Point(X,Y));

        this.C = (new Point((int) (X - this.lenght), Y));

    }

    public double getCircumference(){
        double result = 0;

        //The Circumference is just all it's sides 
        result = this.lenght * 3;

        return result;
    }

    public double getArea(){

        double result = 0;

        //The area of a triangle is just it's bottom * it's height / 2
        result = (this.lenght * this.lenght) / 2;

        return result;
    }

    public boolean withIn(Point pos){
        boolean result = false;

        return result;
    }

    public Point getCenter(){
        
        //To get the center, we can use this formula
        Integer X = (int) ((this.A.getX() + this.B.getX() + this.C.getX()) / 3);
        Integer Y = (int) ((this.A.getY() + this.B.getY() + this.C.getY()) / 3);

        Point result = new Point (X,Y);

        return result;
    }

    public double getEuclidean(Shape shape){

        //First we get the triangles center, and then we get the distance
        //between that and the other shapes center
        Integer X = (int) ((this.A.getX() + this.B.getX() + this.C.getX()) / 3);
        Integer Y = (int) ((this.A.getY() + this.B.getY() + this.C.getY()) / 3);

        Point result = new Point (X,Y);

        return result.distance(shape.getCenter());
    }
   
}


//
//--------------------------------------------------------------------------------------
//

class circle extends Shape{

    double radius;

    //initializer the circle class
    public circle(Point pos, double len){

        super(pos, len);
        this.radius = len;

    }


    public double getArea(){
        double result = 0;

        //Simple area of a circle calculation
        result = this.radius * this.radius * Math.PI;

        return result;
    }

    public double getCircumference(){
        double result = 0;

        //Simple circumference of a circle calculation
        result = this.radius * 2 * Math.PI;

        return result;
    }

    public boolean withIn(Point pos){
        boolean result = false;

        //here we check if the distance between the center of the circle
        //is closer then it's border 
        if(this.position.distance(pos) <= this.radius){
            result = true;
        }

        return result;
    }
    public Point getCenter(){
        return this.position;
    }

    public double getEuclidean(Shape shape){
        return this.position.distance(shape.getCenter());
    }


}

//
//---------------------------------------------------------------------------------------
//


class rectangle extends Shape{

    double lenght1;
    double lenght2;

    //initializer the rectangle class
    public rectangle(Point pos, double len1, double len2){
        super(pos, len1);

        this.lenght1 = len1;
        this.lenght2 = len2;
         

    }

    public double getArea(){
        double result = 0;

        //Simple calculation for getting the Area
        result = lenght1 *lenght2;

        return result;
    }

    public double getCircumference(){
        double result = 0;

        //Simple calculation for getting the circumference
        result = (lenght1*2)+(lenght2*2);

        return result;
    }

    public boolean withIn(Point pos){
        boolean result = false;

        //Calculating if the given Point, is with in the Shape
        //This is done by checking if the Point is with in all the different cornors
        if( pos.getX() > this.position.getX() && 
            pos.getX() < this.position.getX() + lenght1 &&
            pos.getY() > this.position.getY() &&
            pos.getY() < this.position.getY() + lenght2){
                result = true;
        }

        return result;
    }
    public Point getCenter(){

        //Calculating the Shapes center
        Integer X = (int) (this.position.getX() + (lenght1/2));
        Integer Y = (int) (this.position.getY() + (lenght2/2));

        Point result = new Point (X,Y);

        //returning the result
        return result;
    }


    public double getEuclidean(Shape shape){

        //Starting by getting the center of this Shape
        Integer X = (int) (this.position.getX() + (lenght1/2));
        Integer Y = (int) (this.position.getY() + (lenght2/2));

        Point result = new Point (X,Y);

        //Then returning it's distance from the other given shapes center
        return result.distance(shape.getCenter());
    }

}
