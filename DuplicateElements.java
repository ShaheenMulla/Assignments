package com.company;

public class DuplicateElements {

    public static void main(String[] args) {
	 int array[] = new int[]{ 2, 4, 7, 8, 5, 3, 5};

        for(int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
