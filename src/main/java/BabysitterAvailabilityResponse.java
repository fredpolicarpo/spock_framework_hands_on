import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class BabysitterAvailabilityResponse {
    private final Babysitter babysitter;
    private final int timeAvailabilityForService;
    private final LocalDateTime canStartAt;
}
