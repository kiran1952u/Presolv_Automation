package com.org.test;

public class multiDimeArray {

    public static void main(String[] args) {
        int[][] multiDimArray = new int[2][3];
        multiDimArray[0][0] = 2;
        multiDimArray[0][1] = 3;
        multiDimArray[0][2] = 5;
        multiDimArray[1][0] = 6;
        multiDimArray[1][1] = 8;
        multiDimArray[1][2] = 9;

//        System.out.println(multiDimArray[1][2]);
        int[][] multiDimArray1 = {{2, 3, 5}, {6, 8, 9}};

//        System.out.println(multiDimArray1[1][2]);
        for (int i = 0; i < multiDimArray1.length; i++) {
            for (int j = 0; j < multiDimArray1[i].length; j++) {
                System.out.println(multiDimArray1[i][j]);
            }
        }
    }
}
