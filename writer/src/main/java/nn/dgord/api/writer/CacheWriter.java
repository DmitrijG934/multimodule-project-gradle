package nn.dgord.api.writer;

import java.util.Map;

public class CacheWriter {
    public static <T extends String> void writerInCache(Map<String, T> cache, Map.Entry<String, T> entry) {
        cache.put(entry.getKey(), entry.getValue());
    }
}
