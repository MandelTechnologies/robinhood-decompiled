package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressBar.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0005J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ProgressBar;", "Landroid/os/Parcelable;", "progress", "", "numberOfSegments", "", "<init>", "(FI)V", "getProgress", "()F", "getNumberOfSegments", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProgressBar implements Parcelable {
    public static final Parcelable.Creator<ProgressBar> CREATOR = new Creator();
    private final int numberOfSegments;
    private final float progress;

    /* compiled from: ProgressBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ProgressBar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProgressBar createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProgressBar(parcel.readFloat(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProgressBar[] newArray(int i) {
            return new ProgressBar[i];
        }
    }

    public static /* synthetic */ ProgressBar copy$default(ProgressBar progressBar, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = progressBar.progress;
        }
        if ((i2 & 2) != 0) {
            i = progressBar.numberOfSegments;
        }
        return progressBar.copy(f, i);
    }

    /* renamed from: component1, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumberOfSegments() {
        return this.numberOfSegments;
    }

    public final ProgressBar copy(float progress, int numberOfSegments) {
        return new ProgressBar(progress, numberOfSegments);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBar)) {
            return false;
        }
        ProgressBar progressBar = (ProgressBar) other;
        return Float.compare(this.progress, progressBar.progress) == 0 && this.numberOfSegments == progressBar.numberOfSegments;
    }

    public int hashCode() {
        return (Float.hashCode(this.progress) * 31) + Integer.hashCode(this.numberOfSegments);
    }

    public String toString() {
        return "ProgressBar(progress=" + this.progress + ", numberOfSegments=" + this.numberOfSegments + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.progress);
        dest.writeInt(this.numberOfSegments);
    }

    public ProgressBar(float f, int i) {
        this.progress = f;
        this.numberOfSegments = i;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getNumberOfSegments() {
        return this.numberOfSegments;
    }
}
