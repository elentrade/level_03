package fruit_store;

import java.util.ArrayList;

public class Box <T>{
    private ArrayList<T> list;
//    private float box_weight=0;
   T fruit;
    public Box() {
        list= new ArrayList<>() ;
    }

    public void  add (T fruit){
        list.add(fruit);
    }
    public <T> float  getBoxWeight (){
        if (list.size()==0){return 0.0f;}
        return 1.1f;
 //       return list.get(0).getWeight()*list.size();
//   геттер не работает

//        for (int i=0; i<=list.size();i++) {
//            box_weight =  box_weight  + list.get(i).getWeight();
//        }
//        return box_weight;
    }
public boolean compareBox(Box box){
   // return box.getBoxWeight()=this.getBoxWeight();
    return Math.abs(box.getBoxWeight()-this.getBoxWeight())<0.0001;
}
public void fillOffBox (Box<T> box){
        box.list.addAll(this.list);
        this.list.clear();
}

}
