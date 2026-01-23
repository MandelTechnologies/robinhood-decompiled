package com.robinhood.android.common.options.extensions;

import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.ZonedDateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.ZonedDateTime;

/* compiled from: Instants.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"j$/time/Instant", "", "toEasternTimeString", "(Lj$/time/Instant;)Ljava/lang/String;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.extensions.InstantsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Instants2 {
    public static final String toEasternTimeString(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(instant, ZoneIds.INSTANCE.getNEW_YORK());
        ZonedDateTimeFormatter zonedDateTimeFormatter = ZonedDateTimeFormatter.TIME_WITH_ZONE_NO_LEADING_ZERO;
        Intrinsics.checkNotNull(zonedDateTimeOfInstant);
        return zonedDateTimeFormatter.format(zonedDateTimeOfInstant);
    }
}
