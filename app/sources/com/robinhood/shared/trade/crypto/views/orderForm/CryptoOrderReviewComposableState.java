package com.robinhood.shared.trade.crypto.views.orderForm;

import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderReviewComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/orderForm/CryptoOrderReviewComposableState;", "", "headerState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "orderReviewRowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "reviewMessageAndDisclosuresState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;)V", "getHeaderState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "getOrderReviewRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "getReviewMessageAndDisclosuresState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderReviewComposableState {
    public static final int $stable = (CryptoOrderReviewMessageAndDisclosuresState.$stable | CryptoOrderReviewRowState.$stable) | CryptoOrderHeaderState.$stable;
    private final CryptoOrderHeaderState headerState;
    private final ImmutableList<CryptoOrderReviewRowState> orderReviewRowStates;
    private final CryptoOrderReviewMessageAndDisclosuresState reviewMessageAndDisclosuresState;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoOrderReviewComposableState copy$default(CryptoOrderReviewComposableState cryptoOrderReviewComposableState, CryptoOrderHeaderState cryptoOrderHeaderComposable7, ImmutableList immutableList, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoOrderHeaderComposable7 = cryptoOrderReviewComposableState.headerState;
        }
        if ((i & 2) != 0) {
            immutableList = cryptoOrderReviewComposableState.orderReviewRowStates;
        }
        if ((i & 4) != 0) {
            cryptoOrderReviewMessageAndDisclosuresState = cryptoOrderReviewComposableState.reviewMessageAndDisclosuresState;
        }
        return cryptoOrderReviewComposableState.copy(cryptoOrderHeaderComposable7, immutableList, cryptoOrderReviewMessageAndDisclosuresState);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoOrderHeaderState getHeaderState() {
        return this.headerState;
    }

    public final ImmutableList<CryptoOrderReviewRowState> component2() {
        return this.orderReviewRowStates;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoOrderReviewMessageAndDisclosuresState getReviewMessageAndDisclosuresState() {
        return this.reviewMessageAndDisclosuresState;
    }

    public final CryptoOrderReviewComposableState copy(CryptoOrderHeaderState headerState, ImmutableList<CryptoOrderReviewRowState> orderReviewRowStates, CryptoOrderReviewMessageAndDisclosuresState reviewMessageAndDisclosuresState) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(orderReviewRowStates, "orderReviewRowStates");
        Intrinsics.checkNotNullParameter(reviewMessageAndDisclosuresState, "reviewMessageAndDisclosuresState");
        return new CryptoOrderReviewComposableState(headerState, orderReviewRowStates, reviewMessageAndDisclosuresState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderReviewComposableState)) {
            return false;
        }
        CryptoOrderReviewComposableState cryptoOrderReviewComposableState = (CryptoOrderReviewComposableState) other;
        return Intrinsics.areEqual(this.headerState, cryptoOrderReviewComposableState.headerState) && Intrinsics.areEqual(this.orderReviewRowStates, cryptoOrderReviewComposableState.orderReviewRowStates) && Intrinsics.areEqual(this.reviewMessageAndDisclosuresState, cryptoOrderReviewComposableState.reviewMessageAndDisclosuresState);
    }

    public int hashCode() {
        return (((this.headerState.hashCode() * 31) + this.orderReviewRowStates.hashCode()) * 31) + this.reviewMessageAndDisclosuresState.hashCode();
    }

    public String toString() {
        return "CryptoOrderReviewComposableState(headerState=" + this.headerState + ", orderReviewRowStates=" + this.orderReviewRowStates + ", reviewMessageAndDisclosuresState=" + this.reviewMessageAndDisclosuresState + ")";
    }

    public CryptoOrderReviewComposableState(CryptoOrderHeaderState headerState, ImmutableList<CryptoOrderReviewRowState> orderReviewRowStates, CryptoOrderReviewMessageAndDisclosuresState reviewMessageAndDisclosuresState) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(orderReviewRowStates, "orderReviewRowStates");
        Intrinsics.checkNotNullParameter(reviewMessageAndDisclosuresState, "reviewMessageAndDisclosuresState");
        this.headerState = headerState;
        this.orderReviewRowStates = orderReviewRowStates;
        this.reviewMessageAndDisclosuresState = reviewMessageAndDisclosuresState;
    }

    public final CryptoOrderHeaderState getHeaderState() {
        return this.headerState;
    }

    public final ImmutableList<CryptoOrderReviewRowState> getOrderReviewRowStates() {
        return this.orderReviewRowStates;
    }

    public final CryptoOrderReviewMessageAndDisclosuresState getReviewMessageAndDisclosuresState() {
        return this.reviewMessageAndDisclosuresState;
    }
}
