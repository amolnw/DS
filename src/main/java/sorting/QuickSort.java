package sorting;

public class QuickSort {

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private int partition(int[] array, int low, int high){

        int pivot = array[high];
        int lowIndex = low -1;

        for( int j = low; j < high; j++) {

            if(array[j] <= pivot){
                lowIndex++;
                swap(array, lowIndex, j);
            }
        }

        swap(array, lowIndex+1, high);
        return lowIndex+1;
    }

    private void sort(int[] array, int low, int high) {
        if ( low < high ) {
            int part = partition(array, low, high);
            sort(array, low, part-1);
            sort(array, part+1, high);
        }
    }

    private void sortImprovement1(int[] array, int low, int high) {
        while ( low < high ) {
            int part = partition(array, low, high);
            sortImprovement1(array, low, part-1);
            low = part+1;
        }
    }

    private void sortImprovement2(int[] array, int low, int high) {
        while ( low < high ) {
            int part = partition(array, low, high);

            if ( part -low < high - low) {
                sortImprovement2(array, low, part-1);
                low = part+1;
            }
            else {
                sortImprovement2(array, part+1, high);
                high = part-1;
            }
        }
    }

    public void sort(int[] array, int improvement) {
        if (improvement == 0)
            sort(array, 0, array.length -1 );
        else if (improvement == 1)
            sortImprovement1(array, 0, array.length -1 );
        else if (improvement == 2)
            sortImprovement2(array, 0, array.length -1 );
    }
}
