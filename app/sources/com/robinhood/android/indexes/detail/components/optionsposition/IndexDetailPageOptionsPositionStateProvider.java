package com.robinhood.android.indexes.detail.components.optionsposition;

import android.content.res.Resources;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.detail.component.optionsposition.DetailPageOptionsPositionRowViewState;
import com.robinhood.android.common.detail.component.optionsposition.DetailPageOptionsPositionViewState;
import com.robinhood.android.common.detail.component.optionsposition.OptionsPortfolioRiskAnalyzerEntryPointViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.common.OptionExtensions2;
import com.robinhood.android.options.optionsstring.common.UiOptionStrategyDisplays;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLoss;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLoss2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.Decimals3;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionPosition;
import com.robinhood.models.p320db.AggregateOptionQuote;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionChainCollateral;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: IndexDetailPageOptionsPositionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionDataState;", "Lcom/robinhood/android/common/detail/component/optionsposition/DetailPageOptionsPositionViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getCashCollateralValue", "", "collateralList", "", "Lcom/robinhood/models/db/OptionChainCollateral;", "reduce", "dataState", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndexDetailPageOptionsPositionStateProvider implements StateProvider<IndexDetailPageOptionsPositionDataState, DetailPageOptionsPositionViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public IndexDetailPageOptionsPositionStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    private final String getCashCollateralValue(List<OptionChainCollateral> collateralList) {
        List<OptionChainCollateral> list = collateralList;
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (Object obj : list) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            BigDecimal ZERO = ((OptionChainCollateral) obj).getCollateral().getCash().getAmount();
            if (ZERO == null) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            bigDecimalAdd = bigDecimalAdd.add(ZERO);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd);
        BigDecimal bigDecimalAdd2 = BigDecimal.ZERO;
        for (Object obj2 : list) {
            Intrinsics.checkNotNull(bigDecimalAdd2);
            BigDecimal ZERO2 = ((OptionChainCollateral) obj2).getCollateralHeldForOrders().getCash().getAmount();
            if (ZERO2 == null) {
                ZERO2 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            }
            bigDecimalAdd2 = bigDecimalAdd2.add(ZERO2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd2);
        BigDecimal bigDecimalAdd3 = bigDecimalAdd.add(bigDecimalAdd2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "add(...)");
        if (bigDecimalAdd3.compareTo(BigDecimal.ZERO) > 0) {
            return Formats.getPriceFormat().format(bigDecimalAdd3);
        }
        return null;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public DetailPageOptionsPositionViewState reduce(IndexDetailPageOptionsPositionDataState dataState) throws Resources.NotFoundException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Decimals3 adjustedMarkPrice;
        BigDecimal unsignedValue;
        String str6;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<UiAggregateOptionPosition> aggregateOptionPositions = dataState.getAggregateOptionPositions();
        Map<UUID, AggregateOptionQuote> aggregateOptionPositionIdToQuoteMap = dataState.getAggregateOptionPositionIdToQuoteMap();
        Account currentAccount = dataState.getCurrentAccount();
        UnrealizedProfitAndLoss optionsUnrealizedProfitAndLoss = UnrealizedProfitAndLoss2.getOptionsUnrealizedProfitAndLoss(aggregateOptionPositions, aggregateOptionPositionIdToQuoteMap, currentAccount != null ? currentAccount.getBrokerageAccountType() : null, dataState.getInProfitAndLossAverageCostRetirementExperiment());
        boolean z = !dataState.getAggregateOptionPositions().isEmpty();
        List<UiAggregateOptionPosition> aggregateOptionPositions2 = dataState.getAggregateOptionPositions();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal bigDecimalAdd = bigDecimal;
        for (Object obj : aggregateOptionPositions2) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            bigDecimalAdd = bigDecimalAdd.add(((UiAggregateOptionPosition) obj).getAggregateOptionPosition().getDisplayQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd);
        String str7 = (optionsUnrealizedProfitAndLoss == null || (str6 = Formats.getCurrencyFormat().format(optionsUnrealizedProfitAndLoss.getMarketValue())) == null) ? "-" : str6;
        String cashCollateralValue = getCashCollateralValue(dataState.getCollateralForTradableChains());
        Resources resources = this.resources;
        int i = C11048R.string.general_number_and_percent_change_format;
        if (optionsUnrealizedProfitAndLoss == null || (str = Formats.getCurrencyDeltaFormat().format(optionsUnrealizedProfitAndLoss.getTodaysReturn())) == null) {
            str = "-";
        }
        if (optionsUnrealizedProfitAndLoss == null || (str2 = Formats.getPercentDeltaFormat().format(BigDecimals7.safeDivide(optionsUnrealizedProfitAndLoss.getTodaysReturn(), optionsUnrealizedProfitAndLoss.getCostForTodaysReturn().abs()))) == null) {
            str2 = "-";
        }
        String string2 = resources.getString(i, str, str2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Resources resources2 = this.resources;
        int i2 = C11048R.string.general_number_and_percent_change_format;
        if (optionsUnrealizedProfitAndLoss == null || (str3 = Formats.getCurrencyDeltaFormat().format(optionsUnrealizedProfitAndLoss.getTotalReturn())) == null) {
            str3 = "-";
        }
        if (optionsUnrealizedProfitAndLoss == null || (str4 = Formats.getPercentDeltaFormat().format(BigDecimals7.safeDivide(optionsUnrealizedProfitAndLoss.getTotalReturn(), optionsUnrealizedProfitAndLoss.getCostForTotalReturn().abs()))) == null) {
            str4 = "-";
        }
        String string3 = resources2.getString(i2, str3, str4);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        List<UiAggregateOptionPosition> aggregateOptionPositions3 = dataState.getAggregateOptionPositions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(aggregateOptionPositions3, 10));
        Iterator it = aggregateOptionPositions3.iterator();
        while (it.hasNext()) {
            UiAggregateOptionPosition uiAggregateOptionPosition = (UiAggregateOptionPosition) it.next();
            AggregateOptionPosition aggregateOptionPosition = uiAggregateOptionPosition.getAggregateOptionPosition();
            Iterator it2 = it;
            String string4 = OptionExtensions2.getStrategyTitle(uiAggregateOptionPosition, this.resources, true, OptionChain.UnderlyingType.INDEX).toString();
            String string5 = UiOptionStrategyDisplays.getSubtitleString((UiOptionStrategyDisplay) uiAggregateOptionPosition, this.resources, uiAggregateOptionPosition.getOptionChain().getSettleOnOpen(), true).toString();
            AggregateOptionQuote aggregateOptionQuote = dataState.getAggregateOptionPositionIdToQuoteMap().get(aggregateOptionPosition.getId());
            if (aggregateOptionQuote == null || (adjustedMarkPrice = aggregateOptionQuote.getAdjustedMarkPrice()) == null || (unsignedValue = adjustedMarkPrice.getUnsignedValue()) == null || (str5 = Formats.getPriceFormat().format(unsignedValue)) == null) {
                str5 = "-";
            }
            arrayList.add(new DetailPageOptionsPositionRowViewState(string4, string5, str5, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.StrategyCode(aggregateOptionPosition.getStrategyCode(), false, extensions2.persistentListOf(aggregateOptionPosition.getStrategyCode()), aggregateOptionPosition.getAccountNumber(), null, 18, null))));
            it = it2;
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (!dataState.getAggregateOptionPositions().isEmpty() && dataState.getCurrentAccount() != null) {
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CHART_24;
            String string6 = this.resources.getString(C23386R.string.option_portfolio_risk_analyzer_simulate_all_positions);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            listCreateListBuilder.add(new OptionsPortfolioRiskAnalyzerEntryPointViewState(serverToBentoAssetMapper2, new AnnotatedString(string6, null, 2, null), new OptionsPortfolioRiskAnalyzer.WithAccountNumber(dataState.getCurrentAccount().getAccountNumber(), dataState.getFixedIndexInstrumentId())));
        }
        return new DetailPageOptionsPositionViewState(z, bigDecimalAdd, cashCollateralValue, str7, string2, string3, immutableList, extensions2.toImmutableList(CollectionsKt.build(listCreateListBuilder)));
    }
}
