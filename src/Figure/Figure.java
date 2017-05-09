package Figure;


public class Figure {


    public double lengthSide(Point A, Point B) {
        return Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
    }

    public Figure(Point pointA, Point pointB, Point point3, Point point4, Point point5) {
        double AB= lengthSide(pointA,pointB);
        double BC= lengthSide(pointB,point3);
        double CD= lengthSide(point3,point4);
        double DM= lengthSide(point4,point5);
        double MA= lengthSide(point5,pointA);
        double Perimeter = AB + BC + CD + DM + MA;
        System.out.println(Perimeter);
    }



    public Figure(Point pointB, Point point3, Point point4, Point point5) {
        double AB= lengthSide(pointB,point3);
        double BC= lengthSide(point3,point4);
        double CD= lengthSide(point4,point5);
        double DM= lengthSide(point5,pointB);
        double Perimeter = AB + BC + CD + DM ;
        System.out.println(Perimeter);
    }

    public Figure(Point pointA, Point pointB, Point point3) {
        double AB= lengthSide(pointA,pointB);
        double BC= lengthSide(pointB,point3);
        double CD= lengthSide(point3,pointA);
        double Perimeter = AB + BC + CD  ;
        System.out.println(Perimeter);
    }

    }