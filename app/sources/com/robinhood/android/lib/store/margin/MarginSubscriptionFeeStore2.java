package com.robinhood.android.lib.store.margin;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.MarginSubscriptionFee;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: MarginSubscriptionFeeStore.kt */
@Metadata(m3635d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ;\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006 "}, m3636d2 = {"com/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore$feesHistoryLoaderCallback$1", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/db/MarginSubscriptionFee;", "Lcom/robinhood/shared/history/HistoryLoader$Filter;", "filter", "Lkotlinx/coroutines/flow/Flow;", "", "countTotal", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;)Lkotlinx/coroutines/flow/Flow;", "j$/time/Instant", "timestamp", "Ljava/util/UUID;", "id", "countLater", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;Lj$/time/Instant;Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "limit", "", "getLatest", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;I)Lkotlinx/coroutines/flow/Flow;", "getLater", "(Lcom/robinhood/shared/history/HistoryLoader$Filter;Lj$/time/Instant;Ljava/util/UUID;I)Lkotlinx/coroutines/flow/Flow;", "get", "getEarlier", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "supportedTransactionTypes", "Ljava/util/Set;", "getSupportedTransactionTypes", "()Ljava/util/Set;", "Lcom/robinhood/models/api/BrokerageAccountType;", "supportedBrokerageAccountTypes", "getSupportedBrokerageAccountTypes", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesHistoryLoaderCallback$1, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginSubscriptionFeeStore2 implements HistoryLoader.Callbacks<MarginSubscriptionFee> {
    private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
    private final Set<HistoryTransactionType> supportedTransactionTypes;
    final /* synthetic */ MarginSubscriptionFeeStore this$0;

    MarginSubscriptionFeeStore2(MarginSubscriptionFeeStore marginSubscriptionFeeStore) {
        this.this$0 = marginSubscriptionFeeStore;
        EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.MARGIN_SUBSCRIPTION_FEE);
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
    public Flow<Integer> countTotal(final HistoryLoader.Filter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        MarginSubscriptionFeeStore marginSubscriptionFeeStore = this.this$0;
        Set<BrokerageAccountType> supportedBrokerageAccountTypes = getSupportedBrokerageAccountTypes();
        final MarginSubscriptionFeeStore marginSubscriptionFeeStore2 = this.this$0;
        return marginSubscriptionFeeStore.flowIfNotManaged(filter, supportedBrokerageAccountTypes, 0, new Function0() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesHistoryLoaderCallback$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSubscriptionFeeStore2.countTotal$lambda$1(filter, marginSubscriptionFeeStore2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow countTotal$lambda$1(HistoryLoader.Filter filter, MarginSubscriptionFeeStore marginSubscriptionFeeStore) {
        HistoryEvent.State state = HistoryEvent.State.SETTLED;
        if (filter.getState() == null || filter.getState() == state) {
            marginSubscriptionFeeStore.refresh(false);
            return FlowKt.filterNotNull(marginSubscriptionFeeStore.dao.countTotalFees(filter.getSince(), filter.getBefore()));
        }
        return FlowKt.flowOf(0);
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<Integer> countLater(final HistoryLoader.Filter filter, final Instant timestamp, final UUID id) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(id, "id");
        MarginSubscriptionFeeStore marginSubscriptionFeeStore = this.this$0;
        Set<BrokerageAccountType> supportedBrokerageAccountTypes = getSupportedBrokerageAccountTypes();
        final MarginSubscriptionFeeStore marginSubscriptionFeeStore2 = this.this$0;
        return marginSubscriptionFeeStore.flowIfNotManaged(filter, supportedBrokerageAccountTypes, 0, new Function0() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesHistoryLoaderCallback$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSubscriptionFeeStore2.countLater$lambda$3(filter, marginSubscriptionFeeStore2, timestamp, id);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow countLater$lambda$3(HistoryLoader.Filter filter, MarginSubscriptionFeeStore marginSubscriptionFeeStore, Instant instant, UUID uuid) {
        HistoryEvent.State state = HistoryEvent.State.SETTLED;
        if (filter.getState() == null || filter.getState() == state) {
            return FlowKt.filterNotNull(marginSubscriptionFeeStore.dao.countLaterFees(filter.getSince(), filter.getBefore(), instant, uuid));
        }
        return FlowKt.flowOf(0);
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<List<MarginSubscriptionFee>> getLatest(final HistoryLoader.Filter filter, final int limit) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        MarginSubscriptionFeeStore marginSubscriptionFeeStore = this.this$0;
        Set<BrokerageAccountType> supportedBrokerageAccountTypes = getSupportedBrokerageAccountTypes();
        List listEmptyList = CollectionsKt.emptyList();
        final MarginSubscriptionFeeStore marginSubscriptionFeeStore2 = this.this$0;
        return marginSubscriptionFeeStore.flowIfNotManaged(filter, supportedBrokerageAccountTypes, listEmptyList, new Function0() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesHistoryLoaderCallback$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSubscriptionFeeStore2.getLatest$lambda$5(filter, marginSubscriptionFeeStore2, limit);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getLatest$lambda$5(HistoryLoader.Filter filter, MarginSubscriptionFeeStore marginSubscriptionFeeStore, int i) {
        HistoryEvent.State state = HistoryEvent.State.SETTLED;
        List listEmptyList = CollectionsKt.emptyList();
        if (filter.getState() != null && filter.getState() != state) {
            return FlowKt.flowOf(listEmptyList);
        }
        marginSubscriptionFeeStore.refresh(false);
        return marginSubscriptionFeeStore.dao.getLatestFees(filter.getSince(), filter.getBefore(), i);
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<List<MarginSubscriptionFee>> getLater(final HistoryLoader.Filter filter, final Instant timestamp, final UUID id, final int limit) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(id, "id");
        MarginSubscriptionFeeStore marginSubscriptionFeeStore = this.this$0;
        Set<BrokerageAccountType> supportedBrokerageAccountTypes = getSupportedBrokerageAccountTypes();
        List listEmptyList = CollectionsKt.emptyList();
        final MarginSubscriptionFeeStore marginSubscriptionFeeStore2 = this.this$0;
        return marginSubscriptionFeeStore.flowIfNotManaged(filter, supportedBrokerageAccountTypes, listEmptyList, new Function0() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesHistoryLoaderCallback$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSubscriptionFeeStore2.getLater$lambda$7(filter, marginSubscriptionFeeStore2, timestamp, id, limit);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getLater$lambda$7(HistoryLoader.Filter filter, MarginSubscriptionFeeStore marginSubscriptionFeeStore, Instant instant, UUID uuid, int i) {
        return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? marginSubscriptionFeeStore.dao.getLaterFees(filter.getSince(), filter.getBefore(), instant, uuid, i) : FlowKt.flowOf(CollectionsKt.emptyList());
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<List<MarginSubscriptionFee>> get(final HistoryLoader.Filter filter, final Instant timestamp, final UUID id) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(id, "id");
        MarginSubscriptionFeeStore marginSubscriptionFeeStore = this.this$0;
        Set<BrokerageAccountType> supportedBrokerageAccountTypes = getSupportedBrokerageAccountTypes();
        List listEmptyList = CollectionsKt.emptyList();
        final MarginSubscriptionFeeStore marginSubscriptionFeeStore2 = this.this$0;
        return marginSubscriptionFeeStore.flowIfNotManaged(filter, supportedBrokerageAccountTypes, listEmptyList, new Function0() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesHistoryLoaderCallback$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSubscriptionFeeStore2.get$lambda$9(filter, marginSubscriptionFeeStore2, timestamp, id);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow get$lambda$9(HistoryLoader.Filter filter, MarginSubscriptionFeeStore marginSubscriptionFeeStore, Instant instant, UUID uuid) {
        return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? marginSubscriptionFeeStore.dao.getFee(filter.getSince(), filter.getBefore(), instant, uuid) : FlowKt.flowOf(CollectionsKt.emptyList());
    }

    @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
    public Flow<List<MarginSubscriptionFee>> getEarlier(final HistoryLoader.Filter filter, final Instant timestamp, final UUID id, final int limit) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(id, "id");
        MarginSubscriptionFeeStore marginSubscriptionFeeStore = this.this$0;
        Set<BrokerageAccountType> supportedBrokerageAccountTypes = getSupportedBrokerageAccountTypes();
        List listEmptyList = CollectionsKt.emptyList();
        final MarginSubscriptionFeeStore marginSubscriptionFeeStore2 = this.this$0;
        return marginSubscriptionFeeStore.flowIfNotManaged(filter, supportedBrokerageAccountTypes, listEmptyList, new Function0() { // from class: com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore$feesHistoryLoaderCallback$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSubscriptionFeeStore2.getEarlier$lambda$11(filter, marginSubscriptionFeeStore2, timestamp, id, limit);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getEarlier$lambda$11(HistoryLoader.Filter filter, MarginSubscriptionFeeStore marginSubscriptionFeeStore, Instant instant, UUID uuid, int i) {
        return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? marginSubscriptionFeeStore.dao.getEarlierFees(filter.getSince(), filter.getBefore(), instant, uuid, i) : FlowKt.flowOf(CollectionsKt.emptyList());
    }
}
