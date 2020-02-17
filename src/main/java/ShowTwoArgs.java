public class ShowTwoArgs {
    public static void main(String[] args) {
        imprimeNomes(new String[] {"Joao", "Goncalo", "Sara"});
    }
    public static void imprimeNomes (String[] nomes){
        System.out.println("First arg: " + nomes[0]);
        System.out.println("Second arg: " + nomes[1]);
    }
}
