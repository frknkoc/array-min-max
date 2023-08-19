import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {13, 65, -12, 43, 486, -102, -11, 29, 10, -77, 218};

        Arrays.sort(list);
        int min = list[0], max = 0;
        for (int i = 0; i < list.length; i++){
            max = list[i];
        }

        System.out.println("Dizinin en küçük değeri : " + min + " en büyük değeri ise : " + max);
    }
}