package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeAmountInputRowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeRow.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow;", "", "visible", "", "getVisible", "()Z", "Input", "OrderReviewRow", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow$Input;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow$OrderReviewRow;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface CryptoQuickTradeRow {
    boolean getVisible();

    /* compiled from: CryptoQuickTradeRow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow$Input;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow;", "inputRowState", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeAmountInputRowState;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeAmountInputRowState;)V", "getInputRowState", "()Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeAmountInputRowState;", "visible", "", "getVisible", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Input implements CryptoQuickTradeRow {
        public static final int $stable = 0;
        private final CryptoQuickTradeAmountInputRowState inputRowState;
        private final boolean visible = true;

        public static /* synthetic */ Input copy$default(Input input, CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoQuickTradeAmountInputRowState = input.inputRowState;
            }
            return input.copy(cryptoQuickTradeAmountInputRowState);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoQuickTradeAmountInputRowState getInputRowState() {
            return this.inputRowState;
        }

        public final Input copy(CryptoQuickTradeAmountInputRowState inputRowState) {
            return new Input(inputRowState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Input) && Intrinsics.areEqual(this.inputRowState, ((Input) other).inputRowState);
        }

        public int hashCode() {
            CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState = this.inputRowState;
            if (cryptoQuickTradeAmountInputRowState == null) {
                return 0;
            }
            return cryptoQuickTradeAmountInputRowState.hashCode();
        }

        public String toString() {
            return "Input(inputRowState=" + this.inputRowState + ")";
        }

        public Input(CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState) {
            this.inputRowState = cryptoQuickTradeAmountInputRowState;
        }

        public final CryptoQuickTradeAmountInputRowState getInputRowState() {
            return this.inputRowState;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeRow
        public boolean getVisible() {
            return this.visible;
        }
    }

    /* compiled from: CryptoQuickTradeRow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow$OrderReviewRow;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow;", "state", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "visible", "", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;Z)V", "getState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getVisible", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderReviewRow implements CryptoQuickTradeRow {
        public static final int $stable = CryptoOrderReviewRowState.$stable;
        private final CryptoOrderReviewRowState state;
        private final boolean visible;

        public static /* synthetic */ OrderReviewRow copy$default(OrderReviewRow orderReviewRow, CryptoOrderReviewRowState cryptoOrderReviewRowState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderReviewRowState = orderReviewRow.state;
            }
            if ((i & 2) != 0) {
                z = orderReviewRow.visible;
            }
            return orderReviewRow.copy(cryptoOrderReviewRowState, z);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderReviewRowState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getVisible() {
            return this.visible;
        }

        public final OrderReviewRow copy(CryptoOrderReviewRowState state, boolean visible) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new OrderReviewRow(state, visible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderReviewRow)) {
                return false;
            }
            OrderReviewRow orderReviewRow = (OrderReviewRow) other;
            return Intrinsics.areEqual(this.state, orderReviewRow.state) && this.visible == orderReviewRow.visible;
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + Boolean.hashCode(this.visible);
        }

        public String toString() {
            return "OrderReviewRow(state=" + this.state + ", visible=" + this.visible + ")";
        }

        public OrderReviewRow(CryptoOrderReviewRowState state, boolean z) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.visible = z;
        }

        public final CryptoOrderReviewRowState getState() {
            return this.state;
        }

        @Override // com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeRow
        public boolean getVisible() {
            return this.visible;
        }
    }
}
