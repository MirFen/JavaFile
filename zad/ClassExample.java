package zad;

public class ClassExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();


        rectangle.a=10;
        rectangle.b=20;
        rectangle.label="Prostokąt1";

        int calculateField = rectangle.calculateField();

        System.out.println(rectangle);
        System.out.println("Pole obiektu "+ rectangle.label + " Wynosi " + calculateField);
        System.out.println();





        circle(5.7, "Pole Koła1");
        circle1(2.5, "Pole Koła2");

        circle2(5.9, "Pole Koła3");

    }



    private static void circle(double r, String label) {
        Circle circle = new Circle(r, label);
//        circle.setR(r);
//        circle.pi= (float) 3.14;
//        circle.setLabel(label);
//        int calculateCircle= circle.calculateField();
        System.out.println(circle);
        System.out.println("Pole obiektu "+ circle.getLabel() + " Wynosi " + circle.calculateField());
        System.out.println();
    }

    private static void circle1(double r, String label) {
        Circle circle1 = new Circle(r, label);
//        circle1.setR(r);
//        circle1.pi= (float) 3.14;
//        circle1.setLabel(label);
//        int calculateCircle1= circle1.calculateField();
        System.out.println(circle1);
        System.out.println("Pole obiektu1 " + circle1.getLabel() + " Wynosi " + circle1.calculateField());
    }

    private static void circle2(double r, String label) {
        Circle circle2 = new Circle(r, label);
//        circle2.setR(r);
//        circle1.pi= (float) 3.14;
//        circle2.setLabel(label);
//        int calculateCircle1= circle1.calculateField();
        System.out.println(circle2);
        System.out.println("Pole obiektu1 " + circle2.getLabel() + " Wynosi " + circle2.calculateField());
    }


}
