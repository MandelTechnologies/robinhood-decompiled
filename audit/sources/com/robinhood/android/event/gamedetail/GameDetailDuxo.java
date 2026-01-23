package com.robinhood.android.event.gamedetail;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.gamedetail.BottomSheetSelection;
import com.robinhood.android.event.gamedetail.GameDetailEvent;
import com.robinhood.android.event.gamedetail.builders.AboutEventType;
import com.robinhood.android.event.gamedetail.builders.BuildGameDetailTitle;
import com.robinhood.android.event.gamedetail.builders.ContractElementExt;
import com.robinhood.android.event.gamedetail.builders.TitleState;
import com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionState;
import com.robinhood.android.event.gamedetail.combostates.GameDetailSelectionStateProvider;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.GameDetailFragmentKeyInternalOnly;
import com.robinhood.android.eventcontracts.experiments.EventContractsSportsExperiment;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment2;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment3;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment5;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment6;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment7;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.eventcontracts.sharedeventui.animation.BuildOpenInterestAggregatedDeltaMapping;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3;
import com.robinhood.android.eventcontracts.sharedeventui.experiments.DefaultSpanExperiment;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.lib.futures.trade.StreamEventMarketSessionChangeStateUseCase;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventTimeline;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup3;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup5;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroupSectionWithContractGroup;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.models.event.p186db.predictionmarkets.StrikeContract;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.store.event.ContractDetailsDisplayStore;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.store.event.EventStateStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.event.StrikeContractStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.shareprefs.GameDetailPagePreferences;
import com.robinhood.utils.Optional;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: GameDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 «\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002«\u0001B\u0091\u0001\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J,\u00103\u001a\u0002022\u001b\u00101\u001a\u0017\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0006\u0012\u0004\u0018\u00010/0.¢\u0006\u0002\b0H\u0002¢\u0006\u0004\b3\u00104JL\u0010>\u001a\u00020=2\u0006\u00106\u001a\u0002052\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020908072\u0018\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020;0807H\u0082@¢\u0006\u0004\b>\u0010?JC\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C072\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@2\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002090807H\u0002¢\u0006\u0004\bE\u0010FJ7\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020G08072\u0006\u00106\u001a\u0002052\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A07H\u0002¢\u0006\u0004\bH\u0010IJ=\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C072\u0006\u0010J\u001a\u0002052\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002090807H\u0002¢\u0006\u0004\bK\u0010IJL\u0010P\u001a\u00020=2\u0012\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L072\f\u0010O\u001a\b\u0012\u0004\u0012\u000205072\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002090807H\u0082@¢\u0006\u0004\bP\u0010QJF\u0010V\u001a\u00020=2\u0012\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L072\u0012\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050R072\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T07H\u0082@¢\u0006\u0004\bV\u0010QJ\u000f\u0010W\u001a\u000202H\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010[\u001a\u0002022\b\u0010Z\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u0002022\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u0002022\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u0002022\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\be\u0010dJ\u0019\u0010f\u001a\u0002022\b\u0010J\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u0002022\u0006\u0010h\u001a\u00020DH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u000202H\u0016¢\u0006\u0004\bk\u0010XJ\u0019\u0010n\u001a\u0002022\b\u0010m\u001a\u0004\u0018\u00010lH\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u000202H\u0016¢\u0006\u0004\bp\u0010XJ\u0017\u0010s\u001a\u0002022\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u000202H\u0016¢\u0006\u0004\bu\u0010XJ\u0017\u0010x\u001a\u0002022\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u000202H\u0016¢\u0006\u0004\bz\u0010XJ\u0017\u0010|\u001a\u0002022\u0006\u0010{\u001a\u00020TH\u0016¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u000202H\u0016¢\u0006\u0004\b~\u0010XJ$\u0010\u0082\u0001\u001a\u0002022\u0006\u0010\u007f\u001a\u00020D2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J$\u0010\u0086\u0001\u001a\u0002022\u0006\u0010\u007f\u001a\u00020D2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J$\u0010\u0088\u0001\u001a\u0002022\u0006\u0010\u007f\u001a\u00020D2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J\u0019\u0010\u0089\u0001\u001a\u0002022\u0006\u0010\u007f\u001a\u00020DH\u0016¢\u0006\u0005\b\u0089\u0001\u0010jJ\u0011\u0010\u008a\u0001\u001a\u000202H\u0016¢\u0006\u0005\b\u008a\u0001\u0010XJ\u0019\u0010\u008b\u0001\u001a\u0002022\u0006\u0010J\u001a\u000205H\u0016¢\u0006\u0005\b\u008b\u0001\u0010gJ\u0019\u0010\u008c\u0001\u001a\u0002022\u0006\u0010\u007f\u001a\u00020DH\u0016¢\u0006\u0005\b\u008c\u0001\u0010jJ\u0019\u0010\u008d\u0001\u001a\u0002022\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0005\b\u008d\u0001\u0010tJ\u0011\u0010\u008e\u0001\u001a\u000202H\u0016¢\u0006\u0005\b\u008e\u0001\u0010XJ\u0011\u0010\u008f\u0001\u001a\u000202H\u0016¢\u0006\u0005\b\u008f\u0001\u0010XJ\u001a\u0010\u0091\u0001\u001a\u0002022\u0007\u0010\u0090\u0001\u001a\u00020DH\u0016¢\u0006\u0005\b\u0091\u0001\u0010jJ\u0011\u0010\u0092\u0001\u001a\u000202H\u0016¢\u0006\u0005\b\u0092\u0001\u0010XR\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0093\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0094\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0095\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0096\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0097\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0098\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u0099\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u009a\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u009b\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u009c\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u009d\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u009e\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u009f\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010 \u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010¡\u0001R\u001d\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b)\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¦\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R \u0010©\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010/0¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001¨\u0006¬\u0001"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState;", "Lcom/robinhood/android/event/gamedetail/GameDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/ChartCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpV1SelectionCallbacks;", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpCommonCallbacks;", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "futuresChartsServiceManager", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventOrderStore;", "eventOrderStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventStateStore;", "eventStateStore", "Lcom/robinhood/store/event/StrikeContractStore;", "strikeContractStore", "Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "contractDetailsDisplayStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "streamEventMarketSessionChangeState", "Lcom/robinhood/store/shareprefs/GameDetailPagePreferences;", "gameDetailPagePreferences", "Lcom/robinhood/android/event/gamedetail/builders/StreamLiveDataTitleUseCase;", "streamLiveDateTitle", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "streamComboQuoteUseCase", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/EventContractPositionStore;Lcom/robinhood/store/event/EventOrderStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/event/EventStateStore;Lcom/robinhood/store/event/StrikeContractStore;Lcom/robinhood/store/event/ContractDetailsDisplayStore;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;Lcom/robinhood/store/shareprefs/GameDetailPagePreferences;Lcom/robinhood/android/event/gamedetail/builders/StreamLiveDataTitleUseCase;Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "Lkotlin/Function1;", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;", "Lkotlin/ExtensionFunctionType;", "mutation", "", "updateBottomSheetSelection", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/util/UUID;", "eventId", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "contractIdToPositionsForGameFlow", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "allContractsFlow", "Lkotlinx/coroutines/Job;", "streamComboRelatedStates", "(Ljava/util/UUID;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;", "selectionStates", "", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "streamAllRelatedContractIdWithSidesForSelections", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/event/db/predictionmarkets/StrikeContract;", "streamStrikeContractsForSelections", "(Ljava/util/UUID;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "contractId", "streamPositionContractIdWithSides", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "optionalSwapAccountFlow", "eventIdFlow", "streamOnBottomSheetSelection", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "contractGroupIdsFlow", "", "showAmericanOddsFlow", "streamEstimatedFeesForAmericanOdds", "onCreate", "()V", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "point", "onChartScrubbed", "(Lcom/robinhood/models/serverdriven/experimental/api/Point;)V", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "span", "onSpanSelected", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)V", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "contractOptionData", "onContractSelected", "(Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;)V", "onContractUnselected", "onPositionSelected", "(Ljava/util/UUID;)V", "contractIdWithSide", "onYesNoToggle", "(Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;)V", "onDeleteClick", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "contractElement", "onWheelPickerItemSelected", "(Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;)V", "onConfirmAlternativeStrike", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "onPropsCategoryClick", "(I)V", "onPropsViewAllToggle", "Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;", "aboutEventType", "onAboutEventTypeSelected", "(Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;)V", "onOrderSubmitted", "isChecked", "onAmericanOddsChanged", "(Z)V", "onShowDisabledTradeButtonMessage", "key", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "newSide", "updateContractSelectionSide", "(Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;Lcom/robinhood/android/eventcontracts/models/event/ContractSide;)V", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;", "columnType", "addContractSelection", "(Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;Lcom/robinhood/android/models/event/db/predictionmarkets/ContractColumnType;)V", "addContractSelectionAndOpenPicker", "removeContractSelection", "clearSelections", "selectPosition", "openStrikePicker", "selectPropsCategory", "toggleViewAllProps", "dismissWheelPicker", "newStrike", "confirmAlternativeStrike", "resetEmptyState", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "Lcom/robinhood/store/event/EventStore;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "Lcom/robinhood/store/event/EventContractPositionStore;", "Lcom/robinhood/store/event/EventOrderStore;", "Lcom/robinhood/store/event/EventMarketdataStore;", "Lcom/robinhood/store/event/EventStateStore;", "Lcom/robinhood/store/event/StrikeContractStore;", "Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "Lcom/robinhood/experiments/ExperimentsProvider;", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "Lcom/robinhood/store/shareprefs/GameDetailPagePreferences;", "Lcom/robinhood/android/event/gamedetail/builders/StreamLiveDataTitleUseCase;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/StreamComboQuoteUseCase;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionStateProvider;", "selectionStateProvider", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionStateProvider;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "bottomSheetSelectionStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Companion", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GameDetailDuxo extends BaseDuxo3<GameDetailDataState, GameDetailViewState, GameDetailEvent> implements HasSavedState, GameDetailComboCallbacks, ChartCallbacks, GdpV1SelectionCallbacks, GdpCommonCallbacks {
    private final StateFlow2<BottomSheetSelection> bottomSheetSelectionStateFlow;
    private final Clock clock;
    private final ContractDetailsDisplayStore contractDetailsDisplayStore;
    private final EventContractPositionStore eventContractPositionStore;
    private final EventMarketdataStore eventMarketdataStore;
    private final EventOrderStore eventOrderStore;
    private final EventStateStore eventStateStore;
    private final EventStore eventStore;
    private final ExperimentsProvider experimentsProvider;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesChartsServiceManager futuresChartsServiceManager;
    private final GameDetailPagePreferences gameDetailPagePreferences;
    private final SavedStateHandle savedStateHandle;
    private final GameDetailSelectionStateProvider selectionStateProvider;
    private final StreamComboQuoteUseCase streamComboQuoteUseCase;
    private final StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeState;
    private final BuildGameDetailTitle streamLiveDateTitle;
    private final StrikeContractStore strikeContractStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetSelection onContractUnselected$lambda$1(BottomSheetSelection bottomSheetSelection) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetSelection onDeleteClick$lambda$4(BottomSheetSelection bottomSheetSelection) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetSelection onOrderSubmitted$lambda$9(BottomSheetSelection bottomSheetSelection) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetSelection onPropsCategoryClick$lambda$7(BottomSheetSelection bottomSheetSelection) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<ContractIdWithSide>> streamPositionContractIdWithSides(final UUID contractId, final Flow<? extends Map<UUID, UiEventContractPosition>> contractIdToPositionsForGameFlow) {
        return FlowKt.mapLatest(FlowKt.distinctUntilChanged(new Flow<UiEventContractPosition>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamPositionContractIdWithSides$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UiEventContractPosition> flowCollector, Continuation continuation) {
                Object objCollect = contractIdToPositionsForGameFlow.collect(new C162632(flowCollector, contractId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamPositionContractIdWithSides$$inlined$map$1$2 */
            public static final class C162632<T> implements FlowCollector {
                final /* synthetic */ UUID $contractId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamPositionContractIdWithSides$$inlined$map$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamPositionContractIdWithSides$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C162632.this.emit(null, this);
                    }
                }

                public C162632(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$contractId$inlined = uuid;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = ((Map) obj).get(this.$contractId$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
        }), new C162802(contractId, null));
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailDuxo(FuturesChartsServiceManager futuresChartsServiceManager, EventStore eventStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, EventOrderStore eventOrderStore, EventMarketdataStore eventMarketdataStore, EventStateStore eventStateStore, StrikeContractStore strikeContractStore, ContractDetailsDisplayStore contractDetailsDisplayStore, ExperimentsProvider experimentsProvider, StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeState, GameDetailPagePreferences gameDetailPagePreferences, BuildGameDetailTitle streamLiveDateTitle, StreamComboQuoteUseCase streamComboQuoteUseCase, Clock clock, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new GameDetailDataState(((GameDetailFragmentKeyInternalOnly) INSTANCE.getArgs(savedStateHandle)).getSupportCombos(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, false, false, false, false, gameDetailPagePreferences.getAmericanOddsPref(), null, -2, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null), GameDetailStateProvider.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
        Intrinsics.checkNotNullParameter(strikeContractStore, "strikeContractStore");
        Intrinsics.checkNotNullParameter(contractDetailsDisplayStore, "contractDetailsDisplayStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(streamEventMarketSessionChangeState, "streamEventMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(gameDetailPagePreferences, "gameDetailPagePreferences");
        Intrinsics.checkNotNullParameter(streamLiveDateTitle, "streamLiveDateTitle");
        Intrinsics.checkNotNullParameter(streamComboQuoteUseCase, "streamComboQuoteUseCase");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.eventStore = eventStore;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.eventOrderStore = eventOrderStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.eventStateStore = eventStateStore;
        this.strikeContractStore = strikeContractStore;
        this.contractDetailsDisplayStore = contractDetailsDisplayStore;
        this.experimentsProvider = experimentsProvider;
        this.streamEventMarketSessionChangeState = streamEventMarketSessionChangeState;
        this.gameDetailPagePreferences = gameDetailPagePreferences;
        this.streamLiveDateTitle = streamLiveDateTitle;
        this.streamComboQuoteUseCase = streamComboQuoteUseCase;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        this.selectionStateProvider = new GameDetailSelectionStateProvider(getSavedStateHandle());
        this.bottomSheetSelectionStateFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C162691(null));
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1 */
    static final class C162691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EcUuidType.values().length];
                try {
                    iArr[EcUuidType.EVENT_ID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EcUuidType.CONTRACT_ID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C162691(Continuation<? super C162691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162691 c162691 = GameDetailDuxo.this.new C162691(continuation);
            c162691.L$0 = obj;
            return c162691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C162691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Flow flowFlowOf;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Companion companion = GameDetailDuxo.INSTANCE;
            int i = WhenMappings.$EnumSwitchMapping$0[((GameDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) GameDetailDuxo.this)).getType().ordinal()];
            if (i == 1) {
                flowFlowOf = FlowKt.flowOf(((GameDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) GameDetailDuxo.this)).getId());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                flowFlowOf = FlowKt.distinctUntilChanged(FlowKt.mapLatest(GameDetailDuxo.this.eventStore.streamEventContract(((GameDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) GameDetailDuxo.this)).getId()), new GameDetailDuxo$onCreate$1$eventIdFlow$1(null)));
            }
            Flow flowShare = GameDetailDuxoKt.share(flowFlowOf, coroutineScope);
            Flow flowShare2 = GameDetailDuxoKt.share(FlowKt.transformLatest(flowShare, new GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1(null, GameDetailDuxo.this.eventStore)), coroutineScope);
            Flow flowShare3 = GameDetailDuxoKt.share(GameDetailDuxo.this.futuresAccountStore.streamRhsAccountNumberWithFuturesAccountAllowed(), coroutineScope);
            Flow flowShare4 = GameDetailDuxoKt.share(FlowKt.transformLatest(flowShare3, new GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$2(null, GameDetailDuxo.this)), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flowShare3, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(flowShare4, GameDetailDuxo.this, null), 3, null);
            Flow flowShare5 = GameDetailDuxoKt.share(FlowKt.distinctUntilChanged(FlowKt.transformLatest(flowShare, new GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$3(null, GameDetailDuxo.this))), coroutineScope);
            Flow flowShare6 = GameDetailDuxoKt.share(FlowKt.distinctUntilChanged(FlowKt.transformLatest(flowShare, new GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$4(null, GameDetailDuxo.this, flowShare5))), coroutineScope);
            Flow flowShare7 = GameDetailDuxoKt.share(ExperimentsProvider.DefaultImpls.streamStateFlow$default(GameDetailDuxo.this.experimentsProvider, new Experiment[]{GameDetailPageExperiment7.INSTANCE}, false, null, 6, null), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(flowShare5, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(flowShare4, flowShare, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(flowShare5, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(flowShare2, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(flowShare, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(flowShare, flowShare7, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass13(flowShare, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass14(flowShare, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass15(flowShare6, GameDetailDuxo.this, null), 3, null);
            Flow flowShare8 = GameDetailDuxoKt.share(FlowKt.transformLatest(flowShare6, new GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$5(null, GameDetailDuxo.this)), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass16(flowShare8, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass17(GameDetailDuxoKt.share(FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(flowShare2, new GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$6(null, GameDetailDuxo.this))), new GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$7(null, GameDetailDuxo.this)), coroutineScope), GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass18(flowShare2, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass19(flowShare2, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass20(GameDetailDuxo.this, flowShare, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass21(GameDetailDuxo.this, null), 3, null);
            Flow flowShare9 = GameDetailDuxoKt.share(FlowKt.transformLatest(flowShare, new GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$8(null, GameDetailDuxo.this)), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass22(flowShare9, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass23(flowShare2, GameDetailDuxo.this, flowShare9, null), 3, null);
            final Flow flowTransformLatest = FlowKt.transformLatest(flowShare, new GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$9(null, GameDetailDuxo.this, flowShare7));
            Flow flowShare10 = GameDetailDuxoKt.share(FlowKt.distinctUntilChanged(new Flow<Set<? extends UUID>>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Set<? extends UUID>> flowCollector, Continuation continuation) {
                    Object objCollect = flowTransformLatest.collect(new C162412(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2 */
                public static final class C162412<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C162412.this.emit(null, this);
                        }
                    }

                    public C162412(FlowCollector flowCollector) {
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
                            anonymousClass1.label = 1;
                            if (this.$this_unsafeFlow.emit((Set) obj, anonymousClass1) == coroutine_suspended) {
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
            }), coroutineScope);
            Flow flowShare11 = GameDetailDuxoKt.share(FlowKt.distinctUntilChanged(GameDetailDuxo.this.gameDetailPagePreferences.observeAmericanOddsChanges()), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass24(flowShare11, GameDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass25(GameDetailDuxo.this, flowShare4, flowShare10, flowShare11, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass26(flowShare, GameDetailDuxo.this, null), 3, null);
            if (((GameDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) GameDetailDuxo.this)).getSupportCombos()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass27(flowShare, GameDetailDuxo.this, flowShare5, flowShare8, null), 3, null);
            } else {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass28(GameDetailDuxo.this, flowShare4, flowShare, flowShare5, null), 3, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $rhsAccountNumberFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<String> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$rhsAccountNumberFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$rhsAccountNumberFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<String> flow = this.$rhsAccountNumberFlow;
                    C500181 c500181 = new C500181(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c500181, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "individualAccountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500181 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500181(GameDetailDuxo gameDetailDuxo, Continuation<? super C500181> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500181 c500181 = new C500181(this.this$0, continuation);
                    c500181.L$0 = obj;
                    return c500181;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C500181) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$1$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500191 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ String $individualAccountNumber;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500191(String str, Continuation<? super C500191> continuation) {
                        super(2, continuation);
                        this.$individualAccountNumber = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500191 c500191 = new C500191(this.$individualAccountNumber, continuation);
                        c500191.L$0 = obj;
                        return c500191;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500191) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : this.$individualAccountNumber, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500191((String) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Flow<? extends Optional<FuturesAccount>> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$optionalSwapAccountFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$optionalSwapAccountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Optional<FuturesAccount>> flow = this.$optionalSwapAccountFlow;
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "swapAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends FuturesAccount>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<FuturesAccount> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends FuturesAccount> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<FuturesAccount>) optional, continuation);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$2$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500241 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Optional<FuturesAccount> $swapAccount;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500241(Optional<FuturesAccount> optional, Continuation<? super C500241> continuation) {
                        super(2, continuation);
                        this.$swapAccount = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500241 c500241 = new C500241(this.$swapAccount, continuation);
                        c500241.L$0 = obj;
                        return c500241;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500241) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : this.$swapAccount, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500241((Optional) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$3", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, UiEventContractPosition>> $contractIdToPositionsForGameFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Flow<? extends Map<UUID, UiEventContractPosition>> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$contractIdToPositionsForGameFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$contractIdToPositionsForGameFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$3$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends UiEventContractPosition>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends UiEventContractPosition> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, UiEventContractPosition>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, UiEventContractPosition> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$3$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500271 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<UUID, UiEventContractPosition> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500271(Map<UUID, UiEventContractPosition> map, Continuation<? super C500271> continuation) {
                        super(2, continuation);
                        this.$it = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500271 c500271 = new C500271(this.$it, continuation);
                        c500271.L$0 = obj;
                        return c500271;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500271) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : this.$it, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500271((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Map<UUID, UiEventContractPosition>> flow = this.$contractIdToPositionsForGameFlow;
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
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(Flow<? extends Optional<FuturesAccount>> flow, Flow<UUID> flow2, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$optionalSwapAccountFlow = flow;
                this.$eventIdFlow = flow2;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$optionalSwapAccountFlow, this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Optional<FuturesAccount>> flow = this.$optionalSwapAccountFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.combine(new Flow<FuturesAccount>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super FuturesAccount> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C162392(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1$2 */
                        public static final class C162392<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    return C162392.this.emit(null, this);
                                }
                            }

                            public C162392(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
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
                                    Object orNull = ((Optional) obj).getOrNull();
                                    if (orNull != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
                    }, this.$eventIdFlow, new AnonymousClass2(null))), new C16238x1535b50d(null, this.this$0));
                    C500284 c500284 = new C500284(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c500284, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Ljava/util/UUID;", "swapAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "eventId"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FuturesAccount, UUID, Continuation<? super Tuples2<? extends UUID, ? extends UUID>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(FuturesAccount futuresAccount, UUID uuid, Continuation<? super Tuples2<UUID, UUID>> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = futuresAccount;
                    anonymousClass2.L$1 = uuid;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(FuturesAccount futuresAccount, UUID uuid, Continuation<? super Tuples2<? extends UUID, ? extends UUID>> continuation) {
                    return invoke2(futuresAccount, uuid, (Continuation<? super Tuples2<UUID, UUID>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    FuturesAccount futuresAccount = (FuturesAccount) this.L$0;
                    return Tuples4.m3642to(futuresAccount.getId(), (UUID) this.L$1);
                }
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;", "", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$4", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$4, reason: invalid class name and collision with other inner class name */
            static final class C500284 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends List<? extends UiEventOrder>>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500284(GameDetailDuxo gameDetailDuxo, Continuation<? super C500284> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500284 c500284 = new C500284(this.this$0, continuation);
                    c500284.L$0 = obj;
                    return c500284;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends List<? extends UiEventOrder>> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, ? extends List<UiEventOrder>>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, ? extends List<UiEventOrder>> map, Continuation<? super Unit> continuation) {
                    return ((C500284) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$4$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$4$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<UUID, List<UiEventOrder>> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Map<UUID, ? extends List<UiEventOrder>> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : this.$it, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
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

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$5", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, UiEventContractPosition>> $contractIdToPositionsForGameFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(Flow<? extends Map<UUID, UiEventContractPosition>> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$contractIdToPositionsForGameFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$contractIdToPositionsForGameFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$contractIdToPositionsForGameFlow, new C16240x6c53a5ec(null, this.this$0));
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$5$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<ContractIdWithSide, ? extends ContractDisplayDetails>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<ContractIdWithSide, ? extends ContractDisplayDetails> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<ContractIdWithSide, ContractDisplayDetails>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<ContractIdWithSide, ContractDisplayDetails> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$5$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$5$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<ContractIdWithSide, ContractDisplayDetails> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Map<ContractIdWithSide, ContractDisplayDetails> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : this.$it, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
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

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$6", m3645f = "GameDetailDuxo.kt", m3646l = {239}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UiEcEvent> $eventFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(Flow<UiEcEvent> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$eventFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/event/ui/UiEcEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$6$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiEcEvent, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiEcEvent uiEcEvent, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uiEcEvent, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$6$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500291 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ UiEcEvent $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500291(UiEcEvent uiEcEvent, Continuation<? super C500291> continuation) {
                        super(2, continuation);
                        this.$it = uiEcEvent;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500291 c500291 = new C500291(this.$it, continuation);
                        c500291.L$0 = obj;
                        return c500291;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500291) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : this.$it, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500291((UiEcEvent) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<UiEcEvent> flow = this.$eventFlow;
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
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$7", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{EventContractsSportsExperiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$7$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$7$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500301 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500301(boolean z, Continuation<? super C500301> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500301 c500301 = new C500301(this.$inExperiment, continuation);
                        c500301.L$0 = obj;
                        return c500301;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500301) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : this.$inExperiment, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500301(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$8", m3645f = "GameDetailDuxo.kt", m3646l = {255}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$8$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$8$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500311 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500311(boolean z, Continuation<? super C500311> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500311 c500311 = new C500311(this.$inExperiment, continuation);
                        c500311.L$0 = obj;
                        return c500311;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500311) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : this.$inExperiment, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500311(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{GameDetailPageExperiment3.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$9", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$9$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$9$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500321 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500321(boolean z, Continuation<? super C500321> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500321 c500321 = new C500321(this.$inExperiment, continuation);
                        c500321.L$0 = obj;
                        return c500321;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500321) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : this.$inExperiment, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500321(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{GameDetailPageExperiment6.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$10", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$10$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$10$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$10$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500201 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500201(boolean z, Continuation<? super C500201> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500201 c500201 = new C500201(this.$inExperiment, continuation);
                        c500201.L$0 = obj;
                        return c500201;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500201) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : this.$inExperiment, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500201(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{GameDetailPageExperiment2.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$11", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(Flow<UUID> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(this.$eventIdFlow, ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{GameDetailPageExperiment5.INSTANCE}, false, null, 6, null), null, 2, null), new C16222xbf3afd3b(null, this.this$0));
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "prepacksContractGroup", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroup;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$11$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$11$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends ContractGroup>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends ContractGroup> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<ContractGroup>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<ContractGroup> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$11$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$11$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ List<ContractGroup> $prepacksContractGroup;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<ContractGroup> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$prepacksContractGroup = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$prepacksContractGroup, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : this.$prepacksContractGroup, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$12", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            final /* synthetic */ Flow<Boolean> $playerPropsExp;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(Flow<UUID> flow, Flow<Boolean> flow2, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.$playerPropsExp = flow2;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.$eventIdFlow, this.$playerPropsExp, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(this.$eventIdFlow, this.$playerPropsExp, null, 2, null), new C16223x1658ee1a(null, this.this$0));
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "playerPropsGroupSection", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroupSectionWithContractGroup;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$12$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$12$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends ContractGroupSectionWithContractGroup>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends ContractGroupSectionWithContractGroup> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<ContractGroupSectionWithContractGroup>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<ContractGroupSectionWithContractGroup> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$12$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$12$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ List<ContractGroupSectionWithContractGroup> $playerPropsGroupSection;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<ContractGroupSectionWithContractGroup> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$playerPropsGroupSection = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$playerPropsGroupSection, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : this.$playerPropsGroupSection, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$13", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.f2775xbcb7e6f3}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(Flow<UUID> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$eventIdFlow, new C16224x6d76def9(null, this.this$0));
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "timeline", "Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$13$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$13$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EventTimeline, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventTimeline eventTimeline, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(eventTimeline, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$13$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$13$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ EventTimeline $timeline;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(EventTimeline eventTimeline, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$timeline = eventTimeline;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeline, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : this.$timeline, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((EventTimeline) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$14", m3645f = "GameDetailDuxo.kt", m3646l = {338}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$14, reason: invalid class name */
        static final class AnonymousClass14 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass14(Flow<UUID> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$eventIdFlow, new C16225xc494cfd8(null, this.this$0));
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contractGroup", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroup;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$14$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$14$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends ContractGroup>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends ContractGroup> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<ContractGroup>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<ContractGroup> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$14$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$14$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ List<ContractGroup> $contractGroup;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<ContractGroup> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$contractGroup = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$contractGroup, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : this.$contractGroup, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$15", m3645f = "GameDetailDuxo.kt", m3646l = {349}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$15, reason: invalid class name */
        static final class AnonymousClass15 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Set<UUID>> $allContractIdsForGameFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass15(Flow<? extends Set<UUID>> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.$allContractIdsForGameFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.$allContractIdsForGameFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Set<UUID>> flow = this.$allContractIdsForGameFlow;
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$15$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$15$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Set<? extends UUID>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Set<? extends UUID> set, Continuation<? super Unit> continuation) {
                    return invoke2((Set<UUID>) set, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Set<UUID> set, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$15$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$15$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500211 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Set<UUID> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500211(Set<UUID> set, Continuation<? super C500211> continuation) {
                        super(2, continuation);
                        this.$it = set;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500211 c500211 = new C500211(this.$it, continuation);
                        c500211.L$0 = obj;
                        return c500211;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500211) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : this.$it, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500211((Set) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$16", m3645f = "GameDetailDuxo.kt", m3646l = {367}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$16, reason: invalid class name */
        static final class AnonymousClass16 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, EventContract>> $allContractsFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass16(Flow<? extends Map<UUID, EventContract>> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass16> continuation) {
                super(2, continuation);
                this.$allContractsFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass16(this.$allContractsFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Map<UUID, EventContract>> flow = this.$allContractsFlow;
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "idToContract", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$16$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$16$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventContract>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventContract> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventContract>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventContract> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$16$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$16$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500221 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventContract> $idToContract;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500221(Map<UUID, EventContract> map, Continuation<? super C500221> continuation) {
                        super(2, continuation);
                        this.$idToContract = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500221 c500221 = new C500221(this.$idToContract, continuation);
                        c500221.L$0 = obj;
                        return c500221;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500221) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : this.$idToContract, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500221((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$17", m3645f = "GameDetailDuxo.kt", m3646l = {383}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$17, reason: invalid class name */
        static final class AnonymousClass17 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, EventQuote>> $contractIdToQuotesFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass17(Flow<? extends Map<UUID, EventQuote>> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass17> continuation) {
                super(2, continuation);
                this.$contractIdToQuotesFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass17(this.$contractIdToQuotesFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass17) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Map<UUID, EventQuote>> flow = this.$contractIdToQuotesFlow;
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$17$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$17$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventQuote>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventQuote> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventQuote>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventQuote> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$17$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$17$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500231 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventQuote> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500231(Map<UUID, EventQuote> map, Continuation<? super C500231> continuation) {
                        super(2, continuation);
                        this.$it = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500231 c500231 = new C500231(this.$it, continuation);
                        c500231.L$0 = obj;
                        return c500231;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500231) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : this.$it, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500231((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18", m3645f = "GameDetailDuxo.kt", m3646l = {394}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18, reason: invalid class name */
        static final class AnonymousClass18 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UiEcEvent> $eventFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass18(Flow<UiEcEvent> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass18> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass18(this.$eventFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass18) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<UiEcEvent> flow = this.$eventFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C162272(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18$invokeSuspend$$inlined$map$1$2 */
                        public static final class C162272<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18$invokeSuspend$$inlined$map$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C162272.this.emit(null, this);
                                }
                            }

                            public C162272(FlowCollector flowCollector) {
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
                                    List list = CollectionsKt.toList(((UiEcEvent) obj).getContractIds());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(list, anonymousClass1) == coroutine_suspended) {
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
                    }), new C16226x210c9354(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "newContractIdToFundamentals", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventFundamental;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18$3", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventFundamental>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventFundamental> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventFundamental>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventFundamental> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18$3$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$18$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventFundamental> $newContractIdToFundamentals;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ GameDetailDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(GameDetailDuxo gameDetailDuxo, Map<UUID, EventFundamental> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = gameDetailDuxo;
                        this.$newContractIdToFundamentals = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$newContractIdToFundamentals, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                            Instant instantNow = Instant.now(this.this$0.clock);
                            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                            return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : BuildOpenInterestAggregatedDeltaMapping.buildOpenInterestDeltaMapping(instantNow, this.$newContractIdToFundamentals, gameDetailDataState.getContractIdToFundamentals(), gameDetailDataState.getContractIdToOpenInterestDeltas(), boxing.boxLong(1000L)), ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : this.$newContractIdToFundamentals, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Map map = (Map) this.L$0;
                    GameDetailDuxo gameDetailDuxo = this.this$0;
                    gameDetailDuxo.applyMutation(new AnonymousClass1(gameDetailDuxo, map, null));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19", m3645f = "GameDetailDuxo.kt", m3646l = {415}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19, reason: invalid class name */
        static final class AnonymousClass19 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UiEcEvent> $eventFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass19(Flow<UiEcEvent> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass19> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass19(this.$eventFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass19) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<UiEcEvent> flow = this.$eventFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<ExchangeSource>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ExchangeSource> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C162292(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19$invokeSuspend$$inlined$map$1$2 */
                        public static final class C162292<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19$invokeSuspend$$inlined$map$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C162292.this.emit(null, this);
                                }
                            }

                            public C162292(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                ExchangeSource exchangeSource;
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
                                    Collection<EventContract> collectionValues = ((UiEcEvent) obj).getOrderedContracts().values();
                                    Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                                    EventContract eventContract = (EventContract) CollectionsKt.firstOrNull(collectionValues);
                                    if (eventContract == null || (exchangeSource = eventContract.getExchangeSource()) == null) {
                                        exchangeSource = ExchangeSource.UNKNOWN;
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(exchangeSource, anonymousClass1) == coroutine_suspended) {
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
                    }), new C16228x782a8433(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19$3", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<MarketSessionChangeDataState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(marketSessionChangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19$3$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$19$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ MarketSessionChangeDataState $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = marketSessionChangeDataState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : this.$it, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((MarketSessionChangeDataState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$20", m3645f = "GameDetailDuxo.kt", m3646l = {439}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$20, reason: invalid class name */
        static final class AnonymousClass20 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass20(GameDetailDuxo gameDetailDuxo, Flow<UUID> flow, Continuation<? super AnonymousClass20> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
                this.$eventIdFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass20(this.this$0, this.$eventIdFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass20) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.this$0.getStateFlow().getValue().getChartState().getActiveSpan() == null) {
                        Flow flowTake = FlowKt.take(FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{DefaultSpanExperiment.INSTANCE}, false, null, 6, null), new C16230xf4bd375d(null, this.$eventIdFlow, this.this$0)), 1);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$20$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$20$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DisplaySpan, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DisplaySpan displaySpan, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(displaySpan, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$20$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$20$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ DisplaySpan $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(DisplaySpan displaySpan, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = displaySpan;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : this.$it, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((DisplaySpan) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21", m3645f = "GameDetailDuxo.kt", m3646l = {457}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21, reason: invalid class name */
        static final class AnonymousClass21 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass21(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass21> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass21(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass21) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<GameDetailViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<EventContractChartArg>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super EventContractChartArg> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C162342(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21$invokeSuspend$$inlined$mapNotNull$1$2 */
                        public static final class C162342<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    return C162342.this.emit(null, this);
                                }
                            }

                            public C162342(FlowCollector flowCollector) {
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
                                    EventContractChartArg chartArgs = ((GameDetailViewState) obj).getChartArgs();
                                    if (chartArgs != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(chartArgs, anonymousClass1) == coroutine_suspended) {
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
                    }), new C16233x4bdb283c(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/android/futures/charts/FuturesChartResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21$3", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FuturesChartResult, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesChartResult futuresChartResult, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(futuresChartResult, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21$3$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$21$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ FuturesChartResult $response;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesChartResult futuresChartResult, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$response = futuresChartResult;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        FuturesChartResult futuresChartResult = this.$response;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : futuresChartResult != null ? futuresChartResult.getChart() : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesChartResult) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$22", m3645f = "GameDetailDuxo.kt", m3646l = {470}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$22, reason: invalid class name */
        static final class AnonymousClass22 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<PredictionMarketEventState> $eventStateFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass22(Flow<PredictionMarketEventState> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass22> continuation) {
                super(2, continuation);
                this.$eventStateFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass22(this.$eventStateFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass22) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<PredictionMarketEventState> flow = this.$eventStateFlow;
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "eventState", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$22$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$22$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PredictionMarketEventState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PredictionMarketEventState predictionMarketEventState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(predictionMarketEventState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$22$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$22$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500251 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ PredictionMarketEventState $eventState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500251(PredictionMarketEventState predictionMarketEventState, Continuation<? super C500251> continuation) {
                        super(2, continuation);
                        this.$eventState = predictionMarketEventState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500251 c500251 = new C500251(this.$eventState, continuation);
                        c500251.L$0 = obj;
                        return c500251;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500251) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : this.$eventState, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500251((PredictionMarketEventState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23", m3645f = "GameDetailDuxo.kt", m3646l = {490}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23, reason: invalid class name */
        static final class AnonymousClass23 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UiEcEvent> $eventFlow;
            final /* synthetic */ Flow<PredictionMarketEventState> $eventStateFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass23(Flow<UiEcEvent> flow, GameDetailDuxo gameDetailDuxo, Flow<PredictionMarketEventState> flow2, Continuation<? super AnonymousClass23> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = gameDetailDuxo;
                this.$eventStateFlow = flow2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass23(this.$eventFlow, this.this$0, this.$eventStateFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass23) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<UiEcEvent> flow = this.$eventFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C162372(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$invokeSuspend$$inlined$map$1$2 */
                        public static final class C162372<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$invokeSuspend$$inlined$map$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C162372.this.emit(null, this);
                                }
                            }

                            public C162372(FlowCollector flowCollector) {
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
                                    UUID eventId = ((UiEcEvent) obj).getEvent().getEventId();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(eventId, anonymousClass1) == coroutine_suspended) {
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
                    }), new C16236xfa1709fa(null, this.this$0, this.$eventStateFlow));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/event/gamedetail/builders/TitleState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$3", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<TitleState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TitleState titleState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(titleState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$3$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ TitleState $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(TitleState titleState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = titleState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : this.$it, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((TitleState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$24", m3645f = "GameDetailDuxo.kt", m3646l = {528}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$24, reason: invalid class name */
        static final class AnonymousClass24 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $showAmericanOddsFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass24(Flow<Boolean> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass24> continuation) {
                super(2, continuation);
                this.$showAmericanOddsFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass24(this.$showAmericanOddsFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass24) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$showAmericanOddsFlow;
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showAmericanOdds", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$24$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$24$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$24$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$24$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500261 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ boolean $showAmericanOdds;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500261(boolean z, Continuation<? super C500261> continuation) {
                        super(2, continuation);
                        this.$showAmericanOdds = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500261 c500261 = new C500261(this.$showAmericanOdds, continuation);
                        c500261.L$0 = obj;
                        return c500261;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500261) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : this.$showAmericanOdds, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500261(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$25", m3645f = "GameDetailDuxo.kt", m3646l = {535}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$25, reason: invalid class name */
        static final class AnonymousClass25 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Set<UUID>> $contractGroupIdsForAmericanOddsFlow;
            final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
            final /* synthetic */ Flow<Boolean> $showAmericanOddsFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass25(GameDetailDuxo gameDetailDuxo, Flow<? extends Optional<FuturesAccount>> flow, Flow<? extends Set<UUID>> flow2, Flow<Boolean> flow3, Continuation<? super AnonymousClass25> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
                this.$optionalSwapAccountFlow = flow;
                this.$contractGroupIdsForAmericanOddsFlow = flow2;
                this.$showAmericanOddsFlow = flow3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass25(this.this$0, this.$optionalSwapAccountFlow, this.$contractGroupIdsForAmericanOddsFlow, this.$showAmericanOddsFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass25) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GameDetailDuxo gameDetailDuxo = this.this$0;
                    Flow<Optional<FuturesAccount>> flow = this.$optionalSwapAccountFlow;
                    Flow<Set<UUID>> flow2 = this.$contractGroupIdsForAmericanOddsFlow;
                    Flow<Boolean> flow3 = this.$showAmericanOddsFlow;
                    this.label = 1;
                    if (gameDetailDuxo.streamEstimatedFeesForAmericanOdds(flow, flow2, flow3, this) == coroutine_suspended) {
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
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$26", m3645f = "GameDetailDuxo.kt", m3646l = {543}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$26, reason: invalid class name */
        static final class AnonymousClass26 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass26(Flow<UUID> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass26> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass26(this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass26) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$26$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$26$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit(new GameDetailEvent.PollBottomSheet((UUID) this.L$0));
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<UUID> flow = this.$eventIdFlow;
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
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$27", m3645f = "GameDetailDuxo.kt", m3646l = {550, 551}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$27, reason: invalid class name */
        static final class AnonymousClass27 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, EventContract>> $allContractsFlow;
            final /* synthetic */ Flow<Map<UUID, UiEventContractPosition>> $contractIdToPositionsForGameFlow;
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass27(Flow<UUID> flow, GameDetailDuxo gameDetailDuxo, Flow<? extends Map<UUID, UiEventContractPosition>> flow2, Flow<? extends Map<UUID, EventContract>> flow3, Continuation<? super AnonymousClass27> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = gameDetailDuxo;
                this.$contractIdToPositionsForGameFlow = flow2;
                this.$allContractsFlow = flow3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass27(this.$eventIdFlow, this.this$0, this.$contractIdToPositionsForGameFlow, this.$allContractsFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass27) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
            
                if (r1.streamComboRelatedStates(r6, r3, r4, r5) == r0) goto L19;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<UUID> flow = this.$eventIdFlow;
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flow, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                UUID uuid = (UUID) obj;
                if (uuid == null) {
                    return Unit.INSTANCE;
                }
                GameDetailDuxo gameDetailDuxo = this.this$0;
                Flow<Map<UUID, UiEventContractPosition>> flow2 = this.$contractIdToPositionsForGameFlow;
                Flow<Map<UUID, EventContract>> flow3 = this.$allContractsFlow;
                this.label = 2;
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$28", m3645f = "GameDetailDuxo.kt", m3646l = {559}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$28, reason: invalid class name */
        static final class AnonymousClass28 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, UiEventContractPosition>> $contractIdToPositionsForGameFlow;
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass28(GameDetailDuxo gameDetailDuxo, Flow<? extends Optional<FuturesAccount>> flow, Flow<UUID> flow2, Flow<? extends Map<UUID, UiEventContractPosition>> flow3, Continuation<? super AnonymousClass28> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
                this.$optionalSwapAccountFlow = flow;
                this.$eventIdFlow = flow2;
                this.$contractIdToPositionsForGameFlow = flow3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass28(this.this$0, this.$optionalSwapAccountFlow, this.$eventIdFlow, this.$contractIdToPositionsForGameFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass28) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GameDetailDuxo gameDetailDuxo = this.this$0;
                    Flow<Optional<FuturesAccount>> flow = this.$optionalSwapAccountFlow;
                    Flow<UUID> flow2 = this.$eventIdFlow;
                    Flow<Map<UUID, UiEventContractPosition>> flow3 = this.$contractIdToPositionsForGameFlow;
                    this.label = 1;
                    if (gameDetailDuxo.streamOnBottomSheetSelection(flow, flow2, flow3, this) == coroutine_suspended) {
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<ContractIdWithSide>> streamAllRelatedContractIdWithSidesForSelections(StateFlow<? extends GameDetailSelectionState> selectionStates, Flow<? extends Map<UUID, UiEventContractPosition>> contractIdToPositionsForGameFlow) {
        return FlowKt.transformLatest(selectionStates, new C16243x89f76f4(null, this, contractIdToPositionsForGameFlow));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Map<ContractIdWithSide, StrikeContract>> streamStrikeContractsForSelections(UUID eventId, Flow<? extends GameDetailSelectionState> selectionStates) {
        return FlowKt.transformLatest(selectionStates, new C16264x674eff64(null, this, eventId));
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onChartScrubbed$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onChartScrubbed$1 */
    static final class C162681 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
        final /* synthetic */ Point $point;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C162681(Point point, Continuation<? super C162681> continuation) {
            super(2, continuation);
            this.$point = point;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162681 c162681 = new C162681(this.$point, continuation);
            c162681.L$0 = obj;
            return c162681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
            return ((C162681) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
            return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : this.$point, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
        }
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks
    public void onChartScrubbed(Point point) {
        applyMutation(new C162681(point, null));
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onSpanSelected$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onSpanSelected$1 */
    static final class C162761 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
        final /* synthetic */ DisplaySpan $span;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C162761(DisplaySpan displaySpan, Continuation<? super C162761> continuation) {
            super(2, continuation);
            this.$span = displaySpan;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162761 c162761 = new C162761(this.$span, continuation);
            c162761.L$0 = obj;
            return c162761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
            return ((C162761) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
            return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : this.$span, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
        }
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.ChartCallbacks
    public void onSpanSelected(DisplaySpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        applyMutation(new C162761(span, null));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onContractSelected(final ContractOptionData contractOptionData) {
        Intrinsics.checkNotNullParameter(contractOptionData, "contractOptionData");
        updateBottomSheetSelection(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onContractSelected$lambda$0(contractOptionData, (BottomSheetSelection) obj);
            }
        });
        submit(new GameDetailEvent.HapticFeedback(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetSelection onContractSelected$lambda$0(ContractOptionData contractOptionData, BottomSheetSelection bottomSheetSelection) {
        return new BottomSheetSelection.ContractOption(contractOptionData);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onContractUnselected(ContractOptionData contractOptionData) {
        Intrinsics.checkNotNullParameter(contractOptionData, "contractOptionData");
        updateBottomSheetSelection(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onContractUnselected$lambda$1((BottomSheetSelection) obj);
            }
        });
    }

    private final void updateBottomSheetSelection(Function1<? super BottomSheetSelection, ? extends BottomSheetSelection> mutation) {
        StateFlow2<BottomSheetSelection> stateFlow2 = this.bottomSheetSelectionStateFlow;
        stateFlow2.setValue(mutation.invoke(stateFlow2.getValue()));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onPositionSelected(final UUID contractId) {
        updateBottomSheetSelection(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onPositionSelected$lambda$2(contractId, (BottomSheetSelection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetSelection onPositionSelected$lambda$2(UUID uuid, BottomSheetSelection bottomSheetSelection) {
        if (uuid != null) {
            return new BottomSheetSelection.Position(uuid);
        }
        return null;
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onYesNoToggle(final ContractIdWithSide contractIdWithSide) {
        Intrinsics.checkNotNullParameter(contractIdWithSide, "contractIdWithSide");
        updateBottomSheetSelection(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onYesNoToggle$lambda$3(contractIdWithSide, (BottomSheetSelection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetSelection onYesNoToggle$lambda$3(ContractIdWithSide contractIdWithSide, BottomSheetSelection bottomSheetSelection) {
        BottomSheetSelection.ContractOption contractOption = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
        if (contractOption != null) {
            return contractOption.copy(ContractOptionData.copy$default(((BottomSheetSelection.ContractOption) bottomSheetSelection).getData(), null, contractIdWithSide, null, null, 9, null));
        }
        return null;
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onDeleteClick() {
        updateBottomSheetSelection(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onDeleteClick$lambda$4((BottomSheetSelection) obj);
            }
        });
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onWheelPickerItemSelected(final ContractElement contractElement) {
        updateBottomSheetSelection(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onWheelPickerItemSelected$lambda$5(contractElement, (BottomSheetSelection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetSelection onWheelPickerItemSelected$lambda$5(ContractElement contractElement, BottomSheetSelection bottomSheetSelection) {
        BottomSheetSelection.ContractOption contractOption = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
        if (contractOption != null) {
            return contractOption.copy(ContractOptionData.copy$default(((BottomSheetSelection.ContractOption) bottomSheetSelection).getData(), null, null, contractElement, null, 11, null));
        }
        return null;
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onConfirmAlternativeStrike() {
        updateBottomSheetSelection(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onConfirmAlternativeStrike$lambda$6((BottomSheetSelection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetSelection onConfirmAlternativeStrike$lambda$6(BottomSheetSelection bottomSheetSelection) {
        ContractIdWithSide selectedContract;
        BottomSheetSelection.ContractOption contractOption = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
        if (contractOption == null) {
            return null;
        }
        BottomSheetSelection.ContractOption contractOption2 = (BottomSheetSelection.ContractOption) bottomSheetSelection;
        ContractOptionData data = contractOption2.getData();
        ContractElement currentWheelPickerContract = contractOption2.getData().getCurrentWheelPickerContract();
        if (currentWheelPickerContract == null || (selectedContract = ContractElementExt.toContractIdWithSide(currentWheelPickerContract)) == null) {
            selectedContract = contractOption2.getData().getSelectedContract();
        }
        return contractOption.copy(ContractOptionData.copy$default(data, null, selectedContract, null, null, 9, null));
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onPropsCategoryClick$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onPropsCategoryClick$2 */
    static final class C162742 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C162742(int i, Continuation<? super C162742> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162742 c162742 = new C162742(this.$index, continuation);
            c162742.L$0 = obj;
            return c162742;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
            return ((C162742) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
            return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : this.$index, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
        }
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onPropsCategoryClick(int index) {
        updateBottomSheetSelection(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onPropsCategoryClick$lambda$7((BottomSheetSelection) obj);
            }
        });
        applyMutation(new C162742(index, null));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpV1SelectionCallbacks
    public void onPropsViewAllToggle() {
        withDataState(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onPropsViewAllToggle$lambda$8(this.f$0, (GameDetailDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPropsViewAllToggle$lambda$8(GameDetailDuxo gameDetailDuxo, GameDetailDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        gameDetailDuxo.applyMutation(new GameDetailDuxo$onPropsViewAllToggle$1$1(ds, null));
        return Unit.INSTANCE;
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onAboutEventTypeSelected$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onAboutEventTypeSelected$1 */
    static final class C162671 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
        final /* synthetic */ AboutEventType $aboutEventType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C162671(AboutEventType aboutEventType, Continuation<? super C162671> continuation) {
            super(2, continuation);
            this.$aboutEventType = aboutEventType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162671 c162671 = new C162671(this.$aboutEventType, continuation);
            c162671.L$0 = obj;
            return c162671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
            return ((C162671) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
            return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : this.$aboutEventType, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
        }
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onAboutEventTypeSelected(AboutEventType aboutEventType) {
        Intrinsics.checkNotNullParameter(aboutEventType, "aboutEventType");
        applyMutation(new C162671(aboutEventType, null));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onOrderSubmitted() {
        updateBottomSheetSelection(new Function1() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailDuxo.onOrderSubmitted$lambda$9((BottomSheetSelection) obj);
            }
        });
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onAmericanOddsChanged(boolean isChecked) {
        this.gameDetailPagePreferences.setAmericanOddsPref(isChecked);
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onShowDisabledTradeButtonMessage$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onShowDisabledTradeButtonMessage$1 */
    static final class C162751 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C162751(Continuation<? super C162751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162751 c162751 = new C162751(continuation);
            c162751.L$0 = obj;
            return c162751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
            return ((C162751) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
            return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : true, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
        }
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks
    public void onShowDisabledTradeButtonMessage() {
        applyMutation(new C162751(null));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void updateContractSelectionSide(ContractIdWithSide key, ContractSide newSide) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newSide, "newSide");
        this.selectionStateProvider.updateContractSelectionSide(key, newSide);
        submit(new GameDetailEvent.HapticFeedback(1));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void addContractSelection(ContractIdWithSide key, ContractGroup3 columnType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(columnType, "columnType");
        this.selectionStateProvider.addContractSelection(key, columnType);
        submit(new GameDetailEvent.HapticFeedback(1));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void addContractSelectionAndOpenPicker(ContractIdWithSide key, ContractGroup3 columnType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(columnType, "columnType");
        this.selectionStateProvider.addContractSelection(key, columnType);
        this.selectionStateProvider.openStrikePicker(key);
        submit(new GameDetailEvent.HapticFeedback(0));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void removeContractSelection(ContractIdWithSide key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean zRemoveContractSelection = this.selectionStateProvider.removeContractSelection(key);
        submit(new GameDetailEvent.HapticFeedback(1));
        if (zRemoveContractSelection) {
            submit(GameDetailEvent.CloseComboSheet.INSTANCE);
        }
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void clearSelections() {
        this.selectionStateProvider.clearSelections();
        submit(GameDetailEvent.CloseComboSheet.INSTANCE);
        submit(new GameDetailEvent.HapticFeedback(16));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void selectPosition(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        this.selectionStateProvider.selectPosition(contractId);
        submit(new GameDetailEvent.HapticFeedback(1));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void openStrikePicker(ContractIdWithSide key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.selectionStateProvider.openStrikePicker(key);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void selectPropsCategory(int index) {
        this.selectionStateProvider.selectPropsCategory(index);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void toggleViewAllProps() {
        this.selectionStateProvider.toggleViewAllProps();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void dismissWheelPicker() {
        this.selectionStateProvider.dismissStrikePicker();
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void confirmAlternativeStrike(ContractIdWithSide newStrike) {
        Intrinsics.checkNotNullParameter(newStrike, "newStrike");
        this.selectionStateProvider.updateAlternativeStrike(newStrike);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks
    public void resetEmptyState() {
        this.selectionStateProvider.resetEmptyState();
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2 */
    static final class C162772 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ Flow<Map<UUID, EventContract>> $allContractsFlow;
        final /* synthetic */ Flow<Map<UUID, UiEventContractPosition>> $contractIdToPositionsForGameFlow;
        final /* synthetic */ UUID $eventId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C162772(Flow<? extends Map<UUID, UiEventContractPosition>> flow, UUID uuid, Flow<? extends Map<UUID, EventContract>> flow2, Continuation<? super C162772> continuation) {
            super(2, continuation);
            this.$contractIdToPositionsForGameFlow = flow;
            this.$eventId = uuid;
            this.$allContractsFlow = flow2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162772 c162772 = GameDetailDuxo.this.new C162772(this.$contractIdToPositionsForGameFlow, this.$eventId, this.$allContractsFlow, continuation);
            c162772.L$0 = obj;
            return c162772;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C162772) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                StateFlow<GameDetailSelectionState> stateFlowStreamSelectionState = GameDetailDuxo.this.selectionStateProvider.streamSelectionState();
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(stateFlowStreamSelectionState, GameDetailDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(GameDetailDuxo.this, stateFlowStreamSelectionState, this.$contractIdToPositionsForGameFlow, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(GameDetailDuxo.this, this.$eventId, stateFlowStreamSelectionState, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(stateFlowStreamSelectionState, GameDetailDuxo.this, this.$allContractsFlow, this.$contractIdToPositionsForGameFlow, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(GameDetailDuxo.this, null), 3, null);
                return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(GameDetailDuxo.this, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {768}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ StateFlow<GameDetailSelectionState> $selectionStates;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(StateFlow<? extends GameDetailSelectionState> stateFlow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$selectionStates = stateFlow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$selectionStates, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<GameDetailSelectionState> stateFlow = this.$selectionStates;
                    final GameDetailDuxo gameDetailDuxo = this.this$0;
                    FlowCollector<? super GameDetailSelectionState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo.streamComboRelatedStates.2.1.1

                        /* compiled from: GameDetailDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$1$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C500341 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                            final /* synthetic */ GameDetailSelectionState $it;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C500341(GameDetailSelectionState gameDetailSelectionState, Continuation<? super C500341> continuation) {
                                super(2, continuation);
                                this.$it = gameDetailSelectionState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C500341 c500341 = new C500341(this.$it, continuation);
                                c500341.L$0 = obj;
                                return c500341;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                                return ((C500341) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                                return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : this.$it, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((GameDetailSelectionState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(GameDetailSelectionState gameDetailSelectionState, Continuation<? super Unit> continuation) {
                            gameDetailDuxo.applyMutation(new C500341(gameDetailSelectionState, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$2", m3645f = "GameDetailDuxo.kt", m3646l = {782}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, UiEventContractPosition>> $contractIdToPositionsForGameFlow;
            final /* synthetic */ StateFlow<GameDetailSelectionState> $selectionStates;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(GameDetailDuxo gameDetailDuxo, StateFlow<? extends GameDetailSelectionState> stateFlow, Flow<? extends Map<UUID, UiEventContractPosition>> flow, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
                this.$selectionStates = stateFlow;
                this.$contractIdToPositionsForGameFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$selectionStates, this.$contractIdToPositionsForGameFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.streamAllRelatedContractIdWithSidesForSelections(this.$selectionStates, this.$contractIdToPositionsForGameFlow), new C16245x8e15ecea(null, this.this$0));
                    C500352 c500352 = new C500352(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c500352, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$2$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$2$2, reason: invalid class name and collision with other inner class name */
            static final class C500352 extends ContinuationImpl7 implements Function2<Map<ContractIdWithSide, ? extends ContractDisplayDetails>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500352(GameDetailDuxo gameDetailDuxo, Continuation<? super C500352> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500352 c500352 = new C500352(this.this$0, continuation);
                    c500352.L$0 = obj;
                    return c500352;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<ContractIdWithSide, ? extends ContractDisplayDetails> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<ContractIdWithSide, ContractDisplayDetails>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<ContractIdWithSide, ContractDisplayDetails> map, Continuation<? super Unit> continuation) {
                    return ((C500352) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$2$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<ContractIdWithSide, ContractDisplayDetails> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Map<ContractIdWithSide, ContractDisplayDetails> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : this.$it, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
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

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$3", m3645f = "GameDetailDuxo.kt", m3646l = {794}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $eventId;
            final /* synthetic */ StateFlow<GameDetailSelectionState> $selectionStates;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(GameDetailDuxo gameDetailDuxo, UUID uuid, StateFlow<? extends GameDetailSelectionState> stateFlow, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
                this.$eventId = uuid;
                this.$selectionStates = stateFlow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$eventId, this.$selectionStates, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStrikeContractsForSelections = this.this$0.streamStrikeContractsForSelections(this.$eventId, this.$selectionStates);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStrikeContractsForSelections, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/StrikeContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$3$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<ContractIdWithSide, ? extends StrikeContract>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<ContractIdWithSide, ? extends StrikeContract> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<ContractIdWithSide, StrikeContract>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<ContractIdWithSide, StrikeContract> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$3$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500361 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<ContractIdWithSide, StrikeContract> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500361(Map<ContractIdWithSide, StrikeContract> map, Continuation<? super C500361> continuation) {
                        super(2, continuation);
                        this.$it = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500361 c500361 = new C500361(this.$it, continuation);
                        c500361.L$0 = obj;
                        return c500361;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500361) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : this.$it, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500361((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4", m3645f = "GameDetailDuxo.kt", m3646l = {842}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, EventContract>> $allContractsFlow;
            final /* synthetic */ Flow<Map<UUID, UiEventContractPosition>> $contractIdToPositionsForGameFlow;
            final /* synthetic */ StateFlow<GameDetailSelectionState> $selectionStates;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(StateFlow<? extends GameDetailSelectionState> stateFlow, GameDetailDuxo gameDetailDuxo, Flow<? extends Map<UUID, EventContract>> flow, Flow<? extends Map<UUID, UiEventContractPosition>> flow2, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$selectionStates = stateFlow;
                this.this$0 = gameDetailDuxo;
                this.$allContractsFlow = flow;
                this.$contractIdToPositionsForGameFlow = flow2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$selectionStates, this.this$0, this.$allContractsFlow, this.$contractIdToPositionsForGameFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.onEach(this.$selectionStates, new AnonymousClass1(this.this$0, null)), new C16246x3c51cea8(null, this.this$0, this.$allContractsFlow, this.$contractIdToPositionsForGameFlow));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailSelectionState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailSelectionState, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GameDetailSelectionState gameDetailSelectionState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(gameDetailSelectionState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500371 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C500371(Continuation<? super C500371> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500371 c500371 = new C500371(continuation);
                        c500371.L$0 = obj;
                        return c500371;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500371) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500371(null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$3", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<StreamComboQuoteUseCase3, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(StreamComboQuoteUseCase3 streamComboQuoteUseCase3, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(streamComboQuoteUseCase3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$3$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ StreamComboQuoteUseCase3 $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(StreamComboQuoteUseCase3 streamComboQuoteUseCase3, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = streamComboQuoteUseCase3;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : this.$it, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((StreamComboQuoteUseCase3) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$5", m3645f = "GameDetailDuxo.kt", m3646l = {851}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Integer> stateFlowStreamSelectedPropsCategoryIndex = this.this$0.selectionStateProvider.streamSelectedPropsCategoryIndex();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowStreamSelectedPropsCategoryIndex, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "selectedIndex", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$5$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
                /* synthetic */ int I$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.I$0 = ((Number) obj).intValue();
                    return anonymousClass1;
                }

                public final Object invoke(int i, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                    return invoke(num.intValue(), continuation);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$5$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500381 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ int $selectedIndex;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500381(int i, Continuation<? super C500381> continuation) {
                        super(2, continuation);
                        this.$selectedIndex = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500381 c500381 = new C500381(this.$selectedIndex, continuation);
                        c500381.L$0 = obj;
                        return c500381;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500381) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : this.$selectedIndex, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500381(this.I$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$6", m3645f = "GameDetailDuxo.kt", m3646l = {860}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Map<Integer, Boolean>> stateFlowStreamPropsExpansionState = this.this$0.selectionStateProvider.streamPropsExpansionState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowStreamPropsExpansionState, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "expansionState", "", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$6$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<Integer, ? extends Boolean>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<Integer, ? extends Boolean> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<Integer, Boolean>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<Integer, Boolean> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$6$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamComboRelatedStates$2$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500391 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<Integer, Boolean> $expansionState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500391(Map<Integer, Boolean> map, Continuation<? super C500391> continuation) {
                        super(2, continuation);
                        this.$expansionState = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500391 c500391 = new C500391(this.$expansionState, continuation);
                        c500391.L$0 = obj;
                        return c500391;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500391) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : this.$expansionState, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500391((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamComboRelatedStates(UUID uuid, Flow<? extends Map<UUID, UiEventContractPosition>> flow, Flow<? extends Map<UUID, EventContract>> flow2, Continuation<? super Job> continuation) {
        return CoroutineScope2.coroutineScope(new C162772(flow, uuid, flow2, null), continuation);
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "position", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamPositionContractIdWithSides$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamPositionContractIdWithSides$2 */
    static final class C162802 extends ContinuationImpl7 implements Function2<UiEventContractPosition, Continuation<? super List<? extends ContractIdWithSide>>, Object> {
        final /* synthetic */ UUID $contractId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C162802(UUID uuid, Continuation<? super C162802> continuation) {
            super(2, continuation);
            this.$contractId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162802 c162802 = new C162802(this.$contractId, continuation);
            c162802.L$0 = obj;
            return c162802;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(UiEventContractPosition uiEventContractPosition, Continuation<? super List<ContractIdWithSide>> continuation) {
            return ((C162802) create(uiEventContractPosition, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(UiEventContractPosition uiEventContractPosition, Continuation<? super List<? extends ContractIdWithSide>> continuation) {
            return invoke2(uiEventContractPosition, (Continuation<? super List<ContractIdWithSide>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UiEventContractPosition uiEventContractPosition = (UiEventContractPosition) this.L$0;
            if (uiEventContractPosition != null) {
                return CollectionsKt.listOf(new ContractIdWithSide(this.$contractId, ContractGroup5.getContractSide(uiEventContractPosition)));
            }
            return CollectionsKt.emptyList();
        }
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2 */
    static final class C162792 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ Flow<Map<UUID, UiEventContractPosition>> $contractIdToPositionsForGameFlow;
        final /* synthetic */ Flow<UUID> $eventIdFlow;
        final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C162792(Flow<? extends Optional<FuturesAccount>> flow, Flow<UUID> flow2, Flow<? extends Map<UUID, UiEventContractPosition>> flow3, Continuation<? super C162792> continuation) {
            super(2, continuation);
            this.$optionalSwapAccountFlow = flow;
            this.$eventIdFlow = flow2;
            this.$contractIdToPositionsForGameFlow = flow3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162792 c162792 = GameDetailDuxo.this.new C162792(this.$optionalSwapAccountFlow, this.$eventIdFlow, this.$contractIdToPositionsForGameFlow, continuation);
            c162792.L$0 = obj;
            return c162792;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C162792) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {971}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500431 extends ContinuationImpl7 implements Function2<BottomSheetSelection, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500431(GameDetailDuxo gameDetailDuxo, Continuation<? super C500431> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500431 c500431 = new C500431(this.this$0, continuation);
                    c500431.L$0 = obj;
                    return c500431;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BottomSheetSelection bottomSheetSelection, Continuation<? super Unit> continuation) {
                    return ((C500431) create(bottomSheetSelection, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$1$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500441 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ BottomSheetSelection $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500441(BottomSheetSelection bottomSheetSelection, Continuation<? super C500441> continuation) {
                        super(2, continuation);
                        this.$it = bottomSheetSelection;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500441 c500441 = new C500441(this.$it, continuation);
                        c500441.L$0 = obj;
                        return c500441;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500441) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : this.$it, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500441((BottomSheetSelection) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow2 stateFlow2 = this.this$0.bottomSheetSelectionStateFlow;
                    C500431 c500431 = new C500431(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow2, c500431, this) == coroutine_suspended) {
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
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(GameDetailDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(GameDetailDuxo.this, this.$optionalSwapAccountFlow, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.$eventIdFlow, GameDetailDuxo.this, null), 3, null);
                return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(GameDetailDuxo.this, this.$contractIdToPositionsForGameFlow, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2", m3645f = "GameDetailDuxo.kt", m3646l = {999}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(GameDetailDuxo gameDetailDuxo, Flow<? extends Optional<FuturesAccount>> flow, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
                this.$optionalSwapAccountFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$optionalSwapAccountFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowOnEach = FlowKt.onEach(this.this$0.bottomSheetSelectionStateFlow, new AnonymousClass1(this.this$0, null));
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<BottomSheetSelection.ContractOption>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super BottomSheetSelection.ContractOption> flowCollector, Continuation continuation) {
                            Object objCollect = flowOnEach.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    BottomSheetSelection bottomSheetSelection = (BottomSheetSelection) obj;
                                    BottomSheetSelection.ContractOption contractOption = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
                                    if (contractOption != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(contractOption, anonymousClass1) == coroutine_suspended) {
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
                    }, new C16253x9947ef12(null, this.$optionalSwapAccountFlow, this.this$0));
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BottomSheetSelection, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BottomSheetSelection bottomSheetSelection, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(bottomSheetSelection, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500451 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C500451(Continuation<? super C500451> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500451 c500451 = new C500451(continuation);
                        c500451.L$0 = obj;
                        return c500451;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500451) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500451(null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "estimatedFee", "Ljava/math/BigDecimal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$4", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<BigDecimal, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BigDecimal bigDecimal, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(bigDecimal, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$4$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$2$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ BigDecimal $estimatedFee;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BigDecimal bigDecimal, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$estimatedFee = bigDecimal;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$estimatedFee, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : this.$estimatedFee, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((BigDecimal) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3", m3645f = "GameDetailDuxo.kt", m3646l = {1021}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Flow<UUID> flow, GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = gameDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<UUID> flow = this.$eventIdFlow;
                    final StateFlow2 stateFlow2 = this.this$0.bottomSheetSelectionStateFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(flow, new Flow<BottomSheetSelection.ContractOption>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super BottomSheetSelection.ContractOption> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    BottomSheetSelection bottomSheetSelection = (BottomSheetSelection) obj;
                                    BottomSheetSelection.ContractOption contractOption = bottomSheetSelection instanceof BottomSheetSelection.ContractOption ? (BottomSheetSelection.ContractOption) bottomSheetSelection : null;
                                    if (contractOption != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(contractOption, anonymousClass1) == coroutine_suspended) {
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
                    }, new AnonymousClass2(null)), new C16257xf065dff1(null, this.this$0));
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "eventId", "selected", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection$ContractOption;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<UUID, BottomSheetSelection.ContractOption, Continuation<? super Tuples2<? extends UUID, ? extends ContractIdWithSide>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(UUID uuid, BottomSheetSelection.ContractOption contractOption, Continuation<? super Tuples2<? extends UUID, ? extends ContractIdWithSide>> continuation) {
                    return invoke2(uuid, contractOption, (Continuation<? super Tuples2<UUID, ContractIdWithSide>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(UUID uuid, BottomSheetSelection.ContractOption contractOption, Continuation<? super Tuples2<UUID, ContractIdWithSide>> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = uuid;
                    anonymousClass2.L$1 = contractOption;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Tuples4.m3642to((UUID) this.L$0, ((BottomSheetSelection.ContractOption) this.L$1).getData().getStrikeContract());
                }
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/StrikeContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$4", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Tuples2<? extends ContractIdWithSide, ? extends StrikeContract>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ContractIdWithSide, ? extends StrikeContract> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<ContractIdWithSide, StrikeContract>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<ContractIdWithSide, StrikeContract> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$4$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$3$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Tuples2<ContractIdWithSide, StrikeContract> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Tuples2<ContractIdWithSide, StrikeContract> tuples2, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = tuples2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : MapsKt.plus(gameDetailDataState.getContractIdToStrikeContract(), this.$it), ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Tuples2) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4", m3645f = "GameDetailDuxo.kt", m3646l = {1064}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, UiEventContractPosition>> $contractIdToPositionsForGameFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(GameDetailDuxo gameDetailDuxo, Flow<? extends Map<UUID, UiEventContractPosition>> flow, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = gameDetailDuxo;
                this.$contractIdToPositionsForGameFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$contractIdToPositionsForGameFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(FlowKt.onEach(this.this$0.bottomSheetSelectionStateFlow, new AnonymousClass1(this.this$0, null))), new C16260x4783d0d0(null, this.this$0, this.$contractIdToPositionsForGameFlow));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/event/gamedetail/BottomSheetSelection;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BottomSheetSelection, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BottomSheetSelection bottomSheetSelection, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(bottomSheetSelection, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500461(null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500461 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C500461(Continuation<? super C500461> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500461 c500461 = new C500461(continuation);
                        c500461.L$0 = obj;
                        return c500461;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500461) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4$3", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ContractDisplayDetails, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ContractDisplayDetails contractDisplayDetails, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(contractDisplayDetails, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4$3$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamOnBottomSheetSelection$2$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ ContractDisplayDetails $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ContractDisplayDetails contractDisplayDetails, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = contractDisplayDetails;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((AnonymousClass1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : this.$it, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ContractDisplayDetails) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamOnBottomSheetSelection(Flow<? extends Optional<FuturesAccount>> flow, Flow<UUID> flow2, Flow<? extends Map<UUID, UiEventContractPosition>> flow3, Continuation<? super Job> continuation) {
        return CoroutineScope2.coroutineScope(new C162792(flow, flow2, flow3, null), continuation);
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2 */
    static final class C162782 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ Flow<Set<UUID>> $contractGroupIdsFlow;
        final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
        final /* synthetic */ Flow<Boolean> $showAmericanOddsFlow;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ GameDetailDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C162782(Flow<? extends Set<UUID>> flow, Flow<Boolean> flow2, GameDetailDuxo gameDetailDuxo, Flow<? extends Optional<FuturesAccount>> flow3, Continuation<? super C162782> continuation) {
            super(2, continuation);
            this.$contractGroupIdsFlow = flow;
            this.$showAmericanOddsFlow = flow2;
            this.this$0 = gameDetailDuxo;
            this.$optionalSwapAccountFlow = flow3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162782 c162782 = new C162782(this.$contractGroupIdsFlow, this.$showAmericanOddsFlow, this.this$0, this.$optionalSwapAccountFlow, continuation);
            c162782.L$0 = obj;
            return c162782;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C162782) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: GameDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1", m3645f = "GameDetailDuxo.kt", m3646l = {1097}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Set<UUID>> $contractGroupIdsFlow;
            final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
            final /* synthetic */ Flow<Boolean> $showAmericanOddsFlow;
            int label;
            final /* synthetic */ GameDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Flow<? extends Set<UUID>> flow, Flow<Boolean> flow2, GameDetailDuxo gameDetailDuxo, Flow<? extends Optional<FuturesAccount>> flow3, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$contractGroupIdsFlow = flow;
                this.$showAmericanOddsFlow = flow2;
                this.this$0 = gameDetailDuxo;
                this.$optionalSwapAccountFlow = flow3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$contractGroupIdsFlow, this.$showAmericanOddsFlow, this.this$0, this.$optionalSwapAccountFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.onEach(FlowKt.distinctUntilChanged(Operators.connectWhen(this.$contractGroupIdsFlow, this.$showAmericanOddsFlow, FlowKt.flowOf(SetsKt.emptySet()))), new C500401(this.this$0, null)), new C16250x214b23c6(null, this.$optionalSwapAccountFlow, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500401 extends ContinuationImpl7 implements Function2<Set<? extends UUID>, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500401(GameDetailDuxo gameDetailDuxo, Continuation<? super C500401> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C500401(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Set<? extends UUID> set, Continuation<? super Unit> continuation) {
                    return invoke2((Set<UUID>) set, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Set<UUID> set, Continuation<? super Unit> continuation) {
                    return ((C500401) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500411(null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500411 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C500411(Continuation<? super C500411> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500411 c500411 = new C500411(continuation);
                        c500411.L$0 = obj;
                        return c500411;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500411) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : MapsKt.emptyMap());
                    }
                }
            }

            /* compiled from: GameDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contractIdToEstimatedFees", "", "Ljava/util/UUID;", "Ljava/math/BigDecimal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$3", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends BigDecimal>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GameDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(GameDetailDuxo gameDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = gameDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Map<UUID, ? extends BigDecimal> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: GameDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$3$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$streamEstimatedFeesForAmericanOdds$2$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C500421 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
                    final /* synthetic */ Map<UUID, BigDecimal> $contractIdToEstimatedFees;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C500421(Map<UUID, ? extends BigDecimal> map, Continuation<? super C500421> continuation) {
                        super(2, continuation);
                        this.$contractIdToEstimatedFees = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500421 c500421 = new C500421(this.$contractIdToEstimatedFees, continuation);
                        c500421.L$0 = obj;
                        return c500421;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
                        return ((C500421) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
                        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : null, (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : this.$contractIdToEstimatedFees);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500421((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(this.$contractGroupIdsFlow, this.$showAmericanOddsFlow, this.this$0, this.$optionalSwapAccountFlow, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamEstimatedFeesForAmericanOdds(Flow<? extends Optional<FuturesAccount>> flow, Flow<? extends Set<UUID>> flow2, Flow<Boolean> flow3, Continuation<? super Job> continuation) {
        return CoroutineScope2.coroutineScope(new C162782(flow2, flow3, this, flow, null), continuation);
    }

    /* compiled from: GameDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/event/gamedetail/GameDetailDuxo;", "Lcom/robinhood/android/eventcontracts/contracts/GameDetailFragmentKeyInternalOnly;", "<init>", "()V", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GameDetailDuxo, GameDetailFragmentKeyInternalOnly> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GameDetailFragmentKeyInternalOnly getArgs(SavedStateHandle savedStateHandle) {
            return (GameDetailFragmentKeyInternalOnly) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GameDetailFragmentKeyInternalOnly getArgs(GameDetailDuxo gameDetailDuxo) {
            return (GameDetailFragmentKeyInternalOnly) DuxoCompanion.DefaultImpls.getArgs(this, gameDetailDuxo);
        }
    }
}
