package Task5;

public class Sort {

    public static <E> void swap(E[] a, int i, int j) {
        E temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    public static <E extends Comparable<E>> void selectionSort(E[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }

    public static <E> void print(E[] a) {
        for (E x : a) {
            System.out.println(x);
        }
        System.out.println();
    }
}
