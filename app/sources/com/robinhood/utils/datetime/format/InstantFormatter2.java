package com.robinhood.utils.datetime.format;

import android.content.res.Resources;
import com.robinhood.utils.android.C41827R;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: InstantFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"j$/time/Instant", "Landroid/content/res/Resources;", "resources", "", "formatRecent", "(Lj$/time/Instant;Landroid/content/res/Resources;)Ljava/lang/String;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: com.robinhood.utils.datetime.format.InstantFormatting, reason: use source file name */
/* loaded from: classes12.dex */
public final class InstantFormatter2 {
    public static final String formatRecent(Instant instant, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        LocalDate localDateMo3459a = instant.atZone(ZoneId.systemDefault()).mo3459a();
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNull(localDateMo3459a);
        Intrinsics.checkNotNull(localDateNow);
        long jUntil = localDateMo3459a.until(localDateNow, ChronoUnit.DAYS);
        if (jUntil == 0) {
            String string2 = resources.getString(C41827R.string.recent_timestamp_today, InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) instant));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (jUntil != 1) {
            return (2 > jUntil || jUntil >= 7) ? InstantFormatter.MEDIUM_DATETIME_IN_SYSTEM_ZONE.format((InstantFormatter) instant) : InstantFormatter.WEEKDAY_DATETIME_IN_SYSTEM_ZONE.format((InstantFormatter) instant);
        }
        String string3 = resources.getString(C41827R.string.recent_timestamp_yesterday, InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format((InstantFormatter) instant));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }
}
