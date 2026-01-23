package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.models.dao.AggregateMerchantDao;
import com.robinhood.models.dao.MerchantDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MerchantStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/MerchantStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "merchantDao", "Lcom/robinhood/models/dao/MerchantDao;", "aggregateMerchantDao", "Lcom/robinhood/models/dao/AggregateMerchantDao;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-cash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MerchantStore_Factory implements Factory<MerchantStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AggregateMerchantDao> aggregateMerchantDao;
    private final Provider<MerchantDao> merchantDao;
    private final Provider<Minerva> minerva;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final MerchantStore_Factory create(Provider<StoreBundle> provider, Provider<MerchantDao> provider2, Provider<AggregateMerchantDao> provider3, Provider<Minerva> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final MerchantStore newInstance(StoreBundle storeBundle, MerchantDao merchantDao, AggregateMerchantDao aggregateMerchantDao, Minerva minerva) {
        return INSTANCE.newInstance(storeBundle, merchantDao, aggregateMerchantDao, minerva);
    }

    public MerchantStore_Factory(Provider<StoreBundle> storeBundle, Provider<MerchantDao> merchantDao, Provider<AggregateMerchantDao> aggregateMerchantDao, Provider<Minerva> minerva) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(merchantDao, "merchantDao");
        Intrinsics.checkNotNullParameter(aggregateMerchantDao, "aggregateMerchantDao");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        this.storeBundle = storeBundle;
        this.merchantDao = merchantDao;
        this.aggregateMerchantDao = aggregateMerchantDao;
        this.minerva = minerva;
    }

    @Override // javax.inject.Provider
    public MerchantStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        MerchantDao merchantDao = this.merchantDao.get();
        Intrinsics.checkNotNullExpressionValue(merchantDao, "get(...)");
        AggregateMerchantDao aggregateMerchantDao = this.aggregateMerchantDao.get();
        Intrinsics.checkNotNullExpressionValue(aggregateMerchantDao, "get(...)");
        Minerva minerva = this.minerva.get();
        Intrinsics.checkNotNullExpressionValue(minerva, "get(...)");
        return companion.newInstance(storeBundle, merchantDao, aggregateMerchantDao, minerva);
    }

    /* compiled from: MerchantStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MerchantStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/MerchantStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "merchantDao", "Lcom/robinhood/models/dao/MerchantDao;", "aggregateMerchantDao", "Lcom/robinhood/models/dao/AggregateMerchantDao;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "newInstance", "Lcom/robinhood/librobinhood/data/store/MerchantStore;", "lib-store-cash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MerchantStore_Factory create(Provider<StoreBundle> storeBundle, Provider<MerchantDao> merchantDao, Provider<AggregateMerchantDao> aggregateMerchantDao, Provider<Minerva> minerva) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(merchantDao, "merchantDao");
            Intrinsics.checkNotNullParameter(aggregateMerchantDao, "aggregateMerchantDao");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            return new MerchantStore_Factory(storeBundle, merchantDao, aggregateMerchantDao, minerva);
        }

        @JvmStatic
        public final MerchantStore newInstance(StoreBundle storeBundle, MerchantDao merchantDao, AggregateMerchantDao aggregateMerchantDao, Minerva minerva) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(merchantDao, "merchantDao");
            Intrinsics.checkNotNullParameter(aggregateMerchantDao, "aggregateMerchantDao");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            return new MerchantStore(storeBundle, merchantDao, aggregateMerchantDao, minerva);
        }
    }
}
