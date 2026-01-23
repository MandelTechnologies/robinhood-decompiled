package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoHistorical;
import com.robinhood.models.crypto.p314db.CryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.dao.CryptoHistoricalDao;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.p408rx.Poll;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.robinhood.utils.p408rx.WallClockPoll;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import timber.log.Timber;

/* compiled from: CryptoHistoricalStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J2\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001b0\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CryptoHistoricalDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CryptoHistoricalDao;)V", "streamCryptoHistorical", "Lio/reactivex/Observable;", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "currencyPairId", "Ljava/util/UUID;", "graphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "refresh", "", "force", "", "poll", "currencyPairIds", "", "fetchHistoricals", "Lcom/robinhood/models/api/ApiCryptoHistorical;", "fetchHistoricalsMulti", "Lcom/robinhood/models/PaginatedResult;", "getSaveAction", "Lkotlin/Function1;", "getPaginatedSaveAction", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoHistoricalStore extends Store {
    private final Brokeback brokeback;
    private final CryptoHistoricalDao dao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHistoricalStore(Brokeback brokeback, StoreBundle storeBundle, CryptoHistoricalDao dao) {
        super(storeBundle, CryptoHistorical.INSTANCE);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.brokeback = brokeback;
        this.dao = dao;
    }

    public final Observable<UiCryptoHistorical> streamCryptoHistorical(UUID currencyPairId, GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getCurrencyPairHistorical(CryptoHistorical.INSTANCE.getIdentifier(currencyPairId, graphSelection)))));
    }

    public final void refresh(boolean force, UUID currencyPairId, GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        ScopedSubscriptionKt.subscribeIn(fetchHistoricals(force, currencyPairId, graphSelection), getStoreScope());
    }

    public final Observable<?> poll(UUID currencyPairId, GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        refresh(false, currencyPairId, graphSelection);
        Observable<ApiCryptoHistorical> observableFetchHistoricals = fetchHistoricals(true, currencyPairId, graphSelection);
        if (graphSelection == GraphSelection.HOUR) {
            Observable observableCompose = observableFetchHistoricals.compose(new Poll(15L, TimeUnit.SECONDS, true));
            Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
            return observableCompose;
        }
        Observable observableCompose2 = observableFetchHistoricals.compose(new WallClockPoll(Durations.FIVE_MINUTES, true));
        Intrinsics.checkNotNullExpressionValue(observableCompose2, "compose(...)");
        return observableCompose2;
    }

    public final void refresh(boolean force, List<UUID> currencyPairIds, GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        if (currencyPairIds.isEmpty()) {
            return;
        }
        ScopedSubscriptionKt.subscribeIn(fetchHistoricalsMulti(force, currencyPairIds, graphSelection), getStoreScope());
    }

    public final Observable<?> poll(List<UUID> currencyPairIds, GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        if (currencyPairIds.isEmpty()) {
            Observable<?> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        refresh(false, currencyPairIds, graphSelection);
        Observable<PaginatedResult<ApiCryptoHistorical>> observableFetchHistoricalsMulti = fetchHistoricalsMulti(true, currencyPairIds, graphSelection);
        if (graphSelection == GraphSelection.HOUR) {
            Observable observableCompose = observableFetchHistoricalsMulti.compose(new Poll(15L, TimeUnit.SECONDS, true));
            Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
            return observableCompose;
        }
        Observable observableCompose2 = observableFetchHistoricalsMulti.compose(new WallClockPoll(Durations.FIVE_MINUTES, true));
        Intrinsics.checkNotNullExpressionValue(observableCompose2, "compose(...)");
        return observableCompose2;
    }

    private final Observable<ApiCryptoHistorical> fetchHistoricals(boolean force, UUID currencyPairId, GraphSelection graphSelection) {
        Observable<ApiCryptoHistorical> observable = refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C337041(currencyPairId, graphSelection.getIntervalForServer(), graphSelection.getSpan(), null), 1, null)).saveAction(getSaveAction(graphSelection)).key(CryptoHistorical.INSTANCE.getIdentifier(currencyPairId, graphSelection)).force(force).toMaybe(getNetworkWrapper()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* compiled from: CryptoHistoricalStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoHistorical;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHistoricalStore$fetchHistoricals$1", m3645f = "CryptoHistoricalStore.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoHistoricalStore$fetchHistoricals$1 */
    static final class C337041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCryptoHistorical>, Object> {
        final /* synthetic */ UUID $currencyPairId;
        final /* synthetic */ Historical.Interval $interval;
        final /* synthetic */ Historical.Span $span;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337041(UUID uuid, Historical.Interval interval, Historical.Span span, Continuation<? super C337041> continuation) {
            super(2, continuation);
            this.$currencyPairId = uuid;
            this.$interval = interval;
            this.$span = span;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHistoricalStore.this.new C337041(this.$currencyPairId, this.$interval, this.$span, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCryptoHistorical> continuation) {
            return ((C337041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Brokeback brokeback = CryptoHistoricalStore.this.brokeback;
            UUID uuid = this.$currencyPairId;
            Historical.Interval interval = this.$interval;
            String serverValue = interval != null ? interval.getServerValue() : null;
            String serverValue2 = this.$span.getServerValue();
            this.label = 1;
            Object objFetchCryptoHistoricals = brokeback.fetchCryptoHistoricals(uuid, serverValue, serverValue2, this);
            return objFetchCryptoHistoricals == coroutine_suspended ? coroutine_suspended : objFetchCryptoHistoricals;
        }
    }

    private final Observable<PaginatedResult<ApiCryptoHistorical>> fetchHistoricalsMulti(boolean force, List<UUID> currencyPairIds, GraphSelection graphSelection) {
        final Historical.Interval intervalForServer = graphSelection.getIntervalForServer();
        final Historical.Span span = graphSelection.getSpan();
        final String strJoinToString$default = CollectionsKt.joinToString$default(currencyPairIds, ",", null, null, 0, null, null, 62, null);
        Observable<PaginatedResult<ApiCryptoHistorical>> observable = refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHistoricalStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHistoricalStore.fetchHistoricalsMulti$lambda$0(this.f$0, strJoinToString$default, intervalForServer, span, (String) obj);
            }
        }).saveAction(getPaginatedSaveAction(graphSelection)).key(CryptoHistorical.INSTANCE.getIdentifier(strJoinToString$default, graphSelection)).force(force).toMaybe(getNetworkWrapper()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single fetchHistoricalsMulti$lambda$0(CryptoHistoricalStore cryptoHistoricalStore, String str, Historical.Interval interval, Historical.Span span, String str2) {
        return RxFactory.DefaultImpls.rxSingle$default(cryptoHistoricalStore, null, new CryptoHistoricalStore2(cryptoHistoricalStore, str, interval, span, str2, null), 1, null);
    }

    private final Function1<PaginatedResult<ApiCryptoHistorical>, Unit> getPaginatedSaveAction(final GraphSelection graphSelection) {
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        return new Function1<PaginatedResult<? extends ApiCryptoHistorical>, Unit>() { // from class: com.robinhood.librobinhood.data.store.CryptoHistoricalStore$getPaginatedSaveAction$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiCryptoHistorical> paginatedResult) {
                m22618invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22618invoke(PaginatedResult<? extends ApiCryptoHistorical> paginatedResult) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        this.dao.insert(paginatedResult, graphSelection);
                        return;
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
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
    }

    private final Function1<ApiCryptoHistorical, Unit> getSaveAction(final GraphSelection graphSelection) {
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        return new Function1<ApiCryptoHistorical, Unit>() { // from class: com.robinhood.librobinhood.data.store.CryptoHistoricalStore$getSaveAction$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiCryptoHistorical apiCryptoHistorical) {
                m22619invoke(apiCryptoHistorical);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22619invoke(ApiCryptoHistorical apiCryptoHistorical) {
                if (logoutKillswitch.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    CryptoHistoricalDao.insert$default(this.dao, apiCryptoHistorical, graphSelection, null, 4, null);
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
