package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.alert.lotLimit.CryptoTaxLotOrderInputLotLimitAlertDialogState;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotOrderInputEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;", "", "<init>", "()V", "ShowOrderTypeSelector", "ShowLotSelectionScreen", "ShowFeeDefinitionBottomSheet", "DismissFeeDefinitionBottomSheet", "ValidationFailureAlert", "ShowLotLimitAlert", "ShowDialogFragment", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$DismissFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowLotLimitAlert;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowLotSelectionScreen;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowOrderTypeSelector;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ValidationFailureAlert;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoTaxLotOrderInputEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoTaxLotOrderInputEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoTaxLotOrderInputEvent() {
    }

    /* compiled from: CryptoTaxLotOrderInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowOrderTypeSelector;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "<init>", "(Lcom/robinhood/models/api/CryptoOrderType;)V", "getOrderType", "()Lcom/robinhood/models/api/CryptoOrderType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowOrderTypeSelector extends CryptoTaxLotOrderInputEvent {
        public static final int $stable = 0;
        private final CryptoOrderType orderType;

        public static /* synthetic */ ShowOrderTypeSelector copy$default(ShowOrderTypeSelector showOrderTypeSelector, CryptoOrderType cryptoOrderType, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderType = showOrderTypeSelector.orderType;
            }
            return showOrderTypeSelector.copy(cryptoOrderType);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderType getOrderType() {
            return this.orderType;
        }

        public final ShowOrderTypeSelector copy(CryptoOrderType orderType) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new ShowOrderTypeSelector(orderType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowOrderTypeSelector) && this.orderType == ((ShowOrderTypeSelector) other).orderType;
        }

        public int hashCode() {
            return this.orderType.hashCode();
        }

        public String toString() {
            return "ShowOrderTypeSelector(orderType=" + this.orderType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowOrderTypeSelector(CryptoOrderType orderType) {
            super(null);
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.orderType = orderType;
        }

        public final CryptoOrderType getOrderType() {
            return this.orderType;
        }
    }

    /* compiled from: CryptoTaxLotOrderInputEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowLotSelectionScreen;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;", "strategy", "Lnummus/v1/TaxLotStrategyTypeDto;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "<init>", "(Lnummus/v1/TaxLotStrategyTypeDto;Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;)V", "getStrategy", "()Lnummus/v1/TaxLotStrategyTypeDto;", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowLotSelectionScreen extends CryptoTaxLotOrderInputEvent {
        public static final int $stable = 8;
        private final RequestInputs.AsAsset requestInputs;
        private final TaxLotStrategyTypeDto strategy;

        public static /* synthetic */ ShowLotSelectionScreen copy$default(ShowLotSelectionScreen showLotSelectionScreen, TaxLotStrategyTypeDto taxLotStrategyTypeDto, RequestInputs.AsAsset asAsset, int i, Object obj) {
            if ((i & 1) != 0) {
                taxLotStrategyTypeDto = showLotSelectionScreen.strategy;
            }
            if ((i & 2) != 0) {
                asAsset = showLotSelectionScreen.requestInputs;
            }
            return showLotSelectionScreen.copy(taxLotStrategyTypeDto, asAsset);
        }

        /* renamed from: component1, reason: from getter */
        public final TaxLotStrategyTypeDto getStrategy() {
            return this.strategy;
        }

        /* renamed from: component2, reason: from getter */
        public final RequestInputs.AsAsset getRequestInputs() {
            return this.requestInputs;
        }

        public final ShowLotSelectionScreen copy(TaxLotStrategyTypeDto strategy, RequestInputs.AsAsset requestInputs) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            return new ShowLotSelectionScreen(strategy, requestInputs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowLotSelectionScreen)) {
                return false;
            }
            ShowLotSelectionScreen showLotSelectionScreen = (ShowLotSelectionScreen) other;
            return this.strategy == showLotSelectionScreen.strategy && Intrinsics.areEqual(this.requestInputs, showLotSelectionScreen.requestInputs);
        }

        public int hashCode() {
            return (this.strategy.hashCode() * 31) + this.requestInputs.hashCode();
        }

        public String toString() {
            return "ShowLotSelectionScreen(strategy=" + this.strategy + ", requestInputs=" + this.requestInputs + ")";
        }

        public final TaxLotStrategyTypeDto getStrategy() {
            return this.strategy;
        }

        public final RequestInputs.AsAsset getRequestInputs() {
            return this.requestInputs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowLotSelectionScreen(TaxLotStrategyTypeDto strategy, RequestInputs.AsAsset requestInputs) {
            super(null);
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            this.strategy = strategy;
            this.requestInputs = requestInputs;
        }
    }

    /* compiled from: CryptoTaxLotOrderInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;", "args", "Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;)V", "getArgs", "()Lcom/robinhood/shared/trade/crypto/ui/fee/definitionBottomSheet/CryptoFeeDefinitionBottomSheetFragment$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFeeDefinitionBottomSheet extends CryptoTaxLotOrderInputEvent {
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

    /* compiled from: CryptoTaxLotOrderInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$DismissFeeDefinitionBottomSheet;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissFeeDefinitionBottomSheet extends CryptoTaxLotOrderInputEvent {
        public static final int $stable = 0;
        public static final DismissFeeDefinitionBottomSheet INSTANCE = new DismissFeeDefinitionBottomSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissFeeDefinitionBottomSheet);
        }

        public int hashCode() {
            return -575055842;
        }

        public String toString() {
            return "DismissFeeDefinitionBottomSheet";
        }

        private DismissFeeDefinitionBottomSheet() {
            super(null);
        }
    }

    /* compiled from: CryptoTaxLotOrderInputEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ValidationFailureAlert;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "orderContext", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator$Failure;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)V", "getFailure", "()Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "getOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationFailureAlert extends CryptoTaxLotOrderInputEvent {
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

    /* compiled from: CryptoTaxLotOrderInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowLotLimitAlert;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;", "state", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/alert/lotLimit/CryptoTaxLotOrderInputLotLimitAlertDialogState;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/alert/lotLimit/CryptoTaxLotOrderInputLotLimitAlertDialogState;)V", "getState", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/alert/lotLimit/CryptoTaxLotOrderInputLotLimitAlertDialogState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowLotLimitAlert extends CryptoTaxLotOrderInputEvent {
        public static final int $stable = 8;
        private final CryptoTaxLotOrderInputLotLimitAlertDialogState state;

        public static /* synthetic */ ShowLotLimitAlert copy$default(ShowLotLimitAlert showLotLimitAlert, CryptoTaxLotOrderInputLotLimitAlertDialogState cryptoTaxLotOrderInputLotLimitAlertDialogState, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoTaxLotOrderInputLotLimitAlertDialogState = showLotLimitAlert.state;
            }
            return showLotLimitAlert.copy(cryptoTaxLotOrderInputLotLimitAlertDialogState);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTaxLotOrderInputLotLimitAlertDialogState getState() {
            return this.state;
        }

        public final ShowLotLimitAlert copy(CryptoTaxLotOrderInputLotLimitAlertDialogState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new ShowLotLimitAlert(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowLotLimitAlert) && Intrinsics.areEqual(this.state, ((ShowLotLimitAlert) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "ShowLotLimitAlert(state=" + this.state + ")";
        }

        public final CryptoTaxLotOrderInputLotLimitAlertDialogState getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowLotLimitAlert(CryptoTaxLotOrderInputLotLimitAlertDialogState state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }
    }

    /* compiled from: CryptoTaxLotOrderInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialogFragment extends CryptoTaxLotOrderInputEvent {
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
