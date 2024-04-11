public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 10};
        int[] array2 = {6, 7, 8, 9, 10};
        int length = array1.length + array2.length;
        int[] concatenatedArray = new int[length];
    	//System.out.println(concatenatedArray.length);

        for (int i = 0; i < array1.length; i++) {
            concatenatedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            concatenatedArray[array1.length + i] = array2[i];
        }

        for (int num : concatenatedArray) {
            System.out.print(num + " 🍎 ");
        }
    }
}