package com.robinhood.librobinhood.data.store;

import androidx.collection.LruCache;
import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.utils.DefaultStaleDecider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionInstrument;
import com.robinhood.models.dao.OptionInstrumentDao;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.Staleable;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.coroutine.Flows3;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import timber.log.Timber;

/* compiled from: OptionInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 X2\u00020\u0001:\u0001XB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$¢\u0006\u0004\b&\u0010'J%\u0010)\u001a\u00020(2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020+2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J+\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0010¢\u0006\u0004\b2\u0010\u0016J#\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u0010¢\u0006\u0004\b3\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u001a\u00108\u001a\u0002078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R#\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020=0<8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020=0B8\u0006¢\u0006\f\n\u0004\b&\u0010D\u001a\u0004\bE\u0010FR#\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020H0G8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR,\u0010O\u001a\u001a\u0012\u0004\u0012\u00020N\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00190M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR#\u0010R\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020=0B8\u0006¢\u0006\f\n\u0004\bR\u0010D\u001a\u0004\bS\u0010FR&\u0010V\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0U\u0012\u0004\u0012\u00020(0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/OptionInstrumentDao;", "dao", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionChainStore", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionInstrumentDao;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/librobinhood/data/store/OptionChainStore;)V", "Ljava/util/UUID;", "chainId", "Lcom/robinhood/models/db/OptionContractType;", "contractType", "j$/time/LocalDate", "expirationDate", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/db/OptionInstrument;", "getTradeableOptionInstruments", "(Ljava/util/UUID;Lcom/robinhood/models/db/OptionContractType;Lj$/time/LocalDate;)Lio/reactivex/Observable;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "expirationDateState", "Lkotlinx/coroutines/flow/Flow;", "getTradeableOptionInstrumentsPaginatedWithCache", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;)Lkotlinx/coroutines/flow/Flow;", "getTradeableOptionInstrumentsPaginated", "(Ljava/util/UUID;Lj$/time/LocalDate;)Lkotlinx/coroutines/flow/Flow;", "", "force", "optionChainId", "Lkotlinx/coroutines/Job;", "refreshChainByExpiration", "(ZLjava/util/UUID;Lj$/time/LocalDate;)Lkotlinx/coroutines/Job;", "", "optionInstrumentIds", "getOptionInstruments", "(Ljava/lang/Iterable;)Lio/reactivex/Observable;", "", "pingOptionInstruments", "(Ljava/lang/Iterable;Z)V", "Lio/reactivex/Completable;", "pingOptionInstrumentsCompletable", "(Ljava/lang/Iterable;Z)Lio/reactivex/Completable;", InquiryField.DateField.TYPE, "pingAllOptionInstrumentsOnDate", "(Lj$/time/LocalDate;)V", "j$/time/Instant", "getSelloutTimeOnExpirationDate", "streamSelloutTimeOnExpirationDate", "Lcom/robinhood/models/dao/OptionInstrumentDao;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "Lcom/robinhood/api/utils/DefaultStaleDecider;", "staleDecider", "Lcom/robinhood/api/utils/DefaultStaleDecider;", "getStaleDecider", "()Lcom/robinhood/api/utils/DefaultStaleDecider;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiOptionInstrument;", "getOptionInstrument", "Lcom/robinhood/android/moria/network/Endpoint;", "getGetOptionInstrument", "()Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/librobinhood/data/store/GetOptionInstrumentsParams;", "Lcom/robinhood/api/PaginatedEndpoint;", "getGetOptionInstruments", "()Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/ui/UiOptionInstrument;", "streamUiOptionInstrument", "Lcom/robinhood/android/moria/db/Query;", "getStreamUiOptionInstrument", "()Lcom/robinhood/android/moria/db/Query;", "Landroidx/collection/LruCache;", "", "instrumentsCache", "Landroidx/collection/LruCache;", "Lcom/robinhood/librobinhood/data/store/GetActiveOptionInstrumentsForChainParams;", "getActiveOptionInstrumentsForChain", "getGetActiveOptionInstrumentsForChain", "Lkotlin/Function1;", "Lcom/robinhood/models/PaginatedResult;", "paginatedSaveAction", "Lkotlin/jvm/functions/Function1;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionInstrumentStore extends Store {
    private static final int BUFFER_SIZE_FOR_INSTRUMENT = 64;
    private static final int PAGE_SIZE = 1000;
    private static final long REFRESH_THROTTLE_MS = 200;
    private final OptionInstrumentDao dao;
    private final PaginatedEndpoint<GetActiveOptionInstrumentsForChainParams, ApiOptionInstrument> getActiveOptionInstrumentsForChain;
    private final Endpoint<UUID, ApiOptionInstrument> getOptionInstrument;
    private final PaginatedEndpoint<GetOptionInstrumentsParams, ApiOptionInstrument> getOptionInstruments;
    private final LruCache<String, Flow<List<OptionInstrument>>> instrumentsCache;
    private final OptionChainStore optionChainStore;
    private final OptionsApi optionsApi;
    private final Function1<PaginatedResult<ApiOptionInstrument>, Unit> paginatedSaveAction;
    private final DefaultStaleDecider staleDecider;
    private final Query<UUID, UiOptionInstrument> streamUiOptionInstrument;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionInstrumentStore(StoreBundle storeBundle, OptionInstrumentDao dao, OptionsApi optionsApi, OptionChainStore optionChainStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.optionChainStore = optionChainStore;
        OptionInstrument.Companion companion = OptionInstrument.INSTANCE;
        this.staleDecider = new DefaultStaleDecider(companion);
        Endpoint<UUID, ApiOptionInstrument> endpointCreateWithParams = Endpoint.INSTANCE.createWithParams(new OptionInstrumentStore$getOptionInstrument$1(this, null), getLogoutKillswitch(), new OptionInstrumentStore$getOptionInstrument$2(this, null), new OptionInstrumentStore$getOptionInstrument$3(this, null), storeBundle.getClock());
        this.getOptionInstrument = endpointCreateWithParams;
        PaginatedEndpoint.Companion companion2 = PaginatedEndpoint.INSTANCE;
        this.getOptionInstruments = companion2.createWithParams(new C340361(null), getLogoutKillswitch(), new C340372(null), storeBundle.getClock(), new com.robinhood.android.moria.network.bouncer.DefaultStaleDecider(companion.getNormalStaleTimeout(), storeBundle.getClock()));
        this.streamUiOptionInstrument = Store.create$default(this, Query.INSTANCE, "streamUiOptionInstrument", CollectionsKt.listOf(new RefreshEach(new OptionInstrumentStore$streamUiOptionInstrument$1(endpointCreateWithParams))), new OptionInstrumentStore$streamUiOptionInstrument$2(dao), false, 8, null);
        this.instrumentsCache = new LruCache<>(3);
        this.getActiveOptionInstrumentsForChain = companion2.createWithParams(new OptionInstrumentStore$getActiveOptionInstrumentsForChain$1(this, null), getLogoutKillswitch(), new OptionInstrumentStore$getActiveOptionInstrumentsForChain$2(this, null), storeBundle.getClock(), new com.robinhood.android.moria.network.bouncer.DefaultStaleDecider(companion.getNormalStaleTimeout(), storeBundle.getClock()));
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.paginatedSaveAction = new Function1<PaginatedResult<? extends ApiOptionInstrument>, Unit>() { // from class: com.robinhood.librobinhood.data.store.OptionInstrumentStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiOptionInstrument> paginatedResult) {
                m22683invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22683invoke(PaginatedResult<? extends ApiOptionInstrument> paginatedResult) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        this.getStaleDecider().updateAll(this.dao.insert((PaginatedResult<ApiOptionInstrument>) paginatedResult));
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.store.Store
    public DefaultStaleDecider getStaleDecider() {
        return this.staleDecider;
    }

    public final Endpoint<UUID, ApiOptionInstrument> getGetOptionInstrument() {
        return this.getOptionInstrument;
    }

    /* compiled from: OptionInstrumentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionInstrument;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/GetOptionInstrumentsParams;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$getOptionInstruments$1", m3645f = "OptionInstrumentStore.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionInstrumentStore$getOptionInstruments$1 */
    static final class C340361 extends ContinuationImpl7 implements Function2<Tuples2<? extends GetOptionInstrumentsParams, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiOptionInstrument>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340361(Continuation<? super C340361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340361 c340361 = OptionInstrumentStore.this.new C340361(continuation);
            c340361.L$0 = obj;
            return c340361;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GetOptionInstrumentsParams, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiOptionInstrument>> continuation) {
            return invoke2((Tuples2<GetOptionInstrumentsParams, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiOptionInstrument>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<GetOptionInstrumentsParams, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiOptionInstrument>> continuation) {
            return ((C340361) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Tuples2 tuples2 = (Tuples2) this.L$0;
            GetOptionInstrumentsParams getOptionInstrumentsParams = (GetOptionInstrumentsParams) tuples2.component1();
            PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
            OptionsApi optionsApi = OptionInstrumentStore.this.optionsApi;
            UUID optionChainId = getOptionInstrumentsParams.getOptionChainId();
            String value = paginationCursor != null ? paginationCursor.getValue() : null;
            Map<String, String> queryParams = getOptionInstrumentsParams.getQueryParams();
            this.label = 1;
            Object optionInstruments = optionsApi.getOptionInstruments(optionChainId, value, queryParams, this);
            return optionInstruments == coroutine_suspended ? coroutine_suspended : optionInstruments;
        }
    }

    public final PaginatedEndpoint<GetOptionInstrumentsParams, ApiOptionInstrument> getGetOptionInstruments() {
        return this.getOptionInstruments;
    }

    /* compiled from: OptionInstrumentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/GetOptionInstrumentsParams;", "Lcom/robinhood/models/PaginationCursor;", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$getOptionInstruments$2", m3645f = "OptionInstrumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionInstrumentStore$getOptionInstruments$2 */
    static final class C340372 extends ContinuationImpl7 implements Function3<Tuples2<? extends GetOptionInstrumentsParams, ? extends PaginationCursor>, PaginatedResult<? extends ApiOptionInstrument>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340372(Continuation<? super C340372> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GetOptionInstrumentsParams, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiOptionInstrument> paginatedResult, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<GetOptionInstrumentsParams, PaginationCursor>) tuples2, (PaginatedResult<ApiOptionInstrument>) paginatedResult, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<GetOptionInstrumentsParams, PaginationCursor> tuples2, PaginatedResult<ApiOptionInstrument> paginatedResult, Continuation<? super Unit> continuation) {
            C340372 c340372 = OptionInstrumentStore.this.new C340372(continuation);
            c340372.L$0 = paginatedResult;
            return c340372.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OptionInstrumentStore.this.getStaleDecider().updateAll(OptionInstrumentStore.this.dao.insert((PaginatedResult<ApiOptionInstrument>) this.L$0));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Query<UUID, UiOptionInstrument> getStreamUiOptionInstrument() {
        return this.streamUiOptionInstrument;
    }

    public final Observable<List<OptionInstrument>> getTradeableOptionInstruments(UUID chainId, OptionContractType contractType, LocalDate expirationDate) {
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return asObservable(takeWhileLoggedIn(OptionInstrumentDao.getTradableOrPositionClosingOnlyOptionInstruments$default(this.dao, chainId, contractType, expirationDate, null, 8, null)));
    }

    public final Flow<List<OptionInstrument>> getTradeableOptionInstrumentsPaginatedWithCache(OptionChainExpirationDateState expirationDateState) {
        Flow<List<OptionInstrument>> flowShareIn;
        Intrinsics.checkNotNullParameter(expirationDateState, "expirationDateState");
        synchronized (this.instrumentsCache) {
            flowShareIn = this.instrumentsCache.get(expirationDateState.getKey());
            if (flowShareIn == null) {
                flowShareIn = FlowKt.shareIn(getTradeableOptionInstrumentsPaginated(expirationDateState.getUiOptionChain().getOptionChain().getId(), expirationDateState.getExpirationDate()), getStoreScope(), SharingStarted.INSTANCE.WhileSubscribed(0L, 1800000L), 1);
                this.instrumentsCache.put(expirationDateState.getKey(), flowShareIn);
            }
        }
        return flowShareIn;
    }

    public final Flow<List<OptionInstrument>> getTradeableOptionInstrumentsPaginated(final UUID chainId, final LocalDate expirationDate) {
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        final Flow flowThrottleLatest = Flows3.throttleLatest(FlowKt.filterNotNull(OptionInstrumentDao.getTradableOrPositionClosingOnlyOptionInstrumentUpdate$default(this.dao, chainId, expirationDate, null, 4, null)), 200L);
        return takeWhileLoggedIn(new Flow<List<OptionInstrument>>() { // from class: com.robinhood.librobinhood.data.store.OptionInstrumentStore$getTradeableOptionInstrumentsPaginated$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<OptionInstrument>> flowCollector, Continuation continuation) {
                Object objCollect = flowThrottleLatest.collect(new AnonymousClass2(flowCollector, this, chainId, expirationDate), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionInstrumentStore$getTradeableOptionInstrumentsPaginated$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ UUID $chainId$inlined;
                final /* synthetic */ LocalDate $expirationDate$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ OptionInstrumentStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$getTradeableOptionInstrumentsPaginated$$inlined$map$1$2", m3645f = "OptionInstrumentStore.kt", m3646l = {55, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionInstrumentStore$getTradeableOptionInstrumentsPaginated$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, OptionInstrumentStore optionInstrumentStore, UUID uuid, LocalDate localDate) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = optionInstrumentStore;
                    this.$chainId$inlined = uuid;
                    this.$expirationDate$inlined = localDate;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
                
                    if (r1.emit(r8, r15) == r3) goto L25;
                 */
                /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007f -> B:22:0x0082). Please report as a decompilation issue!!! */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    AnonymousClass1 anonymousClass12;
                    int size;
                    int i;
                    List arrayList;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = anonymousClass1.label;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = this.$this_unsafeFlow;
                        anonymousClass12 = anonymousClass1;
                        size = 64;
                        i = 0;
                        arrayList = new ArrayList();
                        if (size == 64) {
                        }
                        return coroutine_suspended;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    int i4 = anonymousClass1.I$0;
                    arrayList = (List) anonymousClass1.L$1;
                    FlowCollector flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    anonymousClass12 = anonymousClass1;
                    List list = (List) obj2;
                    arrayList.addAll(list);
                    size = list.size();
                    i = i4 + 64;
                    flowCollector = flowCollector2;
                    if (size == 64) {
                        OptionInstrumentDao optionInstrumentDao = this.this$0.dao;
                        UUID uuid = this.$chainId$inlined;
                        LocalDate localDate = this.$expirationDate$inlined;
                        anonymousClass12.L$0 = flowCollector;
                        anonymousClass12.L$1 = arrayList;
                        anonymousClass12.I$0 = i;
                        anonymousClass12.label = 1;
                        Object objM2702x2b64ad7 = OptionInstrumentDao.m2702x2b64ad7(optionInstrumentDao, 64, i, uuid, localDate, null, anonymousClass12, 16, null);
                        if (objM2702x2b64ad7 != coroutine_suspended) {
                            flowCollector2 = flowCollector;
                            obj2 = objM2702x2b64ad7;
                            i4 = i;
                            List list2 = (List) obj2;
                            arrayList.addAll(list2);
                            size = list2.size();
                            i = i4 + 64;
                            flowCollector = flowCollector2;
                            if (size == 64) {
                                anonymousClass12.L$0 = null;
                                anonymousClass12.L$1 = null;
                                anonymousClass12.label = 2;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
        });
    }

    public final PaginatedEndpoint<GetActiveOptionInstrumentsForChainParams, ApiOptionInstrument> getGetActiveOptionInstrumentsForChain() {
        return this.getActiveOptionInstrumentsForChain;
    }

    public final Job refreshChainByExpiration(boolean force, UUID optionChainId, LocalDate expirationDate) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return this.getActiveOptionInstrumentsForChain.refreshAllPages(new GetActiveOptionInstrumentsForChainParams(optionChainId, null, expirationDate), force);
    }

    /* compiled from: OptionInstrumentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/db/OptionInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$getOptionInstruments$3", m3645f = "OptionInstrumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionInstrumentStore$getOptionInstruments$3 */
    static final class C340383 extends ContinuationImpl7 implements Function2<List<? extends OptionInstrument>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340383(Continuation<? super C340383> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340383 c340383 = OptionInstrumentStore.this.new C340383(continuation);
            c340383.L$0 = obj;
            return c340383;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends OptionInstrument> list, Continuation<? super Unit> continuation) {
            return invoke2((List<OptionInstrument>) list, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<OptionInstrument> list, Continuation<? super Unit> continuation) {
            return ((C340383) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionInstrumentStore.this.getStaleDecider().updateAll((List) this.L$0);
            return Unit.INSTANCE;
        }
    }

    public final Observable<List<OptionInstrument>> getOptionInstruments(Iterable<UUID> optionInstrumentIds) {
        Intrinsics.checkNotNullParameter(optionInstrumentIds, "optionInstrumentIds");
        return asObservable(FlowKt.onEach(this.dao.getOptionInstruments(CollectionsKt.toList(optionInstrumentIds)), new C340383(null)));
    }

    public static /* synthetic */ void pingOptionInstruments$default(OptionInstrumentStore optionInstrumentStore, Iterable iterable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        optionInstrumentStore.pingOptionInstruments(iterable, z);
    }

    public final void pingOptionInstruments(Iterable<UUID> optionInstrumentIds, boolean force) {
        Intrinsics.checkNotNullParameter(optionInstrumentIds, "optionInstrumentIds");
        ScopedSubscriptionKt.subscribeIn(pingOptionInstrumentsCompletable(optionInstrumentIds, force), getStoreScope());
    }

    public static /* synthetic */ Completable pingOptionInstrumentsCompletable$default(OptionInstrumentStore optionInstrumentStore, Iterable iterable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return optionInstrumentStore.pingOptionInstrumentsCompletable(iterable, z);
    }

    public final Completable pingOptionInstrumentsCompletable(final Iterable<UUID> optionInstrumentIds, final boolean force) {
        Intrinsics.checkNotNullParameter(optionInstrumentIds, "optionInstrumentIds");
        Completable completableFlatMapCompletable = asObservable(FlowKt.take(this.dao.getOptionInstruments(CollectionsKt.toList(optionInstrumentIds)), 1)).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionInstrumentStore.pingOptionInstrumentsCompletable.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UUID> apply(List<OptionInstrument> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionInstrumentStore.this.getStaleDecider().updateAll(it);
                List listDistinct = CollectionsKt.distinct(optionInstrumentIds);
                if (!force) {
                    OptionInstrumentStore optionInstrumentStore = OptionInstrumentStore.this;
                    ArrayList arrayList = new ArrayList();
                    for (T t : listDistinct) {
                        DefaultStaleDecider staleDecider = optionInstrumentStore.getStaleDecider();
                        String string2 = ((UUID) t).toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        if (staleDecider.invoke(string2, (Instant) null).booleanValue()) {
                            arrayList.add(t);
                        }
                    }
                    listDistinct = arrayList;
                }
                return Observable.fromIterable(listDistinct);
            }
        }).buffer(64).flatMapMaybe(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionInstrumentStore.pingOptionInstrumentsCompletable.2

            /* compiled from: OptionInstrumentStore.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionInstrument;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$pingOptionInstrumentsCompletable$2$1", m3645f = "OptionInstrumentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.OptionInstrumentStore$pingOptionInstrumentsCompletable$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiOptionInstrument>>, Object> {
                final /* synthetic */ String $commaSeparatedIds;
                int label;
                final /* synthetic */ OptionInstrumentStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionInstrumentStore optionInstrumentStore, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionInstrumentStore;
                    this.$commaSeparatedIds = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$commaSeparatedIds, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiOptionInstrument>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiOptionInstrument>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiOptionInstrument>> continuation) {
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
                    OptionsApi optionsApi = this.this$0.optionsApi;
                    String str = this.$commaSeparatedIds;
                    this.label = 1;
                    Object optionInstruments = optionsApi.getOptionInstruments(str, this);
                    return optionInstruments == coroutine_suspended ? coroutine_suspended : optionInstruments;
                }
            }

            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends PaginatedResult<ApiOptionInstrument>> apply(List<UUID> ids) {
                Intrinsics.checkNotNullParameter(ids, "ids");
                String strJoinToString$default = CollectionsKt.joinToString$default(ids, ",", null, null, 0, null, null, 62, null);
                OptionInstrumentStore optionInstrumentStore = OptionInstrumentStore.this;
                return optionInstrumentStore.refresh(RxFactory.DefaultImpls.rxSingle$default(optionInstrumentStore, null, new AnonymousClass1(optionInstrumentStore, strJoinToString$default, null), 1, null)).saveAction(OptionInstrumentStore.this.paginatedSaveAction).force(true).toMaybe(OptionInstrumentStore.this.getNetworkWrapper());
            }
        }).flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionInstrumentStore.pingOptionInstrumentsCompletable.3
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(PaginatedResult<ApiOptionInstrument> optionInstruments) {
                Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionInstruments, 10));
                Iterator<ApiOptionInstrument> it = optionInstruments.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getChain_id());
                }
                return OptionInstrumentStore.this.optionChainStore.pingOptionChainsCompletable(arrayList, force);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        return Completables.ignoreNetworkExceptions(completableFlatMapCompletable);
    }

    public final void pingAllOptionInstrumentsOnDate(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        FlowKt.launchIn(FlowKt.onEach(FlowKt.take(this.dao.getOptionInstrumentsOnExpirationDate(date), 1), new C340391(null)), getStoreScope());
    }

    /* compiled from: OptionInstrumentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionInstruments", "", "Lcom/robinhood/models/db/OptionInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$pingAllOptionInstrumentsOnDate$1", m3645f = "OptionInstrumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.OptionInstrumentStore$pingAllOptionInstrumentsOnDate$1 */
    static final class C340391 extends ContinuationImpl7 implements Function2<List<? extends OptionInstrument>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340391(Continuation<? super C340391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340391 c340391 = OptionInstrumentStore.this.new C340391(continuation);
            c340391.L$0 = obj;
            return c340391;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends OptionInstrument> list, Continuation<? super Unit> continuation) {
            return invoke2((List<OptionInstrument>) list, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<OptionInstrument> list, Continuation<? super Unit> continuation) {
            return ((C340391) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            OptionInstrumentStore.this.getStaleDecider().updateAll(list);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<? extends Staleable> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((OptionInstrument) it.next()).getId());
            }
            OptionInstrumentStore.this.pingOptionInstruments(arrayList, true);
            return Unit.INSTANCE;
        }
    }

    public final Observable<Instant> getSelloutTimeOnExpirationDate(UUID chainId, OptionContractType contractType, LocalDate date) {
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(date, "date");
        return asObservable(FlowKt.take(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getOptionSelloutTimeOnExpirationDate(chainId, contractType, date))), 1));
    }

    public final Flow<Instant> streamSelloutTimeOnExpirationDate(UUID chainId, LocalDate date) {
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(date, "date");
        this.getActiveOptionInstrumentsForChain.refreshAllPages(new GetActiveOptionInstrumentsForChainParams(chainId, null, date), false);
        return takeWhileLoggedIn(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.dao.getOptionSelloutTimeOnExpirationDate(chainId, date))));
    }
}
