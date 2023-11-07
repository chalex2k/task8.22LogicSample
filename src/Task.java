public class Task {
    static boolean thereAreANumberOfUnits = false;
    static boolean thereAreANumberOfZeros = false;
    static LineChecker[] checkers = new LineChecker[] {
            new HorizontalChecker(),
            new VerticalChecker(),
            // TODO other checkers
    };

    public static int mainLogic(int[][] arr2) {

//        boolean thereAreANumberOfUnits = false;
//        boolean thereAreANumberOfZeros = false;

        for (LineChecker checker : checkers) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 16; j++) {
                    if (!thereAreANumberOfUnits) {
                        if (checker.check(arr2, i, j, 1)) {
                            thereAreANumberOfUnits = true;
                        }
                    }
                    if (!thereAreANumberOfZeros) {
                        if (checker.check(arr2, i, j, 0)) {
                            thereAreANumberOfZeros = true;
                        }
                    }
                }
            }
        }

//  TODO delete
//
//        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < 16; j++) {
//                if (!thereAreANumberOfUnits) {
//                    if (arr2[j][i] == 1 && arr2[j + 1][i] == 1 && arr2[j + 2][i] == 1 && arr2[j + 3][i] == 1 && arr2[j + 4][i] == 1) {
//                        thereAreANumberOfUnits = true;
//                    }
//                }
//                if (!thereAreANumberOfZeros) {
//                    if (arr2[j][i] == 0 && arr2[j + 1][i] == 0 && arr2[j + 2][i] == 0 && arr2[j + 3][i] == 0 && arr2[j + 4][i] == 0) {
//                        thereAreANumberOfZeros = true;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < 16; i++) {
//            for (int j = 0; j < 16; j++) {
//                if (!thereAreANumberOfUnits) {
//                    if (arr2[i][j] == 1 && arr2[i + 1][j + 1] == 1 && arr2[i + 2][j + 2] == 1 && arr2[i + 3][j + 3] == 1 && arr2[i + 4][j + 4] == 1) {
//                        thereAreANumberOfUnits = true;
//                    }
//                }
//                if (!thereAreANumberOfZeros) {
//                    if (arr2[i][j] == 0 && arr2[i + 1][j + 1] == 0 && arr2[i + 2][j + 2] == 0 && arr2[i + 3][j + 3] == 0 && arr2[i + 4][j + 4] == 0) {
//                        thereAreANumberOfZeros = true;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < 16; i++) {
//            for (int j = 4; j < 20; j++) {
//                if (!thereAreANumberOfUnits) {
//                    if (arr2[i][j] == 1 && arr2[i + 1][j - 1] == 1 && arr2[i + 2][j - 2] == 1 && arr2[i + 3][j - 3] == 1 && arr2[i + 4][j - 4] == 1) {
//                        thereAreANumberOfUnits = true;
//                    }
//                }
//                if (!thereAreANumberOfZeros) {
//                    if (arr2[i][j] == 0 && arr2[i + 1][j - 1] == 0 && arr2[i + 2][j - 2] == 0 && arr2[i + 3][j - 3] == 0 && arr2[i + 4][j - 4] == 0) {
//                        thereAreANumberOfZeros = true;
//                    }
//                }
//            }
//        }

        return conclusion(thereAreANumberOfUnits, thereAreANumberOfZeros);

    }

    public static int conclusion(boolean thereAreANumberOfUnits, boolean thereAreANumberOfZeros) {
        if (thereAreANumberOfUnits == thereAreANumberOfZeros) {
            return 0;
        } else if (thereAreANumberOfUnits) {
            return 1;
        } else {
            return -1;
        }
    }

}