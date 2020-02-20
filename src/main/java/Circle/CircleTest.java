package Circle;

public class CircleTest {
    public static void main (String [] args) {
        Circle [] c= new Circle [100];
        double x =0;
        for(int i=0;i<c.length;i++){
            c[i] = new Circle(NumberUtils.randomradius(),NumberUtils.randomdiameter(),NumberUtils.randomcirclename());
            x=Circle.getArea() + x;
        }
        System.out.println("The total of the areas is: " + x);
    }
    //Como imprimir o menor e o maior? Dúvida que não é explicada na matéria, não esquecer de perguntar.
    // Algum "get" que se possa fazer para dar o menor dentro do array?
}
