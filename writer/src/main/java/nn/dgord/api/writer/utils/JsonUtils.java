package nn.dgord.api.writer.utils;

import com.google.gson.Gson;

public class JsonUtils {
    private static Gson INSTANCE = getInstance();

    private JsonUtils() {}
    private static Gson getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Gson();
        }
        return INSTANCE;
    }

    public static String toJsonString(Object object) {
        return INSTANCE.toJson(object);
    }
}
