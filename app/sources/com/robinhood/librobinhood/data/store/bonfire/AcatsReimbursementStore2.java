package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AcatsReimbursementExperiment;
import com.robinhood.models.acats.p299db.bonfire.AcatsReimbursement;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: AcatsReimbursementStore.kt */
@Metadata(m3635d1 = {"\u0000K\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ;\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R>\u0010\u001a\u001a&\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u0018 \u0019*\u0012\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u0018\u0018\u00010\u00170\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"com/robinhood/librobinhood/data/store/bonfire/AcatsReimbursementStore$acatsReimbursementCallbacks$1", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/acats/db/bonfire/AcatsReimbursement;", "Lcom/robinhood/shared/history/HistoryLoader$Filter;", "filter", "Lkotlinx/coroutines/flow/Flow;", "", "countTotal", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;)Lkotlinx/coroutines/flow/Flow;", "j$/time/Instant", "timestamp", "Ljava/util/UUID;", "id", "countLater", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;Lj$/time/Instant;Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "limit", "", "getLatest", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;I)Lkotlinx/coroutines/flow/Flow;", "getLater", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;Lj$/time/Instant;Ljava/util/UUID;I)Lkotlinx/coroutines/flow/Flow;", "get", "getEarlier", "Ljava/util/EnumSet;", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "kotlin.jvm.PlatformType", "supportedTransactionTypes", "Ljava/util/EnumSet;", "getSupportedTransactionTypes", "()Ljava/util/EnumSet;", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "supportedBrokerageAccountTypes", "Ljava/util/Set;", "getSupportedBrokerageAccountTypes", "()Ljava/util/Set;", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$acatsReimbursementCallbacks$1, reason: use source file name */
/* loaded from: classes13.dex */
public final class AcatsReimbursementStore2 implements HistoryLoader.Callbacks<AcatsReimbursement> {
    private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
    private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.ACATS_REIMBURSEMENT);
    final /* synthetic */ AcatsReimbursementStore this$0;

    AcatsReimbursementStore2(AcatsReimbursementStore acatsReimbursementStore) {
        this.this$0 = acatsReimbursementStore;
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
        if (filter.getState() == HistoryEvent.State.PENDING) {
            return FlowKt.flowOf(0);
        }
        return FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AcatsReimbursementExperiment.INSTANCE}, false, null, 6, null), new C34466xcfb4eb29(null, this.this$0, filter, this));
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(id, "id");
        if (filter.getState() == HistoryEvent.State.PENDING) {
            return FlowKt.flowOf(0);
        }
        return FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AcatsReimbursementExperiment.INSTANCE}, false, null, 6, null), new C34465x784d44e1(null, this.this$0, filter, timestamp, id, this));
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<List<AcatsReimbursement>> getLatest(HistoryLoader.Filter filter, int limit) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (filter.getState() == HistoryEvent.State.PENDING) {
            return FlowKt.flowOf(CollectionsKt.emptyList());
        }
        return FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AcatsReimbursementExperiment.INSTANCE}, false, null, 6, null), new C34470x6d3fa7e1(null, this.this$0, filter, limit, this));
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<List<AcatsReimbursement>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(id, "id");
        if (filter.getState() == HistoryEvent.State.PENDING) {
            return FlowKt.flowOf(CollectionsKt.emptyList());
        }
        return FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AcatsReimbursementExperiment.INSTANCE}, false, null, 6, null), new C34469xdc6a34e8(null, this.this$0, filter, timestamp, id, limit, this));
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<List<AcatsReimbursement>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(id, "id");
        if (filter.getState() != HistoryEvent.State.PENDING) {
            return FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AcatsReimbursementExperiment.INSTANCE}, false, null, 6, null), new C34467x337cc928(null, this.this$0, filter, timestamp, id, this));
        }
        return FlowKt.flowOf(CollectionsKt.emptyList());
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<List<AcatsReimbursement>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(id, "id");
        if (filter.getState() != HistoryEvent.State.PENDING) {
            return FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AcatsReimbursementExperiment.INSTANCE}, false, null, 6, null), new C34468x5caec134(null, this.this$0, filter, timestamp, id, limit, this));
        }
        return FlowKt.flowOf(CollectionsKt.emptyList());
    }
}
