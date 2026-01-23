package com.robinhood.shared.trade.crypto.p397ui.order;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.analytics.EventLogger;
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
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.TaxlotabilityStore;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.ConvertToRebateOrder;
import com.robinhood.models.serverdriven.experimental.api.CryptoAcknowledgeAlertAndContinueAction;
import com.robinhood.models.serverdriven.experimental.api.CryptoSideEffect;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
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
import com.robinhood.shared.trade.crypto.analytics.AnalyticsExtensions2;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
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
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderEvent;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderFragment;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderViewState;
import com.robinhood.shared.trade.crypto.p397ui.powerInfoAlert.CryptoPowerInfoAlertProvider;
import com.robinhood.shared.trade.crypto.p397ui.tooltip.CryptoOrderTooltipData;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.CryptoTradeBonusEligibilityProvider;
import com.robinhood.shared.trade.crypto.util.CryptoOrderMinuteFlowProvider;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderUiEvent;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.StaticInputs;
import com.robinhood.shared.trade.crypto.views.edittext.CryptoTextWatcher;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.moshi.LazyMoshi;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.CryptoOrderValidationService;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderRequestDto;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponseDto;
import crypto.fee_tier.proto.p434v1.CryptoFeesBottomSheetService;
import crypto.fee_tier.proto.p434v1.FeeTierUpsellBottomSheetEventDto;
import crypto.fee_tier.proto.p434v1.LaunchFeeTierUpsellBottomSheetRequestDto;
import crypto.fee_tier.proto.p434v1.StreamFeeTierUpsellBottomSheetEventRequestDto;
import crypto.fee_tier.proto.p434v1.StreamFeeTierUpsellBottomSheetEventResponseDto;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Clock;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: CryptoOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Ø\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002Ø\u0001B\u008f\u0002\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\b\b\u0001\u0010(\u001a\u00020\"\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\b\b\u0001\u0010/\u001a\u00020\"\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\b\b\u0001\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020D2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020DH\u0002¢\u0006\u0004\bK\u0010FJ#\u0010P\u001a\u00020D2\u0006\u0010M\u001a\u00020L2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010T\u001a\u00020D2\b\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020DH\u0002¢\u0006\u0004\bV\u0010FJ\u000f\u0010W\u001a\u00020DH\u0002¢\u0006\u0004\bW\u0010FJ\u0017\u0010Z\u001a\u00020D2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020D2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010NH\u0082@¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010NH\u0082@¢\u0006\u0004\bb\u0010aJ\u000f\u0010c\u001a\u00020DH\u0016¢\u0006\u0004\bc\u0010FJ\u000f\u0010d\u001a\u00020DH\u0016¢\u0006\u0004\bd\u0010FJ\r\u0010e\u001a\u00020D¢\u0006\u0004\be\u0010FJ\u0017\u0010h\u001a\u00020D2\b\u0010g\u001a\u0004\u0018\u00010f¢\u0006\u0004\bh\u0010iJ\u0015\u0010l\u001a\u00020D2\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mJ\u0015\u0010p\u001a\u00020D2\u0006\u0010o\u001a\u00020n¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020D¢\u0006\u0004\br\u0010FJ\u0013\u0010u\u001a\b\u0012\u0004\u0012\u00020t0s¢\u0006\u0004\bu\u0010vJ\u0013\u0010w\u001a\b\u0012\u0004\u0012\u00020j0s¢\u0006\u0004\bw\u0010vJ\u0015\u0010z\u001a\u00020D2\u0006\u0010y\u001a\u00020x¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020D2\b\u0010|\u001a\u0004\u0018\u00010t¢\u0006\u0004\b}\u0010~J\u0018\u0010\u0080\u0001\u001a\u00020D2\u0006\u0010\u007f\u001a\u00020L¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0083\u0001\u001a\u00020D2\u0006\u0010M\u001a\u00020LH\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J\u000f\u0010\u0084\u0001\u001a\u00020D¢\u0006\u0005\b\u0084\u0001\u0010FJ\u0018\u0010\u0085\u0001\u001a\u00020D2\u0006\u0010M\u001a\u00020L¢\u0006\u0006\b\u0085\u0001\u0010\u0081\u0001J\u0018\u0010\u0086\u0001\u001a\u00020D2\u0006\u0010M\u001a\u00020L¢\u0006\u0006\b\u0086\u0001\u0010\u0081\u0001J\u001a\u0010\u0089\u0001\u001a\u00020D2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u000f\u0010\u008b\u0001\u001a\u00020D¢\u0006\u0005\b\u008b\u0001\u0010FJ\u001a\u0010\u008e\u0001\u001a\u00020D2\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0092\u0001\u001a\u00020D2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u000f\u0010\u0094\u0001\u001a\u00020D¢\u0006\u0005\b\u0094\u0001\u0010FJ\u000f\u0010\u0095\u0001\u001a\u00020D¢\u0006\u0005\b\u0095\u0001\u0010FJ\u0018\u0010\u0096\u0001\u001a\u00020D2\u0006\u0010O\u001a\u00020N¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0011\u0010\u0098\u0001\u001a\u00020DH\u0014¢\u0006\u0005\b\u0098\u0001\u0010FJ!\u0010\u009c\u0001\u001a\u00020D2\u000f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u009e\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u009f\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010 \u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010¡\u0001R\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¢\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010£\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010¤\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¥\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010¦\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010§\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010¨\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010©\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010ª\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010«\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010¬\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u00ad\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010®\u0001R\u0015\u0010(\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010¬\u0001R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010¯\u0001R\u0015\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010°\u0001R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010±\u0001R\u0015\u0010/\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010¬\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010²\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010³\u0001R\u0015\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010´\u0001R\u001d\u0010A\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bA\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R!\u0010½\u0001\u001a\u00030¸\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R!\u0010Â\u0001\u001a\u00030¾\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0001\u0010º\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R!\u0010Ç\u0001\u001a\u00030Ã\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÄ\u0001\u0010º\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001R \u0010É\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010L0È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Ì\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ï\u0001\u001a\u00030Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u001a\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0015\u0010×\u0001\u001a\u00030Ô\u00018F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001¨\u0006Ù\u0001"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "bottomSheetService", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "cryptoInputModePref", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderManager", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;", "cryptoTradeBonusEligibilityProvider", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/analytics/CryptoEventLogger;", "eventLogger", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "serverDrivenCryptoOrderValidator", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenEuAdvancedOrdersTooltipPref", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "cryptoFeeUiEventProvider", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "cryptoOrderMinuteFlowProvider", "hasSeenTaxLotOrderTooltipPref", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "taxlotabilityStore", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "cryptoTradeUserInputsService", "hasSeenFeeUpsellBottomSheetPref", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/content/Context;", "context", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/analytics/CryptoEventLogger;Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/performancelogger/PerformanceLogger;Landroid/content/res/Resources;Lj$/time/Clock;Landroid/content/Context;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/navigation/Navigator;Landroidx/lifecycle/SavedStateHandle;)V", "", "showMarketPriceDialog", "()V", "Lcom/robinhood/models/db/Order$Configuration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "showOrderTypeEducation", "(Lcom/robinhood/models/db/Order$Configuration;)V", "showSpreadDialog", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "orderContext", "", "acknowledgeId", "performMicrogramOrderValidation", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Ljava/lang/String;)V", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "tradeBonusEligibility", "safeSetFormStateReviewing", "(Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;)V", "onEditPriceClicked", "showTradeBonusBottomSheet", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "uiFeeEstimation", "showFeeDefinitionBottomSheet", "(Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;)V", "Lcom/robinhood/android/navigation/keys/IntentKey;", "intent", "startActivity", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "accountId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountNumber", "onCreate", "onStart", "changeInputMode", "Ljava/math/BigDecimal;", "amount", "onAmountChanged", "(Ljava/math/BigDecimal;)V", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "formState", "updateFormState", "(Lcom/robinhood/android/lib/trade/DefaultOrderState;)V", "Lcom/robinhood/models/api/CryptoOrderType;", "orderType", "convertToOrder", "(Lcom/robinhood/models/api/CryptoOrderType;)V", "sellAll", "Lio/reactivex/Observable;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;", "observeOrderState", "()Lio/reactivex/Observable;", "observeFormState", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "dto", "setOrderSize", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;)V", "orderState", "submitOrder", "(Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;)V", "cryptoOrderContext", "onReviewButtonTapped", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)V", "validateAndReviewOrder$feature_trade_crypto_externalDebug", "validateAndReviewOrder", "initiateDeposit", "onValidationSucceed", "fetchTradeBonusEligibility", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoAcknowledgeAlertAndContinueAction;", "action", "onAcknowledgeAlertAndContinue", "(Lcom/robinhood/models/serverdriven/experimental/api/CryptoAcknowledgeAlertAndContinueAction;)V", "setPdtWarningAsSeen", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "tapAction", "handleCryptoOrderReviewRowOnTap", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;)V", "Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData$Type;", "type", "onTooltipShown", "(Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData$Type;)V", "convertToRebateOrder", "showFeeTierUpsellBottomSheet", "onOrderValidationAcknowledgeAndContinue", "(Ljava/lang/String;)V", "onCleared", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "dtos", "emitBottomSheetData", "(Lkotlinx/collections/immutable/ImmutableList;)V", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/shared/app/type/AppType;", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "Lcom/robinhood/analytics/CryptoEventLogger;", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Landroid/content/res/Resources;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "staticInputs$delegate", "Lkotlin/Lazy;", "getStaticInputs", "()Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "staticInputs", "Lmicrogram/android/inject/MicrogramComponent;", "cryptoFeesMicrogram$delegate", "getCryptoFeesMicrogram", "()Lmicrogram/android/inject/MicrogramComponent;", "cryptoFeesMicrogram", "Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;", "feesBottomSheetService$delegate", "getFeesBottomSheetService", "()Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;", "feesBottomSheetService", "Lkotlinx/coroutines/flow/MutableStateFlow;", "orderStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "cryptoTradingMicrogram", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "Lcontracts/crypto/trade/proto/v1/CryptoOrderValidationService;", "microgramOrderValidationService", "Lcontracts/crypto/trade/proto/v1/CryptoOrderValidationService;", "", "hasPerformanceBeenLogged", "Z", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderDuxo extends BaseDuxo5<CryptoOrderViewState, CryptoOrderEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AppType appType;
    private final CryptoTradingBottomSheetService bottomSheetService;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoFeeUiEventProvider cryptoFeeUiEventProvider;

    /* renamed from: cryptoFeesMicrogram$delegate, reason: from kotlin metadata */
    private final Lazy cryptoFeesMicrogram;
    private final EnumPreference<CryptoInputMode> cryptoInputModePref;
    private final CryptoOrderContextFactory cryptoOrderContextFactory;
    private final CryptoOrderManager cryptoOrderManager;
    private final CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider;
    private final CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider;
    private final CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider;
    private final CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider;
    private final CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider;
    private final RealCryptoTradeUserInputsService cryptoTradeUserInputsService;
    private final MicrogramManager2 cryptoTradingMicrogram;
    private final CurrencyPairV2Store currencyPairStore;
    private final CryptoEventLogger eventLogger;

    /* renamed from: feesBottomSheetService$delegate, reason: from kotlin metadata */
    private final Lazy feesBottomSheetService;
    private boolean hasPerformanceBeenLogged;
    private final BooleanPreference hasSeenEuAdvancedOrdersTooltipPref;
    private final BooleanPreference hasSeenFeeUpsellBottomSheetPref;
    private final BooleanPreference hasSeenTaxLotOrderTooltipPref;
    private final MicrogramManager microgramManager;
    private final CryptoOrderValidationService microgramOrderValidationService;
    private final StateFlow2<CryptoOrderContext> orderStateFlow;
    private final PerformanceLogger performanceLogger;
    private final Resources resources;
    private final SavedStateHandle savedStateHandle;
    private final ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator;

    /* renamed from: staticInputs$delegate, reason: from kotlin metadata */
    private final Lazy staticInputs;
    private final TaxlotabilityStore taxlotabilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

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
            int[] iArr3 = new int[CryptoInputMode.values().length];
            try {
                iArr3[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CryptoOrderType.values().length];
            try {
                iArr4[CryptoOrderType.STOP_LOSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[CryptoOrderType.STOP_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[CryptoOrderType.MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[CryptoOrderType.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[CryptoOrderTooltipData.Type.values().length];
            try {
                iArr5[CryptoOrderTooltipData.Type.EU_ADVANCED_ORDERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[CryptoOrderTooltipData.Type.TAX_LOT_ORDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo", m3645f = "CryptoOrderDuxo.kt", m3646l = {940}, m3647m = "accountId")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$accountId$1 */
    static final class C402771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C402771(Continuation<? super C402771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoOrderDuxo.this.accountId(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public CryptoOrderDuxo(AccountProvider accountProvider, AppType appType, CryptoTradingBottomSheetService bottomSheetService, CryptoAccountProvider cryptoAccountProvider, EnumPreference<CryptoInputMode> cryptoInputModePref, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderManager cryptoOrderManager, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider, CurrencyPairV2Store currencyPairStore, CryptoEventLogger eventLogger, ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, CryptoExperimentsStore cryptoExperimentsStore, @HasSeenEuAdvancedOrdersTooltipPref BooleanPreference hasSeenEuAdvancedOrdersTooltipPref, CryptoFeeUiEventProvider cryptoFeeUiEventProvider, CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider, @HasSeenTaxLotOrderTooltipPref BooleanPreference hasSeenTaxLotOrderTooltipPref, TaxlotabilityStore taxlotabilityStore, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, @CryptoFeePrefs2 BooleanPreference hasSeenFeeUpsellBottomSheetPref, final LazyMoshi moshi, MicrogramManager microgramManager, PerformanceLogger performanceLogger, Resources resources, Clock clock, final Context context, DuxoBundle duxoBundle, final Navigator navigator, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeBonusEligibilityProvider, "cryptoTradeBonusEligibilityProvider");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(hasSeenEuAdvancedOrdersTooltipPref, "hasSeenEuAdvancedOrdersTooltipPref");
        Intrinsics.checkNotNullParameter(cryptoFeeUiEventProvider, "cryptoFeeUiEventProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderMinuteFlowProvider, "cryptoOrderMinuteFlowProvider");
        Intrinsics.checkNotNullParameter(hasSeenTaxLotOrderTooltipPref, "hasSeenTaxLotOrderTooltipPref");
        Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
        Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        OrderSide side = ((CryptoOrderFragment.Args) companion.getArgs(savedStateHandle)).getSide();
        CryptoInputMode cryptoInputMode = (CryptoInputMode) cryptoInputModePref.getValue();
        CryptoOrderPrices orderPrices = ((CryptoOrderFragment.Args) companion.getArgs(savedStateHandle)).getOrderPrices();
        OrderTimeInForce timeInForce = ((CryptoOrderFragment.Args) companion.getArgs(savedStateHandle)).getTimeInForce();
        boolean z = hasSeenEuAdvancedOrdersTooltipPref.get();
        boolean z2 = hasSeenTaxLotOrderTooltipPref.get();
        AppType appType2 = AppType.RHC;
        CryptoOrderViewState.InputState inputState = new CryptoOrderViewState.InputState(side, cryptoInputMode, false, orderPrices, timeInForce, null, null, null, false, null, false, null, z, appType == appType2, null, false, z2, 53220, null);
        boolean z3 = appType == appType2;
        Instant instantNow = Instant.now(clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        super(new CryptoOrderViewState(inputState, null, null, z3, instantNow, null, false, 102, null), duxoBundle);
        this.accountProvider = accountProvider;
        this.appType = appType;
        this.bottomSheetService = bottomSheetService;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoInputModePref = cryptoInputModePref;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoOrderManager = cryptoOrderManager;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoPowerInfoAlertProvider = cryptoPowerInfoAlertProvider;
        this.cryptoTradeBonusEligibilityProvider = cryptoTradeBonusEligibilityProvider;
        this.currencyPairStore = currencyPairStore;
        this.eventLogger = eventLogger;
        this.serverDrivenCryptoOrderValidator = serverDrivenCryptoOrderValidator;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.hasSeenEuAdvancedOrdersTooltipPref = hasSeenEuAdvancedOrdersTooltipPref;
        this.cryptoFeeUiEventProvider = cryptoFeeUiEventProvider;
        this.cryptoOrderMinuteFlowProvider = cryptoOrderMinuteFlowProvider;
        this.hasSeenTaxLotOrderTooltipPref = hasSeenTaxLotOrderTooltipPref;
        this.taxlotabilityStore = taxlotabilityStore;
        this.cryptoTradeDisclosuresProvider = cryptoTradeDisclosuresProvider;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.hasSeenFeeUpsellBottomSheetPref = hasSeenFeeUpsellBottomSheetPref;
        this.microgramManager = microgramManager;
        this.performanceLogger = performanceLogger;
        this.resources = resources;
        this.savedStateHandle = savedStateHandle;
        this.staticInputs = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderDuxo.staticInputs_delegate$lambda$0(this.f$0);
            }
        });
        this.cryptoFeesMicrogram = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderDuxo.cryptoFeesMicrogram_delegate$lambda$3(this.f$0, context, navigator, moshi);
            }
        });
        this.feesBottomSheetService = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderDuxo.feesBottomSheetService_delegate$lambda$4(this.f$0);
            }
        });
        this.orderStateFlow = StateFlow4.MutableStateFlow(null);
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-trading", null, 2, null), null, 2, null), null, 4, null);
        this.cryptoTradingMicrogram = microgramManager2M16549getInstancemoChb0s$default;
        this.microgramOrderValidationService = (CryptoOrderValidationService) microgramManager2M16549getInstancemoChb0s$default.getComponent().getServiceLocator().getClient(CryptoOrderValidationService.class);
        PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, PerformanceMetricEventData.Name.SCREEN_LOAD, null, ((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId(), new PerformanceMetricEventData.Context(false, false, false, null, null, null, null, new PerformanceMetricEventData.Context.ScreenLoad(getEventScreen(), null, null, 6, null), null, null, null, null, 3967, null), 2, null);
    }

    public final Screen getEventScreen() {
        Screen.Name name = Screen.Name.CRYPTO_ORDER_ENTRY;
        String string2 = ((CryptoOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StaticInputs getStaticInputs() {
        return (StaticInputs) this.staticInputs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticInputs staticInputs_delegate$lambda$0(CryptoOrderDuxo cryptoOrderDuxo) {
        Companion companion = INSTANCE;
        return new StaticInputs(((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) cryptoOrderDuxo)).getCurrencyPairId(), ((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) cryptoOrderDuxo)).getOrderUuid());
    }

    private final MicrogramComponent getCryptoFeesMicrogram() {
        return (MicrogramComponent) this.cryptoFeesMicrogram.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramComponent cryptoFeesMicrogram_delegate$lambda$3(final CryptoOrderDuxo cryptoOrderDuxo, Context context, Navigator navigator, LazyMoshi lazyMoshi) {
        return RealMicrogramUiLaunchService2.getComponentWithUiLaunch(cryptoOrderDuxo.microgramManager, new RemoteMicrogramApplication(CryptoFeesMicrogramConstants.CryptoFeesMicrogramName, CryptoFeesMicrogramConstants.getVolumeTierMinMicrogramVersion()), ViewModel2.getViewModelScope(cryptoOrderDuxo), lazyMoshi, MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator)), new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.cryptoFeesMicrogram_delegate$lambda$3$lambda$1(this.f$0, (FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.cryptoFeesMicrogram_delegate$lambda$3$lambda$2(this.f$0, (DialogFragmentKey) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoFeesMicrogram_delegate$lambda$3$lambda$1(CryptoOrderDuxo cryptoOrderDuxo, FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoOrderDuxo.submit(new CryptoOrderEvent.ShowFragmentInActivity(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoFeesMicrogram_delegate$lambda$3$lambda$2(CryptoOrderDuxo cryptoOrderDuxo, DialogFragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (cryptoOrderDuxo.getLifecycleState().getValue() == LifecycleState.RESUMED) {
            cryptoOrderDuxo.submit(new CryptoOrderEvent.ShowDialogFragment(it));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoFeesBottomSheetService getFeesBottomSheetService() {
        return (CryptoFeesBottomSheetService) this.feesBottomSheetService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoFeesBottomSheetService feesBottomSheetService_delegate$lambda$4(CryptoOrderDuxo cryptoOrderDuxo) {
        return (CryptoFeesBottomSheetService) cryptoOrderDuxo.getCryptoFeesMicrogram().getServiceLocator().getClient(CryptoFeesBottomSheetService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getCryptoFeesMicrogram();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C402861(null));
        Observable map = asObservable(getStateFlow()).distinctUntilChanged(new Function() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$inputObs$1
            @Override // io.reactivex.functions.Function
            public final CryptoOrderViewState.InputState apply(CryptoOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getInputState();
            }
        }).map(new Function() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$inputObs$2
            @Override // io.reactivex.functions.Function
            public final RequestInputs apply(CryptoOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getInputState().getRequestInput();
            }
        });
        IdlingResourceCounters2.setBusy(IdlingResourceType.CRYPTO_ORDER_CONTEXT_FACTORY, true);
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C402892(map, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C402903(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C402914(null));
        if (((CryptoOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSide() == OrderSide.SELL) {
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C402925(null));
        }
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C402936(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C402947(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C402958(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C402969(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C4028710(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C4028811(null));
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$1 */
    static final class C402861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402861(Continuation<? super C402861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402861(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "it", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$1$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507671 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
                final /* synthetic */ Instant $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507671(Instant instant, Continuation<? super C507671> continuation) {
                    super(2, continuation);
                    this.$it = instant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507671 c507671 = new C507671(this.$it, continuation);
                    c507671.L$0 = obj;
                    return c507671;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                    return ((C507671) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderViewState.copy$default((CryptoOrderViewState) this.L$0, null, null, null, false, this.$it, null, false, 111, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507671((Instant) this.L$0, null));
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
                Flow<Instant> minuteFlow = CryptoOrderDuxo.this.cryptoOrderMinuteFlowProvider.getMinuteFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(minuteFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$2 */
    static final class C402892 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<RequestInputs> $inputObs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C402892(Observable<RequestInputs> observable, Continuation<? super C402892> continuation) {
            super(2, continuation);
            this.$inputObs = observable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402892(this.$inputObs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderContextFactory cryptoOrderContextFactory = CryptoOrderDuxo.this.cryptoOrderContextFactory;
                Screen eventScreen = CryptoOrderDuxo.this.getEventScreen();
                StaticInputs staticInputs = CryptoOrderDuxo.this.getStaticInputs();
                Observable<RequestInputs> observable = this.$inputObs;
                Intrinsics.checkNotNull(observable);
                Observable<CryptoOrderContext> observableDistinctUntilChanged = cryptoOrderContextFactory.create(eventScreen, staticInputs, observable).doFinally(new Action() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo.onCreate.2.1
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        IdlingResourceCounters2.setBusy(IdlingResourceType.CRYPTO_ORDER_CONTEXT_FACTORY, false);
                    }
                }).doOnError(new Consumer() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo.onCreate.2.2
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Throwable th) {
                        IdlingResourceCounters2.setBusy(IdlingResourceType.CRYPTO_ORDER_CONTEXT_FACTORY, false);
                    }
                }).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$2$3", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(cryptoOrderContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) this.L$0;
                    StateFlow2 stateFlow2 = this.this$0.orderStateFlow;
                    do {
                        value = stateFlow2.getValue();
                    } while (!stateFlow2.compareAndSet(value, cryptoOrderContext));
                    CryptoOrderDuxo cryptoOrderDuxo = this.this$0;
                    cryptoOrderDuxo.applyMutation(new AnonymousClass2(cryptoOrderContext, cryptoOrderDuxo, null));
                    if (!this.this$0.hasPerformanceBeenLogged && cryptoOrderContext.isScreenDataLoaded()) {
                        this.this$0.hasPerformanceBeenLogged = true;
                        this.this$0.performanceLogger.completeMetric(PerformanceMetricEventData.Name.SCREEN_LOAD, ((CryptoOrderFragment.Args) CryptoOrderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getCurrencyPairId());
                    }
                    IdlingResourceCounters2.setBusy(IdlingResourceType.CRYPTO_ORDER_CONTEXT_FACTORY, false);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: CryptoOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$2$3$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$2$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
                final /* synthetic */ CryptoOrderContext $cryptoOrderContext;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoOrderContext cryptoOrderContext, CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$cryptoOrderContext = cryptoOrderContext;
                    this.this$0 = cryptoOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$cryptoOrderContext, this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                    return ((AnonymousClass2) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    CryptoOrderViewState.OrderState orderState;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                    CryptoOrderUiEvent shouldReviewOrder = this.$cryptoOrderContext.getRequestContext().getRequestInputs().getShouldReviewOrder();
                    if ((shouldReviewOrder != null ? shouldReviewOrder.consume() : null) != null) {
                        CryptoOrderDuxo cryptoOrderDuxo = this.this$0;
                        CryptoOrderContext cryptoOrderContext = this.$cryptoOrderContext;
                        Intrinsics.checkNotNull(cryptoOrderContext);
                        cryptoOrderDuxo.validateAndReviewOrder$feature_trade_crypto_externalDebug(cryptoOrderContext);
                    }
                    CryptoOrderViewState.OrderState orderState2 = cryptoOrderViewState.getOrderState();
                    if (orderState2 != null) {
                        CryptoOrderContext cryptoOrderContext2 = this.$cryptoOrderContext;
                        Intrinsics.checkNotNull(cryptoOrderContext2);
                        CryptoOrderViewState.OrderState orderStateCopy$default = CryptoOrderViewState.OrderState.copy$default(orderState2, cryptoOrderContext2, cryptoOrderViewState.getInputState(), cryptoOrderViewState.isRhcApp(), null, 8, null);
                        if (orderStateCopy$default != null) {
                            orderState = orderStateCopy$default;
                        } else {
                            CryptoOrderContext cryptoOrderContext3 = this.$cryptoOrderContext;
                            Intrinsics.checkNotNull(cryptoOrderContext3);
                            orderState = new CryptoOrderViewState.OrderState(cryptoOrderContext3, cryptoOrderViewState.getInputState(), cryptoOrderViewState.isRhcApp(), null, 8, null);
                        }
                    }
                    return CryptoOrderViewState.copy$default(cryptoOrderViewState, null, orderState, null, false, null, null, false, 125, null);
                }
            }
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$3", m3645f = "CryptoOrderDuxo.kt", m3646l = {300}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$3 */
    static final class C402903 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402903(Continuation<? super C402903> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402903(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402903) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoOrderDuxo.this.currencyPairStore.streamCurrencyPairFlow(((CryptoOrderFragment.Args) CryptoOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderDuxo.this)).getCurrencyPairId());
                this.label = 1;
                obj = FlowKt.first(flowStreamCurrencyPairFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CryptoOrderDuxo.this.applyMutation(new AnonymousClass1((UiCurrencyPair) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$3$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
            final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UiCurrencyPair uiCurrencyPair, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$uiCurrencyPair = uiCurrencyPair;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$uiCurrencyPair, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, this.$uiCurrencyPair, false, null, false, null, false, false, null, false, false, 130943, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$4", m3645f = "CryptoOrderDuxo.kt", m3646l = {EnumC7081g.f2774x74902ae0}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$4 */
    static final class C402914 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402914(Continuation<? super C402914> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402914(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402914) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider = CryptoOrderDuxo.this.cryptoPowerInfoAlertProvider;
                Companion companion = CryptoOrderDuxo.INSTANCE;
                Flow powerInfoAlertFlow$default = CryptoPowerInfoAlertProvider.getPowerInfoAlertFlow$default(cryptoPowerInfoAlertProvider, ((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) CryptoOrderDuxo.this)).getCurrencyPairId(), ((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) CryptoOrderDuxo.this)).getSide(), null, 4, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/ui/ServerDrivenAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$4$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ServerDrivenAlert, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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

            /* compiled from: CryptoOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$4$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507691 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
                final /* synthetic */ ServerDrivenAlert $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507691(ServerDrivenAlert serverDrivenAlert, Continuation<? super C507691> continuation) {
                    super(2, continuation);
                    this.$it = serverDrivenAlert;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507691 c507691 = new C507691(this.$it, continuation);
                    c507691.L$0 = obj;
                    return c507691;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                    return ((C507691) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderViewState.copy$default((CryptoOrderViewState) this.L$0, null, null, this.$it, false, null, null, false, 123, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507691((ServerDrivenAlert) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$5", m3645f = "CryptoOrderDuxo.kt", m3646l = {EnumC7081g.f2775xbcb7e6f3}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$5 */
    static final class C402925 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402925(Continuation<? super C402925> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402925(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402925) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<TaxlotabilityResponseDto> flowStreamTaxlotability = CryptoOrderDuxo.this.taxlotabilityStore.streamTaxlotability(((CryptoOrderFragment.Args) CryptoOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderDuxo.this)).getCurrencyPairId());
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
            CryptoOrderDuxo.this.applyMutation(new AnonymousClass1(taxlotabilityResponseDto != null ? taxlotabilityResponseDto.getState() : null, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$5$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
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
            public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, false, null, false, false, null, this.$taxlotabilityState == TaxlotabilityStateDto.STATE_ENABLED, false, 98303, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$6", m3645f = "CryptoOrderDuxo.kt", m3646l = {339}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$6 */
    static final class C402936 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402936(Continuation<? super C402936> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402936(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402936) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoOrderDuxo.this.hasSeenTaxLotOrderTooltipPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$6$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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

            /* compiled from: CryptoOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$6$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507701 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507701(boolean z, Continuation<? super C507701> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507701 c507701 = new C507701(this.$it, continuation);
                    c507701.L$0 = obj;
                    return c507701;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                    return ((C507701) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                    return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, false, null, false, false, null, false, this.$it, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507701(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$7", m3645f = "CryptoOrderDuxo.kt", m3646l = {346}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$7 */
    static final class C402947 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402947(Continuation<? super C402947> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402947(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402947) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<DialogFragmentKey> flowStreamLaunchDialog = CryptoOrderDuxo.this.bottomSheetService.streamLaunchDialog();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$7$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DialogFragmentKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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
                this.this$0.submit(new CryptoOrderEvent.ShowDialogFragment((DialogFragmentKey) this.L$0));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8", m3645f = "CryptoOrderDuxo.kt", m3646l = {352}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8 */
    static final class C402958 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402958(Continuation<? super C402958> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402958(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402958) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoOrderViewState> stateFlow = CryptoOrderDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C402752(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8$invokeSuspend$$inlined$map$1$2 */
                    public static final class C402752<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C402752.this.emit(null, this);
                            }
                        }

                        public C402752(FlowCollector flowCollector) {
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
                                CryptoOrderViewState.OrderState orderState = ((CryptoOrderViewState) obj).getOrderState();
                                CryptoOrderContext cryptoOrderContext = orderState != null ? orderState.getCryptoOrderContext() : null;
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
                }, new C40274xe89231e0(null, CryptoOrderDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8$3", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoOrderReviewMessageAndDisclosuresState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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

            /* compiled from: CryptoOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8$3$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$8$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
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
                public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                    CryptoOrderViewState.OrderState orderState = cryptoOrderViewState.getOrderState();
                    return CryptoOrderViewState.copy$default(cryptoOrderViewState, null, orderState != null ? CryptoOrderViewState.OrderState.copy$default(orderState, null, null, false, this.$it, 7, null) : null, null, false, null, null, false, 125, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((CryptoOrderReviewMessageAndDisclosuresState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$9", m3645f = "CryptoOrderDuxo.kt", m3646l = {361}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$9 */
    static final class C402969 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402969(Continuation<? super C402969> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402969(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402969) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoOrderViewState> stateFlow = CryptoOrderDuxo.this.getStateFlow();
                Flow<CryptoOrderContext> flow = new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C402762(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2 */
                    public static final class C402762<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return C402762.this.emit(null, this);
                            }
                        }

                        public C402762(FlowCollector flowCollector) {
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
                                CryptoOrderViewState.OrderState orderState = ((CryptoOrderViewState) obj).getOrderState();
                                CryptoOrderContext cryptoOrderContext = orderState != null ? orderState.getCryptoOrderContext() : null;
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$9$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {361}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$9$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$10", m3645f = "CryptoOrderDuxo.kt", m3646l = {366}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$10 */
    static final class C4028710 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C4028710(Continuation<? super C4028710> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C4028710(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4028710) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMibExperiment = CryptoOrderDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$10$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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

            /* compiled from: CryptoOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$10$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$10$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507681 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507681(boolean z, Continuation<? super C507681> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507681 c507681 = new C507681(this.$it, continuation);
                    c507681.L$0 = obj;
                    return c507681;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                    return ((C507681) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderViewState.copy$default((CryptoOrderViewState) this.L$0, null, null, null, false, null, null, this.$it, 63, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507681(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11", m3645f = "CryptoOrderDuxo.kt", m3646l = {377}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11 */
    static final class C4028811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C4028811(Continuation<? super C4028811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C4028811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4028811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow2 stateFlow2 = CryptoOrderDuxo.this.orderStateFlow;
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(new Flow<String>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow2.collect(new C402732(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11$invokeSuspend$$inlined$mapNotNull$1$2 */
                    public static final class C402732<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return C402732.this.emit(null, this);
                            }
                        }

                        public C402732(FlowCollector flowCollector) {
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
                }, CryptoOrderDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null), new C40272x24ed6ec4(null, CryptoOrderDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11$3", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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

            /* compiled from: CryptoOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11$3$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onCreate$11$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
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
                public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderViewState.copy$default((CryptoOrderViewState) this.L$0, null, null, null, false, null, this.$it, false, 95, null);
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, observeFormState(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.onStart$lambda$5(this.f$0, (DefaultOrderState) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402972(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402983(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(CryptoOrderDuxo cryptoOrderDuxo, DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        int i = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
        if (i == 1) {
            cryptoOrderDuxo.serverDrivenCryptoOrderValidator.resetAcknowledgedAlerts();
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {399}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$2 */
    static final class C402972 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402972(Continuation<? super C402972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402972(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoOrderDuxo.this.hasSeenEuAdvancedOrdersTooltipPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$2$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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

            /* compiled from: CryptoOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$2$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507711 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507711(boolean z, Continuation<? super C507711> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507711 c507711 = new C507711(this.$it, continuation);
                    c507711.L$0 = obj;
                    return c507711;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                    return ((C507711) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                    return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, false, null, this.$it, false, null, false, false, 126975, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507711(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$3", m3645f = "CryptoOrderDuxo.kt", m3646l = {405}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$3 */
    static final class C402983 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402983(Continuation<? super C402983> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402983(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402983) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
        /* JADX WARN: Type inference failed for: r0v12, types: [com.robinhood.shared.trade.crypto.ui.order.CryptoOrderEvent$ApplyFeeUnsupportedForCurrencyPairUiTreatment] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CryptoOrderEvent.HandleCryptoFeeEventType applyFeeUnsupportedForCurrencyPairUiTreatment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = CryptoOrderDuxo.this.cryptoOrderMonetizationModelProvider;
                UUID currencyPairId = ((CryptoOrderFragment.Args) CryptoOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderDuxo.this)).getCurrencyPairId();
                this.label = 1;
                obj = cryptoOrderMonetizationModelProvider.get(currencyPairId, this);
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
            CryptoFeeUiEventProvider4.CryptoOrder cryptoOrder = (CryptoFeeUiEventProvider4.CryptoOrder) CryptoOrderDuxo.this.cryptoFeeUiEventProvider.getInitialUiEventType$feature_trade_crypto_externalDebug(cryptoOrderMonetizationModel, CryptoFeeUiEventProvider3.CryptoOrder.INSTANCE);
            CryptoOrderMonetizationModel.Rebate rebate = cryptoOrderMonetizationModel instanceof CryptoOrderMonetizationModel.Rebate ? (CryptoOrderMonetizationModel.Rebate) cryptoOrderMonetizationModel : null;
            CryptoOrderMonetizationModel.Rebate.Reason reason = rebate != null ? rebate.getReason() : null;
            if (cryptoOrder != null) {
                applyFeeUnsupportedForCurrencyPairUiTreatment = new CryptoOrderEvent.HandleCryptoFeeEventType(cryptoOrder);
            } else if (reason instanceof CryptoOrderMonetizationModel.Rebate.Reason.UnsupportedForCurrencyPair) {
                CryptoOrderMonetizationModel.Rebate.Reason.UnsupportedForCurrencyPair unsupportedForCurrencyPair = (CryptoOrderMonetizationModel.Rebate.Reason.UnsupportedForCurrencyPair) reason;
                applyFeeUnsupportedForCurrencyPairUiTreatment = (unsupportedForCurrencyPair.isUserPreferenceMonetizationModelFee() && (((CryptoOrderFragment.Args) CryptoOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderDuxo.this)).getOrderPrices() instanceof CryptoOrderPrices.Market)) ? new CryptoOrderEvent.ApplyFeeUnsupportedForCurrencyPairUiTreatment(unsupportedForCurrencyPair.getAssetCurrencyCode(), unsupportedForCurrencyPair.isRebateMarketMakersSupported()) : null;
            }
            CryptoOrderDuxo.this.applyMutation(new AnonymousClass1(cryptoOrderMonetizationModel, null));
            if (!(cryptoOrderMonetizationModel instanceof CryptoOrderMonetizationModel.Fee)) {
                CryptoOrderDuxo.this.submit(CryptoOrderEvent.DismissFeeDefinitionBottomSheet.INSTANCE);
            }
            if (applyFeeUnsupportedForCurrencyPairUiTreatment != null) {
                CryptoOrderDuxo.this.submit(applyFeeUnsupportedForCurrencyPairUiTreatment);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$3$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
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
            public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, false, null, false, false, this.$cryptoOrderMonetizationModel, false, false, 114687, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }
    }

    public final void changeInputMode() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.changeInputMode$lambda$6(this.f$0, (CryptoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeInputMode$lambda$6(CryptoOrderDuxo cryptoOrderDuxo, CryptoOrderViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getOrderState() != null) {
            CryptoInputMode other = dataState.getInputState().getInputMode$feature_trade_crypto_externalDebug().getOther();
            cryptoOrderDuxo.applyMutation(new CryptoOrderDuxo2(other, null));
            cryptoOrderDuxo.submit(new CryptoOrderEvent.UpdateAmount(""));
            cryptoOrderDuxo.cryptoInputModePref.setValue(other);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onAmountChanged$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onAmountChanged$1 */
    static final class C402851 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
        final /* synthetic */ BigDecimal $amount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C402851(BigDecimal bigDecimal, Continuation<? super C402851> continuation) {
            super(2, continuation);
            this.$amount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C402851 c402851 = new C402851(this.$amount, continuation);
            c402851.L$0 = obj;
            return c402851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
            return ((C402851) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
            return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, this.$amount, null, null, false, null, false, null, false, false, null, false, false, 131039, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    public final void onAmountChanged(BigDecimal amount) {
        applyMutation(new C402851(amount, null));
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$updateFormState$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$updateFormState$1 */
    static final class C403051 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
        final /* synthetic */ DefaultOrderState $formState;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$updateFormState$1$WhenMappings */
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
        C403051(DefaultOrderState defaultOrderState, Continuation<? super C403051> continuation) {
            super(2, continuation);
            this.$formState = defaultOrderState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C403051 c403051 = CryptoOrderDuxo.this.new C403051(this.$formState, continuation);
            c403051.L$0 = obj;
            return c403051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
            return ((C403051) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoOrderContext cryptoOrderContext;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                CryptoEventLogger cryptoEventLogger = CryptoOrderDuxo.this.eventLogger;
                Screen.Name analyticsScreenName = AnalyticsExtensions2.getAnalyticsScreenName(this.$formState);
                String string2 = ((CryptoOrderFragment.Args) CryptoOrderDuxo.INSTANCE.getArgs((HasSavedState) CryptoOrderDuxo.this)).getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                Screen screen = new Screen(analyticsScreenName, null, string2, null, 10, null);
                CryptoOrderViewState.OrderState orderState = cryptoOrderViewState.getOrderState();
                UiCryptoTradeBonusEligibility tradeBonusEligibility = null;
                EventLogger.DefaultImpls.logScreenAppear$default(cryptoEventLogger, null, screen, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (orderState == null || (cryptoOrderContext = orderState.getCryptoOrderContext()) == null) ? null : cryptoOrderContext.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
                CryptoOrderViewState.InputState inputState = cryptoOrderViewState.getInputState();
                DefaultOrderState defaultOrderState = this.$formState;
                boolean zIsSellAllOrder = defaultOrderState == DefaultOrderState.EDITING ? false : cryptoOrderViewState.getInputState().isSellAllOrder();
                int i = WhenMappings.$EnumSwitchMapping$0[this.$formState.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tradeBonusEligibility = cryptoOrderViewState.getInputState().getTradeBonusEligibility();
                }
                return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(inputState, null, null, false, null, null, null, defaultOrderState, null, zIsSellAllOrder, tradeBonusEligibility, false, null, false, false, null, false, false, 130239, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void updateFormState(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        applyMutation(new C403051(formState, null));
    }

    private final void showMarketPriceDialog() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.showMarketPriceDialog$lambda$7(this.f$0, (CryptoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMarketPriceDialog$lambda$7(CryptoOrderDuxo cryptoOrderDuxo, CryptoOrderViewState dataState) {
        CryptoOrderContext cryptoOrderContext;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CryptoOrderViewState.OrderState orderState = dataState.getOrderState();
        if (orderState == null || (cryptoOrderContext = orderState.getCryptoOrderContext()) == null) {
            return Unit.INSTANCE;
        }
        CryptoTradingBottomSheetService.launchBottomSheet$default(cryptoOrderDuxo.bottomSheetService, CryptoOrderContexts.getMarketPriceBottomSheetTypeDto(cryptoOrderContext), cryptoOrderDuxo.getEventScreen(), null, 4, null);
        return Unit.INSTANCE;
    }

    private final void showOrderTypeEducation(final Order.Configuration configuration) {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.showOrderTypeEducation$lambda$8(this.f$0, configuration, (CryptoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOrderTypeEducation$lambda$8(CryptoOrderDuxo cryptoOrderDuxo, Order.Configuration configuration, CryptoOrderViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        cryptoOrderDuxo.submit(new CryptoOrderEvent.ShowEducationScreen(configuration, dataState.getInputState().getOrderSide$feature_trade_crypto_externalDebug()));
        return Unit.INSTANCE;
    }

    private final void showSpreadDialog() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.showSpreadDialog$lambda$9(this.f$0, (CryptoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSpreadDialog$lambda$9(CryptoOrderDuxo cryptoOrderDuxo, CryptoOrderViewState dataState) {
        String str;
        CryptoOrderContext cryptoOrderContext;
        CryptoOrderContext cryptoOrderContext2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CryptoEventLogger cryptoEventLogger = cryptoOrderDuxo.eventLogger;
        Screen.Name analyticsScreenName = AnalyticsExtensions2.getAnalyticsScreenName(dataState.getInputState().getFormState$feature_trade_crypto_externalDebug());
        Companion companion = INSTANCE;
        String string2 = ((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) cryptoOrderDuxo)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(analyticsScreenName, null, string2, null, 10, null);
        Component.ComponentType componentType = Component.ComponentType.TOOLTIP;
        int i = WhenMappings.$EnumSwitchMapping$1[((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) cryptoOrderDuxo)).getSide().ordinal()];
        if (i == 1) {
            str = "buy_spread";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sell_spread";
        }
        Component component = new Component(componentType, str, null, 4, null);
        CryptoOrderViewState.OrderState orderState = dataState.getOrderState();
        EventLogger.DefaultImpls.logTap$default(cryptoEventLogger, null, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (orderState == null || (cryptoOrderContext2 = orderState.getCryptoOrderContext()) == null) ? null : cryptoOrderContext2.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        CryptoOrderViewState.OrderState orderState2 = dataState.getOrderState();
        if (orderState2 == null || (cryptoOrderContext = orderState2.getCryptoOrderContext()) == null) {
            return Unit.INSTANCE;
        }
        CryptoTradingBottomSheetService.launchBottomSheet$default(cryptoOrderDuxo.bottomSheetService, CryptoOrderContexts.getSpreadBottomSheetTypeDto(cryptoOrderContext), cryptoOrderDuxo.getEventScreen(), null, 4, null);
        return Unit.INSTANCE;
    }

    public final void convertToOrder(CryptoOrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        submit(new CryptoOrderEvent.ShowOrderScreen(orderType));
    }

    public final void sellAll() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.sellAll$lambda$10(this.f$0, (CryptoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sellAll$lambda$10(CryptoOrderDuxo cryptoOrderDuxo, CryptoOrderViewState dataState) {
        CryptoOrderViewState.InputState inputState;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EnumPreference<CryptoInputMode> enumPreference = cryptoOrderDuxo.cryptoInputModePref;
        CryptoInputMode cryptoInputMode = CryptoInputMode.ASSET_CURRENCY;
        enumPreference.set(cryptoInputMode);
        CryptoOrderViewState.OrderState orderState = dataState.getOrderState();
        UiCurrencyPair uiCurrencyPair = (orderState == null || (inputState = orderState.getInputState()) == null) ? null : inputState.getUiCurrencyPair();
        if (orderState != null && dataState.isSellAllBtnVisible() && uiCurrencyPair != null) {
            CryptoInstrumentInputHelper cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(uiCurrencyPair);
            BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(orderState.getAmountHoldInAssetCurrency$feature_trade_crypto_externalDebug());
            Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
            Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, bigDecimalM822m, null, cryptoInputMode, false, false, false, false, 106, null);
            String str = (String) tuples2ProcessAmount$default.component1();
            cryptoOrderDuxo.applyMutation(new CryptoOrderDuxo5(dataState, (BigDecimal) tuples2ProcessAmount$default.component2(), null));
            cryptoOrderDuxo.submit(new CryptoOrderEvent.UpdateAmount(CryptoTextWatcher.SPECIAL_CHARACTER_NO_FORMAT + str));
        }
        return Unit.INSTANCE;
    }

    public final Observable<CryptoOrderViewState.OrderState> observeOrderState() {
        Observable<CryptoOrderViewState.OrderState> observableDistinctUntilChanged = asObservable(getStateFlow()).filter(new Predicate() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo.observeOrderState.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(CryptoOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrderState() != null;
            }
        }).map(new Function() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo.observeOrderState.2
            @Override // io.reactivex.functions.Function
            public final CryptoOrderViewState.OrderState apply(CryptoOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrderState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final Observable<DefaultOrderState> observeFormState() {
        Observable<DefaultOrderState> observableSkip = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo.observeFormState.1
            @Override // io.reactivex.functions.Function
            public final DefaultOrderState apply(CryptoOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getInputState().getFormState$feature_trade_crypto_externalDebug();
            }
        }).distinctUntilChanged().skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        return observableSkip;
    }

    public final void setOrderSize(final ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.SetOrderSizeDto dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.setOrderSize$lambda$11(dto, this, (CryptoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOrderSize$lambda$11(ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.SetOrderSizeDto setOrderSizeDto, CryptoOrderDuxo cryptoOrderDuxo, CryptoOrderViewState dataState) {
        BigDecimal bigDecimalOrThrow;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiCurrencyPair uiCurrencyPair = dataState.getInputState().getUiCurrencyPair();
        if (uiCurrencyPair == null) {
            return Unit.INSTANCE;
        }
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(uiCurrencyPair);
        int i = WhenMappings.$EnumSwitchMapping$2[dataState.getInputState().getInputMode$feature_trade_crypto_externalDebug().ordinal()];
        if (i == 1) {
            bigDecimalOrThrow = setOrderSizeDto.getQuote_amount().toBigDecimalOrThrow();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalOrThrow = setOrderSizeDto.getAsset_amount().toBigDecimalOrThrow();
        }
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalOrThrow);
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        String str = (String) CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, bigDecimalM822m, null, dataState.getInputState().getInputMode$feature_trade_crypto_externalDebug(), false, false, false, false, 106, null).component1();
        cryptoOrderDuxo.applyMutation(new CryptoOrderDuxo6(bigDecimalOrThrow, null));
        cryptoOrderDuxo.submit(new CryptoOrderEvent.UpdateAmount(str));
        return Unit.INSTANCE;
    }

    public final void submitOrder(CryptoOrderViewState.OrderState orderState) {
        CryptoOrderContext cryptoOrderContext;
        CryptoOrderContext.RequestData request;
        ApiCryptoOrderRequest apiRequest;
        if (orderState == null || (cryptoOrderContext = orderState.getCryptoOrderContext()) == null || (request = cryptoOrderContext.getRequest()) == null || (apiRequest = request.toApiRequest()) == null) {
            return;
        }
        CryptoEventLogger.DefaultImpls.logCryptoOrderEvent$default(this.eventLogger, OrderFormStep.SUBMIT, apiRequest, orderState.getCryptoOrderContext().getRequestContext().getRequestInputs().getMonetizationModel(), null, 8, null);
        OrderSubmissionManager.submit$default(this.cryptoOrderManager, new CryptoOrderManager.Request.Standard(apiRequest), null, false, 6, null);
    }

    public final void onReviewButtonTapped(CryptoOrderContext cryptoOrderContext) {
        Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.BUTTON, "review", null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoOrderContext.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        validateAndReviewOrder$feature_trade_crypto_externalDebug(cryptoOrderContext);
    }

    public final void validateAndReviewOrder$feature_trade_crypto_externalDebug(CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new CryptoOrderDuxo7(this, orderContext, null), 3, null);
    }

    static /* synthetic */ void performMicrogramOrderValidation$default(CryptoOrderDuxo cryptoOrderDuxo, CryptoOrderContext cryptoOrderContext, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        cryptoOrderDuxo.performMicrogramOrderValidation(cryptoOrderContext, str);
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$performMicrogramOrderValidation$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {651}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$performMicrogramOrderValidation$1 */
    static final class C403001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $acknowledgeId;
        final /* synthetic */ CryptoOrderContext $orderContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C403001(CryptoOrderContext cryptoOrderContext, String str, Continuation<? super C403001> continuation) {
            super(2, continuation);
            this.$orderContext = cryptoOrderContext;
            this.$acknowledgeId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C403001(this.$orderContext, this.$acknowledgeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoEventLogger.DefaultImpls.logCryptoOrderEvent$default(CryptoOrderDuxo.this.eventLogger, OrderFormStep.REVIEW, this.$orderContext.getRequest().toApiRequest(), this.$orderContext.getRequestContext().getRequestInputs().getMonetizationModel(), null, 8, null);
                CryptoOrderDuxo.this.applyMutation(new AnonymousClass1(null));
                CryptoOrderValidationService cryptoOrderValidationService = CryptoOrderDuxo.this.microgramOrderValidationService;
                ValidateCryptoOrderRequestDto validateCryptoOrderRequestDtoValidateCryptoOrderRequestDto$default = CryptoOrderContexts.validateCryptoOrderRequestDto$default(this.$orderContext, null, this.$acknowledgeId, CryptoOrderDuxo.this.resources, 1, null);
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
                CryptoOrderDuxo.this.applyMutation(new AnonymousClass2(null));
                CryptoOrderDuxo.this.submit(new CryptoOrderEvent.ShowAlertDto(alert, this.$orderContext.getLoggingCryptoOrderContext()));
            } else {
                CryptoOrderDuxo.this.onValidationSucceed(this.$orderContext);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$performMicrogramOrderValidation$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$performMicrogramOrderValidation$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
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
            public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, true, null, false, false, null, false, false, 130047, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$performMicrogramOrderValidation$1$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$performMicrogramOrderValidation$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
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
            public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                return ((AnonymousClass2) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, false, null, false, false, null, false, false, 130047, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }
    }

    private final void performMicrogramOrderValidation(CryptoOrderContext orderContext, String acknowledgeId) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403001(orderContext, acknowledgeId, null), 3, null);
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$initiateDeposit$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {678}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$initiateDeposit$1 */
    static final class C402801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402801(Continuation<? super C402801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTake = FlowKt.take(CryptoOrderDuxo.this.cryptoExperimentsStore.streamCryptoOrderChecksToGuidedTransfers(), 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInCryptoOrderChecksToGuidedExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$initiateDeposit$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {679, 684}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$initiateDeposit$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int I$0;
            Object L$0;
            Object L$1;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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
                    CryptoOrderDuxo cryptoOrderDuxo = this.this$0;
                    if (z) {
                        transfer = new TransferV2(TransferDirectionV2.DEPOSIT, standard, null, 4, null);
                    } else {
                        transfer = new Transfer(standard);
                    }
                    cryptoOrderDuxo.startActivity(transfer);
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
                    CryptoOrderDuxo cryptoOrderDuxo2 = this.this$0;
                    if (z) {
                    }
                    cryptoOrderDuxo2.startActivity(transfer);
                    return Unit.INSTANCE;
                }
                CryptoOrderDuxo cryptoOrderDuxo3 = this.this$0;
                this.L$0 = entryPoint3;
                this.L$1 = transferAccountSelection;
                this.Z$0 = z;
                this.I$0 = BooleanValue;
                this.label = 2;
                objAccountNumber = cryptoOrderDuxo3.accountNumber(this);
                if (objAccountNumber != coroutine_suspended) {
                    i = BooleanValue;
                    entryPoint2 = entryPoint3;
                    entryPoint = entryPoint2;
                    str = (String) objAccountNumber;
                    TransferConfiguration.Standard standard22 = new TransferConfiguration.Standard(null, null, false, transferAccountSelection, new TransferConfiguration.TransferAccountSelection(str, false, i == 0 ? ApiTransferAccount.TransferAccountType.RHS : null, 2, null), null, entryPoint, null, false, false, null, null, false, 8103, null);
                    CryptoOrderDuxo cryptoOrderDuxo22 = this.this$0;
                    if (z) {
                    }
                    cryptoOrderDuxo22.startActivity(transfer);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
    }

    public final void initiateDeposit() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402801(null), 3, null);
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onValidationSucceed$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {716}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onValidationSucceed$1 */
    static final class C402991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoOrderContext $orderContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C402991(CryptoOrderContext cryptoOrderContext, Continuation<? super C402991> continuation) {
            super(2, continuation);
            this.$orderContext = cryptoOrderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402991(this.$orderContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onValidationSucceed$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onValidationSucceed$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
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
            public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, true, null, false, false, null, false, false, 130047, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C402991 c402991;
            Throwable th;
            GenericAlertContent alert;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderDuxo.this.applyMutation(new AnonymousClass1(null));
                if (CryptoOrderDuxo.this.appType == AppType.TRADER) {
                    try {
                        ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator = CryptoOrderDuxo.this.serverDrivenCryptoOrderValidator;
                        UUID id = this.$orderContext.getRequestContext().getCurrencyPair().getId();
                        MonetizationModel monetizationModel = this.$orderContext.getRequestContext().getRequestInputs().getMonetizationModel();
                        OrderSide side = this.$orderContext.getRequestContext().getRequestInputs().getSide();
                        CryptoOrderType orderType = this.$orderContext.getRequestContext().getRequestInputs().getOrderPrices().getOrderType();
                        this.label = 1;
                        c402991 = this;
                        try {
                            obj = ServerDrivenCryptoOrderValidator.validate$default(serverDrivenCryptoOrderValidator, id, monetizationModel, side, orderType, null, null, c402991, 48, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            if (!Throwables.isNetworkRelated(th)) {
                                throw th;
                            }
                            if (alert != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c402991 = this;
                        th = th;
                        if (!Throwables.isNetworkRelated(th)) {
                        }
                        if (alert != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    c402991 = this;
                    if (alert != null) {
                        CryptoOrderDuxo.this.applyMutation(new AnonymousClass2(null));
                        CryptoOrderDuxo.this.submit(new CryptoOrderEvent.ShowSduiValidationAlert(alert));
                    } else {
                        CryptoOrderDuxo.this.fetchTradeBonusEligibility(c402991.$orderContext);
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c402991 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c402991 = this;
                    if (!Throwables.isNetworkRelated(th)) {
                    }
                    if (alert != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            AlertAction alertAction = (AlertAction) obj;
            alert = alertAction != null ? alertAction.getAlert() : null;
            if (alert != null) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onValidationSucceed$1$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onValidationSucceed$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
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
            public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                return ((AnonymousClass2) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, false, null, false, false, null, false, false, 130047, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }
    }

    public final void onValidationSucceed(CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C402991(orderContext, null), 3, null);
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$fetchTradeBonusEligibility$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {745}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$fetchTradeBonusEligibility$1 */
    static final class C402791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiCryptoTradeBonusEligibility>>, Object> {
        final /* synthetic */ CryptoOrderContext $orderContext;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C402791(CryptoOrderContext cryptoOrderContext, Continuation<? super C402791> continuation) {
            super(2, continuation);
            this.$orderContext = cryptoOrderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C402791(this.$orderContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiCryptoTradeBonusEligibility>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<UiCryptoTradeBonusEligibility>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiCryptoTradeBonusEligibility>> continuation) {
            return ((C402791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider = CryptoOrderDuxo.this.cryptoTradeBonusEligibilityProvider;
                CryptoOrderContext.RequestContext requestContext = this.$orderContext.getRequestContext();
                this.L$0 = companion2;
                this.label = 1;
                Object obj2 = cryptoTradeBonusEligibilityProvider.get(requestContext, this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = obj2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Optional.Companion) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return companion.m2972of(obj);
        }
    }

    public final void fetchTradeBonusEligibility(CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C402791(orderContext, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.fetchTradeBonusEligibility$lambda$12(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchTradeBonusEligibility$lambda$12(CryptoOrderDuxo cryptoOrderDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        cryptoOrderDuxo.safeSetFormStateReviewing((UiCryptoTradeBonusEligibility) optional.component1());
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$safeSetFormStateReviewing$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {756, 757}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$safeSetFormStateReviewing$1 */
    static final class C403011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiCryptoTradeBonusEligibility $tradeBonusEligibility;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C403011(UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, Continuation<? super C403011> continuation) {
            super(2, continuation);
            this.$tradeBonusEligibility = uiCryptoTradeBonusEligibility;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C403011(this.$tradeBonusEligibility, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Flow<Boolean> flowStreamCryptoTradeFlowMicrogramDisclosureExperiment = CryptoOrderDuxo.this.cryptoExperimentsStore.streamCryptoTradeFlowMicrogramDisclosureExperiment();
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
                CryptoOrderDuxo.this.updateFormState(DefaultOrderState.REVIEWING);
                CryptoOrderDuxo.this.applyMutation(new AnonymousClass1(this.$tradeBonusEligibility, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider = CryptoOrderDuxo.this.cryptoTradeDisclosuresProvider;
                this.label = 2;
            } else if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            CryptoOrderDuxo.this.updateFormState(DefaultOrderState.REVIEWING);
            CryptoOrderDuxo.this.applyMutation(new AnonymousClass1(this.$tradeBonusEligibility, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$safeSetFormStateReviewing$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$safeSetFormStateReviewing$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
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
            public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
                return ((AnonymousClass1) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
                return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, this.$tradeBonusEligibility, false, null, false, false, null, false, false, 129535, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }
    }

    private final void safeSetFormStateReviewing(UiCryptoTradeBonusEligibility tradeBonusEligibility) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403011(tradeBonusEligibility, null), 3, null);
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
        applyMutation(new C402842(null));
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onAcknowledgeAlertAndContinue$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$onAcknowledgeAlertAndContinue$2 */
    static final class C402842 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C402842(Continuation<? super C402842> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C402842 c402842 = new C402842(continuation);
            c402842.L$0 = obj;
            return c402842;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
            return ((C402842) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
            return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, false, new CryptoOrderUiEvent(null, 1, null), false, false, null, false, false, 129023, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$setPdtWarningAsSeen$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$setPdtWarningAsSeen$1 */
    static final class C403021 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C403021(Continuation<? super C403021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C403021 c403021 = new C403021(continuation);
            c403021.L$0 = obj;
            return c403021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
            return ((C403021) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
            return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, true, null, null, null, null, null, false, null, false, null, false, false, null, false, false, 131067, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    public final void setPdtWarningAsSeen() {
        applyMutation(new C403021(null));
    }

    public final void handleCryptoOrderReviewRowOnTap(CryptoOrderReviewRowState.TapAction tapAction) {
        Order.Configuration configuration;
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.EditPrice) {
            onEditPriceClicked();
            return;
        }
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowMarketPriceBottomSheet) {
            showMarketPriceDialog();
            return;
        }
        if (tapAction instanceof CryptoOrderReviewRowState.TapAction.ShowOrderTypeEducation) {
            int i = WhenMappings.$EnumSwitchMapping$3[((CryptoOrderReviewRowState.TapAction.ShowOrderTypeEducation) tapAction).getOrderType().ordinal()];
            if (i == 1) {
                configuration = Order.Configuration.STOP_LOSS;
            } else {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Unsupported order type");
                }
                configuration = Order.Configuration.STOP_LIMIT;
            }
            showOrderTypeEducation(configuration);
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
        int i = WhenMappings.$EnumSwitchMapping$4[type2.ordinal()];
        if (i == 1) {
            this.hasSeenEuAdvancedOrdersTooltipPref.set(true);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.hasSeenTaxLotOrderTooltipPref.set(true);
        }
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$convertToRebateOrder$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$convertToRebateOrder$1 */
    static final class C402781 extends ContinuationImpl7 implements Function2<CryptoOrderViewState, Continuation<? super CryptoOrderViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C402781(Continuation<? super C402781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C402781 c402781 = new C402781(continuation);
            c402781.L$0 = obj;
            return c402781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderViewState cryptoOrderViewState, Continuation<? super CryptoOrderViewState> continuation) {
            return ((C402781) create(cryptoOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoOrderViewState cryptoOrderViewState = (CryptoOrderViewState) this.L$0;
            return CryptoOrderViewState.copy$default(cryptoOrderViewState, CryptoOrderViewState.InputState.copy$default(cryptoOrderViewState.getInputState(), null, null, false, null, null, null, null, null, false, null, false, null, false, false, new CryptoOrderMonetizationModel.Rebate(CryptoOrderMonetizationModel.Rebate.Reason.TemporarilyUnavailable.INSTANCE), false, false, 114687, null), null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    public final void convertToRebateOrder() {
        applyMutation(new C402781(null));
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$showFeeTierUpsellBottomSheet$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {834}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$showFeeTierUpsellBottomSheet$1 */
    static final class C403031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403031(Continuation<? super C403031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C403031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<StreamFeeTierUpsellBottomSheetEventResponseDto> flowStreamFeeTierUpsellBottomSheetEvent = CryptoOrderDuxo.this.getFeesBottomSheetService().StreamFeeTierUpsellBottomSheetEvent(new StreamFeeTierUpsellBottomSheetEventRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderDuxo.this, null);
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

        /* compiled from: CryptoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcrypto/fee_tier/proto/v1/StreamFeeTierUpsellBottomSheetEventResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$showFeeTierUpsellBottomSheet$1$1", m3645f = "CryptoOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$showFeeTierUpsellBottomSheet$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamFeeTierUpsellBottomSheetEventResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderDuxo this$0;

            /* compiled from: CryptoOrderDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$showFeeTierUpsellBottomSheet$1$1$WhenMappings */
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
            AnonymousClass1(CryptoOrderDuxo cryptoOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderDuxo;
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
                        this.this$0.submit(CryptoOrderEvent.DisplayCryptoFeeTooltip.INSTANCE);
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
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C403031(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403042(null), 3, null);
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$showFeeTierUpsellBottomSheet$2", m3645f = "CryptoOrderDuxo.kt", m3646l = {847, 846}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$showFeeTierUpsellBottomSheet$2 */
    static final class C403042 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C403042(Continuation<? super C403042> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderDuxo.this.new C403042(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                feesBottomSheetService = CryptoOrderDuxo.this.getFeesBottomSheetService();
                CryptoOrderDuxo cryptoOrderDuxo = CryptoOrderDuxo.this;
                this.L$0 = feesBottomSheetService;
                this.label = 1;
                obj = cryptoOrderDuxo.accountId(this);
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

    private final void onEditPriceClicked() {
        convertToOrder(((CryptoOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOrderPrices().getOrderType());
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.TEXT_VIEW, "edit-price", null, 4, null), null, null, false, 57, null);
    }

    private final void showTradeBonusBottomSheet() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.TOOLTIP, "crypto_trade_bonus", null, 4, null), null, null, false, 57, null);
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.showTradeBonusBottomSheet$lambda$14(this.f$0, (CryptoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTradeBonusBottomSheet$lambda$14(CryptoOrderDuxo cryptoOrderDuxo, CryptoOrderViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        cryptoOrderDuxo.submit(new CryptoOrderEvent.ShowTradeBonusBottomSheet(cryptoOrderDuxo.getStaticInputs(), dataState.getInputState().getRequestInput()));
        return Unit.INSTANCE;
    }

    private final void showFeeDefinitionBottomSheet(UiFeeEstimation uiFeeEstimation) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, getEventScreen(), new Component(Component.ComponentType.TOOLTIP, "crypto_fees", null, 4, null), null, null, false, 57, null);
        submit(new CryptoOrderEvent.ShowFeeDefinitionBottomSheet(new CryptoFeeDefinitionBottomSheetFragment.Args(getEventScreen(), ((CryptoOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId(), uiFeeEstimation.getFeeRatio(), uiFeeEstimation.getMinFeeAmount(), uiFeeEstimation.getRobinhoodFeeRatio(), uiFeeEstimation.getExchangeFeeRatio(), false, null, 128, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startActivity(IntentKey intent) {
        submit(new CryptoOrderEvent.StartActivity(intent));
    }

    public final void onOrderValidationAcknowledgeAndContinue(final String acknowledgeId) {
        Intrinsics.checkNotNullParameter(acknowledgeId, "acknowledgeId");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderDuxo.onOrderValidationAcknowledgeAndContinue$lambda$15(this.f$0, acknowledgeId, (CryptoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderValidationAcknowledgeAndContinue$lambda$15(CryptoOrderDuxo cryptoOrderDuxo, String str, CryptoOrderViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoOrderViewState.OrderState orderState = it.getOrderState();
        CryptoOrderContext cryptoOrderContext = orderState != null ? orderState.getCryptoOrderContext() : null;
        if (cryptoOrderContext != null) {
            cryptoOrderDuxo.performMicrogramOrderValidation(cryptoOrderContext, str);
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.udf.BaseDuxo, androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
        this.performanceLogger.abortMetric(PerformanceMetricEventData.Name.SCREEN_LOAD, ((CryptoOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getCurrencyPairId());
    }

    public final void emitBottomSheetData(ImmutableList<BottomSheetTypeDto> dtos) {
        Intrinsics.checkNotNullParameter(dtos, "dtos");
        this.bottomSheetService.emitBottomSheetData(dtos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object accountId(Continuation<? super String> continuation) {
        C402771 c402771;
        CryptoAccountSwitcherLocation buy;
        if (continuation instanceof C402771) {
            c402771 = (C402771) continuation;
            int i = c402771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c402771.label = i - Integer.MIN_VALUE;
            } else {
                c402771 = new C402771(continuation);
            }
        }
        Object objFirstOrNull = c402771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c402771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider;
            Companion companion = INSTANCE;
            int i3 = WhenMappings.$EnumSwitchMapping$1[((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide().ordinal()];
            if (i3 == 1) {
                buy = new CryptoAccountSwitcherLocation.Buy(((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId());
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i4 = WhenMappings.$EnumSwitchMapping$2[((CryptoInputMode) this.cryptoInputModePref.getValue()).ordinal()];
                if (i4 == 1) {
                    buy = new CryptoAccountSwitcherLocation.SellQuote(((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId());
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    buy = new CryptoAccountSwitcherLocation.SellAsset(((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId());
                }
            }
            Flow<UUID> flowStreamCryptoAccountId = cryptoAccountProvider.streamCryptoAccountId(buy);
            c402771.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamCryptoAccountId, c402771);
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
        int i = WhenMappings.$EnumSwitchMapping$1[((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide().ordinal()];
        if (i == 1) {
            buy = new CryptoAccountSwitcherLocation.Buy(((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$2[((CryptoInputMode) this.cryptoInputModePref.getValue()).ordinal()];
            if (i2 == 1) {
                buy = new CryptoAccountSwitcherLocation.SellQuote(((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buy = new CryptoAccountSwitcherLocation.SellAsset(((CryptoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getCurrencyPairId());
            }
        }
        return FlowKt.firstOrNull(cryptoAccountProvider.streamAccountNumber(buy), continuation);
    }

    /* compiled from: CryptoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoOrderDuxo, CryptoOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderFragment.Args getArgs(CryptoOrderDuxo cryptoOrderDuxo) {
            return (CryptoOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoOrderDuxo);
        }
    }
}
