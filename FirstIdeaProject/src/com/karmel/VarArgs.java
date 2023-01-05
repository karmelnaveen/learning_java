package com.karmel;
import java.util.Arrays;

//It simply means that the number of arguments i varying(n number of arguments)
//Internally it will consider it as an array
//Should be last in the arg list
public class VarArgs {
    public static void main(String[] args) {
        multipleArgs1(1,2,3,45,5,67,6,5,3221);
        multipleArgs2("karmel","naveen","hello","world","lorem","ipsum");
    }
    static void multipleArgs1(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multipleArgs2(String ...v){
        System.out.println(Arrays.toString(v));
    }


}
