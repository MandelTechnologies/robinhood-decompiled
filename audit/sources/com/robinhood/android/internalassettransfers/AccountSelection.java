package com.robinhood.android.internalassettransfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/AccountSelection;", "Landroid/os/Parcelable;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;)V", "getSourceAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSinkAccount", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AccountSelection implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountSelection> CREATOR = new Creator();
    private final UiIatAccount sinkAccount;
    private final UiIatAccount sourceAccount;

    /* compiled from: InternalAssetTransferViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<UiIatAccount> creator = UiIatAccount.CREATOR;
            return new AccountSelection(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelection[] newArray(int i) {
            return new AccountSelection[i];
        }
    }

    public static /* synthetic */ AccountSelection copy$default(AccountSelection accountSelection, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiIatAccount = accountSelection.sourceAccount;
        }
        if ((i & 2) != 0) {
            uiIatAccount2 = accountSelection.sinkAccount;
        }
        return accountSelection.copy(uiIatAccount, uiIatAccount2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiIatAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final UiIatAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final AccountSelection copy(UiIatAccount sourceAccount, UiIatAccount sinkAccount) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        return new AccountSelection(sourceAccount, sinkAccount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelection)) {
            return false;
        }
        AccountSelection accountSelection = (AccountSelection) other;
        return Intrinsics.areEqual(this.sourceAccount, accountSelection.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, accountSelection.sinkAccount);
    }

    public int hashCode() {
        return (this.sourceAccount.hashCode() * 31) + this.sinkAccount.hashCode();
    }

    public String toString() {
        return "AccountSelection(sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.sourceAccount.writeToParcel(dest, flags);
        this.sinkAccount.writeToParcel(dest, flags);
    }

    public AccountSelection(UiIatAccount sourceAccount, UiIatAccount sinkAccount) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        this.sourceAccount = sourceAccount;
        this.sinkAccount = sinkAccount;
    }

    public final UiIatAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final UiIatAccount getSinkAccount() {
        return this.sinkAccount;
    }
}
