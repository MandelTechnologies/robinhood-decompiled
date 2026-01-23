package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.event.p186db.dao.EcHubNavNodeDao;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: EcHubNavTreeStore_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubNavTreeStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/event/EcHubNavTreeStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "layoutService", "Lcom/robinhood/android/models/event/db/dao/EcHubNavNodeDao;", "ecHubNavNodeDao", "Lcom/robinhood/store/event/EcHubSessionTracker;", "ecHubSessionTracker", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "requestHeaderPlugin", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/store/event/EcHubNavTreeStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EcHubNavTreeStore_Factory implements Factory<EcHubNavTreeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<EcHubNavNodeDao> ecHubNavNodeDao;
    private final Provider<EcHubSessionTracker> ecHubSessionTracker;
    private final Provider<LayoutService> layoutService;
    private final Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EcHubNavTreeStore_Factory create(Provider<LayoutService> provider, Provider<EcHubNavNodeDao> provider2, Provider<EcHubSessionTracker> provider3, Provider<PredictionMarketsRequestHeaderDelegate2> provider4, Provider<Clock> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final EcHubNavTreeStore newInstance(LayoutService layoutService, EcHubNavNodeDao ecHubNavNodeDao, EcHubSessionTracker ecHubSessionTracker, PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(layoutService, ecHubNavNodeDao, ecHubSessionTracker, predictionMarketsRequestHeaderDelegate2, clock, storeBundle);
    }

    public EcHubNavTreeStore_Factory(Provider<LayoutService> layoutService, Provider<EcHubNavNodeDao> ecHubNavNodeDao, Provider<EcHubSessionTracker> ecHubSessionTracker, Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(layoutService, "layoutService");
        Intrinsics.checkNotNullParameter(ecHubNavNodeDao, "ecHubNavNodeDao");
        Intrinsics.checkNotNullParameter(ecHubSessionTracker, "ecHubSessionTracker");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.layoutService = layoutService;
        this.ecHubNavNodeDao = ecHubNavNodeDao;
        this.ecHubSessionTracker = ecHubSessionTracker;
        this.requestHeaderPlugin = requestHeaderPlugin;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EcHubNavTreeStore get() {
        Companion companion = INSTANCE;
        LayoutService layoutService = this.layoutService.get();
        Intrinsics.checkNotNullExpressionValue(layoutService, "get(...)");
        EcHubNavNodeDao ecHubNavNodeDao = this.ecHubNavNodeDao.get();
        Intrinsics.checkNotNullExpressionValue(ecHubNavNodeDao, "get(...)");
        EcHubSessionTracker ecHubSessionTracker = this.ecHubSessionTracker.get();
        Intrinsics.checkNotNullExpressionValue(ecHubSessionTracker, "get(...)");
        PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.requestHeaderPlugin.get();
        Intrinsics.checkNotNullExpressionValue(predictionMarketsRequestHeaderDelegate2, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(layoutService, ecHubNavNodeDao, ecHubSessionTracker, predictionMarketsRequestHeaderDelegate2, clock, storeBundle);
    }

    /* compiled from: EcHubNavTreeStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubNavTreeStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "layoutService", "Lcom/robinhood/android/models/event/db/dao/EcHubNavNodeDao;", "ecHubNavNodeDao", "Lcom/robinhood/store/event/EcHubSessionTracker;", "ecHubSessionTracker", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "requestHeaderPlugin", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/store/event/EcHubNavTreeStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/store/event/EcHubNavTreeStore_Factory;", "Lcom/robinhood/store/event/EcHubNavTreeStore;", "newInstance", "(Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;Lcom/robinhood/android/models/event/db/dao/EcHubNavNodeDao;Lcom/robinhood/store/event/EcHubSessionTracker;Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/store/event/EcHubNavTreeStore;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EcHubNavTreeStore_Factory create(Provider<LayoutService> layoutService, Provider<EcHubNavNodeDao> ecHubNavNodeDao, Provider<EcHubSessionTracker> ecHubSessionTracker, Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(layoutService, "layoutService");
            Intrinsics.checkNotNullParameter(ecHubNavNodeDao, "ecHubNavNodeDao");
            Intrinsics.checkNotNullParameter(ecHubSessionTracker, "ecHubSessionTracker");
            Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EcHubNavTreeStore_Factory(layoutService, ecHubNavNodeDao, ecHubSessionTracker, requestHeaderPlugin, clock, storeBundle);
        }

        @JvmStatic
        public final EcHubNavTreeStore newInstance(LayoutService layoutService, EcHubNavNodeDao ecHubNavNodeDao, EcHubSessionTracker ecHubSessionTracker, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(layoutService, "layoutService");
            Intrinsics.checkNotNullParameter(ecHubNavNodeDao, "ecHubNavNodeDao");
            Intrinsics.checkNotNullParameter(ecHubSessionTracker, "ecHubSessionTracker");
            Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EcHubNavTreeStore(layoutService, ecHubNavNodeDao, ecHubSessionTracker, requestHeaderPlugin, clock, storeBundle);
        }
    }
}
