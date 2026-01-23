package com.robinhood.android.taxcenter.viewdocument;

import com.robinhood.android.models.taxcenter.p195db.TaxDocument;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewTaxDocumentDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentDataState;", "", "documentId", "", "documentMetadata", "Lcom/robinhood/android/models/taxcenter/db/TaxDocument;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/taxcenter/db/TaxDocument;)V", "getDocumentId", "()Ljava/lang/String;", "getDocumentMetadata", "()Lcom/robinhood/android/models/taxcenter/db/TaxDocument;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ViewTaxDocumentDataState {
    public static final int $stable = 8;
    private final String documentId;
    private final TaxDocument documentMetadata;

    public static /* synthetic */ ViewTaxDocumentDataState copy$default(ViewTaxDocumentDataState viewTaxDocumentDataState, String str, TaxDocument taxDocument, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewTaxDocumentDataState.documentId;
        }
        if ((i & 2) != 0) {
            taxDocument = viewTaxDocumentDataState.documentMetadata;
        }
        return viewTaxDocumentDataState.copy(str, taxDocument);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* renamed from: component2, reason: from getter */
    public final TaxDocument getDocumentMetadata() {
        return this.documentMetadata;
    }

    public final ViewTaxDocumentDataState copy(String documentId, TaxDocument documentMetadata) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return new ViewTaxDocumentDataState(documentId, documentMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewTaxDocumentDataState)) {
            return false;
        }
        ViewTaxDocumentDataState viewTaxDocumentDataState = (ViewTaxDocumentDataState) other;
        return Intrinsics.areEqual(this.documentId, viewTaxDocumentDataState.documentId) && Intrinsics.areEqual(this.documentMetadata, viewTaxDocumentDataState.documentMetadata);
    }

    public int hashCode() {
        int iHashCode = this.documentId.hashCode() * 31;
        TaxDocument taxDocument = this.documentMetadata;
        return iHashCode + (taxDocument == null ? 0 : taxDocument.hashCode());
    }

    public String toString() {
        return "ViewTaxDocumentDataState(documentId=" + this.documentId + ", documentMetadata=" + this.documentMetadata + ")";
    }

    public ViewTaxDocumentDataState(String documentId, TaxDocument taxDocument) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        this.documentId = documentId;
        this.documentMetadata = taxDocument;
    }

    public /* synthetic */ ViewTaxDocumentDataState(String str, TaxDocument taxDocument, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : taxDocument);
    }

    public final String getDocumentId() {
        return this.documentId;
    }

    public final TaxDocument getDocumentMetadata() {
        return this.documentMetadata;
    }
}
