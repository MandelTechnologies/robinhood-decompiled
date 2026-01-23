package com.robinhood.android.options.statistics;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.detail.component.fundamentals.DetailPageFundamentalsDataCell;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.compose.bidask.BidAsk;
import com.robinhood.android.lib.formats.FormatAsList2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.contracts.OptionStatisticsLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.options.optionsstring.common.OptionInstruments;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.Decimals4;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.lists.quickadd.extensions.OptionStrategySecurity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionStatisticsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;", "Lcom/robinhood/android/options/statistics/OptionStatisticsViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "getOptionOrderBundleForChart", "Lcom/robinhood/models/ui/OptionOrderBundle;", "getOptionsSimulatedReturnLoggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "ds", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStatisticsStateProvider implements StateProvider<OptionStatisticsDataState, OptionStatisticsViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: OptionStatisticsStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

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
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionStatisticsLaunchMode.values().length];
            try {
                iArr3[OptionStatisticsLaunchMode.NORMAL_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OptionStatisticsLaunchMode.INFO_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OptionStatisticsLaunchMode.STRATEGY_BUILDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[OptionStatisticsLaunchMode.ROLL.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OptionWatchlistItemState.values().length];
            try {
                iArr4[OptionWatchlistItemState.NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[OptionWatchlistItemState.ADDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[OptionWatchlistItemState.NOT_ADDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public OptionStatisticsStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:213:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionStatisticsViewState reduce(OptionStatisticsDataState dataState) throws Resources.NotFoundException {
        OptionsSimulatedReturnSliderLaunchMode price;
        String titleStringWithExpiration;
        String string2;
        boolean z;
        BigDecimal markPrice;
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell;
        BigDecimal impliedVolatility;
        OptionInstrumentQuote optionInstrumentQuote;
        int i;
        BigDecimal chanceOfProfit;
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell2;
        Integer volume;
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell3;
        Integer openInterest;
        ImmutableList3 immutableList3;
        BigDecimal gamma;
        BidAsk bidAsk;
        BigDecimal theta;
        OptionSettings.DefaultPricingSetting defaultPricingSetting;
        BigDecimal vega;
        UUID uuid;
        BigDecimal bigDecimal;
        int i2;
        String string3;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2;
        String string4;
        boolean z2;
        Decimals4 lowPrice;
        Decimals4 highPrice;
        Decimals4 previousClosePrice;
        Decimals4 lastTradePrice;
        int i3;
        OptionInstrument optionInstrument;
        OptionInstrument optionInstrument2;
        Decimals4 askPrice;
        Decimals4 bidPrice;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OptionInstrumentQuote optionInstrumentQuote2 = dataState.getOptionInstrumentQuote();
        OptionSettings.DefaultPricingSetting overallDefaultPricingType = OptionDefaultPricingState.INSTANCE.from(dataState.getDefaultPricingSettingServerValue(), dataState.getDefaultPriceSettingsOverride(), dataState.getShouldIgnoreDefaultPricing()).getOverallDefaultPricingType();
        if (overallDefaultPricingType == null) {
            overallDefaultPricingType = OptionSettings.DefaultPricingSetting.MARK_PRICE;
        }
        OptionSettings.DefaultPricingSetting defaultPricingSetting3 = overallDefaultPricingType;
        String accountNumber = dataState.getAccountNumber();
        String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (optionInstrumentQuote2 == null || (bidPrice = optionInstrumentQuote2.getBidPrice()) == null) ? null : bidPrice.getUnsignedValue(), null, 2, null);
        String nullable$default2 = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (optionInstrumentQuote2 == null || (askPrice = optionInstrumentQuote2.getAskPrice()) == null) ? null : askPrice.getUnsignedValue(), null, 2, null);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(optionInstrumentQuote2 != null ? optionInstrumentQuote2.getBidSize().intValue() : 0);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(optionInstrumentQuote2 != null ? optionInstrumentQuote2.getAskSize().intValue() : 0);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BidAsk bidAsk2 = new BidAsk(nullable$default, nullable$default2, bigDecimalValueOf, bigDecimalValueOf2);
        UUID id = dataState.getUiOptionChain().getOptionChain().getId();
        OptionChainSettingsPnlChartType pnlChartType = dataState.getPnlChartType();
        int i4 = pnlChartType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pnlChartType.ordinal()];
        if (i4 == -1) {
            price = null;
        } else if (i4 == 1) {
            price = new OptionsSimulatedReturnSliderLaunchMode.Time.Default(dataState.getUiOptionChain().getOptionChain(), dataState.getLegBundle().getOptionInstrument().getExpirationDate());
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            OptionChain.UnderlyingType underlyingType = dataState.getUnderlyingType();
            UUID singleUnderlyingId = dataState.getSingleUnderlyingId();
            if (singleUnderlyingId != null) {
                price = new OptionsSimulatedReturnSliderLaunchMode.Price(underlyingType, singleUnderlyingId);
            }
        }
        Resources resources = this.resources;
        UiOptionInstrument uiOptionInstrument = dataState.getUiOptionInstrument();
        OptionStrategySecurity optionStrategySecurity = (uiOptionInstrument == null || (optionInstrument2 = uiOptionInstrument.getOptionInstrument()) == null) ? null : new OptionStrategySecurity(resources, optionInstrument2, dataState.getOrderSide(), dataState.getUiOptionChain());
        boolean shouldDefaultToSimulatedReturnTab = dataState.getShouldDefaultToSimulatedReturnTab();
        OptionsSimulatedReturnChartDataState2.PreTrade preTrade = new OptionsSimulatedReturnChartDataState2.PreTrade(defaultPricingSetting3, extensions2.persistentListOf(dataState.getLegBundle()));
        String strategyCode = dataState.getStrategyCode();
        OptionWatchlistItemState watchlistItemState = dataState.getWatchlistItemState();
        UiOptionInstrument uiOptionInstrument2 = dataState.getUiOptionInstrument();
        if (uiOptionInstrument2 == null || (optionInstrument = uiOptionInstrument2.getOptionInstrument()) == null || (titleStringWithExpiration = OptionInstruments.getTitleStringWithExpiration(optionInstrument, this.resources, dataState.getUiOptionChain())) == null) {
            titleStringWithExpiration = "";
        }
        String str = titleStringWithExpiration;
        OptionStatisticsTradableState tradableState = dataState.getTradableState();
        if (Intrinsics.areEqual(tradableState, OptionStatisticsTradableState.NotTradable.INSTANCE)) {
            Resources resources2 = this.resources;
            int i5 = WhenMappings.$EnumSwitchMapping$1[dataState.getOrderSide().ordinal()];
            if (i5 == 1) {
                i3 = C23799R.string.option_detail_untradable_warning_buy;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = C23799R.string.option_detail_untradable_warning_sell;
            }
            string2 = resources2.getString(i3);
        } else if (tradableState instanceof OptionStatisticsTradableState.MultipleChainsSelected) {
            string2 = this.resources.getString(C23799R.string.option_detail_untradable_warning_multiple_chain_selected, FormatAsList2.formatAsList(((OptionStatisticsTradableState.MultipleChainsSelected) dataState.getTradableState()).getChainSymbols(), this.resources));
        } else {
            if (!Intrinsics.areEqual(tradableState, OptionStatisticsTradableState.NotAvailable.INSTANCE) && !Intrinsics.areEqual(tradableState, OptionStatisticsTradableState.OppositeLegSelected.INSTANCE) && !Intrinsics.areEqual(tradableState, OptionStatisticsTradableState.Tradable.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = null;
        }
        int i6 = C23799R.string.option_instrument_detail_label_mark;
        NumberFormatter priceFormat = Formats.getPriceFormat();
        if (optionInstrumentQuote2 != null) {
            z = shouldDefaultToSimulatedReturnTab;
            markPrice = optionInstrumentQuote2.getMarkPrice();
        } else {
            z = shouldDefaultToSimulatedReturnTab;
            markPrice = null;
        }
        String str2 = string2;
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell4 = new DetailPageFundamentalsDataCell(i6, NumberFormatter.DefaultImpls.formatNullable$default(priceFormat, markPrice, null, 2, null));
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell5 = new DetailPageFundamentalsDataCell(C23799R.string.option_instrument_detail_label_last_trade, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (optionInstrumentQuote2 == null || (lastTradePrice = optionInstrumentQuote2.getLastTradePrice()) == null) ? null : lastTradePrice.getUnsignedValue(), null, 2, null));
        int i7 = C23799R.string.option_instrument_detail_label_implied_volatility;
        NumberFormatter percentFormat = Formats.getPercentFormat();
        if (optionInstrumentQuote2 != null) {
            detailPageFundamentalsDataCell = detailPageFundamentalsDataCell5;
            impliedVolatility = optionInstrumentQuote2.getImpliedVolatility();
        } else {
            detailPageFundamentalsDataCell = detailPageFundamentalsDataCell5;
            impliedVolatility = null;
        }
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell6 = new DetailPageFundamentalsDataCell(i7, NumberFormatter.DefaultImpls.formatNullable$default(percentFormat, impliedVolatility, null, 2, null));
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell7 = new DetailPageFundamentalsDataCell(C23799R.string.option_instrument_detail_label_previous_close, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (optionInstrumentQuote2 == null || (previousClosePrice = optionInstrumentQuote2.getPreviousClosePrice()) == null) ? null : previousClosePrice.getUnsignedValue(), null, 2, null));
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell8 = new DetailPageFundamentalsDataCell(C23799R.string.option_instrument_detail_label_daily_high, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (optionInstrumentQuote2 == null || (highPrice = optionInstrumentQuote2.getHighPrice()) == null) ? null : highPrice.getUnsignedValue(), null, 2, null));
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell9 = new DetailPageFundamentalsDataCell(C23799R.string.option_instrument_detail_label_daily_low, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (optionInstrumentQuote2 == null || (lowPrice = optionInstrumentQuote2.getLowPrice()) == null) ? null : lowPrice.getUnsignedValue(), null, 2, null));
        int i8 = C23799R.string.option_instrument_detail_label_chance_of_profit;
        NumberFormatter percentFormat2 = Formats.getPercentFormat();
        if (optionInstrumentQuote2 != null) {
            chanceOfProfit = optionInstrumentQuote2.getChanceOfProfit(dataState.getOrderSide());
            optionInstrumentQuote = optionInstrumentQuote2;
            i = 2;
        } else {
            optionInstrumentQuote = optionInstrumentQuote2;
            i = 2;
            chanceOfProfit = null;
        }
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell10 = new DetailPageFundamentalsDataCell(i8, NumberFormatter.DefaultImpls.formatNullable$default(percentFormat2, chanceOfProfit, null, i, null));
        int i9 = C23799R.string.option_instrument_detail_label_volume;
        NumberFormatter integerFormat = Formats.getIntegerFormat();
        if (optionInstrumentQuote != null) {
            detailPageFundamentalsDataCell2 = detailPageFundamentalsDataCell9;
            volume = optionInstrumentQuote.getVolume();
        } else {
            detailPageFundamentalsDataCell2 = detailPageFundamentalsDataCell9;
            volume = null;
        }
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell11 = new DetailPageFundamentalsDataCell(i9, NumberFormatter.DefaultImpls.formatNullable$default(integerFormat, volume, null, i, null));
        int i10 = C23799R.string.option_instrument_detail_label_open_interest;
        NumberFormatter integerFormat2 = Formats.getIntegerFormat();
        if (optionInstrumentQuote != null) {
            detailPageFundamentalsDataCell3 = detailPageFundamentalsDataCell11;
            openInterest = optionInstrumentQuote.getOpenInterest();
        } else {
            detailPageFundamentalsDataCell3 = detailPageFundamentalsDataCell11;
            openInterest = null;
        }
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(detailPageFundamentalsDataCell4, detailPageFundamentalsDataCell, detailPageFundamentalsDataCell6, detailPageFundamentalsDataCell7, detailPageFundamentalsDataCell8, detailPageFundamentalsDataCell2, detailPageFundamentalsDataCell10, detailPageFundamentalsDataCell3, new DetailPageFundamentalsDataCell(i10, NumberFormatter.DefaultImpls.formatNullable$default(integerFormat2, openInterest, null, i, null)));
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell12 = new DetailPageFundamentalsDataCell(C32428R.string.option_detail_greeks_delta_label, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote != null ? optionInstrumentQuote.getDelta() : null, null, i, null));
        int i11 = C32428R.string.option_detail_greeks_gamma_label;
        NumberFormatter sensitivityFormat = Formats.getSensitivityFormat();
        if (optionInstrumentQuote != null) {
            immutableList3 = immutableList3PersistentListOf;
            gamma = optionInstrumentQuote.getGamma();
        } else {
            immutableList3 = immutableList3PersistentListOf;
            gamma = null;
        }
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell13 = new DetailPageFundamentalsDataCell(i11, NumberFormatter.DefaultImpls.formatNullable$default(sensitivityFormat, gamma, null, i, null));
        int i12 = C32428R.string.option_detail_greeks_theta_label;
        NumberFormatter sensitivityFormat2 = Formats.getSensitivityFormat();
        if (optionInstrumentQuote != null) {
            bidAsk = bidAsk2;
            theta = optionInstrumentQuote.getTheta();
        } else {
            bidAsk = bidAsk2;
            theta = null;
        }
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell14 = new DetailPageFundamentalsDataCell(i12, NumberFormatter.DefaultImpls.formatNullable$default(sensitivityFormat2, theta, null, i, null));
        int i13 = C32428R.string.option_detail_greeks_vega_label;
        NumberFormatter sensitivityFormat3 = Formats.getSensitivityFormat();
        if (optionInstrumentQuote != null) {
            defaultPricingSetting = defaultPricingSetting3;
            vega = optionInstrumentQuote.getVega();
        } else {
            defaultPricingSetting = defaultPricingSetting3;
            vega = null;
        }
        DetailPageFundamentalsDataCell detailPageFundamentalsDataCell15 = new DetailPageFundamentalsDataCell(i13, NumberFormatter.DefaultImpls.formatNullable$default(sensitivityFormat3, vega, null, i, null));
        int i14 = C32428R.string.option_detail_greeks_rho_label;
        NumberFormatter sensitivityFormat4 = Formats.getSensitivityFormat();
        if (optionInstrumentQuote != null) {
            BigDecimal rho = optionInstrumentQuote.getRho();
            uuid = id;
            bigDecimal = rho;
        } else {
            uuid = id;
            bigDecimal = null;
        }
        ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf(detailPageFundamentalsDataCell12, detailPageFundamentalsDataCell13, detailPageFundamentalsDataCell14, detailPageFundamentalsDataCell15, new DetailPageFundamentalsDataCell(i14, NumberFormatter.DefaultImpls.formatNullable$default(sensitivityFormat4, bigDecimal, null, i, null)));
        ImmutableList<UiOptionUnderlier> uiOptionUnderliers = dataState.getUiOptionUnderliers();
        if (dataState.getUiOptionUnderliers().size() <= 1) {
            uiOptionUnderliers = null;
        }
        if (uiOptionUnderliers == null) {
            uiOptionUnderliers = extensions2.persistentListOf();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiOptionUnderliers, 10));
        for (UiOptionUnderlier uiOptionUnderlier : uiOptionUnderliers) {
            String symbol = uiOptionUnderlier.getInstrument().getSymbol();
            String quantityString = this.resources.getQuantityString(C11048R.plurals.general_number_of_shares, uiOptionUnderlier.getUnderlier().getQuantity(), Formats.getShareQuantityFormat().format(Integer.valueOf(uiOptionUnderlier.getUnderlier().getQuantity())));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            arrayList.add(new OptionStatisticsUnderlyingRowState(symbol, quantityString));
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
        OptionStatisticsTradableState tradableState2 = dataState.getTradableState();
        if (Intrinsics.areEqual(tradableState2, OptionStatisticsTradableState.Tradable.INSTANCE) || (tradableState2 instanceof OptionStatisticsTradableState.MultipleChainsSelected) || Intrinsics.areEqual(tradableState2, OptionStatisticsTradableState.OppositeLegSelected.INSTANCE)) {
            Resources resources3 = this.resources;
            int i15 = WhenMappings.$EnumSwitchMapping$2[dataState.getLaunchMode().ordinal()];
            if (i15 == 1 || i15 == 2 || i15 == 3) {
                int i16 = WhenMappings.$EnumSwitchMapping$1[dataState.getOrderSide().ordinal()];
                if (i16 == 1) {
                    i2 = C32428R.string.general_label_buy;
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C32428R.string.general_label_sell;
                }
            } else {
                if (i15 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C23799R.string.option_instrument_detail_roll;
            }
            string3 = resources3.getString(i2);
        } else if (Intrinsics.areEqual(tradableState2, OptionStatisticsTradableState.NotAvailable.INSTANCE)) {
            string3 = null;
        } else {
            if (!Intrinsics.areEqual(tradableState2, OptionStatisticsTradableState.NotTradable.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            string3 = this.resources.getString(C11048R.string.general_label_dismiss);
        }
        int i17 = WhenMappings.$EnumSwitchMapping$3[dataState.getWatchlistItemState().ordinal()];
        if (i17 != 1) {
            if (i17 == 2) {
                string4 = this.resources.getString(C23799R.string.option_instrument_detail_remove_from_watchlist);
            } else {
                if (i17 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string4 = this.resources.getString(C23799R.string.option_instrument_detail_add_to_watchlist);
            }
            defaultPricingSetting2 = defaultPricingSetting;
        } else {
            defaultPricingSetting2 = defaultPricingSetting;
            string4 = null;
        }
        OptionChainSettingsPnlChartType pnlChartType2 = dataState.getPnlChartType();
        OptionOrderBundle optionOrderBundleForChart = getOptionOrderBundleForChart(dataState);
        if (dataState.getLaunchMode() != OptionStatisticsLaunchMode.NORMAL_ORDER) {
            z2 = false;
        } else {
            Account account = dataState.getAccount();
            if (Intrinsics.areEqual(account != null ? account.getOptionLevel() : null, OptionLevel.LEVEL_2)) {
                z2 = true;
            }
        }
        return new OptionStatisticsViewState(accountNumber, bidAsk, defaultPricingSetting2, uuid, optionStrategySecurity, z, getOptionsSimulatedReturnLoggingState(dataState), preTrade, price, strategyCode, str, immutableList3, immutableList3PersistentListOf2, watchlistItemState, immutableList, str2, string3, string4, pnlChartType2, optionOrderBundleForChart, z2, dataState.isPreTradeStatNuxDotShown());
    }

    private final OptionOrderBundle getOptionOrderBundleForChart(OptionStatisticsDataState dataState) {
        return new OptionOrderBundle(extensions2.persistentListOf(dataState.getLegBundle()), BigDecimal.ONE);
    }

    private final OptionsSimulatedReturnLoggingState getOptionsSimulatedReturnLoggingState(OptionStatisticsDataState ds) {
        OptionChainSettingsPnlChartType pnlChartType;
        String strategyCode;
        BrokerageAccountType brokerageAccountType;
        String accountNumber = ds.getAccountNumber();
        if (accountNumber == null || (pnlChartType = ds.getPnlChartType()) == null || (strategyCode = ds.getStrategyCode()) == null) {
            return null;
        }
        boolean z = ds.getWatchlistItemState() == OptionWatchlistItemState.ADDED;
        boolean hasPosition = ds.getHasPosition();
        Account account = ds.getAccount();
        if (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null) {
            brokerageAccountType = BrokerageAccountType.UNKNOWN;
        }
        return new OptionsSimulatedReturnLoggingState(accountNumber, pnlChartType, strategyCode, z, hasPosition, false, 1, null, null, brokerageAccountType, 0L, null, Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET);
    }
}
