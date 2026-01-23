package com.robinhood.android.margin.p174ui.limit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitInputComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitInputData;", "", "tickerText", "", "conversionText", "animateInput", "", "showFxTooltip", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getTickerText", "()Ljava/lang/String;", "getConversionText", "getAnimateInput", "()Z", "getShowFxTooltip", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginLimitInputData {
    public static final int $stable = 0;
    private final boolean animateInput;
    private final String conversionText;
    private final boolean showFxTooltip;
    private final String tickerText;

    public static /* synthetic */ MarginLimitInputData copy$default(MarginLimitInputData marginLimitInputData, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginLimitInputData.tickerText;
        }
        if ((i & 2) != 0) {
            str2 = marginLimitInputData.conversionText;
        }
        if ((i & 4) != 0) {
            z = marginLimitInputData.animateInput;
        }
        if ((i & 8) != 0) {
            z2 = marginLimitInputData.showFxTooltip;
        }
        return marginLimitInputData.copy(str, str2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTickerText() {
        return this.tickerText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getConversionText() {
        return this.conversionText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowFxTooltip() {
        return this.showFxTooltip;
    }

    public final MarginLimitInputData copy(String tickerText, String conversionText, boolean animateInput, boolean showFxTooltip) {
        Intrinsics.checkNotNullParameter(tickerText, "tickerText");
        Intrinsics.checkNotNullParameter(conversionText, "conversionText");
        return new MarginLimitInputData(tickerText, conversionText, animateInput, showFxTooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginLimitInputData)) {
            return false;
        }
        MarginLimitInputData marginLimitInputData = (MarginLimitInputData) other;
        return Intrinsics.areEqual(this.tickerText, marginLimitInputData.tickerText) && Intrinsics.areEqual(this.conversionText, marginLimitInputData.conversionText) && this.animateInput == marginLimitInputData.animateInput && this.showFxTooltip == marginLimitInputData.showFxTooltip;
    }

    public int hashCode() {
        return (((((this.tickerText.hashCode() * 31) + this.conversionText.hashCode()) * 31) + Boolean.hashCode(this.animateInput)) * 31) + Boolean.hashCode(this.showFxTooltip);
    }

    public String toString() {
        return "MarginLimitInputData(tickerText=" + this.tickerText + ", conversionText=" + this.conversionText + ", animateInput=" + this.animateInput + ", showFxTooltip=" + this.showFxTooltip + ")";
    }

    public MarginLimitInputData(String tickerText, String conversionText, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tickerText, "tickerText");
        Intrinsics.checkNotNullParameter(conversionText, "conversionText");
        this.tickerText = tickerText;
        this.conversionText = conversionText;
        this.animateInput = z;
        this.showFxTooltip = z2;
    }

    public final String getTickerText() {
        return this.tickerText;
    }

    public final String getConversionText() {
        return this.conversionText;
    }

    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    public final boolean getShowFxTooltip() {
        return this.showFxTooltip;
    }
}
