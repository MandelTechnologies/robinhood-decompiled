package com.robinhood.android.crypto.tab.p093ui.power;

import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoBuyingPowerDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0016J\u000e\u0010\u0017\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0018J\u001f\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\rHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerDataState;", "", "buyingPower", "Lcom/robinhood/models/crypto/db/CryptoBuyingPower;", "hasSeenEuBuyingPowerTooltip", "", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoBuyingPower;Z)V", "getBuyingPower$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoBuyingPower;", "getHasSeenEuBuyingPowerTooltip$feature_crypto_tab_externalDebug", "()Z", "buyingPowerFormatted", "", "getBuyingPowerFormatted", "()Ljava/lang/String;", "isPlaceHolderVisible", "buyingPowerRowClickable", "getBuyingPowerRowClickable", "showBuyingPowerTooltip", "getShowBuyingPowerTooltip", "component1", "component1$feature_crypto_tab_externalDebug", "component2", "component2$feature_crypto_tab_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoBuyingPowerDataState {
    public static final int $stable = 8;
    private final CryptoBuyingPower buyingPower;
    private final boolean hasSeenEuBuyingPowerTooltip;

    public static /* synthetic */ CryptoBuyingPowerDataState copy$default(CryptoBuyingPowerDataState cryptoBuyingPowerDataState, CryptoBuyingPower cryptoBuyingPower, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoBuyingPower = cryptoBuyingPowerDataState.buyingPower;
        }
        if ((i & 2) != 0) {
            z = cryptoBuyingPowerDataState.hasSeenEuBuyingPowerTooltip;
        }
        return cryptoBuyingPowerDataState.copy(cryptoBuyingPower, z);
    }

    /* renamed from: component1$feature_crypto_tab_externalDebug, reason: from getter */
    public final CryptoBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    /* renamed from: component2$feature_crypto_tab_externalDebug, reason: from getter */
    public final boolean getHasSeenEuBuyingPowerTooltip() {
        return this.hasSeenEuBuyingPowerTooltip;
    }

    public final CryptoBuyingPowerDataState copy(CryptoBuyingPower buyingPower, boolean hasSeenEuBuyingPowerTooltip) {
        return new CryptoBuyingPowerDataState(buyingPower, hasSeenEuBuyingPowerTooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoBuyingPowerDataState)) {
            return false;
        }
        CryptoBuyingPowerDataState cryptoBuyingPowerDataState = (CryptoBuyingPowerDataState) other;
        return Intrinsics.areEqual(this.buyingPower, cryptoBuyingPowerDataState.buyingPower) && this.hasSeenEuBuyingPowerTooltip == cryptoBuyingPowerDataState.hasSeenEuBuyingPowerTooltip;
    }

    public int hashCode() {
        CryptoBuyingPower cryptoBuyingPower = this.buyingPower;
        return ((cryptoBuyingPower == null ? 0 : cryptoBuyingPower.hashCode()) * 31) + Boolean.hashCode(this.hasSeenEuBuyingPowerTooltip);
    }

    public String toString() {
        return "CryptoBuyingPowerDataState(buyingPower=" + this.buyingPower + ", hasSeenEuBuyingPowerTooltip=" + this.hasSeenEuBuyingPowerTooltip + ")";
    }

    public CryptoBuyingPowerDataState(CryptoBuyingPower cryptoBuyingPower, boolean z) {
        this.buyingPower = cryptoBuyingPower;
        this.hasSeenEuBuyingPowerTooltip = z;
    }

    public /* synthetic */ CryptoBuyingPowerDataState(CryptoBuyingPower cryptoBuyingPower, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoBuyingPower, z);
    }

    public final CryptoBuyingPower getBuyingPower$feature_crypto_tab_externalDebug() {
        return this.buyingPower;
    }

    public final boolean getHasSeenEuBuyingPowerTooltip$feature_crypto_tab_externalDebug() {
        return this.hasSeenEuBuyingPowerTooltip;
    }

    public final String getBuyingPowerFormatted() {
        Money buyingPower;
        String str;
        CryptoBuyingPower cryptoBuyingPower = this.buyingPower;
        return (cryptoBuyingPower == null || (buyingPower = cryptoBuyingPower.getBuyingPower()) == null || (str = Money.format$default(buyingPower, CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), false, null, false, 0, null, false, null, false, false, 1022, null)) == null) ? "" : str;
    }

    public final boolean isPlaceHolderVisible() {
        return this.buyingPower == null;
    }

    public final boolean getBuyingPowerRowClickable() {
        return this.buyingPower != null;
    }

    public final boolean getShowBuyingPowerTooltip() {
        return (this.buyingPower == null || this.hasSeenEuBuyingPowerTooltip) ? false : true;
    }
}
