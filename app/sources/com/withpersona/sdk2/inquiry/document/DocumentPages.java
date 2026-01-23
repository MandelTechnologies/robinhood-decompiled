package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentPages.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "Landroid/os/Parcelable;", "documentStartPage", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "uploadOptionsDialog", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)V", "getDocumentStartPage", "()Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "getUploadOptionsDialog", "()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DocumentPages implements Parcelable {
    public static final Parcelable.Creator<DocumentPages> CREATOR = new Creator();
    private final DocumentPages2 documentStartPage;
    private final DocumentPages3 uploadOptionsDialog;

    /* compiled from: DocumentPages.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DocumentPages> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentPages createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentPages(DocumentPages2.CREATOR.createFromParcel(parcel), DocumentPages3.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentPages[] newArray(int i) {
            return new DocumentPages[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.documentStartPage.writeToParcel(dest, flags);
        this.uploadOptionsDialog.writeToParcel(dest, flags);
    }

    public DocumentPages(DocumentPages2 documentStartPage, DocumentPages3 uploadOptionsDialog) {
        Intrinsics.checkNotNullParameter(documentStartPage, "documentStartPage");
        Intrinsics.checkNotNullParameter(uploadOptionsDialog, "uploadOptionsDialog");
        this.documentStartPage = documentStartPage;
        this.uploadOptionsDialog = uploadOptionsDialog;
    }

    public final DocumentPages2 getDocumentStartPage() {
        return this.documentStartPage;
    }

    public final DocumentPages3 getUploadOptionsDialog() {
        return this.uploadOptionsDialog;
    }
}
