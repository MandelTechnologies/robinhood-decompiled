package com.robinhood.shared.crypto.transfer.enrollment.navigation;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentDestination.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "", "IntroLoading", "Intro", "Protection", "Agreement", "Checklist", "DocumentUpload", "TwoFactorAuth", "NavigateToSend", "NavigateToReceive", "Pending", "Completed", "Error", "PopBack", "Exit", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Agreement;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Checklist;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Completed;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$DocumentUpload;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Error;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Exit;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Intro;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$IntroLoading;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$NavigateToReceive;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$NavigateToSend;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Pending;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$PopBack;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Protection;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$TwoFactorAuth;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface EnrollmentDestination {

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$IntroLoading;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IntroLoading implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final IntroLoading INSTANCE = new IntroLoading();

        public boolean equals(Object other) {
            return this == other || (other instanceof IntroLoading);
        }

        public int hashCode() {
            return 1807950574;
        }

        public String toString() {
            return "IntroLoading";
        }

        private IntroLoading() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Intro;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "files", "", "Landroid/net/Uri;", "<init>", "(Ljava/util/List;)V", "getFiles", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Intro implements EnrollmentDestination {
        public static final int $stable = 8;
        private final List<Uri> files;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Intro copy$default(Intro intro, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = intro.files;
            }
            return intro.copy(list);
        }

        public final List<Uri> component1() {
            return this.files;
        }

        public final Intro copy(List<? extends Uri> files) {
            Intrinsics.checkNotNullParameter(files, "files");
            return new Intro(files);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Intro) && Intrinsics.areEqual(this.files, ((Intro) other).files);
        }

        public int hashCode() {
            return this.files.hashCode();
        }

        public String toString() {
            return "Intro(files=" + this.files + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Intro(List<? extends Uri> files) {
            Intrinsics.checkNotNullParameter(files, "files");
            this.files = files;
        }

        public final List<Uri> getFiles() {
            return this.files;
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Protection;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Protection implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final Protection INSTANCE = new Protection();

        public boolean equals(Object other) {
            return this == other || (other instanceof Protection);
        }

        public int hashCode() {
            return -634301417;
        }

        public String toString() {
            return "Protection";
        }

        private Protection() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Agreement;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Agreement implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final Agreement INSTANCE = new Agreement();

        public boolean equals(Object other) {
            return this == other || (other instanceof Agreement);
        }

        public int hashCode() {
            return 39844108;
        }

        public String toString() {
            return "Agreement";
        }

        private Agreement() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Checklist;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Checklist implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final Checklist INSTANCE = new Checklist();

        public boolean equals(Object other) {
            return this == other || (other instanceof Checklist);
        }

        public int hashCode() {
            return -536643416;
        }

        public String toString() {
            return "Checklist";
        }

        private Checklist() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$DocumentUpload;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "deeplinkUri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getDeeplinkUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DocumentUpload implements EnrollmentDestination {
        public static final int $stable = 8;
        private final Uri deeplinkUri;

        public static /* synthetic */ DocumentUpload copy$default(DocumentUpload documentUpload, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = documentUpload.deeplinkUri;
            }
            return documentUpload.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getDeeplinkUri() {
            return this.deeplinkUri;
        }

        public final DocumentUpload copy(Uri deeplinkUri) {
            Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
            return new DocumentUpload(deeplinkUri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DocumentUpload) && Intrinsics.areEqual(this.deeplinkUri, ((DocumentUpload) other).deeplinkUri);
        }

        public int hashCode() {
            return this.deeplinkUri.hashCode();
        }

        public String toString() {
            return "DocumentUpload(deeplinkUri=" + this.deeplinkUri + ")";
        }

        public DocumentUpload(Uri deeplinkUri) {
            Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
            this.deeplinkUri = deeplinkUri;
        }

        public final Uri getDeeplinkUri() {
            return this.deeplinkUri;
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$TwoFactorAuth;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TwoFactorAuth implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final TwoFactorAuth INSTANCE = new TwoFactorAuth();

        public boolean equals(Object other) {
            return this == other || (other instanceof TwoFactorAuth);
        }

        public int hashCode() {
            return 117281029;
        }

        public String toString() {
            return "TwoFactorAuth";
        }

        private TwoFactorAuth() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$NavigateToSend;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToSend implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final NavigateToSend INSTANCE = new NavigateToSend();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToSend);
        }

        public int hashCode() {
            return -287842382;
        }

        public String toString() {
            return "NavigateToSend";
        }

        private NavigateToSend() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$NavigateToReceive;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToReceive implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final NavigateToReceive INSTANCE = new NavigateToReceive();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToReceive);
        }

        public int hashCode() {
            return 1039759993;
        }

        public String toString() {
            return "NavigateToReceive";
        }

        private NavigateToReceive() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Pending;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Pending implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object other) {
            return this == other || (other instanceof Pending);
        }

        public int hashCode() {
            return 1403586841;
        }

        public String toString() {
            return "Pending";
        }

        private Pending() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Completed;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Completed implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final Completed INSTANCE = new Completed();

        public boolean equals(Object other) {
            return this == other || (other instanceof Completed);
        }

        public int hashCode() {
            return 1956093261;
        }

        public String toString() {
            return "Completed";
        }

        private Completed() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Error;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 769346058;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$PopBack;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PopBack implements EnrollmentDestination {
        public static final int $stable = 0;
        public static final PopBack INSTANCE = new PopBack();

        public boolean equals(Object other) {
            return this == other || (other instanceof PopBack);
        }

        public int hashCode() {
            return 1690704474;
        }

        public String toString() {
            return "PopBack";
        }

        private PopBack() {
        }
    }

    /* compiled from: EnrollmentDestination.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination$Exit;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "exitDeeplink", "", "<init>", "(Ljava/lang/String;)V", "getExitDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Exit implements EnrollmentDestination {
        public static final int $stable = 0;
        private final String exitDeeplink;

        public static /* synthetic */ Exit copy$default(Exit exit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = exit.exitDeeplink;
            }
            return exit.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getExitDeeplink() {
            return this.exitDeeplink;
        }

        public final Exit copy(String exitDeeplink) {
            return new Exit(exitDeeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Exit) && Intrinsics.areEqual(this.exitDeeplink, ((Exit) other).exitDeeplink);
        }

        public int hashCode() {
            String str = this.exitDeeplink;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Exit(exitDeeplink=" + this.exitDeeplink + ")";
        }

        public Exit(String str) {
            this.exitDeeplink = str;
        }

        public final String getExitDeeplink() {
            return this.exitDeeplink;
        }
    }
}
