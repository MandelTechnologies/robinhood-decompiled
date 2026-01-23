package com.robinhood.android.crypto.tab.p093ui.power;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoBuyingPowerDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerViewState;", "", "buyingPowerFormatted", "", "isPlaceHolderVisible", "", "buyingPowerRowClickable", "showBuyingPowerTooltip", "<init>", "(Ljava/lang/String;ZZZ)V", "getBuyingPowerFormatted", "()Ljava/lang/String;", "()Z", "getBuyingPowerRowClickable", "getShowBuyingPowerTooltip", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoBuyingPowerViewState {
    public static final int $stable = 0;
    private final String buyingPowerFormatted;
    private final boolean buyingPowerRowClickable;
    private final boolean isPlaceHolderVisible;
    private final boolean showBuyingPowerTooltip;

    public static /* synthetic */ CryptoBuyingPowerViewState copy$default(CryptoBuyingPowerViewState cryptoBuyingPowerViewState, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoBuyingPowerViewState.buyingPowerFormatted;
        }
        if ((i & 2) != 0) {
            z = cryptoBuyingPowerViewState.isPlaceHolderVisible;
        }
        if ((i & 4) != 0) {
            z2 = cryptoBuyingPowerViewState.buyingPowerRowClickable;
        }
        if ((i & 8) != 0) {
            z3 = cryptoBuyingPowerViewState.showBuyingPowerTooltip;
        }
        return cryptoBuyingPowerViewState.copy(str, z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBuyingPowerFormatted() {
        return this.buyingPowerFormatted;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPlaceHolderVisible() {
        return this.isPlaceHolderVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getBuyingPowerRowClickable() {
        return this.buyingPowerRowClickable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowBuyingPowerTooltip() {
        return this.showBuyingPowerTooltip;
    }

    public final CryptoBuyingPowerViewState copy(String buyingPowerFormatted, boolean isPlaceHolderVisible, boolean buyingPowerRowClickable, boolean showBuyingPowerTooltip) {
        Intrinsics.checkNotNullParameter(buyingPowerFormatted, "buyingPowerFormatted");
        return new CryptoBuyingPowerViewState(buyingPowerFormatted, isPlaceHolderVisible, buyingPowerRowClickable, showBuyingPowerTooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoBuyingPowerViewState)) {
            return false;
        }
        CryptoBuyingPowerViewState cryptoBuyingPowerViewState = (CryptoBuyingPowerViewState) other;
        return Intrinsics.areEqual(this.buyingPowerFormatted, cryptoBuyingPowerViewState.buyingPowerFormatted) && this.isPlaceHolderVisible == cryptoBuyingPowerViewState.isPlaceHolderVisible && this.buyingPowerRowClickable == cryptoBuyingPowerViewState.buyingPowerRowClickable && this.showBuyingPowerTooltip == cryptoBuyingPowerViewState.showBuyingPowerTooltip;
    }

    public int hashCode() {
        return (((((this.buyingPowerFormatted.hashCode() * 31) + Boolean.hashCode(this.isPlaceHolderVisible)) * 31) + Boolean.hashCode(this.buyingPowerRowClickable)) * 31) + Boolean.hashCode(this.showBuyingPowerTooltip);
    }

    public String toString() {
        return "CryptoBuyingPowerViewState(buyingPowerFormatted=" + this.buyingPowerFormatted + ", isPlaceHolderVisible=" + this.isPlaceHolderVisible + ", buyingPowerRowClickable=" + this.buyingPowerRowClickable + ", showBuyingPowerTooltip=" + this.showBuyingPowerTooltip + ")";
    }

    public CryptoBuyingPowerViewState(String buyingPowerFormatted, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(buyingPowerFormatted, "buyingPowerFormatted");
        this.buyingPowerFormatted = buyingPowerFormatted;
        this.isPlaceHolderVisible = z;
        this.buyingPowerRowClickable = z2;
        this.showBuyingPowerTooltip = z3;
    }

    public final String getBuyingPowerFormatted() {
        return this.buyingPowerFormatted;
    }

    public final boolean isPlaceHolderVisible() {
        return this.isPlaceHolderVisible;
    }

    public final boolean getBuyingPowerRowClickable() {
        return this.buyingPowerRowClickable;
    }

    public final boolean getShowBuyingPowerTooltip() {
        return this.showBuyingPowerTooltip;
    }
}
