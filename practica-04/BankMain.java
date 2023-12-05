import java.util.Scanner;

class Bank {
    private Account[] accounts = new Account[10];
    private int accountNumber = 0;

    public Account[] getAccountArray(){
        return this.accounts;
    }

    public void CreateAccount(Account newAccount){
        this.accounts[accountNumber] = newAccount;
    }
}

class Account {
    private int _NIP = 0;
    private String _name = "";
    private double _ammount = 0.00;

    public void CreateAccount(int NIP, String name, dokjuble ammount){
        this._NIP = NIP;
        this._name = name;
        this._ammount = ammount;
    }

    public void AccessAccount(int NIP){
        Bank bank = new Bank();
        if(bank.getAccountArray().equals(NIP)){
            System.out.println("This account exists");
        } else {
            System.out.println("This account doesn't exists");
        }

    }

}

public class BankMain {
    public static void main(String[] args){

        int opc = 0;
        Account accountInstance = new Account();
        Bank bankInstance = new Bank();
        
        do{
            System.out.println("-------------------------");
            System.out.println("Menu de opcion");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Acceder a mi cuenta");
            System.out.println("3. Salir");
            System.out.println("-------------------------");

            System.out.println("Ingrese la opcion: ");
            Scanner input = new Scanner(System.in);
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Crear cuenta");
                    System.out.println("Asignar NIP: ");
                        Scanner NIP = new Scanner(System.in);
                        int newNip = NIP.nextInt();
                    System.out.println("Asignar nombre: ");
                        Scanner name = new Scanner(System.in);
                        String newName = name.next();
                    System.out.println("Ingresar fondo(cantidad): ");
                        Scanner ammount = new Scanner(System.in);
                        int newAmmount = ammount.nextInt();
                    System.out.println("-------------------------");

                    accountInstance.CreateAccount(newNip, newName, newAmmount);
                    bankInstance.AddAccount(accountInstance);

                    System.out.println("Ingrese la opcion: ");
                    Scanner input = new Scanner(System.in);
                    opc = input.nextInt();

                    break;
            
                default:
                    break;
            }
        }while(opc != 3);
        
        
    }
}
