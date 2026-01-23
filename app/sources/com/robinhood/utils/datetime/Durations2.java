package com.robinhood.utils.datetime;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: Durations.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"j$/time/Duration", "", "toSecondsDouble", "(Lj$/time/Duration;)D", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.datetime.DurationsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Durations2 {
    public static final double toSecondsDouble(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        double dConvert = TimeUnit.NANOSECONDS.convert(1L, TimeUnit.SECONDS);
        return ((duration.getSeconds() * dConvert) + duration.getNano()) / dConvert;
    }
}
