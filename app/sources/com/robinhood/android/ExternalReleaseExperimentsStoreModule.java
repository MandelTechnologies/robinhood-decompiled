package com.robinhood.android;

import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.android.experiments.fetcher.TraderExperimentFetcher;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.dao.KaizenExperimentDao;
import com.robinhood.store.StoreBundle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalReleaseExperimentsStoreModule.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u001b\u0010\u0010\u001a\u0017\u0012\u0004\u0012\u00020\u0012\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0013¢\u0006\u0002\b\u00140\u0011H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/ExternalReleaseExperimentsStoreModule;", "", "<init>", "()V", "provideExperimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "experimentFetcher", "Lcom/robinhood/android/experiments/fetcher/TraderExperimentFetcher;", "kaizenDao", "Lcom/robinhood/models/dao/KaizenExperimentDao;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentExposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "supportedExperimentsByName", "", "", "Lcom/robinhood/experiments/ExperimentDeclaration;", "Lkotlin/jvm/JvmSuppressWildcards;", "lib-experiments-store-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class ExternalReleaseExperimentsStoreModule {
    public static final ExternalReleaseExperimentsStoreModule INSTANCE = new ExternalReleaseExperimentsStoreModule();

    private ExternalReleaseExperimentsStoreModule() {
    }

    public final ExperimentsStore provideExperimentsStore(StoreBundle storeBundle, TraderExperimentFetcher experimentFetcher, KaizenExperimentDao kaizenDao, EventLogger eventLogger, ExperimentExposureLogger experimentExposureLogger, Map<String, ExperimentDeclaration<?>> supportedExperimentsByName) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(experimentFetcher, "experimentFetcher");
        Intrinsics.checkNotNullParameter(kaizenDao, "kaizenDao");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
        Intrinsics.checkNotNullParameter(supportedExperimentsByName, "supportedExperimentsByName");
        return new ExperimentsStore(storeBundle, experimentFetcher, kaizenDao, eventLogger, experimentExposureLogger, supportedExperimentsByName);
    }
}
