class Example_4{

    public static void Example_4(int[] arr) {

        System.out.println("******Example_4******");
        for (int i =0; i<arr.length; i++) {

            arr[i] = ((int)(Math.random() * 10));
            System.out.println(arr[i] );

        }
        System.out.println("\n");
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }}
