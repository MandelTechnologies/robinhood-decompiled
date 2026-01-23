package com.robinhood.android.redesign.accounttab.duxo;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.mcduckling.CashManagementAccessManager;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabDeeplinkCoordinator;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.redesign.accounttab.store.AccountTabStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTabDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo;", "accountTabStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "cashManagementAccessManager", "Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "deeplinkCoordinator", "Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "accountTabOrderPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "seenNewExperiencePref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountTabDuxo_Factory implements Factory<AccountTabDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManager;
    private final Provider<StringToLongMapPreference> accountTabOrderPref;
    private final Provider<AccountTabStore> accountTabStore;
    private final Provider<CashManagementAccessManager> cashManagementAccessManager;
    private final Provider<AccountTabDeeplinkCoordinator> deeplinkCoordinator;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<BooleanPreference> portfolioPrivacyPref;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<BooleanPreference> seenNewExperiencePref;
    private final Provider<BaseSortingHatStore> sortingHatStore;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountTabDuxo_Factory create(Provider<AccountTabStore> provider, Provider<AccountProvider> provider2, Provider<RhyAccountStore> provider3, Provider<BaseSortingHatStore> provider4, Provider<UnifiedAccountStore> provider5, Provider<CashManagementAccessManager> provider6, Provider<AccountSelectorHomeManager> provider7, Provider<AccountTabDeeplinkCoordinator> provider8, Provider<BooleanPreference> provider9, Provider<StringToLongMapPreference> provider10, Provider<BooleanPreference> provider11, Provider<DuxoBundle> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final AccountTabDuxo newInstance(AccountTabStore accountTabStore, AccountProvider accountProvider, RhyAccountStore rhyAccountStore, BaseSortingHatStore baseSortingHatStore, UnifiedAccountStore unifiedAccountStore, CashManagementAccessManager cashManagementAccessManager, AccountSelectorHomeManager accountSelectorHomeManager, AccountTabDeeplinkCoordinator accountTabDeeplinkCoordinator, BooleanPreference booleanPreference, StringToLongMapPreference stringToLongMapPreference, BooleanPreference booleanPreference2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountTabStore, accountProvider, rhyAccountStore, baseSortingHatStore, unifiedAccountStore, cashManagementAccessManager, accountSelectorHomeManager, accountTabDeeplinkCoordinator, booleanPreference, stringToLongMapPreference, booleanPreference2, duxoBundle);
    }

    public AccountTabDuxo_Factory(Provider<AccountTabStore> accountTabStore, Provider<AccountProvider> accountProvider, Provider<RhyAccountStore> rhyAccountStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<CashManagementAccessManager> cashManagementAccessManager, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<AccountTabDeeplinkCoordinator> deeplinkCoordinator, Provider<BooleanPreference> portfolioPrivacyPref, Provider<StringToLongMapPreference> accountTabOrderPref, Provider<BooleanPreference> seenNewExperiencePref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountTabStore, "accountTabStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(cashManagementAccessManager, "cashManagementAccessManager");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(deeplinkCoordinator, "deeplinkCoordinator");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(accountTabOrderPref, "accountTabOrderPref");
        Intrinsics.checkNotNullParameter(seenNewExperiencePref, "seenNewExperiencePref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountTabStore = accountTabStore;
        this.accountProvider = accountProvider;
        this.rhyAccountStore = rhyAccountStore;
        this.sortingHatStore = sortingHatStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.cashManagementAccessManager = cashManagementAccessManager;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.deeplinkCoordinator = deeplinkCoordinator;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
        this.accountTabOrderPref = accountTabOrderPref;
        this.seenNewExperiencePref = seenNewExperiencePref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AccountTabDuxo get() {
        Companion companion = INSTANCE;
        AccountTabStore accountTabStore = this.accountTabStore.get();
        Intrinsics.checkNotNullExpressionValue(accountTabStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        CashManagementAccessManager cashManagementAccessManager = this.cashManagementAccessManager.get();
        Intrinsics.checkNotNullExpressionValue(cashManagementAccessManager, "get(...)");
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        AccountTabDeeplinkCoordinator accountTabDeeplinkCoordinator = this.deeplinkCoordinator.get();
        Intrinsics.checkNotNullExpressionValue(accountTabDeeplinkCoordinator, "get(...)");
        BooleanPreference booleanPreference = this.portfolioPrivacyPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        StringToLongMapPreference stringToLongMapPreference = this.accountTabOrderPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.seenNewExperiencePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountTabStore, accountProvider, rhyAccountStore, baseSortingHatStore, unifiedAccountStore, cashManagementAccessManager, accountSelectorHomeManager, accountTabDeeplinkCoordinator, booleanPreference, stringToLongMapPreference, booleanPreference2, duxoBundle);
    }

    /* compiled from: AccountTabDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0007Jh\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo_Factory;", "accountTabStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "cashManagementAccessManager", "Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "deeplinkCoordinator", "Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "accountTabOrderPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "seenNewExperiencePref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountTabDuxo_Factory create(Provider<AccountTabStore> accountTabStore, Provider<AccountProvider> accountProvider, Provider<RhyAccountStore> rhyAccountStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<CashManagementAccessManager> cashManagementAccessManager, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<AccountTabDeeplinkCoordinator> deeplinkCoordinator, Provider<BooleanPreference> portfolioPrivacyPref, Provider<StringToLongMapPreference> accountTabOrderPref, Provider<BooleanPreference> seenNewExperiencePref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountTabStore, "accountTabStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(cashManagementAccessManager, "cashManagementAccessManager");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(deeplinkCoordinator, "deeplinkCoordinator");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(accountTabOrderPref, "accountTabOrderPref");
            Intrinsics.checkNotNullParameter(seenNewExperiencePref, "seenNewExperiencePref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountTabDuxo_Factory(accountTabStore, accountProvider, rhyAccountStore, sortingHatStore, unifiedAccountStore, cashManagementAccessManager, accountSelectorHomeManager, deeplinkCoordinator, portfolioPrivacyPref, accountTabOrderPref, seenNewExperiencePref, duxoBundle);
        }

        @JvmStatic
        public final AccountTabDuxo newInstance(AccountTabStore accountTabStore, AccountProvider accountProvider, RhyAccountStore rhyAccountStore, BaseSortingHatStore sortingHatStore, UnifiedAccountStore unifiedAccountStore, CashManagementAccessManager cashManagementAccessManager, AccountSelectorHomeManager accountSelectorHomeManager, AccountTabDeeplinkCoordinator deeplinkCoordinator, BooleanPreference portfolioPrivacyPref, StringToLongMapPreference accountTabOrderPref, BooleanPreference seenNewExperiencePref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountTabStore, "accountTabStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(cashManagementAccessManager, "cashManagementAccessManager");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(deeplinkCoordinator, "deeplinkCoordinator");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(accountTabOrderPref, "accountTabOrderPref");
            Intrinsics.checkNotNullParameter(seenNewExperiencePref, "seenNewExperiencePref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountTabDuxo(accountTabStore, accountProvider, rhyAccountStore, sortingHatStore, unifiedAccountStore, cashManagementAccessManager, accountSelectorHomeManager, deeplinkCoordinator, portfolioPrivacyPref, accountTabOrderPref, seenNewExperiencePref, duxoBundle);
        }
    }
}
