package com.robinhood.android.mediaservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.mediaservice.ImagePicker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropImageArgs.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0005J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\nHÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/mediaservice/CropImageArgs;", "Landroid/os/Parcelable;", "cropShape", "Lcom/robinhood/android/mediaservice/ImagePicker$CropShape;", "aspectRatioWidth", "", "aspectRatioHeight", "maxFinalImageSizeBytes", "", "confirmButtonTitle", "", "alwaysUseNightTheme", "", "<init>", "(Lcom/robinhood/android/mediaservice/ImagePicker$CropShape;Ljava/lang/Integer;Ljava/lang/Integer;JLjava/lang/String;Z)V", "getCropShape", "()Lcom/robinhood/android/mediaservice/ImagePicker$CropShape;", "getAspectRatioWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAspectRatioHeight", "getMaxFinalImageSizeBytes", "()J", "getConfirmButtonTitle", "()Ljava/lang/String;", "getAlwaysUseNightTheme", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/android/mediaservice/ImagePicker$CropShape;Ljava/lang/Integer;Ljava/lang/Integer;JLjava/lang/String;Z)Lcom/robinhood/android/mediaservice/CropImageArgs;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CropImageArgs implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CropImageArgs> CREATOR = new Creator();
    private final boolean alwaysUseNightTheme;
    private final Integer aspectRatioHeight;
    private final Integer aspectRatioWidth;
    private final String confirmButtonTitle;
    private final ImagePicker.CropShape cropShape;
    private final long maxFinalImageSizeBytes;

    /* compiled from: CropImageArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CropImageArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CropImageArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CropImageArgs(ImagePicker.CropShape.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CropImageArgs[] newArray(int i) {
            return new CropImageArgs[i];
        }
    }

    public static /* synthetic */ CropImageArgs copy$default(CropImageArgs cropImageArgs, ImagePicker.CropShape cropShape, Integer num, Integer num2, long j, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cropShape = cropImageArgs.cropShape;
        }
        if ((i & 2) != 0) {
            num = cropImageArgs.aspectRatioWidth;
        }
        if ((i & 4) != 0) {
            num2 = cropImageArgs.aspectRatioHeight;
        }
        if ((i & 8) != 0) {
            j = cropImageArgs.maxFinalImageSizeBytes;
        }
        if ((i & 16) != 0) {
            str = cropImageArgs.confirmButtonTitle;
        }
        if ((i & 32) != 0) {
            z = cropImageArgs.alwaysUseNightTheme;
        }
        long j2 = j;
        Integer num3 = num2;
        return cropImageArgs.copy(cropShape, num, num3, j2, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ImagePicker.CropShape getCropShape() {
        return this.cropShape;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAspectRatioWidth() {
        return this.aspectRatioWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getAspectRatioHeight() {
        return this.aspectRatioHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final long getMaxFinalImageSizeBytes() {
        return this.maxFinalImageSizeBytes;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAlwaysUseNightTheme() {
        return this.alwaysUseNightTheme;
    }

    public final CropImageArgs copy(ImagePicker.CropShape cropShape, Integer aspectRatioWidth, Integer aspectRatioHeight, long maxFinalImageSizeBytes, String confirmButtonTitle, boolean alwaysUseNightTheme) {
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        return new CropImageArgs(cropShape, aspectRatioWidth, aspectRatioHeight, maxFinalImageSizeBytes, confirmButtonTitle, alwaysUseNightTheme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CropImageArgs)) {
            return false;
        }
        CropImageArgs cropImageArgs = (CropImageArgs) other;
        return this.cropShape == cropImageArgs.cropShape && Intrinsics.areEqual(this.aspectRatioWidth, cropImageArgs.aspectRatioWidth) && Intrinsics.areEqual(this.aspectRatioHeight, cropImageArgs.aspectRatioHeight) && this.maxFinalImageSizeBytes == cropImageArgs.maxFinalImageSizeBytes && Intrinsics.areEqual(this.confirmButtonTitle, cropImageArgs.confirmButtonTitle) && this.alwaysUseNightTheme == cropImageArgs.alwaysUseNightTheme;
    }

    public int hashCode() {
        int iHashCode = this.cropShape.hashCode() * 31;
        Integer num = this.aspectRatioWidth;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.aspectRatioHeight;
        int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Long.hashCode(this.maxFinalImageSizeBytes)) * 31;
        String str = this.confirmButtonTitle;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.alwaysUseNightTheme);
    }

    public String toString() {
        return "CropImageArgs(cropShape=" + this.cropShape + ", aspectRatioWidth=" + this.aspectRatioWidth + ", aspectRatioHeight=" + this.aspectRatioHeight + ", maxFinalImageSizeBytes=" + this.maxFinalImageSizeBytes + ", confirmButtonTitle=" + this.confirmButtonTitle + ", alwaysUseNightTheme=" + this.alwaysUseNightTheme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.cropShape.name());
        Integer num = this.aspectRatioWidth;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.aspectRatioHeight;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeLong(this.maxFinalImageSizeBytes);
        dest.writeString(this.confirmButtonTitle);
        dest.writeInt(this.alwaysUseNightTheme ? 1 : 0);
    }

    public CropImageArgs(ImagePicker.CropShape cropShape, Integer num, Integer num2, long j, String str, boolean z) {
        Intrinsics.checkNotNullParameter(cropShape, "cropShape");
        this.cropShape = cropShape;
        this.aspectRatioWidth = num;
        this.aspectRatioHeight = num2;
        this.maxFinalImageSizeBytes = j;
        this.confirmButtonTitle = str;
        this.alwaysUseNightTheme = z;
    }

    public /* synthetic */ CropImageArgs(ImagePicker.CropShape cropShape, Integer num, Integer num2, long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cropShape, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? 5000000L : j, (i & 16) != 0 ? null : str, (i & 32) != 0 ? true : z);
    }

    public final ImagePicker.CropShape getCropShape() {
        return this.cropShape;
    }

    public final Integer getAspectRatioWidth() {
        return this.aspectRatioWidth;
    }

    public final Integer getAspectRatioHeight() {
        return this.aspectRatioHeight;
    }

    public final long getMaxFinalImageSizeBytes() {
        return this.maxFinalImageSizeBytes;
    }

    public final String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    public final boolean getAlwaysUseNightTheme() {
        return this.alwaysUseNightTheme;
    }
}
