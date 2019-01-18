package View;

public class SkyView {
    private double view[][];

    public SkyView(double[][] view) {
        this.view = view;
    }

    public SkyView(int numRows, int numCols, double[] scanned) {
        int scanind = 0;
        view = new double[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < numCols; col++) {
                    view[row][col] = scanned[scanind];
                    scanind++;
                }
            } else {
                for (int col = numCols - 1; col >= 0; col--) {
                    view[row][col] = scanned[scanind];
                    scanind++;
                }
            }
        }
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0.0;
        int numofval = 0;
        for(int row = startRow; row <= endRow; row++)
        {
            for(int col = startCol; col<=endCol;col++)
            {
                sum = sum + view[row][col];
                numofval++;
            }
        }
        return sum/numofval;
    }
}
