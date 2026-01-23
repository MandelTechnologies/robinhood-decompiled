package com.robinhood.android.equities.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerDataDisplayKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/ScreenerDataDisplayKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "initialData", "Lcom/robinhood/android/equities/contracts/ScreenerInitialData;", "<init>", "(Lcom/robinhood/android/equities/contracts/ScreenerInitialData;)V", "getInitialData", "()Lcom/robinhood/android/equities/contracts/ScreenerInitialData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ScreenerDataDisplayKey implements Parcelable, FragmentKey {
    public static final Parcelable.Creator<ScreenerDataDisplayKey> CREATOR = new Creator();
    private final ScreenerInitialData initialData;

    /* compiled from: ScreenerDataDisplayKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<ScreenerDataDisplayKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenerDataDisplayKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenerDataDisplayKey(ScreenerInitialData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenerDataDisplayKey[] newArray(int i) {
            return new ScreenerDataDisplayKey[i];
        }
    }

    public static /* synthetic */ ScreenerDataDisplayKey copy$default(ScreenerDataDisplayKey screenerDataDisplayKey, ScreenerInitialData screenerInitialData, int i, Object obj) {
        if ((i & 1) != 0) {
            screenerInitialData = screenerDataDisplayKey.initialData;
        }
        return screenerDataDisplayKey.copy(screenerInitialData);
    }

    /* renamed from: component1, reason: from getter */
    public final ScreenerInitialData getInitialData() {
        return this.initialData;
    }

    public final ScreenerDataDisplayKey copy(ScreenerInitialData initialData) {
        Intrinsics.checkNotNullParameter(initialData, "initialData");
        return new ScreenerDataDisplayKey(initialData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ScreenerDataDisplayKey) && Intrinsics.areEqual(this.initialData, ((ScreenerDataDisplayKey) other).initialData);
    }

    public int hashCode() {
        return this.initialData.hashCode();
    }

    public String toString() {
        return "ScreenerDataDisplayKey(initialData=" + this.initialData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.initialData.writeToParcel(dest, flags);
    }

    public ScreenerDataDisplayKey(ScreenerInitialData initialData) {
        Intrinsics.checkNotNullParameter(initialData, "initialData");
        this.initialData = initialData;
    }

    public final ScreenerInitialData getInitialData() {
        return this.initialData;
    }
}
