package com.robinhood.android.redesign.accounttab.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.redesign.accountselector.experiment.AccountTabExperimentStore;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorHomeManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "rootCoroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "accountTabExperimentStore", "Lcom/robinhood/android/redesign/accountselector/experiment/AccountTabExperimentStore;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-selector-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountSelectorHomeManager_Factory implements Factory<AccountSelectorHomeManager> {
    private final Provider<AccountTabExperimentStore> accountTabExperimentStore;
    private final Provider<CoroutineScope> rootCoroutineScope;
    private final Provider<SharedPreferences> userPrefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountSelectorHomeManager_Factory create(Provider<CoroutineScope> provider, Provider<AccountTabExperimentStore> provider2, Provider<SharedPreferences> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AccountSelectorHomeManager newInstance(CoroutineScope coroutineScope, AccountTabExperimentStore accountTabExperimentStore, SharedPreferences sharedPreferences) {
        return INSTANCE.newInstance(coroutineScope, accountTabExperimentStore, sharedPreferences);
    }

    public AccountSelectorHomeManager_Factory(Provider<CoroutineScope> rootCoroutineScope, Provider<AccountTabExperimentStore> accountTabExperimentStore, Provider<SharedPreferences> userPrefs) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(accountTabExperimentStore, "accountTabExperimentStore");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        this.rootCoroutineScope = rootCoroutineScope;
        this.accountTabExperimentStore = accountTabExperimentStore;
        this.userPrefs = userPrefs;
    }

    @Override // javax.inject.Provider
    public AccountSelectorHomeManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        AccountTabExperimentStore accountTabExperimentStore = this.accountTabExperimentStore.get();
        Intrinsics.checkNotNullExpressionValue(accountTabExperimentStore, "get(...)");
        SharedPreferences sharedPreferences = this.userPrefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.newInstance(coroutineScope, accountTabExperimentStore, sharedPreferences);
    }

    /* compiled from: AccountSelectorHomeManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager_Factory;", "rootCoroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "accountTabExperimentStore", "Lcom/robinhood/android/redesign/accountselector/experiment/AccountTabExperimentStore;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "newInstance", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "lib-account-selector-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountSelectorHomeManager_Factory create(Provider<CoroutineScope> rootCoroutineScope, Provider<AccountTabExperimentStore> accountTabExperimentStore, Provider<SharedPreferences> userPrefs) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(accountTabExperimentStore, "accountTabExperimentStore");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            return new AccountSelectorHomeManager_Factory(rootCoroutineScope, accountTabExperimentStore, userPrefs);
        }

        @JvmStatic
        public final AccountSelectorHomeManager newInstance(CoroutineScope rootCoroutineScope, AccountTabExperimentStore accountTabExperimentStore, SharedPreferences userPrefs) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(accountTabExperimentStore, "accountTabExperimentStore");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            return new AccountSelectorHomeManager(rootCoroutineScope, accountTabExperimentStore, userPrefs);
        }
    }
}
