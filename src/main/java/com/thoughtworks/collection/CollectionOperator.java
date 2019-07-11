package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        ArrayList<Integer> integers = new ArrayList<>();
        if(left<right){
            for (int i = left; i <=right ; i++) {
                integers.add(i);
            }
        }
        else{
            for (int i = left; i >=right ; i--) {
                integers.add(i);
            }
        }
        return integers;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        ArrayList<Integer> integers = new ArrayList<>();
        if(left<right){
            for (int i = left; i <=right ; i++) {
                if(i % 2 == 0)
                integers.add(i);
            }
        }
        else{
            for (int i = left; i >=right ; i--) {
                if(i % 2 == 0)
                integers.add(i);
            }
        }
        return integers;
    }

    public List<Integer> popEvenElments(int[] array) {
         return  Arrays.stream(array).filter(value -> value % 2 == 0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
       return  Arrays.stream(array).boxed().collect(Collectors.toList()).get(array.length-1).intValue();

    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
