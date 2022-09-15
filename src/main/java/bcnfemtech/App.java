package bcnfemtech;

public class App {

    public static void main(String[] args) {
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        System.out.println(greetingGenerator.hello());
        String[][] croquetas = MyJDBC.JSAMU();
        for (int i = 0; i < croquetas.length; i++){
            for (int j = 0; j < croquetas[i].length; j++)
        System.out.println(croquetas[i][j]);
            System.out.print("\n");
    } }
}


