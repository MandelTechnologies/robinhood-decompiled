package com.robinhood.android.home.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchListIntentKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/home/contracts/WatchListIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "watchListScreen", "Lcom/robinhood/android/home/contracts/WatchlistScreen;", "<init>", "(Lcom/robinhood/android/home/contracts/WatchlistScreen;)V", "getWatchListScreen", "()Lcom/robinhood/android/home/contracts/WatchlistScreen;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class WatchListIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<WatchListIntentKey> CREATOR = new Creator();
    private final WatchListIntentKey2 watchListScreen;

    /* compiled from: WatchListIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<WatchListIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WatchListIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchListIntentKey(parcel.readInt() == 0 ? null : WatchListIntentKey2.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WatchListIntentKey[] newArray(int i) {
            return new WatchListIntentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchListIntentKey() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        WatchListIntentKey2 watchListIntentKey2 = this.watchListScreen;
        if (watchListIntentKey2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(watchListIntentKey2.name());
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public WatchListIntentKey(WatchListIntentKey2 watchListIntentKey2) {
        this.watchListScreen = watchListIntentKey2;
    }

    public /* synthetic */ WatchListIntentKey(WatchListIntentKey2 watchListIntentKey2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : watchListIntentKey2);
    }

    public final WatchListIntentKey2 getWatchListScreen() {
        return this.watchListScreen;
    }
}
