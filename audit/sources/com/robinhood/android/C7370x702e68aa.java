package com.robinhood.android;

import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.experiments.fetcher.TraderExperimentFetcher;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.dao.KaizenExperimentDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalReleaseExperimentsStoreModule_ProvideExperimentsStoreFactory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016Bp\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012!\u0010\u000e\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000f¢\u0006\u0002\b\u00120\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000e\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000f¢\u0006\u0002\b\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/ExternalReleaseExperimentsStoreModule_ProvideExperimentsStoreFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "experimentFetcher", "Lcom/robinhood/android/experiments/fetcher/TraderExperimentFetcher;", "kaizenDao", "Lcom/robinhood/models/dao/KaizenExperimentDao;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentExposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "supportedExperimentsByName", "", "", "Lcom/robinhood/experiments/ExperimentDeclaration;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-experiments-store-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ExternalReleaseExperimentsStoreModule_ProvideExperimentsStoreFactory */
/* loaded from: classes24.dex */
public final class C7370x702e68aa implements Factory<ExperimentsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentExposureLogger> experimentExposureLogger;
    private final Provider<TraderExperimentFetcher> experimentFetcher;
    private final Provider<KaizenExperimentDao> kaizenDao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<Map<String, ExperimentDeclaration<?>>> supportedExperimentsByName;

    @JvmStatic
    public static final C7370x702e68aa create(Provider<StoreBundle> provider, Provider<TraderExperimentFetcher> provider2, Provider<KaizenExperimentDao> provider3, Provider<EventLogger> provider4, Provider<ExperimentExposureLogger> provider5, Provider<Map<String, ExperimentDeclaration<?>>> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final ExperimentsStore provideExperimentsStore(StoreBundle storeBundle, TraderExperimentFetcher traderExperimentFetcher, KaizenExperimentDao kaizenExperimentDao, EventLogger eventLogger, ExperimentExposureLogger experimentExposureLogger, Map<String, ExperimentDeclaration<?>> map) {
        return INSTANCE.provideExperimentsStore(storeBundle, traderExperimentFetcher, kaizenExperimentDao, eventLogger, experimentExposureLogger, map);
    }

    public C7370x702e68aa(Provider<StoreBundle> storeBundle, Provider<TraderExperimentFetcher> experimentFetcher, Provider<KaizenExperimentDao> kaizenDao, Provider<EventLogger> eventLogger, Provider<ExperimentExposureLogger> experimentExposureLogger, Provider<Map<String, ExperimentDeclaration<?>>> supportedExperimentsByName) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(experimentFetcher, "experimentFetcher");
        Intrinsics.checkNotNullParameter(kaizenDao, "kaizenDao");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
        Intrinsics.checkNotNullParameter(supportedExperimentsByName, "supportedExperimentsByName");
        this.storeBundle = storeBundle;
        this.experimentFetcher = experimentFetcher;
        this.kaizenDao = kaizenDao;
        this.eventLogger = eventLogger;
        this.experimentExposureLogger = experimentExposureLogger;
        this.supportedExperimentsByName = supportedExperimentsByName;
    }

    @Override // javax.inject.Provider
    public ExperimentsStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        TraderExperimentFetcher traderExperimentFetcher = this.experimentFetcher.get();
        Intrinsics.checkNotNullExpressionValue(traderExperimentFetcher, "get(...)");
        KaizenExperimentDao kaizenExperimentDao = this.kaizenDao.get();
        Intrinsics.checkNotNullExpressionValue(kaizenExperimentDao, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentExposureLogger experimentExposureLogger = this.experimentExposureLogger.get();
        Intrinsics.checkNotNullExpressionValue(experimentExposureLogger, "get(...)");
        Map<String, ExperimentDeclaration<?>> map = this.supportedExperimentsByName.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        return companion.provideExperimentsStore(storeBundle, traderExperimentFetcher, kaizenExperimentDao, eventLogger, experimentExposureLogger, map);
    }

    /* compiled from: ExternalReleaseExperimentsStoreModule_ProvideExperimentsStoreFactory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072!\u0010\u0011\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0012¢\u0006\u0002\b\u00150\u0007H\u0007JM\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u001b\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0012¢\u0006\u0002\b\u0015H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/ExternalReleaseExperimentsStoreModule_ProvideExperimentsStoreFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/ExternalReleaseExperimentsStoreModule_ProvideExperimentsStoreFactory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "experimentFetcher", "Lcom/robinhood/android/experiments/fetcher/TraderExperimentFetcher;", "kaizenDao", "Lcom/robinhood/models/dao/KaizenExperimentDao;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentExposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "supportedExperimentsByName", "", "", "Lcom/robinhood/experiments/ExperimentDeclaration;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideExperimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "lib-experiments-store-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.ExternalReleaseExperimentsStoreModule_ProvideExperimentsStoreFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C7370x702e68aa create(Provider<StoreBundle> storeBundle, Provider<TraderExperimentFetcher> experimentFetcher, Provider<KaizenExperimentDao> kaizenDao, Provider<EventLogger> eventLogger, Provider<ExperimentExposureLogger> experimentExposureLogger, Provider<Map<String, ExperimentDeclaration<?>>> supportedExperimentsByName) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(experimentFetcher, "experimentFetcher");
            Intrinsics.checkNotNullParameter(kaizenDao, "kaizenDao");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
            Intrinsics.checkNotNullParameter(supportedExperimentsByName, "supportedExperimentsByName");
            return new C7370x702e68aa(storeBundle, experimentFetcher, kaizenDao, eventLogger, experimentExposureLogger, supportedExperimentsByName);
        }

        @JvmStatic
        public final ExperimentsStore provideExperimentsStore(StoreBundle storeBundle, TraderExperimentFetcher experimentFetcher, KaizenExperimentDao kaizenDao, EventLogger eventLogger, ExperimentExposureLogger experimentExposureLogger, Map<String, ExperimentDeclaration<?>> supportedExperimentsByName) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(experimentFetcher, "experimentFetcher");
            Intrinsics.checkNotNullParameter(kaizenDao, "kaizenDao");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
            Intrinsics.checkNotNullParameter(supportedExperimentsByName, "supportedExperimentsByName");
            Object objCheckNotNull = Preconditions.checkNotNull(ExternalReleaseExperimentsStoreModule.INSTANCE.provideExperimentsStore(storeBundle, experimentFetcher, kaizenDao, eventLogger, experimentExposureLogger, supportedExperimentsByName), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ExperimentsStore) objCheckNotNull;
        }
    }
}
