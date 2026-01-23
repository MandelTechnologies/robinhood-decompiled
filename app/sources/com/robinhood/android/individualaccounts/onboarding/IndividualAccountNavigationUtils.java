package com.robinhood.android.individualaccounts.onboarding;

import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;

/* compiled from: IndividualAccountNavigationUtils.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"mibTabLinkIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "accountNumber", "", "feature-individual-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.individualaccounts.onboarding.IndividualAccountNavigationUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndividualAccountNavigationUtils {
    public static final TabLinkIntentKey mibTabLinkIntentKey(String str) {
        if (str != null) {
            return new TabLinkIntentKey.Home.Dashboard(new HomeDashboardType.Account(str));
        }
        return TabLinkIntentKey.Home.Legacy.INSTANCE;
    }
}
