package com.robinhood.android.accountrefresher;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.utils.LogoutKillswitch;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountIacRefresher_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/accountrefresher/AccountIacRefresher_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/accountrefresher/AccountIacRefresher;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-refresher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AccountIacRefresher_Factory implements Factory<AccountIacRefresher> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<CardStore> cardStore;
    private final Provider<IacInfoBannerStore> iacInfoBannerStore;
    private final Provider<LogoutKillswitch> logoutKillswitch;

    @JvmStatic
    public static final AccountIacRefresher_Factory create(Provider<AccountProvider> provider, Provider<IacInfoBannerStore> provider2, Provider<CardStore> provider3, Provider<LogoutKillswitch> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AccountIacRefresher newInstance(AccountProvider accountProvider, IacInfoBannerStore iacInfoBannerStore, CardStore cardStore, LogoutKillswitch logoutKillswitch) {
        return INSTANCE.newInstance(accountProvider, iacInfoBannerStore, cardStore, logoutKillswitch);
    }

    public AccountIacRefresher_Factory(Provider<AccountProvider> accountProvider, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<CardStore> cardStore, Provider<LogoutKillswitch> logoutKillswitch) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(cardStore, "cardStore");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        this.accountProvider = accountProvider;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.cardStore = cardStore;
        this.logoutKillswitch = logoutKillswitch;
    }

    @Override // javax.inject.Provider
    public AccountIacRefresher get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        IacInfoBannerStore iacInfoBannerStore = this.iacInfoBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerStore, "get(...)");
        CardStore cardStore = this.cardStore.get();
        Intrinsics.checkNotNullExpressionValue(cardStore, "get(...)");
        LogoutKillswitch logoutKillswitch = this.logoutKillswitch.get();
        Intrinsics.checkNotNullExpressionValue(logoutKillswitch, "get(...)");
        return companion.newInstance(accountProvider, iacInfoBannerStore, cardStore, logoutKillswitch);
    }

    /* compiled from: AccountIacRefresher_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/accountrefresher/AccountIacRefresher_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/accountrefresher/AccountIacRefresher_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "newInstance", "Lcom/robinhood/android/accountrefresher/AccountIacRefresher;", "lib-account-refresher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountIacRefresher_Factory create(Provider<AccountProvider> accountProvider, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<CardStore> cardStore, Provider<LogoutKillswitch> logoutKillswitch) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(cardStore, "cardStore");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            return new AccountIacRefresher_Factory(accountProvider, iacInfoBannerStore, cardStore, logoutKillswitch);
        }

        @JvmStatic
        public final AccountIacRefresher newInstance(AccountProvider accountProvider, IacInfoBannerStore iacInfoBannerStore, CardStore cardStore, LogoutKillswitch logoutKillswitch) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(cardStore, "cardStore");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            return new AccountIacRefresher(accountProvider, iacInfoBannerStore, cardStore, logoutKillswitch);
        }
    }
}
