package com.robinhood.android.trade.equity.p261ui.dollar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.AnimationUtils;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.crypto.lib.C12914R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equities.store.swipetotrade.EquitiesSwipeToTradeExperiment;
import com.robinhood.android.equity.ordercheck.OrderCheckFailure;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksAlertFragment;
import com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment;
import com.robinhood.android.equityadvancedorder.callbacks.EquityActivityBackgroundCallbacks;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment;
import com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragmentCallbacks;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherView;
import com.robinhood.android.mcw.contracts.QuickConversionCallbacks;
import com.robinhood.android.mcw.contracts.QuickConversionCallbacks2;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.nbbo.NbboAnalytics;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.SubmitOrderService;
import com.robinhood.android.trade.equity.databinding.FragmentEquityDollarOrderBinding;
import com.robinhood.android.trade.equity.databinding.MergeEquityDollarOrderBinding;
import com.robinhood.android.trade.equity.p261ui.dialog.BuySellOrderOnboardingBottomSheet;
import com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip.EquityOrderTypeTooltipView;
import com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares.NotEnoughSharesDialogCallbacks;
import com.robinhood.android.trade.equity.util.BaseOrderFragments;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.DirectOrder5;
import com.robinhood.android.trading.contracts.configuration.DollarBased;
import com.robinhood.android.trading.contracts.configuration.DollarBased3;
import com.robinhood.android.trading.contracts.configuration.DollarBased5;
import com.robinhood.android.trading.contracts.configuration.ShareStopLoss;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.SilentEquityOrderChecksAlert;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.SduiAccountSwitcherBottomSheetFragmentKey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
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

