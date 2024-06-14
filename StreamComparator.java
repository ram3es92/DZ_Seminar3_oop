import java.util.Comparator;

public class StreamComparator implements Comparator<StreamGroup> {
    @Override
    public int compare(StreamGroup sg1, StreamGroup sg2) {
        return Integer.compare(sg1.getGroups().size(), sg2.getGroups().size());
    }
}