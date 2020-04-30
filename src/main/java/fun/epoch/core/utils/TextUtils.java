package fun.epoch.core.utils;

/**
 * Description: 文本工具
 * <p>
 * Created by epoch
 */
public class TextUtils {
    public static boolean isNotBlank(String str) {
        return str != null && str.replaceAll("\\s", "").length() > 0;
    }

    public static boolean isBlank(String str) {
        return !isNotBlank(str);
    }
}
