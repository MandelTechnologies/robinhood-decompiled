package com.robinhood.android.taxcertification;

import com.robinhood.models.p355ui.DocumentRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyTaxInfoDestination.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination;", "", "<init>", "()V", "Receiver", "CheckSsn", "SsnLockout", "DocUpload", "Exit", "GoHome", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$CheckSsn;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$DocUpload;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Exit;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$GoHome;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$SsnLockout;", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class VerifyTaxInfoDestination {

    /* compiled from: VerifyTaxInfoDestination.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", "", "navigateToDestination", "", "destination", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination;", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Receiver {
        void navigateToDestination(VerifyTaxInfoDestination destination);
    }

    public /* synthetic */ VerifyTaxInfoDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VerifyTaxInfoDestination() {
    }

    /* compiled from: VerifyTaxInfoDestination.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$CheckSsn;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination;", "<init>", "()V", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CheckSsn extends VerifyTaxInfoDestination {
        public static final CheckSsn INSTANCE = new CheckSsn();

        private CheckSsn() {
            super(null);
        }
    }

    /* compiled from: VerifyTaxInfoDestination.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$SsnLockout;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination;", "<init>", "()V", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SsnLockout extends VerifyTaxInfoDestination {
        public static final SsnLockout INSTANCE = new SsnLockout();

        private SsnLockout() {
            super(null);
        }
    }

    /* compiled from: VerifyTaxInfoDestination.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$DocUpload;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination;", "request", "Lcom/robinhood/models/ui/DocumentRequest;", "<init>", "(Lcom/robinhood/models/ui/DocumentRequest;)V", "getRequest", "()Lcom/robinhood/models/ui/DocumentRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DocUpload extends VerifyTaxInfoDestination {
        private final DocumentRequest request;

        public static /* synthetic */ DocUpload copy$default(DocUpload docUpload, DocumentRequest documentRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                documentRequest = docUpload.request;
            }
            return docUpload.copy(documentRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final DocumentRequest getRequest() {
            return this.request;
        }

        public final DocUpload copy(DocumentRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new DocUpload(request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DocUpload) && Intrinsics.areEqual(this.request, ((DocUpload) other).request);
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return "DocUpload(request=" + this.request + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocUpload(DocumentRequest request) {
            super(null);
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
        }

        public final DocumentRequest getRequest() {
            return this.request;
        }
    }

    /* compiled from: VerifyTaxInfoDestination.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Exit;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination;", "<init>", "()V", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Exit extends VerifyTaxInfoDestination {
        public static final Exit INSTANCE = new Exit();

        private Exit() {
            super(null);
        }
    }

    /* compiled from: VerifyTaxInfoDestination.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$GoHome;", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination;", "<init>", "()V", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GoHome extends VerifyTaxInfoDestination {
        public static final GoHome INSTANCE = new GoHome();

        private GoHome() {
            super(null);
        }
    }
}
