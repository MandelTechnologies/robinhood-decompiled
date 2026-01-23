package com.robinhood.internalassettransfers.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint;
import com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint2;
import com.robinhood.android.models.internalassettransfers.api.ApiEligibleAsset;
import com.robinhood.android.models.internalassettransfers.api.ApiEligibleAssets;
import com.robinhood.android.models.internalassettransfers.api.ApiEligibleAssets2;
import com.robinhood.android.models.internalassettransfers.p193db.AssetTransferRecord;
import com.robinhood.android.models.internalassettransfers.p193db.AssetTransferRecord2;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.internalassettransfers.retrofit.InternalAssetTransfersApi;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.internalassettransfer.p328db.bonfire.DbAssetTransferRecord;
import com.robinhood.models.internalassettransfer.p328db.dao.InternalAssetTransferDao;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.InternalAssetTransferTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.StringsKt;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import nimbus.service.p511v1.AssetTransferRecordDto;
import nimbus.service.p511v1.EquityPositionDto;
import nimbus.service.p511v1.GetAssetTransferListResponseDto;
import nimbus.service.p511v1.NimbusService;
import p479j$.time.Instant;

/* compiled from: InternalAssetTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\"J\u0012\u0010$\u001a\u00020\u0018*\u00020\u001aH\u0082@¢\u0006\u0002\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020)0/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u00062"}, m3636d2 = {"Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "Lcom/robinhood/store/Store;", "internalAssetTransfersApi", "Lcom/robinhood/api/internalassettransfers/retrofit/InternalAssetTransfersApi;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "nimbusService", "Lnimbus/service/v1/NimbusService;", "internalAssetTransferDao", "Lcom/robinhood/models/internalassettransfer/db/dao/InternalAssetTransferDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/internalassettransfers/retrofit/InternalAssetTransfersApi;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lnimbus/service/v1/NimbusService;Lcom/robinhood/models/internalassettransfer/db/dao/InternalAssetTransferDao;Lcom/robinhood/store/StoreBundle;)V", "getEligibleAssetsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "Lcom/robinhood/android/models/internalassettransfers/api/ApiEligibleAssets;", "getAssetTransferRecordListEndpoint", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "", "Lnimbus/service/v1/GetAssetTransferListResponseDto;", "getAssetTransferRecordEndpoint", "Lcom/robinhood/android/models/internalassettransfers/db/AssetTransferRecord;", "cancelAssetTransferRecordEndpoint", "Lnimbus/service/v1/AssetTransferRecordDto;", "getEligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "sourceAccountNumber", "sinkAccountNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAssetTransferDetails", "assetTransferUuid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAssetTransfer", "internalToDomainModel", "(Lnimbus/service/v1/AssetTransferRecordDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listItemQuery", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/models/internalassettransfer/db/bonfire/DbAssetTransferRecord;", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "internalAssetTransferCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getInternalAssetTransferCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class InternalAssetTransfersStore extends Store {
    private final Endpoint<String, AssetTransferRecordDto> cancelAssetTransferRecordEndpoint;
    private final Endpoint<String, AssetTransferRecord> getAssetTransferRecordEndpoint;
    private final IdlPaginationEndpoint<Unit, GetAssetTransferListResponseDto> getAssetTransferRecordListEndpoint;
    private final Endpoint<Tuples2<String, String>, ApiEligibleAssets> getEligibleAssetsEndpoint;
    private final InstrumentStore instrumentStore;
    private final HistoryLoader.Callbacks<DbAssetTransferRecord> internalAssetTransferCallbacks;
    private final InternalAssetTransferDao internalAssetTransferDao;
    private final InternalAssetTransfersApi internalAssetTransfersApi;
    private final Query<UUID, DbAssetTransferRecord> listItemQuery;
    private final NimbusService nimbusService;
    private final HistoryTransactionLoader transactionLoader;

    /* compiled from: InternalAssetTransfersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore", m3645f = "InternalAssetTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 131}, m3647m = "cancelAssetTransfer")
    /* renamed from: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$cancelAssetTransfer$1 */
    static final class C333701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C333701(Continuation<? super C333701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalAssetTransfersStore.this.cancelAssetTransfer(null, this);
        }
    }

    /* compiled from: InternalAssetTransfersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore", m3645f = "InternalAssetTransfersStore.kt", m3646l = {117, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE}, m3647m = "getEligibleAssets")
    /* renamed from: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$getEligibleAssets$1 */
    static final class C333711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C333711(Continuation<? super C333711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalAssetTransfersStore.this.getEligibleAssets(null, null, this);
        }
    }

    /* compiled from: InternalAssetTransfersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore", m3645f = "InternalAssetTransfersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE}, m3647m = "internalToDomainModel")
    /* renamed from: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$internalToDomainModel$1 */
    static final class C333721 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C333721(Continuation<? super C333721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalAssetTransfersStore.this.internalToDomainModel(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalAssetTransfersStore(InternalAssetTransfersApi internalAssetTransfersApi, InstrumentStore instrumentStore, NimbusService nimbusService, InternalAssetTransferDao internalAssetTransferDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(internalAssetTransfersApi, "internalAssetTransfersApi");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
        Intrinsics.checkNotNullParameter(internalAssetTransferDao, "internalAssetTransferDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.internalAssetTransfersApi = internalAssetTransfersApi;
        this.instrumentStore = instrumentStore;
        this.nimbusService = nimbusService;
        this.internalAssetTransferDao = internalAssetTransferDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getEligibleAssetsEndpoint = Endpoint.Companion.create$default(companion, new InternalAssetTransfersStore$getEligibleAssetsEndpoint$1(this, null), getLogoutKillswitch(), new InternalAssetTransfersStore$getEligibleAssetsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.getAssetTransferRecordListEndpoint = IdlPaginationEndpoint.Companion.create$default(IdlPaginationEndpoint.INSTANCE, new InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$1(this, null), new Function1() { // from class: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransfersStore.getAssetTransferRecordListEndpoint$lambda$0((GetAssetTransferListResponseDto) obj);
            }
        }, new Function1() { // from class: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransfersStore.getAssetTransferRecordListEndpoint$lambda$1((GetAssetTransferListResponseDto) obj);
            }
        }, getLogoutKillswitch(), new InternalAssetTransfersStore$getAssetTransferRecordListEndpoint$4(this, null), storeBundle.getClock(), null, 64, null);
        this.getAssetTransferRecordEndpoint = Endpoint.Companion.create$default(companion, new InternalAssetTransfersStore$getAssetTransferRecordEndpoint$1(this, null), getLogoutKillswitch(), new InternalAssetTransfersStore$getAssetTransferRecordEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.cancelAssetTransferRecordEndpoint = Endpoint.Companion.create$default(companion, new InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$1(this, null), getLogoutKillswitch(), new InternalAssetTransfersStore$cancelAssetTransferRecordEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.listItemQuery = Store.create$default(this, Query.INSTANCE, "fetchInternalAssetTransferItem", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransfersStore.listItemQuery$lambda$5(this.f$0, (UUID) obj);
            }
        })), new InternalAssetTransfersStore$listItemQuery$2(internalAssetTransferDao), false, 8, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.INTERNAL_ASSET_TRANSFER);
                final Flow flowAsFlow = this.this$0.listItemQuery.asFlow(reference.getSourceId());
                return new Flow<InternalAssetTransferTransaction>() { // from class: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$transactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super InternalAssetTransferTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$transactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "InternalAssetTransfersStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                InternalAssetTransferTransaction internalAssetTransferTransaction = new InternalAssetTransferTransaction((DbAssetTransferRecord) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(internalAssetTransferTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.internalAssetTransferCallbacks = new HistoryLoader.Callbacks<DbAssetTransferRecord>() { // from class: com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore$internalAssetTransferCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.INTERNAL_ASSET_TRANSFER);

            {
                EnumSet enumSetOf = EnumSet.of(BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                IdlPaginationEndpoint2.refreshAllPages$default(this.this$0.getAssetTransferRecordListEndpoint, false, 1, null);
                return FlowKt.filterNotNull(this.this$0.internalAssetTransferDao.countTotal(filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.internalAssetTransferDao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<DbAssetTransferRecord>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                IdlPaginationEndpoint2.refreshAllPages$default(this.this$0.getAssetTransferRecordListEndpoint, false, 1, null);
                return this.this$0.internalAssetTransferDao.getLatest(filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getState());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<DbAssetTransferRecord>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.internalAssetTransferDao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getState());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<DbAssetTransferRecord>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.internalAssetTransferDao.get(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getState());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<DbAssetTransferRecord>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.internalAssetTransferDao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getState());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getAssetTransferRecordListEndpoint$lambda$0(GetAssetTransferListResponseDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new IdlPaginationCursor(it.getPrevious_cursor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getAssetTransferRecordListEndpoint$lambda$1(GetAssetTransferListResponseDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new IdlPaginationCursor(it.getNext_cursor());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r12 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEligibleAssets(String str, String str2, Continuation<? super EligibleAssets> continuation) {
        C333711 c333711;
        ApiEligibleAssets apiEligibleAssets;
        if (continuation instanceof C333711) {
            c333711 = (C333711) continuation;
            int i = c333711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c333711.label = i - Integer.MIN_VALUE;
            } else {
                c333711 = new C333711(continuation);
            }
        }
        C333711 c3337112 = c333711;
        Object objForceFetch$default = c3337112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3337112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<Tuples2<String, String>, ApiEligibleAssets> endpoint = this.getEligibleAssetsEndpoint;
            Tuples2 tuples2 = new Tuples2(str, str2);
            c3337112.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2, null, c3337112, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiEligibleAssets = (ApiEligibleAssets) c3337112.L$0;
            ResultKt.throwOnFailure(objForceFetch$default);
            Intrinsics.checkNotNullExpressionValue(objForceFetch$default, "awaitFirst(...)");
            Iterable iterable = (Iterable) objForceFetch$default;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
            for (Object obj : iterable) {
                linkedHashMap.put(((Instrument) obj).getId().toString(), obj);
            }
            return ApiEligibleAssets2.toDomainModel(apiEligibleAssets, linkedHashMap);
        }
        ResultKt.throwOnFailure(objForceFetch$default);
        apiEligibleAssets = (ApiEligibleAssets) objForceFetch$default;
        List<ApiEligibleAsset> equity_positions = apiEligibleAssets.getEquity_positions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equity_positions, 10));
        Iterator<T> it = equity_positions.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.toUuid(((ApiEligibleAsset) it.next()).getInstrument_id()));
        }
        this.instrumentStore.pingInstruments(arrayList);
        Observable<List<Instrument>> instruments = this.instrumentStore.getInstruments(arrayList);
        c3337112.L$0 = apiEligibleAssets;
        c3337112.label = 2;
        objForceFetch$default = RxAwait3.awaitFirst(instruments, c3337112);
    }

    public final Object getAssetTransferDetails(String str, Continuation<? super AssetTransferRecord> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getAssetTransferRecordEndpoint, str, null, continuation, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelAssetTransfer(String str, Continuation<? super AssetTransferRecord> continuation) {
        C333701 c333701;
        if (continuation instanceof C333701) {
            c333701 = (C333701) continuation;
            int i = c333701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c333701.label = i - Integer.MIN_VALUE;
            } else {
                c333701 = new C333701(continuation);
            }
        }
        C333701 c3337012 = c333701;
        Object objForceFetch$default = c3337012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3337012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<String, AssetTransferRecordDto> endpoint = this.cancelAssetTransferRecordEndpoint;
            c3337012.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, c3337012, 2, null);
            if (objForceFetch$default != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
            return objForceFetch$default;
        }
        ResultKt.throwOnFailure(objForceFetch$default);
        c3337012.label = 2;
        Object objInternalToDomainModel = internalToDomainModel((AssetTransferRecordDto) objForceFetch$default, c3337012);
        return objInternalToDomainModel == coroutine_suspended ? coroutine_suspended : objInternalToDomainModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalToDomainModel(AssetTransferRecordDto assetTransferRecordDto, Continuation<? super AssetTransferRecord> continuation) {
        C333721 c333721;
        if (continuation instanceof C333721) {
            c333721 = (C333721) continuation;
            int i = c333721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c333721.label = i - Integer.MIN_VALUE;
            } else {
                c333721 = new C333721(continuation);
            }
        }
        Object objAwaitFirst = c333721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c333721.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            List<EquityPositionDto> equity_positions = assetTransferRecordDto.getEquity_positions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equity_positions, 10));
            Iterator<T> it = equity_positions.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.toUuid(((EquityPositionDto) it.next()).getInstrument_id()));
            }
            Observable<List<Instrument>> instruments = this.instrumentStore.getInstruments(arrayList);
            c333721.L$0 = assetTransferRecordDto;
            c333721.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(instruments, c333721);
            if (objAwaitFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            assetTransferRecordDto = (AssetTransferRecordDto) c333721.L$0;
            ResultKt.throwOnFailure(objAwaitFirst);
        }
        List list = (List) objAwaitFirst;
        Intrinsics.checkNotNull(list);
        return AssetTransferRecord2.toDomainModel(assetTransferRecordDto, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job listItemQuery$lambda$5(InternalAssetTransfersStore internalAssetTransfersStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return IdlPaginationEndpoint2.refreshAllPages$default(internalAssetTransfersStore.getAssetTransferRecordListEndpoint, false, 1, null);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<DbAssetTransferRecord> getInternalAssetTransferCallbacks() {
        return this.internalAssetTransferCallbacks;
    }
}
