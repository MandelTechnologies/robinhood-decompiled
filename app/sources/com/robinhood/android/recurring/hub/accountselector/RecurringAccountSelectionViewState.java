package com.robinhood.android.recurring.hub.accountselector;

import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringAccountSelectionState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/accountselector/RecurringAccountSelectionViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "accountSelectorData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getAccountSelectorData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecurringAccountSelectionViewState {
    public static final int $stable = 0;
    private final AccountSelectorData accountSelectorData;
    private final StringResource title;

    public static /* synthetic */ RecurringAccountSelectionViewState copy$default(RecurringAccountSelectionViewState recurringAccountSelectionViewState, StringResource stringResource, AccountSelectorData accountSelectorData, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = recurringAccountSelectionViewState.title;
        }
        if ((i & 2) != 0) {
            accountSelectorData = recurringAccountSelectionViewState.accountSelectorData;
        }
        return recurringAccountSelectionViewState.copy(stringResource, accountSelectorData);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountSelectorData getAccountSelectorData() {
        return this.accountSelectorData;
    }

    public final RecurringAccountSelectionViewState copy(StringResource title, AccountSelectorData accountSelectorData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accountSelectorData, "accountSelectorData");
        return new RecurringAccountSelectionViewState(title, accountSelectorData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringAccountSelectionViewState)) {
            return false;
        }
        RecurringAccountSelectionViewState recurringAccountSelectionViewState = (RecurringAccountSelectionViewState) other;
        return Intrinsics.areEqual(this.title, recurringAccountSelectionViewState.title) && Intrinsics.areEqual(this.accountSelectorData, recurringAccountSelectionViewState.accountSelectorData);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.accountSelectorData.hashCode();
    }

    public String toString() {
        return "RecurringAccountSelectionViewState(title=" + this.title + ", accountSelectorData=" + this.accountSelectorData + ")";
    }

    public RecurringAccountSelectionViewState(StringResource title, AccountSelectorData accountSelectorData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accountSelectorData, "accountSelectorData");
        this.title = title;
        this.accountSelectorData = accountSelectorData;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final AccountSelectorData getAccountSelectorData() {
        return this.accountSelectorData;
    }
}
