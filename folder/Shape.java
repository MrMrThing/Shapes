package folder;
import java.awt.*;



public class Shape{

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

    public triangle(Point pos, double len){
        super (pos, len);

        this.lenght = len;

        this.A = pos;

        Double X = Math.sqrt(len / 2);
        Double Y = Math.sqrt(len / 2);

        this.B = (new Point(2,5));

    }

    public double getArea(){
        double result = 0;



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

}
