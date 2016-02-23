package ross.goncharuk;

public class MyPyramid {

    public static void printPyramid(int h) {

        String space ="";

        for(int i = 1;i<=h;i++){

            if(h>9){
                System.out.println("Invalid value");
                break;
            }
            switch (i){
                case 1: space = "        ";
                    break;
                case 2: space = "       ";
                    break;
                case 3: space = "      ";
                    break;
                case 4: space = "     ";
                    break;
                case 5: space = "    ";
                    break;
                case 6: space = "   ";
                    break;
                case 7: space = "  ";
                    break;
                case 8: space = " ";
                    break;
                case 9: space = "";
                    break;
                default: space = "Invalid value";
                    break;
            }
            System.out.print(space);

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
