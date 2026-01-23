package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.CancelTransferRequestDto;
import bonfire.proto.idl.windsor.p041v1.GetTransferDetailResponseDto;
import bonfire.proto.idl.windsor.p041v1.GetTransfersResponseDto;
import bonfire.proto.idl.windsor.p041v1.WindsorService;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint;
import com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint2;
import com.robinhood.android.isa.models.isa.p163db.dao.IsaTransferDao;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaTransfer;
import com.robinhood.android.isa.models.isa.p163db.entity.TransactionState;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.IsaCashTransferTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: IsaTransferStore.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u0004\u0018\u00010\u0018H\u0002J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a2\u0006\u0010\u001b\u001a\u00020\fJ\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/store/isa/IsaTransferStore;", "Lcom/robinhood/store/Store;", "windsor", "Lbonfire/proto/idl/windsor/v1/WindsorService;", "isaTransferDao", "Lcom/robinhood/android/isa/models/isa/db/dao/IsaTransferDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/windsor/v1/WindsorService;Lcom/robinhood/android/isa/models/isa/db/dao/IsaTransferDao;Lcom/robinhood/store/StoreBundle;)V", "singleTransferEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lbonfire/proto/idl/windsor/v1/GetTransferDetailResponseDto;", "singleTransferQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaTransfer;", "listTransferEndpoint", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "", "Lbonfire/proto/idl/windsor/v1/GetTransfersResponseDto;", "toTransactionStates", "", "Lcom/robinhood/android/isa/models/isa/db/entity/TransactionState;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "streamTransferById", "Lkotlinx/coroutines/flow/Flow;", "transferId", "refreshTransferById", "force", "", "cancelTransferRequest", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-isa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class IsaTransferStore extends Store {
    private final HistoryLoader.Callbacks<IsaTransfer> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final IsaTransferDao isaTransferDao;
    private final IdlPaginationEndpoint<Unit, GetTransfersResponseDto> listTransferEndpoint;
    private final Endpoint<UUID, GetTransferDetailResponseDto> singleTransferEndpoint;
    private final Query<UUID, IsaTransfer> singleTransferQuery;
    private final WindsorService windsor;

    /* compiled from: IsaTransferStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoryEvent.State.values().length];
            try {
                iArr[HistoryEvent.State.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryEvent.State.SETTLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaTransferStore(WindsorService windsor2, IsaTransferDao isaTransferDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(windsor2, "windsor");
        Intrinsics.checkNotNullParameter(isaTransferDao, "isaTransferDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.windsor = windsor2;
        this.isaTransferDao = isaTransferDao;
        Endpoint<UUID, GetTransferDetailResponseDto> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new IsaTransferStore6(this, null), getLogoutKillswitch(), new IsaTransferStore7(this, null), storeBundle.getClock(), null, 16, null);
        this.singleTransferEndpoint = endpointCreate$default;
        this.singleTransferQuery = Store.create$default(this, Query.INSTANCE, "getSingleIsaTransfer", CollectionsKt.listOf(new RefreshEach(new IsaTransferStore8(endpointCreate$default))), new Function1() { // from class: com.robinhood.store.isa.IsaTransferStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsaTransferStore.singleTransferQuery$lambda$0(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.listTransferEndpoint = IdlPaginationEndpoint.Companion.create$default(IdlPaginationEndpoint.INSTANCE, new IsaTransferStore4(this, null), new Function1() { // from class: com.robinhood.store.isa.IsaTransferStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsaTransferStore.listTransferEndpoint$lambda$1((GetTransfersResponseDto) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.isa.IsaTransferStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsaTransferStore.listTransferEndpoint$lambda$2((GetTransfersResponseDto) obj);
            }
        }, getLogoutKillswitch(), new IsaTransferStore5(this, null), storeBundle.getClock(), null, 64, null);
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.store.isa.IsaTransferStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf(HistoryTransactionType.ISA_CASH_TRANSFER));
                final Flow<IsaTransfer> flowStreamTransferById = this.this$0.streamTransferById(reference.getSourceId());
                return new Flow<IsaCashTransferTransaction>() { // from class: com.robinhood.store.isa.IsaTransferStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super IsaCashTransferTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamTransferById.collect(new C415312(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.store.isa.IsaTransferStore$historyTransactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C415312<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.store.isa.IsaTransferStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "IsaTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.store.isa.IsaTransferStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C415312.this.emit(null, this);
                            }
                        }

                        public C415312(FlowCollector flowCollector) {
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
                                IsaCashTransferTransaction isaCashTransferTransaction = new IsaCashTransferTransaction((IsaTransfer) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(isaCashTransferTransaction, anonymousClass1) == coroutine_suspended) {
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
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<IsaTransfer>() { // from class: com.robinhood.store.isa.IsaTransferStore$historyLoaderCallbacks$1
            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.ISA_CASH_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                return enumSetOf;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                EnumSet enumSetOf = EnumSet.of(BrokerageAccountType.ISA_STOCKS_AND_SHARES);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                return enumSetOf;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                IdlPaginationEndpoint2.refreshAllPages$default(this.this$0.listTransferEndpoint, false, 1, null);
                return FlowKt.filterNotNull(this.this$0.isaTransferDao.streamNumTotal(this.this$0.toTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.isaTransferDao.streamNumLater(this.this$0.toTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<IsaTransfer>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                IdlPaginationEndpoint2.refreshAllPages$default(this.this$0.listTransferEndpoint, false, 1, null);
                return FlowKt.filterNotNull(this.this$0.isaTransferDao.streamLatest(this.this$0.toTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), limit));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<IsaTransfer>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.isaTransferDao.streamLater(this.this$0.toTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id, limit));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<IsaTransfer>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.isaTransferDao.streamSingleAsList(this.this$0.toTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<IsaTransfer>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.isaTransferDao.streamEarlier(this.this$0.toTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id, limit));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow singleTransferQuery$lambda$0(IsaTransferStore isaTransferStore, UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return isaTransferStore.isaTransferDao.streamSingle(transferId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor listTransferEndpoint$lambda$1(GetTransfersResponseDto response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new IdlPaginationCursor(response.getPrevious_cursor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor listTransferEndpoint$lambda$2(GetTransfersResponseDto response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new IdlPaginationCursor(response.getNext_cursor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<TransactionState> toTransactionStates(HistoryEvent.State state) {
        int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == -1) {
            EnumSet enumSetAllOf = EnumSet.allOf(TransactionState.class);
            Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(...)");
            return enumSetAllOf;
        }
        if (i == 1) {
            EnumSet enumSetOf = EnumSet.of(TransactionState.NEW, TransactionState.PENDING_TRANSFER_INITIATION, TransactionState.TRANSFER_INITIATED, TransactionState.PENDING_CANCEL, TransactionState.CANCEL_REQUESTED_UNCONFIRMED);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
            return enumSetOf;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        EnumSet enumSetOf2 = EnumSet.of(TransactionState.COMPLETE, TransactionState.FAILED, TransactionState.CANCELED, TransactionState.PENDING_REVERSE);
        Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
        return enumSetOf2;
    }

    public final Flow<IsaTransfer> streamTransferById(UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return this.singleTransferQuery.asFlow(transferId);
    }

    public static /* synthetic */ void refreshTransferById$default(IsaTransferStore isaTransferStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        isaTransferStore.refreshTransferById(uuid, z);
    }

    public final void refreshTransferById(UUID transferId, boolean force) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Endpoint.DefaultImpls.refresh$default(this.singleTransferEndpoint, transferId, force, null, 4, null);
    }

    public final Object cancelTransferRequest(UUID uuid, Continuation<? super Unit> continuation) {
        WindsorService windsorService = this.windsor;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Object objCancelTransfer = windsorService.CancelTransfer(new CancelTransferRequestDto(string2), continuation);
        return objCancelTransfer == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCancelTransfer : Unit.INSTANCE;
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    public final HistoryLoader.Callbacks<IsaTransfer> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
