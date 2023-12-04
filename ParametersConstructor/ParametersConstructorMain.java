class ParametersConstructor {
    public int _attrib = 0;
    public ParametersConstructor(int parameter) {
        this._attrib = parameter;
    }
}


public class ParametersConstructorMain {
    public static void main(String[] args){
        ParametersConstructor instance = new ParametersConstructor(5);
        System.out.println(instance._attrib);
    }
}






