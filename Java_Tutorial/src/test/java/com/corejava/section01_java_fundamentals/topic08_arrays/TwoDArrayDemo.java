package com.corejava.section01_java_fundamentals.topic08_arrays;

/** 2D arrays: rows x columns. A TestNG @DataProvider typically returns Object[][]. */
public class TwoDArrayDemo {

    public static void main(String[] args) {
        // Simulates the kind of Object[][] a TestNG @DataProvider would return
        Object[][] loginData = {
                {"admin", "admin123", true},
                {"guest", "wrongPass", false}
        };

        for (Object[] row : loginData) {
            String user = (String) row[0];
            String pass = (String) row[1];
            boolean expectedResult = (boolean) row[2];
            System.out.println("user=" + user + ", pass=" + pass + ", shouldLogin=" + expectedResult);
        }

        // A simple numeric grid
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("grid[1][2] -> " + grid[1][2]); // row 1, column 2 -> 6
    }
}
