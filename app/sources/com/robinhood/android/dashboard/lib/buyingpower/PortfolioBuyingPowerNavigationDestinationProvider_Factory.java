package com.robinhood.android.dashboard.lib.buyingpower;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioBuyingPowerNavigationDestinationProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider;", "accountAccessStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PortfolioBuyingPowerNavigationDestinationProvider_Factory implements Factory<PortfolioBuyingPowerNavigationDestinationProvider> {
    private final Provider<AccountAccessStore> accountAccessStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PortfolioBuyingPowerNavigationDestinationProvider_Factory create(Provider<AccountAccessStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final PortfolioBuyingPowerNavigationDestinationProvider newInstance(AccountAccessStore accountAccessStore) {
        return INSTANCE.newInstance(accountAccessStore);
    }

    public PortfolioBuyingPowerNavigationDestinationProvider_Factory(Provider<AccountAccessStore> accountAccessStore) {
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        this.accountAccessStore = accountAccessStore;
    }

    @Override // javax.inject.Provider
    public PortfolioBuyingPowerNavigationDestinationProvider get() {
        Companion companion = INSTANCE;
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        return companion.newInstance(accountAccessStore);
    }

    /* compiled from: PortfolioBuyingPowerNavigationDestinationProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider_Factory;", "accountAccessStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "newInstance", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioBuyingPowerNavigationDestinationProvider_Factory create(Provider<AccountAccessStore> accountAccessStore) {
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            return new PortfolioBuyingPowerNavigationDestinationProvider_Factory(accountAccessStore);
        }

        @JvmStatic
        public final PortfolioBuyingPowerNavigationDestinationProvider newInstance(AccountAccessStore accountAccessStore) {
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            return new PortfolioBuyingPowerNavigationDestinationProvider(accountAccessStore);
        }
    }
}
