class PrivateConstructor {
    public int _attrib = 0;
    private PrivateConstructor(int sample) {
        this._attrib = sample;
    }
}

public class PrivateConstructorMain{
    public static void main(String[] args){
        PrivateConstructor instance = new PrivateConstructor(2);
        System.out.println(instance._attrib);
    }
}


