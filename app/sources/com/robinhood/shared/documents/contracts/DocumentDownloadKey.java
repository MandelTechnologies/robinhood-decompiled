package com.robinhood.shared.documents.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p320db.Document;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentDownloadKey.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/documents/contracts/DocumentDownloadKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "document", "Lcom/robinhood/models/db/Document;", "launchMode", "Lcom/robinhood/shared/documents/contracts/DocumentDownloadLaunchMode;", "filename", "", "replace", "", "<init>", "(Lcom/robinhood/models/db/Document;Lcom/robinhood/shared/documents/contracts/DocumentDownloadLaunchMode;Ljava/lang/String;Z)V", "getDocument", "()Lcom/robinhood/models/db/Document;", "getLaunchMode", "()Lcom/robinhood/shared/documents/contracts/DocumentDownloadLaunchMode;", "getFilename", "()Ljava/lang/String;", "getReplace", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DocumentDownloadKey implements IntentKey {
    private final Document document;
    private final String filename;
    private final DocumentDownloadLaunchMode launchMode;
    private final boolean replace;

    public static /* synthetic */ DocumentDownloadKey copy$default(DocumentDownloadKey documentDownloadKey, Document document, DocumentDownloadLaunchMode documentDownloadLaunchMode, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            document = documentDownloadKey.document;
        }
        if ((i & 2) != 0) {
            documentDownloadLaunchMode = documentDownloadKey.launchMode;
        }
        if ((i & 4) != 0) {
            str = documentDownloadKey.filename;
        }
        if ((i & 8) != 0) {
            z = documentDownloadKey.replace;
        }
        return documentDownloadKey.copy(document, documentDownloadLaunchMode, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* renamed from: component2, reason: from getter */
    public final DocumentDownloadLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getReplace() {
        return this.replace;
    }

    public final DocumentDownloadKey copy(Document document, DocumentDownloadLaunchMode launchMode, String filename, boolean replace) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(filename, "filename");
        return new DocumentDownloadKey(document, launchMode, filename, replace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentDownloadKey)) {
            return false;
        }
        DocumentDownloadKey documentDownloadKey = (DocumentDownloadKey) other;
        return Intrinsics.areEqual(this.document, documentDownloadKey.document) && this.launchMode == documentDownloadKey.launchMode && Intrinsics.areEqual(this.filename, documentDownloadKey.filename) && this.replace == documentDownloadKey.replace;
    }

    public int hashCode() {
        return (((((this.document.hashCode() * 31) + this.launchMode.hashCode()) * 31) + this.filename.hashCode()) * 31) + Boolean.hashCode(this.replace);
    }

    public String toString() {
        return "DocumentDownloadKey(document=" + this.document + ", launchMode=" + this.launchMode + ", filename=" + this.filename + ", replace=" + this.replace + ")";
    }

    public DocumentDownloadKey(Document document, DocumentDownloadLaunchMode launchMode, String filename, boolean z) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.document = document;
        this.launchMode = launchMode;
        this.filename = filename;
        this.replace = z;
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public final Document getDocument() {
        return this.document;
    }

    public final DocumentDownloadLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public /* synthetic */ DocumentDownloadKey(Document document, DocumentDownloadLaunchMode documentDownloadLaunchMode, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(document, documentDownloadLaunchMode, (i & 4) != 0 ? document.getFilename() : str, (i & 8) != 0 ? true : z);
    }

    public final String getFilename() {
        return this.filename;
    }

    public final boolean getReplace() {
        return this.replace;
    }
}
