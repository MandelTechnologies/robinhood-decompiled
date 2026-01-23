package com.robinhood.android.doc.p109ui.initial;

import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.udf.UiEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocUploadInitialIdentiViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState$Error;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState$Loaded;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState$Loading;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class DocUploadInitialIdentiViewState {
    public static final int $stable = 0;

    public /* synthetic */ DocUploadInitialIdentiViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DocUploadInitialIdentiViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState$Loading;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends DocUploadInitialIdentiViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private DocUploadInitialIdentiViewState() {
    }

    /* compiled from: DocUploadInitialIdentiViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState$Loaded;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState;", "documentRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "isGdpr", "", "<init>", "(Ljava/util/List;Z)V", "getDocumentRequests", "()Ljava/util/List;", "()Z", "rejectedReason", "Lcom/robinhood/android/doc/ui/initial/RejectedDocumentRequestReason;", "getRejectedReason", "()Lcom/robinhood/android/doc/ui/initial/RejectedDocumentRequestReason;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Loaded extends DocUploadInitialIdentiViewState {
        public static final int $stable = 8;
        private final List<DocumentRequest> documentRequests;
        private final boolean isGdpr;
        private final RejectedDocumentRequestReason rejectedReason;

        public final List<DocumentRequest> getDocumentRequests() {
            return this.documentRequests;
        }

        /* renamed from: isGdpr, reason: from getter */
        public final boolean getIsGdpr() {
            return this.isGdpr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.robinhood.android.doc.ui.initial.RejectedDocumentRequestReason] */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.robinhood.android.doc.ui.initial.RejectedDocumentRequestReason] */
        /* JADX WARN: Type inference failed for: r0v5 */
        public Loaded(List<DocumentRequest> documentRequests, boolean z) {
            Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
            RejectedDocumentRequestReason rejectedDocumentRequestReason = 0;
            rejectedDocumentRequestReason = 0;
            super(rejectedDocumentRequestReason);
            this.documentRequests = documentRequests;
            this.isGdpr = z;
            if (documentRequests.isEmpty()) {
                rejectedDocumentRequestReason = RejectedDocumentRequestReason.ALREADY_UPLOADED;
            } else {
                List<DocumentRequest> list = documentRequests;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        DocumentRequest documentRequest = (DocumentRequest) it.next();
                        if (documentRequest.getType() == ApiDocumentRequest.Type.UNKNOWN && documentRequest.getServerContent() == null) {
                            rejectedDocumentRequestReason = RejectedDocumentRequestReason.UPDATE_APP_REQUIRED;
                            break;
                        }
                    }
                }
            }
            this.rejectedReason = rejectedDocumentRequestReason;
        }

        public final RejectedDocumentRequestReason getRejectedReason() {
            return this.rejectedReason;
        }
    }

    /* compiled from: DocUploadInitialIdentiViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState$Error;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState;", "throwable", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getThrowable", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends DocUploadInitialIdentiViewState {
        public static final int $stable = 8;
        private final UiEvent<Throwable> throwable;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = error.throwable;
            }
            return error.copy(uiEvent);
        }

        public final UiEvent<Throwable> component1() {
            return this.throwable;
        }

        public final Error copy(UiEvent<Throwable> throwable) {
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
        public Error(UiEvent<Throwable> throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final UiEvent<Throwable> getThrowable() {
            return this.throwable;
        }
    }
}
