public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(array, 7, 0, (array.length - 1)));
    }

    public static int binarySearch(int[] array, int key, int low, int high) {
        int middle = low + (high - low) / 2;
        if (low > high) {
            return -1;
        } else if (key < array[middle]) {
            high = middle - 1;
        } else if (key > array[middle]) {
            low = middle + 1;
        } else if (key == array[middle]) {
            return middle;
        }
        return binarySearch(array, key, low, high);
    }
}
