import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class Customer {
    private final List<Child> children;
    private final Wallet wallet;
}
