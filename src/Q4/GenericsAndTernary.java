package Q4;

import java.util.ArrayList;

public class GenericsAndTernary {

    enum DetailLevel
    {
        LOW,
        MED,
        HIGH
    }

    static class MyBox<T> {
        private T myVal;

        public MyBox(T thing) { myVal = thing; }
        public void setVal(T thing) { myVal = thing; }
        public T getVal() { return myVal; }
        public String toString() { return myVal.toString(); }

    }
    static <T> void printBox(MyBox<T> box){
        System.out.println("Box contains: " + box.getVal());
    }
    public static void main(String[] args){
        DetailLevel thing = DetailLevel.HIGH;
        var box = new MyBox<Integer>(5); //var infers type from right side
        var ben = new ArrayList<Integer>(7);
        String msg = (box.getVal() >= 5) ? "val >= 5" : "val < 5:";
    switch(thing){
        case LOW ->
                {

        }
        case MED ->
                {

        }
        case HIGH ->
                {

                }


    }
    }


}
