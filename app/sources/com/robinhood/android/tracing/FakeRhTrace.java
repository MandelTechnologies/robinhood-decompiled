package com.robinhood.android.tracing;

import com.robinhood.android.tracing.RhTrace;
import kotlin.Metadata;

/* compiled from: FakeRhTrace.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, m3636d2 = {"initDelegate", "Lcom/robinhood/android/tracing/RhTrace;", "lib-tracing_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tracing.FakeRhTraceKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class FakeRhTrace {
    public static final RhTrace initDelegate() {
        return RhTrace.Noop.INSTANCE;
    }
}
