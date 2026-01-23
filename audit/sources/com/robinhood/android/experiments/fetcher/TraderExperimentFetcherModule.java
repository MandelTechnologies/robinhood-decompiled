package com.robinhood.android.experiments.fetcher;

import com.robinhood.librobinhood.data.fetcher.ExperimentFetcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderExperimentFetcherModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/experiments/fetcher/TraderExperimentFetcherModule;", "", "<init>", "()V", "provideExperimentFetcher", "Lcom/robinhood/librobinhood/data/fetcher/ExperimentFetcher;", "traderExperimentFetcher", "Lcom/robinhood/android/experiments/fetcher/TraderExperimentFetcher;", "lib-experiment-fetcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TraderExperimentFetcherModule {
    public static final TraderExperimentFetcherModule INSTANCE = new TraderExperimentFetcherModule();

    public final ExperimentFetcher provideExperimentFetcher(TraderExperimentFetcher traderExperimentFetcher) {
        Intrinsics.checkNotNullParameter(traderExperimentFetcher, "traderExperimentFetcher");
        return traderExperimentFetcher;
    }

    private TraderExperimentFetcherModule() {
    }
}
