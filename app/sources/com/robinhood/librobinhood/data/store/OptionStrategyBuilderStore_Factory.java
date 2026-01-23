package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.OptionStrategyBuilderDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "dao", "Lcom/robinhood/models/dao/OptionStrategyBuilderDao;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionStrategyBuilderStore_Factory implements Factory<OptionStrategyBuilderStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OptionsBonfireApi> bonfireApi;
    private final Provider<OptionStrategyBuilderDao> dao;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionStrategyBuilderStore_Factory create(Provider<OptionsBonfireApi> provider, Provider<OptionStrategyBuilderDao> provider2, Provider<OptionInstrumentStore> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OptionStrategyBuilderStore newInstance(OptionsBonfireApi optionsBonfireApi, OptionStrategyBuilderDao optionStrategyBuilderDao, OptionInstrumentStore optionInstrumentStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(optionsBonfireApi, optionStrategyBuilderDao, optionInstrumentStore, storeBundle);
    }

    public OptionStrategyBuilderStore_Factory(Provider<OptionsBonfireApi> bonfireApi, Provider<OptionStrategyBuilderDao> dao, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        this.dao = dao;
        this.optionInstrumentStore = optionInstrumentStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OptionStrategyBuilderStore get() {
        Companion companion = INSTANCE;
        OptionsBonfireApi optionsBonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(optionsBonfireApi, "get(...)");
        OptionStrategyBuilderDao optionStrategyBuilderDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyBuilderDao, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(optionsBonfireApi, optionStrategyBuilderDao, optionInstrumentStore, storeBundle);
    }

    /* compiled from: OptionStrategyBuilderStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore_Factory;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "dao", "Lcom/robinhood/models/dao/OptionStrategyBuilderDao;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionStrategyBuilderStore_Factory create(Provider<OptionsBonfireApi> bonfireApi, Provider<OptionStrategyBuilderDao> dao, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionStrategyBuilderStore_Factory(bonfireApi, dao, optionInstrumentStore, storeBundle);
        }

        @JvmStatic
        public final OptionStrategyBuilderStore newInstance(OptionsBonfireApi bonfireApi, OptionStrategyBuilderDao dao, OptionInstrumentStore optionInstrumentStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OptionStrategyBuilderStore(bonfireApi, dao, optionInstrumentStore, storeBundle);
        }
    }
}
