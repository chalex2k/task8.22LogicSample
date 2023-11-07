class VerticalChecker implements LineChecker {
    public boolean check(int[][] arr, int i, int j, int control) {
        // TODO переписать это на цикл и 4 сделать константой
        return arr[j][i] == control && arr[j + 1][i] == control && arr[j + 2][i] == control && arr[j + 3][i] == control && arr[j + 4][i] == control; // TODO
    }
}