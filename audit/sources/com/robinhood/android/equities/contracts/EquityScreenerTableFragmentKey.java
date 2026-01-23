package com.robinhood.android.equities.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerTableKeys.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/EquityScreenerTableFragmentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "screenerId", "", "source", "showCreateDialog", "", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getScreenerId", "()Ljava/lang/String;", "getSource", "getShowCreateDialog", "()Z", "getAccountNumber", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EquityScreenerTableFragmentKey implements Parcelable, FragmentKey {
    public static final Parcelable.Creator<EquityScreenerTableFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String screenerId;
    private final boolean showCreateDialog;
    private final String source;

    /* compiled from: ScreenerTableKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<EquityScreenerTableFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityScreenerTableFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EquityScreenerTableFragmentKey(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityScreenerTableFragmentKey[] newArray(int i) {
            return new EquityScreenerTableFragmentKey[i];
        }
    }

    public static /* synthetic */ EquityScreenerTableFragmentKey copy$default(EquityScreenerTableFragmentKey equityScreenerTableFragmentKey, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = equityScreenerTableFragmentKey.screenerId;
        }
        if ((i & 2) != 0) {
            str2 = equityScreenerTableFragmentKey.source;
        }
        if ((i & 4) != 0) {
            z = equityScreenerTableFragmentKey.showCreateDialog;
        }
        if ((i & 8) != 0) {
            str3 = equityScreenerTableFragmentKey.accountNumber;
        }
        return equityScreenerTableFragmentKey.copy(str, str2, z, str3);
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
    public final boolean getShowCreateDialog() {
        return this.showCreateDialog;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final EquityScreenerTableFragmentKey copy(String screenerId, String source, boolean showCreateDialog, String accountNumber) {
        Intrinsics.checkNotNullParameter(screenerId, "screenerId");
        return new EquityScreenerTableFragmentKey(screenerId, source, showCreateDialog, accountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityScreenerTableFragmentKey)) {
            return false;
        }
        EquityScreenerTableFragmentKey equityScreenerTableFragmentKey = (EquityScreenerTableFragmentKey) other;
        return Intrinsics.areEqual(this.screenerId, equityScreenerTableFragmentKey.screenerId) && Intrinsics.areEqual(this.source, equityScreenerTableFragmentKey.source) && this.showCreateDialog == equityScreenerTableFragmentKey.showCreateDialog && Intrinsics.areEqual(this.accountNumber, equityScreenerTableFragmentKey.accountNumber);
    }

    public int hashCode() {
        int iHashCode = this.screenerId.hashCode() * 31;
        String str = this.source;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showCreateDialog)) * 31;
        String str2 = this.accountNumber;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EquityScreenerTableFragmentKey(screenerId=" + this.screenerId + ", source=" + this.source + ", showCreateDialog=" + this.showCreateDialog + ", accountNumber=" + this.accountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.screenerId);
        dest.writeString(this.source);
        dest.writeInt(this.showCreateDialog ? 1 : 0);
        dest.writeString(this.accountNumber);
    }

    public EquityScreenerTableFragmentKey(String screenerId, String str, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(screenerId, "screenerId");
        this.screenerId = screenerId;
        this.source = str;
        this.showCreateDialog = z;
        this.accountNumber = str2;
    }

    public /* synthetic */ EquityScreenerTableFragmentKey(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3);
    }

    public final String getScreenerId() {
        return this.screenerId;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getShowCreateDialog() {
        return this.showCreateDialog;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
