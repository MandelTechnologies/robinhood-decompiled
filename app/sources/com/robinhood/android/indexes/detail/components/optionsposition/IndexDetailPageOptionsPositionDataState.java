package com.robinhood.android.indexes.detail.components.optionsposition;

import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionQuote;
import com.robinhood.models.p320db.OptionChainCollateral;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageOptionsPositionDataState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionDataState;", "", "fixedIndexInstrumentId", "Ljava/util/UUID;", "aggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "aggregateOptionPositionIdToQuoteMap", "", "Lcom/robinhood/models/db/AggregateOptionQuote;", "collateralForTradableChains", "Lcom/robinhood/models/db/OptionChainCollateral;", "currentAccount", "Lcom/robinhood/models/db/Account;", "inProfitAndLossAverageCostRetirementExperiment", "", "inOptionsPortfolioRiskAnalyzerExperiment", "<init>", "(Ljava/util/UUID;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/robinhood/models/db/Account;ZZ)V", "getFixedIndexInstrumentId", "()Ljava/util/UUID;", "getAggregateOptionPositions", "()Ljava/util/List;", "getAggregateOptionPositionIdToQuoteMap", "()Ljava/util/Map;", "getCollateralForTradableChains", "getCurrentAccount", "()Lcom/robinhood/models/db/Account;", "getInProfitAndLossAverageCostRetirementExperiment", "()Z", "getInOptionsPortfolioRiskAnalyzerExperiment", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageOptionsPositionDataState {
    public static final int $stable = 8;
    private final Map<UUID, AggregateOptionQuote> aggregateOptionPositionIdToQuoteMap;
    private final List<UiAggregateOptionPosition> aggregateOptionPositions;
    private final List<OptionChainCollateral> collateralForTradableChains;
    private final Account currentAccount;
    private final UUID fixedIndexInstrumentId;
    private final boolean inOptionsPortfolioRiskAnalyzerExperiment;
    private final boolean inProfitAndLossAverageCostRetirementExperiment;

    public static /* synthetic */ IndexDetailPageOptionsPositionDataState copy$default(IndexDetailPageOptionsPositionDataState indexDetailPageOptionsPositionDataState, UUID uuid, List list, Map map, List list2, Account account, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = indexDetailPageOptionsPositionDataState.fixedIndexInstrumentId;
        }
        if ((i & 2) != 0) {
            list = indexDetailPageOptionsPositionDataState.aggregateOptionPositions;
        }
        if ((i & 4) != 0) {
            map = indexDetailPageOptionsPositionDataState.aggregateOptionPositionIdToQuoteMap;
        }
        if ((i & 8) != 0) {
            list2 = indexDetailPageOptionsPositionDataState.collateralForTradableChains;
        }
        if ((i & 16) != 0) {
            account = indexDetailPageOptionsPositionDataState.currentAccount;
        }
        if ((i & 32) != 0) {
            z = indexDetailPageOptionsPositionDataState.inProfitAndLossAverageCostRetirementExperiment;
        }
        if ((i & 64) != 0) {
            z2 = indexDetailPageOptionsPositionDataState.inOptionsPortfolioRiskAnalyzerExperiment;
        }
        boolean z3 = z;
        boolean z4 = z2;
        Account account2 = account;
        Map map2 = map;
        return indexDetailPageOptionsPositionDataState.copy(uuid, list, map2, list2, account2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getFixedIndexInstrumentId() {
        return this.fixedIndexInstrumentId;
    }

    public final List<UiAggregateOptionPosition> component2() {
        return this.aggregateOptionPositions;
    }

    public final Map<UUID, AggregateOptionQuote> component3() {
        return this.aggregateOptionPositionIdToQuoteMap;
    }

    public final List<OptionChainCollateral> component4() {
        return this.collateralForTradableChains;
    }

    /* renamed from: component5, reason: from getter */
    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getInProfitAndLossAverageCostRetirementExperiment() {
        return this.inProfitAndLossAverageCostRetirementExperiment;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getInOptionsPortfolioRiskAnalyzerExperiment() {
        return this.inOptionsPortfolioRiskAnalyzerExperiment;
    }

    public final IndexDetailPageOptionsPositionDataState copy(UUID fixedIndexInstrumentId, List<? extends UiAggregateOptionPosition> aggregateOptionPositions, Map<UUID, ? extends AggregateOptionQuote> aggregateOptionPositionIdToQuoteMap, List<OptionChainCollateral> collateralForTradableChains, Account currentAccount, boolean inProfitAndLossAverageCostRetirementExperiment, boolean inOptionsPortfolioRiskAnalyzerExperiment) {
        Intrinsics.checkNotNullParameter(fixedIndexInstrumentId, "fixedIndexInstrumentId");
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionIdToQuoteMap, "aggregateOptionPositionIdToQuoteMap");
        Intrinsics.checkNotNullParameter(collateralForTradableChains, "collateralForTradableChains");
        return new IndexDetailPageOptionsPositionDataState(fixedIndexInstrumentId, aggregateOptionPositions, aggregateOptionPositionIdToQuoteMap, collateralForTradableChains, currentAccount, inProfitAndLossAverageCostRetirementExperiment, inOptionsPortfolioRiskAnalyzerExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageOptionsPositionDataState)) {
            return false;
        }
        IndexDetailPageOptionsPositionDataState indexDetailPageOptionsPositionDataState = (IndexDetailPageOptionsPositionDataState) other;
        return Intrinsics.areEqual(this.fixedIndexInstrumentId, indexDetailPageOptionsPositionDataState.fixedIndexInstrumentId) && Intrinsics.areEqual(this.aggregateOptionPositions, indexDetailPageOptionsPositionDataState.aggregateOptionPositions) && Intrinsics.areEqual(this.aggregateOptionPositionIdToQuoteMap, indexDetailPageOptionsPositionDataState.aggregateOptionPositionIdToQuoteMap) && Intrinsics.areEqual(this.collateralForTradableChains, indexDetailPageOptionsPositionDataState.collateralForTradableChains) && Intrinsics.areEqual(this.currentAccount, indexDetailPageOptionsPositionDataState.currentAccount) && this.inProfitAndLossAverageCostRetirementExperiment == indexDetailPageOptionsPositionDataState.inProfitAndLossAverageCostRetirementExperiment && this.inOptionsPortfolioRiskAnalyzerExperiment == indexDetailPageOptionsPositionDataState.inOptionsPortfolioRiskAnalyzerExperiment;
    }

    public int hashCode() {
        int iHashCode = ((((((this.fixedIndexInstrumentId.hashCode() * 31) + this.aggregateOptionPositions.hashCode()) * 31) + this.aggregateOptionPositionIdToQuoteMap.hashCode()) * 31) + this.collateralForTradableChains.hashCode()) * 31;
        Account account = this.currentAccount;
        return ((((iHashCode + (account == null ? 0 : account.hashCode())) * 31) + Boolean.hashCode(this.inProfitAndLossAverageCostRetirementExperiment)) * 31) + Boolean.hashCode(this.inOptionsPortfolioRiskAnalyzerExperiment);
    }

    public String toString() {
        return "IndexDetailPageOptionsPositionDataState(fixedIndexInstrumentId=" + this.fixedIndexInstrumentId + ", aggregateOptionPositions=" + this.aggregateOptionPositions + ", aggregateOptionPositionIdToQuoteMap=" + this.aggregateOptionPositionIdToQuoteMap + ", collateralForTradableChains=" + this.collateralForTradableChains + ", currentAccount=" + this.currentAccount + ", inProfitAndLossAverageCostRetirementExperiment=" + this.inProfitAndLossAverageCostRetirementExperiment + ", inOptionsPortfolioRiskAnalyzerExperiment=" + this.inOptionsPortfolioRiskAnalyzerExperiment + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndexDetailPageOptionsPositionDataState(UUID fixedIndexInstrumentId, List<? extends UiAggregateOptionPosition> aggregateOptionPositions, Map<UUID, ? extends AggregateOptionQuote> aggregateOptionPositionIdToQuoteMap, List<OptionChainCollateral> collateralForTradableChains, Account account, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(fixedIndexInstrumentId, "fixedIndexInstrumentId");
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionIdToQuoteMap, "aggregateOptionPositionIdToQuoteMap");
        Intrinsics.checkNotNullParameter(collateralForTradableChains, "collateralForTradableChains");
        this.fixedIndexInstrumentId = fixedIndexInstrumentId;
        this.aggregateOptionPositions = aggregateOptionPositions;
        this.aggregateOptionPositionIdToQuoteMap = aggregateOptionPositionIdToQuoteMap;
        this.collateralForTradableChains = collateralForTradableChains;
        this.currentAccount = account;
        this.inProfitAndLossAverageCostRetirementExperiment = z;
        this.inOptionsPortfolioRiskAnalyzerExperiment = z2;
    }

    public final UUID getFixedIndexInstrumentId() {
        return this.fixedIndexInstrumentId;
    }

    public /* synthetic */ IndexDetailPageOptionsPositionDataState(UUID uuid, List list, Map map, List list2, Account account, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : account, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    public final List<UiAggregateOptionPosition> getAggregateOptionPositions() {
        return this.aggregateOptionPositions;
    }

    public final Map<UUID, AggregateOptionQuote> getAggregateOptionPositionIdToQuoteMap() {
        return this.aggregateOptionPositionIdToQuoteMap;
    }

    public final List<OptionChainCollateral> getCollateralForTradableChains() {
        return this.collateralForTradableChains;
    }

    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    public final boolean getInProfitAndLossAverageCostRetirementExperiment() {
        return this.inProfitAndLossAverageCostRetirementExperiment;
    }

    public final boolean getInOptionsPortfolioRiskAnalyzerExperiment() {
        return this.inOptionsPortfolioRiskAnalyzerExperiment;
    }
}
