package Circle;

public class Circle {
    public static double radius,diameter;
    public String circleName;
    public Circle(double radius,double diameter, String circleName){
        this.radius=radius;
        this.diameter= diameter;
        this.circleName=circleName;
    }

    public String getCircleName() {
        return circleName;
    }

    public static double getDiameter() {
        return (radius*radius);
    }

    public static double getArea(){
        return(Math.PI*getDiameter());
    }

    /*public double getLowArea(){
        return()
    }*/
}
