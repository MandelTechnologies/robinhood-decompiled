package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.serverdriven.experimental.api.CryptoValidateOrderAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotSelectionEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "", "<init>", "()V", "ContinueToReview", "DisplayWorkLossAlertDialog", "GoBack", "ValidationFailureAlert", "ShowSduiValidationAlert", "ShowDialogFragment", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$ContinueToReview;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$DisplayWorkLossAlertDialog;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$GoBack;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$ShowSduiValidationAlert;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$ValidationFailureAlert;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoTaxLotSelectionEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoTaxLotSelectionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoTaxLotSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$ContinueToReview;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "<init>", "(Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;)V", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContinueToReview extends CryptoTaxLotSelectionEvent {
        public static final int $stable = 8;
        private final RequestInputs.AsAsset requestInputs;

        public static /* synthetic */ ContinueToReview copy$default(ContinueToReview continueToReview, RequestInputs.AsAsset asAsset, int i, Object obj) {
            if ((i & 1) != 0) {
                asAsset = continueToReview.requestInputs;
            }
            return continueToReview.copy(asAsset);
        }

        /* renamed from: component1, reason: from getter */
        public final RequestInputs.AsAsset getRequestInputs() {
            return this.requestInputs;
        }

        public final ContinueToReview copy(RequestInputs.AsAsset requestInputs) {
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            return new ContinueToReview(requestInputs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContinueToReview) && Intrinsics.areEqual(this.requestInputs, ((ContinueToReview) other).requestInputs);
        }

        public int hashCode() {
            return this.requestInputs.hashCode();
        }

        public String toString() {
            return "ContinueToReview(requestInputs=" + this.requestInputs + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContinueToReview(RequestInputs.AsAsset requestInputs) {
            super(null);
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            this.requestInputs = requestInputs;
        }

        public final RequestInputs.AsAsset getRequestInputs() {
            return this.requestInputs;
        }
    }

    private CryptoTaxLotSelectionEvent() {
    }

    /* compiled from: CryptoTaxLotSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$DisplayWorkLossAlertDialog;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisplayWorkLossAlertDialog extends CryptoTaxLotSelectionEvent {
        public static final int $stable = 0;
        public static final DisplayWorkLossAlertDialog INSTANCE = new DisplayWorkLossAlertDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof DisplayWorkLossAlertDialog);
        }

        public int hashCode() {
            return -1874648647;
        }

        public String toString() {
            return "DisplayWorkLossAlertDialog";
        }

        private DisplayWorkLossAlertDialog() {
            super(null);
        }
    }

    /* compiled from: CryptoTaxLotSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$GoBack;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GoBack extends CryptoTaxLotSelectionEvent {
        public static final int $stable = 0;
        public static final GoBack INSTANCE = new GoBack();

        public boolean equals(Object other) {
            return this == other || (other instanceof GoBack);
        }

        public int hashCode() {
            return 268393466;
        }

        public String toString() {
            return "GoBack";
        }

        private GoBack() {
            super(null);
        }
    }

    /* compiled from: CryptoTaxLotSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$ValidationFailureAlert;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "orderContext", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator$Failure;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)V", "getFailure", "()Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "getOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationFailureAlert extends CryptoTaxLotSelectionEvent {
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

    /* compiled from: CryptoTaxLotSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$ShowSduiValidationAlert;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSduiValidationAlert extends CryptoTaxLotSelectionEvent {
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

    /* compiled from: CryptoTaxLotSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialogFragment extends CryptoTaxLotSelectionEvent {
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
