package com.robinhood.shared.crypto.transfer.enrollment.navigation;

import android.net.Uri;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentEvent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "", "Start", "IntroLoaded", "StartEnrollment", "AckScamWarning", "Agreement", "Checklist", "CheckForCompletion", "ErrorAcknowledged", "ToPreviousStep", "Done", "Exit", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$AckScamWarning;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Agreement;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$CheckForCompletion;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Checklist;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Done;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$ErrorAcknowledged;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Exit;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$IntroLoaded;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Start;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$StartEnrollment;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$ToPreviousStep;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface EnrollmentEvent {

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Start;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "<init>", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;)V", "getEnrollmentState", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Start implements EnrollmentEvent {
        public static final int $stable = 0;
        private final ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState;

        public static /* synthetic */ Start copy$default(Start start, ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, int i, Object obj) {
            if ((i & 1) != 0) {
                enrollmentState = start.enrollmentState;
            }
            return start.copy(enrollmentState);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoTransferConfig.TransferStates.EnrollmentState getEnrollmentState() {
            return this.enrollmentState;
        }

        public final Start copy(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState) {
            Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
            return new Start(enrollmentState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Start) && this.enrollmentState == ((Start) other).enrollmentState;
        }

        public int hashCode() {
            return this.enrollmentState.hashCode();
        }

        public String toString() {
            return "Start(enrollmentState=" + this.enrollmentState + ")";
        }

        public Start(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState) {
            Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
            this.enrollmentState = enrollmentState;
        }

        public final ApiCryptoTransferConfig.TransferStates.EnrollmentState getEnrollmentState() {
            return this.enrollmentState;
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$IntroLoaded;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "files", "", "Landroid/net/Uri;", "<init>", "(Ljava/util/List;)V", "getFiles", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IntroLoaded implements EnrollmentEvent {
        public static final int $stable = 8;
        private final List<Uri> files;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IntroLoaded copy$default(IntroLoaded introLoaded, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = introLoaded.files;
            }
            return introLoaded.copy(list);
        }

        public final List<Uri> component1() {
            return this.files;
        }

        public final IntroLoaded copy(List<? extends Uri> files) {
            Intrinsics.checkNotNullParameter(files, "files");
            return new IntroLoaded(files);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IntroLoaded) && Intrinsics.areEqual(this.files, ((IntroLoaded) other).files);
        }

        public int hashCode() {
            return this.files.hashCode();
        }

        public String toString() {
            return "IntroLoaded(files=" + this.files + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IntroLoaded(List<? extends Uri> files) {
            Intrinsics.checkNotNullParameter(files, "files");
            this.files = files;
        }

        public final List<Uri> getFiles() {
            return this.files;
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$StartEnrollment;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartEnrollment implements EnrollmentEvent {
        public static final int $stable = 0;
        public static final StartEnrollment INSTANCE = new StartEnrollment();

        public boolean equals(Object other) {
            return this == other || (other instanceof StartEnrollment);
        }

        public int hashCode() {
            return -971428204;
        }

        public String toString() {
            return "StartEnrollment";
        }

        private StartEnrollment() {
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$AckScamWarning;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AckScamWarning implements EnrollmentEvent {
        public static final int $stable = 0;
        public static final AckScamWarning INSTANCE = new AckScamWarning();

        public boolean equals(Object other) {
            return this == other || (other instanceof AckScamWarning);
        }

        public int hashCode() {
            return -791706135;
        }

        public String toString() {
            return "AckScamWarning";
        }

        private AckScamWarning() {
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Agreement;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "Skip", "AckedAgreement", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Agreement$AckedAgreement;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Agreement$Skip;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Agreement extends EnrollmentEvent {

        /* compiled from: EnrollmentEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Agreement$Skip;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Agreement;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Skip implements Agreement {
            public static final int $stable = 0;
            public static final Skip INSTANCE = new Skip();

            public boolean equals(Object other) {
                return this == other || (other instanceof Skip);
            }

            public int hashCode() {
                return -1294250059;
            }

            public String toString() {
                return "Skip";
            }

            private Skip() {
            }
        }

        /* compiled from: EnrollmentEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Agreement$AckedAgreement;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Agreement;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AckedAgreement implements Agreement {
            public static final int $stable = 0;
            public static final AckedAgreement INSTANCE = new AckedAgreement();

            public boolean equals(Object other) {
                return this == other || (other instanceof AckedAgreement);
            }

            public int hashCode() {
                return 1747046072;
            }

            public String toString() {
                return "AckedAgreement";
            }

            private AckedAgreement() {
            }
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Checklist;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "DocumentRequest", "TwoFactorAuthSetup", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Checklist$DocumentRequest;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Checklist$TwoFactorAuthSetup;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Checklist extends EnrollmentEvent {

        /* compiled from: EnrollmentEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Checklist$DocumentRequest;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Checklist;", "deeplinkUri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getDeeplinkUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DocumentRequest implements Checklist {
            public static final int $stable = 8;
            private final Uri deeplinkUri;

            public static /* synthetic */ DocumentRequest copy$default(DocumentRequest documentRequest, Uri uri, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = documentRequest.deeplinkUri;
                }
                return documentRequest.copy(uri);
            }

            /* renamed from: component1, reason: from getter */
            public final Uri getDeeplinkUri() {
                return this.deeplinkUri;
            }

            public final DocumentRequest copy(Uri deeplinkUri) {
                Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
                return new DocumentRequest(deeplinkUri);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DocumentRequest) && Intrinsics.areEqual(this.deeplinkUri, ((DocumentRequest) other).deeplinkUri);
            }

            public int hashCode() {
                return this.deeplinkUri.hashCode();
            }

            public String toString() {
                return "DocumentRequest(deeplinkUri=" + this.deeplinkUri + ")";
            }

            public DocumentRequest(Uri deeplinkUri) {
                Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
                this.deeplinkUri = deeplinkUri;
            }

            public final Uri getDeeplinkUri() {
                return this.deeplinkUri;
            }
        }

        /* compiled from: EnrollmentEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Checklist$TwoFactorAuthSetup;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Checklist;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TwoFactorAuthSetup implements Checklist {
            public static final int $stable = 0;
            public static final TwoFactorAuthSetup INSTANCE = new TwoFactorAuthSetup();

            public boolean equals(Object other) {
                return this == other || (other instanceof TwoFactorAuthSetup);
            }

            public int hashCode() {
                return -757624876;
            }

            public String toString() {
                return "TwoFactorAuthSetup";
            }

            private TwoFactorAuthSetup() {
            }
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$CheckForCompletion;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "enrollment", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "<init>", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;)V", "getEnrollment", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CheckForCompletion implements EnrollmentEvent {
        public static final int $stable = 8;
        private final ApiCryptoTransferEnrollment enrollment;

        public static /* synthetic */ CheckForCompletion copy$default(CheckForCompletion checkForCompletion, ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCryptoTransferEnrollment = checkForCompletion.enrollment;
            }
            return checkForCompletion.copy(apiCryptoTransferEnrollment);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoTransferEnrollment getEnrollment() {
            return this.enrollment;
        }

        public final CheckForCompletion copy(ApiCryptoTransferEnrollment enrollment) {
            Intrinsics.checkNotNullParameter(enrollment, "enrollment");
            return new CheckForCompletion(enrollment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckForCompletion) && Intrinsics.areEqual(this.enrollment, ((CheckForCompletion) other).enrollment);
        }

        public int hashCode() {
            return this.enrollment.hashCode();
        }

        public String toString() {
            return "CheckForCompletion(enrollment=" + this.enrollment + ")";
        }

        public CheckForCompletion(ApiCryptoTransferEnrollment enrollment) {
            Intrinsics.checkNotNullParameter(enrollment, "enrollment");
            this.enrollment = enrollment;
        }

        public final ApiCryptoTransferEnrollment getEnrollment() {
            return this.enrollment;
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$ErrorAcknowledged;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ErrorAcknowledged implements EnrollmentEvent {
        public static final int $stable = 0;
        public static final ErrorAcknowledged INSTANCE = new ErrorAcknowledged();

        public boolean equals(Object other) {
            return this == other || (other instanceof ErrorAcknowledged);
        }

        public int hashCode() {
            return -1577427586;
        }

        public String toString() {
            return "ErrorAcknowledged";
        }

        private ErrorAcknowledged() {
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$ToPreviousStep;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ToPreviousStep implements EnrollmentEvent {
        public static final int $stable = 0;
        public static final ToPreviousStep INSTANCE = new ToPreviousStep();

        public boolean equals(Object other) {
            return this == other || (other instanceof ToPreviousStep);
        }

        public int hashCode() {
            return -2067612368;
        }

        public String toString() {
            return "ToPreviousStep";
        }

        private ToPreviousStep() {
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Done;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "exitDeeplink", "", "<init>", "(Ljava/lang/String;)V", "getExitDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Done implements EnrollmentEvent {
        public static final int $stable = 0;
        private final String exitDeeplink;

        public static /* synthetic */ Done copy$default(Done done, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = done.exitDeeplink;
            }
            return done.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getExitDeeplink() {
            return this.exitDeeplink;
        }

        public final Done copy(String exitDeeplink) {
            return new Done(exitDeeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Done) && Intrinsics.areEqual(this.exitDeeplink, ((Done) other).exitDeeplink);
        }

        public int hashCode() {
            String str = this.exitDeeplink;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Done(exitDeeplink=" + this.exitDeeplink + ")";
        }

        public Done(String str) {
            this.exitDeeplink = str;
        }

        public final String getExitDeeplink() {
            return this.exitDeeplink;
        }
    }

    /* compiled from: EnrollmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Exit;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Exit implements EnrollmentEvent {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        public boolean equals(Object other) {
            return this == other || (other instanceof Exit);
        }

        public int hashCode() {
            return 724887632;
        }

        public String toString() {
            return "Exit";
        }

        private Exit() {
        }
    }
}
