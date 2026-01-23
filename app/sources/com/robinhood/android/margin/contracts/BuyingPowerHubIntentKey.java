package com.robinhood.android.margin.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuyingPowerHubIntentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/margin/contracts/BuyingPowerHubIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "entryPoint", "launchScreen", "Lcom/robinhood/android/margin/contracts/BuyingPowerHubScreen;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/margin/contracts/BuyingPowerHubScreen;)V", "getAccountNumber", "()Ljava/lang/String;", "getEntryPoint", "getLaunchScreen", "()Lcom/robinhood/android/margin/contracts/BuyingPowerHubScreen;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BuyingPowerHubIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<BuyingPowerHubIntentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String entryPoint;
    private final BuyingPowerHubIntentKey2 launchScreen;

    /* compiled from: BuyingPowerHubIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<BuyingPowerHubIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuyingPowerHubIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuyingPowerHubIntentKey(parcel.readString(), parcel.readString(), BuyingPowerHubIntentKey2.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuyingPowerHubIntentKey[] newArray(int i) {
            return new BuyingPowerHubIntentKey[i];
        }
    }

    public BuyingPowerHubIntentKey() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BuyingPowerHubIntentKey copy$default(BuyingPowerHubIntentKey buyingPowerHubIntentKey, String str, String str2, BuyingPowerHubIntentKey2 buyingPowerHubIntentKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buyingPowerHubIntentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = buyingPowerHubIntentKey.entryPoint;
        }
        if ((i & 4) != 0) {
            buyingPowerHubIntentKey2 = buyingPowerHubIntentKey.launchScreen;
        }
        return buyingPowerHubIntentKey.copy(str, str2, buyingPowerHubIntentKey2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final BuyingPowerHubIntentKey2 getLaunchScreen() {
        return this.launchScreen;
    }

    public final BuyingPowerHubIntentKey copy(String accountNumber, String entryPoint, BuyingPowerHubIntentKey2 launchScreen) {
        Intrinsics.checkNotNullParameter(launchScreen, "launchScreen");
        return new BuyingPowerHubIntentKey(accountNumber, entryPoint, launchScreen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyingPowerHubIntentKey)) {
            return false;
        }
        BuyingPowerHubIntentKey buyingPowerHubIntentKey = (BuyingPowerHubIntentKey) other;
        return Intrinsics.areEqual(this.accountNumber, buyingPowerHubIntentKey.accountNumber) && Intrinsics.areEqual(this.entryPoint, buyingPowerHubIntentKey.entryPoint) && this.launchScreen == buyingPowerHubIntentKey.launchScreen;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entryPoint;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.launchScreen.hashCode();
    }

    public String toString() {
        return "BuyingPowerHubIntentKey(accountNumber=" + this.accountNumber + ", entryPoint=" + this.entryPoint + ", launchScreen=" + this.launchScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.entryPoint);
        dest.writeString(this.launchScreen.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public BuyingPowerHubIntentKey(String str, String str2, BuyingPowerHubIntentKey2 launchScreen) {
        Intrinsics.checkNotNullParameter(launchScreen, "launchScreen");
        this.accountNumber = str;
        this.entryPoint = str2;
        this.launchScreen = launchScreen;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public /* synthetic */ BuyingPowerHubIntentKey(String str, String str2, BuyingPowerHubIntentKey2 buyingPowerHubIntentKey2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? BuyingPowerHubIntentKey2.BUYING_POWER : buyingPowerHubIntentKey2);
    }

    public final BuyingPowerHubIntentKey2 getLaunchScreen() {
        return this.launchScreen;
    }
}
