package com.robinhood.librobinhood.data.store.bonfire;

import acats_aggregation.service.p001v1.AcatsAggregationService;
import acats_aggregation.service.p001v1.FeeReimbursementsHistoryResponseDto;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AcatsReimbursementExperiment;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.acats.p299db.bonfire.AcatsReimbursement;
import com.robinhood.models.acats.p299db.dao.AcatsReimbursementDao;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.AcatsReimbursementTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AcatsReimbursementStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "acatsAggregationService", "Lacats_aggregation/service/v1/AcatsAggregationService;", "dao", "Lcom/robinhood/models/acats/db/dao/AcatsReimbursementDao;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lacats_aggregation/service/v1/AcatsAggregationService;Lcom/robinhood/models/acats/db/dao/AcatsReimbursementDao;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "acatsReimbursementsListEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryResponseDto;", "listItemQuery", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/models/acats/db/bonfire/AcatsReimbursement;", "getReimbursementItem", "Lkotlinx/coroutines/flow/Flow;", "id", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "acatsReimbursementCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getAcatsReimbursementCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AcatsReimbursementStore extends Store {
    private final AcatsAggregationService acatsAggregationService;
    private final HistoryLoader.Callbacks<AcatsReimbursement> acatsReimbursementCallbacks;
    private final Endpoint<Unit, FeeReimbursementsHistoryResponseDto> acatsReimbursementsListEndpoint;
    private final AcatsReimbursementDao dao;
    private final ExperimentsStore experimentsStore;
    private final Query<UUID, AcatsReimbursement> listItemQuery;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsReimbursementStore(StoreBundle storeBundle, AcatsAggregationService acatsAggregationService, AcatsReimbursementDao dao, ExperimentsStore experimentsStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(acatsAggregationService, "acatsAggregationService");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.acatsAggregationService = acatsAggregationService;
        this.dao = dao;
        this.experimentsStore = experimentsStore;
        this.acatsReimbursementsListEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new AcatsReimbursementStore3(this, null), getLogoutKillswitch(), new AcatsReimbursementStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.listItemQuery = Store.create$default(this, Query.INSTANCE, "fetchAcatsReimbursementListItem", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsReimbursementStore.listItemQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new AcatsReimbursementStore5(dao), false, 8, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.ACATS_REIMBURSEMENT);
                final Flow flowConnectWhen$default = Operators.connectWhen$default(this.this$0.listItemQuery.asFlow(reference.getSourceId()), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AcatsReimbursementExperiment.INSTANCE}, false, null, 6, null), null, 2, null);
                return new Flow<AcatsReimbursementTransaction>() { // from class: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C344712<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "AcatsReimbursementStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C344712.this.emit(null, this);
                            }
                        }

                        public C344712(FlowCollector flowCollector) {
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
                                AcatsReimbursementTransaction acatsReimbursementTransaction = new AcatsReimbursementTransaction((AcatsReimbursement) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(acatsReimbursementTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super AcatsReimbursementTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowConnectWhen$default.collect(new C344712(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.acatsReimbursementCallbacks = new AcatsReimbursementStore2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job listItemQuery$lambda$0(AcatsReimbursementStore acatsReimbursementStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint8.refresh$default(acatsReimbursementStore.acatsReimbursementsListEndpoint, false, null, 3, null);
    }

    public final Flow<AcatsReimbursement> getReimbursementItem(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.listItemQuery.asFlow(id);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<AcatsReimbursement> getAcatsReimbursementCallbacks() {
        return this.acatsReimbursementCallbacks;
    }
}
