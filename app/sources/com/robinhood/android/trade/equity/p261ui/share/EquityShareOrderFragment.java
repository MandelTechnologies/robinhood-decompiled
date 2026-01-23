package com.robinhood.android.trade.equity.p261ui.share;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.crypto.lib.C12914R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equities.store.swipetotrade.EquitiesSwipeToTradeExperiment;
import com.robinhood.android.equity.ordercheck.OrderCheckFailure;
import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksAlertFragment;
import com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment;
import com.robinhood.android.equityadvancedorder.callbacks.EquityActivityBackgroundCallbacks;
import com.robinhood.android.equityadvancedorder.utils.EquityOrderSides;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks2;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment;
import com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragmentCallbacks;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog;
import com.robinhood.android.mcw.contracts.QuickConversionCallbacks;
import com.robinhood.android.mcw.contracts.QuickConversionCallbacks2;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.nbbo.NbboAnalytics;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.SubmitOrderService;
import com.robinhood.android.trade.equity.databinding.FragmentEquityOrderBinding;
import com.robinhood.android.trade.equity.databinding.MergeEquityOrderBinding;
import com.robinhood.android.trade.equity.p261ui.dialog.BuySellOrderOnboardingBottomSheet;
import com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip.EquityOrderTypeTooltipView;
import com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares.NotEnoughSharesDialogCallbacks;
import com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares.NotEnoughSharesDialogFragment;
import com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares.NotEnoughSharesDuxo;
import com.robinhood.android.trade.equity.util.BaseOrderFragments;
import com.robinhood.android.trade.equity.util.OrderTrailingPegs;
import com.robinhood.android.trade.equity.util.ShareQuantityTextWatcher;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.Buildable;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder2;
import com.robinhood.android.trading.contracts.configuration.DirectOrder5;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareBasic;
import com.robinhood.android.trading.contracts.configuration.ShareMarket;
import com.robinhood.android.trading.contracts.configuration.ShareSimpleLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLoss;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.SilentEquityOrderChecksAlert;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.SduiAccountSwitcherBottomSheetFragmentKey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.ZonedDateTimeFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: EquityShareOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ñ\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0006ð\u0001ñ\u0001ò\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u008e\u0001\u001a\u00020rH\u0016J\u0014\u0010\u008f\u0001\u001a\u00030\u008d\u00012\b\u0010\u0090\u0001\u001a\u00030\u0080\u0001H\u0016J\u0016\u0010\u0091\u0001\u001a\u00030\u008d\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0016J \u0010\u0094\u0001\u001a\u00030\u008d\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0016J\n\u0010\u0097\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010\u0098\u0001\u001a\u00030\u008d\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0016J\n\u0010\u009b\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010\u009c\u0001\u001a\u00030\u008d\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\u0014\u0010\u009f\u0001\u001a\u00030\u008d\u00012\b\u0010 \u0001\u001a\u00030¡\u0001H\u0002J\u0014\u0010¢\u0001\u001a\u00030\u008d\u00012\b\u0010 \u0001\u001a\u00030¡\u0001H\u0002J\u0014\u0010£\u0001\u001a\u00030\u008d\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\u0014\u0010¤\u0001\u001a\u00030\u008d\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\u0014\u0010¥\u0001\u001a\u00030\u008d\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\n\u0010¦\u0001\u001a\u00030\u008d\u0001H\u0016J\n\u0010§\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010¨\u0001\u001a\u00030\u008d\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\n\u0010©\u0001\u001a\u00030\u008d\u0001H\u0002J\u0014\u0010ª\u0001\u001a\u0004\u0018\u00010t2\u0007\u0010«\u0001\u001a\u00020\u0002H\u0016J\t\u0010¬\u0001\u001a\u00020BH\u0016J\n\u0010\u00ad\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010®\u0001\u001a\u00030\u008d\u00012\b\u0010¯\u0001\u001a\u00030°\u0001H\u0016J\n\u0010±\u0001\u001a\u00030\u008d\u0001H\u0016J\u001e\u0010²\u0001\u001a\u00020B2\u0007\u0010\u008e\u0001\u001a\u00020r2\n\u0010³\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0016J\u001e\u0010´\u0001\u001a\u00020B2\u0007\u0010\u008e\u0001\u001a\u00020r2\n\u0010³\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0016J\u001d\u0010µ\u0001\u001a\u00030\u008d\u00012\u0007\u0010¶\u0001\u001a\u00020>2\b\u0010·\u0001\u001a\u00030¸\u0001H\u0016J\u0014\u0010¹\u0001\u001a\u00030\u008d\u00012\b\u0010\u0090\u0001\u001a\u00030¡\u0001H\u0016J\u0014\u0010º\u0001\u001a\u00030\u008d\u00012\b\u0010\u0090\u0001\u001a\u00030¡\u0001H\u0016J\n\u0010»\u0001\u001a\u00030\u008d\u0001H\u0016J\n\u0010¼\u0001\u001a\u00030\u008d\u0001H\u0016J\u001a\u0010½\u0001\u001a\u00030\u008d\u00012\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00020>0¿\u0001H\u0016J\u001f\u0010À\u0001\u001a\u00030\u008d\u00012\u0007\u0010¶\u0001\u001a\u00020>2\n\u0010Á\u0001\u001a\u0005\u0018\u00010¸\u0001H\u0016J\n\u0010Â\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010Ã\u0001\u001a\u00030\u008d\u00012\b\u0010Ä\u0001\u001a\u00030¸\u0001H\u0016J\u0013\u0010Å\u0001\u001a\u00030\u008d\u00012\u0007\u0010¶\u0001\u001a\u00020>H\u0016J\n\u0010Æ\u0001\u001a\u00030\u008d\u0001H\u0016J\n\u0010Ç\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010È\u0001\u001a\u00030\u008d\u00012\b\u0010É\u0001\u001a\u00030Ê\u0001H\u0016J\u0013\u0010Ë\u0001\u001a\u00030\u008d\u00012\u0007\u0010¶\u0001\u001a\u00020>H\u0016J\u0014\u0010Ì\u0001\u001a\u00030\u008d\u00012\b\u0010Á\u0001\u001a\u00030¸\u0001H\u0016J\n\u0010Í\u0001\u001a\u00030\u008d\u0001H\u0016J\n\u0010Î\u0001\u001a\u00030\u008d\u0001H\u0016J\u0013\u0010Ï\u0001\u001a\u00020B2\b\u0010Ð\u0001\u001a\u00030Ñ\u0001H\u0016J\u001d\u0010Ò\u0001\u001a\u00030\u008d\u00012\u0007\u0010¶\u0001\u001a\u00020>2\b\u0010Ó\u0001\u001a\u00030Ô\u0001H\u0016J\u0014\u0010Õ\u0001\u001a\u00030\u008d\u00012\b\u0010Ö\u0001\u001a\u00030×\u0001H\u0016J\u0014\u0010Ø\u0001\u001a\u00030\u008d\u00012\b\u0010Ù\u0001\u001a\u00030Ú\u0001H\u0016J\n\u0010Û\u0001\u001a\u00030\u008d\u0001H\u0016J\u0013\u0010Ü\u0001\u001a\u00030\u008d\u00012\u0007\u0010¶\u0001\u001a\u00020>H\u0016J\n\u0010Ý\u0001\u001a\u00030\u008d\u0001H\u0016J\u0013\u0010Þ\u0001\u001a\u00030\u008d\u00012\u0007\u0010ß\u0001\u001a\u00020>H\u0016J\u0014\u0010à\u0001\u001a\u00030\u008d\u00012\b\u0010á\u0001\u001a\u00030â\u0001H\u0016J\u0010\u0010ã\u0001\u001a\u00020>*\u0005\u0018\u00010¸\u0001H\u0002J0\u0010ä\u0001\u001a\u00030\u008d\u00012\u0007\u0010¶\u0001\u001a\u00020>2\t\u0010å\u0001\u001a\u0004\u0018\u00010r2\n\u0010æ\u0001\u001a\u0005\u0018\u00010ç\u0001H\u0002¢\u0006\u0003\u0010è\u0001J\n\u0010é\u0001\u001a\u00030\u008d\u0001H\u0002J\u001a\u0010ê\u0001\u001a\u00030\u008d\u00012\b\u0010ë\u0001\u001a\u00030ì\u0001H\u0000¢\u0006\u0003\bí\u0001J\u0013\u0010î\u0001\u001a\u00030\u008d\u00012\u0007\u0010ï\u0001\u001a\u00020BH\u0002R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010=\u001a\u0004\u0018\u00010>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010CR\u0014\u0010D\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010@R\u0014\u0010F\u001a\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0014\u0010H\u001a\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010CR\u0014\u0010J\u001a\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001b\u0010N\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bP\u0010QR\u001b\u0010T\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\bV\u0010WR\u001b\u0010Y\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010S\u001a\u0004\b[\u0010\\R\u001b\u0010^\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010S\u001a\u0004\b`\u0010aR\u0010\u0010c\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010d\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010\u0012\u001a\u0004\bf\u0010gR\u001d\u0010i\u001a\u0004\u0018\u00010j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010\u0012\u001a\u0004\bk\u0010lR\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010\u0012\u001a\u0004\bo\u0010lR\u000e\u0010q\u001a\u00020rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010v\u001a\u00020r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010xR\u0014\u0010{\u001a\u00020>X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b|\u0010@R\u0014\u0010}\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010@R\u0017\u0010\u007f\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\"\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0010\u0010\u0089\u0001\u001a\u00030\u008a\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006ó\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDialogCallbacks;", "Lcom/robinhood/android/equity/validation/EquityOrderValidationFailureResolver;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertFragment$Callbacks;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCombinedCallbacks;", "Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragmentCallbacks;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;", "Lcom/robinhood/android/trade/equity/ui/dialog/BuySellOrderOnboardingBottomSheet$Callbacks;", "Lcom/robinhood/android/mcw/contracts/QuickConversionCallbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "orderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "getOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "completionUrl", "", "getCompletionUrl", "()Ljava/lang/String;", "isPreIpo", "", "()Z", "initialAccountNumber", "getInitialAccountNumber", "autoValidate", "getAutoValidate", "prevalidated", "getPrevalidated", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "callbacks", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "activityBackgroundCallbacks", "Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", "getActivityBackgroundCallbacks", "()Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", "activityBackgroundCallbacks$delegate", "bindings", "Lcom/robinhood/android/trade/equity/databinding/MergeEquityOrderBinding;", "getBindings", "()Lcom/robinhood/android/trade/equity/databinding/MergeEquityOrderBinding;", "bindings$delegate", "fragmentBindings", "Lcom/robinhood/android/trade/equity/databinding/FragmentEquityOrderBinding;", "getFragmentBindings", "()Lcom/robinhood/android/trade/equity/databinding/FragmentEquityOrderBinding;", "fragmentBindings$delegate", "orderCheckCallbacks", "shareQuantityTextWatcher", "Lcom/robinhood/android/trade/equity/util/ShareQuantityTextWatcher;", "getShareQuantityTextWatcher", "()Lcom/robinhood/android/trade/equity/util/ShareQuantityTextWatcher;", "shareQuantityTextWatcher$delegate", "questionMarkDrawable", "Landroid/graphics/drawable/Drawable;", "getQuestionMarkDrawable", "()Landroid/graphics/drawable/Drawable;", "questionMarkDrawable$delegate", "loadingDrawable", "getLoadingDrawable", "loadingDrawable$delegate", "reviewingConstraintLayoutRes", "", "initialConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "reviewingConstraints", "initialLayoutRes", "getInitialLayoutRes", "()I", "contentRes", "getContentRes", "screenName", "getScreenName", "screenDescription", "getScreenDescription", "resolverContext", "Landroid/content/Context;", "getResolverContext", "()Landroid/content/Context;", "sheetListener", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "getSheetListener", "()Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "setSheetListener", "(Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;)V", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "twentyFourHourMarketDialogVisible", "onBottomSheetDismissed", "", "id", "onAttach", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onPause", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "setState", "state", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderViewState;", "updateShareQuantityEdt", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "updateNumpad", "updateTrailingPegGroup", "updateClickableLabels", "showMarketDisclosureDialog", "validateAndReviewOrder", "onFormStateUpdated", "updateFormStateWithViewState", "updateIsScrollable", "getConstraintsForState", "formState", "onBackPressed", "performSubmitOrder", "onSwipeToSubmitAnimationStart", "duration", "", "onOrderSubmitted", "onPositiveButtonClicked", "passthroughArgs", "onNegativeButtonClicked", "setLimitOrderConfiguration", "accountNumber", "amount", "Ljava/math/BigDecimal;", "editLimitOrder", "editStopOrder", "overrideToExecuteInMarketHoursOnly", "overrideToFlipIpoAccessShares", "appendOverrides", "overrides", "", "convertToLimitOrder", "quantity", "convertToMarketOrder", "convertToSimpleLimitOrder", "presetPercentLimit", "convertToAllDayOrder", "cancelPendingCryptoOrders", "clearTaxLotSelection", "presentQuickConversionSheet", "key", "Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "convertToShareQuantity", "setShareQuantity", "onNotEnoughDialogSellAllClicked", "onNotEnoughDialogNoSellableQuantity", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onAccountSelected", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAccountSwitcherCtaClicked", "args", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "showSduiAccountSwitcher", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "onRefreshAccountsClicked", "onSuitabilityQuestionnaireCompletedForAccount", "onDismissBuySellOrderOnboarding", "onConversionComplete", "message", "onConversionOrderCheckAction", "action", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "toInputText", "showTwentyFourHourMarketDialog", EquityShareOrderFragment.ARG_SHARES, "nextEffectiveMarketHours", "Lcom/robinhood/models/db/MarketHours;", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/db/MarketHours;)V", "showOnlyLimitOrdersDialog", "handleDuxoEvents", "event", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "handleDuxoEvents$feature_trade_equity_externalDebug", "toggleNumpad", "visible", "Callbacks", "Companion", "Args", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityShareOrderFragment extends BaseOrderFragment<DefaultOrderState> implements NotEnoughSharesDialogCallbacks, EquityOrderValidationFailureResolver, EquityOrderChecksAlertFragment.Callbacks, AccountSwitcherCallbacks2, AccountSwitcherSuitabilityDialogFragmentCallbacks, RhBottomSheetDialogFragmentHost, BuySellOrderOnboardingBottomSheet.Callbacks, QuickConversionCallbacks {
    public static final String ARG_ACCOUNT_NUMBER = "accountNumber";
    public static final String ARG_SHARES = "shares";
    private static final String DIALOG_NOT_ENOUGH_SHARES = "notEnoughShares";
    private static final String SCREEN_NAME = "CreateOrderFragment";

    /* renamed from: activityBackgroundCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 activityBackgroundCallbacks;
    public AnalyticsLogger analytics;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final int contentRes;
    public CrossSellLaunchManager crossSellLaunchManager;
    private DayNightOverlay dayNightOverlay;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;

    /* renamed from: fragmentBindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 fragmentBindings;
    private final ConstraintSet initialConstraints;

    /* renamed from: loadingDrawable$delegate, reason: from kotlin metadata */
    private final Lazy loadingDrawable;
    public Markwon markwon;
    private EquityOrderChecksAlertFragment.Callbacks orderCheckCallbacks;

    /* renamed from: questionMarkDrawable$delegate, reason: from kotlin metadata */
    private final Lazy questionMarkDrawable;
    private final int reviewingConstraintLayoutRes;
    private final ConstraintSet reviewingConstraints;
    private final String screenName;

    /* renamed from: shareQuantityTextWatcher$delegate, reason: from kotlin metadata */
    private final Lazy shareQuantityTextWatcher;
    private RhBottomSheetDialogFragmentHost.SheetListener sheetListener;
    private boolean twentyFourHourMarketDialogVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityShareOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(EquityShareOrderFragment.class, "activityBackgroundCallbacks", "getActivityBackgroundCallbacks()Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(EquityShareOrderFragment.class, "bindings", "getBindings()Lcom/robinhood/android/trade/equity/databinding/MergeEquityOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EquityShareOrderFragment.class, "fragmentBindings", "getFragmentBindings()Lcom/robinhood/android/trade/equity/databinding/FragmentEquityOrderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityShareOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment$Callbacks;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderCallbacks;", "showPreIpoFlow", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseOrderFragment.Callbacks, EquityOrderCallbacks {
        void showPreIpoFlow();
    }

    /* compiled from: EquityShareOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void clearTaxLotSelection() {
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost, com.robinhood.android.common.ui.BaseBottomSheetDialogFragment.OnDismissListener
    public void onBottomSheetDismissed(int id) {
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

    public EquityShareOrderFragment() {
        super(DefaultOrderState.EDITING);
        this.duxo = DuxosKt.duxo(this, EquityShareOrderDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.activityBackgroundCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(EquityActivityBackgroundCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$special$$inlined$hostActivityCallbacks$1
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
        this.bindings = ViewBinding5.viewBinding(this, EquityShareOrderFragment2.INSTANCE);
        this.fragmentBindings = ViewBinding5.viewBinding(this, EquityShareOrderFragment3.INSTANCE);
        this.shareQuantityTextWatcher = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityShareOrderFragment.shareQuantityTextWatcher_delegate$lambda$0();
            }
        });
        this.questionMarkDrawable = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityShareOrderFragment.questionMarkDrawable_delegate$lambda$1(this.f$0);
            }
        });
        this.loadingDrawable = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityShareOrderFragment.loadingDrawable_delegate$lambda$2(this.f$0);
            }
        });
        this.reviewingConstraintLayoutRes = C29365R.layout.fragment_equity_order_reviewing;
        this.initialConstraints = new ConstraintSet();
        this.reviewingConstraints = new ConstraintSet();
        this.contentRes = C29365R.layout.merge_equity_order;
        this.screenName = SCREEN_NAME;
        this.dayNightOverlay = DayNightOverlay.DAY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityShareOrderDuxo getDuxo() {
        return (EquityShareOrderDuxo) this.duxo.getValue();
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
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

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final ShareBasedOrderConfiguration getOrderConfiguration() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getOrderConfiguration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getInstrumentId() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getInstrumentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderSide getSide() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getSide();
    }

    private final String getCompletionUrl() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getCompletionUrl();
    }

    private final boolean isPreIpo() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).isPreIpo();
    }

    private final String getInitialAccountNumber() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
    }

    private final boolean getAutoValidate() {
        ShareBasedOrderConfiguration orderConfiguration = ((Args) INSTANCE.getArgs((Fragment) this)).getOrderConfiguration();
        DirectOrder.Draft draft = orderConfiguration instanceof DirectOrder.Draft ? (DirectOrder.Draft) orderConfiguration : null;
        return draft != null && draft.getAutoValidate();
    }

    private final boolean getPrevalidated() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getOrderConfiguration() instanceof DirectOrder.Validated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderFlowSource getFlowSource() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getFlowSource();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final EquityActivityBackgroundCallbacks getActivityBackgroundCallbacks() {
        return (EquityActivityBackgroundCallbacks) this.activityBackgroundCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MergeEquityOrderBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[2]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEquityOrderBinding) value;
    }

    private final FragmentEquityOrderBinding getFragmentBindings() {
        Object value = this.fragmentBindings.getValue(this, $$delegatedProperties[3]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEquityOrderBinding) value;
    }

    private final ShareQuantityTextWatcher getShareQuantityTextWatcher() {
        return (ShareQuantityTextWatcher) this.shareQuantityTextWatcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareQuantityTextWatcher shareQuantityTextWatcher_delegate$lambda$0() {
        return new ShareQuantityTextWatcher();
    }

    private final Drawable getQuestionMarkDrawable() {
        return (Drawable) this.questionMarkDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable questionMarkDrawable_delegate$lambda$1(EquityShareOrderFragment equityShareOrderFragment) {
        Drawable drawable = ContextCompat.getDrawable(equityShareOrderFragment.requireContext(), C20690R.drawable.ic_rds_question_16dp);
        if (drawable != null) {
            return drawable.mutate();
        }
        return null;
    }

    private final Drawable getLoadingDrawable() {
        return (Drawable) this.loadingDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimatedVectorDrawable loadingDrawable_delegate$lambda$2(EquityShareOrderFragment equityShareOrderFragment) {
        Drawable drawable = ContextCompat.getDrawable(equityShareOrderFragment.requireContext(), C13997R.drawable.button_spinner);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawableMutate;
        int dimension = (int) equityShareOrderFragment.getResources().getDimension(C29365R.dimen.order_summary_nbbo_loading_indicator_size);
        animatedVectorDrawable.setBounds(0, 0, dimension, dimension);
        animatedVectorDrawable.start();
        return animatedVectorDrawable;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return getPrevalidated() ? this.reviewingConstraintLayoutRes : C29365R.layout.fragment_equity_order;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return this.contentRes;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return getSide().getServerValue();
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public Context getResolverContext() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost
    public RhBottomSheetDialogFragmentHost.SheetListener getSheetListener() {
        return this.sheetListener;
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost
    public void setSheetListener(RhBottomSheetDialogFragmentHost.SheetListener sheetListener) {
        this.sheetListener = sheetListener;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof Callbacks)) {
            throw new IllegalArgumentException((parentFragment + " must implement " + Callbacks.class.getName()).toString());
        }
        super.onAttach(context);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().setAccountNumber(getInitialAccountNumber(), false, getSide());
        getDuxo().setStaticInputs(new EquityOrderRequestInputs.StaticInputs(getInstrumentId(), isPreIpo(), getSide(), getFlowSource(), getCallbacks().getOrderUuid()));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(getRoot(), InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C296561(null), 1, null);
        this.initialConstraints.clone(getRoot());
        this.reviewingConstraints.clone(getActivity(), this.reviewingConstraintLayoutRes);
        getDuxo().setConfiguration(getOrderConfiguration());
        BigDecimal shareQuantity = getOrderConfiguration().getShareQuantity();
        if (shareQuantity != null) {
            BigDecimal bigDecimal = BigDecimals7.isPositive(shareQuantity) ? shareQuantity : null;
            if (bigDecimal != null) {
                setShareQuantity(bigDecimal);
            }
        }
        if (isPreIpo() && !(getOrderConfiguration() instanceof DirectOrder2)) {
            getCallbacks().showPreIpoFlow();
        }
        getBindings().orderReviewTxt.setBetterLinkMovementMethod(true, false);
        setDelimiterEnabled(false);
        if (getAutoValidate()) {
            if (getPrevalidated()) {
                getDuxo().setReviewingState(true);
            } else {
                getDuxo().validateAndReviewOrder(true);
            }
            toggleNumpad(false);
        }
    }

    /* compiled from: EquityShareOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onViewCreated$1", m3645f = "EquityShareOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onViewCreated$1 */
    static final class C296561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C296561(Continuation<? super C296561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderFragment.this.new C296561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<EquityOrderEvent.Share>> eventFlow = EquityShareOrderFragment.this.getDuxo().getEventFlow();
                final EquityShareOrderFragment equityShareOrderFragment = EquityShareOrderFragment.this;
                FlowCollector<? super Event<EquityOrderEvent.Share>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<EquityOrderEvent.Share>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<EquityOrderEvent.Share> event, Continuation<? super Unit> continuation) {
                        EventConsumer<EquityOrderEvent.Share> eventConsumerInvoke;
                        if (event != null) {
                            final EquityShareOrderFragment equityShareOrderFragment2 = equityShareOrderFragment;
                            if ((event.getData() instanceof EquityOrderEvent.Share) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19372invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19372invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        equityShareOrderFragment2.handleDuxoEvents$feature_trade_equity_externalDebug((EquityOrderEvent.Share) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        DialogFragment dialogFragment = (DialogFragment) getParentFragmentManager().findFragmentByTag(DIALOG_NOT_ENOUGH_SHARES);
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v17, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.view.View] */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        RhToolbar rhToolbar;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? FindViewById = toolbar.findViewById(C20649R.id.equity_order_toolbar_content);
        objectRef.element = FindViewById;
        if (FindViewById == 0) {
            rhToolbar = toolbar;
            RhToolbar.addCustomView$default(rhToolbar, C20649R.layout.include_equity_order_toolbar, false, 0, 6, null);
            objectRef.element = rhToolbar.findViewById(C20649R.id.equity_order_toolbar_content);
        } else {
            rhToolbar = toolbar;
        }
        View viewFindViewById = rhToolbar.findViewById(C20649R.id.order_label_content);
        if (viewFindViewById == null) {
            RhToolbar.addCustomView$default(rhToolbar, C20649R.layout.include_toolbar_equity_order_label, true, 0, 4, null);
            viewFindViewById = rhToolbar.findViewById(C20649R.id.order_label_content);
        }
        final TextView textView = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(C20649R.id.order_label_txt) : null;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(asObservable(getDuxo().getStateFlow())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderFragment.configureToolbar$lambda$6(textView, this, (EquityShareOrderViewState) obj);
            }
        });
        ViewGroup viewGroup = (ViewGroup) objectRef.element;
        final TextView textView2 = viewGroup != null ? (TextView) viewGroup.findViewById(C20649R.id.action_order_types_txt) : null;
        ViewGroup viewGroup2 = (ViewGroup) objectRef.element;
        final View viewFindViewById2 = viewGroup2 != null ? viewGroup2.findViewById(C20649R.id.action_order_types) : null;
        if (viewFindViewById2 == null) {
            viewFindViewById2 = null;
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(!getReviewing() && !isPreIpo() ? 0 : 8);
        }
        if (((Args) INSTANCE.getArgs((Fragment) this)).getOrderToReplaceId() != null) {
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = (ViewGroup) objectRef.element;
        if (viewGroup3 != null) {
            OnClickListeners.onClick(viewGroup3, new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityShareOrderFragment.configureToolbar$lambda$7(this.f$0);
                }
            });
        }
        Observable observableDistinctUntilChanged = ObservablesAndroid.observeOnMainThread(asObservable(getDuxo().getStateFlow())).distinctUntilChanged(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment.configureToolbar.3
            @Override // io.reactivex.functions.Function
            public final Optional<com.robinhood.rosetta.eventlogging.Context> apply(EquityShareOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getLoggingEquityOrderContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderFragment.configureToolbar$lambda$8(this.f$0, (EquityShareOrderViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(asObservable(getDuxo().getStateFlow())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderFragment.configureToolbar$lambda$11(objectRef, textView2, this, viewFindViewById2, (EquityShareOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$6(TextView textView, EquityShareOrderFragment equityShareOrderFragment, EquityShareOrderViewState state) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(state, "state");
        if (textView != null) {
            textView.setVisibility((state.getToolbarTitle() == null || equityShareOrderFragment.getReviewing()) ? 8 : 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$7(EquityShareOrderFragment equityShareOrderFragment) {
        EquityOrderTypeTooltipView orderTypeOnboardingTooltip = equityShareOrderFragment.getFragmentBindings().orderTypeOnboardingTooltip;
        Intrinsics.checkNotNullExpressionValue(orderTypeOnboardingTooltip, "orderTypeOnboardingTooltip");
        orderTypeOnboardingTooltip.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$8(EquityShareOrderFragment equityShareOrderFragment, EquityShareOrderViewState equityShareOrderViewState) {
        if (!equityShareOrderFragment.isPreIpo() && !equityShareOrderFragment.getAutoValidate()) {
            equityShareOrderFragment.getFragmentBindings().orderTypeOnboardingTooltip.setTooltipArguments(new EquityOrderTypeTooltipView.Args(equityShareOrderFragment.getInitialAccountNumber(), equityShareOrderFragment.getInstrumentId(), equityShareOrderFragment.getSide(), false, equityShareOrderViewState.getLoggingEquityOrderContext().getOrNull(), equityShareOrderViewState.getConfiguration().getOrderConfiguration(), ((Args) INSTANCE.getArgs((Fragment) equityShareOrderFragment)).getOrderToReplaceId() != null));
        } else {
            EquityOrderTypeTooltipView orderTypeOnboardingTooltip = equityShareOrderFragment.getFragmentBindings().orderTypeOnboardingTooltip;
            Intrinsics.checkNotNullExpressionValue(orderTypeOnboardingTooltip, "orderTypeOnboardingTooltip");
            orderTypeOnboardingTooltip.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit configureToolbar$lambda$11(Ref.ObjectRef objectRef, TextView textView, final EquityShareOrderFragment equityShareOrderFragment, View view, final EquityShareOrderViewState state) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(state, "state");
        ViewGroup viewGroup = (ViewGroup) objectRef.element;
        if (viewGroup != null) {
            viewGroup.setVisibility(!state.isCancelPendingCryptoOrdersLoading() ? 0 : 8);
        }
        if (textView != null) {
            StringResource actionOrderTypeText = state.getActionOrderTypeText();
            if (actionOrderTypeText != null) {
                Resources resources = equityShareOrderFragment.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = actionOrderTypeText.getText(resources);
            } else {
                text = null;
            }
            textView.setText(text);
        }
        if (view != null) {
            view.setVisibility(!state.getReviewing() && !equityShareOrderFragment.isPreIpo() ? 0 : 8);
        }
        if (view != null) {
            OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityShareOrderFragment.configureToolbar$lambda$11$lambda$10(state, equityShareOrderFragment);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$11$lambda$10(EquityShareOrderViewState equityShareOrderViewState, EquityShareOrderFragment equityShareOrderFragment) {
        if (equityShareOrderViewState.getShowLimitOrdersOnlyDialog()) {
            equityShareOrderFragment.showOnlyLimitOrdersDialog();
        } else {
            com.robinhood.rosetta.eventlogging.Context orNull = equityShareOrderViewState.getLoggingEquityOrderContext().getOrNull();
            if (orNull != null) {
                EventLogger.DefaultImpls.logTap$default(equityShareOrderFragment.getEventLogger(), null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "equity_order_type_menu_open", null, 4, null), null, orNull, false, 41, null);
            }
            if (equityShareOrderViewState.getAccountNumber() != null) {
                equityShareOrderFragment.getCallbacks().startOrderSelectMenu(equityShareOrderViewState.getAccountNumber(), String.valueOf(equityShareOrderFragment.getBindings().shareQuantityEdt.getText()).length() > 0 ? equityShareOrderViewState.getRoundedDownQuantity() : null);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        final RhEditText rhEditText = getBindings().shareQuantityEdt;
        Intrinsics.checkNotNull(rhEditText);
        Observable<R> map = RxTextView.textChanges(rhEditText).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onResume$1$1
            @Override // io.reactivex.functions.Function
            public final BigDecimal apply(CharSequence text) {
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() > 0) {
                    this.this$0.getBindings().shareQuantityEdt.setHint("");
                } else {
                    this.this$0.getBindings().shareQuantityEdt.setHint(rhEditText.getContext().getString(C11048R.string.general_label_zero));
                }
                return BigDecimals7.toBigDecimalOrZero(text.toString());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderFragment.onResume$lambda$13$lambda$12(this.f$0, (BigDecimal) obj);
            }
        });
        rhEditText.setSelection(String.valueOf(rhEditText.getText()).length());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(asObservable(getDuxo().getStateFlow())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderFragment.onResume$lambda$14(this.f$0, (EquityShareOrderViewState) obj);
            }
        });
        Observable observableAsObservable = asObservable(getDuxo().getStateFlow());
        final C296523 c296523 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment.onResume.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((EquityShareOrderViewState) obj).getFormState();
            }
        };
        Observable observableDistinctUntilChanged = observableAsObservable.map(new Function(c296523) { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c296523, "function");
                this.function = c296523;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C296534(this));
        Observable observableAsObservable2 = asObservable(getDuxo().getStateFlow());
        final C296545 c296545 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment.onResume.5
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((EquityShareOrderViewState) obj).getLoggingEquityOrderContext();
            }
        };
        Observable map2 = observableAsObservable2.map(new Function(c296545) { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c296545, "function");
                this.function = c296545;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderFragment.onResume$lambda$15(this.f$0, (com.robinhood.rosetta.eventlogging.Context) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, requireBaseActivity().getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderFragment.onResume$lambda$16(this.f$0, (DayNightOverlay) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296558(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13$lambda$12(EquityShareOrderFragment equityShareOrderFragment, BigDecimal bigDecimal) {
        EquityShareOrderDuxo duxo = equityShareOrderFragment.getDuxo();
        Intrinsics.checkNotNull(bigDecimal);
        duxo.setShareQuantity(bigDecimal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(EquityShareOrderFragment equityShareOrderFragment, EquityShareOrderViewState state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        equityShareOrderFragment.setState(state);
        return Unit.INSTANCE;
    }

    /* compiled from: EquityShareOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onResume$4 */
    /* synthetic */ class C296534 extends FunctionReferenceImpl implements Function1<DefaultOrderState, Unit> {
        C296534(Object obj) {
            super(1, obj, EquityShareOrderFragment.class, "setFormState", "setFormState(Lcom/robinhood/android/lib/trade/OrderState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DefaultOrderState defaultOrderState) {
            invoke2(defaultOrderState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DefaultOrderState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EquityShareOrderFragment) this.receiver).setFormState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(EquityShareOrderFragment equityShareOrderFragment, com.robinhood.rosetta.eventlogging.Context context) {
        EventLogger.DefaultImpls.logScreenAppear$default(equityShareOrderFragment.getEventLogger(), null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), null, null, context, 13, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(EquityShareOrderFragment equityShareOrderFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityShareOrderFragment.dayNightOverlay = it;
        Drawable loadingDrawable = equityShareOrderFragment.getLoadingDrawable();
        Context contextRequireContext = equityShareOrderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        loadingDrawable.setTint(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground2));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityShareOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onResume$8", m3645f = "EquityShareOrderFragment.kt", m3646l = {476, 482}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onResume$8 */
    static final class C296558 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C296558(Continuation<? super C296558> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderFragment.this.new C296558(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296558) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v8, types: [com.robinhood.android.common.ui.BaseFragment] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityShareOrderFragment equityShareOrderFragment;
            CrossSellLaunchManager crossSellLaunchManager;
            EquityOrderSide equityOrderSide;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(EquityShareOrderFragment.this.getExperimentsStore(), new Experiment[]{EquitiesSwipeToTradeExperiment.INSTANCE}, false, null, 4, null)), Integer.MAX_VALUE, null, 2, null);
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
                equityShareOrderFragment = r1;
                crossSellLaunchManager = crossSellLaunchManager2;
                CrossSellLaunchManager.initIacBottomSheetPolling$default(crossSellLaunchManager, equityShareOrderFragment, EquityOrderSides.getIacAlertSheetLocation(equityOrderSide, ((EquityShareOrderViewState) obj).getPositionEffect()), null, EquityShareOrderFragment.this.getInstrumentId(), null, null, null, null, null, 500, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (EquityShareOrderFragment.this.getFlowSource().isInstrumentRow()) {
                CrossSellLaunchManager crossSellLaunchManager3 = EquityShareOrderFragment.this.getCrossSellLaunchManager();
                EquityShareOrderFragment equityShareOrderFragment2 = EquityShareOrderFragment.this;
                EquityOrderSide side = equityShareOrderFragment2.getSide();
                StateFlow<EquityShareOrderViewState> stateFlow = EquityShareOrderFragment.this.getDuxo().getStateFlow();
                this.L$0 = crossSellLaunchManager3;
                this.L$1 = equityShareOrderFragment2;
                this.L$2 = side;
                this.label = 2;
                Object objFirst = FlowKt.first(stateFlow, this);
                if (objFirst != coroutine_suspended) {
                    equityShareOrderFragment = equityShareOrderFragment2;
                    crossSellLaunchManager = crossSellLaunchManager3;
                    equityOrderSide = side;
                    obj = objFirst;
                    CrossSellLaunchManager.initIacBottomSheetPolling$default(crossSellLaunchManager, equityShareOrderFragment, EquityOrderSides.getIacAlertSheetLocation(equityOrderSide, ((EquityShareOrderViewState) obj).getPositionEffect()), null, EquityShareOrderFragment.this.getInstrumentId(), null, null, null, null, null, 500, null);
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EquityShareOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onResume$8$1", m3645f = "EquityShareOrderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onResume$8$1, reason: invalid class name */
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

    private final void setState(final EquityShareOrderViewState state) throws Resources.NotFoundException {
        RdsTextButton rdsTextButton;
        View view;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        getReviewOrderBtn().setEnabled(state.getEquityOrderContext() != null);
        final EquityOrderContext equityOrderContext = state.getEquityOrderContext();
        if (equityOrderContext == null) {
            return;
        }
        TradeAccountSwitcherView accountSwitcherBtn = getFragmentBindings().accountSwitcherBtn;
        Intrinsics.checkNotNullExpressionValue(accountSwitcherBtn, "accountSwitcherBtn");
        accountSwitcherBtn.setVisibility(state.getShouldShowAccountSwitcher() ? 0 : 8);
        getFragmentBindings().marketSessionChangeAlert.bind(state.getSessionChangeAlertContent(), state.getLoggingEquityOrderContext(), new C296581(getDuxo()));
        this.orderCheckCallbacks = new EquityOrderChecksAlertFragment.Callbacks() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment.setState.2
            @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
            public boolean onActionClicked(ServerDrivenButton button) {
                Intrinsics.checkNotNullParameter(button, "button");
                EquityShareOrderFragment.this.performTypedAction(button.getTypedAction(), equityOrderContext.getAccountNumber(), equityOrderContext);
                EquityShareOrderFragment.this.getDuxo().logOrderCheckAction(button.getLoggingIdentifier());
                return true;
            }
        };
        final MergeEquityOrderBinding bindings = getBindings();
        updateFormStateWithViewState(state);
        if (!state.getReviewing() && !bindings.shareQuantityEdt.isFocused() && (view = getView()) != null) {
            view.post(new Runnable() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$3$1
                @Override // java.lang.Runnable
                public final void run() {
                    bindings.shareQuantityEdt.requestFocus();
                }
            });
        }
        RhTextView orderPriceLabelTxt = bindings.orderPriceLabelTxt;
        Intrinsics.checkNotNullExpressionValue(orderPriceLabelTxt, "orderPriceLabelTxt");
        OnClickListeners.onClick(orderPriceLabelTxt, new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityShareOrderFragment.setState$lambda$22$lambda$17(this.f$0, state);
            }
        });
        bindings.orderCreateTitleTxt.setText(state.getTitle(resources));
        RhTextView orderCreateDescriptionTxt = bindings.orderCreateDescriptionTxt;
        Intrinsics.checkNotNullExpressionValue(orderCreateDescriptionTxt, "orderCreateDescriptionTxt");
        StringResource description = state.getDescription();
        CharSequence text = null;
        TextViewsKt.setVisibilityText(orderCreateDescriptionTxt, description != null ? description.getText(resources) : null);
        LinearLayout priceGroup = bindings.priceGroup;
        Intrinsics.checkNotNullExpressionValue(priceGroup, "priceGroup");
        priceGroup.setVisibility(state.getShouldShowPriceGroup() ? 0 : 8);
        RhTextView orderCreateExecutionTxt = bindings.orderCreateExecutionTxt;
        Intrinsics.checkNotNullExpressionValue(orderCreateExecutionTxt, "orderCreateExecutionTxt");
        StringResource orderExecutionLabel = state.getOrderExecutionLabel();
        TextViewsKt.setVisibilityText(orderCreateExecutionTxt, orderExecutionLabel != null ? orderExecutionLabel.getText(resources) : null);
        bindings.priceTxt.setText(state.getGetPriceText());
        RhTextView orderTimeInForceLabelTxt = bindings.orderTimeInForceLabelTxt;
        Intrinsics.checkNotNullExpressionValue(orderTimeInForceLabelTxt, "orderTimeInForceLabelTxt");
        StringResource timeInForceStringResource = state.getTimeInForceStringResource();
        TextViewsKt.setVisibilityText(orderTimeInForceLabelTxt, timeInForceStringResource != null ? timeInForceStringResource.getText(resources) : null);
        bindings.sharesLabelTxt.setText(getString(C29365R.string.order_create_shares_label));
        if (state.isTrailingStopOrder()) {
            RdsTextButton editOrderTextButton = bindings.editOrderTextButton;
            Intrinsics.checkNotNullExpressionValue(editOrderTextButton, "editOrderTextButton");
            editOrderTextButton.setVisibility(8);
            rdsTextButton = bindings.editTrailOrderTextButton;
        } else {
            RdsTextButton editTrailOrderTextButton = bindings.editTrailOrderTextButton;
            Intrinsics.checkNotNullExpressionValue(editTrailOrderTextButton, "editTrailOrderTextButton");
            editTrailOrderTextButton.setVisibility(8);
            rdsTextButton = bindings.editOrderTextButton;
        }
        Intrinsics.checkNotNull(rdsTextButton);
        rdsTextButton.setVisibility(state.isEditOrderButtonVisible() ? 0 : 8);
        OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityShareOrderFragment.setState$lambda$22$lambda$18(this.f$0, state);
            }
        });
        updateTrailingPegGroup(state);
        LinearLayout estimatedCostGroup = bindings.estimatedCostGroup;
        Intrinsics.checkNotNullExpressionValue(estimatedCostGroup, "estimatedCostGroup");
        estimatedCostGroup.setVisibility(!state.getExpandableEstimatedCostRowVisible() ? 0 : 8);
        ExpandableEstimatedCostRowView expandableEstimatedCostRow = bindings.expandableEstimatedCostRow;
        Intrinsics.checkNotNullExpressionValue(expandableEstimatedCostRow, "expandableEstimatedCostRow");
        expandableEstimatedCostRow.setVisibility(state.getExpandableEstimatedCostRowVisible() ? 0 : 8);
        bindings.totalCostLabelTxt.setText(state.getTotalCostLabelText().getText(resources));
        RhTextView rhTextView = bindings.totalCostTxt;
        StringResource totalCost = state.getTotalCost();
        rhTextView.setText(totalCost != null ? totalCost.getText(resources) : null);
        bindings.expandableEstimatedCostRow.setState(state.getExpandableCostState());
        bindings.expandableEstimatedCostRow.setLoggingContext(state.getLoggingEquityOrderContext().getOrNull());
        CharSequence orderReviewText = state.getOrderReviewText(getMarkwon(), getLoadingDrawable(), new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityShareOrderFragment.setState$lambda$22$lambda$19(this.f$0, state);
            }
        });
        CrashReporter.INSTANCE.log("EquityShareOrder review text: " + ((Object) orderReviewText));
        bindings.orderReviewTxt.setText(orderReviewText);
        if (state.getShouldShowBackupWithholdingWarning()) {
            RhTextView totalCostSubtitleTxt = bindings.totalCostSubtitleTxt;
            Intrinsics.checkNotNullExpressionValue(totalCostSubtitleTxt, "totalCostSubtitleTxt");
            TextViewsKt.setVisibilityText(totalCostSubtitleTxt, state.getWithholdingWarningString().getText(resources));
            RhTextView totalCostSubtitleTxt2 = bindings.totalCostSubtitleTxt;
            Intrinsics.checkNotNullExpressionValue(totalCostSubtitleTxt2, "totalCostSubtitleTxt");
            TextViewsKt.setDrawableEnd(totalCostSubtitleTxt2, AppCompatResources.getDrawable(requireContext(), C20690R.drawable.ic_rds_question_16dp));
            RhTextView totalCostSubtitleTxt3 = bindings.totalCostSubtitleTxt;
            Intrinsics.checkNotNullExpressionValue(totalCostSubtitleTxt3, "totalCostSubtitleTxt");
            OnClickListeners.onClick(totalCostSubtitleTxt3, new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityShareOrderFragment.setState$lambda$22$lambda$20(this.f$0);
                }
            });
        } else {
            RhTextView totalCostSubtitleTxt4 = bindings.totalCostSubtitleTxt;
            Intrinsics.checkNotNullExpressionValue(totalCostSubtitleTxt4, "totalCostSubtitleTxt");
            totalCostSubtitleTxt4.setVisibility(8);
        }
        LinearLayout backupWithholdingGroup = bindings.backupWithholdingGroup;
        Intrinsics.checkNotNullExpressionValue(backupWithholdingGroup, "backupWithholdingGroup");
        backupWithholdingGroup.setVisibility(state.getShouldShowBackupWithholdingEstimate() ? 0 : 8);
        bindings.backupWithholdingAmountTxt.setText(state.getBackupWithholdingEstimateAmount());
        RhTextView backupWithholdingLabelTxt = bindings.backupWithholdingLabelTxt;
        Intrinsics.checkNotNullExpressionValue(backupWithholdingLabelTxt, "backupWithholdingLabelTxt");
        OnClickListeners.onClick(backupWithholdingLabelTxt, new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityShareOrderFragment.setState$lambda$22$lambda$21(this.f$0);
            }
        });
        RhTextView rhTextView2 = bindings.orderPriceLabelTxt;
        StringResource priceLabelText = state.getPriceLabelText();
        rhTextView2.setText(priceLabelText != null ? priceLabelText.getText(resources) : null);
        setLoading(state.getLoading());
        updateShareQuantityEdt(equityOrderContext);
        updateNumpad(equityOrderContext);
        if (state.getShowTaxLots() && !state.getShowTaxLotsM1()) {
            LinearLayout priceGroup2 = bindings.priceGroup;
            Intrinsics.checkNotNullExpressionValue(priceGroup2, "priceGroup");
            ViewsKt.setMarginTop(priceGroup2, (int) TypedValue.applyDimension(1, 32.0f, getResources().getDisplayMetrics()));
            bindings.shareQuantityEdtBottomDivider.setVisibility(8);
            bindings.shareQuantityContainer.setVisibility(8);
            bindings.taxLotsNumberOfSharesValue.setText(String.valueOf(bindings.shareQuantityEdt.getText()));
            bindings.taxLotsNumberOfSharesGroup.setVisibility(0);
            if (state.getConfiguration().getOrderConfiguration() == Order.Configuration.LIMIT) {
                bindings.orderTimeInForceLabelTxt.setVisibility(8);
                bindings.orderCreateExecutionTxt.setVisibility(8);
                RhTextView rhTextView3 = bindings.tradeSettingsTrailingTitle;
                StringResource orderExecutionLabel2 = state.getOrderExecutionLabel();
                rhTextView3.setText(orderExecutionLabel2 != null ? orderExecutionLabel2.getText(resources) : null);
                RhTextView rhTextView4 = bindings.tradeSettingsTrailingSubtitle;
                StringResource timeInForceStringResource2 = state.getTimeInForceStringResource();
                rhTextView4.setText(timeInForceStringResource2 != null ? timeInForceStringResource2.getText(resources) : null);
                bindings.tradeSettingsGroup.setVisibility(0);
            }
            LinearLayout taxLotGroup = bindings.taxLotGroup;
            Intrinsics.checkNotNullExpressionValue(taxLotGroup, "taxLotGroup");
            taxLotGroup.setVisibility(0);
            RhTextView taxLotGainLossTxt = bindings.taxLotGainLossTxt;
            Intrinsics.checkNotNullExpressionValue(taxLotGainLossTxt, "taxLotGainLossTxt");
            StringResource taxLotsGainLossStringResource = state.getTaxLotsGainLossStringResource();
            TextViewsKt.setVisibilityText(taxLotGainLossTxt, taxLotsGainLossStringResource != null ? taxLotsGainLossStringResource.getText(resources) : null);
            RhTextView taxLotTermTxt = bindings.taxLotTermTxt;
            Intrinsics.checkNotNullExpressionValue(taxLotTermTxt, "taxLotTermTxt");
            StringResource taxLotsTermStringResource = state.getTaxLotsTermStringResource();
            TextViewsKt.setVisibilityText(taxLotTermTxt, taxLotsTermStringResource != null ? taxLotsTermStringResource.getText(resources) : null);
        } else if (state.getShowTaxLotsM1()) {
            LinearLayout priceGroup3 = bindings.priceGroup;
            Intrinsics.checkNotNullExpressionValue(priceGroup3, "priceGroup");
            ViewsKt.setMarginTop(priceGroup3, (int) TypedValue.applyDimension(1, 32.0f, getResources().getDisplayMetrics()));
            bindings.shareQuantityEdtBottomDivider.setVisibility(8);
            bindings.shareQuantityContainer.setVisibility(8);
            if (state.getConfiguration().getOrderConfiguration() == Order.Configuration.LIMIT) {
                bindings.orderTimeInForceLabelTxt.setVisibility(8);
                bindings.orderCreateExecutionTxt.setVisibility(8);
                RhTextView rhTextView5 = bindings.tradeSettingsTrailingTitle;
                StringResource orderExecutionLabel3 = state.getOrderExecutionLabel();
                rhTextView5.setText(orderExecutionLabel3 != null ? orderExecutionLabel3.getText(resources) : null);
                RhTextView rhTextView6 = bindings.tradeSettingsTrailingSubtitle;
                StringResource timeInForceStringResource3 = state.getTimeInForceStringResource();
                rhTextView6.setText(timeInForceStringResource3 != null ? timeInForceStringResource3.getText(resources) : null);
                bindings.tradeSettingsGroup.setVisibility(0);
            }
            LinearLayout taxLotsM1Group = bindings.taxLotsM1Group;
            Intrinsics.checkNotNullExpressionValue(taxLotsM1Group, "taxLotsM1Group");
            taxLotsM1Group.setVisibility(0);
            LinearLayout taxLotGroup2 = bindings.taxLotGroup;
            Intrinsics.checkNotNullExpressionValue(taxLotGroup2, "taxLotGroup");
            taxLotGroup2.setVisibility(8);
            LinearLayout taxLotsNumberOfSharesGroup = bindings.taxLotsNumberOfSharesGroup;
            Intrinsics.checkNotNullExpressionValue(taxLotsNumberOfSharesGroup, "taxLotsNumberOfSharesGroup");
            taxLotsNumberOfSharesGroup.setVisibility(8);
            RhTextView taxLotM1LabelSecondary = bindings.taxLotM1LabelSecondary;
            Intrinsics.checkNotNullExpressionValue(taxLotM1LabelSecondary, "taxLotM1LabelSecondary");
            StringResource taxLotsM1SecondaryStringResource = state.getTaxLotsM1SecondaryStringResource();
            TextViewsKt.setVisibilityText(taxLotM1LabelSecondary, taxLotsM1SecondaryStringResource != null ? taxLotsM1SecondaryStringResource.getText(resources) : null);
            RhTextView taxLotsM1Value = bindings.taxLotsM1Value;
            Intrinsics.checkNotNullExpressionValue(taxLotsM1Value, "taxLotsM1Value");
            TextViewsKt.setVisibilityText(taxLotsM1Value, String.valueOf(bindings.shareQuantityEdt.getText()));
        } else {
            LinearLayout taxLotGroup3 = bindings.taxLotGroup;
            Intrinsics.checkNotNullExpressionValue(taxLotGroup3, "taxLotGroup");
            taxLotGroup3.setVisibility(8);
            LinearLayout taxLotsM1Group2 = bindings.taxLotsM1Group;
            Intrinsics.checkNotNullExpressionValue(taxLotsM1Group2, "taxLotsM1Group");
            taxLotsM1Group2.setVisibility(8);
        }
        FragmentEquityOrderBinding fragmentBindings = getFragmentBindings();
        RdsTextButton sellAllBtn = fragmentBindings.sellAllBtn;
        Intrinsics.checkNotNullExpressionValue(sellAllBtn, "sellAllBtn");
        StringResource sellAllButtonLabelStringResource = state.getSellAllButtonLabelStringResource();
        if (sellAllButtonLabelStringResource != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text = sellAllButtonLabelStringResource.getText(resources2);
        }
        TextViewsKt.setVisibilityText(sellAllBtn, text);
        RdsTextButton sellAllBtn2 = fragmentBindings.sellAllBtn;
        Intrinsics.checkNotNullExpressionValue(sellAllBtn2, "sellAllBtn");
        OnClickListeners.onClick(sellAllBtn2, new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityShareOrderFragment.setState$lambda$25$lambda$23(this.f$0);
            }
        });
        InstrumentAccountSwitcherState accountSwitcherState = state.getAccountSwitcherState();
        if (accountSwitcherState != null) {
            fragmentBindings.accountSwitcherBtn.bind(accountSwitcherState, this, false);
        }
        if (state.getShowTwentyFourHourMarketButton()) {
            RdsButton reviewBtn = getFragmentBindings().reviewBtn;
            Intrinsics.checkNotNullExpressionValue(reviewBtn, "reviewBtn");
            reviewBtn.setVisibility(8);
            ComposeView twentyFourHourMarketReviewButtonContainer = getFragmentBindings().twentyFourHourMarketReviewButtonContainer;
            Intrinsics.checkNotNullExpressionValue(twentyFourHourMarketReviewButtonContainer, "twentyFourHourMarketReviewButtonContainer");
            twentyFourHourMarketReviewButtonContainer.setVisibility(0);
            ComposeView composeView = getFragmentBindings().twentyFourHourMarketReviewButtonContainer;
            Intrinsics.checkNotNull(composeView);
            composeView.setVisibility(0);
            composeView.setContent(ComposableLambda3.composableLambdaInstance(-543383046, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$5$1

                /* compiled from: EquityShareOrderFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$5$1$1 */
                static final class C296601 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ EquityShareOrderViewState $state;
                    final /* synthetic */ EquityShareOrderFragment this$0;

                    C296601(EquityShareOrderViewState equityShareOrderViewState, EquityShareOrderFragment equityShareOrderFragment) {
                        this.$state = equityShareOrderViewState;
                        this.this$0 = equityShareOrderFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(601961352, i, -1, "com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment.setState.<anonymous>.<anonymous>.<anonymous> (EquityShareOrderFragment.kt:679)");
                        }
                        boolean zAreEqual = Intrinsics.areEqual(this.$state.getValidationState(), ValidationState.Validating.INSTANCE);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$state);
                        final EquityShareOrderFragment equityShareOrderFragment = this.this$0;
                        final EquityShareOrderViewState equityShareOrderViewState = this.$state;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0052: CONSTRUCTOR (r3v1 'objRememberedValue' java.lang.Object) = 
                                  (r0v5 'equityShareOrderFragment' com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment A[DONT_INLINE])
                                  (r2v0 'equityShareOrderViewState' com.robinhood.android.trade.equity.ui.share.EquityShareOrderViewState A[DONT_INLINE])
                                 A[MD:(com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment, com.robinhood.android.trade.equity.ui.share.EquityShareOrderViewState):void (m)] (LINE:682) call: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$5$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment, com.robinhood.android.trade.equity.ui.share.EquityShareOrderViewState):void type: CONSTRUCTOR in method: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$5$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$5$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r10 & 3
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r9.getSkipping()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r9.skipToGroupEnd()
                                return
                            L10:
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment.setState.<anonymous>.<anonymous>.<anonymous> (EquityShareOrderFragment.kt:679)"
                                r2 = 601961352(0x23e13388, float:2.4416373E-17)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r10, r0, r1)
                            L1f:
                                com.robinhood.android.trade.equity.ui.share.EquityShareOrderViewState r10 = r8.$state
                                com.robinhood.android.equity.ordercheck.ValidationState r10 = r10.getValidationState()
                                com.robinhood.android.equity.ordercheck.ValidationState$Validating r0 = com.robinhood.android.equity.ordercheck.ValidationState.Validating.INSTANCE
                                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
                                r10 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                r9.startReplaceGroup(r10)
                                com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment r10 = r8.this$0
                                boolean r10 = r9.changedInstance(r10)
                                com.robinhood.android.trade.equity.ui.share.EquityShareOrderViewState r0 = r8.$state
                                boolean r0 = r9.changedInstance(r0)
                                r10 = r10 | r0
                                com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment r0 = r8.this$0
                                com.robinhood.android.trade.equity.ui.share.EquityShareOrderViewState r2 = r8.$state
                                java.lang.Object r3 = r9.rememberedValue()
                                if (r10 != 0) goto L50
                                androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r10 = r10.getEmpty()
                                if (r3 != r10) goto L58
                            L50:
                                com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$5$1$1$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$5$1$1$$ExternalSyntheticLambda0
                                r3.<init>(r0, r2)
                                r9.updateRememberedValue(r3)
                            L58:
                                r2 = r3
                                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                r9.endReplaceGroup()
                                r10 = 5004770(0x4c5de2, float:7.013177E-39)
                                r9.startReplaceGroup(r10)
                                com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment r10 = r8.this$0
                                boolean r10 = r9.changedInstance(r10)
                                com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment r0 = r8.this$0
                                java.lang.Object r3 = r9.rememberedValue()
                                if (r10 != 0) goto L7a
                                androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r10 = r10.getEmpty()
                                if (r3 != r10) goto L82
                            L7a:
                                com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$5$1$1$$ExternalSyntheticLambda1 r3 = new com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$5$1$1$$ExternalSyntheticLambda1
                                r3.<init>(r0)
                                r9.updateRememberedValue(r3)
                            L82:
                                kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                                r9.endReplaceGroup()
                                r6 = 0
                                r7 = 8
                                r4 = 0
                                r5 = r9
                                com.robinhood.android.equityadvancedorder.composables.TwentyFourHourMarketReviewComposable.TwentyFourHourMarketReviewComposable(r1, r2, r3, r4, r5, r6, r7)
                                boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r9 == 0) goto L98
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            L98:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderFragment7.C296601.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EquityShareOrderFragment equityShareOrderFragment, EquityShareOrderViewState equityShareOrderViewState) {
                            EquityShareOrderFragment equityShareOrderFragment2;
                            if (!equityShareOrderFragment.twentyFourHourMarketDialogVisible && !equityShareOrderFragment.getReviewing()) {
                                String accountNumber = equityShareOrderViewState.getAccountNumber();
                                if (accountNumber == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                Integer numM2498xe1ff29cc = equityShareOrderViewState.m2498xe1ff29cc();
                                MarketHours nextEffectiveMarketHours = equityShareOrderViewState.getNextEffectiveMarketHours();
                                if (equityShareOrderViewState.getShowTwentyFourHourMarketDialog()) {
                                    equityShareOrderFragment2 = equityShareOrderFragment;
                                    equityShareOrderFragment2.showTwentyFourHourMarketDialog(accountNumber, numM2498xe1ff29cc, nextEffectiveMarketHours);
                                } else {
                                    equityShareOrderFragment2 = equityShareOrderFragment;
                                    EquityShareOrderDuxo.startLimitOrderFlow$default(equityShareOrderFragment2.getDuxo(), accountNumber, numM2498xe1ff29cc != null ? BigDecimals7.toBigDecimal(numM2498xe1ff29cc) : null, null, OrderMarketHours.ALL_DAY_HOURS, null, 20, null);
                                }
                                EventLogger.DefaultImpls.logTap$default(equityShareOrderFragment2.getEventLogger(), UserInteractionEventData.Action.CONVERT_TO_LIMIT_ORDER, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "TWENTY_FOUR_HOUR_MARKET_ORDER_BUTTON", null, 4, null), null, equityShareOrderViewState.getLoggingEquityOrderContext().getOrNull(), false, 40, null);
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(EquityShareOrderFragment equityShareOrderFragment) {
                            equityShareOrderFragment.validateAndReviewOrder();
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-543383046, i, -1, "com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment.setState.<anonymous>.<anonymous> (EquityShareOrderFragment.kt:678)");
                        }
                        BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager()), null, ComposableLambda3.rememberComposableLambda(601961352, true, new C296601(state, this.this$0), composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                Intrinsics.checkNotNull(composeView);
            } else {
                RdsButton reviewBtn2 = getFragmentBindings().reviewBtn;
                Intrinsics.checkNotNullExpressionValue(reviewBtn2, "reviewBtn");
                reviewBtn2.setVisibility(0);
                getFragmentBindings().reviewBtn.setLoading(state.getValidationState() instanceof ValidationState.Validating);
                ComposeView twentyFourHourMarketReviewButtonContainer2 = getFragmentBindings().twentyFourHourMarketReviewButtonContainer;
                Intrinsics.checkNotNullExpressionValue(twentyFourHourMarketReviewButtonContainer2, "twentyFourHourMarketReviewButtonContainer");
                twentyFourHourMarketReviewButtonContainer2.setVisibility(8);
            }
            ShimmerLoadingView equityOrderLoadingView = getFragmentBindings().equityOrderLoadingView;
            Intrinsics.checkNotNullExpressionValue(equityOrderLoadingView, "equityOrderLoadingView");
            equityOrderLoadingView.setVisibility(state.isCancelPendingCryptoOrdersLoading() ? 0 : 8);
        }

        /* compiled from: EquityShareOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$setState$1 */
        /* synthetic */ class C296581 extends FunctionReferenceImpl implements Function0<Unit> {
            C296581(Object obj) {
                super(0, obj, EquityShareOrderDuxo.class, "dismissTradingSessionChangeAlert", "dismissTradingSessionChangeAlert()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((EquityShareOrderDuxo) this.receiver).dismissTradingSessionChangeAlert();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setState$lambda$22$lambda$17(EquityShareOrderFragment equityShareOrderFragment, EquityShareOrderViewState equityShareOrderViewState) {
            equityShareOrderFragment.showMarketDisclosureDialog(equityShareOrderViewState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setState$lambda$22$lambda$18(EquityShareOrderFragment equityShareOrderFragment, EquityShareOrderViewState equityShareOrderViewState) {
            if (equityShareOrderFragment.isPreIpo()) {
                equityShareOrderFragment.getCallbacks().showPreIpoFlow();
            } else if (equityShareOrderViewState.getConfiguration() instanceof Buildable) {
                equityShareOrderFragment.getCallbacks().startOrderBuilder((Buildable) equityShareOrderViewState.getConfiguration());
            } else {
                equityShareOrderFragment.getCallbacks().startOrderSelectMenu(equityShareOrderViewState.getConfiguration().getAccountNumber(), equityShareOrderViewState.getConfiguration().getShareQuantity());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setState$lambda$22$lambda$19(EquityShareOrderFragment equityShareOrderFragment, EquityShareOrderViewState equityShareOrderViewState) {
            NbboAnalytics.INSTANCE.logNbboRefreshTap(equityShareOrderFragment.getEventLogger(), equityShareOrderViewState.getNbboSummary());
            equityShareOrderFragment.getDuxo().refreshNbbo();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setState$lambda$22$lambda$20(EquityShareOrderFragment equityShareOrderFragment) {
            BackupWithholdingWarningBottomSheetFragment backupWithholdingWarningBottomSheetFragment = new BackupWithholdingWarningBottomSheetFragment();
            FragmentManager childFragmentManager = equityShareOrderFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            backupWithholdingWarningBottomSheetFragment.show(childFragmentManager, "tax_warning");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setState$lambda$22$lambda$21(EquityShareOrderFragment equityShareOrderFragment) {
            BackupWithholdingWarningBottomSheetFragment backupWithholdingWarningBottomSheetFragment = new BackupWithholdingWarningBottomSheetFragment();
            FragmentManager childFragmentManager = equityShareOrderFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            backupWithholdingWarningBottomSheetFragment.show(childFragmentManager, "tax_warning");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setState$lambda$25$lambda$23(EquityShareOrderFragment equityShareOrderFragment) {
            equityShareOrderFragment.getDuxo().sellAll(true);
            return Unit.INSTANCE;
        }

        private final void updateShareQuantityEdt(EquityOrderContext equityOrderContext) {
            boolean zCanEnterFractionalQuantity = equityOrderContext.canEnterFractionalQuantity();
            RhEditText rhEditText = getBindings().shareQuantityEdt;
            if (zCanEnterFractionalQuantity) {
                rhEditText.setInputType(8194);
                rhEditText.addTextChangedListener(getShareQuantityTextWatcher());
            } else {
                rhEditText.setInputType(2);
                rhEditText.removeTextChangedListener(getShareQuantityTextWatcher());
            }
        }

        private final void updateNumpad(EquityOrderContext equityOrderContext) {
            setDelimiterEnabled(equityOrderContext.canEnterFractionalQuantity());
        }

        private final void updateTrailingPegGroup(EquityShareOrderViewState state) throws Resources.NotFoundException {
            CharSequence text;
            MergeEquityOrderBinding bindings = getBindings();
            EquityOrderContext equityOrderContext = state.getEquityOrderContext();
            CharSequence text2 = null;
            OrderTrailingPeg trailingPeg = equityOrderContext != null ? equityOrderContext.getTrailingPeg() : null;
            if (trailingPeg == null) {
                LinearLayout trailingPegGroup = bindings.trailingPegGroup;
                Intrinsics.checkNotNullExpressionValue(trailingPegGroup, "trailingPegGroup");
                trailingPegGroup.setVisibility(8);
                return;
            }
            LinearLayout trailingPegGroup2 = bindings.trailingPegGroup;
            Intrinsics.checkNotNullExpressionValue(trailingPegGroup2, "trailingPegGroup");
            trailingPegGroup2.setVisibility(0);
            RhTextView orderTrailingPegLabelTxt = bindings.orderTrailingPegLabelTxt;
            Intrinsics.checkNotNullExpressionValue(orderTrailingPegLabelTxt, "orderTrailingPegLabelTxt");
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            TextViewsKt.setVisibilityText(orderTrailingPegLabelTxt, OrderTrailingPegs.getLabelString(trailingPeg, resources));
            RhTextView trailingPegStopPriceLabelTxt = bindings.trailingPegStopPriceLabelTxt;
            Intrinsics.checkNotNullExpressionValue(trailingPegStopPriceLabelTxt, "trailingPegStopPriceLabelTxt");
            StringResource trailingPegStopPrice = state.getTrailingPegStopPrice();
            if (trailingPegStopPrice != null) {
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                text = trailingPegStopPrice.getText(resources2);
            } else {
                text = null;
            }
            TextViewsKt.setVisibilityText(trailingPegStopPriceLabelTxt, text);
            RhTextView trailingPegStopPriceTimeInForceTxt = bindings.trailingPegStopPriceTimeInForceTxt;
            Intrinsics.checkNotNullExpressionValue(trailingPegStopPriceTimeInForceTxt, "trailingPegStopPriceTimeInForceTxt");
            StringResource trailingPegTimeInForceStringResource = state.getTrailingPegTimeInForceStringResource();
            if (trailingPegTimeInForceStringResource != null) {
                Resources resources3 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                text2 = trailingPegTimeInForceStringResource.getText(resources3);
            }
            TextViewsKt.setVisibilityText(trailingPegStopPriceTimeInForceTxt, text2);
            RhTextView trailingPegTxt = bindings.trailingPegTxt;
            Intrinsics.checkNotNullExpressionValue(trailingPegTxt, "trailingPegTxt");
            TextViewsKt.setVisibilityText(trailingPegTxt, OrderTrailingPegs.getDisplayString(trailingPeg));
        }

        private final void updateClickableLabels(final EquityShareOrderViewState state) {
            MergeEquityOrderBinding bindings = getBindings();
            RhTextView rhTextView = bindings.orderPriceLabelTxt;
            boolean showOrderPriceDrawable = state.getShowOrderPriceDrawable();
            rhTextView.setClickable(showOrderPriceDrawable);
            rhTextView.setFocusable(showOrderPriceDrawable);
            Intrinsics.checkNotNull(rhTextView);
            TextViewsKt.setDrawables$default((TextView) rhTextView, (Drawable) null, (Drawable) null, showOrderPriceDrawable ? getQuestionMarkDrawable() : null, (Drawable) null, true, 11, (Object) null);
            RhTextView backupWithholdingLabelTxt = bindings.backupWithholdingLabelTxt;
            Intrinsics.checkNotNullExpressionValue(backupWithholdingLabelTxt, "backupWithholdingLabelTxt");
            TextViewsKt.setDrawables$default((TextView) backupWithholdingLabelTxt, (Drawable) null, (Drawable) null, getQuestionMarkDrawable(), (Drawable) null, true, 11, (Object) null);
            if (state.getShouldSetOrderReviewDrawable()) {
                RhTextView orderReviewLabelTxt = bindings.orderReviewLabelTxt;
                Intrinsics.checkNotNullExpressionValue(orderReviewLabelTxt, "orderReviewLabelTxt");
                TextViewsKt.setDrawables$default((TextView) orderReviewLabelTxt, (Drawable) null, (Drawable) null, getQuestionMarkDrawable(), (Drawable) null, true, 11, (Object) null);
                RhTextView orderReviewLabelTxt2 = bindings.orderReviewLabelTxt;
                Intrinsics.checkNotNullExpressionValue(orderReviewLabelTxt2, "orderReviewLabelTxt");
                OnClickListeners.onClick(orderReviewLabelTxt2, new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityShareOrderFragment.updateClickableLabels$lambda$31$lambda$30(this.f$0, state);
                    }
                });
                return;
            }
            RhTextView orderReviewLabelTxt3 = bindings.orderReviewLabelTxt;
            Intrinsics.checkNotNullExpressionValue(orderReviewLabelTxt3, "orderReviewLabelTxt");
            TextViewsKt.setDrawables$default((TextView) orderReviewLabelTxt3, (Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null, false, 27, (Object) null);
            RhTextView orderReviewLabelTxt4 = bindings.orderReviewLabelTxt;
            Intrinsics.checkNotNullExpressionValue(orderReviewLabelTxt4, "orderReviewLabelTxt");
            OnClickListeners.onClick(orderReviewLabelTxt4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit updateClickableLabels$lambda$31$lambda$30(EquityShareOrderFragment equityShareOrderFragment, EquityShareOrderViewState equityShareOrderViewState) {
            NbboAnalytics.INSTANCE.logNbboIconTap(equityShareOrderFragment.getEventLogger(), equityShareOrderViewState.getNbboSummary());
            Navigator navigator = equityShareOrderFragment.getNavigator();
            Context contextRequireContext = equityShareOrderFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            List listListOf = CollectionsKt.listOf(equityShareOrderFragment.getInstrumentId());
            UUID instrumentId = equityShareOrderFragment.getInstrumentId();
            boolean zIsPresetPercentLimitOrder = equityShareOrderViewState.isPresetPercentLimitOrder();
            ShareBasedOrderConfiguration configuration = equityShareOrderViewState.getConfiguration();
            DirectOrder5 directOrder5 = configuration instanceof DirectOrder5 ? (DirectOrder5) configuration : null;
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.OrderSummaryExplanation(listListOf, zIsPresetPercentLimitOrder, directOrder5 != null ? directOrder5.getPresetPercentLimit() : null, instrumentId), false, false, false, false, null, false, null, null, 1020, null);
            return Unit.INSTANCE;
        }

        private final void showMarketDisclosureDialog(EquityShareOrderViewState state) {
            UUID id;
            EquityOrderContext.RequestContext requestContext;
            EquityOrderContext equityOrderContext = state.getEquityOrderContext();
            Quote quote = (equityOrderContext == null || (requestContext = equityOrderContext.getRequestContext()) == null) ? null : requestContext.getQuote();
            EquityOrderContext equityOrderContext2 = state.getEquityOrderContext();
            Instrument instrument = equityOrderContext2 != null ? equityOrderContext2.getInstrument() : null;
            if (quote == null || (id = quote.getInstrumentId()) == null) {
                if (instrument == null) {
                    return;
                } else {
                    id = instrument.getId();
                }
            }
            MarketDataDisclosureDialog marketDataDisclosureDialog = (MarketDataDisclosureDialog) MarketDataDisclosureDialog.INSTANCE.newInstance((Parcelable) new MarketDataDisclosureDialog.Args(id, quote, getSide(), state.getConfiguration().getOrderConfiguration()));
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            marketDataDisclosureDialog.show(parentFragmentManager, "market-data-disclosures");
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment
        public void validateAndReviewOrder() {
            EquityShareOrderDuxo.validateAndReviewOrder$default(getDuxo(), false, 1, null);
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment
        public void onFormStateUpdated() throws Resources.NotFoundException {
            boolean reviewing = getReviewing();
            MergeEquityOrderBinding bindings = getBindings();
            updateFormStateWithViewState(getDuxo().getStateFlow().getValue());
            bindings.shareQuantityEdt.setEnabled(!reviewing);
            RhTextView orderReviewTxt = bindings.orderReviewTxt;
            Intrinsics.checkNotNullExpressionValue(orderReviewTxt, "orderReviewTxt");
            orderReviewTxt.setVisibility(reviewing ? 0 : 8);
            RhTextView orderReviewLabelTxt = bindings.orderReviewLabelTxt;
            Intrinsics.checkNotNullExpressionValue(orderReviewLabelTxt, "orderReviewLabelTxt");
            orderReviewLabelTxt.setVisibility(reviewing ? 0 : 8);
            if (!reviewing) {
                RhTextView collateralTxt = bindings.collateralTxt;
                Intrinsics.checkNotNullExpressionValue(collateralTxt, "collateralTxt");
                collateralTxt.setVisibility(8);
                RhTextView collateralLabelTxt = bindings.collateralLabelTxt;
                Intrinsics.checkNotNullExpressionValue(collateralLabelTxt, "collateralLabelTxt");
                collateralLabelTxt.setVisibility(8);
                LinearLayout collateralGroup = bindings.collateralGroup;
                Intrinsics.checkNotNullExpressionValue(collateralGroup, "collateralGroup");
                collateralGroup.setVisibility(8);
                LinearLayout accountGroup = bindings.accountGroup;
                Intrinsics.checkNotNullExpressionValue(accountGroup, "accountGroup");
                accountGroup.setVisibility(8);
            }
            this.twentyFourHourMarketDialogVisible = false;
            super.onFormStateUpdated();
            if (getAutoValidate() && reviewing) {
                getActivityBackgroundCallbacks().setActivityBackground(true);
            }
            EquityOrderTypeTooltipView orderTypeOnboardingTooltip = getFragmentBindings().orderTypeOnboardingTooltip;
            Intrinsics.checkNotNullExpressionValue(orderTypeOnboardingTooltip, "orderTypeOnboardingTooltip");
            orderTypeOnboardingTooltip.setVisibility((reviewing || isPreIpo()) ? false : true ? 0 : 8);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void updateFormStateWithViewState(EquityShareOrderViewState state) throws Resources.NotFoundException {
            updateClickableLabels(state);
            MergeEquityOrderBinding bindings = getBindings();
            if (getReviewing()) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                CharSequence collateralText = state.getCollateralText(contextRequireContext);
                boolean zIsEmpty = TextUtils.isEmpty(collateralText);
                RhTextView collateralTxt = bindings.collateralTxt;
                Intrinsics.checkNotNullExpressionValue(collateralTxt, "collateralTxt");
                TextViewsKt.setVisibilityText(collateralTxt, collateralText);
                RhTextView collateralLabelTxt = bindings.collateralLabelTxt;
                Intrinsics.checkNotNullExpressionValue(collateralLabelTxt, "collateralLabelTxt");
                collateralLabelTxt.setVisibility(!zIsEmpty ? 0 : 8);
                LinearLayout collateralGroup = bindings.collateralGroup;
                Intrinsics.checkNotNullExpressionValue(collateralGroup, "collateralGroup");
                collateralGroup.setVisibility(!zIsEmpty ? 0 : 8);
                StringResource accountNameTitle = state.getAccountNameTitle();
                if (accountNameTitle != null) {
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    CharSequence text = accountNameTitle.getText(resources);
                    if (text != null) {
                        bindings.accountTxt.setText(text);
                        RhTextView accountTxt = bindings.accountTxt;
                        Intrinsics.checkNotNullExpressionValue(accountTxt, "accountTxt");
                        accountTxt.setVisibility(0);
                    } else {
                        RhTextView accountTxt2 = bindings.accountTxt;
                        Intrinsics.checkNotNullExpressionValue(accountTxt2, "accountTxt");
                        accountTxt2.setVisibility(8);
                    }
                    StringResource accountNameSubtitle = state.getAccountNameSubtitle();
                    if (accountNameSubtitle != null) {
                        RhTextView rhTextView = bindings.accountTxtSubtitle;
                        Resources resources2 = getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        rhTextView.setText(accountNameSubtitle.getText(resources2));
                        RhTextView accountTxtSubtitle = bindings.accountTxtSubtitle;
                        Intrinsics.checkNotNullExpressionValue(accountTxtSubtitle, "accountTxtSubtitle");
                        accountTxtSubtitle.setVisibility(0);
                    } else {
                        RhTextView accountTxtSubtitle2 = bindings.accountTxtSubtitle;
                        Intrinsics.checkNotNullExpressionValue(accountTxtSubtitle2, "accountTxtSubtitle");
                        accountTxtSubtitle2.setVisibility(8);
                    }
                    LinearLayout accountGroup = bindings.accountGroup;
                    Intrinsics.checkNotNullExpressionValue(accountGroup, "accountGroup");
                    RhTextView accountTxt3 = bindings.accountTxt;
                    Intrinsics.checkNotNullExpressionValue(accountTxt3, "accountTxt");
                    accountGroup.setVisibility(accountTxt3.getVisibility() == 0 ? 0 : 8);
                }
            }
            if (getReviewing()) {
                updateIsScrollable();
            }
        }

        private final void updateIsScrollable() {
            BlockableNestedScrollView blockableNestedScrollView = getFragmentBindings().contentScrollview;
            if (blockableNestedScrollView.getIsScrollable()) {
                if (blockableNestedScrollView.canScrollVertically(1) || blockableNestedScrollView.canScrollVertically(-1)) {
                    return;
                }
                blockableNestedScrollView.setScrollable(false);
                return;
            }
            blockableNestedScrollView.setScrollable(true);
            blockableNestedScrollView.setScrollable(blockableNestedScrollView.canScrollVertically(1) || blockableNestedScrollView.canScrollVertically(-1));
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment
        public ConstraintSet getConstraintsForState(DefaultOrderState formState) {
            ConstraintSet constraintSet;
            Intrinsics.checkNotNullParameter(formState, "formState");
            int i = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
            if (i == 1) {
                constraintSet = this.initialConstraints;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                constraintSet = this.reviewingConstraints;
            }
            if (getPrevalidated()) {
                return null;
            }
            return constraintSet;
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
        public boolean onBackPressed() {
            if (getPrevalidated()) {
                getActivityBackgroundCallbacks().setActivityBackground(false);
                if (getDuxo().onBackPressedMaybeEditOrder()) {
                    return true;
                }
                setFormState(DefaultOrderState.EDITING);
                return super.onBackPressed();
            }
            if (getReviewing()) {
                getDuxo().setReviewingState(false);
                return true;
            }
            return super.onBackPressed();
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment
        public void performSubmitOrder() {
            Observable map = asObservable(getDuxo().getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$performSubmitOrder$$inlined$mapNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(((EquityShareOrderViewState) it).getEquityOrderContext());
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C29646x88232399<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Single singleFirstOrError = ObservablesKt.filterIsPresent(map).firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
            LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleFirstOrError), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C296572(getDuxo()));
        }

        /* compiled from: EquityShareOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$performSubmitOrder$2 */
        /* synthetic */ class C296572 extends FunctionReferenceImpl implements Function1<EquityOrderContext, Unit> {
            C296572(Object obj) {
                super(1, obj, EquityShareOrderDuxo.class, "submit", "submit(Lcom/robinhood/android/equity/validation/EquityOrderContext;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EquityOrderContext equityOrderContext) {
                invoke2(equityOrderContext);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EquityOrderContext p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((EquityShareOrderDuxo) this.receiver).submit(p0);
            }
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
        public void onSwipeToSubmitAnimationStart(long duration) {
            getDuxo().logSwipeToSubmit();
            super.onSwipeToSubmitAnimationStart(duration);
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment
        public void onOrderSubmitted() {
            Observable map = asObservable(getDuxo().getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$onOrderSubmitted$$inlined$mapNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(((EquityShareOrderViewState) it).getEquityOrderContext());
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((EquityShareOrderFragment$onOrderSubmitted$$inlined$mapNotNull$1<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Single singleFirstOrError = ObservablesKt.filterIsPresent(map).firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
            LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleFirstOrError), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityShareOrderFragment.onOrderSubmitted$lambda$40(this.f$0, (EquityOrderContext) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onOrderSubmitted$lambda$40(EquityShareOrderFragment equityShareOrderFragment, EquityOrderContext equityOrderContext) {
            SubmitOrderService.Companion companion = SubmitOrderService.INSTANCE;
            Context contextRequireContext = equityShareOrderFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            companion.start(contextRequireContext, equityOrderContext.getSymbol(), equityOrderContext.getSide(), equityShareOrderFragment.getInstrumentId(), equityOrderContext.getAccountNumber(), equityShareOrderFragment.getCompletionUrl());
            return Unit.INSTANCE;
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
        public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
            if (id == C29365R.id.dialog_id_24_hour_market_shares) {
                String string2 = passthroughArgs != null ? passthroughArgs.getString("accountNumber") : null;
                if (string2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                EquityShareOrderDuxo.startLimitOrderFlow$default(getDuxo(), string2, passthroughArgs != null ? BigDecimals7.toBigDecimal(Integer.valueOf(passthroughArgs.getInt(ARG_SHARES))) : null, null, OrderMarketHours.ALL_DAY_HOURS, null, 20, null);
                this.twentyFourHourMarketDialogVisible = false;
                return true;
            }
            return super.onPositiveButtonClicked(id, passthroughArgs);
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
        public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
            if (id == C29365R.id.dialog_id_24_hour_market_shares) {
                validateAndReviewOrder();
                return true;
            }
            return super.onNegativeButtonClicked(id, passthroughArgs);
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void setLimitOrderConfiguration(String accountNumber, BigDecimal amount) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Timber.INSTANCE.mo3356i("converting to limit order from bp dialog", new Object[0]);
            EquityShareOrderDuxo.startLimitOrderFlow$default(getDuxo(), accountNumber, null, amount, null, OrderTimeInForce.GTC, 10, null);
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void editLimitOrder(EquityOrderContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ShareBasedOrderConfiguration orderConfiguration = getOrderConfiguration();
            if (orderConfiguration instanceof ShareStopLimit) {
                getCallbacks().startOrderBuilder((Buildable) orderConfiguration);
            } else {
                EquityShareOrderDuxo.startLimitOrderFlow$default(getDuxo(), context.getAccountNumber(), null, null, context.getMarketHours(), context.getTimeInForce(), 6, null);
            }
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void editStopOrder(EquityOrderContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ShareBasedOrderConfiguration orderConfiguration = getOrderConfiguration();
            if (orderConfiguration instanceof ShareStopLoss) {
                getCallbacks().startOrderBuilder((Buildable) orderConfiguration);
                return;
            }
            if (orderConfiguration instanceof ShareStopLimit) {
                getCallbacks().startOrderBuilder((Buildable) orderConfiguration);
                return;
            }
            Logger.INSTANCE.mo1681e(orderConfiguration.getClass().getSimpleName() + " is not a stop order", new Object[0]);
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
        public void convertToLimitOrder(String accountNumber, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            if (quantity != null) {
                getBindings().shareQuantityEdt.setText(toInputText(quantity));
            }
            EquityShareOrderDuxo.startLimitOrderFlow$default(getDuxo(), accountNumber, quantity, null, null, null, 28, null);
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void convertToMarketOrder() {
            getDuxo().setConfiguration(new ShareMarket.New(getOrderConfiguration().getAccountNumber(), null, 2, null));
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void convertToSimpleLimitOrder(BigDecimal presetPercentLimit) {
            Intrinsics.checkNotNullParameter(presetPercentLimit, "presetPercentLimit");
            getDuxo().setConfiguration(new ShareSimpleLimit.New(getOrderConfiguration().getAccountNumber(), null, presetPercentLimit, 2, null));
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void convertToAllDayOrder(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            EquityShareOrderDuxo.startLimitOrderFlow$default(getDuxo(), accountNumber, null, null, OrderMarketHours.ALL_DAY_HOURS, null, 22, null);
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void cancelPendingCryptoOrders() {
            EquityShareOrderDuxo.cancelPendingCryptoOrders$default(getDuxo(), 0L, 1, null);
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void presentQuickConversionSheet(QuickConversionKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), key, null, 2, null).show(getChildFragmentManager(), "quick-conversion");
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void convertToShareQuantity(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            getDuxo().convertToShareQuantity(accountNumber);
        }

        @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
        public void setShareQuantity(BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            RhEditText rhEditText = getBindings().shareQuantityEdt;
            rhEditText.setText(toInputText(quantity));
            rhEditText.setSelection(String.valueOf(rhEditText.getText()).length());
        }

        @Override // com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares.NotEnoughSharesDialogCallbacks
        public void onNotEnoughDialogSellAllClicked() {
            getDuxo().sellAll(false);
        }

        @Override // com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares.NotEnoughSharesDialogCallbacks
        public void onNotEnoughDialogNoSellableQuantity() {
            requireActivity().finish();
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

        @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
        public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            getDuxo().setAccountNumber(accountNumber, true, getSide());
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
            getDuxo().refreshAccountSwitcher();
        }

        @Override // com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragmentCallbacks
        public void onSuitabilityQuestionnaireCompletedForAccount(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            getDuxo().setAccountNumber(accountNumber, false, getSide());
        }

        @Override // com.robinhood.android.trade.equity.ui.dialog.BuySellOrderOnboardingBottomSheet.Callbacks
        public void onDismissBuySellOrderOnboarding() {
            getDuxo().markBuySellOrderOnboardingSeen();
        }

        @Override // com.robinhood.android.mcw.contracts.QuickConversionCallbacks
        public void onConversionComplete(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            RdsSnackbar.INSTANCE.make(getSnackbarShim(), message, 0).show();
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

        private final String toInputText(BigDecimal bigDecimal) {
            BigDecimal bigDecimalM822m;
            String plainString = (bigDecimal == null || (bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal)) == null) ? null : bigDecimalM822m.toPlainString();
            return plainString == null ? "" : plainString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void showTwentyFourHourMarketDialog(String accountNumber, Integer shares, MarketHours nextEffectiveMarketHours) {
            this.twentyFourHourMarketDialogVisible = true;
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder id = companion.create(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(C29365R.string.twenty_four_hour_market_shares_dialog_title, new Object[0]).setPositiveButton(C29365R.string.twenty_four_hour_market_shares_dialog_pos_button, new Object[0]).setNegativeButton(C29365R.string.twenty_four_hour_market_shares_dialog_neg_button, new Object[0]).setId(C29365R.id.dialog_id_24_hour_market_shares);
            Bundle bundle = new Bundle();
            bundle.putString("accountNumber", accountNumber);
            if (shares != null) {
                bundle.putInt(ARG_SHARES, shares.intValue());
            }
            RhDialogFragment.Builder passthroughArgs = id.setPassthroughArgs(bundle);
            Instant regularHoursOpensAt = nextEffectiveMarketHours != null ? nextEffectiveMarketHours.getRegularHoursOpensAt() : null;
            if (regularHoursOpensAt != null) {
                passthroughArgs.setMessage(C29365R.string.twenty_four_hour_market_shares_dialog_body, ZonedDateTimeFormatter.WEEKDAY_DATE_TIME_AM_PM.format(Instants.toZonedDateTime$default(regularHoursOpensAt, null, 1, null)));
            } else {
                passthroughArgs.setMessage(C29365R.string.twenty_four_hour_market_shares_dialog_body_pacific_time, new Object[0]);
            }
            FragmentManager supportFragmentManager = requireBaseActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, "twentyFourHourMarketSharesDialog", false, 4, null);
        }

        private final void showOnlyLimitOrdersDialog() {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C29365R.id.dialog_id_reviewing_market_data_down).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(C29365R.string.only_limit_orders_dialog_title, new Object[0]).setMessage(C29365R.string.only_limit_orders_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = requireBaseActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "onlyLimitOrdersDialog", false, 4, null);
        }

        public final void handleDuxoEvents$feature_trade_equity_externalDebug(final EquityOrderEvent.Share event) {
            SilentEquityOrderChecksAlert silentAlert;
            Intrinsics.checkNotNullParameter(event, "event");
            if (event instanceof EquityOrderEvent.AccountSwitcherRefreshedEvent) {
                EquityOrderEvent.AccountSwitcherRefreshedEvent accountSwitcherRefreshedEvent = (EquityOrderEvent.AccountSwitcherRefreshedEvent) event;
                if (accountSwitcherRefreshedEvent.getData() != null) {
                    AccountSwitcherData data = accountSwitcherRefreshedEvent.getData();
                    Intrinsics.checkNotNull(data);
                    onAccountSwitcherCtaClicked(data);
                    return;
                } else {
                    if (accountSwitcherRefreshedEvent.getError() != null) {
                        ActivityErrorHandler activityErrorHandler = getActivityErrorHandler();
                        Throwable error = accountSwitcherRefreshedEvent.getError();
                        Intrinsics.checkNotNull(error);
                        AbsErrorHandler.handleError$default(activityErrorHandler, error, false, 2, null);
                        return;
                    }
                    return;
                }
            }
            if (event instanceof EquityOrderEvent.BuySellOrderOnboardingEvent) {
                BuySellOrderOnboardingBottomSheet buySellOrderOnboardingBottomSheet = (BuySellOrderOnboardingBottomSheet) BuySellOrderOnboardingBottomSheet.INSTANCE.newInstance((Parcelable) new BuySellOrderOnboardingBottomSheet.Args(((EquityOrderEvent.BuySellOrderOnboardingEvent) event).getOnboardingResponse()));
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                buySellOrderOnboardingBottomSheet.show(childFragmentManager, "buySellOrderOnboarding");
                return;
            }
            if (event instanceof EquityOrderEvent.CancelPendingCryptoOrderEvent) {
                EquityOrderEvent.CancelPendingCryptoOrderEvent cancelPendingCryptoOrderEvent = (EquityOrderEvent.CancelPendingCryptoOrderEvent) event;
                if (cancelPendingCryptoOrderEvent.getError() != null) {
                    ActivityErrorHandler activityErrorHandler2 = getActivityErrorHandler();
                    Throwable error2 = cancelPendingCryptoOrderEvent.getError();
                    Intrinsics.checkNotNull(error2);
                    AbsErrorHandler.handleError$default(activityErrorHandler2, error2, false, 2, null);
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
            if (event instanceof EquityOrderEvent.CheckForceSuitabilityOnAccountSwitchedEvent) {
                AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment = (AccountSwitcherSuitabilityDialogFragment) AccountSwitcherSuitabilityDialogFragment.INSTANCE.newInstance((Parcelable) new AccountSwitcherSuitabilityDialogFragment.Args(((EquityOrderEvent.CheckForceSuitabilityOnAccountSwitchedEvent) event).getAccountNumber()));
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                accountSwitcherSuitabilityDialogFragment.show(childFragmentManager2, "account-switching-suitability-check");
                return;
            }
            if (event instanceof EquityOrderEvent.Share.ConvertToSharesEvent) {
                getCallbacks().setOrderConfiguration(new ShareBasic(((EquityOrderEvent.Share.ConvertToSharesEvent) event).getAccountNumber(), null, 2, null));
                return;
            }
            if (event instanceof EquityOrderEvent.Share.NotEnoughSharesEvent) {
                EquityOrderEvent.Share.NotEnoughSharesEvent notEnoughSharesEvent = (EquityOrderEvent.Share.NotEnoughSharesEvent) event;
                NotEnoughSharesDialogFragment notEnoughSharesDialogFragmentNewInstance = NotEnoughSharesDialogFragment.INSTANCE.newInstance(this, new NotEnoughSharesDuxo.Args(notEnoughSharesEvent.getPosition(), notEnoughSharesEvent.getInstrument(), notEnoughSharesEvent.getQuote(), false, 8, null));
                FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                notEnoughSharesDialogFragmentNewInstance.show(parentFragmentManager, DIALOG_NOT_ENOUGH_SHARES);
                toggleNumpad(true);
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
                } else {
                    toggleNumpad(true);
                }
                Throwable error3 = orderCheckEvent.getError();
                if (error3 != null) {
                    AbsErrorHandler.handleError$default(getActivityErrorHandler(), error3, false, 2, null);
                    return;
                }
                return;
            }
            if (event instanceof EquityOrderEvent.Share.SellAllEvent) {
                setShareQuantity(((EquityOrderEvent.Share.SellAllEvent) event).getShareQuantity());
                return;
            }
            if (event instanceof EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent) {
                getDuxo().markAdtBottomSheetSeen();
                BaseOrderFragments.consumeAdtOnboardingEvent(this, ((EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent) event).getSheetId(), new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityShareOrderFragment.handleDuxoEvents$lambda$46(this.f$0, event);
                    }
                }, new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityShareOrderFragment.handleDuxoEvents$lambda$47(this.f$0);
                    }
                });
            } else if (event instanceof EquityOrderEvent.ChangeOrderConfiguration) {
                getCallbacks().setOrderConfiguration(((EquityOrderEvent.ChangeOrderConfiguration) event).getConfiguration());
            } else {
                if (!(event instanceof EquityOrderEvent.Exit)) {
                    throw new NoWhenBranchMatchedException();
                }
                requireActivity().finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleDuxoEvents$lambda$46(EquityShareOrderFragment equityShareOrderFragment, EquityOrderEvent.Share share) {
            equityShareOrderFragment.getFragmentBindings().orderTypeOnboardingTooltip.setAdtTooltipShown();
            EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent twentyFourHourMarketOnboardingBottomSheetEvent = (EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent) share;
            EquityShareOrderDuxo.startLimitOrderFlow$default(equityShareOrderFragment.getDuxo(), twentyFourHourMarketOnboardingBottomSheetEvent.getAccountNumber(), twentyFourHourMarketOnboardingBottomSheetEvent.getQuantityOrAmount().shareQuantityOrNull(), null, OrderMarketHours.ALL_DAY_HOURS, null, 20, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleDuxoEvents$lambda$47(EquityShareOrderFragment equityShareOrderFragment) {
            equityShareOrderFragment.getFragmentBindings().orderTypeOnboardingTooltip.enableAdtTooltip();
            return Unit.INSTANCE;
        }

        private final void toggleNumpad(boolean visible) {
            getNumpad().setVisibility(visible ? 0 : 8);
            Space numpadTopSpaceReplacement = getFragmentBindings().numpadTopSpaceReplacement;
            Intrinsics.checkNotNullExpressionValue(numpadTopSpaceReplacement, "numpadTopSpaceReplacement");
            numpadTopSpaceReplacement.setVisibility(visible ? 8 : 0);
        }

        /* compiled from: EquityShareOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment$Args;", "<init>", "()V", "ARG_ACCOUNT_NUMBER", "", "ARG_SHARES", "DIALOG_NOT_ENOUGH_SHARES", "SCREEN_NAME", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements FragmentWithArgsCompanion<EquityShareOrderFragment, Args> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public Args getArgs(EquityShareOrderFragment equityShareOrderFragment) {
                return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, equityShareOrderFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
            public EquityShareOrderFragment newInstance(Args args) {
                return (EquityShareOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
            public void setArgs(EquityShareOrderFragment equityShareOrderFragment, Args args) {
                FragmentWithArgsCompanion.DefaultImpls.setArgs(this, equityShareOrderFragment, args);
            }
        }

        /* compiled from: EquityShareOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\tHÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001cR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment$Args;", "Landroid/os/Parcelable;", "orderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "completionUrl", "", "isPreIpo", "", "accountNumber", "isStreamlined", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "orderToReplaceId", "refId", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;ZLjava/lang/String;ZLcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Ljava/util/UUID;Ljava/util/UUID;)V", "getOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "getInstrumentId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getCompletionUrl", "()Ljava/lang/String;", "()Z", "getAccountNumber", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getOrderToReplaceId", "getRefId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Args implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Args> CREATOR = new Creator();
            private final String accountNumber;
            private final String completionUrl;
            private final EquityOrderFlowSource flowSource;
            private final UUID instrumentId;
            private final boolean isPreIpo;
            private final boolean isStreamlined;
            private final ShareBasedOrderConfiguration orderConfiguration;
            private final UUID orderToReplaceId;
            private final UUID refId;
            private final EquityOrderSide side;

            /* compiled from: EquityShareOrderFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Args> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z2;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    ShareBasedOrderConfiguration shareBasedOrderConfiguration = (ShareBasedOrderConfiguration) parcel.readParcelable(Args.class.getClassLoader());
                    UUID uuid = (UUID) parcel.readSerializable();
                    EquityOrderSide equityOrderSideValueOf = EquityOrderSide.valueOf(parcel.readString());
                    String string2 = parcel.readString();
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                        z2 = true;
                    } else {
                        z = false;
                        z2 = true;
                    }
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        z2 = z;
                    }
                    return new Args(shareBasedOrderConfiguration, uuid, equityOrderSideValueOf, string2, z3, string3, z2, EquityOrderFlowSource.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args[] newArray(int i) {
                    return new Args[i];
                }
            }

            public static /* synthetic */ Args copy$default(Args args, ShareBasedOrderConfiguration shareBasedOrderConfiguration, UUID uuid, EquityOrderSide equityOrderSide, String str, boolean z, String str2, boolean z2, EquityOrderFlowSource equityOrderFlowSource, UUID uuid2, UUID uuid3, int i, Object obj) {
                if ((i & 1) != 0) {
                    shareBasedOrderConfiguration = args.orderConfiguration;
                }
                if ((i & 2) != 0) {
                    uuid = args.instrumentId;
                }
                if ((i & 4) != 0) {
                    equityOrderSide = args.side;
                }
                if ((i & 8) != 0) {
                    str = args.completionUrl;
                }
                if ((i & 16) != 0) {
                    z = args.isPreIpo;
                }
                if ((i & 32) != 0) {
                    str2 = args.accountNumber;
                }
                if ((i & 64) != 0) {
                    z2 = args.isStreamlined;
                }
                if ((i & 128) != 0) {
                    equityOrderFlowSource = args.flowSource;
                }
                if ((i & 256) != 0) {
                    uuid2 = args.orderToReplaceId;
                }
                if ((i & 512) != 0) {
                    uuid3 = args.refId;
                }
                UUID uuid4 = uuid2;
                UUID uuid5 = uuid3;
                boolean z3 = z2;
                EquityOrderFlowSource equityOrderFlowSource2 = equityOrderFlowSource;
                boolean z4 = z;
                String str3 = str2;
                return args.copy(shareBasedOrderConfiguration, uuid, equityOrderSide, str, z4, str3, z3, equityOrderFlowSource2, uuid4, uuid5);
            }

            /* renamed from: component1, reason: from getter */
            public final ShareBasedOrderConfiguration getOrderConfiguration() {
                return this.orderConfiguration;
            }

            /* renamed from: component10, reason: from getter */
            public final UUID getRefId() {
                return this.refId;
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
            public final String getCompletionUrl() {
                return this.completionUrl;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsPreIpo() {
                return this.isPreIpo;
            }

            /* renamed from: component6, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsStreamlined() {
                return this.isStreamlined;
            }

            /* renamed from: component8, reason: from getter */
            public final EquityOrderFlowSource getFlowSource() {
                return this.flowSource;
            }

            /* renamed from: component9, reason: from getter */
            public final UUID getOrderToReplaceId() {
                return this.orderToReplaceId;
            }

            public final Args copy(ShareBasedOrderConfiguration orderConfiguration, UUID instrumentId, EquityOrderSide side, String completionUrl, boolean isPreIpo, String accountNumber, boolean isStreamlined, EquityOrderFlowSource flowSource, UUID orderToReplaceId, UUID refId) {
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(flowSource, "flowSource");
                Intrinsics.checkNotNullParameter(refId, "refId");
                return new Args(orderConfiguration, instrumentId, side, completionUrl, isPreIpo, accountNumber, isStreamlined, flowSource, orderToReplaceId, refId);
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
                return Intrinsics.areEqual(this.orderConfiguration, args.orderConfiguration) && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.side == args.side && Intrinsics.areEqual(this.completionUrl, args.completionUrl) && this.isPreIpo == args.isPreIpo && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.isStreamlined == args.isStreamlined && this.flowSource == args.flowSource && Intrinsics.areEqual(this.orderToReplaceId, args.orderToReplaceId) && Intrinsics.areEqual(this.refId, args.refId);
            }

            public int hashCode() {
                int iHashCode = ((((this.orderConfiguration.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.side.hashCode()) * 31;
                String str = this.completionUrl;
                int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isPreIpo)) * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.isStreamlined)) * 31) + this.flowSource.hashCode()) * 31;
                UUID uuid = this.orderToReplaceId;
                return ((iHashCode2 + (uuid != null ? uuid.hashCode() : 0)) * 31) + this.refId.hashCode();
            }

            public String toString() {
                return "Args(orderConfiguration=" + this.orderConfiguration + ", instrumentId=" + this.instrumentId + ", side=" + this.side + ", completionUrl=" + this.completionUrl + ", isPreIpo=" + this.isPreIpo + ", accountNumber=" + this.accountNumber + ", isStreamlined=" + this.isStreamlined + ", flowSource=" + this.flowSource + ", orderToReplaceId=" + this.orderToReplaceId + ", refId=" + this.refId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.orderConfiguration, flags);
                dest.writeSerializable(this.instrumentId);
                dest.writeString(this.side.name());
                dest.writeString(this.completionUrl);
                dest.writeInt(this.isPreIpo ? 1 : 0);
                dest.writeString(this.accountNumber);
                dest.writeInt(this.isStreamlined ? 1 : 0);
                dest.writeString(this.flowSource.name());
                dest.writeSerializable(this.orderToReplaceId);
                dest.writeSerializable(this.refId);
            }

            public Args(ShareBasedOrderConfiguration orderConfiguration, UUID instrumentId, EquityOrderSide side, String str, boolean z, String accountNumber, boolean z2, EquityOrderFlowSource flowSource, UUID uuid, UUID refId) {
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(flowSource, "flowSource");
                Intrinsics.checkNotNullParameter(refId, "refId");
                this.orderConfiguration = orderConfiguration;
                this.instrumentId = instrumentId;
                this.side = side;
                this.completionUrl = str;
                this.isPreIpo = z;
                this.accountNumber = accountNumber;
                this.isStreamlined = z2;
                this.flowSource = flowSource;
                this.orderToReplaceId = uuid;
                this.refId = refId;
            }

            public final ShareBasedOrderConfiguration getOrderConfiguration() {
                return this.orderConfiguration;
            }

            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            public final EquityOrderSide getSide() {
                return this.side;
            }

            public final String getCompletionUrl() {
                return this.completionUrl;
            }

            public final boolean isPreIpo() {
                return this.isPreIpo;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final boolean isStreamlined() {
                return this.isStreamlined;
            }

            public final EquityOrderFlowSource getFlowSource() {
                return this.flowSource;
            }

            public final UUID getOrderToReplaceId() {
                return this.orderToReplaceId;
            }

            public final UUID getRefId() {
                return this.refId;
            }
        }
    }
