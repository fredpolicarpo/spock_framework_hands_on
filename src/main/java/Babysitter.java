import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class Babysitter {
    private final String name;
    private final ChildrenRuleAcceptance childrenRuleAcceptance;
    private final int maxServiceTime;
    private final BigDecimal cost;

    @Setter
    private LocalDateTime availableAt;

    public boolean accept(final BabysitterRequest request) {
        return request.getDurationInHours() <= this.maxServiceTime
                && childrenRuleAcceptance.accept(request.getChildren());
    }
}
