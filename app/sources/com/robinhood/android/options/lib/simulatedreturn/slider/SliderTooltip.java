package com.robinhood.android.options.lib.simulatedreturn.slider;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnSliderViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;", "", "priceText", "", "priceAndPercentageText", "measurePriceAndPercentageText", "symbolText", "measureFullSymbolText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPriceText", "()Ljava/lang/String;", "getPriceAndPercentageText", "getMeasurePriceAndPercentageText", "getSymbolText", "getMeasureFullSymbolText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SliderTooltip {
    public static final int $stable = 0;
    private final String measureFullSymbolText;
    private final String measurePriceAndPercentageText;
    private final String priceAndPercentageText;
    private final String priceText;
    private final String symbolText;

    public static /* synthetic */ SliderTooltip copy$default(SliderTooltip sliderTooltip, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sliderTooltip.priceText;
        }
        if ((i & 2) != 0) {
            str2 = sliderTooltip.priceAndPercentageText;
        }
        if ((i & 4) != 0) {
            str3 = sliderTooltip.measurePriceAndPercentageText;
        }
        if ((i & 8) != 0) {
            str4 = sliderTooltip.symbolText;
        }
        if ((i & 16) != 0) {
            str5 = sliderTooltip.measureFullSymbolText;
        }
        String str6 = str5;
        String str7 = str3;
        return sliderTooltip.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPriceText() {
        return this.priceText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPriceAndPercentageText() {
        return this.priceAndPercentageText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMeasurePriceAndPercentageText() {
        return this.measurePriceAndPercentageText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSymbolText() {
        return this.symbolText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMeasureFullSymbolText() {
        return this.measureFullSymbolText;
    }

    public final SliderTooltip copy(String priceText, String priceAndPercentageText, String measurePriceAndPercentageText, String symbolText, String measureFullSymbolText) {
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(priceAndPercentageText, "priceAndPercentageText");
        Intrinsics.checkNotNullParameter(measurePriceAndPercentageText, "measurePriceAndPercentageText");
        Intrinsics.checkNotNullParameter(symbolText, "symbolText");
        Intrinsics.checkNotNullParameter(measureFullSymbolText, "measureFullSymbolText");
        return new SliderTooltip(priceText, priceAndPercentageText, measurePriceAndPercentageText, symbolText, measureFullSymbolText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderTooltip)) {
            return false;
        }
        SliderTooltip sliderTooltip = (SliderTooltip) other;
        return Intrinsics.areEqual(this.priceText, sliderTooltip.priceText) && Intrinsics.areEqual(this.priceAndPercentageText, sliderTooltip.priceAndPercentageText) && Intrinsics.areEqual(this.measurePriceAndPercentageText, sliderTooltip.measurePriceAndPercentageText) && Intrinsics.areEqual(this.symbolText, sliderTooltip.symbolText) && Intrinsics.areEqual(this.measureFullSymbolText, sliderTooltip.measureFullSymbolText);
    }

    public int hashCode() {
        return (((((((this.priceText.hashCode() * 31) + this.priceAndPercentageText.hashCode()) * 31) + this.measurePriceAndPercentageText.hashCode()) * 31) + this.symbolText.hashCode()) * 31) + this.measureFullSymbolText.hashCode();
    }

    public String toString() {
        return "SliderTooltip(priceText=" + this.priceText + ", priceAndPercentageText=" + this.priceAndPercentageText + ", measurePriceAndPercentageText=" + this.measurePriceAndPercentageText + ", symbolText=" + this.symbolText + ", measureFullSymbolText=" + this.measureFullSymbolText + ")";
    }

    public SliderTooltip(String priceText, String priceAndPercentageText, String measurePriceAndPercentageText, String symbolText, String measureFullSymbolText) {
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(priceAndPercentageText, "priceAndPercentageText");
        Intrinsics.checkNotNullParameter(measurePriceAndPercentageText, "measurePriceAndPercentageText");
        Intrinsics.checkNotNullParameter(symbolText, "symbolText");
        Intrinsics.checkNotNullParameter(measureFullSymbolText, "measureFullSymbolText");
        this.priceText = priceText;
        this.priceAndPercentageText = priceAndPercentageText;
        this.measurePriceAndPercentageText = measurePriceAndPercentageText;
        this.symbolText = symbolText;
        this.measureFullSymbolText = measureFullSymbolText;
    }

    public final String getPriceText() {
        return this.priceText;
    }

    public final String getPriceAndPercentageText() {
        return this.priceAndPercentageText;
    }

    public final String getMeasurePriceAndPercentageText() {
        return this.measurePriceAndPercentageText;
    }

    public final String getSymbolText() {
        return this.symbolText;
    }

    public final String getMeasureFullSymbolText() {
        return this.measureFullSymbolText;
    }
}
