package com.robinhood.android.redesign.accounttab.deeplink;

import android.content.SharedPreferences;
import com.robinhood.android.redesign.accounttab.provisions.ReferredDataPref2;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTabModule.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabModule;", "", "<init>", "()V", "providesAccountTabDeeplinkCoordinator", "Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;", "impl", "Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinatorImpl;", "providePreferredAccountTabOrder", "Lcom/robinhood/prefs/StringToLongMapPreference;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountTabModule {
    public static final int $stable = 0;
    public static final AccountTabModule INSTANCE = new AccountTabModule();

    public final AccountTabDeeplinkCoordinator providesAccountTabDeeplinkCoordinator(AccountTabDeeplinkCoordinatorImpl impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    private AccountTabModule() {
    }

    @ReferredDataPref2
    public final StringToLongMapPreference providePreferredAccountTabOrder(@UserPrefs SharedPreferences userPrefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(userPrefs, "accountTabSelectorPreferredOrder", MapsKt.emptyMap(), moshi);
    }
}
