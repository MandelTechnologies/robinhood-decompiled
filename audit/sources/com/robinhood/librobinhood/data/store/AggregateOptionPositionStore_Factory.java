package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.dao.AggregateOptionPositionDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AggregateOptionPositionStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "dao", "Lcom/robinhood/models/dao/AggregateOptionPositionDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AggregateOptionPositionStore_Factory implements Factory<AggregateOptionPositionStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionDao> dao;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionsApi> optionsApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AggregateOptionPositionStore_Factory create(Provider<StoreBundle> provider, Provider<AccountProvider> provider2, Provider<AggregateOptionPositionDao> provider3, Provider<OptionsApi> provider4, Provider<OptionChainStore> provider5, Provider<OptionInstrumentStore> provider6, Provider<OptionPositionStore> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final AggregateOptionPositionStore newInstance(StoreBundle storeBundle, AccountProvider accountProvider, AggregateOptionPositionDao aggregateOptionPositionDao, OptionsApi optionsApi, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionPositionStore optionPositionStore) {
        return INSTANCE.newInstance(storeBundle, accountProvider, aggregateOptionPositionDao, optionsApi, optionChainStore, optionInstrumentStore, optionPositionStore);
    }

    public AggregateOptionPositionStore_Factory(Provider<StoreBundle> storeBundle, Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionDao> dao, Provider<OptionsApi> optionsApi, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionPositionStore> optionPositionStore) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        this.storeBundle = storeBundle;
        this.accountProvider = accountProvider;
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionPositionStore = optionPositionStore;
    }

    @Override // javax.inject.Provider
    public AggregateOptionPositionStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionDao aggregateOptionPositionDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionDao, "get(...)");
        OptionsApi optionsApi = this.optionsApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsApi, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        return companion.newInstance(storeBundle, accountProvider, aggregateOptionPositionDao, optionsApi, optionChainStore, optionInstrumentStore, optionPositionStore);
    }

    /* compiled from: AggregateOptionPositionStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "dao", "Lcom/robinhood/models/dao/AggregateOptionPositionDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AggregateOptionPositionStore_Factory create(Provider<StoreBundle> storeBundle, Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionDao> dao, Provider<OptionsApi> optionsApi, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionPositionStore> optionPositionStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            return new AggregateOptionPositionStore_Factory(storeBundle, accountProvider, dao, optionsApi, optionChainStore, optionInstrumentStore, optionPositionStore);
        }

        @JvmStatic
        public final AggregateOptionPositionStore newInstance(StoreBundle storeBundle, AccountProvider accountProvider, AggregateOptionPositionDao dao, OptionsApi optionsApi, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionPositionStore optionPositionStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            return new AggregateOptionPositionStore(storeBundle, accountProvider, dao, optionsApi, optionChainStore, optionInstrumentStore, optionPositionStore);
        }
    }
}
