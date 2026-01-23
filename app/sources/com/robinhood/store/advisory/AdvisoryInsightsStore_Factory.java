package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.advisory.api.AdvisoryApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.advisory.dao.AdvisorInsightsDao;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AdvisoryInsightsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryInsightsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/advisory/AdvisoryInsightsStore;", "Ljavax/inject/Provider;", "Ladvisory/proto/v1/AdvisoryService;", "advisoryService", "Lcom/robinhood/models/advisory/dao/AdvisorInsightsDao;", "advisorInsightsDao", "Lcom/robinhood/android/advisory/api/AdvisoryApi;", "advisoryApi", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/store/advisory/AdvisoryInsightsStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AdvisoryInsightsStore_Factory implements Factory<AdvisoryInsightsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvisorInsightsDao> advisorInsightsDao;
    private final Provider<AdvisoryApi> advisoryApi;
    private final Provider<AdvisoryService> advisoryService;
    private final Provider<Clock> clock;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final AdvisoryInsightsStore_Factory create(Provider<AdvisoryService> provider, Provider<AdvisorInsightsDao> provider2, Provider<AdvisoryApi> provider3, Provider<Clock> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final AdvisoryInsightsStore newInstance(AdvisoryService advisoryService, AdvisorInsightsDao advisorInsightsDao, AdvisoryApi advisoryApi, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(advisoryService, advisorInsightsDao, advisoryApi, clock, storeBundle);
    }

    public AdvisoryInsightsStore_Factory(Provider<AdvisoryService> advisoryService, Provider<AdvisorInsightsDao> advisorInsightsDao, Provider<AdvisoryApi> advisoryApi, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(advisorInsightsDao, "advisorInsightsDao");
        Intrinsics.checkNotNullParameter(advisoryApi, "advisoryApi");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.advisorInsightsDao = advisorInsightsDao;
        this.advisoryApi = advisoryApi;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public AdvisoryInsightsStore get() {
        Companion companion = INSTANCE;
        AdvisoryService advisoryService = this.advisoryService.get();
        Intrinsics.checkNotNullExpressionValue(advisoryService, "get(...)");
        AdvisorInsightsDao advisorInsightsDao = this.advisorInsightsDao.get();
        Intrinsics.checkNotNullExpressionValue(advisorInsightsDao, "get(...)");
        AdvisoryApi advisoryApi = this.advisoryApi.get();
        Intrinsics.checkNotNullExpressionValue(advisoryApi, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(advisoryService, advisorInsightsDao, advisoryApi, clock, storeBundle);
    }

    /* compiled from: AdvisoryInsightsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryInsightsStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Ladvisory/proto/v1/AdvisoryService;", "advisoryService", "Lcom/robinhood/models/advisory/dao/AdvisorInsightsDao;", "advisorInsightsDao", "Lcom/robinhood/android/advisory/api/AdvisoryApi;", "advisoryApi", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/store/advisory/AdvisoryInsightsStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/store/advisory/AdvisoryInsightsStore_Factory;", "Lcom/robinhood/store/advisory/AdvisoryInsightsStore;", "newInstance", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/models/advisory/dao/AdvisorInsightsDao;Lcom/robinhood/android/advisory/api/AdvisoryApi;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/store/advisory/AdvisoryInsightsStore;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisoryInsightsStore_Factory create(Provider<AdvisoryService> advisoryService, Provider<AdvisorInsightsDao> advisorInsightsDao, Provider<AdvisoryApi> advisoryApi, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(advisorInsightsDao, "advisorInsightsDao");
            Intrinsics.checkNotNullParameter(advisoryApi, "advisoryApi");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvisoryInsightsStore_Factory(advisoryService, advisorInsightsDao, advisoryApi, clock, storeBundle);
        }

        @JvmStatic
        public final AdvisoryInsightsStore newInstance(AdvisoryService advisoryService, AdvisorInsightsDao advisorInsightsDao, AdvisoryApi advisoryApi, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(advisorInsightsDao, "advisorInsightsDao");
            Intrinsics.checkNotNullParameter(advisoryApi, "advisoryApi");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvisoryInsightsStore(advisoryService, advisorInsightsDao, advisoryApi, clock, storeBundle);
        }
    }
}
