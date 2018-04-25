public class ArrayRotation {
    static int arr[] = {1, 2, 3, 4, 5};
    // Rotating array ar[] of Size n by d Elements...
    public static void main(String args[]) {

        //int n=5,d=2;//shifting 2 elements...
        ArrayRotation obj = new ArrayRotation();
        System.out.println("Array Before Rotation");
        print(arr);
        obj.tempArrayRotation(arr, 5, 2);
        obj.oneByOneArrayRotation(arr, 5, 2);
        obj.jugglingArrayRotation(arr, 5, 2);


    }

    //Rotaion by Temp Array of d elements.....
    public void tempArrayRotation(int array[], int n, int d) {

        int temp[] = new int[d];
        int i;

        for (i = 0; i < d; i++) {
            temp[i] = array[i];
        }

        for (i = 0; i < n; i++) {
            if (i < n - d) {
                array[i] = array[i + d];
            } else {
                array[i] = temp[i - (n - d)];
            }
        }
        System.out.println("Array after Temporary Rotation by " + d + " elements");
        print(array);

    }
    //One by one Rotaion.....

    public void oneByOneArrayRotation(int array1[], int n, int d) {

        int i, j;
        for (i = 0; i < d; i++) {
            int temp = array1[0];
            for (j = 0; j < n; j++) {
                if (j == n - 1) {
                    array1[j] = temp;
                } else {
                    array1[j] = array1[j + 1];
                }
            }
        }
        System.out.println("Array after OneByOne Rotation by " + d + " elements");
        print(array1);

    }
    //Rotaion by Juggling Algorithm.....

    public void jugglingArrayRotation(int array2[], int n, int d) {
        int i, j, k, temp;
        for (i = 0; i < gcd(d, n); i++) {
            /* move i-th values of blocks */
            temp = array2[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n) {
                    k = k - n;
                }
                if (k == i) {
                    break;
                }
                array2[j] = array2[k];
                j = k;
            }
            array2[j] = temp;
        }
        System.out.println("Array after Juggling Rotation by " + d + " elements");
        print(array2);
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void print(int array3[]) {

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

    }
}
