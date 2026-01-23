package com.robinhood.android.dashboard.lib.header.brokerage;

import com.robinhood.android.dashboard.lib.prefs.AccountSwitcherTooltipImpressionMapPref;
import com.robinhood.android.dashboard.lib.prefs.AccountSwitcherTooltipInteractionMapPref;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherTooltipManager.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherTooltipManager;", "", "accountSwitcherTooltipInteractionMap", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "accountSwitcherTooltipImpressionMap", "Lcom/robinhood/prefs/StringToLongMapPreference;", "<init>", "(Lcom/robinhood/prefs/StringToBooleanMapPreference;Lcom/robinhood/prefs/StringToLongMapPreference;)V", "isTooltipEligibleToBeShown", "", "impressionPrefId", "", "interactionPrefId", "maxNumberImpressions", "", "markTooltipInteraction", "", "prefId", "markTooltipImpression", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AccountSwitcherTooltipManager {
    public static final int $stable = 8;
    private final StringToLongMapPreference accountSwitcherTooltipImpressionMap;
    private final StringToBooleanMapPreference accountSwitcherTooltipInteractionMap;

    public AccountSwitcherTooltipManager(@AccountSwitcherTooltipInteractionMapPref StringToBooleanMapPreference accountSwitcherTooltipInteractionMap, @AccountSwitcherTooltipImpressionMapPref StringToLongMapPreference accountSwitcherTooltipImpressionMap) {
        Intrinsics.checkNotNullParameter(accountSwitcherTooltipInteractionMap, "accountSwitcherTooltipInteractionMap");
        Intrinsics.checkNotNullParameter(accountSwitcherTooltipImpressionMap, "accountSwitcherTooltipImpressionMap");
        this.accountSwitcherTooltipInteractionMap = accountSwitcherTooltipInteractionMap;
        this.accountSwitcherTooltipImpressionMap = accountSwitcherTooltipImpressionMap;
    }

    public final boolean isTooltipEligibleToBeShown(String impressionPrefId, String interactionPrefId, int maxNumberImpressions) {
        Intrinsics.checkNotNullParameter(impressionPrefId, "impressionPrefId");
        Intrinsics.checkNotNullParameter(interactionPrefId, "interactionPrefId");
        return this.accountSwitcherTooltipImpressionMap.get(impressionPrefId, 0L) < ((long) maxNumberImpressions) && !this.accountSwitcherTooltipInteractionMap.get(interactionPrefId, false);
    }

    public final void markTooltipInteraction(String prefId) {
        Intrinsics.checkNotNullParameter(prefId, "prefId");
        this.accountSwitcherTooltipInteractionMap.set(prefId, true);
    }

    public final void markTooltipImpression(String prefId) {
        Intrinsics.checkNotNullParameter(prefId, "prefId");
        StringToLongMapPreference stringToLongMapPreference = this.accountSwitcherTooltipImpressionMap;
        stringToLongMapPreference.set(prefId, stringToLongMapPreference.get(prefId, 0L) + 1);
    }
}
