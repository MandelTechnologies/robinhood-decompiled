package com.robinhood.shared.store.history;

import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryTransactionStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "Lcom/robinhood/store/Store;", "historyTransactionLoaders", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljava/util/Map;Lcom/robinhood/store/StoreBundle;)V", "fromHistoryEvent", "Lio/reactivex/Observable;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "fromReference", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes6.dex */
public final class HistoryTransactionStore extends Store {
    private final Map<HistoryTransactionType, HistoryTransactionLoader> historyTransactionLoaders;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryTransactionStore(Map<HistoryTransactionType, HistoryTransactionLoader> historyTransactionLoaders, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(historyTransactionLoaders, "historyTransactionLoaders");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.historyTransactionLoaders = historyTransactionLoaders;
    }

    public final Observable<? extends MinervaTransaction> fromHistoryEvent(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        HistoryTransactionType sourceType = historyEvent.getTransactionReference().getSourceType();
        HistoryTransactionLoader historyTransactionLoader = this.historyTransactionLoaders.get(sourceType);
        if (historyTransactionLoader == null) {
            throw new IllegalStateException(("No HistoryTransactionLoader provided for type " + sourceType + ". Provide the loader for this HistoryTransactionType in a Dagger module using IntoMap.").toString());
        }
        return asObservable(historyTransactionLoader.load(historyEvent));
    }

    public final Observable<? extends MinervaTransaction> fromReference(TransactionReference reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        HistoryTransactionType sourceType = reference.getSourceType();
        HistoryTransactionLoader historyTransactionLoader = this.historyTransactionLoaders.get(sourceType);
        if (historyTransactionLoader == null) {
            throw new IllegalStateException(("No HistoryTransactionLoader is provided for type " + sourceType + ". Provide the loader for this HistoryTransactionType in a Dagger module using IntoMap.").toString());
        }
        return asObservable(historyTransactionLoader.load(reference));
    }
}
