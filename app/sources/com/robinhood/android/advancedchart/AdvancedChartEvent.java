package com.robinhood.android.advancedchart;

import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.Historical;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartEvent;", "", "ShowZoomNux", "LaunchAdvancedAlert", "LaunchRemoteDisclosure", "LaunchInstrumentIntervalsDialog", "ShowError", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AdvancedChartEvent {

    /* compiled from: AdvancedChartEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartEvent$ShowZoomNux;", "Lcom/robinhood/android/advancedchart/AdvancedChartEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowZoomNux implements AdvancedChartEvent {
        public static final int $stable = 0;
        public static final ShowZoomNux INSTANCE = new ShowZoomNux();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowZoomNux);
        }

        public int hashCode() {
            return 1050551223;
        }

        public String toString() {
            return "ShowZoomNux";
        }

        private ShowZoomNux() {
        }
    }

    /* compiled from: AdvancedChartEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartEvent$LaunchAdvancedAlert;", "Lcom/robinhood/android/advancedchart/AdvancedChartEvent;", "instrument", "Lcom/robinhood/models/db/Instrument;", "activeChartInterval", "Lcom/robinhood/models/ui/Historical$Interval;", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/ui/Historical$Interval;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getActiveChartInterval", "()Lcom/robinhood/models/ui/Historical$Interval;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchAdvancedAlert implements AdvancedChartEvent {
        public static final int $stable = 8;
        private final Historical.Interval activeChartInterval;
        private final Instrument instrument;

        public static /* synthetic */ LaunchAdvancedAlert copy$default(LaunchAdvancedAlert launchAdvancedAlert, Instrument instrument, Historical.Interval interval, int i, Object obj) {
            if ((i & 1) != 0) {
                instrument = launchAdvancedAlert.instrument;
            }
            if ((i & 2) != 0) {
                interval = launchAdvancedAlert.activeChartInterval;
            }
            return launchAdvancedAlert.copy(instrument, interval);
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final Historical.Interval getActiveChartInterval() {
            return this.activeChartInterval;
        }

        public final LaunchAdvancedAlert copy(Instrument instrument, Historical.Interval activeChartInterval) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            return new LaunchAdvancedAlert(instrument, activeChartInterval);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LaunchAdvancedAlert)) {
                return false;
            }
            LaunchAdvancedAlert launchAdvancedAlert = (LaunchAdvancedAlert) other;
            return Intrinsics.areEqual(this.instrument, launchAdvancedAlert.instrument) && this.activeChartInterval == launchAdvancedAlert.activeChartInterval;
        }

        public int hashCode() {
            int iHashCode = this.instrument.hashCode() * 31;
            Historical.Interval interval = this.activeChartInterval;
            return iHashCode + (interval == null ? 0 : interval.hashCode());
        }

        public String toString() {
            return "LaunchAdvancedAlert(instrument=" + this.instrument + ", activeChartInterval=" + this.activeChartInterval + ")";
        }

        public LaunchAdvancedAlert(Instrument instrument, Historical.Interval interval) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.instrument = instrument;
            this.activeChartInterval = interval;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final Historical.Interval getActiveChartInterval() {
            return this.activeChartInterval;
        }
    }

    /* compiled from: AdvancedChartEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartEvent$LaunchRemoteDisclosure;", "Lcom/robinhood/android/advancedchart/AdvancedChartEvent;", "disclosureId", "", "<init>", "(Ljava/lang/String;)V", "getDisclosureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchRemoteDisclosure implements AdvancedChartEvent {
        public static final int $stable = 0;
        private final String disclosureId;

        public static /* synthetic */ LaunchRemoteDisclosure copy$default(LaunchRemoteDisclosure launchRemoteDisclosure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = launchRemoteDisclosure.disclosureId;
            }
            return launchRemoteDisclosure.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisclosureId() {
            return this.disclosureId;
        }

        public final LaunchRemoteDisclosure copy(String disclosureId) {
            Intrinsics.checkNotNullParameter(disclosureId, "disclosureId");
            return new LaunchRemoteDisclosure(disclosureId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchRemoteDisclosure) && Intrinsics.areEqual(this.disclosureId, ((LaunchRemoteDisclosure) other).disclosureId);
        }

        public int hashCode() {
            return this.disclosureId.hashCode();
        }

        public String toString() {
            return "LaunchRemoteDisclosure(disclosureId=" + this.disclosureId + ")";
        }

        public LaunchRemoteDisclosure(String disclosureId) {
            Intrinsics.checkNotNullParameter(disclosureId, "disclosureId");
            this.disclosureId = disclosureId;
        }

        public final String getDisclosureId() {
            return this.disclosureId;
        }
    }

    /* compiled from: AdvancedChartEvent.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartEvent$LaunchInstrumentIntervalsDialog;", "Lcom/robinhood/android/advancedchart/AdvancedChartEvent;", "instrumentId", "", "spanId", "showCandlesticks", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getInstrumentId", "()Ljava/lang/String;", "getSpanId", "getShowCandlesticks", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchInstrumentIntervalsDialog implements AdvancedChartEvent {
        public static final int $stable = 0;
        private final String instrumentId;
        private final boolean showCandlesticks;
        private final String spanId;

        public static /* synthetic */ LaunchInstrumentIntervalsDialog copy$default(LaunchInstrumentIntervalsDialog launchInstrumentIntervalsDialog, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = launchInstrumentIntervalsDialog.instrumentId;
            }
            if ((i & 2) != 0) {
                str2 = launchInstrumentIntervalsDialog.spanId;
            }
            if ((i & 4) != 0) {
                z = launchInstrumentIntervalsDialog.showCandlesticks;
            }
            return launchInstrumentIntervalsDialog.copy(str, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSpanId() {
            return this.spanId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowCandlesticks() {
            return this.showCandlesticks;
        }

        public final LaunchInstrumentIntervalsDialog copy(String instrumentId, String spanId, boolean showCandlesticks) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(spanId, "spanId");
            return new LaunchInstrumentIntervalsDialog(instrumentId, spanId, showCandlesticks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LaunchInstrumentIntervalsDialog)) {
                return false;
            }
            LaunchInstrumentIntervalsDialog launchInstrumentIntervalsDialog = (LaunchInstrumentIntervalsDialog) other;
            return Intrinsics.areEqual(this.instrumentId, launchInstrumentIntervalsDialog.instrumentId) && Intrinsics.areEqual(this.spanId, launchInstrumentIntervalsDialog.spanId) && this.showCandlesticks == launchInstrumentIntervalsDialog.showCandlesticks;
        }

        public int hashCode() {
            return (((this.instrumentId.hashCode() * 31) + this.spanId.hashCode()) * 31) + Boolean.hashCode(this.showCandlesticks);
        }

        public String toString() {
            return "LaunchInstrumentIntervalsDialog(instrumentId=" + this.instrumentId + ", spanId=" + this.spanId + ", showCandlesticks=" + this.showCandlesticks + ")";
        }

        public LaunchInstrumentIntervalsDialog(String instrumentId, String spanId, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(spanId, "spanId");
            this.instrumentId = instrumentId;
            this.spanId = spanId;
            this.showCandlesticks = z;
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }

        public final String getSpanId() {
            return this.spanId;
        }

        public final boolean getShowCandlesticks() {
            return this.showCandlesticks;
        }
    }

    /* compiled from: AdvancedChartEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartEvent$ShowError;", "Lcom/robinhood/android/advancedchart/AdvancedChartEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowError implements AdvancedChartEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ ShowError copy$default(ShowError showError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = showError.throwable;
            }
            return showError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final ShowError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new ShowError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowError) && Intrinsics.areEqual(this.throwable, ((ShowError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "ShowError(throwable=" + this.throwable + ")";
        }

        public ShowError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
