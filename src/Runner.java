public class Runner {

    public static void main(String[] args) {

        double[] scan= {0.3,0.7,0.8,0.4,1.4,1.1,0.2,0.5,0.2,1.6,0.6,0.9};
        double[]scan2= {03,0.7,0.8,0.4,1.4,1.1};

        SkyView sv1= new SkyView(4,3,scan);
        SkyView sv2= new SkyView(3,2,scan2);

        sv1.print();
        System.out.println("------------");
        sv2.print();


        System.out.println("Avg 1: " + sv1.getAverage(1,3,0,2));
        System.out.println("Avg 2: " + sv2.getAverage(0,1,0,1));

    }
}
