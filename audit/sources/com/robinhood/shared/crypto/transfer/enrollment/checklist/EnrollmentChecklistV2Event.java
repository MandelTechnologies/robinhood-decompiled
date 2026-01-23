package com.robinhood.shared.crypto.transfer.enrollment.checklist;

import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentChecklistV2Event.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Event;", "", "Navigate", "Error", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Event$Error;", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Event$Navigate;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface EnrollmentChecklistV2Event {

    /* compiled from: EnrollmentChecklistV2Event.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Event$Navigate;", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Event;", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "<init>", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;)V", "getEnrollmentState", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Navigate implements EnrollmentChecklistV2Event {
        public static final int $stable = 8;
        private final ApiCryptoTransferEnrollment enrollmentState;

        public static /* synthetic */ Navigate copy$default(Navigate navigate, ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCryptoTransferEnrollment = navigate.enrollmentState;
            }
            return navigate.copy(apiCryptoTransferEnrollment);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoTransferEnrollment getEnrollmentState() {
            return this.enrollmentState;
        }

        public final Navigate copy(ApiCryptoTransferEnrollment enrollmentState) {
            Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
            return new Navigate(enrollmentState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Navigate) && Intrinsics.areEqual(this.enrollmentState, ((Navigate) other).enrollmentState);
        }

        public int hashCode() {
            return this.enrollmentState.hashCode();
        }

        public String toString() {
            return "Navigate(enrollmentState=" + this.enrollmentState + ")";
        }

        public Navigate(ApiCryptoTransferEnrollment enrollmentState) {
            Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
            this.enrollmentState = enrollmentState;
        }

        public final ApiCryptoTransferEnrollment getEnrollmentState() {
            return this.enrollmentState;
        }
    }

    /* compiled from: EnrollmentChecklistV2Event.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Event$Error;", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Event;", "error", "", "displayText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/Throwable;Lcom/robinhood/utils/resource/StringResource;)V", "getError", "()Ljava/lang/Throwable;", "getDisplayText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements EnrollmentChecklistV2Event {
        public static final int $stable = 8;
        private final StringResource displayText;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            if ((i & 2) != 0) {
                stringResource = error.displayText;
            }
            return error.copy(th, stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getDisplayText() {
            return this.displayText;
        }

        public final Error copy(Throwable error, StringResource displayText) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error, displayText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.error, error.error) && Intrinsics.areEqual(this.displayText, error.displayText);
        }

        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            StringResource stringResource = this.displayText;
            return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
        }

        public String toString() {
            return "Error(error=" + this.error + ", displayText=" + this.displayText + ")";
        }

        public Error(Throwable error, StringResource stringResource) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
            this.displayText = stringResource;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final StringResource getDisplayText() {
            return this.displayText;
        }
    }
}
