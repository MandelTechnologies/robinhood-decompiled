package com.robinhood.android.options.lib.simulatedreturn.chart;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnChartEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent;", "", "ScrubberHapticFeedback", "GenericErrorEvent", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent$GenericErrorEvent;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent$ScrubberHapticFeedback;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface OptionsSimulatedReturnChartEvent {

    /* compiled from: OptionsSimulatedReturnChartEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent$ScrubberHapticFeedback;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrubberHapticFeedback implements OptionsSimulatedReturnChartEvent {
        public static final int $stable = 0;
        public static final ScrubberHapticFeedback INSTANCE = new ScrubberHapticFeedback();

        public boolean equals(Object other) {
            return this == other || (other instanceof ScrubberHapticFeedback);
        }

        public int hashCode() {
            return -1155862431;
        }

        public String toString() {
            return "ScrubberHapticFeedback";
        }

        private ScrubberHapticFeedback() {
        }
    }

    /* compiled from: OptionsSimulatedReturnChartEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent$GenericErrorEvent;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GenericErrorEvent implements OptionsSimulatedReturnChartEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ GenericErrorEvent copy$default(GenericErrorEvent genericErrorEvent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = genericErrorEvent.error;
            }
            return genericErrorEvent.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final GenericErrorEvent copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new GenericErrorEvent(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GenericErrorEvent) && Intrinsics.areEqual(this.error, ((GenericErrorEvent) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "GenericErrorEvent(error=" + this.error + ")";
        }

        public GenericErrorEvent(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
