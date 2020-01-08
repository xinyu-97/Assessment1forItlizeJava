package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        for(Integer i : list1) {
        	sum += i;
        }
        
        for(Integer i : list2) {
        	sum += i;
        }
        
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        Iterator<Integer> it = original.iterator();
        while(it.hasNext()) {
        	if(it.next() == toRemove) {
        		it.remove();
        	}
        }
        System.out.println("after deleted" + original);
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
    	for(int i = 0; i < original.size() - 1; i++){
    	    boolean happy = false;
    	    for(int j = 0; j < original.get(i).length(); j++){
    	        char c = original.get(i).charAt(j);
    	        if(original.get(i + 1).indexOf(c) != -1){
                    happy = true;
                    break;
                }
            }
    	    if(!happy){
    	        return false;
            }
        }
        return true;
    }
}
