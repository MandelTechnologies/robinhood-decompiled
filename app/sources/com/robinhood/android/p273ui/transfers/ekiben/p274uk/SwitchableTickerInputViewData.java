package com.robinhood.android.p273ui.transfers.ekiben.p274uk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwitchableTickerInputView.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/SwitchableTickerInputViewData;", "", "tickerText", "", "conversionText", "animateInput", "", "displaySwitcher", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getTickerText", "()Ljava/lang/String;", "getConversionText", "getAnimateInput", "()Z", "getDisplaySwitcher", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SwitchableTickerInputViewData {
    public static final int $stable = 0;
    private final boolean animateInput;
    private final String conversionText;
    private final boolean displaySwitcher;
    private final String tickerText;

    public static /* synthetic */ SwitchableTickerInputViewData copy$default(SwitchableTickerInputViewData switchableTickerInputViewData, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchableTickerInputViewData.tickerText;
        }
        if ((i & 2) != 0) {
            str2 = switchableTickerInputViewData.conversionText;
        }
        if ((i & 4) != 0) {
            z = switchableTickerInputViewData.animateInput;
        }
        if ((i & 8) != 0) {
            z2 = switchableTickerInputViewData.displaySwitcher;
        }
        return switchableTickerInputViewData.copy(str, str2, z, z2);
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
    public final boolean getDisplaySwitcher() {
        return this.displaySwitcher;
    }

    public final SwitchableTickerInputViewData copy(String tickerText, String conversionText, boolean animateInput, boolean displaySwitcher) {
        Intrinsics.checkNotNullParameter(tickerText, "tickerText");
        return new SwitchableTickerInputViewData(tickerText, conversionText, animateInput, displaySwitcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchableTickerInputViewData)) {
            return false;
        }
        SwitchableTickerInputViewData switchableTickerInputViewData = (SwitchableTickerInputViewData) other;
        return Intrinsics.areEqual(this.tickerText, switchableTickerInputViewData.tickerText) && Intrinsics.areEqual(this.conversionText, switchableTickerInputViewData.conversionText) && this.animateInput == switchableTickerInputViewData.animateInput && this.displaySwitcher == switchableTickerInputViewData.displaySwitcher;
    }

    public int hashCode() {
        int iHashCode = this.tickerText.hashCode() * 31;
        String str = this.conversionText;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.animateInput)) * 31) + Boolean.hashCode(this.displaySwitcher);
    }

    public String toString() {
        return "SwitchableTickerInputViewData(tickerText=" + this.tickerText + ", conversionText=" + this.conversionText + ", animateInput=" + this.animateInput + ", displaySwitcher=" + this.displaySwitcher + ")";
    }

    public SwitchableTickerInputViewData(String tickerText, String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tickerText, "tickerText");
        this.tickerText = tickerText;
        this.conversionText = str;
        this.animateInput = z;
        this.displaySwitcher = z2;
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

    public final boolean getDisplaySwitcher() {
        return this.displaySwitcher;
    }
}
