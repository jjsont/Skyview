public class SkyView {

    private double [][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        this.view= new double[numRows][numCols];

        int pew= 0;
        for(int i=0; i< numRows; i++) {
            if(i % 2 == 0) {
                for (int j=0; j<numCols; j++) {
                    view[i][j] = scanned[pew];
                }
            }

            else {
                for(int j= numCols - 1; j >= 0; j--) {
                    view[i][j] = scanned[pew];
                    pew++;
                }
            }
        }

    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        int x = 0;
        double sum = 0;
        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                sum += view[row][col];
                x++;
            }
        }
        return (sum / x);
    }

    public void print() {
        String output="";
        for(int i=0; i<view.length; i++) {
            output="";
            for(int j=0;j<view[i].length;j++) {
                output += view[i][j]+" ";
            }
            System.out.println(output);
        }

    }
}

