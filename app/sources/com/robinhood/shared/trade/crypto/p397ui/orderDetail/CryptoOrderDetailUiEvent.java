package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.portfolio.contracts.PnlTradeDetailDialogFragmentKey;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderDetailUiEvent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "", "<init>", "()V", "ShowFeeDefinitionBottomSheet", "ShowNotionalPriceBottomSheet", "ShowRecurringCollarExplanationDialog", "ShowTradeBonusBottomSheet", "ShowCryptoOrderDetailTaxLots", "ShowPnlTradeDetailsBottomSheet", "ShowTradingBottomSheet", "CancelCryptoOrderResult", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowCryptoOrderDetailTaxLots;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowNotionalPriceBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowPnlTradeDetailsBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowRecurringCollarExplanationDialog;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowTradingBottomSheet;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoOrderDetailUiEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoOrderDetailUiEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoOrderDetailUiEvent() {
    }

    /* compiled from: CryptoOrderDetailUiEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "args", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;)V", "getArgs", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFeeDefinitionBottomSheet extends CryptoOrderDetailUiEvent {
        public static final int $stable = 8;
        private final CryptoFeeDefinitionBottomSheetFragment.Args args;

        public static /* synthetic */ ShowFeeDefinitionBottomSheet copy$default(ShowFeeDefinitionBottomSheet showFeeDefinitionBottomSheet, CryptoFeeDefinitionBottomSheetFragment.Args args, int i, Object obj) {
            if ((i & 1) != 0) {
                args = showFeeDefinitionBottomSheet.args;
            }
            return showFeeDefinitionBottomSheet.copy(args);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoFeeDefinitionBottomSheetFragment.Args getArgs() {
            return this.args;
        }

        public final ShowFeeDefinitionBottomSheet copy(CryptoFeeDefinitionBottomSheetFragment.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new ShowFeeDefinitionBottomSheet(args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFeeDefinitionBottomSheet) && Intrinsics.areEqual(this.args, ((ShowFeeDefinitionBottomSheet) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "ShowFeeDefinitionBottomSheet(args=" + this.args + ")";
        }

        public final CryptoFeeDefinitionBottomSheetFragment.Args getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFeeDefinitionBottomSheet(CryptoFeeDefinitionBottomSheetFragment.Args args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }
    }

    /* compiled from: CryptoOrderDetailUiEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowNotionalPriceBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowNotionalPriceBottomSheet extends CryptoOrderDetailUiEvent {
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

    /* compiled from: CryptoOrderDetailUiEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowRecurringCollarExplanationDialog;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowRecurringCollarExplanationDialog extends CryptoOrderDetailUiEvent {
        public static final int $stable = 0;
        public static final ShowRecurringCollarExplanationDialog INSTANCE = new ShowRecurringCollarExplanationDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowRecurringCollarExplanationDialog);
        }

        public int hashCode() {
            return -694274640;
        }

        public String toString() {
            return "ShowRecurringCollarExplanationDialog";
        }

        private ShowRecurringCollarExplanationDialog() {
            super(null);
        }
    }

    /* compiled from: CryptoOrderDetailUiEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "isEstimate", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen$Name;Lcom/robinhood/models/crypto/ui/UiCryptoOrder;Z)V", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getUiCryptoOrder", "()Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTradeBonusBottomSheet extends CryptoOrderDetailUiEvent {
        public static final int $stable = 8;
        private final boolean isEstimate;
        private final Screen.Name screenName;
        private final UiCryptoOrder uiCryptoOrder;

        public static /* synthetic */ ShowTradeBonusBottomSheet copy$default(ShowTradeBonusBottomSheet showTradeBonusBottomSheet, Screen.Name name, UiCryptoOrder uiCryptoOrder, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                name = showTradeBonusBottomSheet.screenName;
            }
            if ((i & 2) != 0) {
                uiCryptoOrder = showTradeBonusBottomSheet.uiCryptoOrder;
            }
            if ((i & 4) != 0) {
                z = showTradeBonusBottomSheet.isEstimate;
            }
            return showTradeBonusBottomSheet.copy(name, uiCryptoOrder, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Screen.Name getScreenName() {
            return this.screenName;
        }

        /* renamed from: component2, reason: from getter */
        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEstimate() {
            return this.isEstimate;
        }

        public final ShowTradeBonusBottomSheet copy(Screen.Name screenName, UiCryptoOrder uiCryptoOrder, boolean isEstimate) {
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            return new ShowTradeBonusBottomSheet(screenName, uiCryptoOrder, isEstimate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowTradeBonusBottomSheet)) {
                return false;
            }
            ShowTradeBonusBottomSheet showTradeBonusBottomSheet = (ShowTradeBonusBottomSheet) other;
            return this.screenName == showTradeBonusBottomSheet.screenName && Intrinsics.areEqual(this.uiCryptoOrder, showTradeBonusBottomSheet.uiCryptoOrder) && this.isEstimate == showTradeBonusBottomSheet.isEstimate;
        }

        public int hashCode() {
            return (((this.screenName.hashCode() * 31) + this.uiCryptoOrder.hashCode()) * 31) + Boolean.hashCode(this.isEstimate);
        }

        public String toString() {
            return "ShowTradeBonusBottomSheet(screenName=" + this.screenName + ", uiCryptoOrder=" + this.uiCryptoOrder + ", isEstimate=" + this.isEstimate + ")";
        }

        public final Screen.Name getScreenName() {
            return this.screenName;
        }

        public final UiCryptoOrder getUiCryptoOrder() {
            return this.uiCryptoOrder;
        }

        public final boolean isEstimate() {
            return this.isEstimate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTradeBonusBottomSheet(Screen.Name screenName, UiCryptoOrder uiCryptoOrder, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
            this.screenName = screenName;
            this.uiCryptoOrder = uiCryptoOrder;
            this.isEstimate = z;
        }
    }

    /* compiled from: CryptoOrderDetailUiEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowCryptoOrderDetailTaxLots;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "fragmentKey", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsFragmentKey;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsFragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowCryptoOrderDetailTaxLots extends CryptoOrderDetailUiEvent {
        public static final int $stable = 8;
        private final CryptoOrderDetailTaxLotsFragmentKey fragmentKey;

        public static /* synthetic */ ShowCryptoOrderDetailTaxLots copy$default(ShowCryptoOrderDetailTaxLots showCryptoOrderDetailTaxLots, CryptoOrderDetailTaxLotsFragmentKey cryptoOrderDetailTaxLotsFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderDetailTaxLotsFragmentKey = showCryptoOrderDetailTaxLots.fragmentKey;
            }
            return showCryptoOrderDetailTaxLots.copy(cryptoOrderDetailTaxLotsFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderDetailTaxLotsFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final ShowCryptoOrderDetailTaxLots copy(CryptoOrderDetailTaxLotsFragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ShowCryptoOrderDetailTaxLots(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowCryptoOrderDetailTaxLots) && Intrinsics.areEqual(this.fragmentKey, ((ShowCryptoOrderDetailTaxLots) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "ShowCryptoOrderDetailTaxLots(fragmentKey=" + this.fragmentKey + ")";
        }

        public final CryptoOrderDetailTaxLotsFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCryptoOrderDetailTaxLots(CryptoOrderDetailTaxLotsFragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }
    }

    /* compiled from: CryptoOrderDetailUiEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowPnlTradeDetailsBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "fragmentKey", "Lcom/robinhood/android/portfolio/contracts/PnlTradeDetailDialogFragmentKey;", "<init>", "(Lcom/robinhood/android/portfolio/contracts/PnlTradeDetailDialogFragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/portfolio/contracts/PnlTradeDetailDialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowPnlTradeDetailsBottomSheet extends CryptoOrderDetailUiEvent {
        public static final int $stable = 8;
        private final PnlTradeDetailDialogFragmentKey fragmentKey;

        public static /* synthetic */ ShowPnlTradeDetailsBottomSheet copy$default(ShowPnlTradeDetailsBottomSheet showPnlTradeDetailsBottomSheet, PnlTradeDetailDialogFragmentKey pnlTradeDetailDialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                pnlTradeDetailDialogFragmentKey = showPnlTradeDetailsBottomSheet.fragmentKey;
            }
            return showPnlTradeDetailsBottomSheet.copy(pnlTradeDetailDialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final PnlTradeDetailDialogFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final ShowPnlTradeDetailsBottomSheet copy(PnlTradeDetailDialogFragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ShowPnlTradeDetailsBottomSheet(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowPnlTradeDetailsBottomSheet) && Intrinsics.areEqual(this.fragmentKey, ((ShowPnlTradeDetailsBottomSheet) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "ShowPnlTradeDetailsBottomSheet(fragmentKey=" + this.fragmentKey + ")";
        }

        public final PnlTradeDetailDialogFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPnlTradeDetailsBottomSheet(PnlTradeDetailDialogFragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }
    }

    /* compiled from: CryptoOrderDetailUiEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$ShowTradingBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTradingBottomSheet extends CryptoOrderDetailUiEvent {
        public static final int $stable = 8;
        private final DialogFragmentKey fragmentKey;

        public static /* synthetic */ ShowTradingBottomSheet copy$default(ShowTradingBottomSheet showTradingBottomSheet, DialogFragmentKey dialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogFragmentKey = showTradingBottomSheet.fragmentKey;
            }
            return showTradingBottomSheet.copy(dialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final ShowTradingBottomSheet copy(DialogFragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ShowTradingBottomSheet(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowTradingBottomSheet) && Intrinsics.areEqual(this.fragmentKey, ((ShowTradingBottomSheet) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "ShowTradingBottomSheet(fragmentKey=" + this.fragmentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTradingBottomSheet(DialogFragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final DialogFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: CryptoOrderDetailUiEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "<init>", "()V", "Failed", "Sent", "Canceled", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult$Canceled;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult$Failed;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult$Sent;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class CancelCryptoOrderResult extends CryptoOrderDetailUiEvent {
        public static final int $stable = 0;

        public /* synthetic */ CancelCryptoOrderResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CryptoOrderDetailUiEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult$Failed;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failed extends CancelCryptoOrderResult {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = failed.throwable;
                }
                return failed.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Failed copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Failed(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failed) && Intrinsics.areEqual(this.throwable, ((Failed) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Failed(throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        private CancelCryptoOrderResult() {
            super(null);
        }

        /* compiled from: CryptoOrderDetailUiEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult$Sent;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Sent extends CancelCryptoOrderResult {
            public static final int $stable = 0;
            public static final Sent INSTANCE = new Sent();

            public boolean equals(Object other) {
                return this == other || (other instanceof Sent);
            }

            public int hashCode() {
                return 1024786626;
            }

            public String toString() {
                return "Sent";
            }

            private Sent() {
                super(null);
            }
        }

        /* compiled from: CryptoOrderDetailUiEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult$Canceled;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent$CancelCryptoOrderResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Canceled extends CancelCryptoOrderResult {
            public static final int $stable = 0;
            public static final Canceled INSTANCE = new Canceled();

            public boolean equals(Object other) {
                return this == other || (other instanceof Canceled);
            }

            public int hashCode() {
                return 1658261699;
            }

            public String toString() {
                return "Canceled";
            }

            private Canceled() {
                super(null);
            }
        }
    }
}
