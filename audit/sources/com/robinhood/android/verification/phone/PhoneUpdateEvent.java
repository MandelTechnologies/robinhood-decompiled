package com.robinhood.android.verification.phone;

import com.robinhood.iso.countrycode.CountryCode;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneUpdateEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateEvent;", "", "Error", "InitialLocality", "StartSuv", "Success", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent$Error;", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent$InitialLocality;", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent$StartSuv;", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent$Success;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface PhoneUpdateEvent {

    /* compiled from: PhoneUpdateEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateEvent$Error;", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements PhoneUpdateEvent {
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

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: PhoneUpdateEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateEvent$InitialLocality;", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;)V", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitialLocality implements PhoneUpdateEvent {
        public static final int $stable = 8;
        private final CountryCode countryCode;

        public static /* synthetic */ InitialLocality copy$default(InitialLocality initialLocality, CountryCode countryCode, int i, Object obj) {
            if ((i & 1) != 0) {
                countryCode = initialLocality.countryCode;
            }
            return initialLocality.copy(countryCode);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final InitialLocality copy(CountryCode countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new InitialLocality(countryCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitialLocality) && Intrinsics.areEqual(this.countryCode, ((InitialLocality) other).countryCode);
        }

        public int hashCode() {
            return this.countryCode.hashCode();
        }

        public String toString() {
            return "InitialLocality(countryCode=" + this.countryCode + ")";
        }

        public InitialLocality(CountryCode countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryCode = countryCode;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }
    }

    /* compiled from: PhoneUpdateEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateEvent$StartSuv;", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent;", "phoneNumber", "", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Z)V", "getPhoneNumber", "()Ljava/lang/String;", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartSuv implements PhoneUpdateEvent {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final String phoneNumber;
        private final UUID workflowId;

        public static /* synthetic */ StartSuv copy$default(StartSuv startSuv, String str, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startSuv.phoneNumber;
            }
            if ((i & 2) != 0) {
                uuid = startSuv.workflowId;
            }
            if ((i & 4) != 0) {
                z = startSuv.isMigrated;
            }
            return startSuv.copy(str, uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }

        public final StartSuv copy(String phoneNumber, UUID workflowId, boolean isMigrated) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new StartSuv(phoneNumber, workflowId, isMigrated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartSuv)) {
                return false;
            }
            StartSuv startSuv = (StartSuv) other;
            return Intrinsics.areEqual(this.phoneNumber, startSuv.phoneNumber) && Intrinsics.areEqual(this.workflowId, startSuv.workflowId) && this.isMigrated == startSuv.isMigrated;
        }

        public int hashCode() {
            return (((this.phoneNumber.hashCode() * 31) + this.workflowId.hashCode()) * 31) + Boolean.hashCode(this.isMigrated);
        }

        public String toString() {
            return "StartSuv(phoneNumber=" + this.phoneNumber + ", workflowId=" + this.workflowId + ", isMigrated=" + this.isMigrated + ")";
        }

        public StartSuv(String phoneNumber, UUID workflowId, boolean z) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.phoneNumber = phoneNumber;
            this.workflowId = workflowId;
            this.isMigrated = z;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        public final boolean isMigrated() {
            return this.isMigrated;
        }
    }

    /* compiled from: PhoneUpdateEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateEvent$Success;", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent;", "phoneNumber", "", "<init>", "(Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements PhoneUpdateEvent {
        public static final int $stable = 0;
        private final String phoneNumber;

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.phoneNumber;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final Success copy(String phoneNumber) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            return new Success(phoneNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.phoneNumber, ((Success) other).phoneNumber);
        }

        public int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public String toString() {
            return "Success(phoneNumber=" + this.phoneNumber + ")";
        }

        public Success(String phoneNumber) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }
    }
}
