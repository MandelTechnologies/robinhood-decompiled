package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.TaxlotabilityStore;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.serverdriven.experimental.api.ConvertToRebateOrder;
import com.robinhood.models.serverdriven.experimental.api.CryptoAcknowledgeAlertAndContinueAction;
import com.robinhood.models.serverdriven.experimental.api.CryptoSideEffect;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.shared.crypto.p375ui.trade.validator.ServerDrivenCryptoOrderValidator;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.analytics.AnalyticsExtensions2;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.dagger.CryptoFeePrefs;
import com.robinhood.shared.trade.crypto.dagger.CryptoFeePrefs2;
import com.robinhood.shared.trade.crypto.dagger.HasSeenEuAdvancedOrdersTooltipPref;
import com.robinhood.shared.trade.crypto.dagger.HasSeenTaxLotOrderTooltipPref;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.disclosures.CryptoTradeDisclosuresProvider;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.fee.CryptoFeesMicrogramConstants;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider3;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider4;
import com.robinhood.shared.trade.crypto.p397ui.powerInfoAlert.CryptoPowerInfoAlertProvider;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderEvent;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderFragment;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderViewState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment;
import com.robinhood.shared.trade.crypto.p397ui.tooltip.CryptoOrderTooltipData;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.CryptoTradeBonusEligibilityProvider;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetFragment;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderUiEvent;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.StaticInputs;
import com.robinhood.store.base.InvestmentScheduleStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsRequestDto;
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsResponseDto;
import contracts.crypto.trade.proto.p431v1.CryptoMarketOrderPillsService;
import contracts.crypto.trade.proto.p431v1.CryptoOrderValidationService;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderRequestDto;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponseDto;
import crypto.fee_tier.proto.p434v1.CryptoFeesBottomSheetService;
import crypto.fee_tier.proto.p434v1.FeeTierUpsellBottomSheetEventDto;
import crypto.fee_tier.proto.p434v1.LaunchFeeTierUpsellBottomSheetRequestDto;
import crypto.fee_tier.proto.p434v1.StreamFeeTierUpsellBottomSheetEventRequestDto;
import crypto.fee_tier.proto.p434v1.StreamFeeTierUpsellBottomSheetEventResponseDto;
import dagger.Lazy;
import idl.recurring.proto.p474v1.GetScheduleConfigRequestDto;
import idl.recurring.proto.p474v1.GetScheduleConfigResponseDto;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import nummus.p512v1.TaxlotabilityResponseDto;
import nummus.p512v1.TaxlotabilityStateDto;
import p479j$.time.Clock;
import p479j$.time.LocalDate;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoQuoteOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ê\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002ê\u0001B\u0091\u0002\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0001\u0010-\u001a\u00020,\u0012\b\b\u0001\u0010/\u001a\u00020.\u0012\b\b\u0001\u00100\u001a\u00020.\u0012\b\b\u0001\u00101\u001a\u00020.\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\b\b\u0001\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020E0DH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020HH\u0002¢\u0006\u0004\bK\u0010JJ\u0017\u0010N\u001a\u00020H2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ#\u0010T\u001a\u00020H2\u0006\u0010Q\u001a\u00020P2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010X\u001a\u00020H2\b\u0010W\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020H2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010RH\u0082@¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010RH\u0082@¢\u0006\u0004\b`\u0010_J\u000f\u0010a\u001a\u00020HH\u0016¢\u0006\u0004\ba\u0010JJ\u000f\u0010b\u001a\u00020HH\u0016¢\u0006\u0004\bb\u0010JJ\u000f\u0010c\u001a\u00020HH\u0016¢\u0006\u0004\bc\u0010JJ\r\u0010d\u001a\u00020H¢\u0006\u0004\bd\u0010JJ\u0015\u0010g\u001a\u00020H2\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ\u0015\u0010k\u001a\u00020H2\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u0015\u0010o\u001a\u00020H2\u0006\u0010n\u001a\u00020m¢\u0006\u0004\bo\u0010pJ\r\u0010q\u001a\u00020H¢\u0006\u0004\bq\u0010JJ\u001d\u0010v\u001a\u00020H2\u0006\u0010s\u001a\u00020r2\u0006\u0010u\u001a\u00020t¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020H¢\u0006\u0004\bx\u0010JJ\u0015\u0010z\u001a\u00020H2\u0006\u0010y\u001a\u00020E¢\u0006\u0004\bz\u0010{J\"\u0010\u0080\u0001\u001a\u00020H2\b\u0010}\u001a\u0004\u0018\u00010|2\u0006\u0010\u007f\u001a\u00020~¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0019\u0010\u0083\u0001\u001a\u00020H2\u0007\u0010\u0082\u0001\u001a\u00020r¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0019\u0010\u0086\u0001\u001a\u00020H2\u0007\u0010\u0085\u0001\u001a\u00020P¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0018\u0010\u0088\u0001\u001a\u00020H2\u0006\u0010Q\u001a\u00020P¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J\\\u0010\u008e\u0001\u001a\u00020H2\u0007\u0010s\u001a\u00030\u0089\u00012\b\u0010}\u001a\u0004\u0018\u00010|2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00012\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0089\u00012\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0089\u00012\b\u0010\u007f\u001a\u0004\u0018\u00010~2\t\b\u0002\u0010\u008d\u0001\u001a\u00020t¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u000f\u0010\u0090\u0001\u001a\u00020H¢\u0006\u0005\b\u0090\u0001\u0010JJ\u0018\u0010\u0091\u0001\u001a\u00020H2\u0006\u0010Q\u001a\u00020P¢\u0006\u0006\b\u0091\u0001\u0010\u0087\u0001J\u0018\u0010\u0092\u0001\u001a\u00020H2\u0006\u0010Q\u001a\u00020P¢\u0006\u0006\b\u0092\u0001\u0010\u0087\u0001J\u001a\u0010\u0095\u0001\u001a\u00020H2\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u000f\u0010\u0097\u0001\u001a\u00020H¢\u0006\u0005\b\u0097\u0001\u0010JJ\u000f\u0010\u0098\u0001\u001a\u00020H¢\u0006\u0005\b\u0098\u0001\u0010JJ\u0019\u0010\u009a\u0001\u001a\u00020H2\u0007\u0010\u0099\u0001\u001a\u00020R¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u000f\u0010\u009c\u0001\u001a\u00020H¢\u0006\u0005\b\u009c\u0001\u0010JJ!\u0010 \u0001\u001a\u00020H2\u000f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u009d\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0018\u0010¢\u0001\u001a\u00020H2\u0006\u0010S\u001a\u00020R¢\u0006\u0006\b¢\u0001\u0010\u009b\u0001J\u000f\u0010£\u0001\u001a\u00020H¢\u0006\u0005\b£\u0001\u0010JJ\u0011\u0010¤\u0001\u001a\u00020HH\u0014¢\u0006\u0005\b¤\u0001\u0010JR\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010¥\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010¦\u0001R\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010§\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010¨\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010©\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010ª\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010«\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¬\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u00ad\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010®\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010¯\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010°\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010±\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010²\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010³\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010´\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010µ\u0001R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010¶\u0001R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010·\u0001R\u0015\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010·\u0001R\u0015\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010·\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010¸\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010¹\u0001R\u0015\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010º\u0001R\u0015\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010»\u0001R\u001d\u0010;\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b;\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R!\u0010Ä\u0001\u001a\u00030¿\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Æ\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R!\u0010Ì\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Á\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R!\u0010Ñ\u0001\u001a\u00030Í\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010Á\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ö\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R!\u0010Û\u0001\u001a\u00030Ò\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bØ\u0001\u0010Á\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R!\u0010à\u0001\u001a\u00030Ü\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Á\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R \u0010â\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010P0á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010ä\u0001\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0015\u0010é\u0001\u001a\u00030æ\u00018F¢\u0006\b\u001a\u0006\bç\u0001\u0010è\u0001¨\u0006ë\u0001"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Ldagger/Lazy;", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "bottomSheetServiceLazy", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "cryptoFeeUiEventProvider", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderManager", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;", "cryptoTradeBonusEligibilityProvider", "Lcom/robinhood/analytics/CryptoEventLogger;", "eventLogger", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "investmentScheduleStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "serverDrivenCryptoOrderValidator", "Lcom/robinhood/prefs/StringToLongMapPreference;", "feeUnsupportedBannerDismissMillisPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenEuAdvancedOrdersTooltipPref", "hasSeenTaxLotOrderTooltipPref", "hasSeenFeeUpsellBottomSheetPref", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "cryptoTradeUserInputsService", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "taxlotabilityStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroid/content/Context;", "context", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/lib/account/AccountProvider;Ldagger/Lazy;Lj$/time/Clock;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;Lcom/robinhood/analytics/CryptoEventLogger;Lcom/robinhood/store/base/InvestmentScheduleStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;Landroid/content/res/Resources;Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;Landroidx/lifecycle/SavedStateHandle;Landroid/content/Context;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/navigation/Navigator;)V", "Lio/reactivex/Observable;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "observeFormState", "()Lio/reactivex/Observable;", "", "showSpreadDialog", "()V", "showTradeBonusBottomSheet", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "uiFeeEstimation", "showFeeDefinitionBottomSheet", "(Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;)V", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "orderContext", "", "acknowledgeId", "performMicrogramOrderValidation", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Ljava/lang/String;)V", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "tradeBonusEligibility", "safeSetFormStateReviewing", "(Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;)V", "Lcom/robinhood/android/navigation/keys/IntentKey;", "intent", "startActivity", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "accountId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountNumber", "onCreate", "onStart", "onResume", "showFeeTierUpsellBottomSheet", "Landroid/view/KeyEvent;", "keyEvent", "consumeKeyEvent", "(Landroid/view/KeyEvent;)V", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "tapAction", "handleCryptoOrderReviewRowOnTap", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;)V", "Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData$Type;", "type", "onTooltipShown", "(Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData$Type;)V", "showMarketPriceDialog", "Ljava/math/BigDecimal;", "amount", "", "isRecurringOrder", "setAmountAndContinue", "(Ljava/math/BigDecimal;Z)V", "sellAll", "formState", "setFormState", "(Lcom/robinhood/android/lib/trade/DefaultOrderState;)V", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "setRecurringOptionsFromHook", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;)V", "quoteAmount", "setOrderSize", "(Ljava/math/BigDecimal;)V", "cryptoOrderContext", "submitOrder", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)V", "validateOrder", "Lcom/robinhood/models/util/Money;", "buyingPower", "minOrderSize", "maxOrderSize", "ignoreBuyingPowerAlert", "validateRecurring", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lj$/time/LocalDate;Z)V", "initiateDeposit", "onValidationSucceed", "fetchTradeBonusEligibility", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoAcknowledgeAlertAndContinueAction;", "action", "onAcknowledgeAlertAndContinue", "(Lcom/robinhood/models/serverdriven/experimental/api/CryptoAcknowledgeAlertAndContinueAction;)V", "setPdtWarningAsSeen", "convertToRebateOrder", "assetCurrencyCode", "updateFeeUnavailableBannerDismissedTimestampPref", "(Ljava/lang/String;)V", "onToolbarContentTapped", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "dtos", "emitBottomSheetData", "(Lkotlinx/collections/immutable/ImmutableList;)V", "onOrderValidationAcknowledgeAndContinue", "onBuyMax", "onCleared", "Lcom/robinhood/shared/app/type/AppType;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Ldagger/Lazy;", "Lj$/time/Clock;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;", "Lcom/robinhood/analytics/CryptoEventLogger;", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "Landroid/content/res/Resources;", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "staticInputs$delegate", "Lkotlin/Lazy;", "getStaticInputs", "()Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "staticInputs", "Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "cryptoInstrumentInputHelper", "Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "Lmicrogram/android/inject/MicrogramComponent;", "cryptoFeesMicrogram$delegate", "getCryptoFeesMicrogram", "()Lmicrogram/android/inject/MicrogramComponent;", "cryptoFeesMicrogram", "Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;", "feesBottomSheetService$delegate", "getFeesBottomSheetService", "()Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;", "feesBottomSheetService", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "cryptoTradingMicrogram", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "Lcontracts/crypto/trade/proto/v1/CryptoOrderValidationService;", "microgramOrderValidationService", "Lcontracts/crypto/trade/proto/v1/CryptoOrderValidationService;", "cryptoTradingMarketOrderPillsMicrogram$delegate", "getCryptoTradingMarketOrderPillsMicrogram", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "cryptoTradingMarketOrderPillsMicrogram", "Lcontracts/crypto/trade/proto/v1/CryptoMarketOrderPillsService;", "marketOrderPillsService$delegate", "getMarketOrderPillsService", "()Lcontracts/crypto/trade/proto/v1/CryptoMarketOrderPillsService;", "marketOrderPillsService", "Lkotlinx/coroutines/flow/MutableStateFlow;", "cryptoOrderContextFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "hasPerformanceBeenLogged", "Z", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoQuoteOrderDuxo extends BaseDuxo5<CryptoQuoteOrderViewState, CryptoQuoteOrderEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AppType appType;
    private final Lazy<CryptoTradingBottomSheetService> bottomSheetServiceLazy;
    private final Clock clock;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoFeeUiEventProvider cryptoFeeUiEventProvider;

    /* renamed from: cryptoFeesMicrogram$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy cryptoFeesMicrogram;
    private final CryptoInstrumentInputHelper cryptoInstrumentInputHelper;
    private final CryptoOrderContextFactory cryptoOrderContextFactory;
    private final StateFlow2<CryptoOrderContext> cryptoOrderContextFlow;
    private final CryptoOrderManager cryptoOrderManager;
    private final CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider;
    private final CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider;
    private final CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider;
    private final CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider;
    private final RealCryptoTradeUserInputsService cryptoTradeUserInputsService;

    /* renamed from: cryptoTradingMarketOrderPillsMicrogram$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy cryptoTradingMarketOrderPillsMicrogram;
    private final MicrogramManager2 cryptoTradingMicrogram;
    private final CryptoEventLogger eventLogger;
    private final StringToLongMapPreference feeUnsupportedBannerDismissMillisPref;

    /* renamed from: feesBottomSheetService$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy feesBottomSheetService;
    private boolean hasPerformanceBeenLogged;
    private final BooleanPreference hasSeenEuAdvancedOrdersTooltipPref;
    private final BooleanPreference hasSeenFeeUpsellBottomSheetPref;
    private final BooleanPreference hasSeenTaxLotOrderTooltipPref;
    private final InvestmentScheduleStore investmentScheduleStore;

    /* renamed from: marketOrderPillsService$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy marketOrderPillsService;
    private final CryptoOrderValidationService microgramOrderValidationService;
    private final PerformanceLogger performanceLogger;
    private final RegionGateProvider regionGateProvider;
    private final Resources resources;
    private final SavedStateHandle savedStateHandle;
    private final ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator;

    /* renamed from: staticInputs$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy staticInputs;
    private final TaxlotabilityStore taxlotabilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DefaultOrderState.values().length];
            try {
                iArr[DefaultOrderState.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DefaultOrderState.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoOrderTooltipData.Type.values().length];
            try {
                iArr2[CryptoOrderTooltipData.Type.EU_ADVANCED_ORDERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoOrderTooltipData.Type.TAX_LOT_ORDERS.ordinal()] = 2;
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
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {1058}, m3647m = "accountId")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$accountId$1 */
    static final class C406021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C406021(Continuation<? super C406021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoQuoteOrderDuxo.this.accountId(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoQuoteOrderDuxo(AppType appType, AccountProvider accountProvider, Lazy<CryptoTradingBottomSheetService> bottomSheetServiceLazy, Clock clock, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoFeeUiEventProvider cryptoFeeUiEventProvider, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderManager cryptoOrderManager, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider, CryptoEventLogger eventLogger, InvestmentScheduleStore investmentScheduleStore, PerformanceLogger performanceLogger, final LazyMoshi moshi, final MicrogramManager microgramManager, RegionGateProvider regionGateProvider, ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, @CryptoFeePrefs StringToLongMapPreference feeUnsupportedBannerDismissMillisPref, @HasSeenEuAdvancedOrdersTooltipPref BooleanPreference hasSeenEuAdvancedOrdersTooltipPref, @HasSeenTaxLotOrderTooltipPref BooleanPreference hasSeenTaxLotOrderTooltipPref, @CryptoFeePrefs2 BooleanPreference hasSeenFeeUpsellBottomSheetPref, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, Resources resources, TaxlotabilityStore taxlotabilityStore, SavedStateHandle savedStateHandle, final Context context, DuxoBundle duxoBundle, final Navigator navigator) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(bottomSheetServiceLazy, "bottomSheetServiceLazy");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoFeeUiEventProvider, "cryptoFeeUiEventProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeBonusEligibilityProvider, "cryptoTradeBonusEligibilityProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
        Intrinsics.checkNotNullParameter(feeUnsupportedBannerDismissMillisPref, "feeUnsupportedBannerDismissMillisPref");
        Intrinsics.checkNotNullParameter(hasSeenEuAdvancedOrdersTooltipPref, "hasSeenEuAdvancedOrdersTooltipPref");
        Intrinsics.checkNotNullParameter(hasSeenTaxLotOrderTooltipPref, "hasSeenTaxLotOrderTooltipPref");
        Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
        Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Companion companion = INSTANCE;
        super(new CryptoQuoteOrderViewState(null, new CryptoQuoteOrderViewState.CryptoOrderInput(((CryptoQuoteOrderFragment.Args) companion.getArgs(savedStateHandle)).getUiCurrencyPair(), ((CryptoQuoteOrderFragment.Args) companion.getArgs(savedStateHandle)).getSide(), null, null, null, false, 60, null), null, null, null, false, null, null, false, false, appType == AppType.RHC, null, null, null, hasSeenEuAdvancedOrdersTooltipPref.get(), null, hasSeenTaxLotOrderTooltipPref.get(), false, false, null, null, false, false, 8305661, null), duxoBundle);
        this.appType = appType;
        this.accountProvider = accountProvider;
        this.bottomSheetServiceLazy = bottomSheetServiceLazy;
        this.clock = clock;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoFeeUiEventProvider = cryptoFeeUiEventProvider;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoOrderManager = cryptoOrderManager;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoPowerInfoAlertProvider = cryptoPowerInfoAlertProvider;
        this.cryptoTradeBonusEligibilityProvider = cryptoTradeBonusEligibilityProvider;
        this.eventLogger = eventLogger;
        this.investmentScheduleStore = investmentScheduleStore;
        this.performanceLogger = performanceLogger;
        this.regionGateProvider = regionGateProvider;
        this.serverDrivenCryptoOrderValidator = serverDrivenCryptoOrderValidator;
        this.feeUnsupportedBannerDismissMillisPref = feeUnsupportedBannerDismissMillisPref;
        this.hasSeenEuAdvancedOrdersTooltipPref = hasSeenEuAdvancedOrdersTooltipPref;
        this.hasSeenTaxLotOrderTooltipPref = hasSeenTaxLotOrderTooltipPref;
        this.hasSeenFeeUpsellBottomSheetPref = hasSeenFeeUpsellBottomSheetPref;
        this.cryptoTradeDisclosuresProvider = cryptoTradeDisclosuresProvider;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.resources = resources;
        this.taxlotabilityStore = taxlotabilityStore;
        this.savedStateHandle = savedStateHandle;
        this.staticInputs = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoQuoteOrderDuxo.staticInputs_delegate$lambda$0(this.f$0);
            }
        });
        this.cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair());
        this.cryptoFeesMicrogram = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoQuoteOrderDuxo.cryptoFeesMicrogram_delegate$lambda$3(this.f$0, context, navigator, microgramManager, moshi);
            }
        });
        this.feesBottomSheetService = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoQuoteOrderDuxo.feesBottomSheetService_delegate$lambda$4(this.f$0);
            }
        });
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-trading", null, 2, null), null, 2, null), null, 4, null);
        this.cryptoTradingMicrogram = microgramManager2M16549getInstancemoChb0s$default;
        this.microgramOrderValidationService = (CryptoOrderValidationService) microgramManager2M16549getInstancemoChb0s$default.getComponent().getServiceLocator().getClient(CryptoOrderValidationService.class);
        this.cryptoTradingMarketOrderPillsMicrogram = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoQuoteOrderDuxo.cryptoTradingMarketOrderPillsMicrogram_delegate$lambda$5(microgramManager, this);
            }
        });
        this.marketOrderPillsService = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoQuoteOrderDuxo.marketOrderPillsService_delegate$lambda$6(this.f$0);
            }
        });
        this.cryptoOrderContextFlow = StateFlow4.MutableStateFlow(null);
        PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, PerformanceMetricEventData.Name.SCREEN_LOAD, null, ((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getId(), new PerformanceMetricEventData.Context(false, false, false, null, null, null, null, new PerformanceMetricEventData.Context.ScreenLoad(getEventScreen(), null, null, 6, null), null, null, null, null, 3967, null), 2, null);
        applyMutation(new C406011(null));
    }

    public final Screen getEventScreen() {
        Screen.Name name = Screen.Name.CRYPTO_ORDER_ENTRY;
        String string2 = ((CryptoQuoteOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getUiCurrencyPair().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StaticInputs getStaticInputs() {
        return (StaticInputs) this.staticInputs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticInputs staticInputs_delegate$lambda$0(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo) {
        Companion companion = INSTANCE;
        return new StaticInputs(((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) cryptoQuoteOrderDuxo)).getUiCurrencyPair().getId(), ((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) cryptoQuoteOrderDuxo)).getOrderUuid());
    }

    private final MicrogramComponent getCryptoFeesMicrogram() {
        return (MicrogramComponent) this.cryptoFeesMicrogram.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramComponent cryptoFeesMicrogram_delegate$lambda$3(final CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Context context, Navigator navigator, MicrogramManager microgramManager, LazyMoshi lazyMoshi) {
        return RealMicrogramUiLaunchService2.getComponentWithUiLaunch(microgramManager, new RemoteMicrogramApplication(CryptoFeesMicrogramConstants.CryptoFeesMicrogramName, CryptoFeesMicrogramConstants.getVolumeTierMinMicrogramVersion()), ViewModel2.getViewModelScope(cryptoQuoteOrderDuxo), lazyMoshi, MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator)), new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.cryptoFeesMicrogram_delegate$lambda$3$lambda$1(this.f$0, (FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.cryptoFeesMicrogram_delegate$lambda$3$lambda$2(this.f$0, (DialogFragmentKey) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoFeesMicrogram_delegate$lambda$3$lambda$1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoQuoteOrderDuxo.submit(new CryptoQuoteOrderEvent.ShowFragmentInActivity(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoFeesMicrogram_delegate$lambda$3$lambda$2(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, DialogFragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (cryptoQuoteOrderDuxo.getLifecycleState().getValue() == LifecycleState.RESUMED) {
            cryptoQuoteOrderDuxo.submit(new CryptoQuoteOrderEvent.ShowDialogFragment(it));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoFeesBottomSheetService getFeesBottomSheetService() {
        return (CryptoFeesBottomSheetService) this.feesBottomSheetService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoFeesBottomSheetService feesBottomSheetService_delegate$lambda$4(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo) {
        return (CryptoFeesBottomSheetService) cryptoQuoteOrderDuxo.getCryptoFeesMicrogram().getServiceLocator().getClient(CryptoFeesBottomSheetService.class);
    }

    private final MicrogramManager2 getCryptoTradingMarketOrderPillsMicrogram() {
        return (MicrogramManager2) this.cryptoTradingMarketOrderPillsMicrogram.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramManager2 cryptoTradingMarketOrderPillsMicrogram_delegate$lambda$5(MicrogramManager microgramManager, CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo) {
        return MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, cryptoQuoteOrderDuxo.getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-trading-market-order-pills", null, 2, null), null, 2, null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoMarketOrderPillsService getMarketOrderPillsService() {
        return (CryptoMarketOrderPillsService) this.marketOrderPillsService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoMarketOrderPillsService marketOrderPillsService_delegate$lambda$6(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo) {
        return (CryptoMarketOrderPillsService) cryptoQuoteOrderDuxo.getCryptoTradingMarketOrderPillsMicrogram().getComponent().getServiceLocator().getClient(CryptoMarketOrderPillsService.class);
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$1 */
    static final class C406011 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C406011(Continuation<? super C406011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406011 c406011 = CryptoQuoteOrderDuxo.this.new C406011(continuation);
            c406011.L$0 = obj;
            return c406011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406011) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) this.L$0;
            Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(CryptoQuoteOrderDuxo.this.cryptoInstrumentInputHelper, cryptoQuoteOrderViewState.getInput().getAmount$feature_trade_crypto_externalDebug(), null, CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
            String str = (String) tuples2ProcessAmount$default.component1();
            return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, null, CryptoQuoteOrderViewState.CryptoOrderInput.copy$default(cryptoQuoteOrderViewState.getInput(), null, null, (BigDecimal) tuples2ProcessAmount$default.component2(), str, null, false, 51, null), null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388605, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getCryptoFeesMicrogram();
        Observable observableDistinctUntilChanged = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$inputObs$1
            @Override // io.reactivex.functions.Function
            public final RequestInputs apply(CryptoQuoteOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCreateRequestInput();
            }
        }).distinctUntilChanged();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C406081(observableDistinctUntilChanged, null));
        Companion companion = INSTANCE;
        if (((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide() == OrderSide.SELL) {
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406122(null));
        }
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406133(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406144(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406155(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406166(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406177(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406188(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C406199(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C4060910(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C4061011(null));
        if (((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide() == OrderSide.BUY && this.appType == AppType.RHC) {
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C4061112(null));
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$1 */
    static final class C406081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<RequestInputs> $inputObs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406081(Observable<RequestInputs> observable, Continuation<? super C406081> continuation) {
            super(2, continuation);
            this.$inputObs = observable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406081(this.$inputObs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderContextFactory cryptoOrderContextFactory = CryptoQuoteOrderDuxo.this.cryptoOrderContextFactory;
                Screen eventScreen = CryptoQuoteOrderDuxo.this.getEventScreen();
                StaticInputs staticInputs = CryptoQuoteOrderDuxo.this.getStaticInputs();
                Observable<RequestInputs> observable = this.$inputObs;
                Intrinsics.checkNotNull(observable);
                Observable<CryptoOrderContext> observableDistinctUntilChanged = cryptoOrderContextFactory.create(eventScreen, staticInputs, observable).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoOrderContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$1$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507931 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ CryptoOrderContext $cryptoOrderContext;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoQuoteOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507931(CryptoOrderContext cryptoOrderContext, CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super C507931> continuation) {
                    super(2, continuation);
                    this.$cryptoOrderContext = cryptoOrderContext;
                    this.this$0 = cryptoQuoteOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507931 c507931 = new C507931(this.$cryptoOrderContext, this.this$0, continuation);
                    c507931.L$0 = obj;
                    return c507931;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((C507931) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) this.L$0;
                    if (BigDecimals7.isPositive(this.$cryptoOrderContext.getOrderInfo().getOrderQuantity())) {
                        CryptoOrderUiEvent shouldReviewOrder = this.$cryptoOrderContext.getRequestContext().getRequestInputs().getShouldReviewOrder();
                        if ((shouldReviewOrder != null ? shouldReviewOrder.consume() : null) != null) {
                            CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo = this.this$0;
                            CryptoOrderContext cryptoOrderContext = this.$cryptoOrderContext;
                            Intrinsics.checkNotNull(cryptoOrderContext);
                            cryptoQuoteOrderDuxo.validateOrder(cryptoOrderContext);
                        }
                    }
                    return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, this.$cryptoOrderContext, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388606, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) this.L$0;
                CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo = this.this$0;
                cryptoQuoteOrderDuxo.applyMutation(new C507931(cryptoOrderContext, cryptoQuoteOrderDuxo, null));
                if (!this.this$0.hasPerformanceBeenLogged && cryptoOrderContext.isScreenDataLoaded()) {
                    this.this$0.hasPerformanceBeenLogged = true;
                    this.this$0.performanceLogger.completeMetric(PerformanceMetricEventData.Name.SCREEN_LOAD, ((CryptoQuoteOrderFragment.Args) CryptoQuoteOrderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getUiCurrencyPair().getId());
                }
                StateFlow2 stateFlow2 = this.this$0.cryptoOrderContextFlow;
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, cryptoOrderContext));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {EnumC7081g.f2781x2ba65ba3}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$2 */
    static final class C406122 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406122(Continuation<? super C406122> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406122(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406122) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<TaxlotabilityResponseDto> flowStreamTaxlotability = CryptoQuoteOrderDuxo.this.taxlotabilityStore.streamTaxlotability(((CryptoQuoteOrderFragment.Args) CryptoQuoteOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoQuoteOrderDuxo.this)).getUiCurrencyPair().getId());
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamTaxlotability, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TaxlotabilityResponseDto taxlotabilityResponseDto = (TaxlotabilityResponseDto) obj;
            CryptoQuoteOrderDuxo.this.applyMutation(new AnonymousClass1(taxlotabilityResponseDto != null ? taxlotabilityResponseDto.getState() : null, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$2$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
            final /* synthetic */ TaxlotabilityStateDto $taxlotabilityState;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TaxlotabilityStateDto taxlotabilityStateDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$taxlotabilityState = taxlotabilityStateDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$taxlotabilityState, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, this.$taxlotabilityState == TaxlotabilityStateDto.STATE_ENABLED, false, null, null, false, false, 8257535, null);
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$3", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$3 */
    static final class C406133 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406133(Continuation<? super C406133> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406133(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406133) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoQuoteOrderDuxo.this.hasSeenTaxLotOrderTooltipPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$3$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
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

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$3$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507971 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507971(boolean z, Continuation<? super C507971> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507971 c507971 = new C507971(this.$it, continuation);
                    c507971.L$0 = obj;
                    return c507971;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((C507971) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, this.$it, false, false, null, null, false, false, 8323071, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507971(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$4", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {335}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$4 */
    static final class C406144 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406144(Continuation<? super C406144> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406144(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406144) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = CryptoQuoteOrderDuxo.this.bottomSheetServiceLazy.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                Flow<DialogFragmentKey> flowStreamLaunchDialog = ((CryptoTradingBottomSheetService) obj2).streamLaunchDialog();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamLaunchDialog, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$4$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DialogFragmentKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DialogFragmentKey dialogFragmentKey, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(dialogFragmentKey, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.submit(new CryptoQuoteOrderEvent.ShowDialogFragment((DialogFragmentKey) this.L$0));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$5", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {341}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$5 */
    static final class C406155 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406155(Continuation<? super C406155> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406155(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406155) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMarketOrderPillsMicrogramMigration = CryptoQuoteOrderDuxo.this.cryptoExperimentsStore.streamCryptoMarketOrderPillsMicrogramMigration();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoMarketOrderPillsMicrogramMigration, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$5$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
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

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$5$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507981 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507981(boolean z, Continuation<? super C507981> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507981 c507981 = new C507981(this.$it, continuation);
                    c507981.L$0 = obj;
                    return c507981;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((C507981) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, this.$it, null, null, false, false, 8126463, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507981(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {360}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6 */
    static final class C406166 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406166(Continuation<? super C406166> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406166(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406166) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(Operators.connectWhen$default(CryptoQuoteOrderDuxo.this.cryptoOrderContextFlow, CryptoQuoteOrderDuxo.this.cryptoExperimentsStore.streamCryptoMarketOrderPillsMicrogramMigration(), null, 2, null));
                final Flow<CryptoOrderContext> flow = new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C405922(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C405922<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$filter$1$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                return C405922.this.emit(null, this);
                            }
                        }

                        public C405922(FlowCollector flowCollector) {
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
                                CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) obj;
                                if ((cryptoOrderContext.getRequest().getSide() == OrderSide.BUY && cryptoOrderContext.getAccountContext().getCryptoBuyingPower() != null) || (cryptoOrderContext.getRequest().getSide() == OrderSide.SELL && cryptoOrderContext.getRequestContext().getHolding() != null)) {
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
                final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<CalculateCryptoMarketOrderPillsRequestDto>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CalculateCryptoMarketOrderPillsRequestDto> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C405932(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$map$1$2 */
                    public static final class C405932<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C405932.this.emit(null, this);
                            }
                        }

                        public C405932(FlowCollector flowCollector) {
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
                                CalculateCryptoMarketOrderPillsRequestDto calculateCryptoMarketOrderPillsRequestDto = CryptoOrderContexts.getCalculateCryptoMarketOrderPillsRequestDto((CryptoOrderContext) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(calculateCryptoMarketOrderPillsRequestDto, anonymousClass1) == coroutine_suspended) {
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
                final CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo = CryptoQuoteOrderDuxo.this;
                Flow<List<? extends CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto>> flow2 = new Flow<List<? extends CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto>>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$map$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto>> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChanged.collect(new C405942(flowCollector, cryptoQuoteOrderDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$map$2$2 */
                    public static final class C405942<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ CryptoQuoteOrderDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$map$2$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {52, 50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                return C405942.this.emit(null, this);
                            }
                        }

                        public C405942(FlowCollector flowCollector, CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = cryptoQuoteOrderDuxo;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
                        
                            if (r7.emit(r8, r0) == r1) goto L22;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            FlowCollector flowCollector;
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
                                FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                CryptoMarketOrderPillsService marketOrderPillsService = this.this$0.getMarketOrderPillsService();
                                anonymousClass1.L$0 = flowCollector2;
                                anonymousClass1.label = 1;
                                Object objCalculateCryptoMarketOrderPills = marketOrderPillsService.CalculateCryptoMarketOrderPills((CalculateCryptoMarketOrderPillsRequestDto) obj, anonymousClass1);
                                if (objCalculateCryptoMarketOrderPills != coroutine_suspended) {
                                    obj2 = objCalculateCryptoMarketOrderPills;
                                    flowCollector = flowCollector2;
                                }
                                return coroutine_suspended;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            flowCollector = (FlowCollector) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            List<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> trade_buttons = ((CalculateCryptoMarketOrderPillsResponseDto) obj2).getTrade_buttons();
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        }
                    }
                };
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow2, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$4", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<List<? extends CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> list, Continuation<? super Unit> continuation) {
                return invoke2((List<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$4$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$6$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ List<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((AnonymousClass1) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, extensions2.toImmutableList(this.$it), null, false, false, 7864319, null);
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

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {374}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7 */
    static final class C406177 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406177(Continuation<? super C406177> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406177(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406177) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow2 stateFlow2 = CryptoQuoteOrderDuxo.this.cryptoOrderContextFlow;
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(new Flow<String>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            CryptoOrderContext.AccountContext accountContext;
                            CryptoAccount cryptoAccount;
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
                                CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) obj;
                                String rhsAccountNumber = (cryptoOrderContext == null || (accountContext = cryptoOrderContext.getAccountContext()) == null || (cryptoAccount = accountContext.getCryptoAccount()) == null) ? null : cryptoAccount.getRhsAccountNumber();
                                if (rhsAccountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(rhsAccountNumber, anonymousClass1) == coroutine_suspended) {
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
                }, CryptoQuoteOrderDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null), new C40595x90703b87(null, CryptoQuoteOrderDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoQuoteOrderDuxo.this, null);
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7$3", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7$3$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$7$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ Account $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((AnonymousClass1) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, this.$it, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388479, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {385}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8 */
    static final class C406188 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406188(Continuation<? super C406188> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406188(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406188) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoQuoteOrderViewState> stateFlow = CryptoQuoteOrderDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C405982(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8$invokeSuspend$$inlined$map$1$2 */
                    public static final class C405982<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C405982.this.emit(null, this);
                            }
                        }

                        public C405982(FlowCollector flowCollector) {
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
                                CryptoOrderContext cryptoOrderContext = ((CryptoQuoteOrderViewState) obj).getCryptoOrderContext();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoOrderContext, anonymousClass1) == coroutine_suspended) {
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
                }, new C40597xe78e2c66(null, CryptoQuoteOrderDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoQuoteOrderDuxo.this, null);
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8$3", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoOrderReviewMessageAndDisclosuresState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(cryptoOrderReviewMessageAndDisclosuresState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8$3$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$8$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ CryptoOrderReviewMessageAndDisclosuresState $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = cryptoOrderReviewMessageAndDisclosuresState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((AnonymousClass1) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, this.$it, false, false, 7340031, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((CryptoOrderReviewMessageAndDisclosuresState) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$9", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {390}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$9 */
    static final class C406199 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406199(Continuation<? super C406199> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406199(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406199) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoQuoteOrderViewState> stateFlow = CryptoQuoteOrderDuxo.this.getStateFlow();
                Flow<CryptoOrderContext> flow = new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                CryptoOrderContext cryptoOrderContext = ((CryptoQuoteOrderViewState) obj).getCryptoOrderContext();
                                if (cryptoOrderContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(cryptoOrderContext, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$9$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {390}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$9$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoOrderContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) this.L$0;
                    RealCryptoTradeUserInputsService realCryptoTradeUserInputsService = this.this$0.cryptoTradeUserInputsService;
                    this.label = 1;
                    if (realCryptoTradeUserInputsService.setCryptoOrderContext(cryptoOrderContext, this) == coroutine_suspended) {
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

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$10", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {395}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$10 */
    static final class C4060910 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C4060910(Continuation<? super C4060910> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C4060910(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4060910) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMibExperiment = CryptoQuoteOrderDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoMibExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$10$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
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

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$10$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$10$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507941 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507941(boolean z, Continuation<? super C507941> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507941 c507941 = new C507941(this.$it, continuation);
                    c507941.L$0 = obj;
                    return c507941;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((C507941) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, this.$it, false, 6291455, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507941(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$11", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {400}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$11 */
    static final class C4061011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C4061011(Continuation<? super C4061011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C4061011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4061011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoStableCoinOrdersExperiment = CryptoQuoteOrderDuxo.this.cryptoExperimentsStore.streamCryptoStableCoinOrdersExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoStableCoinOrdersExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$11$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$11$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
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

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$11$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$11$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507951 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507951(boolean z, Continuation<? super C507951> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507951 c507951 = new C507951(this.$it, continuation);
                    c507951.L$0 = obj;
                    return c507951;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((C507951) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, this.$it, 4194303, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507951(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$12", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {407}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$12 */
    static final class C4061112 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C4061112(Continuation<? super C4061112> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C4061112(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4061112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvestmentScheduleStore investmentScheduleStore = CryptoQuoteOrderDuxo.this.investmentScheduleStore;
                String string2 = ((CryptoQuoteOrderFragment.Args) CryptoQuoteOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoQuoteOrderDuxo.this)).getUiCurrencyPair().getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                Flow flowConnectWhen$default = Operators.connectWhen$default(investmentScheduleStore.mo22734getConfig(new GetScheduleConfigRequestDto(null, string2, 1, null)), CryptoQuoteOrderDuxo.this.cryptoExperimentsStore.streamCryptoEuRecurringExperiment(), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "config", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$12$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$12$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GetScheduleConfigResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetScheduleConfigResponseDto getScheduleConfigResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(getScheduleConfigResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$12$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onCreate$12$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507961 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ GetScheduleConfigResponseDto $config;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507961(GetScheduleConfigResponseDto getScheduleConfigResponseDto, Continuation<? super C507961> continuation) {
                    super(2, continuation);
                    this.$config = getScheduleConfigResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507961 c507961 = new C507961(this.$config, continuation);
                    c507961.L$0 = obj;
                    return c507961;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((C507961) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, this.$config, null, false, null, false, false, false, null, null, false, false, 8384511, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507961((GetScheduleConfigResponseDto) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, observeFormState(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.onStart$lambda$7(this.f$0, (DefaultOrderState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        int i = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
        if (i == 1) {
            cryptoQuoteOrderDuxo.serverDrivenCryptoOrderValidator.resetAcknowledgedAlerts();
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406201(null), 3, null);
        Observable observableDistinctUntilChanged = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.onResume$lambda$8(this.f$0, (Boolean) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406213(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406224(null), 3, null);
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {434}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$1 */
    static final class C406201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406201(Continuation<? super C406201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider = CryptoQuoteOrderDuxo.this.cryptoPowerInfoAlertProvider;
                Companion companion = CryptoQuoteOrderDuxo.INSTANCE;
                Flow powerInfoAlertFlow$default = CryptoPowerInfoAlertProvider.getPowerInfoAlertFlow$default(cryptoPowerInfoAlertProvider, ((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) CryptoQuoteOrderDuxo.this)).getUiCurrencyPair().getId(), ((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) CryptoQuoteOrderDuxo.this)).getSide(), null, 4, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(powerInfoAlertFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/ui/ServerDrivenAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ServerDrivenAlert, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ServerDrivenAlert serverDrivenAlert, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(serverDrivenAlert, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$1$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507991 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ ServerDrivenAlert $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507991(ServerDrivenAlert serverDrivenAlert, Continuation<? super C507991> continuation) {
                    super(2, continuation);
                    this.$it = serverDrivenAlert;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507991 c507991 = new C507991(this.$it, continuation);
                    c507991.L$0 = obj;
                    return c507991;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((C507991) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, this.$it, null, null, false, null, false, false, false, null, null, false, false, 8386559, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507991((ServerDrivenAlert) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Boolean bool) {
        cryptoQuoteOrderDuxo.applyMutation(new CryptoQuoteOrderDuxo4(bool, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$3", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {448}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$3 */
    static final class C406213 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406213(Continuation<? super C406213> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406213(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406213) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoQuoteOrderDuxo.this.hasSeenEuAdvancedOrdersTooltipPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$3$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
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

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$3$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508001 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508001(boolean z, Continuation<? super C508001> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508001 c508001 = new C508001(this.$it, continuation);
                    c508001.L$0 = obj;
                    return c508001;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                    return ((C508001) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, this.$it, null, false, false, false, null, null, false, false, 8372223, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C508001(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$4", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {454}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$4 */
    static final class C406224 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406224(Continuation<? super C406224> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406224(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406224) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = CryptoQuoteOrderDuxo.this.cryptoOrderMonetizationModelProvider;
                UUID id = ((CryptoQuoteOrderFragment.Args) CryptoQuoteOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoQuoteOrderDuxo.this)).getUiCurrencyPair().getId();
                this.label = 1;
                obj = cryptoOrderMonetizationModelProvider.get(id, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = (CryptoOrderMonetizationModel) obj;
            CryptoQuoteOrderDuxo.this.applyMutation(new AnonymousClass1(cryptoOrderMonetizationModel, null));
            if (!(cryptoOrderMonetizationModel instanceof CryptoOrderMonetizationModel.Fee)) {
                CryptoQuoteOrderDuxo.this.submit(CryptoQuoteOrderEvent.DismissFeeDefinitionBottomSheet.INSTANCE);
            }
            CryptoFeeUiEventProvider4.CryptoQuoteOrder cryptoQuoteOrder = (CryptoFeeUiEventProvider4.CryptoQuoteOrder) CryptoQuoteOrderDuxo.this.cryptoFeeUiEventProvider.getInitialUiEventType$feature_trade_crypto_externalDebug(cryptoOrderMonetizationModel, CryptoFeeUiEventProvider3.CryptoQuoteOrder.INSTANCE);
            if (cryptoQuoteOrder != null) {
                CryptoQuoteOrderDuxo.this.submit(new CryptoQuoteOrderEvent.HandleCryptoFeeEventType(cryptoQuoteOrder));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$4$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onResume$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
            final /* synthetic */ CryptoOrderMonetizationModel $cryptoOrderMonetizationModel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderMonetizationModel cryptoOrderMonetizationModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cryptoOrderMonetizationModel, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, this.$cryptoOrderMonetizationModel, false, false, false, null, null, false, false, 8355839, null);
            }
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$showFeeTierUpsellBottomSheet$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {479}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$showFeeTierUpsellBottomSheet$1 */
    static final class C406331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406331(Continuation<? super C406331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<StreamFeeTierUpsellBottomSheetEventResponseDto> flowStreamFeeTierUpsellBottomSheetEvent = CryptoQuoteOrderDuxo.this.getFeesBottomSheetService().StreamFeeTierUpsellBottomSheetEvent(new StreamFeeTierUpsellBottomSheetEventRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamFeeTierUpsellBottomSheetEvent, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcrypto/fee_tier/proto/v1/StreamFeeTierUpsellBottomSheetEventResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$showFeeTierUpsellBottomSheet$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$showFeeTierUpsellBottomSheet$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamFeeTierUpsellBottomSheetEventResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* compiled from: CryptoQuoteOrderDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$showFeeTierUpsellBottomSheet$1$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FeeTierUpsellBottomSheetEventDto.values().length];
                    try {
                        iArr[FeeTierUpsellBottomSheetEventDto.EVENT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FeeTierUpsellBottomSheetEventDto.EVENT_DISMISSED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FeeTierUpsellBottomSheetEventDto.EVENT_APPEARED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamFeeTierUpsellBottomSheetEventResponseDto streamFeeTierUpsellBottomSheetEventResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamFeeTierUpsellBottomSheetEventResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i = WhenMappings.$EnumSwitchMapping$0[((StreamFeeTierUpsellBottomSheetEventResponseDto) this.L$0).getEvent().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.this$0.submit(CryptoQuoteOrderEvent.DisplayCryptoFeeTooltip.INSTANCE);
                    } else if (i == 3) {
                        this.this$0.hasSeenFeeUpsellBottomSheetPref.set(true);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void showFeeTierUpsellBottomSheet() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C406331(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406342(null), 3, null);
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$showFeeTierUpsellBottomSheet$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {493, 492}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$showFeeTierUpsellBottomSheet$2 */
    static final class C406342 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C406342(Continuation<? super C406342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406342(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r1.LaunchFeeTierUpsellBottomSheet(r3, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CryptoFeesBottomSheetService feesBottomSheetService;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                feesBottomSheetService = CryptoQuoteOrderDuxo.this.getFeesBottomSheetService();
                CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo = CryptoQuoteOrderDuxo.this;
                this.L$0 = feesBottomSheetService;
                this.label = 1;
                obj = cryptoQuoteOrderDuxo.accountId(this);
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
            feesBottomSheetService = (CryptoFeesBottomSheetService) this.L$0;
            ResultKt.throwOnFailure(obj);
            LaunchFeeTierUpsellBottomSheetRequestDto launchFeeTierUpsellBottomSheetRequestDto = new LaunchFeeTierUpsellBottomSheetRequestDto((String) obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    private final Observable<DefaultOrderState> observeFormState() {
        Observable<DefaultOrderState> observableSkip = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo.observeFormState.1
            @Override // io.reactivex.functions.Function
            public final DefaultOrderState apply(CryptoQuoteOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getInput().getFormState$feature_trade_crypto_externalDebug();
            }
        }).distinctUntilChanged().skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        return observableSkip;
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$consumeKeyEvent$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$consumeKeyEvent$1 */
    static final class C406031 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406031(KeyEvent keyEvent, Continuation<? super C406031> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406031 c406031 = CryptoQuoteOrderDuxo.this.new C406031(this.$keyEvent, continuation);
            c406031.L$0 = obj;
            return c406031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406031) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) this.L$0;
                Tuples2 tuples2ProcessKeyEvent$default = CryptoInstrumentInputHelper.processKeyEvent$default(CryptoQuoteOrderDuxo.this.cryptoInstrumentInputHelper, this.$keyEvent, cryptoQuoteOrderViewState.getInput().getCurrencyInputText$feature_trade_crypto_externalDebug(), CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, 120, null);
                String str = (String) tuples2ProcessKeyEvent$default.component1();
                BigDecimal bigDecimal = (BigDecimal) tuples2ProcessKeyEvent$default.component2();
                CryptoQuoteOrderViewState.CryptoOrderInput cryptoOrderInputCopy$default = CryptoQuoteOrderViewState.CryptoOrderInput.copy$default(cryptoQuoteOrderViewState.getInput(), null, null, bigDecimal, str, null, false, 19, null);
                CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState = cryptoQuoteOrderViewState.getOrderContextViewState();
                CryptoQuoteOrderViewState.CryptoQuoteOrderError cryptoQuoteOrderError = null;
                if (orderContextViewState != null) {
                    KeyEvent keyEvent = this.$keyEvent;
                    if (bigDecimal.compareTo(orderContextViewState.getMaxOrderAmount()) > 0 && !KeyEvents2.isDelete(keyEvent)) {
                        cryptoQuoteOrderError = CryptoQuoteOrderViewState.CryptoQuoteOrderError.GREATER_THAN_MAX;
                    } else if (Intrinsics.areEqual(cryptoQuoteOrderViewState.getInput().getCurrencyInputText$feature_trade_crypto_externalDebug(), str)) {
                        cryptoQuoteOrderError = CryptoQuoteOrderViewState.CryptoQuoteOrderError.LESS_THAN_MIN;
                    }
                }
                CryptoQuoteOrderViewState.CryptoQuoteOrderError cryptoQuoteOrderError2 = cryptoQuoteOrderError;
                if (cryptoQuoteOrderError2 != null) {
                    return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, null, null, null, null, null, false, cryptoQuoteOrderError2, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388543, null);
                }
                return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, null, cryptoOrderInputCopy$default, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388541, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void consumeKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C406031(keyEvent, null));
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.consumeKeyEvent$lambda$9(this.f$0, (CryptoQuoteOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit consumeKeyEvent$lambda$9(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoQuoteOrderViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getError() != null) {
            cryptoQuoteOrderDuxo.submit(new CryptoQuoteOrderEvent.ShakeInput(System.currentTimeMillis()));
        }
        return Unit.INSTANCE;
    }

    public final void handleCryptoOrderReviewRowOnTap(CryptoOrderReviewRowState.TapAction tapAction) {
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowMarketPriceBottomSheet) {
            showMarketPriceDialog();
            return;
        }
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowSpreadBottomSheet) {
            showSpreadDialog();
            return;
        }
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowTradeBonusBottomSheet) {
            showTradeBonusBottomSheet();
        } else {
            if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet) {
                showFeeDefinitionBottomSheet(((CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet) tapAction).getUiFeeEstimation());
                return;
            }
            throw new IllegalStateException((tapAction + " is not a valid action").toString());
        }
    }

    public final void onTooltipShown(CryptoOrderTooltipData.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        int i = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
        if (i == 1) {
            this.hasSeenEuAdvancedOrdersTooltipPref.set(true);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.hasSeenTaxLotOrderTooltipPref.set(true);
        }
    }

    private final void showSpreadDialog() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.showSpreadDialog$lambda$10(this.f$0, (CryptoQuoteOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSpreadDialog$lambda$10(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoQuoteOrderViewState dataState) {
        String str;
        BottomSheetTypeDto spreadBottomSheetTypeDto;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CryptoEventLogger cryptoEventLogger = cryptoQuoteOrderDuxo.eventLogger;
        Screen screenCopy$default = Screen.copy$default(cryptoQuoteOrderDuxo.getEventScreen(), Screen.Name.CRYPTO_ORDER_REVIEW, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.TOOLTIP;
        int i = WhenMappings.$EnumSwitchMapping$2[((CryptoQuoteOrderFragment.Args) INSTANCE.getArgs((HasSavedState) cryptoQuoteOrderDuxo)).getSide().ordinal()];
        if (i == 1) {
            str = "buy_spread";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sell_spread";
        }
        Component component = new Component(componentType, str, null, 4, null);
        CryptoOrderContext cryptoOrderContext = dataState.getCryptoOrderContext();
        EventLogger.DefaultImpls.logTap$default(cryptoEventLogger, null, screenCopy$default, component, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoOrderContext != null ? cryptoOrderContext.getLoggingCryptoOrderContext() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        CryptoOrderContext cryptoOrderContext2 = dataState.getCryptoOrderContext();
        if (cryptoOrderContext2 == null || (spreadBottomSheetTypeDto = CryptoOrderContexts.getSpreadBottomSheetTypeDto(cryptoOrderContext2)) == null) {
            return Unit.INSTANCE;
        }
        CryptoTradingBottomSheetService.launchBottomSheet$default(cryptoQuoteOrderDuxo.bottomSheetServiceLazy.get(), spreadBottomSheetTypeDto, cryptoQuoteOrderDuxo.getEventScreen(), null, 4, null);
        return Unit.INSTANCE;
    }

    public final void showMarketPriceDialog() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.showMarketPriceDialog$lambda$11(this.f$0, (CryptoQuoteOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMarketPriceDialog$lambda$11(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoQuoteOrderViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CryptoOrderContext cryptoOrderContext = dataState.getCryptoOrderContext();
        if (cryptoOrderContext == null) {
            return Unit.INSTANCE;
        }
        CryptoTradingBottomSheetService.launchBottomSheet$default(cryptoQuoteOrderDuxo.bottomSheetServiceLazy.get(), CryptoOrderContexts.getMarketPriceBottomSheetTypeDto(cryptoOrderContext), cryptoQuoteOrderDuxo.getEventScreen(), null, 4, null);
        return Unit.INSTANCE;
    }

    private final void showTradeBonusBottomSheet() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, Screen.copy$default(getEventScreen(), Screen.Name.CRYPTO_ORDER_REVIEW, null, null, null, 14, null), new Component(Component.ComponentType.TOOLTIP, "crypto_trade_bonus", null, 4, null), null, null, false, 57, null);
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.showTradeBonusBottomSheet$lambda$12(this.f$0, (CryptoQuoteOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTradeBonusBottomSheet$lambda$12(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoQuoteOrderViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        cryptoQuoteOrderDuxo.submit(new CryptoQuoteOrderEvent.ShowTradeBonusBottomSheet(new CryptoTradeBonusReviewOrderBottomSheetFragment.Args(cryptoQuoteOrderDuxo.getStaticInputs(), dataState.getCreateRequestInput())));
        return Unit.INSTANCE;
    }

    private final void showFeeDefinitionBottomSheet(UiFeeEstimation uiFeeEstimation) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, Screen.copy$default(getEventScreen(), Screen.Name.CRYPTO_ORDER_REVIEW, null, null, null, 14, null), new Component(Component.ComponentType.TOOLTIP, "crypto_fees", null, 4, null), null, null, false, 57, null);
        submit(new CryptoQuoteOrderEvent.ShowFeeDefinitionBottomSheet(new CryptoFeeDefinitionBottomSheetFragment.Args(getEventScreen(), ((CryptoQuoteOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getUiCurrencyPair().getId(), uiFeeEstimation.getFeeRatio(), uiFeeEstimation.getMinFeeAmount(), uiFeeEstimation.getRobinhoodFeeRatio(), uiFeeEstimation.getExchangeFeeRatio(), false, null, 128, null)));
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setAmountAndContinue$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setAmountAndContinue$1 */
    static final class C406281 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ boolean $isRecurringOrder;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406281(BigDecimal bigDecimal, boolean z, Continuation<? super C406281> continuation) {
            super(2, continuation);
            this.$amount = bigDecimal;
            this.$isRecurringOrder = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406281 c406281 = CryptoQuoteOrderDuxo.this.new C406281(this.$amount, this.$isRecurringOrder, continuation);
            c406281.L$0 = obj;
            return c406281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406281) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) this.L$0;
            Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(CryptoQuoteOrderDuxo.this.cryptoInstrumentInputHelper, this.$amount, null, CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
            String str = (String) tuples2ProcessAmount$default.component1();
            CryptoQuoteOrderViewState.CryptoOrderInput cryptoOrderInputCopy$default = CryptoQuoteOrderViewState.CryptoOrderInput.copy$default(cryptoQuoteOrderViewState.getInput(), null, null, (BigDecimal) tuples2ProcessAmount$default.component2(), str, null, false, 51, null);
            if (this.$isRecurringOrder) {
                return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, null, cryptoOrderInputCopy$default, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388605, null);
            }
            return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, null, cryptoOrderInputCopy$default, null, null, null, false, null, null, false, false, false, null, null, new CryptoOrderUiEvent(null, 1, null), false, null, false, false, false, null, null, false, false, 8380413, null);
        }
    }

    public final void setAmountAndContinue(BigDecimal amount, boolean isRecurringOrder) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new C406281(amount, isRecurringOrder, null));
        if (isRecurringOrder) {
            withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoQuoteOrderDuxo.setAmountAndContinue$lambda$13(this.f$0, (CryptoQuoteOrderViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAmountAndContinue$lambda$13(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoQuoteOrderViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        cryptoQuoteOrderDuxo.submit(new CryptoQuoteOrderEvent.EnterRecurringFlow(dataState.getRecurringHookFrequency(), dataState.getRecurringHookStartDate(), dataState.getRecurringHookAmount()));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$sellAll$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$sellAll$1 */
    static final class C406271 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C406271(Continuation<? super C406271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406271 c406271 = CryptoQuoteOrderDuxo.this.new C406271(continuation);
            c406271.L$0 = obj;
            return c406271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406271) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) this.L$0;
            CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState = cryptoQuoteOrderViewState.getOrderContextViewState();
            if (orderContextViewState == null) {
                return cryptoQuoteOrderViewState;
            }
            BigDecimal sellingPower = orderContextViewState.getRequestContext$feature_trade_crypto_externalDebug().getSellingPower();
            Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(CryptoQuoteOrderDuxo.this.cryptoInstrumentInputHelper, sellingPower, RoundingMode.HALF_DOWN, CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, 120, null);
            String str = (String) tuples2ProcessAmount$default.component1();
            return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, null, CryptoQuoteOrderViewState.CryptoOrderInput.copy$default(cryptoQuoteOrderViewState.getInput(), null, null, (BigDecimal) tuples2ProcessAmount$default.component2(), str, null, true, 19, null), null, null, null, false, null, null, false, false, false, null, null, new CryptoOrderUiEvent(null, 1, null), false, null, false, false, false, null, null, false, false, 8380413, null);
        }
    }

    public final void sellAll() {
        applyMutation(new C406271(null));
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setFormState$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setFormState$1 */
    static final class C406291 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        final /* synthetic */ DefaultOrderState $formState;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setFormState$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DefaultOrderState.values().length];
                try {
                    iArr[DefaultOrderState.EDITING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DefaultOrderState.REVIEWING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406291(DefaultOrderState defaultOrderState, Continuation<? super C406291> continuation) {
            super(2, continuation);
            this.$formState = defaultOrderState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406291 c406291 = CryptoQuoteOrderDuxo.this.new C406291(this.$formState, continuation);
            c406291.L$0 = obj;
            return c406291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406291) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) this.L$0;
                CryptoEventLogger cryptoEventLogger = CryptoQuoteOrderDuxo.this.eventLogger;
                Screen.Name analyticsScreenName = AnalyticsExtensions2.getAnalyticsScreenName(this.$formState);
                String string2 = ((CryptoQuoteOrderFragment.Args) CryptoQuoteOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoQuoteOrderDuxo.this)).getUiCurrencyPair().getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                Screen screen = new Screen(analyticsScreenName, null, string2, null, 10, null);
                CryptoOrderContext cryptoOrderContext = cryptoQuoteOrderViewState.getCryptoOrderContext();
                UiCryptoTradeBonusEligibility tradeBonusEligibility = null;
                EventLogger.DefaultImpls.logScreenAppear$default(cryptoEventLogger, null, screen, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoOrderContext != null ? cryptoOrderContext.getLoggingCryptoOrderContext() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
                CryptoQuoteOrderViewState.CryptoOrderInput cryptoOrderInputCopy$default = CryptoQuoteOrderViewState.CryptoOrderInput.copy$default(cryptoQuoteOrderViewState.getInput(), null, null, null, null, this.$formState, false, 47, null);
                int i = WhenMappings.$EnumSwitchMapping$0[this.$formState.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tradeBonusEligibility = cryptoQuoteOrderViewState.getTradeBonusEligibility();
                }
                return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, null, cryptoOrderInputCopy$default, null, null, tradeBonusEligibility, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388589, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void setFormState(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        applyMutation(new C406291(formState, null));
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setRecurringOptionsFromHook$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setRecurringOptionsFromHook$1 */
    static final class C406321 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        final /* synthetic */ ApiInvestmentSchedule.Frequency $frequency;
        final /* synthetic */ LocalDate $startDate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406321(ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Continuation<? super C406321> continuation) {
            super(2, continuation);
            this.$frequency = frequency;
            this.$startDate = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406321 c406321 = new C406321(this.$frequency, this.$startDate, continuation);
            c406321.L$0 = obj;
            return c406321;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406321) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, this.$frequency, this.$startDate, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388595, null);
        }
    }

    public final void setRecurringOptionsFromHook(ApiInvestmentSchedule.Frequency frequency, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        applyMutation(new C406321(frequency, startDate, null));
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setOrderSize$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setOrderSize$1 */
    static final class C406301 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        final /* synthetic */ BigDecimal $quoteAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406301(BigDecimal bigDecimal, Continuation<? super C406301> continuation) {
            super(2, continuation);
            this.$quoteAmount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406301 c406301 = CryptoQuoteOrderDuxo.this.new C406301(this.$quoteAmount, continuation);
            c406301.L$0 = obj;
            return c406301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406301) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) this.L$0;
            Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(CryptoQuoteOrderDuxo.this.cryptoInstrumentInputHelper, this.$quoteAmount, null, CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
            String str = (String) tuples2ProcessAmount$default.component1();
            return CryptoQuoteOrderViewState.copy$default(cryptoQuoteOrderViewState, null, CryptoQuoteOrderViewState.CryptoOrderInput.copy$default(cryptoQuoteOrderViewState.getInput(), null, null, (BigDecimal) tuples2ProcessAmount$default.component2(), str, null, false, 19, null), null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388605, null);
        }
    }

    public final void setOrderSize(BigDecimal quoteAmount) {
        Intrinsics.checkNotNullParameter(quoteAmount, "quoteAmount");
        applyMutation(new C406301(quoteAmount, null));
    }

    public final void submitOrder(CryptoOrderContext cryptoOrderContext) {
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
        CryptoEventLogger.DefaultImpls.logCryptoOrderEvent$default(this.eventLogger, OrderFormStep.SUBMIT, cryptoOrderContext.getRequest().toApiRequest(), cryptoOrderContext.getRequestContext().getRequestInputs().getMonetizationModel(), null, 8, null);
        OrderSubmissionManager.submit$default(this.cryptoOrderManager, cryptoOrderContext.getCryptoOrderManagerRequest(), null, false, 6, null);
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$validateOrder$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$validateOrder$1 */
    static final class C406351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoOrderContext $orderContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406351(CryptoOrderContext cryptoOrderContext, Continuation<? super C406351> continuation) {
            super(2, continuation);
            this.$orderContext = cryptoOrderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406351(this.$orderContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoQuoteOrderDuxo.performMicrogramOrderValidation$default(CryptoQuoteOrderDuxo.this, this.$orderContext, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public final void validateOrder(CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406351(orderContext, null), 3, null);
    }

    static /* synthetic */ void performMicrogramOrderValidation$default(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoOrderContext cryptoOrderContext, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        cryptoQuoteOrderDuxo.performMicrogramOrderValidation(cryptoOrderContext, str);
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$performMicrogramOrderValidation$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {771}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$performMicrogramOrderValidation$1 */
    static final class C406251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $acknowledgeId;
        final /* synthetic */ CryptoOrderContext $orderContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406251(CryptoOrderContext cryptoOrderContext, String str, Continuation<? super C406251> continuation) {
            super(2, continuation);
            this.$orderContext = cryptoOrderContext;
            this.$acknowledgeId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406251(this.$orderContext, this.$acknowledgeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoEventLogger.DefaultImpls.logCryptoOrderEvent$default(CryptoQuoteOrderDuxo.this.eventLogger, OrderFormStep.REVIEW, this.$orderContext.getRequest().toApiRequest(), this.$orderContext.getRequestContext().getRequestInputs().getMonetizationModel(), null, 8, null);
                CryptoQuoteOrderDuxo.this.applyMutation(new AnonymousClass1(null));
                CryptoOrderValidationService cryptoOrderValidationService = CryptoQuoteOrderDuxo.this.microgramOrderValidationService;
                ValidateCryptoOrderRequestDto validateCryptoOrderRequestDtoValidateCryptoOrderRequestDto$default = CryptoOrderContexts.validateCryptoOrderRequestDto$default(this.$orderContext, null, this.$acknowledgeId, CryptoQuoteOrderDuxo.this.resources, 1, null);
                this.label = 1;
                obj = cryptoOrderValidationService.ValidateCryptoOrder(validateCryptoOrderRequestDtoValidateCryptoOrderRequestDto$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ValidateCryptoOrderResponseDto.MobileDto mobile = ((ValidateCryptoOrderResponseDto) obj).getMobile();
            AlertDto alert = mobile != null ? mobile.getAlert() : null;
            if (alert != null) {
                CryptoQuoteOrderDuxo.this.applyMutation(new AnonymousClass2(null));
                CryptoQuoteOrderDuxo.this.submit(new CryptoQuoteOrderEvent.ShowAlertDto(alert, this.$orderContext.getLoggingCryptoOrderContext()));
            } else {
                CryptoQuoteOrderDuxo.this.onValidationSucceed(this.$orderContext);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$performMicrogramOrderValidation$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$performMicrogramOrderValidation$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
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
            public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, true, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388575, null);
            }
        }

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$performMicrogramOrderValidation$1$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$performMicrogramOrderValidation$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
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
            public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                return ((AnonymousClass2) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388575, null);
            }
        }
    }

    private final void performMicrogramOrderValidation(CryptoOrderContext orderContext, String acknowledgeId) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406251(orderContext, acknowledgeId, null), 3, null);
    }

    public final void validateRecurring(Money amount, ApiInvestmentSchedule.Frequency frequency, Money buyingPower, Money minOrderSize, Money maxOrderSize, LocalDate startDate, boolean ignoreBuyingPowerAlert) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        if (buyingPower != null && amount.compareTo(buyingPower) > 0 && !ignoreBuyingPowerAlert) {
            StringResource.Companion companion = StringResource.INSTANCE;
            submit(new CryptoQuoteOrderEvent.ShowRecurringAlertDialog(new CryptoRecurringOrderAlertDialogFragment.Args(companion.invoke(C40095R.string.rhc_recurring_amount_buying_power_alert_title, new Object[0]), companion.invoke(C40095R.string.rhc_recurring_amount_buying_power_alert_body, new Object[0]), companion.invoke(C40095R.string.rhc_recurring_generic_cta_continue, new Object[0]), companion.invoke(C40095R.string.rhc_recurring_generic_cta_deposit_funds, new Object[0]), CryptoRecurringOrderAlertDialogFragment.Action.CONTINUE_WITH_RECURRING, CryptoRecurringOrderAlertDialogFragment.Action.DEPOSIT_FUNDS)));
            return;
        }
        if (minOrderSize != null && amount.compareTo(minOrderSize) < 0) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            submit(new CryptoQuoteOrderEvent.ShowRecurringAlertDialog(new CryptoRecurringOrderAlertDialogFragment.Args(companion2.invoke(C40095R.string.rhc_recurring_amount_min_order_alert_title, new Object[0]), companion2.invoke(C40095R.string.rhc_recurring_amount_min_order_alert_body, Money.format$default(minOrderSize, null, false, null, false, 0, null, false, null, false, false, 1023, null)), companion2.invoke(C40095R.string.rhc_recurring_generic_cta_dismiss, new Object[0]), null, null, null, 56, null)));
        } else if (maxOrderSize != null && amount.compareTo(maxOrderSize) > 0) {
            StringResource.Companion companion3 = StringResource.INSTANCE;
            submit(new CryptoQuoteOrderEvent.ShowRecurringAlertDialog(new CryptoRecurringOrderAlertDialogFragment.Args(companion3.invoke(C40095R.string.rhc_recurring_amount_max_order_alert_title, new Object[0]), companion3.invoke(C40095R.string.rhc_recurring_amount_max_order_alert_body, Money.format$default(maxOrderSize, null, false, null, false, 0, null, false, null, false, false, 1023, null)), companion3.invoke(C40095R.string.rhc_recurring_generic_cta_dismiss, new Object[0]), null, null, null, 56, null)));
        } else {
            submit(new CryptoQuoteOrderEvent.EnterRecurringFlow(frequency, startDate, amount));
        }
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$initiateDeposit$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {858}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$initiateDeposit$1 */
    static final class C406051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406051(Continuation<? super C406051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTake = FlowKt.take(CryptoQuoteOrderDuxo.this.cryptoExperimentsStore.streamCryptoOrderChecksToGuidedTransfers(), 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInCryptoOrderChecksToGuidedExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$initiateDeposit$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {859, 866}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$initiateDeposit$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int I$0;
            Object L$0;
            Object L$1;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderDuxo;
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

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v4 */
            /* JADX WARN: Type inference failed for: r5v5, types: [int] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                boolean z;
                Object objFirstOrNull;
                TransferConfiguration.TransferAccountSelection transferAccountSelection;
                int i;
                MAXTransferContext.EntryPoint entryPoint;
                String str;
                Object objAccountNumber;
                MAXTransferContext.EntryPoint entryPoint2;
                IntentKey transfer;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    z = this.Z$0;
                    Flow<Boolean> flowStreamCryptoMibExperiment = this.this$0.cryptoExperimentsStore.streamCryptoMibExperiment();
                    this.Z$0 = z;
                    this.label = 1;
                    objFirstOrNull = FlowKt.firstOrNull(flowStreamCryptoMibExperiment, this);
                    if (objFirstOrNull != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    z = this.Z$0;
                    TransferConfiguration.TransferAccountSelection transferAccountSelection2 = (TransferConfiguration.TransferAccountSelection) this.L$1;
                    entryPoint2 = (MAXTransferContext.EntryPoint) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    transferAccountSelection = transferAccountSelection2;
                    objAccountNumber = obj;
                    entryPoint = entryPoint2;
                    str = (String) objAccountNumber;
                    TransferConfiguration.Standard standard = new TransferConfiguration.Standard(null, null, false, transferAccountSelection, new TransferConfiguration.TransferAccountSelection(str, false, i == 0 ? ApiTransferAccount.TransferAccountType.RHS : null, 2, null), null, entryPoint, null, false, false, null, null, false, 8103, null);
                    CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo = this.this$0;
                    if (z) {
                        transfer = new TransferV2(TransferDirectionV2.DEPOSIT, standard, null, 4, null);
                    } else {
                        transfer = new Transfer(standard);
                    }
                    cryptoQuoteOrderDuxo.startActivity(transfer);
                    return Unit.INSTANCE;
                }
                z = this.Z$0;
                ResultKt.throwOnFailure(obj);
                objFirstOrNull = obj;
                Boolean bool = (Boolean) objFirstOrNull;
                ?? BooleanValue = bool != null ? bool.booleanValue() : 0;
                MAXTransferContext.EntryPoint entryPoint3 = MAXTransferContext.EntryPoint.CRYPTO_ORDER_CHECK;
                transferAccountSelection = new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null);
                if (BooleanValue == 0) {
                    i = BooleanValue;
                    entryPoint = entryPoint3;
                    str = null;
                    TransferConfiguration.Standard standard2 = new TransferConfiguration.Standard(null, null, false, transferAccountSelection, new TransferConfiguration.TransferAccountSelection(str, false, i == 0 ? ApiTransferAccount.TransferAccountType.RHS : null, 2, null), null, entryPoint, null, false, false, null, null, false, 8103, null);
                    CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo2 = this.this$0;
                    if (z) {
                    }
                    cryptoQuoteOrderDuxo2.startActivity(transfer);
                    return Unit.INSTANCE;
                }
                CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo3 = this.this$0;
                this.L$0 = entryPoint3;
                this.L$1 = transferAccountSelection;
                this.Z$0 = z;
                this.I$0 = BooleanValue;
                this.label = 2;
                objAccountNumber = cryptoQuoteOrderDuxo3.accountNumber(this);
                if (objAccountNumber != coroutine_suspended) {
                    i = BooleanValue;
                    entryPoint2 = entryPoint3;
                    entryPoint = entryPoint2;
                    str = (String) objAccountNumber;
                    TransferConfiguration.Standard standard22 = new TransferConfiguration.Standard(null, null, false, transferAccountSelection, new TransferConfiguration.TransferAccountSelection(str, false, i == 0 ? ApiTransferAccount.TransferAccountType.RHS : null, 2, null), null, entryPoint, null, false, false, null, null, false, 8103, null);
                    CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo22 = this.this$0;
                    if (z) {
                    }
                    cryptoQuoteOrderDuxo22.startActivity(transfer);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
    }

    public final void initiateDeposit() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406051(null), 3, null);
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onValidationSucceed$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onValidationSucceed$1 */
    static final class C406231 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C406231(Continuation<? super C406231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406231 c406231 = new C406231(continuation);
            c406231.L$0 = obj;
            return c406231;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406231) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, true, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388575, null);
        }
    }

    public final void onValidationSucceed(final CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        applyMutation(new C406231(null));
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.onValidationSucceed$lambda$14(this.f$0, orderContext, (CryptoQuoteOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onValidationSucceed$lambda$14(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoOrderContext cryptoOrderContext, CryptoQuoteOrderViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(cryptoQuoteOrderDuxo), null, null, new CryptoQuoteOrderDuxo5(dataState, cryptoQuoteOrderDuxo, cryptoOrderContext, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void fetchTradeBonusEligibility(final CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.fetchTradeBonusEligibility$lambda$16(this.f$0, orderContext, (CryptoQuoteOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchTradeBonusEligibility$lambda$16(final CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoOrderContext cryptoOrderContext, CryptoQuoteOrderViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        LifecycleHost.DefaultImpls.bind$default(cryptoQuoteOrderDuxo, RxFactory.DefaultImpls.rxSingle$default(cryptoQuoteOrderDuxo, null, new CryptoQuoteOrderDuxo2(dataState, cryptoQuoteOrderDuxo, cryptoOrderContext, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.fetchTradeBonusEligibility$lambda$16$lambda$15(this.f$0, (Optional) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchTradeBonusEligibility$lambda$16$lambda$15(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        cryptoQuoteOrderDuxo.safeSetFormStateReviewing((UiCryptoTradeBonusEligibility) optional.component1());
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$safeSetFormStateReviewing$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {949, 950}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$safeSetFormStateReviewing$1 */
    static final class C406261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiCryptoTradeBonusEligibility $tradeBonusEligibility;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406261(UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, Continuation<? super C406261> continuation) {
            super(2, continuation);
            this.$tradeBonusEligibility = uiCryptoTradeBonusEligibility;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderDuxo.this.new C406261(this.$tradeBonusEligibility, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r5.suspendUntilReady(r4) == r0) goto L17;
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
                Flow<Boolean> flowStreamCryptoTradeFlowMicrogramDisclosureExperiment = CryptoQuoteOrderDuxo.this.cryptoExperimentsStore.streamCryptoTradeFlowMicrogramDisclosureExperiment();
                this.label = 1;
                obj = FlowKt.first(flowStreamCryptoTradeFlowMicrogramDisclosureExperiment, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoQuoteOrderDuxo.this.setFormState(DefaultOrderState.REVIEWING);
                CryptoQuoteOrderDuxo.this.applyMutation(new AnonymousClass1(this.$tradeBonusEligibility, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider = CryptoQuoteOrderDuxo.this.cryptoTradeDisclosuresProvider;
                this.label = 2;
            } else if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            CryptoQuoteOrderDuxo.this.setFormState(DefaultOrderState.REVIEWING);
            CryptoQuoteOrderDuxo.this.applyMutation(new AnonymousClass1(this.$tradeBonusEligibility, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoQuoteOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$safeSetFormStateReviewing$1$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$safeSetFormStateReviewing$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
            final /* synthetic */ UiCryptoTradeBonusEligibility $tradeBonusEligibility;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$tradeBonusEligibility = uiCryptoTradeBonusEligibility;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradeBonusEligibility, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, this.$tradeBonusEligibility, false, null, null, false, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388559, null);
            }
        }
    }

    private final void safeSetFormStateReviewing(UiCryptoTradeBonusEligibility tradeBonusEligibility) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406261(tradeBonusEligibility, null), 3, null);
    }

    public final void onAcknowledgeAlertAndContinue(CryptoAcknowledgeAlertAndContinueAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.serverDrivenCryptoOrderValidator.acknowledgeAlert(action.getAcknowledged_alert_id());
        Iterator<T> it = action.getSide_effects().iterator();
        while (it.hasNext()) {
            if (!(((CryptoSideEffect) it.next()) instanceof ConvertToRebateOrder)) {
                throw new NoWhenBranchMatchedException();
            }
            convertToRebateOrder();
        }
        applyMutation(new C406072(null));
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onAcknowledgeAlertAndContinue$2", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$onAcknowledgeAlertAndContinue$2 */
    static final class C406072 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C406072(Continuation<? super C406072> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406072 c406072 = new C406072(continuation);
            c406072.L$0 = obj;
            return c406072;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406072) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, new CryptoOrderUiEvent(null, 1, null), false, null, false, false, false, null, null, false, false, 8380415, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startActivity(IntentKey intent) {
        submit(new CryptoQuoteOrderEvent.StartActivity(intent));
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setPdtWarningAsSeen$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$setPdtWarningAsSeen$1 */
    static final class C406311 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C406311(Continuation<? super C406311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406311 c406311 = new C406311(continuation);
            c406311.L$0 = obj;
            return c406311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406311) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, true, false, false, null, null, null, false, null, false, false, false, null, null, false, false, 8388351, null);
        }
    }

    public final void setPdtWarningAsSeen() {
        applyMutation(new C406311(null));
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$convertToRebateOrder$1", m3645f = "CryptoQuoteOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$convertToRebateOrder$1 */
    static final class C406041 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C406041(Continuation<? super C406041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406041 c406041 = new C406041(continuation);
            c406041.L$0 = obj;
            return c406041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super CryptoQuoteOrderViewState> continuation) {
            return ((C406041) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoQuoteOrderViewState.copy$default((CryptoQuoteOrderViewState) this.L$0, null, null, null, null, null, false, null, null, false, false, false, null, null, null, false, new CryptoOrderMonetizationModel.Rebate(CryptoOrderMonetizationModel.Rebate.Reason.TemporarilyUnavailable.INSTANCE), false, false, false, null, null, false, false, 8355839, null);
        }
    }

    public final void convertToRebateOrder() {
        applyMutation(new C406041(null));
    }

    public final void updateFeeUnavailableBannerDismissedTimestampPref(String assetCurrencyCode) {
        Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
        this.feeUnsupportedBannerDismissMillisPref.set(assetCurrencyCode, this.clock.millis());
    }

    public final void onToolbarContentTapped() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.onToolbarContentTapped$lambda$18(this.f$0, (CryptoQuoteOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onToolbarContentTapped$lambda$18(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoQuoteOrderViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoQuoteOrderDuxo.submit(new CryptoQuoteOrderEvent.ShowOrderTypeSelector(it.getRecurringHookFrequency() != null));
        return Unit.INSTANCE;
    }

    public final void emitBottomSheetData(ImmutableList<BottomSheetTypeDto> dtos) {
        Intrinsics.checkNotNullParameter(dtos, "dtos");
        if (dtos.isEmpty()) {
            return;
        }
        this.bottomSheetServiceLazy.get().emitBottomSheetData(dtos);
    }

    public final void onOrderValidationAcknowledgeAndContinue(final String acknowledgeId) {
        Intrinsics.checkNotNullParameter(acknowledgeId, "acknowledgeId");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.onOrderValidationAcknowledgeAndContinue$lambda$19(this.f$0, acknowledgeId, (CryptoQuoteOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderValidationAcknowledgeAndContinue$lambda$19(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, String str, CryptoQuoteOrderViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext = it.getCryptoOrderContext();
        if (cryptoOrderContext != null) {
            cryptoQuoteOrderDuxo.performMicrogramOrderValidation(cryptoOrderContext, str);
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void onBuyMax() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderDuxo.onBuyMax$lambda$20(this.f$0, (CryptoQuoteOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBuyMax$lambda$20(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo, CryptoQuoteOrderViewState it) {
        Money buyingPower;
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderContext cryptoOrderContext = it.getCryptoOrderContext();
        if (cryptoOrderContext == null) {
            return Unit.INSTANCE;
        }
        CryptoBuyingPower cryptoBuyingPower = cryptoOrderContext.getAccountContext().getCryptoBuyingPower();
        BigDecimal decimalValue = (cryptoBuyingPower == null || (buyingPower = cryptoBuyingPower.getBuyingPower()) == null) ? null : buyingPower.getDecimalValue();
        if (decimalValue == null || BigDecimals7.isZero(decimalValue)) {
            return Unit.INSTANCE;
        }
        cryptoQuoteOrderDuxo.setOrderSize((BigDecimal) ComparisonsKt.minOf(decimalValue, BigDecimals7.safeMultiply(cryptoOrderContext.getRequestContext().getCurrencyPair().getMaxOrderSize(), cryptoOrderContext.getRequestContext().getQuote().getAskPrice().getDecimalValue())));
        EventLogger.DefaultImpls.logTap$default(cryptoQuoteOrderDuxo.eventLogger, null, cryptoQuoteOrderDuxo.getEventScreen(), new Component(Component.ComponentType.BUTTON, AnalyticsStrings.MAX_WELCOME_TAG, null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoOrderContext.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
        this.performanceLogger.abortMetric(PerformanceMetricEventData.Name.SCREEN_LOAD, ((CryptoQuoteOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getUiCurrencyPair().getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object accountId(Continuation<? super String> continuation) {
        C406021 c406021;
        CryptoAccountSwitcherLocation buy;
        if (continuation instanceof C406021) {
            c406021 = (C406021) continuation;
            int i = c406021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c406021.label = i - Integer.MIN_VALUE;
            } else {
                c406021 = new C406021(continuation);
            }
        }
        Object objFirstOrNull = c406021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c406021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider;
            Companion companion = INSTANCE;
            int i3 = WhenMappings.$EnumSwitchMapping$2[((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide().ordinal()];
            if (i3 == 1) {
                buy = new CryptoAccountSwitcherLocation.Buy(((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getId());
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buy = new CryptoAccountSwitcherLocation.SellQuote(((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getId());
            }
            Flow<UUID> flowStreamCryptoAccountId = cryptoAccountProvider.streamCryptoAccountId(buy);
            c406021.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamCryptoAccountId, c406021);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        UUID uuid = (UUID) objFirstOrNull;
        if (uuid != null) {
            return uuid.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object accountNumber(Continuation<? super String> continuation) {
        CryptoAccountSwitcherLocation buy;
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider;
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$2[((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide().ordinal()];
        if (i == 1) {
            buy = new CryptoAccountSwitcherLocation.Buy(((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getId());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            buy = new CryptoAccountSwitcherLocation.SellQuote(((CryptoQuoteOrderFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getId());
        }
        return FlowKt.firstOrNull(cryptoAccountProvider.streamAccountNumber(buy), continuation);
    }

    /* compiled from: CryptoQuoteOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoQuoteOrderDuxo, CryptoQuoteOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoQuoteOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoQuoteOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoQuoteOrderFragment.Args getArgs(CryptoQuoteOrderDuxo cryptoQuoteOrderDuxo) {
            return (CryptoQuoteOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoQuoteOrderDuxo);
        }
    }
}
