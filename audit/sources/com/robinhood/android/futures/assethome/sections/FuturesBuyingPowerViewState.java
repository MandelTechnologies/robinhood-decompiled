package com.robinhood.android.futures.assethome.sections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAssetHomeBuyingPowerSection.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/sections/FuturesBuyingPowerViewState;", "", "buyingPowerDisplay", "", "marginWithheldDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBuyingPowerDisplay", "()Ljava/lang/String;", "getMarginWithheldDisplay", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesBuyingPowerViewState {
    public static final int $stable = 0;
    private final String buyingPowerDisplay;
    private final String marginWithheldDisplay;

    public static /* synthetic */ FuturesBuyingPowerViewState copy$default(FuturesBuyingPowerViewState futuresBuyingPowerViewState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresBuyingPowerViewState.buyingPowerDisplay;
        }
        if ((i & 2) != 0) {
            str2 = futuresBuyingPowerViewState.marginWithheldDisplay;
        }
        return futuresBuyingPowerViewState.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBuyingPowerDisplay() {
        return this.buyingPowerDisplay;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMarginWithheldDisplay() {
        return this.marginWithheldDisplay;
    }

    public final FuturesBuyingPowerViewState copy(String buyingPowerDisplay, String marginWithheldDisplay) {
        Intrinsics.checkNotNullParameter(buyingPowerDisplay, "buyingPowerDisplay");
        Intrinsics.checkNotNullParameter(marginWithheldDisplay, "marginWithheldDisplay");
        return new FuturesBuyingPowerViewState(buyingPowerDisplay, marginWithheldDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesBuyingPowerViewState)) {
            return false;
        }
        FuturesBuyingPowerViewState futuresBuyingPowerViewState = (FuturesBuyingPowerViewState) other;
        return Intrinsics.areEqual(this.buyingPowerDisplay, futuresBuyingPowerViewState.buyingPowerDisplay) && Intrinsics.areEqual(this.marginWithheldDisplay, futuresBuyingPowerViewState.marginWithheldDisplay);
    }

    public int hashCode() {
        return (this.buyingPowerDisplay.hashCode() * 31) + this.marginWithheldDisplay.hashCode();
    }

    public String toString() {
        return "FuturesBuyingPowerViewState(buyingPowerDisplay=" + this.buyingPowerDisplay + ", marginWithheldDisplay=" + this.marginWithheldDisplay + ")";
    }

    public FuturesBuyingPowerViewState(String buyingPowerDisplay, String marginWithheldDisplay) {
        Intrinsics.checkNotNullParameter(buyingPowerDisplay, "buyingPowerDisplay");
        Intrinsics.checkNotNullParameter(marginWithheldDisplay, "marginWithheldDisplay");
        this.buyingPowerDisplay = buyingPowerDisplay;
        this.marginWithheldDisplay = marginWithheldDisplay;
    }

    public final String getBuyingPowerDisplay() {
        return this.buyingPowerDisplay;
    }

    public final String getMarginWithheldDisplay() {
        return this.marginWithheldDisplay;
    }
}
