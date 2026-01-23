package com.robinhood.utils.datetime;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: LocalDates.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/datetime/LocalDates;", "", "<init>", "()V", "j$/time/Clock", Card.Icon.CLOCK, "j$/time/LocalDate", "currentDateInEst", "(Lj$/time/Clock;)Lj$/time/LocalDate;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class LocalDates {
    public static final LocalDates INSTANCE = new LocalDates();

    private LocalDates() {
    }

    public static /* synthetic */ LocalDate currentDateInEst$default(Clock clock, int i, Object obj) {
        if ((i & 1) != 0) {
            clock = Clock.systemDefaultZone();
        }
        return currentDateInEst(clock);
    }

    @JvmStatic
    public static final LocalDate currentDateInEst(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        return ZoneIds2.currentDate(ZoneIds.INSTANCE.getNEW_YORK(), clock);
    }
}
