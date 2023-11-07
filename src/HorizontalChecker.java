class HorizontalChecker implements LineChecker {
    // Этот объект умеет проверять наличие горизонтальной линии в массиве
    public boolean check(int[][] arr, int i, int j, int control) {
        // TODO переписать это на цикл и 4 сделать константой
        return arr[i][j] == control && arr[i][j + 1] == control && arr[i][j + 2] == control && arr[i][j + 3] == control && arr[i][j + 4] == control;
    }
}
