package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> set = helper(input1, input2);
        return set.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> set = helper(input1, input2);
        set.addAll(helper(input1, input3));
        set.addAll(helper(input2, input3));
        return set.size();
    }

    public Set<Double> helper(Double input1, Double input2){
        Set<Double> set = new HashSet<>();
        set.add(input1 + input2);
        set.add(input1 - input2);
        set.add(input2 - input1);
        if(input2 != 0)
            set.add(input1 / input2);
        if(input1 != 0)
            set.add(input2 / input1);
        set.add(input1 * input2);
        return set;
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> set = new HashSet<>();
        for(int i = 0; i < args.length - 1; i++){
            for(int j = i + 1; j < args.length; j++){
                set.addAll(helper(args[i], args[j]));
            }
        }
        return set.size();
    }
}