/* compiled from: EquityDollarOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ±\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0006¯\u0001°\u0001±\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020RH\u0016J\u0012\u0010Y\u001a\u00020W2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u001a\u0010\\\u001a\u00020W2\u0006\u0010]\u001a\u00020^2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\b\u0010_\u001a\u00020WH\u0016J\u0018\u0010`\u001a\u00020W2\u0006\u0010a\u001a\u00020F2\u0006\u0010b\u001a\u00020FH\u0002J\b\u0010c\u001a\u00020FH\u0016J\u0010\u0010d\u001a\u00020W2\u0006\u0010e\u001a\u00020fH\u0002J\u0010\u0010g\u001a\u00020W2\u0006\u0010e\u001a\u00020fH\u0002J\u001e\u0010h\u001a\u00020W2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020k0j2\u0006\u0010l\u001a\u00020FH\u0002J\b\u0010m\u001a\u00020WH\u0016J\b\u0010n\u001a\u00020WH\u0016J\u0010\u0010o\u001a\u00020J2\u0006\u0010p\u001a\u00020\u0002H\u0016J\u0010\u0010q\u001a\u00020W2\u0006\u0010p\u001a\u00020\u0002H\u0016J\b\u0010r\u001a\u00020WH\u0016J\b\u0010s\u001a\u00020WH\u0016J\u001a\u0010t\u001a\u00020W2\u0006\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010xH\u0016J\b\u0010y\u001a\u00020WH\u0016J\u0010\u0010z\u001a\u00020W2\u0006\u0010{\u001a\u00020xH\u0016J\u0010\u0010|\u001a\u00020W2\u0006\u0010u\u001a\u00020vH\u0016J\u0010\u0010}\u001a\u00020W2\u0006\u0010u\u001a\u00020vH\u0016J\u0018\u0010~\u001a\u00020W2\u0006\u0010u\u001a\u00020v2\u0006\u0010\u007f\u001a\u00020xH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020W2\u0007\u0010X\u001a\u00030\u0081\u0001H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020W2\u0007\u0010X\u001a\u00030\u0081\u0001H\u0016J\t\u0010\u0083\u0001\u001a\u00020WH\u0016J\t\u0010\u0084\u0001\u001a\u00020WH\u0016J\u0018\u0010\u0085\u0001\u001a\u00020W2\r\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020v0jH\u0016J\u0011\u0010\u0087\u0001\u001a\u00020W2\u0006\u0010w\u001a\u00020xH\u0016J\t\u0010\u0088\u0001\u001a\u00020WH\u0016J\t\u0010\u0089\u0001\u001a\u00020WH\u0016J\u0013\u0010\u008a\u0001\u001a\u00020W2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0016J\t\u0010\u008d\u0001\u001a\u00020WH\u0016J\t\u0010\u008e\u0001\u001a\u00020WH\u0016J\u0013\u0010\u008f\u0001\u001a\u00020W2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0016J\u0013\u0010\u0092\u0001\u001a\u00020F2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0016J\u001b\u0010\u0095\u0001\u001a\u00020W2\u0006\u0010u\u001a\u00020v2\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010\u0098\u0001\u001a\u00020W2\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0016J\u0013\u0010\u009b\u0001\u001a\u00020W2\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0016J\t\u0010\u009e\u0001\u001a\u00020WH\u0016J\u0011\u0010\u009f\u0001\u001a\u00020W2\u0006\u0010u\u001a\u00020vH\u0016J\t\u0010 \u0001\u001a\u00020WH\u0016J\u0013\u0010¡\u0001\u001a\u00020W2\b\u0010¢\u0001\u001a\u00030£\u0001H\u0016J\u0012\u0010¤\u0001\u001a\u00020W2\u0007\u0010¥\u0001\u001a\u00020vH\u0016J\u0013\u0010¦\u0001\u001a\u00020W2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0016J%\u0010©\u0001\u001a\u00020W2\b\u0010ª\u0001\u001a\u00030«\u00012\n\b\u0002\u0010¬\u0001\u001a\u00030\u00ad\u0001H\u0001¢\u0006\u0003\b®\u0001R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b7\u00108R\u001b\u0010:\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b<\u0010=R\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\bA\u0010BR\u0010\u0010D\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\u00020HX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020HX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010NR\u0014\u0010Q\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u000e\u0010U\u001a\u00020FX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006²\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCombinedCallbacks;", "Lcom/robinhood/android/lib/trade/suitability/AccountSwitcherSuitabilityDialogFragmentCallbacks;", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDialogCallbacks;", "Lcom/robinhood/android/equity/validation/EquityOrderValidationFailureResolver;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertFragment$Callbacks;", "Lcom/robinhood/android/trade/equity/ui/dialog/BuySellOrderOnboardingBottomSheet$Callbacks;", "Lcom/robinhood/android/mcw/contracts/QuickConversionCallbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "loadingDrawable", "Landroid/graphics/drawable/Drawable;", "getLoadingDrawable", "()Landroid/graphics/drawable/Drawable;", "loadingDrawable$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "activityBackgroundCallbacks", "Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", "getActivityBackgroundCallbacks", "()Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", "activityBackgroundCallbacks$delegate", "mergeBindings", "Lcom/robinhood/android/trade/equity/databinding/MergeEquityDollarOrderBinding;", "getMergeBindings", "()Lcom/robinhood/android/trade/equity/databinding/MergeEquityDollarOrderBinding;", "mergeBindings$delegate", "fragmentBindings", "Lcom/robinhood/android/trade/equity/databinding/FragmentEquityDollarOrderBinding;", "getFragmentBindings", "()Lcom/robinhood/android/trade/equity/databinding/FragmentEquityDollarOrderBinding;", "fragmentBindings$delegate", "duxo", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo;", "duxo$delegate", "orderCheckCallbacks", "shouldShowSellAllTextBtn", "", "reviewingConstraintLayoutRes", "", "initialConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "reviewingConstraints", "initialLayoutRes", "getInitialLayoutRes", "()I", "contentRes", "getContentRes", "resolverContext", "Landroid/content/Context;", "getResolverContext", "()Landroid/content/Context;", "shouldShowAccountSwitcher", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onResume", "toggleQuickTrade", "showReviewButton", "animate", "onBackPressed", "setState", "state", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderViewState;", "updateReviewButton", "bindCtaContainer", "quickTradeAmounts", "", "Lcom/robinhood/models/util/Money;", "showQuickTradeSellAll", "validateAndReviewOrder", "onFormStateUpdated", "getConstraintsForState", "formState", "onFormStateAnimationEnd", "performSubmitOrder", "onOrderSubmitted", "convertToLimitOrder", "accountNumber", "", "quantity", "Ljava/math/BigDecimal;", "convertToMarketOrder", "convertToSimpleLimitOrder", "presetPercentLimit", "convertToAllDayOrder", "convertToShareQuantity", "setLimitOrderConfiguration", "amount", "editLimitOrder", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "editStopOrder", "overrideToExecuteInMarketHoursOnly", "overrideToFlipIpoAccessShares", "appendOverrides", "overrides", "setShareQuantity", "cancelPendingCryptoOrders", "clearTaxLotSelection", "presentQuickConversionSheet", "key", "Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "onNotEnoughDialogSellAllClicked", "onNotEnoughDialogNoSellableQuantity", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onAccountSelected", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAccountSwitcherCtaClicked", "args", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "showSduiAccountSwitcher", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "onRefreshAccountsClicked", "onSuitabilityQuestionnaireCompletedForAccount", "onDismissBuySellOrderOnboarding", "onSwipeToSubmitAnimationStart", "duration", "", "onConversionComplete", "message", "onConversionOrderCheckAction", "action", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "handleDuxoEvents", "event", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "activity", "Landroidx/fragment/app/FragmentActivity;", "handleDuxoEvents$feature_trade_equity_externalDebug", "Callbacks", "Args", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityDollarOrderFragment extends BaseOrderFragment<DefaultOrderState> implements AccountSwitcherCallbacks2, AccountSwitcherSuitabilityDialogFragmentCallbacks, NotEnoughSharesDialogCallbacks, EquityOrderValidationFailureResolver, EquityOrderChecksAlertFragment.Callbacks, BuySellOrderOnboardingBottomSheet.Callbacks, QuickConversionCallbacks {
    private static final long ERROR_ANIMATION_DURATION_MS = 500;
    private static final long ERROR_ANIMATION_START_DELAY_MS = 2000;

    /* renamed from: activityBackgroundCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 activityBackgroundCallbacks;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final int contentRes;
    public CrossSellLaunchManager crossSellLaunchManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;

    /* renamed from: fragmentBindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 fragmentBindings;
    private final ConstraintSet initialConstraints;
    private final int initialLayoutRes;

    /* renamed from: loadingDrawable$delegate, reason: from kotlin metadata */
    private final Lazy loadingDrawable;
    public Markwon markwon;

    /* renamed from: mergeBindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 mergeBindings;
    private EquityOrderChecksAlertFragment.Callbacks orderCheckCallbacks;
    private final int reviewingConstraintLayoutRes;
    private final ConstraintSet reviewingConstraints;
    private boolean shouldShowAccountSwitcher;
    private boolean shouldShowSellAllTextBtn;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityDollarOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(EquityDollarOrderFragment.class, "activityBackgroundCallbacks", "getActivityBackgroundCallbacks()Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(EquityDollarOrderFragment.class, "mergeBindings", "getMergeBindings()Lcom/robinhood/android/trade/equity/databinding/MergeEquityDollarOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EquityDollarOrderFragment.class, "fragmentBindings", "getFragmentBindings()Lcom/robinhood/android/trade/equity/databinding/FragmentEquityDollarOrderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityDollarOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment$Callbacks;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderCallbacks;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseOrderFragment.Callbacks, EquityOrderCallbacks {
    }

    /* compiled from: EquityDollarOrderFragment.kt */
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

    public EquityDollarOrderFragment() {
        super(DefaultOrderState.EDITING);
        this.loadingDrawable = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityDollarOrderFragment.loadingDrawable_delegate$lambda$0(this.f$0);
            }
        });
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.activityBackgroundCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(EquityActivityBackgroundCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$special$$inlined$hostActivityCallbacks$1
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
        this.mergeBindings = ViewBinding5.viewBinding(this, EquityDollarOrderFragment4.INSTANCE);
        this.fragmentBindings = ViewBinding5.viewBinding(this, EquityDollarOrderFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, EquityDollarOrderDuxo.class);
        this.reviewingConstraintLayoutRes = C29365R.layout.fragment_equity_dollar_order_reviewing;
        this.initialConstraints = new ConstraintSet();
        this.reviewingConstraints = new ConstraintSet();
        this.initialLayoutRes = C29365R.layout.fragment_equity_dollar_order;
        this.contentRes = C29365R.layout.merge_equity_dollar_order;
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

    private final Drawable getLoadingDrawable() {
        return (Drawable) this.loadingDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimatedVectorDrawable loadingDrawable_delegate$lambda$0(EquityDollarOrderFragment equityDollarOrderFragment) {
        Drawable drawable = ContextCompat.getDrawable(equityDollarOrderFragment.requireContext(), C13997R.drawable.button_spinner);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawableMutate;
        int dimension = (int) equityDollarOrderFragment.getResources().getDimension(C29365R.dimen.order_summary_nbbo_loading_indicator_size);
        animatedVectorDrawable.setBounds(0, 0, dimension, dimension);
        animatedVectorDrawable.start();
        return animatedVectorDrawable;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final EquityActivityBackgroundCallbacks getActivityBackgroundCallbacks() {
        return (EquityActivityBackgroundCallbacks) this.activityBackgroundCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final MergeEquityDollarOrderBinding getMergeBindings() {
        Object value = this.mergeBindings.getValue(this, $$delegatedProperties[2]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEquityDollarOrderBinding) value;
    }

    private final FragmentEquityDollarOrderBinding getFragmentBindings() {
        Object value = this.fragmentBindings.getValue(this, $$delegatedProperties[3]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEquityDollarOrderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityDollarOrderDuxo getDuxo() {
        return (EquityDollarOrderDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return this.initialLayoutRes;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return this.contentRes;
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public Context getResolverContext() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((parentFragment + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EquityDollarOrderDuxo duxo = getDuxo();
        Companion companion = INSTANCE;
        duxo.setStaticInputs(new EquityOrderRequestInputs.StaticInputs(((Args) companion.getArgs((Fragment) this)).getInstrumentId(), ((Args) companion.getArgs((Fragment) this)).isPreIpo(), ((Args) companion.getArgs((Fragment) this)).getSide(), ((Args) companion.getArgs((Fragment) this)).getFlowSource(), getCallbacks().getOrderUuid()));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(getRoot(), InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C295741(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C295752(null), 1, null);
        this.initialConstraints.clone(getRoot());
        this.reviewingConstraints.clone(getActivity(), this.reviewingConstraintLayoutRes);
        LifecycleHost.DefaultImpls.bind$default(this, getNumpad().getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderFragment.onViewCreated$lambda$1(this.f$0, (KeyEvent) obj);
            }
        });
        final MergeEquityDollarOrderBinding mergeBindings = getMergeBindings();
        TickerInputView tickerInputView = mergeBindings.dollarInputView;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(contextRequireContext, C16915R.font.capsule_sans_medium));
        RhTextView sellAllTextBtn = mergeBindings.sellAllTextBtn;
        Intrinsics.checkNotNullExpressionValue(sellAllTextBtn, "sellAllTextBtn");
        OnClickListeners.onClick(sellAllTextBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityDollarOrderFragment.onViewCreated$lambda$8$lambda$2(this.f$0);
            }
        });
        final RhTextView orderAvailableTxt = mergeBindings.orderAvailableTxt;
        Intrinsics.checkNotNullExpressionValue(orderAvailableTxt, "orderAvailableTxt");
        OneShotPreDrawListener.add(orderAvailableTxt, new Runnable() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onViewCreated$lambda$8$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                RhTextView rhTextView = mergeBindings.orderAvailableTxt;
                ViewGroup.LayoutParams layoutParams = rhTextView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = this.getReviewButtonHeight();
                rhTextView.setLayoutParams(layoutParams2);
            }
        });
        mergeBindings.orderReviewTxt.setBetterLinkMovementMethod(true, false);
        final TradeAccountSwitcherView tradeAccountSwitcherView = mergeBindings.accountSwitcherBtn;
        Intrinsics.checkNotNull(tradeAccountSwitcherView);
        OneShotPreDrawListener.add(tradeAccountSwitcherView, new Runnable() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onViewCreated$lambda$8$lambda$7$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                TradeAccountSwitcherView tradeAccountSwitcherView2 = tradeAccountSwitcherView;
                ViewGroup.LayoutParams layoutParams = tradeAccountSwitcherView2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = this.getReviewButtonHeight();
                tradeAccountSwitcherView2.setLayoutParams(layoutParams2);
            }
        });
        getFragmentBindings().ctaContainer.setVisibility(4);
    }

    /* compiled from: EquityDollarOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onViewCreated$1", m3645f = "EquityDollarOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onViewCreated$1 */
    static final class C295741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295741(Continuation<? super C295741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderFragment.this.new C295741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityDollarOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ EquityDollarOrderFragment $tmp0;

            AnonymousClass1(EquityDollarOrderFragment equityDollarOrderFragment) {
                this.$tmp0 = equityDollarOrderFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, EquityDollarOrderFragment.class, "setState", "setState(Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(EquityDollarOrderViewState equityDollarOrderViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$setState = C295741.invokeSuspend$setState(this.$tmp0, equityDollarOrderViewState, continuation);
                return objInvokeSuspend$setState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((EquityDollarOrderViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityDollarOrderViewState> stateFlow = EquityDollarOrderFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityDollarOrderFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setState(EquityDollarOrderFragment equityDollarOrderFragment, EquityDollarOrderViewState equityDollarOrderViewState, Continuation continuation) throws Resources.NotFoundException {
            equityDollarOrderFragment.setState(equityDollarOrderViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EquityDollarOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onViewCreated$2", m3645f = "EquityDollarOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onViewCreated$2 */
    static final class C295752 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295752(Continuation<? super C295752> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderFragment.this.new C295752(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295752) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<EquityOrderEvent.Dollar>> eventFlow = EquityDollarOrderFragment.this.getDuxo().getEventFlow();
                final EquityDollarOrderFragment equityDollarOrderFragment = EquityDollarOrderFragment.this;
                FlowCollector<? super Event<EquityOrderEvent.Dollar>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<EquityOrderEvent.Dollar>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<EquityOrderEvent.Dollar> event, Continuation<? super Unit> continuation) {
                        EventConsumer<EquityOrderEvent.Dollar> eventConsumerInvoke;
                        if (event != null) {
                            final EquityDollarOrderFragment equityDollarOrderFragment2 = equityDollarOrderFragment;
                            if ((event.getData() instanceof EquityOrderEvent.Dollar) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Resources.NotFoundException {
                                        m19342invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19342invoke(Object it) throws Resources.NotFoundException {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        EquityDollarOrderFragment.handleDuxoEvents$feature_trade_equity_externalDebug$default(equityDollarOrderFragment2, (EquityOrderEvent.Dollar) event.getData(), null, 2, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(EquityDollarOrderFragment equityDollarOrderFragment, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        equityDollarOrderFragment.getDuxo().consumeKeyEvent(keyEvent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$2(EquityDollarOrderFragment equityDollarOrderFragment) {
        EquityDollarOrderDuxo.sellAll$default(equityDollarOrderFragment.getDuxo(), false, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getMergeBindings().dollarInputView.requestFocus();
        Observable observableAsObservable = asObservable(getDuxo().getStateFlow());
        final C295701 c295701 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment.onResume.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((EquityDollarOrderViewState) obj).getFormState();
            }
        };
        Observable observableDistinctUntilChanged = observableAsObservable.map(new io.reactivex.functions.Function(c295701) { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c295701, "function");
                this.function = c295701;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C295712(this));
        final C295723 c295723 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment.onResume.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((EquityDollarOrderViewState) obj).getLoggingEquityOrderContext();
            }
        };
        Observable map = observableAsObservable.map(new io.reactivex.functions.Function(c295723) { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c295723, "function");
                this.function = c295723;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderFragment.onResume$lambda$10(this.f$0, (com.robinhood.rosetta.eventlogging.Context) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C295735(null), 3, null);
    }

    /* compiled from: EquityDollarOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onResume$2 */
    /* synthetic */ class C295712 extends FunctionReferenceImpl implements Function1<DefaultOrderState, Unit> {
        C295712(Object obj) {
            super(1, obj, EquityDollarOrderFragment.class, "setFormState", "setFormState(Lcom/robinhood/android/lib/trade/OrderState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DefaultOrderState defaultOrderState) {
            invoke2(defaultOrderState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DefaultOrderState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EquityDollarOrderFragment) this.receiver).setFormState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(EquityDollarOrderFragment equityDollarOrderFragment, com.robinhood.rosetta.eventlogging.Context context) {
        EventLogger.DefaultImpls.logScreenAppear$default(equityDollarOrderFragment.getEventLogger(), null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), null, null, context, 13, null);
        return Unit.INSTANCE;
    }

    /* compiled from: EquityDollarOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onResume$5", m3645f = "EquityDollarOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onResume$5 */
    static final class C295735 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: EquityDollarOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onResume$5$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C295735(Continuation<? super C295735> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderFragment.this.new C295735(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295735) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IacAlertSheetLocation iacAlertSheetLocation;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(EquityDollarOrderFragment.this.getExperimentsStore(), new Experiment[]{EquitiesSwipeToTradeExperiment.INSTANCE}, false, null, 4, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (FlowKt.first(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Companion companion = EquityDollarOrderFragment.INSTANCE;
            if (((Args) companion.getArgs((Fragment) EquityDollarOrderFragment.this)).getFlowSource().isInstrumentRow()) {
                CrossSellLaunchManager crossSellLaunchManager = EquityDollarOrderFragment.this.getCrossSellLaunchManager();
                EquityDollarOrderFragment equityDollarOrderFragment = EquityDollarOrderFragment.this;
                int i2 = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) equityDollarOrderFragment)).getSide().ordinal()];
                if (i2 == 1) {
                    iacAlertSheetLocation = IacAlertSheetLocation.INVESTING_STOCK_BUY;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("dollar short orders not supported");
                    }
                    iacAlertSheetLocation = IacAlertSheetLocation.INVESTING_STOCK_SELL;
                }
                CrossSellLaunchManager.initIacBottomSheetPolling$default(crossSellLaunchManager, equityDollarOrderFragment, iacAlertSheetLocation, null, ((Args) companion.getArgs((Fragment) EquityDollarOrderFragment.this)).getInstrumentId(), null, null, null, null, null, 500, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EquityDollarOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onResume$5$1", m3645f = "EquityDollarOrderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$onResume$5$1, reason: invalid class name */
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

    private final void toggleQuickTrade(final boolean showReviewButton, final boolean animate) {
        final FragmentEquityDollarOrderBinding fragmentBindings = getFragmentBindings();
        final LinearLayout quickTradeAmountsContainer = fragmentBindings.quickTradeAmountsContainer;
        Intrinsics.checkNotNullExpressionValue(quickTradeAmountsContainer, "quickTradeAmountsContainer");
        OneShotPreDrawListener.add(quickTradeAmountsContainer, new Runnable() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$toggleQuickTrade$lambda$14$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                float f = showReviewButton ? -fragmentBindings.ctaContainer.getHeight() : 0.0f;
                boolean z = showReviewButton;
                float f2 = z ? 0.0f : 1.0f;
                float height = z ? 0.0f : fragmentBindings.ctaContainer.getHeight() * 1.6f;
                float f3 = showReviewButton ? 1.0f : 0.0f;
                if (!animate) {
                    fragmentBindings.quickTradeAmountsContainer.setY(f);
                    fragmentBindings.quickTradeAmountsContainer.setAlpha(f2);
                    RdsButton reviewOrderBtn = this.getReviewOrderBtn();
                    reviewOrderBtn.setY(height);
                    reviewOrderBtn.setAlpha(f3);
                    return;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new FastOutSlowInInterpolator());
                LinearLayout linearLayout = fragmentBindings.quickTradeAmountsContainer;
                Property property = View.Y;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, f);
                LinearLayout linearLayout2 = fragmentBindings.quickTradeAmountsContainer;
                Property property2 = View.ALPHA;
                animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property2, f2), ObjectAnimator.ofFloat(this.getReviewOrderBtn(), (Property<RdsButton, Float>) property, height), ObjectAnimator.ofFloat(this.getReviewOrderBtn(), (Property<RdsButton, Float>) property2, f3));
                animatorSet.start();
            }
        });
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getReviewing()) {
            getDuxo().setReviewingState(false);
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(final EquityDollarOrderViewState state) throws Resources.NotFoundException {
        CharSequence text;
        final EquityOrderContext equityOrderContext = state.getEquityOrderContext();
        if (equityOrderContext == null) {
            return;
        }
        this.shouldShowAccountSwitcher = state.getShouldShowAccountSwitcher();
        this.orderCheckCallbacks = new EquityOrderChecksAlertFragment.Callbacks() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment.setState.1
            @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
            public boolean onActionClicked(ServerDrivenButton button) {
                Intrinsics.checkNotNullParameter(button, "button");
                EquityDollarOrderFragment.this.performTypedAction(button.getTypedAction(), equityOrderContext.getAccountNumber(), equityOrderContext);
                EquityDollarOrderFragment.this.getDuxo().logOrderCheckAction(button.getLoggingIdentifier());
                return true;
            }
        };
        getFragmentBindings().marketSessionChangeAlert.bind(state.getSessionChangeAlertContent(), state.getLoggingEquityOrderContext(), new EquityDollarOrderFragment6(getDuxo()));
        MergeEquityDollarOrderBinding mergeBindings = getMergeBindings();
        mergeBindings.dollarInputView.transitionTo(state.getAmountCharArray());
        mergeBindings.orderDetailsTxt.setContentDescription(state.getOrderDetailsContentDescription());
        RhTextView orderAvailableTxt = mergeBindings.orderAvailableTxt;
        Intrinsics.checkNotNullExpressionValue(orderAvailableTxt, "orderAvailableTxt");
        orderAvailableTxt.setVisibility(!getReviewing() && !state.getShouldShowAccountSwitcher() ? 0 : 8);
        TradeAccountSwitcherView accountSwitcherBtn = mergeBindings.accountSwitcherBtn;
        Intrinsics.checkNotNullExpressionValue(accountSwitcherBtn, "accountSwitcherBtn");
        accountSwitcherBtn.setVisibility(!getReviewing() && state.getShouldShowAccountSwitcher() ? 0 : 8);
        InstrumentAccountSwitcherState accountSwitcherState = state.getAccountSwitcherState();
        if (accountSwitcherState != null) {
            mergeBindings.accountSwitcherBtn.bind(accountSwitcherState, this, false);
        }
        RhTextView rhTextView = mergeBindings.orderAvailableTxt;
        StringResource availableTextForDollarBased = equityOrderContext.getAvailableTextForDollarBased();
        CharSequence text2 = null;
        if (availableTextForDollarBased != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = availableTextForDollarBased.getText(resources);
        } else {
            text = null;
        }
        rhTextView.setText(text);
        RhTextView orderReviewLabelTxt = mergeBindings.orderReviewLabelTxt;
        Intrinsics.checkNotNullExpressionValue(orderReviewLabelTxt, "orderReviewLabelTxt");
        OnClickListeners.onClick(orderReviewLabelTxt, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityDollarOrderFragment.setState$lambda$21$lambda$17(this.f$0, state);
            }
        });
        mergeBindings.orderReviewTxt.setText(state.getOrderReviewText(getMarkwon(), getLoadingDrawable(), new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityDollarOrderFragment.setState$lambda$21$lambda$18(this.f$0, state);
            }
        }));
        RhTextView rhTextView2 = mergeBindings.orderCreditTxt;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(StringResources6.getText(resources2, state.getOrderCreditText()));
        RhTextView rhTextView3 = mergeBindings.orderAccountLabelTxt;
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rhTextView3.setText(StringResources6.getText(resources3, state.getOrderAccountLabelText()));
        RhTextView rhTextView4 = mergeBindings.backupWithholdingWarningTxt;
        Intrinsics.checkNotNull(rhTextView4);
        rhTextView4.setVisibility(state.getShouldShowBackupWithholdingWarning() ? 0 : 8);
        OnClickListeners.onClick(rhTextView4, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityDollarOrderFragment.setState$lambda$21$lambda$20$lambda$19(this.f$0);
            }
        });
        StringResource withholdingWarningString = state.getWithholdingWarningString();
        if (withholdingWarningString != null) {
            Resources resources4 = rhTextView4.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            text2 = withholdingWarningString.getText(resources4);
        }
        rhTextView4.setText(text2);
        this.shouldShowSellAllTextBtn = state.getShouldShowSellAllTextButton();
        RhTextView sellAllTextBtn = mergeBindings.sellAllTextBtn;
        Intrinsics.checkNotNullExpressionValue(sellAllTextBtn, "sellAllTextBtn");
        sellAllTextBtn.setVisibility(this.shouldShowSellAllTextBtn ? 0 : 8);
        updateReviewButton(state);
        ShimmerLoadingView equityDollarOrderLoadingView = getFragmentBindings().equityDollarOrderLoadingView;
        Intrinsics.checkNotNullExpressionValue(equityDollarOrderLoadingView, "equityDollarOrderLoadingView");
        equityDollarOrderLoadingView.setVisibility(state.isCancelPendingCryptoOrdersLoading() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$21$lambda$17(EquityDollarOrderFragment equityDollarOrderFragment, EquityDollarOrderViewState equityDollarOrderViewState) {
        Navigator navigator = equityDollarOrderFragment.getNavigator();
        Context contextRequireContext = equityDollarOrderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        List listListOf = CollectionsKt.listOf(((Args) companion.getArgs((Fragment) equityDollarOrderFragment)).getInstrumentId());
        UUID instrumentId = ((Args) companion.getArgs((Fragment) equityDollarOrderFragment)).getInstrumentId();
        boolean zIsPresetPercentLimitOrder = equityDollarOrderViewState.isPresetPercentLimitOrder();
        DollarBased configuration = equityDollarOrderViewState.getConfiguration();
        DirectOrder5 directOrder5 = configuration instanceof DirectOrder5 ? (DirectOrder5) configuration : null;
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.OrderSummaryExplanation(listListOf, zIsPresetPercentLimitOrder, directOrder5 != null ? directOrder5.getPresetPercentLimit() : null, instrumentId), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$21$lambda$18(EquityDollarOrderFragment equityDollarOrderFragment, EquityDollarOrderViewState equityDollarOrderViewState) {
        NbboAnalytics.INSTANCE.logNbboRefreshTap(equityDollarOrderFragment.getEventLogger(), equityDollarOrderViewState.getNbboSummary());
        equityDollarOrderFragment.getDuxo().refreshNbbo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$21$lambda$20$lambda$19(EquityDollarOrderFragment equityDollarOrderFragment) {
        BackupWithholdingWarningBottomSheetFragment backupWithholdingWarningBottomSheetFragment = new BackupWithholdingWarningBottomSheetFragment();
        FragmentManager childFragmentManager = equityDollarOrderFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        backupWithholdingWarningBottomSheetFragment.show(childFragmentManager, "tax_warning");
        return Unit.INSTANCE;
    }

    private final void updateReviewButton(EquityDollarOrderViewState state) {
        if (getReviewing()) {
            return;
        }
        setLoading(state.isReviewButtonLoading());
        if (state.isQuickTradeAvailable()) {
            List<Money> quickTradeAmounts = state.getQuickTradeAmounts();
            Intrinsics.checkNotNull(quickTradeAmounts);
            bindCtaContainer(quickTradeAmounts, state.getCanShowQuickTradeSellAll());
        } else {
            LinearLayout quickTradeAmountsContainer = getFragmentBindings().quickTradeAmountsContainer;
            Intrinsics.checkNotNullExpressionValue(quickTradeAmountsContainer, "quickTradeAmountsContainer");
            quickTradeAmountsContainer.setVisibility(8);
        }
        getReviewOrderBtn().setEnabled(state.getReviewOrderBtnEnabled());
    }

    private final void bindCtaContainer(final List<Money> quickTradeAmounts, boolean showQuickTradeSellAll) {
        FragmentEquityDollarOrderBinding fragmentBindings = getFragmentBindings();
        getReviewOrderBtn().setEnabled(true);
        LinearLayout quickTradeAmountsContainer = fragmentBindings.quickTradeAmountsContainer;
        Intrinsics.checkNotNullExpressionValue(quickTradeAmountsContainer, "quickTradeAmountsContainer");
        int i = 0;
        quickTradeAmountsContainer.setVisibility(0);
        RdsButton rdsButton = fragmentBindings.quickTradeSellAllBtn;
        Intrinsics.checkNotNull(rdsButton);
        rdsButton.setVisibility(showQuickTradeSellAll ? 0 : 8);
        RdsButton quickTradeSellAllBtn = fragmentBindings.quickTradeSellAllBtn;
        Intrinsics.checkNotNullExpressionValue(quickTradeSellAllBtn, "quickTradeSellAllBtn");
        OnClickListeners.onClick(quickTradeSellAllBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityDollarOrderFragment.bindCtaContainer$lambda$29$lambda$24$lambda$23(this.f$0, quickTradeAmounts);
            }
        });
        List<RdsButton> listListOf = CollectionsKt.listOf((Object[]) new RdsButton[]{fragmentBindings.quickTradeAmountOneBtn, fragmentBindings.quickTradeAmountTwoBtn, fragmentBindings.quickTradeAmountThreeBtn});
        for (RdsButton rdsButton2 : listListOf) {
            Intrinsics.checkNotNull(rdsButton2);
            rdsButton2.setVisibility(8);
        }
        List list = listListOf;
        for (Object obj : quickTradeAmounts) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final Money money = (Money) obj;
            RdsButton rdsButton3 = (RdsButton) list.get(i);
            Intrinsics.checkNotNull(rdsButton3);
            TextViewsKt.setVisibilityText(rdsButton3, Formats.getWholeNumberAmountFormat().format(Money3.getBigDecimalCompat(money)));
            OnClickListeners.onClick(rdsButton3, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityDollarOrderFragment.bindCtaContainer$lambda$29$lambda$28$lambda$27$lambda$26(this.f$0, money, quickTradeAmounts);
                }
            });
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindCtaContainer$lambda$29$lambda$24$lambda$23(EquityDollarOrderFragment equityDollarOrderFragment, List list) {
        EquityDollarOrderDuxo.sellAll$default(equityDollarOrderFragment.getDuxo(), false, 1, null);
        equityDollarOrderFragment.getDuxo().logQuickTradeSellAllTap(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindCtaContainer$lambda$29$lambda$28$lambda$27$lambda$26(EquityDollarOrderFragment equityDollarOrderFragment, Money money, List list) {
        equityDollarOrderFragment.getDuxo().setDollarAmountAndValidate(money);
        equityDollarOrderFragment.getDuxo().logQuickTradeTap(list, money);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void validateAndReviewOrder() {
        getDuxo().validateAndReviewOrder();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateUpdated() {
        super.onFormStateUpdated();
        MergeEquityDollarOrderBinding mergeBindings = getMergeBindings();
        RhTextView orderAvailableTxt = mergeBindings.orderAvailableTxt;
        Intrinsics.checkNotNullExpressionValue(orderAvailableTxt, "orderAvailableTxt");
        orderAvailableTxt.setVisibility(!getReviewing() && !this.shouldShowAccountSwitcher ? 0 : 8);
        TradeAccountSwitcherView accountSwitcherBtn = mergeBindings.accountSwitcherBtn;
        Intrinsics.checkNotNullExpressionValue(accountSwitcherBtn, "accountSwitcherBtn");
        accountSwitcherBtn.setVisibility(!getReviewing() && this.shouldShowAccountSwitcher ? 0 : 8);
        if (!getReviewing()) {
            mergeBindings.dollarInputView.requestFocus();
        }
        RhTextView orderCreditTxt = mergeBindings.orderCreditTxt;
        Intrinsics.checkNotNullExpressionValue(orderCreditTxt, "orderCreditTxt");
        orderCreditTxt.setVisibility(getReviewing() ? 0 : 8);
        RhTextView orderAccountLabelTxt = mergeBindings.orderAccountLabelTxt;
        Intrinsics.checkNotNullExpressionValue(orderAccountLabelTxt, "orderAccountLabelTxt");
        orderAccountLabelTxt.setVisibility(getReviewing() ? 0 : 8);
        RhTextView orderReviewTxt = mergeBindings.orderReviewTxt;
        Intrinsics.checkNotNullExpressionValue(orderReviewTxt, "orderReviewTxt");
        orderReviewTxt.setVisibility(getReviewing() ? 0 : 8);
        RhTextView orderReviewLabelTxt = mergeBindings.orderReviewLabelTxt;
        Intrinsics.checkNotNullExpressionValue(orderReviewLabelTxt, "orderReviewLabelTxt");
        orderReviewLabelTxt.setVisibility(getReviewing() ? 0 : 8);
        LinearLayout linearLayout = mergeBindings.orderDetailsTxt;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.bottomToTop = getReviewing() ? C29365R.id.order_review_txt : C29365R.id.order_available_txt;
        linearLayout.setLayoutParams(layoutParams2);
        RhTextView sellAllTextBtn = mergeBindings.sellAllTextBtn;
        Intrinsics.checkNotNullExpressionValue(sellAllTextBtn, "sellAllTextBtn");
        sellAllTextBtn.setVisibility(this.shouldShowSellAllTextBtn ? 0 : 8);
        FragmentEquityDollarOrderBinding fragmentBindings = getFragmentBindings();
        FrameLayout ctaContainer = fragmentBindings.ctaContainer;
        Intrinsics.checkNotNullExpressionValue(ctaContainer, "ctaContainer");
        ctaContainer.setVisibility(!getReviewing() ? 0 : 8);
        EquityOrderTypeTooltipView orderTypeOnboardingTooltip = fragmentBindings.orderTypeOnboardingTooltip;
        Intrinsics.checkNotNullExpressionValue(orderTypeOnboardingTooltip, "orderTypeOnboardingTooltip");
        orderTypeOnboardingTooltip.setVisibility(getReviewing() ? 8 : 0);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public ConstraintSet getConstraintsForState(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        int i = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
        if (i == 1) {
            return this.initialConstraints;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.reviewingConstraints;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateAnimationEnd(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        if (formState.getIsReviewingState()) {
            getDuxo().logReviewingReadyToSubmit();
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void performSubmitOrder() {
        getDuxo().submit();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onOrderSubmitted() {
        getDuxo().onSubmitted();
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToLimitOrder(String accountNumber, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        EquityDollarOrderDuxo.startLimitOrderFlow$default(getDuxo(), accountNumber, quantity, null, null, null, 28, null);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToMarketOrder() {
        getDuxo().setConfiguration$feature_trade_equity_externalDebug(new DollarBased3.New(((Args) INSTANCE.getArgs((Fragment) this)).getOrderConfiguration().getAccountNumber(), null, 2, null));
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToSimpleLimitOrder(BigDecimal presetPercentLimit) {
        Intrinsics.checkNotNullParameter(presetPercentLimit, "presetPercentLimit");
        getDuxo().setConfiguration$feature_trade_equity_externalDebug(new DollarBased5.New(((Args) INSTANCE.getArgs((Fragment) this)).getOrderConfiguration().getAccountNumber(), null, presetPercentLimit, 2, null));
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToAllDayOrder(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        EquityDollarOrderDuxo.startLimitOrderFlow$default(getDuxo(), accountNumber, null, null, OrderMarketHours.ALL_DAY_HOURS, null, 22, null);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void convertToShareQuantity(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getDuxo().convertToShareQuantity();
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void setLimitOrderConfiguration(String accountNumber, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(amount, "amount");
        EquityDollarOrderDuxo.startLimitOrderFlow$default(getDuxo(), accountNumber, null, amount, null, OrderTimeInForce.GTC, 10, null);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void editLimitOrder(EquityOrderContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        EquityDollarOrderDuxo.startLimitOrderFlow$default(getDuxo(), context.getAccountNumber(), null, null, context.getMarketHours(), context.getTimeInForce(), 6, null);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void editStopOrder(EquityOrderContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Callbacks callbacks = getCallbacks();
        String accountNumber = context.getAccountNumber();
        OrderTimeInForce timeInForce = context.getTimeInForce();
        OrderMarketHours marketHours = context.getMarketHours();
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        callbacks.startOrderBuilder(new ShareStopLoss.New(accountNumber, null, ZERO, timeInForce, marketHours, 2, null));
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void overrideToExecuteInMarketHoursOnly() {
        convertToMarketOrder();
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
    public void setShareQuantity(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        getDuxo().setQuantityAndValidate(quantity);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void cancelPendingCryptoOrders() {
        EquityDollarOrderDuxo.cancelPendingCryptoOrders$default(getDuxo(), 0L, 1, null);
    }

    @Override // com.robinhood.android.equity.validation.EquityOrderValidationFailureResolver
    public void presentQuickConversionSheet(QuickConversionKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), key, null, 2, null).show(getChildFragmentManager(), "quick-conversion");
    }

    @Override // com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares.NotEnoughSharesDialogCallbacks
    public void onNotEnoughDialogSellAllClicked() {
        getDuxo().sellAll(false);
    }

    @Override // com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares.NotEnoughSharesDialogCallbacks
    public void onNotEnoughDialogNoSellableQuantity() {
        requireActivity().finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, android.view.View] */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        View view;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? FindViewById = toolbar.findViewById(C20649R.id.equity_order_toolbar_content);
        objectRef.element = FindViewById;
        if (FindViewById == 0) {
            RhToolbar.addCustomView$default(toolbar, C20649R.layout.include_equity_order_toolbar, false, 0, 6, null);
            objectRef.element = toolbar.findViewById(C20649R.id.equity_order_toolbar_content);
        }
        ViewGroup viewGroup = (ViewGroup) objectRef.element;
        TextView textView = viewGroup != null ? (TextView) viewGroup.findViewById(C20649R.id.action_order_types_txt) : null;
        ViewGroup viewGroup2 = (ViewGroup) objectRef.element;
        View viewFindViewById = viewGroup2 != null ? viewGroup2.findViewById(C20649R.id.action_order_types) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(!getReviewing() && !((Args) INSTANCE.getArgs((Fragment) this)).isPreIpo() ? 0 : 8);
            view = viewFindViewById;
        } else {
            view = null;
        }
        View viewFindViewById2 = toolbar.findViewById(C20649R.id.order_label_content);
        if (viewFindViewById2 == null) {
            RhToolbar.addCustomView$default(toolbar, C20649R.layout.include_toolbar_equity_order_label, true, 0, 4, null);
            viewFindViewById2 = toolbar.findViewById(C20649R.id.order_label_content);
        }
        final TextView textView2 = viewFindViewById2 != null ? (TextView) viewFindViewById2.findViewById(C20649R.id.order_label_txt) : null;
        if (((Args) INSTANCE.getArgs((Fragment) this)).getFlowSource() == EquityOrderFlowSource.ORDER_DETAIL_EXTEND) {
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = (ViewGroup) objectRef.element;
        if (viewGroup3 != null) {
            OnClickListeners.onClick(viewGroup3, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityDollarOrderFragment.configureToolbar$lambda$34(this.f$0);
                }
            });
        }
        Observable map = asObservable(getDuxo().getStateFlow()).map(new io.reactivex.functions.Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment.configureToolbar.2
            @Override // io.reactivex.functions.Function
            public final Optional<com.robinhood.rosetta.eventlogging.Context> apply(EquityDollarOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getLoggingEquityOrderContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderFragment.configureToolbar$lambda$35(this.f$0, (com.robinhood.rosetta.eventlogging.Context) obj);
            }
        });
        final TextView textView3 = textView;
        final View view2 = view;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(asObservable(getDuxo().getStateFlow())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderFragment.configureToolbar$lambda$38(objectRef, textView3, this, textView2, view2, (EquityDollarOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$34(EquityDollarOrderFragment equityDollarOrderFragment) {
        EquityOrderTypeTooltipView orderTypeOnboardingTooltip = equityDollarOrderFragment.getFragmentBindings().orderTypeOnboardingTooltip;
        Intrinsics.checkNotNullExpressionValue(orderTypeOnboardingTooltip, "orderTypeOnboardingTooltip");
        orderTypeOnboardingTooltip.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$35(EquityDollarOrderFragment equityDollarOrderFragment, com.robinhood.rosetta.eventlogging.Context context) {
        EquityOrderTypeTooltipView equityOrderTypeTooltipView = equityDollarOrderFragment.getFragmentBindings().orderTypeOnboardingTooltip;
        Companion companion = INSTANCE;
        equityOrderTypeTooltipView.setTooltipArguments(new EquityOrderTypeTooltipView.Args(((Args) companion.getArgs((Fragment) equityDollarOrderFragment)).getInitialAccountNumber(), ((Args) companion.getArgs((Fragment) equityDollarOrderFragment)).getInstrumentId(), ((Args) companion.getArgs((Fragment) equityDollarOrderFragment)).getSide(), true, context, ((Args) companion.getArgs((Fragment) equityDollarOrderFragment)).getOrderConfiguration().getOrderConfiguration(), false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit configureToolbar$lambda$38(Ref.ObjectRef objectRef, TextView textView, final EquityDollarOrderFragment equityDollarOrderFragment, TextView textView2, View view, final EquityDollarOrderViewState state) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(state, "state");
        ViewGroup viewGroup = (ViewGroup) objectRef.element;
        if (viewGroup != null) {
            viewGroup.setVisibility(!state.isCancelPendingCryptoOrdersLoading() ? 0 : 8);
        }
        if (textView != null) {
            StringResource actionOrderTypeText = state.getActionOrderTypeText();
            if (actionOrderTypeText != null) {
                Resources resources = equityDollarOrderFragment.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = actionOrderTypeText.getText(resources);
            } else {
                text = null;
            }
            textView.setText(text);
        }
        if (textView2 != null) {
            Resources resources2 = equityDollarOrderFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            TextViewsKt.setVisibilityText(textView2, state.getActionOrderLabelText(resources2));
        }
        if (view != null) {
            view.setVisibility(state.getReviewing() ? 8 : 0);
        }
        if (view != null) {
            OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityDollarOrderFragment.configureToolbar$lambda$38$lambda$37(state, equityDollarOrderFragment);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$38$lambda$37(EquityDollarOrderViewState equityDollarOrderViewState, EquityDollarOrderFragment equityDollarOrderFragment) {
        com.robinhood.rosetta.eventlogging.Context orNull = equityDollarOrderViewState.getLoggingEquityOrderContext().getOrNull();
        if (orNull != null) {
            EventLogger.DefaultImpls.logTap$default(equityDollarOrderFragment.getEventLogger(), null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "equity_order_type_menu_open", null, 4, null), null, orNull, false, 41, null);
        }
        String accountNumber = equityDollarOrderViewState.getAccountNumber();
        if (accountNumber != null) {
            EquityOrderCallbacks.DefaultImpls.startOrderSelectMenu$default(equityDollarOrderFragment.getCallbacks(), accountNumber, null, 2, null);
        }
        return Unit.INSTANCE;
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
        getDuxo().setAccountNumber(accountNumber, true, ((Args) INSTANCE.getArgs((Fragment) this)).getSide());
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
        getDuxo().setAccountNumber(accountNumber, false, ((Args) INSTANCE.getArgs((Fragment) this)).getSide());
    }

    @Override // com.robinhood.android.trade.equity.ui.dialog.BuySellOrderOnboardingBottomSheet.Callbacks
    public void onDismissBuySellOrderOnboarding() {
        getDuxo().markBuySellOrderOnboardingSeen();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onSwipeToSubmitAnimationStart(long duration) {
        getDuxo().logSwipeToSubmit();
        super.onSwipeToSubmitAnimationStart(duration);
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

    public static /* synthetic */ void handleDuxoEvents$feature_trade_equity_externalDebug$default(EquityDollarOrderFragment equityDollarOrderFragment, EquityOrderEvent.Dollar dollar, FragmentActivity fragmentActivity, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            fragmentActivity = equityDollarOrderFragment.requireActivity();
        }
        equityDollarOrderFragment.handleDuxoEvents$feature_trade_equity_externalDebug(dollar, fragmentActivity);
    }

    public final void handleDuxoEvents$feature_trade_equity_externalDebug(final EquityOrderEvent.Dollar event, FragmentActivity activity) throws Resources.NotFoundException {
        SilentEquityOrderChecksAlert silentAlert;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (event instanceof EquityOrderEvent.Dollar.OrderSubmittedEvent) {
            SubmitOrderService.Companion companion = SubmitOrderService.INSTANCE;
            EquityOrderEvent.Dollar.OrderSubmittedEvent orderSubmittedEvent = (EquityOrderEvent.Dollar.OrderSubmittedEvent) event;
            String symbol = orderSubmittedEvent.getOrderContext().getSymbol();
            EquityOrderSide side = orderSubmittedEvent.getOrderContext().getSide();
            Companion companion2 = INSTANCE;
            companion.start(activity, symbol, side, ((Args) companion2.getArgs((Fragment) this)).getInstrumentId(), orderSubmittedEvent.getOrderContext().getAccountNumber(), ((Args) companion2.getArgs((Fragment) this)).getCompletionUrl());
            return;
        }
        if (event instanceof EquityOrderEvent.Dollar.ConvertToSharesEvent) {
            getCallbacks().setOrderConfiguration(((EquityOrderEvent.Dollar.ConvertToSharesEvent) event).getConfiguration());
            return;
        }
        if (event instanceof EquityOrderEvent.Dollar.ConvertToSharesAmountEvent) {
            getCallbacks().setOrderConfiguration(((EquityOrderEvent.Dollar.ConvertToSharesAmountEvent) event).getConfiguration());
            return;
        }
        if (event instanceof EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent) {
            getDuxo().markAdtBottomSheetSeen();
            BaseOrderFragments.consumeAdtOnboardingEvent(this, ((EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent) event).getSheetId(), new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityDollarOrderFragment.handleDuxoEvents$lambda$40(this.f$0, event);
                }
            }, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityDollarOrderFragment.handleDuxoEvents$lambda$41(this.f$0);
                }
            });
            return;
        }
        if (event instanceof EquityOrderEvent.Dollar.InputErrorEvent) {
            StringResource errorMessage = ((EquityOrderEvent.Dollar.InputErrorEvent) event).getErrorMessage();
            if (errorMessage != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                CharSequence text = errorMessage.getText(resources);
                if (text != null) {
                    final RhTextView rhTextView = getMergeBindings().dollarInputErrorTxt;
                    rhTextView.setText(text);
                    rhTextView.setAlpha(1.0f);
                    Intrinsics.checkNotNull(rhTextView);
                    rhTextView.setVisibility(0);
                    rhTextView.animate().withEndAction(new Runnable() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$handleDuxoEvents$3$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            RhTextView rhTextView2 = rhTextView;
                            Intrinsics.checkNotNull(rhTextView2);
                            rhTextView2.setVisibility(8);
                        }
                    }).setStartDelay(2000L).setDuration(500L).alpha(0.0f).start();
                    rhTextView.announceForAccessibility(rhTextView.getText());
                }
            }
            AnimationUtils animationUtils = AnimationUtils.INSTANCE;
            TickerInputView dollarInputView = getMergeBindings().dollarInputView;
            Intrinsics.checkNotNullExpressionValue(dollarInputView, "dollarInputView");
            AnimationUtils.animateErrorShake$default(animationUtils, dollarInputView, 0L, 0.05f, 1, null);
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
        if (event instanceof EquityOrderEvent.CheckForceSuitabilityOnAccountSwitchedEvent) {
            AccountSwitcherSuitabilityDialogFragment accountSwitcherSuitabilityDialogFragment = (AccountSwitcherSuitabilityDialogFragment) AccountSwitcherSuitabilityDialogFragment.INSTANCE.newInstance((Parcelable) new AccountSwitcherSuitabilityDialogFragment.Args(((EquityOrderEvent.CheckForceSuitabilityOnAccountSwitchedEvent) event).getAccountNumber()));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            accountSwitcherSuitabilityDialogFragment.show(childFragmentManager, "account-switching-suitability-check");
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
                RhDialogFragment.Companion companion3 = RhDialogFragment.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder title = companion3.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C12914R.string.cancel_pending_crypto_orders_error_title, new Object[0]);
                StringResource description = cancelPendingCryptoOrderEvent.getDescription();
                Intrinsics.checkNotNull(description);
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                RhDialogFragment.Builder positiveButton = title.setMessage(description.getText(resources2)).setPositiveButton(C12914R.string.cancel_pending_crypto_orders_equity_error_cta, new Object[0]);
                FragmentManager supportFragmentManager = requireBaseActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "cancelPendingCryptoOrdersError", false, 4, null);
                return;
            }
            return;
        }
        if (event instanceof EquityOrderEvent.Dollar.QuickTradeLoadedEvent) {
            FrameLayout ctaContainer = getFragmentBindings().ctaContainer;
            Intrinsics.checkNotNullExpressionValue(ctaContainer, "ctaContainer");
            ctaContainer.setVisibility(!getReviewing() ? 0 : 8);
            toggleQuickTrade(((EquityOrderEvent.Dollar.QuickTradeLoadedEvent) event).getCanShowReviewButton(), false);
            return;
        }
        if (event instanceof EquityOrderEvent.Dollar.QuickTradeToggledEvent) {
            toggleQuickTrade(((EquityOrderEvent.Dollar.QuickTradeToggledEvent) event).getCanShowReviewButton(), true);
            return;
        }
        if (event instanceof EquityOrderEvent.BuySellOrderOnboardingEvent) {
            BuySellOrderOnboardingBottomSheet buySellOrderOnboardingBottomSheet = (BuySellOrderOnboardingBottomSheet) BuySellOrderOnboardingBottomSheet.INSTANCE.newInstance((Parcelable) new BuySellOrderOnboardingBottomSheet.Args(((EquityOrderEvent.BuySellOrderOnboardingEvent) event).getOnboardingResponse()));
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            buySellOrderOnboardingBottomSheet.show(childFragmentManager2, "buySellOrderOnboarding");
            return;
        }
        if (event instanceof EquityOrderEvent.AccountSwitcherRefreshedEvent) {
            EquityOrderEvent.AccountSwitcherRefreshedEvent accountSwitcherRefreshedEvent = (EquityOrderEvent.AccountSwitcherRefreshedEvent) event;
            if (accountSwitcherRefreshedEvent.getData() != null) {
                AccountSwitcherData data = accountSwitcherRefreshedEvent.getData();
                Intrinsics.checkNotNull(data);
                onAccountSwitcherCtaClicked(data);
                return;
            } else {
                if (accountSwitcherRefreshedEvent.getError() != null) {
                    ActivityErrorHandler activityErrorHandler2 = getActivityErrorHandler();
                    Throwable error3 = accountSwitcherRefreshedEvent.getError();
                    Intrinsics.checkNotNull(error3);
                    AbsErrorHandler.handleError$default(activityErrorHandler2, error3, false, 2, null);
                    return;
                }
                return;
            }
        }
        if (event instanceof EquityOrderEvent.ChangeOrderConfiguration) {
            getCallbacks().setOrderConfiguration(((EquityOrderEvent.ChangeOrderConfiguration) event).getConfiguration());
        } else {
            if (!(event instanceof EquityOrderEvent.Exit)) {
                throw new NoWhenBranchMatchedException();
            }
            requireActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDuxoEvents$lambda$40(EquityDollarOrderFragment equityDollarOrderFragment, EquityOrderEvent.Dollar dollar) {
        equityDollarOrderFragment.getFragmentBindings().orderTypeOnboardingTooltip.setAdtTooltipShown();
        EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent twentyFourHourMarketOnboardingBottomSheetEvent = (EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent) dollar;
        EquityDollarOrderDuxo.startLimitOrderFlow$default(equityDollarOrderFragment.getDuxo(), twentyFourHourMarketOnboardingBottomSheetEvent.getAccountNumber(), twentyFourHourMarketOnboardingBottomSheetEvent.getQuantityOrAmount().shareQuantityOrNull(), null, OrderMarketHours.ALL_DAY_HOURS, null, 20, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDuxoEvents$lambda$41(EquityDollarOrderFragment equityDollarOrderFragment) {
        equityDollarOrderFragment.getFragmentBindings().orderTypeOnboardingTooltip.enableAdtTooltip();
        return Unit.INSTANCE;
    }

    /* compiled from: EquityDollarOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JQ\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment$Args;", "Landroid/os/Parcelable;", "completionUrl", "", "initialAccountNumber", "instrumentId", "Ljava/util/UUID;", "isPreIpo", "", "orderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ZLcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;)V", "getCompletionUrl", "()Ljava/lang/String;", "getInitialAccountNumber", "getInstrumentId", "()Ljava/util/UUID;", "()Z", "getOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String completionUrl;
        private final EquityOrderFlowSource flowSource;
        private final String initialAccountNumber;
        private final UUID instrumentId;
        private final boolean isPreIpo;
        private final DollarBased orderConfiguration;
        private final EquityOrderSide side;

        /* compiled from: EquityDollarOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), (UUID) parcel.readSerializable(), parcel.readInt() != 0, (DollarBased) parcel.readParcelable(Args.class.getClassLoader()), EquityOrderSide.valueOf(parcel.readString()), EquityOrderFlowSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, UUID uuid, boolean z, DollarBased dollarBased, EquityOrderSide equityOrderSide, EquityOrderFlowSource equityOrderFlowSource, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.completionUrl;
            }
            if ((i & 2) != 0) {
                str2 = args.initialAccountNumber;
            }
            if ((i & 4) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 8) != 0) {
                z = args.isPreIpo;
            }
            if ((i & 16) != 0) {
                dollarBased = args.orderConfiguration;
            }
            if ((i & 32) != 0) {
                equityOrderSide = args.side;
            }
            if ((i & 64) != 0) {
                equityOrderFlowSource = args.flowSource;
            }
            EquityOrderSide equityOrderSide2 = equityOrderSide;
            EquityOrderFlowSource equityOrderFlowSource2 = equityOrderFlowSource;
            DollarBased dollarBased2 = dollarBased;
            UUID uuid2 = uuid;
            return args.copy(str, str2, uuid2, z, dollarBased2, equityOrderSide2, equityOrderFlowSource2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCompletionUrl() {
            return this.completionUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsPreIpo() {
            return this.isPreIpo;
        }

        /* renamed from: component5, reason: from getter */
        public final DollarBased getOrderConfiguration() {
            return this.orderConfiguration;
        }

        /* renamed from: component6, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component7, reason: from getter */
        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        public final Args copy(String completionUrl, String initialAccountNumber, UUID instrumentId, boolean isPreIpo, DollarBased orderConfiguration, EquityOrderSide side, EquityOrderFlowSource flowSource) {
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            return new Args(completionUrl, initialAccountNumber, instrumentId, isPreIpo, orderConfiguration, side, flowSource);
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
            return Intrinsics.areEqual(this.completionUrl, args.completionUrl) && Intrinsics.areEqual(this.initialAccountNumber, args.initialAccountNumber) && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.isPreIpo == args.isPreIpo && Intrinsics.areEqual(this.orderConfiguration, args.orderConfiguration) && this.side == args.side && this.flowSource == args.flowSource;
        }

        public int hashCode() {
            String str = this.completionUrl;
            return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.initialAccountNumber.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + Boolean.hashCode(this.isPreIpo)) * 31) + this.orderConfiguration.hashCode()) * 31) + this.side.hashCode()) * 31) + this.flowSource.hashCode();
        }

        public String toString() {
            return "Args(completionUrl=" + this.completionUrl + ", initialAccountNumber=" + this.initialAccountNumber + ", instrumentId=" + this.instrumentId + ", isPreIpo=" + this.isPreIpo + ", orderConfiguration=" + this.orderConfiguration + ", side=" + this.side + ", flowSource=" + this.flowSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.completionUrl);
            dest.writeString(this.initialAccountNumber);
            dest.writeSerializable(this.instrumentId);
            dest.writeInt(this.isPreIpo ? 1 : 0);
            dest.writeParcelable(this.orderConfiguration, flags);
            dest.writeString(this.side.name());
            dest.writeString(this.flowSource.name());
        }

        public Args(String str, String initialAccountNumber, UUID instrumentId, boolean z, DollarBased orderConfiguration, EquityOrderSide side, EquityOrderFlowSource flowSource) {
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            this.completionUrl = str;
            this.initialAccountNumber = initialAccountNumber;
            this.instrumentId = instrumentId;
            this.isPreIpo = z;
            this.orderConfiguration = orderConfiguration;
            this.side = side;
            this.flowSource = flowSource;
        }

        public final String getCompletionUrl() {
            return this.completionUrl;
        }

        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final boolean isPreIpo() {
            return this.isPreIpo;
        }

        public final DollarBased getOrderConfiguration() {
            return this.orderConfiguration;
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }
    }

    /* compiled from: EquityDollarOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment$Args;", "<init>", "()V", "ERROR_ANIMATION_START_DELAY_MS", "", "ERROR_ANIMATION_DURATION_MS", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EquityDollarOrderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EquityDollarOrderFragment equityDollarOrderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, equityDollarOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EquityDollarOrderFragment newInstance(Args args) {
            return (EquityDollarOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EquityDollarOrderFragment equityDollarOrderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, equityDollarOrderFragment, args);
        }
    }
}
