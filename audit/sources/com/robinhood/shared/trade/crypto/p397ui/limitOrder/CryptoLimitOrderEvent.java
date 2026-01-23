package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoLimitOrderEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "", "<init>", "()V", "ShowFeeDefinitionBottomSheet", "StartActivity", "ShowValidationFailureAlert", "ShowPowerInfoAlert", "RequestFocusOnLimitPriceInput", "ShowAlertDto", "ShowDialogFragment", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$RequestFocusOnLimitPriceInput;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowAlertDto;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowPowerInfoAlert;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowValidationFailureAlert;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$StartActivity;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoLimitOrderEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoLimitOrderEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoLimitOrderEvent() {
    }

    /* compiled from: CryptoLimitOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "args", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;)V", "getArgs", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFeeDefinitionBottomSheet extends CryptoLimitOrderEvent {
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

    /* compiled from: CryptoLimitOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$StartActivity;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartActivity extends CryptoLimitOrderEvent {
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

    /* compiled from: CryptoLimitOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowValidationFailureAlert;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "orderContext", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator$Failure;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)V", "getFailure", "()Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "getOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowValidationFailureAlert extends CryptoLimitOrderEvent {
        public static final int $stable = 8;
        private final Validator.Failure<CryptoOrderContext, CryptoOrderValidator3> failure;
        private final CryptoOrderContext orderContext;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowValidationFailureAlert copy$default(ShowValidationFailureAlert showValidationFailureAlert, Validator.Failure failure, CryptoOrderContext cryptoOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                failure = showValidationFailureAlert.failure;
            }
            if ((i & 2) != 0) {
                cryptoOrderContext = showValidationFailureAlert.orderContext;
            }
            return showValidationFailureAlert.copy(failure, cryptoOrderContext);
        }

        public final Validator.Failure<CryptoOrderContext, CryptoOrderValidator3> component1() {
            return this.failure;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoOrderContext getOrderContext() {
            return this.orderContext;
        }

        public final ShowValidationFailureAlert copy(Validator.Failure<? super CryptoOrderContext, ? super CryptoOrderValidator3> failure, CryptoOrderContext orderContext) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            return new ShowValidationFailureAlert(failure, orderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowValidationFailureAlert)) {
                return false;
            }
            ShowValidationFailureAlert showValidationFailureAlert = (ShowValidationFailureAlert) other;
            return Intrinsics.areEqual(this.failure, showValidationFailureAlert.failure) && Intrinsics.areEqual(this.orderContext, showValidationFailureAlert.orderContext);
        }

        public int hashCode() {
            return (this.failure.hashCode() * 31) + this.orderContext.hashCode();
        }

        public String toString() {
            return "ShowValidationFailureAlert(failure=" + this.failure + ", orderContext=" + this.orderContext + ")";
        }

        public final Validator.Failure<CryptoOrderContext, CryptoOrderValidator3> getFailure() {
            return this.failure;
        }

        public final CryptoOrderContext getOrderContext() {
            return this.orderContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowValidationFailureAlert(Validator.Failure<? super CryptoOrderContext, ? super CryptoOrderValidator3> failure, CryptoOrderContext orderContext) {
            super(null);
            Intrinsics.checkNotNullParameter(failure, "failure");
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            this.failure = failure;
            this.orderContext = orderContext;
        }
    }

    /* compiled from: CryptoLimitOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowPowerInfoAlert;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "powerInfoAlert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "<init>", "(Lcom/robinhood/models/ui/ServerDrivenAlert;)V", "getPowerInfoAlert", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowPowerInfoAlert extends CryptoLimitOrderEvent {
        public static final int $stable = 8;
        private final ServerDrivenAlert powerInfoAlert;

        public static /* synthetic */ ShowPowerInfoAlert copy$default(ShowPowerInfoAlert showPowerInfoAlert, ServerDrivenAlert serverDrivenAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                serverDrivenAlert = showPowerInfoAlert.powerInfoAlert;
            }
            return showPowerInfoAlert.copy(serverDrivenAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final ServerDrivenAlert getPowerInfoAlert() {
            return this.powerInfoAlert;
        }

        public final ShowPowerInfoAlert copy(ServerDrivenAlert powerInfoAlert) {
            Intrinsics.checkNotNullParameter(powerInfoAlert, "powerInfoAlert");
            return new ShowPowerInfoAlert(powerInfoAlert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowPowerInfoAlert) && Intrinsics.areEqual(this.powerInfoAlert, ((ShowPowerInfoAlert) other).powerInfoAlert);
        }

        public int hashCode() {
            return this.powerInfoAlert.hashCode();
        }

        public String toString() {
            return "ShowPowerInfoAlert(powerInfoAlert=" + this.powerInfoAlert + ")";
        }

        public final ServerDrivenAlert getPowerInfoAlert() {
            return this.powerInfoAlert;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPowerInfoAlert(ServerDrivenAlert powerInfoAlert) {
            super(null);
            Intrinsics.checkNotNullParameter(powerInfoAlert, "powerInfoAlert");
            this.powerInfoAlert = powerInfoAlert;
        }
    }

    /* compiled from: CryptoLimitOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$RequestFocusOnLimitPriceInput;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestFocusOnLimitPriceInput extends CryptoLimitOrderEvent {
        public static final int $stable = 0;
        public static final RequestFocusOnLimitPriceInput INSTANCE = new RequestFocusOnLimitPriceInput();

        public boolean equals(Object other) {
            return this == other || (other instanceof RequestFocusOnLimitPriceInput);
        }

        public int hashCode() {
            return -1500469636;
        }

        public String toString() {
            return "RequestFocusOnLimitPriceInput";
        }

        private RequestFocusOnLimitPriceInput() {
            super(null);
        }
    }

    /* compiled from: CryptoLimitOrderEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowAlertDto;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "alertDto", "Lrh_server_driven_ui/v1/AlertDto;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "<init>", "(Lrh_server_driven_ui/v1/AlertDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;)V", "getAlertDto", "()Lrh_server_driven_ui/v1/AlertDto;", "getLoggingCryptoOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAlertDto extends CryptoLimitOrderEvent {
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

    /* compiled from: CryptoLimitOrderEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialogFragment extends CryptoLimitOrderEvent {
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
}
