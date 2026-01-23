package com.robinhood.android.jointaccounts.onboarding.creation;

import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.lib.account.creation.AccountCreationState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"updateDashboard", "", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "state", "Lcom/robinhood/android/lib/account/creation/AccountCreationState;", "DELAY_IN_ACCOUNT_CREATION_BEFORE_SHOWING_LOADING_TEXT", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UtilsKt {
    public static final long DELAY_IN_ACCOUNT_CREATION_BEFORE_SHOWING_LOADING_TEXT = 5000;

    public static final void updateDashboard(HomeDashboardStore homeDashboardStore, AccountCreationState state) {
        String accountNumber;
        Intrinsics.checkNotNullParameter(homeDashboardStore, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        AccountCreationState.Fetched fetched = state instanceof AccountCreationState.Fetched ? (AccountCreationState.Fetched) state : null;
        if (fetched == null || (accountNumber = fetched.getAccountNumber()) == null) {
            return;
        }
        homeDashboardStore.setHomeDashboardType(new HomeDashboardType.Account(accountNumber));
        homeDashboardStore.forceRefresh();
    }
}
