import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Menu.print();

        switch (scanner.nextLine()) {
            case "1" :
                System.out.println("Criando Senha!"); break;
            case "2" :
                System.out.println("Listando entradas!"); break;
            default : break;
        }

    }

}