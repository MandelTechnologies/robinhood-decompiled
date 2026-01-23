package com.robinhood.android.equitydetail.p123ui.chartIntervals;

import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpanInterval;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartIntervalsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsViewState;", "", "Loading", "Ready", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsViewState, reason: use source file name */
/* loaded from: classes3.dex */
public interface InstrumentChartIntervalsStateProvider3 {

    /* compiled from: InstrumentChartIntervalsStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsViewState$Loading;", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsViewState;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsViewState$Loading */
    public static final class Loading implements InstrumentChartIntervalsStateProvider3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: InstrumentChartIntervalsStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsViewState$Ready;", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsViewState;", "spanInterval", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpanInterval;", "<init>", "(Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpanInterval;)V", "getSpanInterval", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpanInterval;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsViewState$Ready, reason: from toString */
    public static final /* data */ class Ready implements InstrumentChartIntervalsStateProvider3 {
        public static final int $stable = 8;
        private final InstrumentChartSpanInterval spanInterval;

        public static /* synthetic */ Ready copy$default(Ready ready, InstrumentChartSpanInterval instrumentChartSpanInterval, int i, Object obj) {
            if ((i & 1) != 0) {
                instrumentChartSpanInterval = ready.spanInterval;
            }
            return ready.copy(instrumentChartSpanInterval);
        }

        /* renamed from: component1, reason: from getter */
        public final InstrumentChartSpanInterval getSpanInterval() {
            return this.spanInterval;
        }

        public final Ready copy(InstrumentChartSpanInterval spanInterval) {
            Intrinsics.checkNotNullParameter(spanInterval, "spanInterval");
            return new Ready(spanInterval);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ready) && Intrinsics.areEqual(this.spanInterval, ((Ready) other).spanInterval);
        }

        public int hashCode() {
            return this.spanInterval.hashCode();
        }

        public String toString() {
            return "Ready(spanInterval=" + this.spanInterval + ")";
        }

        public Ready(InstrumentChartSpanInterval spanInterval) {
            Intrinsics.checkNotNullParameter(spanInterval, "spanInterval");
            this.spanInterval = spanInterval;
        }

        public final InstrumentChartSpanInterval getSpanInterval() {
            return this.spanInterval;
        }
    }
}
