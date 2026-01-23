package com.robinhood.android.chart.equityadvancedchart;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EquityInstrumentDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.HapticStyleDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.MobileAppFeature;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderEditedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderPayloadDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderSubmittedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.QuoteDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartInstrumentDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartAlert;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartDialog;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartSnackbar;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction2;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.GenericAdvanceChartOrderAction3;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.HapticEvent;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.LaunchActivity;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.LaunchDeeplink;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.SetChartScreenState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.AutoSendRenew;
import com.robinhood.android.chart.blackwidowadvancedchart.models.AutoSendUpsell;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.android.chart.blackwidowadvancedchart.models.CancelOrder;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartCursorPrice;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartTradeAction;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartTradeAction5;
import com.robinhood.android.chart.blackwidowadvancedchart.models.EditOrder;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SpanIntervalData;
import com.robinhood.android.chart.blackwidowadvancedchart.models.StartEditOrder;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SubmitOrder;
import com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.buysell.BuySellHelper;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.equities.equitytrade.EquityTradeService;
import com.robinhood.android.equities.equitytrade.OrderStatusAlert;
import com.robinhood.android.equities.equitytrade.OrderStatusEvent;
import com.robinhood.android.equities.equitytrade.OrderSubmitResult;
import com.robinhood.android.equities.equityupsell.EquityUpsell;
import com.robinhood.android.equities.equityupsell.EquityUpsellService;
import com.robinhood.android.equities.equityupsell.UpsellLocation;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore2;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.equityadvancedorder.utils.EquityPriceScaling;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.api.ApiOrderExpireDate;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderChecksAlert;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.EquityPositionType;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.serverdriven.p347db.ActionButton;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.nbbo.models.api.ApiNbboSummary;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import com.robinhood.shared.equities.store.subzero.SubzeroOnboardingHandler;
import com.robinhood.shared.equities.store.subzero.SubzeroOnboardingHandler2;
import com.robinhood.shared.equities.store.subzero.SubzeroOnboardingHandler3;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.utils.Optional;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import retrofit2.Response;

