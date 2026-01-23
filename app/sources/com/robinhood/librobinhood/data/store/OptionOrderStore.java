package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionCancelOrderRequest;
import com.robinhood.models.api.ApiOptionOrder;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.OptionOrderDao;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.OptionOrderTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.shared.models.history.shared.OrderState2;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.util.LastUpdatedAtManager;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import timber.log.Timber;

/* compiled from: OptionOrderStore.kt */
@Metadata(m3635d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J)\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0015¢\u0006\u0004\b%\u0010#J\u0015\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020(2\u0006\u0010'\u001a\u00020&2\u0006\u0010+\u001a\u00020\u0015¢\u0006\u0004\b,\u0010-J%\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00172\u0006\u0010+\u001a\u00020\u00152\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u0018\u00105\u001a\u0002002\u0006\u00104\u001a\u000203H\u0086@¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\b\u0012\u0004\u0012\u000200072\u0006\u0010+\u001a\u00020\u0015¢\u0006\u0004\b8\u00109J\u001b\u0010;\u001a\b\u0012\u0004\u0012\u00020:072\u0006\u0010+\u001a\u00020\u0015¢\u0006\u0004\b;\u00109J\u001d\u0010=\u001a\u00020<2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b=\u0010>J)\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000?0\u00172\u0006\u0010+\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0B0\u0017¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00102\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00102\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bH\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020(0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020:0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0017\u0010U\u001a\u00020T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00120Y8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020:0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010_¨\u0006`"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/OptionOrderDao;", "dao", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsApi", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionOrderDao;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/ui/UiOptionOrder;", "filterHasInstruments", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Ljava/util/UUID;", "orderIds", "Lio/reactivex/Observable;", "getOptionOrders", "(Ljava/util/List;)Lio/reactivex/Observable;", "", "accountNumber", "getPendingOptionOrders", "(Ljava/lang/String;)Lio/reactivex/Observable;", "orderId", "getOptionOrder", "(Ljava/util/UUID;)Lio/reactivex/Observable;", "optionInstrumentId", "streamOptionOrdersByOptionInstrument", "(Ljava/lang/String;Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "aggregateOptionPositionId", "streamOptionOrdersByAggregatePosition", "", "force", "", "refreshAll", "(Z)V", "id", "refresh", "(ZLjava/util/UUID;)V", "j$/time/Duration", "interval", "Lcom/robinhood/models/db/OptionOrder;", "pollWhileNonFinal", "(Ljava/util/UUID;Lj$/time/Duration;)Lio/reactivex/Observable;", "Lcom/robinhood/models/api/ApiOptionOrderRequest;", Card.Icon.ORDER, "submitOrder", "(Lcom/robinhood/models/api/ApiOptionOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/Single;", "fetchOrder", "(Ljava/util/UUID;)Lio/reactivex/Single;", "Lcom/robinhood/models/api/ApiOptionOrder;", "fetchApiOrder", "Lio/reactivex/Completable;", "cancelOptionOrder", "(Ljava/util/UUID;Ljava/lang/String;)Lio/reactivex/Completable;", "Lcom/robinhood/utils/Optional;", "cancelOptionOrderAndPoll", "(Ljava/util/UUID;Ljava/lang/String;)Lio/reactivex/Observable;", "Lcom/robinhood/models/PaginatedResult;", "pollOptionOrders", "()Lio/reactivex/Observable;", "streamLastPendingOrSuccessfulOrder", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "getFilledOptionOrderCountForAccount", "Lcom/robinhood/models/dao/OptionOrderDao;", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "Lkotlin/Function1;", "saveAction", "Lkotlin/jvm/functions/Function1;", "Lcom/robinhood/android/moria/network/Endpoint;", "getOptionOrderEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/api/PaginatedEndpoint;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionOrderStore extends Store {
    private final AccountProvider accountProvider;
    private final OptionOrderDao dao;
    private final Endpoint<UUID, ApiOptionOrder> getOptionOrderEndpoint;
    private final PaginatedEndpoint<Unit, ApiOptionOrder> getOptionOrders;
    private final HistoryLoader.Callbacks<UiOptionOrder> historyLoaderCallbacks;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionsApi optionsApi;
    private final Function1<ApiOptionOrder, Unit> saveAction;
    private final HistoryTransactionLoader transactionLoader;

    /* compiled from: OptionOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore", m3645f = "OptionOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m3647m = "submitOrder")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$submitOrder$1 */
    static final class C340711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C340711(Continuation<? super C340711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionOrderStore.this.submitOrder(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderStore(StoreBundle storeBundle, final OptionOrderDao dao, OptionsApi optionsApi, AccountProvider accountProvider, OptionInstrumentStore optionInstrumentStore, OptionPositionStore optionPositionStore) {
        super(storeBundle, OptionOrder.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.accountProvider = accountProvider;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionPositionStore = optionPositionStore;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiOptionOrder, Unit>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiOptionOrder apiOptionOrder) {
                m22685invoke(apiOptionOrder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22685invoke(ApiOptionOrder apiOptionOrder) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(apiOptionOrder);
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
        this.getOptionOrderEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new OptionOrderStore2(this, null), getLogoutKillswitch(), new OptionOrderStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.OPTION_ORDER);
                this.this$0.refreshAll(false);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.getOptionOrder(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null);
                return new Flow<OptionOrderTransaction>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C340592<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "OptionOrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C340592.this.emit(null, this);
                            }
                        }

                        public C340592(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                OptionOrderTransaction optionOrderTransaction = new OptionOrderTransaction((UiOptionOrder) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionOrderTransaction, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionOrderTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C340592(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiOptionOrder>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore$historyLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.OPTION_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
                this.isInstrumentHistoryLoader = true;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader, reason: from getter */
            public boolean getIsInstrumentHistoryLoader() {
                return this.isInstrumentHistoryLoader;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refreshAll(false);
                final Flow<Integer> flowCountTotal = this.this$0.dao.countTotal(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2", m3645f = "OptionOrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Integer num = (Integer) obj;
                                Integer numBoxInt = boxing.boxInt(num != null ? num.intValue() : 0);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = flowCountTotal.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                final Flow<Integer> flowCountLater = this.this$0.dao.countLater(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = flowCountLater.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2", m3645f = "OptionOrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Integer num = (Integer) obj;
                                Integer numBoxInt = boxing.boxInt(num != null ? num.intValue() : 0);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiOptionOrder>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refreshAll(false);
                return this.this$0.dao.getLatest(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiOptionOrder>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiOptionOrder>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiOptionOrder>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }
        };
        this.getOptionOrders = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new C340651(null), getLogoutKillswitch(), new C340662(null), storeBundle.getClock(), null, 16, null);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<UiOptionOrder> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    private final Flow<List<UiOptionOrder>> filterHasInstruments(final Flow<? extends List<UiOptionOrder>> flow) {
        return new Flow<List<? extends UiOptionOrder>>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore$filterHasInstruments$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UiOptionOrder>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C340552(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$filterHasInstruments$$inlined$map$1$2 */
            public static final class C340552<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$filterHasInstruments$$inlined$map$1$2", m3645f = "OptionOrderStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$filterHasInstruments$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C340552.this.emit(null, this);
                    }
                }

                public C340552(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            if (((UiOptionOrder) t).getLegsHaveInstruments()) {
                                arrayList.add(t);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final Observable<List<UiOptionOrder>> getOptionOrders(List<UUID> orderIds) {
        Intrinsics.checkNotNullParameter(orderIds, "orderIds");
        return asObservable(takeWhileLoggedIn(filterHasInstruments(this.dao.getOrders(orderIds))));
    }

    public final Observable<List<UiOptionOrder>> getPendingOptionOrders(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return asObservable(takeWhileLoggedIn(filterHasInstruments(this.dao.getPendingOrders(accountNumber))));
    }

    public final Observable<UiOptionOrder> getOptionOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        final Flow flowFilterNotNull = FlowKt.filterNotNull(this.dao.getOrder(orderId));
        return asObservable(takeWhileLoggedIn(new Flow<UiOptionOrder>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrder$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UiOptionOrder> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new C340562(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrder$$inlined$filter$1$2 */
            public static final class C340562<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrder$$inlined$filter$1$2", m3645f = "OptionOrderStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrder$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return C340562.this.emit(null, this);
                    }
                }

                public C340562(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((UiOptionOrder) obj).getLegsHaveInstruments()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }));
    }

    public final Flow<List<UiOptionOrder>> streamOptionOrdersByOptionInstrument(String accountNumber, UUID optionInstrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        return takeWhileLoggedIn(filterHasInstruments(this.dao.getOrdersByOptionInstrument(accountNumber, optionInstrumentId)));
    }

    public final Flow<List<UiOptionOrder>> streamOptionOrdersByAggregatePosition(String accountNumber, UUID aggregateOptionPositionId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionId, "aggregateOptionPositionId");
        return takeWhileLoggedIn(filterHasInstruments(this.dao.getOrdersByAggregatePosition(accountNumber, aggregateOptionPositionId)));
    }

    /* compiled from: OptionOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionOrder;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrders$1", m3645f = "OptionOrderStore.kt", m3646l = {224}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrders$1 */
    static final class C340651 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiOptionOrder>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340651(Continuation<? super C340651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340651 c340651 = OptionOrderStore.this.new C340651(continuation);
            c340651.L$0 = obj;
            return c340651;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiOptionOrder>> continuation) {
            return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiOptionOrder>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiOptionOrder>> continuation) {
            return ((C340651) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PaginationCursor paginationCursor = (PaginationCursor) ((Tuples2) this.L$0).component2();
            LocalDate lastUpdatedAtDate = OptionOrderStore.this.getLastUpdatedAtManager().getLastUpdatedAtDate(OptionOrder.class);
            OptionsApi optionsApi = OptionOrderStore.this.optionsApi;
            String value = paginationCursor != null ? paginationCursor.getValue() : null;
            this.label = 1;
            Object optionsOrders = optionsApi.getOptionsOrders(null, lastUpdatedAtDate, value, this);
            return optionsOrders == coroutine_suspended ? coroutine_suspended : optionsOrders;
        }
    }

    /* compiled from: OptionOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrders$2", m3645f = "OptionOrderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrders$2 */
    static final class C340662 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiOptionOrder>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C340662(Continuation<? super C340662> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C340662 c340662 = OptionOrderStore.this.new C340662(continuation);
            c340662.L$0 = obj;
            return c340662;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PaginatedResult<ApiOptionOrder> paginatedResult, Continuation<? super Unit> continuation) {
            return ((C340662) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiOptionOrder> paginatedResult, Continuation<? super Unit> continuation) {
            return invoke2((PaginatedResult<ApiOptionOrder>) paginatedResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PaginatedResult<ApiOptionOrder> paginatedResult = (PaginatedResult) this.L$0;
                OptionOrderStore.this.dao.insert(paginatedResult);
                if (paginatedResult.getNext() == null) {
                    LastUpdatedAtManager.saveLastUpdatedAt$default(OptionOrderStore.this.getLastUpdatedAtManager(), OptionOrder.class, 0L, 2, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void refreshAll(final boolean force) {
        Flow<PaginatedResult<ApiOptionOrder>> flowFetchAllPages;
        if (force) {
            flowFetchAllPages = this.getOptionOrders.forceFetchAllPages(Unit.INSTANCE);
        } else {
            flowFetchAllPages = this.getOptionOrders.fetchAllPages(Unit.INSTANCE);
        }
        Completable completableFlatMapCompletable = asObservable(flowFetchAllPages).flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.refreshAll.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(PaginatedResult<ApiOptionOrder> orders) {
                Intrinsics.checkNotNullParameter(orders, "orders");
                List<ApiOptionOrder> results = orders.getResults();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = results.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, CollectionsKt.asSequence(((ApiOptionOrder) it.next()).getLegs()));
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ApiOptionOrder.Leg) it2.next()).getOptionId());
                }
                return OptionOrderStore.this.optionInstrumentStore.pingOptionInstrumentsCompletable(arrayList2, force);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableFlatMapCompletable), getStoreScope());
    }

    public final void refresh(boolean force, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Endpoint.DefaultImpls.refresh$default(this.getOptionOrderEndpoint, id, force, null, 4, null);
    }

    public static /* synthetic */ Observable pollWhileNonFinal$default(OptionOrderStore optionOrderStore, UUID uuid, Duration duration, int i, Object obj) {
        if ((i & 2) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return optionOrderStore.pollWhileNonFinal(uuid, duration);
    }

    public final Observable<OptionOrder> pollWhileNonFinal(UUID id, Duration interval) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Observable<OptionOrder> observableTakeUntil = asObservable(Endpoint.DefaultImpls.poll$default(this.getOptionOrderEndpoint, id, interval, null, 4, null)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.pollWhileNonFinal.1
            @Override // io.reactivex.functions.Function
            public final OptionOrder apply(ApiOptionOrder p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return p0.toDbModel();
            }
        }).takeUntil((Predicate) new Predicate() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.pollWhileNonFinal.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getState().isFinal();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitOrder(ApiOptionOrderRequest apiOptionOrderRequest, Continuation<? super OptionOrder> continuation) {
        C340711 c340711;
        ApiOptionOrder apiOptionOrder;
        if (continuation instanceof C340711) {
            c340711 = (C340711) continuation;
            int i = c340711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c340711.label = i - Integer.MIN_VALUE;
            } else {
                c340711 = new C340711(continuation);
            }
        }
        Object objSubmitOptionOrder = c340711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c340711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitOptionOrder);
            UUID order_to_replace_id = apiOptionOrderRequest.getOrder_to_replace_id();
            if (order_to_replace_id != null && apiOptionOrderRequest.getQuantity_to_replace() != null) {
                OptionsApi optionsApi = this.optionsApi;
                c340711.label = 1;
                objSubmitOptionOrder = optionsApi.replaceOptionOrder(order_to_replace_id, apiOptionOrderRequest, c340711);
            } else if (order_to_replace_id == null && apiOptionOrderRequest.getQuantity_to_replace() == null) {
                OptionsApi optionsApi2 = this.optionsApi;
                c340711.label = 2;
                objSubmitOptionOrder = optionsApi2.submitOptionOrder(apiOptionOrderRequest, c340711);
            } else {
                throw new IllegalStateException(("order_to_replace_id and quantity_to_replace should be null or non-null simultaneously: " + apiOptionOrderRequest).toString());
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(objSubmitOptionOrder);
            apiOptionOrder = (ApiOptionOrder) objSubmitOptionOrder;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitOptionOrder);
            apiOptionOrder = (ApiOptionOrder) objSubmitOptionOrder;
        }
        this.saveAction.invoke(apiOptionOrder);
        return apiOptionOrder.toDbModel();
    }

    /* compiled from: OptionOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/OptionOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$fetchOrder$1", m3645f = "OptionOrderStore.kt", m3646l = {288}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$fetchOrder$1 */
    static final class C340641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OptionOrder>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340641(UUID uuid, Continuation<? super C340641> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderStore.this.new C340641(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OptionOrder> continuation) {
            return ((C340641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = OptionOrderStore.this.getOptionOrderEndpoint;
                UUID uuid = this.$id;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((ApiOptionOrder) obj).toDbModel();
        }
    }

    public final Single<OptionOrder> fetchOrder(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C340641(id, null), 1, null);
    }

    /* compiled from: OptionOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$fetchApiOrder$1", m3645f = "OptionOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$fetchApiOrder$1 */
    static final class C340631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOptionOrder>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340631(UUID uuid, Continuation<? super C340631> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderStore.this.new C340631(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOptionOrder> continuation) {
            return ((C340631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = OptionOrderStore.this.getOptionOrderEndpoint;
            UUID uuid = this.$id;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiOptionOrder> fetchApiOrder(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C340631(id, null), 1, null);
    }

    /* compiled from: OptionOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$cancelOptionOrder$1", m3645f = "OptionOrderStore.kt", m3646l = {302}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$cancelOptionOrder$1 */
    static final class C340601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340601(UUID uuid, String str, Continuation<? super C340601> continuation) {
            super(2, continuation);
            this.$id = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderStore.this.new C340601(this.$id, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C340601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionsApi optionsApi = OptionOrderStore.this.optionsApi;
                UUID uuid = this.$id;
                ApiOptionCancelOrderRequest apiOptionCancelOrderRequest = new ApiOptionCancelOrderRequest(this.$accountNumber);
                this.label = 1;
                if (optionsApi.cancelOptionOrder(uuid, apiOptionCancelOrderRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionOrderStore.this.accountProvider.refresh(true);
            OptionPositionStore.refreshWithAllAccounts$default(OptionOrderStore.this.optionPositionStore, true, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public final Completable cancelOptionOrder(UUID id, String accountNumber) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C340601(id, accountNumber, null), 1, null);
    }

    /* compiled from: OptionOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$cancelOptionOrderAndPoll$1", m3645f = "OptionOrderStore.kt", m3646l = {316}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$cancelOptionOrderAndPoll$1 */
    static final class C340611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340611(UUID uuid, String str, Continuation<? super C340611> continuation) {
            super(2, continuation);
            this.$id = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderStore.this.new C340611(this.$id, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C340611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionsApi optionsApi = OptionOrderStore.this.optionsApi;
                UUID uuid = this.$id;
                ApiOptionCancelOrderRequest apiOptionCancelOrderRequest = new ApiOptionCancelOrderRequest(this.$accountNumber);
                this.label = 1;
                if (optionsApi.cancelOptionOrder(uuid, apiOptionCancelOrderRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Observable<Optional<OptionOrder>> cancelOptionOrderAndPoll(final UUID id, String accountNumber) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable<Optional<OptionOrder>> observableSubscribeOn = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C340611(id, accountNumber, null), 1, null).andThen(Observable.defer(new Callable() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.cancelOptionOrderAndPoll.2
            @Override // java.util.concurrent.Callable
            public final ObservableSource<? extends Optional<OptionOrder>> call() {
                OptionOrderStore optionOrderStore = OptionOrderStore.this;
                Endpoint endpoint = optionOrderStore.getOptionOrderEndpoint;
                UUID uuid = id;
                Duration durationOfSeconds = Duration.ofSeconds(1L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                Observable observableDefaultIfEmpty = optionOrderStore.asObservable(Endpoint.DefaultImpls.poll$default(endpoint, uuid, durationOfSeconds, null, 4, null)).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.cancelOptionOrderAndPoll.2.1
                    @Override // io.reactivex.functions.Function
                    public final OptionOrder apply(ApiOptionOrder p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return p0.toDbModel();
                    }
                }).takeUntil((Predicate) new Predicate() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.cancelOptionOrderAndPoll.2.2
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(OptionOrder it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.getState() == OrderState.CANCELED;
                    }
                }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.cancelOptionOrderAndPoll.2.3
                    @Override // io.reactivex.functions.Function
                    public final Optional<OptionOrder> apply(OptionOrder it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional.INSTANCE.m2972of(it);
                    }
                }).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.cancelOptionOrderAndPoll.2.4
                    @Override // io.reactivex.functions.Function
                    public final Optional<OptionOrder> apply(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional2.INSTANCE;
                    }
                }).take(5L, TimeUnit.SECONDS).takeLast(1).defaultIfEmpty(Optional2.INSTANCE);
                final OptionOrderStore optionOrderStore2 = OptionOrderStore.this;
                return observableDefaultIfEmpty.doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.cancelOptionOrderAndPoll.2.5
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Optional<OptionOrder> optional) {
                        optionOrderStore2.accountProvider.refresh(true);
                        OptionPositionStore.refreshWithAllAccounts$default(optionOrderStore2.optionPositionStore, true, null, 2, null);
                    }
                });
            }
        })).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    public final Observable<PaginatedResult<ApiOptionOrder>> pollOptionOrders() {
        Observable observableDoOnNext = asObservable(PaginatedEndpoint.DefaultImpls.pollAllPages$default(this.getOptionOrders, Unit.INSTANCE, null, 2, null)).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStore.pollOptionOrders.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(PaginatedResult<ApiOptionOrder> paginatedResult) {
                List<ApiOptionOrder> results = paginatedResult.getResults();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = results.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, CollectionsKt.asSequence(((ApiOptionOrder) it.next()).getLegs()));
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator<T> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ApiOptionOrder.Leg) it2.next()).getOptionId());
                }
                ScopedSubscriptionKt.subscribeIn(OptionOrderStore.this.optionInstrumentStore.pingOptionInstrumentsCompletable(arrayList2, false), OptionOrderStore.this.getStoreScope());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return ObservablesKt.ignoreNetworkExceptions(observableDoOnNext);
    }

    public final Flow<UiOptionOrder> streamLastPendingOrSuccessfulOrder(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        OptionOrderDao optionOrderDao = this.dao;
        EnumEntries<OrderState> entries = OrderState.getEntries();
        ArrayList arrayList = new ArrayList();
        for (OrderState orderState : entries) {
            if (!Intrinsics.areEqual(orderState.isSuccessful(), Boolean.FALSE)) {
                arrayList.add(orderState);
            }
        }
        return optionOrderDao.getLastOrder(accountNumber, CollectionsKt.toSet(arrayList));
    }

    public final Flow<Integer> getFilledOptionOrderCountForAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.filterNotNull(this.dao.getFilledOrderCountByAccountNumber(accountNumber));
    }
}
