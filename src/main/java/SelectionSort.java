import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    private List<Integer> dataSource;

    public SelectionSort(List<Integer> data) {
        this.dataSource = new ArrayList<>(data);
    }

    public List<Integer> sort(){
        for (int currentIndex = 0 ; currentIndex < dataSource.size() -1 ; currentIndex++){
            int smallestElementIndex = getIndexOfSmallestElement(currentIndex);
            swap( currentIndex , smallestElementIndex );
        }
        return dataSource;
    }

    private int getIndexOfSmallestElement(int from) {
        int minValue = dataSource.get(from);
        int minValueIndex = from;
        for (int i = from ; i < dataSource.size(); i++){
            if (dataSource.get(i) < minValue){
                minValue = dataSource.get(i);
                minValueIndex = i;
            }
        }
        return minValueIndex;
    }

    public void swap(int from , int to ){
        int tmp = dataSource.get(from);
        dataSource.set(from , dataSource.get(to));
        dataSource.set(to,tmp );
    }
}
