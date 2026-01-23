package com.robinhood.android.investorprofile;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import com.robinhood.android.investorprofile.refresh.InvestorProfileLastRefreshPref;
import com.robinhood.android.investorprofile.refresh.InvestorProfileRefreshManager;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestorProfileModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/InvestorProfileModule;", "", "<init>", "()V", "provideInvestorProfileLastRefreshPref", "Lcom/robinhood/prefs/LongPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideInvestorProfileRefreshMainTabActivityListener", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "investorProfileRefreshManager", "Lcom/robinhood/android/investorprofile/refresh/InvestorProfileRefreshManager;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestorProfileModule {
    public static final int $stable = 0;
    public static final InvestorProfileModule INSTANCE = new InvestorProfileModule();

    public final MainTabActivityListener provideInvestorProfileRefreshMainTabActivityListener(InvestorProfileRefreshManager investorProfileRefreshManager) {
        Intrinsics.checkNotNullParameter(investorProfileRefreshManager, "investorProfileRefreshManager");
        return investorProfileRefreshManager;
    }

    private InvestorProfileModule() {
    }

    @InvestorProfileLastRefreshPref
    public final LongPreference provideInvestorProfileLastRefreshPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new LongPreference(preferences, "investorProfileLastRefreshPref", 0L);
    }
}
