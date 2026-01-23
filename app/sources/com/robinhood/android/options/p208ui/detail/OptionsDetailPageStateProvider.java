package com.robinhood.android.options.p208ui.detail;

import android.content.res.Resources;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResource2;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartData;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.common.options.OptionsExtendedHoursUtil;
import com.robinhood.android.common.options.toolbar.OptionsToolbarDisplayMode;
import com.robinhood.android.common.options.toolbar.OptionsToolbarUtils;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexHistoricals;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.ExerciseOptionInstrumentId;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.C22993R;
import com.robinhood.android.options.calculation.greeks.OptionsGreekAggregationCalculation;
import com.robinhood.android.options.calculation.greeks.OptionsGreeks;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.contracts.ComboOrderDetailFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.options.contracts.OptionsSimulatedReturnFragmentKey;
import com.robinhood.android.options.extensions.UiAggregateOptionPositionFulls;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.common.CommonApiOptionTodayTotalReturnResponse2;
import com.robinhood.android.options.optionsstring.common.OptionExtensions2;
import com.robinhood.android.options.optionsstring.common.OptionInstrumentDetails2;
import com.robinhood.android.options.optionsstring.common.UiComboOrders2;
import com.robinhood.android.options.optionsstring.common.UiOptionEvents;
import com.robinhood.android.options.optionsstring.common.UiOptionInstrumentPositions2;
import com.robinhood.android.options.optionsstring.common.UiOptionOrders2;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.android.options.p208ui.bottomsheet.LateCloseBottomSheetDialogFragment;
import com.robinhood.android.options.p208ui.detail.OptionRow;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageDataCell2;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageDataState;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageToolbarState;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.Decimals3;
import com.robinhood.models.Decimals4;
import com.robinhood.models.SortableHistoryItem;
import com.robinhood.models.SortableHistoryItems;
import com.robinhood.models.api.ApiOptionStrategyBreakeven2;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse2;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionPosition;
import com.robinhood.models.p320db.AggregateOptionPositionLeg;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.LateCloseAnnouncementCardFlag;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionStrategyInfo;
import com.robinhood.models.p320db.OptionStrategyLeg;
import com.robinhood.models.p320db.OptionUnderlier;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiAggregateOptionPositionLeg;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.models.p355ui.UiQuoteHistorical;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.ComboOrderDetailContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: OptionsDetailPageStateProvider.kt */
@Metadata(m3635d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J3\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b(\u0010)J3\u0010*\u001a\u0004\u0018\u00010'2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b*\u0010)J3\u0010+\u001a\u0004\u0018\u00010'2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b+\u0010)J3\u0010,\u001a\u0004\u0018\u00010'2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b,\u0010)J#\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u00102J)\u00108\u001a\u0002072\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b>\u0010?J#\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020C2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bJ\u0010KJ#\u0010O\u001a\u0004\u0018\u00010N2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bO\u0010PJ/\u0010V\u001a\u0004\u0018\u00010U2\b\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010S\u001a\u0004\u0018\u00010Q2\b\u0010T\u001a\u0004\u0018\u00010LH\u0002¢\u0006\u0004\bV\u0010WJI\u0010c\u001a\u0004\u0018\u00010b2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010]\u001a\u00020\\2\b\u0010^\u001a\u0004\u0018\u00010L2\u0006\u0010_\u001a\u00020\\2\b\u0010a\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0004\bc\u0010dJ#\u0010e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\be\u0010fJ\u001b\u0010k\u001a\u00060ij\u0002`j2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bk\u0010lJ;\u0010n\u001a\u0004\u0018\u00010m2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010_\u001a\u00020\\H\u0002¢\u0006\u0004\bn\u0010oJ!\u0010q\u001a\u0004\u0018\u00010p2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020s2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\\2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\u00032\u0006\u0010x\u001a\u00020\u0002H\u0016¢\u0006\u0004\by\u0010zR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010{R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010|¨\u0006}"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageViewState;", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "historyNavigator", "Landroid/content/res/Resources;", "resources", "<init>", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;Landroid/content/res/Resources;)V", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;", "page", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getPageDirection", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "ds", "", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageState;", "createPageStates", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;)Ljava/util/List;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;", "createToolbarState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;", "", "pageIndex", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;", "loggingState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodyState;", "createBodyState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;ILcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodyState;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Chart;", "createChartState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Chart;", "", "getDisplayName", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Ljava/lang/CharSequence;", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;", "getPortfolioRiskAnalyzerKey", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Position;", "createPositionState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;ILcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Position;", "createAggregatePositionState", "createInstrumentPositionState", "createWatchlistPositionState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Stats;", "createStatsState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Stats;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell;", "createUpsellState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell;", "Lcom/robinhood/models/db/OptionChain;", "optionChain", "j$/time/Instant", "lateCloseTime", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell$LateClose;", "createLateCloseUpsellState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/models/db/OptionChain;Lj$/time/Instant;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell$LateClose;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Greeks;", "createGreeksState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Greeks;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Options;", "createOptionsState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Options;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$History;", "createHistoryState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$History;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Disclosure;", "createDisclosureState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Disclosure;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "createTradebarData", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Banner;", "createBannerState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Banner;", "", "strategyCode", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageUiOptionPositionState;", "createUiPositionState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;Ljava/lang/String;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageUiOptionPositionState;", "Ljava/util/UUID;", "indexId", "equityInstrumentId", "accountNumber", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getUnderlyingIntentKey", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "activeChartSpan", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "uiStrategyInfo", "", "isLegContext", "fixedAccountNumber", "useWatchlist", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;", "getProjectedReturnFragmentKey", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/models/ui/UiOptionStrategyInfo;ZLjava/lang/String;ZLcom/robinhood/models/db/OptionChain$UnderlyingType;)Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;", "createLoggingState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "uiComboOrder", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "createComboOrderDetailEventContext", "(Lcom/robinhood/android/options/combo/ui/UiComboOrder;)Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageSimulatedReturnState;", "getSimulatedReturnState", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState$PageData;ILcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;Z)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageSimulatedReturnState;", "Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "getSimulatedReturnTooltipState", "(ILcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;)Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip$AverageCostTooltip;", "getAverageCostTooltip", "(Ljava/lang/String;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip$AverageCostTooltip;", "shouldShowAverageCostTooltip", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;)Z", "dataState", "reduce", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageViewState;", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "Landroid/content/res/Resources;", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsDetailPageStateProvider implements StateProvider<OptionsDetailPageDataState, OptionsDetailPageViewState> {
    public static final int $stable = 8;
    private final HistoryNavigator historyNavigator;
    private final Resources resources;

    /* compiled from: OptionsDetailPageStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[OrderDirection.values().length];
            try {
                iArr[OrderDirection.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderDirection.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr2[OptionChain.UnderlyingType.INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionChain.UnderlyingType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderSide.values().length];
            try {
                iArr3[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BrokerageAccountType.values().length];
            try {
                iArr4[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public OptionsDetailPageStateProvider(HistoryNavigator historyNavigator, Resources resources) {
        Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.historyNavigator = historyNavigator;
        this.resources = resources;
    }

    private final Direction getPageDirection(OptionsDetailPageDataState.PageData page) {
        OptionHistoricalChartModel historicalChart;
        OptionHistoricalChartData chartData;
        Direction pageDirection;
        return (page == null || (historicalChart = page.getHistoricalChart()) == null || (chartData = historicalChart.getChartData()) == null || (pageDirection = chartData.getPageDirection()) == null) ? Direction.f5855UP : pageDirection;
    }

    private final List<OptionsDetailPageState> createPageStates(OptionsDetailPageDataState ds) {
        int size = ds.getStrategyCodeList().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            OptionsDetailPageLoggingState optionsDetailPageLoggingStateCreateLoggingState = createLoggingState(ds, ds.get(i));
            Direction pageDirection = getPageDirection(ds.get(i));
            OptionsDetailPageDataState.PageData pageData = ds.get(i);
            OptionsAccountSwitcherId optionsAccountSwitcherId = null;
            Boolean hasRealPosition = pageData != null ? pageData.getHasRealPosition() : null;
            OptionsDetailPageDataState.PageData pageData2 = ds.get(i);
            if (pageData2 != null) {
                optionsAccountSwitcherId = pageData2.getOptionsAccountSwitcherId();
            }
            arrayList.add(new OptionsDetailPageState(pageDirection, hasRealPosition, optionsAccountSwitcherId, createToolbarState(ds, ds.get(i)), createBodyState(ds, ds.get(i), i, optionsDetailPageLoggingStateCreateLoggingState), createTradebarData(ds.get(i)), optionsDetailPageLoggingStateCreateLoggingState, createUiPositionState(ds.get(i), ds.getStrategyCodeList().get(i))));
        }
        return arrayList;
    }

    private final OptionsDetailPageToolbarState createToolbarState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page) {
        Decimals3 adjustedMarkPrice;
        OptionStrategyInfo optionStrategyInfo;
        OptionChain optionChain;
        if (page == null) {
            return null;
        }
        Account currentAccount = ds.getCurrentAccount();
        String accountNumber = currentAccount != null ? currentAccount.getAccountNumber() : null;
        UiOptionChain uiOptionChain = page.getUiOptionChain();
        OptionChain.UnderlyingType underlyingType = uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null;
        UUID underlierInstrumentId = page.getUnderlierInstrumentId();
        String underlyingSymbol = page.getUnderlyingSymbol();
        UiOptionChain uiOptionChain2 = page.getUiOptionChain();
        UUID id = (uiOptionChain2 == null || (optionChain = uiOptionChain2.getOptionChain()) == null) ? null : optionChain.getId();
        UiOptionStrategyInfo uiStrategyInfo = page.getUiStrategyInfo();
        String strategyCode = (uiStrategyInfo == null || (optionStrategyInfo = uiStrategyInfo.getOptionStrategyInfo()) == null) ? null : optionStrategyInfo.getStrategyCode();
        CharSequence displayName = getDisplayName(page);
        boolean zIsLegContext = ds.isLegContext();
        OptionsDetailPageToolbarState.MenuItemState.ViewUnderlier viewUnderlier = (accountNumber == null || underlyingType == null || underlyingSymbol == null || underlierInstrumentId == null) ? null : new OptionsDetailPageToolbarState.MenuItemState.ViewUnderlier(underlyingSymbol, underlierInstrumentId, accountNumber, underlyingType);
        OptionsDetailPageToolbarState.MenuItemState.PictureInPicture pictureInPicture = (!ds.isInPipExperiment() || accountNumber == null || underlierInstrumentId == null || id == null || underlyingType == null || underlyingSymbol == null || strategyCode == null) ? null : new OptionsDetailPageToolbarState.MenuItemState.PictureInPicture(underlierInstrumentId, id, underlyingType, underlyingSymbol, strategyCode, String.valueOf(displayName), accountNumber, zIsLegContext);
        Resources resources = this.resources;
        UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = page.getUiAggregatePositionIncludingZeroQuantity();
        UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity = page.getUiOptionInstrumentPositionIncludingZeroQuantity();
        UiOptionStrategyInfo uiStrategyInfo2 = page.getUiStrategyInfo();
        OptionsToolbarDisplayMode optionsToolbarDisplayMode = OptionsToolbarDisplayMode.OPTIONS_DETAIL_PAGE;
        if (underlyingType == null) {
            underlyingType = OptionChain.UnderlyingType.EQUITY;
        }
        CharSequence toolbarTitle$default = OptionsToolbarUtils.getToolbarTitle$default(resources, uiAggregatePositionIncludingZeroQuantity, uiOptionInstrumentPositionIncludingZeroQuantity, uiStrategyInfo2, null, optionsToolbarDisplayMode, false, underlyingType, 64, null);
        NumberFormatter priceFormat = Formats.getPriceFormat();
        AggregateOptionStrategyQuote aggregateOptionStrategyQuote = page.getAggregateOptionStrategyQuote();
        return new OptionsDetailPageToolbarState(toolbarTitle$default, NumberFormatter.DefaultImpls.formatNullable$default(priceFormat, (aggregateOptionStrategyQuote == null || (adjustedMarkPrice = aggregateOptionStrategyQuote.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice.getUnsignedValue(), null, 2, null), CollectionsKt.listOfNotNull((Object[]) new OptionsDetailPageToolbarState.MenuItemState[]{pictureInPicture, viewUnderlier}));
    }

    private final OptionsDetailPageBodyState createBodyState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page, int pageIndex, OptionsDetailPageLoggingState loggingState) {
        if (page == null) {
            return null;
        }
        boolean z = ds.getMultiLegGreekExperimentVariant() == Experiments.OptionsMultiLegGreek.Variant.OPTION_THEN_GREEK;
        return new OptionsDetailPageBodyState(CollectionsKt.listOfNotNull((Object[]) new OptionsDetailPageBodyState2[]{createBannerState(page), createChartState(ds, page), createPositionState(ds, page, pageIndex, loggingState), createUpsellState(ds, page), createStatsState(ds, page), !z ? createGreeksState(ds, page) : null, createOptionsState(ds, page), z ? createGreeksState(ds, page) : null, createHistoryState(ds, page), createDisclosureState(ds)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final OptionsDetailPageBodyState2.Chart createChartState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page) throws Resources.NotFoundException {
        boolean z;
        Instant instant;
        Instant createdAt;
        OptionInstrumentPosition optionInstrumentPosition;
        String symbol;
        OptionChain optionChain;
        OptionChain.LateCloseState lateCloseState;
        OptionUnderlier underlier;
        OptionChain optionChain2;
        Integer selloutTimeToExpiration;
        Instrument instrument;
        AggregateOptionPosition aggregateOptionPosition;
        OptionChain optionChain3;
        OptionChain.ExtendedHoursState extendedHoursState;
        CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip = null;
        if (page == null) {
            return null;
        }
        boolean inIndexOptionsCurbHoursExperiment = ds.getInIndexOptionsCurbHoursExperiment();
        UiOptionChain uiOptionChain = page.getUiOptionChain();
        if (uiOptionChain == null || (optionChain3 = uiOptionChain.getOptionChain()) == null || (extendedHoursState = optionChain3.getExtendedHoursState()) == null) {
            z = false;
        } else {
            z = true;
            if (!extendedHoursState.getHasExtendedHours()) {
            }
        }
        boolean zIsOptionsExtendedHoursEnabled = OptionsExtendedHoursUtil.isOptionsExtendedHoursEnabled(inIndexOptionsCurbHoursExperiment, z);
        CharSequence displayName = getDisplayName(page);
        DisplaySpan activeDisplaySpan = page.getActiveDisplaySpan();
        if (activeDisplaySpan == null) {
            activeDisplaySpan = DisplaySpan.DAY;
        }
        DisplaySpan displaySpan = activeDisplaySpan;
        UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = page.getUiAggregatePositionIncludingZeroQuantity();
        if (uiAggregatePositionIncludingZeroQuantity == null || (aggregateOptionPosition = uiAggregatePositionIncludingZeroQuantity.getAggregateOptionPosition()) == null || (createdAt = aggregateOptionPosition.getCreatedAt()) == null) {
            UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity = page.getUiOptionInstrumentPositionIncludingZeroQuantity();
            if (uiOptionInstrumentPositionIncludingZeroQuantity == null || (optionInstrumentPosition = uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition()) == null) {
                CuratedListItem curatedListItem = page.getCuratedListItem();
                if (curatedListItem != null) {
                    createdAt = curatedListItem.getCreatedAt();
                } else {
                    instant = null;
                }
            } else {
                createdAt = optionInstrumentPosition.getCreatedAt();
            }
            instant = createdAt;
        } else {
            instant = createdAt;
        }
        OptionHistoricalChartModel historicalChart = page.getHistoricalChart();
        IndexCloseValue indexCloseValue = page.getIndexCloseValue();
        IndexHistoricals indexHistoricals = page.getIndexHistoricals();
        IndexValue indexValue = page.getIndexValue();
        UiOptionUnderlier uiOptionUnderlier = page.getUiOptionUnderlier();
        if (uiOptionUnderlier == null || (instrument = uiOptionUnderlier.getInstrument()) == null || (symbol = instrument.getSymbol()) == null) {
            symbol = "";
        }
        String str = symbol;
        MarketHours marketHours = ds.getMarketHours();
        Instant lateOptionClosesAt = marketHours != null ? marketHours.getLateOptionClosesAt() : null;
        MarketHours marketHours2 = ds.getMarketHours();
        Instant regularClosesAt = marketHours2 != null ? marketHours2.getRegularClosesAt() : null;
        Screen.Name name = Screen.Name.OPTION_STRATEGY_DETAIL;
        UiOptionChain uiOptionChain2 = page.getUiOptionChain();
        LateCloseBottomSheetDialogFragment.Args args = new LateCloseBottomSheetDialogFragment.Args(str, lateOptionClosesAt, regularClosesAt, name, (uiOptionChain2 == null || (optionChain2 = uiOptionChain2.getOptionChain()) == null || (selloutTimeToExpiration = optionChain2.getSelloutTimeToExpiration()) == null) ? null : Long.valueOf(selloutTimeToExpiration.intValue()));
        boolean showCandlestickChart = ds.getShowCandlestickChart();
        boolean showAllHoursChart = zIsOptionsExtendedHoursEnabled ? ds.getShowAllHoursChart() : false;
        UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity2 = page.getUiAggregatePositionIncludingZeroQuantity();
        if (uiAggregatePositionIncludingZeroQuantity2 == null || (optionChain = uiAggregatePositionIncludingZeroQuantity2.getOptionChain()) == null) {
            UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity2 = page.getUiOptionInstrumentPositionIncludingZeroQuantity();
            if (uiOptionInstrumentPositionIncludingZeroQuantity2 != null) {
                optionChain = uiOptionInstrumentPositionIncludingZeroQuantity2.getOptionChain();
            } else {
                UiOptionStrategyInfo uiStrategyInfo = page.getUiStrategyInfo();
                optionChain = uiStrategyInfo != null ? uiStrategyInfo.getOptionChain() : null;
            }
        }
        if (optionChain == null || (lateCloseState = optionChain.getLateCloseState()) == null) {
            lateCloseState = (OptionChain.LateCloseState) OptionChain.LateCloseState.INSTANCE.getDefault();
        }
        boolean isLateClosing = lateCloseState.getIsLateClosing();
        UiQuoteHistorical equityUiQuoteHistorical = page.getEquityUiQuoteHistorical();
        Index indexInstrument = page.getIndexInstrument();
        UUID id = indexInstrument != null ? indexInstrument.getId() : null;
        UiOptionUnderlier uiOptionUnderlier2 = page.getUiOptionUnderlier();
        UUID instrumentId = (uiOptionUnderlier2 == null || (underlier = uiOptionUnderlier2.getUnderlier()) == null) ? null : underlier.getInstrumentId();
        Account currentAccount = ds.getCurrentAccount();
        FragmentKey underlyingIntentKey = getUnderlyingIntentKey(id, instrumentId, currentAccount != null ? currentAccount.getAccountNumber() : null);
        Quote equityQuote = page.getEquityQuote();
        String underlyingSymbol = page.getUnderlyingSymbol();
        boolean usePrice = page.getUsePrice();
        UiOptionChain uiOptionChain3 = page.getUiOptionChain();
        OptionChain.UnderlyingType underlyingType = uiOptionChain3 != null ? uiOptionChain3.getUnderlyingType() : null;
        if (zIsOptionsExtendedHoursEnabled && ds.getInIndexOptionsCurbHoursExperiment() && page.getUiStrategyInfo() != null && ds.getIndexOptionsCurbHoursTooltipPref() != null && !ds.getIndexOptionsCurbHoursTooltipPref().get()) {
            String str2 = "options_detail_page_index_curb_hours_tooltip_" + page.getUiStrategyInfo().getOptionStrategyInfo().getStrategyCode();
            String string2 = this.resources.getString(C22993R.string.gated_options_options_detail_page_index_curb_hours_tooltip, DateStrings2.formatTo24HourTime(17, 0, LocalTimeFormatter.SHORT_OPTIONAL_MINUTE));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            tertiaryValueTooltip = new CursorRowModifiers.TertiaryValueTooltip(str2, string2, ds.getIndexOptionsCurbHoursTooltipPref(), OptionsDetailPageFragment.CANVAS_TAG);
        }
        return new OptionsDetailPageBodyState2.Chart(displaySpan, displayName, instant, historicalChart, indexCloseValue, indexHistoricals, indexValue, isLateClosing, args, showCandlestickChart, showAllHoursChart, equityUiQuoteHistorical, underlyingIntentKey, underlyingSymbol, underlyingType, equityQuote, usePrice, tertiaryValueTooltip, zIsOptionsExtendedHoursEnabled, null, ds.isInMcwRegionGate(), 524288, null);
    }

    private final CharSequence getDisplayName(OptionsDetailPageDataState.PageData page) {
        OptionChain.UnderlyingType underlyingType;
        OptionInstrument optionInstrument;
        UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = page.getUiAggregatePositionIncludingZeroQuantity();
        if (uiAggregatePositionIncludingZeroQuantity != null) {
            return OptionExtensions2.getStrategyTitle$default(uiAggregatePositionIncludingZeroQuantity, this.resources, false, uiAggregatePositionIncludingZeroQuantity.getUiOptionChain().getUnderlyingType(), 2, null);
        }
        UiOptionChain uiOptionChain = page.getUiOptionChain();
        if (uiOptionChain != null && (underlyingType = uiOptionChain.getUnderlyingType()) != null) {
            UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity = page.getUiOptionInstrumentPositionIncludingZeroQuantity();
            if (uiOptionInstrumentPositionIncludingZeroQuantity != null && (optionInstrument = uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrument()) != null) {
                return OptionInstrumentDetails2.getFormattedTitleString(optionInstrument, this.resources, underlyingType);
            }
            UiOptionStrategyInfo uiStrategyInfo = page.getUiStrategyInfo();
            if (uiStrategyInfo != null) {
                return OptionExtensions2.getStrategyTitle(uiStrategyInfo, this.resources, page.getUiStrategyInfo().getOptionChain().getSymbol(), underlyingType);
            }
        }
        return null;
    }

    private final OptionsPortfolioRiskAnalyzer getPortfolioRiskAnalyzerKey(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page) {
        Account currentAccount;
        String accountNumber;
        if (!ds.getInPortfolioRiskAnalyzerExperiment() || (currentAccount = ds.getCurrentAccount()) == null || (accountNumber = currentAccount.getAccountNumber()) == null) {
            return null;
        }
        return new OptionsPortfolioRiskAnalyzer.WithAccountNumber(accountNumber, page.getUnderlierInstrumentId());
    }

    private final OptionsDetailPageBodyState2.Position createPositionState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page, int pageIndex, OptionsDetailPageLoggingState loggingState) {
        if (page.getUiAggregatePositionIncludingZeroQuantity() != null && page.getUiAggregatePositionIncludingZeroQuantity().getQuantity().compareTo(BigDecimal.ZERO) != 0) {
            return createAggregatePositionState(ds, page, pageIndex, loggingState);
        }
        if (page.getUiOptionInstrumentPositionIncludingZeroQuantity() != null && page.getUiOptionInstrumentPositionIncludingZeroQuantity().getOptionInstrumentPosition().getQuantity().compareTo(BigDecimal.ZERO) != 0) {
            return createInstrumentPositionState(ds, page, pageIndex, loggingState);
        }
        if (page.getCuratedListItem() != null) {
            return createWatchlistPositionState(ds, page, pageIndex, loggingState);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final OptionsDetailPageBodyState2.Position createAggregatePositionState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page, int pageIndex, OptionsDetailPageLoggingState loggingState) throws Resources.NotFoundException {
        OptionChain optionChain;
        UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity;
        String string2;
        LegacyIntentKey.OptionExercise optionExercise;
        String str;
        Decimals3 adjustedMarkPrice;
        String totalReturnString;
        String todaysReturnString;
        UiOptionStrategyInfo uiStrategyInfo = page.getUiStrategyInfo();
        if (uiStrategyInfo == null || (optionChain = uiStrategyInfo.getOptionChain()) == null || (uiAggregatePositionIncludingZeroQuantity = page.getUiAggregatePositionIncludingZeroQuantity()) == null) {
            return null;
        }
        AggregateOptionStrategyQuote aggregateOptionStrategyQuote = page.getAggregateOptionStrategyQuote();
        boolean zIsSingleLeg = page.getUiStrategyInfo().isSingleLeg();
        List<BigDecimal> bigDecimals = ApiOptionStrategyBreakeven2.toBigDecimals(page.getBreakeven());
        ApiOptionTodayTotalReturnResponse3 todayTotalReturn = page.getTodayTotalReturn();
        String str2 = "-";
        String str3 = (todayTotalReturn == null || (todaysReturnString = CommonApiOptionTodayTotalReturnResponse2.getTodaysReturnString(todayTotalReturn, this.resources)) == null) ? "-" : todaysReturnString;
        ApiOptionTodayTotalReturnResponse3 todayTotalReturn2 = page.getTodayTotalReturn();
        String str4 = (todayTotalReturn2 == null || (totalReturnString = CommonApiOptionTodayTotalReturnResponse2.getTotalReturnString(todayTotalReturn2, this.resources)) == null) ? "-" : totalReturnString;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String string3 = zIsSingleLeg ? this.resources.getString(C22993R.string.options_detail_page_single_leg_position_quantity_label) : this.resources.getString(C22993R.string.options_detail_page_multi_leg_position_quantity_label);
        Intrinsics.checkNotNull(string3);
        listCreateListBuilder.add(new CellState(string3, Formats.getIntegerDeltaFormat().format(uiAggregatePositionIncludingZeroQuantity.getAggregateOptionPosition().getDeltaQuantity()), null, 4, null));
        String string4 = this.resources.getString(C22993R.string.options_detail_page_position_current_price_label);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        listCreateListBuilder.add(new CellState(string4, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (aggregateOptionStrategyQuote == null || (adjustedMarkPrice = aggregateOptionStrategyQuote.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice.getUnsignedValue(), null, 2, null), null, 4, null));
        int i = WhenMappings.$EnumSwitchMapping$0[uiAggregatePositionIncludingZeroQuantity.getAggregateOptionPosition().getDirection().ordinal()];
        if (i == 1) {
            string2 = ds.getPnlDataState().showAsterisk() ? this.resources.getString(C22993R.string.options_detail_page_position_average_credit_label_asterisk) : this.resources.getString(C22993R.string.options_detail_page_position_average_credit_label);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = ds.getPnlDataState().showAsterisk() ? this.resources.getString(C22993R.string.options_detail_page_position_average_cost_label_asterisk) : this.resources.getString(C22993R.string.options_detail_page_position_average_cost_label);
        }
        Intrinsics.checkNotNull(string2);
        if (ds.getPnlDataState().requireClearingData()) {
            BigDecimal absoluteClearingAverageStrategyPrice = uiAggregatePositionIncludingZeroQuantity.getAbsoluteClearingAverageStrategyPrice();
            if (absoluteClearingAverageStrategyPrice != null && (str = Formats.getCurrencyFormat().format(absoluteClearingAverageStrategyPrice)) != null) {
                str2 = str;
            }
        } else {
            str2 = Formats.getCurrencyFormat().format(uiAggregatePositionIncludingZeroQuantity.getAbsoluteAverageStrategyPrice());
        }
        listCreateListBuilder.add(new CellState(string2, str2, getAverageCostTooltip(page.getUiStrategyInfo().getOptionStrategyInfo().getStrategyCode())));
        String string5 = this.resources.getString(C22993R.string.options_detail_page_position_market_value_label);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        listCreateListBuilder.add(new CellState(string5, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getCurrencyDeltaFormat(), aggregateOptionStrategyQuote != null ? uiAggregatePositionIncludingZeroQuantity.getSignedMarketValue(aggregateOptionStrategyQuote, optionChain) : null, null, 2, null), null, 4, null));
        String string6 = (zIsSingleLeg && uiAggregatePositionIncludingZeroQuantity.getAggregateOptionPosition().getDirection() == OrderDirection.CREDIT) ? this.resources.getString(C22993R.string.options_detail_page_position_date_sold_label) : (zIsSingleLeg && uiAggregatePositionIncludingZeroQuantity.getAggregateOptionPosition().getDirection() == OrderDirection.DEBIT) ? this.resources.getString(C22993R.string.options_detail_page_position_date_bought_label) : this.resources.getString(C22993R.string.options_detail_page_position_date_opened_label);
        Intrinsics.checkNotNull(string6);
        listCreateListBuilder.add(new CellState(string6, OptionDateFormatter.getOPTION_OPEN_CLOSE_DATE_TIME_FORMATTER().format(uiAggregatePositionIncludingZeroQuantity.getAggregateOptionPosition().getCreatedAt()), null, 4, null));
        List<AggregateOptionPositionLeg> legs = uiAggregatePositionIncludingZeroQuantity.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((AggregateOptionPositionLeg) it.next()).getExpirationDate());
        }
        String string7 = CollectionsKt.singleOrNull((List) arrayList) != null ? this.resources.getString(C22993R.string.options_detail_page_position_single_expiration_label) : this.resources.getString(C22993R.string.options_detail_page_position_multiple_expiration_label);
        Intrinsics.checkNotNull(string7);
        listCreateListBuilder.add(new CellState(string7, UiAggregateOptionPositionFulls.getExpirationDateString(uiAggregatePositionIncludingZeroQuantity, this.resources), null, 4, null));
        if (page.getUnderlyingQuote() != null) {
            UiOptionChain uiOptionChain = page.getUiOptionChain();
            NumberFormatter numberFormatter = OptionUnderlyings.getNumberFormatter(uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null);
            String string8 = this.resources.getString(page.getUsePrice() ? C22993R.string.options_detail_page_position_breakeven_price_label : C22993R.string.options_detail_page_position_breakeven_value_label, page.getUnderlyingQuote().getSymbol());
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            listCreateListBuilder.add(new CellState(string8, NumberFormatter.DefaultImpls.formatMultiple$default(numberFormatter, bigDecimals, null, 2, null), null, 4, null));
            String string9 = this.resources.getString(page.getUsePrice() ? C22993R.string.options_detail_page_position_equity_price_label : C22993R.string.options_detail_page_position_equity_value_label, page.getUnderlyingQuote().getSymbol());
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            listCreateListBuilder.add(new CellState(string9, page.getUnderlyingQuote().format(), null, 4, null));
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        if (page.getUnderlyingTypeSupportsExercise()) {
            AggregateOptionPositionLeg aggregateOptionPositionLeg = (AggregateOptionPositionLeg) CollectionsKt.singleOrNull((List) uiAggregatePositionIncludingZeroQuantity.getLegs());
            if ((aggregateOptionPositionLeg != null ? aggregateOptionPositionLeg.getPositionType() : null) == OptionPositionType.LONG && BigDecimals7.isPositive(uiAggregatePositionIncludingZeroQuantity.getQuantity())) {
                Account currentAccount = ds.getCurrentAccount();
                optionExercise = new LegacyIntentKey.OptionExercise(currentAccount != null ? currentAccount.getAccountNumber() : null, new ExerciseOptionInstrumentId.OptionToBeExercisedId(((AggregateOptionPositionLeg) CollectionsKt.single((List) uiAggregatePositionIncludingZeroQuantity.getLegs())).getOptionInstrumentId()));
            }
        } else {
            optionExercise = null;
        }
        String string10 = this.resources.getString(C22993R.string.options_detail_page_position_section_title);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        return new OptionsDetailPageBodyState2.Position(string10, null, listBuild, str3, str4, !uiAggregatePositionIncludingZeroQuantity.getHasOptionsListedToday(), (!ds.getPnlDataState().requireClearingData() || uiAggregatePositionIncludingZeroQuantity.getHasClearingData()) ? getSimulatedReturnState(ds, page, pageIndex, loggingState, false) : null, optionExercise, shouldShowAverageCostTooltip(ds), getPortfolioRiskAnalyzerKey(ds, page));
    }

    private final OptionsDetailPageBodyState2.Position createInstrumentPositionState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page, int pageIndex, OptionsDetailPageLoggingState loggingState) throws Resources.NotFoundException {
        OptionChain optionChain;
        UUID optionId;
        String string2;
        String string3;
        LegacyIntentKey.OptionExercise optionExercise;
        int i;
        int i2;
        String str;
        Decimals4 adjustedMarkPrice;
        String totalReturnString;
        String todaysReturnString;
        UiOptionStrategyInfo uiStrategyInfo = page.getUiStrategyInfo();
        if (uiStrategyInfo == null || (optionChain = uiStrategyInfo.getOptionChain()) == null) {
            return null;
        }
        UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity = page.getUiOptionInstrumentPositionIncludingZeroQuantity();
        if (uiOptionInstrumentPositionIncludingZeroQuantity == null) {
            return null;
        }
        OptionStrategyLeg optionStrategyLeg = (OptionStrategyLeg) CollectionsKt.singleOrNull((List) page.getUiStrategyInfo().getOptionStrategyInfo().getLegs());
        if (optionStrategyLeg == null || (optionId = optionStrategyLeg.getOptionId()) == null) {
            return null;
        }
        OptionInstrumentQuote optionInstrumentQuote = page.getOptionInstrumentIdToQuoteMap().get(optionId);
        List<BigDecimal> bigDecimals = ApiOptionStrategyBreakeven2.toBigDecimals(page.getBreakeven());
        ApiOptionTodayTotalReturnResponse3 todayTotalReturn = page.getTodayTotalReturn();
        String str2 = "-";
        String str3 = (todayTotalReturn == null || (todaysReturnString = CommonApiOptionTodayTotalReturnResponse2.getTodaysReturnString(todayTotalReturn, this.resources)) == null) ? "-" : todaysReturnString;
        ApiOptionTodayTotalReturnResponse3 todayTotalReturn2 = page.getTodayTotalReturn();
        String str4 = (todayTotalReturn2 == null || (totalReturnString = CommonApiOptionTodayTotalReturnResponse2.getTotalReturnString(todayTotalReturn2, this.resources)) == null) ? "-" : totalReturnString;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String string4 = this.resources.getString(C22993R.string.options_detail_page_single_leg_position_quantity_label);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        listCreateListBuilder.add(new CellState(string4, Formats.getIntegerDeltaFormat().format(uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition().getDeltaQuantity()), null, 4, null));
        String string5 = this.resources.getString(C22993R.string.options_detail_page_position_current_price_label);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        listCreateListBuilder.add(new CellState(string5, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (optionInstrumentQuote == null || (adjustedMarkPrice = optionInstrumentQuote.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice.getUnsignedValue(), null, 2, null), null, 4, null));
        OrderDirection direction = uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition().getDirection();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[direction.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (ds.getPnlDataState().showAsterisk()) {
                string2 = this.resources.getString(C22993R.string.options_detail_page_position_average_cost_label_asterisk);
            } else {
                string2 = this.resources.getString(C22993R.string.options_detail_page_position_average_cost_label);
            }
        } else if (ds.getPnlDataState().showAsterisk()) {
            string2 = this.resources.getString(C22993R.string.options_detail_page_position_average_credit_label_asterisk);
        } else {
            string2 = this.resources.getString(C22993R.string.options_detail_page_position_average_credit_label);
        }
        Intrinsics.checkNotNull(string2);
        if (ds.getPnlDataState().requireClearingData()) {
            BigDecimal absoluteClearingAverageStrategyPrice = uiOptionInstrumentPositionIncludingZeroQuantity.getAbsoluteClearingAverageStrategyPrice();
            if (absoluteClearingAverageStrategyPrice != null && (str = Formats.getCurrencyFormat().format(absoluteClearingAverageStrategyPrice)) != null) {
                str2 = str;
            }
        } else {
            str2 = Formats.getCurrencyFormat().format(uiOptionInstrumentPositionIncludingZeroQuantity.getAbsoluteAverageStrategyPrice());
        }
        listCreateListBuilder.add(new CellState(string2, str2, getAverageCostTooltip(page.getUiStrategyInfo().getOptionStrategyInfo().getStrategyCode())));
        String string6 = this.resources.getString(C22993R.string.options_detail_page_position_market_value_label);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        listCreateListBuilder.add(new CellState(string6, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getCurrencyDeltaFormat(), optionInstrumentQuote != null ? uiOptionInstrumentPositionIncludingZeroQuantity.getSignedMarketValue(optionInstrumentQuote, optionChain) : null, null, 2, null), null, 4, null));
        int i4 = iArr[uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition().getDirection().ordinal()];
        if (i4 == 1) {
            string3 = this.resources.getString(C22993R.string.options_detail_page_position_date_sold_label);
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string3 = this.resources.getString(C22993R.string.options_detail_page_position_date_bought_label);
        }
        String str5 = string3;
        Intrinsics.checkNotNull(str5);
        listCreateListBuilder.add(new CellState(str5, OptionDateFormatter.getOPTION_OPEN_CLOSE_DATE_TIME_FORMATTER().format(uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition().getCreatedAt()), null, 4, null));
        String string7 = this.resources.getString(C22993R.string.options_detail_page_position_single_expiration_label);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        listCreateListBuilder.add(new CellState(string7, UiOptionInstrumentPositions2.getExpirationDateString(uiOptionInstrumentPositionIncludingZeroQuantity, this.resources), null, 4, null));
        if (page.getUnderlyingQuote() != null) {
            UiOptionChain uiOptionChain = page.getUiOptionChain();
            NumberFormatter numberFormatter = OptionUnderlyings.getNumberFormatter(uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null);
            Resources resources = this.resources;
            if (page.getUsePrice()) {
                i = C22993R.string.options_detail_page_position_breakeven_price_label;
            } else {
                i = C22993R.string.options_detail_page_position_breakeven_value_label;
            }
            String string8 = resources.getString(i, page.getUnderlyingQuote().getSymbol());
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            listCreateListBuilder.add(new CellState(string8, NumberFormatter.DefaultImpls.formatMultiple$default(numberFormatter, bigDecimals, null, 2, null), null, 4, null));
            Resources resources2 = this.resources;
            if (page.getUsePrice()) {
                i2 = C22993R.string.options_detail_page_position_equity_price_label;
            } else {
                i2 = C22993R.string.options_detail_page_position_equity_value_label;
            }
            String string9 = resources2.getString(i2, page.getUnderlyingQuote().getSymbol());
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            listCreateListBuilder.add(new CellState(string9, page.getUnderlyingQuote().format(), null, 4, null));
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        if (page.getUnderlyingTypeSupportsExercise() && uiOptionInstrumentPositionIncludingZeroQuantity.getPositionType() == OptionPositionType.LONG && BigDecimals7.isPositive(uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition().getQuantity())) {
            Account currentAccount = ds.getCurrentAccount();
            optionExercise = new LegacyIntentKey.OptionExercise(currentAccount != null ? currentAccount.getAccountNumber() : null, new ExerciseOptionInstrumentId.OptionToBeExercisedId(optionId));
        } else {
            optionExercise = null;
        }
        String string10 = this.resources.getString(C22993R.string.options_detail_page_position_section_title);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        return new OptionsDetailPageBodyState2.Position(string10, null, listBuild, str3, str4, !uiOptionInstrumentPositionIncludingZeroQuantity.getHasOptionsListedToday(), (!ds.getPnlDataState().requireClearingData() || uiOptionInstrumentPositionIncludingZeroQuantity.getHasClearingData()) ? getSimulatedReturnState(ds, page, pageIndex, loggingState, false) : null, optionExercise, shouldShowAverageCostTooltip(ds), getPortfolioRiskAnalyzerKey(ds, page));
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final OptionsDetailPageBodyState2.Position createWatchlistPositionState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page, int pageIndex, OptionsDetailPageLoggingState loggingState) throws Resources.NotFoundException {
        OptionChain optionChain;
        UiOptionInstrumentPosition uiOptionInstrumentPosition;
        String string2;
        String totalReturnString;
        String todaysReturnString;
        int i;
        int i2;
        int i3;
        Decimals4 adjustedMarkPrice;
        Money optionOpenPrice;
        OrderDirection optionOpenPriceDirection;
        UiOptionStrategyLeg uiOptionStrategyLeg;
        OptionInstrument optionInstrument;
        OptionPositionType optionPositionType;
        UiOptionStrategyInfo uiStrategyInfo = page.getUiStrategyInfo();
        if (uiStrategyInfo == null || (optionChain = uiStrategyInfo.getOptionChain()) == null) {
            return null;
        }
        CuratedListItem curatedListItem = page.getCuratedListItem();
        if (curatedListItem == null || (optionOpenPrice = curatedListItem.getOptionOpenPrice()) == null || (optionOpenPriceDirection = page.getCuratedListItem().getOptionOpenPriceDirection()) == null || (uiOptionStrategyLeg = (UiOptionStrategyLeg) CollectionsKt.singleOrNull((List) page.getUiStrategyInfo().getLegs())) == null || (optionInstrument = uiOptionStrategyLeg.getOptionInstrument()) == null) {
            uiOptionInstrumentPosition = null;
        } else {
            BigDecimal decimalValue = optionOpenPrice.getDecimalValue();
            Instant createdAt = page.getCuratedListItem().getCreatedAt();
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-00000000000");
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            BigDecimal decimalValue2 = optionOpenPrice.getDecimalValue();
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            UUID id = page.getUiStrategyInfo().getOptionChain().getId();
            UUID id2 = optionInstrument.getId();
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            int i4 = WhenMappings.$EnumSwitchMapping$0[optionOpenPriceDirection.ordinal()];
            if (i4 == 1) {
                optionPositionType = OptionPositionType.SHORT;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                optionPositionType = OptionPositionType.LONG;
            }
            OptionInstrumentPosition optionInstrumentPosition = new OptionInstrumentPosition("", decimalValue, createdAt, null, null, null, null, null, null, ONE, uuidFromString, decimalValue2, ONE, id, id2, ZERO, ZERO, ZERO, ONE, optionPositionType);
            OptionChain optionChain2 = page.getUiStrategyInfo().getOptionChain();
            UiOptionUnderlier uiOptionUnderlier = page.getUiOptionUnderlier();
            uiOptionInstrumentPosition = new UiOptionInstrumentPosition(optionInstrumentPosition, optionInstrument, optionChain2, uiOptionUnderlier != null ? uiOptionUnderlier.getUnderlier() : null);
        }
        if (uiOptionInstrumentPosition == null) {
            return null;
        }
        OptionInstrumentQuote optionInstrumentQuote = page.getOptionInstrumentIdToQuoteMap().get(page.getUiStrategyInfo().getOptionStrategyInfo().getSingleLeg().getOptionId());
        List<BigDecimal> bigDecimals = ApiOptionStrategyBreakeven2.toBigDecimals(page.getBreakeven());
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String string3 = this.resources.getString(C22993R.string.options_detail_page_single_leg_position_quantity_label);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        listCreateListBuilder.add(new CellState(string3, Formats.getIntegerDeltaFormat().format(uiOptionInstrumentPosition.getOptionInstrumentPosition().getDeltaQuantity()), null, 4, null));
        String string4 = this.resources.getString(C22993R.string.options_detail_page_position_current_price_label);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        listCreateListBuilder.add(new CellState(string4, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (optionInstrumentQuote == null || (adjustedMarkPrice = optionInstrumentQuote.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice.getUnsignedValue(), null, 2, null), null, 4, null));
        int i5 = WhenMappings.$EnumSwitchMapping$0[uiOptionInstrumentPosition.getOptionInstrumentPosition().getDirection().ordinal()];
        if (i5 == 1) {
            string2 = this.resources.getString(C22993R.string.options_detail_page_position_credit_when_added_label);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = this.resources.getString(C22993R.string.options_detail_page_position_cost_when_added_label);
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        listCreateListBuilder.add(new CellState(str, Formats.getCurrencyFormat().format(uiOptionInstrumentPosition.getAbsoluteAverageStrategyPrice()), null, 4, null));
        String string5 = this.resources.getString(C22993R.string.options_detail_page_position_market_value_label);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        listCreateListBuilder.add(new CellState(string5, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getCurrencyDeltaFormat(), optionInstrumentQuote != null ? uiOptionInstrumentPosition.getSignedMarketValue(optionInstrumentQuote, optionChain) : null, null, 2, null), null, 4, null));
        String string6 = this.resources.getString(C22993R.string.options_detail_page_position_date_added_label);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        listCreateListBuilder.add(new CellState(string6, OptionDateFormatter.getOPTION_OPEN_CLOSE_DATE_TIME_FORMATTER().format(uiOptionInstrumentPosition.getOptionInstrumentPosition().getCreatedAt()), null, 4, null));
        String string7 = this.resources.getString(C22993R.string.options_detail_page_position_single_expiration_label);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        listCreateListBuilder.add(new CellState(string7, UiOptionInstrumentPositions2.getExpirationDateString(uiOptionInstrumentPosition, this.resources), null, 4, null));
        if (page.getUnderlyingQuote() != null) {
            UiOptionChain uiOptionChain = page.getUiOptionChain();
            OptionChain.UnderlyingType underlyingType = uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null;
            NumberFormatter numberFormatter = OptionUnderlyings.getNumberFormatter(underlyingType);
            Resources resources = this.resources;
            int i6 = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[underlyingType.ordinal()];
            if (i6 == -1) {
                i = C22993R.string.options_detail_page_position_breakeven_price_label;
                String string8 = resources.getString(i, page.getUnderlyingQuote().getSymbol());
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                listCreateListBuilder.add(new CellState(string8, NumberFormatter.DefaultImpls.formatMultiple$default(numberFormatter, bigDecimals, null, 2, null), null, 4, null));
                Resources resources2 = this.resources;
                i2 = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[underlyingType.ordinal()];
                if (i2 == -1) {
                    i3 = C22993R.string.options_detail_page_position_equity_price_label;
                    String string9 = resources2.getString(i3, page.getUnderlyingQuote().getSymbol());
                    Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                    listCreateListBuilder.add(new CellState(string9, page.getUnderlyingQuote().format(), null, 4, null));
                } else if (i2 == 1) {
                    i3 = C22993R.string.options_detail_page_position_equity_value_label;
                    String string92 = resources2.getString(i3, page.getUnderlyingQuote().getSymbol());
                    Intrinsics.checkNotNullExpressionValue(string92, "getString(...)");
                    listCreateListBuilder.add(new CellState(string92, page.getUnderlyingQuote().format(), null, 4, null));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C22993R.string.options_detail_page_position_equity_price_label;
                    String string922 = resources2.getString(i3, page.getUnderlyingQuote().getSymbol());
                    Intrinsics.checkNotNullExpressionValue(string922, "getString(...)");
                    listCreateListBuilder.add(new CellState(string922, page.getUnderlyingQuote().format(), null, 4, null));
                }
            } else if (i6 == 1) {
                i = C22993R.string.options_detail_page_position_breakeven_value_label;
                String string82 = resources.getString(i, page.getUnderlyingQuote().getSymbol());
                Intrinsics.checkNotNullExpressionValue(string82, "getString(...)");
                listCreateListBuilder.add(new CellState(string82, NumberFormatter.DefaultImpls.formatMultiple$default(numberFormatter, bigDecimals, null, 2, null), null, 4, null));
                Resources resources22 = this.resources;
                if (underlyingType == null) {
                }
                if (i2 == -1) {
                }
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C22993R.string.options_detail_page_position_breakeven_price_label;
                String string822 = resources.getString(i, page.getUnderlyingQuote().getSymbol());
                Intrinsics.checkNotNullExpressionValue(string822, "getString(...)");
                listCreateListBuilder.add(new CellState(string822, NumberFormatter.DefaultImpls.formatMultiple$default(numberFormatter, bigDecimals, null, 2, null), null, 4, null));
                Resources resources222 = this.resources;
                if (underlyingType == null) {
                }
                if (i2 == -1) {
                }
            }
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        String string10 = this.resources.getString(C22993R.string.options_detail_page_watchlist_position_section_title);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        String string11 = this.resources.getString(C22993R.string.options_detail_page_watchlist_position_section_subtitle);
        ApiOptionTodayTotalReturnResponse2 simulatedReturns = page.getSimulatedReturns();
        String str2 = (simulatedReturns == null || (todaysReturnString = CommonApiOptionTodayTotalReturnResponse2.getTodaysReturnString(simulatedReturns, this.resources)) == null) ? "-" : todaysReturnString;
        ApiOptionTodayTotalReturnResponse2 simulatedReturns2 = page.getSimulatedReturns();
        return new OptionsDetailPageBodyState2.Position(string10, string11, listBuild, str2, (simulatedReturns2 == null || (totalReturnString = CommonApiOptionTodayTotalReturnResponse2.getTotalReturnString(simulatedReturns2, this.resources)) == null) ? "-" : totalReturnString, !uiOptionInstrumentPosition.getHasOptionsListedToday(), getSimulatedReturnState(ds, page, pageIndex, loggingState, true), null, false, getPortfolioRiskAnalyzerKey(ds, page));
    }

    private final OptionsDetailPageBodyState2.Stats createStatsState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page) {
        Map<UUID, OptionInstrumentQuote> optionInstrumentIdToQuoteMap;
        Set<Map.Entry<UUID, OptionInstrumentQuote>> setEntrySet;
        Map.Entry entry;
        OptionInstrumentQuote optionInstrumentQuote;
        if (page == null || (optionInstrumentIdToQuoteMap = page.getOptionInstrumentIdToQuoteMap()) == null || (setEntrySet = optionInstrumentIdToQuoteMap.entrySet()) == null || (entry = (Map.Entry) CollectionsKt.singleOrNull(setEntrySet)) == null || (optionInstrumentQuote = (OptionInstrumentQuote) entry.getValue()) == null) {
            return null;
        }
        String str = Formats.getPriceFormat().format(optionInstrumentQuote.getBidPrice().getUnsignedValue());
        String str2 = Formats.getPriceFormat().format(optionInstrumentQuote.getAskPrice().getUnsignedValue());
        int iIntValue = optionInstrumentQuote.getBidSize().intValue();
        int iIntValue2 = optionInstrumentQuote.getAskSize().intValue();
        String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), optionInstrumentQuote.getMarkPrice(), null, 2, null);
        NumberFormatter priceFormat = Formats.getPriceFormat();
        Decimals4 lastTradePrice = optionInstrumentQuote.getLastTradePrice();
        String nullable$default2 = NumberFormatter.DefaultImpls.formatNullable$default(priceFormat, lastTradePrice != null ? lastTradePrice.getUnsignedValue() : null, null, 2, null);
        String nullable$default3 = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentFormat(), optionInstrumentQuote.getImpliedVolatility(), null, 2, null);
        String str3 = Formats.getPriceFormat().format(optionInstrumentQuote.getPreviousClosePrice().getUnsignedValue());
        NumberFormatter priceFormat2 = Formats.getPriceFormat();
        Decimals4 highPrice = optionInstrumentQuote.getHighPrice();
        String nullable$default4 = NumberFormatter.DefaultImpls.formatNullable$default(priceFormat2, highPrice != null ? highPrice.getUnsignedValue() : null, null, 2, null);
        NumberFormatter priceFormat3 = Formats.getPriceFormat();
        Decimals4 lowPrice = optionInstrumentQuote.getLowPrice();
        return new OptionsDetailPageBodyState2.Stats(str, str2, iIntValue, iIntValue2, nullable$default, nullable$default2, nullable$default3, str3, nullable$default4, NumberFormatter.DefaultImpls.formatNullable$default(priceFormat3, lowPrice != null ? lowPrice.getUnsignedValue() : null, null, 2, null), Formats.getIntegerFormat().format(optionInstrumentQuote.getVolume()), Formats.getIntegerFormat().format(optionInstrumentQuote.getOpenInterest()), ds.getInBidAskSdpStatsExperiment());
    }

    private final OptionsDetailPageBodyState2.Upsell createUpsellState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page) {
        OptionChain optionChain;
        LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag;
        UiOptionStrategyInfo uiStrategyInfo = page.getUiStrategyInfo();
        if (uiStrategyInfo == null || (optionChain = uiStrategyInfo.getOptionChain()) == null || !optionChain.getIsLateClosing() || (lateCloseAnnouncementCardFlag = page.getLateCloseAnnouncementCardFlag()) == null || !lateCloseAnnouncementCardFlag.getShowCard()) {
            return null;
        }
        MarketHours marketHours = ds.getMarketHours();
        return createLateCloseUpsellState(ds, optionChain, marketHours != null ? marketHours.getLateOptionClosesAt() : null);
    }

    private final OptionsDetailPageBodyState2.Upsell.LateClose createLateCloseUpsellState(OptionsDetailPageDataState ds, OptionChain optionChain, Instant lateCloseTime) {
        return new OptionsDetailPageBodyState2.Upsell.LateClose(optionChain.getId(), optionChain.getSymbol(), lateCloseTime, ds.getUpsellDismissed());
    }

    private final OptionsDetailPageBodyState2.Greeks createGreeksState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page) {
        Map<UUID, OptionInstrumentQuote> optionInstrumentIdToQuoteMap;
        Set<Map.Entry<UUID, OptionInstrumentQuote>> setEntrySet;
        Map.Entry entry;
        OptionInstrumentQuote optionInstrumentQuote;
        UiOptionStrategyInfo uiStrategyInfo;
        OptionStrategyInfo optionStrategyInfo;
        List<OptionStrategyLeg> legs;
        OptionStrategyLeg optionStrategyLeg;
        OptionPositionType positionType;
        OrderSide side;
        BigDecimal bigDecimalNegate;
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalMultiply2;
        BigDecimal bigDecimalMultiply3;
        BigDecimal bigDecimalMultiply4;
        BigDecimal bigDecimalMultiply5;
        UiOptionStrategyInfo uiStrategyInfo2;
        List<UiOptionStrategyLeg> legs2;
        if (ds.getMultiLegGreekExperimentVariant() != Experiments.OptionsMultiLegGreek.Variant.CONTROL) {
            if (page == null || (uiStrategyInfo2 = page.getUiStrategyInfo()) == null || (legs2 = uiStrategyInfo2.getLegs()) == null) {
                return null;
            }
            OptionsGreeks aggregateGreeks = OptionsGreekAggregationCalculation.getAggregateGreeks(legs2, page.getOptionInstrumentIdToQuoteMap());
            return new OptionsDetailPageBodyState2.Greeks(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), aggregateGreeks.getDelta(), null, 2, null), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), aggregateGreeks.getGamma(), null, 2, null), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), aggregateGreeks.getTheta(), null, 2, null), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), aggregateGreeks.getVega(), null, 2, null), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), aggregateGreeks.getRho(), null, 2, null));
        }
        if (page == null || (optionInstrumentIdToQuoteMap = page.getOptionInstrumentIdToQuoteMap()) == null || (setEntrySet = optionInstrumentIdToQuoteMap.entrySet()) == null || (entry = (Map.Entry) CollectionsKt.singleOrNull(setEntrySet)) == null || (optionInstrumentQuote = (OptionInstrumentQuote) entry.getValue()) == null || (uiStrategyInfo = page.getUiStrategyInfo()) == null || (optionStrategyInfo = uiStrategyInfo.getOptionStrategyInfo()) == null || (legs = optionStrategyInfo.getLegs()) == null || (optionStrategyLeg = (OptionStrategyLeg) CollectionsKt.singleOrNull((List) legs)) == null || (positionType = optionStrategyLeg.getPositionType()) == null || (side = positionType.getSide()) == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[side.ordinal()];
        if (i == 1) {
            bigDecimalNegate = BigDecimal.ONE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            bigDecimalNegate = ONE.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        }
        NumberFormatter sensitivityFormat = Formats.getSensitivityFormat();
        BigDecimal delta = optionInstrumentQuote.getDelta();
        if (delta != null) {
            Intrinsics.checkNotNull(bigDecimalNegate);
            bigDecimalMultiply = delta.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        } else {
            bigDecimalMultiply = null;
        }
        String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(sensitivityFormat, bigDecimalMultiply, null, 2, null);
        NumberFormatter sensitivityFormat2 = Formats.getSensitivityFormat();
        BigDecimal gamma = optionInstrumentQuote.getGamma();
        if (gamma != null) {
            Intrinsics.checkNotNull(bigDecimalNegate);
            bigDecimalMultiply2 = gamma.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        } else {
            bigDecimalMultiply2 = null;
        }
        String nullable$default2 = NumberFormatter.DefaultImpls.formatNullable$default(sensitivityFormat2, bigDecimalMultiply2, null, 2, null);
        NumberFormatter sensitivityFormat3 = Formats.getSensitivityFormat();
        BigDecimal theta = optionInstrumentQuote.getTheta();
        if (theta != null) {
            Intrinsics.checkNotNull(bigDecimalNegate);
            bigDecimalMultiply3 = theta.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        } else {
            bigDecimalMultiply3 = null;
        }
        String nullable$default3 = NumberFormatter.DefaultImpls.formatNullable$default(sensitivityFormat3, bigDecimalMultiply3, null, 2, null);
        NumberFormatter sensitivityFormat4 = Formats.getSensitivityFormat();
        BigDecimal vega = optionInstrumentQuote.getVega();
        if (vega != null) {
            Intrinsics.checkNotNull(bigDecimalNegate);
            bigDecimalMultiply4 = vega.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply4, "multiply(...)");
        } else {
            bigDecimalMultiply4 = null;
        }
        String nullable$default4 = NumberFormatter.DefaultImpls.formatNullable$default(sensitivityFormat4, bigDecimalMultiply4, null, 2, null);
        NumberFormatter sensitivityFormat5 = Formats.getSensitivityFormat();
        BigDecimal rho = optionInstrumentQuote.getRho();
        if (rho != null) {
            Intrinsics.checkNotNull(bigDecimalNegate);
            bigDecimalMultiply5 = rho.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply5, "multiply(...)");
        } else {
            bigDecimalMultiply5 = null;
        }
        return new OptionsDetailPageBodyState2.Greeks(nullable$default, nullable$default2, nullable$default3, nullable$default4, NumberFormatter.DefaultImpls.formatNullable$default(sensitivityFormat5, bigDecimalMultiply5, null, 2, null));
    }

    private final OptionsDetailPageBodyState2.Options createOptionsState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page) throws Resources.NotFoundException {
        UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity;
        Decimals4 adjustedMarkPrice;
        if (page == null || (uiAggregatePositionIncludingZeroQuantity = page.getUiAggregatePositionIncludingZeroQuantity()) == null || uiAggregatePositionIncludingZeroQuantity.isSingleLeg() || page.getUiAggregatePositionIncludingZeroQuantity().getQuantity().compareTo(BigDecimal.ZERO) == 0 || page.getUiOptionChain() == null) {
            return null;
        }
        List<UiAggregateOptionPositionLeg> uiLegs = page.getUiAggregatePositionIncludingZeroQuantity().getUiLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiLegs, 10));
        for (UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg : uiLegs) {
            OptionInstrumentQuote optionInstrumentQuote = page.getOptionInstrumentIdToQuoteMap().get(uiAggregateOptionPositionLeg.getOptionInstrumentId());
            BigDecimal rawValue = (optionInstrumentQuote == null || (adjustedMarkPrice = optionInstrumentQuote.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice.getRawValue();
            Resources resources = this.resources;
            int i = C23386R.string.option_position_instrument_detail_row_subtitle;
            LocalDate expirationDate = uiAggregateOptionPositionLeg.getExpirationDate();
            String expirationStringShort = OptionInstrumentDetails2.getExpirationStringShort(resources, RangesKt.rangeTo(expirationDate, expirationDate), page.getUiOptionChain().getOptionChain().getSettleOnOpen());
            Resources resources2 = this.resources;
            BigDecimal bigDecimalMultiply = uiAggregateOptionPositionLeg.getRatioQuantity().multiply(page.getUiAggregatePositionIncludingZeroQuantity().getQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            String string2 = resources.getString(i, expirationStringShort, OptionInstrumentDetails2.getQuantityAndSideString$default(resources2, bigDecimalMultiply, uiAggregateOptionPositionLeg.getStrategy(), null, null, 24, null));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String formattedTitleStringWithExpirationSubtitle = OptionInstrumentDetails2.getFormattedTitleStringWithExpirationSubtitle(uiAggregateOptionPositionLeg, this.resources, page.getUiOptionChain().getUnderlyingType());
            String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), rawValue, null, 2, null);
            UUID optionPositionId = uiAggregateOptionPositionLeg.getOptionPositionId();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiLegs, 10));
            Iterator<T> it = uiLegs.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UiAggregateOptionPositionLeg) it.next()).getOptionPositionId());
            }
            Account currentAccount = ds.getCurrentAccount();
            arrayList.add(new OptionRow(formattedTitleStringWithExpirationSubtitle, string2, nullable$default, null, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.OptionPositionId(optionPositionId, arrayList2, currentAccount != null ? currentAccount.getAccountNumber() : null, null, 8, null)), false, OptionRow.OptionRowType.OPTION_LEG, null, null, 424, null));
        }
        return new OptionsDetailPageBodyState2.Options(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.robinhood.android.navigation.keys.FragmentKey] */
    private final OptionsDetailPageBodyState2.History createHistoryState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page) throws Resources.NotFoundException {
        ArrayList arrayList;
        ?? key;
        UiOptionUnderlier uiOptionUnderlier;
        OptionUnderlier underlier;
        UUID instrumentId;
        AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilter;
        OptionsDetailPageBodyState2.History history;
        OptionRow optionRow;
        OptionRow optionRow2;
        String quantityString;
        List<UiOptionEvent> uiOptionEvents;
        OptionsDetailPageBodyState2.History history2 = null;
        if (page == null || (uiOptionEvents = page.getUiOptionEvents()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : uiOptionEvents) {
                if (((UiOptionEvent) obj).isHistorical()) {
                    arrayList.add(obj);
                }
            }
        }
        List<SortableHistoryItem> listFlattenSortedDescending = SortableHistoryItems.flattenSortedDescending(CollectionsKt.listOfNotNull((Object[]) new List[]{arrayList, page != null ? page.getUiOptionOrders() : null, page != null ? page.getUiComboOrders() : null}));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFlattenSortedDescending, 10));
        for (SortableHistoryItem sortableHistoryItem : listFlattenSortedDescending) {
            Intrinsics.checkNotNull(sortableHistoryItem, "null cannot be cast to non-null type com.robinhood.shared.models.history.shared.HistoryEvent");
            arrayList2.add((HistoryEvent) sortableHistoryItem);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List<HistoryEvent> listSubList = arrayList2.subList(0, Math.min(4, arrayList2.size()));
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        for (HistoryEvent historyEvent : listSubList) {
            if (historyEvent instanceof UiOptionOrder) {
                UiOptionOrder uiOptionOrder = (UiOptionOrder) historyEvent;
                String string2 = UiOptionOrders2.getHistoryTitle(uiOptionOrder, this.resources, false).toString();
                String historySubtitle = UiOptionOrders2.getHistorySubtitle(uiOptionOrder);
                String historyDetail = UiOptionOrders2.getHistoryDetail(uiOptionOrder, this.resources);
                BigDecimal price = uiOptionOrder.getOptionOrder().getPrice();
                int iIntValue = uiOptionOrder.getOptionOrder().getQuantity().intValue();
                if (price != null) {
                    history = history2;
                    quantityString = this.resources.getQuantityString(C23386R.plurals.options_history_detail_subtitle, iIntValue, Integer.valueOf(iIntValue), Formats.getPriceFormat().format(price));
                } else {
                    history = history2;
                    quantityString = this.resources.getQuantityString(C23386R.plurals.options_history_detail_subtitle_no_price, iIntValue, Integer.valueOf(iIntValue));
                }
                String str = quantityString;
                Intrinsics.checkNotNull(str);
                optionRow2 = new OptionRow(string2, historySubtitle, historyDetail, str, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.OPTION_ORDER, uiOptionOrder.getOptionOrder().getId(), null, false, 12, null), false, OptionRow.OptionRowType.OPTION_ORDER, null, null, 416, null);
            } else {
                history = history2;
                if (historyEvent instanceof UiComboOrder) {
                    UiComboOrder uiComboOrder = (UiComboOrder) historyEvent;
                    optionRow = new OptionRow(UiComboOrders2.getHistoryTitle(uiComboOrder, this.resources), UiComboOrders2.getHistorySubtitle(uiComboOrder), UiComboOrders2.getHistoryDetail(uiComboOrder, this.resources), null, new ComboOrderDetailFragmentKey(uiComboOrder.getComboOrder().getId()), false, OptionRow.OptionRowType.COMBO_ORDER, createComboOrderDetailEventContext(uiComboOrder), new Screen(Screen.Name.OPTION_STRATEGY_DETAIL, null, null, null, 14, null), 40, null);
                } else {
                    if (!(historyEvent instanceof UiOptionEvent)) {
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(historyEvent);
                        throw new ExceptionsH();
                    }
                    UiOptionEvent uiOptionEvent = (UiOptionEvent) historyEvent;
                    optionRow = new OptionRow(UiOptionEvents.getHistoryRowTitle(uiOptionEvent, this.resources), UiOptionEvents.getHistoryRowSubtitle(uiOptionEvent), UiOptionEvents.getHistoryRowDetail(uiOptionEvent, this.resources), null, HistoryNavigator.resolve$default(this.historyNavigator, new TransactionReference(uiOptionEvent.getOptionEvent().getId(), HistoryTransactionType.OPTION_EVENT, null, null, false, 28, null), false, false, 4, null), true, OptionRow.OptionRowType.OPTION_EVENT, null, null, 392, null);
                }
                optionRow2 = optionRow;
            }
            arrayList3.add(optionRow2);
            history2 = history;
        }
        OptionsDetailPageBodyState2.History history3 = history2;
        if (arrayList2.size() > 4) {
            Account currentAccount = ds.getCurrentAccount();
            if (currentAccount == null || page == null || (uiOptionUnderlier = page.getUiOptionUnderlier()) == null || (underlier = uiOptionUnderlier.getUnderlier()) == null || (instrumentId = underlier.getInstrumentId()) == null) {
                return history3;
            }
            switch (WhenMappings.$EnumSwitchMapping$3[currentAccount.getBrokerageAccountType().ordinal()]) {
                case 1:
                case 2:
                    accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_CUSTODIAL;
                    break;
                case 3:
                    accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS;
                    break;
                case 4:
                    accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH;
                    break;
                case 5:
                    accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL;
                    break;
                case 6:
                    accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_JOINT_TENANCY_WITH_ROS;
                    break;
                case 7:
                    accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS_ISA_STOCKS_AND_SHARES;
                    break;
                case 8:
                    accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.ALL;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            key = new AccountsHistoryContract.Key(accountsHistoryAccountTypeFilter, null, new AccountsHistoryContract.InstrumentFilter(instrumentId, AccountsHistoryContract.InstrumentFilterType.EQUITY), null, false, null, 58, null);
        } else {
            key = history3;
        }
        return new OptionsDetailPageBodyState2.History(arrayList3, key);
    }

    private final OptionsDetailPageBodyState2.Disclosure createDisclosureState(OptionsDetailPageDataState ds) {
        String contentfulId;
        String disclosure = ds.getDisclosure();
        if (ds.getInProfitAndLossAverageCostRetirementExperiment()) {
            contentfulId = BrokerageResource2.getContentfulId(BrokerageDisclosure.OPTIONS_DETAIL_DISCLOSURE_PNL_RETIREMENT_MEMBER, ds.getLocality());
        } else {
            contentfulId = BrokerageResource2.getContentfulId(BrokerageDisclosure.OPTIONS_DETAIL_DISCLOSURE_PNL_TAXABLE_MEMBER, ds.getLocality());
        }
        return new OptionsDetailPageBodyState2.Disclosure(disclosure, contentfulId);
    }

    private final OptionsDetailPageTradebarDataState.PageSpecificDerivedData createTradebarData(OptionsDetailPageDataState.PageData page) {
        if (page == null) {
            return null;
        }
        return new OptionsDetailPageTradebarDataState.PageSpecificDerivedData(getPageDirection(page), page.getIndexInstrument(), page.getEquityQuote(), page.getIndexValue(), page.getOppositePositionFromWatchlist(), page.getOptionsAccountSwitcher(), page.getShowRollingActionItem(), page.getUiAggregatePositionIncludingZeroQuantity(), page.getUiOptionInstrumentPositionIncludingZeroQuantity(), page.getUiOptionUnderlier(), page.getUiStrategyInfo(), page.getUiOptionChain());
    }

    private final OptionsDetailPageBodyState2.Banner createBannerState(OptionsDetailPageDataState.PageData page) {
        IacInfoBanner infoBanner;
        if (page == null || (infoBanner = page.getInfoBanner()) == null) {
            return null;
        }
        return new OptionsDetailPageBodyState2.Banner(infoBanner);
    }

    private final OptionsDetailPageUiOptionPositionState createUiPositionState(OptionsDetailPageDataState.PageData page, String strategyCode) {
        Money optionOpenPrice;
        OrderDirection optionOpenPriceDirection;
        UiOptionStrategyInfo uiStrategyInfo;
        List<UiOptionStrategyLeg> legs;
        UiOptionStrategyLeg uiOptionStrategyLeg;
        OptionInstrument optionInstrument;
        OptionPositionType optionPositionType;
        OptionStrategyInfo optionStrategyInfo;
        List<OptionStrategyLeg> legs2;
        OptionStrategyLeg optionStrategyLeg;
        UUID optionId;
        if (page == null) {
            return null;
        }
        if (page.getUiAggregatePositionIncludingZeroQuantity() != null && page.getUiAggregatePositionIncludingZeroQuantity().getQuantity().compareTo(BigDecimal.ZERO) != 0) {
            return new OptionsDetailPageUiOptionPositionState(page.getUiAggregatePositionIncludingZeroQuantity(), strategyCode, page.getAggregateOptionStrategyQuote());
        }
        if (page.getUiOptionInstrumentPositionIncludingZeroQuantity() != null && page.getUiOptionInstrumentPositionIncludingZeroQuantity().getOptionInstrumentPosition().getQuantity().compareTo(BigDecimal.ZERO) != 0) {
            UiOptionStrategyInfo uiStrategyInfo2 = page.getUiStrategyInfo();
            if (uiStrategyInfo2 == null || (optionStrategyInfo = uiStrategyInfo2.getOptionStrategyInfo()) == null || (legs2 = optionStrategyInfo.getLegs()) == null || (optionStrategyLeg = (OptionStrategyLeg) CollectionsKt.singleOrNull((List) legs2)) == null || (optionId = optionStrategyLeg.getOptionId()) == null) {
                return null;
            }
            return new OptionsDetailPageUiOptionPositionState(page.getUiOptionInstrumentPositionIncludingZeroQuantity(), strategyCode, page.getOptionInstrumentIdToQuoteMap().get(optionId));
        }
        if (page.getCuratedListItem() == null || (optionOpenPrice = page.getCuratedListItem().getOptionOpenPrice()) == null || (optionOpenPriceDirection = page.getCuratedListItem().getOptionOpenPriceDirection()) == null || (uiStrategyInfo = page.getUiStrategyInfo()) == null || (legs = uiStrategyInfo.getLegs()) == null || (uiOptionStrategyLeg = (UiOptionStrategyLeg) CollectionsKt.singleOrNull((List) legs)) == null || (optionInstrument = uiOptionStrategyLeg.getOptionInstrument()) == null) {
            return null;
        }
        BigDecimal decimalValue = optionOpenPrice.getDecimalValue();
        Instant createdAt = page.getCuratedListItem().getCreatedAt();
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-00000000000");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        BigDecimal decimalValue2 = optionOpenPrice.getDecimalValue();
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        UUID id = page.getUiStrategyInfo().getOptionChain().getId();
        UUID id2 = optionInstrument.getId();
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        int i = WhenMappings.$EnumSwitchMapping$0[optionOpenPriceDirection.ordinal()];
        if (i == 1) {
            optionPositionType = OptionPositionType.SHORT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            optionPositionType = OptionPositionType.LONG;
        }
        OptionInstrumentPosition optionInstrumentPosition = new OptionInstrumentPosition("", decimalValue, createdAt, null, null, null, null, null, null, ONE, uuidFromString, decimalValue2, ONE, id, id2, ZERO, ZERO, ZERO, ONE, optionPositionType);
        OptionChain optionChain = page.getUiStrategyInfo().getOptionChain();
        UiOptionUnderlier uiOptionUnderlier = page.getUiOptionUnderlier();
        return new OptionsDetailPageUiOptionPositionState(new UiOptionInstrumentPosition(optionInstrumentPosition, optionInstrument, optionChain, uiOptionUnderlier != null ? uiOptionUnderlier.getUnderlier() : null), strategyCode, null);
    }

    private final FragmentKey getUnderlyingIntentKey(UUID indexId, UUID equityInstrumentId, String accountNumber) {
        if (indexId != null && equityInstrumentId != null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("indexId and equityInstrumentId should not both be non-null"), true, null, 4, null);
            return null;
        }
        if (indexId != null) {
            return new IndexDetailPageFragmentKey(indexId, accountNumber, IndexDetailPageFragmentKey2.OptionDetailPage.INSTANCE);
        }
        if (equityInstrumentId != null) {
            return new LegacyFragmentKey.EquityInstrumentDetail(equityInstrumentId, CollectionsKt.listOf(equityInstrumentId), accountNumber, InstrumentDetailSource.OPTIONS_DETAIL, false, 16, null);
        }
        return null;
    }

    private final OptionsSimulatedReturnFragmentKey getProjectedReturnFragmentKey(DisplaySpan activeChartSpan, UiOptionStrategyInfo uiStrategyInfo, boolean isLegContext, String fixedAccountNumber, boolean useWatchlist, OptionChain.UnderlyingType underlyingType) {
        if (fixedAccountNumber == null || uiStrategyInfo == null || underlyingType == null) {
            return null;
        }
        if (activeChartSpan == null) {
            activeChartSpan = DisplaySpan.DAY;
        }
        return new OptionsSimulatedReturnFragmentKey(activeChartSpan, uiStrategyInfo.getOptionStrategyInfo().getStrategyCode(), isLegContext, fixedAccountNumber, useWatchlist, underlyingType);
    }

    private final OptionsDetailPageLoggingState createLoggingState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page) {
        UiOptionStrategyInfo uiStrategyInfo;
        OptionStrategyInfo optionStrategyInfo;
        String strategyCode;
        BrokerageAccountType brokerageAccountType;
        OptionInstrumentPosition optionInstrumentPosition;
        if ((page != null ? page.getHasRealPosition() : null) != null && page.isWatching() != null && (uiStrategyInfo = page.getUiStrategyInfo()) != null && (optionStrategyInfo = uiStrategyInfo.getOptionStrategyInfo()) != null && (strategyCode = optionStrategyInfo.getStrategyCode()) != null) {
            boolean zBooleanValue = page.isWatching().booleanValue();
            boolean zBooleanValue2 = page.getHasRealPosition().booleanValue();
            boolean zIsLegContext = ds.isLegContext();
            int size = page.getUiStrategyInfo().getLegs().size();
            UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = page.getUiAggregatePositionIncludingZeroQuantity();
            UUID id = uiAggregatePositionIncludingZeroQuantity != null ? uiAggregatePositionIncludingZeroQuantity.getId() : null;
            UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity = page.getUiOptionInstrumentPositionIncludingZeroQuantity();
            UUID id2 = (uiOptionInstrumentPositionIncludingZeroQuantity == null || (optionInstrumentPosition = uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition()) == null) ? null : optionInstrumentPosition.getId();
            Account currentAccount = ds.getCurrentAccount();
            if (currentAccount != null && (brokerageAccountType = currentAccount.getBrokerageAccountType()) != null) {
                return new OptionsDetailPageLoggingState(strategyCode, zBooleanValue, zBooleanValue2, zIsLegContext, size, id, id2, brokerageAccountType, page.getUiStrategyInfo().getOptionChain().getId());
            }
        }
        return null;
    }

    private final Context createComboOrderDetailEventContext(UiComboOrder uiComboOrder) {
        String string2 = uiComboOrder.getComboOrder().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String symbol = uiComboOrder.getInstrument().getSymbol();
        BigDecimal price = uiComboOrder.getComboOrder().getPrice();
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ComboOrderDetailContext(string2, symbol, price != null ? price.floatValue() : 0.0f, uiComboOrder.getComboOrder().getQuantity().intValue(), uiComboOrder.getComboOrder().getDerivedState().getServerValue(), null, 32, null), null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16375, null);
    }

    private final OptionsDetailPageSimulatedReturnState getSimulatedReturnState(OptionsDetailPageDataState ds, OptionsDetailPageDataState.PageData page, int pageIndex, OptionsDetailPageLoggingState loggingState, boolean useWatchlist) {
        if (loggingState == null || !page.getShouldShowSimulatedReturns()) {
            return null;
        }
        DisplaySpan activeDisplaySpan = page.getActiveDisplaySpan();
        UiOptionStrategyInfo uiStrategyInfo = page.getUiStrategyInfo();
        boolean zIsLegContext = ds.isLegContext();
        Account currentAccount = ds.getCurrentAccount();
        String accountNumber = currentAccount != null ? currentAccount.getAccountNumber() : null;
        UiOptionChain uiOptionChain = page.getUiOptionChain();
        OptionsSimulatedReturnFragmentKey projectedReturnFragmentKey = getProjectedReturnFragmentKey(activeDisplaySpan, uiStrategyInfo, zIsLegContext, accountNumber, useWatchlist, uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null);
        if (projectedReturnFragmentKey == null) {
            return null;
        }
        return new OptionsDetailPageSimulatedReturnState(projectedReturnFragmentKey, loggingState.getEventContext(), loggingState.getEventScreen(), getSimulatedReturnTooltipState(pageIndex, ds));
    }

    private final OptionsSimulatedReturnTooltipState getSimulatedReturnTooltipState(int pageIndex, OptionsDetailPageDataState ds) {
        OptionsSimulatedReturnTooltipState simulatedReturnTooltipState = ds.getSimulatedReturnTooltipState();
        if (simulatedReturnTooltipState == null || pageIndex != simulatedReturnTooltipState.getPageIndex()) {
            return null;
        }
        return ds.getSimulatedReturnTooltipState();
    }

    private final OptionsDetailPageDataCell2.AverageCostTooltip getAverageCostTooltip(String strategyCode) {
        return new OptionsDetailPageDataCell2.AverageCostTooltip(strategyCode);
    }

    private final boolean shouldShowAverageCostTooltip(OptionsDetailPageDataState ds) {
        return ds.getCurrentAccount() != null && ds.getCurrentAccount().getBrokerageAccountType().isRetirement() && ds.getInProfitAndLossAverageCostRetirementExperiment() && ds.getShowDataCellTooltipRetirementPref();
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsDetailPageViewState reduce(OptionsDetailPageDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new OptionsDetailPageViewState(dataState.getCurrentAccount(), dataState.getCurrentIndex(), dataState.isDay(), createPageStates(dataState), dataState.getStrategyCodeList(), dataState.getTradebarHeight(), dataState.getPnlDataState());
    }
}
