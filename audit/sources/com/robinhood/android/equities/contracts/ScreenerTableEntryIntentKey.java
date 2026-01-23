package com.robinhood.android.equities.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerTableKeys.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/ScreenerTableEntryIntentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "screenerId", "", "source", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScreenerId", "()Ljava/lang/String;", "getSource", "getAccountNumber", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ScreenerTableEntryIntentKey implements Parcelable, IntentKey {
    public static final Parcelable.Creator<ScreenerTableEntryIntentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String screenerId;
    private final String source;

    /* compiled from: ScreenerTableKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<ScreenerTableEntryIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenerTableEntryIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenerTableEntryIntentKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenerTableEntryIntentKey[] newArray(int i) {
            return new ScreenerTableEntryIntentKey[i];
        }
    }

    public ScreenerTableEntryIntentKey() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ScreenerTableEntryIntentKey copy$default(ScreenerTableEntryIntentKey screenerTableEntryIntentKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = screenerTableEntryIntentKey.screenerId;
        }
        if ((i & 2) != 0) {
            str2 = screenerTableEntryIntentKey.source;
        }
        if ((i & 4) != 0) {
            str3 = screenerTableEntryIntentKey.accountNumber;
        }
        return screenerTableEntryIntentKey.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScreenerId() {
        return this.screenerId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ScreenerTableEntryIntentKey copy(String screenerId, String source, String accountNumber) {
        return new ScreenerTableEntryIntentKey(screenerId, source, accountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenerTableEntryIntentKey)) {
            return false;
        }
        ScreenerTableEntryIntentKey screenerTableEntryIntentKey = (ScreenerTableEntryIntentKey) other;
        return Intrinsics.areEqual(this.screenerId, screenerTableEntryIntentKey.screenerId) && Intrinsics.areEqual(this.source, screenerTableEntryIntentKey.source) && Intrinsics.areEqual(this.accountNumber, screenerTableEntryIntentKey.accountNumber);
    }

    public int hashCode() {
        String str = this.screenerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountNumber;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ScreenerTableEntryIntentKey(screenerId=" + this.screenerId + ", source=" + this.source + ", accountNumber=" + this.accountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.screenerId);
        dest.writeString(this.source);
        dest.writeString(this.accountNumber);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public ScreenerTableEntryIntentKey(String str, String str2, String str3) {
        this.screenerId = str;
        this.source = str2;
        this.accountNumber = str3;
    }

    public /* synthetic */ ScreenerTableEntryIntentKey(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getScreenerId() {
        return this.screenerId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
