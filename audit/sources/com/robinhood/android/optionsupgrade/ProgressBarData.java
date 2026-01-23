package com.robinhood.android.optionsupgrade;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0003J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "Landroid/os/Parcelable;", "numberOfSegments", "", "currentSegment", "segmentProgress", "", "<init>", "(IIF)V", "getNumberOfSegments", "()I", "getCurrentSegment", "getSegmentProgress", "()F", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProgressBarData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ProgressBarData> CREATOR = new Creator();
    private final int currentSegment;
    private final int numberOfSegments;
    private final float segmentProgress;

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ProgressBarData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProgressBarData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProgressBarData(parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProgressBarData[] newArray(int i) {
            return new ProgressBarData[i];
        }
    }

    public static /* synthetic */ ProgressBarData copy$default(ProgressBarData progressBarData, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = progressBarData.numberOfSegments;
        }
        if ((i3 & 2) != 0) {
            i2 = progressBarData.currentSegment;
        }
        if ((i3 & 4) != 0) {
            f = progressBarData.segmentProgress;
        }
        return progressBarData.copy(i, i2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final int getNumberOfSegments() {
        return this.numberOfSegments;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentSegment() {
        return this.currentSegment;
    }

    /* renamed from: component3, reason: from getter */
    public final float getSegmentProgress() {
        return this.segmentProgress;
    }

    public final ProgressBarData copy(int numberOfSegments, int currentSegment, float segmentProgress) {
        return new ProgressBarData(numberOfSegments, currentSegment, segmentProgress);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarData)) {
            return false;
        }
        ProgressBarData progressBarData = (ProgressBarData) other;
        return this.numberOfSegments == progressBarData.numberOfSegments && this.currentSegment == progressBarData.currentSegment && Float.compare(this.segmentProgress, progressBarData.segmentProgress) == 0;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.numberOfSegments) * 31) + Integer.hashCode(this.currentSegment)) * 31) + Float.hashCode(this.segmentProgress);
    }

    public String toString() {
        return "ProgressBarData(numberOfSegments=" + this.numberOfSegments + ", currentSegment=" + this.currentSegment + ", segmentProgress=" + this.segmentProgress + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.numberOfSegments);
        dest.writeInt(this.currentSegment);
        dest.writeFloat(this.segmentProgress);
    }

    public ProgressBarData(int i, int i2, float f) {
        this.numberOfSegments = i;
        this.currentSegment = i2;
        this.segmentProgress = f;
    }

    public final int getNumberOfSegments() {
        return this.numberOfSegments;
    }

    public final int getCurrentSegment() {
        return this.currentSegment;
    }

    public final float getSegmentProgress() {
        return this.segmentProgress;
    }
}
