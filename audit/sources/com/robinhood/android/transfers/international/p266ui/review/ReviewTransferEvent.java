package com.robinhood.android.transfers.international.p266ui.review;

import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewTransferEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent;", "", "Error", "SduiError", "TransferCreated", "ShowSduiInfoSheet", "VerificationRequired", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$Error;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$SduiError;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$ShowSduiInfoSheet;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$TransferCreated;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$VerificationRequired;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ReviewTransferEvent {

    /* compiled from: ReviewTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$Error;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent;", DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, "Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;)V", "getErrorDialog", "()Lcom/robinhood/android/transfers/international/ui/util/ErrorDialog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements ReviewTransferEvent {
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

    /* compiled from: ReviewTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$SduiError;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent;", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericAlert;)V", "getAlert", "()Lcom/robinhood/models/serverdriven/db/GenericAlert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SduiError implements ReviewTransferEvent {
        public static final int $stable = 8;
        private final GenericAlert alert;

        public static /* synthetic */ SduiError copy$default(SduiError sduiError, GenericAlert genericAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlert = sduiError.alert;
            }
            return sduiError.copy(genericAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final GenericAlert getAlert() {
            return this.alert;
        }

        public final SduiError copy(GenericAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new SduiError(alert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SduiError) && Intrinsics.areEqual(this.alert, ((SduiError) other).alert);
        }

        public int hashCode() {
            return this.alert.hashCode();
        }

        public String toString() {
            return "SduiError(alert=" + this.alert + ")";
        }

        public SduiError(GenericAlert alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
        }

        public final GenericAlert getAlert() {
            return this.alert;
        }
    }

    /* compiled from: ReviewTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$TransferCreated;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent;", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "<init>", "(Lcom/robinhood/models/ui/bonfire/PostTransferFlow;)V", "getPostTransferFlow", "()Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferCreated implements ReviewTransferEvent {
        public static final int $stable = 8;
        private final PostTransferFlow postTransferFlow;

        public static /* synthetic */ TransferCreated copy$default(TransferCreated transferCreated, PostTransferFlow postTransferFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                postTransferFlow = transferCreated.postTransferFlow;
            }
            return transferCreated.copy(postTransferFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }

        public final TransferCreated copy(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            return new TransferCreated(postTransferFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TransferCreated) && Intrinsics.areEqual(this.postTransferFlow, ((TransferCreated) other).postTransferFlow);
        }

        public int hashCode() {
            return this.postTransferFlow.hashCode();
        }

        public String toString() {
            return "TransferCreated(postTransferFlow=" + this.postTransferFlow + ")";
        }

        public TransferCreated(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            this.postTransferFlow = postTransferFlow;
        }

        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }
    }

    /* compiled from: ReviewTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$ShowSduiInfoSheet;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent;", "key", "Lcom/robinhood/shared/common/contracts/SduiInfoSheetKey;", "<init>", "(Lcom/robinhood/shared/common/contracts/SduiInfoSheetKey;)V", "getKey", "()Lcom/robinhood/shared/common/contracts/SduiInfoSheetKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSduiInfoSheet implements ReviewTransferEvent {
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

    /* compiled from: ReviewTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent$VerificationRequired;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerificationRequired implements ReviewTransferEvent {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final UUID workflowId;

        public static /* synthetic */ VerificationRequired copy$default(VerificationRequired verificationRequired, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = verificationRequired.workflowId;
            }
            if ((i & 2) != 0) {
                z = verificationRequired.isMigrated;
            }
            return verificationRequired.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }

        public final VerificationRequired copy(UUID workflowId, boolean isMigrated) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new VerificationRequired(workflowId, isMigrated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerificationRequired)) {
                return false;
            }
            VerificationRequired verificationRequired = (VerificationRequired) other;
            return Intrinsics.areEqual(this.workflowId, verificationRequired.workflowId) && this.isMigrated == verificationRequired.isMigrated;
        }

        public int hashCode() {
            return (this.workflowId.hashCode() * 31) + Boolean.hashCode(this.isMigrated);
        }

        public String toString() {
            return "VerificationRequired(workflowId=" + this.workflowId + ", isMigrated=" + this.isMigrated + ")";
        }

        public VerificationRequired(UUID workflowId, boolean z) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.workflowId = workflowId;
            this.isMigrated = z;
        }

        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        public final boolean isMigrated() {
            return this.isMigrated;
        }
    }
}
