package androidx.metrics.performance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JankStatsBaseImpl.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Landroidx/metrics/performance/JankStatsBaseImpl;", "", "Landroidx/metrics/performance/JankStats;", "jankStats", "<init>", "(Landroidx/metrics/performance/JankStats;)V", "", "enable", "", "setupFrameTimer", "(Z)V", "Landroidx/metrics/performance/JankStats;", "getJankStats", "()Landroidx/metrics/performance/JankStats;", "Companion", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public class JankStatsBaseImpl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static long frameDuration = -1;
    private final JankStats jankStats;

    public void setupFrameTimer(boolean enable) {
        throw null;
    }

    public JankStatsBaseImpl(JankStats jankStats) {
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        this.jankStats = jankStats;
    }

    /* compiled from: JankStatsBaseImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Landroidx/metrics/performance/JankStatsBaseImpl$Companion;", "", "()V", "NANOS_PER_MS", "", "frameDuration", "", "getFrameDuration", "()J", "setFrameDuration", "(J)V", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long getFrameDuration() {
            return JankStatsBaseImpl.frameDuration;
        }

        public final void setFrameDuration(long j) {
            JankStatsBaseImpl.frameDuration = j;
        }
    }
}
