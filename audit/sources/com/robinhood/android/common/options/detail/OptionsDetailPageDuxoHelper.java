package com.robinhood.android.common.options.detail;

import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexHistoricals;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionHistoricalChartStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionRollingStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.utils.Optional;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: OptionsDetailPageDuxoHelper.kt */
@Metadata(m3635d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001aw\u0010\u0014\u001a2\u0012.\u0012,\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00010\u00010\u00002\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00010\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ak\u0010\u0017\u001a,\u0012(\u0012&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00010\u00010\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00010\u0000¢\u0006\u0004\b\u0017\u0010\u0015\u001ag\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r\u0012\u0004\u0012\u00020\u00030\u00010\u000020\u0010\u0018\u001a,\u0012(\u0012&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00010\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001f\u001aG\u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\r\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"\u001aG\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\r\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b$\u0010\"\u001am\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\r\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002$\u0010%\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*\u001aU\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\r\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100\u001a\u0087\u0001\u00108\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\r\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b8\u00109\u001a_\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u001e\u0010:\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\r\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u001e\u0010;\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\r\u0012\u0004\u0012\u00020\u00030\u00010\u0000¢\u0006\u0004\b<\u0010\u0015\u001aA\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@0\u00002\u001e\u0010=\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010?\u001a\u00020>¢\u0006\u0004\bB\u0010C\u001aG\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u001e\u0010=\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010?\u001a\u00020>¢\u0006\u0004\bD\u0010C\u001aA\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bF\u0010\"\u001aA\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bL\u0010M\u001aO\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00010\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010Q\u001ac\u0010T\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010S\u0012\u0004\u0012\u00020\u00030\u00010\u00002*\u0010R\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\r\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0004\u0012\u00020\u00030\u00010\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\bT\u00100\u001a)\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bX\u0010Y\u001aC\u0010_\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010^\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b_\u0010`\u001aA\u0010a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\ba\u0010b\u001a?\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010c*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010d\u001a\u00020\u00032\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030e¢\u0006\u0004\bg\u0010h\u001ai\u0010k\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00010\u0000\"\u0004\b\u0000\u0010c\"\u0004\b\u0001\u0010i*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00010\u00002\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030e2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030e¢\u0006\u0004\bk\u0010l¨\u0006m"}, m3636d2 = {"Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "", "strategyCodeToIndexFlow", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionStrategyInfoStore", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "getUiStrategyInfoToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;)Lkotlinx/coroutines/flow/Flow;", "uiStrategyInfoToIndexFlow", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionChainStore", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionUnderlier;", "getUiOptionUnderlierToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/OptionChainStore;)Lkotlinx/coroutines/flow/Flow;", "optionUnderlierFlow", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "activeDisplaySpanFlow", "getOptionUnderlierWithActiveSpanFlow", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/OptionUnderlying;", "getOptionUnderlyingWithActiveSpanFlow", "optionUnderlyingWithActiveSpanFlow", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/indexes/models/db/IndexHistoricals;", "getIndexHistoricalToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/android/indexes/store/IndexStore;Lj$/time/Clock;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "getIndexCloseValueToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/android/indexes/store/IndexStore;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/indexes/models/db/Index;", "getIndexInstrumentToIndexFlow", "accountNumberToStrategyCodeToIndexFlow", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "getUiAggregateOptionPositionToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;)Lkotlinx/coroutines/flow/Flow;", "accountNumberFlow", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "getUiOptionInstrumentPositionToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;)Lkotlinx/coroutines/flow/Flow;", "", "hasRealPositionToIndexFlow", "Lcom/robinhood/models/db/Account;", "accountToIndexFlow", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionsWatchlistStore", "Lcom/robinhood/models/db/CuratedListItem;", "getCuratedListItemToUiStrategyInfoToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;)Lkotlinx/coroutines/flow/Flow;", "uiAggregateOptionPositionToIndexFlow", "uiOptionInstrumentPositionToIndexFlow", "getHasRealPositionToIndexFlow", "optionUnderlierToIndexFlow", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "", "Lcom/robinhood/models/db/Quote;", "getEquityQuotePollingFlow", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/QuoteStore;)Lkotlinx/coroutines/flow/Flow;", "getEquityQuoteToIndexFlow", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "getIndexValueToIndexFlow", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore$Request;", "optionHistoricalChartStoreRequestToIndexFlow", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "optionHistoricalChartStore", "Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "getHistoricalChartToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionRollingStore", "getShowRollingActionItemToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/OptionRollingStore;)Lkotlinx/coroutines/flow/Flow;", "curatedListItemToUiStrategyInfoToIndexFlow", "Lcom/robinhood/models/db/OptionInstrumentPosition;", "getOppositePositionFromWatchlistToIndexFlow", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/models/db/OptionSettings;", "getOptionSettingsFlow", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "optionsAccountSwitcherIdToIndexFlow", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "getOptionsAccountSwitcherToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;)Lkotlinx/coroutines/flow/Flow;", "getIsWatchingToIndexFlow", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;)Lkotlinx/coroutines/flow/Flow;", "T", "index1", "Lkotlin/Function1;", "index2Getter", "filterSameIndex", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "P", "index1Getter", "filterPairSameIndex", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionsDetailPageDuxoHelper {
    public static final Flow<Tuples2<UiOptionStrategyInfo, Integer>> getUiStrategyInfoToIndexFlow(Flow<Tuples2<String, Integer>> strategyCodeToIndexFlow, OptionStrategyInfoStore optionStrategyInfoStore) {
        Intrinsics.checkNotNullParameter(strategyCodeToIndexFlow, "strategyCodeToIndexFlow");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(strategyCodeToIndexFlow), new C11356xf397789d(null, optionStrategyInfoStore)));
    }

    public static final Flow<Tuples2<Tuples2<Optional<UiOptionUnderlier>, Integer>, Tuples2<DisplaySpan, Integer>>> getOptionUnderlierWithActiveSpanFlow(Flow<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>> optionUnderlierFlow, Flow<? extends Tuples2<? extends DisplaySpan, Integer>> activeDisplaySpanFlow) {
        Intrinsics.checkNotNullParameter(optionUnderlierFlow, "optionUnderlierFlow");
        Intrinsics.checkNotNullParameter(activeDisplaySpanFlow, "activeDisplaySpanFlow");
        return FlowKt.distinctUntilChanged(filterPairSameIndex(Operators.combine(optionUnderlierFlow, activeDisplaySpanFlow), new Function1() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(OptionsDetailPageDuxoHelper.getOptionUnderlierWithActiveSpanFlow$lambda$5((Tuples2) obj));
            }
        }, new Function1() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(OptionsDetailPageDuxoHelper.getOptionUnderlierWithActiveSpanFlow$lambda$6((Tuples2) obj));
            }
        }));
    }

    public static final <T, P> Flow<Tuples2<T, P>> filterPairSameIndex(final Flow<? extends Tuples2<? extends T, ? extends P>> flow, final Function1<? super T, Integer> index1Getter, final Function1<? super P, Integer> index2Getter) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(index1Getter, "index1Getter");
        Intrinsics.checkNotNullParameter(index2Getter, "index2Getter");
        return new Flow<Tuples2<? extends T, ? extends P>>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$filterPairSameIndex$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, index1Getter, index2Getter), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$filterPairSameIndex$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Function1 $index1Getter$inlined;
                final /* synthetic */ Function1 $index2Getter$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$filterPairSameIndex$$inlined$filter$1$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$filterPairSameIndex$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(FlowCollector flowCollector, Function1 function1, Function1 function12) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$index1Getter$inlined = function1;
                    this.$index2Getter$inlined = function12;
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        if (((Number) this.$index1Getter$inlined.invoke(tuples2.getFirst())).intValue() == ((Number) this.$index2Getter$inlined.invoke(tuples2.getSecond())).intValue()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        };
    }

    public static final <T> Flow<T> filterSameIndex(final Flow<? extends T> flow, final int i, final Function1<? super T, Integer> index2Getter) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(index2Getter, "index2Getter");
        return new Flow<T>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$filterSameIndex$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C113142(flowCollector, i, index2Getter), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$filterSameIndex$$inlined$filter$1$2 */
            public static final class C113142<T> implements FlowCollector {
                final /* synthetic */ int $index1$inlined;
                final /* synthetic */ Function1 $index2Getter$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$filterSameIndex$$inlined$filter$1$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$filterSameIndex$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C113142.this.emit(null, this);
                    }
                }

                public C113142(FlowCollector flowCollector, int i, Function1 function1) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$index1$inlined = i;
                    this.$index2Getter$inlined = function1;
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
                        if (this.$index1$inlined == ((Number) this.$index2Getter$inlined.invoke(obj)).intValue()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        };
    }

    public static final Flow<Tuples2<Boolean, Integer>> getHasRealPositionToIndexFlow(final Flow<? extends Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>> uiAggregateOptionPositionToIndexFlow, final Flow<? extends Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>> uiOptionInstrumentPositionToIndexFlow) {
        Intrinsics.checkNotNullParameter(uiAggregateOptionPositionToIndexFlow, "uiAggregateOptionPositionToIndexFlow");
        Intrinsics.checkNotNullParameter(uiOptionInstrumentPositionToIndexFlow, "uiOptionInstrumentPositionToIndexFlow");
        return FlowKt.merge(new Flow<Tuples2<? extends Boolean, ? extends Integer>>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getHasRealPositionToIndexFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends Boolean, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = uiAggregateOptionPositionToIndexFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getHasRealPositionToIndexFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getHasRealPositionToIndexFlow$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getHasRealPositionToIndexFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        Optional optional = (Optional) tuples2.component1();
                        int iIntValue = ((Number) tuples2.component2()).intValue();
                        UiAggregateOptionPositionFull uiAggregateOptionPositionFull = (UiAggregateOptionPositionFull) optional.getOrNull();
                        Tuples2 tuples2M3642to = Tuples4.m3642to(boxing.boxBoolean((uiAggregateOptionPositionFull == null || uiAggregateOptionPositionFull.getQuantity().compareTo(BigDecimal.ZERO) == 0) ? false : true), boxing.boxInt(iIntValue));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
        }, new Flow<Tuples2<? extends Boolean, ? extends Integer>>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getHasRealPositionToIndexFlow$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends Boolean, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = uiOptionInstrumentPositionToIndexFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getHasRealPositionToIndexFlow$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getHasRealPositionToIndexFlow$$inlined$map$2$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getHasRealPositionToIndexFlow$$inlined$map$2$2$1, reason: invalid class name */
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        Optional optional = (Optional) tuples2.component1();
                        int iIntValue = ((Number) tuples2.component2()).intValue();
                        UiOptionInstrumentPosition uiOptionInstrumentPosition = (UiOptionInstrumentPosition) optional.getOrNull();
                        Tuples2 tuples2M3642to = Tuples4.m3642to(boxing.boxBoolean((uiOptionInstrumentPosition == null || uiOptionInstrumentPosition.getOptionInstrumentPosition().getQuantity().compareTo(BigDecimal.ZERO) == 0) ? false : true), boxing.boxInt(iIntValue));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
        });
    }

    public static final Flow<Tuples2<Optional<IndexCloseValue>, Integer>> getIndexCloseValueToIndexFlow(final Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow, IndexStore indexStore) {
        Intrinsics.checkNotNullParameter(uiStrategyInfoToIndexFlow, "uiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(new Flow<Tuples2<? extends OptionUnderlying, ? extends Integer>>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexCloseValueToIndexFlow$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends OptionUnderlying, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = uiStrategyInfoToIndexFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexCloseValueToIndexFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexCloseValueToIndexFlow$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {53}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getIndexCloseValueToIndexFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) tuples2.component1();
                        int iIntValue = ((Number) tuples2.component2()).intValue();
                        OptionUnderlying optionUnderlying = (OptionUnderlying) CollectionsKt.firstOrNull((List) uiOptionStrategyInfo.getUnderlyings());
                        Tuples2 tuples2M3642to = optionUnderlying == null ? null : Tuples4.m3642to(optionUnderlying, boxing.boxInt(iIntValue));
                        if (tuples2M3642to != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        }, new C11326x8ab797f5(null, indexStore)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getOptionUnderlierWithActiveSpanFlow$lambda$5(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getSecond()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getOptionUnderlierWithActiveSpanFlow$lambda$6(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getSecond()).intValue();
    }

    public static final Flow<Tuples2<Tuples2<OptionUnderlying, Integer>, Tuples2<DisplaySpan, Integer>>> getOptionUnderlyingWithActiveSpanFlow(final Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow, Flow<? extends Tuples2<? extends DisplaySpan, Integer>> activeDisplaySpanFlow) {
        Intrinsics.checkNotNullParameter(uiStrategyInfoToIndexFlow, "uiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(activeDisplaySpanFlow, "activeDisplaySpanFlow");
        return FlowKt.distinctUntilChanged(filterPairSameIndex(Operators.combine(new Flow<Tuples2<? extends OptionUnderlying, ? extends Integer>>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getOptionUnderlyingWithActiveSpanFlow$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends OptionUnderlying, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = uiStrategyInfoToIndexFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getOptionUnderlyingWithActiveSpanFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getOptionUnderlyingWithActiveSpanFlow$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {53}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getOptionUnderlyingWithActiveSpanFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) tuples2.component1();
                        int iIntValue = ((Number) tuples2.component2()).intValue();
                        OptionUnderlying optionUnderlying = (OptionUnderlying) CollectionsKt.firstOrNull((List) uiOptionStrategyInfo.getUnderlyings());
                        Tuples2 tuples2M3642to = optionUnderlying == null ? null : Tuples4.m3642to(optionUnderlying, boxing.boxInt(iIntValue));
                        if (tuples2M3642to != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        }, activeDisplaySpanFlow), new Function1() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(OptionsDetailPageDuxoHelper.getOptionUnderlyingWithActiveSpanFlow$lambda$8((Tuples2) obj));
            }
        }, new Function1() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(OptionsDetailPageDuxoHelper.getOptionUnderlyingWithActiveSpanFlow$lambda$9((Tuples2) obj));
            }
        }));
    }

    public static final Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> getUiOptionInstrumentPositionToIndexFlow(final Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow, Flow<String> accountNumberFlow, OptionPositionStore optionPositionStore) {
        Intrinsics.checkNotNullParameter(uiStrategyInfoToIndexFlow, "uiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(accountNumberFlow, "accountNumberFlow");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends UUID, ? extends Integer>>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getUiOptionInstrumentPositionToIndexFlow$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends UUID, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = uiStrategyInfoToIndexFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getUiOptionInstrumentPositionToIndexFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getUiOptionInstrumentPositionToIndexFlow$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getUiOptionInstrumentPositionToIndexFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        Tuples2 tuples2M3642to = Tuples4.m3642to(((UiOptionStrategyInfo) tuples2.component1()).getLegs().get(0).getOptionInstrument().getId(), boxing.boxInt(((Number) tuples2.component2()).intValue()));
                        if (tuples2M3642to != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        }), new C11350x2d7bae1(null, accountNumberFlow, optionPositionStore)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getOptionUnderlyingWithActiveSpanFlow$lambda$8(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getSecond()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getOptionUnderlyingWithActiveSpanFlow$lambda$9(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getSecond()).intValue();
    }

    public static final Flow<Iterable<Quote>> getEquityQuotePollingFlow(Flow<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>> optionUnderlierToIndexFlow, QuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(optionUnderlierToIndexFlow, "optionUnderlierToIndexFlow");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        return FlowKt.transformLatest(optionUnderlierToIndexFlow, new C11320xb4aa8b35(null, quoteStore));
    }

    public static final Flow<Tuples2<Quote, Integer>> getEquityQuoteToIndexFlow(Flow<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>> optionUnderlierToIndexFlow, QuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(optionUnderlierToIndexFlow, "optionUnderlierToIndexFlow");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        return FlowKt.transformLatest(optionUnderlierToIndexFlow, new C11321xcc563061(null, quoteStore));
    }

    public static final Flow<Tuples2<Optional<IndexHistoricals>, Integer>> getIndexHistoricalToIndexFlow(Flow<? extends Tuples2<Tuples2<OptionUnderlying, Integer>, ? extends Tuples2<? extends DisplaySpan, Integer>>> optionUnderlyingWithActiveSpanFlow, IndexStore indexStore, Clock clock) {
        Intrinsics.checkNotNullParameter(optionUnderlyingWithActiveSpanFlow, "optionUnderlyingWithActiveSpanFlow");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(optionUnderlyingWithActiveSpanFlow, new C11329x8da051e6(null, clock, indexStore)));
    }

    public static final Flow<Tuples2<Optional<Index>, Integer>> getIndexInstrumentToIndexFlow(Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow, IndexStore indexStore) {
        Intrinsics.checkNotNullParameter(uiStrategyInfoToIndexFlow, "uiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(uiStrategyInfoToIndexFlow, new C11331x85360e83(null, indexStore)));
    }

    public static final Flow<Tuples2<IndexValue, Integer>> getIndexValueToIndexFlow(Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow, IndexStore indexStore) {
        Intrinsics.checkNotNullParameter(uiStrategyInfoToIndexFlow, "uiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        return FlowKt.transformLatest(uiStrategyInfoToIndexFlow, new C11333x546da767(null, indexStore));
    }

    public static final Flow<Tuples2<OptionInstrumentPosition, Integer>> getOppositePositionFromWatchlistToIndexFlow(Flow<? extends Tuples2<? extends Tuples2<? extends Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> curatedListItemToUiStrategyInfoToIndexFlow, Flow<String> accountNumberFlow, OptionPositionStore optionPositionStore) {
        Intrinsics.checkNotNullParameter(curatedListItemToUiStrategyInfoToIndexFlow, "curatedListItemToUiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(accountNumberFlow, "accountNumberFlow");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        return FlowKt.transformLatest(FlowKt.transformLatest(curatedListItemToUiStrategyInfoToIndexFlow, new C11337x19bf937d(null, accountNumberFlow)), new C11338x19bf937e(null, optionPositionStore));
    }

    public static final Flow<Tuples2<Boolean, Integer>> getShowRollingActionItemToIndexFlow(Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow, Flow<String> accountNumberFlow, OptionRollingStore optionRollingStore) {
        Intrinsics.checkNotNullParameter(uiStrategyInfoToIndexFlow, "uiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(accountNumberFlow, "accountNumberFlow");
        Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(uiStrategyInfoToIndexFlow, new C11344x3f8f647b(null, accountNumberFlow))), new C11345x3f8f647c(null, optionRollingStore));
    }

    public static final Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> getUiAggregateOptionPositionToIndexFlow(Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow, Flow<Tuples2<Tuples2<String, String>, Integer>> accountNumberToStrategyCodeToIndexFlow, AggregateOptionPositionStore aggregateOptionPositionStore) {
        Intrinsics.checkNotNullParameter(uiStrategyInfoToIndexFlow, "uiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(accountNumberToStrategyCodeToIndexFlow, "accountNumberToStrategyCodeToIndexFlow");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.transformLatest(uiStrategyInfoToIndexFlow, new C11347xe926b613(null, accountNumberToStrategyCodeToIndexFlow)), new C11348xe926b614(null, aggregateOptionPositionStore)));
    }

    public static final Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> getUiOptionUnderlierToIndexFlow(Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow, OptionChainStore optionChainStore) {
        Intrinsics.checkNotNullParameter(uiStrategyInfoToIndexFlow, "uiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(uiStrategyInfoToIndexFlow, new C11354x9c0e0b83(null, optionChainStore)));
    }

    public static final Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> getCuratedListItemToUiStrategyInfoToIndexFlow(Flow<Tuples2<Boolean, Integer>> hasRealPositionToIndexFlow, Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow, Flow<Tuples2<Account, Integer>> accountToIndexFlow, OptionsWatchlistStore optionsWatchlistStore) {
        Intrinsics.checkNotNullParameter(hasRealPositionToIndexFlow, "hasRealPositionToIndexFlow");
        Intrinsics.checkNotNullParameter(uiStrategyInfoToIndexFlow, "uiStrategyInfoToIndexFlow");
        Intrinsics.checkNotNullParameter(accountToIndexFlow, "accountToIndexFlow");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        final Flow flowFilterPairSameIndex = filterPairSameIndex(Operators.combine(hasRealPositionToIndexFlow, uiStrategyInfoToIndexFlow), new Function1() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(OptionsDetailPageDuxoHelper.getCuratedListItemToUiStrategyInfoToIndexFlow$lambda$24((Tuples2) obj));
            }
        }, new Function1() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(OptionsDetailPageDuxoHelper.getCuratedListItemToUiStrategyInfoToIndexFlow$lambda$25((Tuples2) obj));
            }
        });
        final Flow<Tuples2<? extends Tuples2<? extends Boolean, ? extends Integer>, ? extends Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>>> flow = new Flow<Tuples2<? extends Tuples2<? extends Boolean, ? extends Integer>, ? extends Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>>>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends Tuples2<? extends Boolean, ? extends Integer>, ? extends Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>>> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterPairSameIndex.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$filter$1$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        if (!((Boolean) ((Tuples2) ((Tuples2) obj).component1()).getFirst()).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        };
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(new Flow<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        Tuples2 tuples2 = (Tuples2) ((Tuples2) obj).component2();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tuples2, anonymousClass1) == coroutine_suspended) {
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
        }, new C11316x46245f5d(null, accountToIndexFlow))), new C11317x46245f5e(null, optionsWatchlistStore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getCuratedListItemToUiStrategyInfoToIndexFlow$lambda$24(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getSecond()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getCuratedListItemToUiStrategyInfoToIndexFlow$lambda$25(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getSecond()).intValue();
    }

    public static final Flow<Tuples2<OptionHistoricalChartModel, Integer>> getHistoricalChartToIndexFlow(Flow<Tuples2<OptionHistoricalChartStore.Request, Integer>> optionHistoricalChartStoreRequestToIndexFlow, OptionHistoricalChartStore optionHistoricalChartStore) {
        Intrinsics.checkNotNullParameter(optionHistoricalChartStoreRequestToIndexFlow, "optionHistoricalChartStoreRequestToIndexFlow");
        Intrinsics.checkNotNullParameter(optionHistoricalChartStore, "optionHistoricalChartStore");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(optionHistoricalChartStoreRequestToIndexFlow), new C11324x4a682bde(null, optionHistoricalChartStore));
    }

    public static final Flow<OptionSettings> getOptionSettingsFlow(Flow<String> accountNumberFlow, OptionSettingsStore optionSettingsStore) {
        Intrinsics.checkNotNullParameter(accountNumberFlow, "accountNumberFlow");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(accountNumberFlow), new C11341x19b09489(null, optionSettingsStore));
    }

    public static final Flow<Tuples2<OptionsAccountSwitcher, Integer>> getOptionsAccountSwitcherToIndexFlow(Flow<? extends Tuples2<? extends OptionsAccountSwitcherId, Integer>> optionsAccountSwitcherIdToIndexFlow, OptionAccountSwitcherStore optionAccountSwitcherStore) {
        Intrinsics.checkNotNullParameter(optionsAccountSwitcherIdToIndexFlow, "optionsAccountSwitcherIdToIndexFlow");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(optionsAccountSwitcherIdToIndexFlow), new C11343x62b54258(null, optionAccountSwitcherStore));
    }

    public static final Flow<Tuples2<Boolean, Integer>> getIsWatchingToIndexFlow(Flow<Tuples2<String, Integer>> strategyCodeToIndexFlow, OptionsWatchlistStore optionsWatchlistStore) {
        Intrinsics.checkNotNullParameter(strategyCodeToIndexFlow, "strategyCodeToIndexFlow");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(strategyCodeToIndexFlow), new C11335x69f3c8a5(null, optionsWatchlistStore));
    }
}
