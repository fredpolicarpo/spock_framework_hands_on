import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ChildrenRuleAcceptance {
    private final int maxAgeInMonths;
    private final int minAgeInMonths;

    public boolean accept(final List<Child> children) {
        return children.stream()
                .map(this::accept)
                .reduce(true, (temp, current) -> temp && current);
    }

    private boolean accept(final Child child) {
        return child.getAgeInMonths() >= this.minAgeInMonths && child.getAgeInMonths() <= this.maxAgeInMonths;
    }
}
