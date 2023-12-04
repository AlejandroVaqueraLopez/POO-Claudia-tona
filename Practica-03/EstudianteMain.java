import java.util.Scanner;

class Estudiante {
    String _nombre = "";
    int _numControl = 0;
    String _materia = "";
    int _calificacion = 0;
    String _estado = "";

    public Estudiante(String nombre, int numControl, String materia, int calificacion, String estado){
        this._nombre = nombre;
        this._numControl = numControl;
        this._materia = materia;
        this._calificacion = calificacion;
        this._estado = estado;
    }

    public void AsignarEstado(){
        if(this._calificacion > 60){
            this._estado = "Aprobado";
        }else {
            this._estado = "Reprobado";
        }
    }

    public void CambiarCalificacion(int nuevaCalificacion){
        this._calificacion = nuevaCalificacion;
    }
}

public class EstudianteMain {
    public static void main(String[] args){
        int opc = 0;
        Estudiante[] miArreglo = new Estudiante[10];
        boolean userInput = false;//defines if user has enter data to the array
        int limit = 5;

        Estudiante primerInstancia = new Estudiante("martin", 0, "Espanol", 10, "Aprobado");
        Estudiante segundaInstancia = new Estudiante("joaquin",1 , "Matematicas", 10, "Aprobado");
        Estudiante tercerInstancia = new Estudiante("martin", 13, "Historia", 8, "Aprobado");
        Estudiante cuartaInstancia = new Estudiante("martin", 38, "Literatura", 8, "Aprobado");
        Estudiante quintaInstancia = new Estudiante("martin", 28, "Derecho", 4, "Reprobado");

        miArreglo[0] = primerInstancia;
        miArreglo[1] = segundaInstancia;
        miArreglo[2] = tercerInstancia;
        miArreglo[3] = cuartaInstancia;
        miArreglo[4] = quintaInstancia;


        do{

            System.out.println("-------------------------");
            System.out.println("Menu de opcion");
            System.out.println("1. Capturar alumnos");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Cambiar calificacion");
            System.out.println("4. Salir");
            System.out.println("-------------------------");

            System.out.println("Ingrese la opcion: ");
            Scanner input = new Scanner(System.in);
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("1. Registrar alumnos");
                    for(int cont = 5; cont < limit + 5; cont++){

                        Estudiante instancia = new Estudiante(null, cont, null, cont, null);

                        System.out.println("[" + cont + "] Ingresar numero de control: ");
                        Scanner userNumControl = new Scanner(System.in);
                        instancia._numControl = userNumControl.nextInt();

                        System.out.println("[" + cont + "] Ingresar nombre: ");
                        Scanner userName = new Scanner(System.in);
                        instancia._nombre = userName.next();

                        System.out.println("[" + cont + "] Ingresar materia: ");
                        Scanner userAssignment= new Scanner(System.in);
                        instancia._materia = userAssignment.next();

                        System.out.println("[" + cont + "] Ingresar calificacion: ");
                        Scanner userGrade = new Scanner(System.in);
                        instancia._calificacion = userGrade.nextInt();

                        instancia.AsignarEstado();

                        miArreglo[cont] = instancia;
                        System.out.println("-------------------------");
                    }
                    System.out.println("-------------------------");
                    userInput = true;
                    break;
                case 2:
                    System.out.println("-------------------------");
                    System.out.println("2. Mostrar alumnos");
                    if(userInput == true){
                        limit = 10;
                    }
                    for(int cont = 0;cont < limit; cont++){
                        System.out.print(cont + ".- ");
                        System.out.print(" | " + miArreglo[cont]._numControl);
                        System.out.print(" | " + miArreglo[cont]._nombre);
                        System.out.print(" | " + miArreglo[cont]._materia);
                        System.out.print(" | " + miArreglo[cont]._calificacion);
                        System.out.println(" | " + miArreglo[cont]._estado);
                    }
                    System.out.println("-------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println("2. Mostrar alumnos");
                        for(int cont = 0;cont < limit; cont++){
                            System.out.print(cont + ".- ");
                            System.out.print(" | " + miArreglo[cont]._numControl);
                            System.out.print(" | " + miArreglo[cont]._nombre);
                            System.out.print(" | " + miArreglo[cont]._materia);
                            System.out.print(" | " + miArreglo[cont]._calificacion);
                            System.out.println(" | " + miArreglo[cont]._estado);
                        }
                    System.out.println("-------------------------");

                    System.out.println("Ingresa el numero de alumno a editar: ");
                    Scanner idToEdit = new Scanner(System.in);
                    int id = idToEdit.nextInt();
                    System.out.println("Ingresa la nueva calificacion: ");
                    Scanner newGrade = new Scanner(System.in);
                    int grade = newGrade.nextInt();
                    miArreglo[id].CambiarCalificacion(grade);

                    System.out.println("Se ha registrado la calificacion");

                    break;
            
                default:
                    break;
            }

        }while(opc != 4);
    }
}
