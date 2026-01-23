package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdFeed.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, m3636d2 = {"Lcom/withpersona/sdk2/camera/ImageLightCondition;", "Landroid/os/Parcelable;", "", "luminosity", "rmsContrast", "lowHighContrast", "", "sampleSize", "<init>", "(DDDI)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLuminosity", "()D", "getRmsContrast", "getLowHighContrast", "I", "getSampleSize", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class ImageLightCondition implements Parcelable {
    public static final Parcelable.Creator<ImageLightCondition> CREATOR = new Creator();
    private final double lowHighContrast;
    private final double luminosity;
    private final double rmsContrast;
    private final int sampleSize;

    /* compiled from: GovernmentIdFeed.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageLightCondition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageLightCondition createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageLightCondition(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageLightCondition[] newArray(int i) {
            return new ImageLightCondition[i];
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
        if (!(other instanceof ImageLightCondition)) {
            return false;
        }
        ImageLightCondition imageLightCondition = (ImageLightCondition) other;
        return Double.compare(this.luminosity, imageLightCondition.luminosity) == 0 && Double.compare(this.rmsContrast, imageLightCondition.rmsContrast) == 0 && Double.compare(this.lowHighContrast, imageLightCondition.lowHighContrast) == 0 && this.sampleSize == imageLightCondition.sampleSize;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.luminosity) * 31) + Double.hashCode(this.rmsContrast)) * 31) + Double.hashCode(this.lowHighContrast)) * 31) + Integer.hashCode(this.sampleSize);
    }

    public String toString() {
        return "ImageLightCondition(luminosity=" + this.luminosity + ", rmsContrast=" + this.rmsContrast + ", lowHighContrast=" + this.lowHighContrast + ", sampleSize=" + this.sampleSize + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.luminosity);
        dest.writeDouble(this.rmsContrast);
        dest.writeDouble(this.lowHighContrast);
        dest.writeInt(this.sampleSize);
    }

    public ImageLightCondition(double d, double d2, double d3, int i) {
        this.luminosity = d;
        this.rmsContrast = d2;
        this.lowHighContrast = d3;
        this.sampleSize = i;
    }

    public final double getLuminosity() {
        return this.luminosity;
    }

    public final double getRmsContrast() {
        return this.rmsContrast;
    }

    public final double getLowHighContrast() {
        return this.lowHighContrast;
    }
}
