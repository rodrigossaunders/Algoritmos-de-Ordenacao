public class Algoritmos {
    public static int[] bubbleSort(int arr[]) {
        int tamanho = arr.length;
        for(int i = 0; i < tamanho - 1; i++) {
            for(int j = 0; j < tamanho - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
