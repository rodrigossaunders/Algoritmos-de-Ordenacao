public class Main {

    public static void main(String[] args) {
        int array[] = {5,4,3,12,2,1,15,14};
        System.out.print("Original: ");
        Utilidades.printarArray(array);
        System.out.print("Ordenado: ");
        Utilidades.printarArray(Algoritmos.bubbleSort(array));
    }





}
