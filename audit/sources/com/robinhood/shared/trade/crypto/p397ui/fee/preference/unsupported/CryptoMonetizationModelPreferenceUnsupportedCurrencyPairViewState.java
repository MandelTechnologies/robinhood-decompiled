package com.robinhood.shared.trade.crypto.p397ui.fee.preference.unsupported;

import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/preference/unsupported/CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState;", "", "assetCurrencyCode", "", "isRebateMarketMakersSupported", "", "<init>", "(Ljava/lang/String;Z)V", "getAssetCurrencyCode", "()Ljava/lang/String;", "()Z", "startTextMarkdown", "Lcom/robinhood/utils/resource/StringResource;", "getStartTextMarkdown", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState {
    public static final int $stable = 0;
    private final String assetCurrencyCode;
    private final boolean isRebateMarketMakersSupported;

    public static /* synthetic */ CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState copy$default(CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState cryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState.assetCurrencyCode;
        }
        if ((i & 2) != 0) {
            z = cryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState.isRebateMarketMakersSupported;
        }
        return cryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAssetCurrencyCode() {
        return this.assetCurrencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRebateMarketMakersSupported() {
        return this.isRebateMarketMakersSupported;
    }

    public final CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState copy(String assetCurrencyCode, boolean isRebateMarketMakersSupported) {
        Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
        return new CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState(assetCurrencyCode, isRebateMarketMakersSupported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState)) {
            return false;
        }
        CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState cryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState = (CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState) other;
        return Intrinsics.areEqual(this.assetCurrencyCode, cryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState.assetCurrencyCode) && this.isRebateMarketMakersSupported == cryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState.isRebateMarketMakersSupported;
    }

    public int hashCode() {
        return (this.assetCurrencyCode.hashCode() * 31) + Boolean.hashCode(this.isRebateMarketMakersSupported);
    }

    public String toString() {
        return "CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState(assetCurrencyCode=" + this.assetCurrencyCode + ", isRebateMarketMakersSupported=" + this.isRebateMarketMakersSupported + ")";
    }

    public CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState(String assetCurrencyCode, boolean z) {
        Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
        this.assetCurrencyCode = assetCurrencyCode;
        this.isRebateMarketMakersSupported = z;
    }

    public final String getAssetCurrencyCode() {
        return this.assetCurrencyCode;
    }

    public final boolean isRebateMarketMakersSupported() {
        return this.isRebateMarketMakersSupported;
    }

    public final StringResource getStartTextMarkdown() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.isRebateMarketMakersSupported) {
            i = C40095R.string.f6281x2f78434c;
        } else {
            i = C40095R.string.f6280x3ae8f684;
        }
        return companion.invoke(i, this.assetCurrencyCode);
    }
}
