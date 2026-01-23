package com.robinhood.librobinhood.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.api.retrofit.Galileo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.dao.PaymentCardDao;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentCardStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/store/PaymentCardStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/PaymentCardDao;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "galileo", "Lcom/robinhood/api/retrofit/Galileo;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PaymentCardStore_Factory implements Factory<PaymentCardStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PaymentCardDao> dao;
    private final Provider<Galileo> galileo;
    private final Provider<Minerva> minerva;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<LazyMoshi> moshi;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<SuvMigrationManager> suvMigrationManager;

    @JvmStatic
    public static final PaymentCardStore_Factory create(Provider<StoreBundle> provider, Provider<PaymentCardDao> provider2, Provider<MinervaAccountStore> provider3, Provider<Galileo> provider4, Provider<Minerva> provider5, Provider<LazyMoshi> provider6, Provider<SuvMigrationManager> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final PaymentCardStore newInstance(StoreBundle storeBundle, PaymentCardDao paymentCardDao, MinervaAccountStore minervaAccountStore, Galileo galileo, Minerva minerva, LazyMoshi lazyMoshi, SuvMigrationManager suvMigrationManager) {
        return INSTANCE.newInstance(storeBundle, paymentCardDao, minervaAccountStore, galileo, minerva, lazyMoshi, suvMigrationManager);
    }

    public PaymentCardStore_Factory(Provider<StoreBundle> storeBundle, Provider<PaymentCardDao> dao, Provider<MinervaAccountStore> minervaAccountStore, Provider<Galileo> galileo, Provider<Minerva> minerva, Provider<LazyMoshi> moshi, Provider<SuvMigrationManager> suvMigrationManager) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(galileo, "galileo");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.minervaAccountStore = minervaAccountStore;
        this.galileo = galileo;
        this.minerva = minerva;
        this.moshi = moshi;
        this.suvMigrationManager = suvMigrationManager;
    }

    @Override // javax.inject.Provider
    public PaymentCardStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        PaymentCardDao paymentCardDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardDao, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        Galileo galileo = this.galileo.get();
        Intrinsics.checkNotNullExpressionValue(galileo, "get(...)");
        Minerva minerva = this.minerva.get();
        Intrinsics.checkNotNullExpressionValue(minerva, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        SuvMigrationManager suvMigrationManager = this.suvMigrationManager.get();
        Intrinsics.checkNotNullExpressionValue(suvMigrationManager, "get(...)");
        return companion.newInstance(storeBundle, paymentCardDao, minervaAccountStore, galileo, minerva, lazyMoshi, suvMigrationManager);
    }

    /* compiled from: PaymentCardStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/store/PaymentCardStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/store/PaymentCardStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/PaymentCardDao;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "galileo", "Lcom/robinhood/api/retrofit/Galileo;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "newInstance", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaymentCardStore_Factory create(Provider<StoreBundle> storeBundle, Provider<PaymentCardDao> dao, Provider<MinervaAccountStore> minervaAccountStore, Provider<Galileo> galileo, Provider<Minerva> minerva, Provider<LazyMoshi> moshi, Provider<SuvMigrationManager> suvMigrationManager) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(galileo, "galileo");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            return new PaymentCardStore_Factory(storeBundle, dao, minervaAccountStore, galileo, minerva, moshi, suvMigrationManager);
        }

        @JvmStatic
        public final PaymentCardStore newInstance(StoreBundle storeBundle, PaymentCardDao dao, MinervaAccountStore minervaAccountStore, Galileo galileo, Minerva minerva, LazyMoshi moshi, SuvMigrationManager suvMigrationManager) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(galileo, "galileo");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            return new PaymentCardStore(storeBundle, dao, minervaAccountStore, galileo, minerva, moshi, suvMigrationManager);
        }
    }
}
