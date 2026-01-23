package com.twilio.conversations.internal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes12.dex */
public final class DateUtils {
    private static final int COLON_INDEX = 22;
    private static final int TICK_MARK_COUNT = 2;
    private static final String ISO_8601_PATTERN_0 = "yyyy-MM-dd'T'HH:mmZ";
    private static final String ISO_8601_PATTERN_1 = "yyyy-MM-dd'T'HH:mm:ssZ";
    private static final String ISO_8601_PATTERN_2 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final String[] SUPPORTED_ISO_8601_PATTERNS = {ISO_8601_PATTERN_0, ISO_8601_PATTERN_1, ISO_8601_PATTERN_2};
    private static final int COLON_PREFIX_COUNT = 3;

    public static Date parseIso8601DateTime(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace("Z", "+00:00");
        for (String str2 : SUPPORTED_ISO_8601_PATTERNS) {
            int iLastIndexOf = (str2.lastIndexOf(90) - 2) + COLON_PREFIX_COUNT;
            String str3 = strReplace.length() > iLastIndexOf ? strReplace.substring(0, iLastIndexOf) + strReplace.substring(iLastIndexOf + 1) : strReplace;
            try {
                continue;
                return new SimpleDateFormat(str2, Locale.US).parse(str3);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public static String formatIso8601DateTime(Date date, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_8601_PATTERN_1, Locale.US);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        String str = simpleDateFormat.format(date);
        if (str == null || str.length() <= 22) {
            return str;
        }
        return str.substring(0, 22) + ":" + str.substring(22);
    }

    private DateUtils() {
    }
}
