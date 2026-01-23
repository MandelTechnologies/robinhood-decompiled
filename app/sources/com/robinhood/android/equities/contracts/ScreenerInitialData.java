package com.robinhood.android.equities.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerDataDisplayKey.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/ScreenerInitialData;", "Landroid/os/Parcelable;", "screenerId", "", "<init>", "(Ljava/lang/String;)V", "getScreenerId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScreenerInitialData implements Parcelable {
    public static final Parcelable.Creator<ScreenerInitialData> CREATOR = new Creator();
    private final String screenerId;

    /* compiled from: ScreenerDataDisplayKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ScreenerInitialData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenerInitialData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenerInitialData(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenerInitialData[] newArray(int i) {
            return new ScreenerInitialData[i];
        }
    }

    public static /* synthetic */ ScreenerInitialData copy$default(ScreenerInitialData screenerInitialData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = screenerInitialData.screenerId;
        }
        return screenerInitialData.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScreenerId() {
        return this.screenerId;
    }

    public final ScreenerInitialData copy(String screenerId) {
        return new ScreenerInitialData(screenerId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ScreenerInitialData) && Intrinsics.areEqual(this.screenerId, ((ScreenerInitialData) other).screenerId);
    }

    public int hashCode() {
        String str = this.screenerId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ScreenerInitialData(screenerId=" + this.screenerId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.screenerId);
    }

    public ScreenerInitialData(String str) {
        this.screenerId = str;
    }

    public final String getScreenerId() {
        return this.screenerId;
    }
}
