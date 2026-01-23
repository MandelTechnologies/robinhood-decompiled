package com.robinhood.android.deeplink.targets.cash;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.store.MinervaHistoryStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashManagementDeepLinkActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementDeepLinkActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementDeepLinkActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "minervaHistoryStore", "Lcom/robinhood/librobinhood/store/MinervaHistoryStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CashManagementDeepLinkActivity_MembersInjector implements MembersInjector<CashManagementDeepLinkActivity> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<HistoryNavigator> historyNavigator;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<MinervaHistoryStore> minervaHistoryStore;
    private final Provider<PaymentCardStore> paymentCardStore;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CashManagementDeepLinkActivity> create(Provider<BaseActivitySingletons> provider, Provider<MinervaAccountStore> provider2, Provider<AccountProvider> provider3, Provider<MinervaHistoryStore> provider4, Provider<PaymentCardStore> provider5, Provider<HistoryNavigator> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAccountProvider(CashManagementDeepLinkActivity cashManagementDeepLinkActivity, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(cashManagementDeepLinkActivity, accountProvider);
    }

    @JvmStatic
    public static final void injectHistoryNavigator(CashManagementDeepLinkActivity cashManagementDeepLinkActivity, HistoryNavigator historyNavigator) {
        INSTANCE.injectHistoryNavigator(cashManagementDeepLinkActivity, historyNavigator);
    }

    @JvmStatic
    public static final void injectMinervaAccountStore(CashManagementDeepLinkActivity cashManagementDeepLinkActivity, MinervaAccountStore minervaAccountStore) {
        INSTANCE.injectMinervaAccountStore(cashManagementDeepLinkActivity, minervaAccountStore);
    }

    @JvmStatic
    public static final void injectMinervaHistoryStore(CashManagementDeepLinkActivity cashManagementDeepLinkActivity, MinervaHistoryStore minervaHistoryStore) {
        INSTANCE.injectMinervaHistoryStore(cashManagementDeepLinkActivity, minervaHistoryStore);
    }

    @JvmStatic
    public static final void injectPaymentCardStore(CashManagementDeepLinkActivity cashManagementDeepLinkActivity, PaymentCardStore paymentCardStore) {
        INSTANCE.injectPaymentCardStore(cashManagementDeepLinkActivity, paymentCardStore);
    }

    public CashManagementDeepLinkActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<MinervaAccountStore> minervaAccountStore, Provider<AccountProvider> accountProvider, Provider<MinervaHistoryStore> minervaHistoryStore, Provider<PaymentCardStore> paymentCardStore, Provider<HistoryNavigator> historyNavigator) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(minervaHistoryStore, "minervaHistoryStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
        this.singletons = singletons;
        this.minervaAccountStore = minervaAccountStore;
        this.accountProvider = accountProvider;
        this.minervaHistoryStore = minervaHistoryStore;
        this.paymentCardStore = paymentCardStore;
        this.historyNavigator = historyNavigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CashManagementDeepLinkActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        companion2.injectMinervaAccountStore(instance, minervaAccountStore);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        MinervaHistoryStore minervaHistoryStore = this.minervaHistoryStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaHistoryStore, "get(...)");
        companion2.injectMinervaHistoryStore(instance, minervaHistoryStore);
        PaymentCardStore paymentCardStore = this.paymentCardStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardStore, "get(...)");
        companion2.injectPaymentCardStore(instance, paymentCardStore);
        HistoryNavigator historyNavigator = this.historyNavigator.get();
        Intrinsics.checkNotNullExpressionValue(historyNavigator, "get(...)");
        companion2.injectHistoryNavigator(instance, historyNavigator);
    }

    /* compiled from: CashManagementDeepLinkActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementDeepLinkActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementDeepLinkActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "minervaHistoryStore", "Lcom/robinhood/librobinhood/store/MinervaHistoryStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "injectMinervaAccountStore", "", "instance", "injectAccountProvider", "injectMinervaHistoryStore", "injectPaymentCardStore", "injectHistoryNavigator", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CashManagementDeepLinkActivity> create(Provider<BaseActivitySingletons> singletons, Provider<MinervaAccountStore> minervaAccountStore, Provider<AccountProvider> accountProvider, Provider<MinervaHistoryStore> minervaHistoryStore, Provider<PaymentCardStore> paymentCardStore, Provider<HistoryNavigator> historyNavigator) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(minervaHistoryStore, "minervaHistoryStore");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            return new CashManagementDeepLinkActivity_MembersInjector(singletons, minervaAccountStore, accountProvider, minervaHistoryStore, paymentCardStore, historyNavigator);
        }

        @JvmStatic
        public final void injectMinervaAccountStore(CashManagementDeepLinkActivity instance, MinervaAccountStore minervaAccountStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            instance.setMinervaAccountStore(minervaAccountStore);
        }

        @JvmStatic
        public final void injectAccountProvider(CashManagementDeepLinkActivity instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectMinervaHistoryStore(CashManagementDeepLinkActivity instance, MinervaHistoryStore minervaHistoryStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(minervaHistoryStore, "minervaHistoryStore");
            instance.setMinervaHistoryStore(minervaHistoryStore);
        }

        @JvmStatic
        public final void injectPaymentCardStore(CashManagementDeepLinkActivity instance, PaymentCardStore paymentCardStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            instance.setPaymentCardStore(paymentCardStore);
        }

        @JvmStatic
        public final void injectHistoryNavigator(CashManagementDeepLinkActivity instance, HistoryNavigator historyNavigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            instance.setHistoryNavigator(historyNavigator);
        }
    }
}
