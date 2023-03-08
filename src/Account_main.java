import java.util.Scanner;

public class Account_main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int op = 0, num1;
        float newbalance;
        double balance;


        Account_logic dueño = new Account_logic(

                "Carlos",
                456215878,
                15.02,
                "Ahorrar dinero",
                "abono",
                20500.35);

        System.out.println("Que desea hacer en su cuenta?\n");
        System.out.println("(1)Saldo");
        System.out.println("2) Retirar");
        System.out.println("3) Depositar");
        System.out.println("0) Salir");
        System.out.println("");

        op = entrada.nextInt();
        if (op == 1) {
            System.out.println(" Su saldo es: " + dueño.getBalance());
        } else if (op == 2) {
            System.out.println(" Ingrese la cantidad");
            num1 = entrada.nextInt();
        }

    }
}
