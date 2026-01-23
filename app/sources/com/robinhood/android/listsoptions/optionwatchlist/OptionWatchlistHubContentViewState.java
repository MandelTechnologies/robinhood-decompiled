package com.robinhood.android.listsoptions.optionwatchlist;

import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: OptionWatchlistHubContentViewState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007J\t\u0010&\u001a\u00020\u0003HÂ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003JU\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020$HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0018¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentViewState;", "", "sortOption", "Lcom/robinhood/models/ui/SortOption;", "graphState", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphViewState;", "isLoadingListItems", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "optionWatchlistItems", "", "Lcom/robinhood/models/ui/OptionStrategyCuratedListEligible;", "updatedListErrorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/ui/SortOption;Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphViewState;ZLcom/robinhood/models/db/MarketHours;Ljava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getGraphState", "()Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphViewState;", "()Z", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getOptionWatchlistItems", "()Ljava/util/List;", "getUpdatedListErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "localSortOption", "getLocalSortOption", "()Lcom/robinhood/models/ui/SortOption;", "activeWatchlistItems", "getActiveWatchlistItems", "expiredWatchlistItems", "getExpiredWatchlistItems", "getItem", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "isExpired", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OptionWatchlistHubContentViewState {
    private final OptionWatchlistGraphViewState graphState;
    private final boolean isLoadingListItems;
    private final SortOption localSortOption;
    private final MarketHours marketHours;
    private final List<OptionStrategyCuratedListEligible> optionWatchlistItems;
    private final SortOption sortOption;
    private final UiEvent<Throwable> updatedListErrorEvent;

    public OptionWatchlistHubContentViewState() {
        this(null, null, false, null, null, null, 63, null);
    }

    /* renamed from: component1, reason: from getter */
    private final SortOption getSortOption() {
        return this.sortOption;
    }

    public static /* synthetic */ OptionWatchlistHubContentViewState copy$default(OptionWatchlistHubContentViewState optionWatchlistHubContentViewState, SortOption sortOption, OptionWatchlistGraphViewState optionWatchlistGraphViewState, boolean z, MarketHours marketHours, List list, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            sortOption = optionWatchlistHubContentViewState.sortOption;
        }
        if ((i & 2) != 0) {
            optionWatchlistGraphViewState = optionWatchlistHubContentViewState.graphState;
        }
        if ((i & 4) != 0) {
            z = optionWatchlistHubContentViewState.isLoadingListItems;
        }
        if ((i & 8) != 0) {
            marketHours = optionWatchlistHubContentViewState.marketHours;
        }
        if ((i & 16) != 0) {
            list = optionWatchlistHubContentViewState.optionWatchlistItems;
        }
        if ((i & 32) != 0) {
            uiEvent = optionWatchlistHubContentViewState.updatedListErrorEvent;
        }
        List list2 = list;
        UiEvent uiEvent2 = uiEvent;
        return optionWatchlistHubContentViewState.copy(sortOption, optionWatchlistGraphViewState, z, marketHours, list2, uiEvent2);
    }

    /* renamed from: component2, reason: from getter */
    public final OptionWatchlistGraphViewState getGraphState() {
        return this.graphState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoadingListItems() {
        return this.isLoadingListItems;
    }

    /* renamed from: component4, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final List<OptionStrategyCuratedListEligible> component5() {
        return this.optionWatchlistItems;
    }

    public final UiEvent<Throwable> component6() {
        return this.updatedListErrorEvent;
    }

    public final OptionWatchlistHubContentViewState copy(SortOption sortOption, OptionWatchlistGraphViewState graphState, boolean isLoadingListItems, MarketHours marketHours, List<OptionStrategyCuratedListEligible> optionWatchlistItems, UiEvent<Throwable> updatedListErrorEvent) {
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Intrinsics.checkNotNullParameter(graphState, "graphState");
        Intrinsics.checkNotNullParameter(optionWatchlistItems, "optionWatchlistItems");
        return new OptionWatchlistHubContentViewState(sortOption, graphState, isLoadingListItems, marketHours, optionWatchlistItems, updatedListErrorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionWatchlistHubContentViewState)) {
            return false;
        }
        OptionWatchlistHubContentViewState optionWatchlistHubContentViewState = (OptionWatchlistHubContentViewState) other;
        return Intrinsics.areEqual(this.sortOption, optionWatchlistHubContentViewState.sortOption) && Intrinsics.areEqual(this.graphState, optionWatchlistHubContentViewState.graphState) && this.isLoadingListItems == optionWatchlistHubContentViewState.isLoadingListItems && Intrinsics.areEqual(this.marketHours, optionWatchlistHubContentViewState.marketHours) && Intrinsics.areEqual(this.optionWatchlistItems, optionWatchlistHubContentViewState.optionWatchlistItems) && Intrinsics.areEqual(this.updatedListErrorEvent, optionWatchlistHubContentViewState.updatedListErrorEvent);
    }

    public int hashCode() {
        int iHashCode = ((((this.sortOption.hashCode() * 31) + this.graphState.hashCode()) * 31) + Boolean.hashCode(this.isLoadingListItems)) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode2 = (((iHashCode + (marketHours == null ? 0 : marketHours.hashCode())) * 31) + this.optionWatchlistItems.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.updatedListErrorEvent;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "OptionWatchlistHubContentViewState(sortOption=" + this.sortOption + ", graphState=" + this.graphState + ", isLoadingListItems=" + this.isLoadingListItems + ", marketHours=" + this.marketHours + ", optionWatchlistItems=" + this.optionWatchlistItems + ", updatedListErrorEvent=" + this.updatedListErrorEvent + ")";
    }

    public OptionWatchlistHubContentViewState(SortOption sortOption, OptionWatchlistGraphViewState graphState, boolean z, MarketHours marketHours, List<OptionStrategyCuratedListEligible> optionWatchlistItems, UiEvent<Throwable> uiEvent) {
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Intrinsics.checkNotNullParameter(graphState, "graphState");
        Intrinsics.checkNotNullParameter(optionWatchlistItems, "optionWatchlistItems");
        this.sortOption = sortOption;
        this.graphState = graphState;
        this.isLoadingListItems = z;
        this.marketHours = marketHours;
        this.optionWatchlistItems = optionWatchlistItems;
        this.updatedListErrorEvent = uiEvent;
        this.localSortOption = sortOption.getSortOrder() == ApiCuratedList.SortOrder.NAME ? SortOption.copy$default(sortOption, ApiCuratedList.SortOrder.SYMBOL, null, 2, null) : sortOption;
    }

    public /* synthetic */ OptionWatchlistHubContentViewState(SortOption sortOption, OptionWatchlistGraphViewState optionWatchlistGraphViewState, boolean z, MarketHours marketHours, List list, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SortOption(ApiCuratedList.SortOrder.CUSTOM, ApiCuratedList.SortDirection.ASCENDING) : sortOption, (i & 2) != 0 ? new OptionWatchlistGraphViewState(null, null, null, 0, null, null, null, null, null, null, 1023, null) : optionWatchlistGraphViewState, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : marketHours, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : uiEvent);
    }

    public final OptionWatchlistGraphViewState getGraphState() {
        return this.graphState;
    }

    public final boolean isLoadingListItems() {
        return this.isLoadingListItems;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final List<OptionStrategyCuratedListEligible> getOptionWatchlistItems() {
        return this.optionWatchlistItems;
    }

    public final UiEvent<Throwable> getUpdatedListErrorEvent() {
        return this.updatedListErrorEvent;
    }

    public final SortOption getLocalSortOption() {
        return this.localSortOption;
    }

    public final List<OptionStrategyCuratedListEligible> getActiveWatchlistItems() {
        return SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(this.optionWatchlistItems), new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentViewState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionWatchlistHubContentViewState._get_activeWatchlistItems_$lambda$0((OptionStrategyCuratedListEligible) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_activeWatchlistItems_$lambda$0(OptionStrategyCuratedListEligible it) {
        List<UiOptionStrategyLeg> legs;
        UiOptionStrategyLeg uiOptionStrategyLeg;
        OptionInstrument optionInstrument;
        Intrinsics.checkNotNullParameter(it, "it");
        UiOptionStrategyInfo optionStrategyInfo = it.getOptionStrategyInfo();
        if (optionStrategyInfo == null || (legs = optionStrategyInfo.getLegs()) == null || (uiOptionStrategyLeg = (UiOptionStrategyLeg) CollectionsKt.firstOrNull((List) legs)) == null || (optionInstrument = uiOptionStrategyLeg.getOptionInstrument()) == null) {
            return false;
        }
        return optionInstrument.isActive();
    }

    public final List<OptionStrategyCuratedListEligible> getExpiredWatchlistItems() {
        return SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(this.optionWatchlistItems), new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionWatchlistHubContentViewState._get_expiredWatchlistItems_$lambda$1((OptionStrategyCuratedListEligible) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_expiredWatchlistItems_$lambda$1(OptionStrategyCuratedListEligible it) {
        List<UiOptionStrategyLeg> legs;
        UiOptionStrategyLeg uiOptionStrategyLeg;
        OptionInstrument optionInstrument;
        Intrinsics.checkNotNullParameter(it, "it");
        UiOptionStrategyInfo optionStrategyInfo = it.getOptionStrategyInfo();
        if (optionStrategyInfo == null || (legs = optionStrategyInfo.getLegs()) == null || (uiOptionStrategyLeg = (UiOptionStrategyLeg) CollectionsKt.firstOrNull((List) legs)) == null || (optionInstrument = uiOptionStrategyLeg.getOptionInstrument()) == null) {
            return false;
        }
        return optionInstrument.isExpired();
    }

    public final OptionStrategyCuratedListEligible getItem(int index, boolean isExpired) {
        return (OptionStrategyCuratedListEligible) CollectionsKt.getOrNull(isExpired ? getExpiredWatchlistItems() : getActiveWatchlistItems(), index);
    }
}
