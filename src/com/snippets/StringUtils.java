package com.snippets;

import java.text.Normalizer;

public class StringUtils {

    // Converts a string from camelCase to snake_case
    public static String camelToSnake(String str) {
        return str.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }

    // Converts a string to a URL-friendly slug
    public static String slugify(String str) {
        // Normalize to remove special characters and make it lowercase
        String normalized = Normalizer.normalize(str, Normalizer.Form.NFD);
        String cleanString = normalized.replaceAll("[^\\p{ASCII}]", "").toLowerCase();
        return cleanString.replaceAll("\\s+", "-").replaceAll("[^a-z0-9-]", "");
    }

    // Strips HTML tags from a string
    public static String stripHtmlTags(String html) {
        return html.replaceAll("<[^>]*>", "");
    }
}
