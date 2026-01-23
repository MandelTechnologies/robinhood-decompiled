package com.robinhood.shared.history;

import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Sets2;
import com.robinhood.utils.paging.PaginationLoader;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.rxkotlin.Observables;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: HistoryLoader.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003:\u0002>?By\u0012\u0014\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0014\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0006\u0012\u0014\u0010\u000f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0001\u0010\u0019*\u00020\u00182\u0006\u0010\u001a\u001a\u00028\u00012\u001c\b\u0004\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00060\u001bH\u0082\b¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00062\u001a\b\u0004\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00060\u001bH\u0082\b¢\u0006\u0004\b!\u0010\"JJ\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050#0\u00062&\b\u0004\u0010\u001d\u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050#0\u00060\u001bH\u0082\b¢\u0006\u0004\b$\u0010\"J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u0006H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\u00062\u0006\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)J)\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050#0\u00062\u0006\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010,J1\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050#0\u00062\u0006\u0010'\u001a\u00020\u00042\u0006\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J)\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050#0\u00062\u0006\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010)J1\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050#0\u00062\u0006\u0010'\u001a\u00020\u00042\u0006\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b0\u0010.J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\"\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\"\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u001c\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\"\u0010\u000f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00105R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R8\u0010:\u001a&\u0012\f\u0012\n 9*\u0004\u0018\u00010\u000b0\u000b 9*\u0012\u0012\f\u0012\n 9*\u0004\u0018\u00010\u000b0\u000b\u0018\u000108088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00104R\"\u0010=\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010 0 0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00104¨\u0006@"}, m3636d2 = {"Lcom/robinhood/shared/history/HistoryLoader;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "ValueT", "Lcom/robinhood/utils/paging/PaginationLoader;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "stateStream", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "typesStream", "j$/time/Instant", "sinceStream", "beforeStream", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "staticFilter", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "callbacks", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "<init>", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;Lcom/robinhood/shared/history/HistoryLoader$Callbacks;Lcom/robinhood/coroutines/rx/RxFactory;)V", "", "R", "defaultValue", "Lkotlin/Function1;", "Lcom/robinhood/shared/history/HistoryLoader$Filter;", "mapper", "loadOrDefault", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "", "loadCount", "(Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "", "loadList", "countTotal", "()Lio/reactivex/Observable;", "key", "countBefore", "(Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;)Lio/reactivex/Observable;", "limit", "loadFirst", "(I)Lio/reactivex/Observable;", "loadBefore", "(Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;I)Lio/reactivex/Observable;", "loadBoundary", "loadAfter", "", "toString", "()Ljava/lang/String;", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/coroutines/rx/RxFactory;", "Ljava/util/EnumSet;", "kotlin.jvm.PlatformType", "supportedTransactionTypes", "Ljava/util/EnumSet;", "latestFilterStream", "countTotalStream", "Filter", "Callbacks", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class HistoryLoader<ValueT extends HistoryEvent> implements PaginationLoader<HistoryEvent.SortKey, StatefulHistoryEvent<? extends ValueT>> {
    public static final int $stable = 8;
    private final Observable<? extends Optional<Instant>> beforeStream;
    private final Callbacks<ValueT> callbacks;
    private final Observable<Integer> countTotalStream;
    private final Observable<? extends Filter> latestFilterStream;
    private final RxFactory rxFactory;
    private final Observable<? extends Instant> sinceStream;
    private final Observable<? extends Optional<HistoryEvent.State>> stateStream;
    private final HistoryStaticFilter staticFilter;
    private final EnumSet<HistoryTransactionType> supportedTransactionTypes;
    private final Observable<? extends Set<HistoryTransactionType>> typesStream;

    /* compiled from: HistoryLoader.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0016\u0010\u000fJ;\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010!\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "ValueT", "", "Lcom/robinhood/shared/history/HistoryLoader$Filter;", "filter", "Lkotlinx/coroutines/flow/Flow;", "", "countTotal", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;)Lkotlinx/coroutines/flow/Flow;", "j$/time/Instant", "timestamp", "Ljava/util/UUID;", "id", "countLater", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;Lj$/time/Instant;Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "limit", "", "getLatest", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;I)Lkotlinx/coroutines/flow/Flow;", "getLater", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;Lj$/time/Instant;Ljava/util/UUID;I)Lkotlinx/coroutines/flow/Flow;", "get", "getEarlier", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getSupportedTransactionTypes", "()Ljava/util/Set;", "supportedTransactionTypes", "Lcom/robinhood/models/api/BrokerageAccountType;", "getSupportedBrokerageAccountTypes", "supportedBrokerageAccountTypes", "", "isInstrumentHistoryLoader", "()Z", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks<ValueT extends HistoryEvent> {

        /* compiled from: HistoryLoader.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static <ValueT extends HistoryEvent> boolean isInstrumentHistoryLoader(Callbacks<? extends ValueT> callbacks) {
                return false;
            }
        }

        Flow<Integer> countLater(Filter filter, Instant timestamp, UUID id);

        Flow<Integer> countTotal(Filter filter);

        Flow<List<ValueT>> get(Filter filter, Instant timestamp, UUID id);

        Flow<List<ValueT>> getEarlier(Filter filter, Instant timestamp, UUID id, int limit);

        Flow<List<ValueT>> getLater(Filter filter, Instant timestamp, UUID id, int limit);

        Flow<List<ValueT>> getLatest(Filter filter, int limit);

        Set<BrokerageAccountType> getSupportedBrokerageAccountTypes();

        Set<HistoryTransactionType> getSupportedTransactionTypes();

        /* renamed from: isInstrumentHistoryLoader */
        boolean getIsInstrumentHistoryLoader();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryLoader(Observable<? extends Optional<? extends HistoryEvent.State>> stateStream, Observable<? extends Set<? extends HistoryTransactionType>> typesStream, Observable<? extends Instant> sinceStream, Observable<? extends Optional<Instant>> beforeStream, HistoryStaticFilter historyStaticFilter, Callbacks<? extends ValueT> callbacks, RxFactory rxFactory) {
        HistoryStaticFilter.InstrumentFilter instrumentFilter;
        HistoryStaticFilter.InstrumentFilterType type2;
        Intrinsics.checkNotNullParameter(stateStream, "stateStream");
        Intrinsics.checkNotNullParameter(typesStream, "typesStream");
        Intrinsics.checkNotNullParameter(sinceStream, "sinceStream");
        Intrinsics.checkNotNullParameter(beforeStream, "beforeStream");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.stateStream = stateStream;
        this.typesStream = typesStream;
        this.sinceStream = sinceStream;
        this.beforeStream = beforeStream;
        this.staticFilter = historyStaticFilter;
        this.callbacks = callbacks;
        this.rxFactory = rxFactory;
        final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.allOf(HistoryTransactionType.class);
        supportedTransactionTypes.retainAll(callbacks.getSupportedTransactionTypes());
        Intrinsics.checkNotNull(supportedTransactionTypes);
        if (!supportedTransactionTypes.isEmpty()) {
            if (historyStaticFilter != null && (instrumentFilter = historyStaticFilter.getInstrumentFilter()) != null && (type2 = instrumentFilter.getType()) != null) {
                supportedTransactionTypes.retainAll(type2.supportedTransactionTypes());
            }
            this.supportedTransactionTypes = supportedTransactionTypes;
            Observables observables = Observables.INSTANCE;
            Observable observableDistinctUntilChanged = stateStream.distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            Observable observableDistinctUntilChanged2 = typesStream.distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(supportedTransactionTypes, "supportedTransactionTypes");
            Observable observableDistinctUntilChanged3 = observableDistinctUntilChanged2.map(new Function() { // from class: com.robinhood.shared.history.HistoryLoader$latestFilterStream$1
                @Override // io.reactivex.functions.Function
                public final EnumSet<HistoryTransactionType> apply(Set<? extends HistoryTransactionType> p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return Sets2.intersectedWith(supportedTransactionTypes, p0);
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
            Observable<? extends Instant> observableDistinctUntilChanged4 = sinceStream.distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
            Observable<? extends Optional<Instant>> observableDistinctUntilChanged5 = beforeStream.distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
            Observable observableCombineLatest = Observable.combineLatest(observableDistinctUntilChanged, observableDistinctUntilChanged3, observableDistinctUntilChanged4, observableDistinctUntilChanged5, new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.shared.history.HistoryLoader$special$$inlined$combineLatest$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function4
                public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                    Intrinsics.checkParameterIsNotNull(t1, "t1");
                    Intrinsics.checkParameterIsNotNull(t2, "t2");
                    Intrinsics.checkParameterIsNotNull(t3, "t3");
                    Intrinsics.checkParameterIsNotNull(t4, "t4");
                    EnumSet enumSet = (EnumSet) t2;
                    return (R) new HistoryLoader.Filter((HistoryEvent.State) ((Optional) t1).component1(), enumSet, (Instant) t3, (Instant) ((Optional) t4).component1(), this.this$0.staticFilter);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
            Observable<? extends Filter> observableDistinctUntilChanged6 = observableCombineLatest.replay(1).refCount().distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
            this.latestFilterStream = observableDistinctUntilChanged6;
            Observable<Integer> observableRefCount = observableDistinctUntilChanged6.switchMap(new Function(this) { // from class: com.robinhood.shared.history.HistoryLoader$countTotalStream$1
                final /* synthetic */ HistoryLoader<ValueT> this$0;

                {
                    this.this$0 = this;
                }

                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Integer> apply(HistoryLoader.Filter filter) {
                    Intrinsics.checkNotNullParameter(filter, "filter");
                    if (filter.getTypes().isEmpty()) {
                        Observable observableJust = Observable.just(0);
                        Intrinsics.checkNotNull(observableJust);
                        return observableJust;
                    }
                    Set<BrokerageAccountType> supportedBrokerageAccountTypes = ((HistoryLoader) this.this$0).callbacks.getSupportedBrokerageAccountTypes();
                    HistoryLoader<ValueT> historyLoader = this.this$0;
                    HistoryStaticFilter staticFilter = filter.getStaticFilter();
                    Set<BrokerageAccountType> brokerageAccountTypes = staticFilter != null ? staticFilter.getBrokerageAccountTypes() : null;
                    if (brokerageAccountTypes == null || !CollectionsKt.intersect(brokerageAccountTypes, supportedBrokerageAccountTypes).isEmpty()) {
                        return ((HistoryLoader) historyLoader).rxFactory.convertToObservable(((HistoryLoader) historyLoader).callbacks.countTotal(filter));
                    }
                    Observable observableJust2 = Observable.just(0);
                    Intrinsics.checkNotNull(observableJust2);
                    return observableJust2;
                }
            }).replay(1).refCount();
            Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
            this.countTotalStream = observableRefCount;
            return;
        }
        throw new IllegalArgumentException("HistoryLoader.Callbacks must declare at least one HistoryTransactionType that it supports");
    }

    private final <R> Observable<R> loadOrDefault(R defaultValue, Function1<? super Filter, ? extends Observable<? extends R>> mapper) {
        Observable<R> observableSwitchMap = this.latestFilterStream.switchMap(new C389661(defaultValue, mapper));
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* compiled from: HistoryLoader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.HistoryLoader$loadOrDefault$1 */
    public static final class C389661<T, R> implements Function {
        final /* synthetic */ R $defaultValue;
        final /* synthetic */ Function1<Filter, Observable<? extends R>> $mapper;

        /* JADX WARN: Multi-variable type inference failed */
        public C389661(R r, Function1<? super Filter, ? extends Observable<? extends R>> function1) {
            this.$defaultValue = r;
            this.$mapper = function1;
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends R> apply(Filter filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            if (filter.getTypes().isEmpty()) {
                Observable observableJust = Observable.just(this.$defaultValue);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
            return this.$mapper.invoke(filter);
        }
    }

    private final Observable<Integer> loadCount(Function1<? super Filter, ? extends Observable<Integer>> mapper) {
        Observable observableSwitchMap = this.latestFilterStream.switchMap(new C389661(0, mapper));
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    @Override // com.robinhood.utils.paging.PaginationLoader
    public Observable<Integer> countBefore(final HistoryEvent.SortKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final int i = 0;
        Observable observableSwitchMap = this.latestFilterStream.switchMap(new Function() { // from class: com.robinhood.shared.history.HistoryLoader$countBefore$$inlined$loadCount$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (!filter.getTypes().isEmpty()) {
                    Set<BrokerageAccountType> supportedBrokerageAccountTypes = this.callbacks.getSupportedBrokerageAccountTypes();
                    HistoryStaticFilter staticFilter = filter.getStaticFilter();
                    Set<BrokerageAccountType> brokerageAccountTypes = staticFilter != null ? staticFilter.getBrokerageAccountTypes() : null;
                    if (brokerageAccountTypes == null || !CollectionsKt.intersect(brokerageAccountTypes, supportedBrokerageAccountTypes).isEmpty()) {
                        return this.rxFactory.convertToObservable(this.callbacks.countLater(filter, key.getTimestamp(), key.getId()));
                    }
                    Observable observableJust = Observable.just(0);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                Observable observableJust2 = Observable.just(i);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    private final Observable<List<StatefulHistoryEvent<ValueT>>> loadList(Function1<? super Filter, ? extends Observable<List<StatefulHistoryEvent<ValueT>>>> mapper) {
        Observable<List<StatefulHistoryEvent<ValueT>>> observable = (Observable<List<StatefulHistoryEvent<ValueT>>>) this.latestFilterStream.switchMap(new C389661(CollectionsKt.emptyList(), mapper));
        Intrinsics.checkNotNullExpressionValue(observable, "switchMap(...)");
        return observable;
    }

    @Override // com.robinhood.utils.paging.PaginationLoader
    public Observable<List<StatefulHistoryEvent<ValueT>>> loadAfter(final HistoryEvent.SortKey key, final int limit) {
        Intrinsics.checkNotNullParameter(key, "key");
        final List listEmptyList = CollectionsKt.emptyList();
        Observable<List<StatefulHistoryEvent<ValueT>>> observable = (Observable<List<StatefulHistoryEvent<ValueT>>>) this.latestFilterStream.switchMap(new Function() { // from class: com.robinhood.shared.history.HistoryLoader$loadAfter$$inlined$loadList$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (!filter.getTypes().isEmpty()) {
                    Set<BrokerageAccountType> supportedBrokerageAccountTypes = this.callbacks.getSupportedBrokerageAccountTypes();
                    List listEmptyList2 = CollectionsKt.emptyList();
                    HistoryStaticFilter staticFilter = filter.getStaticFilter();
                    Set<BrokerageAccountType> brokerageAccountTypes = staticFilter != null ? staticFilter.getBrokerageAccountTypes() : null;
                    if (brokerageAccountTypes == null || !CollectionsKt.intersect(brokerageAccountTypes, supportedBrokerageAccountTypes).isEmpty()) {
                        return this.rxFactory.convertToObservable(HistoryLoader9.toStatefulHistoryEvents(this.callbacks.getEarlier(filter, key.getTimestamp(), key.getId(), limit)));
                    }
                    Observable observableJust = Observable.just(listEmptyList2);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                Observable observableJust2 = Observable.just(listEmptyList);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable, "switchMap(...)");
        return observable;
    }

    @Override // com.robinhood.utils.paging.PaginationLoader
    public Observable<List<StatefulHistoryEvent<ValueT>>> loadBefore(final HistoryEvent.SortKey key, final int limit) {
        Intrinsics.checkNotNullParameter(key, "key");
        final List listEmptyList = CollectionsKt.emptyList();
        Observable<List<StatefulHistoryEvent<ValueT>>> observable = (Observable<List<StatefulHistoryEvent<ValueT>>>) this.latestFilterStream.switchMap(new Function() { // from class: com.robinhood.shared.history.HistoryLoader$loadBefore$$inlined$loadList$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (!filter.getTypes().isEmpty()) {
                    Set<BrokerageAccountType> supportedBrokerageAccountTypes = this.callbacks.getSupportedBrokerageAccountTypes();
                    List listEmptyList2 = CollectionsKt.emptyList();
                    HistoryStaticFilter staticFilter = filter.getStaticFilter();
                    Set<BrokerageAccountType> brokerageAccountTypes = staticFilter != null ? staticFilter.getBrokerageAccountTypes() : null;
                    if (brokerageAccountTypes == null || !CollectionsKt.intersect(brokerageAccountTypes, supportedBrokerageAccountTypes).isEmpty()) {
                        return this.rxFactory.convertToObservable(HistoryLoader9.toStatefulHistoryEvents(this.callbacks.getLater(filter, key.getTimestamp(), key.getId(), limit)));
                    }
                    Observable observableJust = Observable.just(listEmptyList2);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                Observable observableJust2 = Observable.just(listEmptyList);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable, "switchMap(...)");
        return observable;
    }

    @Override // com.robinhood.utils.paging.PaginationLoader
    public Observable<List<StatefulHistoryEvent<ValueT>>> loadBoundary(final HistoryEvent.SortKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final List listEmptyList = CollectionsKt.emptyList();
        Observable<List<StatefulHistoryEvent<ValueT>>> observable = (Observable<List<StatefulHistoryEvent<ValueT>>>) this.latestFilterStream.switchMap(new Function() { // from class: com.robinhood.shared.history.HistoryLoader$loadBoundary$$inlined$loadList$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (!filter.getTypes().isEmpty()) {
                    Set<BrokerageAccountType> supportedBrokerageAccountTypes = this.callbacks.getSupportedBrokerageAccountTypes();
                    List listEmptyList2 = CollectionsKt.emptyList();
                    HistoryStaticFilter staticFilter = filter.getStaticFilter();
                    Set<BrokerageAccountType> brokerageAccountTypes = staticFilter != null ? staticFilter.getBrokerageAccountTypes() : null;
                    if (brokerageAccountTypes == null || !CollectionsKt.intersect(brokerageAccountTypes, supportedBrokerageAccountTypes).isEmpty()) {
                        return this.rxFactory.convertToObservable(HistoryLoader9.toStatefulHistoryEvents(this.callbacks.get(filter, key.getTimestamp(), key.getId())));
                    }
                    Observable observableJust = Observable.just(listEmptyList2);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                Observable observableJust2 = Observable.just(listEmptyList);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable, "switchMap(...)");
        return observable;
    }

    @Override // com.robinhood.utils.paging.PaginationLoader
    public Observable<List<StatefulHistoryEvent<ValueT>>> loadFirst(final int limit) {
        final List listEmptyList = CollectionsKt.emptyList();
        Observable<List<StatefulHistoryEvent<ValueT>>> observable = (Observable<List<StatefulHistoryEvent<ValueT>>>) this.latestFilterStream.switchMap(new Function() { // from class: com.robinhood.shared.history.HistoryLoader$loadFirst$$inlined$loadList$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (!filter.getTypes().isEmpty()) {
                    Set<BrokerageAccountType> supportedBrokerageAccountTypes = this.callbacks.getSupportedBrokerageAccountTypes();
                    List listEmptyList2 = CollectionsKt.emptyList();
                    HistoryStaticFilter staticFilter = filter.getStaticFilter();
                    Set<BrokerageAccountType> brokerageAccountTypes = staticFilter != null ? staticFilter.getBrokerageAccountTypes() : null;
                    if (brokerageAccountTypes == null || !CollectionsKt.intersect(brokerageAccountTypes, supportedBrokerageAccountTypes).isEmpty()) {
                        return this.rxFactory.convertToObservable(HistoryLoader9.toStatefulHistoryEvents(this.callbacks.getLatest(filter, limit)));
                    }
                    Observable observableJust = Observable.just(listEmptyList2);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                Observable observableJust2 = Observable.just(listEmptyList);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable, "switchMap(...)");
        return observable;
    }

    @Override // com.robinhood.utils.paging.PaginationLoader
    public Observable<Integer> countTotal() {
        return this.countTotalStream;
    }

    public String toString() {
        return "HistoryLoader(" + this.callbacks.getClass().getName() + ")";
    }

    /* compiled from: HistoryLoader.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0017\u0010\u0013J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JN\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$R\u0017\u00108\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:¨\u0006;"}, m3636d2 = {"Lcom/robinhood/shared/history/HistoryLoader$Filter;", "", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "state", "Ljava/util/EnumSet;", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "types", "j$/time/Instant", "since", "before", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "staticFilter", "<init>", "(Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Ljava/util/EnumSet;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;)V", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "supportedBrokerageAccountTypes", "", "isFilteringByAccountNumber", "(Ljava/util/Set;)Z", "", "getSupportedAccountNumbers", "(Ljava/util/Set;)Ljava/util/Set;", "isFilteringByAccountId", "Ljava/util/UUID;", "getSupportedAccountIds", "getStaticAssetId", "()Ljava/util/UUID;", "component1", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "component2", "()Ljava/util/EnumSet;", "component3", "()Lj$/time/Instant;", "component4", "component5", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "copy", "(Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Ljava/util/EnumSet;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;)Lcom/robinhood/shared/history/HistoryLoader$Filter;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "getState", "Ljava/util/EnumSet;", "getTypes", "Lj$/time/Instant;", "getSince", "getBefore", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "getStaticFilter", "isFilteringByGoldDepositBoost", "Z", "()Z", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Filter {
        public static final int $stable = 8;
        private final Instant before;
        private final boolean isFilteringByGoldDepositBoost;
        private final Instant since;
        private final HistoryEvent.State state;
        private final HistoryStaticFilter staticFilter;
        private final EnumSet<HistoryTransactionType> types;

        public static /* synthetic */ Filter copy$default(Filter filter, HistoryEvent.State state, EnumSet enumSet, Instant instant, Instant instant2, HistoryStaticFilter historyStaticFilter, int i, Object obj) {
            if ((i & 1) != 0) {
                state = filter.state;
            }
            if ((i & 2) != 0) {
                enumSet = filter.types;
            }
            if ((i & 4) != 0) {
                instant = filter.since;
            }
            if ((i & 8) != 0) {
                instant2 = filter.before;
            }
            if ((i & 16) != 0) {
                historyStaticFilter = filter.staticFilter;
            }
            HistoryStaticFilter historyStaticFilter2 = historyStaticFilter;
            Instant instant3 = instant;
            return filter.copy(state, enumSet, instant3, instant2, historyStaticFilter2);
        }

        /* renamed from: component1, reason: from getter */
        public final HistoryEvent.State getState() {
            return this.state;
        }

        public final EnumSet<HistoryTransactionType> component2() {
            return this.types;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getSince() {
            return this.since;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getBefore() {
            return this.before;
        }

        /* renamed from: component5, reason: from getter */
        public final HistoryStaticFilter getStaticFilter() {
            return this.staticFilter;
        }

        public final Filter copy(HistoryEvent.State state, EnumSet<HistoryTransactionType> types, Instant since, Instant before, HistoryStaticFilter staticFilter) {
            Intrinsics.checkNotNullParameter(types, "types");
            Intrinsics.checkNotNullParameter(since, "since");
            return new Filter(state, types, since, before, staticFilter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) other;
            return this.state == filter.state && Intrinsics.areEqual(this.types, filter.types) && Intrinsics.areEqual(this.since, filter.since) && Intrinsics.areEqual(this.before, filter.before) && Intrinsics.areEqual(this.staticFilter, filter.staticFilter);
        }

        public int hashCode() {
            HistoryEvent.State state = this.state;
            int iHashCode = (((((state == null ? 0 : state.hashCode()) * 31) + this.types.hashCode()) * 31) + this.since.hashCode()) * 31;
            Instant instant = this.before;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            HistoryStaticFilter historyStaticFilter = this.staticFilter;
            return iHashCode2 + (historyStaticFilter != null ? historyStaticFilter.hashCode() : 0);
        }

        public String toString() {
            return "Filter(state=" + this.state + ", types=" + this.types + ", since=" + this.since + ", before=" + this.before + ", staticFilter=" + this.staticFilter + ")";
        }

        public Filter(HistoryEvent.State state, EnumSet<HistoryTransactionType> types, Instant since, Instant instant, HistoryStaticFilter historyStaticFilter) {
            Intrinsics.checkNotNullParameter(types, "types");
            Intrinsics.checkNotNullParameter(since, "since");
            this.state = state;
            this.types = types;
            this.since = since;
            this.before = instant;
            this.staticFilter = historyStaticFilter;
            this.isFilteringByGoldDepositBoost = historyStaticFilter != null ? Intrinsics.areEqual(historyStaticFilter.getHasGoldDepositBoost(), Boolean.TRUE) : false;
        }

        public /* synthetic */ Filter(HistoryEvent.State state, EnumSet enumSet, Instant instant, Instant instant2, HistoryStaticFilter historyStaticFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(state, enumSet, instant, instant2, (i & 16) != 0 ? null : historyStaticFilter);
        }

        public final HistoryEvent.State getState() {
            return this.state;
        }

        public final EnumSet<HistoryTransactionType> getTypes() {
            return this.types;
        }

        public final Instant getSince() {
            return this.since;
        }

        public final Instant getBefore() {
            return this.before;
        }

        public final HistoryStaticFilter getStaticFilter() {
            return this.staticFilter;
        }

        public final boolean isFilteringByAccountNumber(Set<? extends BrokerageAccountType> supportedBrokerageAccountTypes) {
            Intrinsics.checkNotNullParameter(supportedBrokerageAccountTypes, "supportedBrokerageAccountTypes");
            HistoryStaticFilter historyStaticFilter = this.staticFilter;
            return (historyStaticFilter != null ? historyStaticFilter.getSupportedAccountNumbers(supportedBrokerageAccountTypes) : null) != null;
        }

        public final Set<String> getSupportedAccountNumbers(Set<? extends BrokerageAccountType> supportedBrokerageAccountTypes) {
            Set<String> supportedAccountNumbers;
            Intrinsics.checkNotNullParameter(supportedBrokerageAccountTypes, "supportedBrokerageAccountTypes");
            HistoryStaticFilter historyStaticFilter = this.staticFilter;
            return (historyStaticFilter == null || (supportedAccountNumbers = historyStaticFilter.getSupportedAccountNumbers(supportedBrokerageAccountTypes)) == null) ? SetsKt.emptySet() : supportedAccountNumbers;
        }

        public final boolean isFilteringByAccountId(Set<? extends BrokerageAccountType> supportedBrokerageAccountTypes) {
            Intrinsics.checkNotNullParameter(supportedBrokerageAccountTypes, "supportedBrokerageAccountTypes");
            HistoryStaticFilter historyStaticFilter = this.staticFilter;
            return (historyStaticFilter != null ? historyStaticFilter.getSupportedAccountIds(supportedBrokerageAccountTypes) : null) != null;
        }

        public final Set<UUID> getSupportedAccountIds(Set<? extends BrokerageAccountType> supportedBrokerageAccountTypes) {
            Set<UUID> supportedAccountIds;
            Intrinsics.checkNotNullParameter(supportedBrokerageAccountTypes, "supportedBrokerageAccountTypes");
            HistoryStaticFilter historyStaticFilter = this.staticFilter;
            return (historyStaticFilter == null || (supportedAccountIds = historyStaticFilter.getSupportedAccountIds(supportedBrokerageAccountTypes)) == null) ? SetsKt.emptySet() : supportedAccountIds;
        }

        public final UUID getStaticAssetId() {
            HistoryStaticFilter.InstrumentFilter instrumentFilter;
            HistoryStaticFilter historyStaticFilter = this.staticFilter;
            if (historyStaticFilter == null || (instrumentFilter = historyStaticFilter.getInstrumentFilter()) == null) {
                return null;
            }
            return instrumentFilter.getId();
        }

        /* renamed from: isFilteringByGoldDepositBoost, reason: from getter */
        public final boolean getIsFilteringByGoldDepositBoost() {
            return this.isFilteringByGoldDepositBoost;
        }
    }
}
