public class LevelOne extends Map{
    private static int[][] grid = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

    @Override
    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[] position, int setTo) {
        grid[position[0]][position[1]] = setTo;

    }
}
