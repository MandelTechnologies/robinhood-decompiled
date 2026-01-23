package com.robinhood.android.margin.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginInvestingSettingsIntentKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/margin/contracts/MarginInvestingSettingsKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "showInTab", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getShowInTab", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginInvestingSettingsKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<MarginInvestingSettingsKey> CREATOR = new Creator();
    private final String accountNumber;
    private final boolean showInTab;

    /* compiled from: MarginInvestingSettingsIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginInvestingSettingsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginInvestingSettingsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginInvestingSettingsKey(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginInvestingSettingsKey[] newArray(int i) {
            return new MarginInvestingSettingsKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarginInvestingSettingsKey() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MarginInvestingSettingsKey copy$default(MarginInvestingSettingsKey marginInvestingSettingsKey, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginInvestingSettingsKey.accountNumber;
        }
        if ((i & 2) != 0) {
            z = marginInvestingSettingsKey.showInTab;
        }
        return marginInvestingSettingsKey.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowInTab() {
        return this.showInTab;
    }

    public final MarginInvestingSettingsKey copy(String accountNumber, boolean showInTab) {
        return new MarginInvestingSettingsKey(accountNumber, showInTab);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginInvestingSettingsKey)) {
            return false;
        }
        MarginInvestingSettingsKey marginInvestingSettingsKey = (MarginInvestingSettingsKey) other;
        return Intrinsics.areEqual(this.accountNumber, marginInvestingSettingsKey.accountNumber) && this.showInTab == marginInvestingSettingsKey.showInTab;
    }

    public int hashCode() {
        String str = this.accountNumber;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.showInTab);
    }

    public String toString() {
        return "MarginInvestingSettingsKey(accountNumber=" + this.accountNumber + ", showInTab=" + this.showInTab + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeInt(this.showInTab ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public MarginInvestingSettingsKey(String str, boolean z) {
        this.accountNumber = str;
        this.showInTab = z;
    }

    public /* synthetic */ MarginInvestingSettingsKey(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getShowInTab() {
        return this.showInTab;
    }
}
