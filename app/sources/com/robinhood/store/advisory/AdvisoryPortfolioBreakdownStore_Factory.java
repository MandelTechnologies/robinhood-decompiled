package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.advisory.dao.ManagedReturnsBreakdownDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryPortfolioBreakdownStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "advisoryService", "Ljavax/inject/Provider;", "Ladvisory/proto/v1/AdvisoryService;", "returnsBreakdownDao", "Lcom/robinhood/models/advisory/dao/ManagedReturnsBreakdownDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AdvisoryPortfolioBreakdownStore_Factory implements Factory<AdvisoryPortfolioBreakdownStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvisoryService> advisoryService;
    private final Provider<ManagedReturnsBreakdownDao> returnsBreakdownDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AdvisoryPortfolioBreakdownStore_Factory create(Provider<AdvisoryService> provider, Provider<ManagedReturnsBreakdownDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AdvisoryPortfolioBreakdownStore newInstance(AdvisoryService advisoryService, ManagedReturnsBreakdownDao managedReturnsBreakdownDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(advisoryService, managedReturnsBreakdownDao, storeBundle);
    }

    public AdvisoryPortfolioBreakdownStore_Factory(Provider<AdvisoryService> advisoryService, Provider<ManagedReturnsBreakdownDao> returnsBreakdownDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(returnsBreakdownDao, "returnsBreakdownDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.returnsBreakdownDao = returnsBreakdownDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public AdvisoryPortfolioBreakdownStore get() {
        Companion companion = INSTANCE;
        AdvisoryService advisoryService = this.advisoryService.get();
        Intrinsics.checkNotNullExpressionValue(advisoryService, "get(...)");
        ManagedReturnsBreakdownDao managedReturnsBreakdownDao = this.returnsBreakdownDao.get();
        Intrinsics.checkNotNullExpressionValue(managedReturnsBreakdownDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(advisoryService, managedReturnsBreakdownDao, storeBundle);
    }

    /* compiled from: AdvisoryPortfolioBreakdownStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore_Factory;", "advisoryService", "Ljavax/inject/Provider;", "Ladvisory/proto/v1/AdvisoryService;", "returnsBreakdownDao", "Lcom/robinhood/models/advisory/dao/ManagedReturnsBreakdownDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisoryPortfolioBreakdownStore_Factory create(Provider<AdvisoryService> advisoryService, Provider<ManagedReturnsBreakdownDao> returnsBreakdownDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(returnsBreakdownDao, "returnsBreakdownDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvisoryPortfolioBreakdownStore_Factory(advisoryService, returnsBreakdownDao, storeBundle);
        }

        @JvmStatic
        public final AdvisoryPortfolioBreakdownStore newInstance(AdvisoryService advisoryService, ManagedReturnsBreakdownDao returnsBreakdownDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(returnsBreakdownDao, "returnsBreakdownDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvisoryPortfolioBreakdownStore(advisoryService, returnsBreakdownDao, storeBundle);
        }
    }
}
