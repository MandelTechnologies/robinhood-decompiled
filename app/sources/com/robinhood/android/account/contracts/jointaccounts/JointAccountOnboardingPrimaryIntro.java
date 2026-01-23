package com.robinhood.android.account.contracts.jointaccounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountKeys.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountOnboardingPrimaryIntro;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabKey;", "source", "", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;)V", "getSource", "()Ljava/lang/String;", "getAccountSelectorTabArgs", "()Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class JointAccountOnboardingPrimaryIntro implements TabFragmentKey, AccountSelectorTabKey {
    public static final Parcelable.Creator<JointAccountOnboardingPrimaryIntro> CREATOR = new Creator();
    private final AccountSelectorTabArgs accountSelectorTabArgs;
    private final String source;

    /* compiled from: JointAccountKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<JointAccountOnboardingPrimaryIntro> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JointAccountOnboardingPrimaryIntro createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JointAccountOnboardingPrimaryIntro(parcel.readString(), (AccountSelectorTabArgs) parcel.readParcelable(JointAccountOnboardingPrimaryIntro.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JointAccountOnboardingPrimaryIntro[] newArray(int i) {
            return new JointAccountOnboardingPrimaryIntro[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JointAccountOnboardingPrimaryIntro() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ JointAccountOnboardingPrimaryIntro copy$default(JointAccountOnboardingPrimaryIntro jointAccountOnboardingPrimaryIntro, String str, AccountSelectorTabArgs accountSelectorTabArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jointAccountOnboardingPrimaryIntro.source;
        }
        if ((i & 2) != 0) {
            accountSelectorTabArgs = jointAccountOnboardingPrimaryIntro.accountSelectorTabArgs;
        }
        return jointAccountOnboardingPrimaryIntro.copy(str, accountSelectorTabArgs);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountSelectorTabArgs getAccountSelectorTabArgs() {
        return this.accountSelectorTabArgs;
    }

    public final JointAccountOnboardingPrimaryIntro copy(String source, AccountSelectorTabArgs accountSelectorTabArgs) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new JointAccountOnboardingPrimaryIntro(source, accountSelectorTabArgs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountOnboardingPrimaryIntro)) {
            return false;
        }
        JointAccountOnboardingPrimaryIntro jointAccountOnboardingPrimaryIntro = (JointAccountOnboardingPrimaryIntro) other;
        return Intrinsics.areEqual(this.source, jointAccountOnboardingPrimaryIntro.source) && Intrinsics.areEqual(this.accountSelectorTabArgs, jointAccountOnboardingPrimaryIntro.accountSelectorTabArgs);
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        AccountSelectorTabArgs accountSelectorTabArgs = this.accountSelectorTabArgs;
        return iHashCode + (accountSelectorTabArgs == null ? 0 : accountSelectorTabArgs.hashCode());
    }

    public String toString() {
        return "JointAccountOnboardingPrimaryIntro(source=" + this.source + ", accountSelectorTabArgs=" + this.accountSelectorTabArgs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeParcelable(this.accountSelectorTabArgs, flags);
    }

    public JointAccountOnboardingPrimaryIntro(String source, AccountSelectorTabArgs accountSelectorTabArgs) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.accountSelectorTabArgs = accountSelectorTabArgs;
    }

    public /* synthetic */ JointAccountOnboardingPrimaryIntro(String str, AccountSelectorTabArgs accountSelectorTabArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : accountSelectorTabArgs);
    }

    public final String getSource() {
        return this.source;
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
