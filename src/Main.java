public class Main {

    public static void main(String[] args) {
        int array[] = {5,4,3,12,2,1,15,14};
        System.out.print("Original: ");
        Utilidades.printarArray(array);
        System.out.print("Ordenado: ");
        Utilidades.printarArray(bubbleSort(array));
    }

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
