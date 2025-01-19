package core;

import java.util.ArrayList;
import java.util.List;

public class GenericExpl {
    public static void main(String[] args) {
        // ? extends super
        List<Number> nums = new ArrayList<>();
        nums.add(10.0);
        addNumbers(nums);

        List<Object> objs = new ArrayList<>();
        addNumbers(objs);

//        List<Double> doubles = new ArrayList<>();
//        addNumbers(doubles);

        for (Number num : nums) {
            System.out.println(num.toString());
        }
    }

    static void addNumbers(List<? super Integer> numbers) {
        numbers.add(1);
        numbers.add(2);
//        numbers.add(27.0);
    }
}