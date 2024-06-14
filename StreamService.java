import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortStreams(List<StreamGroup> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}