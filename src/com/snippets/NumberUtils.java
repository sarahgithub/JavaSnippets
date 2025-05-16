package com.snippets;

import java.text.DecimalFormat;

public class NumberUtils {

    // Formats a number with commas
    public static String formatNumberWithCommas(double number) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(number);
    }
}
