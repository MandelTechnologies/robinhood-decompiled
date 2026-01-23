package com.robinhood.utils.datetime;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;

/* compiled from: ZoneIds.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\b\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"j$/time/ZoneId", "j$/time/Clock", Card.Icon.CLOCK, "j$/time/LocalDate", "currentDate", "(Lj$/time/ZoneId;Lj$/time/Clock;)Lj$/time/LocalDate;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.datetime.ZoneIdsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ZoneIds2 {
    public static final LocalDate currentDate(ZoneId zoneId, Clock clock) {
        Intrinsics.checkNotNullParameter(zoneId, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Instant instantNow = Instant.now(clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        LocalDate localDateMo3459a = Instants.toZonedDateTime(instantNow, zoneId).mo3459a();
        Intrinsics.checkNotNullExpressionValue(localDateMo3459a, "toLocalDate(...)");
        return localDateMo3459a;
    }
}
