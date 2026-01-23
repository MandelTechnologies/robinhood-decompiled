package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoOrderTypeSelectorViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorViewState;", "", "rowViewStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getRowViewStates", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderTypeSelectorViewState {
    public static final int $stable = 0;
    private final ImmutableList<CryptoOrderTypeSelectorViewState2> rowViewStates;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoOrderTypeSelectorViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoOrderTypeSelectorViewState copy$default(CryptoOrderTypeSelectorViewState cryptoOrderTypeSelectorViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = cryptoOrderTypeSelectorViewState.rowViewStates;
        }
        return cryptoOrderTypeSelectorViewState.copy(immutableList);
    }

    public final ImmutableList<CryptoOrderTypeSelectorViewState2> component1() {
        return this.rowViewStates;
    }

    public final CryptoOrderTypeSelectorViewState copy(ImmutableList<? extends CryptoOrderTypeSelectorViewState2> rowViewStates) {
        Intrinsics.checkNotNullParameter(rowViewStates, "rowViewStates");
        return new CryptoOrderTypeSelectorViewState(rowViewStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoOrderTypeSelectorViewState) && Intrinsics.areEqual(this.rowViewStates, ((CryptoOrderTypeSelectorViewState) other).rowViewStates);
    }

    public int hashCode() {
        return this.rowViewStates.hashCode();
    }

    public String toString() {
        return "CryptoOrderTypeSelectorViewState(rowViewStates=" + this.rowViewStates + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoOrderTypeSelectorViewState(ImmutableList<? extends CryptoOrderTypeSelectorViewState2> rowViewStates) {
        Intrinsics.checkNotNullParameter(rowViewStates, "rowViewStates");
        this.rowViewStates = rowViewStates;
    }

    public /* synthetic */ CryptoOrderTypeSelectorViewState(ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : immutableList);
    }

    public final ImmutableList<CryptoOrderTypeSelectorViewState2> getRowViewStates() {
        return this.rowViewStates;
    }
}
