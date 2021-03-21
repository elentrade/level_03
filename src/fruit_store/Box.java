package fruit_store;

import java.util.ArrayList;

public class Box <T>{
    public float box_weight = 0.0f;
    ArrayList<T> list = new ArrayList<>();
    public <T> float  getWeight (int quantity){
        box_weight = box_weight+quantity;
        return box_weight;
    }




}
