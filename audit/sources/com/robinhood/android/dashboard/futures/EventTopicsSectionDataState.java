package com.robinhood.android.dashboard.futures;

import com.robinhood.android.dashboard.futures.EventTopicsSectionViewState;
import com.robinhood.android.eventcontracts.experiments.AcqPredictionMarketsHomeTabEnhancementExperiment2;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import com.robinhood.android.udf.StateProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventTopicsSectionDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$BA\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JH\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState;", "", "eventTopics", "", "Lcom/robinhood/android/models/event/db/arsenal/EventTopic;", "isInEcShimmerExperiment", "", "hasOpenedEcHub", "eventContractsCount", "", "eventContractsEnhancementVariant", "Lcom/robinhood/android/eventcontracts/experiments/AcqPredictionMarketsHomeTabVariant;", "<init>", "(Ljava/util/List;ZZLjava/lang/Long;Lcom/robinhood/android/eventcontracts/experiments/AcqPredictionMarketsHomeTabVariant;)V", "getEventTopics", "()Ljava/util/List;", "()Z", "getHasOpenedEcHub", "getEventContractsCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEventContractsEnhancementVariant", "()Lcom/robinhood/android/eventcontracts/experiments/AcqPredictionMarketsHomeTabVariant;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;ZZLjava/lang/Long;Lcom/robinhood/android/eventcontracts/experiments/AcqPredictionMarketsHomeTabVariant;)Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState;", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-dashboard-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EventTopicsSectionDataState {
    private final Long eventContractsCount;
    private final AcqPredictionMarketsHomeTabEnhancementExperiment2 eventContractsEnhancementVariant;
    private final List<EventTopic> eventTopics;
    private final boolean hasOpenedEcHub;
    private final boolean isInEcShimmerExperiment;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public EventTopicsSectionDataState() {
        this(null, false, false, null, null, 31, null);
    }

    public static /* synthetic */ EventTopicsSectionDataState copy$default(EventTopicsSectionDataState eventTopicsSectionDataState, List list, boolean z, boolean z2, Long l, AcqPredictionMarketsHomeTabEnhancementExperiment2 acqPredictionMarketsHomeTabEnhancementExperiment2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eventTopicsSectionDataState.eventTopics;
        }
        if ((i & 2) != 0) {
            z = eventTopicsSectionDataState.isInEcShimmerExperiment;
        }
        if ((i & 4) != 0) {
            z2 = eventTopicsSectionDataState.hasOpenedEcHub;
        }
        if ((i & 8) != 0) {
            l = eventTopicsSectionDataState.eventContractsCount;
        }
        if ((i & 16) != 0) {
            acqPredictionMarketsHomeTabEnhancementExperiment2 = eventTopicsSectionDataState.eventContractsEnhancementVariant;
        }
        AcqPredictionMarketsHomeTabEnhancementExperiment2 acqPredictionMarketsHomeTabEnhancementExperiment22 = acqPredictionMarketsHomeTabEnhancementExperiment2;
        boolean z3 = z2;
        return eventTopicsSectionDataState.copy(list, z, z3, l, acqPredictionMarketsHomeTabEnhancementExperiment22);
    }

    public final List<EventTopic> component1() {
        return this.eventTopics;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsInEcShimmerExperiment() {
        return this.isInEcShimmerExperiment;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasOpenedEcHub() {
        return this.hasOpenedEcHub;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getEventContractsCount() {
        return this.eventContractsCount;
    }

    /* renamed from: component5, reason: from getter */
    public final AcqPredictionMarketsHomeTabEnhancementExperiment2 getEventContractsEnhancementVariant() {
        return this.eventContractsEnhancementVariant;
    }

    public final EventTopicsSectionDataState copy(List<EventTopic> eventTopics, boolean isInEcShimmerExperiment, boolean hasOpenedEcHub, Long eventContractsCount, AcqPredictionMarketsHomeTabEnhancementExperiment2 eventContractsEnhancementVariant) {
        Intrinsics.checkNotNullParameter(eventTopics, "eventTopics");
        Intrinsics.checkNotNullParameter(eventContractsEnhancementVariant, "eventContractsEnhancementVariant");
        return new EventTopicsSectionDataState(eventTopics, isInEcShimmerExperiment, hasOpenedEcHub, eventContractsCount, eventContractsEnhancementVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTopicsSectionDataState)) {
            return false;
        }
        EventTopicsSectionDataState eventTopicsSectionDataState = (EventTopicsSectionDataState) other;
        return Intrinsics.areEqual(this.eventTopics, eventTopicsSectionDataState.eventTopics) && this.isInEcShimmerExperiment == eventTopicsSectionDataState.isInEcShimmerExperiment && this.hasOpenedEcHub == eventTopicsSectionDataState.hasOpenedEcHub && Intrinsics.areEqual(this.eventContractsCount, eventTopicsSectionDataState.eventContractsCount) && this.eventContractsEnhancementVariant == eventTopicsSectionDataState.eventContractsEnhancementVariant;
    }

    public int hashCode() {
        int iHashCode = ((((this.eventTopics.hashCode() * 31) + Boolean.hashCode(this.isInEcShimmerExperiment)) * 31) + Boolean.hashCode(this.hasOpenedEcHub)) * 31;
        Long l = this.eventContractsCount;
        return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.eventContractsEnhancementVariant.hashCode();
    }

    public String toString() {
        return "EventTopicsSectionDataState(eventTopics=" + this.eventTopics + ", isInEcShimmerExperiment=" + this.isInEcShimmerExperiment + ", hasOpenedEcHub=" + this.hasOpenedEcHub + ", eventContractsCount=" + this.eventContractsCount + ", eventContractsEnhancementVariant=" + this.eventContractsEnhancementVariant + ")";
    }

    public EventTopicsSectionDataState(List<EventTopic> eventTopics, boolean z, boolean z2, Long l, AcqPredictionMarketsHomeTabEnhancementExperiment2 eventContractsEnhancementVariant) {
        Intrinsics.checkNotNullParameter(eventTopics, "eventTopics");
        Intrinsics.checkNotNullParameter(eventContractsEnhancementVariant, "eventContractsEnhancementVariant");
        this.eventTopics = eventTopics;
        this.isInEcShimmerExperiment = z;
        this.hasOpenedEcHub = z2;
        this.eventContractsCount = l;
        this.eventContractsEnhancementVariant = eventContractsEnhancementVariant;
    }

    public /* synthetic */ EventTopicsSectionDataState(List list, boolean z, boolean z2, Long l, AcqPredictionMarketsHomeTabEnhancementExperiment2 acqPredictionMarketsHomeTabEnhancementExperiment2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? AcqPredictionMarketsHomeTabEnhancementExperiment2.CONTROL : acqPredictionMarketsHomeTabEnhancementExperiment2);
    }

    public final List<EventTopic> getEventTopics() {
        return this.eventTopics;
    }

    public final boolean isInEcShimmerExperiment() {
        return this.isInEcShimmerExperiment;
    }

    public final boolean getHasOpenedEcHub() {
        return this.hasOpenedEcHub;
    }

    public final Long getEventContractsCount() {
        return this.eventContractsCount;
    }

    public final AcqPredictionMarketsHomeTabEnhancementExperiment2 getEventContractsEnhancementVariant() {
        return this.eventContractsEnhancementVariant;
    }

    /* compiled from: EventTopicsSectionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState;", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState;", "<init>", "()V", "reduce", "dataState", "lib-dashboard-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<EventTopicsSectionDataState, EventTopicsSectionViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public EventTopicsSectionViewState reduce(EventTopicsSectionDataState dataState) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (!dataState.getEventTopics().isEmpty()) {
                ImmutableList3 persistentList = extensions2.toPersistentList(dataState.getEventTopics());
                boolean z4 = false;
                if (!dataState.isInEcShimmerExperiment() || dataState.getHasOpenedEcHub()) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z4 = true;
                    z2 = true;
                }
                Long eventContractsCount = dataState.getEventContractsCount();
                if (dataState.getEventContractsEnhancementVariant() == AcqPredictionMarketsHomeTabEnhancementExperiment2.MEMBER) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (dataState.getEventContractsEnhancementVariant() != AcqPredictionMarketsHomeTabEnhancementExperiment2.MEMBER2) {
                    z3 = z;
                }
                return new EventTopicsSectionViewState.Loaded(persistentList, z4, eventContractsCount, z2, z3);
            }
            return EventTopicsSectionViewState.Empty.INSTANCE;
        }
    }
}
