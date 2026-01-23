package com.robinhood.android.transfers.international.p266ui.amountinput;

import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog;
import com.robinhood.models.util.Money;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.AlertDto;

/* compiled from: AmountInputEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent;", "", "AmountEntered", "Error", "ValidationError", "ShowSduiInfoSheet", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent$AmountEntered;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent$Error;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent$ShowSduiInfoSheet;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent$ValidationError;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface AmountInputEvent {

    /* compiled from: AmountInputEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent$AmountEntered;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent;", "amount", "Lcom/robinhood/models/util/Money;", "fxData", "Lcom/robinhood/android/transfers/international/ui/model/FxData;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/transfers/international/ui/model/FxData;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getFxData", "()Lcom/robinhood/android/transfers/international/ui/model/FxData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AmountEntered implements AmountInputEvent {
        public static final int $stable = 8;
        private final Money amount;
        private final FxData fxData;

        public static /* synthetic */ AmountEntered copy$default(AmountEntered amountEntered, Money money, FxData fxData, int i, Object obj) {
            if ((i & 1) != 0) {
                money = amountEntered.amount;
            }
            if ((i & 2) != 0) {
                fxData = amountEntered.fxData;
            }
            return amountEntered.copy(money, fxData);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final FxData getFxData() {
            return this.fxData;
        }

        public final AmountEntered copy(Money amount, FxData fxData) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new AmountEntered(amount, fxData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AmountEntered)) {
                return false;
            }
            AmountEntered amountEntered = (AmountEntered) other;
            return Intrinsics.areEqual(this.amount, amountEntered.amount) && Intrinsics.areEqual(this.fxData, amountEntered.fxData);
        }

        public int hashCode() {
            int iHashCode = this.amount.hashCode() * 31;
            FxData fxData = this.fxData;
            return iHashCode + (fxData == null ? 0 : fxData.hashCode());
        }

        public String toString() {
            return "AmountEntered(amount=" + this.amount + ", fxData=" + this.fxData + ")";
        }

        public AmountEntered(Money amount, FxData fxData) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.amount = amount;
            this.fxData = fxData;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final FxData getFxData() {
            return this.fxData;
        }
    }

    /* compiled from: AmountInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent$Error;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent;", DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, "Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;)V", "getErrorDialog", "()Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements AmountInputEvent {
        public static final int $stable = StringResource.$stable;
        private final ErrorDialog errorDialog;

        public static /* synthetic */ Error copy$default(Error error, ErrorDialog errorDialog, int i, Object obj) {
            if ((i & 1) != 0) {
                errorDialog = error.errorDialog;
            }
            return error.copy(errorDialog);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorDialog getErrorDialog() {
            return this.errorDialog;
        }

        public final Error copy(ErrorDialog errorDialog) {
            Intrinsics.checkNotNullParameter(errorDialog, "errorDialog");
            return new Error(errorDialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.errorDialog, ((Error) other).errorDialog);
        }

        public int hashCode() {
            return this.errorDialog.hashCode();
        }

        public String toString() {
            return "Error(errorDialog=" + this.errorDialog + ")";
        }

        public Error(ErrorDialog errorDialog) {
            Intrinsics.checkNotNullParameter(errorDialog, "errorDialog");
            this.errorDialog = errorDialog;
        }

        public final ErrorDialog getErrorDialog() {
            return this.errorDialog;
        }
    }

    /* compiled from: AmountInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent$ValidationError;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent;", "alert", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/AlertDto;", "<init>", "(Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/AlertDto;)V", "getAlert", "()Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/AlertDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationError implements AmountInputEvent {
        public static final int $stable = 8;
        private final AlertDto alert;

        public static /* synthetic */ ValidationError copy$default(ValidationError validationError, AlertDto alertDto, int i, Object obj) {
            if ((i & 1) != 0) {
                alertDto = validationError.alert;
            }
            return validationError.copy(alertDto);
        }

        /* renamed from: component1, reason: from getter */
        public final AlertDto getAlert() {
            return this.alert;
        }

        public final ValidationError copy(AlertDto alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new ValidationError(alert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidationError) && Intrinsics.areEqual(this.alert, ((ValidationError) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "ValidationError(alert=" + this.alert + ")";
        }

        public ValidationError(AlertDto alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final AlertDto getAlert() {
            return this.alert;
        }
    }

    /* compiled from: AmountInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent$ShowSduiInfoSheet;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputEvent;", "key", "Lcom/robinhood/shared/common/contracts/SduiInfoSheetKey;", "<init>", "(Lcom/robinhood/shared/common/contracts/SduiInfoSheetKey;)V", "getKey", "()Lcom/robinhood/shared/common/contracts/SduiInfoSheetKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSduiInfoSheet implements AmountInputEvent {
        public static final int $stable = 8;
        private final SduiInfoSheetKey key;

        public static /* synthetic */ ShowSduiInfoSheet copy$default(ShowSduiInfoSheet showSduiInfoSheet, SduiInfoSheetKey sduiInfoSheetKey, int i, Object obj) {
            if ((i & 1) != 0) {
                sduiInfoSheetKey = showSduiInfoSheet.key;
            }
            return showSduiInfoSheet.copy(sduiInfoSheetKey);
        }

        /* renamed from: component1, reason: from getter */
        public final SduiInfoSheetKey getKey() {
            return this.key;
        }

        public final ShowSduiInfoSheet copy(SduiInfoSheetKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new ShowSduiInfoSheet(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowSduiInfoSheet) && Intrinsics.areEqual(this.key, ((ShowSduiInfoSheet) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "ShowSduiInfoSheet(key=" + this.key + ")";
        }

        public ShowSduiInfoSheet(SduiInfoSheetKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final SduiInfoSheetKey getKey() {
            return this.key;
        }
    }
}
