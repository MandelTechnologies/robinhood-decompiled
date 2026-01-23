package com.robinhood.shared.security.verify.credentials.email;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateEmailEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent;", "", "<init>", "()V", "ShowPrivacyDisclosureDialog", "Success", "Error", "VerificationWorkflow", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent$Error;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent$ShowPrivacyDisclosureDialog;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent$Success;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent$VerificationWorkflow;", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class UpdateEmailEvent {
    public static final int $stable = 0;

    public /* synthetic */ UpdateEmailEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: UpdateEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent$ShowPrivacyDisclosureDialog;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent;", "privacyDisclosureRes", "", "<init>", "(I)V", "getPrivacyDisclosureRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowPrivacyDisclosureDialog extends UpdateEmailEvent {
        public static final int $stable = 0;
        private final int privacyDisclosureRes;

        public static /* synthetic */ ShowPrivacyDisclosureDialog copy$default(ShowPrivacyDisclosureDialog showPrivacyDisclosureDialog, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showPrivacyDisclosureDialog.privacyDisclosureRes;
            }
            return showPrivacyDisclosureDialog.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPrivacyDisclosureRes() {
            return this.privacyDisclosureRes;
        }

        public final ShowPrivacyDisclosureDialog copy(int privacyDisclosureRes) {
            return new ShowPrivacyDisclosureDialog(privacyDisclosureRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowPrivacyDisclosureDialog) && this.privacyDisclosureRes == ((ShowPrivacyDisclosureDialog) other).privacyDisclosureRes;
        }

        public int hashCode() {
            return Integer.hashCode(this.privacyDisclosureRes);
        }

        public String toString() {
            return "ShowPrivacyDisclosureDialog(privacyDisclosureRes=" + this.privacyDisclosureRes + ")";
        }

        public ShowPrivacyDisclosureDialog(int i) {
            super(null);
            this.privacyDisclosureRes = i;
        }

        public final int getPrivacyDisclosureRes() {
            return this.privacyDisclosureRes;
        }
    }

    private UpdateEmailEvent() {
    }

    /* compiled from: UpdateEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent$Success;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends UpdateEmailEvent {
        public static final int $stable = 0;
        private final String email;

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.email;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final Success copy(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new Success(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.email, ((Success) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "Success(email=" + this.email + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String email) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: UpdateEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent$Error;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends UpdateEmailEvent {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: UpdateEmailEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent$VerificationWorkflow;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerificationWorkflow extends UpdateEmailEvent {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final UUID workflowId;

        public static /* synthetic */ VerificationWorkflow copy$default(VerificationWorkflow verificationWorkflow, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = verificationWorkflow.workflowId;
            }
            if ((i & 2) != 0) {
                z = verificationWorkflow.isMigrated;
            }
            return verificationWorkflow.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }

        public final VerificationWorkflow copy(UUID workflowId, boolean isMigrated) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new VerificationWorkflow(workflowId, isMigrated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerificationWorkflow)) {
                return false;
            }
            VerificationWorkflow verificationWorkflow = (VerificationWorkflow) other;
            return Intrinsics.areEqual(this.workflowId, verificationWorkflow.workflowId) && this.isMigrated == verificationWorkflow.isMigrated;
        }

        public int hashCode() {
            return (this.workflowId.hashCode() * 31) + Boolean.hashCode(this.isMigrated);
        }

        public String toString() {
            return "VerificationWorkflow(workflowId=" + this.workflowId + ", isMigrated=" + this.isMigrated + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationWorkflow(UUID workflowId, boolean z) {
            super(null);
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
