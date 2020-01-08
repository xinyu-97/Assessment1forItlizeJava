package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<Object> list = new ArrayList<Object>();
        Iterator ite = map.entrySet().iterator();
        while(ite.hasNext()){
            Map.Entry en = (Map.Entry) ite.next();
            if(en.getValue().equals(value)){
                list.add(en.getKey());
            }
        }
        return list.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        return null;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        return null;
    }
}
