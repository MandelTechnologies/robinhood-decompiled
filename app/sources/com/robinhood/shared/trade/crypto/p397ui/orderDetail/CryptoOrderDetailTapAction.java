package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import contracts.crypto.trade.proto.p431v1.TokenizationEstimatedTotalCostDto;
import contracts.crypto.trade.proto.p431v1.TokenizationFxFeeDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderDetailTapAction.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "", "<init>", "()V", "None", "ShowNotionalPriceBottomSheet", "ShowRecurringCollarExplanationBottomSheet", "ShowTradeBonusBottomSheet", "ShowFeeDefinitionBottomSheet", "ShowLotDetailsScreen", "ShowFxFeeBottomSheet", "ShowEstimatedTotalValueBottomSheet", "ShowPnlTradeDetailsBottomSheet", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$None;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowEstimatedTotalValueBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowFxFeeBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowLotDetailsScreen;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowNotionalPriceBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowPnlTradeDetailsBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowRecurringCollarExplanationBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowTradeBonusBottomSheet;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoOrderDetailTapAction {
    public static final int $stable = 0;

    public /* synthetic */ CryptoOrderDetailTapAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoOrderDetailTapAction() {
    }

    /* compiled from: CryptoOrderDetailTapAction.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$None;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class None extends CryptoOrderDetailTapAction {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 1050368721;
        }

        public String toString() {
            return "None";
        }

        private None() {
            super(null);
        }
    }

    /* compiled from: CryptoOrderDetailTapAction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowNotionalPriceBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowNotionalPriceBottomSheet extends CryptoOrderDetailTapAction {
        public static final int $stable = 8;
        private final UiCryptoOrder uiCryptoOrder;

        public static /* synthetic */ ShowNotionalPriceBottomSheet copy$default(ShowNotionalPriceBottomSheet showNotionalPriceBottomSheet, UiCryptoOrder uiCryptoOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = showNotionalPriceBottomSheet.uiCryptoOrder;
            }
            return showNotionalPriceBottomSheet.copy(uiCryptoOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        public final ShowNotionalPriceBottomSheet copy(UiCryptoOrder uiCryptoOrder) {
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            return new ShowNotionalPriceBottomSheet(uiCryptoOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowNotionalPriceBottomSheet) && Intrinsics.areEqual(this.uiCryptoOrder, ((ShowNotionalPriceBottomSheet) other).uiCryptoOrder);
        }

        public int hashCode() {
            return this.uiCryptoOrder.hashCode();
        }

        public String toString() {
            return "ShowNotionalPriceBottomSheet(uiCryptoOrder=" + this.uiCryptoOrder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowNotionalPriceBottomSheet(UiCryptoOrder uiCryptoOrder) {
            super(null);
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            this.uiCryptoOrder = uiCryptoOrder;
        }

        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }
    }

    /* compiled from: CryptoOrderDetailTapAction.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowRecurringCollarExplanationBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowRecurringCollarExplanationBottomSheet extends CryptoOrderDetailTapAction {
        public static final int $stable = 0;
        public static final ShowRecurringCollarExplanationBottomSheet INSTANCE = new ShowRecurringCollarExplanationBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowRecurringCollarExplanationBottomSheet);
        }

        public int hashCode() {
            return 97862431;
        }

        public String toString() {
            return "ShowRecurringCollarExplanationBottomSheet";
        }

        private ShowRecurringCollarExplanationBottomSheet() {
            super(null);
        }
    }

    /* compiled from: CryptoOrderDetailTapAction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isEstimate", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Z)V", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTradeBonusBottomSheet extends CryptoOrderDetailTapAction {
        public static final int $stable = 8;
        private final boolean isEstimate;
        private final UiCryptoOrder uiCryptoOrder;

        public static /* synthetic */ ShowTradeBonusBottomSheet copy$default(ShowTradeBonusBottomSheet showTradeBonusBottomSheet, UiCryptoOrder uiCryptoOrder, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = showTradeBonusBottomSheet.uiCryptoOrder;
            }
            if ((i & 2) != 0) {
                z = showTradeBonusBottomSheet.isEstimate;
            }
            return showTradeBonusBottomSheet.copy(uiCryptoOrder, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEstimate() {
            return this.isEstimate;
        }

        public final ShowTradeBonusBottomSheet copy(UiCryptoOrder uiCryptoOrder, boolean isEstimate) {
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            return new ShowTradeBonusBottomSheet(uiCryptoOrder, isEstimate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowTradeBonusBottomSheet)) {
                return false;
            }
            ShowTradeBonusBottomSheet showTradeBonusBottomSheet = (ShowTradeBonusBottomSheet) other;
            return Intrinsics.areEqual(this.uiCryptoOrder, showTradeBonusBottomSheet.uiCryptoOrder) && this.isEstimate == showTradeBonusBottomSheet.isEstimate;
        }

        public int hashCode() {
            return (this.uiCryptoOrder.hashCode() * 31) + Boolean.hashCode(this.isEstimate);
        }

        public String toString() {
            return "ShowTradeBonusBottomSheet(uiCryptoOrder=" + this.uiCryptoOrder + ", isEstimate=" + this.isEstimate + ")";
        }

        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        public final boolean isEstimate() {
            return this.isEstimate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTradeBonusBottomSheet(UiCryptoOrder uiCryptoOrder, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            this.uiCryptoOrder = uiCryptoOrder;
            this.isEstimate = z;
        }
    }

    /* compiled from: CryptoOrderDetailTapAction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFeeDefinitionBottomSheet extends CryptoOrderDetailTapAction {
        public static final int $stable = 8;
        private final UiCryptoOrder uiCryptoOrder;

        public static /* synthetic */ ShowFeeDefinitionBottomSheet copy$default(ShowFeeDefinitionBottomSheet showFeeDefinitionBottomSheet, UiCryptoOrder uiCryptoOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = showFeeDefinitionBottomSheet.uiCryptoOrder;
            }
            return showFeeDefinitionBottomSheet.copy(uiCryptoOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        public final ShowFeeDefinitionBottomSheet copy(UiCryptoOrder uiCryptoOrder) {
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            return new ShowFeeDefinitionBottomSheet(uiCryptoOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFeeDefinitionBottomSheet) && Intrinsics.areEqual(this.uiCryptoOrder, ((ShowFeeDefinitionBottomSheet) other).uiCryptoOrder);
        }

        public int hashCode() {
            return this.uiCryptoOrder.hashCode();
        }

        public String toString() {
            return "ShowFeeDefinitionBottomSheet(uiCryptoOrder=" + this.uiCryptoOrder + ")";
        }

        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFeeDefinitionBottomSheet(UiCryptoOrder uiCryptoOrder) {
            super(null);
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            this.uiCryptoOrder = uiCryptoOrder;
        }
    }

    /* compiled from: CryptoOrderDetailTapAction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowLotDetailsScreen;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowLotDetailsScreen extends CryptoOrderDetailTapAction {
        public static final int $stable = 8;
        private final UiCryptoOrder uiCryptoOrder;

        public static /* synthetic */ ShowLotDetailsScreen copy$default(ShowLotDetailsScreen showLotDetailsScreen, UiCryptoOrder uiCryptoOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoOrder = showLotDetailsScreen.uiCryptoOrder;
            }
            return showLotDetailsScreen.copy(uiCryptoOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        public final ShowLotDetailsScreen copy(UiCryptoOrder uiCryptoOrder) {
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            return new ShowLotDetailsScreen(uiCryptoOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowLotDetailsScreen) && Intrinsics.areEqual(this.uiCryptoOrder, ((ShowLotDetailsScreen) other).uiCryptoOrder);
        }

        public int hashCode() {
            return this.uiCryptoOrder.hashCode();
        }

        public String toString() {
            return "ShowLotDetailsScreen(uiCryptoOrder=" + this.uiCryptoOrder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowLotDetailsScreen(UiCryptoOrder uiCryptoOrder) {
            super(null);
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            this.uiCryptoOrder = uiCryptoOrder;
        }

        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }
    }

    /* compiled from: CryptoOrderDetailTapAction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowFxFeeBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "sheet", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;)V", "getSheet", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFxFeeBottomSheet extends CryptoOrderDetailTapAction {
        public static final int $stable = 8;
        private final TokenizationFxFeeDto sheet;

        public static /* synthetic */ ShowFxFeeBottomSheet copy$default(ShowFxFeeBottomSheet showFxFeeBottomSheet, TokenizationFxFeeDto tokenizationFxFeeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                tokenizationFxFeeDto = showFxFeeBottomSheet.sheet;
            }
            return showFxFeeBottomSheet.copy(tokenizationFxFeeDto);
        }

        /* renamed from: component1, reason: from getter */
        public final TokenizationFxFeeDto getSheet() {
            return this.sheet;
        }

        public final ShowFxFeeBottomSheet copy(TokenizationFxFeeDto sheet) {
            Intrinsics.checkNotNullParameter(sheet, "sheet");
            return new ShowFxFeeBottomSheet(sheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFxFeeBottomSheet) && Intrinsics.areEqual(this.sheet, ((ShowFxFeeBottomSheet) other).sheet);
        }

        public int hashCode() {
            return this.sheet.hashCode();
        }

        public String toString() {
            return "ShowFxFeeBottomSheet(sheet=" + this.sheet + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFxFeeBottomSheet(TokenizationFxFeeDto sheet) {
            super(null);
            Intrinsics.checkNotNullParameter(sheet, "sheet");
            this.sheet = sheet;
        }

        public final TokenizationFxFeeDto getSheet() {
            return this.sheet;
        }
    }

    /* compiled from: CryptoOrderDetailTapAction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowEstimatedTotalValueBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "sheet", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;)V", "getSheet", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowEstimatedTotalValueBottomSheet extends CryptoOrderDetailTapAction {
        public static final int $stable = 8;
        private final TokenizationEstimatedTotalCostDto sheet;

        public static /* synthetic */ ShowEstimatedTotalValueBottomSheet copy$default(ShowEstimatedTotalValueBottomSheet showEstimatedTotalValueBottomSheet, TokenizationEstimatedTotalCostDto tokenizationEstimatedTotalCostDto, int i, Object obj) {
            if ((i & 1) != 0) {
                tokenizationEstimatedTotalCostDto = showEstimatedTotalValueBottomSheet.sheet;
            }
            return showEstimatedTotalValueBottomSheet.copy(tokenizationEstimatedTotalCostDto);
        }

        /* renamed from: component1, reason: from getter */
        public final TokenizationEstimatedTotalCostDto getSheet() {
            return this.sheet;
        }

        public final ShowEstimatedTotalValueBottomSheet copy(TokenizationEstimatedTotalCostDto sheet) {
            Intrinsics.checkNotNullParameter(sheet, "sheet");
            return new ShowEstimatedTotalValueBottomSheet(sheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowEstimatedTotalValueBottomSheet) && Intrinsics.areEqual(this.sheet, ((ShowEstimatedTotalValueBottomSheet) other).sheet);
        }

        public int hashCode() {
            return this.sheet.hashCode();
        }

        public String toString() {
            return "ShowEstimatedTotalValueBottomSheet(sheet=" + this.sheet + ")";
        }

        public final TokenizationEstimatedTotalCostDto getSheet() {
            return this.sheet;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowEstimatedTotalValueBottomSheet(TokenizationEstimatedTotalCostDto sheet) {
            super(null);
            Intrinsics.checkNotNullParameter(sheet, "sheet");
            this.sheet = sheet;
        }
    }

    /* compiled from: CryptoOrderDetailTapAction.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction$ShowPnlTradeDetailsBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "profitAndLossTradeItem", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "isPnlUpdatesEnabled", "", "accountNumber", "", "<init>", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLjava/lang/String;)V", "getProfitAndLossTradeItem", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "()Z", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowPnlTradeDetailsBottomSheet extends CryptoOrderDetailTapAction {
        public static final int $stable = 8;
        private final String accountNumber;
        private final boolean isPnlUpdatesEnabled;
        private final ProfitAndLossTradeItem profitAndLossTradeItem;

        public static /* synthetic */ ShowPnlTradeDetailsBottomSheet copy$default(ShowPnlTradeDetailsBottomSheet showPnlTradeDetailsBottomSheet, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                profitAndLossTradeItem = showPnlTradeDetailsBottomSheet.profitAndLossTradeItem;
            }
            if ((i & 2) != 0) {
                z = showPnlTradeDetailsBottomSheet.isPnlUpdatesEnabled;
            }
            if ((i & 4) != 0) {
                str = showPnlTradeDetailsBottomSheet.accountNumber;
            }
            return showPnlTradeDetailsBottomSheet.copy(profitAndLossTradeItem, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ProfitAndLossTradeItem getProfitAndLossTradeItem() {
            return this.profitAndLossTradeItem;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPnlUpdatesEnabled() {
            return this.isPnlUpdatesEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ShowPnlTradeDetailsBottomSheet copy(ProfitAndLossTradeItem profitAndLossTradeItem, boolean isPnlUpdatesEnabled, String accountNumber) {
            Intrinsics.checkNotNullParameter(profitAndLossTradeItem, "profitAndLossTradeItem");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new ShowPnlTradeDetailsBottomSheet(profitAndLossTradeItem, isPnlUpdatesEnabled, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowPnlTradeDetailsBottomSheet)) {
                return false;
            }
            ShowPnlTradeDetailsBottomSheet showPnlTradeDetailsBottomSheet = (ShowPnlTradeDetailsBottomSheet) other;
            return Intrinsics.areEqual(this.profitAndLossTradeItem, showPnlTradeDetailsBottomSheet.profitAndLossTradeItem) && this.isPnlUpdatesEnabled == showPnlTradeDetailsBottomSheet.isPnlUpdatesEnabled && Intrinsics.areEqual(this.accountNumber, showPnlTradeDetailsBottomSheet.accountNumber);
        }

        public int hashCode() {
            return (((this.profitAndLossTradeItem.hashCode() * 31) + Boolean.hashCode(this.isPnlUpdatesEnabled)) * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "ShowPnlTradeDetailsBottomSheet(profitAndLossTradeItem=" + this.profitAndLossTradeItem + ", isPnlUpdatesEnabled=" + this.isPnlUpdatesEnabled + ", accountNumber=" + this.accountNumber + ")";
        }

        public final ProfitAndLossTradeItem getProfitAndLossTradeItem() {
            return this.profitAndLossTradeItem;
        }

        public final boolean isPnlUpdatesEnabled() {
            return this.isPnlUpdatesEnabled;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPnlTradeDetailsBottomSheet(ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, String accountNumber) {
            super(null);
            Intrinsics.checkNotNullParameter(profitAndLossTradeItem, "profitAndLossTradeItem");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.profitAndLossTradeItem = profitAndLossTradeItem;
            this.isPnlUpdatesEnabled = z;
            this.accountNumber = accountNumber;
        }
    }
}
