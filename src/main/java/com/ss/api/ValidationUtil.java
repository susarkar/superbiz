package com.ss.api;

import java.util.regex.Pattern;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.util.StringUtils;

public final class ValidationUtil {
    private ValidationUtil() {
        throw new NotImplementedException("Utility classes cannot be instantiated");
    }

    public static void assertNotBlank(String str, String message) {
        if (StringUtils.isEmpty(str)) {
            throw new IllegalArgumentException(message);
        }
    }
    public static void assertNotBlank(long l, String message) {
        if (StringUtils.isEmpty(l)) {
            throw new IllegalArgumentException(message);
        }
    }
    public static void assertMinimumLength(String str, int length, String message) {
        if (str.length() < length) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void assertMatches(String str, Pattern regex, String message) {
        if (!regex.matcher(str).matches()) {
            throw new IllegalArgumentException(message);
        }
    }
}
