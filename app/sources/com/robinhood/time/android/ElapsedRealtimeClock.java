package com.robinhood.time.android;

import android.os.SystemClock;
import com.robinhood.time.SimpleClock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.ZoneOffset;

/* compiled from: ElapsedRealtimeClock.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/time/android/ElapsedRealtimeClock;", "Lcom/robinhood/time/SimpleClock;", "<init>", "()V", "REFERENCE_TIMESTAMP", "", "millis", "lib-time-android_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ElapsedRealtimeClock extends SimpleClock {
    public static final ElapsedRealtimeClock INSTANCE = new ElapsedRealtimeClock();
    private static final long REFERENCE_TIMESTAMP = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    /* JADX WARN: Illegal instructions before constructor call */
    private ElapsedRealtimeClock() {
        ZoneOffset UTC = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
        super(UTC);
    }

    @Override // com.robinhood.time.SimpleClock, p479j$.time.Clock
    public long millis() {
        return REFERENCE_TIMESTAMP + SystemClock.elapsedRealtime();
    }
}
