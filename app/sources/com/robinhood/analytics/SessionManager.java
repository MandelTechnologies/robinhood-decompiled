package com.robinhood.analytics;

import com.robinhood.utils.Optional;
import com.robinhood.utils.RhProcessLifecycleOwner2;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SessionManager.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/analytics/SessionManager;", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "sessionIdObservable", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Ljava/util/UUID;", "getSessionIdObservable", "()Lio/reactivex/Observable;", "sessionId", "Lkotlinx/coroutines/flow/StateFlow;", "getSessionId", "()Lkotlinx/coroutines/flow/StateFlow;", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface SessionManager extends RhProcessLifecycleOwner2 {
    StateFlow<UUID> getSessionId();

    Observable<Optional<UUID>> getSessionIdObservable();
}
