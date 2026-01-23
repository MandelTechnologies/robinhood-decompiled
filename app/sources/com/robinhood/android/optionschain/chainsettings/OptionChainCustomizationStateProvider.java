package com.robinhood.android.optionschain.chainsettings;

import android.content.res.Resources;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.optionchain.chainsettings.OptionChainEntryPointType;
import com.robinhood.android.optionchain.chainsettings.OptionChainFallbackMetrics;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode3;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.OptionSeenContext;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.Either;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionChainCustomizationStateProvider.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\f\u0010\u0013\u001a\u00020\u000b*\u00020\u0010H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDataState;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "getEntryPointId", "", "getEntryPointType", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainEntryPointType;", "getFallbackType", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/db/OrderSide;", "Lcom/robinhood/models/api/OptionStrategyType;", "getHeaderTitle", "getCustomizationTitle", "getMetricsInHighlightedCategory", "", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "getHighlightedCategoryLabel", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionChainCustomizationStateProvider implements StateProvider<OptionChainCustomizationDataState, OptionChainCustomizationViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: OptionChainCustomizationStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionChainCustomizationStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionChainCustomizationViewState reduce(OptionChainCustomizationDataState dataState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OptionChainCustomizationLaunchMode launchMode = dataState.getLaunchMode();
        OptionChainCustomizationLaunchMode.StrategyBuilder strategyBuilder = launchMode instanceof OptionChainCustomizationLaunchMode.StrategyBuilder ? (OptionChainCustomizationLaunchMode.StrategyBuilder) launchMode : null;
        OptionSeenContext optionSeenContext = Intrinsics.areEqual(strategyBuilder != null ? strategyBuilder.getSource() : null, OptionChainCustomizationLaunchMode3.SOURCE_CHAIN_CUSTOMIZATION_STRATEGY_BUILDER_DEEPLINK) ? OptionSeenContext.SEEN_OPTION_CHAIN_BUILDER_SETTINGS_NUX : null;
        String entryPointId = getEntryPointId(dataState);
        OptionChainEntryPointType entryPointType = getEntryPointType(dataState);
        String headerTitle = getHeaderTitle(dataState);
        OptionChainCustomizationDataState2 highlightedMetric = dataState.getHighlightedMetric();
        OptionChainAvailableMetrics.Metric selectedMetricOne = dataState.getSelectedMetricOne();
        if (selectedMetricOne == null) {
            selectedMetricOne = OptionChainFallbackMetrics.getFallbackSelectedMetric(this.resources, getFallbackType(dataState)).getFirst();
        }
        OptionChainAvailableMetrics.Metric metric = selectedMetricOne;
        OptionChainAvailableMetrics.Metric selectedMetricTwo = dataState.getSelectedMetricTwo();
        if (selectedMetricTwo == null) {
            selectedMetricTwo = OptionChainFallbackMetrics.getFallbackSelectedMetric(this.resources, getFallbackType(dataState)).getSecond();
        }
        return new OptionChainCustomizationViewState(entryPointId, entryPointType, headerTitle, highlightedMetric, metric, selectedMetricTwo, dataState.getHighlightedCategoryIndex(), getHighlightedCategoryLabel(dataState), dataState.getAvailableMetrics(), extensions2.toImmutableList(getMetricsInHighlightedCategory(dataState)), optionSeenContext);
    }

    private final String getEntryPointId(OptionChainCustomizationDataState dataState) {
        if (dataState.getOrderSide() != null) {
            return dataState.getOrderSide().getServerValue();
        }
        if (dataState.getStrategyType() != null) {
            return dataState.getStrategyType().getServerValue();
        }
        return null;
    }

    private final OptionChainEntryPointType getEntryPointType(OptionChainCustomizationDataState dataState) {
        if (dataState.getOrderSide() != null) {
            return OptionChainEntryPointType.CHAIN;
        }
        if (dataState.getStrategyType() != null) {
            return OptionChainEntryPointType.STRATEGY_BUILDER;
        }
        return null;
    }

    private final Either<OrderSide, OptionStrategyType> getFallbackType(OptionChainCustomizationDataState dataState) {
        if (dataState.getOrderSide() != null) {
            return new Either.Left(dataState.getOrderSide());
        }
        if (dataState.getStrategyType() != null) {
            return new Either.Right(dataState.getStrategyType());
        }
        return null;
    }

    private final String getHeaderTitle(OptionChainCustomizationDataState dataState) throws Resources.NotFoundException {
        if (dataState.getOrderSide() != null) {
            String string2 = this.resources.getString(C24135R.string.option_chain_customization_header_title, getCustomizationTitle(dataState.getOrderSide()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (dataState.getStrategyType() != null) {
            Resources resources = this.resources;
            int i = C24135R.string.option_chain_customization_header_title;
            String lowerCase = OptionExtensions.getName(dataState.getStrategyType(), this.resources, 1).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String string3 = resources.getString(i, lowerCase);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        return "";
    }

    private final String getCustomizationTitle(OrderSide orderSide) throws Resources.NotFoundException {
        int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i == 1) {
            String string2 = this.resources.getString(C24135R.string.option_chain_customization_buy_side_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = this.resources.getString(C24135R.string.option_chain_customization_sell_side_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private final List<OptionChainAvailableMetrics.Metric> getMetricsInHighlightedCategory(OptionChainCustomizationDataState dataState) {
        if (dataState.getHighlightedCategoryIndex() != null && dataState.getAvailableMetrics() != null) {
            return dataState.getAvailableMetrics().getAvailableMetrics().get(dataState.getHighlightedCategoryIndex().intValue()).getMetrics();
        }
        return CollectionsKt.emptyList();
    }

    private final String getHighlightedCategoryLabel(OptionChainCustomizationDataState dataState) {
        if (dataState.getHighlightedCategoryIndex() == null || dataState.getAvailableMetrics() == null) {
            return null;
        }
        return dataState.getAvailableMetrics().getAvailableMetrics().get(dataState.getHighlightedCategoryIndex().intValue()).getCategoryLabel();
    }
}
