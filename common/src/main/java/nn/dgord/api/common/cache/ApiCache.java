package nn.dgord.api.common.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApiCache {
    private static Map<String, String> INSTANCE = null;
    public static Map<String, String> getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConcurrentHashMap<>();
        }
        return INSTANCE;
    }
}
