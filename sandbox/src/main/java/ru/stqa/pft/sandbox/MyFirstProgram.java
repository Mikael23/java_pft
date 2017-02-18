package ru.stqa.pft.sandbox;

public class MyFirstProgram{

    public static void main(String[]args){
System.out.println("Hello,world");
Hello("world");
Hello("dear");
Hello("Mikle");
Square s = new Square(5);

System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area()) ;

Rectangle r = new Rectangle(4,6);

System.out.println("Площадь прямоугольника " + r.a +  "и " +r.b + "=" + r.area());
        System.out.println("============================");
Points a = new Points();

double c = a.getdistance(3,5,7,2);

System.out.println(c);





/*int a = 10;
int r = a*a;
        System.out.println("Сторона квадрата со стороной" +" "+ a
                + " " + "равна" +" " + r);*/

}
    public static void Hello(String somebody){

        System.out.println("Hello"+ " " + somebody);

    }

    public static int Hello(int a,int b){

        return a*b;
    }


}