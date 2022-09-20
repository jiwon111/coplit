package stream;

import java.util.List;

public class Solution07 {
    public String[] filterName(List<String> names) {
        return names.stream()
                .distinct()
                .filter(n -> n.startsWith("김"))
                .sorted()
                .toArray(String[]::new);
    }
}
