package com.robinhood.android.supportchat;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatImageViewerKey.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatImageViewerKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "IdentiSource", "FileSource", "Lcom/robinhood/android/supportchat/SupportChatImageViewerKey$FileSource;", "Lcom/robinhood/android/supportchat/SupportChatImageViewerKey$IdentiSource;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface SupportChatImageViewerKey extends FragmentKey {

    /* compiled from: SupportChatImageViewerKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatImageViewerKey$IdentiSource;", "Lcom/robinhood/android/supportchat/SupportChatImageViewerKey;", "Landroid/os/Parcelable;", "documentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getDocumentId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IdentiSource implements SupportChatImageViewerKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<IdentiSource> CREATOR = new Creator();
        private final UUID documentId;

        /* compiled from: SupportChatImageViewerKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes9.dex */
        public static final class Creator implements Parcelable.Creator<IdentiSource> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdentiSource createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdentiSource((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdentiSource[] newArray(int i) {
                return new IdentiSource[i];
            }
        }

        public static /* synthetic */ IdentiSource copy$default(IdentiSource identiSource, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = identiSource.documentId;
            }
            return identiSource.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getDocumentId() {
            return this.documentId;
        }

        public final IdentiSource copy(UUID documentId) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            return new IdentiSource(documentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdentiSource) && Intrinsics.areEqual(this.documentId, ((IdentiSource) other).documentId);
        }

        public int hashCode() {
            return this.documentId.hashCode();
        }

        public String toString() {
            return "IdentiSource(documentId=" + this.documentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.documentId);
        }

        public IdentiSource(UUID documentId) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            this.documentId = documentId;
        }

        public final UUID getDocumentId() {
            return this.documentId;
        }
    }

    /* compiled from: SupportChatImageViewerKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatImageViewerKey$FileSource;", "Lcom/robinhood/android/supportchat/SupportChatImageViewerKey;", "Landroid/os/Parcelable;", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FileSource implements SupportChatImageViewerKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<FileSource> CREATOR = new Creator();
        private final File file;

        /* compiled from: SupportChatImageViewerKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes9.dex */
        public static final class Creator implements Parcelable.Creator<FileSource> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FileSource createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FileSource((File) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FileSource[] newArray(int i) {
                return new FileSource[i];
            }
        }

        public static /* synthetic */ FileSource copy$default(FileSource fileSource, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                file = fileSource.file;
            }
            return fileSource.copy(file);
        }

        /* renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        public final FileSource copy(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new FileSource(file);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FileSource) && Intrinsics.areEqual(this.file, ((FileSource) other).file);
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return "FileSource(file=" + this.file + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.file);
        }

        public FileSource(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        public final File getFile() {
            return this.file;
        }
    }
}
