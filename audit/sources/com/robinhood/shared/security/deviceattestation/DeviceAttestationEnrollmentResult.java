package com.robinhood.shared.security.deviceattestation;

import kotlin.Metadata;

/* compiled from: DeviceAttestationEnrollmentResult.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "", "AlreadyRegistered", "Error", "Failed", "InvalidCertificate", "InvalidNonce", "KeyStoreLoadError", "ServerError", "Success", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$AlreadyRegistered;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$Error;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$Failed;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$InvalidCertificate;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$InvalidNonce;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$KeyStoreLoadError;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$ServerError;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$Success;", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface DeviceAttestationEnrollmentResult {

    /* compiled from: DeviceAttestationEnrollmentResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$AlreadyRegistered;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlreadyRegistered implements DeviceAttestationEnrollmentResult {
        public static final AlreadyRegistered INSTANCE = new AlreadyRegistered();

        public boolean equals(Object other) {
            return this == other || (other instanceof AlreadyRegistered);
        }

        public int hashCode() {
            return -1203854023;
        }

        public String toString() {
            return "AlreadyRegistered";
        }

        private AlreadyRegistered() {
        }
    }

    /* compiled from: DeviceAttestationEnrollmentResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$Error;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements DeviceAttestationEnrollmentResult {
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -524648249;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: DeviceAttestationEnrollmentResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$Failed;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed implements DeviceAttestationEnrollmentResult {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object other) {
            return this == other || (other instanceof Failed);
        }

        public int hashCode() {
            return 928431454;
        }

        public String toString() {
            return "Failed";
        }

        private Failed() {
        }
    }

    /* compiled from: DeviceAttestationEnrollmentResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$InvalidCertificate;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvalidCertificate implements DeviceAttestationEnrollmentResult {
        public static final InvalidCertificate INSTANCE = new InvalidCertificate();

        public boolean equals(Object other) {
            return this == other || (other instanceof InvalidCertificate);
        }

        public int hashCode() {
            return -480418111;
        }

        public String toString() {
            return "InvalidCertificate";
        }

        private InvalidCertificate() {
        }
    }

    /* compiled from: DeviceAttestationEnrollmentResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$InvalidNonce;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvalidNonce implements DeviceAttestationEnrollmentResult {
        public static final InvalidNonce INSTANCE = new InvalidNonce();

        public boolean equals(Object other) {
            return this == other || (other instanceof InvalidNonce);
        }

        public int hashCode() {
            return -2090466151;
        }

        public String toString() {
            return "InvalidNonce";
        }

        private InvalidNonce() {
        }
    }

    /* compiled from: DeviceAttestationEnrollmentResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$KeyStoreLoadError;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class KeyStoreLoadError implements DeviceAttestationEnrollmentResult {
        public static final KeyStoreLoadError INSTANCE = new KeyStoreLoadError();

        public boolean equals(Object other) {
            return this == other || (other instanceof KeyStoreLoadError);
        }

        public int hashCode() {
            return 1608102239;
        }

        public String toString() {
            return "KeyStoreLoadError";
        }

        private KeyStoreLoadError() {
        }
    }

    /* compiled from: DeviceAttestationEnrollmentResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$ServerError;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ServerError implements DeviceAttestationEnrollmentResult {
        public static final ServerError INSTANCE = new ServerError();

        public boolean equals(Object other) {
            return this == other || (other instanceof ServerError);
        }

        public int hashCode() {
            return -728029180;
        }

        public String toString() {
            return "ServerError";
        }

        private ServerError() {
        }
    }

    /* compiled from: DeviceAttestationEnrollmentResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult$Success;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements DeviceAttestationEnrollmentResult {
        public static final Success INSTANCE = new Success();

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return -2063975678;
        }

        public String toString() {
            return "Success";
        }

        private Success() {
        }
    }
}
