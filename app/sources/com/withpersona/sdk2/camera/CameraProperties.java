package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CameraProperties.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\tJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties;", "Landroid/os/Parcelable;", AnnotatedPrivateKey.LABEL, "", "facingMode", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "size", "Landroid/util/Size;", "frameRate", "", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Landroid/util/Size;I)V", "getLabel", "()Ljava/lang/String;", "getFacingMode", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getSize", "()Landroid/util/Size;", "getFrameRate", "()I", "aspectRatio", "", "getAspectRatio", "()D", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "FacingMode", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CameraProperties implements Parcelable {
    public static final Parcelable.Creator<CameraProperties> CREATOR = new Creator();
    private final FacingMode facingMode;
    private final int frameRate;
    private final String label;
    private final Size size;

    /* compiled from: CameraProperties.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CameraProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CameraProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraProperties(parcel.readString(), FacingMode.valueOf(parcel.readString()), parcel.readSize(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CameraProperties[] newArray(int i) {
            return new CameraProperties[i];
        }
    }

    public CameraProperties() {
        this(null, null, null, 0, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.label);
        dest.writeString(this.facingMode.name());
        dest.writeSize(this.size);
        dest.writeInt(this.frameRate);
    }

    public CameraProperties(String label, FacingMode facingMode, Size size, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        Intrinsics.checkNotNullParameter(size, "size");
        this.label = label;
        this.facingMode = facingMode;
        this.size = size;
        this.frameRate = i;
    }

    public /* synthetic */ CameraProperties(String str, FacingMode facingMode, Size size, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? FacingMode.Unknown : facingMode, (i2 & 4) != 0 ? new Size(0, 0) : size, (i2 & 8) != 0 ? 0 : i);
    }

    public final String getLabel() {
        return this.label;
    }

    public final FacingMode getFacingMode() {
        return this.facingMode;
    }

    public final Size getSize() {
        return this.size;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final double getAspectRatio() {
        if (this.size.getHeight() == 0) {
            return 0.0d;
        }
        return this.size.getWidth() / this.size.getHeight();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CameraProperties.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "", "<init>", "(Ljava/lang/String;I)V", "User", "Environment", "Unknown", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FacingMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FacingMode[] $VALUES;
        public static final FacingMode User = new FacingMode("User", 0);
        public static final FacingMode Environment = new FacingMode("Environment", 1);
        public static final FacingMode Unknown = new FacingMode("Unknown", 2);

        private static final /* synthetic */ FacingMode[] $values() {
            return new FacingMode[]{User, Environment, Unknown};
        }

        public static EnumEntries<FacingMode> getEntries() {
            return $ENTRIES;
        }

        private FacingMode(String str, int i) {
        }

        static {
            FacingMode[] facingModeArr$values = $values();
            $VALUES = facingModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(facingModeArr$values);
        }

        public static FacingMode valueOf(String str) {
            return (FacingMode) Enum.valueOf(FacingMode.class, str);
        }

        public static FacingMode[] values() {
            return (FacingMode[]) $VALUES.clone();
        }
    }
}
