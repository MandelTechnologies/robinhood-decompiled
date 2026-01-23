package io.bitdrift.capture.common;

import android.os.SystemClock;
import kotlin.Metadata;

/* compiled from: DefaultClock.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0006\u0010\u0005\u001a\u00020\u0000¨\u0006\u0006"}, m3636d2 = {"Lio/bitdrift/capture/common/DefaultClock;", "Lio/bitdrift/capture/common/IClock;", "()V", "elapsedRealtime", "", "getInstance", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DefaultClock implements IClock {
    public static final DefaultClock INSTANCE = new DefaultClock();

    public final DefaultClock getInstance() {
        return this;
    }

    private DefaultClock() {
    }

    @Override // io.bitdrift.capture.common.IClock
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
