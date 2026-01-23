package com.robinhood.android.creditcard.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditCardWaitlistFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/creditcard/contracts/CreditCardWaitlistFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabKey;", "shownInTab", "", "source", "", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;)V", "getShownInTab", "()Z", "getSource", "()Ljava/lang/String;", "getAccountSelectorTabArgs", "()Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CreditCardWaitlistFragmentKey implements FragmentKey, Parcelable, AccountSelectorTabKey {
    public static final Parcelable.Creator<CreditCardWaitlistFragmentKey> CREATOR = new Creator();
    private final AccountSelectorTabArgs accountSelectorTabArgs;
    private final boolean shownInTab;
    private final String source;

    /* compiled from: CreditCardWaitlistFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CreditCardWaitlistFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditCardWaitlistFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardWaitlistFragmentKey(parcel.readInt() != 0, parcel.readString(), (AccountSelectorTabArgs) parcel.readParcelable(CreditCardWaitlistFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditCardWaitlistFragmentKey[] newArray(int i) {
            return new CreditCardWaitlistFragmentKey[i];
        }
    }

    public CreditCardWaitlistFragmentKey() {
        this(false, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.shownInTab ? 1 : 0);
        dest.writeString(this.source);
        dest.writeParcelable(this.accountSelectorTabArgs, flags);
    }

    public CreditCardWaitlistFragmentKey(boolean z, String str, AccountSelectorTabArgs accountSelectorTabArgs) {
        this.shownInTab = z;
        this.source = str;
        this.accountSelectorTabArgs = accountSelectorTabArgs;
    }

    public /* synthetic */ CreditCardWaitlistFragmentKey(boolean z, String str, AccountSelectorTabArgs accountSelectorTabArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : accountSelectorTabArgs);
    }

    public final boolean getShownInTab() {
        return this.shownInTab;
    }

    public final String getSource() {
        return this.source;
    }

    @Override // com.robinhood.android.redesign.accounttab.AccountSelectorTabKey
    public AccountSelectorTabArgs getAccountSelectorTabArgs() {
        return this.accountSelectorTabArgs;
    }
}
