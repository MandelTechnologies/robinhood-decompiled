package com.robinhood.android.eventcontracts.hub.p134v2.home;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.hub.p134v2.C16533R;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubLayout;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HubDefaultCategoryContentDataState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\u0083\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001cR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDataState;", "", "categoryId", "Ljava/util/UUID;", "ecHubLayoutComponents", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubLayout;", "ecHubEventStates", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "contractIdsToQuotes", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdsToPositions", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "formatPriceAsPercent", "", "isInAcqStreamlinedTradeFlowExperiment", "<init>", "(Ljava/util/UUID;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZZ)V", "getCategoryId", "()Ljava/util/UUID;", "getEcHubLayoutComponents", "()Ljava/util/List;", "getEcHubEventStates", "()Ljava/util/Map;", "getContractIdsToQuotes", "getContractIdsToPositions", "getFormatPriceAsPercent", "()Z", "hubUiComponents", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubLayoutComponent;", "getHubUiComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class HubDefaultCategoryContentDataState {
    public static final int $stable = 8;
    private final UUID categoryId;
    private final Map<UUID, UiEventContractPosition> contractIdsToPositions;
    private final Map<UUID, EventQuote> contractIdsToQuotes;
    private final Map<UUID, PredictionMarketEventState> ecHubEventStates;
    private final List<EcHubLayout> ecHubLayoutComponents;
    private final boolean formatPriceAsPercent;
    private final boolean isInAcqStreamlinedTradeFlowExperiment;

    public HubDefaultCategoryContentDataState() {
        this(null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ HubDefaultCategoryContentDataState copy$default(HubDefaultCategoryContentDataState hubDefaultCategoryContentDataState, UUID uuid, List list, Map map, Map map2, Map map3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = hubDefaultCategoryContentDataState.categoryId;
        }
        if ((i & 2) != 0) {
            list = hubDefaultCategoryContentDataState.ecHubLayoutComponents;
        }
        if ((i & 4) != 0) {
            map = hubDefaultCategoryContentDataState.ecHubEventStates;
        }
        if ((i & 8) != 0) {
            map2 = hubDefaultCategoryContentDataState.contractIdsToQuotes;
        }
        if ((i & 16) != 0) {
            map3 = hubDefaultCategoryContentDataState.contractIdsToPositions;
        }
        if ((i & 32) != 0) {
            z = hubDefaultCategoryContentDataState.formatPriceAsPercent;
        }
        if ((i & 64) != 0) {
            z2 = hubDefaultCategoryContentDataState.isInAcqStreamlinedTradeFlowExperiment;
        }
        boolean z3 = z;
        boolean z4 = z2;
        Map map4 = map3;
        Map map5 = map;
        return hubDefaultCategoryContentDataState.copy(uuid, list, map5, map2, map4, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCategoryId() {
        return this.categoryId;
    }

    public final List<EcHubLayout> component2() {
        return this.ecHubLayoutComponents;
    }

    public final Map<UUID, PredictionMarketEventState> component3() {
        return this.ecHubEventStates;
    }

    public final Map<UUID, EventQuote> component4() {
        return this.contractIdsToQuotes;
    }

    public final Map<UUID, UiEventContractPosition> component5() {
        return this.contractIdsToPositions;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getFormatPriceAsPercent() {
        return this.formatPriceAsPercent;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInAcqStreamlinedTradeFlowExperiment() {
        return this.isInAcqStreamlinedTradeFlowExperiment;
    }

    public final HubDefaultCategoryContentDataState copy(UUID categoryId, List<EcHubLayout> ecHubLayoutComponents, Map<UUID, PredictionMarketEventState> ecHubEventStates, Map<UUID, EventQuote> contractIdsToQuotes, Map<UUID, UiEventContractPosition> contractIdsToPositions, boolean formatPriceAsPercent, boolean isInAcqStreamlinedTradeFlowExperiment) {
        return new HubDefaultCategoryContentDataState(categoryId, ecHubLayoutComponents, ecHubEventStates, contractIdsToQuotes, contractIdsToPositions, formatPriceAsPercent, isInAcqStreamlinedTradeFlowExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HubDefaultCategoryContentDataState)) {
            return false;
        }
        HubDefaultCategoryContentDataState hubDefaultCategoryContentDataState = (HubDefaultCategoryContentDataState) other;
        return Intrinsics.areEqual(this.categoryId, hubDefaultCategoryContentDataState.categoryId) && Intrinsics.areEqual(this.ecHubLayoutComponents, hubDefaultCategoryContentDataState.ecHubLayoutComponents) && Intrinsics.areEqual(this.ecHubEventStates, hubDefaultCategoryContentDataState.ecHubEventStates) && Intrinsics.areEqual(this.contractIdsToQuotes, hubDefaultCategoryContentDataState.contractIdsToQuotes) && Intrinsics.areEqual(this.contractIdsToPositions, hubDefaultCategoryContentDataState.contractIdsToPositions) && this.formatPriceAsPercent == hubDefaultCategoryContentDataState.formatPriceAsPercent && this.isInAcqStreamlinedTradeFlowExperiment == hubDefaultCategoryContentDataState.isInAcqStreamlinedTradeFlowExperiment;
    }

    public int hashCode() {
        UUID uuid = this.categoryId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        List<EcHubLayout> list = this.ecHubLayoutComponents;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<UUID, PredictionMarketEventState> map = this.ecHubEventStates;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<UUID, EventQuote> map2 = this.contractIdsToQuotes;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<UUID, UiEventContractPosition> map3 = this.contractIdsToPositions;
        return ((((iHashCode4 + (map3 != null ? map3.hashCode() : 0)) * 31) + Boolean.hashCode(this.formatPriceAsPercent)) * 31) + Boolean.hashCode(this.isInAcqStreamlinedTradeFlowExperiment);
    }

    public String toString() {
        return "HubDefaultCategoryContentDataState(categoryId=" + this.categoryId + ", ecHubLayoutComponents=" + this.ecHubLayoutComponents + ", ecHubEventStates=" + this.ecHubEventStates + ", contractIdsToQuotes=" + this.contractIdsToQuotes + ", contractIdsToPositions=" + this.contractIdsToPositions + ", formatPriceAsPercent=" + this.formatPriceAsPercent + ", isInAcqStreamlinedTradeFlowExperiment=" + this.isInAcqStreamlinedTradeFlowExperiment + ")";
    }

    public HubDefaultCategoryContentDataState(UUID uuid, List<EcHubLayout> list, Map<UUID, PredictionMarketEventState> map, Map<UUID, EventQuote> map2, Map<UUID, UiEventContractPosition> map3, boolean z, boolean z2) {
        this.categoryId = uuid;
        this.ecHubLayoutComponents = list;
        this.ecHubEventStates = map;
        this.contractIdsToQuotes = map2;
        this.contractIdsToPositions = map3;
        this.formatPriceAsPercent = z;
        this.isInAcqStreamlinedTradeFlowExperiment = z2;
    }

    public /* synthetic */ HubDefaultCategoryContentDataState(UUID uuid, List list, Map map, Map map2, Map map3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : map2, (i & 16) != 0 ? null : map3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    public final UUID getCategoryId() {
        return this.categoryId;
    }

    public final List<EcHubLayout> getEcHubLayoutComponents() {
        return this.ecHubLayoutComponents;
    }

    public final Map<UUID, PredictionMarketEventState> getEcHubEventStates() {
        return this.ecHubEventStates;
    }

    public final Map<UUID, EventQuote> getContractIdsToQuotes() {
        return this.contractIdsToQuotes;
    }

    public final Map<UUID, UiEventContractPosition> getContractIdsToPositions() {
        return this.contractIdsToPositions;
    }

    public final boolean getFormatPriceAsPercent() {
        return this.formatPriceAsPercent;
    }

    public final boolean isInAcqStreamlinedTradeFlowExperiment() {
        return this.isInAcqStreamlinedTradeFlowExperiment;
    }

    public final ImmutableList<HubDefaultCategoryContentViewState3> getHubUiComponents() {
        Map<UUID, PredictionMarketEventState> map;
        List<HubDefaultCategoryContentViewState3> listListOf;
        int iIntValue;
        List<EcHubLayout> list = this.ecHubLayoutComponents;
        if (list == null || list.isEmpty() || (map = this.ecHubEventStates) == null || map.isEmpty()) {
            return null;
        }
        List<EcHubLayout> list2 = this.ecHubLayoutComponents;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            EcHubLayout.EcHubLayoutComponent component = ((EcHubLayout) it.next()).getComponent();
            if (component instanceof EcHubLayout.EcHubLayoutComponent.EcHubSectionComponent) {
                EcHubLayout.EcHubLayoutComponent.EcHubSectionComponent ecHubSectionComponent = (EcHubLayout.EcHubLayoutComponent.EcHubSectionComponent) component;
                String header = ecHubSectionComponent.getHeader();
                listListOf = new ArrayList<>();
                listListOf.add(new SectionHeaderComponentViewState(ecHubSectionComponent.getHeader()));
                listListOf.addAll(HubDefaultCategoryContentStateProvider.INSTANCE.generateCardViewState(ecHubSectionComponent.getPreviewEvents(), this.ecHubEventStates, this.contractIdsToQuotes, this.contractIdsToPositions, header, this.formatPriceAsPercent, this.isInAcqStreamlinedTradeFlowExperiment));
                Integer totalEventsCount = ecHubSectionComponent.getTotalEventsCount();
                if (totalEventsCount != null && (iIntValue = totalEventsCount.intValue() - ecHubSectionComponent.getPreviewEvents().size()) > 0) {
                    listListOf.add(new SeeMoreCtaComponentViewState(header, StringResource.INSTANCE.invoke(C16533R.string.see_more_cta_label, Integer.valueOf(iIntValue)), ecHubSectionComponent.getNodeId()));
                }
            } else if (component instanceof EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent) {
                listListOf = HubDefaultCategoryContentStateProvider.INSTANCE.generateCardViewState(CollectionsKt.listOf(component), this.ecHubEventStates, this.contractIdsToQuotes, this.contractIdsToPositions, "no_section", this.formatPriceAsPercent, this.isInAcqStreamlinedTradeFlowExperiment);
            } else if (component instanceof EcHubLayout.EcHubLayoutComponent.EcHubSectionDividerComponent) {
                listListOf = CollectionsKt.listOf(new SectionDividerComponentViewState(((EcHubLayout.EcHubLayoutComponent.EcHubSectionDividerComponent) component).getDisplayText()));
            } else {
                if (component != null) {
                    throw new NoWhenBranchMatchedException();
                }
                listListOf = null;
            }
            if (listListOf != null) {
                arrayList.add(listListOf);
            }
        }
        return extensions2.toPersistentList(CollectionsKt.flatten(arrayList));
    }
}
