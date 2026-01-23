package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDataState;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchViewState;", "<init>", "()V", "reduce", "dataState", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerSearchStateProvider implements StateProvider<OptionsPortfolioRiskAnalyzerSearchDataState, OptionsPortfolioRiskAnalyzerSearchViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsPortfolioRiskAnalyzerSearchViewState reduce(OptionsPortfolioRiskAnalyzerSearchDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        String query = dataState.getQuery();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (OptionsPortfolioRiskAnalyzerSearchDataState4 optionsPortfolioRiskAnalyzerSearchDataState4 : dataState.getRowItems()) {
            if (StringsKt.contains((CharSequence) optionsPortfolioRiskAnalyzerSearchDataState4.getDisplayName(), (CharSequence) dataState.getQuery(), true) || StringsKt.contains((CharSequence) optionsPortfolioRiskAnalyzerSearchDataState4.getSymbol(), (CharSequence) dataState.getQuery(), true)) {
                List<UiAggregateOptionPosition> aggregateOptionPositions = optionsPortfolioRiskAnalyzerSearchDataState4.getAggregateOptionPositions();
                BigDecimal bigDecimalAdd = BigDecimal.ZERO;
                for (Object obj : aggregateOptionPositions) {
                    Intrinsics.checkNotNull(bigDecimalAdd);
                    bigDecimalAdd = bigDecimalAdd.add(((UiAggregateOptionPosition) obj).getAggregateOptionPosition().getDisplayQuantity());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                }
                Intrinsics.checkNotNull(bigDecimalAdd);
                if (optionsPortfolioRiskAnalyzerSearchDataState4 instanceof EquityRowItemDataState) {
                    EquityRowItemDataState equityRowItemDataState = (EquityRowItemDataState) optionsPortfolioRiskAnalyzerSearchDataState4;
                    BigDecimal bigDecimal = (equityRowItemDataState.getPosition() == null || equityRowItemDataState.getPosition().getDisplayQuantity().compareTo(BigDecimal.ZERO) == 0) ? BigDecimal.ZERO : BigDecimal.ONE;
                    Intrinsics.checkNotNull(bigDecimal);
                    BigDecimal bigDecimalAdd2 = bigDecimalAdd.add(bigDecimal);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                    listCreateListBuilder.add(new OptionsPortfolioRiskAnalyzerSearchPositionRowViewState(equityRowItemDataState.getUnderlyingId(), equityRowItemDataState.getDisplayName(), equityRowItemDataState.getSymbol(), bigDecimalAdd2.intValue(), true));
                } else {
                    if (!(optionsPortfolioRiskAnalyzerSearchDataState4 instanceof IndexRowItemDataState)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IndexRowItemDataState indexRowItemDataState = (IndexRowItemDataState) optionsPortfolioRiskAnalyzerSearchDataState4;
                    listCreateListBuilder.add(new OptionsPortfolioRiskAnalyzerSearchPositionRowViewState(indexRowItemDataState.getUnderlyingId(), indexRowItemDataState.getDisplayName(), indexRowItemDataState.getSymbol(), bigDecimalAdd.intValue(), false));
                }
            }
        }
        return new OptionsPortfolioRiskAnalyzerSearchViewState(query, extensions2.toPersistentList(CollectionsKt.build(listCreateListBuilder)));
    }
}
