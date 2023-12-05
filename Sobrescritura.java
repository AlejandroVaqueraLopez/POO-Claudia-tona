//Son metodos que se sustituyen en tiempo de ejecucion
//Sobreescritura
class A {
    void hola(){
        System.out.println("A");
    }
}
class B extends A {
    void hola(){
        System.out.println("B");
    }
}
class C extends A {
    void hola(){
        System.out.println("C");
    }
}

public class Sobrescritura {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        A aux;

        aux = a;
        aux.hola();//A

        aux = b;
        aux.hola();//B

        aux = c;
        aux.hola();//C

    }
}
