package com.robinhood.shared.crypto.p375ui.trade.input;

import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderInputQuantityComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState;", "", "headerState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "rowTypes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState$RowType;", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;Lkotlinx/collections/immutable/ImmutableList;)V", "getHeaderState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "getRowTypes", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RowType", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderInputQuantityState {
    public static final int $stable = 8;
    private final CryptoOrderHeaderState headerState;
    private final ImmutableList<RowType> rowTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoOrderInputQuantityState copy$default(CryptoOrderInputQuantityState cryptoOrderInputQuantityState, CryptoOrderHeaderState cryptoOrderHeaderState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoOrderHeaderState = cryptoOrderInputQuantityState.headerState;
        }
        if ((i & 2) != 0) {
            immutableList = cryptoOrderInputQuantityState.rowTypes;
        }
        return cryptoOrderInputQuantityState.copy(cryptoOrderHeaderState, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoOrderHeaderState getHeaderState() {
        return this.headerState;
    }

    public final ImmutableList<RowType> component2() {
        return this.rowTypes;
    }

    public final CryptoOrderInputQuantityState copy(CryptoOrderHeaderState headerState, ImmutableList<? extends RowType> rowTypes) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(rowTypes, "rowTypes");
        return new CryptoOrderInputQuantityState(headerState, rowTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderInputQuantityState)) {
            return false;
        }
        CryptoOrderInputQuantityState cryptoOrderInputQuantityState = (CryptoOrderInputQuantityState) other;
        return Intrinsics.areEqual(this.headerState, cryptoOrderInputQuantityState.headerState) && Intrinsics.areEqual(this.rowTypes, cryptoOrderInputQuantityState.rowTypes);
    }

    public int hashCode() {
        return (this.headerState.hashCode() * 31) + this.rowTypes.hashCode();
    }

    public String toString() {
        return "CryptoOrderInputQuantityState(headerState=" + this.headerState + ", rowTypes=" + this.rowTypes + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoOrderInputQuantityState(CryptoOrderHeaderState headerState, ImmutableList<? extends RowType> rowTypes) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(rowTypes, "rowTypes");
        this.headerState = headerState;
        this.rowTypes = rowTypes;
    }

    public final CryptoOrderHeaderState getHeaderState() {
        return this.headerState;
    }

    public final ImmutableList<RowType> getRowTypes() {
        return this.rowTypes;
    }

    /* compiled from: CryptoOrderInputQuantityComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState$RowType;", "", "Input", "Data", "Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState$RowType$Data;", "Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState$RowType$Input;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RowType {

        /* compiled from: CryptoOrderInputQuantityComposable.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState$RowType$Input;", "Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState$RowType;", "state", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;)V", "getState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Input implements RowType {
            public static final int $stable;
            private final CryptoOrderInputRowState state;

            static {
                int i = StringResource.$stable;
                int i2 = BentoIcon4.$stable;
                $stable = i | i2 | i | i2 | i;
            }

            public static /* synthetic */ Input copy$default(Input input, CryptoOrderInputRowState cryptoOrderInputRowState, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoOrderInputRowState = input.state;
                }
                return input.copy(cryptoOrderInputRowState);
            }

            /* renamed from: component1, reason: from getter */
            public final CryptoOrderInputRowState getState() {
                return this.state;
            }

            public final Input copy(CryptoOrderInputRowState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new Input(state);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Input) && Intrinsics.areEqual(this.state, ((Input) other).state);
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                return "Input(state=" + this.state + ")";
            }

            public Input(CryptoOrderInputRowState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                this.state = state;
            }

            public final CryptoOrderInputRowState getState() {
                return this.state;
            }
        }

        /* compiled from: CryptoOrderInputQuantityComposable.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState$RowType$Data;", "Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState$RowType;", "state", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;)V", "getState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Data implements RowType {
            public static final int $stable;
            private final CryptoOrderReviewRowState state;

            static {
                int i = BentoIcon4.$stable;
                int i2 = StringResource.$stable;
                $stable = i | i | i2 | i | i2 | i | i2 | i | i2 | i2;
            }

            public static /* synthetic */ Data copy$default(Data data, CryptoOrderReviewRowState cryptoOrderReviewRowState, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoOrderReviewRowState = data.state;
                }
                return data.copy(cryptoOrderReviewRowState);
            }

            /* renamed from: component1, reason: from getter */
            public final CryptoOrderReviewRowState getState() {
                return this.state;
            }

            public final Data copy(CryptoOrderReviewRowState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new Data(state);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Data) && Intrinsics.areEqual(this.state, ((Data) other).state);
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                return "Data(state=" + this.state + ")";
            }

            public Data(CryptoOrderReviewRowState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                this.state = state;
            }

            public final CryptoOrderReviewRowState getState() {
                return this.state;
            }
        }
    }
}
