package folder;
import java.awt.*;
import java.lang.Math;


class Shape{

    Point position;
    double lenght;

    public Shape(Point pos, double len){
        this.position = pos;
        this.lenght = len;
    }

}

class triangle extends Shape{

    double lenght1;
    double lenght2;
    double lenght3;

    Point A;
    Point B;
    Point C;

    public triangle(Point pos, double len1, double len2, double len3){
        super (pos, len1);

        this.lenght1 = len1;
        this.lenght2 = len2;
        this.lenght3 = len3;

        this.A = pos;

        double X = math.sqrt(len1 / 2);
        double Y = math.sqrt(len1 / 2);

        this.B = (new Point(X,Y));

    }

    public double getArea(){
        double result = 0;



        return result;
    }

}
