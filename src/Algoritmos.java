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

    public static int[] selectionSort(int arr[]) {
        int tamanho = arr.length;
        int temp;
        for(int i = 0; i < tamanho - 1; i++) {
            int iMenor = i;
            for(int j = i + 1; j < tamanho; j++) {
                if(arr[j] < arr[iMenor]) {
                    iMenor = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[iMenor];
            arr[iMenor] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int arr[]) {
        int tamanho = arr.length;
        for(int i = 1; i < tamanho; i++) {
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp) {
                arr[i] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

}
