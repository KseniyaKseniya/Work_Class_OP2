package Figure;

/**
 * Created by zzzxxx on 09.05.2017.
 */
public class Main {
    public static void main(String[] args) {

   System.out.println("Периметр Квадрата") ;
   Figure Квадрат = new Figure(new Point(10, 9, "A"),  new Point(8, 3, "B"), new Point(2, 4, "C"), new Point(4, 5, "D"));
        System.out.println("Периметр Триугольника") ;
        Figure Треугольник= new Figure(new Point(5,9,"A"), new Point(3,8,"B"),new Point(4,4,"C"));
        System.out.println("Периметр Пятиугольника") ;
        Figure Пятиугольник = new Figure(new Point(10, 9, "A"),  new Point(8, 3, "B"), new Point(2, 4, "C"), new Point(4, 5, "D"),
                new Point(5,2,"M") );



    }

}
