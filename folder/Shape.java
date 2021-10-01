
import java.awt.*;
import java.awt.geom.Point2D;



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

}

class triangle extends Shape{

    double lenght;

    Point A;
    Point B;
    Point C;

    public triangle(Point pos, Integer len){
        super (pos, len);

        this.lenght = len;

        this.A = pos;

        Integer X = (int) (this.A.getX() + this.lenght);
        Integer Y = (int) (this.A.getY() + this.lenght);

        this.B = (new Point(X,Y));

        this.C = (new Point((int) (X - this.lenght), Y));

    }

    public double getCircumference(){
        double result = 0;

        result = this.lenght * 3;

        return result;
    }

    public double getArea(){

        double result = 0;

        result = (this.lenght * this.lenght) / 2;

        return result;
    }

}

class circle extends Shape{

    double radius;

    public circle(Point pos, double len){

        super(pos, len);
        this.radius = len;

    }


    public double getArea(){
        double result = 0;

        result = this.radius * this.radius * Math.PI;

        return result;
    }

    public double getCircumference(){
        double result = 0;

        result = this.radius * 2 * Math.PI;

        return result;
    }

    public boolean withIn(Point pos){
        boolean result = false;

        if(this.position.distance(pos) <= this.radius){
            result = true;
        }

        return result;
    }

}

class rectangle extends Shape{

    double lenght1;
    double lenght2;

    public rectangle(Point pos, double len1, double len2){
        super(pos, len1);

        this.lenght1 = len1;
        this.lenght2 = len2;
         

    }

    public double getArea(){
        double result = 0;

        result = lenght1 *lenght2;

        return result;
    }

    public double getCircumference(){
        double result = 0;

        result = (lenght1*2)+(lenght2*2);

        return result;
    }

    public boolean withIn(Point pos){
        boolean result = false;

        if( pos.getX() > this.position.getX() && 
            pos.getX() < this.position.getX() + lenght1 &&
            pos.getY() > this.position.getY() &&
            pos.getY() < this.position.getY() + lenght2){
                result = true;
        }

        return result;
    }

}
