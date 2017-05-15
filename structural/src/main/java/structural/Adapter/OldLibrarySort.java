package structural.Adapter;

import java.util.List;

/**
 * Created by david on 15/05/2017.
 */
//Adaptee
public class OldLibrarySort {

    private List<Integer> list;

    public OldLibrarySort(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    public List<Integer> sort(List<Integer> list) {
        // Sort algorithm here
        return list;
    }
}
