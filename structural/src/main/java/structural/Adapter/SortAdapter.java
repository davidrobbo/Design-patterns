package structural.Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 15/05/2017.
 */
//Adapter
public class SortAdapter implements Sorter {

    private OldLibrarySort oldSorter;

    public SortAdapter(int[] list) {
        this.oldSorter = new OldLibrarySort(convertArrToList(list));
    }

    private List<Integer> convertArrToList(int[] list) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        for(int i:list) {
            returnList.add(i);
        }

        return returnList;
    }

    public int[] sort() {
        int listSize = oldSorter.getList().size();
        int[] arr = new int[listSize];
        for(int i = 0; i < listSize; i++) {
            arr[i] = oldSorter.getList().get(i);
        }

        return arr;
    }
}
