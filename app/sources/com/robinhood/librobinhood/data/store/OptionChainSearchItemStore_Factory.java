package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.dao.OptionChainSearchItemDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSearchItemStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionChainSearchItemDao;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionChainSearchItemStore_Factory implements Factory<OptionChainSearchItemStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OptionChainSearchItemDao> dao;
    private final Provider<InstrumentPositionStore> instrumentPositionStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionPositionStore> optionInstrumentPositionStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OptionChainSearchItemStore_Factory create(Provider<StoreBundle> provider, Provider<OptionChainSearchItemDao> provider2, Provider<OptionChainStore> provider3, Provider<OptionPositionStore> provider4, Provider<InstrumentPositionStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final OptionChainSearchItemStore newInstance(StoreBundle storeBundle, OptionChainSearchItemDao optionChainSearchItemDao, OptionChainStore optionChainStore, OptionPositionStore optionPositionStore, InstrumentPositionStore instrumentPositionStore) {
        return INSTANCE.newInstance(storeBundle, optionChainSearchItemDao, optionChainStore, optionPositionStore, instrumentPositionStore);
    }

    public OptionChainSearchItemStore_Factory(Provider<StoreBundle> storeBundle, Provider<OptionChainSearchItemDao> dao, Provider<OptionChainStore> optionChainStore, Provider<OptionPositionStore> optionInstrumentPositionStore, Provider<InstrumentPositionStore> instrumentPositionStore) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentPositionStore, "optionInstrumentPositionStore");
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentPositionStore = optionInstrumentPositionStore;
        this.instrumentPositionStore = instrumentPositionStore;
    }

    @Override // javax.inject.Provider
    public OptionChainSearchItemStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        OptionChainSearchItemDao optionChainSearchItemDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(optionChainSearchItemDao, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionInstrumentPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        InstrumentPositionStore instrumentPositionStore = this.instrumentPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentPositionStore, "get(...)");
        return companion.newInstance(storeBundle, optionChainSearchItemDao, optionChainStore, optionPositionStore, instrumentPositionStore);
    }

    /* compiled from: OptionChainSearchItemStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionChainSearchItemDao;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionChainSearchItemStore_Factory create(Provider<StoreBundle> storeBundle, Provider<OptionChainSearchItemDao> dao, Provider<OptionChainStore> optionChainStore, Provider<OptionPositionStore> optionInstrumentPositionStore, Provider<InstrumentPositionStore> instrumentPositionStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentPositionStore, "optionInstrumentPositionStore");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            return new OptionChainSearchItemStore_Factory(storeBundle, dao, optionChainStore, optionInstrumentPositionStore, instrumentPositionStore);
        }

        @JvmStatic
        public final OptionChainSearchItemStore newInstance(StoreBundle storeBundle, OptionChainSearchItemDao dao, OptionChainStore optionChainStore, OptionPositionStore optionInstrumentPositionStore, InstrumentPositionStore instrumentPositionStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentPositionStore, "optionInstrumentPositionStore");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            return new OptionChainSearchItemStore(storeBundle, dao, optionChainStore, optionInstrumentPositionStore, instrumentPositionStore);
        }
    }
}
