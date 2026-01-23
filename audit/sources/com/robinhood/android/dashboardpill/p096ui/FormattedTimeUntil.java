package com.robinhood.android.dashboardpill.p096ui;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import p479j$.time.Duration;

/* compiled from: FormattedTimeUntil.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"j$/time/Duration", "", "formatted", "(Lj$/time/Duration;)Ljava/lang/String;", "TIME_LEFT_NONE", "Ljava/lang/String;", "TIME_LEFT_FORMAT", "lib-dashboard-pill_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboardpill.ui.FormattedTimeUntilKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class FormattedTimeUntil {
    private static final String TIME_LEFT_FORMAT = "%02d:%02d:%02d";
    public static final String TIME_LEFT_NONE = "00:00:00";

    public static final String formatted(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        if (duration.isZero() || duration.isNegative()) {
            return TIME_LEFT_NONE;
        }
        long hours = duration.toHours();
        long j = 60;
        long minutes = duration.toMinutes() % j;
        long seconds = duration.getSeconds() % j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(Locale.Category.FORMAT), TIME_LEFT_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
