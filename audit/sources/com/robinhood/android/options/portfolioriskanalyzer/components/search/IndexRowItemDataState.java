package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/IndexRowItemDataState;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/SearchRowItemDataState;", "underlyingId", "Ljava/util/UUID;", "aggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "displayName", "", "symbol", "<init>", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getUnderlyingId", "()Ljava/util/UUID;", "getAggregateOptionPositions", "()Ljava/util/List;", "getDisplayName", "()Ljava/lang/String;", "getSymbol", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IndexRowItemDataState extends OptionsPortfolioRiskAnalyzerSearchDataState4 {
    public static final int $stable = 8;
    private final List<UiAggregateOptionPosition> aggregateOptionPositions;
    private final String displayName;
    private final String symbol;
    private final UUID underlyingId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexRowItemDataState copy$default(IndexRowItemDataState indexRowItemDataState, UUID uuid, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = indexRowItemDataState.underlyingId;
        }
        if ((i & 2) != 0) {
            list = indexRowItemDataState.aggregateOptionPositions;
        }
        if ((i & 4) != 0) {
            str = indexRowItemDataState.displayName;
        }
        if ((i & 8) != 0) {
            str2 = indexRowItemDataState.symbol;
        }
        return indexRowItemDataState.copy(uuid, list, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getUnderlyingId() {
        return this.underlyingId;
    }

    public final List<UiAggregateOptionPosition> component2() {
        return this.aggregateOptionPositions;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final IndexRowItemDataState copy(UUID underlyingId, List<? extends UiAggregateOptionPosition> aggregateOptionPositions, String displayName, String symbol) {
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new IndexRowItemDataState(underlyingId, aggregateOptionPositions, displayName, symbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexRowItemDataState)) {
            return false;
        }
        IndexRowItemDataState indexRowItemDataState = (IndexRowItemDataState) other;
        return Intrinsics.areEqual(this.underlyingId, indexRowItemDataState.underlyingId) && Intrinsics.areEqual(this.aggregateOptionPositions, indexRowItemDataState.aggregateOptionPositions) && Intrinsics.areEqual(this.displayName, indexRowItemDataState.displayName) && Intrinsics.areEqual(this.symbol, indexRowItemDataState.symbol);
    }

    public int hashCode() {
        return (((((this.underlyingId.hashCode() * 31) + this.aggregateOptionPositions.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.symbol.hashCode();
    }

    public String toString() {
        return "IndexRowItemDataState(underlyingId=" + this.underlyingId + ", aggregateOptionPositions=" + this.aggregateOptionPositions + ", displayName=" + this.displayName + ", symbol=" + this.symbol + ")";
    }

    @Override // com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDataState4
    public UUID getUnderlyingId() {
        return this.underlyingId;
    }

    @Override // com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDataState4
    public List<UiAggregateOptionPosition> getAggregateOptionPositions() {
        return this.aggregateOptionPositions;
    }

    @Override // com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDataState4
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDataState4
    public String getSymbol() {
        return this.symbol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IndexRowItemDataState(UUID underlyingId, List<? extends UiAggregateOptionPosition> aggregateOptionPositions, String displayName, String symbol) {
        super(underlyingId, aggregateOptionPositions, displayName, symbol, null);
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.underlyingId = underlyingId;
        this.aggregateOptionPositions = aggregateOptionPositions;
        this.displayName = displayName;
        this.symbol = symbol;
    }
}
