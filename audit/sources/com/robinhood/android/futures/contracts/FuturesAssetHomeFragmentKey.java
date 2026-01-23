package com.robinhood.android.futures.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesAssetHomeFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "accountNumber", "", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getAccountNumber", "()Ljava/lang/String;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FuturesAssetHomeFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<FuturesAssetHomeFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final Screen sourceScreen;

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<FuturesAssetHomeFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesAssetHomeFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesAssetHomeFragmentKey(parcel.readString(), (Screen) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesAssetHomeFragmentKey[] newArray(int i) {
            return new FuturesAssetHomeFragmentKey[i];
        }
    }

    public static /* synthetic */ FuturesAssetHomeFragmentKey copy$default(FuturesAssetHomeFragmentKey futuresAssetHomeFragmentKey, String str, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresAssetHomeFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            screen = futuresAssetHomeFragmentKey.sourceScreen;
        }
        return futuresAssetHomeFragmentKey.copy(str, screen);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    public final FuturesAssetHomeFragmentKey copy(String accountNumber, Screen sourceScreen) {
        return new FuturesAssetHomeFragmentKey(accountNumber, sourceScreen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAssetHomeFragmentKey)) {
            return false;
        }
        FuturesAssetHomeFragmentKey futuresAssetHomeFragmentKey = (FuturesAssetHomeFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, futuresAssetHomeFragmentKey.accountNumber) && Intrinsics.areEqual(this.sourceScreen, futuresAssetHomeFragmentKey.sourceScreen);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Screen screen = this.sourceScreen;
        return iHashCode + (screen != null ? screen.hashCode() : 0);
    }

    public String toString() {
        return "FuturesAssetHomeFragmentKey(accountNumber=" + this.accountNumber + ", sourceScreen=" + this.sourceScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.sourceScreen);
    }

    public FuturesAssetHomeFragmentKey(String str, Screen screen) {
        this.accountNumber = str;
        this.sourceScreen = screen;
    }

    public /* synthetic */ FuturesAssetHomeFragmentKey(String str, Screen screen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, screen);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }
}
