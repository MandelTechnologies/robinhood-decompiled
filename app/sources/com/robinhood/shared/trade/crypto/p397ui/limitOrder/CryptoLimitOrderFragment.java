package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresComposable3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRow3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity;
import com.robinhood.shared.trade.crypto.activity.CryptoOrderSubmissionFailureCallbacks;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoLimitOrderBinding;
import com.robinhood.shared.trade.crypto.databinding.MergeCryptoLimitOrderBinding;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderEvent;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderFragment;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderViewState;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.views.CryptoLimitOrderAmountLabelComposable;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.views.CryptoLimitOrderEstimatedAmountComposable;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.views.CryptoLimitOrderHeaderComposable;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.views.CryptoLimitOrderLimitPriceComposable;
import com.robinhood.shared.trade.crypto.p397ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2;
import com.robinhood.shared.trade.crypto.views.PerspectiveTranslateLayout;
import com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountInputView;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponseDto;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.rxkotlin.ObservablesKt;
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

/* compiled from: CryptoLimitOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0095\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0006\u0093\u0001\u0094\u0001\u0095\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020GH\u0016J\u001a\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020M2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010N\u001a\u00020GH\u0014J\u0010\u0010O\u001a\u00020G2\u0006\u0010P\u001a\u00020QH\u0016J\u0016\u0010R\u001a\u00020G2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TH\u0002J\u0010\u0010V\u001a\u00020G2\u0006\u0010W\u001a\u00020XH\u0002J\u0010\u0010Y\u001a\u00020G2\u0006\u0010Z\u001a\u00020<H\u0002J\b\u0010[\u001a\u00020GH\u0016J\u001a\u0010\\\u001a\u00020G2\u0006\u0010]\u001a\u00020\u00022\b\u0010^\u001a\u0004\u0018\u00010_H\u0002J\u0010\u0010`\u001a\u00020G2\u0006\u0010]\u001a\u00020\u0002H\u0002J\u0010\u0010a\u001a\u00020G2\u0006\u0010W\u001a\u00020bH\u0002J\u0010\u0010c\u001a\u00020G2\u0006\u0010d\u001a\u00020\u0014H\u0002J\u0018\u0010e\u001a\u00020G2\u0006\u0010f\u001a\u00020g2\u0006\u0010]\u001a\u00020\u0002H\u0002J\u001a\u0010h\u001a\u00020G2\b\u0010i\u001a\u0004\u0018\u00010j2\u0006\u0010k\u001a\u00020lH\u0002J\u0018\u0010m\u001a\u00020G2\u0006\u0010n\u001a\u00020o2\u0006\u0010]\u001a\u00020\u0002H\u0002J\u0010\u0010p\u001a\u00020G2\u0006\u0010q\u001a\u00020rH\u0002J\u0010\u0010s\u001a\u00020G2\u0006\u0010t\u001a\u00020uH\u0002J\u0010\u0010v\u001a\u00020G2\u0006\u0010w\u001a\u00020xH\u0002J\b\u0010y\u001a\u00020GH\u0002J\b\u0010z\u001a\u00020GH\u0016J\b\u0010{\u001a\u00020GH\u0016J\u0010\u0010|\u001a\u00020-2\u0006\u0010]\u001a\u00020\u0002H\u0016J\b\u0010}\u001a\u00020GH\u0016J\u0010\u0010~\u001a\u00020G2\u0006\u0010]\u001a\u00020\u0002H\u0016J\u001c\u0010\u007f\u001a\u00020G2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0016J\u0013\u0010\u0083\u0001\u001a\u00020G2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016J\u0013\u0010\u0086\u0001\u001a\u00020G2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\u001a\u0010\u0089\u0001\u001a\u00020G2\u000f\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u0001H\u0002J\n\u0010\u008d\u0001\u001a\u00020\u0014H\u0096\u0001R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u0014X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b1\u00102R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010\u00140\u001408X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010:\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010\u00140\u001408X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010;\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010<0<08X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010>\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010AR\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0096\u0001"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderSubmissionFailureCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo;", "getDuxo", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "contentRes", "", "getContentRes", "()I", "initialLayoutRes", "getInitialLayoutRes", "usePrimaryColorBackground", "getUsePrimaryColorBackground", "fragmentBinding", "Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoLimitOrderBinding;", "getFragmentBinding", "()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoLimitOrderBinding;", "fragmentBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "contentBinding", "Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoLimitOrderBinding;", "getContentBinding", "()Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoLimitOrderBinding;", "contentBinding$delegate", "reviewingConstraintLayoutRes", "getReviewingConstraintLayoutRes", "initialConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "reviewingConstraints", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment$Callbacks;", "callbacks$delegate", "toolbarOrderTypeTextView", "Lcom/robinhood/android/designsystem/text/RhTextView;", "toolbarTitleTextView", "amountEdtFocusedRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "limitEdtFocusedRelay", "focusedEdtTypeRelay", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEdtType;", "<set-?>", "cardViewBottomY", "getCardViewBottomY", "setCardViewBottomY", "(I)V", "cardViewBottomY$delegate", "Landroidx/compose/runtime/MutableIntState;", "validationAlertDialogFragmentV2", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "initializeNumpad", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEvent;", "bind", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState;", "bindFocusedEdtType", "focusedEdtType", "setFormStateToEditing", "bindFormState", "formState", "content", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "setBackgroundColor", "bindHeaderContent", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded;", "bindNumpad", "isNumpadDecimalSeparatorEnabled", "bindAmountRow", "amountRow", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$InputAmountRow;", "bindFeeRow", "feeRow", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "bindLimitPriceRow", "limitRow", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$LimitRow;", "bindEstimatedAmountRow", "estimatedAmountRow", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$EstimatedAmountRow;", "bindCtaButtons", "buttonState", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$CtaButtonState;", "bindToolbar", "toolbarContent", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState$Loaded$ToolbarContent;", "bindEdtsNumpadKeyEventsAndSellAllButton", "validateAndReviewOrder", "performSubmitOrder", "getConstraintsForState", "onFormStateUpdated", "onFormStateChanged", "onAnimationStep", "ratio", "", "maxDragDistance", "handleAction", "action", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto;", "handleDeeplink", "uri", "", "handleSideEffects", "sideEffects", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoLimitOrderFragment extends BaseOrderFragment<DefaultOrderState> implements CryptoOrderSubmissionFailureCallbacks, AutoLoggableFragment, CryptoSduiOrderValidationAlertDialogFragmentV2.Callbacks, RegionGated {
    private static final String TAG_MICROGRAM_ORDER_VALIDATION_ALERT = "microgramOrderValidationAlert";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final BehaviorRelay<Boolean> amountEdtFocusedRelay;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: cardViewBottomY$delegate, reason: from kotlin metadata */
    private final SnapshotIntState2 cardViewBottomY;

    /* renamed from: contentBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 contentBinding;
    private final int contentRes;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final BehaviorRelay<CryptoLimitOrderEdtType> focusedEdtTypeRelay;

    /* renamed from: fragmentBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 fragmentBinding;
    private final ConstraintSet initialConstraints;
    private final int initialLayoutRes;
    private final BehaviorRelay<Boolean> limitEdtFocusedRelay;
    private final ConstraintSet reviewingConstraints;
    private RhTextView toolbarOrderTypeTextView;
    private RhTextView toolbarTitleTextView;
    private final boolean usePrimaryColorBackground;
    private CryptoSduiOrderValidationAlertDialogFragmentV2 validationAlertDialogFragmentV2;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoLimitOrderFragment.class, "fragmentBinding", "getFragmentBinding()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoLimitOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CryptoLimitOrderFragment.class, "contentBinding", "getContentBinding()Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoLimitOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CryptoLimitOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment$Callbacks;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "showOrderTypeSelector", "", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "isRecurringOrder", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseOrderFragment.Callbacks {
        void showOrderTypeSelector(CryptoOrderType orderType, boolean isRecurringOrder);
    }

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoLimitOrderEdtType.values().length];
            try {
                iArr[CryptoLimitOrderEdtType.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoLimitOrderEdtType.LIMIT_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoLimitOrderEdtType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DefaultOrderState.values().length];
            try {
                iArr2[DefaultOrderState.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DefaultOrderState.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
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

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<CryptoLimitOrderEvent> event) {
        EventConsumer<CryptoLimitOrderEvent> eventConsumerInvoke;
        EventConsumer<CryptoLimitOrderEvent> eventConsumerInvoke2;
        EventConsumer<CryptoLimitOrderEvent> eventConsumerInvoke3;
        EventConsumer<CryptoLimitOrderEvent> eventConsumerInvoke4;
        EventConsumer<CryptoLimitOrderEvent> eventConsumerInvoke5;
        EventConsumer<CryptoLimitOrderEvent> eventConsumerInvoke6;
        EventConsumer<CryptoLimitOrderEvent> eventConsumerInvoke7;
        if ((event.getData() instanceof CryptoLimitOrderEvent.ShowFeeDefinitionBottomSheet) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25845invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25845invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoFeeDefinitionBottomSheetFragment cryptoFeeDefinitionBottomSheetFragment = (CryptoFeeDefinitionBottomSheetFragment) CryptoFeeDefinitionBottomSheetFragment.INSTANCE.newInstance((Parcelable) ((CryptoLimitOrderEvent.ShowFeeDefinitionBottomSheet) event.getData()).getArgs());
                    FragmentManager parentFragmentManager = this.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                    cryptoFeeDefinitionBottomSheetFragment.show(parentFragmentManager, "cryptoFeeDefinitionBottomSheetFragment");
                }
            });
        }
        if ((event.getData() instanceof CryptoLimitOrderEvent.StartActivity) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25846invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25846invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoLimitOrderEvent.StartActivity startActivity = (CryptoLimitOrderEvent.StartActivity) event.getData();
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, startActivity.getIntentKey(), null, false, null, null, 60, null);
                }
            });
        }
        if ((event.getData() instanceof CryptoLimitOrderEvent.ShowValidationFailureAlert) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25847invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25847invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoLimitOrderEvent.ShowValidationFailureAlert showValidationFailureAlert = (CryptoLimitOrderEvent.ShowValidationFailureAlert) event.getData();
                    showValidationFailureAlert.getFailure().showAlert(this.requireBaseActivity(), showValidationFailureAlert.getOrderContext());
                }
            });
        }
        if ((event.getData() instanceof CryptoLimitOrderEvent.ShowPowerInfoAlert) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25848invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25848invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator.DefaultImpls.createDialogFragment$default(this.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(((CryptoLimitOrderEvent.ShowPowerInfoAlert) event.getData()).getPowerInfoAlert(), true, true, 0, 8, (DefaultConstructorMarker) null), null, 2, null).show(this.getParentFragmentManager(), "crypto-buying-power-info");
                }
            });
        }
        if ((event.getData() instanceof CryptoLimitOrderEvent.RequestFocusOnLimitPriceInput) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25849invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25849invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getContentBinding().cryptoLimitPriceEdt.requestInputFocus();
                }
            });
        }
        if ((event.getData() instanceof CryptoLimitOrderEvent.ShowAlertDto) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$handleEvent$$inlined$consumeIfType$6
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25850invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25850invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoLimitOrderEvent.ShowAlertDto showAlertDto = (CryptoLimitOrderEvent.ShowAlertDto) event.getData();
                    Fragment fragmentFindFragmentByTag = this.getChildFragmentManager().findFragmentByTag("microgramOrderValidationAlert");
                    CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2 = fragmentFindFragmentByTag instanceof CryptoSduiOrderValidationAlertDialogFragmentV2 ? (CryptoSduiOrderValidationAlertDialogFragmentV2) fragmentFindFragmentByTag : null;
                    if (cryptoSduiOrderValidationAlertDialogFragmentV2 != null) {
                        cryptoSduiOrderValidationAlertDialogFragmentV2.dismissNow();
                    }
                    CryptoLimitOrderFragment cryptoLimitOrderFragment = this;
                    CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV22 = (CryptoSduiOrderValidationAlertDialogFragmentV2) CryptoSduiOrderValidationAlertDialogFragmentV2.INSTANCE.newInstance((Parcelable) new CryptoSduiOrderValidationAlertDialogFragmentV2.Args(showAlertDto.getAlertDto(), this.getEventScreen(), new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, showAlertDto.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null)));
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    cryptoSduiOrderValidationAlertDialogFragmentV22.show(childFragmentManager, "microgramOrderValidationAlert");
                    cryptoLimitOrderFragment.validationAlertDialogFragmentV2 = cryptoSduiOrderValidationAlertDialogFragmentV22;
                }
            });
        }
        if (!(event.getData() instanceof CryptoLimitOrderEvent.ShowDialogFragment) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$handleEvent$$inlined$consumeIfType$7
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m25851invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25851invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Navigator.DefaultImpls.createDialogFragment$default(this.getNavigator(), ((CryptoLimitOrderEvent.ShowDialogFragment) event.getData()).getDialogFragmentKey(), null, 2, null).show(this.getChildFragmentManager(), "microgramCryptoLimitOrderFragmentDialogFragment");
            }
        });
    }

    @Override // com.robinhood.shared.trade.crypto.activity.CryptoOrderSubmissionFailureCallbacks
    public void convertToRebateOrder() {
        CryptoOrderSubmissionFailureCallbacks.DefaultImpls.convertToRebateOrder(this);
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

    public CryptoLimitOrderFragment() {
        super(DefaultOrderState.EDITING);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, CryptoLimitOrderDuxo.class);
        this.contentRes = C40095R.layout.merge_crypto_limit_order;
        this.initialLayoutRes = C40095R.layout.fragment_crypto_limit_order;
        this.fragmentBinding = ViewBinding5.viewBinding(this, CryptoLimitOrderFragment8.INSTANCE);
        this.contentBinding = ViewBinding5.viewBinding(this, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderFragment.contentBinding_delegate$lambda$0(this.f$0, (View) obj);
            }
        });
        this.initialConstraints = new ConstraintSet();
        this.reviewingConstraints = new ConstraintSet();
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CryptoLimitOrderFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        BehaviorRelay<Boolean> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.amountEdtFocusedRelay = behaviorRelayCreate;
        BehaviorRelay<Boolean> behaviorRelayCreate2 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate2, "create(...)");
        this.limitEdtFocusedRelay = behaviorRelayCreate2;
        BehaviorRelay<CryptoLimitOrderEdtType> behaviorRelayCreate3 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate3, "create(...)");
        this.focusedEdtTypeRelay = behaviorRelayCreate3;
        this.cardViewBottomY = SnapshotIntState3.mutableIntStateOf(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoLimitOrderDuxo getDuxo() {
        return (CryptoLimitOrderDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return getDuxo().getEventScreen();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return this.contentRes;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return this.initialLayoutRes;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    protected boolean getUsePrimaryColorBackground() {
        return this.usePrimaryColorBackground;
    }

    private final FragmentCryptoLimitOrderBinding getFragmentBinding() {
        Object value = this.fragmentBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCryptoLimitOrderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MergeCryptoLimitOrderBinding contentBinding_delegate$lambda$0(CryptoLimitOrderFragment cryptoLimitOrderFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MergeCryptoLimitOrderBinding.bind(cryptoLimitOrderFragment.getFragmentBinding().content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MergeCryptoLimitOrderBinding getContentBinding() {
        return (MergeCryptoLimitOrderBinding) this.contentBinding.getValue(this, $$delegatedProperties[1]);
    }

    private final int getReviewingConstraintLayoutRes() {
        return C40095R.layout.fragment_crypto_limit_order_reviewing;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    private final int getCardViewBottomY() {
        return this.cardViewBottomY.getIntValue();
    }

    private final void setCardViewBottomY(int i) {
        this.cardViewBottomY.setIntValue(i);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        getCardView().setBackground(requireContext().getDrawable(C40095R.drawable.bottom_rounded_corner_background));
        bindEdtsNumpadKeyEventsAndSellAllButton();
        BaseFragment.collectDuxoState$default(this, null, new C402671(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C402682(null), 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C402693(null), 3, null);
        setBackgroundColor(getFormState());
        LifecycleHost.DefaultImpls.bind$default(this, requireBaseActivity().getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderFragment.onViewCreated$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$onViewCreated$1", m3645f = "CryptoLimitOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$onViewCreated$1 */
    static final class C402671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402671(Continuation<? super C402671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderFragment.this.new C402671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoLimitOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoLimitOrderFragment $tmp0;

            AnonymousClass1(CryptoLimitOrderFragment cryptoLimitOrderFragment) {
                this.$tmp0 = cryptoLimitOrderFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoLimitOrderFragment.class, "bind", "bind(Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(CryptoLimitOrderViewState cryptoLimitOrderViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$bind = C402671.invokeSuspend$bind(this.$tmp0, cryptoLimitOrderViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((CryptoLimitOrderViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(CryptoLimitOrderFragment cryptoLimitOrderFragment, CryptoLimitOrderViewState cryptoLimitOrderViewState, Continuation continuation) throws Resources.NotFoundException {
            cryptoLimitOrderFragment.bind(cryptoLimitOrderViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CryptoLimitOrderViewState> stateFlow = CryptoLimitOrderFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoLimitOrderFragment.this);
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
    }

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$onViewCreated$2", m3645f = "CryptoLimitOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$onViewCreated$2 */
    static final class C402682 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402682(Continuation<? super C402682> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderFragment.this.new C402682(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoLimitOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoLimitOrderFragment $tmp0;

            AnonymousClass1(CryptoLimitOrderFragment cryptoLimitOrderFragment) {
                this.$tmp0 = cryptoLimitOrderFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoLimitOrderFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<CryptoLimitOrderEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C402682.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<CryptoLimitOrderEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(CryptoLimitOrderFragment cryptoLimitOrderFragment, Event event, Continuation continuation) {
            cryptoLimitOrderFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoLimitOrderFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoLimitOrderFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$onViewCreated$3", m3645f = "CryptoLimitOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$onViewCreated$3 */
    static final class C402693 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C402693(Continuation<? super C402693> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoLimitOrderFragment.this.new C402693(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C402693) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoLimitOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$onViewCreated$3$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoLimitOrderDuxo $tmp0;

            AnonymousClass1(CryptoLimitOrderDuxo cryptoLimitOrderDuxo) {
                this.$tmp0 = cryptoLimitOrderDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoLimitOrderDuxo.class, "onAccessibilityEnabled", "onAccessibilityEnabled(Z)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
            }

            public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$onAccessibilityEnabled = C402693.invokeSuspend$onAccessibilityEnabled(this.$tmp0, z, continuation);
                return objInvokeSuspend$onAccessibilityEnabled == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$onAccessibilityEnabled : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamKeyInputAccessibilityEnabled = CryptoLimitOrderFragment.this.getRhAccessibilityManager().streamKeyInputAccessibilityEnabled();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoLimitOrderFragment.this.getDuxo());
                this.label = 1;
                if (flowStreamKeyInputAccessibilityEnabled.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$onAccessibilityEnabled(CryptoLimitOrderDuxo cryptoLimitOrderDuxo, boolean z, Continuation continuation) {
            cryptoLimitOrderDuxo.onAccessibilityEnabled(z);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CryptoLimitOrderFragment cryptoLimitOrderFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoLimitOrderFragment.setBackgroundColor(cryptoLimitOrderFragment.getFormState());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    protected void initializeNumpad() {
        getNumpad().setVisibility(0);
        getReviewOrderBtn().setVisibility(0);
        OnClickListeners.onClick(getReviewOrderBtn(), new C402661(this));
    }

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$initializeNumpad$1 */
    /* synthetic */ class C402661 extends FunctionReferenceImpl implements Function0<Unit> {
        C402661(Object obj) {
            super(0, obj, CryptoLimitOrderFragment.class, "validateAndReviewOrder", "validateAndReviewOrder()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CryptoLimitOrderFragment) this.receiver).validateAndReviewOrder();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ScarletManager2.overrideAttribute(toolbar.getToolbar(), R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getCOLOR_POSITIVE());
        View viewFindViewById = toolbar.findViewById(C40095R.id.crypto_order_toolbar_content);
        if (viewFindViewById == null) {
            RhToolbar.addCustomView$default(toolbar, C40095R.layout.include_crypto_order_toolbar, false, 0, 6, null);
            View viewFindViewById2 = toolbar.findViewById(C40095R.id.crypto_order_toolbar_content);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) viewFindViewById2;
        } else {
            viewGroup = (ViewGroup) viewFindViewById;
        }
        RhTextView rhTextView = (RhTextView) viewGroup.findViewById(C40095R.id.action_order_types_txt);
        this.toolbarOrderTypeTextView = rhTextView;
        if (rhTextView != null) {
            OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoLimitOrderFragment.configureToolbar$lambda$2(this.f$0);
                }
            });
        }
        this.toolbarTitleTextView = (RhTextView) viewGroup.findViewById(C40095R.id.review_order_text_view);
        CryptoLimitOrderViewState value = getDuxo().getStateFlow().getValue();
        if (value instanceof CryptoLimitOrderViewState.Loaded) {
            bindToolbar(((CryptoLimitOrderViewState.Loaded) value).getToolbarContent());
            return;
        }
        if (!(value instanceof CryptoLimitOrderViewState.Loading)) {
            throw new NoWhenBranchMatchedException();
        }
        RhTextView rhTextView2 = this.toolbarOrderTypeTextView;
        if (rhTextView2 != null) {
            rhTextView2.setVisibility(8);
        }
        RhTextView rhTextView3 = this.toolbarTitleTextView;
        if (rhTextView3 != null) {
            rhTextView3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$2(CryptoLimitOrderFragment cryptoLimitOrderFragment) {
        cryptoLimitOrderFragment.getCallbacks().showOrderTypeSelector(CryptoOrderType.LIMIT, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(CryptoLimitOrderViewState viewState) throws Resources.NotFoundException {
        if (viewState instanceof CryptoLimitOrderViewState.Loading) {
            ComposeView loadingViewContent = getContentBinding().loadingViewContent;
            Intrinsics.checkNotNullExpressionValue(loadingViewContent, "loadingViewContent");
            loadingViewContent.setVisibility(0);
            getContentBinding().loadingViewContent.setContent(CryptoLimitOrderFragment2.INSTANCE.getLambda$1834855785$feature_trade_crypto_externalDebug());
            return;
        }
        if (!(viewState instanceof CryptoLimitOrderViewState.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        ComposeView loadingViewContent2 = getContentBinding().loadingViewContent;
        Intrinsics.checkNotNullExpressionValue(loadingViewContent2, "loadingViewContent");
        loadingViewContent2.setVisibility(8);
        CryptoLimitOrderViewState.Loaded loaded = (CryptoLimitOrderViewState.Loaded) viewState;
        bindFocusedEdtType(loaded.getFocusedEdtType());
        bindFormState(loaded.getFormState(), loaded.getReviewContent());
        bindToolbar(loaded.getToolbarContent());
        bindNumpad(loaded.isNumpadDecimalSeparatorEnabled());
        bindHeaderContent(loaded);
        bindAmountRow(loaded.getInputAmountRow(), loaded.getFormState());
        CryptoOrderReviewRowState feeRow1 = loaded.getFeeRow1();
        ComposeView feeRow12 = getContentBinding().feeRow1;
        Intrinsics.checkNotNullExpressionValue(feeRow12, "feeRow1");
        bindFeeRow(feeRow1, feeRow12);
        bindLimitPriceRow(loaded.getLimitRow(), loaded.getFormState());
        CryptoOrderReviewRowState feeRow2 = loaded.getFeeRow2();
        ComposeView feeRow22 = getContentBinding().feeRow2;
        Intrinsics.checkNotNullExpressionValue(feeRow22, "feeRow2");
        bindFeeRow(feeRow2, feeRow22);
        bindEstimatedAmountRow(loaded.getEstimatedAmountRow());
        bindCtaButtons(loaded.getCtaButtonState());
    }

    private final void bindFocusedEdtType(CryptoLimitOrderEdtType focusedEdtType) {
        this.focusedEdtTypeRelay.accept(focusedEdtType);
        int i = WhenMappings.$EnumSwitchMapping$0[focusedEdtType.ordinal()];
        if (i == 1) {
            getContentBinding().cryptoAmountEdt.requestInputFocus();
            return;
        }
        if (i == 2) {
            getContentBinding().cryptoLimitPriceEdt.requestInputFocus();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            getContentBinding().cryptoAmountEdt.clearFocus();
            getContentBinding().cryptoLimitPriceEdt.clearFocus();
        }
    }

    @Override // com.robinhood.shared.trade.crypto.activity.CryptoOrderSubmissionFailureCallbacks
    public void setFormStateToEditing() {
        getDuxo().updateFormState(DefaultOrderState.EDITING);
    }

    private final void bindFormState(DefaultOrderState formState, final CryptoOrderReviewMessageAndDisclosuresState content) {
        setFormState(formState);
        ComposeView cryptoEstimatedReviewContent = getContentBinding().cryptoEstimatedReviewContent;
        Intrinsics.checkNotNullExpressionValue(cryptoEstimatedReviewContent, "cryptoEstimatedReviewContent");
        cryptoEstimatedReviewContent.setVisibility(formState.getIsReviewingState() ? 0 : 8);
        if (content != null) {
            getContentBinding().cryptoEstimatedReviewContent.setContent(ComposableLambda3.composableLambdaInstance(-1470942537, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindFormState.1
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
                        ComposerKt.traceEventStart(-1470942537, i, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindFormState.<anonymous> (CryptoLimitOrderFragment.kt:304)");
                    }
                    final CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = content;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(52394495, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindFormState.1.1
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
                                ComposerKt.traceEventStart(52394495, i2, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindFormState.<anonymous>.<anonymous> (CryptoLimitOrderFragment.kt:304)");
                            }
                            CryptoOrderReviewMessageAndDisclosuresComposable3.CryptoOrderReviewMessageAndDisclosuresComposable(cryptoOrderReviewMessageAndDisclosuresState, null, composer2, CryptoOrderReviewMessageAndDisclosuresState.$stable, 2);
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
        int i = WhenMappings.$EnumSwitchMapping$1[formState.ordinal()];
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

    private final void setBackgroundColor(DefaultOrderState formState) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$1[formState.ordinal()];
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

    private final void bindHeaderContent(final CryptoLimitOrderViewState.Loaded viewState) {
        getContentBinding().limitOrderHeaderContent.setContent(ComposableLambda3.composableLambdaInstance(-1753925088, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindHeaderContent.1
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
                    ComposerKt.traceEventStart(-1753925088, i, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindHeaderContent.<anonymous> (CryptoLimitOrderFragment.kt:329)");
                }
                final CryptoLimitOrderViewState.Loaded loaded = viewState;
                final CryptoLimitOrderFragment cryptoLimitOrderFragment = this;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-938865192, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindHeaderContent.1.1
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
                            ComposerKt.traceEventStart(-938865192, i2, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindHeaderContent.<anonymous>.<anonymous> (CryptoLimitOrderFragment.kt:330)");
                        }
                        CryptoLimitOrderViewState.Loaded.HeaderContent headerContent = loaded.getHeaderContent();
                        CryptoLimitOrderDuxo duxo = cryptoLimitOrderFragment.getDuxo();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(duxo);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new CryptoLimitOrderFragment6(duxo);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        CryptoLimitOrderHeaderComposable.CryptoLimitOrderHeaderComposable(headerContent, (Function0) ((KFunction) objRememberedValue), null, composer2, StringResource.$stable, 4);
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

    private final void bindNumpad(boolean isNumpadDecimalSeparatorEnabled) {
        getFragmentBinding().numpad.setDelimiterEnabled(isNumpadDecimalSeparatorEnabled);
    }

    private final void bindAmountRow(final CryptoLimitOrderViewState.Loaded.InputAmountRow amountRow, final DefaultOrderState formState) {
        getContentBinding().cryptoAmountLabelContent.setContent(ComposableLambda3.composableLambdaInstance(-1691027317, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindAmountRow.1

            /* compiled from: CryptoLimitOrderFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$bindAmountRow$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ CryptoLimitOrderViewState.Loaded.InputAmountRow $amountRow;
                final /* synthetic */ DefaultOrderState $formState;
                final /* synthetic */ CryptoLimitOrderFragment this$0;

                AnonymousClass1(CryptoLimitOrderViewState.Loaded.InputAmountRow inputAmountRow, DefaultOrderState defaultOrderState, CryptoLimitOrderFragment cryptoLimitOrderFragment) {
                    this.$amountRow = inputAmountRow;
                    this.$formState = defaultOrderState;
                    this.this$0 = cryptoLimitOrderFragment;
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
                        ComposerKt.traceEventStart(-1715490237, i, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindAmountRow.<anonymous>.<anonymous> (CryptoLimitOrderFragment.kt:348)");
                    }
                    CryptoLimitOrderViewState.Loaded.InputAmountRow inputAmountRow = this.$amountRow;
                    DefaultOrderState defaultOrderState = this.$formState;
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$amountRow);
                    final CryptoLimitOrderFragment cryptoLimitOrderFragment = this.this$0;
                    final CryptoLimitOrderViewState.Loaded.InputAmountRow inputAmountRow2 = this.$amountRow;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$bindAmountRow$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoLimitOrderFragment.C402571.AnonymousClass1.invoke$lambda$1$lambda$0(cryptoLimitOrderFragment, inputAmountRow2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    CryptoLimitOrderAmountLabelComposable.CryptoLimitOrderAmountLabelComposable(inputAmountRow, defaultOrderState, (Function0) objRememberedValue, null, composer, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(CryptoLimitOrderFragment cryptoLimitOrderFragment, CryptoLimitOrderViewState.Loaded.InputAmountRow inputAmountRow) {
                    cryptoLimitOrderFragment.getDuxo().onInputTypeTapped(inputAmountRow.getInputMode());
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
                    ComposerKt.traceEventStart(-1691027317, i, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindAmountRow.<anonymous> (CryptoLimitOrderFragment.kt:347)");
                }
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1715490237, true, new AnonymousClass1(amountRow, formState, this), composer, 54), composer, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getContentBinding().cryptoAmountEdt.setIsAmountEnabled(!formState.getIsReviewingState(), false);
        getContentBinding().cryptoAmountEdt.setCurrencySymbolPosition(amountRow.getCurrencySymbolPosition());
        CryptoAmountInputView cryptoAmountInputView = getContentBinding().cryptoAmountEdt;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        cryptoAmountInputView.setHint(ZERO);
        getContentBinding().cryptoAmountEdt.setCurrency(amountRow.getInputCurrency());
        getContentBinding().cryptoAmountEdt.setText(amountRow.getInputAmountFormatted());
    }

    private final void bindFeeRow(final CryptoOrderReviewRowState feeRow, ComposeView composeView) {
        composeView.setContent(ComposableLambda3.composableLambdaInstance(-1692186482, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindFeeRow.1
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
                    ComposerKt.traceEventStart(-1692186482, i, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindFeeRow.<anonymous> (CryptoLimitOrderFragment.kt:367)");
                }
                final CryptoOrderReviewRowState cryptoOrderReviewRowState = feeRow;
                final CryptoLimitOrderFragment cryptoLimitOrderFragment = this;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(568751174, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindFeeRow.1.1
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
                            ComposerKt.traceEventStart(568751174, i2, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindFeeRow.<anonymous>.<anonymous> (CryptoLimitOrderFragment.kt:368)");
                        }
                        CryptoOrderReviewRowState cryptoOrderReviewRowState2 = cryptoOrderReviewRowState;
                        if (cryptoOrderReviewRowState2 != null) {
                            CryptoLimitOrderDuxo duxo = cryptoLimitOrderFragment.getDuxo();
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(duxo);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new CryptoLimitOrderFragment5(duxo);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState2, null, (Function1) ((KFunction) objRememberedValue), composer2, CryptoOrderReviewRowState.$stable, 2);
                        }
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

    private final void bindLimitPriceRow(final CryptoLimitOrderViewState.Loaded.LimitRow limitRow, DefaultOrderState formState) {
        getContentBinding().cryptoLimitPriceLabelContent.setContent(ComposableLambda3.composableLambdaInstance(-1670316338, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindLimitPriceRow.1
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
                    ComposerKt.traceEventStart(-1670316338, i, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindLimitPriceRow.<anonymous> (CryptoLimitOrderFragment.kt:383)");
                }
                final CryptoLimitOrderViewState.Loaded.LimitRow limitRow2 = limitRow;
                final CryptoLimitOrderFragment cryptoLimitOrderFragment = this;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-615594362, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindLimitPriceRow.1.1
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
                            ComposerKt.traceEventStart(-615594362, i2, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindLimitPriceRow.<anonymous>.<anonymous> (CryptoLimitOrderFragment.kt:384)");
                        }
                        CryptoLimitOrderViewState.Loaded.LimitRow limitRow3 = limitRow2;
                        CryptoLimitOrderDuxo duxo = cryptoLimitOrderFragment.getDuxo();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(duxo);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new CryptoLimitOrderFragment7(duxo);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        CryptoLimitOrderLimitPriceComposable.CryptoLimitOrderLimitPriceComposable(limitRow3, (Function0) ((KFunction) objRememberedValue), null, composer2, 0, 4);
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
        getContentBinding().cryptoLimitPriceEdt.setIsAmountEnabled(!formState.getIsReviewingState(), false);
        getContentBinding().cryptoLimitPriceEdt.setCurrencySymbolPosition(limitRow.getCurrencySymbolPosition());
        getContentBinding().cryptoLimitPriceEdt.setHint(limitRow.getHintPrice());
        getContentBinding().cryptoLimitPriceEdt.setCurrency(limitRow.getQuoteCurrency());
        getContentBinding().cryptoLimitPriceEdt.setText(limitRow.getLimitPriceFormatted());
    }

    private final void bindEstimatedAmountRow(final CryptoLimitOrderViewState.Loaded.EstimatedAmountRow estimatedAmountRow) {
        getContentBinding().cryptoEstimatedAmountContent.setContent(ComposableLambda3.composableLambdaInstance(1285191175, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindEstimatedAmountRow.1
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
                    ComposerKt.traceEventStart(1285191175, i, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindEstimatedAmountRow.<anonymous> (CryptoLimitOrderFragment.kt:402)");
                }
                final CryptoLimitOrderViewState.Loaded.EstimatedAmountRow estimatedAmountRow2 = estimatedAmountRow;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1556121935, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindEstimatedAmountRow.1.1
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
                            ComposerKt.traceEventStart(1556121935, i2, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindEstimatedAmountRow.<anonymous>.<anonymous> (CryptoLimitOrderFragment.kt:403)");
                        }
                        CryptoLimitOrderEstimatedAmountComposable.CryptoLimitOrderEstimatedAmountComposable(estimatedAmountRow2, null, composer2, StringResource.$stable, 2);
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

    private final void bindCtaButtons(CryptoLimitOrderViewState.Loaded.CtaButtonState buttonState) {
        if (buttonState instanceof CryptoLimitOrderViewState.Loaded.CtaButtonState.Continue) {
            RdsButton reviewBtn = getFragmentBinding().reviewBtn;
            Intrinsics.checkNotNullExpressionValue(reviewBtn, "reviewBtn");
            reviewBtn.setVisibility(0);
            CryptoLimitOrderViewState.Loaded.CtaButtonState.Continue r6 = (CryptoLimitOrderViewState.Loaded.CtaButtonState.Continue) buttonState;
            getFragmentBinding().reviewBtn.setEnabled(r6.isEnabled());
            getFragmentBinding().reviewBtn.setLoading(r6.isLoading());
            RdsButton cryptoSellAllBtn = getFragmentBinding().cryptoSellAllBtn;
            Intrinsics.checkNotNullExpressionValue(cryptoSellAllBtn, "cryptoSellAllBtn");
            cryptoSellAllBtn.setVisibility(8);
            return;
        }
        if (!(buttonState instanceof CryptoLimitOrderViewState.Loaded.CtaButtonState.SellAllButton)) {
            throw new NoWhenBranchMatchedException();
        }
        RdsButton reviewBtn2 = getFragmentBinding().reviewBtn;
        Intrinsics.checkNotNullExpressionValue(reviewBtn2, "reviewBtn");
        reviewBtn2.setVisibility(8);
        RdsButton cryptoSellAllBtn2 = getFragmentBinding().cryptoSellAllBtn;
        Intrinsics.checkNotNullExpressionValue(cryptoSellAllBtn2, "cryptoSellAllBtn");
        cryptoSellAllBtn2.setVisibility(0);
        RdsButton rdsButton = getFragmentBinding().cryptoSellAllBtn;
        StringResource text = ((CryptoLimitOrderViewState.Loaded.CtaButtonState.SellAllButton) buttonState).getText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsButton.setText(text.getText(resources));
    }

    private final void bindToolbar(CryptoLimitOrderViewState.Loaded.ToolbarContent toolbarContent) throws Resources.NotFoundException {
        CharSequence text;
        RhTextView rhTextView = this.toolbarOrderTypeTextView;
        CharSequence text2 = null;
        if (rhTextView != null) {
            StringResource orderTypeText = toolbarContent.getOrderTypeText();
            if (orderTypeText != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = orderTypeText.getText(resources);
            } else {
                text = null;
            }
            TextViewsKt.setVisibilityText(rhTextView, text);
        }
        RhTextView rhTextView2 = this.toolbarTitleTextView;
        if (rhTextView2 != null) {
            StringResource titleText = toolbarContent.getTitleText();
            if (titleText != null) {
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                text2 = titleText.getText(resources2);
            }
            TextViewsKt.setVisibilityText(rhTextView2, text2);
        }
    }

    private final void bindEdtsNumpadKeyEventsAndSellAllButton() {
        getContentBinding().cryptoAmountEdt.setCustomCursorDrawable();
        getContentBinding().cryptoAmountEdt.removeTextChangedListener();
        LifecycleHost.DefaultImpls.bind$default(this, getContentBinding().cryptoAmountEdt.edtFocusChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C402581(this.amountEdtFocusedRelay));
        getContentBinding().cryptoLimitPriceEdt.setCustomCursorDrawable();
        getContentBinding().cryptoLimitPriceEdt.removeTextChangedListener();
        LifecycleHost.DefaultImpls.bind$default(this, getContentBinding().cryptoLimitPriceEdt.edtFocusChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C402592(this.limitEdtFocusedRelay));
        LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.combineLatest(this.amountEdtFocusedRelay, this.limitEdtFocusedRelay), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderFragment.bindEdtsNumpadKeyEventsAndSellAllButton$lambda$11(this.f$0, (Tuples2) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.withLatestFrom(getFragmentBinding().numpad.getKeyEvents(), this.focusedEdtTypeRelay), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoLimitOrderFragment.bindEdtsNumpadKeyEventsAndSellAllButton$lambda$12(this.f$0, (Tuples2) obj);
            }
        });
        getFragmentBinding().cryptoSellAllBtn.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.bindEdtsNumpadKeyEventsAndSellAllButton.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CryptoLimitOrderFragment.this.getDuxo().sellAll();
            }
        });
    }

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$bindEdtsNumpadKeyEventsAndSellAllButton$1 */
    /* synthetic */ class C402581 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        C402581(Object obj) {
            super(1, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BehaviorRelay) this.receiver).accept(p0);
        }
    }

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$bindEdtsNumpadKeyEventsAndSellAllButton$2 */
    /* synthetic */ class C402592 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        C402592(Object obj) {
            super(1, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BehaviorRelay) this.receiver).accept(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindEdtsNumpadKeyEventsAndSellAllButton$lambda$11(CryptoLimitOrderFragment cryptoLimitOrderFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Boolean bool = (Boolean) tuples2.component1();
        Boolean bool2 = (Boolean) tuples2.component2();
        CryptoLimitOrderDuxo duxo = cryptoLimitOrderFragment.getDuxo();
        Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNull(bool2);
        duxo.setFocusedEdt(zBooleanValue, bool2.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindEdtsNumpadKeyEventsAndSellAllButton$lambda$12(CryptoLimitOrderFragment cryptoLimitOrderFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        KeyEvent keyEvent = (KeyEvent) tuples2.component1();
        CryptoLimitOrderEdtType cryptoLimitOrderEdtType = (CryptoLimitOrderEdtType) tuples2.component2();
        CryptoLimitOrderDuxo duxo = cryptoLimitOrderFragment.getDuxo();
        Intrinsics.checkNotNull(cryptoLimitOrderEdtType);
        duxo.consumeKeyEvent(keyEvent, cryptoLimitOrderEdtType);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void validateAndReviewOrder() {
        getDuxo().validateAndReviewOrder();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void performSubmitOrder() {
        getDuxo().submitOrder();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public ConstraintSet getConstraintsForState(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        int i = WhenMappings.$EnumSwitchMapping$1[formState.ordinal()];
        if (i == 1) {
            return this.initialConstraints;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.reviewingConstraints;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateUpdated() {
        super.onFormStateUpdated();
        getDuxo().updateFormState(getFormState());
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateChanged(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        super.onFormStateChanged((CryptoLimitOrderFragment) formState);
        setBackgroundColor(formState);
        ScarletManager2.overrideAttribute(requireToolbar().getToolbar(), R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getCOLOR_POSITIVE());
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onAnimationStep(float ratio, float maxDragDistance) {
        super.onAnimationStep(ratio, maxDragDistance);
        float f = ratio * maxDragDistance * (-1);
        setCardViewBottomY(Math.max(0, (int) getCardView().getY()) + getCardView().getHeight() + ((int) f));
        getFragmentBinding().rebrandUnderlay.setTranslationY(Math.min(0.0f, f));
    }

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment$Args;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "orderUuid", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getOrderUuid", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final OrderSide orderSide;
        private final UUID orderUuid;

        /* compiled from: CryptoLimitOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), OrderSide.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, UUID uuid2, OrderSide orderSide, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.currencyPairId;
            }
            if ((i & 2) != 0) {
                uuid2 = args.orderUuid;
            }
            if ((i & 4) != 0) {
                orderSide = args.orderSide;
            }
            return args.copy(uuid, uuid2, orderSide);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        public final Args copy(UUID currencyPairId, UUID orderUuid, OrderSide orderSide) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            return new Args(currencyPairId, orderUuid, orderSide);
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
            return Intrinsics.areEqual(this.currencyPairId, args.currencyPairId) && Intrinsics.areEqual(this.orderUuid, args.orderUuid) && this.orderSide == args.orderSide;
        }

        public int hashCode() {
            return (((this.currencyPairId.hashCode() * 31) + this.orderUuid.hashCode()) * 31) + this.orderSide.hashCode();
        }

        public String toString() {
            return "Args(currencyPairId=" + this.currencyPairId + ", orderUuid=" + this.orderUuid + ", orderSide=" + this.orderSide + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeSerializable(this.orderUuid);
            dest.writeString(this.orderSide.name());
        }

        public Args(UUID currencyPairId, UUID orderUuid, OrderSide orderSide) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            this.currencyPairId = currencyPairId;
            this.orderUuid = orderUuid;
            this.orderSide = orderSide;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        public final OrderSide getOrderSide() {
            return this.orderSide;
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
                ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetOrderSize setOrderSize = (ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetOrderSize) type2;
                getDuxo().setOrderSize(setOrderSize.getValue().getQuote_amount().toBigDecimalOrThrow(), setOrderSize.getValue().getAsset_amount().toBigDecimalOrThrow());
            } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetLimitPrice) {
                getDuxo().setLimitPrice(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetLimitPrice) type2).getValue().getLimit_price().toBigDecimalOrThrow());
            } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.StartDepositFlow) {
                getDuxo().initiateDeposit();
            } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.ConvertToSellAll) {
                getDuxo().sellAll();
            } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetPdtWarningAsSeen) {
                throw new IllegalStateException("PDT failure is not applicable to EU");
            }
        }
    }

    /* compiled from: CryptoLimitOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment$Args;", "<init>", "()V", "TAG_MICROGRAM_ORDER_VALIDATION_ALERT", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoLimitOrderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoLimitOrderFragment cryptoLimitOrderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoLimitOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoLimitOrderFragment newInstance(Args args) {
            return (CryptoLimitOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoLimitOrderFragment cryptoLimitOrderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoLimitOrderFragment, args);
        }
    }
}
