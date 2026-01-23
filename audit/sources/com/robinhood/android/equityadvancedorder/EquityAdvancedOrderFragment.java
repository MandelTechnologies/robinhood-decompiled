package com.robinhood.android.equityadvancedorder;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderDropdownEditCallbacks;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.crypto.lib.C12914R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.equities.store.swipetotrade.EquitiesSwipeToTradeExperiment;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.equities.taxlots.SelectLotsKey;
import com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragmentCallbacks;
import com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey;
import com.robinhood.android.equity.ordercheck.OrderCheckFailure;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksAlertFragment;
import com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.equity.validation.event.TextField;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment;
import com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment;
import com.robinhood.android.equityadvancedorder.callbacks.EquityActivityBackgroundCallbacks;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState2;
import com.robinhood.android.equityadvancedorder.datastate.InitialDataStateHelper2;
import com.robinhood.android.equityadvancedorder.datastate.LimitStandard3;
import com.robinhood.android.equityadvancedorder.datastate.LimitTaxLots2;
import com.robinhood.android.equityadvancedorder.sessionchange.TradingSessionChangedAlert;
import com.robinhood.android.equityadvancedorder.utils.EquityOrderSides;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks2;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment;
import com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragmentCallbacks;
import com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog;
import com.robinhood.android.mcw.contracts.QuickConversionCallbacks;
import com.robinhood.android.mcw.contracts.QuickConversionCallbacks2;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.contracts.NavigationFragmentResultContract;
import com.robinhood.android.navigation.contracts.NavigationFragmentResultContract2;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.Buildable;
import com.robinhood.android.trading.contracts.configuration.ShareStopLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLoss;
import com.robinhood.android.trading.contracts.configuration.ShareTrailingStop;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.SilentEquityOrderChecksAlert;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.SduiAccountSwitcherBottomSheetFragmentKey;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.tooltips.TooltipData2;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummary;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: EquityAdvancedOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0004¡\u0001¢\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u001a\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020L2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020GH\u0016J\r\u0010P\u001a\u00020GH\u0017¢\u0006\u0002\u0010QJ\u0018\u0010R\u001a\u00020G2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u00020G2\u0006\u0010X\u001a\u00020YH\u0016J\u0018\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020NH\u0016J\u0018\u0010^\u001a\u00020G2\u0006\u0010_\u001a\u00020`2\u0006\u0010]\u001a\u00020NH\u0016J\u0018\u0010a\u001a\u00020G2\u0006\u0010b\u001a\u00020c2\u0006\u0010]\u001a\u00020NH\u0016J\u0010\u0010d\u001a\u00020G2\u0006\u0010S\u001a\u00020eH\u0002J\u001a\u0010f\u001a\u00020N2\u0006\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010IH\u0016J\u001a\u0010j\u001a\u00020N2\u0006\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010IH\u0016J\u0018\u0010k\u001a\u00020G2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020oH\u0016J\u0010\u0010p\u001a\u00020G2\u0006\u0010q\u001a\u00020rH\u0016J\u0010\u0010s\u001a\u00020G2\u0006\u0010t\u001a\u00020uH\u0016J\b\u0010v\u001a\u00020GH\u0016J\u0010\u0010w\u001a\u00020G2\u0006\u0010l\u001a\u00020mH\u0016J\u001a\u0010|\u001a\u00020G2\u0006\u0010l\u001a\u00020m2\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J\b\u0010\u007f\u001a\u00020GH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020G2\u0007\u0010\u0081\u0001\u001a\u00020~H\u0016J\u0011\u0010\u0082\u0001\u001a\u00020G2\u0006\u0010l\u001a\u00020mH\u0016J\u0011\u0010\u0083\u0001\u001a\u00020G2\u0006\u0010l\u001a\u00020mH\u0016J\u001a\u0010\u0084\u0001\u001a\u00020G2\u0006\u0010l\u001a\u00020m2\u0007\u0010\u0085\u0001\u001a\u00020~H\u0016J\u0013\u0010\u0086\u0001\u001a\u00020G2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\u0013\u0010\u0089\u0001\u001a\u00020G2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\u0011\u0010\u008a\u0001\u001a\u00020G2\u0006\u0010}\u001a\u00020~H\u0016J\t\u0010\u008b\u0001\u001a\u00020GH\u0016J\t\u0010\u008c\u0001\u001a\u00020GH\u0016J\u0019\u0010\u008d\u0001\u001a\u00020G2\u000e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020m0\u008f\u0001H\u0016J\t\u0010\u0090\u0001\u001a\u00020GH\u0016J\t\u0010\u0091\u0001\u001a\u00020GH\u0016J\u0013\u0010\u0092\u0001\u001a\u00020G2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0016J\u0013\u0010\u0095\u0001\u001a\u00020N2\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010\u0098\u0001\u001a\u00020G2\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0016J\t\u0010\u009b\u0001\u001a\u00020GH\u0016J\u0012\u0010\u009c\u0001\u001a\u00020G2\u0007\u0010\u009d\u0001\u001a\u00020mH\u0016J\u0013\u0010\u009e\u0001\u001a\u00020G2\b\u0010\u009f\u0001\u001a\u00030 \u0001H\u0016R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b8\u00109R\u001b\u0010;\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b=\u0010>R(\u0010A\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020D E*\n\u0012\u0004\u0012\u00020D\u0018\u00010C0C0BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010x\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{¨\u0006£\u0001²\u0006\f\u0010¤\u0001\u001a\u00030¥\u0001X\u008a\u0084\u0002²\u0006\u0014\u0010¦\u0001\u001a\u000b\u0012\u0004\u0012\u00020e\u0018\u00010§\u0001X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/equity/validation/EquityOrderValidationFailureResolver;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCombinedCallbacks;", "Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragmentCallbacks;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertFragment$Callbacks;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderDropdownEditCallbacks;", "Lcom/robinhood/android/equities/taxlots/alert/TaxLotsMaximumSelectedLotsAlertFragmentCallbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/mcw/contracts/QuickConversionCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "setTooltipManager", "(Lcom/robinhood/tooltips/TooltipManager;)V", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "getOrderManager", "()Lcom/robinhood/android/equity/submission/EquityOrderManager;", "setOrderManager", "(Lcom/robinhood/android/equity/submission/EquityOrderManager;)V", "orderCheckCallbacks", "callbacks", "Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderCallbacks;", "getCallbacks", "()Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "activityBackgroundCallbacks", "Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", "getActivityBackgroundCallbacks", "()Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", "activityBackgroundCallbacks$delegate", "duxo", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo;", "getDuxo", "()Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "selectLotsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationFragmentResultContract$FragmentNavigationParams;", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onBackPressed", "", "onResume", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleTextFieldEvent", "event", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced$SetEditingFieldText;", "numpadScope", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2Impl;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "orderMarketHoursSelected", "orderMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "hideSheet", "orderTimeInForceSelected", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "strategySelected", "availableSelectionStrategyOption", "Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "handleEvent", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onAccountSelected", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAccountSwitcherCtaClicked", "args", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "showSduiAccountSwitcher", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "onRefreshAccountsClicked", "onSuitabilityQuestionnaireCompletedForAccount", "resolverContext", "Landroid/content/Context;", "getResolverContext", "()Landroid/content/Context;", "convertToLimitOrder", "quantity", "Ljava/math/BigDecimal;", "convertToMarketOrder", "convertToSimpleLimitOrder", "presetPercentLimit", "convertToAllDayOrder", "convertToShareQuantity", "setLimitOrderConfiguration", "amount", "editLimitOrder", "context", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "editStopOrder", "setShareQuantity", "overrideToExecuteInMarketHoursOnly", "overrideToFlipIpoAccessShares", "appendOverrides", "overrides", "", "cancelPendingCryptoOrders", "clearTaxLotSelection", "presentQuickConversionSheet", "key", "Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onSelectionStrategyProceed", "selectionStrategySummary", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "onSelectionStrategyDismiss", "onConversionComplete", "message", "onConversionOrderCheckAction", "action", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "Args", "Companion", "lib-equity-advanced-order_externalDebug", "viewState", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderViewState;", "eventState", "Lcom/robinhood/android/udf/event/Event;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderFragment extends GenericComposeFragment implements EquityOrderValidationFailureResolver, AccountSwitcherCallbacks2, AccountSwitcherSuitabilityDialogFragmentCallbacks, EquityOrderChecksAlertFragment.Callbacks, EquityAdvancedOrderDropdownEditCallbacks, TaxLotsMaximumSelectedLotsAlertFragmentCallbacks, RhDialogFragment.OnClickListener, QuickConversionCallbacks, AutoLoggableFragment {
    private static final String SHORT_SALE_TOOLTIP_AFTER_HOURS_ID = "short_sale_tooltip_after_hours";
    public CrossSellLaunchManager crossSellLaunchManager;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    private EquityOrderChecksAlertFragment.Callbacks orderCheckCallbacks;
    public EquityOrderManager orderManager;
    private final ActivityResultLauncher<NavigationFragmentResultContract.FragmentNavigationParams<SelectLotsKey>> selectLotsLauncher;
    public TooltipManager tooltipManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityAdvancedOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(EquityAdvancedOrderFragment.class, "activityBackgroundCallbacks", "getActivityBackgroundCallbacks()Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(EquityOrderCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof EquityOrderCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: activityBackgroundCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 activityBackgroundCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(EquityActivityBackgroundCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$special$$inlined$hostActivityCallbacks$2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof EquityActivityBackgroundCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EquityAdvancedOrderDuxo.class);

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextField.values().length];
            try {
                iArr[TextField.NUMBER_OF_SHARES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextField.TAX_LOTS_LIMIT_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextField.LIMIT_STANDARD_LIMIT_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(EquityAdvancedOrderFragment equityAdvancedOrderFragment, int i, Composer composer, int i2) {
        equityAdvancedOrderFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToMarketOrder() {
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToShareQuantity(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToSimpleLimitOrder(BigDecimal presetPercentLimit) {
        Intrinsics.checkNotNullParameter(presetPercentLimit, "presetPercentLimit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityAdvancedOrderViewState ComposeContent$lambda$1(SnapshotState4<EquityAdvancedOrderViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<EquityOrderEvent.Advanced> ComposeContent$lambda$2(SnapshotState4<Event<EquityOrderEvent.Advanced>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        AccountSwitcherCallbacks2.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        AccountSwitcherCallbacks2.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public boolean performTypedAction(GenericAction genericAction, String str, EquityOrderContext equityOrderContext) {
        return EquityOrderValidationFailureResolver.DefaultImpls.performTypedAction(this, genericAction, str, equityOrderContext);
    }

    public EquityAdvancedOrderFragment() {
        ActivityResultLauncher<NavigationFragmentResultContract.FragmentNavigationParams<SelectLotsKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new NavigationFragmentResultContract(new Function0() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$selectLotsLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(SelectLotsKey.Result result) {
                if (result != null) {
                    this.this$0.getDuxo().handleSelectLotsComplete(result);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.selectLotsLauncher = activityResultLauncherRegisterForActivityResult;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.EQUITY_ENTER_LIMIT_PRICE_PAGE, ((Args) INSTANCE.getArgs((Fragment) this)).getFlowSource().getLoggingValue(), "LIMIT", null, 8, null);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    public final TooltipManager getTooltipManager() {
        TooltipManager tooltipManager = this.tooltipManager;
        if (tooltipManager != null) {
            return tooltipManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tooltipManager");
        return null;
    }

    public final void setTooltipManager(TooltipManager tooltipManager) {
        Intrinsics.checkNotNullParameter(tooltipManager, "<set-?>");
        this.tooltipManager = tooltipManager;
    }

    public final EquityOrderManager getOrderManager() {
        EquityOrderManager equityOrderManager = this.orderManager;
        if (equityOrderManager != null) {
            return equityOrderManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public final void setOrderManager(EquityOrderManager equityOrderManager) {
        Intrinsics.checkNotNullParameter(equityOrderManager, "<set-?>");
        this.orderManager = equityOrderManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderCallbacks getCallbacks() {
        return (EquityOrderCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final EquityActivityBackgroundCallbacks getActivityBackgroundCallbacks() {
        return (EquityActivityBackgroundCallbacks) this.activityBackgroundCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityAdvancedOrderDuxo getDuxo() {
        return (EquityAdvancedOrderDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleScope().launchWhenCreated(new C152331(null));
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onCreate$1", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onCreate$1 */
    static final class C152331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C152331(Continuation<? super C152331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderFragment.this.new C152331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderFragment.this.getDuxo().getStateFlow();
                Flow<EquityOrderContext> flow = new Flow<EquityOrderContext>() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onCreate$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                EquityOrderContext equityOrderContext = ((EquityAdvancedOrderViewState) obj).getEquityOrderContext();
                                if (equityOrderContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(equityOrderContext, anonymousClass1) == coroutine_suspended) {
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
                final EquityAdvancedOrderFragment equityAdvancedOrderFragment = EquityAdvancedOrderFragment.this;
                FlowCollector<? super EquityOrderContext> flowCollector = new FlowCollector() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment.onCreate.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((EquityOrderContext) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final EquityOrderContext equityOrderContext, Continuation<? super Unit> continuation) {
                        final EquityAdvancedOrderFragment equityAdvancedOrderFragment2 = equityAdvancedOrderFragment;
                        equityAdvancedOrderFragment2.orderCheckCallbacks = new EquityOrderChecksAlertFragment.Callbacks() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment.onCreate.1.2.1
                            @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
                            public boolean onActionClicked(ServerDrivenButton button) {
                                Intrinsics.checkNotNullParameter(button, "button");
                                equityAdvancedOrderFragment2.performTypedAction(button.getTypedAction(), equityOrderContext.getAccountNumber(), equityOrderContext);
                                equityAdvancedOrderFragment2.getDuxo().logOrderCheckAction(button.getLoggingIdentifier());
                                return true;
                            }
                        };
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivityBackgroundCallbacks().setActivityBackground(false);
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onBackPressed$1", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onBackPressed$1 */
    static final class C152321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C152321(Continuation<? super C152321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderFragment.this.new C152321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<UUID> abortedRefIds = EquityAdvancedOrderFragment.this.getOrderManager().getAbortedRefIds();
                UUID refId = ((Args) EquityAdvancedOrderFragment.INSTANCE.getArgs((Fragment) EquityAdvancedOrderFragment.this)).getRefId();
                this.label = 1;
                if (abortedRefIds.emit(refId, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152321(null), 3, null);
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152341(null), 3, null);
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onResume$1", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onResume$1 */
    static final class C152341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C152341(Continuation<? super C152341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderFragment.this.new C152341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14, types: [com.robinhood.android.common.ui.BaseFragment] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityAdvancedOrderFragment equityAdvancedOrderFragment;
            CrossSellLaunchManager crossSellLaunchManager;
            EquityOrderSide equityOrderSide;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(EquityAdvancedOrderFragment.this.getExperimentsStore(), new Experiment[]{EquitiesSwipeToTradeExperiment.INSTANCE}, false, null, 4, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (FlowKt.first(flowBuffer$default, anonymousClass1, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                equityOrderSide = (EquityOrderSide) this.L$2;
                ?? r1 = (BaseFragment) this.L$1;
                CrossSellLaunchManager crossSellLaunchManager2 = (CrossSellLaunchManager) this.L$0;
                ResultKt.throwOnFailure(obj);
                equityAdvancedOrderFragment = r1;
                crossSellLaunchManager = crossSellLaunchManager2;
                CrossSellLaunchManager.initIacBottomSheetPolling$default(crossSellLaunchManager, equityAdvancedOrderFragment, EquityOrderSides.getIacAlertSheetLocation(equityOrderSide, ((EquityAdvancedOrderViewState) obj).getPositionEffect()), null, ((Args) EquityAdvancedOrderFragment.INSTANCE.getArgs((Fragment) EquityAdvancedOrderFragment.this)).getInstrumentId(), null, null, null, null, null, 500, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Companion companion = EquityAdvancedOrderFragment.INSTANCE;
            if (((Args) companion.getArgs((Fragment) EquityAdvancedOrderFragment.this)).getFlowSource().isInstrumentRow()) {
                CrossSellLaunchManager crossSellLaunchManager3 = EquityAdvancedOrderFragment.this.getCrossSellLaunchManager();
                EquityAdvancedOrderFragment equityAdvancedOrderFragment2 = EquityAdvancedOrderFragment.this;
                EquityOrderSide side = ((Args) companion.getArgs((Fragment) equityAdvancedOrderFragment2)).getSide();
                StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderFragment.this.getDuxo().getStateFlow();
                this.L$0 = crossSellLaunchManager3;
                this.L$1 = equityAdvancedOrderFragment2;
                this.L$2 = side;
                this.label = 2;
                Object objFirst = FlowKt.first(stateFlow, this);
                if (objFirst != coroutine_suspended) {
                    equityAdvancedOrderFragment = equityAdvancedOrderFragment2;
                    crossSellLaunchManager = crossSellLaunchManager3;
                    equityOrderSide = side;
                    obj = objFirst;
                    CrossSellLaunchManager.initIacBottomSheetPolling$default(crossSellLaunchManager, equityAdvancedOrderFragment, EquityOrderSides.getIacAlertSheetLocation(equityOrderSide, ((EquityAdvancedOrderViewState) obj).getPositionEffect()), null, ((Args) EquityAdvancedOrderFragment.INSTANCE.getArgs((Fragment) EquityAdvancedOrderFragment.this)).getInstrumentId(), null, null, null, null, null, 500, null);
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EquityAdvancedOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onResume$1$1", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$onResume$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(this.Z$0);
            }
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<EquityOrderEvent.Advanced> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-952279630);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-952279630, i2, -1, "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment.ComposeContent (EquityAdvancedOrderFragment.kt:207)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new BentoNumpadScopeV22(coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final BentoNumpadScopeV22 bentoNumpadScopeV22 = (BentoNumpadScopeV22) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            final Event<EquityOrderEvent.Advanced> eventComposeContent$lambda$2 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$2 != null && (eventComposeContent$lambda$2.getData() instanceof EquityOrderEvent.Advanced) && (eventConsumerInvoke = eventComposeContent$lambda$2.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$2, new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m13744invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13744invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        EquityOrderEvent.Advanced advanced = (EquityOrderEvent.Advanced) eventComposeContent$lambda$2.getData();
                        if (advanced instanceof EquityOrderEvent.Advanced.SetEditingFieldText) {
                            this.handleTextFieldEvent((EquityOrderEvent.Advanced.SetEditingFieldText) advanced, bentoNumpadScopeV22);
                        } else {
                            this.handleEvent(advanced);
                        }
                    }
                });
            }
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), null, ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getLoggingEquityOrderContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-2053674591, true, new EquityAdvancedOrderFragment$ComposeContent$2$1(this, bentoNumpadScopeV22, coroutineScope, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            composerStartRestartGroup.endNode();
            GenericAlertContent<com.robinhood.models.serverdriven.experimental.api.GenericAction> sessionChangeAlertContent = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getSessionChangeAlertContent();
            com.robinhood.rosetta.eventlogging.Context loggingEquityOrderContext = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getLoggingEquityOrderContext();
            if (sessionChangeAlertContent != null && loggingEquityOrderContext != null) {
                composerStartRestartGroup.startReplaceGroup(-1097812662);
                EquityAdvancedOrderDuxo duxo = getDuxo();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new EquityAdvancedOrderFragment$ComposeContent$3$1(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                TradingSessionChangedAlert.TradingSessionChangedAlertComposable(sessionChangeAlertContent, loggingEquityOrderContext, (Function0) ((KFunction) objRememberedValue3), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getShowOvernightShortAlert()) {
                composerStartRestartGroup.startReplaceGroup(-1097543241);
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(fragmentActivityRequireActivity);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new EquityAdvancedOrderFragment$ComposeContent$4$1(fragmentActivityRequireActivity);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                TradingSessionChangedAlert.OvernightShortWarningDialog((Function0) ((KFunction) objRememberedValue4), null, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1097426960);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityAdvancedOrderFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextFieldEvent(EquityOrderEvent.Advanced.SetEditingFieldText event, BentoNumpadScopeV22 numpadScope) {
        String limit_standard_text_field_id_limit_price;
        int i = WhenMappings.$EnumSwitchMapping$0[event.getTextField().ordinal()];
        if (i == 1) {
            limit_standard_text_field_id_limit_price = EquityAdvancedOrderDataState2.SHARE_QUANTITY_FIELD_ID;
        } else if (i == 2) {
            limit_standard_text_field_id_limit_price = LimitTaxLots2.TAX_LOTS_LIMIT_PRICE_FIELD_ID;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            limit_standard_text_field_id_limit_price = LimitStandard3.getLIMIT_STANDARD_TEXT_FIELD_ID_LIMIT_PRICE();
        }
        numpadScope.setInternalValue(limit_standard_text_field_id_limit_price, event.getText());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        RhToolbar rhToolbar;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ViewGroup viewGroup = (ViewGroup) toolbar.findViewById(C20649R.id.equity_order_toolbar_content);
        if (viewGroup == null) {
            rhToolbar = toolbar;
            RhToolbar.addCustomView$default(rhToolbar, C20649R.layout.include_equity_order_toolbar, false, 0, 6, null);
            viewGroup = (ViewGroup) rhToolbar.findViewById(C20649R.id.equity_order_toolbar_content);
        } else {
            rhToolbar = toolbar;
        }
        Intrinsics.checkNotNull(viewGroup);
        TextView textView = (TextView) viewGroup.findViewById(C20649R.id.action_order_types_txt);
        View viewFindViewById = viewGroup.findViewById(C20649R.id.action_order_types);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getOrderToReplaceId() == null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152282(textView, viewFindViewById, null), 3, null);
            return;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById2 = rhToolbar.findViewById(C20649R.id.order_label_content);
        if (viewFindViewById2 == null) {
            RhToolbar.addCustomView$default(rhToolbar, C20649R.layout.include_toolbar_equity_order_label, true, 0, 4, null);
            viewFindViewById2 = rhToolbar.findViewById(C20649R.id.order_label_content);
        }
        final TextView textView2 = viewFindViewById2 != null ? (TextView) viewFindViewById2.findViewById(C20649R.id.order_label_txt) : null;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(asObservable(getDuxo().getStateFlow())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderFragment.configureToolbar$lambda$10(textView2, (EquityAdvancedOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$10(TextView textView, EquityAdvancedOrderViewState state) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(state, "state");
        if (textView != null) {
            textView.setVisibility(state.getToolbarTitle() != null ? 0 : 8);
            StringResource toolbarTitle = state.getToolbarTitle();
            if (toolbarTitle != null) {
                Resources resources = textView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = toolbarTitle.getText(resources);
            } else {
                text = null;
            }
            textView.setText(text);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$configureToolbar$2", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {375}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$configureToolbar$2 */
    static final class C152282 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ View $actionOrderTypeContainer;
        final /* synthetic */ TextView $actionOrderTypeTxt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152282(TextView textView, View view, Continuation<? super C152282> continuation) {
            super(2, continuation);
            this.$actionOrderTypeTxt = textView;
            this.$actionOrderTypeContainer = view;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderFragment.this.new C152282(this.$actionOrderTypeTxt, this.$actionOrderTypeContainer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityAdvancedOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewState", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$configureToolbar$2$1", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$configureToolbar$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderViewState, Continuation<? super Unit>, Object> {
            final /* synthetic */ View $actionOrderTypeContainer;
            final /* synthetic */ TextView $actionOrderTypeTxt;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TextView textView, EquityAdvancedOrderFragment equityAdvancedOrderFragment, View view, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$actionOrderTypeTxt = textView;
                this.this$0 = equityAdvancedOrderFragment;
                this.$actionOrderTypeContainer = view;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$actionOrderTypeTxt, this.this$0, this.$actionOrderTypeContainer, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityAdvancedOrderViewState equityAdvancedOrderViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(equityAdvancedOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final EquityAdvancedOrderViewState equityAdvancedOrderViewState = (EquityAdvancedOrderViewState) this.L$0;
                TextView textView = this.$actionOrderTypeTxt;
                if (textView != null) {
                    StringResource actionOrderTypeHeaderLabel = equityAdvancedOrderViewState.getActionOrderTypeHeaderLabel();
                    Resources resources = this.this$0.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    textView.setText(actionOrderTypeHeaderLabel.getText(resources));
                }
                TextView textView2 = this.$actionOrderTypeTxt;
                Intrinsics.checkNotNull(textView2);
                TextViewsKt.setDrawableEnd(textView2, (equityAdvancedOrderViewState.getDisableChangingOrderTypeForBuyToCloseSubOneSharePosition() || equityAdvancedOrderViewState.getDisableChangingOrderTypeForShortSaleAfterHours()) ? null : ContextCompat.getDrawable(this.this$0.requireContext(), C13997R.drawable.svg_ic_caret_down_8dp));
                View view = this.$actionOrderTypeContainer;
                if (view != null) {
                    final EquityAdvancedOrderFragment equityAdvancedOrderFragment = this.this$0;
                    final TextView textView3 = this.$actionOrderTypeTxt;
                    OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$configureToolbar$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityAdvancedOrderFragment.C152282.AnonymousClass1.invokeSuspend$lambda$1(equityAdvancedOrderViewState, equityAdvancedOrderFragment, textView3);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(EquityAdvancedOrderViewState equityAdvancedOrderViewState, EquityAdvancedOrderFragment equityAdvancedOrderFragment, TextView textView) throws Resources.NotFoundException {
                if (equityAdvancedOrderViewState.getDisableChangingOrderTypeForBuyToCloseSubOneSharePosition()) {
                    TooltipManager tooltipManager = equityAdvancedOrderFragment.getTooltipManager();
                    String string2 = equityAdvancedOrderFragment.getResources().getString(C15237R.string.buy_to_close_sub_one_share_tool_tip);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Intrinsics.checkNotNull(textView);
                    TooltipManager.DefaultImpls.addTooltip$default(tooltipManager, false, new TooltipData(EquityAdvancedOrderFragment.SHORT_SALE_TOOLTIP_AFTER_HOURS_ID, string2, TooltipData2.toTarget(textView), null, new TooltipData.Behavior(null, Long.valueOf(Durations.INSTANCE.getFIVE_SECONDS().toMillis()), null, null, 13, null), 8, null), 1, null);
                } else if (equityAdvancedOrderViewState.getDisableChangingOrderTypeForShortSaleAfterHours()) {
                    TooltipManager tooltipManager2 = equityAdvancedOrderFragment.getTooltipManager();
                    String string3 = equityAdvancedOrderFragment.getResources().getString(C15237R.string.short_sale_tooltip_after_hours);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    Intrinsics.checkNotNull(textView);
                    TooltipManager.DefaultImpls.addTooltip$default(tooltipManager2, false, new TooltipData(EquityAdvancedOrderFragment.SHORT_SALE_TOOLTIP_AFTER_HOURS_ID, string3, TooltipData2.toTarget(textView), null, new TooltipData.Behavior(null, Long.valueOf(Durations.INSTANCE.getFIVE_SECONDS().toMillis()), null, null, 13, null), 8, null), 1, null);
                } else {
                    com.robinhood.rosetta.eventlogging.Context loggingEquityOrderContext = equityAdvancedOrderViewState.getLoggingEquityOrderContext();
                    if (loggingEquityOrderContext != null) {
                        EventLogger.DefaultImpls.logTap$default(equityAdvancedOrderFragment.getEventLogger(), null, equityAdvancedOrderFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "equity_order_type_menu_open", null, 4, null), null, loggingEquityOrderContext, false, 41, null);
                    }
                    equityAdvancedOrderFragment.getCallbacks().startOrderSelectMenu(equityAdvancedOrderViewState.getAccountNumber(), equityAdvancedOrderViewState.getSharesQuantity());
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
                StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$actionOrderTypeTxt, EquityAdvancedOrderFragment.this, this.$actionOrderTypeContainer, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderDropdownEditCallbacks
    public void orderMarketHoursSelected(OrderMarketHours orderMarketHours, boolean hideSheet) {
        Intrinsics.checkNotNullParameter(orderMarketHours, "orderMarketHours");
        getDuxo().setTradingHours(orderMarketHours);
        if (hideSheet) {
            getDuxo().hideBottomSheet();
        }
    }

    @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderDropdownEditCallbacks
    public void orderTimeInForceSelected(OrderTimeInForce orderTimeInForce, boolean hideSheet) {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
        getDuxo().setTimeInForce(orderTimeInForce);
        if (hideSheet) {
            getDuxo().hideBottomSheet();
        }
    }

    @Override // com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderDropdownEditCallbacks
    public void strategySelected(AvailableSelectionStrategyOption availableSelectionStrategyOption, boolean hideSheet) {
        Intrinsics.checkNotNullParameter(availableSelectionStrategyOption, "availableSelectionStrategyOption");
        getDuxo().logSelectionStrategyTap(availableSelectionStrategyOption.getSelection_strategy());
        EquityAdvancedOrderDuxo.setStrategy$default(getDuxo(), availableSelectionStrategyOption.getSelection_strategy(), null, false, false, 14, null);
        if (hideSheet) {
            getDuxo().hideBottomSheet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(EquityOrderEvent.Advanced event) {
        SilentEquityOrderChecksAlert silentAlert;
        if (event instanceof EquityOrderEvent.Advanced.CompleteOrderEvent) {
            getCallbacks().setOrderConfiguration(((EquityOrderEvent.Advanced.CompleteOrderEvent) event).getConfiguration());
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.ShowSuitabilityEvent) {
            AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment = (AccountSwitcherSuitabilityDialogFragment) AccountSwitcherSuitabilityDialogFragment.INSTANCE.newInstance((Parcelable) new AccountSwitcherSuitabilityDialogFragment.Args(((EquityOrderEvent.Advanced.ShowSuitabilityEvent) event).getAccountNumber()));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            accountSwitcherSuitabilityDialogFragment.show(childFragmentManager, "account-switching-suitability-check");
            return;
        }
        if (event instanceof EquityOrderEvent.OrderCheckEvent) {
            EquityOrderEvent.OrderCheckEvent orderCheckEvent = (EquityOrderEvent.OrderCheckEvent) event;
            OrderCheckFailure failure = orderCheckEvent.getFailure();
            VisibleEquityOrderChecksAlert alert = failure != null ? failure.getAlert() : null;
            if (alert != null) {
                Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.EquityOrderChecksAlert(alert), null, 2, null).show(getChildFragmentManager(), "server-side-order-check-failure");
            }
            OrderCheckFailure failure2 = orderCheckEvent.getFailure();
            GenericOrderCheckAction action = (failure2 == null || (silentAlert = failure2.getSilentAlert()) == null) ? null : silentAlert.getAction();
            if (action != null) {
                getDuxo().recordSilentAlert(action);
                performTypedAction(new GenericAction.OrderCheckAction(action), orderCheckEvent.getAccountNumber(), orderCheckEvent.getOrderContext());
                getDuxo().logOrderCheckAction(SilentEquityOrderChecksAlert.LOGGING_IDENTIFIER);
            }
            Throwable error = orderCheckEvent.getError();
            if (error != null) {
                AbsErrorHandler.handleError$default(getActivityErrorHandler(), error, false, 2, null);
                return;
            }
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.ShowAccountSwitcher) {
            onAccountSwitcherCtaClicked(((EquityOrderEvent.Advanced.ShowAccountSwitcher) event).getData());
            return;
        }
        if (event instanceof EquityOrderEvent.CancelPendingCryptoOrderEvent) {
            EquityOrderEvent.CancelPendingCryptoOrderEvent cancelPendingCryptoOrderEvent = (EquityOrderEvent.CancelPendingCryptoOrderEvent) event;
            if (cancelPendingCryptoOrderEvent.getError() != null) {
                ActivityErrorHandler activityErrorHandler = getActivityErrorHandler();
                Throwable error2 = cancelPendingCryptoOrderEvent.getError();
                Intrinsics.checkNotNull(error2);
                AbsErrorHandler.handleError$default(activityErrorHandler, error2, false, 2, null);
                return;
            }
            if (cancelPendingCryptoOrderEvent.getDescription() != null) {
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder title = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C12914R.string.cancel_pending_crypto_orders_error_title, new Object[0]);
                StringResource description = cancelPendingCryptoOrderEvent.getDescription();
                Intrinsics.checkNotNull(description);
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                RhDialogFragment.Builder positiveButton = title.setMessage(description.getText(resources)).setPositiveButton(C12914R.string.cancel_pending_crypto_orders_equity_error_cta, new Object[0]);
                FragmentManager supportFragmentManager = requireBaseActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "cancelPendingCryptoOrdersError", false, 4, null);
                return;
            }
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.ShowMarketDataDisclosureDialog) {
            Companion companion2 = INSTANCE;
            UUID instrumentId = ((Args) companion2.getArgs((Fragment) this)).getInstrumentId();
            EquityOrderEvent.Advanced.ShowMarketDataDisclosureDialog showMarketDataDisclosureDialog = (EquityOrderEvent.Advanced.ShowMarketDataDisclosureDialog) event;
            Quote quote = showMarketDataDisclosureDialog.getQuote();
            EquityOrderSide side = ((Args) companion2.getArgs((Fragment) this)).getSide();
            Order.Configuration orderConfiguration = showMarketDataDisclosureDialog.getOrderConfiguration();
            if (orderConfiguration == null) {
                orderConfiguration = Order.Configuration.LIMIT;
            }
            MarketDataDisclosureDialog marketDataDisclosureDialog = (MarketDataDisclosureDialog) MarketDataDisclosureDialog.INSTANCE.newInstance((Parcelable) new MarketDataDisclosureDialog.Args(instrumentId, quote, side, orderConfiguration));
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            marketDataDisclosureDialog.show(parentFragmentManager, "market-data-disclosures");
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.ShowBackupWithholdingDialog) {
            BackupWithholdingWarningBottomSheetFragment backupWithholdingWarningBottomSheetFragment = new BackupWithholdingWarningBottomSheetFragment();
            FragmentManager parentFragmentManager2 = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
            backupWithholdingWarningBottomSheetFragment.show(parentFragmentManager2, "backup-withholding-info");
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.ShowTaxLotsSelection) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), Dispatchers.getIO(), null, new C152312(event, null), 2, null);
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.ConfirmOrderEvent) {
            Toast.makeText(getActivity(), getString(C15237R.string.order_confirmed), 1).show();
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.SetEditingFieldText) {
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.ShowTaxLotMaxLotsDialog) {
            EquityOrderEvent.Advanced.ShowTaxLotMaxLotsDialog showTaxLotMaxLotsDialog = (EquityOrderEvent.Advanced.ShowTaxLotMaxLotsDialog) event;
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new TaxLotsSelectionStrategyMaximumSelectedLotsKey(showTaxLotMaxLotsDialog.getSelectionStrategySummary(), showTaxLotMaxLotsDialog.getSelectionStrategy(), showTaxLotMaxLotsDialog.getMaxNumberOfTaxLots(), showTaxLotMaxLotsDialog.getEventContext()), null, 2, null).show(getChildFragmentManager(), "TaxLotsSelectionStrategyMaximumSelectedLotsAlert");
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.ShowNotEnoughSharesDialog) {
            RhDialogFragment.Companion companion3 = RhDialogFragment.INSTANCE;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            EquityOrderEvent.Advanced.ShowNotEnoughSharesDialog showNotEnoughSharesDialog = (EquityOrderEvent.Advanced.ShowNotEnoughSharesDialog) event;
            RhDialogFragment.Builder theme = companion3.create(contextRequireContext2).setTitle(getString(C15237R.string.not_enough_shares_dialog_title)).setMessage(getString(C15237R.string.not_enough_shares_dialog_body, InitialDataStateHelper2.toSharesQuantityText(showNotEnoughSharesDialog.getShares()), showNotEnoughSharesDialog.getSymbol())).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
            FragmentManager supportFragmentManager2 = requireBaseActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(theme, supportFragmentManager2, "notEnoughSharesDialog", false, 4, null);
            return;
        }
        if (event instanceof EquityOrderEvent.Advanced.ShowMissingLimitPriceDialog) {
            RhDialogFragment.Companion companion4 = RhDialogFragment.INSTANCE;
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            RhDialogFragment.Builder theme2 = companion4.create(contextRequireContext3).setTitle(getString(C15237R.string.missing_limit_price_dialog_title)).setMessage(getString(C15237R.string.missing_limit_price_dialog_body)).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
            FragmentManager supportFragmentManager3 = requireBaseActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(theme2, supportFragmentManager3, "missingLimitPriceDialog", false, 4, null);
            return;
        }
        if (Intrinsics.areEqual(event, EquityOrderEvent.Advanced.ShowNoAvailableSharesDialog.INSTANCE)) {
            RhDialogFragment.Companion companion5 = RhDialogFragment.INSTANCE;
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
            RhDialogFragment.Builder negativeButton = companion5.create(contextRequireContext4).setId(C15237R.id.no_available_shares_dialog).setTitle(getString(C15237R.string.no_available_shares_dialog_title)).setMessage(getString(C15237R.string.no_available_shares_dialog_body)).setPositiveButton(C15237R.string.view_orders, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager4 = requireBaseActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager4, "noAvailableSharesDialog", false, 4, null);
            return;
        }
        if (Intrinsics.areEqual(event, EquityOrderEvent.Advanced.ShowBorrowFeesUnavailableDialog.INSTANCE)) {
            RhDialogFragment.Companion companion6 = RhDialogFragment.INSTANCE;
            Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
            RhDialogFragment.Builder theme3 = companion6.create(contextRequireContext5).setId(C15237R.id.borrow_fees_unavailable_dialog).setTitle(getString(C15237R.string.borrow_fees_unavailable_dialog_title)).setMessage(getString(C15237R.string.borrow_fees_unavailable_dialog_message)).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C15237R.string.borrow_fees_unavailable_dialog_back, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
            FragmentManager supportFragmentManager5 = requireBaseActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager5, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(theme3, supportFragmentManager5, "borrowFeesUnavailableDialog", false, 4, null);
            return;
        }
        if (event instanceof EquityOrderEvent.ChangeOrderConfiguration) {
            getCallbacks().setOrderConfiguration(((EquityOrderEvent.ChangeOrderConfiguration) event).getConfiguration());
            return;
        }
        if (event instanceof EquityOrderEvent.Exit) {
            requireActivity().finish();
            return;
        }
        if (!Intrinsics.areEqual(event, EquityOrderEvent.Advanced.ShowTaxLotLimitOrderFractionalLotsAlert.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        RhDialogFragment.Companion companion7 = RhDialogFragment.INSTANCE;
        Context contextRequireContext6 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
        RhDialogFragment.Builder positiveButton2 = companion7.create(contextRequireContext6).setId(C15237R.id.tax_lots_fractional_limit_order_alert).setTitle(C14807R.string.tax_lots_table_limit_order_fractional_alert_title, new Object[0]).setMessage(C14807R.string.tax_lots_table_limit_order_fractional_alert_body, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager6 = requireBaseActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager6, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton2, supportFragmentManager6, "taxLotsFractionalLimitOrderAlert", false, 4, null);
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$handleEvent$2", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {541}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$handleEvent$2 */
    static final class C152312 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EquityOrderEvent.Advanced $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152312(EquityOrderEvent.Advanced advanced, Continuation<? super C152312> continuation) {
            super(2, continuation);
            this.$event = advanced;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderFragment.this.new C152312(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152312) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderFragment.this.getDuxo().getStateFlow();
                Flow<com.robinhood.rosetta.eventlogging.EquityOrderContext> flow = new Flow<com.robinhood.rosetta.eventlogging.EquityOrderContext>() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$handleEvent$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super com.robinhood.rosetta.eventlogging.EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$handleEvent$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$handleEvent$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$handleEvent$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                com.robinhood.rosetta.eventlogging.Context loggingEquityOrderContext = ((EquityAdvancedOrderViewState) obj).getLoggingEquityOrderContext();
                                com.robinhood.rosetta.eventlogging.EquityOrderContext equity_order_context = loggingEquityOrderContext != null ? loggingEquityOrderContext.getEquity_order_context() : null;
                                if (equity_order_context != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(equity_order_context, anonymousClass1) == coroutine_suspended) {
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
                this.label = 1;
                objFirst = FlowKt.first(flow, this);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objFirst = obj;
            }
            EquityAdvancedOrderFragment equityAdvancedOrderFragment = EquityAdvancedOrderFragment.this;
            EquityOrderEvent.Advanced.ShowTaxLotsSelection showTaxLotsSelection = (EquityOrderEvent.Advanced.ShowTaxLotsSelection) this.$event;
            NavigationFragmentResultContract2.launch$default(equityAdvancedOrderFragment.selectLotsLauncher, new SelectLotsKey(showTaxLotsSelection.getAccountNumber(), showTaxLotsSelection.getOrderId(), ((Args) EquityAdvancedOrderFragment.INSTANCE.getArgs((Fragment) equityAdvancedOrderFragment)).getInstrumentId(), showTaxLotsSelection.getNumberOfShares(), (com.robinhood.rosetta.eventlogging.EquityOrderContext) objFirst, false, 32, null), null, false, false, 14, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C15237R.id.no_available_shares_dialog) {
            Navigator navigator = getNavigator();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new WatchListIntentKey(WatchListIntentKey2.ORDERS), null, false, null, null, 60, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C15237R.id.no_available_shares_dialog || id == C15237R.id.borrow_fees_unavailable_dialog) {
            requireActivity().finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().setAccountNumber(accountNumber);
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void onAccountSwitcherCtaClicked(AccountSwitcherData args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(args), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void showSduiAccountSwitcher(SurfaceDto surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new SduiAccountSwitcherBottomSheetFragmentKey(surface), null, 2, null).show(getChildFragmentManager(), "sdui-account-switcher");
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        EquityAdvancedOrderDuxo.refreshAccountSwitcher$default(getDuxo(), null, 1, null);
    }

    @Override // com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragmentCallbacks
    public void onSuitabilityQuestionnaireCompletedForAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getDuxo().setAccountNumber(accountNumber);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public Context getResolverContext() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToLimitOrder(String accountNumber, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getDuxo().m1958xf90208f1(Order.Configuration.LIMIT);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToAllDayOrder(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getDuxo().setMarketHours$lib_equity_advanced_order_externalDebug(OrderMarketHours.ALL_DAY_HOURS);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void setLimitOrderConfiguration(String accountNumber, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(amount, "amount");
        getDuxo().m1959x1ad033f7(accountNumber, amount);
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$editLimitOrder$1", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {731}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$editLimitOrder$1 */
    static final class C152291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EquityOrderContext $context;
        int label;

        /* compiled from: EquityAdvancedOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$editLimitOrder$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Order.Configuration.values().length];
                try {
                    iArr[Order.Configuration.MARKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Order.Configuration.LIMIT.ordinal()] = 3;
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
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152291(EquityOrderContext equityOrderContext, Continuation<? super C152291> continuation) {
            super(2, continuation);
            this.$context = equityOrderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderFragment.this.new C152291(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Order.Configuration configuration;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderFragment.this.getDuxo().getStateFlow();
                this.label = 1;
                obj = FlowKt.first(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EquityOrderContext equityOrderContext = ((EquityAdvancedOrderViewState) obj).getEquityOrderContext();
            if (equityOrderContext != null && (configuration = equityOrderContext.getConfiguration()) != null) {
                switch (WhenMappings.$EnumSwitchMapping$0[configuration.ordinal()]) {
                    case 1:
                    case 2:
                        EquityAdvancedOrderFragment.this.getDuxo().m1958xf90208f1(Order.Configuration.LIMIT);
                        break;
                    case 3:
                        EquityAdvancedOrderFragment.this.getDuxo().editLimitOrder$lib_equity_advanced_order_externalDebug(this.$context);
                        break;
                    case 4:
                        EquityOrderCallbacks callbacks = EquityAdvancedOrderFragment.this.getCallbacks();
                        String accountNumber = this.$context.getAccountNumber();
                        OrderTimeInForce timeInForce = this.$context.getTimeInForce();
                        OrderMarketHours marketHours = this.$context.getMarketHours();
                        BigDecimal ZERO = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        callbacks.startOrderBuilder(new ShareStopLoss.New(accountNumber, null, ZERO, timeInForce, marketHours, 2, null));
                        break;
                    case 5:
                        EquityOrderCallbacks callbacks2 = EquityAdvancedOrderFragment.this.getCallbacks();
                        String accountNumber2 = this.$context.getAccountNumber();
                        OrderTimeInForce timeInForce2 = this.$context.getTimeInForce();
                        OrderMarketHours marketHours2 = this.$context.getMarketHours();
                        BigDecimal ZERO2 = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                        callbacks2.startOrderBuilder(new ShareStopLimit.New(accountNumber2, ZERO2, null, ZERO2, timeInForce2, marketHours2, 4, null));
                        break;
                    case 6:
                        EquityAdvancedOrderFragment.this.getCallbacks().startOrderBuilder(new ShareTrailingStop.New(this.$context.getAccountNumber(), null, null, this.$context.getTimeInForce(), this.$context.getMarketHours(), 6, null));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void editLimitOrder(EquityOrderContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152291(context, null), 3, null);
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$editStopOrder$1", m3645f = "EquityAdvancedOrderFragment.kt", m3646l = {773}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$editStopOrder$1 */
    static final class C152301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EquityOrderContext $context;
        int label;

        /* compiled from: EquityAdvancedOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment$editStopOrder$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Order.Configuration.values().length];
                try {
                    iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Order.Configuration.STOP_LOSS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152301(EquityOrderContext equityOrderContext, Continuation<? super C152301> continuation) {
            super(2, continuation);
            this.$context = equityOrderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderFragment.this.new C152301(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Order.Configuration configuration;
            Order.Configuration configuration2;
            Buildable buildable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderFragment.this.getDuxo().getStateFlow();
                this.label = 1;
                obj = FlowKt.first(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EquityOrderContext equityOrderContext = ((EquityAdvancedOrderViewState) obj).getEquityOrderContext();
            if (equityOrderContext == null || (configuration = equityOrderContext.getConfiguration()) == null) {
                return Unit.INSTANCE;
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i2 = iArr[configuration.ordinal()];
            if (i2 == 1) {
                configuration2 = Order.Configuration.STOP_LIMIT;
            } else if (i2 == 2) {
                configuration2 = Order.Configuration.TRAILING_STOP;
            } else {
                configuration2 = Order.Configuration.STOP_LOSS;
            }
            EquityOrderCallbacks callbacks = EquityAdvancedOrderFragment.this.getCallbacks();
            int i3 = iArr[configuration2.ordinal()];
            if (i3 == 1) {
                String accountNumber = this.$context.getAccountNumber();
                OrderTimeInForce timeInForce = this.$context.getTimeInForce();
                OrderMarketHours marketHours = this.$context.getMarketHours();
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                buildable = new ShareStopLimit.New(accountNumber, ZERO, null, ZERO, timeInForce, marketHours, 4, null);
            } else if (i3 == 2) {
                buildable = new ShareTrailingStop.New(this.$context.getAccountNumber(), null, null, this.$context.getTimeInForce(), this.$context.getMarketHours(), 6, null);
            } else if (i3 == 3) {
                String accountNumber2 = this.$context.getAccountNumber();
                OrderTimeInForce timeInForce2 = this.$context.getTimeInForce();
                OrderMarketHours marketHours2 = this.$context.getMarketHours();
                BigDecimal ZERO2 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                buildable = new ShareStopLoss.New(accountNumber2, null, ZERO2, timeInForce2, marketHours2, 2, null);
            } else {
                throw new IllegalStateException("not possible");
            }
            callbacks.startOrderBuilder(buildable);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void editStopOrder(EquityOrderContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152301(context, null), 3, null);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void setShareQuantity(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        getDuxo().setShareQuantity$lib_equity_advanced_order_externalDebug(quantity);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void overrideToExecuteInMarketHoursOnly() {
        getDuxo().overrideToExecuteInMarketHoursOnlyAndValidate();
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void overrideToFlipIpoAccessShares() {
        getDuxo().overrideFlipIpoAccessSharesAndValidate();
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void appendOverrides(List<String> overrides) {
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        getDuxo().appendOverridesAndValidate(overrides);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void cancelPendingCryptoOrders() {
        EquityAdvancedOrderDuxo.m1956x36015f56(getDuxo(), 0L, 1, null);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void clearTaxLotSelection() {
        getDuxo().clearTaxLotSelection();
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void presentQuickConversionSheet(QuickConversionKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), key, null, 2, null).show(getChildFragmentManager(), "quick-conversion");
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        EquityOrderChecksAlertFragment.Callbacks callbacks = this.orderCheckCallbacks;
        if (callbacks != null) {
            return callbacks.onActionClicked(button);
        }
        return false;
    }

    @Override // com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragmentCallbacks
    public void onSelectionStrategyProceed(SelectionStrategySummary selectionStrategySummary) {
        Intrinsics.checkNotNullParameter(selectionStrategySummary, "selectionStrategySummary");
        EquityAdvancedOrderDuxo.setStrategy$default(getDuxo(), selectionStrategySummary.getSelection_strategy(), new BigDecimal(selectionStrategySummary.getMaximum_quantity()), true, false, 8, null);
    }

    @Override // com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragmentCallbacks
    public void onSelectionStrategyDismiss() {
        getDuxo().selectionStrategyUpdateCanceled();
    }

    @Override // com.robinhood.android.mcw.contracts.QuickConversionCallbacks
    public void onConversionComplete(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        companion.make(viewRequireView, message, 0).show();
    }

    @Override // com.robinhood.android.mcw.contracts.QuickConversionCallbacks
    public void onConversionOrderCheckAction(GenericOrderCheckAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        EquityOrderContext equityOrderContext = getDuxo().getStateFlow().getValue().getEquityOrderContext();
        if (equityOrderContext == null) {
            return;
        }
        performTypedAction(new GenericAction.OrderCheckAction(action), equityOrderContext.getAccountNumber(), equityOrderContext);
        getDuxo().logOrderCheckAction(QuickConversionCallbacks2.QUICK_CONVERSION_LOGGING_IDENTIFIER);
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Args;", "Landroid/os/Parcelable;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "refId", "orderToReplaceId", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Ljava/util/UUID;Ljava/util/UUID;)V", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "getInstrumentId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getRefId", "getOrderToReplaceId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AdvancedOrder configuration;
        private final EquityOrderFlowSource flowSource;
        private final UUID instrumentId;
        private final UUID orderToReplaceId;
        private final UUID refId;
        private final EquityOrderSide side;

        /* compiled from: EquityAdvancedOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((AdvancedOrder) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable(), EquityOrderSide.valueOf(parcel.readString()), EquityOrderFlowSource.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, AdvancedOrder advancedOrder, UUID uuid, EquityOrderSide equityOrderSide, EquityOrderFlowSource equityOrderFlowSource, UUID uuid2, UUID uuid3, int i, Object obj) {
            if ((i & 1) != 0) {
                advancedOrder = args.configuration;
            }
            if ((i & 2) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 4) != 0) {
                equityOrderSide = args.side;
            }
            if ((i & 8) != 0) {
                equityOrderFlowSource = args.flowSource;
            }
            if ((i & 16) != 0) {
                uuid2 = args.refId;
            }
            if ((i & 32) != 0) {
                uuid3 = args.orderToReplaceId;
            }
            UUID uuid4 = uuid2;
            UUID uuid5 = uuid3;
            return args.copy(advancedOrder, uuid, equityOrderSide, equityOrderFlowSource, uuid4, uuid5);
        }

        /* renamed from: component1, reason: from getter */
        public final AdvancedOrder getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component4, reason: from getter */
        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getOrderToReplaceId() {
            return this.orderToReplaceId;
        }

        public final Args copy(AdvancedOrder configuration, UUID instrumentId, EquityOrderSide side, EquityOrderFlowSource flowSource, UUID refId, UUID orderToReplaceId) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(refId, "refId");
            return new Args(configuration, instrumentId, side, flowSource, refId, orderToReplaceId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.configuration, args.configuration) && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.side == args.side && this.flowSource == args.flowSource && Intrinsics.areEqual(this.refId, args.refId) && Intrinsics.areEqual(this.orderToReplaceId, args.orderToReplaceId);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.configuration.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.side.hashCode()) * 31) + this.flowSource.hashCode()) * 31) + this.refId.hashCode()) * 31;
            UUID uuid = this.orderToReplaceId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "Args(configuration=" + this.configuration + ", instrumentId=" + this.instrumentId + ", side=" + this.side + ", flowSource=" + this.flowSource + ", refId=" + this.refId + ", orderToReplaceId=" + this.orderToReplaceId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.configuration, flags);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.side.name());
            dest.writeString(this.flowSource.name());
            dest.writeSerializable(this.refId);
            dest.writeSerializable(this.orderToReplaceId);
        }

        public Args(AdvancedOrder configuration, UUID instrumentId, EquityOrderSide side, EquityOrderFlowSource flowSource, UUID refId, UUID uuid) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(refId, "refId");
            this.configuration = configuration;
            this.instrumentId = instrumentId;
            this.side = side;
            this.flowSource = flowSource;
            this.refId = refId;
            this.orderToReplaceId = uuid;
        }

        public final AdvancedOrder getConfiguration() {
            return this.configuration;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final UUID getOrderToReplaceId() {
            return this.orderToReplaceId;
        }
    }

    /* compiled from: EquityAdvancedOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment;", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Args;", "<init>", "()V", "SHORT_SALE_TOOLTIP_AFTER_HOURS_ID", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EquityAdvancedOrderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EquityAdvancedOrderFragment equityAdvancedOrderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, equityAdvancedOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EquityAdvancedOrderFragment newInstance(Args args) {
            return (EquityAdvancedOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EquityAdvancedOrderFragment equityAdvancedOrderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, equityAdvancedOrderFragment, args);
        }
    }
}
