package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.acats.p299db.LegacyAcatsTransfer;
import com.robinhood.models.acats.p299db.LegacyAcatsTransfer2;
import com.robinhood.models.acats.p299db.LegacyAcatsTransferPosition;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.LegacyApiAcatsTransfer;
import com.robinhood.models.dao.LegacyAcatsTransferDao;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.LegacyAcatsTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.p408rx.Poll;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
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
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: LegacyAcatsTransferStore.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\"0!2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/LegacyAcatsTransferDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/LegacyAcatsTransferDao;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "saveAction", "Lkotlin/Function1;", "", "Lcom/robinhood/models/acats/db/LegacyAcatsTransfer;", "", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getAcatsTransfer", "Lkotlinx/coroutines/flow/Flow;", "id", "Ljava/util/UUID;", "refresh", "force", "", "cancelAcatsTransferAndPoll", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class LegacyAcatsTransferStore extends Store {
    private final Brokeback brokeback;
    private final LegacyAcatsTransferDao dao;
    private final HistoryLoader.Callbacks<LegacyAcatsTransfer> historyLoaderCallbacks;
    private final InstrumentStore instrumentStore;
    private final Function1<Iterable<LegacyAcatsTransfer>, Unit> saveAction;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyAcatsTransferStore(StoreBundle storeBundle, final LegacyAcatsTransferDao dao, Brokeback brokeback, InstrumentStore instrumentStore) {
        super(storeBundle, LegacyAcatsTransfer.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.dao = dao;
        this.brokeback = brokeback;
        this.instrumentStore = instrumentStore;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<Iterable<? extends LegacyAcatsTransfer>, Unit>() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Iterable<? extends LegacyAcatsTransfer> iterable) {
                m22660invoke(iterable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22660invoke(Iterable<? extends LegacyAcatsTransfer> iterable) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert((Iterable) iterable);
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
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.LEGACY_ACATS_TRANSFER);
                this.this$0.refresh(false);
                final Flow<LegacyAcatsTransfer> acatsTransfer = this.this$0.getAcatsTransfer(reference.getSourceId());
                return new Flow<LegacyAcatsTransaction>() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C339182<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "LegacyAcatsTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C339182.this.emit(null, this);
                            }
                        }

                        public C339182(FlowCollector flowCollector) {
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
                                LegacyAcatsTransaction legacyAcatsTransaction = new LegacyAcatsTransaction((LegacyAcatsTransfer) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(legacyAcatsTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super LegacyAcatsTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = acatsTransfer.collect(new C339182(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<LegacyAcatsTransfer>() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.LEGACY_ACATS_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
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
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(LegacyAcatsTransfer2.getLegacyAcatsTransferStates(filter.getState()), filter.getSince(), filter.getBefore()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(LegacyAcatsTransfer2.getLegacyAcatsTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<LegacyAcatsTransfer>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                return this.this$0.dao.getLatest(LegacyAcatsTransfer2.getLegacyAcatsTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<LegacyAcatsTransfer>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(LegacyAcatsTransfer2.getLegacyAcatsTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<LegacyAcatsTransfer>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(LegacyAcatsTransfer2.getLegacyAcatsTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<LegacyAcatsTransfer>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(LegacyAcatsTransfer2.getLegacyAcatsTransferStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }
        };
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<LegacyAcatsTransfer> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final Flow<LegacyAcatsTransfer> getAcatsTransfer(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getAcatsTransfer(id)));
    }

    public final void refresh(boolean force) {
        Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new LegacyAcatsTransferStore3(this, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$refresh$network$2
            @Override // io.reactivex.functions.Function
            public final List<LegacyAcatsTransfer> apply(PaginatedResult<LegacyApiAcatsTransfer> transfers) {
                Intrinsics.checkNotNullParameter(transfers, "transfers");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transfers, 10));
                Iterator<LegacyApiAcatsTransfer> it = transfers.iterator();
                while (it.hasNext()) {
                    arrayList.add(LegacyAcatsTransfer2.toDbModel(it.next()));
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Maybe maybeDoOnSuccess = refresh(map).force(force).saveAction(this.saveAction).toMaybe(getNetworkWrapper()).doOnSuccess(new C339251());
        Intrinsics.checkNotNullExpressionValue(maybeDoOnSuccess, "doOnSuccess(...)");
        ScopedSubscriptionKt.subscribeIn(maybeDoOnSuccess, getStoreScope());
    }

    /* compiled from: LegacyAcatsTransferStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$refresh$1 */
    static final class C339251<T> implements Consumer {
        C339251() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(List<LegacyAcatsTransfer> list) {
            Intrinsics.checkNotNull(list);
            LegacyAcatsTransferStore.this.instrumentStore.pingInstruments(SequencesKt.asIterable(SequencesKt.mapNotNull(SequencesKt.flatMap(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$refresh$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LegacyAcatsTransferStore.C339251.accept$lambda$0((LegacyAcatsTransfer) obj);
                }
            }), new Function1() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$refresh$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LegacyAcatsTransferStore.C339251.accept$lambda$1((LegacyAcatsTransferPosition) obj);
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Sequence accept$lambda$0(LegacyAcatsTransfer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.asSequence(it.getPositions());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID accept$lambda$1(LegacyAcatsTransferPosition it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getInstrument();
        }
    }

    /* compiled from: LegacyAcatsTransferStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$cancelAcatsTransferAndPoll$1", m3645f = "LegacyAcatsTransferStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$cancelAcatsTransferAndPoll$1 */
    static final class C339191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339191(UUID uuid, Continuation<? super C339191> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyAcatsTransferStore.this.new C339191(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C339191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Brokeback brokeback = LegacyAcatsTransferStore.this.brokeback;
                UUID uuid = this.$id;
                this.label = 1;
                if (brokeback.cancelLegacyAcatsTransfer(uuid, this) == coroutine_suspended) {
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

    public final Observable<Optional<LegacyAcatsTransfer>> cancelAcatsTransferAndPoll(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Completable completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C339191(id, null), 1, null);
        Observable observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C339202(id, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore.cancelAcatsTransferAndPoll.3
            @Override // io.reactivex.functions.Function
            public final LegacyAcatsTransfer apply(LegacyApiAcatsTransfer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return LegacyAcatsTransfer2.toDbModel(it);
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable observableCompose = observable.compose(new Poll(1L, timeUnit, false));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Observable<Optional<LegacyAcatsTransfer>> observableSubscribeOn = completableRxCompletable$default.andThen(observableCompose.takeUntil((Predicate) new Predicate() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore.cancelAcatsTransferAndPoll.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(LegacyAcatsTransfer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.isCanceled();
            }
        }).onErrorResumeNext(Observable.empty()).take(5L, timeUnit).takeLast(1).map(new Function() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore.cancelAcatsTransferAndPoll.5
            @Override // io.reactivex.functions.Function
            public final Optional<LegacyAcatsTransfer> apply(LegacyAcatsTransfer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.INSTANCE.m2972of(it);
            }
        }).defaultIfEmpty(Optional2.INSTANCE).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore.cancelAcatsTransferAndPoll.6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<LegacyAcatsTransfer> optional) {
                LegacyAcatsTransfer legacyAcatsTransferComponent1 = optional.component1();
                if (legacyAcatsTransferComponent1 != null) {
                    LegacyAcatsTransferStore.this.dao.insert((LegacyAcatsTransferDao) legacyAcatsTransferComponent1);
                }
            }
        })).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    /* compiled from: LegacyAcatsTransferStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/LegacyApiAcatsTransfer;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$cancelAcatsTransferAndPoll$2", m3645f = "LegacyAcatsTransferStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore$cancelAcatsTransferAndPoll$2 */
    static final class C339202 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super LegacyApiAcatsTransfer>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339202(UUID uuid, Continuation<? super C339202> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyAcatsTransferStore.this.new C339202(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LegacyApiAcatsTransfer> continuation) {
            return ((C339202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Brokeback brokeback = LegacyAcatsTransferStore.this.brokeback;
            UUID uuid = this.$id;
            this.label = 1;
            Object legacyAcatsTransfer = brokeback.getLegacyAcatsTransfer(uuid, this);
            return legacyAcatsTransfer == coroutine_suspended ? coroutine_suspended : legacyAcatsTransfer;
        }
    }
}
