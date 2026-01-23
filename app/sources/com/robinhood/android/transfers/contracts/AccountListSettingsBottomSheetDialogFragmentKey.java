package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerAccountContainerDto;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountListSettingsBottomSheetDialogFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/AccountListSettingsBottomSheetDialogFragmentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "account", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;)V", "getAccount", "()Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AccountListSettingsBottomSheetDialogFragmentKey implements Parcelable, DialogFragmentKey {
    public static final Parcelable.Creator<AccountListSettingsBottomSheetDialogFragmentKey> CREATOR = new Creator();
    private final InvestmentsTrackerAccountContainerDto account;

    /* compiled from: AccountListSettingsBottomSheetDialogFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountListSettingsBottomSheetDialogFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountListSettingsBottomSheetDialogFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountListSettingsBottomSheetDialogFragmentKey((InvestmentsTrackerAccountContainerDto) parcel.readParcelable(AccountListSettingsBottomSheetDialogFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountListSettingsBottomSheetDialogFragmentKey[] newArray(int i) {
            return new AccountListSettingsBottomSheetDialogFragmentKey[i];
        }
    }

    public static /* synthetic */ AccountListSettingsBottomSheetDialogFragmentKey copy$default(AccountListSettingsBottomSheetDialogFragmentKey accountListSettingsBottomSheetDialogFragmentKey, InvestmentsTrackerAccountContainerDto investmentsTrackerAccountContainerDto, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerAccountContainerDto = accountListSettingsBottomSheetDialogFragmentKey.account;
        }
        return accountListSettingsBottomSheetDialogFragmentKey.copy(investmentsTrackerAccountContainerDto);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerAccountContainerDto getAccount() {
        return this.account;
    }

    public final AccountListSettingsBottomSheetDialogFragmentKey copy(InvestmentsTrackerAccountContainerDto account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return new AccountListSettingsBottomSheetDialogFragmentKey(account);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountListSettingsBottomSheetDialogFragmentKey) && Intrinsics.areEqual(this.account, ((AccountListSettingsBottomSheetDialogFragmentKey) other).account);
    }

    public int hashCode() {
        return this.account.hashCode();
    }

    public String toString() {
        return "AccountListSettingsBottomSheetDialogFragmentKey(account=" + this.account + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.account, flags);
    }

    public AccountListSettingsBottomSheetDialogFragmentKey(InvestmentsTrackerAccountContainerDto account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.account = account;
    }

    public final InvestmentsTrackerAccountContainerDto getAccount() {
        return this.account;
    }
}
