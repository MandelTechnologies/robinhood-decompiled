package com.robinhood.android.recurring.hub;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringHubViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubAccountUiModel;", "", "account", "Lcom/robinhood/models/db/Account;", "isRecurringEnabled", "", "<init>", "(Lcom/robinhood/models/db/Account;Z)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecurringHubAccountUiModel {
    public static final int $stable = 8;
    private final Account account;
    private final boolean isRecurringEnabled;

    public static /* synthetic */ RecurringHubAccountUiModel copy$default(RecurringHubAccountUiModel recurringHubAccountUiModel, Account account, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            account = recurringHubAccountUiModel.account;
        }
        if ((i & 2) != 0) {
            z = recurringHubAccountUiModel.isRecurringEnabled;
        }
        return recurringHubAccountUiModel.copy(account, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRecurringEnabled() {
        return this.isRecurringEnabled;
    }

    public final RecurringHubAccountUiModel copy(Account account, boolean isRecurringEnabled) {
        Intrinsics.checkNotNullParameter(account, "account");
        return new RecurringHubAccountUiModel(account, isRecurringEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringHubAccountUiModel)) {
            return false;
        }
        RecurringHubAccountUiModel recurringHubAccountUiModel = (RecurringHubAccountUiModel) other;
        return Intrinsics.areEqual(this.account, recurringHubAccountUiModel.account) && this.isRecurringEnabled == recurringHubAccountUiModel.isRecurringEnabled;
    }

    public int hashCode() {
        return (this.account.hashCode() * 31) + Boolean.hashCode(this.isRecurringEnabled);
    }

    public String toString() {
        return "RecurringHubAccountUiModel(account=" + this.account + ", isRecurringEnabled=" + this.isRecurringEnabled + ")";
    }

    public RecurringHubAccountUiModel(Account account, boolean z) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.account = account;
        this.isRecurringEnabled = z;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean isRecurringEnabled() {
        return this.isRecurringEnabled;
    }
}
