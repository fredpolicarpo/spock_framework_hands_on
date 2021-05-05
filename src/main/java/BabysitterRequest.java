import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class BabysitterRequest {
    private final List<Child> children;
    private final int durationInHours;
}
