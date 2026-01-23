package com.withpersona.sdk2.camera.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfieBrightnessInfo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "Landroid/os/Parcelable;", "", "", "averageBrightness3x3", "<init>", "([Ljava/lang/Float;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "[Ljava/lang/Float;", "getAverageBrightness3x3", "()[Ljava/lang/Float;", "getTopBrightness", "()F", "topBrightness", "getBottomBrightness", "bottomBrightness", "getLeftBrightness", "leftBrightness", "getRightBrightness", "rightBrightness", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SelfieBrightnessInfo implements Parcelable {
    public static final Parcelable.Creator<SelfieBrightnessInfo> CREATOR = new Creator();
    private final Float[] averageBrightness3x3;

    /* compiled from: SelfieBrightnessInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SelfieBrightnessInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfieBrightnessInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            Float[] fArr = new Float[i];
            for (int i2 = 0; i2 != i; i2++) {
                fArr[i2] = Float.valueOf(parcel.readFloat());
            }
            return new SelfieBrightnessInfo(fArr);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfieBrightnessInfo[] newArray(int i) {
            return new SelfieBrightnessInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelfieBrightnessInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Float[] fArr = this.averageBrightness3x3;
        int length = fArr.length;
        dest.writeInt(length);
        for (int i = 0; i != length; i++) {
            dest.writeFloat(fArr[i].floatValue());
        }
    }

    public SelfieBrightnessInfo(Float[] averageBrightness3x3) {
        Intrinsics.checkNotNullParameter(averageBrightness3x3, "averageBrightness3x3");
        this.averageBrightness3x3 = averageBrightness3x3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SelfieBrightnessInfo(Float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            Float[] fArr2 = new Float[9];
            for (int i2 = 0; i2 < 9; i2++) {
                fArr2[i2] = Float.valueOf(0.0f);
            }
            fArr = fArr2;
        }
        this(fArr);
    }

    public final float getTopBrightness() {
        return ((this.averageBrightness3x3[1].floatValue() * 2.0f) + ((this.averageBrightness3x3[0].floatValue() + this.averageBrightness3x3[2].floatValue()) * 0.5f)) / 3;
    }

    public final float getBottomBrightness() {
        return ((this.averageBrightness3x3[7].floatValue() * 2.0f) + ((this.averageBrightness3x3[6].floatValue() + this.averageBrightness3x3[8].floatValue()) * 0.5f)) / 3;
    }

    public final float getLeftBrightness() {
        return ((this.averageBrightness3x3[3].floatValue() * 2.0f) + ((this.averageBrightness3x3[0].floatValue() + this.averageBrightness3x3[6].floatValue()) * 0.5f)) / 3;
    }

    public final float getRightBrightness() {
        return ((this.averageBrightness3x3[5].floatValue() * 2.0f) + ((this.averageBrightness3x3[2].floatValue() + this.averageBrightness3x3[8].floatValue()) * 0.5f)) / 3;
    }
}
