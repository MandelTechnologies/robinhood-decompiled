package com.robinhood.android.optionschain.bottomsheet;

import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.common.options.strategy.OptionStrategyCodes2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.options.optionsstring.common.OptionInstruments;
import com.robinhood.android.options.optionsstring.common.OptionStrategyTypes;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.SelectedLegItem;
import com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.LocalDate;

/* compiled from: OptionChainBottomSheetStateProvider.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetViewState;", "<init>", "()V", "reduce", "dataState", "getStrategyName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionOrderStrategyBundle;", "getOptionChainBottomSheetSimulatedChartSectionState", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState;", "ds", "strategyCode", "", "getLoggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainBottomSheetStateProvider implements StateProvider<OptionChainBottomSheetDataState, OptionChainBottomSheetViewState> {
    public static final int $stable = 0;

    /* compiled from: OptionChainBottomSheetStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainSettingsPnlChartType.values().length];
            try {
                iArr[OptionChainSettingsPnlChartType.BY_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainSettingsPnlChartType.OVER_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionChainBottomSheetViewState reduce(OptionChainBottomSheetDataState dataState) {
        StringResource stringResourceInvoke;
        boolean z;
        boolean z2;
        boolean z3;
        ImmutableList immutableList;
        StringResource stringResource;
        ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams;
        StringResource stringResourceInvoke2;
        OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey;
        OptionOrderBundle optionOrderBundle;
        ImmutableList<OptionLegBundle> legBundles;
        boolean z4;
        ImmutableList immutableList2;
        ImmutableList<OptionLegBundle> legBundles2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OptionOrderBundle optionOrderBundle2 = dataState.getOptionOrderBundle();
        ImmutableList<OptionLegBundle> legBundles3 = optionOrderBundle2 != null ? optionOrderBundle2.getLegBundles() : null;
        Integer numValueOf = legBundles3 != null ? Integer.valueOf(legBundles3.size()) : null;
        String strategyCode = (legBundles3 == null || legBundles3.size() < 1 || legBundles3.size() > 4) ? null : OptionStrategyCodes2.getStrategyCode(dataState.getOptionOrderBundle());
        boolean z5 = dataState.getWatchlistItem() != null;
        boolean hasExpandedBottomSheet = dataState.getHasExpandedBottomSheet();
        OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey2 = dataState.getOptionOrderIntentKey();
        OptionChainBottomSheetSimulatedReturnSection4 optionChainBottomSheetSimulatedChartSectionState = getOptionChainBottomSheetSimulatedChartSectionState(dataState, strategyCode);
        OptionOrderStrategyBundle optionOrderStrategyBundle = dataState.getOptionOrderStrategyBundle();
        StringResource strategyName = optionOrderStrategyBundle != null ? getStrategyName(optionOrderStrategyBundle) : null;
        BigDecimal orderPrice = dataState.getOrderPrice();
        if (orderPrice != null) {
            NumberFormatter priceFormat = Formats.getPriceFormat();
            BigDecimal bigDecimalAbs = orderPrice.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            String str = priceFormat.format(bigDecimalAbs);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (orderPrice.compareTo(bigDecimal) < 0) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C24135R.string.option_chain_bottom_sheet_strategy_credit, str);
            } else if (orderPrice.compareTo(bigDecimal) > 0) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C24135R.string.option_chain_bottom_sheet_strategy_cost, str);
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(str);
            }
            if (stringResourceInvoke == null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke("—");
            }
        }
        StringResource stringResource2 = stringResourceInvoke;
        if (numValueOf != null) {
            z = numValueOf.intValue() > 1;
        } else {
            z = false;
        }
        if (numValueOf != null) {
            z2 = numValueOf.intValue() > 4;
        } else {
            z2 = false;
        }
        if (numValueOf != null) {
            z3 = numValueOf.intValue() == 1;
        } else {
            z3 = false;
        }
        OptionOrderBundle optionOrderBundle3 = dataState.getOptionOrderBundle();
        OptionLegBundle optionLegBundle = (optionOrderBundle3 == null || (legBundles2 = optionOrderBundle3.getLegBundles()) == null) ? null : (OptionLegBundle) CollectionsKt.singleOrNull((List) legBundles2);
        OptionOrderBundle optionOrderBundle4 = dataState.getOptionOrderBundle();
        if (optionOrderBundle4 == null || (legBundles = optionOrderBundle4.getLegBundles()) == null) {
            immutableList = null;
        } else {
            OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey3 = dataState.getOptionOrderIntentKey();
            if (optionOrderIntentKey3 == null) {
                immutableList2 = null;
            } else if (legBundles.isEmpty()) {
                z4 = false;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
                int i = 0;
                for (OptionLegBundle optionLegBundle2 : legBundles) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    OptionLegBundle optionLegBundle3 = optionLegBundle2;
                    arrayList.add(new SelectedLegItem(dataState.getDefaultPricingState(), i == CollectionsKt.getLastIndex(legBundles), optionLegBundle3, optionOrderIntentKey3, dataState.getQuotes().get(optionLegBundle3.getOptionInstrument().getId()), z4, false));
                    i = i2;
                }
                immutableList2 = extensions2.toImmutableList(arrayList);
            } else {
                Iterator<OptionLegBundle> it = legBundles.iterator();
                while (it.hasNext()) {
                    if (it.next().getRatio() != 1) {
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
                int i3 = 0;
                while (r10.hasNext()) {
                }
                immutableList2 = extensions2.toImmutableList(arrayList2);
            }
            immutableList = immutableList2;
        }
        UnderlyingQuote underlyingQuote = dataState.getUnderlyingQuote();
        if (underlyingQuote == null || (optionOrderIntentKey = dataState.getOptionOrderIntentKey()) == null || (optionOrderBundle = optionOrderIntentKey.getOptionOrderBundle()) == null) {
            stringResource = null;
            apiOptionsProfitLossChartRequestParams = null;
        } else {
            BigDecimal orderPrice2 = dataState.getOrderPrice();
            if (orderPrice2 == null) {
                stringResource = null;
                apiOptionsProfitLossChartRequestParams = null;
            } else {
                stringResource = null;
                apiOptionsProfitLossChartRequestParams = new ApiOptionsProfitLossChartRequestParams(optionOrderBundle, 1, (Money) null, Money3.toMoney$default(orderPrice2, null, 1, null), underlyingQuote, 4, (DefaultConstructorMarker) null);
            }
        }
        if (dataState.getOrderPrice() != null || dataState.getOptionOrderStrategyBundle() == null) {
            stringResourceInvoke2 = stringResource;
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            UiOptionChain uiOptionChain = dataState.getOptionOrderBundle().getOptionChainBundle().getUiOptionChain();
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C24135R.string.option_chain_bottom_sheet_no_quote_single_leg, OptionInstruments.getTitleStringWithExpiration(((OptionLegBundle) CollectionsKt.first((List) dataState.getOptionOrderBundle().getLegBundles())).getOptionInstrument(), uiOptionChain.getUnderlyingType(), uiOptionChain.getOptionChain().getSettleOnOpen()));
        } else {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C24135R.string.option_chain_bottom_sheet_no_quote_multi_leg, new Object[0]);
        }
        return new OptionChainBottomSheetViewState(z5, hasExpandedBottomSheet, immutableList, optionChainBottomSheetSimulatedChartSectionState, z, z2, z3, optionLegBundle, strategyCode, optionOrderIntentKey2, apiOptionsProfitLossChartRequestParams, stringResource2, strategyName, stringResourceInvoke2);
    }

    private final StringResource getStrategyName(OptionOrderStrategyBundle optionOrderStrategyBundle) {
        ImmutableList<OptionLegBundle> legBundles = optionOrderStrategyBundle.getLegBundles();
        if (legBundles == null) {
            return null;
        }
        int size = legBundles.size();
        if (size == 1) {
            OptionLegBundle optionLegBundle = (OptionLegBundle) CollectionsKt.first((List) legBundles);
            UiOptionChain uiOptionChain = optionLegBundle.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain();
            return OptionInstruments.getTitleStringWithSide(optionLegBundle.getOptionInstrument(), optionLegBundle.getOptionConfigurationBundle().getOptionSide(), uiOptionChain.getUnderlyingType(), uiOptionChain.getOptionChain().getSettleOnOpen());
        }
        OptionStrategyType overallStrategyType = new OptionOrderContext.StrategyContext(optionOrderStrategyBundle.getOptionOrderStrategies().getOpening_strategy(), optionOrderStrategyBundle.getOptionOrderStrategies().getClosing_strategy(), optionOrderStrategyBundle.getOptionOrderStrategies().getStrategy_display_name()).getOverallStrategyType();
        if (overallStrategyType == null) {
            overallStrategyType = OptionStrategyType.CUSTOM;
        }
        return OptionStrategyTypes.getName(overallStrategyType, size);
    }

    private final OptionChainBottomSheetSimulatedReturnSection4 getOptionChainBottomSheetSimulatedChartSectionState(OptionChainBottomSheetDataState ds, String strategyCode) {
        OptionOrderBundle optionOrderBundle;
        OptionSettings.DefaultPricingSetting overallDefaultPricingType;
        if (ds.getPnlChartType() == null || strategyCode == null || (optionOrderBundle = ds.getOptionOrderBundle()) == null) {
            return null;
        }
        UiOptionChain uiOptionChain = optionOrderBundle.getOptionChainBundle().getUiOptionChain();
        UUID singleEquityUnderlyingId = uiOptionChain.getSingleEquityUnderlyingId();
        if (singleEquityUnderlyingId == null && (singleEquityUnderlyingId = uiOptionChain.getIndexUnderlyingId()) == null) {
            return null;
        }
        OptionDefaultPricingState defaultPricingState = ds.getDefaultPricingState();
        if (defaultPricingState == null || (overallDefaultPricingType = defaultPricingState.getOverallDefaultPricingType()) == null) {
            overallDefaultPricingType = OptionSettings.DefaultPricingSetting.MARK_PRICE;
        }
        OptionSettings.DefaultPricingSetting defaultPricingSetting = overallDefaultPricingType;
        OptionsSimulatedReturnLoggingState loggingState = getLoggingState(ds, strategyCode);
        OptionChainSettingsPnlChartType pnlChartType = ds.getPnlChartType();
        int i = pnlChartType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pnlChartType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new OptionChainBottomSheetSimulatedReturnSection4.SimulatedReturn(ds.getAccountNumber(), loggingState, new OptionsSimulatedReturnSliderLaunchMode.Price(uiOptionChain.getUnderlyingType(), singleEquityUnderlyingId), optionOrderBundle, new OptionsSimulatedReturnChartDataState2.PreTrade(defaultPricingSetting, optionOrderBundle.getLegBundles()));
        }
        String accountNumber = ds.getAccountNumber();
        OptionChain optionChain = uiOptionChain.getOptionChain();
        Iterator<OptionLegBundle> it = optionOrderBundle.getLegBundles().iterator();
        if (it.hasNext()) {
            LocalDate expirationDate = it.next().getOptionInstrument().getExpirationDate();
            while (it.hasNext()) {
                LocalDate expirationDate2 = it.next().getOptionInstrument().getExpirationDate();
                if (expirationDate.compareTo(expirationDate2) > 0) {
                    expirationDate = expirationDate2;
                }
            }
            return new OptionChainBottomSheetSimulatedReturnSection4.PnlChart(accountNumber, loggingState, new OptionsSimulatedReturnSliderLaunchMode.Time.Default(optionChain, expirationDate), optionOrderBundle, defaultPricingSetting);
        }
        throw new NoSuchElementException();
    }

    private final OptionsSimulatedReturnLoggingState getLoggingState(OptionChainBottomSheetDataState ds, String strategyCode) {
        BrokerageAccountType brokerageAccountType;
        ImmutableList<OptionLegBundle> legBundles;
        String accountNumber = ds.getAccountNumber();
        OptionChainSettingsPnlChartType pnlChartType = ds.getPnlChartType();
        if (pnlChartType == null) {
            return null;
        }
        int size = 0;
        boolean z = ds.getWatchlistItem() != null;
        boolean hasPosition = ds.getHasPosition();
        OptionOrderBundle optionOrderBundle = ds.getOptionOrderBundle();
        if (optionOrderBundle != null && (legBundles = optionOrderBundle.getLegBundles()) != null) {
            size = legBundles.size();
        }
        int i = size;
        Account account = ds.getAccount();
        if (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null) {
            brokerageAccountType = BrokerageAccountType.UNKNOWN;
        }
        return new OptionsSimulatedReturnLoggingState(accountNumber, pnlChartType, strategyCode, z, hasPosition, false, i, null, null, brokerageAccountType, 0L, null, ds.getScreenName());
    }
}
