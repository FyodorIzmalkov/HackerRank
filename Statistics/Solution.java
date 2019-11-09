import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        String arr[] = bufferedReader.readLine().split(" ");
        int len = arr.length;
        int intArr[] = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
            sum += intArr[i];
        }
        System.out.format("%.1f\n" , ((float)sum / len) );
        Arrays.sort(intArr);
        if (len % 2 == 1){
            System.out.println(intArr[len/2]);
        } else {
            int first = intArr[len / 2];
            int second = intArr[(len / 2) - 1];
            System.out.format("%.1f\n", (((float)first + second) / 2) );
        }

        int mostPopularCount = 0;
        int mostPopularNumber = 0;
        for (int i = 0; i < len; i++) {
            int curr = intArr[i];
            int population = 0;
            for (int j = 0; j < len; j++) {
                if (curr == intArr[j]){
                    population++;
                }
            }
            if (population > mostPopularCount){
                mostPopularCount = population;
                mostPopularNumber = curr;
            }
        }
        System.out.println(mostPopularNumber);

}
}