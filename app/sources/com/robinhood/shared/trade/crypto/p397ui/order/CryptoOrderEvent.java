package com.robinhood.shared.trade.crypto.p397ui.order;

import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.serverdriven.experimental.api.CryptoValidateOrderAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider4;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.StaticInputs;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoOrderEvent.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "", "<init>", "()V", "DisplayCryptoFeeTooltip", "ShowOrderScreen", "StartActivity", "ValidationFailureAlert", "ShowEducationScreen", "ShowFeeDefinitionBottomSheet", "DismissFeeDefinitionBottomSheet", "ShowTradeBonusBottomSheet", "ShowSduiValidationAlert", "HandleCryptoFeeEventType", "ApplyFeeUnsupportedForCurrencyPairUiTreatment", "UpdateAmount", "ShowFragmentInActivity", "ShowDialogFragment", "ShowAlertDto", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ApplyFeeUnsupportedForCurrencyPairUiTreatment;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$DismissFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$DisplayCryptoFeeTooltip;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$HandleCryptoFeeEventType;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowAlertDto;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowEducationScreen;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowFragmentInActivity;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowOrderScreen;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowSduiValidationAlert;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$StartActivity;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$UpdateAmount;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ValidationFailureAlert;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoOrderEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoOrderEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoOrderEvent() {
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$DisplayCryptoFeeTooltip;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisplayCryptoFeeTooltip extends CryptoOrderEvent {
        public static final int $stable = 0;
        public static final DisplayCryptoFeeTooltip INSTANCE = new DisplayCryptoFeeTooltip();

        public boolean equals(Object other) {
            return this == other || (other instanceof DisplayCryptoFeeTooltip);
        }

        public int hashCode() {
            return 959435626;
        }

        public String toString() {
            return "DisplayCryptoFeeTooltip";
        }

        private DisplayCryptoFeeTooltip() {
            super(null);
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowOrderScreen;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "<init>", "(Lcom/robinhood/models/api/CryptoOrderType;)V", "getOrderType", "()Lcom/robinhood/models/api/CryptoOrderType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowOrderScreen extends CryptoOrderEvent {
        public static final int $stable = 0;
        private final CryptoOrderType orderType;

        public static /* synthetic */ ShowOrderScreen copy$default(ShowOrderScreen showOrderScreen, CryptoOrderType cryptoOrderType, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderType = showOrderScreen.orderType;
            }
            return showOrderScreen.copy(cryptoOrderType);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderType getOrderType() {
            return this.orderType;
        }

        public final ShowOrderScreen copy(CryptoOrderType orderType) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new ShowOrderScreen(orderType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowOrderScreen) && this.orderType == ((ShowOrderScreen) other).orderType;
        }

        public int hashCode() {
            return this.orderType.hashCode();
        }

        public String toString() {
            return "ShowOrderScreen(orderType=" + this.orderType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowOrderScreen(CryptoOrderType orderType) {
            super(null);
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.orderType = orderType;
        }

        public final CryptoOrderType getOrderType() {
            return this.orderType;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$StartActivity;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartActivity extends CryptoOrderEvent {
        public static final int $stable = 8;
        private final IntentKey intentKey;

        public static /* synthetic */ StartActivity copy$default(StartActivity startActivity, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = startActivity.intentKey;
            }
            return startActivity.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getIntentKey() {
            return this.intentKey;
        }

        public final StartActivity copy(IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            return new StartActivity(intentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartActivity) && Intrinsics.areEqual(this.intentKey, ((StartActivity) other).intentKey);
        }

        public int hashCode() {
            return this.intentKey.hashCode();
        }

        public String toString() {
            return "StartActivity(intentKey=" + this.intentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartActivity(IntentKey intentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            this.intentKey = intentKey;
        }

        public final IntentKey getIntentKey() {
            return this.intentKey;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ValidationFailureAlert;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "orderContext", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator$Failure;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)V", "getFailure", "()Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "getOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationFailureAlert extends CryptoOrderEvent {
        public static final int $stable = 8;
        private final Validator.Failure<CryptoOrderContext, CryptoOrderValidator3> failure;
        private final CryptoOrderContext orderContext;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidationFailureAlert copy$default(ValidationFailureAlert validationFailureAlert, Validator.Failure failure, CryptoOrderContext cryptoOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                failure = validationFailureAlert.failure;
            }
            if ((i & 2) != 0) {
                cryptoOrderContext = validationFailureAlert.orderContext;
            }
            return validationFailureAlert.copy(failure, cryptoOrderContext);
        }

        public final Validator.Failure<CryptoOrderContext, CryptoOrderValidator3> component1() {
            return this.failure;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoOrderContext getOrderContext() {
            return this.orderContext;
        }

        public final ValidationFailureAlert copy(Validator.Failure<? super CryptoOrderContext, ? super CryptoOrderValidator3> failure, CryptoOrderContext orderContext) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            return new ValidationFailureAlert(failure, orderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationFailureAlert)) {
                return false;
            }
            ValidationFailureAlert validationFailureAlert = (ValidationFailureAlert) other;
            return Intrinsics.areEqual(this.failure, validationFailureAlert.failure) && Intrinsics.areEqual(this.orderContext, validationFailureAlert.orderContext);
        }

        public int hashCode() {
            return (this.failure.hashCode() * 31) + this.orderContext.hashCode();
        }

        public String toString() {
            return "ValidationFailureAlert(failure=" + this.failure + ", orderContext=" + this.orderContext + ")";
        }

        public final Validator.Failure<CryptoOrderContext, CryptoOrderValidator3> getFailure() {
            return this.failure;
        }

        public final CryptoOrderContext getOrderContext() {
            return this.orderContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ValidationFailureAlert(Validator.Failure<? super CryptoOrderContext, ? super CryptoOrderValidator3> failure, CryptoOrderContext orderContext) {
            super(null);
            Intrinsics.checkNotNullParameter(failure, "failure");
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            this.failure = failure;
            this.orderContext = orderContext;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowEducationScreen;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderSide;)V", "getConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowEducationScreen extends CryptoOrderEvent {
        public static final int $stable = 0;
        private final Order.Configuration configuration;
        private final OrderSide orderSide;

        public static /* synthetic */ ShowEducationScreen copy$default(ShowEducationScreen showEducationScreen, Order.Configuration configuration, OrderSide orderSide, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = showEducationScreen.configuration;
            }
            if ((i & 2) != 0) {
                orderSide = showEducationScreen.orderSide;
            }
            return showEducationScreen.copy(configuration, orderSide);
        }

        /* renamed from: component1, reason: from getter */
        public final Order.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        public final ShowEducationScreen copy(Order.Configuration configuration, OrderSide orderSide) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            return new ShowEducationScreen(configuration, orderSide);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowEducationScreen)) {
                return false;
            }
            ShowEducationScreen showEducationScreen = (ShowEducationScreen) other;
            return this.configuration == showEducationScreen.configuration && this.orderSide == showEducationScreen.orderSide;
        }

        public int hashCode() {
            return (this.configuration.hashCode() * 31) + this.orderSide.hashCode();
        }

        public String toString() {
            return "ShowEducationScreen(configuration=" + this.configuration + ", orderSide=" + this.orderSide + ")";
        }

        public final Order.Configuration getConfiguration() {
            return this.configuration;
        }

        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowEducationScreen(Order.Configuration configuration, OrderSide orderSide) {
            super(null);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            this.configuration = configuration;
            this.orderSide = orderSide;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "args", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;)V", "getArgs", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFeeDefinitionBottomSheet extends CryptoOrderEvent {
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

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$DismissFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissFeeDefinitionBottomSheet extends CryptoOrderEvent {
        public static final int $stable = 0;
        public static final DismissFeeDefinitionBottomSheet INSTANCE = new DismissFeeDefinitionBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissFeeDefinitionBottomSheet);
        }

        public int hashCode() {
            return -1751459153;
        }

        public String toString() {
            return "DismissFeeDefinitionBottomSheet";
        }

        private DismissFeeDefinitionBottomSheet() {
            super(null);
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowTradeBonusBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "staticInputs", "Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "<init>", "(Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;)V", "getStaticInputs", "()Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTradeBonusBottomSheet extends CryptoOrderEvent {
        public static final int $stable = 8;
        private final RequestInputs requestInputs;
        private final StaticInputs staticInputs;

        public static /* synthetic */ ShowTradeBonusBottomSheet copy$default(ShowTradeBonusBottomSheet showTradeBonusBottomSheet, StaticInputs staticInputs, RequestInputs requestInputs, int i, Object obj) {
            if ((i & 1) != 0) {
                staticInputs = showTradeBonusBottomSheet.staticInputs;
            }
            if ((i & 2) != 0) {
                requestInputs = showTradeBonusBottomSheet.requestInputs;
            }
            return showTradeBonusBottomSheet.copy(staticInputs, requestInputs);
        }

        /* renamed from: component1, reason: from getter */
        public final StaticInputs getStaticInputs() {
            return this.staticInputs;
        }

        /* renamed from: component2, reason: from getter */
        public final RequestInputs getRequestInputs() {
            return this.requestInputs;
        }

        public final ShowTradeBonusBottomSheet copy(StaticInputs staticInputs, RequestInputs requestInputs) {
            Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            return new ShowTradeBonusBottomSheet(staticInputs, requestInputs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowTradeBonusBottomSheet)) {
                return false;
            }
            ShowTradeBonusBottomSheet showTradeBonusBottomSheet = (ShowTradeBonusBottomSheet) other;
            return Intrinsics.areEqual(this.staticInputs, showTradeBonusBottomSheet.staticInputs) && Intrinsics.areEqual(this.requestInputs, showTradeBonusBottomSheet.requestInputs);
        }

        public int hashCode() {
            return (this.staticInputs.hashCode() * 31) + this.requestInputs.hashCode();
        }

        public String toString() {
            return "ShowTradeBonusBottomSheet(staticInputs=" + this.staticInputs + ", requestInputs=" + this.requestInputs + ")";
        }

        public final StaticInputs getStaticInputs() {
            return this.staticInputs;
        }

        public final RequestInputs getRequestInputs() {
            return this.requestInputs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowTradeBonusBottomSheet(StaticInputs staticInputs, RequestInputs requestInputs) {
            super(null);
            Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            this.staticInputs = staticInputs;
            this.requestInputs = requestInputs;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowSduiValidationAlert;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSduiValidationAlert extends CryptoOrderEvent {
        public static final int $stable = 8;
        private final GenericAlertContent<CryptoValidateOrderAction> content;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowSduiValidationAlert copy$default(ShowSduiValidationAlert showSduiValidationAlert, GenericAlertContent genericAlertContent, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlertContent = showSduiValidationAlert.content;
            }
            return showSduiValidationAlert.copy(genericAlertContent);
        }

        public final GenericAlertContent<CryptoValidateOrderAction> component1() {
            return this.content;
        }

        public final ShowSduiValidationAlert copy(GenericAlertContent<? extends CryptoValidateOrderAction> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new ShowSduiValidationAlert(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowSduiValidationAlert) && Intrinsics.areEqual(this.content, ((ShowSduiValidationAlert) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "ShowSduiValidationAlert(content=" + this.content + ")";
        }

        public final GenericAlertContent<CryptoValidateOrderAction> getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowSduiValidationAlert(GenericAlertContent<? extends CryptoValidateOrderAction> content) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$HandleCryptoFeeEventType;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "type", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType$CryptoOrder;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType$CryptoOrder;)V", "getType", "()Lcom/robinhood/shared/trade/crypto/ui/fee/event/EventType$CryptoOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HandleCryptoFeeEventType extends CryptoOrderEvent {
        public static final int $stable = 0;
        private final CryptoFeeUiEventProvider4.CryptoOrder type;

        public static /* synthetic */ HandleCryptoFeeEventType copy$default(HandleCryptoFeeEventType handleCryptoFeeEventType, CryptoFeeUiEventProvider4.CryptoOrder cryptoOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrder = handleCryptoFeeEventType.type;
            }
            return handleCryptoFeeEventType.copy(cryptoOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoFeeUiEventProvider4.CryptoOrder getType() {
            return this.type;
        }

        public final HandleCryptoFeeEventType copy(CryptoFeeUiEventProvider4.CryptoOrder type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new HandleCryptoFeeEventType(type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleCryptoFeeEventType) && Intrinsics.areEqual(this.type, ((HandleCryptoFeeEventType) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "HandleCryptoFeeEventType(type=" + this.type + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleCryptoFeeEventType(CryptoFeeUiEventProvider4.CryptoOrder type2) {
            super(null);
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
        }

        public final CryptoFeeUiEventProvider4.CryptoOrder getType() {
            return this.type;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ApplyFeeUnsupportedForCurrencyPairUiTreatment;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "assetCurrencyCode", "", "isRebateMarketMakersSupported", "", "<init>", "(Ljava/lang/String;Z)V", "getAssetCurrencyCode", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApplyFeeUnsupportedForCurrencyPairUiTreatment extends CryptoOrderEvent {
        public static final int $stable = 0;
        private final String assetCurrencyCode;
        private final boolean isRebateMarketMakersSupported;

        public static /* synthetic */ ApplyFeeUnsupportedForCurrencyPairUiTreatment copy$default(ApplyFeeUnsupportedForCurrencyPairUiTreatment applyFeeUnsupportedForCurrencyPairUiTreatment, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = applyFeeUnsupportedForCurrencyPairUiTreatment.assetCurrencyCode;
            }
            if ((i & 2) != 0) {
                z = applyFeeUnsupportedForCurrencyPairUiTreatment.isRebateMarketMakersSupported;
            }
            return applyFeeUnsupportedForCurrencyPairUiTreatment.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRebateMarketMakersSupported() {
            return this.isRebateMarketMakersSupported;
        }

        public final ApplyFeeUnsupportedForCurrencyPairUiTreatment copy(String assetCurrencyCode, boolean isRebateMarketMakersSupported) {
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            return new ApplyFeeUnsupportedForCurrencyPairUiTreatment(assetCurrencyCode, isRebateMarketMakersSupported);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplyFeeUnsupportedForCurrencyPairUiTreatment)) {
                return false;
            }
            ApplyFeeUnsupportedForCurrencyPairUiTreatment applyFeeUnsupportedForCurrencyPairUiTreatment = (ApplyFeeUnsupportedForCurrencyPairUiTreatment) other;
            return Intrinsics.areEqual(this.assetCurrencyCode, applyFeeUnsupportedForCurrencyPairUiTreatment.assetCurrencyCode) && this.isRebateMarketMakersSupported == applyFeeUnsupportedForCurrencyPairUiTreatment.isRebateMarketMakersSupported;
        }

        public int hashCode() {
            return (this.assetCurrencyCode.hashCode() * 31) + Boolean.hashCode(this.isRebateMarketMakersSupported);
        }

        public String toString() {
            return "ApplyFeeUnsupportedForCurrencyPairUiTreatment(assetCurrencyCode=" + this.assetCurrencyCode + ", isRebateMarketMakersSupported=" + this.isRebateMarketMakersSupported + ")";
        }

        public final String getAssetCurrencyCode() {
            return this.assetCurrencyCode;
        }

        public final boolean isRebateMarketMakersSupported() {
            return this.isRebateMarketMakersSupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplyFeeUnsupportedForCurrencyPairUiTreatment(String assetCurrencyCode, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
            this.assetCurrencyCode = assetCurrencyCode;
            this.isRebateMarketMakersSupported = z;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$UpdateAmount;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "formattedAmount", "", "<init>", "(Ljava/lang/String;)V", "getFormattedAmount", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateAmount extends CryptoOrderEvent {
        public static final int $stable = 0;
        private final String formattedAmount;

        public static /* synthetic */ UpdateAmount copy$default(UpdateAmount updateAmount, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateAmount.formattedAmount;
            }
            return updateAmount.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final UpdateAmount copy(String formattedAmount) {
            Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
            return new UpdateAmount(formattedAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateAmount) && Intrinsics.areEqual(this.formattedAmount, ((UpdateAmount) other).formattedAmount);
        }

        public int hashCode() {
            return this.formattedAmount.hashCode();
        }

        public String toString() {
            return "UpdateAmount(formattedAmount=" + this.formattedAmount + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAmount(String formattedAmount) {
            super(null);
            Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
            this.formattedAmount = formattedAmount;
        }

        public final String getFormattedAmount() {
            return this.formattedAmount;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowFragmentInActivity;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFragmentInActivity extends CryptoOrderEvent {
        public static final int $stable = 8;
        private final FragmentKey fragmentKey;

        public static /* synthetic */ ShowFragmentInActivity copy$default(ShowFragmentInActivity showFragmentInActivity, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = showFragmentInActivity.fragmentKey;
            }
            return showFragmentInActivity.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final ShowFragmentInActivity copy(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ShowFragmentInActivity(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFragmentInActivity) && Intrinsics.areEqual(this.fragmentKey, ((ShowFragmentInActivity) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "ShowFragmentInActivity(fragmentKey=" + this.fragmentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFragmentInActivity(FragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialogFragment extends CryptoOrderEvent {
        public static final int $stable = 8;
        private final DialogFragmentKey dialogFragmentKey;

        public static /* synthetic */ ShowDialogFragment copy$default(ShowDialogFragment showDialogFragment, DialogFragmentKey dialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogFragmentKey = showDialogFragment.dialogFragmentKey;
            }
            return showDialogFragment.copy(dialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }

        public final ShowDialogFragment copy(DialogFragmentKey dialogFragmentKey) {
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            return new ShowDialogFragment(dialogFragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowDialogFragment) && Intrinsics.areEqual(this.dialogFragmentKey, ((ShowDialogFragment) other).dialogFragmentKey);
        }

        public int hashCode() {
            return this.dialogFragmentKey.hashCode();
        }

        public String toString() {
            return "ShowDialogFragment(dialogFragmentKey=" + this.dialogFragmentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDialogFragment(DialogFragmentKey dialogFragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            this.dialogFragmentKey = dialogFragmentKey;
        }

        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }
    }

    /* compiled from: CryptoOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent$ShowAlertDto;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "alertDto", "Lrh_server_driven_ui/v1/AlertDto;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "<init>", "(Lrh_server_driven_ui/v1/AlertDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;)V", "getAlertDto", "()Lrh_server_driven_ui/v1/AlertDto;", "getLoggingCryptoOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAlertDto extends CryptoOrderEvent {
        public static final int $stable = 8;
        private final AlertDto alertDto;
        private final com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext;

        public static /* synthetic */ ShowAlertDto copy$default(ShowAlertDto showAlertDto, AlertDto alertDto, com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                alertDto = showAlertDto.alertDto;
            }
            if ((i & 2) != 0) {
                cryptoOrderContext = showAlertDto.loggingCryptoOrderContext;
            }
            return showAlertDto.copy(alertDto, cryptoOrderContext);
        }

        /* renamed from: component1, reason: from getter */
        public final AlertDto getAlertDto() {
            return this.alertDto;
        }

        /* renamed from: component2, reason: from getter */
        public final com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
            return this.loggingCryptoOrderContext;
        }

        public final ShowAlertDto copy(AlertDto alertDto, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
            Intrinsics.checkNotNullParameter(alertDto, "alertDto");
            Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
            return new ShowAlertDto(alertDto, loggingCryptoOrderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowAlertDto)) {
                return false;
            }
            ShowAlertDto showAlertDto = (ShowAlertDto) other;
            return Intrinsics.areEqual(this.alertDto, showAlertDto.alertDto) && Intrinsics.areEqual(this.loggingCryptoOrderContext, showAlertDto.loggingCryptoOrderContext);
        }

        public int hashCode() {
            return (this.alertDto.hashCode() * 31) + this.loggingCryptoOrderContext.hashCode();
        }

        public String toString() {
            return "ShowAlertDto(alertDto=" + this.alertDto + ", loggingCryptoOrderContext=" + this.loggingCryptoOrderContext + ")";
        }

        public final AlertDto getAlertDto() {
            return this.alertDto;
        }

        public final com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
            return this.loggingCryptoOrderContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAlertDto(AlertDto alertDto, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
            super(null);
            Intrinsics.checkNotNullParameter(alertDto, "alertDto");
            Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
            this.alertDto = alertDto;
            this.loggingCryptoOrderContext = loggingCryptoOrderContext;
        }
    }
}
