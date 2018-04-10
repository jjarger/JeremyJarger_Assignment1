import java.util.Arrays;

public class Unique {

    public static boolean IsUnique(final int[] arr) {

        int[] clone = arr.clone();

        Arrays.sort(clone);

        for (int i = 0; i < clone.length - 1; i++) {

            if (clone[i] == clone[i + 1]) {

                return false;
            }
        }

        return true;
    }

}
