package com.robinhood.android.options.history.detail.event;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionEventDetailEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailEvent;", "", "CancelExerciseErrorEvent", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailEvent$CancelExerciseErrorEvent;", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface OptionEventDetailEvent {

    /* compiled from: OptionEventDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailEvent$CancelExerciseErrorEvent;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CancelExerciseErrorEvent implements OptionEventDetailEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ CancelExerciseErrorEvent copy$default(CancelExerciseErrorEvent cancelExerciseErrorEvent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = cancelExerciseErrorEvent.throwable;
            }
            return cancelExerciseErrorEvent.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final CancelExerciseErrorEvent copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new CancelExerciseErrorEvent(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CancelExerciseErrorEvent) && Intrinsics.areEqual(this.throwable, ((CancelExerciseErrorEvent) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "CancelExerciseErrorEvent(throwable=" + this.throwable + ")";
        }

        public CancelExerciseErrorEvent(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
