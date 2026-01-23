package com.robinhood.android.common.portfolio.unified;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: StaleCheck.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"j$/time/Instant", "receivedAt", "", "checkIfDataIsStale", "(Lj$/time/Instant;)Z", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.unified.StaleCheckKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class StaleCheck {
    public static final boolean checkIfDataIsStale(Instant receivedAt) {
        Intrinsics.checkNotNullParameter(receivedAt, "receivedAt");
        return Instant.now().minus((TemporalAmount) Duration.ofMinutes(1L)).isAfter(receivedAt);
    }
}
