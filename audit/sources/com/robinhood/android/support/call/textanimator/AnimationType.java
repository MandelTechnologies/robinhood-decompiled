package com.robinhood.android.support.call.textanimator;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TextAnimator.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/AnimationType;", "", "<init>", "()V", "durationMs", "", "getDurationMs", "()J", "PartialReplace", "FullReplace", "Lcom/robinhood/android/support/call/textanimator/AnimationType$FullReplace;", "Lcom/robinhood/android/support/call/textanimator/AnimationType$PartialReplace;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class AnimationType {
    public static final int $stable = 0;

    public /* synthetic */ AnimationType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getDurationMs();

    private AnimationType() {
    }

    /* compiled from: TextAnimator.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/AnimationType$PartialReplace;", "Lcom/robinhood/android/support/call/textanimator/AnimationType;", "durationMs", "", "<init>", "(J)V", "getDurationMs", "()J", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PartialReplace extends AnimationType {
        public static final int $stable = 0;
        private final long durationMs;

        public PartialReplace() {
            this(0L, 1, null);
        }

        public PartialReplace(long j) {
            super(null);
            this.durationMs = j;
        }

        public /* synthetic */ PartialReplace(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 1000L : j);
        }

        @Override // com.robinhood.android.support.call.textanimator.AnimationType
        public long getDurationMs() {
            return this.durationMs;
        }
    }

    /* compiled from: TextAnimator.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/AnimationType$FullReplace;", "Lcom/robinhood/android/support/call/textanimator/AnimationType;", "durationMs", "", "staggered", "", "<init>", "(JZ)V", "getDurationMs", "()J", "getStaggered", "()Z", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FullReplace extends AnimationType {
        public static final int $stable = 0;
        private final long durationMs;
        private final boolean staggered;

        public FullReplace(long j, boolean z) {
            super(null);
            this.durationMs = j;
            this.staggered = z;
        }

        public /* synthetic */ FullReplace(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 1500L : j, z);
        }

        @Override // com.robinhood.android.support.call.textanimator.AnimationType
        public long getDurationMs() {
            return this.durationMs;
        }

        public final boolean getStaggered() {
            return this.staggered;
        }
    }
}
