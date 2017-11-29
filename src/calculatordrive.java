public class calculatordrive {
    public static void main(String [] args) {
        double [] num = new double [7];
        num[0] = 456;
        num[1] = 103;
        num[2] = 456;
        num[3] = 456;
        num[4] = 354;
        num[5] = 710;
        num[6] = 500;
        System.out.println(calculator.getsum(5.0, 6.0));
        System.out.println(calculator.getproduct(6.0, 9.0));
        System.out.println(calculator.getaverage(50.0, 50.0));
        System.out.println(calculator.getsumotmn(num));
        System.out.println(calculator.getproductotmn(num));
        System.out.println(calculator.getaverageotmn(num));


    }
}
