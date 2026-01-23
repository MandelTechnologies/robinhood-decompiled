package com.robinhood.android.account.p060ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelector.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountSelectorState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "Landroid/os/Parcelable;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "<init>", "(Lcom/robinhood/android/account/strings/DisplayName;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;)V", "getDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "getData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountSelectorState extends AccountOverviewSectionState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountSelectorState> CREATOR = new Creator();
    private final AccountSwitcherData data;
    private final DisplayName displayName;

    /* compiled from: AccountSelector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountSelectorState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelectorState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountSelectorState((DisplayName) parcel.readParcelable(AccountSelectorState.class.getClassLoader()), (AccountSwitcherData) parcel.readParcelable(AccountSelectorState.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelectorState[] newArray(int i) {
            return new AccountSelectorState[i];
        }
    }

    public static /* synthetic */ AccountSelectorState copy$default(AccountSelectorState accountSelectorState, DisplayName displayName, AccountSwitcherData accountSwitcherData, int i, Object obj) {
        if ((i & 1) != 0) {
            displayName = accountSelectorState.displayName;
        }
        if ((i & 2) != 0) {
            accountSwitcherData = accountSelectorState.data;
        }
        return accountSelectorState.copy(displayName, accountSwitcherData);
    }

    /* renamed from: component1, reason: from getter */
    public final DisplayName getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountSwitcherData getData() {
        return this.data;
    }

    public final AccountSelectorState copy(DisplayName displayName, AccountSwitcherData data) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(data, "data");
        return new AccountSelectorState(displayName, data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelectorState)) {
            return false;
        }
        AccountSelectorState accountSelectorState = (AccountSelectorState) other;
        return Intrinsics.areEqual(this.displayName, accountSelectorState.displayName) && Intrinsics.areEqual(this.data, accountSelectorState.data);
    }

    public int hashCode() {
        return (this.displayName.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "AccountSelectorState(displayName=" + this.displayName + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.displayName, flags);
        dest.writeParcelable(this.data, flags);
    }

    public final DisplayName getDisplayName() {
        return this.displayName;
    }

    public final AccountSwitcherData getData() {
        return this.data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSelectorState(DisplayName displayName, AccountSwitcherData data) {
        super(CardOrder.CardIdentifier.ACCOUNT_SELECTOR, null);
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.displayName = displayName;
        this.data = data;
    }
}
