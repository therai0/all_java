class Two_d {
    public static void main(String a[]) {
        int arr[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {
                arr[i][l] = (int)(Math.random()*10);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(arr[i][l] + " ");
            }
            System.out.println();
        }
    }
}
