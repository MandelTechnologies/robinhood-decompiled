package com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm;

import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.views.orderForm.CryptoOrderReviewComposableState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotOrderFormViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormViewState;", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "reviewComposableState", "Lcom/robinhood/shared/trade/crypto/views/orderForm/CryptoOrderReviewComposableState;", "<init>", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/shared/trade/crypto/views/orderForm/CryptoOrderReviewComposableState;)V", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getReviewComposableState", "()Lcom/robinhood/shared/trade/crypto/views/orderForm/CryptoOrderReviewComposableState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoTaxLotOrderFormViewState {
    public static final int $stable = 8;
    private final CryptoOrderContext cryptoOrderContext;
    private final CryptoOrderReviewComposableState reviewComposableState;

    public static /* synthetic */ CryptoTaxLotOrderFormViewState copy$default(CryptoTaxLotOrderFormViewState cryptoTaxLotOrderFormViewState, CryptoOrderContext cryptoOrderContext, CryptoOrderReviewComposableState cryptoOrderReviewComposable5, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoOrderContext = cryptoTaxLotOrderFormViewState.cryptoOrderContext;
        }
        if ((i & 2) != 0) {
            cryptoOrderReviewComposable5 = cryptoTaxLotOrderFormViewState.reviewComposableState;
        }
        return cryptoTaxLotOrderFormViewState.copy(cryptoOrderContext, cryptoOrderReviewComposable5);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoOrderReviewComposableState getReviewComposableState() {
        return this.reviewComposableState;
    }

    public final CryptoTaxLotOrderFormViewState copy(CryptoOrderContext cryptoOrderContext, CryptoOrderReviewComposableState reviewComposableState) {
        Intrinsics.checkNotNullParameter(reviewComposableState, "reviewComposableState");
        return new CryptoTaxLotOrderFormViewState(cryptoOrderContext, reviewComposableState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTaxLotOrderFormViewState)) {
            return false;
        }
        CryptoTaxLotOrderFormViewState cryptoTaxLotOrderFormViewState = (CryptoTaxLotOrderFormViewState) other;
        return Intrinsics.areEqual(this.cryptoOrderContext, cryptoTaxLotOrderFormViewState.cryptoOrderContext) && Intrinsics.areEqual(this.reviewComposableState, cryptoTaxLotOrderFormViewState.reviewComposableState);
    }

    public int hashCode() {
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        return ((cryptoOrderContext == null ? 0 : cryptoOrderContext.hashCode()) * 31) + this.reviewComposableState.hashCode();
    }

    public String toString() {
        return "CryptoTaxLotOrderFormViewState(cryptoOrderContext=" + this.cryptoOrderContext + ", reviewComposableState=" + this.reviewComposableState + ")";
    }

    public CryptoTaxLotOrderFormViewState(CryptoOrderContext cryptoOrderContext, CryptoOrderReviewComposableState reviewComposableState) {
        Intrinsics.checkNotNullParameter(reviewComposableState, "reviewComposableState");
        this.cryptoOrderContext = cryptoOrderContext;
        this.reviewComposableState = reviewComposableState;
    }

    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    public final CryptoOrderReviewComposableState getReviewComposableState() {
        return this.reviewComposableState;
    }
}
