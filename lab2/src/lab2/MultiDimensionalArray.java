/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][][] arr = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int z = 0; z < 2; z++) {
                    System.out.println("arr[" + i
                            + "]["
                            + j + "]["
                            + z + "] = "
                            + arr[i][j][z]);
                }
            }
        }
    }
}
