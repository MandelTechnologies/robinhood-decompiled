package com.robinhood.android.trade.options;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderMarketPriceRowComposeView.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderMarketPriceRowState;", "", "title", "", "subtitle", "value", "isSubtitleTappable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getValue", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderMarketPriceRowState {
    public static final int $stable = 0;
    private final boolean isSubtitleTappable;
    private final String subtitle;
    private final String title;
    private final String value;

    public static /* synthetic */ OptionOrderMarketPriceRowState copy$default(OptionOrderMarketPriceRowState optionOrderMarketPriceRowState, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderMarketPriceRowState.title;
        }
        if ((i & 2) != 0) {
            str2 = optionOrderMarketPriceRowState.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = optionOrderMarketPriceRowState.value;
        }
        if ((i & 8) != 0) {
            z = optionOrderMarketPriceRowState.isSubtitleTappable;
        }
        return optionOrderMarketPriceRowState.copy(str, str2, str3, z);
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
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSubtitleTappable() {
        return this.isSubtitleTappable;
    }

    public final OptionOrderMarketPriceRowState copy(String title, String subtitle, String value, boolean isSubtitleTappable) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(value, "value");
        return new OptionOrderMarketPriceRowState(title, subtitle, value, isSubtitleTappable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderMarketPriceRowState)) {
            return false;
        }
        OptionOrderMarketPriceRowState optionOrderMarketPriceRowState = (OptionOrderMarketPriceRowState) other;
        return Intrinsics.areEqual(this.title, optionOrderMarketPriceRowState.title) && Intrinsics.areEqual(this.subtitle, optionOrderMarketPriceRowState.subtitle) && Intrinsics.areEqual(this.value, optionOrderMarketPriceRowState.value) && this.isSubtitleTappable == optionOrderMarketPriceRowState.isSubtitleTappable;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isSubtitleTappable);
    }

    public String toString() {
        return "OptionOrderMarketPriceRowState(title=" + this.title + ", subtitle=" + this.subtitle + ", value=" + this.value + ", isSubtitleTappable=" + this.isSubtitleTappable + ")";
    }

    public OptionOrderMarketPriceRowState(String title, String subtitle, String value, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(value, "value");
        this.title = title;
        this.subtitle = subtitle;
        this.value = value;
        this.isSubtitleTappable = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isSubtitleTappable() {
        return this.isSubtitleTappable;
    }
}
