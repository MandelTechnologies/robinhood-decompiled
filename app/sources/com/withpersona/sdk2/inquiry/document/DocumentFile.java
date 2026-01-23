package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentFile.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "Landroid/os/Parcelable;", "<init>", "()V", "Local", "Remote", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class DocumentFile implements Parcelable {
    public /* synthetic */ DocumentFile(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DocumentFile() {
    }

    /* compiled from: DocumentFile.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0010J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "captureMethod", "", "uploadProgress", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "copy", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;I)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getAbsoluteFilePath", "Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "getCaptureMethod", "()Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "I", "getUploadProgress", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Local extends DocumentFile {
        public static final Parcelable.Creator<Local> CREATOR = new Creator();
        private final String absoluteFilePath;
        private final CaptureMethod captureMethod;
        private final int uploadProgress;

        /* compiled from: DocumentFile.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Local> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Local createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local(parcel.readString(), CaptureMethod.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Local[] newArray(int i) {
                return new Local[i];
            }
        }

        public static /* synthetic */ Local copy$default(Local local, String str, CaptureMethod captureMethod, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = local.absoluteFilePath;
            }
            if ((i2 & 2) != 0) {
                captureMethod = local.captureMethod;
            }
            if ((i2 & 4) != 0) {
                i = local.uploadProgress;
            }
            return local.copy(str, captureMethod, i);
        }

        public final Local copy(String absoluteFilePath, CaptureMethod captureMethod, int uploadProgress) {
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            return new Local(absoluteFilePath, captureMethod, uploadProgress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public String toString() {
            return "Local(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ", uploadProgress=" + this.uploadProgress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            this.captureMethod.writeToParcel(dest, flags);
            dest.writeInt(this.uploadProgress);
        }

        public /* synthetic */ Local(String str, CaptureMethod captureMethod, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, captureMethod, (i2 & 4) != 0 ? 0 : i);
        }

        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        public final CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        public final int getUploadProgress() {
            return this.uploadProgress;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Local(String absoluteFilePath, CaptureMethod captureMethod, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
            this.uploadProgress = i;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(Local.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentFile.Local");
            return Intrinsics.areEqual(this.absoluteFilePath, ((Local) other).absoluteFilePath);
        }

        public int hashCode() {
            return this.absoluteFilePath.hashCode();
        }
    }

    /* compiled from: DocumentFile.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "", "absoluteFilePath", "filename", "remoteUrl", "documentFileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAbsoluteFilePath", "getFilename", "getRemoteUrl", "getDocumentFileId", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Remote extends DocumentFile {
        public static final Parcelable.Creator<Remote> CREATOR = new Creator();
        private final String absoluteFilePath;
        private final String documentFileId;
        private final String filename;
        private final String remoteUrl;

        /* compiled from: DocumentFile.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Remote> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remote createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remote[] newArray(int i) {
                return new Remote[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) other;
            return Intrinsics.areEqual(this.absoluteFilePath, remote.absoluteFilePath) && Intrinsics.areEqual(this.filename, remote.filename) && Intrinsics.areEqual(this.remoteUrl, remote.remoteUrl) && Intrinsics.areEqual(this.documentFileId, remote.documentFileId);
        }

        public int hashCode() {
            String str = this.absoluteFilePath;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.filename;
            return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.remoteUrl.hashCode()) * 31) + this.documentFileId.hashCode();
        }

        public String toString() {
            return "Remote(absoluteFilePath=" + this.absoluteFilePath + ", filename=" + this.filename + ", remoteUrl=" + this.remoteUrl + ", documentFileId=" + this.documentFileId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            dest.writeString(this.filename);
            dest.writeString(this.remoteUrl);
            dest.writeString(this.documentFileId);
        }

        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        public final String getFilename() {
            return this.filename;
        }

        public final String getRemoteUrl() {
            return this.remoteUrl;
        }

        public final String getDocumentFileId() {
            return this.documentFileId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remote(String str, String str2, String remoteUrl, String documentFileId) {
            super(null);
            Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
            Intrinsics.checkNotNullParameter(documentFileId, "documentFileId");
            this.absoluteFilePath = str;
            this.filename = str2;
            this.remoteUrl = remoteUrl;
            this.documentFileId = documentFileId;
        }
    }
}
