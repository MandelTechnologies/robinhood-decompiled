package com.robinhood.librobinhood.data.store;

import account_aggregation.service.p005v1.AccountAggregationService;
import com.robinhood.android.account.libaccountswitcher.p059db.AccountSwitcherDao;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AccountSwitcherStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore;", "Ljavax/inject/Provider;", "Laccount_aggregation/service/v1/AccountAggregationService;", "accountAggregationService", "Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherDao;", "dao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AccountSwitcherStore_Factory implements Factory<AccountSwitcherStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountAggregationService> accountAggregationService;
    private final Provider<Clock> clock;
    private final Provider<AccountSwitcherDao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AccountSwitcherStore_Factory create(Provider<AccountAggregationService> provider, Provider<AccountSwitcherDao> provider2, Provider<Clock> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AccountSwitcherStore newInstance(AccountAggregationService accountAggregationService, AccountSwitcherDao accountSwitcherDao, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(accountAggregationService, accountSwitcherDao, clock, storeBundle);
    }

    public AccountSwitcherStore_Factory(Provider<AccountAggregationService> accountAggregationService, Provider<AccountSwitcherDao> dao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(accountAggregationService, "accountAggregationService");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountAggregationService = accountAggregationService;
        this.dao = dao;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public AccountSwitcherStore get() {
        Companion companion = INSTANCE;
        AccountAggregationService accountAggregationService = this.accountAggregationService.get();
        Intrinsics.checkNotNullExpressionValue(accountAggregationService, "get(...)");
        AccountSwitcherDao accountSwitcherDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(accountSwitcherDao, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(accountAggregationService, accountSwitcherDao, clock, storeBundle);
    }

    /* compiled from: AccountSwitcherStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Laccount_aggregation/service/v1/AccountAggregationService;", "accountAggregationService", "Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherDao;", "dao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore_Factory;", "Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore;", "newInstance", "(Laccount_aggregation/service/v1/AccountAggregationService;Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore;", "lib-store-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountSwitcherStore_Factory create(Provider<AccountAggregationService> accountAggregationService, Provider<AccountSwitcherDao> dao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(accountAggregationService, "accountAggregationService");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AccountSwitcherStore_Factory(accountAggregationService, dao, clock, storeBundle);
        }

        @JvmStatic
        public final AccountSwitcherStore newInstance(AccountAggregationService accountAggregationService, AccountSwitcherDao dao, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(accountAggregationService, "accountAggregationService");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AccountSwitcherStore(accountAggregationService, dao, clock, storeBundle);
        }
    }
}
