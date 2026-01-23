package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrategiesValuePropsKey.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/StrategiesValuePropsKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabKey;", "source", "", "campaign", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;)V", "getSource", "()Ljava/lang/String;", "getCampaign", "getAccountSelectorTabArgs", "()Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StrategiesValuePropsKey implements TabFragmentKey, AccountSelectorTabKey {
    public static final Parcelable.Creator<StrategiesValuePropsKey> CREATOR = new Creator();
    private final AccountSelectorTabArgs accountSelectorTabArgs;
    private final String campaign;
    private final String source;

    /* compiled from: StrategiesValuePropsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<StrategiesValuePropsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategiesValuePropsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StrategiesValuePropsKey(parcel.readString(), parcel.readString(), (AccountSelectorTabArgs) parcel.readParcelable(StrategiesValuePropsKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrategiesValuePropsKey[] newArray(int i) {
            return new StrategiesValuePropsKey[i];
        }
    }

    public StrategiesValuePropsKey() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ StrategiesValuePropsKey copy$default(StrategiesValuePropsKey strategiesValuePropsKey, String str, String str2, AccountSelectorTabArgs accountSelectorTabArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategiesValuePropsKey.source;
        }
        if ((i & 2) != 0) {
            str2 = strategiesValuePropsKey.campaign;
        }
        if ((i & 4) != 0) {
            accountSelectorTabArgs = strategiesValuePropsKey.accountSelectorTabArgs;
        }
        return strategiesValuePropsKey.copy(str, str2, accountSelectorTabArgs);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCampaign() {
        return this.campaign;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountSelectorTabArgs getAccountSelectorTabArgs() {
        return this.accountSelectorTabArgs;
    }

    public final StrategiesValuePropsKey copy(String source, String campaign, AccountSelectorTabArgs accountSelectorTabArgs) {
        return new StrategiesValuePropsKey(source, campaign, accountSelectorTabArgs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrategiesValuePropsKey)) {
            return false;
        }
        StrategiesValuePropsKey strategiesValuePropsKey = (StrategiesValuePropsKey) other;
        return Intrinsics.areEqual(this.source, strategiesValuePropsKey.source) && Intrinsics.areEqual(this.campaign, strategiesValuePropsKey.campaign) && Intrinsics.areEqual(this.accountSelectorTabArgs, strategiesValuePropsKey.accountSelectorTabArgs);
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaign;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AccountSelectorTabArgs accountSelectorTabArgs = this.accountSelectorTabArgs;
        return iHashCode2 + (accountSelectorTabArgs != null ? accountSelectorTabArgs.hashCode() : 0);
    }

    public String toString() {
        return "StrategiesValuePropsKey(source=" + this.source + ", campaign=" + this.campaign + ", accountSelectorTabArgs=" + this.accountSelectorTabArgs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeString(this.campaign);
        dest.writeParcelable(this.accountSelectorTabArgs, flags);
    }

    public StrategiesValuePropsKey(String str, String str2, AccountSelectorTabArgs accountSelectorTabArgs) {
        this.source = str;
        this.campaign = str2;
        this.accountSelectorTabArgs = accountSelectorTabArgs;
    }

    public /* synthetic */ StrategiesValuePropsKey(String str, String str2, AccountSelectorTabArgs accountSelectorTabArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : accountSelectorTabArgs);
    }

    public final String getSource() {
        return this.source;
    }

    public final String getCampaign() {
        return this.campaign;
    }

    @Override // com.robinhood.android.redesign.accounttab.AccountSelectorTabKey
    public AccountSelectorTabArgs getAccountSelectorTabArgs() {
        return this.accountSelectorTabArgs;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
