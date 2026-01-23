package com.robinhood.android.cash.disputes.p070ui.question.image;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cash.disputes.util.DisputeFileData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileSelectionItem.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;", "Landroid/os/Parcelable;", "fileData", "Lcom/robinhood/android/cash/disputes/util/DisputeFileData;", "name", "", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Lcom/robinhood/android/cash/disputes/util/DisputeFileData;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getFileData", "()Lcom/robinhood/android/cash/disputes/util/DisputeFileData;", "getName", "()Ljava/lang/String;", "getBitmap", "()Landroid/graphics/Bitmap;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FileSelectionItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FileSelectionItem> CREATOR = new Creator();
    private final Bitmap bitmap;
    private final DisputeFileData fileData;
    private final String name;

    /* compiled from: FileSelectionItem.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FileSelectionItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileSelectionItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FileSelectionItem(DisputeFileData.CREATOR.createFromParcel(parcel), parcel.readString(), (Bitmap) parcel.readParcelable(FileSelectionItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FileSelectionItem[] newArray(int i) {
            return new FileSelectionItem[i];
        }
    }

    public static /* synthetic */ FileSelectionItem copy$default(FileSelectionItem fileSelectionItem, DisputeFileData disputeFileData, String str, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            disputeFileData = fileSelectionItem.fileData;
        }
        if ((i & 2) != 0) {
            str = fileSelectionItem.name;
        }
        if ((i & 4) != 0) {
            bitmap = fileSelectionItem.bitmap;
        }
        return fileSelectionItem.copy(disputeFileData, str, bitmap);
    }

    /* renamed from: component1, reason: from getter */
    public final DisputeFileData getFileData() {
        return this.fileData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final FileSelectionItem copy(DisputeFileData fileData, String name, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(fileData, "fileData");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new FileSelectionItem(fileData, name, bitmap);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileSelectionItem)) {
            return false;
        }
        FileSelectionItem fileSelectionItem = (FileSelectionItem) other;
        return Intrinsics.areEqual(this.fileData, fileSelectionItem.fileData) && Intrinsics.areEqual(this.name, fileSelectionItem.name) && Intrinsics.areEqual(this.bitmap, fileSelectionItem.bitmap);
    }

    public int hashCode() {
        return (((this.fileData.hashCode() * 31) + this.name.hashCode()) * 31) + this.bitmap.hashCode();
    }

    public String toString() {
        return "FileSelectionItem(fileData=" + this.fileData + ", name=" + this.name + ", bitmap=" + this.bitmap + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.fileData.writeToParcel(dest, flags);
        dest.writeString(this.name);
        dest.writeParcelable(this.bitmap, flags);
    }

    public FileSelectionItem(DisputeFileData fileData, String name, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(fileData, "fileData");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.fileData = fileData;
        this.name = name;
        this.bitmap = bitmap;
    }

    public final DisputeFileData getFileData() {
        return this.fileData;
    }

    public final String getName() {
        return this.name;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }
}
