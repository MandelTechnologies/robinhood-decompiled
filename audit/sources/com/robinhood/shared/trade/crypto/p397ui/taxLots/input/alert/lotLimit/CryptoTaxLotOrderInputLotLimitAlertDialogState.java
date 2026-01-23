package com.robinhood.shared.trade.crypto.p397ui.taxLots.input.alert.lotLimit;

import com.robinhood.models.crypto.p314db.Currency;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotOrderInputLotLimitAlertDialog.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/alert/lotLimit/CryptoTaxLotOrderInputLotLimitAlertDialogState;", "", "assetCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "maxQuantity", "Ljava/math/BigDecimal;", "maxLots", "", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;I)V", "getAssetCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getMaxQuantity", "()Ljava/math/BigDecimal;", "getMaxLots", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoTaxLotOrderInputLotLimitAlertDialogState {
    public static final int $stable = 8;
    private final Currency assetCurrency;
    private final int maxLots;
    private final BigDecimal maxQuantity;

    public static /* synthetic */ CryptoTaxLotOrderInputLotLimitAlertDialogState copy$default(CryptoTaxLotOrderInputLotLimitAlertDialogState cryptoTaxLotOrderInputLotLimitAlertDialogState, Currency currency, BigDecimal bigDecimal, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            currency = cryptoTaxLotOrderInputLotLimitAlertDialogState.assetCurrency;
        }
        if ((i2 & 2) != 0) {
            bigDecimal = cryptoTaxLotOrderInputLotLimitAlertDialogState.maxQuantity;
        }
        if ((i2 & 4) != 0) {
            i = cryptoTaxLotOrderInputLotLimitAlertDialogState.maxLots;
        }
        return cryptoTaxLotOrderInputLotLimitAlertDialogState.copy(currency, bigDecimal, i);
    }

    /* renamed from: component1, reason: from getter */
    public final Currency getAssetCurrency() {
        return this.assetCurrency;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getMaxQuantity() {
        return this.maxQuantity;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxLots() {
        return this.maxLots;
    }

    public final CryptoTaxLotOrderInputLotLimitAlertDialogState copy(Currency assetCurrency, BigDecimal maxQuantity, int maxLots) {
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        Intrinsics.checkNotNullParameter(maxQuantity, "maxQuantity");
        return new CryptoTaxLotOrderInputLotLimitAlertDialogState(assetCurrency, maxQuantity, maxLots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTaxLotOrderInputLotLimitAlertDialogState)) {
            return false;
        }
        CryptoTaxLotOrderInputLotLimitAlertDialogState cryptoTaxLotOrderInputLotLimitAlertDialogState = (CryptoTaxLotOrderInputLotLimitAlertDialogState) other;
        return Intrinsics.areEqual(this.assetCurrency, cryptoTaxLotOrderInputLotLimitAlertDialogState.assetCurrency) && Intrinsics.areEqual(this.maxQuantity, cryptoTaxLotOrderInputLotLimitAlertDialogState.maxQuantity) && this.maxLots == cryptoTaxLotOrderInputLotLimitAlertDialogState.maxLots;
    }

    public int hashCode() {
        return (((this.assetCurrency.hashCode() * 31) + this.maxQuantity.hashCode()) * 31) + Integer.hashCode(this.maxLots);
    }

    public String toString() {
        return "CryptoTaxLotOrderInputLotLimitAlertDialogState(assetCurrency=" + this.assetCurrency + ", maxQuantity=" + this.maxQuantity + ", maxLots=" + this.maxLots + ")";
    }

    public CryptoTaxLotOrderInputLotLimitAlertDialogState(Currency assetCurrency, BigDecimal maxQuantity, int i) {
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        Intrinsics.checkNotNullParameter(maxQuantity, "maxQuantity");
        this.assetCurrency = assetCurrency;
        this.maxQuantity = maxQuantity;
        this.maxLots = i;
    }

    public final Currency getAssetCurrency() {
        return this.assetCurrency;
    }

    public final BigDecimal getMaxQuantity() {
        return this.maxQuantity;
    }

    public final int getMaxLots() {
        return this.maxLots;
    }
}
