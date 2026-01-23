package com.robinhood.android.matcha.p177ui.search.confirm;

import com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmContactEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent;", "", "SubmitResult", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface ConfirmContactEvent {

    /* compiled from: ConfirmContactEvent.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent;", "clearLoading", "", "getClearLoading", "()Z", "Success", "InsufficientFundsError", "Error", "VerificationRequired", "VerificationComplete", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$Error;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$InsufficientFundsError;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$Success;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationRequired;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SubmitResult extends ConfirmContactEvent {

        /* compiled from: ConfirmContactEvent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static boolean getClearLoading(SubmitResult submitResult) {
                return false;
            }
        }

        boolean getClearLoading();

        /* compiled from: ConfirmContactEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$Success;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult;", "confirmationType", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "<init>", "(Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;)V", "getConfirmationType", "()Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success implements SubmitResult {
            public static final int $stable = 8;
            private final ConfirmationType confirmationType;

            public static /* synthetic */ Success copy$default(Success success, ConfirmationType confirmationType, int i, Object obj) {
                if ((i & 1) != 0) {
                    confirmationType = success.confirmationType;
                }
                return success.copy(confirmationType);
            }

            /* renamed from: component1, reason: from getter */
            public final ConfirmationType getConfirmationType() {
                return this.confirmationType;
            }

            public final Success copy(ConfirmationType confirmationType) {
                Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
                return new Success(confirmationType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.confirmationType, ((Success) other).confirmationType);
            }

            public int hashCode() {
                return this.confirmationType.hashCode();
            }

            public String toString() {
                return "Success(confirmationType=" + this.confirmationType + ")";
            }

            public Success(ConfirmationType confirmationType) {
                Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
                this.confirmationType = confirmationType;
            }

            @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactEvent.SubmitResult
            public boolean getClearLoading() {
                return DefaultImpls.getClearLoading(this);
            }

            public final ConfirmationType getConfirmationType() {
                return this.confirmationType;
            }
        }

        /* compiled from: ConfirmContactEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$InsufficientFundsError;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult;", "<init>", "()V", "clearLoading", "", "getClearLoading", "()Z", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class InsufficientFundsError implements SubmitResult {
            public static final int $stable = 0;
            public static final InsufficientFundsError INSTANCE = new InsufficientFundsError();

            @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactEvent.SubmitResult
            public boolean getClearLoading() {
                return true;
            }

            private InsufficientFundsError() {
            }
        }

        /* compiled from: ConfirmContactEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$Error;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements SubmitResult {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            public Error(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactEvent.SubmitResult
            public boolean getClearLoading() {
                return DefaultImpls.getClearLoading(this);
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        /* compiled from: ConfirmContactEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationRequired;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult;", "verificationWorkflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getVerificationWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class VerificationRequired implements SubmitResult {
            public static final int $stable = 8;
            private final boolean isMigrated;
            private final UUID verificationWorkflowId;

            public static /* synthetic */ VerificationRequired copy$default(VerificationRequired verificationRequired, UUID uuid, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = verificationRequired.verificationWorkflowId;
                }
                if ((i & 2) != 0) {
                    z = verificationRequired.isMigrated;
                }
                return verificationRequired.copy(uuid, z);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getVerificationWorkflowId() {
                return this.verificationWorkflowId;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsMigrated() {
                return this.isMigrated;
            }

            public final VerificationRequired copy(UUID verificationWorkflowId, boolean isMigrated) {
                Intrinsics.checkNotNullParameter(verificationWorkflowId, "verificationWorkflowId");
                return new VerificationRequired(verificationWorkflowId, isMigrated);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VerificationRequired)) {
                    return false;
                }
                VerificationRequired verificationRequired = (VerificationRequired) other;
                return Intrinsics.areEqual(this.verificationWorkflowId, verificationRequired.verificationWorkflowId) && this.isMigrated == verificationRequired.isMigrated;
            }

            public int hashCode() {
                return (this.verificationWorkflowId.hashCode() * 31) + Boolean.hashCode(this.isMigrated);
            }

            public String toString() {
                return "VerificationRequired(verificationWorkflowId=" + this.verificationWorkflowId + ", isMigrated=" + this.isMigrated + ")";
            }

            public VerificationRequired(UUID verificationWorkflowId, boolean z) {
                Intrinsics.checkNotNullParameter(verificationWorkflowId, "verificationWorkflowId");
                this.verificationWorkflowId = verificationWorkflowId;
                this.isMigrated = z;
            }

            @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactEvent.SubmitResult
            public boolean getClearLoading() {
                return DefaultImpls.getClearLoading(this);
            }

            public final UUID getVerificationWorkflowId() {
                return this.verificationWorkflowId;
            }

            public final boolean isMigrated() {
                return this.isMigrated;
            }
        }

        /* compiled from: ConfirmContactEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult;", "Approved", "NotApproved", "Canceled", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete$Approved;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete$Canceled;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete$NotApproved;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface VerificationComplete extends SubmitResult {

            /* compiled from: ConfirmContactEvent.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class DefaultImpls {
                public static boolean getClearLoading(VerificationComplete verificationComplete) {
                    return DefaultImpls.getClearLoading(verificationComplete);
                }
            }

            /* compiled from: ConfirmContactEvent.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete$Approved;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete;", "verificationResult", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "confirmationType", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "<init>", "(Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;)V", "getVerificationResult", "()Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "getConfirmationType", "()Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Approved implements VerificationComplete {
                public static final int $stable = 8;
                private final ConfirmationType confirmationType;
                private final VerificationWorkflowResult verificationResult;

                public static /* synthetic */ Approved copy$default(Approved approved, VerificationWorkflowResult verificationWorkflowResult, ConfirmationType confirmationType, int i, Object obj) {
                    if ((i & 1) != 0) {
                        verificationWorkflowResult = approved.verificationResult;
                    }
                    if ((i & 2) != 0) {
                        confirmationType = approved.confirmationType;
                    }
                    return approved.copy(verificationWorkflowResult, confirmationType);
                }

                /* renamed from: component1, reason: from getter */
                public final VerificationWorkflowResult getVerificationResult() {
                    return this.verificationResult;
                }

                /* renamed from: component2, reason: from getter */
                public final ConfirmationType getConfirmationType() {
                    return this.confirmationType;
                }

                public final Approved copy(VerificationWorkflowResult verificationResult, ConfirmationType confirmationType) {
                    Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
                    Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
                    return new Approved(verificationResult, confirmationType);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Approved)) {
                        return false;
                    }
                    Approved approved = (Approved) other;
                    return this.verificationResult == approved.verificationResult && Intrinsics.areEqual(this.confirmationType, approved.confirmationType);
                }

                public int hashCode() {
                    return (this.verificationResult.hashCode() * 31) + this.confirmationType.hashCode();
                }

                public String toString() {
                    return "Approved(verificationResult=" + this.verificationResult + ", confirmationType=" + this.confirmationType + ")";
                }

                public Approved(VerificationWorkflowResult verificationResult, ConfirmationType confirmationType) {
                    Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
                    Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
                    this.verificationResult = verificationResult;
                    this.confirmationType = confirmationType;
                }

                @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactEvent.SubmitResult
                public boolean getClearLoading() {
                    return DefaultImpls.getClearLoading(this);
                }

                public final VerificationWorkflowResult getVerificationResult() {
                    return this.verificationResult;
                }

                public final ConfirmationType getConfirmationType() {
                    return this.confirmationType;
                }
            }

            /* compiled from: ConfirmContactEvent.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete$NotApproved;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class NotApproved implements VerificationComplete {
                public static final int $stable = 0;
                public static final NotApproved INSTANCE = new NotApproved();

                private NotApproved() {
                }

                @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactEvent.SubmitResult
                public boolean getClearLoading() {
                    return DefaultImpls.getClearLoading(this);
                }
            }

            /* compiled from: ConfirmContactEvent.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete$Canceled;", "Lcom/robinhood/android/matcha/ui/search/confirm/ConfirmContactEvent$SubmitResult$VerificationComplete;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Canceled implements VerificationComplete {
                public static final int $stable = 0;
                public static final Canceled INSTANCE = new Canceled();

                private Canceled() {
                }

                @Override // com.robinhood.android.matcha.ui.search.confirm.ConfirmContactEvent.SubmitResult
                public boolean getClearLoading() {
                    return DefaultImpls.getClearLoading(this);
                }
            }
        }
    }
}
