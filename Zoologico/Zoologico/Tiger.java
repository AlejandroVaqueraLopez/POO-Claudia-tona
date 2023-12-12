public class Tiger implements Animal{
    private String _name;
    private int _size;
    private int _weight;
    private int _speed;
    private String _color;

    public Tiger(String name, int size, int weight, int speed, String color){
        this._name = name;
        this._size = size;
        this._weight = weight;
        this._speed = speed;
        this._color = color;
    }

    @Override
    public String getName(){
        return this._name;
    }

    @Override
    public int getSize(){
        return this._size;
    }

    @Override
    public int getWeight(){
        return this._weight;
    }

    @Override
    public int getSpeed(){
        return this._speed;
    }

    @Override
    public String getColor(){
        return this._color;
    }
}