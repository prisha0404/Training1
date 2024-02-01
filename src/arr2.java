public class arr2 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][2];
        arr1[1][1]= 10;
        arr1[1][2] = 20;
        arr1[1][3] = 30;
        arr1[2][1] = 40;
        arr1[2][2] = 50;
        arr1[2][3] = 60;

        int arr2[][] = new int[2][3];
        arr2[1][1] = 50;
        arr2[1][2] = 60;
        arr2[2][1] = 70;
        arr2[2][2] = 80;
        arr2[3][1] = 90;
        arr2[3][2] = 80;


        int result[][] = new int[arr1.length] [arr2[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++){
                    result[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
    }
    for(int i=0;i< result.length;i++){
        for(int j=0;j< result[0].length;j++){
            System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        }
    }