/* compiled from: EquityAdvanceChartOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004BÉ\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\u001a\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020:H\u0016J(\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020:H\u0002J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0087@¢\u0006\u0002\u0010JJ\u0016\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020MH\u0082@¢\u0006\u0002\u0010NJ\u000e\u0010O\u001a\u00020GH\u0082@¢\u0006\u0002\u0010PJ<\u0010Q\u001a\u00020G2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020>2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010VH\u0002J\u0016\u0010Y\u001a\u00020G2\u0006\u0010Z\u001a\u00020[H\u0087@¢\u0006\u0002\u0010\\J\b\u0010]\u001a\u00020GH\u0002J\b\u0010^\u001a\u00020GH\u0002J\u0016\u0010_\u001a\u00020G2\u0006\u0010Z\u001a\u00020`H\u0087@¢\u0006\u0002\u0010aJ\u0010\u0010b\u001a\u00020G2\u0006\u0010c\u001a\u00020dH\u0002J\u0010\u0010e\u001a\u00020G2\u0006\u0010f\u001a\u00020gH\u0002J\u0010\u0010h\u001a\u00020G2\u0006\u0010i\u001a\u00020jH\u0016J\u0010\u0010k\u001a\u00020G2\u0006\u0010Z\u001a\u00020lH\u0016J\u0016\u0010m\u001a\u00020G2\u0006\u0010Z\u001a\u00020nH\u0087@¢\u0006\u0002\u0010oJ&\u0010p\u001a\u00020G2\u0006\u0010B\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010W\u001a\u00020:H\u0096@¢\u0006\u0002\u0010tJ\u001e\u0010u\u001a\u00020G2\u0006\u0010r\u001a\u00020v2\u0006\u0010W\u001a\u00020:H\u0082@¢\u0006\u0002\u0010wJ[\u0010x\u001a\u00020G2\u0006\u0010r\u001a\u00020v2\u0006\u0010W\u001a\u00020:2\u0006\u0010B\u001a\u00020C2\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010{\u001a\u0004\u0018\u00010z2\b\u0010|\u001a\u0004\u0018\u00010g2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020>0~2\u0006\u0010\u007f\u001a\u00020AH\u0086@¢\u0006\u0003\u0010\u0080\u0001J\u001f\u0010\u0081\u0001\u001a\u00020G2\u0006\u0010r\u001a\u00020v2\u0006\u0010W\u001a\u00020:H\u0082@¢\u0006\u0002\u0010wJ'\u0010\u0082\u0001\u001a\u00020G2\u0006\u0010B\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010W\u001a\u00020:H\u0096@¢\u0006\u0002\u0010tJ\u0012\u0010\u0083\u0001\u001a\u00020G2\u0007\u0010\u0084\u0001\u001a\u00020AH\u0016J\u0015\u0010\u0085\u0001\u001a\u00020G*\u00030\u0086\u0001H\u0082@¢\u0006\u0003\u0010\u0087\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0088\u0001"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDuxo;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderDuxo;", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "equityOrderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "equityTradeService", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "tradeSettingsStore", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "subzeroOnboardingHandler", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "equityUpsellService", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/equity/submission/EquityOrderManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;Lcom/robinhood/android/equities/equitytrade/EquityTradeService;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/common/buysell/BuySellStore;Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "lastSuccessOrderId", "Ljava/util/UUID;", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "instrumentId", "handleSubzeroOnboarding", "", "tradeSide", "Lcom/robinhood/models/db/EquityOrderSide;", "accountType", "Lcom/robinhood/models/api/AccountType;", "handleOrderStatusEvents", "", "event", "Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent;", "(Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyOrderFailed", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleChartTradeActions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logChartInteraction", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "identifier", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/idl/IdlDecimal;", "refId", "tradeAmount", "handleCancelOrder", "action", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/CancelOrder;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/CancelOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTradingOnChart", "refreshNbbo", "handleEditOrderAction", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/EditOrder;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/EditOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOrderThrowable", "throwable", "", "displayOrderSubmittedSnackbar", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "onTradeAmountUpdated", "amount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "handleGenericAdvanceChartOrderAction", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/GenericAdvanceChartOrderAction;", "handleSubmitOrderChartAction", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SubmitOrder;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SubmitOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTrade", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "orderState", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleBuyMarket", "Lcom/robinhood/android/chart/equityadvancedchart/MacEquityOrderState;", "(Lcom/robinhood/android/chart/equityadvancedchart/MacEquityOrderState;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateAndSubmit", "limitPrice", "Ljava/math/BigDecimal;", "stopPrice", "existingOrder", "checkOverrides", "", "autoSend", "(Lcom/robinhood/android/chart/equityadvancedchart/MacEquityOrderState;Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/Order;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSellMarket", "onConfirmed", "onAutoSendToggled", "enabled", "handleOrderSubmitResult", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "(Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EquityAdvanceChartOrderDuxo extends AdvanceChartOrderDuxo<EquityAdvanceChartOrderDataState, EquityAdvanceChartOrderViewState> implements HasSavedState {
    public static final int $stable = 8;
    private final AccountAccessStore accountAccessStore;
    private final AccountStore accountStore;
    private final BuySellStore buySellStore;
    private final BwWebViewManager bwWebViewManager;
    private final EquityOrderManager equityOrderManager;
    private final EquityTradeService equityTradeService;
    private final EquityUpsellService equityUpsellService;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final InstrumentBuyingPowerStore instrumentBuyingPowerStore;
    private final InstrumentStore instrumentStore;
    private UUID lastSuccessOrderId;
    private final TraderMarketHoursManager marketHoursManager;
    private final NbboSummaryStore nbboSummaryStore;
    private final OptionUpgradePromotionStore optionUpgradePromotionStore;
    private final EquityOrderExpireDateStore orderExpireDateStore;
    private final OrderStore orderStore;
    private final PositionStore positionStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final ShortingInfoStore shortingInfoStore;
    private final SubzeroOnboardingHandler subzeroOnboardingHandler;
    private final TradeSettingsStore tradeSettingsStore;

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BwTradeSide.values().length];
            try {
                iArr2[BwTradeSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BwTradeSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {720, 727, 743, 746}, m3647m = "handleCancelOrder")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleCancelOrder$1 */
    static final class C109341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C109341(Continuation<? super C109341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityAdvanceChartOrderDuxo.this.handleCancelOrder(null, this);
        }
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {779, 788, 799}, m3647m = "handleEditOrderAction")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleEditOrderAction$1 */
    static final class C109361 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C109361(Continuation<? super C109361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityAdvanceChartOrderDuxo.this.handleEditOrderAction(null, this);
        }
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {573, 578, 584, 591}, m3647m = "handleOrderStatusEvents")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleOrderStatusEvents$1 */
    static final class C109401 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C109401(Continuation<? super C109401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityAdvanceChartOrderDuxo.this.handleOrderStatusEvents(null, this);
        }
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {1341, 1353, 1361}, m3647m = "handleOrderSubmitResult")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleOrderSubmitResult$1 */
    static final class C109411 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C109411(Continuation<? super C109411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityAdvanceChartOrderDuxo.this.handleOrderSubmitResult(null, this);
        }
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {1138, 1148}, m3647m = "validateAndSubmit")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$validateAndSubmit$1 */
    static final class C109491 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C109491(Continuation<? super C109491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityAdvanceChartOrderDuxo.this.validateAndSubmit(null, null, null, null, null, null, null, false, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EquityAdvanceChartOrderDuxo(AccountStore accountStore, TraderMarketHoursManager marketHoursManager, EquityOrderExpireDateStore orderExpireDateStore, PositionStore positionStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, InstrumentStore instrumentStore, BwWebViewManager bwWebViewManager, AccountAccessStore accountAccessStore, EquityOrderManager equityOrderManager, SavedStateHandle savedStateHandle, OrderStore orderStore, ExperimentsStore experimentsStore, NbboSummaryStore nbboSummaryStore, OptionUpgradePromotionStore optionUpgradePromotionStore, EquityTradeService equityTradeService, EventLogger eventLogger, TradeSettingsStore tradeSettingsStore, RegionGateProvider regionGateProvider, BuySellStore buySellStore, ShortingInfoStore shortingInfoStore, SubzeroOnboardingHandler subzeroOnboardingHandler, EquityUpsellService equityUpsellService, DuxoBundle duxoBundle, EquityAdvanceChartOrderStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
        Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(subzeroOnboardingHandler, "subzeroOnboardingHandler");
        Intrinsics.checkNotNullParameter(equityUpsellService, "equityUpsellService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        super(new EquityAdvanceChartOrderDataState(null, null, null, new Quantity(ONE), null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -9, null), stateProvider, duxoBundle);
        this.accountStore = accountStore;
        this.marketHoursManager = marketHoursManager;
        this.orderExpireDateStore = orderExpireDateStore;
        this.positionStore = positionStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.instrumentStore = instrumentStore;
        this.bwWebViewManager = bwWebViewManager;
        this.accountAccessStore = accountAccessStore;
        this.equityOrderManager = equityOrderManager;
        this.savedStateHandle = savedStateHandle;
        this.orderStore = orderStore;
        this.experimentsStore = experimentsStore;
        this.nbboSummaryStore = nbboSummaryStore;
        this.optionUpgradePromotionStore = optionUpgradePromotionStore;
        this.equityTradeService = equityTradeService;
        this.eventLogger = eventLogger;
        this.tradeSettingsStore = tradeSettingsStore;
        this.regionGateProvider = regionGateProvider;
        this.buySellStore = buySellStore;
        this.shortingInfoStore = shortingInfoStore;
        this.subzeroOnboardingHandler = subzeroOnboardingHandler;
        this.equityUpsellService = equityUpsellService;
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1 */
    static final class C109321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109321(UUID uuid, String str, Continuation<? super C109321> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109321 c109321 = EquityAdvanceChartOrderDuxo.this.new C109321(this.$instrumentId, this.$accountNumber, continuation);
            c109321.L$0 = obj;
            return c109321;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(EquityAdvanceChartOrderDuxo.this.instrumentStore.getInstrument(this.$instrumentId)), Integer.MAX_VALUE, null, 2, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(EquityAdvanceChartOrderDuxo.this, this.$instrumentId, flowBuffer$default, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(flowBuffer$default, EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(flowBuffer$default, EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(EquityAdvanceChartOrderDuxo.this, this.$instrumentId, this.$accountNumber, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(EquityAdvanceChartOrderDuxo.this, this.$instrumentId, null), 3, null);
                String str = this.$accountNumber;
                if (str != null) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(Context7.buffer$default(RxConvert.asFlow(EquityAdvanceChartOrderDuxo.this.accountStore.streamAccount(this.$accountNumber)), Integer.MAX_VALUE, null, 2, null), EquityAdvanceChartOrderDuxo.this, flowBuffer$default, this.$instrumentId, this.$accountNumber, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(EquityAdvanceChartOrderDuxo.this, this.$accountNumber, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(EquityAdvanceChartOrderDuxo.this, this.$instrumentId, this.$accountNumber, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass13(EquityAdvanceChartOrderDuxo.this, this.$instrumentId, this.$accountNumber, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass14(EquityAdvanceChartOrderDuxo.this, this.$accountNumber, null), 3, null);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass15(flowBuffer$default, EquityAdvanceChartOrderDuxo.this, this.$instrumentId, str, null), 3, null);
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass16(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass17(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass18(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass19(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass20(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass21(EquityAdvanceChartOrderDuxo.this, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass22(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass23(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass24(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass25(EquityAdvanceChartOrderDuxo.this, null), 3, null);
                FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(EquityAdvanceChartOrderDuxo.this.bwWebViewManager.getScrubMode()), new AnonymousClass26(EquityAdvanceChartOrderDuxo.this, null)), coroutineScope);
                FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(EquityAdvanceChartOrderDuxo.this.bwWebViewManager.getQuote()), new AnonymousClass27(EquityAdvanceChartOrderDuxo.this, null)), coroutineScope);
                FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(EquityAdvanceChartOrderDuxo.this.bwWebViewManager.getCurrentIndicators()), new AnonymousClass28(EquityAdvanceChartOrderDuxo.this, null)), coroutineScope);
                FlowKt.launchIn(FlowKt.onEach(EquityAdvanceChartOrderDuxo.this.bwWebViewManager.getActiveTemplate(), new AnonymousClass29(EquityAdvanceChartOrderDuxo.this, null)), coroutineScope);
                FlowKt.launchIn(FlowKt.onEach(EquityAdvanceChartOrderDuxo.this.bwWebViewManager.getSpanIntervalData(), new AnonymousClass30(EquityAdvanceChartOrderDuxo.this, null)), coroutineScope);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, UUID uuid, Flow<Instrument> flow, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$instrumentId = uuid;
                this.$instrumentFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$instrumentId, this.$instrumentFlow, continuation);
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
                    this.this$0.instrumentStore.refresh(false, this.$instrumentId);
                    Flow<Instrument> flow = this.$instrumentFlow;
                    C496561 c496561 = new C496561(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c496561, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496561 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496561(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super C496561> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496561 c496561 = new C496561(this.this$0, continuation);
                    c496561.L$0 = obj;
                    return c496561;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                    return ((C496561) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$1$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496571 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ Instrument $instrument;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496571(Instrument instrument, Continuation<? super C496571> continuation) {
                        super(2, continuation);
                        this.$instrument = instrument;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496571 c496571 = new C496571(this.$instrument, continuation);
                        c496571.L$0 = obj;
                        return c496571;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496571) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, this.$instrument, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -5, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496571((Instrument) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$2", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {200}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<Instrument> flow, EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$instrumentFlow = flow;
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$instrumentFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$instrumentFlow, new C10930xefa44d7(null, this.this$0));
                    C496662 c496662 = new C496662(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c496662, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$2$2", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C496662 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496662(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super C496662> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496662 c496662 = new C496662(this.this$0, continuation);
                    c496662.L$0 = obj;
                    return c496662;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderMarketHours orderMarketHours, Continuation<? super Unit> continuation) {
                    return ((C496662) create(orderMarketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$2$2$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $tradingSession;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OrderMarketHours orderMarketHours, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$tradingSession = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradingSession, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, this.$tradingSession, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -129, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((OrderMarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$3", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Flow<Instrument> flow, EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$instrumentFlow = flow;
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$instrumentFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$instrumentFlow, new C10931x661835b6(null, this.this$0));
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$3$2", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderMarketHours orderMarketHours, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(orderMarketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$3$2$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $tradingSession;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OrderMarketHours orderMarketHours, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$tradingSession = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradingSession, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, this.$tradingSession, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -257, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((OrderMarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$4", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
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
                    Flow<OrderStatusEvent> flowStreamSubmittedOrderStatusEvents = this.this$0.equityTradeService.streamSubmittedOrderStatusEvents();
                    final EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo = this.this$0;
                    FlowCollector<? super OrderStatusEvent> flowCollector = new FlowCollector() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo.bind.1.4.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((OrderStatusEvent) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(OrderStatusEvent orderStatusEvent, Continuation<? super Unit> continuation) {
                            Object objHandleOrderStatusEvents = equityAdvanceChartOrderDuxo.handleOrderStatusEvents(orderStatusEvent, continuation);
                            return objHandleOrderStatusEvents == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleOrderStatusEvents : Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowStreamSubmittedOrderStatusEvents.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$5", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$5$1, reason: invalid class name */
            static final class AnonymousClass1<T> implements FlowCollector {
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo) {
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((OrderStatusAlert) obj, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(final OrderStatusAlert orderStatusAlert, Continuation<? super Unit> continuation) {
                    if (orderStatusAlert instanceof OrderStatusAlert.PdtSnackbar) {
                        EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo = this.this$0;
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ALERT_16;
                        StringResource.Companion companion = StringResource.INSTANCE;
                        StringResource stringResourceInvoke = companion.invoke(((OrderStatusAlert.PdtSnackbar) orderStatusAlert).getPdt().getTitle());
                        StringResource stringResourceInvoke2 = companion.invoke(C10954R.string.equity_pdt_snackbar_action_text, new Object[0]);
                        final EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo2 = this.this$0;
                        equityAdvanceChartOrderDuxo.submit(new ChartSnackbar(serverToBentoAssetMapper2, stringResourceInvoke, stringResourceInvoke2, new Function0() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$5$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityAdvanceChartOrderDuxo.C109321.AnonymousClass5.AnonymousClass1.emit$lambda$1(orderStatusAlert, equityAdvanceChartOrderDuxo2);
                            }
                        }));
                    } else {
                        if (!(orderStatusAlert instanceof OrderStatusAlert.PdtAlert)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.submit(new ChartAlert(((OrderStatusAlert.PdtAlert) orderStatusAlert).getPdt()));
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit emit$lambda$1(OrderStatusAlert orderStatusAlert, EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo) {
                    Uri action = ((ActionButton) CollectionsKt.first((List) ((OrderStatusAlert.PdtSnackbar) orderStatusAlert).getPdt().getActionButtons())).getAction();
                    if (action != null) {
                        equityAdvanceChartOrderDuxo.submit(new LaunchDeeplink(action));
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<OrderStatusAlert> flowStreamOrderStatusAlerts = this.this$0.equityTradeService.streamOrderStatusAlerts();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (flowStreamOrderStatusAlerts.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$6", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
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
                    EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo = this.this$0;
                    this.label = 1;
                    if (equityAdvanceChartOrderDuxo.handleChartTradeActions(this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$7", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.this$0.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$7$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
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

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$7$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496731 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ boolean $isEnabled;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496731(boolean z, Continuation<? super C496731> continuation) {
                        super(2, continuation);
                        this.$isEnabled = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496731 c496731 = new C496731(this.$isEnabled, continuation);
                        c496731.L$0 = obj;
                        return c496731;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496731) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, this.$isEnabled, null, false, null, false, -134217729, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496731(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$8", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, UUID uuid, String str, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$instrumentId = uuid;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, this.$instrumentId, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/common/buysell/BuySellData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$8$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BuySellData, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BuySellData buySellData, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(buySellData, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$8$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496741 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ BuySellData $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496741(BuySellData buySellData, Continuation<? super C496741> continuation) {
                        super(2, continuation);
                        this.$it = buySellData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496741 c496741 = new C496741(this.$it, continuation);
                        c496741.L$0 = obj;
                        return c496741;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496741) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, this.$it, false, null, false, -268435457, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496741((BuySellData) this.L$0, null));
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
                    Flow<BuySellData> buySellData = this.this$0.buySellStore.getBuySellData(this.$instrumentId, this.$accountNumber);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(buySellData, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$9", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, UUID uuid, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<ShortingInfo> flowStreamShortingInfo = this.this$0.shortingInfoStore.streamShortingInfo(this.$instrumentId);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamShortingInfo, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$9$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ShortingInfo, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ShortingInfo shortingInfo, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(shortingInfo, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$9$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496751 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ ShortingInfo $shortingInfo;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496751(ShortingInfo shortingInfo, Continuation<? super C496751> continuation) {
                        super(2, continuation);
                        this.$shortingInfo = shortingInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496751 c496751 = new C496751(this.$shortingInfo, continuation);
                        c496751.L$0 = obj;
                        return c496751;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496751) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, this.$shortingInfo, false, -1073741825, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496751((ShortingInfo) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$10", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Account> $accountFlow;
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(Flow<Account> flow, EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Flow<Instrument> flow2, UUID uuid, String str, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.$accountFlow = flow;
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$instrumentFlow = flow2;
                this.$instrumentId = uuid;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.$accountFlow, this.this$0, this.$instrumentFlow, this.$instrumentId, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Account> flow = this.$accountFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$instrumentFlow, this.$instrumentId, this.$accountNumber, null);
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$10$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.f2776x87e624cb, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $accountNumber;
                final /* synthetic */ Flow<Instrument> $instrumentFlow;
                final /* synthetic */ UUID $instrumentId;
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Flow<Instrument> flow, UUID uuid, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                    this.$instrumentFlow = flow;
                    this.$instrumentId = uuid;
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$instrumentFlow, this.$instrumentId, this.$accountNumber, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$10$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$10$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496581 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ Account $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496581(Account account, Continuation<? super C496581> continuation) {
                        super(2, continuation);
                        this.$it = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496581 c496581 = new C496581(this.$it, continuation);
                        c496581.L$0 = obj;
                        return c496581;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496581) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, this.$it, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -8193, null);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
                
                    if (r5.setChartInstrument(r6, r11, r10) == r0) goto L21;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Account account;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        account = (Account) this.L$0;
                        this.this$0.applyMutation(new C496581(account, null));
                        Flow<Instrument> flow = this.$instrumentFlow;
                        this.L$0 = account;
                        this.label = 1;
                        obj = FlowKt.first(flow, this);
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
                    account = (Account) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Instrument instrument = (Instrument) obj;
                    BwWebViewManager bwWebViewManager = this.this$0.bwWebViewManager;
                    String string2 = this.$instrumentId.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    SetChartInstrumentDto.InstrumentDto.EquityInstrument equityInstrument = new SetChartInstrumentDto.InstrumentDto.EquityInstrument(new EquityInstrumentDto(string2, instrument.getSymbol(), instrument.getTradableChainId() != null && OptionLevel.INSTANCE.canTradeOptions(account.getOptionLevel())));
                    String str = this.$accountNumber;
                    this.L$0 = null;
                    this.label = 2;
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$11", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, String str, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.this$0, this.$accountNumber, continuation);
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
                    Flow<Set<AccountFeature>> accessibleFeatures = this.this$0.accountAccessStore.getAccessibleFeatures(this.$accountNumber);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(accessibleFeatures, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/librobinhood/data/store/AccountFeature;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$11$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$11$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Set<? extends AccountFeature>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Set<? extends AccountFeature> set, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$11$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$11$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496591 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ Set<AccountFeature> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C496591(Set<? extends AccountFeature> set, Continuation<? super C496591> continuation) {
                        super(2, continuation);
                        this.$it = set;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496591 c496591 = new C496591(this.$it, continuation);
                        c496591.L$0 = obj;
                        return c496591;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496591) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, this.$it, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -16385, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496591((Set) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$12", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, UUID uuid, String str, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$instrumentId = uuid;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, this.$instrumentId, this.$accountNumber, continuation);
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
                    Flow<InstrumentBuyingPower> flowAsFlow = this.this$0.instrumentBuyingPowerStore.getStreamSelectedAccountBuyingPowerForInstrument().asFlow(Tuples4.m3642to(this.$instrumentId, this.$accountNumber));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$12$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$12$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentBuyingPower, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentBuyingPower instrumentBuyingPower, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(instrumentBuyingPower, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$12$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$12$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496601 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ InstrumentBuyingPower $buyingPower;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496601(InstrumentBuyingPower instrumentBuyingPower, Continuation<? super C496601> continuation) {
                        super(2, continuation);
                        this.$buyingPower = instrumentBuyingPower;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496601 c496601 = new C496601(this.$buyingPower, continuation);
                        c496601.L$0 = obj;
                        return c496601;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496601) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, this.$buyingPower, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -3, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496601((InstrumentBuyingPower) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$13", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {335}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, UUID uuid, String str, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$instrumentId = uuid;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.this$0, this.$instrumentId, this.$accountNumber, continuation);
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PositionStore.getPositionForAccountOptional$default(this.this$0.positionStore, this.$instrumentId, this.$accountNumber, false, 4, null)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "position", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Position;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$13$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$13$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends Position>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
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

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$13$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$13$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496611 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ Optional<Position> $position;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496611(Optional<Position> optional, Continuation<? super C496611> continuation) {
                        super(2, continuation);
                        this.$position = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496611 c496611 = new C496611(this.$position, continuation);
                        c496611.L$0 = obj;
                        return c496611;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496611) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, this.$position.getOrNull(), false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -17, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496611((Optional) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$14", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {344}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$14, reason: invalid class name */
        static final class AnonymousClass14 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass14(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, String str, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.this$0, this.$accountNumber, continuation);
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
                    Flow flowStreamShouldShowOptionsUpgradeOnSdp$default = OptionUpgradePromotionStore.streamShouldShowOptionsUpgradeOnSdp$default(this.this$0.optionUpgradePromotionStore, this.$accountNumber, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamShouldShowOptionsUpgradeOnSdp$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "shouldShow", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore$ShowOptionsUpgradeOnSdp;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$14$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$14$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsUpgradeOnSdp, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(showOptionsUpgradeOnSdp, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$14$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$14$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496621 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp $shouldShow;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$14$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.values().length];
                            try {
                                iArr[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.CLIENT_DEFAULT.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.SERVER_SHOULD_SHOW.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.SERVER_SHOULD_NOT_SHOW.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496621(OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsUpgradeOnSdp, Continuation<? super C496621> continuation) {
                        super(2, continuation);
                        this.$shouldShow = showOptionsUpgradeOnSdp;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496621 c496621 = new C496621(this.$shouldShow, continuation);
                        c496621.L$0 = obj;
                        return c496621;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496621) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState = (EquityAdvanceChartOrderDataState) this.L$0;
                        int i = WhenMappings.$EnumSwitchMapping$0[this.$shouldShow.ordinal()];
                        boolean z = true;
                        if (i != 1 && i != 2) {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = false;
                        }
                        return EquityAdvanceChartOrderDataState.copy$default(equityAdvanceChartOrderDataState, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, z, null, null, null, null, false, null, false, null, false, -4194305, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496621((OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$15", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {361, 362}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$15, reason: invalid class name */
        static final class AnonymousClass15 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass15(Flow<Instrument> flow, EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, UUID uuid, String str, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.$instrumentFlow = flow;
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$instrumentId = uuid;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.$instrumentFlow, this.this$0, this.$instrumentId, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
            
                if (r1.setChartInstrument(r3, r8, r7) == r0) goto L15;
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
                    Flow<Instrument> flow = this.$instrumentFlow;
                    this.label = 1;
                    obj = FlowKt.first(flow, this);
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
                BwWebViewManager bwWebViewManager = this.this$0.bwWebViewManager;
                String string2 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                SetChartInstrumentDto.InstrumentDto.EquityInstrument equityInstrument = new SetChartInstrumentDto.InstrumentDto.EquityInstrument(new EquityInstrumentDto(string2, ((Instrument) obj).getSymbol(), false));
                String str = this.$accountNumber;
                this.label = 2;
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$16", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {376}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$16, reason: invalid class name */
        static final class AnonymousClass16 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass16(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass16> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass16(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "features", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileAppFeature;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$16$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$16$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends MobileAppFeature>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(List<? extends MobileAppFeature> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$16$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$16$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496631 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ List<MobileAppFeature> $features;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C496631(List<? extends MobileAppFeature> list, Continuation<? super C496631> continuation) {
                        super(2, continuation);
                        this.$features = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496631 c496631 = new C496631(this.$features, continuation);
                        c496631.L$0 = obj;
                        return c496631;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496631) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, this.$features.contains(MobileAppFeature.MOBILE_APP_FEATURE_EQUITIES_SHORTING), null, false, -536870913, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496631((List) this.L$0, null));
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
                    Flow<List<MobileAppFeature>> chartFeatures = this.this$0.bwWebViewManager.getChartFeatures();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(chartFeatures, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$17", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {390}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$17, reason: invalid class name */
        static final class AnonymousClass17 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass17(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass17> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass17(this.this$0, continuation);
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.marketHoursManager.nextOpenMarketHoursObservable()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$17$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$17$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarketHours marketHours, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(marketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$17$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$17$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496641 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ MarketHours $marketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496641(MarketHours marketHours, Continuation<? super C496641> continuation) {
                        super(2, continuation);
                        this.$marketHours = marketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496641 c496641 = new C496641(this.$marketHours, continuation);
                        c496641.L$0 = obj;
                        return c496641;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496641) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, this.$marketHours, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -65, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496641((MarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$18", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {398}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$18, reason: invalid class name */
        static final class AnonymousClass18 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass18(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass18> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass18(this.this$0, continuation);
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
                    EquityOrderExpireDateStore equityOrderExpireDateStore = this.this$0.orderExpireDateStore;
                    this.label = 1;
                    obj = equityOrderExpireDateStore.getExpireDate(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.applyMutation(new AnonymousClass1(((ApiOrderExpireDate) obj).getGtc_expire_datetime(), null));
                return Unit.INSTANCE;
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$18$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$18$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                final /* synthetic */ String $orderExpStr;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$orderExpStr = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$orderExpStr, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, this.$orderExpStr, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -2049, null);
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$19", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {405}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$19, reason: invalid class name */
        static final class AnonymousClass19 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass19(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass19> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass19(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass19) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$19$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$19$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
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

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$19$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$19$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496651 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496651(boolean z, Continuation<? super C496651> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496651 c496651 = new C496651(this.$it, continuation);
                        c496651.L$0 = obj;
                        return c496651;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496651) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, this.$it, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -32769, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496651(this.Z$0, null));
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquityMacAutoSendKillSwitch.INSTANCE}, false, null, 6, null);
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

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$20", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {413}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$20, reason: invalid class name */
        static final class AnonymousClass20 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass20(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass20> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass20(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass20) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$20$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$20$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
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

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$20$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$20$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496671 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496671(boolean z, Continuation<? super C496671> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496671 c496671 = new C496671(this.$it, continuation);
                        c496671.L$0 = obj;
                        return c496671;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496671) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, this.$it, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -65537, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496671(this.Z$0, null));
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 6, null);
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

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$21", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {421}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$21, reason: invalid class name */
        static final class AnonymousClass21 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass21(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, UUID uuid, Continuation<? super AnonymousClass21> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass21(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass21) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/nbbo/models/db/NbboSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$21$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$21$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<NbboSummary, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(NbboSummary nbboSummary, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(nbboSummary, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$21$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$21$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496681 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ NbboSummary $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496681(NbboSummary nbboSummary, Continuation<? super C496681> continuation) {
                        super(2, continuation);
                        this.$it = nbboSummary;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496681 c496681 = new C496681(this.$it, continuation);
                        c496681.L$0 = obj;
                        return c496681;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496681) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, this.$it, false, null, false, null, null, null, null, false, null, false, null, false, -524289, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496681((NbboSummary) this.L$0, null));
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.nbboSummaryStore.streamNbboSummary(this.$instrumentId)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$22", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {429, 433}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$22, reason: invalid class name */
        static final class AnonymousClass22 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass22(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass22> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass22(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass22) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest((kotlinx.coroutines.flow.Flow) r8, r1, r7) == r0) goto L15;
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
                    TradeSettingsStore tradeSettingsStore = this.this$0.tradeSettingsStore;
                    TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.MAC;
                    TradeSettingsStore3.Equity equity = new TradeSettingsStore3.Equity(null);
                    String serverValue = IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND.getServerValue();
                    this.label = 1;
                    obj = tradeSettingsStore.streamAutoSendStateEvents(tradeSettingsStore4, equity, serverValue, this);
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 2;
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$22$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$22$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TradeSettingsStore2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TradeSettingsStore2 tradeSettingsStore2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tradeSettingsStore2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    TradeSettingsStore2 tradeSettingsStore2 = (TradeSettingsStore2) this.L$0;
                    if (tradeSettingsStore2 instanceof TradeSettingsStore2.ExpiredAgreement) {
                        EquityUpsellService.setUpsellComplete$default(this.this$0.equityUpsellService, UpsellLocation.MAC, EquityUpsell.POST_TRADE_AUTO_SEND, false, 4, null);
                        this.this$0.submit(new SetChartScreenState(new AutoSendRenew(IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND, null, 2, null), false, 2, null));
                    } else if (tradeSettingsStore2 instanceof TradeSettingsStore2.NotSignedAgreement) {
                        this.this$0.equityUpsellService.setUpsellComplete(UpsellLocation.MAC, EquityUpsell.POST_TRADE_AUTO_SEND, false);
                    } else {
                        if (!(tradeSettingsStore2 instanceof TradeSettingsStore2.AutosendIsOnAgreementNotSigned) && !(tradeSettingsStore2 instanceof TradeSettingsStore2.State)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EquityUpsellService.setUpsellComplete$default(this.this$0.equityUpsellService, UpsellLocation.MAC, EquityUpsell.POST_TRADE_AUTO_SEND, false, 4, null);
                    }
                    this.this$0.applyMutation(new C496691(tradeSettingsStore2, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$22$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$22$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496691 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ TradeSettingsStore2 $state;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496691(TradeSettingsStore2 tradeSettingsStore2, Continuation<? super C496691> continuation) {
                        super(2, continuation);
                        this.$state = tradeSettingsStore2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496691 c496691 = new C496691(this.$state, continuation);
                        c496691.L$0 = obj;
                        return c496691;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496691) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, this.$state.getAutoSend(), null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -33, null);
                    }
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$23", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {476}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$23, reason: invalid class name */
        static final class AnonymousClass23 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass23(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass23> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass23(this.this$0, continuation);
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
                    Flow flowStreamTimeInForce$default = TradeSettingsStore.streamTimeInForce$default(this.this$0.tradeSettingsStore, TradeSettingsStore4.MAC, new TradeSettingsStore3.Equity(EquityPositionType.LONG), null, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTimeInForce$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$23$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$23$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderTimeInForce, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTimeInForce orderTimeInForce, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(orderTimeInForce, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$23$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$23$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496701 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ OrderTimeInForce $orderTimeInForce;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496701(OrderTimeInForce orderTimeInForce, Continuation<? super C496701> continuation) {
                        super(2, continuation);
                        this.$orderTimeInForce = orderTimeInForce;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496701 c496701 = new C496701(this.$orderTimeInForce, continuation);
                        c496701.L$0 = obj;
                        return c496701;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496701) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, this.$orderTimeInForce, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -513, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496701((OrderTimeInForce) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$24", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {488}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$24, reason: invalid class name */
        static final class AnonymousClass24 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass24(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass24> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass24(this.this$0, continuation);
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
                    Flow flowStreamTimeInForce$default = TradeSettingsStore.streamTimeInForce$default(this.this$0.tradeSettingsStore, TradeSettingsStore4.MAC, new TradeSettingsStore3.Equity(EquityPositionType.SHORT), null, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTimeInForce$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$24$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$24$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderTimeInForce, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTimeInForce orderTimeInForce, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(orderTimeInForce, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$24$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$24$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496711 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ OrderTimeInForce $orderTimeInForce;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496711(OrderTimeInForce orderTimeInForce, Continuation<? super C496711> continuation) {
                        super(2, continuation);
                        this.$orderTimeInForce = orderTimeInForce;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496711 c496711 = new C496711(this.$orderTimeInForce, continuation);
                        c496711.L$0 = obj;
                        return c496711;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496711) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, this.$orderTimeInForce, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -1025, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496711((OrderTimeInForce) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$25", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {501}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$25, reason: invalid class name */
        static final class AnonymousClass25 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass25(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass25> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass25(this.this$0, continuation);
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
                    Flow<Boolean> flowShouldShowUpsell = this.this$0.equityUpsellService.shouldShowUpsell(UpsellLocation.MAC, EquityUpsell.POST_TRADE_AUTO_SEND);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowShouldShowUpsell, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$25$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$25$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvanceChartOrderDuxo;
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

                /* compiled from: EquityAdvanceChartOrderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$25$1$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$25$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496721 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496721(boolean z, Continuation<? super C496721> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496721 c496721 = new C496721(this.$it, continuation);
                        c496721.L$0 = obj;
                        return c496721;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                        return ((C496721) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, this.$it, Integer.MAX_VALUE, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496721(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isScrubbing", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$26", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$26, reason: invalid class name */
        static final class AnonymousClass26 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass26(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass26> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass26 anonymousClass26 = new AnonymousClass26(this.this$0, continuation);
                anonymousClass26.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass26;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass26) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!this.Z$0) {
                    this.this$0.applyMutation(new AnonymousClass1(null));
                } else {
                    this.this$0.applyMutation(new AnonymousClass2(null));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$26$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$26$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -2490369, null);
                }
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$26$2", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$26$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                    return ((AnonymousClass2) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, true, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -131073, null);
                }
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$27", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$27, reason: invalid class name */
        static final class AnonymousClass27 extends ContinuationImpl7 implements Function2<QuoteDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass27(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass27> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass27 anonymousClass27 = new AnonymousClass27(this.this$0, continuation);
                anonymousClass27.L$0 = obj;
                return anonymousClass27;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(QuoteDto quoteDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass27) create(quoteDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$27$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$27$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                final /* synthetic */ QuoteDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(QuoteDto quoteDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = quoteDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, this.$it, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -4097, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((QuoteDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "indicators", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$28", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$28, reason: invalid class name */
        static final class AnonymousClass28 extends ContinuationImpl7 implements Function2<List<? extends IndicatorStateDto>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass28(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass28> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass28 anonymousClass28 = new AnonymousClass28(this.this$0, continuation);
                anonymousClass28.L$0 = obj;
                return anonymousClass28;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends IndicatorStateDto> list, Continuation<? super Unit> continuation) {
                return invoke2((List<IndicatorStateDto>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<IndicatorStateDto> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass28) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$28$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$28$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                final /* synthetic */ List<IndicatorStateDto> $indicators;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<IndicatorStateDto> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$indicators = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$indicators, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    boolean visible;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState = (EquityAdvanceChartOrderDataState) this.L$0;
                    List<IndicatorStateDto> list = this.$indicators;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        IndicatorStateDto indicatorStateDto = (IndicatorStateDto) obj2;
                        if (indicatorStateDto.getOverlaying()) {
                            visible = indicatorStateDto.getVisible();
                        } else {
                            visible = !indicatorStateDto.getMinimized();
                        }
                        if (visible) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((IndicatorStateDto) it.next()).getId());
                    }
                    return EquityAdvanceChartOrderDataState.copy$default(equityAdvanceChartOrderDataState, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, arrayList2, null, null, null, false, null, false, null, false, -8388609, null);
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

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$29", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$29, reason: invalid class name */
        static final class AnonymousClass29 extends ContinuationImpl7 implements Function2<TemplateDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass29(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass29> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass29 anonymousClass29 = new AnonymousClass29(this.this$0, continuation);
                anonymousClass29.L$0 = obj;
                return anonymousClass29;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TemplateDto templateDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass29) create(templateDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$29$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$29$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                final /* synthetic */ TemplateDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TemplateDto templateDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = templateDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState = (EquityAdvanceChartOrderDataState) this.L$0;
                    TemplateDto templateDto = this.$it;
                    return EquityAdvanceChartOrderDataState.copy$default(equityAdvanceChartOrderDataState, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, templateDto != null ? templateDto.getId() : null, null, null, false, null, false, null, false, -16777217, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((TemplateDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$30", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$30, reason: invalid class name */
        static final class AnonymousClass30 extends ContinuationImpl7 implements Function2<SpanIntervalData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvanceChartOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass30(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Continuation<? super AnonymousClass30> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvanceChartOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass30 anonymousClass30 = new AnonymousClass30(this.this$0, continuation);
                anonymousClass30.L$0 = obj;
                return anonymousClass30;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SpanIntervalData spanIntervalData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass30) create(spanIntervalData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvanceChartOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$30$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$bind$1$30$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
                final /* synthetic */ SpanIntervalData $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SpanIntervalData spanIntervalData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = spanIntervalData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, this.$it, null, false, null, false, null, false, -33554433, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((SpanIntervalData) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public Job bind(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C109321(instrumentId, accountNumber, null), 3, null);
    }

    private final boolean handleSubzeroOnboarding(EquityOrderSide tradeSide, AccountType accountType, String accountNumber, UUID instrumentId) {
        SubzeroOnboardingHandler3 subzeroOnboardingHandler3Handle = this.subzeroOnboardingHandler.handle(tradeSide, accountType, accountNumber, instrumentId, SubzeroOnboardingHandler2.MOBILE_ADVANCED_CHART);
        if (subzeroOnboardingHandler3Handle instanceof SubzeroOnboardingHandler3.DeepLink) {
            submit(new LaunchDeeplink(Uri.parse(((SubzeroOnboardingHandler3.DeepLink) subzeroOnboardingHandler3Handle).getDeeplink())));
            return true;
        }
        if (Intrinsics.areEqual(subzeroOnboardingHandler3Handle, SubzeroOnboardingHandler3.NoAction.INSTANCE) || Intrinsics.areEqual(subzeroOnboardingHandler3Handle, SubzeroOnboardingHandler3.SellShort.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (notifyOrderFailed(r2, r3) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (notifyOrderFailed(r2, r3) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        if (r6.notifyOrderSubmitSuccess(r10, r3) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        if (r7.notifyOrderEditSuccess(r10, r3) == r4) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleOrderStatusEvents(OrderStatusEvent orderStatusEvent, Continuation<? super Unit> continuation) {
        C109401 c109401;
        final EquityOrderIntent orderIntent;
        final OrderStatusEvent orderStatusEvent2 = orderStatusEvent;
        if (continuation instanceof C109401) {
            c109401 = (C109401) continuation;
            int i = c109401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c109401.label = i - Integer.MIN_VALUE;
            } else {
                c109401 = new C109401(continuation);
            }
        }
        Object obj = c109401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c109401.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 3 && i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EquityOrderIntent equityOrderIntent = (EquityOrderIntent) c109401.L$1;
            OrderStatusEvent orderStatusEvent3 = (OrderStatusEvent) c109401.L$0;
            ResultKt.throwOnFailure(obj);
            orderIntent = equityOrderIntent;
            orderStatusEvent2 = orderStatusEvent3;
            withDataState(new Function1() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EquityAdvanceChartOrderDuxo.handleOrderStatusEvents$lambda$0(orderIntent, this, orderStatusEvent2, (EquityAdvanceChartOrderDataState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        orderIntent = orderStatusEvent2.getOrderIntent();
        String string2 = orderIntent.getRefId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (orderStatusEvent2 instanceof OrderStatusEvent.Aborted) {
            c109401.label = 1;
        } else if (orderStatusEvent2 instanceof OrderStatusEvent.Failed) {
            handleOrderThrowable(((OrderStatusEvent.Failed) orderStatusEvent2).getThrowable());
            c109401.label = 2;
        } else {
            if (!(orderStatusEvent2 instanceof OrderStatusEvent.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            OrderStatusEvent.Success success = (OrderStatusEvent.Success) orderStatusEvent2;
            displayOrderSubmittedSnackbar(success.getOrder());
            if (orderIntent.getExistingOrder() == null) {
                BwWebViewManager bwWebViewManager = this.bwWebViewManager;
                String string3 = success.getOrder().getId().toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                OrderSubmittedEvent orderSubmittedEvent = new OrderSubmittedEvent(string3, string2, null, 4, null);
                c109401.L$0 = orderStatusEvent2;
                c109401.L$1 = orderIntent;
                c109401.label = 3;
            } else {
                BwWebViewManager bwWebViewManager2 = this.bwWebViewManager;
                String strValueOf = String.valueOf(success.getOrder().getReplaces());
                String string4 = success.getOrder().getId().toString();
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                OrderEditedEvent orderEditedEvent = new OrderEditedEvent(strValueOf, string4, string2, null, 8, null);
                c109401.L$0 = orderStatusEvent2;
                c109401.L$1 = orderIntent;
                c109401.label = 4;
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOrderStatusEvents$lambda$0(EquityOrderIntent equityOrderIntent, EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, OrderStatusEvent orderStatusEvent, EquityAdvanceChartOrderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (!equityOrderIntent.getAutoSend() && ds.getShowShowAutoSendUpsell() && !Intrinsics.areEqual(equityAdvanceChartOrderDuxo.lastSuccessOrderId, ((OrderStatusEvent.Success) orderStatusEvent).getOrder().getId())) {
            EquityUpsellService.setUpsellViewCount$default(equityAdvanceChartOrderDuxo.equityUpsellService, UpsellLocation.MAC, EquityUpsell.POST_TRADE_AUTO_SEND, 0, 4, null);
            equityAdvanceChartOrderDuxo.submit(new SetChartScreenState(new AutoSendUpsell(IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND), true));
        }
        equityAdvanceChartOrderDuxo.lastSuccessOrderId = ((OrderStatusEvent.Success) orderStatusEvent).getOrder().getId();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object notifyOrderFailed(EquityOrderIntent equityOrderIntent, Continuation<? super Unit> continuation) {
        String string2 = equityOrderIntent.getRefId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (equityOrderIntent.getExistingOrder() == null) {
            Object objNotifyOrderFailedToSubmit = this.bwWebViewManager.notifyOrderFailedToSubmit(string2, continuation);
            return objNotifyOrderFailedToSubmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyOrderFailedToSubmit : Unit.INSTANCE;
        }
        Object objNotifyOrderFailedToEdit = this.bwWebViewManager.notifyOrderFailedToEdit(string2, continuation);
        return objNotifyOrderFailedToEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyOrderFailedToEdit : Unit.INSTANCE;
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "action", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartTradeAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleChartTradeActions$2", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {665, 673, 677}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleChartTradeActions$2 */
    static final class C109352 extends ContinuationImpl7 implements Function2<ChartTradeAction, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C109352(Continuation<? super C109352> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109352 c109352 = EquityAdvanceChartOrderDuxo.this.new C109352(continuation);
            c109352.L$0 = obj;
            return c109352;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChartTradeAction chartTradeAction, Continuation<? super Unit> continuation) {
            return ((C109352) create(chartTradeAction, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        
            if (r13.this$0.handleEditOrderAction((com.robinhood.android.chart.blackwidowadvancedchart.models.EditOrder) r14, r13) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
        
            if (r13.this$0.handleSubmitOrderChartAction((com.robinhood.android.chart.blackwidowadvancedchart.models.SubmitOrder) r14, r13) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
        
            if (r13.this$0.handleCancelOrder((com.robinhood.android.chart.blackwidowadvancedchart.models.CancelOrder) r14, r13) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
        
            return r0;
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
                ChartTradeAction chartTradeAction = (ChartTradeAction) this.L$0;
                if (Intrinsics.areEqual(chartTradeAction, ChartTradeAction5.INSTANCE)) {
                    EquityAdvanceChartOrderDuxo.logChartInteraction$default(EquityAdvanceChartOrderDuxo.this, Component.ComponentType.BUTTON, EquityAdvanceChartOrderDuxo5.PRICE_ROW_OPTION_ENTRY_POINT, null, null, null, 28, null);
                    IntentKey chartOptionChainKey = ((EquityAdvanceChartOrderViewState) EquityAdvanceChartOrderDuxo.this.getStateFlow().getValue()).getChartOptionChainKey();
                    if (chartOptionChainKey != null) {
                        EquityAdvanceChartOrderDuxo.this.submit(new LaunchActivity(chartOptionChainKey));
                    }
                } else if (chartTradeAction instanceof ChartCursorPrice) {
                    ChartCursorPrice chartCursorPrice = (ChartCursorPrice) chartTradeAction;
                    if (chartCursorPrice.getPrice() != null) {
                        EquityAdvanceChartOrderDuxo.logChartInteraction$default(EquityAdvanceChartOrderDuxo.this, Component.ComponentType.BUTTON, EquityAdvanceChartOrderDuxo5.PRICE_ROW, chartCursorPrice.getPrice(), null, null, 24, null);
                        EquityAdvanceChartOrderDuxo.this.startTradingOnChart();
                    }
                    EquityAdvanceChartOrderDuxo.this.applyMutation(new AnonymousClass1(chartTradeAction, null));
                } else if (chartTradeAction instanceof EditOrder) {
                    this.label = 1;
                } else if (chartTradeAction instanceof StartEditOrder) {
                    EquityAdvanceChartOrderDuxo.this.startTradingOnChart();
                } else if (chartTradeAction instanceof SubmitOrder) {
                    this.label = 2;
                } else {
                    if (!(chartTradeAction instanceof CancelOrder)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.label = 3;
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleChartTradeActions$2$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleChartTradeActions$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
            final /* synthetic */ ChartTradeAction $action;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ChartTradeAction chartTradeAction, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$action = chartTradeAction;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$action, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState = (EquityAdvanceChartOrderDataState) this.L$0;
                IdlDecimal price = ((ChartCursorPrice) this.$action).getPrice();
                return EquityAdvanceChartOrderDataState.copy$default(equityAdvanceChartOrderDataState, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, price != null ? price.toBigDecimalOrNull() : null, false, null, false, null, false, -67108865, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleChartTradeActions(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(this.bwWebViewManager.getChartTradeActions(), new C109352(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    static /* synthetic */ void logChartInteraction$default(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Component.ComponentType componentType, String str, IdlDecimal idlDecimal, String str2, IdlDecimal idlDecimal2, int i, Object obj) {
        if ((i & 4) != 0) {
            idlDecimal = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            idlDecimal2 = null;
        }
        equityAdvanceChartOrderDuxo.logChartInteraction(componentType, str, idlDecimal, str2, idlDecimal2);
    }

    private final void logChartInteraction(final Component.ComponentType componentType, final String identifier, final IdlDecimal price, final String refId, final IdlDecimal tradeAmount) {
        withDataState(new Function1() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvanceChartOrderDuxo.logChartInteraction$lambda$1(tradeAmount, this, componentType, identifier, price, refId, (EquityAdvanceChartOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logChartInteraction$lambda$1(IdlDecimal idlDecimal, EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, Component.ComponentType componentType, String str, IdlDecimal idlDecimal2, String str2, EquityAdvanceChartOrderDataState ds) {
        String stringValue;
        Double doubleOrNull;
        String stringValue2;
        Double doubleOrNull2;
        Intrinsics.checkNotNullParameter(ds, "ds");
        double trade_amount = (idlDecimal == null || (stringValue2 = idlDecimal.getStringValue()) == null || (doubleOrNull2 = StringsKt.toDoubleOrNull(stringValue2)) == null) ? ds.getLoggingContext().getTrade_amount() : doubleOrNull2.doubleValue();
        EventLogger eventLogger = equityAdvanceChartOrderDuxo.eventLogger;
        Screen screen = new Screen(Screen.Name.MOBILE_ADVANCED_CHARTS, null, null, null, 14, null);
        Component component = new Component(componentType, str, null, 4, null);
        LegendAdvancedChartsContext loggingContext = ds.getLoggingContext();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, loggingContext.copy((6655 & 1) != 0 ? loggingContext.selected_span : null, (6655 & 2) != 0 ? loggingContext.selected_interval : null, (6655 & 4) != 0 ? loggingContext.selected_template : null, (6655 & 8) != 0 ? loggingContext.active_indicators : null, (6655 & 16) != 0 ? loggingContext.instrument_id : null, (6655 & 32) != 0 ? loggingContext.trade_amount : trade_amount, (6655 & 64) != 0 ? loggingContext.auto_send_enabled : false, (6655 & 128) != 0 ? loggingContext.indicator_id : null, (6655 & 256) != 0 ? loggingContext.set_id : null, (6655 & 512) != 0 ? loggingContext.indicator_settings : null, (6655 & 1024) != 0 ? loggingContext.chart_settings : null, (6655 & 2048) != 0 ? loggingContext.price : (idlDecimal2 == null || (stringValue = idlDecimal2.getStringValue()) == null || (doubleOrNull = StringsKt.toDoubleOrNull(stringValue)) == null) ? 0.0d : doubleOrNull.doubleValue(), (6655 & 4096) != 0 ? loggingContext.ref_id : str2 == null ? "" : str2, (6655 & 8192) != 0 ? loggingContext.unknownFields() : null), null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16381, null), false, 41, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r0.notifyOrderCanceled(r3, r9) == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
    
        if (r0.notifyOrderFailedToCancel(r3, r9) == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:
    
        if (r0.notifyOrderFailedToCancel(r3, r9) == r10) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleCancelOrder(CancelOrder cancelOrder, Continuation<? super Unit> continuation) {
        C109341 c109341;
        UUID uuid;
        CancelOrder cancelOrder2;
        CancelOrder cancelOrder3;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        if (continuation instanceof C109341) {
            c109341 = (C109341) continuation;
            int i = c109341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c109341.label = i - Integer.MIN_VALUE;
            } else {
                c109341 = new C109341(continuation);
            }
        }
        C109341 c1093412 = c109341;
        Object obj = c1093412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1093412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            logChartInteraction$default(this, Component.ComponentType.BUTTON, "CancelOrder", null, cancelOrder.getOrderId(), null, 20, null);
            try {
                uuid = com.robinhood.utils.extensions.StringsKt.toUuid(cancelOrder.getOrderId());
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            if (uuid != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    long j = EquityAdvanceChartOrderDuxo5.TIMEOUT;
                    EquityAdvanceChartOrderDuxo2 equityAdvanceChartOrderDuxo2 = new EquityAdvanceChartOrderDuxo2(this, uuid, null);
                    cancelOrder2 = cancelOrder;
                    try {
                        c1093412.L$0 = cancelOrder2;
                        c1093412.label = 1;
                        if (Timeout6.m28789withTimeoutKLykuaI(j, equityAdvanceChartOrderDuxo2, c1093412) != coroutine_suspended) {
                            cancelOrder3 = cancelOrder2;
                            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                        }
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        cancelOrder3 = cancelOrder2;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl == null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cancelOrder2 = cancelOrder;
                }
            } else {
                BwWebViewManager bwWebViewManager = this.bwWebViewManager;
                String refId = cancelOrder.getRefId();
                c1093412.L$0 = null;
                c1093412.label = 4;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        cancelOrder3 = (CancelOrder) c1093412.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            th = th3;
            cancelOrder2 = cancelOrder3;
            Result.Companion companion22 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            cancelOrder3 = cancelOrder2;
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
            }
        }
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            BwWebViewManager bwWebViewManager2 = this.bwWebViewManager;
            String refId2 = cancelOrder3.getRefId();
            c1093412.L$0 = cancelOrder3;
            c1093412.label = 2;
        } else {
            if (!(thM28553exceptionOrNullimpl instanceof Timeout4)) {
                CrashReporter.INSTANCE.reportNonFatal(thM28553exceptionOrNullimpl, false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
            }
            StringResource.Companion companion3 = StringResource.INSTANCE;
            submit(new ChartDialog(companion3.invoke(C11048R.string.general_error_title, new Object[0]), companion3.invoke(C11048R.string.error_description_something_went_wrong, new Object[0])));
            BwWebViewManager bwWebViewManager3 = this.bwWebViewManager;
            String refId3 = cancelOrder3.getRefId();
            c1093412.L$0 = cancelOrder3;
            c1093412.label = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTradingOnChart() {
        MacEquityOrderState instrumentOrderState = ((EquityAdvanceChartOrderViewState) getStateFlow().getValue()).getInstrumentOrderState();
        if (instrumentOrderState == null || !instrumentOrderState.getAutoSendOrders()) {
            return;
        }
        applyMutation(new C109481(null));
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$startTradingOnChart$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$startTradingOnChart$1 */
    static final class C109481 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C109481(Continuation<? super C109481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109481 c109481 = new C109481(continuation);
            c109481.L$0 = obj;
            return c109481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
            return ((C109481) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, true, null, false, null, false, null, null, null, null, false, null, false, null, false, -2359297, null);
        }
    }

    private final void refreshNbbo() {
        MacEquityOrderState instrumentOrderState = ((EquityAdvanceChartOrderViewState) getStateFlow().getValue()).getInstrumentOrderState();
        if (instrumentOrderState != null) {
            applyMutation(new C109461(null));
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C109472(instrumentOrderState, null), 3, null);
        }
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$refreshNbbo$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$refreshNbbo$1 */
    static final class C109461 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C109461(Continuation<? super C109461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109461 c109461 = new C109461(continuation);
            c109461.L$0 = obj;
            return c109461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
            return ((C109461) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, true, null, false, null, null, null, null, false, null, false, null, false, -1048577, null);
        }
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$refreshNbbo$2", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {1432}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$refreshNbbo$2 */
    static final class C109472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MacEquityOrderState $orderState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109472(MacEquityOrderState macEquityOrderState, Continuation<? super C109472> continuation) {
            super(2, continuation);
            this.$orderState = macEquityOrderState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvanceChartOrderDuxo.this.new C109472(this.$orderState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Single<Response<ApiNbboSummary>> singleRefresh = EquityAdvanceChartOrderDuxo.this.nbboSummaryStore.refresh(this.$orderState.getOrderInstrument().getId());
                this.label = 1;
                if (RxAwait3.await(singleRefresh, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EquityAdvanceChartOrderDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityAdvanceChartOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$refreshNbbo$2$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$refreshNbbo$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
                return ((AnonymousClass1) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -1048577, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
    
        if (validateAndSubmit(r14, r13, r3, r15, r15, r12, r7, r0, r9) == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
    
        if (r1.notifyOrderFailedToEdit(r2, r9) != r10) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleEditOrderAction(EditOrder editOrder, Continuation<? super Unit> continuation) {
        C109361 c109361;
        BigDecimal bigDecimalScaleEquityPrice;
        UUID uuid;
        MacEquityOrderState instrumentOrderState;
        UUID uuid2;
        UUID uuid3;
        EditOrder editOrder2;
        Order order;
        UUID uuid4;
        BigDecimal bigDecimalOrNull;
        if (continuation instanceof C109361) {
            c109361 = (C109361) continuation;
            int i = c109361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c109361.label = i - Integer.MIN_VALUE;
            } else {
                c109361 = new C109361(continuation);
            }
        }
        C109361 c1093612 = c109361;
        Object obj = c1093612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1093612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            IdlDecimal updatedPrice = editOrder.getUpdatedPrice();
            bigDecimalScaleEquityPrice = (updatedPrice == null || (bigDecimalOrNull = updatedPrice.toBigDecimalOrNull()) == null) ? null : EquityPriceScaling.scaleEquityPrice(bigDecimalOrNull);
            try {
                uuid = com.robinhood.utils.extensions.StringsKt.toUuid(editOrder.getRefId());
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            instrumentOrderState = ((EquityAdvanceChartOrderViewState) getStateFlow().getValue()).getInstrumentOrderState();
            try {
                uuid2 = com.robinhood.utils.extensions.StringsKt.toUuid(editOrder.getOrderId());
            } catch (IllegalArgumentException unused2) {
                uuid2 = null;
            }
            if (uuid2 != null) {
                Observable<Order> observable = this.equityOrderManager.fetchOrder(uuid2).toObservable();
                Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null);
                c1093612.L$0 = editOrder;
                c1093612.L$1 = bigDecimalScaleEquityPrice;
                c1093612.L$2 = uuid;
                c1093612.L$3 = instrumentOrderState;
                c1093612.label = 1;
                Object objFirst = FlowKt.first(flowBuffer$default, c1093612);
                if (objFirst != coroutine_suspended) {
                    uuid4 = uuid;
                    obj = objFirst;
                    editOrder2 = editOrder;
                }
                return coroutine_suspended;
            }
            uuid3 = uuid;
            editOrder2 = editOrder;
            order = null;
            MacEquityOrderState macEquityOrderState = instrumentOrderState;
            BigDecimal bigDecimal = bigDecimalScaleEquityPrice;
            if (order == null && order.isEditable() && uuid3 != null && macEquityOrderState != null) {
                logChartInteraction$default(this, Component.ComponentType.PILL, EquityAdvanceChartOrderDuxo5.EDIT_ORDER, editOrder2.getUpdatedPrice(), editOrder2.getOrderId(), null, 16, null);
                EquityOrderSide side = order.getSide();
                List<String> listEmptyList = CollectionsKt.emptyList();
                boolean autoSendOrders = macEquityOrderState.getAutoSendOrders();
                c1093612.L$0 = null;
                c1093612.L$1 = null;
                c1093612.L$2 = null;
                c1093612.L$3 = null;
                c1093612.label = 2;
            } else {
                BwWebViewManager bwWebViewManager = this.bwWebViewManager;
                String refId = editOrder2.getRefId();
                c1093612.L$0 = null;
                c1093612.L$1 = null;
                c1093612.L$2 = null;
                c1093612.L$3 = null;
                c1093612.label = 3;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        instrumentOrderState = (MacEquityOrderState) c1093612.L$3;
        uuid4 = (UUID) c1093612.L$2;
        bigDecimalScaleEquityPrice = (BigDecimal) c1093612.L$1;
        editOrder2 = (EditOrder) c1093612.L$0;
        ResultKt.throwOnFailure(obj);
        order = (Order) obj;
        uuid3 = uuid4;
        MacEquityOrderState macEquityOrderState2 = instrumentOrderState;
        BigDecimal bigDecimal2 = bigDecimalScaleEquityPrice;
        if (order == null) {
        }
        BwWebViewManager bwWebViewManager2 = this.bwWebViewManager;
        String refId2 = editOrder2.getRefId();
        c1093612.L$0 = null;
        c1093612.L$1 = null;
        c1093612.L$2 = null;
        c1093612.L$3 = null;
        c1093612.label = 3;
    }

    private final void handleOrderThrowable(Throwable throwable) {
        StringResource stringResourceInvoke;
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
        if (errorResponseExtractErrorResponse != null) {
            String fieldError = errorResponseExtractErrorResponse.getFieldError("title");
            if (fieldError != null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(fieldError);
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.general_error_title, new Object[0]);
            }
            submit(new ChartDialog(stringResourceInvoke, StringResource.INSTANCE.invoke(String.valueOf(errorResponseExtractErrorResponse.getDisplayMessage()))));
        }
    }

    private final void displayOrderSubmittedSnackbar(Order order) {
        int i;
        switch (WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()]) {
            case 1:
                i = C10954R.string.equity_market_order_submitted;
                break;
            case 2:
            case 3:
                i = C10954R.string.equity_limit_order_submitted;
                break;
            case 4:
                i = C10954R.string.equity_stop_market_order_submitted;
                break;
            case 5:
                i = C10954R.string.equity_stop_limit_order_submitted;
                break;
            case 6:
                i = C10954R.string.equity_trailing_stop_order_submitted;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        submit(new ChartSnackbar(ServerToBentoAssetMapper2.CHECKMARK_16, StringResource.INSTANCE.invoke(i, new Object[0]), null, null, 12, null));
        if (order.getConfiguration() == Order.Configuration.MARKET && order.getSide() == EquityOrderSide.BUY) {
            submit(new HapticEvent(HapticStyleDto.HAPTIC_STYLE_CUSTOM_ORDER_SUBMITTED));
        }
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$onTradeAmountUpdated$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$onTradeAmountUpdated$1 */
    static final class C109451 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
        final /* synthetic */ InstrumentOrderState4 $amount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109451(InstrumentOrderState4 instrumentOrderState4, Continuation<? super C109451> continuation) {
            super(2, continuation);
            this.$amount = instrumentOrderState4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109451 c109451 = new C109451(this.$amount, continuation);
            c109451.L$0 = obj;
            return c109451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
            return ((C109451) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, this.$amount, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -9, null);
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public void onTradeAmountUpdated(InstrumentOrderState4 amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new C109451(amount, null));
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleGenericAdvanceChartOrderAction$1", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {853, 856}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleGenericAdvanceChartOrderAction$1 */
    static final class C109371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GenericAdvanceChartOrderAction $action;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109371(GenericAdvanceChartOrderAction genericAdvanceChartOrderAction, Continuation<? super C109371> continuation) {
            super(2, continuation);
            this.$action = genericAdvanceChartOrderAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvanceChartOrderDuxo.this.new C109371(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r1.handleOrderSubmitResult((com.robinhood.android.equities.equitytrade.OrderSubmitResult) r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                equityAdvanceChartOrderDuxo = EquityAdvanceChartOrderDuxo.this;
                EquityTradeService equityTradeService = equityAdvanceChartOrderDuxo.equityTradeService;
                ServerDrivenButton action = ((EquityOrderCheckAction) this.$action).getAction();
                EquityOrderIntent equityOrderIntent = ((EquityOrderCheckAction) this.$action).getEquityOrderIntent();
                this.L$0 = equityAdvanceChartOrderDuxo;
                this.label = 1;
                obj = equityTradeService.handlerOrderCheckAction(action, equityOrderIntent, this);
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
            equityAdvanceChartOrderDuxo = (EquityAdvanceChartOrderDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public void handleGenericAdvanceChartOrderAction(GenericAdvanceChartOrderAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof EquityOrderCheckAction) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C109371(action, null), 3, null);
            return;
        }
        if (action instanceof DirectEquityOrderCheckAction) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C109382(action, null), 3, null);
            return;
        }
        if (action instanceof EquityAdvanceChartOrderAction3) {
            refreshNbbo();
            return;
        }
        if (action instanceof GenericAdvanceChartOrderAction3) {
            withDataState(new Function1() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvanceChartOrderDuxo.handleGenericAdvanceChartOrderAction$lambda$7(this.f$0, (EquityAdvanceChartOrderDataState) obj);
                }
            });
            return;
        }
        if (action instanceof GenericAdvanceChartOrderAction2) {
            EquityUpsellService.setUpsellLastSeen$default(this.equityUpsellService, UpsellLocation.MAC, EquityUpsell.POST_TRADE_AUTO_SEND, 0L, 4, null);
            return;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("EquityAdvanceChartOrderDuxo: received and unhandled action " + Reflection.getOrCreateKotlinClass(action.getClass()).getSimpleName()), false, null, 4, null);
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleGenericAdvanceChartOrderAction$2", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {862, 865}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleGenericAdvanceChartOrderAction$2 */
    static final class C109382 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GenericAdvanceChartOrderAction $action;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109382(GenericAdvanceChartOrderAction genericAdvanceChartOrderAction, Continuation<? super C109382> continuation) {
            super(2, continuation);
            this.$action = genericAdvanceChartOrderAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvanceChartOrderDuxo.this.new C109382(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C109382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r1.handleOrderSubmitResult((com.robinhood.android.equities.equitytrade.OrderSubmitResult) r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                equityAdvanceChartOrderDuxo = EquityAdvanceChartOrderDuxo.this;
                EquityTradeService equityTradeService = equityAdvanceChartOrderDuxo.equityTradeService;
                GenericAction action = ((DirectEquityOrderCheckAction) this.$action).getAction();
                EquityOrderIntent equityOrderIntent = ((DirectEquityOrderCheckAction) this.$action).getEquityOrderIntent();
                this.L$0 = equityAdvanceChartOrderDuxo;
                this.label = 1;
                obj = equityTradeService.handlerDirectOrderCheckAction(action, equityOrderIntent, this);
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
            equityAdvanceChartOrderDuxo = (EquityAdvanceChartOrderDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleGenericAdvanceChartOrderAction$lambda$7(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, EquityAdvanceChartOrderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (!ds.isScrubbing()) {
            equityAdvanceChartOrderDuxo.applyMutation(new EquityAdvanceChartOrderDuxo3(null));
        }
        return Unit.INSTANCE;
    }

    public final Object handleSubmitOrderChartAction(SubmitOrder submitOrder, Continuation<? super Unit> continuation) {
        BigDecimal bigDecimalOrNull;
        EquityOrderSide equityOrderSide;
        MacEquityOrderState macEquityOrderState;
        EquityOrderSide equityOrderSide2;
        MacEquityOrderState macEquityOrderState2;
        MacEquityOrderState macEquityOrderStateCopy$default;
        MacEquityOrderState instrumentOrderState = ((EquityAdvanceChartOrderViewState) getStateFlow().getValue()).getInstrumentOrderState();
        OrderPayloadDto.OrderDto order = submitOrder.getOrder();
        boolean z = order instanceof OrderPayloadDto.OrderDto.EquitiesLimitOrder;
        String str = EquityAdvanceChartOrderDuxo5.PRICE_ROW_SELL;
        if (z) {
            OrderPayloadDto.OrderDto.EquitiesLimitOrder equitiesLimitOrder = (OrderPayloadDto.OrderDto.EquitiesLimitOrder) order;
            EquityOrderSide equityTradeSide = EquityAdvanceChartOrderDuxo5.toEquityTradeSide(equitiesLimitOrder.getValue().getSide());
            BigDecimal bigDecimalOrNull2 = equitiesLimitOrder.getValue().getPrice().toBigDecimalOrNull();
            BigDecimal bigDecimalScaleEquityPrice = bigDecimalOrNull2 != null ? EquityPriceScaling.scaleEquityPrice(bigDecimalOrNull2) : null;
            IdlDecimal quantity = equitiesLimitOrder.getValue().getQuantity();
            bigDecimalOrNull = quantity != null ? quantity.toBigDecimalOrNull() : null;
            if (instrumentOrderState != null && equityTradeSide != null && bigDecimalScaleEquityPrice != null) {
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                if (equitiesLimitOrder.getValue().is_buy_all()) {
                    str = EquityAdvanceChartOrderDuxo5.BUY_ALL_ORDER;
                } else if (equitiesLimitOrder.getValue().is_sell_all()) {
                    str = EquityAdvanceChartOrderDuxo5.SELL_ALL_ORDER;
                } else if (equityTradeSide != EquityOrderSide.SELL && equityTradeSide != EquityOrderSide.SELL_SHORT) {
                    str = EquityAdvanceChartOrderDuxo5.PRICE_ROW_BUY;
                }
                logChartInteraction(componentType, str, equitiesLimitOrder.getValue().getPrice(), submitOrder.getRefId(), equitiesLimitOrder.getValue().getQuantity());
                if (bigDecimalOrNull != null) {
                    equityOrderSide2 = equityTradeSide;
                    macEquityOrderState2 = instrumentOrderState;
                    macEquityOrderStateCopy$default = MacEquityOrderState.copy$default(instrumentOrderState, null, new Quantity(bigDecimalOrNull), null, null, null, false, null, null, null, false, null, false, null, false, false, false, null, null, false, null, null, null, null, 8388605, null);
                } else {
                    equityOrderSide2 = equityTradeSide;
                    macEquityOrderState2 = instrumentOrderState;
                    macEquityOrderStateCopy$default = macEquityOrderState2;
                }
                Object objValidateAndSubmit = validateAndSubmit(macEquityOrderStateCopy$default, com.robinhood.utils.extensions.StringsKt.toUuid(submitOrder.getRefId()), equityOrderSide2, bigDecimalScaleEquityPrice, null, null, CollectionsKt.emptyList(), (!macEquityOrderState2.getAutoSendOrders() || equitiesLimitOrder.getValue().is_sell_all() || equitiesLimitOrder.getValue().is_buy_all()) ? false : true, continuation);
                return objValidateAndSubmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objValidateAndSubmit : Unit.INSTANCE;
            }
            Object objNotifyOrderFailedToSubmit = this.bwWebViewManager.notifyOrderFailedToSubmit(submitOrder.getRefId(), continuation);
            return objNotifyOrderFailedToSubmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyOrderFailedToSubmit : Unit.INSTANCE;
        }
        MacEquityOrderState macEquityOrderState3 = instrumentOrderState;
        if (order instanceof OrderPayloadDto.OrderDto.EquitiesStopMarketOrder) {
            OrderPayloadDto.OrderDto.EquitiesStopMarketOrder equitiesStopMarketOrder = (OrderPayloadDto.OrderDto.EquitiesStopMarketOrder) order;
            EquityOrderSide equityTradeSide2 = EquityAdvanceChartOrderDuxo5.toEquityTradeSide(equitiesStopMarketOrder.getValue().getSide());
            BigDecimal bigDecimalOrNull3 = equitiesStopMarketOrder.getValue().getPrice().toBigDecimalOrNull();
            BigDecimal bigDecimalScaleEquityPrice2 = bigDecimalOrNull3 != null ? EquityPriceScaling.scaleEquityPrice(bigDecimalOrNull3) : null;
            IdlDecimal quantity2 = equitiesStopMarketOrder.getValue().getQuantity();
            bigDecimalOrNull = quantity2 != null ? quantity2.toBigDecimalOrNull() : null;
            if (macEquityOrderState3 != null && equityTradeSide2 != null && bigDecimalScaleEquityPrice2 != null) {
                Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                if (equitiesStopMarketOrder.getValue().is_buy_all()) {
                    str = EquityAdvanceChartOrderDuxo5.BUY_ALL_ORDER;
                } else if (equitiesStopMarketOrder.getValue().is_sell_all()) {
                    str = EquityAdvanceChartOrderDuxo5.SELL_ALL_ORDER;
                } else if (equityTradeSide2 != EquityOrderSide.SELL && equityTradeSide2 != EquityOrderSide.SELL_SHORT) {
                    str = EquityAdvanceChartOrderDuxo5.PRICE_ROW_BUY;
                }
                logChartInteraction(componentType2, str, equitiesStopMarketOrder.getValue().getPrice(), submitOrder.getRefId(), equitiesStopMarketOrder.getValue().getQuantity());
                if (bigDecimalOrNull != null) {
                    equityOrderSide = equityTradeSide2;
                    MacEquityOrderState macEquityOrderStateCopy$default2 = MacEquityOrderState.copy$default(macEquityOrderState3, null, new Quantity(bigDecimalOrNull), null, null, null, false, null, null, null, false, null, false, null, false, false, false, null, null, false, null, null, null, null, 8388605, null);
                    macEquityOrderState3 = macEquityOrderState3;
                    macEquityOrderState = macEquityOrderStateCopy$default2;
                } else {
                    equityOrderSide = equityTradeSide2;
                    macEquityOrderState = macEquityOrderState3;
                }
                Object objValidateAndSubmit2 = validateAndSubmit(macEquityOrderState, com.robinhood.utils.extensions.StringsKt.toUuid(submitOrder.getRefId()), equityOrderSide, null, bigDecimalScaleEquityPrice2, null, CollectionsKt.emptyList(), (!macEquityOrderState3.getAutoSendOrders() || equitiesStopMarketOrder.getValue().is_sell_all() || equitiesStopMarketOrder.getValue().is_buy_all()) ? false : true, continuation);
                return objValidateAndSubmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objValidateAndSubmit2 : Unit.INSTANCE;
            }
            Object objNotifyOrderFailedToSubmit2 = this.bwWebViewManager.notifyOrderFailedToSubmit(submitOrder.getRefId(), continuation);
            return objNotifyOrderFailedToSubmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyOrderFailedToSubmit2 : Unit.INSTANCE;
        }
        if (order instanceof OrderPayloadDto.OrderDto.EquitiesSellAllOrder) {
            OrderPayloadDto.OrderDto.EquitiesSellAllOrder equitiesSellAllOrder = (OrderPayloadDto.OrderDto.EquitiesSellAllOrder) order;
            BigDecimal bigDecimalOrNull4 = equitiesSellAllOrder.getValue().getQuantity().toBigDecimalOrNull();
            if (macEquityOrderState3 != null && bigDecimalOrNull4 != null) {
                logChartInteraction$default(this, Component.ComponentType.BUTTON, EquityAdvanceChartOrderDuxo5.SELL_ALL_ORDER, null, submitOrder.getRefId(), equitiesSellAllOrder.getValue().getQuantity(), 4, null);
                Object objValidateAndSubmit3 = validateAndSubmit(MacEquityOrderState.copy$default(macEquityOrderState3, null, new Quantity(bigDecimalOrNull4), null, null, null, false, null, null, null, false, null, false, null, false, false, false, null, null, false, null, null, null, null, 8388605, null), com.robinhood.utils.extensions.StringsKt.toUuid(submitOrder.getRefId()), EquityOrderSide.SELL, null, null, null, CollectionsKt.emptyList(), false, continuation);
                return objValidateAndSubmit3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objValidateAndSubmit3 : Unit.INSTANCE;
            }
            Object objNotifyOrderFailedToSubmit3 = this.bwWebViewManager.notifyOrderFailedToSubmit(submitOrder.getRefId(), continuation);
            return objNotifyOrderFailedToSubmit3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyOrderFailedToSubmit3 : Unit.INSTANCE;
        }
        if (!(order instanceof OrderPayloadDto.OrderDto.EquitiesBuyAllOrder)) {
            throw new NoWhenBranchMatchedException();
        }
        OrderPayloadDto.OrderDto.EquitiesBuyAllOrder equitiesBuyAllOrder = (OrderPayloadDto.OrderDto.EquitiesBuyAllOrder) order;
        BigDecimal bigDecimalOrNull5 = equitiesBuyAllOrder.getValue().getQuantity().toBigDecimalOrNull();
        if (macEquityOrderState3 != null && bigDecimalOrNull5 != null) {
            logChartInteraction$default(this, Component.ComponentType.BUTTON, EquityAdvanceChartOrderDuxo5.BUY_ALL_ORDER, null, submitOrder.getRefId(), equitiesBuyAllOrder.getValue().getQuantity(), 4, null);
            Object objValidateAndSubmit4 = validateAndSubmit(MacEquityOrderState.copy$default(macEquityOrderState3, null, new Quantity(bigDecimalOrNull5), null, null, null, false, null, null, null, false, null, false, null, false, false, false, null, null, false, null, null, null, null, 8388605, null), com.robinhood.utils.extensions.StringsKt.toUuid(submitOrder.getRefId()), EquityOrderSide.BUY, null, null, null, CollectionsKt.emptyList(), false, continuation);
            return objValidateAndSubmit4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objValidateAndSubmit4 : Unit.INSTANCE;
        }
        Object objNotifyOrderFailedToSubmit4 = this.bwWebViewManager.notifyOrderFailedToSubmit(submitOrder.getRefId(), continuation);
        return objNotifyOrderFailedToSubmit4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyOrderFailedToSubmit4 : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public Object onTrade(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation) {
        if (instrumentOrderState instanceof MacEquityOrderState) {
            int i = WhenMappings.$EnumSwitchMapping$1[bwTradeSide.ordinal()];
            if (i == 1) {
                Object objHandleBuyMarket = handleBuyMarket((MacEquityOrderState) instrumentOrderState, uuid, continuation);
                return objHandleBuyMarket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleBuyMarket : Unit.INSTANCE;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Object objHandleSellMarket = handleSellMarket((MacEquityOrderState) instrumentOrderState, uuid, continuation);
            return objHandleSellMarket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleSellMarket : Unit.INSTANCE;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("EquityAdvanceChartOrderDuxo: received wrong order state " + Reflection.getOrCreateKotlinClass(instrumentOrderState.getClass()).getSimpleName()), true, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleBuyMarket(final MacEquityOrderState macEquityOrderState, UUID uuid, Continuation<? super Unit> continuation) {
        if (!macEquityOrderState.getBuyEnabled() && macEquityOrderState.getInstrument().isOtc()) {
            submit(new ChartSnackbar(null, StringResource.INSTANCE.invoke(C10954R.string.equity_otc_buy_snackbar_alert, new Object[0]), null, null, 12, null));
        } else if (!macEquityOrderState.getBuyEnabled()) {
            withDataState(new Function1() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvanceChartOrderDuxo.handleBuyMarket$lambda$9(macEquityOrderState, this, (EquityAdvanceChartOrderDataState) obj);
                }
            });
        } else {
            if (!macEquityOrderState.getAutoSendOrders()) {
                Object objValidateAndSubmit = validateAndSubmit(macEquityOrderState, uuid, EquityAdvanceChartOrderDuxo5.toEquityTradeSide(BwTradeSide.BUY, macEquityOrderState.getAllowShorting()), null, null, null, CollectionsKt.emptyList(), macEquityOrderState.getAutoSendOrders(), continuation);
                return objValidateAndSubmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objValidateAndSubmit : Unit.INSTANCE;
            }
            applyMutation(new C109333(null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBuyMarket$lambda$9(MacEquityOrderState macEquityOrderState, EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, EquityAdvanceChartOrderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        StringResource tradabilityErrorStringResource$default = BuySellHelper.getTradabilityErrorStringResource$default(BuySellHelper.INSTANCE, macEquityOrderState.getBuySellData(), ds.getEquitiesSubzeroMember(), null, ds.isInEtfSupportedRegion(), 4, null);
        if (tradabilityErrorStringResource$default != null) {
            equityAdvanceChartOrderDuxo.submit(new ChartSnackbar(null, tradabilityErrorStringResource$default, null, null, 12, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleBuyMarket$3", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleBuyMarket$3 */
    static final class C109333 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C109333(Continuation<? super C109333> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109333 c109333 = new C109333(continuation);
            c109333.L$0 = obj;
            return c109333;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
            return ((C109333) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, BwTradeSide.BUY, false, null, null, null, null, false, null, false, null, false, -2097153, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r7.handleOrderSubmitResult((com.robinhood.android.equities.equitytrade.OrderSubmitResult) r15, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validateAndSubmit(MacEquityOrderState macEquityOrderState, UUID uuid, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, Order order, List<String> list, boolean z, Continuation<? super Unit> continuation) {
        C109491 c109491;
        EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo;
        if (continuation instanceof C109491) {
            c109491 = (C109491) continuation;
            int i = c109491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c109491.label = i - Integer.MIN_VALUE;
            } else {
                c109491 = new C109491(continuation);
            }
        }
        Object objValidateAndSubmit = c109491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c109491.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateAndSubmit);
            if (handleSubzeroOnboarding(equityOrderSide, macEquityOrderState.getAccount().getType(), macEquityOrderState.getAccount().getAccountNumber(), macEquityOrderState.getInstrument().getId())) {
                return Unit.INSTANCE;
            }
            EquityTradeService equityTradeService = this.equityTradeService;
            EquityOrderIntent equityOrderIntent = EquityAdvanceChartOrderDuxo5.toEquityOrderIntent(macEquityOrderState, uuid, equityOrderSide, bigDecimal, bigDecimal2, order, list, z);
            c109491.L$0 = this;
            c109491.label = 1;
            objValidateAndSubmit = equityTradeService.validateAndSubmit(equityOrderIntent, c109491);
            if (objValidateAndSubmit != coroutine_suspended) {
                equityAdvanceChartOrderDuxo = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objValidateAndSubmit);
            return Unit.INSTANCE;
        }
        equityAdvanceChartOrderDuxo = (EquityAdvanceChartOrderDuxo) c109491.L$0;
        ResultKt.throwOnFailure(objValidateAndSubmit);
        c109491.L$0 = null;
        c109491.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSellMarket(final MacEquityOrderState macEquityOrderState, UUID uuid, Continuation<? super Unit> continuation) {
        if (!macEquityOrderState.getMarketSellEnabled()) {
            withDataState(new Function1() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvanceChartOrderDuxo.handleSellMarket$lambda$11(macEquityOrderState, this, (EquityAdvanceChartOrderDataState) obj);
                }
            });
        } else if (macEquityOrderState.getAutoSendOrders()) {
            if (!handleSubzeroOnboarding(EquityAdvanceChartOrderDuxo5.toEquityTradeSide(BwTradeSide.SELL, macEquityOrderState.getAllowShorting()), macEquityOrderState.getAccount().getType(), macEquityOrderState.getAccount().getAccountNumber(), macEquityOrderState.getInstrument().getId())) {
                applyMutation(new C109433(null));
            }
        } else {
            Object objValidateAndSubmit = validateAndSubmit(macEquityOrderState, uuid, EquityAdvanceChartOrderDuxo5.toEquityTradeSide(BwTradeSide.SELL, macEquityOrderState.getAllowShorting()), null, null, null, CollectionsKt.emptyList(), macEquityOrderState.getAutoSendOrders(), continuation);
            return objValidateAndSubmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objValidateAndSubmit : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSellMarket$lambda$11(MacEquityOrderState macEquityOrderState, EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, EquityAdvanceChartOrderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        StringResource tradabilityErrorStringResource$default = BuySellHelper.getTradabilityErrorStringResource$default(BuySellHelper.INSTANCE, macEquityOrderState.getBuySellData(), ds.getEquitiesSubzeroMember(), null, ds.isInEtfSupportedRegion(), 4, null);
        if (tradabilityErrorStringResource$default != null) {
            equityAdvanceChartOrderDuxo.submit(new ChartSnackbar(null, tradabilityErrorStringResource$default, null, null, 12, null));
        } else {
            StringResource sellCheckString = equityAdvanceChartOrderDuxo.equityTradeService.getSellCheckString(macEquityOrderState.getBuySellData(), macEquityOrderState.getAllowShorting(), OrderType.MARKET, null);
            if (sellCheckString != null) {
                equityAdvanceChartOrderDuxo.submit(new ChartSnackbar(null, sellCheckString, null, null, 12, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleSellMarket$3", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleSellMarket$3 */
    static final class C109433 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C109433(Continuation<? super C109433> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109433 c109433 = new C109433(continuation);
            c109433.L$0 = obj;
            return c109433;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
            return ((C109433) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, BwTradeSide.SELL, false, null, null, null, null, false, null, false, null, false, -2097153, null);
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public Object onConfirmed(BwTradeSide bwTradeSide, InstrumentOrderState instrumentOrderState, UUID uuid, Continuation<? super Unit> continuation) {
        if (instrumentOrderState instanceof MacEquityOrderState) {
            if (bwTradeSide == BwTradeSide.BUY && !((MacEquityOrderState) instrumentOrderState).getBuyEnabled()) {
                return Unit.INSTANCE;
            }
            if (bwTradeSide == BwTradeSide.SELL && !((MacEquityOrderState) instrumentOrderState).getMarketSellEnabled()) {
                return Unit.INSTANCE;
            }
            MacEquityOrderState macEquityOrderState = (MacEquityOrderState) instrumentOrderState;
            if (macEquityOrderState.getAutoSendConfirmMarketOrderSide() == bwTradeSide) {
                Object objValidateAndSubmit = validateAndSubmit(macEquityOrderState, uuid, EquityAdvanceChartOrderDuxo5.toEquityTradeSide(bwTradeSide, macEquityOrderState.getAllowShorting()), null, null, null, CollectionsKt.emptyList(), macEquityOrderState.getAutoSendOrders(), continuation);
                return objValidateAndSubmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objValidateAndSubmit : Unit.INSTANCE;
            }
            applyMutation(new C109442(bwTradeSide, null));
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("EquityAdvanceChartOrderDuxo: confirm received wrong order state " + Reflection.getOrCreateKotlinClass(instrumentOrderState.getClass()).getSimpleName()), true, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$onConfirmed$2", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$onConfirmed$2 */
    static final class C109442 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
        final /* synthetic */ BwTradeSide $tradeSide;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C109442(BwTradeSide bwTradeSide, Continuation<? super C109442> continuation) {
            super(2, continuation);
            this.$tradeSide = bwTradeSide;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109442 c109442 = new C109442(this.$tradeSide, continuation);
            c109442.L$0 = obj;
            return c109442;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
            return ((C109442) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, this.$tradeSide, false, null, null, null, null, false, null, false, null, false, -2097153, null);
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4
    public void onAutoSendToggled(final boolean enabled) {
        withDataState(new Function1() { // from class: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvanceChartOrderDuxo.onAutoSendToggled$lambda$12(this.f$0, enabled, (EquityAdvanceChartOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAutoSendToggled$lambda$12(EquityAdvanceChartOrderDuxo equityAdvanceChartOrderDuxo, boolean z, EquityAdvanceChartOrderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        BuildersKt__Builders_commonKt.launch$default(equityAdvanceChartOrderDuxo.getLifecycleScope(), null, null, new EquityAdvanceChartOrderDuxo4(equityAdvanceChartOrderDuxo, z, ds, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (notifyOrderFailed(r13, r0) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (notifyOrderFailed(r13, r0) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (notifyOrderFailed(r13, r0) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f8, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleOrderSubmitResult(OrderSubmitResult orderSubmitResult, Continuation<? super Unit> continuation) {
        C109411 c109411;
        if (continuation instanceof C109411) {
            c109411 = (C109411) continuation;
            int i = c109411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c109411.label = i - Integer.MIN_VALUE;
            } else {
                c109411 = new C109411(continuation);
            }
        }
        Object obj = c109411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c109411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (orderSubmitResult instanceof OrderSubmitResult.DisplayOrderCheck) {
                OrderSubmitResult.DisplayOrderCheck displayOrderCheck = (OrderSubmitResult.DisplayOrderCheck) orderSubmitResult;
                EquityOrderChecksAlert orderCheckAlert = displayOrderCheck.getOrderCheckAlert();
                if (orderCheckAlert instanceof VisibleEquityOrderChecksAlert) {
                    submit(new EquityOrderCheckAlert((VisibleEquityOrderChecksAlert) orderCheckAlert, displayOrderCheck.getOrderIntent()));
                }
            } else if (orderSubmitResult instanceof OrderSubmitResult.LaunchTradeFlow) {
                submit(new LaunchActivity(((OrderSubmitResult.LaunchTradeFlow) orderSubmitResult).getIntentKey()));
            } else if (orderSubmitResult instanceof OrderSubmitResult.ShowDialogFragment) {
                OrderSubmitResult.ShowDialogFragment showDialogFragment = (OrderSubmitResult.ShowDialogFragment) orderSubmitResult;
                submit(new EquityOrderCheckBottomSheet(showDialogFragment.getOrderIntent(), showDialogFragment.getDialogFragmentKey(), showDialogFragment.getTag()));
            } else if (!(orderSubmitResult instanceof OrderSubmitResult.NotifyAutoSendSuccess)) {
                if (orderSubmitResult instanceof OrderSubmitResult.DeepLink) {
                    OrderSubmitResult.DeepLink deepLink = (OrderSubmitResult.DeepLink) orderSubmitResult;
                    submit(new LaunchDeeplink(deepLink.getUri()));
                    EquityOrderIntent orderIntent = deepLink.getOrderIntent();
                    c109411.label = 1;
                } else if (orderSubmitResult instanceof OrderSubmitResult.Error) {
                    OrderSubmitResult.Error error = (OrderSubmitResult.Error) orderSubmitResult;
                    StringResource errorMessage = error.getErrorMessage();
                    if (errorMessage != null) {
                        submit(new ChartSnackbar(ServerToBentoAssetMapper2.ALERT_16, errorMessage, null, null, 12, null));
                    }
                    EquityOrderIntent orderIntent2 = error.getOrderIntent();
                    c109411.label = 2;
                } else {
                    if (!(orderSubmitResult instanceof OrderSubmitResult.ChangeTradingSessionAction) && !(orderSubmitResult instanceof OrderSubmitResult.EditLimitOrderAction) && !(orderSubmitResult instanceof OrderSubmitResult.EditStopOrderAction) && !(orderSubmitResult instanceof OrderSubmitResult.NoAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EquityOrderIntent orderIntent3 = orderSubmitResult.getOrderIntent();
                    c109411.label = 3;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        applyMutation(new C109423(null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleOrderSubmitResult$3", m3645f = "EquityAdvanceChartOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo$handleOrderSubmitResult$3 */
    static final class C109423 extends ContinuationImpl7 implements Function2<EquityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C109423(Continuation<? super C109423> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C109423 c109423 = new C109423(continuation);
            c109423.L$0 = obj;
            return c109423;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, Continuation<? super EquityAdvanceChartOrderDataState> continuation) {
            return ((C109423) create(equityAdvanceChartOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityAdvanceChartOrderDataState.copy$default((EquityAdvanceChartOrderDataState) this.L$0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -2359297, null);
        }
    }
}
