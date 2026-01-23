package com.robinhood.android.taxcenter.viewdocument;

import com.robinhood.models.p320db.Document;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewTaxDocumentViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState;", "", "<init>", "()V", "Loading", "Ready", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState$Loading;", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState$Ready;", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class ViewTaxDocumentViewState {
    public static final int $stable = 0;

    public /* synthetic */ ViewTaxDocumentViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ViewTaxDocumentViewState() {
    }

    /* compiled from: ViewTaxDocumentViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState$Loading;", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends ViewTaxDocumentViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 106739493;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: ViewTaxDocumentViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState$Ready;", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState;", "filename", "", "filetype", "document", "Lcom/robinhood/models/db/Document;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/Document;)V", "getFilename", "()Ljava/lang/String;", "getFiletype", "getDocument", "()Lcom/robinhood/models/db/Document;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready extends ViewTaxDocumentViewState {
        public static final int $stable = 8;
        private final Document document;
        private final String filename;
        private final String filetype;

        public static /* synthetic */ Ready copy$default(Ready ready, String str, String str2, Document document, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ready.filename;
            }
            if ((i & 2) != 0) {
                str2 = ready.filetype;
            }
            if ((i & 4) != 0) {
                document = ready.document;
            }
            return ready.copy(str, str2, document);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFiletype() {
            return this.filetype;
        }

        /* renamed from: component3, reason: from getter */
        public final Document getDocument() {
            return this.document;
        }

        public final Ready copy(String filename, String filetype, Document document) {
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(filetype, "filetype");
            Intrinsics.checkNotNullParameter(document, "document");
            return new Ready(filename, filetype, document);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.filename, ready.filename) && Intrinsics.areEqual(this.filetype, ready.filetype) && Intrinsics.areEqual(this.document, ready.document);
        }

        public int hashCode() {
            return (((this.filename.hashCode() * 31) + this.filetype.hashCode()) * 31) + this.document.hashCode();
        }

        public String toString() {
            return "Ready(filename=" + this.filename + ", filetype=" + this.filetype + ", document=" + this.document + ")";
        }

        public final String getFilename() {
            return this.filename;
        }

        public final String getFiletype() {
            return this.filetype;
        }

        public final Document getDocument() {
            return this.document;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(String filename, String filetype, Document document) {
            super(null);
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(filetype, "filetype");
            Intrinsics.checkNotNullParameter(document, "document");
            this.filename = filename;
            this.filetype = filetype;
            this.document = document;
        }
    }
}
