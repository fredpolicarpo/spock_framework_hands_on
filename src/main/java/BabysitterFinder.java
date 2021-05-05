import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BabysitterFinder {
    private final List<Babysitter> babysitterList = new ArrayList<>();

    public void register(final Babysitter babysitter) {
        this.babysitterList.add(babysitter);
    }

    List<Babysitter> findAll(final BabysitterRequest request) {
        return babysitterList.stream()
                .filter(babysitter -> babysitter.accept(request))
                .collect(Collectors.toList());
    }
}
