package com.robinhood.android.lib.trade.suitability;

import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.store.base.SuitabilityStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherSuitabilityDialogFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AccountSwitcherSuitabilityDialogFragment_MembersInjector implements MembersInjector<AccountSwitcherSuitabilityDialogFragment> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<Navigator> navigator;
    private final Provider<BaseDialogSingletons> singletons;
    private final Provider<SuitabilityStore> suitabilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<AccountSwitcherSuitabilityDialogFragment> create(Provider<BaseDialogSingletons> provider, Provider<Navigator> provider2, Provider<AccountProvider> provider3, Provider<SuitabilityStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAccountProvider(AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(accountSwitcherSuitabilityDialogFragment, accountProvider);
    }

    @JvmStatic
    public static final void injectNavigator(AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment, Navigator navigator) {
        INSTANCE.injectNavigator(accountSwitcherSuitabilityDialogFragment, navigator);
    }

    @JvmStatic
    public static final void injectSuitabilityStore(AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment, SuitabilityStore suitabilityStore) {
        INSTANCE.injectSuitabilityStore(accountSwitcherSuitabilityDialogFragment, suitabilityStore);
    }

    public AccountSwitcherSuitabilityDialogFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<AccountProvider> accountProvider, Provider<SuitabilityStore> suitabilityStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
        this.singletons = singletons;
        this.navigator = navigator;
        this.accountProvider = accountProvider;
        this.suitabilityStore = suitabilityStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AccountSwitcherSuitabilityDialogFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        Companion companion2 = INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        SuitabilityStore suitabilityStore = this.suitabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(suitabilityStore, "get(...)");
        companion2.injectSuitabilityStore(instance, suitabilityStore);
    }

    /* compiled from: AccountSwitcherSuitabilityDialogFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "injectNavigator", "", "instance", "injectAccountProvider", "injectSuitabilityStore", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<AccountSwitcherSuitabilityDialogFragment> create(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<AccountProvider> accountProvider, Provider<SuitabilityStore> suitabilityStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            return new AccountSwitcherSuitabilityDialogFragment_MembersInjector(singletons, navigator, accountProvider, suitabilityStore);
        }

        @JvmStatic
        public final void injectNavigator(AccountSwitcherSuitabilityDialogFragment instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectAccountProvider(AccountSwitcherSuitabilityDialogFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectSuitabilityStore(AccountSwitcherSuitabilityDialogFragment instance, SuitabilityStore suitabilityStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            instance.setSuitabilityStore(suitabilityStore);
        }
    }
}
