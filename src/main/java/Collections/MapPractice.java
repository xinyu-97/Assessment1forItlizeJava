package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

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
        Map<Integer, Integer> map = new TreeMap<>();
        if(size == 0){
            return map;
        }
        map.put(1, 1);
        if(size == 1){
            return map;
        }
        map.put(2, 1);
        if(size == 2){
            return map;
        }
        for(int i = 3; i <= size; i++){
            map.put(i, map.get(i - 1) + map.get(i - 2));
        }
        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> map = new TreeMap<>();
        if(size == 0){
            return map;
        }
        map.put(1, first);
        if(size == 1){
            return map;
        }
        map.put(2, second);
        if(size == 2){
            return map;
        }
        for(int i = 3; i <= size; i++){
            map.put(i, map.get(i - 1) + map.get(i - 2));
        }
        return map;
    }
}
