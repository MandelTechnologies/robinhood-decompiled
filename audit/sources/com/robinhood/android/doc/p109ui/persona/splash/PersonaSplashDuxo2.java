package com.robinhood.android.doc.p109ui.persona.splash;

import com.robinhood.models.p355ui.DocumentRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonaSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashEvent;", "", "<init>", "()V", "DocumentRequestLoadingFinished", "FinishFlow", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashEvent$DocumentRequestLoadingFinished;", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashEvent$FinishFlow;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashEvent, reason: use source file name */
/* loaded from: classes7.dex */
public abstract class PersonaSplashDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ PersonaSplashDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PersonaSplashDuxo2() {
    }

    /* compiled from: PersonaSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashEvent$DocumentRequestLoadingFinished;", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashEvent;", "documentRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "<init>", "(Ljava/util/List;)V", "getDocumentRequests", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashEvent$DocumentRequestLoadingFinished, reason: from toString */
    public static final /* data */ class DocumentRequestLoadingFinished extends PersonaSplashDuxo2 {
        public static final int $stable = 8;
        private final List<DocumentRequest> documentRequests;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DocumentRequestLoadingFinished copy$default(DocumentRequestLoadingFinished documentRequestLoadingFinished, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = documentRequestLoadingFinished.documentRequests;
            }
            return documentRequestLoadingFinished.copy(list);
        }

        public final List<DocumentRequest> component1() {
            return this.documentRequests;
        }

        public final DocumentRequestLoadingFinished copy(List<DocumentRequest> documentRequests) {
            Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
            return new DocumentRequestLoadingFinished(documentRequests);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DocumentRequestLoadingFinished) && Intrinsics.areEqual(this.documentRequests, ((DocumentRequestLoadingFinished) other).documentRequests);
        }

        public int hashCode() {
            return this.documentRequests.hashCode();
        }

        public String toString() {
            return "DocumentRequestLoadingFinished(documentRequests=" + this.documentRequests + ")";
        }

        public final List<DocumentRequest> getDocumentRequests() {
            return this.documentRequests;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentRequestLoadingFinished(List<DocumentRequest> documentRequests) {
            super(null);
            Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
            this.documentRequests = documentRequests;
        }
    }

    /* compiled from: PersonaSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashEvent$FinishFlow;", "Lcom/robinhood/android/doc/ui/persona/splash/VerifyIdentitySplashEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.persona.splash.VerifyIdentitySplashEvent$FinishFlow */
    public static final /* data */ class FinishFlow extends PersonaSplashDuxo2 {
        public static final int $stable = 0;
        public static final FinishFlow INSTANCE = new FinishFlow();

        public boolean equals(Object other) {
            return this == other || (other instanceof FinishFlow);
        }

        public int hashCode() {
            return -1122262904;
        }

        public String toString() {
            return "FinishFlow";
        }

        private FinishFlow() {
            super(null);
        }
    }
}
