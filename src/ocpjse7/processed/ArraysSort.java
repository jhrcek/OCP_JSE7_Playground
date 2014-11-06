package ocpjse7.processed;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {

    public static void main(String[] args) {
        MyComparable[] arr = {
            new MyComparable("a"),
            new MyComparable("c"),
            new MyComparable("b"),
            new MyComparable("z")
        };

        Arrays.sort(arr, new MyComparableComparator()); // When sorting objects that are both Comparable AND Comparator is supplied, the COMPARATOR is used
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, null); //When null passed as a comparator, the order induced by Comparable<T>.compareTo(T) method is used
        System.out.println(Arrays.toString(arr));

        Some[] ar2 = {
            new Some(),
            new Some(),
            new Some(),
            new Some()
        };

        Arrays.sort(ar2, new SomeComparator());
        // Arrays.sort(ar2, null); // Will throw ClassCastException, because Some doesn't implement java.lang.Comparable
        System.out.println(Arrays.toString(ar2));

    }

}

class MyComparable implements Comparable<MyComparable> {

    final String name;

    public MyComparable(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(MyComparable other) { //Reverse alphabetical order
        return -name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

class MyComparableComparator implements Comparator<MyComparable> {

    @Override
    public int compare(MyComparable o1, MyComparable o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Some {

}

class SomeComparator implements Comparator<Some> {

    @Override
    public int compare(Some t, Some t1) {
        return 0;
    }
}
