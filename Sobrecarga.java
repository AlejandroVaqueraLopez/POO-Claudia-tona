/**
 * sobrecarga = se definen 2 o mas metodos con el mismo nombre aunque la declaracion de
 * sus parametros sean diferentes, entonces se dice que el metodo esta sobrecargado.
 */
class Overload{
    void test(){
        System.out.println("no params");
    }
    void test(int a){
        System.out.println(a);
    }
    void test(int a, int b){
        System.out.println(a + " " + b);
    }
}
public class Sobrecarga {
    public static void main(String[] args){
        Overload instance = new Overload();
        instance.test();
        instance.test(35);
        instance.test(23,56);
    }

}
