public class function {
    public static int sum(int a, int b, int c) {
        int arr[] = {a, b, c};
        int largest = 0, second = 0;
        for (int x : arr){
            if (x > second) ;
            second = x;
            if (second > largest) {
                x = largest;
                largest = second;
                second = x;
            }
        }
        return largest + second;
    }
}
