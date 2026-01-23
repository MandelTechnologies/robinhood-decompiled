package com.nimbusds.jwt.util;

import java.util.Date;

/* loaded from: classes27.dex */
public class DateUtils {
    public static long toSecondsSinceEpoch(Date date) {
        return date.getTime() / 1000;
    }
}
