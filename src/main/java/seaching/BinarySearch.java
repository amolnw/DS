package seaching;

public class BinarySearch {

    private int search(int array[], int start, int end, int element) {
        if ( start <= end ) {
            int mid = ( start + end )/2;
            if ( array[mid] == element ){
                return mid;
            }
            else if ( array[mid] < element ) {
                return search(array, mid+1, end, element);
            }
            else {
                return search(array, 0, mid, element);
            }

        }
        else {
            return -1;
        }
    }

    public int search(int array[], int element) {
        return search(array, 0, array.length - 1, element);
    }
}
