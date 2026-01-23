package com.robinhood.shared.formats.crypto;

import com.robinhood.shared.common.lib.formats.currency.CurrencyInputInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyInputInfoPair.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/formats/crypto/CurrencyInputInfoPair;", "", "quoteCurrencyInfo", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputInfo;", "assetCurrencyInfo", "<init>", "(Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputInfo;Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputInfo;)V", "getQuoteCurrencyInfo", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputInfo;", "getAssetCurrencyInfo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-formats-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CurrencyInputInfoPair {
    private final CurrencyInputInfo assetCurrencyInfo;
    private final CurrencyInputInfo quoteCurrencyInfo;

    public static /* synthetic */ CurrencyInputInfoPair copy$default(CurrencyInputInfoPair currencyInputInfoPair, CurrencyInputInfo currencyInputInfo, CurrencyInputInfo currencyInputInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            currencyInputInfo = currencyInputInfoPair.quoteCurrencyInfo;
        }
        if ((i & 2) != 0) {
            currencyInputInfo2 = currencyInputInfoPair.assetCurrencyInfo;
        }
        return currencyInputInfoPair.copy(currencyInputInfo, currencyInputInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final CurrencyInputInfo getQuoteCurrencyInfo() {
        return this.quoteCurrencyInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final CurrencyInputInfo getAssetCurrencyInfo() {
        return this.assetCurrencyInfo;
    }

    public final CurrencyInputInfoPair copy(CurrencyInputInfo quoteCurrencyInfo, CurrencyInputInfo assetCurrencyInfo) {
        Intrinsics.checkNotNullParameter(quoteCurrencyInfo, "quoteCurrencyInfo");
        Intrinsics.checkNotNullParameter(assetCurrencyInfo, "assetCurrencyInfo");
        return new CurrencyInputInfoPair(quoteCurrencyInfo, assetCurrencyInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyInputInfoPair)) {
            return false;
        }
        CurrencyInputInfoPair currencyInputInfoPair = (CurrencyInputInfoPair) other;
        return Intrinsics.areEqual(this.quoteCurrencyInfo, currencyInputInfoPair.quoteCurrencyInfo) && Intrinsics.areEqual(this.assetCurrencyInfo, currencyInputInfoPair.assetCurrencyInfo);
    }

    public int hashCode() {
        return (this.quoteCurrencyInfo.hashCode() * 31) + this.assetCurrencyInfo.hashCode();
    }

    public String toString() {
        return "CurrencyInputInfoPair(quoteCurrencyInfo=" + this.quoteCurrencyInfo + ", assetCurrencyInfo=" + this.assetCurrencyInfo + ")";
    }

    public CurrencyInputInfoPair(CurrencyInputInfo quoteCurrencyInfo, CurrencyInputInfo assetCurrencyInfo) {
        Intrinsics.checkNotNullParameter(quoteCurrencyInfo, "quoteCurrencyInfo");
        Intrinsics.checkNotNullParameter(assetCurrencyInfo, "assetCurrencyInfo");
        this.quoteCurrencyInfo = quoteCurrencyInfo;
        this.assetCurrencyInfo = assetCurrencyInfo;
    }

    public final CurrencyInputInfo getQuoteCurrencyInfo() {
        return this.quoteCurrencyInfo;
    }

    public final CurrencyInputInfo getAssetCurrencyInfo() {
        return this.assetCurrencyInfo;
    }
}
