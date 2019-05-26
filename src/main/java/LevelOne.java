public class LevelOne extends Map{
    private static int[][] grid = {{1,2,1,2},{2,3,1,1},{1,2,2,1},{1,2,2,3}};

    @Override
    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[] position, int setTo) {
        grid[position[0]][position[1]] = setTo;

    }
}
