package ca.ciccc.wmad202.assignment9.problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Problem4Test {
    public class Solution{
        public static int[] solution(int[] A, int K){
            for(int i=0; i<K; i++){
                int temp = A[A.length-1];
                for(int j=1;j<A.length-2;j++){
                    A[0]= temp;
                    A[j]=A[j+1];
                }
            }
            return A;
        }
    }
    public static void test(){
        int[] initArray = {1,3,4,5,6,7,8,12,20};
        int k = 2;
        int[] result = Solution.solution(initArray,k);
        System.out.println("Init Array: "+ initArray);
        System.out.println("Array with rotation: "+ result);
        ArrayList<String> words = new ArrayList<>(){
            {
                add("hola");
                add("mama");
                add("estas");
            }
        };
        words.forEach(a-> System.out.println(a));
    }
}
