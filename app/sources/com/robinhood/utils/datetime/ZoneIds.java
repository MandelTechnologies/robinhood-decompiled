package com.robinhood.utils.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.ZoneId;

/* compiled from: ZoneIds.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/datetime/ZoneIds;", "", "<init>", "()V", "j$/time/ZoneId", "NEW_YORK", "Lj$/time/ZoneId;", "getNEW_YORK", "()Lj$/time/ZoneId;", "UTC", "getUTC", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ZoneIds {
    public static final ZoneIds INSTANCE = new ZoneIds();
    private static final ZoneId NEW_YORK;
    private static final ZoneId UTC;

    private ZoneIds() {
    }

    static {
        ZoneId zoneIdM3448of = ZoneId.m3448of("America/New_York");
        Intrinsics.checkNotNullExpressionValue(zoneIdM3448of, "of(...)");
        NEW_YORK = zoneIdM3448of;
        ZoneId zoneIdM3448of2 = ZoneId.m3448of("UTC");
        Intrinsics.checkNotNullExpressionValue(zoneIdM3448of2, "of(...)");
        UTC = zoneIdM3448of2;
    }

    public final ZoneId getNEW_YORK() {
        return NEW_YORK;
    }

    public final ZoneId getUTC() {
        return UTC;
    }
}
