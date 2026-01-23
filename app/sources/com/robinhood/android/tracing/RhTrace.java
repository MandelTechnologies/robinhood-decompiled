package com.robinhood.android.tracing;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.tracing.RhTrace4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhTrace.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/tracing/RhTrace;", "Lcom/robinhood/android/tracing/Tracer;", "app", "Lcom/robinhood/android/tracing/TagTrace;", "getApp", "()Lcom/robinhood/android/tracing/TagTrace;", "forTag", "traceTag", "", GoldFeature.INSTANT, "", "trackName", "", "methodName", "beginSpan", "Lcom/robinhood/android/tracing/SpanHandle;", "endSpan", "cookie", "", "Noop", "Companion", "lib-tracing_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface RhTrace extends RhTrace5 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long TRACE_TAG_APP = 4096;

    RhTrace3 beginSpan(long traceTag, String trackName, String methodName);

    void endSpan(long traceTag, String trackName, int cookie);

    RhTrace4 forTag(long traceTag);

    RhTrace4 getApp();

    void instant(long traceTag, String trackName, String methodName);

    /* compiled from: RhTrace.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\"\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/tracing/RhTrace$Noop;", "Lcom/robinhood/android/tracing/RhTrace;", "<init>", "()V", "isEnabled", "", "()Z", "app", "Lcom/robinhood/android/tracing/TagTrace;", "getApp", "()Lcom/robinhood/android/tracing/TagTrace;", "forTag", "traceTag", "", GoldFeature.INSTANT, "", "trackName", "", "methodName", "beginSpan", "Lcom/robinhood/android/tracing/SpanHandle;", "endSpan", "cookie", "", "lib-tracing_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Noop implements RhTrace {
        public static final Noop INSTANCE = new Noop();

        @Override // com.robinhood.android.tracing.RhTrace
        public RhTrace3 beginSpan(long traceTag, String trackName, String methodName) {
            Intrinsics.checkNotNullParameter(trackName, "trackName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            return null;
        }

        @Override // com.robinhood.android.tracing.RhTrace
        public void endSpan(long traceTag, String trackName, int cookie) {
            Intrinsics.checkNotNullParameter(trackName, "trackName");
        }

        @Override // com.robinhood.android.tracing.RhTrace
        public void instant(long traceTag, String trackName, String methodName) {
            Intrinsics.checkNotNullParameter(trackName, "trackName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
        }

        @Override // com.robinhood.android.tracing.RhTrace5
        public boolean isEnabled() {
            return false;
        }

        private Noop() {
        }

        @Override // com.robinhood.android.tracing.RhTrace
        public RhTrace4 getApp() {
            return RhTrace4.Noop.INSTANCE;
        }

        @Override // com.robinhood.android.tracing.RhTrace
        public RhTrace4 forTag(long traceTag) {
            return RhTrace4.Noop.INSTANCE;
        }
    }

    /* compiled from: RhTrace.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J!\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0005H\u0096\u0001J!\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/tracing/RhTrace$Companion;", "Lcom/robinhood/android/tracing/RhTrace;", "<init>", "()V", "TRACE_TAG_APP", "", "beginSpan", "Lcom/robinhood/android/tracing/SpanHandle;", "traceTag", "trackName", "", "methodName", "endSpan", "", "cookie", "", "forTag", "Lcom/robinhood/android/tracing/TagTrace;", GoldFeature.INSTANT, "app", "getApp", "()Lcom/robinhood/android/tracing/TagTrace;", "isEnabled", "", "()Z", "lib-tracing_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements RhTrace {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long TRACE_TAG_APP = 4096;
        private final /* synthetic */ RhTrace $$delegate_0 = FakeRhTrace.initDelegate();

        @Override // com.robinhood.android.tracing.RhTrace
        public RhTrace3 beginSpan(long traceTag, String trackName, String methodName) {
            Intrinsics.checkNotNullParameter(trackName, "trackName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            return this.$$delegate_0.beginSpan(traceTag, trackName, methodName);
        }

        @Override // com.robinhood.android.tracing.RhTrace
        public void endSpan(long traceTag, String trackName, int cookie) {
            Intrinsics.checkNotNullParameter(trackName, "trackName");
            this.$$delegate_0.endSpan(traceTag, trackName, cookie);
        }

        @Override // com.robinhood.android.tracing.RhTrace
        public RhTrace4 forTag(long traceTag) {
            return this.$$delegate_0.forTag(traceTag);
        }

        @Override // com.robinhood.android.tracing.RhTrace
        public RhTrace4 getApp() {
            return this.$$delegate_0.getApp();
        }

        @Override // com.robinhood.android.tracing.RhTrace
        public void instant(long traceTag, String trackName, String methodName) {
            Intrinsics.checkNotNullParameter(trackName, "trackName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            this.$$delegate_0.instant(traceTag, trackName, methodName);
        }

        @Override // com.robinhood.android.tracing.RhTrace5
        public boolean isEnabled() {
            return this.$$delegate_0.isEnabled();
        }

        private Companion() {
        }
    }
}
