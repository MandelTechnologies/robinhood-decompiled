package com.robinhood.android.investmentstracker;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/ScrollInfo;", "Landroid/os/Parcelable;", "firstItemIndex", "", "scrollOffset", "<init>", "(II)V", "getFirstItemIndex", "()I", "getScrollOffset", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class ScrollInfo implements Parcelable {
    public static final Parcelable.Creator<ScrollInfo> CREATOR = new Creator();
    private final int firstItemIndex;
    private final int scrollOffset;

    /* compiled from: InvestmentsTrackerFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ScrollInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScrollInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScrollInfo(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScrollInfo[] newArray(int i) {
            return new ScrollInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.firstItemIndex);
        dest.writeInt(this.scrollOffset);
    }

    public ScrollInfo(int i, int i2) {
        this.firstItemIndex = i;
        this.scrollOffset = i2;
    }

    public final int getFirstItemIndex() {
        return this.firstItemIndex;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }
}
