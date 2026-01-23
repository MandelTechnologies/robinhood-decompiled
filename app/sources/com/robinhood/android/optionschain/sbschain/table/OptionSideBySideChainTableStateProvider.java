package com.robinhood.android.optionschain.sbschain.table;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.optionchain.chainsettings.OptionChainMetricValueConverter;
import com.robinhood.android.optionchain.extensions.UnderlyingQuoteModelUtil;
import com.robinhood.android.options.optionsstring.common.OptionExtensions2;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.OptionChainListView9;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState4;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableEvent;
import com.robinhood.android.optionschain.sbschain.table.TableCellState;
import com.robinhood.android.optionschain.sbschain.table.TableRowState;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.android.optionschain.sbschain.table.util.IndexRangeUtil;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainTableRowData;
import com.robinhood.models.Decimals4;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.OptionChainBundle;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.utils.datetime.Instants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OptionSideBySideChainTableStateProvider.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!JK\u0010*\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u001d2\u0006\u0010(\u001a\u00020'2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010+J1\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u000e2\u0006\u0010\n\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u001d2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u00101\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u0004\u0018\u0001052\u0006\u00101\u001a\u00020\u0002H\u0002¢\u0006\u0004\b6\u00107J!\u0010:\u001a\u00020'2\b\u00108\u001a\u0004\u0018\u0001022\u0006\u00109\u001a\u00020'H\u0002¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u0004\u0018\u00010<2\u0006\u00101\u001a\u00020\u00022\u0006\u00109\u001a\u00020'H\u0002¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u0004\u0018\u00010?2\u0006\u00101\u001a\u00020\u0002H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\bB\u0010CJ5\u0010G\u001a\u0004\u0018\u00010D2\u0006\u00101\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u001d2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\bE\u0010FJ\u0017\u00109\u001a\u00020'2\u0006\u00101\u001a\u00020\u0002H\u0001¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010K¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableViewState;", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Landroid/content/res/Resources;Lj$/time/Clock;)V", "dataState", "Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;", "topBannerErrorType", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Lazy;", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState;", "createTableRowStates", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;)Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "expirationDateState", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData$InstrumentRow;", "rowData", "", "rowIndex", "Ljava/math/BigDecimal;", "underlyingPrice", "Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$InstrumentRow;", "getTableInstrumentRowState", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData$InstrumentRow;ILjava/math/BigDecimal;Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;)Lcom/robinhood/android/optionschain/sbschain/table/TableRowState$InstrumentRow;", "Lcom/robinhood/models/db/OptionInstrument;", "targetInstrument", "Lcom/robinhood/android/optionschain/sbschain/table/SelectedLegIndicator;", "getSelectedLegIndicator", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;Lcom/robinhood/models/db/OptionInstrument;)Lcom/robinhood/android/optionschain/sbschain/table/SelectedLegIndicator;", "Lcom/robinhood/models/ui/OptionChainBundle;", "optionChainBundle", "j$/time/LocalDate", "expirationDate", "optionInstrument", "", "isBid", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;", "getBidAskCellState", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;Lcom/robinhood/models/ui/OptionChainBundle;Lj$/time/LocalDate;Lcom/robinhood/models/db/OptionInstrument;ZLcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;I)Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "metric", "", "getMetricString", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionSideBySideChainMetric;)Lkotlin/Lazy;", "ds", "Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;", "getTopErrorBannerState", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;)Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;", "Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "getSpreadSelectionState", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;)Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "topErrorBannerState", "shouldShowPopUpsInNux", "getShouldShowZeroDteBottomSheet", "(Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;Z)Z", "j$/time/Instant", "selloutTimeWhenShouldShowSelloutWarningSnackbar", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;Z)Lj$/time/Instant;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "getInitialScrollEvent", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;)Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "reduce", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;)Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableViewState;", "Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "getBidAskCellDisableType$feature_options_chain_externalDebug", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;ZLcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;)Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "getBidAskCellDisableType", "shouldShowPopUpsInNux$feature_options_chain_externalDebug", "(Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;)Z", "Landroid/content/res/Resources;", "Lj$/time/Clock;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainTableStateProvider implements StateProvider<OptionSideBySideChainTableDataState, OptionSideBySideChainTableViewState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final Resources resources;

    /* compiled from: OptionSideBySideChainTableStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[OptionSideBySideChainMetric.values().length];
            try {
                iArr2[OptionSideBySideChainMetric.BID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.ASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.MARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.LAST_TRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.PREVIOUS_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.HIGH.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.LOW.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.NET_CHANGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.PERCENT_CHANGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.BID_SIZE.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.ASK_SIZE.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.VOLUME.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.OPEN_INTEREST.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.DELTA.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.GAMMA.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.THETA.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.VEGA.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.RHO.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.IMPLIED_VOLATILITY.ordinal()] = 19;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.BREAKEVEN.ordinal()] = 20;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.TO_BREAKEVEN.ordinal()] = 21;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.CHANCE_OF_PROFIT_LONG.ordinal()] = 22;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[OptionSideBySideChainMetric.CHANCE_OF_PROFIT_SHORT.ordinal()] = 23;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TopBannerErrorType.values().length];
            try {
                iArr3[TopBannerErrorType.PCO_AFTER_MARKET_CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[TopBannerErrorType.MULTIPLE_CHAINS_SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[TopBannerErrorType.PCO_BEFORE_SELLOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[TopBannerErrorType.PCO_AFTER_SELLOUT_BEFORE_MARKET_CLOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public OptionSideBySideChainTableStateProvider(Resources resources, Clock clock) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.resources = resources;
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionSideBySideChainTableViewState reduce(OptionSideBySideChainTableDataState dataState) throws Resources.NotFoundException {
        String underlyingQuoteIndicatorText;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        TopErrorBannerState topErrorBannerState = getTopErrorBannerState(dataState);
        ImmutableList<Lazy<TableRowState>> immutableListCreateTableRowStates = createTableRowStates(dataState, topErrorBannerState != null ? topErrorBannerState.getType() : null);
        Integer numValueOf = immutableListCreateTableRowStates.isEmpty() ? null : Integer.valueOf(immutableListCreateTableRowStates.size() - 1);
        SpreadSelectionState spreadSelectionState = getSpreadSelectionState(dataState);
        boolean zShouldShowPopUpsInNux$feature_options_chain_externalDebug = shouldShowPopUpsInNux$feature_options_chain_externalDebug(dataState);
        OptionChainExpirationDateState expirationDateState = dataState.getExpirationDateState();
        TableRowState.Header header = new TableRowState.Header(extensions2.toPersistentList(dataState.getMetrics()), dataState.getBidAskPriceLabelType());
        Integer quoteIndex = dataState.getTableData().getQuoteIndex();
        UnderlyingQuote underlyingQuote = dataState.getUnderlyingQuote();
        if (underlyingQuote == null || (underlyingQuoteIndicatorText = UnderlyingQuoteModelUtil.getUnderlyingQuoteIndicatorText(underlyingQuote, this.resources)) == null) {
            underlyingQuoteIndicatorText = "";
        }
        return new OptionSideBySideChainTableViewState(expirationDateState, header, immutableListCreateTableRowStates, quoteIndex, numValueOf, underlyingQuoteIndicatorText, dataState.getDraggedOverIndex(), dataState.getDragTarget(), dataState.getInitialInstrumentsLoaded(), dataState.isNuxAnimationFinished(), dataState.isTableCached(), getInitialScrollEvent(dataState), dataState.getInitialScrollUiEvent(), dataState.getInitialInstrumentsLoaded(), dataState.getTargetLegs(), dataState.getTargetStrikePrice(), topErrorBannerState, getShouldShowZeroDteBottomSheet(topErrorBannerState, zShouldShowPopUpsInNux$feature_options_chain_externalDebug), selloutTimeWhenShouldShowSelloutWarningSnackbar(dataState, zShouldShowPopUpsInNux$feature_options_chain_externalDebug), spreadSelectionState);
    }

    private final ImmutableList<Lazy<TableRowState>> createTableRowStates(OptionSideBySideChainTableDataState dataState, TopBannerErrorType topBannerErrorType) {
        final OptionSideBySideChainTableDataState optionSideBySideChainTableDataState;
        final TopBannerErrorType topBannerErrorType2;
        Lazy lazy;
        if (dataState.getExpirationDateState() == null) {
            return extensions2.persistentListOf();
        }
        ImmutableList<OptionSideBySideChainTableRowData> rows = dataState.getTableData().getRows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
        final int i = 0;
        for (OptionSideBySideChainTableRowData optionSideBySideChainTableRowData : rows) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final OptionSideBySideChainTableRowData optionSideBySideChainTableRowData2 = optionSideBySideChainTableRowData;
            if (optionSideBySideChainTableRowData2 instanceof OptionSideBySideChainTableRowData.InstrumentRow) {
                optionSideBySideChainTableDataState = dataState;
                topBannerErrorType2 = topBannerErrorType;
                lazy = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableStateProvider$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainTableStateProvider.createTableRowStates$lambda$2$lambda$0(this.f$0, optionSideBySideChainTableDataState, optionSideBySideChainTableRowData2, i, topBannerErrorType2);
                    }
                });
            } else {
                optionSideBySideChainTableDataState = dataState;
                topBannerErrorType2 = topBannerErrorType;
                if (!(optionSideBySideChainTableRowData2 instanceof OptionSideBySideChainTableRowData.UnderlyingQuoteRow)) {
                    throw new NoWhenBranchMatchedException();
                }
                lazy = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableStateProvider$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainTableStateProvider.createTableRowStates$lambda$2$lambda$1(optionSideBySideChainTableRowData2);
                    }
                });
            }
            arrayList.add(lazy);
            dataState = optionSideBySideChainTableDataState;
            topBannerErrorType = topBannerErrorType2;
            i = i2;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.add(LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableStateProvider$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TableRowState.DisclosureRow.INSTANCE;
            }
        }));
        return extensions2.toPersistentList(mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TableRowState.InstrumentRow createTableRowStates$lambda$2$lambda$0(OptionSideBySideChainTableStateProvider optionSideBySideChainTableStateProvider, OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, OptionSideBySideChainTableRowData optionSideBySideChainTableRowData, int i, TopBannerErrorType topBannerErrorType) {
        OptionChainExpirationDateState expirationDateState = optionSideBySideChainTableDataState.getExpirationDateState();
        OptionSideBySideChainTableRowData.InstrumentRow instrumentRow = (OptionSideBySideChainTableRowData.InstrumentRow) optionSideBySideChainTableRowData;
        UnderlyingQuote underlyingQuote = optionSideBySideChainTableDataState.getUnderlyingQuote();
        return optionSideBySideChainTableStateProvider.getTableInstrumentRowState(optionSideBySideChainTableDataState, expirationDateState, instrumentRow, i, underlyingQuote != null ? underlyingQuote.getCurrentValue() : null, topBannerErrorType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TableRowState.UnderlyingQuoteRow createTableRowStates$lambda$2$lambda$1(OptionSideBySideChainTableRowData optionSideBySideChainTableRowData) {
        return new TableRowState.UnderlyingQuoteRow(((OptionSideBySideChainTableRowData.UnderlyingQuoteRow) optionSideBySideChainTableRowData).getUnderlyingQuote().format());
    }

    private final TableRowState.InstrumentRow getTableInstrumentRowState(OptionSideBySideChainTableDataState dataState, final OptionChainExpirationDateState expirationDateState, OptionSideBySideChainTableRowData.InstrumentRow rowData, int rowIndex, BigDecimal underlyingPrice, TopBannerErrorType topBannerErrorType) {
        OptionChainBundle optionChainBundle = new OptionChainBundle(dataState.getEquityInstrumentId(), expirationDateState.getUiOptionChain().getOptionChain().getId(), expirationDateState.getUiOptionChain());
        OptionInstrument callInstrument = rowData.getCallInstrument();
        OptionInstrument putInstrument = rowData.getPutInstrument();
        final BigDecimal strikePrice = rowData.getStrikePrice();
        TableCellState.BidAsk bidAskCellState = getBidAskCellState(dataState, optionChainBundle, expirationDateState.getExpirationDate(), callInstrument, true, topBannerErrorType, rowIndex);
        TableCellState.BidAsk bidAskCellState2 = getBidAskCellState(dataState, optionChainBundle, expirationDateState.getExpirationDate(), callInstrument, false, topBannerErrorType, rowIndex);
        TableCellState.BidAsk bidAskCellState3 = getBidAskCellState(dataState, optionChainBundle, expirationDateState.getExpirationDate(), putInstrument, true, topBannerErrorType, rowIndex);
        TableCellState.BidAsk bidAskCellState4 = getBidAskCellState(dataState, optionChainBundle, expirationDateState.getExpirationDate(), putInstrument, false, topBannerErrorType, rowIndex);
        Lazy lazy = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableStateProvider$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionSideBySideChainTableStateProvider.getTableInstrumentRowState$lambda$4(expirationDateState, strikePrice);
            }
        });
        List<OptionSideBySideChainMetric> nonBidAskMetrics = dataState.getNonBidAskMetrics();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(nonBidAskMetrics, 10));
        Iterator<T> it = nonBidAskMetrics.iterator();
        while (it.hasNext()) {
            arrayList.add(getMetricString(dataState, callInstrument, (OptionSideBySideChainMetric) it.next()));
        }
        List<OptionSideBySideChainMetric> nonBidAskMetrics2 = dataState.getNonBidAskMetrics();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(nonBidAskMetrics2, 10));
        Iterator<T> it2 = nonBidAskMetrics2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getMetricString(dataState, putInstrument, (OptionSideBySideChainMetric) it2.next()));
        }
        return new TableRowState.InstrumentRow(bidAskCellState, bidAskCellState2, bidAskCellState3, bidAskCellState4, lazy, arrayList, arrayList2, bidAskCellState.getIsEnabled() || bidAskCellState2.getIsEnabled() || bidAskCellState3.getIsEnabled() || bidAskCellState4.getIsEnabled(), null, strikePrice.compareTo(underlyingPrice == null ? BigDecimal.ZERO : underlyingPrice) > 0, strikePrice.compareTo(underlyingPrice == null ? BigDecimal.ZERO : underlyingPrice) <= 0, rowIndex, getSelectedLegIndicator(dataState, callInstrument), getSelectedLegIndicator(dataState, putInstrument), 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTableInstrumentRowState$lambda$4(OptionChainExpirationDateState optionChainExpirationDateState, BigDecimal bigDecimal) {
        return OptionExtensions2.strikeNumberFormatter(optionChainExpirationDateState.getUiOptionChain().getUnderlyingType()).format(bigDecimal);
    }

    private final SelectedLegIndicator getSelectedLegIndicator(OptionSideBySideChainTableDataState dataState, OptionInstrument targetInstrument) {
        OrderSide optionSide;
        Object next;
        OptionConfigurationBundle optionConfigurationBundle;
        Iterator<T> it = dataState.getSelectedLegs().iterator();
        while (true) {
            optionSide = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((OptionLegBundle) next).getOptionInstrument().getId(), targetInstrument != null ? targetInstrument.getId() : null)) {
                break;
            }
        }
        OptionLegBundle optionLegBundle = (OptionLegBundle) next;
        if (optionLegBundle != null && (optionConfigurationBundle = optionLegBundle.getOptionConfigurationBundle()) != null) {
            optionSide = optionConfigurationBundle.getOptionSide();
        }
        int i = optionSide == null ? -1 : WhenMappings.$EnumSwitchMapping$0[optionSide.ordinal()];
        if (i == -1) {
            return SelectedLegIndicator.NONE;
        }
        if (i == 1) {
            return SelectedLegIndicator.ASK;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return SelectedLegIndicator.BID;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final TableCellState.BidAsk getBidAskCellState(OptionSideBySideChainTableDataState dataState, OptionChainBundle optionChainBundle, LocalDate expirationDate, OptionInstrument optionInstrument, boolean isBid, TopBannerErrorType topBannerErrorType, int rowIndex) {
        OptionLegBundle optionLegBundle;
        int longQuantity;
        Integer numValueOf;
        String longStrategyCode;
        boolean z;
        int iIntValue;
        ImmutableList<UiOptionStrategyLegDisplay> targetLegs;
        OptionConfigurationBundle optionConfigurationBundle;
        String str = null;
        if (optionInstrument == null) {
            optionLegBundle = null;
        } else {
            optionLegBundle = OptionBundles.getOptionLegBundle(optionChainBundle, optionInstrument, expirationDate, isBid ? OrderSide.SELL : OrderSide.BUY);
        }
        OptionSideBySideChainMetric optionSideBySideChainMetric = isBid ? OptionSideBySideChainMetric.BID : OptionSideBySideChainMetric.ASK;
        UiOptionPositionCounts uiOptionPositionCounts = dataState.getOptionPositionCount().get(optionInstrument != null ? optionInstrument.getId() : null);
        if (isBid) {
            if (uiOptionPositionCounts != null) {
                longQuantity = uiOptionPositionCounts.getShortQuantity() * (-1);
                numValueOf = Integer.valueOf(longQuantity);
            }
            numValueOf = null;
        } else {
            if (uiOptionPositionCounts != null) {
                longQuantity = uiOptionPositionCounts.getLongQuantity();
                numValueOf = Integer.valueOf(longQuantity);
            }
            numValueOf = null;
        }
        if (isBid) {
            longStrategyCode = optionInstrument != null ? optionInstrument.getShortStrategyCode() : null;
        } else if (optionInstrument != null) {
            longStrategyCode = optionInstrument.getLongStrategyCode();
        }
        Lazy<String> metricString = getMetricString(dataState, optionInstrument, optionSideBySideChainMetric);
        boolean zContains = CollectionsKt.contains(dataState.getSelectedLegs(), optionLegBundle);
        BidAskCellDisableType bidAskCellDisableType$feature_options_chain_externalDebug = getBidAskCellDisableType$feature_options_chain_externalDebug(dataState, isBid, optionInstrument, topBannerErrorType);
        OptionLegBundleWithRowIndex optionLegBundleWithRowIndex = optionLegBundle != null ? new OptionLegBundleWithRowIndex(optionLegBundle, rowIndex, dataState.getTableData().getQuoteIndex(), metricString) : null;
        if (dataState.getTargetLegs().isEmpty() || ((targetLegs = dataState.getTargetLegs()) != null && targetLegs.isEmpty())) {
            z = false;
        } else {
            for (UiOptionStrategyLegDisplay uiOptionStrategyLegDisplay : targetLegs) {
                if (Intrinsics.areEqual(uiOptionStrategyLegDisplay.getOptionInstrument().getId(), optionInstrument != null ? optionInstrument.getId() : null)) {
                    if (uiOptionStrategyLegDisplay.getPositionType().getSide() == ((optionLegBundle == null || (optionConfigurationBundle = optionLegBundle.getOptionConfigurationBundle()) == null) ? null : optionConfigurationBundle.getOptionSide())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        if (numValueOf != null && (iIntValue = numValueOf.intValue()) != 0) {
            str = Formats.getIntegerDeltaFormat().format(Integer.valueOf(iIntValue));
        }
        return new TableCellState.BidAsk(isBid, zContains, null, bidAskCellDisableType$feature_options_chain_externalDebug, str, CollectionsKt.contains(dataState.getWatchlistStrategyCodeSet(), longStrategyCode), z, optionLegBundleWithRowIndex, metricString, 4, null);
    }

    private final Lazy<String> getMetricString(final OptionSideBySideChainTableDataState dataState, final OptionInstrument optionInstrument, final OptionSideBySideChainMetric metric) {
        return LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableStateProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionSideBySideChainTableStateProvider.getMetricString$lambda$12(dataState, optionInstrument, metric, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMetricString$lambda$12(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, OptionInstrument optionInstrument, OptionSideBySideChainMetric optionSideBySideChainMetric, OptionSideBySideChainTableStateProvider optionSideBySideChainTableStateProvider) throws Resources.NotFoundException {
        OptionInstrumentQuote optionInstrumentQuote = optionSideBySideChainTableDataState.getOptionInstrumentQuotes().get(optionInstrument != null ? optionInstrument.getId() : null);
        if (optionInstrumentQuote == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[optionSideBySideChainMetric.ordinal()]) {
            case 1:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), optionInstrumentQuote.getBidPrice().getUnsignedValue(), null, 2, null);
            case 2:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), optionInstrumentQuote.getAskPrice().getUnsignedValue(), null, 2, null);
            case 3:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), optionInstrumentQuote.getAdjustedMarkPrice().getUnsignedValue(), null, 2, null);
            case 4:
                NumberFormatter priceFormat = Formats.getPriceFormat();
                Decimals4 lastTradePrice = optionInstrumentQuote.getLastTradePrice();
                return NumberFormatter.DefaultImpls.formatNullable$default(priceFormat, lastTradePrice != null ? lastTradePrice.getUnsignedValue() : null, null, 2, null);
            case 5:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), optionInstrumentQuote.getPreviousClosePrice().getUnsignedValue(), null, 2, null);
            case 6:
                NumberFormatter priceFormat2 = Formats.getPriceFormat();
                Decimals4 highPrice = optionInstrumentQuote.getHighPrice();
                return NumberFormatter.DefaultImpls.formatNullable$default(priceFormat2, highPrice != null ? highPrice.getUnsignedValue() : null, null, 2, null);
            case 7:
                NumberFormatter priceFormat3 = Formats.getPriceFormat();
                Decimals4 lowPrice = optionInstrumentQuote.getLowPrice();
                return NumberFormatter.DefaultImpls.formatNullable$default(priceFormat3, lowPrice != null ? lowPrice.getUnsignedValue() : null, null, 2, null);
            case 8:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), optionInstrumentQuote.getTodaysNetChange(), null, 2, null);
            case 9:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), optionInstrumentQuote.getTodaysPercentChange(), null, 2, null);
            case 10:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getShareQuantityFormat(), optionInstrumentQuote.getBidSize(), null, 2, null);
            case 11:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getShareQuantityFormat(), optionInstrumentQuote.getAskSize(), null, 2, null);
            case 12:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getIntegerFormat(), optionInstrumentQuote.getVolume(), null, 2, null);
            case 13:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getIntegerFormat(), optionInstrumentQuote.getOpenInterest(), null, 2, null);
            case 14:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getDelta(), null, 2, null);
            case 15:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getGamma(), null, 2, null);
            case 16:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getTheta(), null, 2, null);
            case 17:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getVega(), null, 2, null);
            case 18:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionInstrumentQuote.getRho(), null, 2, null);
            case 19:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), optionInstrumentQuote.getImpliedVolatility(), null, 2, null);
            case 20:
                String breakevenDisplay = OptionChainMetricValueConverter.getBreakevenDisplay(optionInstrumentQuote, optionSideBySideChainTableDataState.getUnderlyingQuote());
                if (breakevenDisplay != null) {
                    return breakevenDisplay;
                }
                String string2 = optionSideBySideChainTableStateProvider.resources.getString(C11048R.string.general_label_n_a_short);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 21:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), optionInstrumentQuote.getBreakevenPercentage(optionSideBySideChainTableDataState.getUnderlyingQuote()), null, 2, null);
            case 22:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), optionInstrumentQuote.getChanceOfProfitLong(), null, 2, null);
            case 23:
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), optionInstrumentQuote.getChanceOfProfitShort(), null, 2, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final TopErrorBannerState getTopErrorBannerState(OptionSideBySideChainTableDataState ds) throws Resources.NotFoundException {
        UiOptionChain uiOptionChain;
        Instant selloutDateTime;
        Object next;
        OptionConfigurationBundle optionConfigurationBundle;
        OptionChainBundle optionChainBundle;
        UiOptionChain uiOptionChain2;
        OptionChain optionChain;
        OptionChainExpirationDateState expirationDateState = ds.getExpirationDateState();
        if (expirationDateState == null || (uiOptionChain = expirationDateState.getUiOptionChain()) == null || (selloutDateTime = ds.getSelloutDateTime()) == null) {
            return null;
        }
        boolean z = Instant.now(this.clock).compareTo(selloutDateTime) > 0;
        if (!z || ds.isInOptionRegularTradingOpenHours()) {
            Iterator<T> it = ds.getSelectedLegs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!Intrinsics.areEqual(((OptionLegBundle) next).getOptionConfigurationBundle().getOptionChainBundle().getOptionChainId(), uiOptionChain.getOptionChain().getId())) {
                    break;
                }
            }
            OptionLegBundle optionLegBundle = (OptionLegBundle) next;
            String symbol = (optionLegBundle == null || (optionConfigurationBundle = optionLegBundle.getOptionConfigurationBundle()) == null || (optionChainBundle = optionConfigurationBundle.getOptionChainBundle()) == null || (uiOptionChain2 = optionChainBundle.getUiOptionChain()) == null || (optionChain = uiOptionChain2.getOptionChain()) == null) ? null : optionChain.getSymbol();
            if (symbol != null) {
                String string2 = this.resources.getString(C24135R.string.option_side_by_side_chain_other_chain_selected_error_msg, uiOptionChain.getOptionChain().getSymbol(), symbol);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return new TopErrorBannerState(string2, null, null, TopBannerErrorType.MULTIPLE_CHAINS_SELECTED);
            }
            boolean zIsEnabled = ds.getTradeOnExpirationState().isEnabled();
            if (!ds.getOptionInstrumentIdToTradabilityMap().isEmpty()) {
                Collection<Tradability> collectionValues = ds.getOptionInstrumentIdToTradabilityMap().values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator<T> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        if (((Tradability) it2.next()) != Tradability.POSITION_CLOSING_ONLY) {
                            break;
                        }
                    }
                    if (!z && !zIsEnabled) {
                        String string3 = this.resources.getString(C24135R.string.option_side_by_side_chain_pco_before_sellout_error_msg);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        return new TopErrorBannerState(string3, this.resources.getString(C24135R.string.option_side_by_side_chain_pco_before_sellout_error_action), TopErrorBannerAction.ENABLE_TRADE_ON_EXPIRATION, TopBannerErrorType.PCO_BEFORE_SELLOUT);
                    }
                } else if (!z) {
                    String string32 = this.resources.getString(C24135R.string.option_side_by_side_chain_pco_before_sellout_error_msg);
                    Intrinsics.checkNotNullExpressionValue(string32, "getString(...)");
                    return new TopErrorBannerState(string32, this.resources.getString(C24135R.string.option_side_by_side_chain_pco_before_sellout_error_action), TopErrorBannerAction.ENABLE_TRADE_ON_EXPIRATION, TopBannerErrorType.PCO_BEFORE_SELLOUT);
                }
                return null;
            }
            if (z) {
                String string4 = this.resources.getString(C24135R.string.f4805xea566a5b);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return new TopErrorBannerState(string4, null, null, TopBannerErrorType.PCO_AFTER_SELLOUT_BEFORE_MARKET_CLOSE);
            }
            return null;
        }
        String string5 = this.resources.getString(C24135R.string.option_side_by_side_chain_pco_after_market_close_error_msg);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return new TopErrorBannerState(string5, null, null, TopBannerErrorType.PCO_AFTER_MARKET_CLOSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final SpreadSelectionState getSpreadSelectionState(OptionSideBySideChainTableDataState ds) {
        Decimals4 decimals4;
        final Decimals4 askPrice;
        final Decimals4 askPrice2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<OptionLegBundle> selectedLegs = ds.getSelectedLegs();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(selectedLegs, 10)), 16));
        for (Object obj : selectedLegs) {
            linkedHashMap.put(((OptionLegBundle) obj).getOptionInstrument().getId(), obj);
        }
        int i = 0;
        for (OptionSideBySideChainTableRowData optionSideBySideChainTableRowData : ds.getTableData().getRows()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            OptionSideBySideChainTableRowData optionSideBySideChainTableRowData2 = optionSideBySideChainTableRowData;
            if (optionSideBySideChainTableRowData2 instanceof OptionSideBySideChainTableRowData.InstrumentRow) {
                OptionSideBySideChainTableRowData.InstrumentRow instrumentRow = (OptionSideBySideChainTableRowData.InstrumentRow) optionSideBySideChainTableRowData2;
                OptionInstrument callInstrument = instrumentRow.getCallInstrument();
                OptionInstrument putInstrument = instrumentRow.getPutInstrument();
                OptionLegBundle optionLegBundle = (OptionLegBundle) linkedHashMap.get(callInstrument != null ? callInstrument.getId() : null);
                OptionLegBundle optionLegBundle2 = (OptionLegBundle) linkedHashMap.get(putInstrument != null ? putInstrument.getId() : null);
                if (callInstrument == null || optionLegBundle == null) {
                    decimals4 = null;
                } else {
                    OptionInstrumentQuote optionInstrumentQuote = ds.getOptionInstrumentQuotes().get(callInstrument.getId());
                    int i3 = WhenMappings.$EnumSwitchMapping$0[optionLegBundle.getOptionConfigurationBundle().getOptionSide().ordinal()];
                    if (i3 == 1) {
                        if (optionInstrumentQuote != null) {
                            askPrice2 = optionInstrumentQuote.getAskPrice();
                        }
                        decimals4 = null;
                        arrayList.add(new OptionLegBundleWithRowIndex(optionLegBundle, i, ds.getTableData().getQuoteIndex(), LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableStateProvider$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionSideBySideChainTableStateProvider.getSpreadSelectionState$lambda$18$lambda$16(askPrice2);
                            }
                        })));
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        askPrice2 = optionInstrumentQuote != null ? optionInstrumentQuote.getBidPrice() : null;
                        decimals4 = null;
                        arrayList.add(new OptionLegBundleWithRowIndex(optionLegBundle, i, ds.getTableData().getQuoteIndex(), LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableStateProvider$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionSideBySideChainTableStateProvider.getSpreadSelectionState$lambda$18$lambda$16(askPrice2);
                            }
                        })));
                    }
                }
                if (putInstrument != null && optionLegBundle2 != null) {
                    OptionInstrumentQuote optionInstrumentQuote2 = ds.getOptionInstrumentQuotes().get(putInstrument.getId());
                    int i4 = WhenMappings.$EnumSwitchMapping$0[optionLegBundle2.getOptionConfigurationBundle().getOptionSide().ordinal()];
                    if (i4 == 1) {
                        if (optionInstrumentQuote2 != null) {
                            askPrice = optionInstrumentQuote2.getAskPrice();
                        }
                        arrayList2.add(new OptionLegBundleWithRowIndex(optionLegBundle2, i, ds.getTableData().getQuoteIndex(), LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableStateProvider$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionSideBySideChainTableStateProvider.getSpreadSelectionState$lambda$18$lambda$17(askPrice);
                            }
                        })));
                    } else {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        askPrice = optionInstrumentQuote2 != null ? optionInstrumentQuote2.getBidPrice() : decimals4;
                        arrayList2.add(new OptionLegBundleWithRowIndex(optionLegBundle2, i, ds.getTableData().getQuoteIndex(), LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableStateProvider$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionSideBySideChainTableStateProvider.getSpreadSelectionState$lambda$18$lambda$17(askPrice);
                            }
                        })));
                    }
                }
            }
            i = i2;
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((OptionLegBundleWithRowIndex) it.next()).getRowIndex()));
        }
        PrimitiveRanges2 indexRange = IndexRangeUtil.getIndexRange(arrayList3);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Integer.valueOf(((OptionLegBundleWithRowIndex) it2.next()).getRowIndex()));
        }
        PrimitiveRanges2 indexRange2 = IndexRangeUtil.getIndexRange(arrayList4);
        if (indexRange == null && indexRange2 == null) {
            return null;
        }
        return new SpreadSelectionState(indexRange, indexRange2, extensions2.toPersistentList(arrayList), extensions2.toPersistentList(arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSpreadSelectionState$lambda$18$lambda$16(Decimals4 decimals4) {
        return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), decimals4 != null ? decimals4.getUnsignedValue() : null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSpreadSelectionState$lambda$18$lambda$17(Decimals4 decimals4) {
        return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), decimals4 != null ? decimals4.getUnsignedValue() : null, null, 2, null);
    }

    public final BidAskCellDisableType getBidAskCellDisableType$feature_options_chain_externalDebug(OptionSideBySideChainTableDataState ds, boolean isBid, OptionInstrument optionInstrument, TopBannerErrorType topBannerErrorType) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        UiOptionPositionCounts uiOptionPositionCounts = ds.getOptionPositionCount().get(optionInstrument != null ? optionInstrument.getId() : null);
        int i = topBannerErrorType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[topBannerErrorType.ordinal()];
        if (i == -1) {
            if (ds.getOptionInstrumentIdToTradabilityMap().get(optionInstrument != null ? optionInstrument.getId() : null) != Tradability.POSITION_CLOSING_ONLY) {
                return null;
            }
            if (uiOptionPositionCounts == null) {
                return BidAskCellDisableType.CONTRACT_PCO;
            }
            if (isBid && uiOptionPositionCounts.getLongQuantity() != 0) {
                return null;
            }
            if (isBid || uiOptionPositionCounts.getShortQuantity() == 0) {
                return BidAskCellDisableType.CONTRACT_PCO;
            }
            return null;
        }
        if (i == 1) {
            return BidAskCellDisableType.PCO_NO_WATCHLIST;
        }
        if (i == 2) {
            return BidAskCellDisableType.OTHER;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (uiOptionPositionCounts == null) {
            return BidAskCellDisableType.PCO_NO_WATCHLIST;
        }
        if (isBid && uiOptionPositionCounts.getLongQuantity() != 0) {
            return null;
        }
        if (isBid || uiOptionPositionCounts.getShortQuantity() == 0) {
            return BidAskCellDisableType.PCO_NO_WATCHLIST;
        }
        return null;
    }

    public final boolean shouldShowPopUpsInNux$feature_options_chain_externalDebug(OptionSideBySideChainTableDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        OptionSideBySideChainDataState4 nuxMode = ds.getNuxMode();
        OptionSideBySideChainDataState4 optionSideBySideChainDataState4 = OptionSideBySideChainDataState4.DEEPLINK_ONBOARDING;
        if (nuxMode == optionSideBySideChainDataState4 && ds.isNuxAnimationFinished() && ds.isNuxSearchDismissed()) {
            return true;
        }
        return (ds.getNuxMode() != optionSideBySideChainDataState4 && ds.getNuxMode().getInNuxMode() && ds.isNuxAnimationFinished()) || !ds.getNuxMode().getInNuxMode();
    }

    private final boolean getShouldShowZeroDteBottomSheet(TopErrorBannerState topErrorBannerState, boolean shouldShowPopUpsInNux) {
        if (shouldShowPopUpsInNux) {
            return (topErrorBannerState != null ? topErrorBannerState.getType() : null) == TopBannerErrorType.PCO_BEFORE_SELLOUT;
        }
        return false;
    }

    private final Instant selloutTimeWhenShouldShowSelloutWarningSnackbar(OptionSideBySideChainTableDataState ds, boolean shouldShowPopUpsInNux) {
        Instant selloutDateTime;
        if (!shouldShowPopUpsInNux || ds.getInSnackbarDismissalFollowUpExperiment() || ds.getSelloutSnackbarDismissedOrElapsed()) {
            return null;
        }
        if (ds.getNuxMode() == OptionSideBySideChainDataState4.SBS_NUX_REVAMP && !ds.isEduFooterAnimationDismissed()) {
            return null;
        }
        OptionChainExpirationDateState expirationDateState = ds.getExpirationDateState();
        UiOptionChain uiOptionChain = expirationDateState != null ? expirationDateState.getUiOptionChain() : null;
        if (uiOptionChain == null || uiOptionChain.getUnderlyingType() == OptionChain.UnderlyingType.INDEX || (selloutDateTime = ds.getSelloutDateTime()) == null) {
            return null;
        }
        LocalDate localDate$default = Instants.toLocalDate$default(selloutDateTime, null, 1, null);
        LocalDate localDateNow = LocalDate.now(this.clock);
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        boolean z = localDate$default.until(localDateNow, ChronoUnit.DAYS) == 0;
        Instant instantNow = Instant.now(this.clock);
        if (!ds.getTradeOnExpirationState().isEnabled() || !z || selloutDateTime.compareTo(instantNow) <= 0 || selloutDateTime.getEpochSecond() - OptionChainListView9.SNACK_DURATION_BEFORE_SELLOUT_SEC >= instantNow.getEpochSecond()) {
            return null;
        }
        return selloutDateTime;
    }

    private final OptionSideBySideChainTableEvent getInitialScrollEvent(OptionSideBySideChainTableDataState ds) {
        Integer targetInstrumentIndex = ds.getTableData().getTargetInstrumentIndex();
        Integer targetRowIndexByNearestStrike = ds.getTableData().getTargetRowIndexByNearestStrike();
        Map<String, ScrollPosition> savedScrollPositions = ds.getSavedScrollPositions();
        OptionChainExpirationDateState expirationDateState = ds.getExpirationDateState();
        ScrollPosition scrollPosition = savedScrollPositions.get(expirationDateState != null ? expirationDateState.getKey() : null);
        Integer quoteIndex = ds.getTableData().getQuoteIndex();
        boolean inNuxMode = ds.getNuxMode().getInNuxMode();
        if (targetInstrumentIndex != null && !ds.getHasScrolledToTargetRowIndex()) {
            return new OptionSideBySideChainTableEvent.ScrollToTargetRowIndex(targetInstrumentIndex.intValue());
        }
        if (targetRowIndexByNearestStrike != null && !ds.getHasScrolledToTargetRowIndex()) {
            return new OptionSideBySideChainTableEvent.ScrollToTargetRowIndex(targetRowIndexByNearestStrike.intValue());
        }
        if (scrollPosition != null) {
            return new OptionSideBySideChainTableEvent.ScrollToPosition(scrollPosition);
        }
        if (quoteIndex != null && inNuxMode && !ds.isNuxAnimationFinished()) {
            return new OptionSideBySideChainTableEvent.NuxScrollToQuotePosition(quoteIndex.intValue());
        }
        if (quoteIndex != null) {
            return new OptionSideBySideChainTableEvent.ScrollToQuotePosition(quoteIndex.intValue());
        }
        return null;
    }
}
