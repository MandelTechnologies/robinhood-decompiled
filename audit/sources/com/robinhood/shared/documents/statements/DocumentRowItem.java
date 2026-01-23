package com.robinhood.shared.documents.statements;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentRowItem.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentRowItem;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "TaxCertificationBanner", "Document", "Lcom/robinhood/shared/documents/statements/DocumentRowItem$Document;", "Lcom/robinhood/shared/documents/statements/DocumentRowItem$TaxCertificationBanner;", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class DocumentRowItem {
    public static final int $stable = 0;
    private final int viewType;

    public /* synthetic */ DocumentRowItem(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* compiled from: DocumentRowItem.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentRowItem$TaxCertificationBanner;", "Lcom/robinhood/shared/documents/statements/DocumentRowItem;", "<init>", "()V", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxCertificationBanner extends DocumentRowItem {
        public static final int $stable = 0;
        public static final TaxCertificationBanner INSTANCE = new TaxCertificationBanner();

        private TaxCertificationBanner() {
            super(0, null);
        }
    }

    private DocumentRowItem(int i) {
        this.viewType = i;
    }

    public final int getViewType() {
        return this.viewType;
    }

    /* compiled from: DocumentRowItem.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentRowItem$Document;", "Lcom/robinhood/shared/documents/statements/DocumentRowItem;", "document", "Lcom/robinhood/models/db/Document;", "<init>", "(Lcom/robinhood/models/db/Document;)V", "getDocument", "()Lcom/robinhood/models/db/Document;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Document extends DocumentRowItem {
        public static final int $stable = 8;
        private final com.robinhood.models.p320db.Document document;

        public static /* synthetic */ Document copy$default(Document document, com.robinhood.models.p320db.Document document2, int i, Object obj) {
            if ((i & 1) != 0) {
                document2 = document.document;
            }
            return document.copy(document2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.robinhood.models.p320db.Document getDocument() {
            return this.document;
        }

        public final Document copy(com.robinhood.models.p320db.Document document) {
            Intrinsics.checkNotNullParameter(document, "document");
            return new Document(document);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Document) && Intrinsics.areEqual(this.document, ((Document) other).document);
        }

        public int hashCode() {
            return this.document.hashCode();
        }

        public String toString() {
            return "Document(document=" + this.document + ")";
        }

        public final com.robinhood.models.p320db.Document getDocument() {
            return this.document;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Document(com.robinhood.models.p320db.Document document) {
            super(1, null);
            Intrinsics.checkNotNullParameter(document, "document");
            this.document = document;
        }
    }
}
