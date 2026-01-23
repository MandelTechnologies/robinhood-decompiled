package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B/\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/SearchRowItemDataState;", "", "underlyingId", "Ljava/util/UUID;", "aggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "displayName", "", "symbol", "<init>", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getUnderlyingId", "()Ljava/util/UUID;", "getAggregateOptionPositions", "()Ljava/util/List;", "getDisplayName", "()Ljava/lang/String;", "getSymbol", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/EquityRowItemDataState;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/IndexRowItemDataState;", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.SearchRowItemDataState, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionsPortfolioRiskAnalyzerSearchDataState4 {
    public static final int $stable = 8;
    private final List<UiAggregateOptionPosition> aggregateOptionPositions;
    private final String displayName;
    private final String symbol;
    private final UUID underlyingId;

    public /* synthetic */ OptionsPortfolioRiskAnalyzerSearchDataState4(UUID uuid, List list, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, list, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OptionsPortfolioRiskAnalyzerSearchDataState4(UUID uuid, List<? extends UiAggregateOptionPosition> list, String str, String str2) {
        this.underlyingId = uuid;
        this.aggregateOptionPositions = list;
        this.displayName = str;
        this.symbol = str2;
    }

    public UUID getUnderlyingId() {
        return this.underlyingId;
    }

    public List<UiAggregateOptionPosition> getAggregateOptionPositions() {
        return this.aggregateOptionPositions;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
