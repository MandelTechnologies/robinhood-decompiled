package com.robinhood.store.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpoint;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.models.futures.dao.FuturesPositionDao;
import com.robinhood.android.models.futures.p189db.FuturesPosition;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetCurrentPositionsByContractIDResponseDto;
import com.robinhood.ceres.p284v1.GetCurrentPositionsResponseDto;
import com.robinhood.idl.Response;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.FuturesPositionStore;
import com.robinhood.store.futures.idl.FuturesPaginationExtensions;
import java.util.List;
import java.util.UUID;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesPositionStore.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00160\u001aJ\u0010\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesPositionStore;", "Lcom/robinhood/store/Store;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresPositionDao", "Lcom/robinhood/android/models/futures/dao/FuturesPositionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/models/futures/dao/FuturesPositionDao;Lcom/robinhood/store/StoreBundle;)V", "allPositionsEndpoint", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;", "Ljava/util/UUID;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsResponseDto;", "positionsByContractEndpoint", "Lcom/robinhood/store/futures/FuturesPositionStore$ContractPositionArgs;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDResponseDto;", "allPositionsQuery", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/android/models/futures/db/FuturesPosition;", "positionsForContractQuery", "streamPositionByContract", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "contractId", "streamAllPositions", "refresh", "", "force", "", "ContractPositionArgs", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesPositionStore extends Store {
    private final IdlPaginatedResponseEndpoint<UUID, Response<GetCurrentPositionsResponseDto>> allPositionsEndpoint;
    private final Query<UUID, List<FuturesPosition>> allPositionsQuery;
    private final Ceres ceres;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesPositionDao futuresPositionDao;
    private final IdlPaginatedResponseEndpoint<ContractPositionArgs, Response<GetCurrentPositionsByContractIDResponseDto>> positionsByContractEndpoint;
    private final Query<ContractPositionArgs, List<FuturesPosition>> positionsForContractQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesPositionStore(Ceres ceres, FuturesAccountStore futuresAccountStore, FuturesPositionDao futuresPositionDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresPositionDao, "futuresPositionDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresPositionDao = futuresPositionDao;
        IdlPaginatedResponseEndpoint.Companion companion = IdlPaginatedResponseEndpoint.INSTANCE;
        this.allPositionsEndpoint = IdlPaginatedResponseEndpoint.Companion.createWithParams$default(companion, new FuturesPositionStore2(this, null), new Function1() { // from class: com.robinhood.store.futures.FuturesPositionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionStore.allPositionsEndpoint$lambda$0((Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.futures.FuturesPositionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionStore.allPositionsEndpoint$lambda$1((Response) obj);
            }
        }, storeBundle.getLogoutKillswitch(), new FuturesPositionStore3(this, null), storeBundle.getClock(), null, 64, null);
        this.positionsByContractEndpoint = IdlPaginatedResponseEndpoint.Companion.createWithParams$default(companion, new FuturesPositionStore4(this, null), new Function1() { // from class: com.robinhood.store.futures.FuturesPositionStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionStore.positionsByContractEndpoint$lambda$2((Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.futures.FuturesPositionStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionStore.positionsByContractEndpoint$lambda$3((Response) obj);
            }
        }, storeBundle.getLogoutKillswitch(), new FuturesPositionStore5(this, null), storeBundle.getClock(), null, 64, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.allPositionsQuery = Store.create$default(this, companion2, "getAllFuturesPositions", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.FuturesPositionStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionStore.allPositionsQuery$lambda$4(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.FuturesPositionStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionStore.allPositionsQuery$lambda$5(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.positionsForContractQuery = Store.create$default(this, companion2, "getFuturesPositionsForContract", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.FuturesPositionStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionStore.positionsForContractQuery$lambda$6(this.f$0, (FuturesPositionStore.ContractPositionArgs) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.FuturesPositionStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPositionStore.positionsForContractQuery$lambda$7(this.f$0, (FuturesPositionStore.ContractPositionArgs) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor allPositionsEndpoint$lambda$0(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetCurrentPositionsResponseDto) response.getData()).getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor allPositionsEndpoint$lambda$1(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetCurrentPositionsResponseDto) response.getData()).getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor positionsByContractEndpoint$lambda$2(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetCurrentPositionsByContractIDResponseDto) response.getData()).getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor positionsByContractEndpoint$lambda$3(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetCurrentPositionsByContractIDResponseDto) response.getData()).getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow allPositionsQuery$lambda$4(FuturesPositionStore futuresPositionStore, UUID params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return IdlPaginatedResponseEndpoint.DefaultImpls.pollAllPages$default(futuresPositionStore.allPositionsEndpoint, params, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow allPositionsQuery$lambda$5(FuturesPositionStore futuresPositionStore, UUID futuresAccountId) {
        Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
        return futuresPositionStore.futuresPositionDao.getAllPositions(futuresAccountId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow positionsForContractQuery$lambda$6(FuturesPositionStore futuresPositionStore, ContractPositionArgs params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return IdlPaginatedResponseEndpoint.DefaultImpls.pollAllPages$default(futuresPositionStore.positionsByContractEndpoint, params, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow positionsForContractQuery$lambda$7(FuturesPositionStore futuresPositionStore, ContractPositionArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return futuresPositionStore.futuresPositionDao.getPositionsForContract(args.getContractId(), args.getFuturesAccountId());
    }

    public final Flow<UiFuturesPosition> streamPositionByContract(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FuturesAccountStore.streamOptionalFuturesAccountId$default(this.futuresAccountStore, null, 1, null)), new C41469x63acbef0(null, this, contractId));
    }

    public final Flow<List<UiFuturesPosition>> streamAllPositions() {
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FuturesAccountStore.streamOptionalFuturesAccountId$default(this.futuresAccountStore, null, 1, null)), new FuturesPositionStore$streamAllPositions$$inlined$flatMapLatest$1(null, this));
    }

    /* compiled from: FuturesPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesPositionStore$refresh$1", m3645f = "FuturesPositionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesPositionStore$refresh$1 */
    static final class C414711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414711(boolean z, Continuation<? super C414711> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesPositionStore.this.new C414711(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C414711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesPositionStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesPositionStore$refresh$1$1", m3645f = "FuturesPositionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.store.futures.FuturesPositionStore$refresh$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $force;
            int label;
            final /* synthetic */ FuturesPositionStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesPositionStore futuresPositionStore, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresPositionStore;
                this.$force = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$force, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamFuturesAccountId$default = FuturesAccountStore.streamFuturesAccountId$default(this.this$0.futuresAccountStore, null, 1, null);
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flowStreamFuturesAccountId$default, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                UUID uuid = (UUID) obj;
                if (uuid != null) {
                    this.this$0.allPositionsEndpoint.refreshAllPages(uuid, this.$force);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FuturesPositionStore.this, this.$force, null);
                this.label = 1;
                if (Timeout6.withTimeout(1000L, anonymousClass1, this) == coroutine_suspended) {
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

    public static /* synthetic */ void refresh$default(FuturesPositionStore futuresPositionStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        futuresPositionStore.refresh(z);
    }

    public final void refresh(boolean force) {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C414711(force, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesPositionStore$ContractPositionArgs;", "", "contractId", "Ljava/util/UUID;", "futuresAccountId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getContractId", "()Ljava/util/UUID;", "getFuturesAccountId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class ContractPositionArgs {
        private final UUID contractId;
        private final UUID futuresAccountId;

        public static /* synthetic */ ContractPositionArgs copy$default(ContractPositionArgs contractPositionArgs, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = contractPositionArgs.contractId;
            }
            if ((i & 2) != 0) {
                uuid2 = contractPositionArgs.futuresAccountId;
            }
            return contractPositionArgs.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        public final ContractPositionArgs copy(UUID contractId, UUID futuresAccountId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            return new ContractPositionArgs(contractId, futuresAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractPositionArgs)) {
                return false;
            }
            ContractPositionArgs contractPositionArgs = (ContractPositionArgs) other;
            return Intrinsics.areEqual(this.contractId, contractPositionArgs.contractId) && Intrinsics.areEqual(this.futuresAccountId, contractPositionArgs.futuresAccountId);
        }

        public int hashCode() {
            return (this.contractId.hashCode() * 31) + this.futuresAccountId.hashCode();
        }

        public String toString() {
            return "ContractPositionArgs(contractId=" + this.contractId + ", futuresAccountId=" + this.futuresAccountId + ")";
        }

        public ContractPositionArgs(UUID contractId, UUID futuresAccountId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            this.contractId = contractId;
            this.futuresAccountId = futuresAccountId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }
    }
}
