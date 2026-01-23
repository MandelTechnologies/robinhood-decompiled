package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.options.calculation.greeks.OptionsGreekAggregationCalculation;
import com.robinhood.android.options.calculation.greeks.OptionsGreeks;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo;
import com.robinhood.android.options.portfolioriskanalyzer.components.search.PnLUiState;
import com.robinhood.android.options.portfolioriskanalyzer.extensions.Flow5;
import com.robinhood.android.options.tradability.UiOptionInstrumentTradability;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossData;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionRollingStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnMarketDataParamsRequestV4;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyDetailStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.api.ApiOptionPositionReturnRequest;
import com.robinhood.models.api.ApiOptionPositionReturnRequestLegacy;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV4Request;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionPositionQuote;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionMaxRollableQuantity;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import com.robinhood.models.p320db.simulatedreturns.OptionSimulatedReturnsConfigurationResponse;
import com.robinhood.models.p355ui.GenericOptionsPositionPricing;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle3;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiAggregateOptionPositionLeg;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import kotlinx.datetime.Instant;
import p479j$.time.LocalDate;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ¥\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0004¦\u0001¥\u0001B\u0091\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J/\u00109\u001a\b\u0012\u0004\u0012\u00020-042\u0018\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070504H\u0002¢\u0006\u0004\b9\u0010:J3\u0010B\u001a\b\u0012\u0004\u0012\u00020A0,2\u0006\u0010;\u001a\u00020*2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bB\u0010CJE\u0010M\u001a\b\u0012\u0004\u0012\u00020A042\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bM\u0010NJI\u0010V\u001a\u00020S2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u0006\u0010P\u001a\u00020O2\u0006\u0010K\u001a\u00020J2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\b\b\u0002\u0010U\u001a\u00020SH\u0002¢\u0006\u0004\bV\u0010WJ)\u0010Y\u001a\u00020X2\u0006\u0010L\u001a\u00020=2\u0006\u0010K\u001a\u00020J2\b\b\u0002\u0010U\u001a\u00020SH\u0002¢\u0006\u0004\bY\u0010ZJ/\u0010^\u001a\u00020]2\u0006\u0010K\u001a\u00020J2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020X0<2\b\u0010\\\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\b^\u0010_J;\u0010d\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020c0b050<2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020*0<H\u0002¢\u0006\u0004\bd\u0010eJ\u001d\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bh\u0010iJ\r\u0010k\u001a\u00020j¢\u0006\u0004\bk\u0010lJ\u001d\u0010o\u001a\u00020j2\u0006\u0010m\u001a\u0002002\u0006\u0010n\u001a\u00020S¢\u0006\u0004\bo\u0010pJ+\u0010s\u001a\u00020j2\u0006\u0010q\u001a\u0002002\f\u0010r\u001a\b\u0012\u0004\u0012\u0002000<2\u0006\u0010n\u001a\u00020S¢\u0006\u0004\bs\u0010tJ3\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0,2\u0006\u0010;\u001a\u00020*2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bu\u0010CJ3\u0010x\u001a\u00020j2\u0006\u0010v\u001a\u0002002\u0006\u0010w\u001a\u0002002\f\u0010r\u001a\b\u0012\u0004\u0012\u0002000<2\u0006\u0010n\u001a\u00020S¢\u0006\u0004\bx\u0010yJ\u001d\u0010}\u001a\u00020j2\u0006\u0010{\u001a\u00020z2\u0006\u0010|\u001a\u00020S¢\u0006\u0004\b}\u0010~J\u001f\u0010\u0080\u0001\u001a\u00020j2\u0006\u0010{\u001a\u00020z2\u0006\u0010\u007f\u001a\u00020S¢\u0006\u0005\b\u0080\u0001\u0010~J\u001b\u0010\u0082\u0001\u001a\u00020j2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010?¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u00020j2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u0088\u0001\u001a\u000200¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u008c\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u008d\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u008e\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u008f\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0090\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0091\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0092\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0093\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u0094\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0095\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0096\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0097\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0098\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0099\u0001R\u001d\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b'\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R,\u0010\u009e\u0001\u001a\u0017\u0012\u0004\u0012\u00020z\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010-0,0\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001e\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020D0 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020H0 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R\u001e\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020F0 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¢\u0001¨\u0006§\u0001"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo$Args;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "optionStrategyDetailStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "unrealizedProfitAndLossStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/OptionRollingStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "aggregateOptionPosition", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState;", "getAggregatePositionRowFlow", "(Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;)Lkotlinx/coroutines/flow/StateFlow;", "Ljava/util/UUID;", "optionInstrumentId", "getInstrumentPositionRowFlow", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/GenericOptionsPositionPricing;", "Lcom/robinhood/models/db/OptionQuote;", "optionPositionAndQuoteFlow", "getInnerViewStateFlow", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "aggregatePositon", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionLeg;", "selectedLegs", "Ljava/math/BigDecimal;", "simulatedQuantity", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeActionUiState;", "computeTradeActionUiState", "(Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Ljava/util/List;Ljava/math/BigDecimal;)Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionSettings;", "optionSettings", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "leg", "computeSingleLegOptionPositionTradeActionUiState", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/ui/UiAggregateOptionPositionLeg;Ljava/math/BigDecimal;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrument", "Lcom/robinhood/models/db/OptionPositionType;", "positionType", "", "pcoAccount", "isForOpenPosition", "canOpenOrCloseSingleLegPosition", "(Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/db/OptionPositionType;ZZ)Z", "Lcom/robinhood/models/ui/OptionLegBundle;", "getOpenOrClosePositionOptionLegBundle", "(Lcom/robinhood/models/ui/UiAggregateOptionPositionLeg;Lcom/robinhood/models/ui/UiOptionChain;Z)Lcom/robinhood/models/ui/OptionLegBundle;", "legBundles", "prefilledQuantity", "Lcom/robinhood/models/ui/OptionOrderBundle;", "getOptionOrderBundle", "(Lcom/robinhood/models/ui/UiOptionChain;Ljava/util/List;Ljava/math/BigDecimal;)Lcom/robinhood/models/ui/OptionOrderBundle;", "optionPositions", "Lcom/robinhood/models/db/OptionChain;", "", "j$/time/LocalDate", "getChainToLegExpirationDatesList", "(Ljava/util/List;)Ljava/util/List;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;", "state", "getOptionPositionInnerViewStateFlow", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;)Lkotlinx/coroutines/flow/StateFlow;", "", "onSelectOrDeselectAllClicked", "()V", "equityInstrumentId", "checked", "onEquityRowCheckedChanged", "(Ljava/util/UUID;Z)V", "aggregatePositionIdToCheck", "relatedLegPositionIds", "onAggregateOptionRowCheckedChanged", "(Ljava/util/UUID;Ljava/util/List;Z)V", "getTradeActionButtonViewState", "legPositionIdToCheck", "relatedAggregatePositionId", "onLegOptionRowCheckedChanged", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/List;Z)V", "", "rowId", "collapsed", "onExpandOrCollapse", "(Ljava/lang/String;Z)V", "isPlus", "onPlusOrMinusClicked", "underlyingPrice", "onUnderlyingPriceUpdated", "(Ljava/math/BigDecimal;)V", "", "sliderPosition", "onSliderPositionUpdated", "(Ljava/lang/Double;)V", "underlyingId", "Lkotlinx/coroutines/Job;", "bind", "(Ljava/util/UUID;)Lkotlinx/coroutines/Job;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "", "innerViewStateFlowMap", "Ljava/util/Map;", "Lkotlinx/coroutines/flow/SharedFlow;", "accountFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "optionSettingsFlow", "currentOrNextMarketDatesFlow", "Companion", "Args", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerPositionDuxo extends BaseDuxo<OptionsPortfolioRiskAnalyzerPositionDataState, OptionsPortfolioRiskAnalyzerPositionViewState> implements HasArgs<Args> {
    private final SharedFlow<Account> accountFlow;
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final AggregateOptionQuoteStore aggregateOptionQuoteStore;
    private final SharedFlow<OptionCurrentOrNextMarketDates> currentOrNextMarketDatesFlow;
    private final Map<String, StateFlow<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState>> innerViewStateFlowMap;
    private final InstrumentStore instrumentStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionRollingStore optionRollingStore;
    private final SharedFlow<OptionSettings> optionSettingsFlow;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionSimulatedReturnsStore optionSimulatedReturnsStore;
    private final OptionStrategyDetailStore optionStrategyDetailStore;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;
    private final UnrealizedProfitAndLossStore unrealizedProfitAndLossStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsPortfolioRiskAnalyzerPositionDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionQuoteStore aggregateOptionQuoteStore, InstrumentStore instrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionStrategyDetailStore optionStrategyDetailStore, OptionQuoteStore optionQuoteStore, PositionStore positionStore, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore, QuoteStore quoteStore, OptionRollingStore optionRollingStore, OptionSettingsStore optionSettingsStore, DuxoBundle duxoBundle, OptionsPortfolioRiskAnalyzerPositionStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        super(new OptionsPortfolioRiskAnalyzerPositionDataState(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
        Intrinsics.checkNotNullParameter(optionStrategyDetailStore, "optionStrategyDetailStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.aggregateOptionQuoteStore = aggregateOptionQuoteStore;
        this.instrumentStore = instrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionPositionStore = optionPositionStore;
        this.optionSimulatedReturnsStore = optionSimulatedReturnsStore;
        this.optionStrategyDetailStore = optionStrategyDetailStore;
        this.optionQuoteStore = optionQuoteStore;
        this.positionStore = positionStore;
        this.unrealizedProfitAndLossStore = unrealizedProfitAndLossStore;
        this.quoteStore = quoteStore;
        this.optionRollingStore = optionRollingStore;
        this.optionSettingsStore = optionSettingsStore;
        this.savedStateHandle = savedStateHandle;
        this.innerViewStateFlowMap = new LinkedHashMap();
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(accountProvider.streamAccount(((Args) INSTANCE.getArgs((HasArgs) this)).getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        SharedFlow<Account> sharedFlowShareIn = FlowKt.shareIn(flowBuffer$default, lifecycleScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.accountFlow = sharedFlowShareIn;
        this.optionSettingsFlow = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.transformLatest(sharedFlowShareIn, new C23555xa2c4419(null, this))), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.currentOrNextMarketDatesFlow = FlowKt.shareIn(FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(optionMarketHoursStore.streamCurrentOrNextMarketDates()), Integer.MAX_VALUE, null, 2, null)), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
    }

    public final StateFlow<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> getOptionPositionInnerViewStateFlow(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        StateFlow<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> stateFlow = this.innerViewStateFlowMap.get(state.getRowId());
        if (stateFlow == null) {
            if (state instanceof OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) {
                return getAggregatePositionRowFlow(((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) state).getAggregatePosition());
            }
            if (!(state instanceof OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg)) {
                throw new NoWhenBranchMatchedException();
            }
            return getInstrumentPositionRowFlow(((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Leg) state).getInstrumentId());
        }
        return stateFlow;
    }

    private final StateFlow<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> getAggregatePositionRowFlow(UiAggregateOptionPositionFull aggregateOptionPosition) {
        Flow<Tuples2<UiAggregateOptionPositionFull, AggregateOptionPositionQuote>> flowPollAndStreamQuote = this.aggregateOptionQuoteStore.pollAndStreamQuote(aggregateOptionPosition);
        List<UiAggregateOptionPositionLeg> uiLegs = aggregateOptionPosition.getUiLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiLegs, 10));
        Iterator<T> it = uiLegs.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiAggregateOptionPositionLeg) it.next()).getOptionInstrumentId());
        }
        return FlowKt.stateIn(FlowKt.combine(getInnerViewStateFlow(flowPollAndStreamQuote), FlowKt.onStart(Context7.buffer$default(RxConvert.asFlow(this.optionQuoteStore.getAllOptionQuotes(arrayList)), Integer.MAX_VALUE, null, 2, null), new C23571x5ce7d9cf(null)), new C235701(aggregateOptionPosition, null)), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), new OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState(new PnLUiState(null, null, 3, null), OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState2.getEmptyOptionPositionDataGridViewState()));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState;", "viewState", "optionInstrumentIdToQuoteMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getAggregatePositionRowFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getAggregatePositionRowFlow$1 */
    static final class C235701 extends ContinuationImpl7 implements Function3<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState, Map<UUID, ? extends OptionInstrumentQuote>, Continuation<? super OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState>, Object> {
        final /* synthetic */ UiAggregateOptionPositionFull $aggregateOptionPosition;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235701(UiAggregateOptionPositionFull uiAggregateOptionPositionFull, Continuation<? super C235701> continuation) {
            super(3, continuation);
            this.$aggregateOptionPosition = uiAggregateOptionPositionFull;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState, Map<UUID, OptionInstrumentQuote> map, Continuation<? super OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> continuation) {
            C235701 c235701 = new C235701(this.$aggregateOptionPosition, continuation);
            c235701.L$0 = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState;
            c235701.L$1 = map;
            return c235701.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState, Map<UUID, ? extends OptionInstrumentQuote> map, Continuation<? super OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> continuation) {
            return invoke2(optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState, (Map<UUID, OptionInstrumentQuote>) map, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState = (OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState) this.L$0;
            OptionsGreeks aggregateGreeksWithUiAggregatePositionLegs = OptionsGreekAggregationCalculation.getAggregateGreeksWithUiAggregatePositionLegs(this.$aggregateOptionPosition.getUiLegs(), (Map) this.L$1);
            OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState dataGridState = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.getDataGridState();
            BigDecimal delta = aggregateGreeksWithUiAggregatePositionLegs.getDelta();
            if (delta == null) {
                delta = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.getDataGridState().getDelta();
            }
            BigDecimal gamma = aggregateGreeksWithUiAggregatePositionLegs.getGamma();
            if (gamma == null) {
                gamma = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.getDataGridState().getGamma();
            }
            BigDecimal theta = aggregateGreeksWithUiAggregatePositionLegs.getTheta();
            if (theta == null) {
                theta = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.getDataGridState().getTheta();
            }
            BigDecimal vega = aggregateGreeksWithUiAggregatePositionLegs.getVega();
            if (vega == null) {
                vega = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.getDataGridState().getVega();
            }
            return OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.copy$default(optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState, null, OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.copy$default(dataGridState, delta, gamma, theta, vega, null, null, false, 112, null), 1, null);
        }
    }

    private final StateFlow<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> getInstrumentPositionRowFlow(UUID optionInstrumentId) {
        final SharedFlow<Account> sharedFlow = this.accountFlow;
        return FlowKt.stateIn(getInnerViewStateFlow(FlowKt.distinctUntilChanged(FlowKt.combine(FlowKt.filterNotNull(FlowKt.mapLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(new Flow<String>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInstrumentPositionRowFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInstrumentPositionRowFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInstrumentPositionRowFlow$$inlined$map$1$2", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInstrumentPositionRowFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        String accountNumber = ((Account) obj).getAccountNumber();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new C23553x3d34fda8(null, this, optionInstrumentId))), new C23574x2d3a2110(null))), FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.optionQuoteStore.getOptionQuote(optionInstrumentId)), Integer.MAX_VALUE, null, 2, null)), new C23575xd5e8ac29(null)))), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), new OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState(new PnLUiState(null, null, 3, null), OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState2.getEmptyOptionPositionDataGridViewState()));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\nH\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/ApiOptionPositionReturnRequestLegacy;", "Lcom/robinhood/models/api/ApiOptionPositionReturnRequest;", "Lcom/robinhood/models/ui/GenericOptionsPositionPricing;", "Lcom/robinhood/models/db/OptionQuote;", "<destruct>", "Lkotlin/Pair;", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInnerViewStateFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInnerViewStateFlow$1 */
    static final class C235721 extends ContinuationImpl7 implements Function3<Tuples2<? extends GenericOptionsPositionPricing, ? extends OptionQuote>, Account, Continuation<? super Tuples3<? extends Either<? extends ApiOptionPositionReturnRequestLegacy, ? extends ApiOptionPositionReturnRequest>, ? extends GenericOptionsPositionPricing, ? extends OptionQuote>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C235721(Continuation<? super C235721> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GenericOptionsPositionPricing, ? extends OptionQuote> tuples2, Account account, Continuation<? super Tuples3<? extends Either<? extends ApiOptionPositionReturnRequestLegacy, ? extends ApiOptionPositionReturnRequest>, ? extends GenericOptionsPositionPricing, ? extends OptionQuote>> continuation) {
            return invoke2(tuples2, account, (Continuation<? super Tuples3<? extends Either<ApiOptionPositionReturnRequestLegacy, ApiOptionPositionReturnRequest>, ? extends GenericOptionsPositionPricing, ? extends OptionQuote>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<? extends GenericOptionsPositionPricing, ? extends OptionQuote> tuples2, Account account, Continuation<? super Tuples3<? extends Either<ApiOptionPositionReturnRequestLegacy, ApiOptionPositionReturnRequest>, ? extends GenericOptionsPositionPricing, ? extends OptionQuote>> continuation) {
            C235721 c235721 = new C235721(continuation);
            c235721.L$0 = tuples2;
            c235721.L$1 = account;
            return c235721.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object right;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            Account account = (Account) this.L$1;
            GenericOptionsPositionPricing genericOptionsPositionPricing = (GenericOptionsPositionPricing) tuples2.component1();
            OptionQuote optionQuote = (OptionQuote) tuples2.component2();
            if (account.getBrokerageAccountType().isRetirement()) {
                right = new Either.Left(ApiOptionPositionReturnRequestLegacy.INSTANCE.from(optionQuote, genericOptionsPositionPricing));
            } else {
                right = new Either.Right(ApiOptionPositionReturnRequest.INSTANCE.from(optionQuote, genericOptionsPositionPricing));
            }
            return new Tuples3(right, genericOptionsPositionPricing, optionQuote);
        }
    }

    private final Flow<OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> getInnerViewStateFlow(Flow<? extends Tuples2<? extends GenericOptionsPositionPricing, ? extends OptionQuote>> optionPositionAndQuoteFlow) {
        return FlowKt.mapLatest(FlowKt.distinctUntilChanged(FlowKt.combine(optionPositionAndQuoteFlow, this.accountFlow, new C235721(null))), new C235732(null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState;", "<destruct>", "Lkotlin/Triple;", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/ApiOptionPositionReturnRequestLegacy;", "Lcom/robinhood/models/api/ApiOptionPositionReturnRequest;", "Lcom/robinhood/models/ui/GenericOptionsPositionPricing;", "Lcom/robinhood/models/db/OptionQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInnerViewStateFlow$2", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getInnerViewStateFlow$2 */
    static final class C235732 extends ContinuationImpl7 implements Function2<Tuples3<? extends Either<? extends ApiOptionPositionReturnRequestLegacy, ? extends ApiOptionPositionReturnRequest>, ? extends GenericOptionsPositionPricing, ? extends OptionQuote>, Continuation<? super OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C235732(Continuation<? super C235732> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235732 c235732 = OptionsPortfolioRiskAnalyzerPositionDuxo.this.new C235732(continuation);
            c235732.L$0 = obj;
            return c235732;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends Either<? extends ApiOptionPositionReturnRequestLegacy, ? extends ApiOptionPositionReturnRequest>, ? extends GenericOptionsPositionPricing, ? extends OptionQuote> tuples3, Continuation<? super OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> continuation) {
            return invoke2((Tuples3<? extends Either<ApiOptionPositionReturnRequestLegacy, ApiOptionPositionReturnRequest>, ? extends GenericOptionsPositionPricing, ? extends OptionQuote>) tuples3, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples3<? extends Either<ApiOptionPositionReturnRequestLegacy, ApiOptionPositionReturnRequest>, ? extends GenericOptionsPositionPricing, ? extends OptionQuote> tuples3, Continuation<? super OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState> continuation) {
            return ((C235732) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GenericOptionsPositionPricing genericOptionsPositionPricing;
            OptionQuote optionQuote;
            ApiOptionTodayTotalReturnResponse apiOptionTodayTotalReturnResponse;
            Object objFetchOptionTodayTotalReturn;
            OptionQuote optionQuote2;
            GenericOptionsPositionPricing genericOptionsPositionPricing2;
            Object objFetchOptionTodayTotalReturnLegacy;
            OptionQuote optionQuote3;
            GenericOptionsPositionPricing genericOptionsPositionPricing3;
            PnLUiState pnLUiState;
            BigDecimal bigDecimalMultiply;
            BigDecimal bigDecimalMultiply2;
            BigDecimal bigDecimalMultiply3;
            PnLUiState pnLUiState2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            BigDecimal bigDecimalMultiply4 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples3 tuples3 = (Tuples3) this.L$0;
                Either either = (Either) tuples3.component1();
                genericOptionsPositionPricing = (GenericOptionsPositionPricing) tuples3.component2();
                optionQuote = (OptionQuote) tuples3.component3();
                OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo = OptionsPortfolioRiskAnalyzerPositionDuxo.this;
                if (!(either instanceof Either.Left)) {
                    if (!(either instanceof Either.Right)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ApiOptionPositionReturnRequest apiOptionPositionReturnRequest = (ApiOptionPositionReturnRequest) ((Either.Right) either).getValue();
                    if (apiOptionPositionReturnRequest != null) {
                        OptionStrategyDetailStore optionStrategyDetailStore = optionsPortfolioRiskAnalyzerPositionDuxo.optionStrategyDetailStore;
                        this.L$0 = genericOptionsPositionPricing;
                        this.L$1 = optionQuote;
                        this.label = 2;
                        objFetchOptionTodayTotalReturn = optionStrategyDetailStore.fetchOptionTodayTotalReturn(apiOptionPositionReturnRequest, this);
                        if (objFetchOptionTodayTotalReturn != coroutine_suspended) {
                            optionQuote2 = optionQuote;
                            genericOptionsPositionPricing2 = genericOptionsPositionPricing;
                            apiOptionTodayTotalReturnResponse = (ApiOptionTodayTotalReturnResponse) objFetchOptionTodayTotalReturn;
                            genericOptionsPositionPricing = genericOptionsPositionPricing2;
                            optionQuote = optionQuote2;
                            if (apiOptionTodayTotalReturnResponse != null) {
                            }
                            pnLUiState = pnLUiState2;
                            optionQuote3 = optionQuote;
                            genericOptionsPositionPricing3 = genericOptionsPositionPricing;
                        }
                    } else {
                        apiOptionTodayTotalReturnResponse = null;
                        if (apiOptionTodayTotalReturnResponse != null) {
                        }
                        pnLUiState = pnLUiState2;
                        optionQuote3 = optionQuote;
                        genericOptionsPositionPricing3 = genericOptionsPositionPricing;
                    }
                } else {
                    ApiOptionPositionReturnRequestLegacy apiOptionPositionReturnRequestLegacy = (ApiOptionPositionReturnRequestLegacy) ((Either.Left) either).getValue();
                    OptionStrategyDetailStore optionStrategyDetailStore2 = optionsPortfolioRiskAnalyzerPositionDuxo.optionStrategyDetailStore;
                    this.L$0 = genericOptionsPositionPricing;
                    this.L$1 = optionQuote;
                    this.label = 1;
                    objFetchOptionTodayTotalReturnLegacy = optionStrategyDetailStore2.fetchOptionTodayTotalReturnLegacy(apiOptionPositionReturnRequestLegacy, this);
                    if (objFetchOptionTodayTotalReturnLegacy != coroutine_suspended) {
                        optionQuote3 = optionQuote;
                        genericOptionsPositionPricing3 = genericOptionsPositionPricing;
                        ApiOptionTodayTotalReturnResponse2 apiOptionTodayTotalReturnResponse2 = (ApiOptionTodayTotalReturnResponse2) objFetchOptionTodayTotalReturnLegacy;
                        pnLUiState = new PnLUiState(apiOptionTodayTotalReturnResponse2.getTotal_return().getDecimalValue(), BigDecimals7.safeDivide(apiOptionTodayTotalReturnResponse2.getTotal_return_percent(), BigDecimals7.toBigDecimal(boxing.boxInt(100))));
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                optionQuote3 = (OptionQuote) this.L$1;
                genericOptionsPositionPricing3 = (GenericOptionsPositionPricing) this.L$0;
                ResultKt.throwOnFailure(obj);
                objFetchOptionTodayTotalReturnLegacy = obj;
                ApiOptionTodayTotalReturnResponse2 apiOptionTodayTotalReturnResponse22 = (ApiOptionTodayTotalReturnResponse2) objFetchOptionTodayTotalReturnLegacy;
                pnLUiState = new PnLUiState(apiOptionTodayTotalReturnResponse22.getTotal_return().getDecimalValue(), BigDecimals7.safeDivide(apiOptionTodayTotalReturnResponse22.getTotal_return_percent(), BigDecimals7.toBigDecimal(boxing.boxInt(100))));
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                optionQuote2 = (OptionQuote) this.L$1;
                genericOptionsPositionPricing2 = (GenericOptionsPositionPricing) this.L$0;
                ResultKt.throwOnFailure(obj);
                objFetchOptionTodayTotalReturn = obj;
                apiOptionTodayTotalReturnResponse = (ApiOptionTodayTotalReturnResponse) objFetchOptionTodayTotalReturn;
                genericOptionsPositionPricing = genericOptionsPositionPricing2;
                optionQuote = optionQuote2;
                if (apiOptionTodayTotalReturnResponse != null) {
                    pnLUiState2 = new PnLUiState(apiOptionTodayTotalReturnResponse.getTotal_return(), BigDecimals7.safeDivide(apiOptionTodayTotalReturnResponse.getTotal_return_percent(), BigDecimals7.toBigDecimal(boxing.boxInt(100))));
                } else {
                    pnLUiState2 = new PnLUiState(null, null, 3, null);
                }
                pnLUiState = pnLUiState2;
                optionQuote3 = optionQuote;
                genericOptionsPositionPricing3 = genericOptionsPositionPricing;
            }
            OrderDirection clearingDirection = genericOptionsPositionPricing3.getClearingDirection();
            if (clearingDirection == null) {
                clearingDirection = genericOptionsPositionPricing3.getDirection();
            }
            BigDecimal multiplier = clearingDirection.getMultiplier();
            BigDecimal delta = optionQuote3.getDelta();
            if (delta != null) {
                bigDecimalMultiply = delta.multiply(multiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            } else {
                bigDecimalMultiply = null;
            }
            BigDecimal gamma = optionQuote3.getGamma();
            if (gamma != null) {
                bigDecimalMultiply2 = gamma.multiply(multiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            } else {
                bigDecimalMultiply2 = null;
            }
            BigDecimal theta = optionQuote3.getTheta();
            if (theta != null) {
                bigDecimalMultiply3 = theta.multiply(multiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
            } else {
                bigDecimalMultiply3 = null;
            }
            BigDecimal vega = optionQuote3.getVega();
            if (vega != null) {
                bigDecimalMultiply4 = vega.multiply(multiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply4, "multiply(...)");
            }
            return new OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState(pnLUiState, new OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState(bigDecimalMultiply, bigDecimalMultiply2, bigDecimalMultiply3, bigDecimalMultiply4, optionQuote3.getAdjustedMarkPrice().getUnsignedValue(), genericOptionsPositionPricing3.getAverageStrategyPrice().abs(), clearingDirection == OrderDirection.DEBIT));
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onSelectOrDeselectAllClicked$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onSelectOrDeselectAllClicked$1 */
    static final class C235811 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C235811(Continuation<? super C235811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235811 c235811 = new C235811(continuation);
            c235811.L$0 = obj;
            return c235811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
            return ((C235811) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UUID instrument;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState = (OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0;
            Position equityPosition = optionsPortfolioRiskAnalyzerPositionDataState.getEquityPosition();
            String string2 = (equityPosition == null || (instrument = equityPosition.getInstrument()) == null) ? null : instrument.toString();
            List<UiAggregateOptionPositionFull> aggregateOptionPositions = optionsPortfolioRiskAnalyzerPositionDataState.getAggregateOptionPositions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(aggregateOptionPositions, 10));
            Iterator<T> it = aggregateOptionPositions.iterator();
            while (it.hasNext()) {
                arrayList.add(((UiAggregateOptionPositionFull) it.next()).getId().toString());
            }
            List<UiAggregateOptionPositionFull> aggregateOptionPositions2 = optionsPortfolioRiskAnalyzerPositionDataState.getAggregateOptionPositions();
            ArrayList arrayList2 = new ArrayList();
            for (UiAggregateOptionPositionFull uiAggregateOptionPositionFull : aggregateOptionPositions2) {
                List<UiAggregateOptionPositionLeg> uiLegs = uiAggregateOptionPositionFull.getUiLegs();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiLegs, 10));
                Iterator<T> it2 = uiLegs.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState2.getRowIdForLegPosition(uiAggregateOptionPositionFull.getId(), ((UiAggregateOptionPositionLeg) it2.next()).getOptionPositionId()));
                }
                CollectionsKt.addAll(arrayList2, arrayList3);
            }
            if (OptionsPortfolioRiskAnalyzerPositionStateProvider2.allPositionRowsChecked(string2, arrayList2, optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked())) {
                if (string2 != null) {
                    optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().put(string2, boxing.boxBoolean(false));
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().put((String) it3.next(), boxing.boxBoolean(false));
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().put((String) it4.next(), boxing.boxBoolean(false));
                }
            } else {
                optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().clear();
            }
            return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default(optionsPortfolioRiskAnalyzerPositionDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
    }

    public final void onSelectOrDeselectAllClicked() {
        applyMutation(new C235811(null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onEquityRowCheckedChanged$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onEquityRowCheckedChanged$1 */
    static final class C235771 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
        final /* synthetic */ boolean $checked;
        final /* synthetic */ UUID $equityInstrumentId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235771(UUID uuid, boolean z, Continuation<? super C235771> continuation) {
            super(2, continuation);
            this.$equityInstrumentId = uuid;
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235771 c235771 = new C235771(this.$equityInstrumentId, this.$checked, continuation);
            c235771.L$0 = obj;
            return c235771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
            return ((C235771) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState = (OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0;
            optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().put(this.$equityInstrumentId.toString(), boxing.boxBoolean(this.$checked));
            return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default(optionsPortfolioRiskAnalyzerPositionDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
    }

    public final void onEquityRowCheckedChanged(UUID equityInstrumentId, boolean checked) {
        Intrinsics.checkNotNullParameter(equityInstrumentId, "equityInstrumentId");
        applyMutation(new C235771(equityInstrumentId, checked, null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onAggregateOptionRowCheckedChanged$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onAggregateOptionRowCheckedChanged$1 */
    static final class C235761 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
        final /* synthetic */ UUID $aggregatePositionIdToCheck;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ List<UUID> $relatedLegPositionIds;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235761(UUID uuid, boolean z, List<UUID> list, Continuation<? super C235761> continuation) {
            super(2, continuation);
            this.$aggregatePositionIdToCheck = uuid;
            this.$checked = z;
            this.$relatedLegPositionIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235761 c235761 = new C235761(this.$aggregatePositionIdToCheck, this.$checked, this.$relatedLegPositionIds, continuation);
            c235761.L$0 = obj;
            return c235761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
            return ((C235761) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState = (OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0;
            optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().put(this.$aggregatePositionIdToCheck.toString(), boxing.boxBoolean(this.$checked));
            List<UUID> list = this.$relatedLegPositionIds;
            UUID uuid = this.$aggregatePositionIdToCheck;
            boolean z = this.$checked;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().put(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState2.getRowIdForLegPosition(uuid, (UUID) it.next()), boxing.boxBoolean(z));
            }
            return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default(optionsPortfolioRiskAnalyzerPositionDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
    }

    public final void onAggregateOptionRowCheckedChanged(UUID aggregatePositionIdToCheck, List<UUID> relatedLegPositionIds, boolean checked) {
        Intrinsics.checkNotNullParameter(aggregatePositionIdToCheck, "aggregatePositionIdToCheck");
        Intrinsics.checkNotNullParameter(relatedLegPositionIds, "relatedLegPositionIds");
        applyMutation(new C235761(aggregatePositionIdToCheck, checked, relatedLegPositionIds, null));
    }

    public final StateFlow<TradeActionUiState> getTradeActionButtonViewState(UiAggregateOptionPositionFull aggregatePositon, List<UiAggregateOptionPositionLeg> selectedLegs, BigDecimal simulatedQuantity) {
        Intrinsics.checkNotNullParameter(aggregatePositon, "aggregatePositon");
        Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
        Intrinsics.checkNotNullParameter(simulatedQuantity, "simulatedQuantity");
        return computeTradeActionUiState(aggregatePositon, selectedLegs, simulatedQuantity);
    }

    private final StateFlow<TradeActionUiState> computeTradeActionUiState(UiAggregateOptionPositionFull aggregatePositon, List<UiAggregateOptionPositionLeg> selectedLegs, BigDecimal simulatedQuantity) {
        Flow flowFlowOf;
        boolean z = selectedLegs.size() == 1;
        boolean z2 = selectedLegs.size() > 1;
        UiOptionChain uiOptionChain = aggregatePositon.getUiOptionChain();
        if (z2) {
            flowFlowOf = FlowKt.mapLatest(FlowKt.combine(this.accountFlow, this.currentOrNextMarketDatesFlow, this.optionSettingsFlow, new C23567x29fb763c(null)), new C23568x29fb763d(simulatedQuantity, selectedLegs, this, uiOptionChain, null));
        } else if (z) {
            flowFlowOf = FlowKt.transformLatest(FlowKt.combine(this.accountFlow, this.currentOrNextMarketDatesFlow, this.optionSettingsFlow, new C23569x29fb763e(null)), new C23552x65df5618(null, this, uiOptionChain, selectedLegs, simulatedQuantity));
        } else {
            flowFlowOf = FlowKt.flowOf(new TradeActionUiState(null, null, null, 7, null));
        }
        return FlowKt.stateIn(flowFlowOf, getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), new TradeActionUiState(null, null, null, 7, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<TradeActionUiState> computeSingleLegOptionPositionTradeActionUiState(Account account, OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionSettings optionSettings, UiOptionChain uiOptionChain, UiAggregateOptionPositionLeg leg, BigDecimal simulatedQuantity) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        boolean z = simulatedQuantity.compareTo(bigDecimal2) >= 0;
        boolean z2 = simulatedQuantity.compareTo(bigDecimal2) <= 0;
        boolean z3 = simulatedQuantity.compareTo(bigDecimal2) == 0;
        if (z3) {
            bigDecimal = null;
        } else {
            BigDecimal bigDecimalAbs = simulatedQuantity.abs();
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            Comparable comparableCoerceAtLeast = RangesKt.coerceAtLeast(bigDecimalAbs, ONE);
            Intrinsics.checkNotNullExpressionValue(comparableCoerceAtLeast, "coerceAtLeast(...)");
            BigDecimal bigDecimalMultiply = ((BigDecimal) comparableCoerceAtLeast).multiply(BigDecimals7.toBigDecimal(leg.getRatioQuantity()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            bigDecimal = bigDecimalMultiply;
        }
        OptionPositionType positionType = leg.getPositionType();
        OptionInstrument optionInstrument = leg.getOptionInstrument();
        String strategyCode = leg.getStrategyCode();
        boolean zCanOpenOrCloseSingleLegPosition$default = canOpenOrCloseSingleLegPosition$default(this, currentOrNextMarketDates, optionSettings, optionInstrument, uiOptionChain, positionType, account.getOnlyPositionClosingTrades(), false, 64, null);
        boolean zCanOpenOrCloseSingleLegPosition = canOpenOrCloseSingleLegPosition(currentOrNextMarketDates, optionSettings, optionInstrument, uiOptionChain, positionType, account.getOnlyPositionClosingTrades(), false);
        OptionOrderBundle optionOrderBundle = getOptionOrderBundle(uiOptionChain, extensions2.persistentListOf(getOpenOrClosePositionOptionLegBundle$default(this, leg, uiOptionChain, false, 4, null)), bigDecimal);
        OptionOrderBundle optionOrderBundle2 = getOptionOrderBundle(uiOptionChain, extensions2.persistentListOf(getOpenOrClosePositionOptionLegBundle(leg, uiOptionChain, false)), bigDecimal);
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.optionRollingStore.pollOptionMaxRollableQuantity(account.getAccountNumber(), strategyCode)), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.mapLatest(new Flow<Boolean>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeSingleLegOptionPositionTradeActionUiState$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeSingleLegOptionPositionTradeActionUiState$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeSingleLegOptionPositionTradeActionUiState$$inlined$map$1$2", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeSingleLegOptionPositionTradeActionUiState$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = boxing.boxBoolean(((OptionMaxRollableQuantity) obj).getAvailableQuantity().compareTo(BigDecimal.ZERO) != 0);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new C235662(z3, account, strategyCode, z, zCanOpenOrCloseSingleLegPosition$default, optionOrderBundle, z2, zCanOpenOrCloseSingleLegPosition, optionOrderBundle2, null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeActionUiState;", "canRoll", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeSingleLegOptionPositionTradeActionUiState$2", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeSingleLegOptionPositionTradeActionUiState$2 */
    static final class C235662 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super TradeActionUiState>, Object> {
        final /* synthetic */ Account $account;
        final /* synthetic */ boolean $canClosePositions;
        final /* synthetic */ boolean $canOpenPositions;
        final /* synthetic */ OptionOrderBundle $closePositionOptionOrderBundle;
        final /* synthetic */ boolean $isNoQuantitySimulated;
        final /* synthetic */ OptionOrderBundle $openPositionOptionOrderBundle;
        final /* synthetic */ boolean $simulateToClose;
        final /* synthetic */ boolean $simulateToOpen;
        final /* synthetic */ String $strategyCode;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235662(boolean z, Account account, String str, boolean z2, boolean z3, OptionOrderBundle optionOrderBundle, boolean z4, boolean z5, OptionOrderBundle optionOrderBundle2, Continuation<? super C235662> continuation) {
            super(2, continuation);
            this.$isNoQuantitySimulated = z;
            this.$account = account;
            this.$strategyCode = str;
            this.$simulateToOpen = z2;
            this.$canOpenPositions = z3;
            this.$openPositionOptionOrderBundle = optionOrderBundle;
            this.$simulateToClose = z4;
            this.$canClosePositions = z5;
            this.$closePositionOptionOrderBundle = optionOrderBundle2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235662 c235662 = new C235662(this.$isNoQuantitySimulated, this.$account, this.$strategyCode, this.$simulateToOpen, this.$canOpenPositions, this.$openPositionOptionOrderBundle, this.$simulateToClose, this.$canClosePositions, this.$closePositionOptionOrderBundle, continuation);
            c235662.Z$0 = ((Boolean) obj).booleanValue();
            return c235662;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super TradeActionUiState> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super TradeActionUiState> continuation) {
            return ((C235662) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = false;
            TradeButtonUiState tradeButtonUiState = new TradeButtonUiState(this.Z$0 && this.$isNoQuantitySimulated, new LegacyIntentKey.OptionRolling(this.$account.getAccountNumber(), this.$strategyCode));
            TradeButtonUiState tradeButtonUiState2 = new TradeButtonUiState(this.$simulateToOpen && this.$canOpenPositions, new OptionOrderIntentKey.FromOptionOrderBundle(null, this.$account.getAccountNumber(), this.$openPositionOptionOrderBundle, null, null, null, null, false, false, false, null, null, this.$strategyCode, null, 11769, null));
            if (this.$simulateToClose && this.$canClosePositions) {
                z = true;
            }
            return new TradeActionUiState(tradeButtonUiState, tradeButtonUiState2, new TradeButtonUiState(z, new OptionOrderIntentKey.FromOptionOrderBundle(null, this.$account.getAccountNumber(), this.$closePositionOptionOrderBundle, null, null, null, null, false, false, false, null, null, this.$strategyCode, null, 11769, null)));
        }
    }

    static /* synthetic */ boolean canOpenOrCloseSingleLegPosition$default(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings optionSettings, OptionInstrument optionInstrument, UiOptionChain uiOptionChain, OptionPositionType optionPositionType, boolean z, boolean z2, int i, Object obj) {
        return optionsPortfolioRiskAnalyzerPositionDuxo.canOpenOrCloseSingleLegPosition(optionCurrentOrNextMarketDates, optionSettings, optionInstrument, uiOptionChain, optionPositionType, z, (i & 64) != 0 ? true : z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canOpenOrCloseSingleLegPosition(OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionSettings optionSettings, OptionInstrument optionInstrument, UiOptionChain uiOptionChain, OptionPositionType positionType, boolean pcoAccount, boolean isForOpenPosition) {
        Tradability adjustedTradability = new UiOptionInstrumentTradability(currentOrNextMarketDates, optionSettings.getTradingOnExpirationState(), optionInstrument, uiOptionChain.getOptionChain(), uiOptionChain.getUnderlyingType()).getAdjustedTradability();
        boolean z = true;
        boolean z2 = adjustedTradability == Tradability.UNTRADABLE || adjustedTradability == Tradability.UNTRADABLE_REGSHO;
        boolean z3 = z2 || (adjustedTradability == Tradability.POSITION_CLOSING_ONLY && positionType == OptionPositionType.LONG);
        boolean z4 = z2 || (adjustedTradability == Tradability.POSITION_CLOSING_ONLY && positionType == OptionPositionType.SHORT);
        boolean z5 = pcoAccount && positionType == OptionPositionType.LONG;
        boolean z6 = pcoAccount && positionType == OptionPositionType.SHORT;
        boolean z7 = (z3 || z5) ? false : true;
        boolean z8 = (z4 || z6) ? false : true;
        OptionPositionType optionPositionType = OptionPositionType.LONG;
        boolean z9 = (positionType == optionPositionType && z7) || (positionType == OptionPositionType.SHORT && z8);
        if ((positionType != optionPositionType || !z8) && (positionType != OptionPositionType.SHORT || !z7)) {
            z = false;
        }
        return isForOpenPosition ? z9 : z;
    }

    static /* synthetic */ OptionLegBundle getOpenOrClosePositionOptionLegBundle$default(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg, UiOptionChain uiOptionChain, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return optionsPortfolioRiskAnalyzerPositionDuxo.getOpenOrClosePositionOptionLegBundle(uiAggregateOptionPositionLeg, uiOptionChain, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionLegBundle getOpenOrClosePositionOptionLegBundle(UiAggregateOptionPositionLeg leg, UiOptionChain uiOptionChain, boolean isForOpenPosition) {
        OrderPositionEffect orderPositionEffect;
        OptionPositionType positionType = leg.getPositionType();
        UUID indexUnderlyingId = uiOptionChain.getIndexUnderlyingId();
        if (indexUnderlyingId == null) {
            indexUnderlyingId = uiOptionChain.getSingleEquityUnderlyingId();
        }
        if (isForOpenPosition) {
            orderPositionEffect = OrderPositionEffect.OPEN;
        } else {
            orderPositionEffect = OrderPositionEffect.CLOSE;
        }
        return OptionBundles.toLegBundle(leg, indexUnderlyingId, positionType.getSideHavingPositionEffect(orderPositionEffect), uiOptionChain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOrderBundle getOptionOrderBundle(UiOptionChain uiOptionChain, List<OptionLegBundle> legBundles, BigDecimal prefilledQuantity) {
        UUID indexUnderlyingId = uiOptionChain.getIndexUnderlyingId();
        if (indexUnderlyingId == null) {
            indexUnderlyingId = uiOptionChain.getSingleEquityUnderlyingId();
        }
        return new OptionOrderBundle(OptionBundles.toChainBundle(uiOptionChain, indexUnderlyingId), extensions2.toImmutableList(legBundles), prefilledQuantity, null, null, null, 56, null);
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onLegOptionRowCheckedChanged$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onLegOptionRowCheckedChanged$1 */
    static final class C235791 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
        final /* synthetic */ boolean $checked;
        final /* synthetic */ UUID $legPositionIdToCheck;
        final /* synthetic */ UUID $relatedAggregatePositionId;
        final /* synthetic */ List<UUID> $relatedLegPositionIds;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235791(UUID uuid, UUID uuid2, boolean z, List<UUID> list, Continuation<? super C235791> continuation) {
            super(2, continuation);
            this.$relatedAggregatePositionId = uuid;
            this.$legPositionIdToCheck = uuid2;
            this.$checked = z;
            this.$relatedLegPositionIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235791 c235791 = new C235791(this.$relatedAggregatePositionId, this.$legPositionIdToCheck, this.$checked, this.$relatedLegPositionIds, continuation);
            c235791.L$0 = obj;
            return c235791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
            return ((C235791) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState = (OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0;
            optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().put(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState2.getRowIdForLegPosition(this.$relatedAggregatePositionId, this.$legPositionIdToCheck), boxing.boxBoolean(this.$checked));
            List<UUID> list = this.$relatedLegPositionIds;
            UUID uuid = this.$relatedAggregatePositionId;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = true;
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Boolean bool = optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().get(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState2.getRowIdForLegPosition(uuid, (UUID) it.next()));
                    if (bool != null ? bool.booleanValue() : true) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToChecked().put(this.$relatedAggregatePositionId.toString(), boxing.boxBoolean(!z));
            return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default(optionsPortfolioRiskAnalyzerPositionDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
    }

    public final void onLegOptionRowCheckedChanged(UUID legPositionIdToCheck, UUID relatedAggregatePositionId, List<UUID> relatedLegPositionIds, boolean checked) {
        Intrinsics.checkNotNullParameter(legPositionIdToCheck, "legPositionIdToCheck");
        Intrinsics.checkNotNullParameter(relatedAggregatePositionId, "relatedAggregatePositionId");
        Intrinsics.checkNotNullParameter(relatedLegPositionIds, "relatedLegPositionIds");
        applyMutation(new C235791(relatedAggregatePositionId, legPositionIdToCheck, checked, relatedLegPositionIds, null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onExpandOrCollapse$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onExpandOrCollapse$1 */
    static final class C235781 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
        final /* synthetic */ boolean $collapsed;
        final /* synthetic */ String $rowId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235781(String str, boolean z, Continuation<? super C235781> continuation) {
            super(2, continuation);
            this.$rowId = str;
            this.$collapsed = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235781 c235781 = new C235781(this.$rowId, this.$collapsed, continuation);
            c235781.L$0 = obj;
            return c235781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
            return ((C235781) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState = (OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0;
            optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToCollapsed().put(this.$rowId, boxing.boxBoolean(this.$collapsed));
            return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default(optionsPortfolioRiskAnalyzerPositionDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
    }

    public final void onExpandOrCollapse(String rowId, boolean collapsed) {
        Intrinsics.checkNotNullParameter(rowId, "rowId");
        applyMutation(new C235781(rowId, collapsed, null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onPlusOrMinusClicked$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onPlusOrMinusClicked$1 */
    static final class C235801 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
        final /* synthetic */ boolean $isPlus;
        final /* synthetic */ String $rowId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235801(String str, boolean z, Continuation<? super C235801> continuation) {
            super(2, continuation);
            this.$rowId = str;
            this.$isPlus = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235801 c235801 = new C235801(this.$rowId, this.$isPlus, continuation);
            c235801.L$0 = obj;
            return c235801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
            return ((C235801) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            BigDecimal bigDecimalAdd;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState = (OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0;
            BigDecimal bigDecimal = optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToSimulatedQuantity().get(this.$rowId);
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            Map<String, BigDecimal> rowIdToSimulatedQuantity = optionsPortfolioRiskAnalyzerPositionDataState.getRowIdToSimulatedQuantity();
            String str = this.$rowId;
            if (this.$isPlus) {
                Intrinsics.checkNotNull(bigDecimal);
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                bigDecimalAdd = bigDecimal.add(ONE);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            } else {
                Intrinsics.checkNotNull(bigDecimal);
                BigDecimal ONE2 = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
                BigDecimal bigDecimalSubtract = bigDecimal.subtract(ONE2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                bigDecimalAdd = (BigDecimal) RangesKt.coerceAtLeast(bigDecimalSubtract, ZERO);
            }
            rowIdToSimulatedQuantity.put(str, bigDecimalAdd);
            return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default(optionsPortfolioRiskAnalyzerPositionDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
    }

    public final void onPlusOrMinusClicked(String rowId, boolean isPlus) {
        Intrinsics.checkNotNullParameter(rowId, "rowId");
        applyMutation(new C235801(rowId, isPlus, null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onUnderlyingPriceUpdated$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onUnderlyingPriceUpdated$1 */
    static final class C235831 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
        final /* synthetic */ BigDecimal $underlyingPrice;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235831(BigDecimal bigDecimal, Continuation<? super C235831> continuation) {
            super(2, continuation);
            this.$underlyingPrice = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235831 c235831 = new C235831(this.$underlyingPrice, continuation);
            c235831.L$0 = obj;
            return c235831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
            return ((C235831) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState = (OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0;
            BigDecimal bigDecimal = this.$underlyingPrice;
            return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default(optionsPortfolioRiskAnalyzerPositionDataState, null, null, null, null, null, null, null, null, null, null, null, null, bigDecimal != null ? boxing.boxDouble(bigDecimal.doubleValue()) : null, 4095, null);
        }
    }

    public final void onUnderlyingPriceUpdated(BigDecimal underlyingPrice) {
        applyMutation(new C235831(underlyingPrice, null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onSliderPositionUpdated$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$onSliderPositionUpdated$1 */
    static final class C235821 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
        final /* synthetic */ Double $sliderPosition;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235821(Double d, Continuation<? super C235821> continuation) {
            super(2, continuation);
            this.$sliderPosition = d;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235821 c235821 = new C235821(this.$sliderPosition, continuation);
            c235821.L$0 = obj;
            return c235821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
            return ((C235821) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default((OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, this.$sliderPosition, null, 6143, null);
        }
    }

    public final void onSliderPositionUpdated(Double sliderPosition) {
        applyMutation(new C235821(sliderPosition, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Tuples2<OptionChain, Map<UUID, LocalDate>>> getChainToLegExpirationDatesList(List<UiAggregateOptionPositionFull> optionPositions) {
        ArrayList arrayList = new ArrayList();
        for (UiAggregateOptionPositionFull uiAggregateOptionPositionFull : optionPositions) {
            List<UiAggregateOptionPositionLeg> uiLegs = uiAggregateOptionPositionFull.getUiLegs();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiLegs, 10));
            Iterator<T> it = uiLegs.iterator();
            while (it.hasNext()) {
                arrayList2.add(Tuples4.m3642to((UiAggregateOptionPositionLeg) it.next(), uiAggregateOptionPositionFull.getOptionChain()));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            OptionChain optionChain = (OptionChain) ((Tuples2) obj).getSecond();
            Object arrayList3 = linkedHashMap.get(optionChain);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(optionChain, arrayList3);
            }
            ((List) arrayList3).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List<Tuples2> list = (List) entry.getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Tuples2 tuples2 : list) {
                Tuples2 tuples2M3642to = Tuples4.m3642to(((UiAggregateOptionPositionLeg) tuples2.getFirst()).getOptionInstrument().getId(), ((UiAggregateOptionPositionLeg) tuples2.getFirst()).getOptionInstrument().getExpirationDate());
                linkedHashMap3.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            linkedHashMap2.put(key, linkedHashMap3);
        }
        return MapsKt.toList(linkedHashMap2);
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$1 */
    static final class C235561 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C235561(Continuation<? super C235561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235561 c235561 = new C235561(continuation);
            c235561.L$0 = obj;
            return c235561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
            return ((C235561) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default((OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0, CollectionsKt.emptyList(), null, null, null, null, MapsKt.emptyMap(), MapsKt.emptyMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), MapsKt.emptyMap(), null, null, 6144, null);
        }
    }

    public final Job bind(UUID underlyingId) {
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        applyMutation(new C235561(null));
        this.innerViewStateFlowMap.clear();
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore;
        Companion companion = INSTANCE;
        Flow<List<UiAggregateOptionPositionFull>> flowStreamUiAggregateOptionPositionFullListByUnderlyingId = aggregateOptionPositionStore.streamUiAggregateOptionPositionFullListByUnderlyingId(((Args) companion.getArgs((HasArgs) this)).getAccountNumber(), underlyingId);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C235572(flowStreamUiAggregateOptionPositionFullListByUnderlyingId, null), 2, null);
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.positionStore.getPositionForAccountOptional(underlyingId, ((Args) companion.getArgs((HasArgs) this)).getAccountNumber(), true)), Integer.MAX_VALUE, null, 2, null);
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Flow5.withFallbackAfter(this.unrealizedProfitAndLossStore.getUnrealizedProfitAndLossDataForInstrument(((Args) companion.getArgs((HasArgs) this)).getAccountNumber(), underlyingId), 2000L, new C23565xbdd15277(null)));
        Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(Flow5.withFallbackAfter(this.quoteStore.getStreamQuote().asFlow(underlyingId), 2000L, new OptionsPortfolioRiskAnalyzerPositionDuxo$bind$quoteFlow$1(null)));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C235583(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(((Args) companion.getArgs((HasArgs) this)).getAccountNumber())), Integer.MAX_VALUE, null, 2, null), flowDistinctUntilChanged, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C235594(flowDistinctUntilChanged2, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C235605(flowBuffer$default, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C235616(flowBuffer$default, this, underlyingId, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C235627(flowBuffer$default, flowStreamUiAggregateOptionPositionFullListByUnderlyingId, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C235638(flowStreamUiAggregateOptionPositionFullListByUnderlyingId, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C235649(underlyingId, null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$2", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {806}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$2 */
    static final class C235572 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<List<UiAggregateOptionPositionFull>> $aggregateOptionPositionFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C235572(Flow<? extends List<UiAggregateOptionPositionFull>> flow, Continuation<? super C235572> continuation) {
            super(2, continuation);
            this.$aggregateOptionPositionFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsPortfolioRiskAnalyzerPositionDuxo.this.new C235572(this.$aggregateOptionPositionFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235572) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AggregateOptionPositionStore.refresh$default(OptionsPortfolioRiskAnalyzerPositionDuxo.this.aggregateOptionPositionStore, false, null, ((Args) OptionsPortfolioRiskAnalyzerPositionDuxo.INSTANCE.getArgs((HasArgs) OptionsPortfolioRiskAnalyzerPositionDuxo.this)).getAccountNumber(), 2, null);
                Flow<List<UiAggregateOptionPositionFull>> flow = this.$aggregateOptionPositionFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsPortfolioRiskAnalyzerPositionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "positions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$2$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UiAggregateOptionPositionFull>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiAggregateOptionPositionFull> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiAggregateOptionPositionFull>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiAggregateOptionPositionFull> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$2$1$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503371 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
                final /* synthetic */ List<UiAggregateOptionPositionFull> $positions;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503371(List<UiAggregateOptionPositionFull> list, Continuation<? super C503371> continuation) {
                    super(2, continuation);
                    this.$positions = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503371 c503371 = new C503371(this.$positions, continuation);
                    c503371.L$0 = obj;
                    return c503371;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
                    return ((C503371) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default((OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0, this.$positions, null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503371((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$3", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {844}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$3 */
    static final class C235583 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Account> $accountFlow;
        final /* synthetic */ Flow<UnrealizedProfitAndLossData> $unrealizedProfitAndLossFlow;
        int label;
        final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235583(Flow<Account> flow, Flow<UnrealizedProfitAndLossData> flow2, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super C235583> continuation) {
            super(2, continuation);
            this.$accountFlow = flow;
            this.$unrealizedProfitAndLossFlow = flow2;
            this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235583(this.$accountFlow, this.$unrealizedProfitAndLossFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235583) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(this.$accountFlow, new C23544x5f449c7e(null, this.$unrealizedProfitAndLossFlow));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "unrealizedProfitAndLoss", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$3$2", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UnrealizedProfitAndLossData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UnrealizedProfitAndLossData unrealizedProfitAndLossData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(unrealizedProfitAndLossData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$3$2$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
                final /* synthetic */ UnrealizedProfitAndLossData $unrealizedProfitAndLoss;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UnrealizedProfitAndLossData unrealizedProfitAndLossData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$unrealizedProfitAndLoss = unrealizedProfitAndLossData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$unrealizedProfitAndLoss, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
                    return ((AnonymousClass1) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default((OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0, null, null, this.$unrealizedProfitAndLoss, null, null, null, null, null, null, null, null, null, null, 8187, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((UnrealizedProfitAndLossData) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$4", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {855}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$4 */
    static final class C235594 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Quote> $quoteFlow;
        int label;
        final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235594(Flow<Quote> flow, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super C235594> continuation) {
            super(2, continuation);
            this.$quoteFlow = flow;
            this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235594(this.$quoteFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235594) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Quote> flow = this.$quoteFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$4$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Quote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Quote quote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(quote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$4$1$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503381 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
                final /* synthetic */ Quote $quote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503381(Quote quote, Continuation<? super C503381> continuation) {
                    super(2, continuation);
                    this.$quote = quote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503381 c503381 = new C503381(this.$quote, continuation);
                    c503381.L$0 = obj;
                    return c503381;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
                    return ((C503381) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default((OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0, null, null, null, this.$quote, null, null, null, null, null, null, null, null, null, 8183, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503381((Quote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$5", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {866}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$5 */
    static final class C235605 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Optional<Position>> $equityPositionFlow;
        int label;
        final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C235605(Flow<? extends Optional<Position>> flow, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super C235605> continuation) {
            super(2, continuation);
            this.$equityPositionFlow = flow;
            this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235605(this.$equityPositionFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235605) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Optional<Position>> flow = this.$equityPositionFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "equityPosition", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Position;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$5$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends Position>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<Position> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Position> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<Position>) optional, continuation);
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$5$1$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503391 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
                final /* synthetic */ Optional<Position> $equityPosition;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503391(Optional<Position> optional, Continuation<? super C503391> continuation) {
                    super(2, continuation);
                    this.$equityPosition = optional;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503391 c503391 = new C503391(this.$equityPosition, continuation);
                    c503391.L$0 = obj;
                    return c503391;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
                    return ((C503391) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default((OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0, null, this.$equityPosition.getOrNull(), null, null, null, null, null, null, null, null, null, null, null, 8189, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503391((Optional) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$6", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {879}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$6 */
    static final class C235616 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Optional<Position>> $equityPositionFlow;
        final /* synthetic */ UUID $underlyingId;
        int label;
        final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C235616(Flow<? extends Optional<Position>> flow, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, UUID uuid, Continuation<? super C235616> continuation) {
            super(2, continuation);
            this.$equityPositionFlow = flow;
            this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            this.$underlyingId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235616(this.$equityPositionFlow, this.this$0, this.$underlyingId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235616) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(this.$equityPositionFlow, new C23545x649e6f1b(null, this.this$0, this.$underlyingId));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$6$2", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$6$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$6$2$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$6$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
                final /* synthetic */ Instrument $instrument;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Instrument instrument, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$instrument = instrument;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$instrument, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
                    return ((AnonymousClass1) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default((OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0, null, null, null, null, this.$instrument, null, null, null, null, null, null, null, null, 8175, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Instrument) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$7", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {914}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$7 */
    static final class C235627 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<List<UiAggregateOptionPositionFull>> $aggregateOptionPositionFlow;
        final /* synthetic */ Flow<Optional<Position>> $equityPositionFlow;
        int label;
        final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C235627(Flow<? extends Optional<Position>> flow, Flow<? extends List<UiAggregateOptionPositionFull>> flow2, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super C235627> continuation) {
            super(2, continuation);
            this.$equityPositionFlow = flow;
            this.$aggregateOptionPositionFlow = flow2;
            this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235627(this.$equityPositionFlow, this.$aggregateOptionPositionFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235627) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChangedBy(FlowKt.combine(this.$equityPositionFlow, this.$aggregateOptionPositionFlow, new AnonymousClass1(this.this$0, null)), new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionsPortfolioRiskAnalyzerPositionDuxo.C235627.invokeSuspend$lambda$1((OptionSimulatedReturnMarketDataParamsRequestV4) obj2);
                    }
                }), new C23547xbbbc5ffa(null, this.this$0));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV4;", "equityPosition", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Position;", "optionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$7$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Optional<? extends Position>, List<? extends UiAggregateOptionPositionFull>, Continuation<? super OptionSimulatedReturnMarketDataParamsRequestV4>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<Position> optional, List<UiAggregateOptionPositionFull> list, Continuation<? super OptionSimulatedReturnMarketDataParamsRequestV4> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = optional;
                anonymousClass1.L$1 = list;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Position> optional, List<? extends UiAggregateOptionPositionFull> list, Continuation<? super OptionSimulatedReturnMarketDataParamsRequestV4> continuation) {
                return invoke2((Optional<Position>) optional, (List<UiAggregateOptionPositionFull>) list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                UiOptionChain uiOptionChain;
                List<OptionUnderlying> underlyings;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Optional optional = (Optional) this.L$0;
                List list = (List) this.L$1;
                UiAggregateOptionPositionFull uiAggregateOptionPositionFull = (UiAggregateOptionPositionFull) CollectionsKt.firstOrNull(list);
                OptionSimulatedChartBundle5 optionSimulatedChartUnderlying = (uiAggregateOptionPositionFull == null || (uiOptionChain = uiAggregateOptionPositionFull.getUiOptionChain()) == null || (underlyings = uiOptionChain.getUnderlyings()) == null) ? null : OptionSimulatedChartBundle3.toOptionSimulatedChartUnderlying(underlyings);
                Position position = (Position) optional.getOrNull();
                OptionSimulatedChartBundle5.Equity equity = position != null ? new OptionSimulatedChartBundle5.Equity(position.getInstrument()) : null;
                if (optionSimulatedChartUnderlying == null) {
                    optionSimulatedChartUnderlying = equity;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<UiAggregateOptionPositionLeg> uiLegs = ((UiAggregateOptionPositionFull) it.next()).getUiLegs();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiLegs, 10));
                    Iterator<T> it2 = uiLegs.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((UiAggregateOptionPositionLeg) it2.next()).getOptionInstrument());
                    }
                    CollectionsKt.addAll(arrayList, arrayList2);
                }
                return new OptionSimulatedReturnMarketDataParamsRequestV4(arrayList, optionSimulatedChartUnderlying, this.this$0.getChainToLegExpirationDatesList(list));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List invokeSuspend$lambda$1(OptionSimulatedReturnMarketDataParamsRequestV4 optionSimulatedReturnMarketDataParamsRequestV4) {
            List<OptionInstrument> optionInstruments = optionSimulatedReturnMarketDataParamsRequestV4.getOptionInstruments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionInstruments, 10));
            Iterator<T> it = optionInstruments.iterator();
            while (it.hasNext()) {
                arrayList.add(((OptionInstrument) it.next()).getId());
            }
            return arrayList;
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketDataParams", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV4Request;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$7$4", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {917}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$7$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<ApiOptionSimulatedReturnsConfigurationV4Request, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiOptionSimulatedReturnsConfigurationV4Request apiOptionSimulatedReturnsConfigurationV4Request, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(apiOptionSimulatedReturnsConfigurationV4Request, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AnonymousClass4 anonymousClass4;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ApiOptionSimulatedReturnsConfigurationV4Request apiOptionSimulatedReturnsConfigurationV4Request = (ApiOptionSimulatedReturnsConfigurationV4Request) this.L$0;
                        Endpoint<ApiOptionSimulatedReturnsConfigurationV4Request, OptionSimulatedReturnsConfigurationResponse> getOptionSimulatedReturnConfigurationV4Endpoint = this.this$0.optionSimulatedReturnsStore.getGetOptionSimulatedReturnConfigurationV4Endpoint();
                        Intrinsics.checkNotNull(apiOptionSimulatedReturnsConfigurationV4Request);
                        this.label = 1;
                        anonymousClass4 = this;
                        try {
                            obj = Endpoint.DefaultImpls.forceFetch$default(getOptionSimulatedReturnConfigurationV4Endpoint, apiOptionSimulatedReturnsConfigurationV4Request, null, anonymousClass4, 2, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable unused) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        anonymousClass4 = this;
                    }
                    anonymousClass4.this$0.applyMutation(new AnonymousClass1((OptionSimulatedReturnsConfigurationResponse) obj, null));
                } catch (Throwable unused2) {
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$7$4$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$7$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
                final /* synthetic */ OptionSimulatedReturnsConfigurationResponse $config;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSimulatedReturnsConfigurationResponse optionSimulatedReturnsConfigurationResponse, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$config = optionSimulatedReturnsConfigurationResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$config, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
                    return ((AnonymousClass1) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState = (OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0;
                    List<OptionPricingParams> paramResponses = this.$config.getParamResponses();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(paramResponses, 10)), 16));
                    for (Object obj2 : paramResponses) {
                        linkedHashMap.put(((OptionPricingParams) obj2).getOptionId(), obj2);
                    }
                    return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default(optionsPortfolioRiskAnalyzerPositionDataState, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, 7167, null);
                }
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$8", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {946}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$8 */
    static final class C235638 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<List<UiAggregateOptionPositionFull>> $aggregateOptionPositionFlow;
        int label;
        final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C235638(Flow<? extends List<UiAggregateOptionPositionFull>> flow, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super C235638> continuation) {
            super(2, continuation);
            this.$aggregateOptionPositionFlow = flow;
            this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235638(this.$aggregateOptionPositionFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235638) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(this.$aggregateOptionPositionFlow, new C23548x12da50d9(null, this.this$0));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "expirationTimes", "", "Ljava/util/UUID;", "Lkotlinx/datetime/Instant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$8$2", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$8$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends Instant>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends Instant> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<UUID, Instant>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<UUID, Instant> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$8$2$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$8$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
                final /* synthetic */ Map<UUID, Instant> $expirationTimes;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Map<UUID, Instant> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$expirationTimes = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$expirationTimes, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
                    return ((AnonymousClass1) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default((OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0, null, null, null, null, null, this.$expirationTimes, null, null, null, null, null, null, null, 8159, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$9", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {956}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$9 */
    static final class C235649 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $underlyingId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C235649(UUID uuid, Continuation<? super C235649> continuation) {
            super(2, continuation);
            this.$underlyingId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsPortfolioRiskAnalyzerPositionDuxo.this.new C235649(this.$underlyingId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C235649) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<UiOptionInstrumentPosition>> flowAsFlow = OptionsPortfolioRiskAnalyzerPositionDuxo.this.optionPositionStore.getStreamUiOptionPositionsByUnderlyingId().asFlow(Tuples4.m3642to(((Args) OptionsPortfolioRiskAnalyzerPositionDuxo.INSTANCE.getArgs((HasArgs) OptionsPortfolioRiskAnalyzerPositionDuxo.this)).getAccountNumber(), this.$underlyingId));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsPortfolioRiskAnalyzerPositionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionPositions", "", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$9$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UiOptionInstrumentPosition>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiOptionInstrumentPosition> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiOptionInstrumentPosition>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiOptionInstrumentPosition> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj2 : list) {
                    linkedHashMap.put(((UiOptionInstrumentPosition) obj2).getOptionInstrumentPosition().getId(), obj2);
                }
                this.this$0.applyMutation(new C503401(linkedHashMap, null));
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$9$1$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$bind$9$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503401 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState>, Object> {
                final /* synthetic */ Map<UUID, UiOptionInstrumentPosition> $optionPositionIdToPositionsMap;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503401(Map<UUID, UiOptionInstrumentPosition> map, Continuation<? super C503401> continuation) {
                    super(2, continuation);
                    this.$optionPositionIdToPositionsMap = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503401 c503401 = new C503401(this.$optionPositionIdToPositionsMap, continuation);
                    c503401.L$0 = obj;
                    return c503401;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerPositionDataState optionsPortfolioRiskAnalyzerPositionDataState, Continuation<? super OptionsPortfolioRiskAnalyzerPositionDataState> continuation) {
                    return ((C503401) create(optionsPortfolioRiskAnalyzerPositionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerPositionDataState.copy$default((OptionsPortfolioRiskAnalyzerPositionDataState) this.L$0, null, null, null, null, null, null, this.$optionPositionIdToPositionsMap, null, null, null, null, null, null, 8127, null);
                }
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.accountNumber, ((Args) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public Args(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo$Args;", "<init>", "()V", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<OptionsPortfolioRiskAnalyzerPositionDuxo, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(SavedStateHandle savedStateHandle) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, optionsPortfolioRiskAnalyzerPositionDuxo);
        }
    }
}
