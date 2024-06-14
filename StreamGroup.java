import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamGroup implements Iterable<StudentGroup> {

    private final List<StudentGroup> groups = new ArrayList<>();

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}