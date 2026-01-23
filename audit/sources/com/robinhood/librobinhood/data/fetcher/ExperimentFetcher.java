package com.robinhood.librobinhood.data.fetcher;

import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.utils.Optional;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ExperimentFetcher.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H¦@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/fetcher/ExperimentFetcher;", "", "fetchKaizenExperiments", "Lcom/robinhood/utils/Optional;", "", "Lcom/robinhood/models/db/KaizenExperiment;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchDeviceIdExperiments", "lib-store-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface ExperimentFetcher {
    Object fetchDeviceIdExperiments(Continuation<? super List<? extends KaizenExperiment>> continuation);

    Object fetchKaizenExperiments(Continuation<? super Optional<? extends List<? extends KaizenExperiment>>> continuation);
}
