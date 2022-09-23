public class Main {

    public static boolean Array(int[][] array) {
        boolean flag = true;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] == array[i + 1][j]) {
                    flag = false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                if (array[i][j] == array[i][j + 1]) {
                    flag = false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                if (array[i][j] == array[i][j + 1]) {
                    flag = false;
                }
            }
        }

        for (int i = 0; i < 9 - 2; i += 3) {
            for (int j = 0; j < 9 - 2; j += 3) {
                if (array[i][j] == array[i][j + 1]) {
                    flag = false;
                }
        }
    }

        return flag;
    }

    public static void main(String[] args) {

        int[][]game = {
                {1,5,7,4,8,3,6,2,9},
                {6,3,8,1,2,9,7,5,4},
                {4,9,2,5,6,7,1,3,8},
                {8,4,5,9,7,6,3,1,2},
                {7,2,1,3,5,8,9,4,6},
                {3,6,9,2,1,4,5,8,7},
                {5,1,6,7,4,2,8,9,3},
                {2,8,3,6,9,1,4,7,5},
                {9,7,4,8,3,5,2,6,1}
        };
        System.out.println(Array(game));

    }

}
