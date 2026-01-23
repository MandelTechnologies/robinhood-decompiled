package p479j$.util;

import java.util.Date;
import p479j$.time.Instant;

/* loaded from: classes29.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        return Instant.ofEpochMilli(date.getTime());
    }
}
