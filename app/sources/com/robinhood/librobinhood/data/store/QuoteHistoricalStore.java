package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.variant.FullExtendedHoursVariant;
import com.robinhood.models.api.ApiQuoteHistorical;
import com.robinhood.models.api.FullExtendedHoursOption;
import com.robinhood.models.dao.QuoteHistoricalDao;
import com.robinhood.models.p320db.QuoteHistorical;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.p355ui.UiQuoteHistorical;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.robinhood.utils.p408rx.WallClockPoll;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: QuoteHistoricalStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a0!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/QuoteHistoricalDao;", "<init>", "(Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/QuoteHistoricalDao;)V", "last", "", "getLast", "()J", "setLast", "(J)V", "getHistoricalQuotes", "Lio/reactivex/Observable;", "Lcom/robinhood/models/ui/UiQuoteHistorical;", "id", "Ljava/util/UUID;", "graphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "refresh", "", "force", "", "poll", "Lcom/robinhood/models/api/ApiQuoteHistorical;", "constructNetworkObservable", "getSaveAction", "Lkotlin/Function1;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class QuoteHistoricalStore extends Store {
    private final EquitiesBrokeback brokeback;
    private final QuoteHistoricalDao dao;
    private final ExperimentsStore experimentsStore;
    private long last;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteHistoricalStore(EquitiesBrokeback brokeback, ExperimentsStore experimentsStore, StoreBundle storeBundle, QuoteHistoricalDao dao) {
        super(storeBundle, QuoteHistorical.INSTANCE);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.brokeback = brokeback;
        this.experimentsStore = experimentsStore;
        this.dao = dao;
        this.last = System.currentTimeMillis();
    }

    public final long getLast() {
        return this.last;
    }

    public final void setLast(long j) {
        this.last = j;
    }

    public final Observable<UiQuoteHistorical> getHistoricalQuotes(UUID id, GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getQuoteHistorical(QuoteHistorical.INSTANCE.getIdentifier(id, graphSelection)))));
    }

    public final void refresh(boolean force, UUID id, GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        ScopedSubscriptionKt.subscribeIn(constructNetworkObservable(force, id, graphSelection), getStoreScope());
    }

    public final Observable<ApiQuoteHistorical> poll(UUID id, GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        refresh(false, id, graphSelection);
        Observable observableCompose = constructNetworkObservable(true, id, graphSelection).compose(new WallClockPoll(Durations.FIVE_MINUTES, true));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    public final Observable<ApiQuoteHistorical> constructNetworkObservable(final boolean force, final UUID id, final GraphSelection graphSelection) {
        Historical.Bounds bounds;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        final Historical.Interval intervalForServer = graphSelection.getIntervalForServer();
        final Historical.Span span = graphSelection.getSpan();
        if (graphSelection == GraphSelection.ALL_DAY) {
            bounds = graphSelection.getBounds();
        } else {
            bounds = graphSelection.isIntraday() ? Historical.Bounds.TRADING : Historical.Bounds.REGULAR;
        }
        final Historical.Bounds bounds2 = bounds;
        Observable<ApiQuoteHistorical> observableFlatMap = ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, Experiment.FULL_EXTENDED_HOURS.INSTANCE, FullExtendedHoursVariant.CONTROL, false, 4, null).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.QuoteHistoricalStore.constructNetworkObservable.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiQuoteHistorical> apply(FullExtendedHoursVariant enabled) {
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                String serverValue = enabled.isMember() ? FullExtendedHoursOption.ENABLED.getServerValue() : null;
                QuoteHistoricalStore quoteHistoricalStore = QuoteHistoricalStore.this;
                return quoteHistoricalStore.refresh(RxFactory.DefaultImpls.rxSingle$default(quoteHistoricalStore, null, new AnonymousClass1(quoteHistoricalStore, serverValue, id, intervalForServer, span, bounds2, null), 1, null)).saveAction(QuoteHistoricalStore.this.getSaveAction(graphSelection)).key(QuoteHistorical.INSTANCE.getIdentifier(id, graphSelection)).force(force).toMaybe(QuoteHistoricalStore.this.getNetworkWrapper()).toObservable();
            }

            /* compiled from: QuoteHistoricalStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiQuoteHistorical;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuoteHistoricalStore$constructNetworkObservable$1$1", m3645f = "QuoteHistoricalStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.QuoteHistoricalStore$constructNetworkObservable$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiQuoteHistorical>, Object> {
                final /* synthetic */ Historical.Bounds $bounds;
                final /* synthetic */ String $headerValue;
                final /* synthetic */ UUID $id;
                final /* synthetic */ Historical.Interval $interval;
                final /* synthetic */ Historical.Span $span;
                int label;
                final /* synthetic */ QuoteHistoricalStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(QuoteHistoricalStore quoteHistoricalStore, String str, UUID uuid, Historical.Interval interval, Historical.Span span, Historical.Bounds bounds, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = quoteHistoricalStore;
                    this.$headerValue = str;
                    this.$id = uuid;
                    this.$interval = interval;
                    this.$span = span;
                    this.$bounds = bounds;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$headerValue, this.$id, this.$interval, this.$span, this.$bounds, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiQuoteHistorical> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    EquitiesBrokeback equitiesBrokeback = this.this$0.brokeback;
                    String str = this.$headerValue;
                    UUID uuid = this.$id;
                    Historical.Interval interval = this.$interval;
                    String serverValue = interval != null ? interval.getServerValue() : null;
                    String serverValue2 = this.$span.getServerValue();
                    String serverValue3 = this.$bounds.getServerValue();
                    this.label = 1;
                    Object historicalQuotes = equitiesBrokeback.getHistoricalQuotes(str, uuid, serverValue, serverValue2, serverValue3, this);
                    return historicalQuotes == coroutine_suspended ? coroutine_suspended : historicalQuotes;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<ApiQuoteHistorical, Unit> getSaveAction(final GraphSelection graphSelection) {
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        return new Function1<ApiQuoteHistorical, Unit>() { // from class: com.robinhood.librobinhood.data.store.QuoteHistoricalStore$getSaveAction$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiQuoteHistorical apiQuoteHistorical) {
                m22715invoke(apiQuoteHistorical);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22715invoke(ApiQuoteHistorical apiQuoteHistorical) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    QuoteHistoricalDao.insert$default(this.dao, apiQuoteHistorical, graphSelection, (Instant) null, 4, (Object) null);
                } catch (IllegalStateException e) {
                    if (logoutKillswitch.isLoggedOut()) {
                        Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                        try {
                            roomDatabase.close();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    throw e;
                }
            }
        };
    }
}
