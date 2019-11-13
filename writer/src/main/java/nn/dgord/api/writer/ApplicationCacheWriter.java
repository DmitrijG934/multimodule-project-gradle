package nn.dgord.api.writer;

import nn.dgord.api.common.cache.ApiCache;
import nn.dgord.api.common.domain.Foo;
import nn.dgord.api.writer.utils.JsonUtils;

import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationCacheWriter {
    public static void main(String[] args) {
        Map<String, String> cache = ApiCache.getInstance();
        System.out.println("Previous size of cache: " + cache.size());
        Foo foo = new Foo("Hello, world!");
        AbstractMap.SimpleEntry<String, String> entry = new ConcurrentHashMap.SimpleEntry<>(foo.getId().toString(), JsonUtils.toJsonString(foo));
        AbstractMap.SimpleEntry<String, String> entry2 = new ConcurrentHashMap.SimpleEntry<>(foo.getId().toString(), JsonUtils.toJsonString(foo));
        AbstractMap.SimpleEntry<String, String> entry3 = new ConcurrentHashMap.SimpleEntry<>(foo.getId().toString(), JsonUtils.toJsonString(foo));
        AbstractMap.SimpleEntry<String, String> entry4 = new ConcurrentHashMap.SimpleEntry<>(foo.getId().toString(), JsonUtils.toJsonString(foo));

        CacheWriter.writerInCache(cache, entry);
        CacheWriter.writerInCache(cache, entry2);
        CacheWriter.writerInCache(cache, entry3);
        CacheWriter.writerInCache(cache, entry4);
    }
}
