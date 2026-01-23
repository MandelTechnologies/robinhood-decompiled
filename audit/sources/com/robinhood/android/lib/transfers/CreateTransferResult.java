package com.robinhood.android.lib.transfers;

import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.robinhood.models.api.bonfire.transfer.AssetRetentionUpsellContent;
import com.robinhood.models.api.bonfire.transfer.ClawbackGracePeriodContent;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferResult.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult;", "", "Required", "Success", "Failure", "PreCreateCheck", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Required;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface CreateTransferResult {

    /* compiled from: CreateTransferResult.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$Required;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Success;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Required extends CreateTransferResult {
    }

    /* compiled from: CreateTransferResult.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$Success;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Required;", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "<init>", "(Lcom/robinhood/models/ui/bonfire/PostTransferFlow;)V", "getPostTransferFlow", "()Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements Required {
        private final PostTransferFlow postTransferFlow;

        public static /* synthetic */ Success copy$default(Success success, PostTransferFlow postTransferFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                postTransferFlow = success.postTransferFlow;
            }
            return success.copy(postTransferFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }

        public final Success copy(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            return new Success(postTransferFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.postTransferFlow, ((Success) other).postTransferFlow);
        }

        public int hashCode() {
            return this.postTransferFlow.hashCode();
        }

        public String toString() {
            return "Success(postTransferFlow=" + this.postTransferFlow + ")";
        }

        public Success(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            this.postTransferFlow = postTransferFlow;
        }

        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }
    }

    /* compiled from: CreateTransferResult.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Required;", "ThreeDs", "VerificationRequired", "Generic", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure$Generic;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure$ThreeDs;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure$VerificationRequired;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Failure extends Required {

        /* compiled from: CreateTransferResult.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure$ThreeDs;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure;", "redirectUrl", "", "<init>", "(Ljava/lang/String;)V", "getRedirectUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ThreeDs implements Failure {
            private final String redirectUrl;

            public static /* synthetic */ ThreeDs copy$default(ThreeDs threeDs, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = threeDs.redirectUrl;
                }
                return threeDs.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getRedirectUrl() {
                return this.redirectUrl;
            }

            public final ThreeDs copy(String redirectUrl) {
                Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
                return new ThreeDs(redirectUrl);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ThreeDs) && Intrinsics.areEqual(this.redirectUrl, ((ThreeDs) other).redirectUrl);
            }

            public int hashCode() {
                return this.redirectUrl.hashCode();
            }

            public String toString() {
                return "ThreeDs(redirectUrl=" + this.redirectUrl + ")";
            }

            public ThreeDs(String redirectUrl) {
                Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
                this.redirectUrl = redirectUrl;
            }

            public final String getRedirectUrl() {
                return this.redirectUrl;
            }
        }

        /* compiled from: CreateTransferResult.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure$VerificationRequired;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class VerificationRequired implements Failure {
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

        /* compiled from: CreateTransferResult.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure$Generic;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Failure;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Generic implements Failure {
            private final Throwable exception;

            public static /* synthetic */ Generic copy$default(Generic generic, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = generic.exception;
                }
                return generic.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getException() {
                return this.exception;
            }

            public final Generic copy(Throwable exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new Generic(exception);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Generic) && Intrinsics.areEqual(this.exception, ((Generic) other).exception);
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "Generic(exception=" + this.exception + ")";
            }

            public Generic(Throwable exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.exception = exception;
            }

            public final Throwable getException() {
                return this.exception;
            }
        }
    }

    /* compiled from: CreateTransferResult.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult;", "Validation", "Rtp", "AssetRetention", "Clawback", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck$AssetRetention;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck$Clawback;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck$Rtp;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck$Validation;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface PreCreateCheck extends CreateTransferResult {

        /* compiled from: CreateTransferResult.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck$Validation;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck;", "errorDetails", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "<init>", "(Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;)V", "getErrorDetails", "()Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Validation implements PreCreateCheck {
            private final TransferValidationErrorDetailsDto errorDetails;

            public static /* synthetic */ Validation copy$default(Validation validation, TransferValidationErrorDetailsDto transferValidationErrorDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferValidationErrorDetailsDto = validation.errorDetails;
                }
                return validation.copy(transferValidationErrorDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferValidationErrorDetailsDto getErrorDetails() {
                return this.errorDetails;
            }

            public final Validation copy(TransferValidationErrorDetailsDto errorDetails) {
                Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
                return new Validation(errorDetails);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Validation) && Intrinsics.areEqual(this.errorDetails, ((Validation) other).errorDetails);
            }

            public int hashCode() {
                return this.errorDetails.hashCode();
            }

            public String toString() {
                return "Validation(errorDetails=" + this.errorDetails + ")";
            }

            public Validation(TransferValidationErrorDetailsDto errorDetails) {
                Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
                this.errorDetails = errorDetails;
            }

            public final TransferValidationErrorDetailsDto getErrorDetails() {
                return this.errorDetails;
            }
        }

        /* compiled from: CreateTransferResult.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck$Rtp;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck;", "popupType", "Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;", "action", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplayRTPUpsellAction;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;)V", "getPopupType", "()Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;", "getAction", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Rtp implements PreCreateCheck {
            private final AlertAction<DisplayRTPUpsellAction> action;
            private final PreCreatePopupType popupType;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Rtp copy$default(Rtp rtp, PreCreatePopupType preCreatePopupType, AlertAction alertAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    preCreatePopupType = rtp.popupType;
                }
                if ((i & 2) != 0) {
                    alertAction = rtp.action;
                }
                return rtp.copy(preCreatePopupType, alertAction);
            }

            /* renamed from: component1, reason: from getter */
            public final PreCreatePopupType getPopupType() {
                return this.popupType;
            }

            public final AlertAction<DisplayRTPUpsellAction> component2() {
                return this.action;
            }

            public final Rtp copy(PreCreatePopupType popupType, AlertAction<? extends DisplayRTPUpsellAction> action) {
                Intrinsics.checkNotNullParameter(popupType, "popupType");
                Intrinsics.checkNotNullParameter(action, "action");
                return new Rtp(popupType, action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Rtp)) {
                    return false;
                }
                Rtp rtp = (Rtp) other;
                return this.popupType == rtp.popupType && Intrinsics.areEqual(this.action, rtp.action);
            }

            public int hashCode() {
                return (this.popupType.hashCode() * 31) + this.action.hashCode();
            }

            public String toString() {
                return "Rtp(popupType=" + this.popupType + ", action=" + this.action + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Rtp(PreCreatePopupType popupType, AlertAction<? extends DisplayRTPUpsellAction> action) {
                Intrinsics.checkNotNullParameter(popupType, "popupType");
                Intrinsics.checkNotNullParameter(action, "action");
                this.popupType = popupType;
                this.action = action;
            }

            public final PreCreatePopupType getPopupType() {
                return this.popupType;
            }

            public final AlertAction<DisplayRTPUpsellAction> getAction() {
                return this.action;
            }
        }

        /* compiled from: CreateTransferResult.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck$AssetRetention;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck;", "popupType", "Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;", "content", "Lcom/robinhood/models/api/bonfire/transfer/AssetRetentionUpsellContent;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;Lcom/robinhood/models/api/bonfire/transfer/AssetRetentionUpsellContent;)V", "getPopupType", "()Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;", "getContent", "()Lcom/robinhood/models/api/bonfire/transfer/AssetRetentionUpsellContent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AssetRetention implements PreCreateCheck {
            private final AssetRetentionUpsellContent content;
            private final PreCreatePopupType popupType;

            public static /* synthetic */ AssetRetention copy$default(AssetRetention assetRetention, PreCreatePopupType preCreatePopupType, AssetRetentionUpsellContent assetRetentionUpsellContent, int i, Object obj) {
                if ((i & 1) != 0) {
                    preCreatePopupType = assetRetention.popupType;
                }
                if ((i & 2) != 0) {
                    assetRetentionUpsellContent = assetRetention.content;
                }
                return assetRetention.copy(preCreatePopupType, assetRetentionUpsellContent);
            }

            /* renamed from: component1, reason: from getter */
            public final PreCreatePopupType getPopupType() {
                return this.popupType;
            }

            /* renamed from: component2, reason: from getter */
            public final AssetRetentionUpsellContent getContent() {
                return this.content;
            }

            public final AssetRetention copy(PreCreatePopupType popupType, AssetRetentionUpsellContent content) {
                Intrinsics.checkNotNullParameter(popupType, "popupType");
                Intrinsics.checkNotNullParameter(content, "content");
                return new AssetRetention(popupType, content);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetRetention)) {
                    return false;
                }
                AssetRetention assetRetention = (AssetRetention) other;
                return this.popupType == assetRetention.popupType && Intrinsics.areEqual(this.content, assetRetention.content);
            }

            public int hashCode() {
                return (this.popupType.hashCode() * 31) + this.content.hashCode();
            }

            public String toString() {
                return "AssetRetention(popupType=" + this.popupType + ", content=" + this.content + ")";
            }

            public AssetRetention(PreCreatePopupType popupType, AssetRetentionUpsellContent content) {
                Intrinsics.checkNotNullParameter(popupType, "popupType");
                Intrinsics.checkNotNullParameter(content, "content");
                this.popupType = popupType;
                this.content = content;
            }

            public final PreCreatePopupType getPopupType() {
                return this.popupType;
            }

            public final AssetRetentionUpsellContent getContent() {
                return this.content;
            }
        }

        /* compiled from: CreateTransferResult.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck$Clawback;", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$PreCreateCheck;", "content", "Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;)V", "getContent", "()Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Clawback implements PreCreateCheck {
            private final ClawbackGracePeriodContent content;

            public static /* synthetic */ Clawback copy$default(Clawback clawback, ClawbackGracePeriodContent clawbackGracePeriodContent, int i, Object obj) {
                if ((i & 1) != 0) {
                    clawbackGracePeriodContent = clawback.content;
                }
                return clawback.copy(clawbackGracePeriodContent);
            }

            /* renamed from: component1, reason: from getter */
            public final ClawbackGracePeriodContent getContent() {
                return this.content;
            }

            public final Clawback copy(ClawbackGracePeriodContent content) {
                Intrinsics.checkNotNullParameter(content, "content");
                return new Clawback(content);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Clawback) && Intrinsics.areEqual(this.content, ((Clawback) other).content);
            }

            public int hashCode() {
                return this.content.hashCode();
            }

            public String toString() {
                return "Clawback(content=" + this.content + ")";
            }

            public Clawback(ClawbackGracePeriodContent content) {
                Intrinsics.checkNotNullParameter(content, "content");
                this.content = content;
            }

            public final ClawbackGracePeriodContent getContent() {
                return this.content;
            }
        }
    }
}
