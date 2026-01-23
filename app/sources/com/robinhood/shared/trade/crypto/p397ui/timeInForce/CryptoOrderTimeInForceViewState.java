package com.robinhood.shared.trade.crypto.p397ui.timeInForce;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderTimeInForceViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceViewState;", "", "displayRowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDisplayRowState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getDisplayRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderTimeInForceViewState {
    public static final int $stable = StringResource.$stable;
    private final ImmutableList<CryptoOrderTimeInForceDisplayRowState> displayRowStates;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoOrderTimeInForceViewState copy$default(CryptoOrderTimeInForceViewState cryptoOrderTimeInForceViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = cryptoOrderTimeInForceViewState.displayRowStates;
        }
        return cryptoOrderTimeInForceViewState.copy(immutableList);
    }

    public final ImmutableList<CryptoOrderTimeInForceDisplayRowState> component1() {
        return this.displayRowStates;
    }

    public final CryptoOrderTimeInForceViewState copy(ImmutableList<CryptoOrderTimeInForceDisplayRowState> displayRowStates) {
        Intrinsics.checkNotNullParameter(displayRowStates, "displayRowStates");
        return new CryptoOrderTimeInForceViewState(displayRowStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoOrderTimeInForceViewState) && Intrinsics.areEqual(this.displayRowStates, ((CryptoOrderTimeInForceViewState) other).displayRowStates);
    }

    public int hashCode() {
        return this.displayRowStates.hashCode();
    }

    public String toString() {
        return "CryptoOrderTimeInForceViewState(displayRowStates=" + this.displayRowStates + ")";
    }

    public CryptoOrderTimeInForceViewState(ImmutableList<CryptoOrderTimeInForceDisplayRowState> displayRowStates) {
        Intrinsics.checkNotNullParameter(displayRowStates, "displayRowStates");
        this.displayRowStates = displayRowStates;
    }

    public final ImmutableList<CryptoOrderTimeInForceDisplayRowState> getDisplayRowStates() {
        return this.displayRowStates;
    }
}
