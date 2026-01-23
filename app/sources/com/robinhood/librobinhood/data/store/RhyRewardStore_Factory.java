package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.dao.MerchantRewardDao;
import com.robinhood.models.dao.RoundupRewardDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyRewardStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyRewardStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/RhyRewardStore;", "pluto", "Ljavax/inject/Provider;", "Lcom/robinhood/api/pluto/PlutoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "roundupRewardDao", "Lcom/robinhood/models/dao/RoundupRewardDao;", "merchantRewardDao", "Lcom/robinhood/models/dao/MerchantRewardDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyRewardStore_Factory implements Factory<RhyRewardStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<MerchantRewardDao> merchantRewardDao;
    private final Provider<PlutoApi> pluto;
    private final Provider<RoundupRewardDao> roundupRewardDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final RhyRewardStore_Factory create(Provider<PlutoApi> provider, Provider<StoreBundle> provider2, Provider<RoundupRewardDao> provider3, Provider<MerchantRewardDao> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final RhyRewardStore newInstance(PlutoApi plutoApi, StoreBundle storeBundle, RoundupRewardDao roundupRewardDao, MerchantRewardDao merchantRewardDao) {
        return INSTANCE.newInstance(plutoApi, storeBundle, roundupRewardDao, merchantRewardDao);
    }

    public RhyRewardStore_Factory(Provider<PlutoApi> pluto, Provider<StoreBundle> storeBundle, Provider<RoundupRewardDao> roundupRewardDao, Provider<MerchantRewardDao> merchantRewardDao) {
        Intrinsics.checkNotNullParameter(pluto, "pluto");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(roundupRewardDao, "roundupRewardDao");
        Intrinsics.checkNotNullParameter(merchantRewardDao, "merchantRewardDao");
        this.pluto = pluto;
        this.storeBundle = storeBundle;
        this.roundupRewardDao = roundupRewardDao;
        this.merchantRewardDao = merchantRewardDao;
    }

    @Override // javax.inject.Provider
    public RhyRewardStore get() {
        Companion companion = INSTANCE;
        PlutoApi plutoApi = this.pluto.get();
        Intrinsics.checkNotNullExpressionValue(plutoApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        RoundupRewardDao roundupRewardDao = this.roundupRewardDao.get();
        Intrinsics.checkNotNullExpressionValue(roundupRewardDao, "get(...)");
        MerchantRewardDao merchantRewardDao = this.merchantRewardDao.get();
        Intrinsics.checkNotNullExpressionValue(merchantRewardDao, "get(...)");
        return companion.newInstance(plutoApi, storeBundle, roundupRewardDao, merchantRewardDao);
    }

    /* compiled from: RhyRewardStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyRewardStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/RhyRewardStore_Factory;", "pluto", "Ljavax/inject/Provider;", "Lcom/robinhood/api/pluto/PlutoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "roundupRewardDao", "Lcom/robinhood/models/dao/RoundupRewardDao;", "merchantRewardDao", "Lcom/robinhood/models/dao/MerchantRewardDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/RhyRewardStore;", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyRewardStore_Factory create(Provider<PlutoApi> pluto, Provider<StoreBundle> storeBundle, Provider<RoundupRewardDao> roundupRewardDao, Provider<MerchantRewardDao> merchantRewardDao) {
            Intrinsics.checkNotNullParameter(pluto, "pluto");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(roundupRewardDao, "roundupRewardDao");
            Intrinsics.checkNotNullParameter(merchantRewardDao, "merchantRewardDao");
            return new RhyRewardStore_Factory(pluto, storeBundle, roundupRewardDao, merchantRewardDao);
        }

        @JvmStatic
        public final RhyRewardStore newInstance(PlutoApi pluto, StoreBundle storeBundle, RoundupRewardDao roundupRewardDao, MerchantRewardDao merchantRewardDao) {
            Intrinsics.checkNotNullParameter(pluto, "pluto");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(roundupRewardDao, "roundupRewardDao");
            Intrinsics.checkNotNullParameter(merchantRewardDao, "merchantRewardDao");
            return new RhyRewardStore(pluto, storeBundle, roundupRewardDao, merchantRewardDao);
        }
    }
}
