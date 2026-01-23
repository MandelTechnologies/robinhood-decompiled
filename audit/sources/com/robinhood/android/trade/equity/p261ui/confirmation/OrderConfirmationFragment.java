package com.robinhood.android.trade.equity.p261ui.confirmation;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.recurring.upsell.RecurringOrderUpsellManager;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equities.orderstatus.OrderConfirmationDescription;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.instant.p160ui.InstantCashConstants2;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.margin.api.ApiMarginUpsell;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowItem;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowItem2;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.margin.contracts.MarginAccountUpsellFragmentKey;
import com.robinhood.android.margin.contracts.SlipUpsellKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowIntentKey;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.EquityOrderCompletionCallbacks;
import com.robinhood.android.trade.equity.databinding.IncludeMarginUpsellContainerBinding;
import com.robinhood.android.trade.equity.databinding.IncludeOrderConfirmationLayoutBinding;
import com.robinhood.android.trade.equity.p261ui.confirmation.OrderConfirmationViewState;
import com.robinhood.android.trade.equity.util.Moneys2;
import com.robinhood.android.trade.equity.util.OrderSides;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.ClientComponentAlert;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.util.Money;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: OrderConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003abcB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0016J\u0010\u00108\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u000206H\u0016J\u0010\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020<H\u0016J\u001a\u0010=\u001a\u0002062\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010B\u001a\u000206H\u0016J\b\u0010C\u001a\u000206H\u0016J\u0010\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u0002062\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u0002062\u0006\u0010H\u001a\u00020IH\u0002J\u0012\u0010K\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010L\u001a\u000206H\u0002J\u0018\u0010M\u001a\u0002062\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020-H\u0002J\u001a\u0010Q\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u00022\u0006\u0010R\u001a\u00020SH\u0002J\u0018\u0010T\u001a\u0002062\u0006\u0010U\u001a\u00020V2\b\u00107\u001a\u0004\u0018\u00010\u0002J\u001a\u0010W\u001a\u0002062\u0006\u0010X\u001a\u00020Y2\b\u00107\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010Z\u001a\u0002062\u0006\u0010H\u001a\u00020IH\u0002J$\u0010[\u001a\u00020\\*\u00020\u00022\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010H\u001a\u00020IH\u0002R\u001e\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0017\u001a\u0004\b2\u00103¨\u0006d"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "Lcom/robinhood/models/db/Order;", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "<init>", "()V", "orderManager", "getOrderManager", "()Lcom/robinhood/android/equity/submission/EquityOrderManager;", "setOrderManager", "(Lcom/robinhood/android/equity/submission/EquityOrderManager;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "duxo", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bindings", "Lcom/robinhood/android/trade/equity/databinding/IncludeOrderConfirmationLayoutBinding;", "getBindings", "()Lcom/robinhood/android/trade/equity/databinding/IncludeOrderConfirmationLayoutBinding;", "bindings$delegate", "marginUpsellBindings", "Lcom/robinhood/android/trade/equity/databinding/IncludeMarginUpsellContainerBinding;", "getMarginUpsellBindings", "()Lcom/robinhood/android/trade/equity/databinding/IncludeMarginUpsellContainerBinding;", "marginUpsellBindings$delegate", "confirmationLayoutId", "", "getConfirmationLayoutId", "()I", "usePrimaryBackground", "", "getUsePrimaryBackground", "()Z", "adapter", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationListAdapter;", "getAdapter", "()Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationListAdapter;", "adapter$delegate", "onOrderReceived", "", Card.Icon.ORDER, "onOrderUpdated", "onConfirmationShown", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "setViewState", "state", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState;", "bindDescription", "showNotificationUpsell", "showRecurringUpsell", "showMarginUpsell", "marginUpsell", "Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;", "isUk", "launchIacUpsell", "upsell", "Lcom/robinhood/models/ui/IacUpsell;", "showSlipUpsell", "slipUpsellKey", "Lcom/robinhood/android/margin/contracts/SlipUpsellKey;", "showMarginAccountUpsell", "fragmentKey", "Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "startRecurringFlow", "createOrderConfirmationRowItem", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRow;", "type", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationRowType;", "quote", "Lcom/robinhood/models/db/Quote;", "Callbacks", "Args", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderConfirmationFragment extends BaseOrderConfirmationFragment<Order, EquityOrderManager> implements ClientComponentAlertFragment.Callbacks {
    private static final long UPSELL_TRANSITION_DURATION_MS = 150;
    public AnalyticsLogger analytics;
    public EquityOrderManager orderManager;
    private final boolean usePrimaryBackground;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfirmationFragment.class, "bindings", "getBindings()Lcom/robinhood/android/trade/equity/databinding/IncludeOrderConfirmationLayoutBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, OrderConfirmationDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings = ViewBinding5.viewBinding(this, OrderConfirmationFragment2.INSTANCE);

    /* renamed from: marginUpsellBindings$delegate, reason: from kotlin metadata */
    private final Lazy marginUpsellBindings = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderConfirmationFragment.marginUpsellBindings_delegate$lambda$0(this.f$0);
        }
    });
    private final int confirmationLayoutId = C29365R.layout.include_order_confirmation_layout;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderConfirmationFragment.adapter_delegate$lambda$1();
        }
    });

    /* compiled from: OrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Callbacks;", "Lcom/robinhood/android/trade/equity/EquityOrderCompletionCallbacks;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends EquityOrderCompletionCallbacks {
    }

    /* compiled from: OrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RecurringOrderUpsellManager.RecurringUpsell.values().length];
            try {
                iArr[RecurringOrderUpsellManager.RecurringUpsell.PASSIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringOrderUpsellManager.RecurringUpsell.AGGRESSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringOrderUpsellManager.RecurringUpsell.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderConfirmationRowType.values().length];
            try {
                iArr2[OrderConfirmationRowType.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderConfirmationRowType.ESTIMATED_SHARES.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderConfirmationRowType.TOTAL_SHARES.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderConfirmationRowType.TOTAL_SHARES_AS_SUBTOTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderConfirmationRowType.AVERAGE_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderConfirmationRowType.PENDING_SHARES.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OrderConfirmationRowType.ESTIMATED_COST_CREDIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OrderConfirmationRowType.TOTAL_COST_CREDIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[OrderConfirmationRowType.PENDING_COST_CREDIT.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[OrderConfirmationRowType.ESTIMATED_WITHHOLDING_AMOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[OrderConfirmationRowType.WITHHOLDING_AMOUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[OrderConfirmationRowType.TAX_LOTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[OrderConfirmationRowType.TAX_LOTS_M1.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[OrderConfirmationRowType.ACCOUNT_LABEL.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public EquityOrderManager getOrderManager() {
        EquityOrderManager equityOrderManager = this.orderManager;
        if (equityOrderManager != null) {
            return equityOrderManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(EquityOrderManager equityOrderManager) {
        Intrinsics.checkNotNullParameter(equityOrderManager, "<set-?>");
        this.orderManager = equityOrderManager;
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

    private final OrderConfirmationDuxo getDuxo() {
        return (OrderConfirmationDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final IncludeOrderConfirmationLayoutBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeOrderConfirmationLayoutBinding) value;
    }

    private final IncludeMarginUpsellContainerBinding getMarginUpsellBindings() {
        return (IncludeMarginUpsellContainerBinding) this.marginUpsellBindings.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IncludeMarginUpsellContainerBinding marginUpsellBindings_delegate$lambda$0(OrderConfirmationFragment orderConfirmationFragment) {
        return IncludeMarginUpsellContainerBinding.bind((LinearLayout) orderConfirmationFragment.getBindings().getRoot().findViewById(C29365R.id.margin_upsell_container));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public int getConfirmationLayoutId() {
        return this.confirmationLayoutId;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public boolean getUsePrimaryBackground() {
        return this.usePrimaryBackground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationListAdapter adapter_delegate$lambda$1() {
        return new OrderConfirmationListAdapter();
    }

    private final OrderConfirmationListAdapter getAdapter() {
        return (OrderConfirmationListAdapter) this.adapter.getValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onOrderReceived(Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_TRADED);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getDismissImmediately()) {
            requireActivity().finish();
        } else {
            getDuxo().onOrderReceived(order);
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onOrderUpdated(Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        getDuxo().onOrderUpdated(order);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onConfirmationShown() {
        getDuxo().logConfirmationShown();
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FrameLayout root = getBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView recyclerView = getBindings().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, getAdapter());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationFragment.onStart$lambda$2(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(OrderConfirmationFragment orderConfirmationFragment, DayNightOverlay dayNightOverlay) {
        int i;
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ImageView imageView = orderConfirmationFragment.getBindings().upsellImage;
        Context contextRequireContext = orderConfirmationFragment.requireContext();
        if (DayNightChanges.isDay(dayNightOverlay)) {
            i = C11048R.drawable.svg_recurring_order_day;
        } else {
            i = C11048R.drawable.svg_recurring_order_night;
        }
        imageView.setImageDrawable(AppCompatResources.getDrawable(contextRequireContext, i));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C295041(this));
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OrderConfirmationViewState) it).getViewOrderAction());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OrderConfirmationFragment$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationFragment.onResume$lambda$4(this.f$0, (OrderConfirmationViewState.ViewOrderAction) obj);
            }
        });
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$onResume$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OrderConfirmationViewState) it).getDoneAction());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OrderConfirmationFragment$onResume$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationFragment.onResume$lambda$7(this.f$0, (OrderConfirmationViewState.DoneAction) obj);
            }
        });
        Observable<OrderConfirmationViewState> states = getDuxo().getStates();
        final C295056 c295056 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment.onResume.6
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((OrderConfirmationViewState) obj).getDoneLabel();
            }
        };
        Observable observableDistinctUntilChanged3 = states.map(new Function(c295056) { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c295056, "function");
                this.function = c295056;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationFragment.onResume$lambda$8(this.f$0, (StringResource) obj);
            }
        });
        Observable<OrderConfirmationViewState> observableDistinctUntilChanged4 = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationFragment.onResume$lambda$15(this.f$0, (OrderConfirmationViewState) obj);
            }
        });
        Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$onResume$$inlined$mapNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OrderConfirmationViewState) it).getRecurringUpsell());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OrderConfirmationFragment$onResume$$inlined$mapNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged5 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationFragment.onResume$lambda$17(this.f$0, (RecurringOrderUpsellManager.RecurringUpsell) obj);
            }
        });
    }

    /* compiled from: OrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$onResume$1 */
    /* synthetic */ class C295041 extends FunctionReferenceImpl implements Function1<OrderConfirmationViewState, Unit> {
        C295041(Object obj) {
            super(1, obj, OrderConfirmationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OrderConfirmationViewState orderConfirmationViewState) throws Resources.NotFoundException {
            invoke2(orderConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OrderConfirmationViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OrderConfirmationFragment) this.receiver).setViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(final OrderConfirmationFragment orderConfirmationFragment, OrderConfirmationViewState.ViewOrderAction viewOrderAction) {
        final Order order = viewOrderAction.getOrder();
        RdsButton viewOrderBtn = orderConfirmationFragment.getBindings().viewOrderBtn;
        Intrinsics.checkNotNullExpressionValue(viewOrderBtn, "viewOrderBtn");
        OnClickListeners.onClick(viewOrderBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderConfirmationFragment.onResume$lambda$4$lambda$3(this.f$0, order);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4$lambda$3(OrderConfirmationFragment orderConfirmationFragment, Order order) {
        orderConfirmationFragment.getCallbacks().onOrderCompleted(order);
        Navigator navigator = orderConfirmationFragment.getNavigator();
        Context contextRequireContext = orderConfirmationFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ORDER, order.getId(), null, false, 12, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(final OrderConfirmationFragment orderConfirmationFragment, final OrderConfirmationViewState.DoneAction doneAction) {
        RdsButton doneBtn = orderConfirmationFragment.getBindings().doneBtn;
        Intrinsics.checkNotNullExpressionValue(doneBtn, "doneBtn");
        OnClickListeners.onClick(doneBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderConfirmationFragment.onResume$lambda$7$lambda$6(doneAction, orderConfirmationFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7$lambda$6(OrderConfirmationViewState.DoneAction doneAction, OrderConfirmationFragment orderConfirmationFragment) throws Resources.NotFoundException {
        if (doneAction instanceof OrderConfirmationViewState.DoneAction.ShowNotificationUpsell) {
            orderConfirmationFragment.showNotificationUpsell(((OrderConfirmationViewState.DoneAction.ShowNotificationUpsell) doneAction).getOrder());
        } else if (doneAction instanceof OrderConfirmationViewState.DoneAction.ShowRecurringUpsell) {
            orderConfirmationFragment.showRecurringUpsell();
        } else if (doneAction instanceof OrderConfirmationViewState.DoneAction.CompleteOrder) {
            orderConfirmationFragment.getCallbacks().onOrderCompleted(((OrderConfirmationViewState.DoneAction.CompleteOrder) doneAction).getOrder());
        } else if (doneAction instanceof OrderConfirmationViewState.DoneAction.MarginInvestingUpsell) {
            orderConfirmationFragment.showMarginUpsell(((OrderConfirmationViewState.DoneAction.MarginInvestingUpsell) doneAction).getMarginInvestingUpsell(), orderConfirmationFragment.getDuxo().getStatesFlow().getValue().isUk());
        } else if (doneAction instanceof OrderConfirmationViewState.DoneAction.ShowIacUpsell) {
            OrderConfirmationViewState.DoneAction.ShowIacUpsell showIacUpsell = (OrderConfirmationViewState.DoneAction.ShowIacUpsell) doneAction;
            orderConfirmationFragment.launchIacUpsell(showIacUpsell.getOrder(), showIacUpsell.getUpsell());
        } else if (doneAction instanceof OrderConfirmationViewState.DoneAction.SlipUpsell) {
            OrderConfirmationViewState.DoneAction.SlipUpsell slipUpsell = (OrderConfirmationViewState.DoneAction.SlipUpsell) doneAction;
            orderConfirmationFragment.showSlipUpsell(slipUpsell.getSlipUpsellKey(), slipUpsell.getOrder());
        } else {
            if (!(doneAction instanceof OrderConfirmationViewState.DoneAction.MarginAccountUpsell)) {
                throw new NoWhenBranchMatchedException();
            }
            OrderConfirmationViewState.DoneAction.MarginAccountUpsell marginAccountUpsell = (OrderConfirmationViewState.DoneAction.MarginAccountUpsell) doneAction;
            orderConfirmationFragment.showMarginAccountUpsell(marginAccountUpsell.getFragmentKey(), marginAccountUpsell.getOrder());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(OrderConfirmationFragment orderConfirmationFragment, StringResource stringResource) {
        RdsButton rdsButton = orderConfirmationFragment.getBindings().doneBtn;
        Resources resources = orderConfirmationFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsButton.setText(stringResource.getText(resources));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(final OrderConfirmationFragment orderConfirmationFragment, final OrderConfirmationViewState orderConfirmationViewState) {
        final Order order = orderConfirmationViewState.getUpsellAction().getOrder();
        RdsButton setRecurringInvestmentBtn = orderConfirmationFragment.getBindings().setRecurringInvestmentBtn;
        Intrinsics.checkNotNullExpressionValue(setRecurringInvestmentBtn, "setRecurringInvestmentBtn");
        OnClickListeners.onClick(setRecurringInvestmentBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderConfirmationFragment.onResume$lambda$15$lambda$9(this.f$0, order, orderConfirmationViewState);
            }
        });
        RdsButton upsellGetStartedBtn = orderConfirmationFragment.getBindings().upsellGetStartedBtn;
        Intrinsics.checkNotNullExpressionValue(upsellGetStartedBtn, "upsellGetStartedBtn");
        OnClickListeners.onClick(upsellGetStartedBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderConfirmationFragment.onResume$lambda$15$lambda$10(this.f$0, order, orderConfirmationViewState);
            }
        });
        RdsButton upsellDoneBtn = orderConfirmationFragment.getBindings().upsellDoneBtn;
        Intrinsics.checkNotNullExpressionValue(upsellDoneBtn, "upsellDoneBtn");
        OnClickListeners.onClick(upsellDoneBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderConfirmationFragment.onResume$lambda$15$lambda$11(this.f$0, order);
            }
        });
        IncludeMarginUpsellContainerBinding marginUpsellBindings = orderConfirmationFragment.getMarginUpsellBindings();
        RdsButton marginUpsellGetStartedBtn = marginUpsellBindings.marginUpsellGetStartedBtn;
        Intrinsics.checkNotNullExpressionValue(marginUpsellGetStartedBtn, "marginUpsellGetStartedBtn");
        OnClickListeners.onClick(marginUpsellGetStartedBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderConfirmationFragment.onResume$lambda$15$lambda$14$lambda$12(this.f$0, order, orderConfirmationViewState);
            }
        });
        RdsButton marginUpsellNotNowBtn = marginUpsellBindings.marginUpsellNotNowBtn;
        Intrinsics.checkNotNullExpressionValue(marginUpsellNotNowBtn, "marginUpsellNotNowBtn");
        OnClickListeners.onClick(marginUpsellNotNowBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderConfirmationFragment.onResume$lambda$15$lambda$14$lambda$13(this.f$0, order);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15$lambda$9(OrderConfirmationFragment orderConfirmationFragment, Order order, OrderConfirmationViewState orderConfirmationViewState) {
        orderConfirmationFragment.getDuxo().logRecurringUpsellTap();
        orderConfirmationFragment.getCallbacks().onOrderCompleted(order);
        Intrinsics.checkNotNull(orderConfirmationViewState);
        orderConfirmationFragment.startRecurringFlow(orderConfirmationViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15$lambda$10(OrderConfirmationFragment orderConfirmationFragment, Order order, OrderConfirmationViewState orderConfirmationViewState) {
        orderConfirmationFragment.getDuxo().logRecurringUpsellGetStartedTap();
        orderConfirmationFragment.getCallbacks().onOrderCompleted(order);
        Intrinsics.checkNotNull(orderConfirmationViewState);
        orderConfirmationFragment.startRecurringFlow(orderConfirmationViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15$lambda$11(OrderConfirmationFragment orderConfirmationFragment, Order order) {
        orderConfirmationFragment.getCallbacks().onOrderCompleted(order);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15$lambda$14$lambda$12(OrderConfirmationFragment orderConfirmationFragment, Order order, OrderConfirmationViewState orderConfirmationViewState) {
        orderConfirmationFragment.getCallbacks().onOrderCompleted(order);
        orderConfirmationFragment.getDuxo().logLaunchMarginUpgrade();
        if (orderConfirmationViewState.getShouldRedirectToMarginUpgradeSassyFlow() && orderConfirmationViewState.getActiveAccount() != null) {
            Navigator navigator = orderConfirmationFragment.getNavigator();
            Context contextRequireContext = orderConfirmationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            orderConfirmationFragment.startActivity(InstantCashUtils.createIntentForMarginUpgrade(navigator, contextRequireContext, InstantCashUtils.getSwitchAccountSassyInputParams(orderConfirmationViewState.getActiveAccount(), InstantCashConstants2.SOURCE_EQUITY)));
        } else {
            Navigator navigator2 = orderConfirmationFragment.getNavigator();
            Context contextRequireContext2 = orderConfirmationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new EnableMarginInvestingKey(order != null ? order.getAccountNumber() : null, "UPSELL-EQUITIES", null, false, false, 28, null), null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15$lambda$14$lambda$13(OrderConfirmationFragment orderConfirmationFragment, Order order) {
        orderConfirmationFragment.getDuxo().logDismissMarginUpsell();
        orderConfirmationFragment.getCallbacks().onOrderCompleted(order);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(OrderConfirmationFragment orderConfirmationFragment, RecurringOrderUpsellManager.RecurringUpsell recurringUpsell) {
        String str;
        Intrinsics.checkNotNull(recurringUpsell);
        int i = WhenMappings.$EnumSwitchMapping$0[recurringUpsell.ordinal()];
        if (i == 1) {
            orderConfirmationFragment.getDuxo().logRecurringUpsellAppear();
            str = AnalyticsStrings.BUTTON_TITLE_RECURRING_QUIET;
        } else if (i == 2) {
            str = AnalyticsStrings.BUTTON_TITLE_RECURRING_AGGRESSIVE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(orderConfirmationFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_EQUITY_TRADE_RECEIPT_HOOK, str2, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_PATTERN_DAY_TRADE, button.getLoggingIdentifier(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(OrderConfirmationViewState state) throws Resources.NotFoundException {
        CharSequence text;
        Quote quote;
        ArrayList arrayList;
        ClientComponentAlert clientComponentAlertConsume;
        bindDescription(state);
        RhTextView rhTextView = getBindings().orderTitleTxt;
        StringResource orderConfirmationStatus = state.getOrderConfirmationStatus();
        if (orderConfirmationStatus != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = orderConfirmationStatus.getText(resources);
        } else {
            text = null;
        }
        rhTextView.setText(text);
        RdsButton setRecurringInvestmentBtn = getBindings().setRecurringInvestmentBtn;
        Intrinsics.checkNotNullExpressionValue(setRecurringInvestmentBtn, "setRecurringInvestmentBtn");
        setRecurringInvestmentBtn.setVisibility(state.getShowPassiveRecurringUpsell() ? 0 : 8);
        RdsButton viewOrderBtn = getBindings().viewOrderBtn;
        Intrinsics.checkNotNullExpressionValue(viewOrderBtn, "viewOrderBtn");
        viewOrderBtn.setVisibility(state.getViewOrderButtonIsVisible() ? 0 : 8);
        Order currentOrder = state.getCurrentOrder();
        if (currentOrder == null || (quote = state.getQuote()) == null) {
            return;
        }
        OrderConfirmationListAdapter adapter = getAdapter();
        List<OrderConfirmationRowType> items = state.getItems();
        if (items != null) {
            List<OrderConfirmationRowType> list = items;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(createOrderConfirmationRowItem(currentOrder, (OrderConfirmationRowType) it.next(), quote, state));
            }
        } else {
            arrayList = null;
        }
        adapter.submitList(arrayList);
        UiEvent<ClientComponentAlert> dayTradeWarningEvent = state.getDayTradeWarningEvent();
        if (dayTradeWarningEvent != null && (clientComponentAlertConsume = dayTradeWarningEvent.consume()) != null) {
            DialogFragment dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(clientComponentAlertConsume, false, false, 6, null), null, 2, null);
            dialogFragmentCreateDialogFragment$default.setCancelable(false);
            dialogFragmentCreateDialogFragment$default.show(getChildFragmentManager(), "pdt-warning-equity");
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), "pdt-order-alert-equity", "", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        if (getConfirmationContainer().getVisibility() == 0 && currentOrder.getState().isPending()) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_PENDING, false);
        }
        if (getConfirmationContainer().getVisibility() == 0 && currentOrder.getState().isFinal()) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_FINAL, false);
        }
    }

    private final void bindDescription(OrderConfirmationViewState state) throws Resources.NotFoundException {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        OrderConfirmationViewState.Description orderConfirmationDescription = state.getOrderConfirmationDescription(resources);
        if (orderConfirmationDescription instanceof OrderConfirmationViewState.Description.ViewOrder) {
            OrderConfirmationViewState.Description.ViewOrder viewOrder = (OrderConfirmationViewState.Description.ViewOrder) orderConfirmationDescription;
            CharSequence descriptionText = viewOrder.getDescriptionText();
            final Order order = viewOrder.getOrder();
            RhTextView rhTextView = getBindings().orderDescriptionTxt;
            SpannedString spannedString = null;
            if (descriptionText != null) {
                StringResource linkText = viewOrder.getLinkText();
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                CharSequence text = linkText.getText(resources2);
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$bindDescription$$inlined$buildTextWithClickableLink$default$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Navigator navigator = this.this$0.getNavigator();
                        Context contextRequireContext = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ORDER, order.getId(), null, false, 12, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        this.this$0.getCallbacks().onOrderCompleted(order);
                    }
                };
                ActionSpan actionSpan = new ActionSpan(false, (Function0) function0, 1, (DefaultConstructorMarker) null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(descriptionText);
                spannableStringBuilder.append(' ');
                List listMutableListOf = CollectionsKt.mutableListOf(actionSpan);
                listMutableListOf.add(new StyleSpan(1));
                Object[] array2 = listMutableListOf.toArray(new Object[0]);
                Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(text);
                for (Object obj : objArrCopyOf) {
                    spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
                }
                spannedString = new SpannedString(spannableStringBuilder);
            }
            rhTextView.setText(spannedString);
            getBindings().orderDescriptionTxt.setMovementMethod(new LinkMovementMethod());
            return;
        }
        if (orderConfirmationDescription instanceof OrderConfirmationViewState.Description.TextOnly) {
            getBindings().orderDescriptionTxt.setText(((OrderConfirmationViewState.Description.TextOnly) orderConfirmationDescription).getDescriptionText());
        } else if (orderConfirmationDescription != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void showNotificationUpsell(Order order) {
        getCallbacks().onOrderCompleted(order);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, ProductUpsellKey.INSTANCE.getUpsellNotificationPostEquityTrade(), null, false, null, null, 60, null);
    }

    private final void showRecurringUpsell() {
        getDuxo().markUpsellViewCount();
        getDuxo().logRecurringUpsellAppear();
        RdsCardView rdsCardView = getBindings().cardView;
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(150L);
        TransitionManager.beginDelayedTransition(rdsCardView, autoTransition);
        LinearLayout orderContentContainer = getBindings().orderContentContainer;
        Intrinsics.checkNotNullExpressionValue(orderContentContainer, "orderContentContainer");
        orderContentContainer.setVisibility(8);
        LinearLayout upsellContentContainer = getBindings().upsellContentContainer;
        Intrinsics.checkNotNullExpressionValue(upsellContentContainer, "upsellContentContainer");
        upsellContentContainer.setVisibility(0);
    }

    private final void showMarginUpsell(ApiMarginUpsell marginUpsell, boolean isUk) throws Resources.NotFoundException {
        String string2;
        getDuxo().seenMarginUpsell();
        RdsCardView rdsCardView = getBindings().cardView;
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(150L);
        TransitionManager.beginDelayedTransition(rdsCardView, autoTransition);
        LinearLayout orderContentContainer = getBindings().orderContentContainer;
        Intrinsics.checkNotNullExpressionValue(orderContentContainer, "orderContentContainer");
        orderContentContainer.setVisibility(8);
        IncludeMarginUpsellContainerBinding marginUpsellBindings = getMarginUpsellBindings();
        LinearLayout root = marginUpsellBindings.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(0);
        marginUpsellBindings.marginUpsellTitleTxt.setText(marginUpsell.getContent().getTitle());
        marginUpsellBindings.marginUpsellDescriptionTxt.setText(marginUpsell.getContent().getDescription());
        RdsButton rdsButton = marginUpsellBindings.marginUpsellNotNowBtn;
        if (isUk) {
            string2 = getResources().getString(C29365R.string.margin_upsell_negative_button_gb);
        } else {
            string2 = getResources().getString(C11048R.string.general_label_not_now);
        }
        rdsButton.setText(string2);
    }

    private final void launchIacUpsell(Order order, IacUpsell upsell) {
        Uri uri;
        getCallbacks().onOrderCompleted(order);
        Navigator navigator = getNavigator();
        String upsellDeeplink = upsell.getUpsellDeeplink();
        if (upsellDeeplink == null || (uri = Uri.parse(upsellDeeplink)) == null) {
            uri = Uri.EMPTY;
        }
        Intrinsics.checkNotNull(uri);
        if (navigator.isDeepLinkSupported(uri)) {
            Navigator navigator2 = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String upsellDeeplink2 = upsell.getUpsellDeeplink();
            Navigator.DefaultImpls.handleDeepLink$default(navigator2, contextRequireContext, upsellDeeplink2 != null ? Uri.parse(upsellDeeplink2) : null, null, null, false, null, 60, null);
        }
    }

    public final void showSlipUpsell(SlipUpsellKey slipUpsellKey, Order order) {
        Intrinsics.checkNotNullParameter(slipUpsellKey, "slipUpsellKey");
        getCallbacks().onOrderCompleted(order);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        slipUpsellKey.navigate(contextRequireContext, getNavigator());
    }

    private final void showMarginAccountUpsell(MarginAccountUpsellFragmentKey fragmentKey, Order order) {
        getCallbacks().onOrderCompleted(order);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void startRecurringFlow(OrderConfirmationViewState state) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        InvestFlowStep.Frequency frequency = InvestFlowStep.Frequency.INSTANCE;
        Instrument instrument = state.getInstrument();
        Intrinsics.checkNotNull(instrument);
        List listListOf = CollectionsKt.listOf(instrument.getId());
        Order currentOrder = state.getCurrentOrder();
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new InvestFlowIntentKey((InvestFlowStep) frequency, true, false, false, listListOf, currentOrder != null ? currentOrder.getAccountNumber() : null, (BigDecimal) null, (InvestFlowFrequency) null, false, (AllocationStrategy) null, (InvestFlowLoggingParams) null, 1996, (DefaultConstructorMarker) null), null, false, null, null, 60, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final OrderConfirmationRowItem2 createOrderConfirmationRowItem(Order order, OrderConfirmationRowType orderConfirmationRowType, Quote quote, OrderConfirmationViewState orderConfirmationViewState) throws Resources.NotFoundException {
        NumberFormatter shareQuantityFormat;
        BigDecimal shareQuantity;
        Money amount;
        Money.Adjustment debitAdjustment;
        String str;
        Money amount2;
        Money.Adjustment debitAdjustment2;
        String str2;
        CharSequence text;
        CharSequence text2;
        CharSequence charSequence;
        CharSequence text3;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Money dollarBasedAmount = order.getDollarBasedAmount();
        BigDecimal quantity = order.getQuantity();
        CharSequence charSequence2 = "";
        switch (WhenMappings.$EnumSwitchMapping$1[orderConfirmationRowType.ordinal()]) {
            case 1:
                return new OrderConfirmationRowItem(OrderConfirmationDescription.getOrderConfirmationAmountLabel(order, resources), null, OrderConfirmationDescription.getOrderConfirmationAmount(order, resources), null, 10, null);
            case 2:
                String string2 = resources.getString(C29365R.string.order_confirmation_estimated_shares);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Instrument instrument = orderConfirmationViewState.getInstrument();
                if (instrument == null || (shareQuantityFormat = Formats.getNotionalShareQuantityFormat$default(null, instrument.getNotionalEstimatedQuantityDecimals(), 1, null)) == null) {
                    shareQuantityFormat = Formats.getShareQuantityFormat();
                }
                if (dollarBasedAmount == null || (shareQuantity = Moneys2.toShareQuantity(dollarBasedAmount, quote.getLastTradePrice())) == null) {
                    Intrinsics.checkNotNull(quantity);
                } else {
                    quantity = shareQuantity;
                }
                return new OrderConfirmationRowItem(string2, null, shareQuantityFormat.format(quantity), null, 10, null);
            case 3:
                return new OrderConfirmationRowItem(OrderConfirmationDescription.getOrderConfirmationSharesLabel(order).getText(resources).toString(), null, OrderConfirmationDescription.getOrderConfirmationShares(order, resources), null, 10, null);
            case 4:
                return new OrderConfirmationRowItem(OrderConfirmationDescription.getOrderConfirmationSharesLabel(order).getText(resources).toString(), null, OrderConfirmationDescription.getOrderConfirmationSharesAsSubtotal(order, resources), null, 10, null);
            case 5:
                String string3 = resources.getString(C29365R.string.order_confirmation_average_price_per_share);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return new OrderConfirmationRowItem(string3, null, OrderConfirmationDescription.getOrderConfirmationAveragePrice(order, resources), null, 10, null);
            case 6:
                String string4 = resources.getString(C29365R.string.order_confirmation_pending_shares);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return new OrderConfirmationRowItem(string4, null, OrderConfirmationDescription.getOrderConfirmationPendingShares(order), null, 10, null);
            case 7:
                return new OrderConfirmationRowItem(OrderSides.getEstimatedCostCreditLabel(order.getSide()).getText(resources).toString(), null, OrderConfirmationDescription.getOrderConfirmationEstimatedCostString(order, quote, quantity, orderConfirmationViewState.getEstimatedRemainingFees(), orderConfirmationViewState.getEstimatedWithholdingAmount()).getText(resources), null, 10, null);
            case 8:
                return new OrderConfirmationRowItem(OrderSides.getTotalCostCreditLabel(order.getSide()).getText(resources).toString(), null, OrderConfirmationDescription.getOrderConfirmationTotalCostCreditString(order, orderConfirmationViewState.getWithholdingAmount()).getText(resources), null, 10, null);
            case 9:
                return new OrderConfirmationRowItem(OrderSides.getPendingCostCreditLabel(order.getSide()).getText(resources).toString(), null, OrderConfirmationDescription.getOrderConfirmationPendingCostCreditString(order, quote, orderConfirmationViewState.getEstimatedRemainingFees()).getText(resources), null, 10, null);
            case 10:
                String string5 = orderConfirmationViewState.getWithholdingEstimateLabelString().getText(resources).toString();
                WithholdingEstimatedAmount backupWithholdingEstimateAmountResponse = orderConfirmationViewState.getBackupWithholdingEstimateAmountResponse();
                return new OrderConfirmationRowItem(string5, null, (backupWithholdingEstimateAmountResponse == null || (amount = backupWithholdingEstimateAmountResponse.getAmount()) == null || (debitAdjustment = amount.toDebitAdjustment()) == null || (str = Money.Adjustment.format$default(debitAdjustment, false, null, 3, null)) == null) ? "" : str, null, 10, null);
            case 11:
                String string6 = orderConfirmationViewState.getWithholdingLabelString().getText(resources).toString();
                WithholdingAmount backupWithholdingAmountResponse = orderConfirmationViewState.getBackupWithholdingAmountResponse();
                return new OrderConfirmationRowItem(string6, null, (backupWithholdingAmountResponse == null || (amount2 = backupWithholdingAmountResponse.getAmount()) == null || (debitAdjustment2 = amount2.toDebitAdjustment()) == null || (str2 = Money.Adjustment.format$default(debitAdjustment2, false, null, 3, null)) == null) ? "" : str2, null, 10, null);
            case 12:
                StringResource taxLotRowTitle = orderConfirmationViewState.getTaxLotRowTitle();
                if (taxLotRowTitle != null) {
                    Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    text = taxLotRowTitle.getText(resources2);
                } else {
                    text = null;
                }
                String strValueOf = String.valueOf(text);
                StringResource taxLotsRowTrailingTitle = orderConfirmationViewState.getTaxLotsRowTrailingTitle();
                if (taxLotsRowTrailingTitle != null) {
                    Resources resources3 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                    CharSequence text4 = taxLotsRowTrailingTitle.getText(resources3);
                    if (text4 != null) {
                        charSequence2 = text4;
                    }
                }
                StringResource taxLotsTrailingSubtitle = orderConfirmationViewState.getTaxLotsTrailingSubtitle();
                if (taxLotsTrailingSubtitle != null) {
                    Resources resources4 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                    text = taxLotsTrailingSubtitle.getText(resources4);
                }
                return new OrderConfirmationRowItem(strValueOf, null, charSequence2, text, 2, null);
            case 13:
                StringResource taxLotRowTitle2 = orderConfirmationViewState.getTaxLotRowTitle();
                if (taxLotRowTitle2 != null) {
                    Resources resources5 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                    text2 = taxLotRowTitle2.getText(resources5);
                } else {
                    text2 = null;
                }
                String strValueOf2 = String.valueOf(text2);
                StringResource taxLotsRowTrailingTitle2 = orderConfirmationViewState.getTaxLotsRowTrailingTitle();
                if (taxLotsRowTrailingTitle2 != null) {
                    Resources resources6 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
                    CharSequence text5 = taxLotsRowTrailingTitle2.getText(resources6);
                    charSequence = text5 == null ? "" : text5;
                }
                StringResource taxLotsTrailingSubtitle2 = orderConfirmationViewState.getTaxLotsTrailingSubtitle();
                if (taxLotsTrailingSubtitle2 != null) {
                    Resources resources7 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources7, "getResources(...)");
                    text = taxLotsTrailingSubtitle2.getText(resources7);
                }
                return new OrderConfirmationRowItem(strValueOf2, text, charSequence, null, 8, null);
            case 14:
                String string7 = resources.getString(C20649R.string.order_create_account_label);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                StringResource accountNameTitle = orderConfirmationViewState.getAccountNameTitle();
                CharSequence charSequence3 = (accountNameTitle == null || (text3 = accountNameTitle.getText(resources)) == null) ? "" : text3;
                StringResource accountNameSubtitle = orderConfirmationViewState.getAccountNameSubtitle();
                return new OrderConfirmationRowItem(string7, null, charSequence3, accountNameSubtitle != null ? accountNameSubtitle.getText(resources) : null, 2, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: OrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Args;", "Landroid/os/Parcelable;", "isPreIpo", "", "isTaxLots", "dismissImmediately", "<init>", "(ZZZ)V", "()Z", "getDismissImmediately", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean dismissImmediately;
        private final boolean isPreIpo;
        private final boolean isTaxLots;

        /* compiled from: OrderConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isPreIpo;
            }
            if ((i & 2) != 0) {
                z2 = args.isTaxLots;
            }
            if ((i & 4) != 0) {
                z3 = args.dismissImmediately;
            }
            return args.copy(z, z2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsPreIpo() {
            return this.isPreIpo;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsTaxLots() {
            return this.isTaxLots;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getDismissImmediately() {
            return this.dismissImmediately;
        }

        public final Args copy(boolean isPreIpo, boolean isTaxLots, boolean dismissImmediately) {
            return new Args(isPreIpo, isTaxLots, dismissImmediately);
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
            return this.isPreIpo == args.isPreIpo && this.isTaxLots == args.isTaxLots && this.dismissImmediately == args.dismissImmediately;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isPreIpo) * 31) + Boolean.hashCode(this.isTaxLots)) * 31) + Boolean.hashCode(this.dismissImmediately);
        }

        public String toString() {
            return "Args(isPreIpo=" + this.isPreIpo + ", isTaxLots=" + this.isTaxLots + ", dismissImmediately=" + this.dismissImmediately + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isPreIpo ? 1 : 0);
            dest.writeInt(this.isTaxLots ? 1 : 0);
            dest.writeInt(this.dismissImmediately ? 1 : 0);
        }

        public Args(boolean z, boolean z2, boolean z3) {
            this.isPreIpo = z;
            this.isTaxLots = z2;
            this.dismissImmediately = z3;
        }

        public /* synthetic */ Args(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }

        public final boolean isPreIpo() {
            return this.isPreIpo;
        }

        public final boolean isTaxLots() {
            return this.isTaxLots;
        }

        public final boolean getDismissImmediately() {
            return this.dismissImmediately;
        }
    }

    /* compiled from: OrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Args;", "<init>", "()V", "UPSELL_TRANSITION_DURATION_MS", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OrderConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OrderConfirmationFragment orderConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OrderConfirmationFragment newInstance(Args args) {
            return (OrderConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OrderConfirmationFragment orderConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, orderConfirmationFragment, args);
        }
    }
}
