package com.robinhood.android.creditcard.p091ui.creditapplication;

import com.robinhood.utils.datetime.Instants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.ZoneOffset;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: CreditApplicationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m3636d2 = {"toDate", "", "", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxoKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CreditApplicationDuxo5 {
    public static final String toDate(long j) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        ZoneOffset UTC = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
        String str = Instants.toLocalDate(instantOfEpochMilli, UTC).format(DateTimeFormatter.ofPattern("MMdduuuu"));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
