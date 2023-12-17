import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Bank {

    private List<Account> accounts = new ArrayList<>();;

    public List<Account> GetAccountArray(){
        return this.accounts;
    }

    public void CreateAccount(Account newAccount){
        this.accounts.add(newAccount);
    }

    public Account AccessAccount(int NIP){
        Account access = null;
        for(int cont = 0; cont < this.accounts.size(); cont++){
            if(this.GetAccountArray().get(cont).GetNIP() == NIP){
                access = this.GetAccountArray().get(cont);
            }
        }
        if(access != null){
            System.out.println("El NIP es valido");
        } else {
            System.out.println("El NIP es invalido, intente de nuevo");
        }

        return access;

    }

}

class Account {
    private int _NIP = 0;
    private String _name = "";
    private double _ammount = 0.00;

    public void CreateAccount(int NIP, String name, double ammount){
        this._NIP = NIP;
        this._name = name;
        this._ammount = ammount;
    }

    public int GetNIP(){
        return this._NIP;
    }
    public String GetName(){
        return this._name;
    }
    public double GetAmmount(){
        return this._ammount;
    }
    public void SetAmmount(double newAmmount){
        this._ammount = newAmmount;
    }

}

public class BancoMain {
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
                    System.out.println("\n-------------------------");
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

                    System.out.println("Cuenta creada con exito!");
                    System.out.println("-------------------------\n");

                    accountInstance.CreateAccount(newNip, newName, newAmmount);
                    bankInstance.CreateAccount(accountInstance);

                    break;

                case 2:
                    System.out.println("-------------------------");
                    System.out.println("Acceder a cuenta");
                  
                    System.out.println("Ingresar NIP: ");
                        Scanner inputNIP = new Scanner(System.in);
                        int accessNIP = inputNIP.nextInt();

                        Account filtered = bankInstance.AccessAccount(accessNIP);
                    
                    if(filtered != null){
                        int subOpc = 0;
                        do{
                            System.out.println("-------------------------");
                            System.out.println("Datos de la cuenta: ");
                            System.out.println("Nombre: " + filtered.GetName());
                            System.out.println("Saldo: " + filtered.GetAmmount());
                            System.out.println("Menu de cuenta");
                            System.out.println("1. Depositar");
                            System.out.println("2. Retirar");
                            System.out.println("3. Salir");
                            System.out.println("-------------------------");

                            System.out.println("Ingrese la opcion: ");
                            Scanner inputSubOpc = new Scanner(System.in);
                            subOpc = inputSubOpc.nextInt();

                            switch (subOpc) {
                                case 1:
                                    System.out.println("-------------------------");
                                    System.out.println("Ingrese el monto a depositar: ");
                                    Scanner inputMoney = new Scanner(System.in);
                                    int moreMoney = inputMoney.nextInt();
                                    System.out.println("-------------------------");

                                    filtered.SetAmmount(filtered.GetAmmount() + moreMoney);

                                    System.out.println("Deposito exitoso!");
                                    System.out.println("-------------------------");
                                    break;

                                case 2:
                                    System.out.println("-------------------------");
                                    System.out.println("Ingrese el monto a retirar: ");
                                    Scanner transactionInput = new Scanner(System.in);
                                    int lessMoney = transactionInput.nextInt();
                                    System.out.println("-------------------------");

                                    //we have more than we need
                                    if(filtered.GetAmmount() >= lessMoney){
                                        filtered.SetAmmount(filtered.GetAmmount() - lessMoney);
                                        System.out.println("Retiro exitoso!");
                                    }else {
                                        System.out.println("No puedes retirar mas de lo que tienes!");
                                    }

                                    System.out.println("-------------------------");
                                    break;
                            
                                default:
                                    break;
                            }

                        }while(subOpc != 3);
                    };
                    break;
            
                default:
                    break;
            }
        }while(opc != 3);
        
    }
}
