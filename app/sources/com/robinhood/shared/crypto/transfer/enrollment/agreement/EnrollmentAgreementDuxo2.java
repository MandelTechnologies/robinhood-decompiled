package com.robinhood.shared.crypto.transfer.enrollment.agreement;

import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent;", "", "ReviewAgreement", "Success", "NavigateToAccountSecurity", "Error", "Skip", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$NavigateToAccountSecurity;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$ReviewAgreement;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$Skip;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$Success;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementEvent, reason: use source file name */
/* loaded from: classes6.dex */
public interface EnrollmentAgreementDuxo2 {

    /* compiled from: EnrollmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$ReviewAgreement;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent;", "contentfulId", "", "<init>", "(Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementEvent$ReviewAgreement, reason: from toString */
    public static final /* data */ class ReviewAgreement implements EnrollmentAgreementDuxo2 {
        public static final int $stable = 0;
        private final String contentfulId;

        public static /* synthetic */ ReviewAgreement copy$default(ReviewAgreement reviewAgreement, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reviewAgreement.contentfulId;
            }
            return reviewAgreement.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentfulId() {
            return this.contentfulId;
        }

        public final ReviewAgreement copy(String contentfulId) {
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            return new ReviewAgreement(contentfulId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReviewAgreement) && Intrinsics.areEqual(this.contentfulId, ((ReviewAgreement) other).contentfulId);
        }

        public int hashCode() {
            return this.contentfulId.hashCode();
        }

        public String toString() {
            return "ReviewAgreement(contentfulId=" + this.contentfulId + ")";
        }

        public ReviewAgreement(String contentfulId) {
            Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
            this.contentfulId = contentfulId;
        }

        public final String getContentfulId() {
            return this.contentfulId;
        }
    }

    /* compiled from: EnrollmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$Success;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent;", "enrollment", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "<init>", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;)V", "getEnrollment", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementEvent$Success, reason: from toString */
    public static final /* data */ class Success implements EnrollmentAgreementDuxo2 {
        public static final int $stable = 8;
        private final ApiCryptoTransferEnrollment enrollment;

        public static /* synthetic */ Success copy$default(Success success, ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCryptoTransferEnrollment = success.enrollment;
            }
            return success.copy(apiCryptoTransferEnrollment);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoTransferEnrollment getEnrollment() {
            return this.enrollment;
        }

        public final Success copy(ApiCryptoTransferEnrollment enrollment) {
            Intrinsics.checkNotNullParameter(enrollment, "enrollment");
            return new Success(enrollment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.enrollment, ((Success) other).enrollment);
        }

        public int hashCode() {
            return this.enrollment.hashCode();
        }

        public String toString() {
            return "Success(enrollment=" + this.enrollment + ")";
        }

        public Success(ApiCryptoTransferEnrollment enrollment) {
            Intrinsics.checkNotNullParameter(enrollment, "enrollment");
            this.enrollment = enrollment;
        }

        public final ApiCryptoTransferEnrollment getEnrollment() {
            return this.enrollment;
        }
    }

    /* compiled from: EnrollmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$NavigateToAccountSecurity;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementEvent$NavigateToAccountSecurity */
    public static final /* data */ class NavigateToAccountSecurity implements EnrollmentAgreementDuxo2 {
        public static final int $stable = 0;
        public static final NavigateToAccountSecurity INSTANCE = new NavigateToAccountSecurity();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToAccountSecurity);
        }

        public int hashCode() {
            return 1083042955;
        }

        public String toString() {
            return "NavigateToAccountSecurity";
        }

        private NavigateToAccountSecurity() {
        }
    }

    /* compiled from: EnrollmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementEvent$Error, reason: from toString */
    public static final /* data */ class Error implements EnrollmentAgreementDuxo2 {
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

    /* compiled from: EnrollmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent$Skip;", "Lcom/robinhood/shared/crypto/transfer/enrollment/agreement/EnrollmentAgreementEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementEvent$Skip */
    public static final /* data */ class Skip implements EnrollmentAgreementDuxo2 {
        public static final int $stable = 0;
        public static final Skip INSTANCE = new Skip();

        public boolean equals(Object other) {
            return this == other || (other instanceof Skip);
        }

        public int hashCode() {
            return 680575445;
        }

        public String toString() {
            return "Skip";
        }

        private Skip() {
        }
    }
}
