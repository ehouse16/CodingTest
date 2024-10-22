import java.lang.reflect.Array;
import java.util.Arrays;

class  Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        for (int j = 0; j < arr.length; j++) {
            int value = arr[j];
            if (arr[j] >= 50 && arr[j] % 2 == 0) {
                arr[j] = value / 2;
            } else if (arr[j] < 50 && arr[j] % 2 == 1) {
                arr[j] = value * 2;
            }
        }
        answer = Arrays.copyOf(arr,arr.length);
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 100, 99, 98};

        Solution s = new Solution();
        int[] answer = s.solution(a);
        System.out.println(Arrays.toString(answer));
    }

}