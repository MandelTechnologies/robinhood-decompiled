package com.robinhood.android.blackwidow.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileLinkingHostIntentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/contracts/MobileLinkingHostIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "initialSelectedGroupId", "playSound", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getInitialSelectedGroupId", "getPlaySound", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MobileLinkingHostIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<MobileLinkingHostIntentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String initialSelectedGroupId;
    private final boolean playSound;

    /* compiled from: MobileLinkingHostIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MobileLinkingHostIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobileLinkingHostIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MobileLinkingHostIntentKey(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobileLinkingHostIntentKey[] newArray(int i) {
            return new MobileLinkingHostIntentKey[i];
        }
    }

    public static /* synthetic */ MobileLinkingHostIntentKey copy$default(MobileLinkingHostIntentKey mobileLinkingHostIntentKey, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileLinkingHostIntentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = mobileLinkingHostIntentKey.initialSelectedGroupId;
        }
        if ((i & 4) != 0) {
            z = mobileLinkingHostIntentKey.playSound;
        }
        return mobileLinkingHostIntentKey.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitialSelectedGroupId() {
        return this.initialSelectedGroupId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPlaySound() {
        return this.playSound;
    }

    public final MobileLinkingHostIntentKey copy(String accountNumber, String initialSelectedGroupId, boolean playSound) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new MobileLinkingHostIntentKey(accountNumber, initialSelectedGroupId, playSound);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileLinkingHostIntentKey)) {
            return false;
        }
        MobileLinkingHostIntentKey mobileLinkingHostIntentKey = (MobileLinkingHostIntentKey) other;
        return Intrinsics.areEqual(this.accountNumber, mobileLinkingHostIntentKey.accountNumber) && Intrinsics.areEqual(this.initialSelectedGroupId, mobileLinkingHostIntentKey.initialSelectedGroupId) && this.playSound == mobileLinkingHostIntentKey.playSound;
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        String str = this.initialSelectedGroupId;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.playSound);
    }

    public String toString() {
        return "MobileLinkingHostIntentKey(accountNumber=" + this.accountNumber + ", initialSelectedGroupId=" + this.initialSelectedGroupId + ", playSound=" + this.playSound + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.initialSelectedGroupId);
        dest.writeInt(this.playSound ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public MobileLinkingHostIntentKey(String accountNumber, String str, boolean z) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.initialSelectedGroupId = str;
        this.playSound = z;
    }

    public /* synthetic */ MobileLinkingHostIntentKey(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getInitialSelectedGroupId() {
        return this.initialSelectedGroupId;
    }

    public final boolean getPlaySound() {
        return this.playSound;
    }
}
