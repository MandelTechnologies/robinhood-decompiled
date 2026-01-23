package com.robinhood.android.redesigninvesting.redesignsettings;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: RedesignSettings.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings;", "", "highlightSettings", "Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings$HighlightSettings;", "<init>", "(Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings$HighlightSettings;)V", "getHighlightSettings", "()Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings$HighlightSettings;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HighlightSettings", "lib-redesign-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RedesignSettings {
    private final HighlightSettings highlightSettings;

    public static /* synthetic */ RedesignSettings copy$default(RedesignSettings redesignSettings, HighlightSettings highlightSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            highlightSettings = redesignSettings.highlightSettings;
        }
        return redesignSettings.copy(highlightSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final HighlightSettings getHighlightSettings() {
        return this.highlightSettings;
    }

    public final RedesignSettings copy(HighlightSettings highlightSettings) {
        Intrinsics.checkNotNullParameter(highlightSettings, "highlightSettings");
        return new RedesignSettings(highlightSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RedesignSettings) && Intrinsics.areEqual(this.highlightSettings, ((RedesignSettings) other).highlightSettings);
    }

    public int hashCode() {
        return this.highlightSettings.hashCode();
    }

    public String toString() {
        return "RedesignSettings(highlightSettings=" + this.highlightSettings + ")";
    }

    public RedesignSettings(HighlightSettings highlightSettings) {
        Intrinsics.checkNotNullParameter(highlightSettings, "highlightSettings");
        this.highlightSettings = highlightSettings;
    }

    public final HighlightSettings getHighlightSettings() {
        return this.highlightSettings;
    }

    /* compiled from: RedesignSettings.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings$HighlightSettings;", "", "priceMovementThreshold", "Ljava/math/BigDecimal;", "riskScoreThreshold", "", "maxTopMoversHighlightsDisplayed", "minHighlightsRequiredForDisplay", "maxHighlightsDisplayed", "minEquityHoldingsForDisplay", "priceAlertsFirstSeenThresholdSeconds", "", "priceAlertStaleDurationThresholdSeconds", "<init>", "(Ljava/math/BigDecimal;IIIIIJJ)V", "getPriceMovementThreshold", "()Ljava/math/BigDecimal;", "getRiskScoreThreshold", "()I", "getMaxTopMoversHighlightsDisplayed", "getMinHighlightsRequiredForDisplay", "getMaxHighlightsDisplayed", "getMinEquityHoldingsForDisplay", "getPriceAlertsFirstSeenThresholdSeconds", "()J", "getPriceAlertStaleDurationThresholdSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-redesign-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HighlightSettings {
        private final int maxHighlightsDisplayed;
        private final int maxTopMoversHighlightsDisplayed;
        private final int minEquityHoldingsForDisplay;
        private final int minHighlightsRequiredForDisplay;
        private final long priceAlertStaleDurationThresholdSeconds;
        private final long priceAlertsFirstSeenThresholdSeconds;
        private final BigDecimal priceMovementThreshold;
        private final int riskScoreThreshold;

        public static /* synthetic */ HighlightSettings copy$default(HighlightSettings highlightSettings, BigDecimal bigDecimal, int i, int i2, int i3, int i4, int i5, long j, long j2, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                bigDecimal = highlightSettings.priceMovementThreshold;
            }
            if ((i6 & 2) != 0) {
                i = highlightSettings.riskScoreThreshold;
            }
            if ((i6 & 4) != 0) {
                i2 = highlightSettings.maxTopMoversHighlightsDisplayed;
            }
            if ((i6 & 8) != 0) {
                i3 = highlightSettings.minHighlightsRequiredForDisplay;
            }
            if ((i6 & 16) != 0) {
                i4 = highlightSettings.maxHighlightsDisplayed;
            }
            if ((i6 & 32) != 0) {
                i5 = highlightSettings.minEquityHoldingsForDisplay;
            }
            if ((i6 & 64) != 0) {
                j = highlightSettings.priceAlertsFirstSeenThresholdSeconds;
            }
            if ((i6 & 128) != 0) {
                j2 = highlightSettings.priceAlertStaleDurationThresholdSeconds;
            }
            long j3 = j2;
            long j4 = j;
            int i7 = i4;
            int i8 = i5;
            return highlightSettings.copy(bigDecimal, i, i2, i3, i7, i8, j4, j3);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getPriceMovementThreshold() {
            return this.priceMovementThreshold;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRiskScoreThreshold() {
            return this.riskScoreThreshold;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxTopMoversHighlightsDisplayed() {
            return this.maxTopMoversHighlightsDisplayed;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMinHighlightsRequiredForDisplay() {
            return this.minHighlightsRequiredForDisplay;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMaxHighlightsDisplayed() {
            return this.maxHighlightsDisplayed;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMinEquityHoldingsForDisplay() {
            return this.minEquityHoldingsForDisplay;
        }

        /* renamed from: component7, reason: from getter */
        public final long getPriceAlertsFirstSeenThresholdSeconds() {
            return this.priceAlertsFirstSeenThresholdSeconds;
        }

        /* renamed from: component8, reason: from getter */
        public final long getPriceAlertStaleDurationThresholdSeconds() {
            return this.priceAlertStaleDurationThresholdSeconds;
        }

        public final HighlightSettings copy(BigDecimal priceMovementThreshold, int riskScoreThreshold, int maxTopMoversHighlightsDisplayed, int minHighlightsRequiredForDisplay, int maxHighlightsDisplayed, int minEquityHoldingsForDisplay, long priceAlertsFirstSeenThresholdSeconds, long priceAlertStaleDurationThresholdSeconds) {
            Intrinsics.checkNotNullParameter(priceMovementThreshold, "priceMovementThreshold");
            return new HighlightSettings(priceMovementThreshold, riskScoreThreshold, maxTopMoversHighlightsDisplayed, minHighlightsRequiredForDisplay, maxHighlightsDisplayed, minEquityHoldingsForDisplay, priceAlertsFirstSeenThresholdSeconds, priceAlertStaleDurationThresholdSeconds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HighlightSettings)) {
                return false;
            }
            HighlightSettings highlightSettings = (HighlightSettings) other;
            return Intrinsics.areEqual(this.priceMovementThreshold, highlightSettings.priceMovementThreshold) && this.riskScoreThreshold == highlightSettings.riskScoreThreshold && this.maxTopMoversHighlightsDisplayed == highlightSettings.maxTopMoversHighlightsDisplayed && this.minHighlightsRequiredForDisplay == highlightSettings.minHighlightsRequiredForDisplay && this.maxHighlightsDisplayed == highlightSettings.maxHighlightsDisplayed && this.minEquityHoldingsForDisplay == highlightSettings.minEquityHoldingsForDisplay && this.priceAlertsFirstSeenThresholdSeconds == highlightSettings.priceAlertsFirstSeenThresholdSeconds && this.priceAlertStaleDurationThresholdSeconds == highlightSettings.priceAlertStaleDurationThresholdSeconds;
        }

        public int hashCode() {
            return (((((((((((((this.priceMovementThreshold.hashCode() * 31) + Integer.hashCode(this.riskScoreThreshold)) * 31) + Integer.hashCode(this.maxTopMoversHighlightsDisplayed)) * 31) + Integer.hashCode(this.minHighlightsRequiredForDisplay)) * 31) + Integer.hashCode(this.maxHighlightsDisplayed)) * 31) + Integer.hashCode(this.minEquityHoldingsForDisplay)) * 31) + Long.hashCode(this.priceAlertsFirstSeenThresholdSeconds)) * 31) + Long.hashCode(this.priceAlertStaleDurationThresholdSeconds);
        }

        public String toString() {
            return "HighlightSettings(priceMovementThreshold=" + this.priceMovementThreshold + ", riskScoreThreshold=" + this.riskScoreThreshold + ", maxTopMoversHighlightsDisplayed=" + this.maxTopMoversHighlightsDisplayed + ", minHighlightsRequiredForDisplay=" + this.minHighlightsRequiredForDisplay + ", maxHighlightsDisplayed=" + this.maxHighlightsDisplayed + ", minEquityHoldingsForDisplay=" + this.minEquityHoldingsForDisplay + ", priceAlertsFirstSeenThresholdSeconds=" + this.priceAlertsFirstSeenThresholdSeconds + ", priceAlertStaleDurationThresholdSeconds=" + this.priceAlertStaleDurationThresholdSeconds + ")";
        }

        public HighlightSettings(BigDecimal priceMovementThreshold, int i, int i2, int i3, int i4, int i5, long j, long j2) {
            Intrinsics.checkNotNullParameter(priceMovementThreshold, "priceMovementThreshold");
            this.priceMovementThreshold = priceMovementThreshold;
            this.riskScoreThreshold = i;
            this.maxTopMoversHighlightsDisplayed = i2;
            this.minHighlightsRequiredForDisplay = i3;
            this.maxHighlightsDisplayed = i4;
            this.minEquityHoldingsForDisplay = i5;
            this.priceAlertsFirstSeenThresholdSeconds = j;
            this.priceAlertStaleDurationThresholdSeconds = j2;
        }

        public final BigDecimal getPriceMovementThreshold() {
            return this.priceMovementThreshold;
        }

        public final int getRiskScoreThreshold() {
            return this.riskScoreThreshold;
        }

        public final int getMaxTopMoversHighlightsDisplayed() {
            return this.maxTopMoversHighlightsDisplayed;
        }

        public final int getMinHighlightsRequiredForDisplay() {
            return this.minHighlightsRequiredForDisplay;
        }

        public final int getMaxHighlightsDisplayed() {
            return this.maxHighlightsDisplayed;
        }

        public final int getMinEquityHoldingsForDisplay() {
            return this.minEquityHoldingsForDisplay;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ HighlightSettings(BigDecimal bigDecimal, int i, int i2, int i3, int i4, int i5, long j, long j2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            long jM28741getInWholeSecondsimpl;
            long jM28741getInWholeSecondsimpl2;
            if ((i6 & 64) != 0) {
                Duration.Companion companion = Duration.INSTANCE;
                jM28741getInWholeSecondsimpl = Duration.m28741getInWholeSecondsimpl(Duration3.toDuration(3, DurationUnitJvm.HOURS));
            } else {
                jM28741getInWholeSecondsimpl = j;
            }
            if ((i6 & 128) != 0) {
                Duration.Companion companion2 = Duration.INSTANCE;
                jM28741getInWholeSecondsimpl2 = Duration.m28741getInWholeSecondsimpl(Duration3.toDuration(7, DurationUnitJvm.DAYS));
            } else {
                jM28741getInWholeSecondsimpl2 = j2;
            }
            this(bigDecimal, i, i2, i3, i4, i5, jM28741getInWholeSecondsimpl, jM28741getInWholeSecondsimpl2);
        }

        public final long getPriceAlertsFirstSeenThresholdSeconds() {
            return this.priceAlertsFirstSeenThresholdSeconds;
        }

        public final long getPriceAlertStaleDurationThresholdSeconds() {
            return this.priceAlertStaleDurationThresholdSeconds;
        }
    }
}
