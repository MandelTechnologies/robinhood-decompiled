package com.robinhood.android.trade.directipo.p260ui.order;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.validation.ValidationData;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.databinding.FragmentDirectIpoOrderBinding;
import com.robinhood.android.trade.directipo.databinding.MergeDirectIpoOrderBinding;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderPriceInfoAlertDialogFragment;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderTypeBottomSheetFragment;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderViewState;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderContext;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderFailureResolver;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderValidationFailure;
import com.robinhood.android.trading.contracts.CancelIpoOrderDialogKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.directipo.models.DirectIpoOrderSource;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderConfiguration;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.util.Money;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p408rx.transformer.CharSequenceToBigDecimalTransformer;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006:\u0003bcdB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u00108\u001a\u000209H\u0016J\u001a\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020&H\u0016J\b\u0010F\u001a\u000209H\u0016J\u001a\u0010G\u001a\u00020@2\u0006\u0010E\u001a\u00020&2\b\u0010H\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010I\u001a\u00020@2\u0006\u0010E\u001a\u00020&2\b\u0010H\u001a\u0004\u0018\u00010>H\u0016J\b\u0010J\u001a\u000209H\u0016J\b\u0010K\u001a\u000209H\u0016J\b\u0010L\u001a\u000209H\u0016J\u0010\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020\u0003H\u0016J\u0010\u0010O\u001a\u0002092\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u000209H\u0016J\b\u0010S\u001a\u000209H\u0016J\u0010\u0010T\u001a\u0002092\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u0002092\u0006\u0010X\u001a\u00020@H\u0002J\u0012\u0010Y\u001a\u0002092\b\u0010Z\u001a\u0004\u0018\u00010[H\u0002J\t\u0010\\\u001a\u00020@H\u0096\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b1\u00102R\u001c\u00104\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u0001060605X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006e"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "Lcom/robinhood/android/trading/contracts/CancelIpoOrderDialogKey$Callbacks;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderTypeBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderFailureResolver;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "containerBindings", "Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoOrderBinding;", "getContainerBindings", "()Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoOrderBinding;", "containerBindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cardBindings", "Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderBinding;", "getCardBindings", "()Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderBinding;", "cardBindings$delegate", "duxo", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment$Callbacks;", "callbacks$delegate", "reviewingConstraintLayoutRes", "", "initialConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "reviewingConstraints", "contentRes", "getContentRes", "()I", "initialLayoutRes", "getInitialLayoutRes", "boldTypeface", "Landroid/graphics/Typeface;", "getBoldTypeface", "()Landroid/graphics/Typeface;", "boldTypeface$delegate", "showUpdateApp", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDialogDismissed", "id", "onOrderCancelled", "onPositiveButtonClicked", "passthroughArgs", "onNegativeButtonClicked", "validateAndReviewOrder", "performSubmitOrder", "onFormStateUpdated", "getConstraintsForState", "formState", "onPriceTypeSelected", "priceType", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "launchAchTransfer", "launchRhsConversion", "setViewState", "viewState", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState;", "updateTextPlaceholders", "isLoading", "setCancelOrderButton", "cancelOrderViewState", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$CancelOrderViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DirectIpoOrderFragment extends BaseOrderFragment<DefaultOrderState> implements RegionGated, CancelIpoOrderDialogKey.Callbacks, DirectIpoOrderTypeBottomSheetFragment.Callbacks, DirectIpoOrderFailureResolver {
    private static final String TAG_PRICE_TYPE = "direct-ipo-price-type";
    private static final String TAG_TOTAL_COST_INFO = "direct-ipo-total-cost-info";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: boldTypeface$delegate, reason: from kotlin metadata */
    private final Lazy boldTypeface;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: cardBindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 cardBindings;

    /* renamed from: containerBindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 containerBindings;
    private final int contentRes;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ConstraintSet initialConstraints;
    private final int initialLayoutRes;
    public Markwon markwon;
    private final int reviewingConstraintLayoutRes;
    private final ConstraintSet reviewingConstraints;
    private final ActivityResultLauncher<Intent> showUpdateApp;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOrderFragment.class, "containerBindings", "getContainerBindings()Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoOrderFragment.class, "cardBindings", "getCardBindings()Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment$Callbacks;", "", "onLoadDirectIpoOrderConfigurationFailed", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLoadDirectIpoOrderConfigurationFailed();
    }

    /* compiled from: DirectIpoOrderFragment.kt */
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

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoOrderFragment() {
        super(DefaultOrderState.EDITING);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.containerBindings = ViewBinding5.viewBinding(this, DirectIpoOrderFragment3.INSTANCE);
        this.cardBindings = ViewBinding5.viewBinding(this, DirectIpoOrderFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, DirectIpoOrderDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.reviewingConstraintLayoutRes = C29323R.layout.fragment_direct_ipo_order_reviewing;
        this.initialConstraints = new ConstraintSet();
        this.reviewingConstraints = new ConstraintSet();
        this.contentRes = C29323R.layout.merge_direct_ipo_order;
        this.initialLayoutRes = C29323R.layout.fragment_direct_ipo_order;
        this.boldTypeface = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOrderFragment.boldTypeface_delegate$lambda$0(this.f$0);
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$showUpdateApp$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.getCallbacks().onLoadDirectIpoOrderConfigurationFailed();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.showUpdateApp = activityResultLauncherRegisterForActivityResult;
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

    private final FragmentDirectIpoOrderBinding getContainerBindings() {
        Object value = this.containerBindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoOrderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MergeDirectIpoOrderBinding getCardBindings() {
        Object value = this.cardBindings.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeDirectIpoOrderBinding) value;
    }

    private final DirectIpoOrderDuxo getDuxo() {
        return (DirectIpoOrderDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return this.contentRes;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return this.initialLayoutRes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface boldTypeface_delegate$lambda$0(DirectIpoOrderFragment directIpoOrderFragment) {
        RhTypeface rhTypeface = RhTypeface.BOLD;
        Context contextRequireContext = directIpoOrderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return rhTypeface.load(contextRequireContext);
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        RhEditText directIpoSharesQuantityEdt = getCardBindings().directIpoSharesQuantityEdt;
        Intrinsics.checkNotNullExpressionValue(directIpoSharesQuantityEdt, "directIpoSharesQuantityEdt");
        Observable observableDistinctUntilChanged = RxTextView.textChanges(directIpoSharesQuantityEdt).compose(CharSequenceToBigDecimalTransformer.INSTANCE).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderFragment.onStart$lambda$1(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getCardBindings().directIpoCustomPriceEdt.getAmountObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderFragment.onStart$lambda$2(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C293443(this));
        Observable<StateT> states = getDuxo().getStates();
        final C293454 c293454 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment.onStart.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((DirectIpoOrderViewState) obj).getFormState();
            }
        };
        Observable observableDistinctUntilChanged2 = states.map(new Function(c293454) { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c293454, "function");
                this.function = c293454;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C293465(this));
        Observable observableDistinctUntilChanged3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment.onStart.6
            @Override // io.reactivex.functions.Function
            public final Optional<DirectIpoOrderViewState.SelectOrderType> apply(DirectIpoOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return Optional3.asOptional(state.getSelectOrderType());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderFragment.onStart$lambda$5(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment.onStart.8
            @Override // io.reactivex.functions.Function
            public final Optional<DirectIpoOrderViewState.PriceInfo> apply(DirectIpoOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return Optional3.asOptional(state.getPriceInfo());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderFragment.onStart$lambda$7(this.f$0, (Optional) obj);
            }
        });
        Observable map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                DirectIpoOrderViewState.OrderEntryViewState orderEntryViewState = ((DirectIpoOrderViewState) it).getOrderEntryViewState();
                return Optional3.asOptional(orderEntryViewState != null ? orderEntryViewState.getDisclaimerMarkdown() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((DirectIpoOrderFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged5 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderFragment.onStart$lambda$9(this.f$0, (String) obj);
            }
        });
        Observable map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$onStart$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                DirectIpoOrderViewState.OrderEntryViewState orderEntryViewState = ((DirectIpoOrderViewState) it).getOrderEntryViewState();
                return Optional3.asOptional(orderEntryViewState != null ? Tuples4.m3642to(orderEntryViewState.getReviewTitleText(), orderEntryViewState.getReviewDescriptionMarkdown()) : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((DirectIpoOrderFragment$onStart$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged6 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderFragment.onStart$lambda$14(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged7 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment.onStart.14
            @Override // io.reactivex.functions.Function
            public final Optional<DirectIpoOrderViewState.CancelOrderViewState> apply(DirectIpoOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return Optional3.asOptional(state.getCancelOrderViewState());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged7), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderFragment.onStart$lambda$15(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DirectIpoOrderFragment directIpoOrderFragment, Optional optional) {
        directIpoOrderFragment.getDuxo().setShareQuantity(BigDecimals7.orZero((BigDecimal) optional.component1()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(DirectIpoOrderFragment directIpoOrderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        directIpoOrderFragment.getDuxo().setCustomPrice((Money) optional.component1());
        return Unit.INSTANCE;
    }

    /* compiled from: DirectIpoOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$onStart$3 */
    /* synthetic */ class C293443 extends FunctionReferenceImpl implements Function1<DirectIpoOrderViewState, Unit> {
        C293443(Object obj) {
            super(1, obj, DirectIpoOrderFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectIpoOrderViewState directIpoOrderViewState) throws Throwable {
            invoke2(directIpoOrderViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectIpoOrderViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoOrderFragment) this.receiver).setViewState(p0);
        }
    }

    /* compiled from: DirectIpoOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$onStart$5 */
    /* synthetic */ class C293465 extends FunctionReferenceImpl implements Function1<DefaultOrderState, Unit> {
        C293465(Object obj) {
            super(1, obj, DirectIpoOrderFragment.class, "setFormState", "setFormState(Lcom/robinhood/android/lib/trade/OrderState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DefaultOrderState defaultOrderState) {
            invoke2(defaultOrderState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DefaultOrderState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoOrderFragment) this.receiver).setFormState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(final DirectIpoOrderFragment directIpoOrderFragment, Optional optional) {
        final DirectIpoOrderViewState.SelectOrderType selectOrderType = (DirectIpoOrderViewState.SelectOrderType) optional.component1();
        RhTextView rhTextView = directIpoOrderFragment.getCardBindings().directIpoSetPriceTypeBtn;
        if (selectOrderType != null) {
            rhTextView.setText(selectOrderType.getButtonText());
            Intrinsics.checkNotNull(rhTextView);
            rhTextView.setVisibility(0);
            OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectIpoOrderFragment.onStart$lambda$5$lambda$4$lambda$3(selectOrderType, directIpoOrderFragment);
                }
            });
            IdlingResourceCounters2.setBusy(IdlingResourceType.EQUITY_IPOA_NAME_YOUR_OWN_PRICE_BTN_VISIBLE, false);
        } else {
            rhTextView.setOnClickListener(null);
            Intrinsics.checkNotNull(rhTextView);
            rhTextView.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5$lambda$4$lambda$3(DirectIpoOrderViewState.SelectOrderType selectOrderType, DirectIpoOrderFragment directIpoOrderFragment) {
        DirectIpoOrderTypeBottomSheetFragment directIpoOrderTypeBottomSheetFragment = (DirectIpoOrderTypeBottomSheetFragment) DirectIpoOrderTypeBottomSheetFragment.INSTANCE.newInstance((Parcelable) new DirectIpoOrderTypeBottomSheetFragment.Args(selectOrderType.getSelectedPriceType(), selectOrderType.getPriceTypeOptions()));
        FragmentManager childFragmentManager = directIpoOrderFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        directIpoOrderTypeBottomSheetFragment.show(childFragmentManager, TAG_PRICE_TYPE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(final DirectIpoOrderFragment directIpoOrderFragment, Optional optional) {
        final DirectIpoOrderViewState.PriceInfo priceInfo = (DirectIpoOrderViewState.PriceInfo) optional.component1();
        if (priceInfo != null) {
            RhTextView directIpoPriceLabelTxt = directIpoOrderFragment.getCardBindings().directIpoPriceLabelTxt;
            Intrinsics.checkNotNullExpressionValue(directIpoPriceLabelTxt, "directIpoPriceLabelTxt");
            TextViewsKt.setDrawables$default((TextView) directIpoPriceLabelTxt, 0, 0, C20690R.drawable.ic_rds_question_16dp, 0, true, 11, (Object) null);
            RhTextView directIpoPriceLabelTxt2 = directIpoOrderFragment.getCardBindings().directIpoPriceLabelTxt;
            Intrinsics.checkNotNullExpressionValue(directIpoPriceLabelTxt2, "directIpoPriceLabelTxt");
            OnClickListeners.onClick(directIpoPriceLabelTxt2, new Function0() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectIpoOrderFragment.onStart$lambda$7$lambda$6(priceInfo, directIpoOrderFragment);
                }
            });
        } else {
            RhTextView directIpoPriceLabelTxt3 = directIpoOrderFragment.getCardBindings().directIpoPriceLabelTxt;
            Intrinsics.checkNotNullExpressionValue(directIpoPriceLabelTxt3, "directIpoPriceLabelTxt");
            TextViewsKt.setDrawables$default((TextView) directIpoPriceLabelTxt3, (Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null, false, 27, (Object) null);
            directIpoOrderFragment.getCardBindings().directIpoPriceLabelTxt.setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7$lambda$6(DirectIpoOrderViewState.PriceInfo priceInfo, DirectIpoOrderFragment directIpoOrderFragment) {
        DirectIpoOrderPriceInfoAlertDialogFragment directIpoOrderPriceInfoAlertDialogFragment = (DirectIpoOrderPriceInfoAlertDialogFragment) DirectIpoOrderPriceInfoAlertDialogFragment.INSTANCE.newInstance((Parcelable) new DirectIpoOrderPriceInfoAlertDialogFragment.Args(priceInfo.getCustomPrice(), priceInfo.getPriceInfoAlert()));
        FragmentManager childFragmentManager = directIpoOrderFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        directIpoOrderPriceInfoAlertDialogFragment.show(childFragmentManager, TAG_TOTAL_COST_INFO);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(DirectIpoOrderFragment directIpoOrderFragment, String str) {
        directIpoOrderFragment.getCardBindings().directIpoOrderDisclaimerTxt.setText(directIpoOrderFragment.getMarkwon().toMarkdown(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$14(DirectIpoOrderFragment directIpoOrderFragment, Tuples2 tuples2) throws IOException {
        String str = (String) tuples2.component1();
        String str2 = (String) tuples2.component2();
        RhTextView rhTextView = directIpoOrderFragment.getCardBindings().directIpoReviewTxt;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(directIpoOrderFragment.getBoldTypeface());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(customTypefaceSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append('\n');
        spannableStringBuilder.append((CharSequence) directIpoOrderFragment.getMarkwon().toMarkdown(str2));
        rhTextView.setText(new SpannedString(spannableStringBuilder));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$15(DirectIpoOrderFragment directIpoOrderFragment, Optional optional) {
        directIpoOrderFragment.setCancelOrderButton((DirectIpoOrderViewState.CancelOrderViewState) optional.component1());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(getRoot(), InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        this.initialConstraints.clone(getRoot());
        this.reviewingConstraints.clone(getActivity(), this.reviewingConstraintLayoutRes);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getReviewing()) {
            getDuxo().setFormState(DefaultOrderState.EDITING);
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (toolbar.findViewById(C29323R.id.direct_ipo_toolbar_content) == null) {
            RhToolbar.addCustomView$default(toolbar, C29323R.layout.include_direct_ipo_toolbar_content, false, 0, 6, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        super.onDialogDismissed(id);
        if (id == C29323R.id.dialog_id_direct_ipo_load_configuration_failure) {
            getCallbacks().onLoadDirectIpoOrderConfigurationFailed();
        }
    }

    @Override // com.robinhood.android.trading.contracts.CancelIpoOrderDialogKey.Callbacks
    public void onOrderCancelled() {
        IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_CANCELLED, false);
        requireActivity().finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        DirectIpoOrderValidationFailure failure = DirectIpoOrderValidationFailure.INSTANCE.getFailure(passthroughArgs);
        if (failure != null) {
            getDuxo().onDialogAction(failure, failure.onPositiveResponse(this, passthroughArgs));
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        DirectIpoOrderValidationFailure failure = DirectIpoOrderValidationFailure.INSTANCE.getFailure(passthroughArgs);
        if (failure != null) {
            getDuxo().onDialogAction(failure, failure.onNegativeResponse(this, passthroughArgs));
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void validateAndReviewOrder() {
        getDuxo().validate();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void performSubmitOrder() {
        getDuxo().submitOrder();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateUpdated() {
        boolean reviewing = getReviewing();
        MergeDirectIpoOrderBinding cardBindings = getCardBindings();
        RhTextView directIpoOrderDisclaimerTxt = cardBindings.directIpoOrderDisclaimerTxt;
        Intrinsics.checkNotNullExpressionValue(directIpoOrderDisclaimerTxt, "directIpoOrderDisclaimerTxt");
        directIpoOrderDisclaimerTxt.setVisibility(!reviewing ? 0 : 8);
        RhTextView directIpoReviewTxt = cardBindings.directIpoReviewTxt;
        Intrinsics.checkNotNullExpressionValue(directIpoReviewTxt, "directIpoReviewTxt");
        directIpoReviewTxt.setVisibility(reviewing ? 0 : 8);
        super.onFormStateUpdated();
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

    @Override // com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderTypeBottomSheetFragment.Callbacks
    public void onPriceTypeSelected(ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType) {
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        getDuxo().setPriceType(priceType);
    }

    @Override // com.robinhood.android.trade.directipo.validation.DirectIpoOrderFailureResolver
    public void launchAchTransfer() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(new TransferContext.Normal(TransferDirection.DEPOSIT, null, null, 6, null)), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.trade.directipo.validation.DirectIpoOrderFailureResolver
    public void launchRhsConversion() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.RhsConversion(true), null, false, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(DirectIpoOrderViewState viewState) throws Throwable {
        GenericAlert genericAlertConsume;
        DirectIpoOrderViewState.InitialLoad initialLoadConsume;
        Throwable thConsume;
        View view;
        ValidationData.ValidationResult<? extends DirectIpoOrderContext, ? extends DirectIpoOrderFailureResolver> validationResultConsume;
        UiEvent<ValidationData.ValidationResult<? extends DirectIpoOrderContext, ? extends DirectIpoOrderFailureResolver>> validationResult = viewState.getValidationResult();
        if (validationResult != null && (validationResultConsume = validationResult.consume()) != null) {
            if (validationResultConsume instanceof ValidationData.ValidationResult.Success) {
                getDuxo().setFormState(DefaultOrderState.REVIEWING);
            } else {
                if (!(validationResultConsume instanceof ValidationData.ValidationResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ValidationData.ValidationResult.Failure) validationResultConsume).showAlert(requireBaseActivity());
            }
        }
        requireBaseActivity().showProgressBar(viewState.getIsLoadingOrderConfiguration());
        updateTextPlaceholders(viewState.getIsLoadingOrderConfiguration());
        getCardBindings().directIpoSharesQuantityEdt.setEnabled(viewState.getIsSharesEditTextEnabled());
        getCardBindings().directIpoCustomPriceEdt.setAmountEnabled(viewState.getIsCustomPriceEditTextEnabled());
        getContainerBindings().reviewBtn.setEnabled(viewState.getIsReviewButtonEnabled());
        UiEvent<DirectIpoOrderViewState.FocusState> focusEvent = viewState.getFocusEvent();
        final DirectIpoOrderViewState.FocusState focusStateConsume = focusEvent != null ? focusEvent.consume() : null;
        if (focusStateConsume != null && (view = getView()) != null) {
            view.post(new Runnable() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment.setViewState.2

                /* compiled from: DirectIpoOrderFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$setViewState$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DirectIpoOrderViewState.FocusState.values().length];
                        try {
                            iArr[DirectIpoOrderViewState.FocusState.SHARES_INPUT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DirectIpoOrderViewState.FocusState.PRICE_INPUT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DirectIpoOrderViewState.FocusState focusState = focusStateConsume;
                    int i = focusState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[focusState.ordinal()];
                    if (i == 1) {
                        this.getCardBindings().directIpoSharesQuantityEdt.requestFocus();
                    } else {
                        if (i == 2) {
                            this.getCardBindings().directIpoCustomPriceEdt.requestInputFocus();
                            return;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            });
        }
        UiEvent<Unit> unsupportedFeatureEvent = viewState.getUnsupportedFeatureEvent();
        if ((unsupportedFeatureEvent != null ? unsupportedFeatureEvent.consume() : null) != null) {
            ActivityResultLauncher<Intent> activityResultLauncher = this.showUpdateApp;
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 6, null), null, false, 12, null));
        }
        UiEvent<Throwable> loadOrderConfigurationError = viewState.getLoadOrderConfigurationError();
        if (loadOrderConfigurationError != null && (thConsume = loadOrderConfigurationError.consume()) != null) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, C29323R.id.dialog_id_direct_ipo_load_configuration_failure, null, 40, null);
        }
        UiEvent<DirectIpoOrderViewState.InitialLoad> initialLoadEvent = viewState.getInitialLoadEvent();
        if (initialLoadEvent != null && (initialLoadConsume = initialLoadEvent.consume()) != null) {
            getDuxo().logInitialLoad(initialLoadConsume);
        }
        UiEvent<BigDecimal> setStartingQuantityEvent = viewState.getSetStartingQuantityEvent();
        BigDecimal bigDecimalConsume = setStartingQuantityEvent != null ? setStartingQuantityEvent.consume() : null;
        if (bigDecimalConsume != null) {
            RhEditText rhEditText = getCardBindings().directIpoSharesQuantityEdt;
            String plainString = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalConsume).toPlainString();
            rhEditText.setText(plainString);
            rhEditText.setSelection(plainString.length());
        }
        UiEvent<Money> setStartingPriceEvent = viewState.getSetStartingPriceEvent();
        Money moneyConsume = setStartingPriceEvent != null ? setStartingPriceEvent.consume() : null;
        if (moneyConsume != null) {
            getCardBindings().directIpoCustomPriceEdt.setAmount(moneyConsume);
        }
        DirectIpoOrderViewState.OrderEntryViewState orderEntryViewState = viewState.getOrderEntryViewState();
        if (orderEntryViewState != null) {
            getCardBindings().directIpoTitleTxt.setText(orderEntryViewState.getTitleText());
            getCardBindings().directIpoDescriptionTxt.setText(orderEntryViewState.getBuyingPowerAvailableText());
            getCardBindings().directIpoSharesQuantityLabelTxt.setText(orderEntryViewState.getQuantityLabelText());
            getCardBindings().directIpoSharesQuantityEdt.setHint(orderEntryViewState.getQuantityHintText());
            getCardBindings().directIpoCustomPriceEdt.setHint(orderEntryViewState.getCustomPriceHintText());
            getCardBindings().directIpoPriceLabelTxt.setText(orderEntryViewState.getPriceRangeLabelText());
            RhTextView directIpoPriceValueTxt = getCardBindings().directIpoPriceValueTxt;
            Intrinsics.checkNotNullExpressionValue(directIpoPriceValueTxt, "directIpoPriceValueTxt");
            directIpoPriceValueTxt.setVisibility(orderEntryViewState.getPriceRangeValueVisible() ? 0 : 8);
            getCardBindings().directIpoPriceValueTxt.setText(orderEntryViewState.getPriceRangeValueText());
            RhMoneyInputView directIpoCustomPriceEdt = getCardBindings().directIpoCustomPriceEdt;
            Intrinsics.checkNotNullExpressionValue(directIpoCustomPriceEdt, "directIpoCustomPriceEdt");
            directIpoCustomPriceEdt.setVisibility(orderEntryViewState.getCustomPriceInputVisible() ? 0 : 8);
            RhTextView directIpoPriceSubtitleTxt = getCardBindings().directIpoPriceSubtitleTxt;
            Intrinsics.checkNotNullExpressionValue(directIpoPriceSubtitleTxt, "directIpoPriceSubtitleTxt");
            directIpoPriceSubtitleTxt.setVisibility(orderEntryViewState.getPriceRangeSubtitleText() != null ? 0 : 8);
            getCardBindings().directIpoPriceSubtitleTxt.setText(orderEntryViewState.getPriceRangeSubtitleText());
            getCardBindings().directIpoTotalLabelTxt.setText(orderEntryViewState.getTotalLabelText());
            RhTextView rhTextView = getCardBindings().directIpoTotalValueTxt;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhTextView.setText(orderEntryViewState.getTotalValueText(resources));
            RhTextView directIpoOrderDisclaimerTxt = getCardBindings().directIpoOrderDisclaimerTxt;
            Intrinsics.checkNotNullExpressionValue(directIpoOrderDisclaimerTxt, "directIpoOrderDisclaimerTxt");
            TextViewsKt.setDrawables$default((TextView) directIpoOrderDisclaimerTxt, orderEntryViewState.getDisclaimerIcon(), 0, 0, 0, true, 14, (Object) null);
        }
        UiEvent<GenericAlert> formInvalidAlertEvent = viewState.getFormInvalidAlertEvent();
        if (formInvalidAlertEvent == null || (genericAlertConsume = formInvalidAlertEvent.consume()) == null) {
            return;
        }
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(genericAlertConsume, false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(getChildFragmentManager(), "direct-ipo-order-invalid-form");
    }

    private final void updateTextPlaceholders(boolean isLoading) throws Resources.NotFoundException {
        int themeColor;
        if (isLoading) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            themeColor = ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorBackground3);
        } else {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            themeColor = ThemeColors.getThemeColor(contextRequireContext2, C20690R.attr.colorTransparent);
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(themeColor);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        MergeDirectIpoOrderBinding cardBindings = getCardBindings();
        cardBindings.directIpoTitleTxt.setBackgroundTintList(colorStateListValueOf);
        cardBindings.directIpoDescriptionTxt.setBackgroundTintList(colorStateListValueOf);
        cardBindings.directIpoSharesQuantityLabelTxt.setBackgroundTintList(colorStateListValueOf);
        cardBindings.directIpoPriceLabelTxt.setBackgroundTintList(colorStateListValueOf);
        cardBindings.directIpoPriceValueTxt.setBackgroundTintList(colorStateListValueOf);
        cardBindings.directIpoPriceSubtitleTxt.setBackgroundTintList(colorStateListValueOf);
        cardBindings.directIpoPriceSubtitleTxt.setBackgroundTintList(colorStateListValueOf);
        cardBindings.directIpoTotalLabelTxt.setBackgroundTintList(colorStateListValueOf);
        cardBindings.directIpoTotalValueTxt.setBackgroundTintList(colorStateListValueOf);
    }

    private final void setCancelOrderButton(DirectIpoOrderViewState.CancelOrderViewState cancelOrderViewState) {
        View viewFindViewById = requireToolbar().findViewById(C29323R.id.cancel_order_button);
        if (viewFindViewById == null) {
            return;
        }
        if (cancelOrderViewState == null) {
            viewFindViewById.setVisibility(8);
            viewFindViewById.setOnClickListener(null);
            return;
        }
        final UUID uuidComponent1 = cancelOrderViewState.getOrderId();
        final BigDecimal bigDecimalComponent2 = cancelOrderViewState.getSharesQuantity();
        final String strComponent3 = cancelOrderViewState.getSymbol();
        viewFindViewById.setVisibility(0);
        OnClickListeners.onClick(viewFindViewById, new Function0() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOrderFragment.setCancelOrderButton$lambda$25$lambda$24(this.f$0, uuidComponent1, bigDecimalComponent2, strComponent3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCancelOrderButton$lambda$25$lambda$24(DirectIpoOrderFragment directIpoOrderFragment, UUID uuid, BigDecimal bigDecimal, String str) {
        Navigator.DefaultImpls.createDialogFragment$default(directIpoOrderFragment.getNavigator(), new CancelIpoOrderDialogKey(uuid, BrokerageAccountType.INDIVIDUAL, CancelIpoOrderDialogKey.Source.ORDER_ENTRY, bigDecimal, str, OrderSide.BUY), null, 2, null).show(directIpoOrderFragment.getChildFragmentManager(), "direct-ipo-cancel-order-dialog");
        return Unit.INSTANCE;
    }

    /* compiled from: DirectIpoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "source", "Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "refId", "accountNumber", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/directipo/models/DirectIpoOrderSource;Ljava/util/UUID;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSource", "()Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "getRefId", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID instrumentId;
        private final UUID refId;
        private final DirectIpoOrderSource source;

        /* compiled from: DirectIpoOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : DirectIpoOrderSource.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, DirectIpoOrderSource directIpoOrderSource, UUID uuid2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 2) != 0) {
                directIpoOrderSource = args.source;
            }
            if ((i & 4) != 0) {
                uuid2 = args.refId;
            }
            if ((i & 8) != 0) {
                str = args.accountNumber;
            }
            return args.copy(uuid, directIpoOrderSource, uuid2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final DirectIpoOrderSource getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(UUID instrumentId, DirectIpoOrderSource source, UUID refId, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(instrumentId, source, refId, accountNumber);
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
            return Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.source == args.source && Intrinsics.areEqual(this.refId, args.refId) && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            int iHashCode = this.instrumentId.hashCode() * 31;
            DirectIpoOrderSource directIpoOrderSource = this.source;
            return ((((iHashCode + (directIpoOrderSource == null ? 0 : directIpoOrderSource.hashCode())) * 31) + this.refId.hashCode()) * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ", source=" + this.source + ", refId=" + this.refId + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            DirectIpoOrderSource directIpoOrderSource = this.source;
            if (directIpoOrderSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(directIpoOrderSource.name());
            }
            dest.writeSerializable(this.refId);
            dest.writeString(this.accountNumber);
        }

        public Args(UUID instrumentId, DirectIpoOrderSource directIpoOrderSource, UUID refId, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.instrumentId = instrumentId;
            this.source = directIpoOrderSource;
            this.refId = refId;
            this.accountNumber = accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final DirectIpoOrderSource getSource() {
            return this.source;
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: DirectIpoOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment$Args;", "<init>", "()V", "TAG_TOTAL_COST_INFO", "", "TAG_PRICE_TYPE", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOrderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectIpoOrderFragment directIpoOrderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOrderFragment newInstance(Args args) {
            return (DirectIpoOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOrderFragment directIpoOrderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOrderFragment, args);
        }
    }
}
