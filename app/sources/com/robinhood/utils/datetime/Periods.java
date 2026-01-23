package com.robinhood.utils.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Period;

/* compiled from: Periods.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"j$/time/Period", "", "isPositive", "(Lj$/time/Period;)Z", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.datetime.PeriodsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Periods {
    public static final boolean isPositive(Period period) {
        Intrinsics.checkNotNullParameter(period, "<this>");
        return (period.isZero() || period.isNegative()) ? false : true;
    }
}
