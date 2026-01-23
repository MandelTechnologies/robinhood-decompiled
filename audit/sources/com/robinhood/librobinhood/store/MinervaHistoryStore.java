package com.robinhood.librobinhood.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.minerva.ApiMinervaHistoryItem;
import com.robinhood.models.dao.MinervaHistoryDao;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.p320db.mcduckling.MinervaHistoryItem;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: MinervaHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002()B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR&\u0010!\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Lcom/robinhood/librobinhood/store/MinervaHistoryStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/MinervaHistoryDao;", "dao", "Lcom/robinhood/api/retrofit/Minerva;", "minerva", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/MinervaHistoryDao;Lcom/robinhood/api/retrofit/Minerva;)V", "Lcom/robinhood/librobinhood/store/MinervaHistoryStore$Anchor;", "anchor", "", "refreshSettledHistoryItems", "(Lcom/robinhood/librobinhood/store/MinervaHistoryStore$Anchor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "transactionId", "refresh", "(Ljava/util/UUID;)V", "itemId", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/mcduckling/MinervaHistoryItem;", "streamItem", "(Ljava/util/UUID;)Lio/reactivex/Observable;", "Lcom/robinhood/models/dao/MinervaHistoryDao;", "Lcom/robinhood/api/retrofit/Minerva;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/minerva/ApiMinervaHistoryItem;", "getHistoryItem", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/PaginatedResult;", "getAllHistoryItems", "j$/time/Instant", "getNewerHistoryItems", "getOlderHistoryItems", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "minervaHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getMinervaHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "AnchorSide", "Anchor", "lib-store-minerva_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class MinervaHistoryStore extends Store {
    private final MinervaHistoryDao dao;
    private final Endpoint<Unit, PaginatedResult<ApiMinervaHistoryItem>> getAllHistoryItems;
    private final Endpoint<UUID, ApiMinervaHistoryItem> getHistoryItem;
    private final Endpoint<Instant, PaginatedResult<ApiMinervaHistoryItem>> getNewerHistoryItems;
    private final Endpoint<Instant, PaginatedResult<ApiMinervaHistoryItem>> getOlderHistoryItems;
    private final Minerva minerva;
    private final HistoryLoader.Callbacks<MinervaHistoryItem> minervaHistoryLoaderCallbacks;

    /* compiled from: MinervaHistoryStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnchorSide.values().length];
            try {
                iArr[AnchorSide.NEWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnchorSide.OLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinervaHistoryStore(StoreBundle storeBundle, MinervaHistoryDao dao, Minerva minerva) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        this.dao = dao;
        this.minerva = minerva;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getHistoryItem = Endpoint.Companion.create$default(companion, new MinervaHistoryStore$getHistoryItem$1(this, null), getLogoutKillswitch(), new MinervaHistoryStore$getHistoryItem$2(this, null), storeBundle.getClock(), null, 16, null);
        MinervaHistoryStore$getAllHistoryItems$1 minervaHistoryStore$getAllHistoryItems$1 = new MinervaHistoryStore$getAllHistoryItems$1(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        MinervaHistoryStore$getAllHistoryItems$2 minervaHistoryStore$getAllHistoryItems$2 = new MinervaHistoryStore$getAllHistoryItems$2(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        this.getAllHistoryItems = companion.create(minervaHistoryStore$getAllHistoryItems$1, logoutKillswitch, minervaHistoryStore$getAllHistoryItems$2, clock, new DefaultStaleDecider(durationOfSeconds, storeBundle.getClock()));
        MinervaHistoryStore$getNewerHistoryItems$1 minervaHistoryStore$getNewerHistoryItems$1 = new MinervaHistoryStore$getNewerHistoryItems$1(this, null);
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        MinervaHistoryStore$getNewerHistoryItems$2 minervaHistoryStore$getNewerHistoryItems$2 = new MinervaHistoryStore$getNewerHistoryItems$2(this, null);
        Clock clock2 = storeBundle.getClock();
        Duration durationOfSeconds2 = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "ofSeconds(...)");
        this.getNewerHistoryItems = companion.create(minervaHistoryStore$getNewerHistoryItems$1, logoutKillswitch2, minervaHistoryStore$getNewerHistoryItems$2, clock2, new DefaultStaleDecider(durationOfSeconds2, storeBundle.getClock()));
        MinervaHistoryStore$getOlderHistoryItems$1 minervaHistoryStore$getOlderHistoryItems$1 = new MinervaHistoryStore$getOlderHistoryItems$1(this, null);
        LogoutKillswitch logoutKillswitch3 = getLogoutKillswitch();
        MinervaHistoryStore$getOlderHistoryItems$2 minervaHistoryStore$getOlderHistoryItems$2 = new MinervaHistoryStore$getOlderHistoryItems$2(this, null);
        Clock clock3 = storeBundle.getClock();
        Duration durationOfSeconds3 = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds3, "ofSeconds(...)");
        this.getOlderHistoryItems = companion.create(minervaHistoryStore$getOlderHistoryItems$1, logoutKillswitch3, minervaHistoryStore$getOlderHistoryItems$2, clock3, new DefaultStaleDecider(durationOfSeconds3, storeBundle.getClock()));
        this.minervaHistoryLoaderCallbacks = new HistoryLoader.Callbacks<MinervaHistoryItem>() { // from class: com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.PENDING_CARD_TRANSACTION, HistoryTransactionType.SETTLED_CARD_TRANSACTION, HistoryTransactionType.DECLINED_CARD_TRANSACTION, HistoryTransactionType.DISPUTE, HistoryTransactionType.CHECK_PAYMENT);
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
                BuildersKt__Builders_commonKt.launch$default(this.this$0.getStoreScope(), null, null, new MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$countTotal$1(this.this$0, null), 3, null);
                MinervaHistoryDao minervaHistoryDao = this.this$0.dao;
                HistoryEvent.State state = filter.getState();
                EnumSet<HistoryTransactionType> types = filter.getTypes();
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                final Flow<Integer> flowCountTotal = minervaHistoryDao.countTotal(state, types, since, before, staticFilter != null ? staticFilter.getMinervaAccountId() : null, filter.getIsFilteringByGoldDepositBoost());
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$countTotal$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$countTotal$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$countTotal$$inlined$map$1$2", m3645f = "MinervaHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$countTotal$$inlined$map$1$2$1, reason: invalid class name */
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
                MinervaHistoryDao minervaHistoryDao = this.this$0.dao;
                HistoryEvent.State state = filter.getState();
                EnumSet<HistoryTransactionType> types = filter.getTypes();
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                final Flow<Integer> flowCountLater = minervaHistoryDao.countLater(state, types, since, before, timestamp, id, staticFilter != null ? staticFilter.getMinervaAccountId() : null, filter.getIsFilteringByGoldDepositBoost());
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$countLater$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = flowCountLater.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$countLater$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$countLater$$inlined$map$1$2", m3645f = "MinervaHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.store.MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$countLater$$inlined$map$1$2$1, reason: invalid class name */
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
            public Flow<List<MinervaHistoryItem>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                BuildersKt__Builders_commonKt.launch$default(this.this$0.getStoreScope(), null, null, new MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$getLatest$1(this.this$0, null), 3, null);
                MinervaHistoryDao minervaHistoryDao = this.this$0.dao;
                HistoryEvent.State state = filter.getState();
                EnumSet<HistoryTransactionType> types = filter.getTypes();
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return minervaHistoryDao.getLatest(state, types, since, before, staticFilter != null ? staticFilter.getMinervaAccountId() : null, limit, filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MinervaHistoryItem>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                BuildersKt__Builders_commonKt.launch$default(this.this$0.getStoreScope(), null, null, new MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$getLater$1(this.this$0, timestamp, null), 3, null);
                MinervaHistoryDao minervaHistoryDao = this.this$0.dao;
                HistoryEvent.State state = filter.getState();
                EnumSet<HistoryTransactionType> types = filter.getTypes();
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return minervaHistoryDao.getLater(state, types, since, before, timestamp, id, staticFilter != null ? staticFilter.getMinervaAccountId() : null, limit, filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MinervaHistoryItem>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                MinervaHistoryDao minervaHistoryDao = this.this$0.dao;
                HistoryEvent.State state = filter.getState();
                EnumSet<HistoryTransactionType> types = filter.getTypes();
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return minervaHistoryDao.get(state, types, since, before, timestamp, id, staticFilter != null ? staticFilter.getMinervaAccountId() : null, filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MinervaHistoryItem>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                BuildersKt__Builders_commonKt.launch$default(this.this$0.getStoreScope(), null, null, new MinervaHistoryStore$minervaHistoryLoaderCallbacks$1$getEarlier$1(this.this$0, timestamp, null), 3, null);
                MinervaHistoryDao minervaHistoryDao = this.this$0.dao;
                HistoryEvent.State state = filter.getState();
                EnumSet<HistoryTransactionType> types = filter.getTypes();
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                return minervaHistoryDao.getEarlier(state, types, since, before, timestamp, id, staticFilter != null ? staticFilter.getMinervaAccountId() : null, limit, filter.getIsFilteringByGoldDepositBoost());
            }
        };
    }

    public final void refresh(UUID transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Endpoint.DefaultImpls.refresh$default(this.getHistoryItem, transactionId, false, null, 6, null);
    }

    public final HistoryLoader.Callbacks<MinervaHistoryItem> getMinervaHistoryLoaderCallbacks() {
        return this.minervaHistoryLoaderCallbacks;
    }

    public final Observable<MinervaHistoryItem> streamItem(UUID itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getItem(itemId))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object refreshSettledHistoryItems(Anchor anchor, Continuation<? super Unit> continuation) {
        if (anchor == null) {
            Object objFetch$default = Endpoint8.fetch$default(this.getAllHistoryItems, null, continuation, 1, null);
            if (objFetch$default == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objFetch$default;
            }
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[anchor.getSide().ordinal()];
            if (i == 1) {
                Endpoint.DefaultImpls.refresh$default(this.getNewerHistoryItems, anchor.getInitiatedAt(), false, null, 6, null);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Endpoint.DefaultImpls.refresh$default(this.getOlderHistoryItems, anchor.getInitiatedAt(), false, null, 6, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MinervaHistoryStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/store/MinervaHistoryStore$AnchorSide;", "", "<init>", "(Ljava/lang/String;I)V", "NEWER", "OLDER", "lib-store-minerva_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class AnchorSide {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnchorSide[] $VALUES;
        public static final AnchorSide NEWER = new AnchorSide("NEWER", 0);
        public static final AnchorSide OLDER = new AnchorSide("OLDER", 1);

        private static final /* synthetic */ AnchorSide[] $values() {
            return new AnchorSide[]{NEWER, OLDER};
        }

        public static EnumEntries<AnchorSide> getEntries() {
            return $ENTRIES;
        }

        private AnchorSide(String str, int i) {
        }

        static {
            AnchorSide[] anchorSideArr$values = $values();
            $VALUES = anchorSideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(anchorSideArr$values);
        }

        public static AnchorSide valueOf(String str) {
            return (AnchorSide) Enum.valueOf(AnchorSide.class, str);
        }

        public static AnchorSide[] values() {
            return (AnchorSide[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MinervaHistoryStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/store/MinervaHistoryStore$Anchor;", "", "j$/time/Instant", "initiatedAt", "Lcom/robinhood/librobinhood/store/MinervaHistoryStore$AnchorSide;", "side", "<init>", "(Lj$/time/Instant;Lcom/robinhood/librobinhood/store/MinervaHistoryStore$AnchorSide;)V", "component1", "()Lj$/time/Instant;", "component2", "()Lcom/robinhood/librobinhood/store/MinervaHistoryStore$AnchorSide;", "copy", "(Lj$/time/Instant;Lcom/robinhood/librobinhood/store/MinervaHistoryStore$AnchorSide;)Lcom/robinhood/librobinhood/store/MinervaHistoryStore$Anchor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getInitiatedAt", "Lcom/robinhood/librobinhood/store/MinervaHistoryStore$AnchorSide;", "getSide", "lib-store-minerva_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Anchor {
        private final Instant initiatedAt;
        private final AnchorSide side;

        public static /* synthetic */ Anchor copy$default(Anchor anchor, Instant instant, AnchorSide anchorSide, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = anchor.initiatedAt;
            }
            if ((i & 2) != 0) {
                anchorSide = anchor.side;
            }
            return anchor.copy(instant, anchorSide);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getInitiatedAt() {
            return this.initiatedAt;
        }

        /* renamed from: component2, reason: from getter */
        public final AnchorSide getSide() {
            return this.side;
        }

        public final Anchor copy(Instant initiatedAt, AnchorSide side) {
            Intrinsics.checkNotNullParameter(initiatedAt, "initiatedAt");
            Intrinsics.checkNotNullParameter(side, "side");
            return new Anchor(initiatedAt, side);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Anchor)) {
                return false;
            }
            Anchor anchor = (Anchor) other;
            return Intrinsics.areEqual(this.initiatedAt, anchor.initiatedAt) && this.side == anchor.side;
        }

        public int hashCode() {
            return (this.initiatedAt.hashCode() * 31) + this.side.hashCode();
        }

        public String toString() {
            return "Anchor(initiatedAt=" + this.initiatedAt + ", side=" + this.side + ")";
        }

        public Anchor(Instant initiatedAt, AnchorSide side) {
            Intrinsics.checkNotNullParameter(initiatedAt, "initiatedAt");
            Intrinsics.checkNotNullParameter(side, "side");
            this.initiatedAt = initiatedAt;
            this.side = side;
        }

        public final Instant getInitiatedAt() {
            return this.initiatedAt;
        }

        public final AnchorSide getSide() {
            return this.side;
        }
    }
}
