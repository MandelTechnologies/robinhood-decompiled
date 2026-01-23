package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.event.p186db.dao.EventToContractMapDao;
import com.robinhood.android.models.event.p186db.dao.StrikeContractDao;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrikeContractStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/store/event/StrikeContractStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/event/StrikeContractStore;", "layoutService", "Ljavax/inject/Provider;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "strikeContractDao", "Lcom/robinhood/android/models/event/db/dao/StrikeContractDao;", "eventToContractMapDao", "Lcom/robinhood/android/models/event/db/dao/EventToContractMapDao;", "requestHeaderPlugin", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class StrikeContractStore_Factory implements Factory<StrikeContractStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EventToContractMapDao> eventToContractMapDao;
    private final Provider<LayoutService> layoutService;
    private final Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<StrikeContractDao> strikeContractDao;

    @JvmStatic
    public static final StrikeContractStore_Factory create(Provider<LayoutService> provider, Provider<StrikeContractDao> provider2, Provider<EventToContractMapDao> provider3, Provider<PredictionMarketsRequestHeaderDelegate2> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final StrikeContractStore newInstance(LayoutService layoutService, StrikeContractDao strikeContractDao, EventToContractMapDao eventToContractMapDao, PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2, StoreBundle storeBundle) {
        return INSTANCE.newInstance(layoutService, strikeContractDao, eventToContractMapDao, predictionMarketsRequestHeaderDelegate2, storeBundle);
    }

    public StrikeContractStore_Factory(Provider<LayoutService> layoutService, Provider<StrikeContractDao> strikeContractDao, Provider<EventToContractMapDao> eventToContractMapDao, Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(layoutService, "layoutService");
        Intrinsics.checkNotNullParameter(strikeContractDao, "strikeContractDao");
        Intrinsics.checkNotNullParameter(eventToContractMapDao, "eventToContractMapDao");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.layoutService = layoutService;
        this.strikeContractDao = strikeContractDao;
        this.eventToContractMapDao = eventToContractMapDao;
        this.requestHeaderPlugin = requestHeaderPlugin;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public StrikeContractStore get() {
        Companion companion = INSTANCE;
        LayoutService layoutService = this.layoutService.get();
        Intrinsics.checkNotNullExpressionValue(layoutService, "get(...)");
        StrikeContractDao strikeContractDao = this.strikeContractDao.get();
        Intrinsics.checkNotNullExpressionValue(strikeContractDao, "get(...)");
        EventToContractMapDao eventToContractMapDao = this.eventToContractMapDao.get();
        Intrinsics.checkNotNullExpressionValue(eventToContractMapDao, "get(...)");
        PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.requestHeaderPlugin.get();
        Intrinsics.checkNotNullExpressionValue(predictionMarketsRequestHeaderDelegate2, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(layoutService, strikeContractDao, eventToContractMapDao, predictionMarketsRequestHeaderDelegate2, storeBundle);
    }

    /* compiled from: StrikeContractStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/event/StrikeContractStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/event/StrikeContractStore_Factory;", "layoutService", "Ljavax/inject/Provider;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "strikeContractDao", "Lcom/robinhood/android/models/event/db/dao/StrikeContractDao;", "eventToContractMapDao", "Lcom/robinhood/android/models/event/db/dao/EventToContractMapDao;", "requestHeaderPlugin", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/event/StrikeContractStore;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StrikeContractStore_Factory create(Provider<LayoutService> layoutService, Provider<StrikeContractDao> strikeContractDao, Provider<EventToContractMapDao> eventToContractMapDao, Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(layoutService, "layoutService");
            Intrinsics.checkNotNullParameter(strikeContractDao, "strikeContractDao");
            Intrinsics.checkNotNullParameter(eventToContractMapDao, "eventToContractMapDao");
            Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new StrikeContractStore_Factory(layoutService, strikeContractDao, eventToContractMapDao, requestHeaderPlugin, storeBundle);
        }

        @JvmStatic
        public final StrikeContractStore newInstance(LayoutService layoutService, StrikeContractDao strikeContractDao, EventToContractMapDao eventToContractMapDao, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(layoutService, "layoutService");
            Intrinsics.checkNotNullParameter(strikeContractDao, "strikeContractDao");
            Intrinsics.checkNotNullParameter(eventToContractMapDao, "eventToContractMapDao");
            Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new StrikeContractStore(layoutService, strikeContractDao, eventToContractMapDao, requestHeaderPlugin, storeBundle);
        }
    }
}
