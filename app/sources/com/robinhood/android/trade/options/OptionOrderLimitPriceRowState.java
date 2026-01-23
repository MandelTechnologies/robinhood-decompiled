package com.robinhood.android.trade.options;

import com.robinhood.android.trade.options.OptionOrderViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderLimitPriceRowComposeView.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderLimitPriceRowState;", "", "title", "", "subtitle", "infoTagState", "Lcom/robinhood/android/trade/options/OptionOrderViewState$UiMarketability;", "showMarketabilityInfoTag", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/trade/options/OptionOrderViewState$UiMarketability;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getInfoTagState", "()Lcom/robinhood/android/trade/options/OptionOrderViewState$UiMarketability;", "getShowMarketabilityInfoTag", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderLimitPriceRowState {
    public static final int $stable = 0;
    private final OptionOrderViewState.UiMarketability infoTagState;
    private final boolean showMarketabilityInfoTag;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ OptionOrderLimitPriceRowState copy$default(OptionOrderLimitPriceRowState optionOrderLimitPriceRowState, String str, String str2, OptionOrderViewState.UiMarketability uiMarketability, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderLimitPriceRowState.title;
        }
        if ((i & 2) != 0) {
            str2 = optionOrderLimitPriceRowState.subtitle;
        }
        if ((i & 4) != 0) {
            uiMarketability = optionOrderLimitPriceRowState.infoTagState;
        }
        if ((i & 8) != 0) {
            z = optionOrderLimitPriceRowState.showMarketabilityInfoTag;
        }
        return optionOrderLimitPriceRowState.copy(str, str2, uiMarketability, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionOrderViewState.UiMarketability getInfoTagState() {
        return this.infoTagState;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowMarketabilityInfoTag() {
        return this.showMarketabilityInfoTag;
    }

    public final OptionOrderLimitPriceRowState copy(String title, String subtitle, OptionOrderViewState.UiMarketability infoTagState, boolean showMarketabilityInfoTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoTagState, "infoTagState");
        return new OptionOrderLimitPriceRowState(title, subtitle, infoTagState, showMarketabilityInfoTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderLimitPriceRowState)) {
            return false;
        }
        OptionOrderLimitPriceRowState optionOrderLimitPriceRowState = (OptionOrderLimitPriceRowState) other;
        return Intrinsics.areEqual(this.title, optionOrderLimitPriceRowState.title) && Intrinsics.areEqual(this.subtitle, optionOrderLimitPriceRowState.subtitle) && Intrinsics.areEqual(this.infoTagState, optionOrderLimitPriceRowState.infoTagState) && this.showMarketabilityInfoTag == optionOrderLimitPriceRowState.showMarketabilityInfoTag;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.infoTagState.hashCode()) * 31) + Boolean.hashCode(this.showMarketabilityInfoTag);
    }

    public String toString() {
        return "OptionOrderLimitPriceRowState(title=" + this.title + ", subtitle=" + this.subtitle + ", infoTagState=" + this.infoTagState + ", showMarketabilityInfoTag=" + this.showMarketabilityInfoTag + ")";
    }

    public OptionOrderLimitPriceRowState(String title, String str, OptionOrderViewState.UiMarketability infoTagState, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoTagState, "infoTagState");
        this.title = title;
        this.subtitle = str;
        this.infoTagState = infoTagState;
        this.showMarketabilityInfoTag = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final OptionOrderViewState.UiMarketability getInfoTagState() {
        return this.infoTagState;
    }

    public final boolean getShowMarketabilityInfoTag() {
        return this.showMarketabilityInfoTag;
    }
}
