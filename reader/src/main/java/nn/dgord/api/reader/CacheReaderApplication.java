package nn.dgord.api.reader;

import nn.dgord.api.common.cache.ApiCache;

import java.util.Map;

public class CacheReaderApplication {
    public static void main(String[] args) {
        Map<String, String> cache = ApiCache.getInstance();
        System.out.println("After population of cache size is: " + cache.size());
        cache.entrySet()
                .forEach(System.out::println);
    }
}
