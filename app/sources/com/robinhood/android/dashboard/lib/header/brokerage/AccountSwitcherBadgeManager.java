package com.robinhood.android.dashboard.lib.header.brokerage;

import com.robinhood.android.dashboard.lib.prefs.AccountSwitcherBadgeInteractionMapPref;
import com.robinhood.prefs.StringToBooleanMapPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherBadgeManager.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager;", "", "accountSwitcherBadgeInteractionMap", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "<init>", "(Lcom/robinhood/prefs/StringToBooleanMapPreference;)V", "isBadgeEligibleToBeShown", "", "prefId", "", "markBadgeInteraction", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AccountSwitcherBadgeManager {
    public static final int $stable = 8;
    private final StringToBooleanMapPreference accountSwitcherBadgeInteractionMap;

    public AccountSwitcherBadgeManager(@AccountSwitcherBadgeInteractionMapPref StringToBooleanMapPreference accountSwitcherBadgeInteractionMap) {
        Intrinsics.checkNotNullParameter(accountSwitcherBadgeInteractionMap, "accountSwitcherBadgeInteractionMap");
        this.accountSwitcherBadgeInteractionMap = accountSwitcherBadgeInteractionMap;
    }

    public final boolean isBadgeEligibleToBeShown(String prefId) {
        Intrinsics.checkNotNullParameter(prefId, "prefId");
        return !this.accountSwitcherBadgeInteractionMap.get(prefId, false);
    }

    public final void markBadgeInteraction(String prefId) {
        Intrinsics.checkNotNullParameter(prefId, "prefId");
        this.accountSwitcherBadgeInteractionMap.set(prefId, true);
    }
}
