package com.robinhood.android.securitycenter.p251ui.mfa.sms;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaSmsVerifyEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent;", "", "SubmitSuccessEvent", "ResendEvent", "VerificationWorkflowEvent", "ErrorEvent", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent$ErrorEvent;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent$ResendEvent;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent$SubmitSuccessEvent;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent$VerificationWorkflowEvent;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface MfaSmsVerifyEvent {

    /* compiled from: MfaSmsVerifyEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent$SubmitSuccessEvent;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubmitSuccessEvent implements MfaSmsVerifyEvent {
        public static final int $stable = 0;
        public static final SubmitSuccessEvent INSTANCE = new SubmitSuccessEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof SubmitSuccessEvent);
        }

        public int hashCode() {
            return -1232192579;
        }

        public String toString() {
            return "SubmitSuccessEvent";
        }

        private SubmitSuccessEvent() {
        }
    }

    /* compiled from: MfaSmsVerifyEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent$ResendEvent;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent;", "phoneNumber", "", "<init>", "(Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ResendEvent implements MfaSmsVerifyEvent {
        public static final int $stable = 0;
        private final String phoneNumber;

        public static /* synthetic */ ResendEvent copy$default(ResendEvent resendEvent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resendEvent.phoneNumber;
            }
            return resendEvent.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final ResendEvent copy(String phoneNumber) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            return new ResendEvent(phoneNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResendEvent) && Intrinsics.areEqual(this.phoneNumber, ((ResendEvent) other).phoneNumber);
        }

        public int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public String toString() {
            return "ResendEvent(phoneNumber=" + this.phoneNumber + ")";
        }

        public ResendEvent(String phoneNumber) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }
    }

    /* compiled from: MfaSmsVerifyEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent$VerificationWorkflowEvent;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerificationWorkflowEvent implements MfaSmsVerifyEvent {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final UUID workflowId;

        public static /* synthetic */ VerificationWorkflowEvent copy$default(VerificationWorkflowEvent verificationWorkflowEvent, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = verificationWorkflowEvent.workflowId;
            }
            if ((i & 2) != 0) {
                z = verificationWorkflowEvent.isMigrated;
            }
            return verificationWorkflowEvent.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }

        public final VerificationWorkflowEvent copy(UUID workflowId, boolean isMigrated) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new VerificationWorkflowEvent(workflowId, isMigrated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerificationWorkflowEvent)) {
                return false;
            }
            VerificationWorkflowEvent verificationWorkflowEvent = (VerificationWorkflowEvent) other;
            return Intrinsics.areEqual(this.workflowId, verificationWorkflowEvent.workflowId) && this.isMigrated == verificationWorkflowEvent.isMigrated;
        }

        public int hashCode() {
            return (this.workflowId.hashCode() * 31) + Boolean.hashCode(this.isMigrated);
        }

        public String toString() {
            return "VerificationWorkflowEvent(workflowId=" + this.workflowId + ", isMigrated=" + this.isMigrated + ")";
        }

        public VerificationWorkflowEvent(UUID workflowId, boolean z) {
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

    /* compiled from: MfaSmsVerifyEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent$ErrorEvent;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ErrorEvent implements MfaSmsVerifyEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ ErrorEvent copy$default(ErrorEvent errorEvent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = errorEvent.throwable;
            }
            return errorEvent.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final ErrorEvent copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new ErrorEvent(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorEvent) && Intrinsics.areEqual(this.throwable, ((ErrorEvent) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "ErrorEvent(throwable=" + this.throwable + ")";
        }

        public ErrorEvent(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
