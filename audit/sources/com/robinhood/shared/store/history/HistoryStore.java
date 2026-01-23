package com.robinhood.shared.store.history;

import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import androidx.paging.PagedList;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.RxPagedListBuilder;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.paging.InterlacedDataSource;
import com.robinhood.utils.paging.PaginationLoader;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: HistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u00029:B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0081\u0001\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00162\u0014\u0010\u000e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0089\u0001\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001e0\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0089\u0001\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180#2\u0014\u0010\u000e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00020\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%Je\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180+0*2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0002\u0010(\u001a\u00020\u00112\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b,\u0010-Js\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u000b2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b.\u0010/JK\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\b\u0010&\u001a\u0004\u0018\u00010\r2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010(\u001a\u00020\u00112\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b.\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\u001d\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0019030+8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0019030+8F¢\u0006\u0006\u001a\u0004\b7\u00105¨\u0006;"}, m3636d2 = {"Lcom/robinhood/shared/store/history/HistoryStore;", "Lcom/robinhood/store/Store;", "", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "historyLoaders", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljava/util/Set;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/store/StoreBundle;)V", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "stateStream", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "typesStream", "j$/time/Instant", "sinceStream", "beforeStream", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "staticFilter", "Lcom/robinhood/shared/store/history/HistoryStore$DataSourceFactory;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "buildDataSourceFactory", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;)Lcom/robinhood/shared/store/history/HistoryStore$DataSourceFactory;", "", "pageSize", "Landroidx/paging/PagedList;", "stream", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;I)Lio/reactivex/Observable;", "Landroidx/paging/PagingConfig;", "pagingConfig", "Landroidx/paging/Pager;", "buildPager", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;Landroidx/paging/PagingConfig;)Landroidx/paging/Pager;", "state", "types", "since", "before", "Lkotlinx/coroutines/flow/Flow;", "", "streamLatest", "(Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Ljava/util/Set;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;I)Lkotlinx/coroutines/flow/Flow;", "count", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;)Lio/reactivex/Observable;", "(Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Ljava/util/Set;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;)Lio/reactivex/Observable;", "Lcom/robinhood/store/StoreBundle;", "Ljava/util/Set;", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Ljava/util/List;", "historyLoaderCallbacks", "getInstrumentHistoryLoaderCallbacks", "instrumentHistoryLoaderCallbacks", "DataSourceFactory", "EmptyDataSource", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class HistoryStore extends Store {
    private final Set<HistoryLoaderV2> historyLoaders;
    private final StoreBundle storeBundle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryStore(Set<HistoryLoaderV2> historyLoaders, AppType appType, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(historyLoaders, "historyLoaders");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.storeBundle = storeBundle;
        ArrayList arrayList = new ArrayList();
        for (Object obj : historyLoaders) {
            if (((HistoryLoaderV2) obj).getSupportedApps().contains(appType)) {
                arrayList.add(obj);
            }
        }
        this.historyLoaders = CollectionsKt.toSet(arrayList);
    }

    public final List<HistoryLoader.Callbacks<HistoryEvent>> getHistoryLoaderCallbacks() {
        Set<HistoryLoaderV2> set = this.historyLoaders;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((HistoryLoaderV2) it.next()).getCallbacks());
        }
        return CollectionsKt.toList(arrayList);
    }

    public final List<HistoryLoader.Callbacks<HistoryEvent>> getInstrumentHistoryLoaderCallbacks() {
        Set<HistoryLoaderV2> set = this.historyLoaders;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((HistoryLoaderV2) obj).getCallbacks().getIsInstrumentHistoryLoader()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((HistoryLoaderV2) it.next()).getCallbacks());
        }
        return CollectionsKt.toList(arrayList2);
    }

    static /* synthetic */ DataSourceFactory buildDataSourceFactory$default(HistoryStore historyStore, Observable observable, Observable observable2, Observable observable3, Observable observable4, HistoryStaticFilter historyStaticFilter, int i, Object obj) {
        if ((i & 8) != 0) {
            observable4 = Observable.just(Optional2.INSTANCE);
        }
        Observable observable5 = observable4;
        if ((i & 16) != 0) {
            historyStaticFilter = null;
        }
        return historyStore.buildDataSourceFactory(observable, observable2, observable3, observable5, historyStaticFilter);
    }

    private final DataSourceFactory<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> buildDataSourceFactory(Observable<? extends Optional<? extends HistoryEvent.State>> stateStream, Observable<? extends Set<? extends HistoryTransactionType>> typesStream, Observable<? extends Instant> sinceStream, Observable<? extends Optional<Instant>> beforeStream, HistoryStaticFilter staticFilter) {
        List<HistoryLoader.Callbacks<HistoryEvent>> historyLoaderCallbacks;
        HistoryStaticFilter.InstrumentFilter instrumentFilter;
        if (((staticFilter == null || (instrumentFilter = staticFilter.getInstrumentFilter()) == null) ? null : instrumentFilter.getType()) == HistoryStaticFilter.InstrumentFilterType.EQUITY) {
            historyLoaderCallbacks = getInstrumentHistoryLoaderCallbacks();
        } else {
            historyLoaderCallbacks = getHistoryLoaderCallbacks();
        }
        List<HistoryLoader.Callbacks<HistoryEvent>> list = historyLoaderCallbacks;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            HistoryLoader.Callbacks callbacks = (HistoryLoader.Callbacks) it.next();
            Observable<? extends Instant> observableConcatWith = sinceStream.concatWith(Observable.never());
            Intrinsics.checkNotNullExpressionValue(observableConcatWith, "concatWith(...)");
            arrayList.add(new HistoryLoader(stateStream, typesStream, observableConcatWith, beforeStream, staticFilter, callbacks, this.storeBundle.getRxFactory()));
        }
        return new DataSourceFactory<>(arrayList, ComparisonsKt.reverseOrder(), new Function1() { // from class: com.robinhood.shared.store.history.HistoryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryStore.buildDataSourceFactory$lambda$5((StatefulHistoryEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryEvent.SortKey buildDataSourceFactory$lambda$5(StatefulHistoryEvent DataSourceFactory2) {
        Intrinsics.checkNotNullParameter(DataSourceFactory2, "$this$DataSourceFactory");
        return DataSourceFactory2.getHistoryEvent().getSortKey();
    }

    public static /* synthetic */ Observable stream$default(HistoryStore historyStore, Observable observable, Observable observable2, Observable observable3, Observable observable4, HistoryStaticFilter historyStaticFilter, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            observable4 = Observable.just(Optional2.INSTANCE);
        }
        Observable observable5 = observable4;
        if ((i2 & 16) != 0) {
            historyStaticFilter = null;
        }
        HistoryStaticFilter historyStaticFilter2 = historyStaticFilter;
        if ((i2 & 32) != 0) {
            i = 100;
        }
        return historyStore.stream(observable, observable2, observable3, observable5, historyStaticFilter2, i);
    }

    public final Observable<PagedList<StatefulHistoryEvent<HistoryEvent>>> stream(Observable<? extends Optional<? extends HistoryEvent.State>> stateStream, Observable<? extends Set<? extends HistoryTransactionType>> typesStream, Observable<? extends Instant> sinceStream, Observable<? extends Optional<Instant>> beforeStream, HistoryStaticFilter staticFilter, int pageSize) {
        Intrinsics.checkNotNullParameter(stateStream, "stateStream");
        Intrinsics.checkNotNullParameter(typesStream, "typesStream");
        Intrinsics.checkNotNullParameter(sinceStream, "sinceStream");
        Intrinsics.checkNotNullParameter(beforeStream, "beforeStream");
        final DataSourceFactory<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> dataSourceFactoryBuildDataSourceFactory = buildDataSourceFactory(stateStream, typesStream, sinceStream, beforeStream, staticFilter);
        RxPagedListBuilder rxPagedListBuilder = new RxPagedListBuilder(dataSourceFactoryBuildDataSourceFactory, pageSize);
        Scheduler schedulerM3346io = Schedulers.m3346io();
        Intrinsics.checkNotNullExpressionValue(schedulerM3346io, "io(...)");
        Observable<PagedList<StatefulHistoryEvent<HistoryEvent>>> observableTakeUntil = rxPagedListBuilder.setFetchScheduler(schedulerM3346io).buildObservable().doFinally(new Action() { // from class: com.robinhood.shared.store.history.HistoryStore.stream.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                dataSourceFactoryBuildDataSourceFactory.dispose();
            }
        }).takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public static /* synthetic */ Pager buildPager$default(HistoryStore historyStore, Observable observable, Observable observable2, Observable observable3, Observable observable4, HistoryStaticFilter historyStaticFilter, PagingConfig pagingConfig, int i, Object obj) {
        if ((i & 4) != 0) {
            observable3 = Observable.just(Instant.EPOCH);
        }
        Observable observable5 = observable3;
        if ((i & 8) != 0) {
            observable4 = Observable.just(Optional2.INSTANCE);
        }
        Observable observable6 = observable4;
        if ((i & 16) != 0) {
            historyStaticFilter = null;
        }
        return historyStore.buildPager(observable, observable2, observable5, observable6, historyStaticFilter, pagingConfig);
    }

    public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> buildPager(Observable<? extends Optional<? extends HistoryEvent.State>> stateStream, Observable<? extends Set<? extends HistoryTransactionType>> typesStream, Observable<? extends Instant> sinceStream, Observable<? extends Optional<Instant>> beforeStream, HistoryStaticFilter staticFilter, PagingConfig pagingConfig) {
        Intrinsics.checkNotNullParameter(stateStream, "stateStream");
        Intrinsics.checkNotNullParameter(typesStream, "typesStream");
        Intrinsics.checkNotNullParameter(sinceStream, "sinceStream");
        Intrinsics.checkNotNullParameter(beforeStream, "beforeStream");
        Intrinsics.checkNotNullParameter(pagingConfig, "pagingConfig");
        return new Pager<>(pagingConfig, null, DataSource.Factory.asPagingSourceFactory$default(buildDataSourceFactory(stateStream, typesStream, sinceStream, beforeStream, staticFilter), null, 1, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow streamLatest$default(HistoryStore historyStore, HistoryEvent.State state, Set set, Instant instant, Instant instant2, HistoryStaticFilter historyStaticFilter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            state = null;
        }
        if ((i2 & 2) != 0) {
            set = SetsKt.emptySet();
        }
        if ((i2 & 4) != 0) {
            instant = Instant.EPOCH;
        }
        if ((i2 & 8) != 0) {
            instant2 = null;
        }
        if ((i2 & 16) != 0) {
            historyStaticFilter = null;
        }
        return historyStore.streamLatest(state, set, instant, instant2, historyStaticFilter, i);
    }

    public final Flow<List<StatefulHistoryEvent<HistoryEvent>>> streamLatest(final HistoryEvent.State state, final Set<? extends HistoryTransactionType> types, final Instant since, final Instant before, final HistoryStaticFilter staticFilter, final int pageSize) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(since, "since");
        List<HistoryLoader.Callbacks<HistoryEvent>> historyLoaderCallbacks = getHistoryLoaderCallbacks();
        ArrayList arrayList = new ArrayList();
        for (Object obj : historyLoaderCallbacks) {
            HistoryLoader.Callbacks callbacks = (HistoryLoader.Callbacks) obj;
            if (types.isEmpty() || !CollectionsKt.intersect(callbacks.getSupportedTransactionTypes(), types).isEmpty()) {
                arrayList.add(obj);
            }
        }
        Observable observableFlatMap = Observable.fromIterable(arrayList).flatMap(new Function() { // from class: com.robinhood.shared.store.history.HistoryStore.streamLatest.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<StatefulHistoryEvent<HistoryEvent>>> apply(HistoryLoader.Callbacks<? extends HistoryEvent> callbacks2) {
                Intrinsics.checkNotNullParameter(callbacks2, "callbacks");
                Observable observableJust = Observable.just(Optional3.asOptional(state));
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                Observable observableJust2 = Observable.just(types);
                Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
                Observable observableJust3 = Observable.just(since);
                Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
                Observable observableJust4 = Observable.just(Optional3.asOptional(before));
                Intrinsics.checkNotNullExpressionValue(observableJust4, "just(...)");
                return new HistoryLoader(observableJust, observableJust2, observableJust3, observableJust4, staticFilter, callbacks2, this.storeBundle.getRxFactory()).loadFirst(pageSize);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return FlowKt.distinctUntilChanged(FlowKt.scan(Context7.buffer$default(RxConvert.asFlow(observableFlatMap), Integer.MAX_VALUE, null, 2, null), CollectionsKt.emptyList(), new C399503(pageSize, null)));
    }

    /* compiled from: HistoryStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012&\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "acc", "items", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.history.HistoryStore$streamLatest$3", m3645f = "HistoryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.history.HistoryStore$streamLatest$3 */
    static final class C399503 extends ContinuationImpl7 implements Function3<List<? extends StatefulHistoryEvent<? extends HistoryEvent>>, List<? extends StatefulHistoryEvent<? extends HistoryEvent>>, Continuation<? super List<? extends StatefulHistoryEvent<? extends HistoryEvent>>>, Object> {
        final /* synthetic */ int $pageSize;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399503(int i, Continuation<? super C399503> continuation) {
            super(3, continuation);
            this.$pageSize = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list, List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list2, Continuation<? super List<? extends StatefulHistoryEvent<? extends HistoryEvent>>> continuation) {
            C399503 c399503 = new C399503(this.$pageSize, continuation);
            c399503.L$0 = list;
            c399503.L$1 = list2;
            return c399503.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            List list2 = (List) this.L$1;
            Intrinsics.checkNotNull(list2);
            return CollectionsKt.take(CollectionsKt.sortedWith(CollectionsKt.toSet(CollectionsKt.plus((Collection) list, (Iterable) list2)), new Comparator() { // from class: com.robinhood.shared.store.history.HistoryStore$streamLatest$3$invokeSuspend$$inlined$compareByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((StatefulHistoryEvent) t2).getHistoryEvent().getSortKey(), ((StatefulHistoryEvent) t).getHistoryEvent().getSortKey());
                }
            }), this.$pageSize);
        }
    }

    public static /* synthetic */ Observable count$default(HistoryStore historyStore, Observable observable, Observable observable2, Observable observable3, Observable observable4, HistoryStaticFilter historyStaticFilter, int i, Object obj) {
        if ((i & 8) != 0) {
            observable4 = Observable.just(Optional2.INSTANCE);
        }
        Observable observable5 = observable4;
        if ((i & 16) != 0) {
            historyStaticFilter = null;
        }
        return historyStore.count((Observable<? extends Optional<? extends HistoryEvent.State>>) observable, (Observable<? extends Set<? extends HistoryTransactionType>>) observable2, (Observable<? extends Instant>) observable3, (Observable<? extends Optional<Instant>>) observable5, historyStaticFilter);
    }

    public final Observable<Integer> count(Observable<? extends Optional<? extends HistoryEvent.State>> stateStream, Observable<? extends Set<? extends HistoryTransactionType>> typesStream, Observable<? extends Instant> sinceStream, Observable<? extends Optional<Instant>> beforeStream, HistoryStaticFilter staticFilter) {
        Intrinsics.checkNotNullParameter(stateStream, "stateStream");
        Intrinsics.checkNotNullParameter(typesStream, "typesStream");
        Intrinsics.checkNotNullParameter(sinceStream, "sinceStream");
        Intrinsics.checkNotNullParameter(beforeStream, "beforeStream");
        List<HistoryLoader.Callbacks<HistoryEvent>> historyLoaderCallbacks = getHistoryLoaderCallbacks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(historyLoaderCallbacks, 10));
        Iterator<T> it = historyLoaderCallbacks.iterator();
        while (it.hasNext()) {
            arrayList.add(new HistoryLoader(stateStream, typesStream, sinceStream, beforeStream, staticFilter, (HistoryLoader.Callbacks) it.next(), this.storeBundle.getRxFactory()).countTotal());
        }
        Observable observableCombineLatest = Observable.combineLatest(arrayList, new Function() { // from class: com.robinhood.shared.store.history.HistoryStore$count$$inlined$combineLatest$1
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] values) {
                Intrinsics.checkNotNullParameter(values, "values");
                List listAsList = ArraysKt.asList(values);
                Intrinsics.checkNotNull(listAsList, "null cannot be cast to non-null type kotlin.collections.List<T of com.robinhood.utils.extensions.ObservablesKt.combineLatest>");
                return (R) Integer.valueOf(CollectionsKt.sumOfInt(listAsList));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        Observable<Integer> observableDistinctUntilChanged = observableCombineLatest.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public static /* synthetic */ Observable count$default(HistoryStore historyStore, HistoryEvent.State state, Set set, Instant instant, Instant instant2, HistoryStaticFilter historyStaticFilter, int i, Object obj) {
        if ((i & 8) != 0) {
            instant2 = null;
        }
        if ((i & 16) != 0) {
            historyStaticFilter = null;
        }
        return historyStore.count(state, (Set<? extends HistoryTransactionType>) set, instant, instant2, historyStaticFilter);
    }

    public final Observable<Integer> count(HistoryEvent.State state, Set<? extends HistoryTransactionType> types, Instant since, Instant before, HistoryStaticFilter staticFilter) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(since, "since");
        Observable<? extends Optional<? extends HistoryEvent.State>> observableJust = Observable.just(Optional3.asOptional(state));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable<? extends Set<? extends HistoryTransactionType>> observableJust2 = Observable.just(types);
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        Observable<? extends Instant> observableJust3 = Observable.just(since);
        Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
        Observable<? extends Optional<Instant>> observableJust4 = Observable.just(Optional3.asOptional(before));
        Intrinsics.checkNotNullExpressionValue(observableJust4, "just(...)");
        return count(observableJust, observableJust2, observableJust3, observableJust4, staticFilter);
    }

    /* compiled from: HistoryStore.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004BR\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\n\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0019R\u001f\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\b\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/store/history/HistoryStore$DataSourceFactory;", "KeyT", "", "ValueT", "Landroidx/paging/DataSource$Factory;", "loaders", "", "Lcom/robinhood/utils/paging/PaginationLoader;", "keyComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "keySelector", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "<init>", "(Ljava/util/List;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)V", "factory", "Lcom/robinhood/utils/paging/InterlacedDataSource$Factory;", "lastDataSource", "Landroidx/paging/DataSource;", "disposed", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Landroidx/paging/ItemKeyedDataSource;", "dispose", "", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class DataSourceFactory<KeyT, ValueT> extends DataSource.Factory<KeyT, ValueT> {
        private boolean disposed;
        private final InterlacedDataSource.Factory<KeyT, ValueT> factory;
        private final Function1<ValueT, KeyT> keySelector;
        private DataSource<KeyT, ValueT> lastDataSource;

        /* JADX WARN: Multi-variable type inference failed */
        public DataSourceFactory(List<? extends PaginationLoader<? super KeyT, ? extends ValueT>> loaders, Comparator<KeyT> keyComparator, Function1<? super ValueT, ? extends KeyT> keySelector) {
            Intrinsics.checkNotNullParameter(loaders, "loaders");
            Intrinsics.checkNotNullParameter(keyComparator, "keyComparator");
            Intrinsics.checkNotNullParameter(keySelector, "keySelector");
            this.keySelector = keySelector;
            this.factory = new InterlacedDataSource.Factory<>(loaders, keyComparator, keySelector);
        }

        @Override // androidx.paging.DataSource.Factory
        public ItemKeyedDataSource<KeyT, ValueT> create() {
            if (this.disposed) {
                return new EmptyDataSource(this.keySelector);
            }
            InterlacedDataSource<KeyT, ValueT> interlacedDataSourceCreate = this.factory.create();
            this.lastDataSource = interlacedDataSourceCreate;
            return interlacedDataSourceCreate;
        }

        public final void dispose() {
            this.disposed = true;
            DataSource<KeyT, ValueT> dataSource = this.lastDataSource;
            if (dataSource != null) {
                dataSource.invalidate();
            }
        }
    }

    /* compiled from: HistoryStore.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B \u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ$\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J$\u0010\u0013\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J$\u0010\u0014\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0016R\u001f\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/store/history/HistoryStore$EmptyDataSource;", "KeyT", "", "ValueT", "Landroidx/paging/ItemKeyedDataSource;", "keySelector", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getKey", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Ljava/lang/Object;)Ljava/lang/Object;", "loadAfter", "", "params", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class EmptyDataSource<KeyT, ValueT> extends ItemKeyedDataSource<KeyT, ValueT> {
        private final Function1<ValueT, KeyT> keySelector;

        @Override // androidx.paging.ItemKeyedDataSource
        public void loadAfter(ItemKeyedDataSource.LoadParams<KeyT> params, ItemKeyedDataSource.LoadCallback<ValueT> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        @Override // androidx.paging.ItemKeyedDataSource
        public void loadBefore(ItemKeyedDataSource.LoadParams<KeyT> params, ItemKeyedDataSource.LoadCallback<ValueT> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        @Override // androidx.paging.ItemKeyedDataSource
        public void loadInitial(ItemKeyedDataSource.LoadInitialParams<KeyT> params, ItemKeyedDataSource.LoadInitialCallback<ValueT> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EmptyDataSource(Function1<? super ValueT, ? extends KeyT> keySelector) {
            Intrinsics.checkNotNullParameter(keySelector, "keySelector");
            this.keySelector = keySelector;
        }

        @Override // androidx.paging.ItemKeyedDataSource
        public KeyT getKey(ValueT item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return this.keySelector.invoke(item);
        }
    }
}
