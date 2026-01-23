package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.shared.crypto.p375ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeSelectorEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "", "<init>", "()V", "EnterRecurringOrderFlow", "ShowRecurringIneligibleAlert", "ShowCryptoFeeUnsupportedRecurringAlert", "DismissTypeSelectorFragment", "OrderTypeSelected", "EnterTaxLotOrderFlow", "ShowTaxLotOrderDisabledAlert", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$DismissTypeSelectorFragment;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$EnterRecurringOrderFlow;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$EnterTaxLotOrderFlow;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$OrderTypeSelected;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$ShowCryptoFeeUnsupportedRecurringAlert;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$ShowRecurringIneligibleAlert;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$ShowTaxLotOrderDisabledAlert;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoOrderTypeSelectorEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoOrderTypeSelectorEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoOrderTypeSelectorEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$EnterRecurringOrderFlow;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EnterRecurringOrderFlow extends CryptoOrderTypeSelectorEvent {
        public static final int $stable = 0;
        public static final EnterRecurringOrderFlow INSTANCE = new EnterRecurringOrderFlow();

        public boolean equals(Object other) {
            return this == other || (other instanceof EnterRecurringOrderFlow);
        }

        public int hashCode() {
            return -926029169;
        }

        public String toString() {
            return "EnterRecurringOrderFlow";
        }

        private EnterRecurringOrderFlow() {
            super(null);
        }
    }

    private CryptoOrderTypeSelectorEvent() {
    }

    /* compiled from: CryptoOrderTypeSelectorEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$ShowRecurringIneligibleAlert;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "reason", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;", "<init>", "(Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;)V", "getReason", "()Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowRecurringIneligibleAlert extends CryptoOrderTypeSelectorEvent {
        public static final int $stable = 8;
        private final InstrumentRecurringTradability.RecurringTradableReason reason;

        public static /* synthetic */ ShowRecurringIneligibleAlert copy$default(ShowRecurringIneligibleAlert showRecurringIneligibleAlert, InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason, int i, Object obj) {
            if ((i & 1) != 0) {
                recurringTradableReason = showRecurringIneligibleAlert.reason;
            }
            return showRecurringIneligibleAlert.copy(recurringTradableReason);
        }

        /* renamed from: component1, reason: from getter */
        public final InstrumentRecurringTradability.RecurringTradableReason getReason() {
            return this.reason;
        }

        public final ShowRecurringIneligibleAlert copy(InstrumentRecurringTradability.RecurringTradableReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new ShowRecurringIneligibleAlert(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowRecurringIneligibleAlert) && Intrinsics.areEqual(this.reason, ((ShowRecurringIneligibleAlert) other).reason);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "ShowRecurringIneligibleAlert(reason=" + this.reason + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowRecurringIneligibleAlert(InstrumentRecurringTradability.RecurringTradableReason reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final InstrumentRecurringTradability.RecurringTradableReason getReason() {
            return this.reason;
        }
    }

    /* compiled from: CryptoOrderTypeSelectorEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$ShowCryptoFeeUnsupportedRecurringAlert;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "assetCurrencyCode", "", "positiveAction", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;)V", "getAssetCurrencyCode", "()Ljava/lang/String;", "getPositiveAction", "()Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowCryptoFeeUnsupportedRecurringAlert extends CryptoOrderTypeSelectorEvent {
        public static final int $stable = 0;
        private final String assetCurrencyCode;
        private final CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction positiveAction;

        public static /* synthetic */ ShowCryptoFeeUnsupportedRecurringAlert copy$default(ShowCryptoFeeUnsupportedRecurringAlert showCryptoFeeUnsupportedRecurringAlert, String str, CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction positiveAction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showCryptoFeeUnsupportedRecurringAlert.assetCurrencyCode;
            }
            if ((i & 2) != 0) {
                positiveAction = showCryptoFeeUnsupportedRecurringAlert.positiveAction;
            }
            return showCryptoFeeUnsupportedRecurringAlert.copy(str, positiveAction);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction getPositiveAction() {
            return this.positiveAction;
        }

        public final ShowCryptoFeeUnsupportedRecurringAlert copy(String assetCurrencyCode, CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction positiveAction) {
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            Intrinsics.checkNotNullParameter(positiveAction, "positiveAction");
            return new ShowCryptoFeeUnsupportedRecurringAlert(assetCurrencyCode, positiveAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowCryptoFeeUnsupportedRecurringAlert)) {
                return false;
            }
            ShowCryptoFeeUnsupportedRecurringAlert showCryptoFeeUnsupportedRecurringAlert = (ShowCryptoFeeUnsupportedRecurringAlert) other;
            return Intrinsics.areEqual(this.assetCurrencyCode, showCryptoFeeUnsupportedRecurringAlert.assetCurrencyCode) && this.positiveAction == showCryptoFeeUnsupportedRecurringAlert.positiveAction;
        }

        public int hashCode() {
            return (this.assetCurrencyCode.hashCode() * 31) + this.positiveAction.hashCode();
        }

        public String toString() {
            return "ShowCryptoFeeUnsupportedRecurringAlert(assetCurrencyCode=" + this.assetCurrencyCode + ", positiveAction=" + this.positiveAction + ")";
        }

        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }

        public final CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction getPositiveAction() {
            return this.positiveAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCryptoFeeUnsupportedRecurringAlert(String assetCurrencyCode, CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction positiveAction) {
            super(null);
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            Intrinsics.checkNotNullParameter(positiveAction, "positiveAction");
            this.assetCurrencyCode = assetCurrencyCode;
            this.positiveAction = positiveAction;
        }
    }

    /* compiled from: CryptoOrderTypeSelectorEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$DismissTypeSelectorFragment;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissTypeSelectorFragment extends CryptoOrderTypeSelectorEvent {
        public static final int $stable = 0;
        public static final DismissTypeSelectorFragment INSTANCE = new DismissTypeSelectorFragment();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissTypeSelectorFragment);
        }

        public int hashCode() {
            return -215594325;
        }

        public String toString() {
            return "DismissTypeSelectorFragment";
        }

        private DismissTypeSelectorFragment() {
            super(null);
        }
    }

    /* compiled from: CryptoOrderTypeSelectorEvent.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$OrderTypeSelected;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "type", "Lcom/robinhood/models/api/CryptoOrderType;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/api/CryptoOrderType;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getType", "()Lcom/robinhood/models/api/CryptoOrderType;", "getInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderTypeSelected extends CryptoOrderTypeSelectorEvent {
        public static final int $stable = 8;
        private final CryptoInputMode inputMode;
        private final CryptoOrderType type;
        private final UiCurrencyPair uiCurrencyPair;

        public static /* synthetic */ OrderTypeSelected copy$default(OrderTypeSelected orderTypeSelected, UiCurrencyPair uiCurrencyPair, CryptoOrderType cryptoOrderType, CryptoInputMode cryptoInputMode, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = orderTypeSelected.uiCurrencyPair;
            }
            if ((i & 2) != 0) {
                cryptoOrderType = orderTypeSelected.type;
            }
            if ((i & 4) != 0) {
                cryptoInputMode = orderTypeSelected.inputMode;
            }
            return orderTypeSelected.copy(uiCurrencyPair, cryptoOrderType, cryptoInputMode);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoOrderType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoInputMode getInputMode() {
            return this.inputMode;
        }

        public final OrderTypeSelected copy(UiCurrencyPair uiCurrencyPair, CryptoOrderType type2, CryptoInputMode inputMode) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new OrderTypeSelected(uiCurrencyPair, type2, inputMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderTypeSelected)) {
                return false;
            }
            OrderTypeSelected orderTypeSelected = (OrderTypeSelected) other;
            return Intrinsics.areEqual(this.uiCurrencyPair, orderTypeSelected.uiCurrencyPair) && this.type == orderTypeSelected.type && this.inputMode == orderTypeSelected.inputMode;
        }

        public int hashCode() {
            int iHashCode = ((this.uiCurrencyPair.hashCode() * 31) + this.type.hashCode()) * 31;
            CryptoInputMode cryptoInputMode = this.inputMode;
            return iHashCode + (cryptoInputMode == null ? 0 : cryptoInputMode.hashCode());
        }

        public String toString() {
            return "OrderTypeSelected(uiCurrencyPair=" + this.uiCurrencyPair + ", type=" + this.type + ", inputMode=" + this.inputMode + ")";
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final CryptoOrderType getType() {
            return this.type;
        }

        public final CryptoInputMode getInputMode() {
            return this.inputMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderTypeSelected(UiCurrencyPair uiCurrencyPair, CryptoOrderType type2, CryptoInputMode cryptoInputMode) {
            super(null);
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.uiCurrencyPair = uiCurrencyPair;
            this.type = type2;
            this.inputMode = cryptoInputMode;
        }
    }

    /* compiled from: CryptoOrderTypeSelectorEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$EnterTaxLotOrderFlow;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EnterTaxLotOrderFlow extends CryptoOrderTypeSelectorEvent {
        public static final int $stable = 0;
        public static final EnterTaxLotOrderFlow INSTANCE = new EnterTaxLotOrderFlow();

        public boolean equals(Object other) {
            return this == other || (other instanceof EnterTaxLotOrderFlow);
        }

        public int hashCode() {
            return -1388261562;
        }

        public String toString() {
            return "EnterTaxLotOrderFlow";
        }

        private EnterTaxLotOrderFlow() {
            super(null);
        }
    }

    /* compiled from: CryptoOrderTypeSelectorEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent$ShowTaxLotOrderDisabledAlert;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "title", "", "message", "dismissCtaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getDismissCtaText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTaxLotOrderDisabledAlert extends CryptoOrderTypeSelectorEvent {
        public static final int $stable = 0;
        private final String dismissCtaText;
        private final String message;
        private final String title;

        public static /* synthetic */ ShowTaxLotOrderDisabledAlert copy$default(ShowTaxLotOrderDisabledAlert showTaxLotOrderDisabledAlert, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showTaxLotOrderDisabledAlert.title;
            }
            if ((i & 2) != 0) {
                str2 = showTaxLotOrderDisabledAlert.message;
            }
            if ((i & 4) != 0) {
                str3 = showTaxLotOrderDisabledAlert.dismissCtaText;
            }
            return showTaxLotOrderDisabledAlert.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDismissCtaText() {
            return this.dismissCtaText;
        }

        public final ShowTaxLotOrderDisabledAlert copy(String title, String message, String dismissCtaText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(dismissCtaText, "dismissCtaText");
            return new ShowTaxLotOrderDisabledAlert(title, message, dismissCtaText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowTaxLotOrderDisabledAlert)) {
                return false;
            }
            ShowTaxLotOrderDisabledAlert showTaxLotOrderDisabledAlert = (ShowTaxLotOrderDisabledAlert) other;
            return Intrinsics.areEqual(this.title, showTaxLotOrderDisabledAlert.title) && Intrinsics.areEqual(this.message, showTaxLotOrderDisabledAlert.message) && Intrinsics.areEqual(this.dismissCtaText, showTaxLotOrderDisabledAlert.dismissCtaText);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.dismissCtaText.hashCode();
        }

        public String toString() {
            return "ShowTaxLotOrderDisabledAlert(title=" + this.title + ", message=" + this.message + ", dismissCtaText=" + this.dismissCtaText + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getDismissCtaText() {
            return this.dismissCtaText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTaxLotOrderDisabledAlert(String title, String message, String dismissCtaText) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(dismissCtaText, "dismissCtaText");
            this.title = title;
            this.message = message;
            this.dismissCtaText = dismissCtaText;
        }
    }
}
