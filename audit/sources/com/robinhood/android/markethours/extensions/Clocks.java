package com.robinhood.android.markethours.extensions;

import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: Clocks.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"j$/time/Clock", "j$/time/LocalDate", "getCurrentDateInEasternTime", "(Lj$/time/Clock;)Lj$/time/LocalDate;", "lib-market-hours_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.markethours.extensions.ClocksKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class Clocks {
    public static final LocalDate getCurrentDateInEasternTime(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<this>");
        Instant instantNow = Instant.now(clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        return Instants.toLocalDate(instantNow, ZoneIds.INSTANCE.getNEW_YORK());
    }
}
