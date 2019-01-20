public class SkyView {

    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];

        int pew = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (i % 2 == 0) {
                    view[i][j] = scanned[pew];
                } else {
                    view[i][numCols - j - 1] = scanned[pew];
                }

                pew++;
            }


        }
    }





    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        int x = 0;
        double sum = 0;

        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += view[i][j];
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

