package org.probablity;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
      
        int apoint = 0;
        int bpoint = 0;
        
        for(int i=0; i<a.size() ;i++){
            if(a.get(i) == b.get(i)) continue;
            if(a.get(i) > b.get(i)) apoint++;
            else bpoint++;
        }
        int[] res = {apoint,bpoint};
        return new ArrayList(Arrays.asList(res));

    }

    public static void main(String[] args) throws IOException {

    	int[] arr1 = {17 ,28, 30};
    	int[] arr2 = {99, 16, 8};
       List<Integer> a  = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));


       List<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> result = compareTriplets(a, b);

       System.out.println(result);
    }
}