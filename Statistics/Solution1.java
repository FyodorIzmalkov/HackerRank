import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        String elements = br.readLine();
        String weights = br.readLine();

        int elementsArr[] = getIntArr(elements.split(" "));
        int weightsArr[] = getIntArr(weights.split(" "));

        int summOfWeights = 0;
        int numenator = 0;
        for (int i = 0; i < elementsArr.length; i++) {
            numenator += elementsArr[i] * weightsArr[i];
            summOfWeights += weightsArr[i];
        }

        System.out.format("%.1f", (float) numenator / summOfWeights);
    }

    private static int [] getIntArr(String[] strArr){
        int arr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        return arr;
    }
}
