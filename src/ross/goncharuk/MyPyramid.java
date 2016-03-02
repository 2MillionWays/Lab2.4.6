package ross.goncharuk;

public class MyPyramid {

    public static void printPyramid(int h) {

        for(int i = 1;i<=h;i++){
            if(h>9){
                System.out.println("Invalid value");
                break;
            }
            for (int s = h;s>i;s--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int k = i-1;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
