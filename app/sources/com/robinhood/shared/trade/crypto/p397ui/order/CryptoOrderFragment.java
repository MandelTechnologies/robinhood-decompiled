package com.robinhood.shared.trade.crypto.p397ui.order;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.R$attr;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.fragment.DialogFragments;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.serverdriven.experimental.api.CryptoValidateOrderAction;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderComposable4;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresComposable3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRow3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity;
import com.robinhood.shared.trade.crypto.activity.CryptoOrderSubmissionFailureCallbacks;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoOrderBinding;
import com.robinhood.shared.trade.crypto.databinding.MergeCryptoOrderBinding;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownArgs;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownComposable;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider4;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderEvent;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderFragment;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderViewState;
import com.robinhood.shared.trade.crypto.p397ui.tooltip.CryptoOrderTooltipData;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.validation.CryptoSduiOrderValidationAlertDialogFragment;
import com.robinhood.shared.trade.crypto.p397ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2;
import com.robinhood.shared.trade.crypto.views.PerspectiveTranslateLayout;
import com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountInputView;
import com.robinhood.tooltips.TooltipActivity;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.tooltips.TooltipData2;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponseDto;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0093\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0006\u0091\u0001\u0092\u0001\u0093\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010X\u001a\u00020UH\u0016J\u001a\u0010Y\u001a\u00020U2\u0006\u0010Z\u001a\u00020[2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010\\\u001a\u00020UH\u0016J\b\u0010]\u001a\u00020UH\u0016J\u0010\u0010^\u001a\u00020U2\u0006\u0010_\u001a\u000201H\u0002J\u0010\u0010`\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0002H\u0016J\u0018\u0010b\u001a\u00020U2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020dH\u0016J\u0010\u0010f\u001a\u00020U2\u0006\u0010g\u001a\u00020hH\u0002J\u0010\u0010i\u001a\u00020U2\u0006\u0010j\u001a\u00020kH\u0002J\u0010\u0010l\u001a\u00020U2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010m\u001a\u00020UH\u0016J\u0010\u0010n\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0002H\u0002J\u0010\u0010o\u001a\u00020U2\u0006\u0010a\u001a\u00020\u0002H\u0002J\b\u0010p\u001a\u00020UH\u0016J\u0010\u0010q\u001a\u00020.2\u0006\u0010a\u001a\u00020\u0002H\u0016J\u0010\u0010r\u001a\u00020U2\u0006\u0010s\u001a\u00020tH\u0016J\b\u0010u\u001a\u00020UH\u0016J\b\u0010v\u001a\u00020UH\u0016J\"\u0010w\u001a\u0002012\u0006\u0010x\u001a\u00020*2\b\u0010y\u001a\u0004\u0018\u00010W2\u0006\u0010z\u001a\u00020{H\u0016J\u0010\u0010|\u001a\u00020U2\u0006\u0010}\u001a\u00020~H\u0016J\b\u0010\u007f\u001a\u00020UH\u0016J\t\u0010\u0080\u0001\u001a\u00020UH\u0002J\u001b\u0010\u0081\u0001\u001a\u00020U2\u0007\u0010\u0082\u0001\u001a\u00020{2\u0007\u0010\u0083\u0001\u001a\u000201H\u0002J\u0011\u0010|\u001a\u00020U2\u0007\u0010}\u001a\u00030\u0084\u0001H\u0016J\u0012\u0010\u0085\u0001\u001a\u00020U2\u0007\u0010\u0086\u0001\u001a\u00020{H\u0016J\u001a\u0010\u0087\u0001\u001a\u00020U2\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u0001H\u0002J\n\u0010\u008b\u0001\u001a\u000201H\u0096\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010,R\u0014\u00106\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010,R\u0014\u00108\u001a\u0002018TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b9\u00103R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010A\u001a\u00020*2\u0006\u0010@\u001a\u00020*8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bB\u0010,\"\u0004\bC\u0010DR\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010OX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\u00020Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001d\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0094\u0001"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderSubmissionFailureCallbacks;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "fragmentBinding", "Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoOrderBinding;", "getFragmentBinding", "()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoOrderBinding;", "fragmentBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "contentBinding", "Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoOrderBinding;", "getContentBinding", "()Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoOrderBinding;", "contentBinding$delegate", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo;", "getDuxo", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "reviewingConstraintLayoutRes", "", "getReviewingConstraintLayoutRes", "()I", "initialConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "reviewingConstraints", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "initialLayoutRes", "getInitialLayoutRes", "contentRes", "getContentRes", "usePrimaryColorBackground", "getUsePrimaryColorBackground", "orderState", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;", "toolbarContent", "Landroid/view/ViewGroup;", "toolbarText", "Lcom/robinhood/android/designsystem/text/RhTextView;", "<set-?>", "cardViewBottomY", "getCardViewBottomY", "setCardViewBottomY", "(I)V", "cardViewBottomY$delegate", "Landroidx/compose/runtime/MutableIntState;", "loggingCryptoOrderContextRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "validationAlertDialogFragment", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment;", "validationAlertDialogFragmentV2", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onStop", "initializeNumpad", "isAccessibilityEnabled", "onFormStateChanged", "formState", "onAnimationStep", "ratio", "", "maxDragDistance", "bindViewState", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;", "handleEvent", "event", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderEvent;", "bindOrderState", "setFormStateToEditing", "bindFormState", "setBackgroundColor", "onFormStateUpdated", "getConstraintsForState", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "validateAndReviewOrder", "performSubmitOrder", "onLinkTextClicked", "id", "passthroughArgs", "url", "", "handleAction", "action", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "convertToRebateOrder", "displayCryptoFeeTooltip", "applyFeeUnsupportedForCurrencyPairUiTreatment", "assetCurrencyCode", "isRebateMarketMakersSupported", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto;", "handleDeeplink", "uri", "handleSideEffects", "sideEffects", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderFragment extends BaseOrderFragment<DefaultOrderState> implements CryptoOrderSubmissionFailureCallbacks, CryptoSduiOrderValidationAlertDialogFragment.Callbacks, CryptoSduiOrderValidationAlertDialogFragmentV2.Callbacks, RegionGated {
    private static final String ORDER_TYPE_SELECTOR_TOOLTIP = "crypto_order_type_selector_tooltip";
    private static final String TAG_FEE_DEF_BOTTOM_SHEET = "cryptoFeeDefinitionBottomSheet";
    private static final String TAG_MICROGRAM_ORDER_VALIDATION_ALERT = "microgramOrderValidationAlert";
    private static final String TAG_ORDER_VALIDATION_ALERT = "orderValidationAlert";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: cardViewBottomY$delegate, reason: from kotlin metadata */
    private final SnapshotIntState2 cardViewBottomY;

    /* renamed from: contentBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 contentBinding;
    private CryptoOrderContext cryptoOrderContext;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: fragmentBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 fragmentBinding;
    private final ConstraintSet initialConstraints;
    private final PublishRelay<com.robinhood.rosetta.eventlogging.CryptoOrderContext> loggingCryptoOrderContextRelay;
    private CryptoOrderViewState.OrderState orderState;
    private final ConstraintSet reviewingConstraints;
    private ViewGroup toolbarContent;
    private RhTextView toolbarText;
    private CryptoSduiOrderValidationAlertDialogFragment validationAlertDialogFragment;
    private CryptoSduiOrderValidationAlertDialogFragmentV2 validationAlertDialogFragmentV2;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoOrderFragment.class, "fragmentBinding", "getFragmentBinding()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CryptoOrderFragment.class, "contentBinding", "getContentBinding()Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CryptoOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[CryptoOrderType.values().length];
            try {
                iArr2[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    protected boolean getUsePrimaryColorBackground() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CryptoOrderFragment() {
        super(DefaultOrderState.EDITING);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.fragmentBinding = ViewBinding5.viewBinding(this, CryptoOrderFragment6.INSTANCE);
        this.contentBinding = ViewBinding5.viewBinding(this, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderFragment.contentBinding_delegate$lambda$0(this.f$0, (View) obj);
            }
        });
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CryptoOrderFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, CryptoOrderDuxo.class);
        this.initialConstraints = new ConstraintSet();
        this.reviewingConstraints = new ConstraintSet();
        this.cardViewBottomY = SnapshotIntState3.mutableIntStateOf(0);
        PublishRelay<com.robinhood.rosetta.eventlogging.CryptoOrderContext> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.loggingCryptoOrderContextRelay = publishRelayCreate;
    }

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0003H&¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment$Callbacks;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "showQuoteTickerOrderFragment", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "convertToLimitOrder", "replaceWithoutBackStack", "", "convertToStopOrder", "convertToStopLimitOrder", "stopPrice", "Ljava/math/BigDecimal;", "showOrderTypeSelector", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "isRecurringOrder", "onReviewStateChanged", "reviewing", "onOrderTypeInfoClicked", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "cancelTradeFlow", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseOrderFragment.Callbacks {
        void cancelTradeFlow();

        void convertToLimitOrder(boolean replaceWithoutBackStack);

        void convertToStopLimitOrder(BigDecimal stopPrice, boolean replaceWithoutBackStack);

        void convertToStopOrder(boolean replaceWithoutBackStack);

        void onOrderTypeInfoClicked(Order.Configuration configuration, OrderSide orderSide);

        void onReviewStateChanged(boolean reviewing);

        void showOrderTypeSelector(CryptoOrderType orderType, boolean isRecurringOrder);

        void showQuoteTickerOrderFragment(UiCurrencyPair uiCurrencyPair);

        /* compiled from: CryptoOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void convertToLimitOrder$default(Callbacks callbacks, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertToLimitOrder");
                }
                if ((i & 1) != 0) {
                    z = false;
                }
                callbacks.convertToLimitOrder(z);
            }

            public static /* synthetic */ void convertToStopOrder$default(Callbacks callbacks, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertToStopOrder");
                }
                if ((i & 1) != 0) {
                    z = false;
                }
                callbacks.convertToStopOrder(z);
            }

            public static /* synthetic */ void convertToStopLimitOrder$default(Callbacks callbacks, BigDecimal bigDecimal, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertToStopLimitOrder");
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                callbacks.convertToStopLimitOrder(bigDecimal, z);
            }
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getEventScreen() {
        return getDuxo().getEventScreen();
    }

    private final FragmentCryptoOrderBinding getFragmentBinding() {
        Object value = this.fragmentBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCryptoOrderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MergeCryptoOrderBinding contentBinding_delegate$lambda$0(CryptoOrderFragment cryptoOrderFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MergeCryptoOrderBinding.bind(cryptoOrderFragment.getFragmentBinding().content);
    }

    private final MergeCryptoOrderBinding getContentBinding() {
        return (MergeCryptoOrderBinding) this.contentBinding.getValue(this, $$delegatedProperties[1]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoOrderDuxo getDuxo() {
        return (CryptoOrderDuxo) this.duxo.getValue();
    }

    private final int getReviewingConstraintLayoutRes() {
        return C40095R.layout.fragment_crypto_order_reviewing;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return C40095R.layout.fragment_crypto_order;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return C40095R.layout.merge_crypto_order;
    }

    private final int getCardViewBottomY() {
        return this.cardViewBottomY.getIntValue();
    }

    private final void setCardViewBottomY(int i) {
        this.cardViewBottomY.setIntValue(i);
    }

    private final TooltipManager getTooltipManager() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        Intrinsics.checkNotNull(componentRequireActivity, "null cannot be cast to non-null type com.robinhood.tooltips.TooltipActivity");
        return ((TooltipActivity) componentRequireActivity).getTooltipManager();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        Intrinsics.checkNotNull(baseActivityRequireBaseActivity, "null cannot be cast to non-null type com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity");
        ((CryptoOrderActivity) baseActivityRequireBaseActivity).setOrderSubmissionFailureCallbacks(this);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        Intrinsics.checkNotNull(baseActivityRequireBaseActivity, "null cannot be cast to non-null type com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity");
        ((CryptoOrderActivity) baseActivityRequireBaseActivity).removeOrderSubmissionFailureCallbacks(this);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        this.initialConstraints.clone(getRoot());
        this.reviewingConstraints.clone(getActivity(), getReviewingConstraintLayoutRes());
        RdsButton cryptoSellAllBtn = getFragmentBinding().cryptoSellAllBtn;
        Intrinsics.checkNotNullExpressionValue(cryptoSellAllBtn, "cryptoSellAllBtn");
        OnClickListeners.onClick(cryptoSellAllBtn, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        Observable<Optional<BigDecimal>> observableDistinctUntilChanged = getContentBinding().cryptoAmountEdt.getAmountChanges().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderFragment.onViewCreated$lambda$2(this.f$0, (Optional) obj);
            }
        });
        getCardView().setBackground(requireContext().getDrawable(C40095R.drawable.bottom_rounded_corner_background));
        setBackgroundColor(getFormState());
        LifecycleHost.DefaultImpls.bind$default(this, requireBaseActivity().getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderFragment.onViewCreated$lambda$3(this.f$0, (DayNightOverlay) obj);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C403194(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C403205(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CryptoOrderFragment cryptoOrderFragment) {
        cryptoOrderFragment.getDuxo().sellAll();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(CryptoOrderFragment cryptoOrderFragment, Optional optional) {
        cryptoOrderFragment.getDuxo().onAmountChanged((BigDecimal) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(CryptoOrderFragment cryptoOrderFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoOrderFragment.setBackgroundColor(cryptoOrderFragment.getFormState());
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onViewCreated$4", m3645f = "CryptoOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onViewCreated$4 */
    static final class C403194 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403194(Continuation<? super C403194> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderFragment.this.new C403194(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403194) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onViewCreated$4$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoOrderFragment $tmp0;

            AnonymousClass1(CryptoOrderFragment cryptoOrderFragment) {
                this.$tmp0 = cryptoOrderFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoOrderFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(CryptoOrderViewState cryptoOrderViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bindViewState = C403194.invokeSuspend$bindViewState(this.$tmp0, cryptoOrderViewState, continuation);
                return objInvokeSuspend$bindViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((CryptoOrderViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CryptoOrderViewState> stateFlow = CryptoOrderFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$bindViewState(CryptoOrderFragment cryptoOrderFragment, CryptoOrderViewState cryptoOrderViewState, Continuation continuation) {
            cryptoOrderFragment.bindViewState(cryptoOrderViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onViewCreated$5", m3645f = "CryptoOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onViewCreated$5 */
    static final class C403205 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403205(Continuation<? super C403205> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderFragment.this.new C403205(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403205) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoOrderFragment.this.getDuxo().getEventFlow());
                final CryptoOrderFragment cryptoOrderFragment = CryptoOrderFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.onViewCreated.5.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<CryptoOrderEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<CryptoOrderEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<CryptoOrderEvent> eventConsumerInvoke;
                        final CryptoOrderFragment cryptoOrderFragment2 = cryptoOrderFragment;
                        if ((event.getData() instanceof CryptoOrderEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onViewCreated$5$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m25859invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25859invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    cryptoOrderFragment2.handleEvent((CryptoOrderEvent) event.getData());
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().observeOrderState()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C403141(this));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().observeFormState()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C403152(this));
        Observables observables = Observables.INSTANCE;
        Observable map = asObservable(getDuxo().getStateFlow()).map(new io.reactivex.functions.Function() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.onStart.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CryptoOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getInputState().getAllowDecimalInput());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = observables.combineLatest(map, getContentBinding().cryptoAmountEdt.isDecimalSeparatorEnabledChanges()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderFragment.onStart$lambda$4(this.f$0, (Tuples2) obj);
            }
        });
        Observable<com.robinhood.rosetta.eventlogging.CryptoOrderContext> observableTake = this.loggingCryptoOrderContextRelay.distinctUntilChanged().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderFragment.onStart$lambda$5(this.f$0, (com.robinhood.rosetta.eventlogging.CryptoOrderContext) obj);
            }
        });
        getLifecycleScope().launchWhenResumed(new C403176(null));
    }

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onStart$1 */
    /* synthetic */ class C403141 extends FunctionReferenceImpl implements Function1<CryptoOrderViewState.OrderState, Unit> {
        C403141(Object obj) {
            super(1, obj, CryptoOrderFragment.class, "bindOrderState", "bindOrderState(Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderViewState$OrderState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CryptoOrderViewState.OrderState orderState) {
            invoke2(orderState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CryptoOrderViewState.OrderState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CryptoOrderFragment) this.receiver).bindOrderState(p0);
        }
    }

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onStart$2 */
    /* synthetic */ class C403152 extends FunctionReferenceImpl implements Function1<DefaultOrderState, Unit> {
        C403152(Object obj) {
            super(1, obj, CryptoOrderFragment.class, "bindFormState", "bindFormState(Lcom/robinhood/android/lib/trade/DefaultOrderState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DefaultOrderState defaultOrderState) {
            invoke2(defaultOrderState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DefaultOrderState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CryptoOrderFragment) this.receiver).bindFormState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(CryptoOrderFragment cryptoOrderFragment, Tuples2 tuples2) {
        cryptoOrderFragment.getFragmentBinding().numpad.setDelimiterEnabled(((Boolean) tuples2.component1()).booleanValue() && ((Boolean) tuples2.component2()).booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(CryptoOrderFragment cryptoOrderFragment, com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext) {
        EventLogger.DefaultImpls.logScreenAppear$default(cryptoOrderFragment.getEventLogger(), null, cryptoOrderFragment.getEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoOrderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onStart$6", m3645f = "CryptoOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onStart$6 */
    static final class C403176 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403176(Continuation<? super C403176> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderFragment.this.new C403176(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403176) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onStart$6$1", m3645f = "CryptoOrderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onStart$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderFragment cryptoOrderFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderFragment;
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

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.initializeNumpad(this.Z$0);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamKeyInputAccessibilityEnabled = CryptoOrderFragment.this.getRhAccessibilityManager().streamKeyInputAccessibilityEnabled();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamKeyInputAccessibilityEnabled, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403181(null), 3, null);
    }

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onStop$1", m3645f = "CryptoOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$onStop$1 */
    static final class C403181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403181(Continuation<? super C403181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderFragment.this.new C403181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objFirst;
            CryptoOrderContext cryptoOrderContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CryptoOrderViewState> stateFlow = CryptoOrderFragment.this.getDuxo().getStateFlow();
                this.label = 1;
                objFirst = FlowKt.first(stateFlow, this);
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
            CryptoOrderViewState.OrderState orderState = ((CryptoOrderViewState) objFirst).getOrderState();
            EventLogger.DefaultImpls.logScreenDisappear$default(CryptoOrderFragment.this.getEventLogger(), null, CryptoOrderFragment.this.getEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (orderState == null || (cryptoOrderContext = orderState.getCryptoOrderContext()) == null) ? null : cryptoOrderContext.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeNumpad(boolean isAccessibilityEnabled) {
        Context context = getContext();
        InputMethodManager inputMethodManager = context != null ? (InputMethodManager) ContextCompat.getSystemService(context, InputMethodManager.class) : null;
        if (isAccessibilityEnabled) {
            RdsNumpadView numpad = getFragmentBinding().numpad;
            Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
            numpad.setVisibility(8);
            Space numpadTopSpaceDupe = getFragmentBinding().numpadTopSpaceDupe;
            Intrinsics.checkNotNullExpressionValue(numpadTopSpaceDupe, "numpadTopSpaceDupe");
            numpadTopSpaceDupe.setVisibility(0);
            getContentBinding().cryptoAmountEdt.setUseCustomNumpad(false);
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(getContentBinding().cryptoAmountEdt, 0);
                return;
            }
            return;
        }
        RdsNumpadView numpad2 = getFragmentBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad2, "numpad");
        numpad2.setVisibility(0);
        Space numpadTopSpaceDupe2 = getFragmentBinding().numpadTopSpaceDupe;
        Intrinsics.checkNotNullExpressionValue(numpadTopSpaceDupe2, "numpadTopSpaceDupe");
        numpadTopSpaceDupe2.setVisibility(8);
        getContentBinding().cryptoAmountEdt.setUseCustomNumpad(true);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getFragmentBinding().getRoot().getWindowToken(), 0);
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateChanged(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        super.onFormStateChanged((CryptoOrderFragment) formState);
        setBackgroundColor(formState);
        int i = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
        if (i == 1) {
            requireBaseActivity().showCloseIcon();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            requireBaseActivity().showBackArrowIcon();
        }
        ScarletManager2.overrideAttribute(requireToolbar().getToolbar(), R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getCOLOR_POSITIVE());
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onAnimationStep(float ratio, float maxDragDistance) {
        super.onAnimationStep(ratio, maxDragDistance);
        float f = ratio * maxDragDistance * (-1);
        setCardViewBottomY(Math.max(0, (int) getCardView().getY()) + getCardView().getHeight() + ((int) f));
        getFragmentBinding().rebrandUnderlay.setTranslationY(Math.min(0.0f, f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(final CryptoOrderViewState viewState) {
        RhTextView rhTextView;
        TooltipData.Target target;
        CryptoOrderContext cryptoOrderContext;
        com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext;
        CryptoOrderViewState.OrderState orderState = viewState.getOrderState();
        this.cryptoOrderContext = orderState != null ? orderState.getCryptoOrderContext() : null;
        CryptoOrderViewState.OrderState orderState2 = viewState.getOrderState();
        if (orderState2 != null && (cryptoOrderContext = orderState2.getCryptoOrderContext()) != null && (loggingCryptoOrderContext = cryptoOrderContext.getLoggingCryptoOrderContext()) != null) {
            this.loggingCryptoOrderContextRelay.accept(loggingCryptoOrderContext);
        }
        getDuxo().emitBottomSheetData(viewState.getBottomSheetTypeDtos());
        getContentBinding().cryptoOrderHeaderComposeView.setContent(ComposableLambda3.composableLambdaInstance(878421035, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.2
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
                    ComposerKt.traceEventStart(878421035, i, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.<anonymous> (CryptoOrderFragment.kt:312)");
                }
                ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(CryptoOrderFragment.this.getNavigator());
                final CryptoOrderViewState cryptoOrderViewState = viewState;
                CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1882421099, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.2.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1882421099, i2, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.<anonymous>.<anonymous> (CryptoOrderFragment.kt:313)");
                        }
                        final CryptoOrderViewState cryptoOrderViewState2 = cryptoOrderViewState;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-515930445, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.2.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-515930445, i3, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous> (CryptoOrderFragment.kt:314)");
                                }
                                CryptoOrderHeaderComposable4.CryptoOrderHeaderComposable(cryptoOrderViewState2.getCryptoOrderHeaderState$feature_trade_crypto_externalDebug(), null, null, composer3, CryptoOrderHeaderState.$stable, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        RhTextView rhTextView2 = this.toolbarText;
        if (rhTextView2 != null) {
            rhTextView2.setText(StringResources6.getText(this, viewState.getInputState().getToolbarTitle()));
        }
        ViewGroup viewGroup = this.toolbarContent;
        if (viewGroup != null) {
            viewGroup.setVisibility(viewState.getInputState().getIsToolbarVisible() ? 0 : 8);
        }
        ViewGroup viewGroup2 = this.toolbarContent;
        if (viewGroup2 != null) {
            OnClickListeners.onClick(viewGroup2, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderFragment.bindViewState$lambda$7(this.f$0, viewState);
                }
            });
        }
        getContentBinding().cryptoAmountLabel.setEnabled(viewState.getInputState().getIsCryptoAmountLabelEnabled());
        RhTextView rhTextView3 = getContentBinding().cryptoAmountLabel;
        CryptoOrderViewState.InputState inputState = viewState.getInputState();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rhTextView3.setText(inputState.cryptoAmountLabelText(contextRequireContext));
        RhTextView cryptoAmountLabel = getContentBinding().cryptoAmountLabel;
        Intrinsics.checkNotNullExpressionValue(cryptoAmountLabel, "cryptoAmountLabel");
        OnClickListeners.onClick(cryptoAmountLabel, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderFragment.bindViewState$lambda$8(viewState, this);
            }
        });
        getContentBinding().cryptoAmountEdt.requestInputFocus();
        getContentBinding().cryptoAmountEdt.setHint(viewState.getInputState().getCryptoAmountEdtHint());
        getContentBinding().cryptoAmountEdt.setCurrency(viewState.getInputState().getInputCurrency());
        CryptoAmountInputView.setIsAmountEnabled$default(getContentBinding().cryptoAmountEdt, viewState.getInputState().getIsCryptoAmountEdtEnabled(), false, 2, null);
        getContentBinding().cryptoAmountEdt.setCurrencySymbolPosition(viewState.getInputState().getCurrencySymbolPosition());
        final CryptoOrderReviewRowState amountRowCryptoOrderReviewRowState = viewState.getInputState().getAmountRowCryptoOrderReviewRowState();
        ComposeView amountRowComposeView = getContentBinding().amountRowComposeView;
        Intrinsics.checkNotNullExpressionValue(amountRowComposeView, "amountRowComposeView");
        amountRowComposeView.setVisibility(amountRowCryptoOrderReviewRowState != null ? 0 : 8);
        ConstraintLayout cryptoAmountRowContainer = getContentBinding().cryptoAmountRowContainer;
        Intrinsics.checkNotNullExpressionValue(cryptoAmountRowContainer, "cryptoAmountRowContainer");
        cryptoAmountRowContainer.setVisibility(amountRowCryptoOrderReviewRowState == null ? 0 : 8);
        if (amountRowCryptoOrderReviewRowState != null) {
            getContentBinding().amountRowComposeView.setContent(ComposableLambda3.composableLambdaInstance(-488335622, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$bindViewState$5$1
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
                        ComposerKt.traceEventStart(-488335622, i, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.<anonymous>.<anonymous> (CryptoOrderFragment.kt:355)");
                    }
                    final CryptoOrderReviewRowState cryptoOrderReviewRowState = amountRowCryptoOrderReviewRowState;
                    final CryptoOrderFragment cryptoOrderFragment = this;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1605965378, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$bindViewState$5$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1605965378, i2, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous> (CryptoOrderFragment.kt:356)");
                            }
                            CryptoOrderReviewRowState cryptoOrderReviewRowState2 = cryptoOrderReviewRowState;
                            CryptoOrderDuxo duxo = cryptoOrderFragment.getDuxo();
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(duxo);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new CryptoOrderFragment3(duxo);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState2, null, (Function1) ((KFunction) objRememberedValue), composer2, CryptoOrderReviewRowState.$stable, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        getContentBinding().cryptoOrderRowsComposeView.setContent(ComposableLambda3.composableLambdaInstance(308947604, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.6
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
                    ComposerKt.traceEventStart(308947604, i, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.<anonymous> (CryptoOrderFragment.kt:366)");
                }
                final CryptoOrderViewState cryptoOrderViewState = viewState;
                final CryptoOrderFragment cryptoOrderFragment = this;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-418074148, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.6.1
                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-418074148, i2, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.<anonymous>.<anonymous> (CryptoOrderFragment.kt:367)");
                        }
                        CryptoOrderViewState cryptoOrderViewState2 = cryptoOrderViewState;
                        CryptoOrderFragment cryptoOrderFragment2 = cryptoOrderFragment;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 6, 4);
                        composer2.startReplaceGroup(-1992437806);
                        for (CryptoOrderReviewRowState cryptoOrderReviewRowState : cryptoOrderViewState2.getOrderReviewRowStates()) {
                            CryptoOrderDuxo duxo = cryptoOrderFragment2.getDuxo();
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(duxo);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new CryptoOrderFragment4(duxo);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState, null, (Function1) ((KFunction) objRememberedValue), composer2, CryptoOrderReviewRowState.$stable, 2);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer, 54), composer, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getFragmentBinding().cryptoSellAllBtn.setText(StringResources6.getText(this, viewState.getInputState().getCryptoSellAllButtonText()));
        RdsButton cryptoSellAllBtn = getFragmentBinding().cryptoSellAllBtn;
        Intrinsics.checkNotNullExpressionValue(cryptoSellAllBtn, "cryptoSellAllBtn");
        cryptoSellAllBtn.setVisibility(viewState.isSellAllBtnVisible() ? 0 : 8);
        ComposeView cryptoReviewTxtComposeView = getContentBinding().cryptoReviewTxtComposeView;
        Intrinsics.checkNotNullExpressionValue(cryptoReviewTxtComposeView, "cryptoReviewTxtComposeView");
        cryptoReviewTxtComposeView.setVisibility(viewState.getInputState().getIsCryptoReviewVisible() ? 0 : 8);
        getReviewOrderBtn().setLoading(viewState.getInputState().isReviewOrderButtonLoading());
        getNumpad().setEnabled(!viewState.getInputState().isReviewOrderButtonLoading());
        final CryptoOrderTooltipData tooltipData = viewState.getInputState().getTooltipData();
        if (tooltipData != null && (rhTextView = this.toolbarText) != null && (target = TooltipData2.toTarget(rhTextView)) != null) {
            TooltipManager tooltipManager = getTooltipManager();
            StringResource text = tooltipData.getText();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            TooltipManager.DefaultImpls.addTooltip$default(tooltipManager, false, new TooltipData(ORDER_TYPE_SELECTOR_TOOLTIP, text.getText(resources), target, null, new TooltipData.Behavior(null, null, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderFragment.bindViewState$lambda$12$lambda$11$lambda$10(this.f$0, tooltipData, (View) obj);
                }
            }, null, 11, null), 8, null), 1, null);
        }
        ComposeView composeView = getContentBinding().accountSelectorComposeView;
        Intrinsics.checkNotNull(composeView);
        composeView.setVisibility(viewState.isSelectedAccountVisible() ? 0 : 8);
        if (viewState.isSelectedAccountVisible()) {
            composeView.setContent(ComposableLambda3.composableLambdaInstance(125062868, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$bindViewState$8$1
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
                        ComposerKt.traceEventStart(125062868, i, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.<anonymous>.<anonymous> (CryptoOrderFragment.kt:409)");
                    }
                    final CryptoOrderFragment cryptoOrderFragment = this.this$0;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1910151820, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$bindViewState$8$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1910151820, i2, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous> (CryptoOrderFragment.kt:410)");
                            }
                            CryptoOrderFragment.Companion companion = CryptoOrderFragment.INSTANCE;
                            CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable(new CryptoTradeAccountSwitcherDropdownArgs(((CryptoOrderFragment.Args) companion.getArgs((Fragment) cryptoOrderFragment)).getCurrencyPairId(), CryptoTradeAccountSwitcherDropdownArgs.Source.ORDER, ((CryptoOrderFragment.Args) companion.getArgs((Fragment) cryptoOrderFragment)).getSide()), null, null, composer2, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        if (viewState.getInputState().getIsToolbarVisible()) {
            return;
        }
        getTooltipManager().removeTooltip(ORDER_TYPE_SELECTOR_TOOLTIP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$7(CryptoOrderFragment cryptoOrderFragment, CryptoOrderViewState cryptoOrderViewState) {
        cryptoOrderFragment.getTooltipManager().removeTooltip(ORDER_TYPE_SELECTOR_TOOLTIP);
        cryptoOrderFragment.getCallbacks().showOrderTypeSelector(cryptoOrderViewState.getInputState().getOrderPrices$feature_trade_crypto_externalDebug().getOrderType(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$8(CryptoOrderViewState cryptoOrderViewState, CryptoOrderFragment cryptoOrderFragment) {
        if (cryptoOrderViewState.getInputState().getOrderPrices$feature_trade_crypto_externalDebug().getOrderType() == CryptoOrderType.MARKET && cryptoOrderViewState.getInputState().getInputMode$feature_trade_crypto_externalDebug() == CryptoInputMode.ASSET_CURRENCY) {
            Callbacks callbacks = cryptoOrderFragment.getCallbacks();
            UiCurrencyPair uiCurrencyPair = cryptoOrderViewState.getInputState().getUiCurrencyPair();
            Intrinsics.checkNotNull(uiCurrencyPair);
            callbacks.showQuoteTickerOrderFragment(uiCurrencyPair);
        } else {
            cryptoOrderFragment.getDuxo().changeInputMode();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$12$lambda$11$lambda$10(CryptoOrderFragment cryptoOrderFragment, CryptoOrderTooltipData cryptoOrderTooltipData, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoOrderFragment.getDuxo().onTooltipShown(cryptoOrderTooltipData.getType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(CryptoOrderEvent event) {
        DialogFragment dialogFragment;
        if (event instanceof CryptoOrderEvent.DisplayCryptoFeeTooltip) {
            displayCryptoFeeTooltip();
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.ShowFeeDefinitionBottomSheet) {
            CryptoFeeDefinitionBottomSheetFragment cryptoFeeDefinitionBottomSheetFragment = (CryptoFeeDefinitionBottomSheetFragment) CryptoFeeDefinitionBottomSheetFragment.INSTANCE.newInstance((Parcelable) ((CryptoOrderEvent.ShowFeeDefinitionBottomSheet) event).getArgs());
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            cryptoFeeDefinitionBottomSheetFragment.show(parentFragmentManager, TAG_FEE_DEF_BOTTOM_SHEET);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.DismissFeeDefinitionBottomSheet) {
            Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag(TAG_FEE_DEF_BOTTOM_SHEET);
            dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
            if (dialogFragment != null) {
                dialogFragment.dismiss();
                Unit unit3 = Unit.INSTANCE;
                return;
            }
            return;
        }
        if (event instanceof CryptoOrderEvent.ShowOrderScreen) {
            int i = WhenMappings.$EnumSwitchMapping$1[((CryptoOrderEvent.ShowOrderScreen) event).getOrderType().ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot edit market price");
            }
            if (i == 2) {
                Callbacks.DefaultImpls.convertToLimitOrder$default(getCallbacks(), false, 1, null);
                Unit unit4 = Unit.INSTANCE;
                return;
            } else if (i == 3) {
                Callbacks.DefaultImpls.convertToStopOrder$default(getCallbacks(), false, 1, null);
                Unit unit5 = Unit.INSTANCE;
                return;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Callbacks.DefaultImpls.convertToStopLimitOrder$default(getCallbacks(), null, false, 2, null);
                Unit unit6 = Unit.INSTANCE;
                return;
            }
        }
        if (event instanceof CryptoOrderEvent.StartActivity) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, ((CryptoOrderEvent.StartActivity) event).getIntentKey(), null, false, null, null, 60, null);
            Unit unit7 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.ValidationFailureAlert) {
            CryptoOrderEvent.ValidationFailureAlert validationFailureAlert = (CryptoOrderEvent.ValidationFailureAlert) event;
            validationFailureAlert.getFailure().showAlert(requireBaseActivity(), validationFailureAlert.getOrderContext());
            Unit unit8 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.ShowTradeBonusBottomSheet) {
            CryptoOrderEvent.ShowTradeBonusBottomSheet showTradeBonusBottomSheet = (CryptoOrderEvent.ShowTradeBonusBottomSheet) event;
            CryptoTradeBonusReviewOrderBottomSheetFragment cryptoTradeBonusReviewOrderBottomSheetFragment = (CryptoTradeBonusReviewOrderBottomSheetFragment) CryptoTradeBonusReviewOrderBottomSheetFragment.INSTANCE.newInstance((Parcelable) new CryptoTradeBonusReviewOrderBottomSheetFragment.Args(showTradeBonusBottomSheet.getStaticInputs(), showTradeBonusBottomSheet.getRequestInputs()));
            FragmentManager parentFragmentManager2 = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
            cryptoTradeBonusReviewOrderBottomSheetFragment.show(parentFragmentManager2, "cryptoTradeBonusReviewOrderBottomSheetFragment");
            Unit unit9 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.ShowEducationScreen) {
            CryptoOrderEvent.ShowEducationScreen showEducationScreen = (CryptoOrderEvent.ShowEducationScreen) event;
            getCallbacks().onOrderTypeInfoClicked(showEducationScreen.getConfiguration(), showEducationScreen.getOrderSide());
            Unit unit10 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.ShowSduiValidationAlert) {
            Fragment fragmentFindFragmentByTag2 = getChildFragmentManager().findFragmentByTag(TAG_ORDER_VALIDATION_ALERT);
            dialogFragment = fragmentFindFragmentByTag2 instanceof CryptoSduiOrderValidationAlertDialogFragment ? (CryptoSduiOrderValidationAlertDialogFragment) fragmentFindFragmentByTag2 : null;
            if (dialogFragment != null) {
                dialogFragment.dismissNow();
                Unit unit11 = Unit.INSTANCE;
            }
            CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment = (CryptoSduiOrderValidationAlertDialogFragment) CryptoSduiOrderValidationAlertDialogFragment.INSTANCE.newInstance((Parcelable) new CryptoSduiOrderValidationAlertDialogFragment.Args(((CryptoOrderEvent.ShowSduiValidationAlert) event).getContent()));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            cryptoSduiOrderValidationAlertDialogFragment.show(childFragmentManager, TAG_ORDER_VALIDATION_ALERT);
            this.validationAlertDialogFragment = cryptoSduiOrderValidationAlertDialogFragment;
            Unit unit12 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.HandleCryptoFeeEventType) {
            if (!(((CryptoOrderEvent.HandleCryptoFeeEventType) event).getType() instanceof CryptoFeeUiEventProvider4.CryptoOrder.ShowFeeTierUpsellBottomSheet)) {
                throw new NoWhenBranchMatchedException();
            }
            getDuxo().showFeeTierUpsellBottomSheet();
            Unit unit13 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.ApplyFeeUnsupportedForCurrencyPairUiTreatment) {
            CryptoOrderEvent.ApplyFeeUnsupportedForCurrencyPairUiTreatment applyFeeUnsupportedForCurrencyPairUiTreatment = (CryptoOrderEvent.ApplyFeeUnsupportedForCurrencyPairUiTreatment) event;
            applyFeeUnsupportedForCurrencyPairUiTreatment(applyFeeUnsupportedForCurrencyPairUiTreatment.getAssetCurrencyCode(), applyFeeUnsupportedForCurrencyPairUiTreatment.isRebateMarketMakersSupported());
            Unit unit14 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.UpdateAmount) {
            getContentBinding().cryptoAmountEdt.setText(((CryptoOrderEvent.UpdateAmount) event).getFormattedAmount());
            Unit unit15 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.ShowFragmentInActivity) {
            Navigator navigator2 = getNavigator();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, contextRequireContext2, ((CryptoOrderEvent.ShowFragmentInActivity) event).getFragmentKey(), false, false, false, false, null, false, null, NavigationType.PRESENT, 508, null);
            Unit unit16 = Unit.INSTANCE;
            return;
        }
        if (event instanceof CryptoOrderEvent.ShowDialogFragment) {
            DialogFragment dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), ((CryptoOrderEvent.ShowDialogFragment) event).getDialogFragmentKey(), null, 2, null);
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            DialogFragments.showIfNotFound(dialogFragmentCreateDialogFragment$default, childFragmentManager2, "microgramCryptoOrderDialogFragment");
            Unit unit17 = Unit.INSTANCE;
            return;
        }
        if (!(event instanceof CryptoOrderEvent.ShowAlertDto)) {
            throw new NoWhenBranchMatchedException();
        }
        Fragment fragmentFindFragmentByTag3 = getChildFragmentManager().findFragmentByTag(TAG_MICROGRAM_ORDER_VALIDATION_ALERT);
        dialogFragment = fragmentFindFragmentByTag3 instanceof CryptoSduiOrderValidationAlertDialogFragmentV2 ? (CryptoSduiOrderValidationAlertDialogFragmentV2) fragmentFindFragmentByTag3 : null;
        if (dialogFragment != null) {
            dialogFragment.dismissNow();
            Unit unit18 = Unit.INSTANCE;
        }
        CryptoOrderEvent.ShowAlertDto showAlertDto = (CryptoOrderEvent.ShowAlertDto) event;
        CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2 = (CryptoSduiOrderValidationAlertDialogFragmentV2) CryptoSduiOrderValidationAlertDialogFragmentV2.INSTANCE.newInstance((Parcelable) new CryptoSduiOrderValidationAlertDialogFragmentV2.Args(showAlertDto.getAlertDto(), getEventScreen(), new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, showAlertDto.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null)));
        FragmentManager childFragmentManager3 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
        cryptoSduiOrderValidationAlertDialogFragmentV2.show(childFragmentManager3, TAG_MICROGRAM_ORDER_VALIDATION_ALERT);
        this.validationAlertDialogFragmentV2 = cryptoSduiOrderValidationAlertDialogFragmentV2;
        Unit unit19 = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOrderState(final CryptoOrderViewState.OrderState orderState) {
        this.orderState = orderState;
        getContentBinding().cryptoAmountEdt.requestFocus();
        getContentBinding().cryptoReviewTxtComposeView.setContent(ComposableLambda3.composableLambdaInstance(1327031466, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindOrderState.1
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
                    ComposerKt.traceEventStart(1327031466, i, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindOrderState.<anonymous> (CryptoOrderFragment.kt:528)");
                }
                ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(CryptoOrderFragment.this.getNavigator());
                final CryptoOrderViewState.OrderState orderState2 = orderState;
                CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1607100778, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindOrderState.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1607100778, i2, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindOrderState.<anonymous>.<anonymous> (CryptoOrderFragment.kt:531)");
                        }
                        final CryptoOrderViewState.OrderState orderState3 = orderState2;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1506113246, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindOrderState.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1506113246, i3, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.bindOrderState.<anonymous>.<anonymous>.<anonymous> (CryptoOrderFragment.kt:532)");
                                }
                                CryptoOrderReviewMessageAndDisclosuresComposable3.CryptoOrderReviewMessageAndDisclosuresComposable(orderState3.m2867xc5d7f028(), null, composer3, CryptoOrderReviewMessageAndDisclosuresState.$stable, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getReviewOrderBtn().setEnabled(orderState.isReviewOrderButtonEnabled());
    }

    @Override // com.robinhood.shared.trade.crypto.activity.CryptoOrderSubmissionFailureCallbacks
    public void setFormStateToEditing() {
        getDuxo().updateFormState(DefaultOrderState.EDITING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindFormState(DefaultOrderState formState) {
        setFormState(formState);
        super.onFormStateUpdated();
        getDuxo().updateFormState(formState);
        getCallbacks().onReviewStateChanged(formState.getIsReviewingState());
    }

    private final void setBackgroundColor(DefaultOrderState formState) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
        if (i2 == 1) {
            i = C20690R.attr.colorBackground1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C20690R.attr.colorBackgroundPrimary;
        }
        PerspectiveTranslateLayout perspectiveTranslateLayout = getFragmentBinding().constraintLayout;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        perspectiveTranslateLayout.setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(contextRequireContext, i)));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateUpdated() {
        getDuxo().updateFormState(getFormState());
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().showCloseIcon();
        ScarletManager2.overrideAttribute(requireToolbar().getToolbar(), R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getCOLOR_POSITIVE());
        View viewFindViewById = toolbar.findViewById(C40095R.id.crypto_order_toolbar_content);
        if (viewFindViewById == null) {
            RhToolbar.addCustomView$default(toolbar, C40095R.layout.include_crypto_order_toolbar, false, 0, 6, null);
            View viewFindViewById2 = toolbar.findViewById(C40095R.id.crypto_order_toolbar_content);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) viewFindViewById2;
        } else {
            viewGroup = (ViewGroup) viewFindViewById;
        }
        this.toolbarContent = viewGroup;
        this.toolbarText = viewGroup != null ? (RhTextView) viewGroup.findViewById(C40095R.id.action_order_types_txt) : null;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void validateAndReviewOrder() {
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        if (cryptoOrderContext != null) {
            getDuxo().onReviewButtonTapped(cryptoOrderContext);
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void performSubmitOrder() {
        getDuxo().submitOrder(this.orderState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onLinkTextClicked(int id, Bundle passthroughArgs, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (id == C20649R.id.dialog_id_validation_failure) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, url);
            return true;
        }
        return super.onLinkTextClicked(id, passthroughArgs, url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragment.Callbacks
    public void handleAction(CryptoValidateOrderAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof CryptoValidateOrderAction.ContinueAction) {
            CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment = this.validationAlertDialogFragment;
            if (cryptoSduiOrderValidationAlertDialogFragment != null) {
                cryptoSduiOrderValidationAlertDialogFragment.dismiss();
            }
            CryptoOrderDuxo duxo = getDuxo();
            CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
            if (cryptoOrderContext == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            duxo.fetchTradeBonusEligibility(cryptoOrderContext);
            return;
        }
        if (action instanceof CryptoValidateOrderAction.CryptoAcknowledgeAlertAndContinue) {
            CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment2 = this.validationAlertDialogFragment;
            if (cryptoSduiOrderValidationAlertDialogFragment2 != null) {
                cryptoSduiOrderValidationAlertDialogFragment2.dismiss();
            }
            getDuxo().onAcknowledgeAlertAndContinue(((CryptoValidateOrderAction.CryptoAcknowledgeAlertAndContinue) action).getValue2());
            return;
        }
        if (action instanceof CryptoValidateOrderAction.CryptoCancelTradeFlow) {
            getCallbacks().cancelTradeFlow();
            return;
        }
        if (action instanceof CryptoValidateOrderAction.Deeplink) {
            ActionHandlingFragment2.handleDeeplink$default(this, ((CryptoValidateOrderAction.Deeplink) action).getValue2(), null, 2, null);
            return;
        }
        if (!(action instanceof CryptoValidateOrderAction.Dismiss)) {
            if (!(action instanceof CryptoValidateOrderAction.InfoAlert) && !(action instanceof CryptoValidateOrderAction.SetCryptoOrderQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment3 = this.validationAlertDialogFragment;
            if (cryptoSduiOrderValidationAlertDialogFragment3 != null) {
                cryptoSduiOrderValidationAlertDialogFragment3.dismiss();
            }
        }
    }

    @Override // com.robinhood.shared.trade.crypto.activity.CryptoOrderSubmissionFailureCallbacks
    public void convertToRebateOrder() {
        getDuxo().convertToRebateOrder();
    }

    private final void displayCryptoFeeTooltip() {
        TooltipData.Target target;
        RhTextView rhTextView = this.toolbarText;
        if (rhTextView == null || (target = TooltipData2.toTarget(rhTextView)) == null) {
            return;
        }
        TooltipManager tooltipManager = getTooltipManager();
        String string2 = getString(C40095R.string.crypto_fee_upsell_bottom_sheet_maybe_later_tooltip);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        TooltipManager.DefaultImpls.addTooltip$default(tooltipManager, false, new TooltipData(ORDER_TYPE_SELECTOR_TOOLTIP, string2, target, null, null, 24, null), 1, null);
    }

    private final void applyFeeUnsupportedForCurrencyPairUiTreatment(final String assetCurrencyCode, final boolean isRebateMarketMakersSupported) {
        getFragmentBinding().feeUnsupportedForCurrencyPairComposeView.setContent(ComposableLambda3.composableLambdaInstance(-613064837, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.applyFeeUnsupportedForCurrencyPairUiTreatment.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoOrderFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$applyFeeUnsupportedForCurrencyPairUiTreatment$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ String $assetCurrencyCode;
                final /* synthetic */ boolean $isRebateMarketMakersSupported;
                final /* synthetic */ String $learnMoreUrl;
                final /* synthetic */ CryptoOrderFragment this$0;

                AnonymousClass1(boolean z, String str, CryptoOrderFragment cryptoOrderFragment, String str2) {
                    this.$isRebateMarketMakersSupported = z;
                    this.$assetCurrencyCode = str;
                    this.this$0 = cryptoOrderFragment;
                    this.$learnMoreUrl = str2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                    String strStringResource;
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2018545347, i, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.applyFeeUnsupportedForCurrencyPairUiTreatment.<anonymous>.<anonymous> (CryptoOrderFragment.kt:657)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                    TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
                    int iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
                    if (this.$isRebateMarketMakersSupported) {
                        composer.startReplaceGroup(647735281);
                        strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_order_fee_unsupported_for_currency_pair_text_volume_tier, new Object[]{this.$assetCurrencyCode}, composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(647977732);
                        strStringResource = StringResources_androidKt.stringResource(C40095R.string.f6291xcceb3ec6, new Object[]{this.$assetCurrencyCode}, composer, 0);
                        composer.endReplaceGroup();
                    }
                    String strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_order_fee_unsupported_for_currency_pair_link, composer, 0);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changed(this.$learnMoreUrl);
                    final CryptoOrderFragment cryptoOrderFragment = this.this$0;
                    final String str = this.$learnMoreUrl;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$applyFeeUnsupportedForCurrencyPairUiTreatment$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderFragment.C403081.AnonymousClass1.invoke$lambda$1$lambda$0(cryptoOrderFragment, str);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue, modifierM5144paddingVpY3zN4$default, jM21426getFg20d7_KjU, 0L, textS, iM7924getStarte0LSkKk, composer, 0, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(CryptoOrderFragment cryptoOrderFragment, String str) {
                    Navigator navigator = cryptoOrderFragment.getNavigator();
                    Context contextRequireContext = cryptoOrderFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, str);
                    return Unit.INSTANCE;
                }
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-613064837, i, -1, "com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.applyFeeUnsupportedForCurrencyPairUiTreatment.<anonymous> (CryptoOrderFragment.kt:655)");
                }
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2018545347, true, new AnonymousClass1(isRebateMarketMakersSupported, assetCurrencyCode, this, StringResources_androidKt.stringResource(C40095R.string.us_crypto_fee_help_center_url, composer, 0)), composer, 54), composer, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getFragmentBinding().buttonContainer.setOrientation(0);
        getFragmentBinding().cryptoSellAllBtn.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        getFragmentBinding().reviewBtn.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
    }

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment$Args;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/OrderSide;", "orderUuid", "orderPrices", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;Lcom/robinhood/models/db/OrderTimeInForce;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getOrderUuid", "getOrderPrices", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final CryptoOrderPrices orderPrices;
        private final UUID orderUuid;
        private final OrderSide side;
        private final OrderTimeInForce timeInForce;

        /* compiled from: CryptoOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), OrderSide.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (CryptoOrderPrices) parcel.readParcelable(Args.class.getClassLoader()), (OrderTimeInForce) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, OrderSide orderSide, UUID uuid2, CryptoOrderPrices cryptoOrderPrices, OrderTimeInForce orderTimeInForce, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.currencyPairId;
            }
            if ((i & 2) != 0) {
                orderSide = args.side;
            }
            if ((i & 4) != 0) {
                uuid2 = args.orderUuid;
            }
            if ((i & 8) != 0) {
                cryptoOrderPrices = args.orderPrices;
            }
            if ((i & 16) != 0) {
                orderTimeInForce = args.timeInForce;
            }
            OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
            UUID uuid3 = uuid2;
            return args.copy(uuid, orderSide, uuid3, cryptoOrderPrices, orderTimeInForce2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderSide getSide() {
            return this.side;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        /* renamed from: component4, reason: from getter */
        public final CryptoOrderPrices getOrderPrices() {
            return this.orderPrices;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final Args copy(UUID currencyPairId, OrderSide side, UUID orderUuid, CryptoOrderPrices orderPrices, OrderTimeInForce timeInForce) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new Args(currencyPairId, side, orderUuid, orderPrices, timeInForce);
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
            return Intrinsics.areEqual(this.currencyPairId, args.currencyPairId) && this.side == args.side && Intrinsics.areEqual(this.orderUuid, args.orderUuid) && Intrinsics.areEqual(this.orderPrices, args.orderPrices) && this.timeInForce == args.timeInForce;
        }

        public int hashCode() {
            return (((((((this.currencyPairId.hashCode() * 31) + this.side.hashCode()) * 31) + this.orderUuid.hashCode()) * 31) + this.orderPrices.hashCode()) * 31) + this.timeInForce.hashCode();
        }

        public String toString() {
            return "Args(currencyPairId=" + this.currencyPairId + ", side=" + this.side + ", orderUuid=" + this.orderUuid + ", orderPrices=" + this.orderPrices + ", timeInForce=" + this.timeInForce + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.side.name());
            dest.writeSerializable(this.orderUuid);
            dest.writeParcelable(this.orderPrices, flags);
            dest.writeParcelable(this.timeInForce, flags);
        }

        public Args(UUID currencyPairId, OrderSide side, UUID orderUuid, CryptoOrderPrices orderPrices, OrderTimeInForce timeInForce) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.currencyPairId = currencyPairId;
            this.side = side;
            this.orderUuid = orderUuid;
            this.orderPrices = orderPrices;
            this.timeInForce = timeInForce;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final OrderSide getSide() {
            return this.side;
        }

        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        public final CryptoOrderPrices getOrderPrices() {
            return this.orderPrices;
        }

        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }
    }

    /* compiled from: CryptoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment$Args;", "<init>", "()V", "TAG_ORDER_VALIDATION_ALERT", "", "TAG_FEE_DEF_BOTTOM_SHEET", "ORDER_TYPE_SELECTOR_TOOLTIP", "TAG_MICROGRAM_ORDER_VALIDATION_ALERT", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoOrderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoOrderFragment cryptoOrderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoOrderFragment newInstance(Args args) {
            return (CryptoOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoOrderFragment cryptoOrderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoOrderFragment, args);
        }
    }

    @Override // com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2.Callbacks
    public void handleAction(ValidateCryptoOrderResponseDto.MobileDto.ActionDto action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto type2 = action.getType();
        if (type2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.Dismiss) {
            CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2 = this.validationAlertDialogFragmentV2;
            if (cryptoSduiOrderValidationAlertDialogFragmentV2 != null) {
                cryptoSduiOrderValidationAlertDialogFragmentV2.dismiss();
            }
            handleSideEffects(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.Dismiss) type2).getValue().getSide_effects());
            return;
        }
        if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.AcknowledgeAndContinue) {
            CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV22 = this.validationAlertDialogFragmentV2;
            if (cryptoSduiOrderValidationAlertDialogFragmentV22 != null) {
                cryptoSduiOrderValidationAlertDialogFragmentV22.dismiss();
            }
            getDuxo().onOrderValidationAcknowledgeAndContinue(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.AcknowledgeAndContinue) type2).getValue().getAcknowledge_id());
        }
    }

    @Override // com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2.Callbacks
    public void handleDeeplink(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(uri), null, null, false, null, 60, null);
    }

    private final void handleSideEffects(List<ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto> sideEffects) {
        Iterator<T> it = sideEffects.iterator();
        while (it.hasNext()) {
            ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto type2 = ((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto) it.next()).getType();
            if (type2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.DeeplinkAction) {
                handleDeeplink(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.DeeplinkAction) type2).getValue().getUrl());
            } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetOrderSize) {
                getDuxo().setOrderSize(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetOrderSize) type2).getValue());
            } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.StartDepositFlow) {
                getDuxo().initiateDeposit();
            } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.ConvertToSellAll) {
                getDuxo().sellAll();
            } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetPdtWarningAsSeen) {
                getDuxo().setPdtWarningAsSeen();
            }
        }
    }
}
