package com.robinhood.utils.datetime;

import android.annotation.SuppressLint;
import com.robinhood.android.gold.contracts.GoldFeature;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.extra.PeriodDuration;
import p479j$.time.Instant;
import p479j$.time.ZoneOffset;
import p479j$.time.ZonedDateTime;

/* compiled from: PeriodDurations.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/datetime/PeriodDurations;", "", "<init>", "()V", "j$/time/Instant", GoldFeature.INSTANT, "Lorg/threeten/extra/PeriodDuration;", "since", "(Lj$/time/Instant;)Lorg/threeten/extra/PeriodDuration;", "j$/time/ZonedDateTime", "zonedDateTime", "j$/time/ZoneOffset", "nowZoneOffset", "(Lj$/time/ZonedDateTime;Lj$/time/ZoneOffset;)Lorg/threeten/extra/PeriodDuration;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PeriodDurations {
    public static final PeriodDurations INSTANCE = new PeriodDurations();

    private PeriodDurations() {
    }

    @JvmStatic
    @SuppressLint({"UnsafeTemporalApi"})
    public static final PeriodDuration since(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "instant");
        ZonedDateTime zonedDateTimeAtZone = instant.atZone(ZoneOffset.UTC);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeAtZone, "atZone(...)");
        return since$default(zonedDateTimeAtZone, null, 2, null);
    }

    public static /* synthetic */ PeriodDuration since$default(ZonedDateTime zonedDateTime, ZoneOffset zoneOffset, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneOffset = zonedDateTime.getOffset();
        }
        return since(zonedDateTime, zoneOffset);
    }

    @JvmStatic
    @SuppressLint({"UnsafeTemporalApi"})
    public static final PeriodDuration since(ZonedDateTime zonedDateTime, ZoneOffset nowZoneOffset) {
        Intrinsics.checkNotNullParameter(zonedDateTime, "zonedDateTime");
        Intrinsics.checkNotNullParameter(nowZoneOffset, "nowZoneOffset");
        PeriodDuration periodDurationBetween = PeriodDuration.between(zonedDateTime, ZonedDateTime.now(nowZoneOffset));
        Intrinsics.checkNotNullExpressionValue(periodDurationBetween, "between(...)");
        return periodDurationBetween;
    }
}
