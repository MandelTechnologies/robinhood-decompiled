package com.robinhood.android.trade.equity.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks;
import com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderConfigurationCallbacks;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment;
import com.robinhood.android.equityadvancedorder.callbacks.EquityActivityBackgroundCallbacks;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.recurring.contracts.ForceIntro;
import com.robinhood.android.recurring.contracts.RecurringGenericCreationFragmentKey;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderParentFragment;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.activity.EquityOrderActivityEvent;
import com.robinhood.android.trade.equity.p261ui.configuration.OrderBuilderAndSelectFragment;
import com.robinhood.android.trade.equity.p261ui.configuration.selection.OrderConfigurationContextFactory;
import com.robinhood.android.trade.equity.p261ui.dollar.EquityDollarOrderParentFragment;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderParentFragment;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.Buildable;
import com.robinhood.android.trading.contracts.configuration.DollarBased;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.tooltips.TooltipActivity;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EquityOrderActivity.kt */
@Metadata(m3635d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u0010\u00103\u001a\u00020-2\u0006\u0010\u0012\u001a\u000204H\u0016J\u001a\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020#2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020;H\u0016J\"\u0010<\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020=2\b\u00106\u001a\u0004\u0018\u00010#2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010>\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020\u0013H\u0016J\u0010\u0010A\u001a\u00020-2\u0006\u00106\u001a\u00020#H\u0016J\u0010\u0010B\u001a\u00020-2\u0006\u00106\u001a\u00020#H\u0016J\u0010\u0010C\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020GH\u0016J \u0010H\u001a\u00020I2\u0006\u0010\u0012\u001a\u00020J2\u0006\u0010K\u001a\u00020G2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010L\u001a\u00020M2\u0006\u0010\u0012\u001a\u00020N2\u0006\u00106\u001a\u00020#H\u0002J\u0018\u0010O\u001a\u00020P2\u0006\u0010\u0012\u001a\u00020Q2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010R\u001a\u00020S2\u0006\u0010\u0012\u001a\u00020DH\u0002J\u0014\u0010T\u001a\u00020U*\u00020V2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010W\u001a\u00020-2\u0006\u0010X\u001a\u00020Y2\b\b\u0002\u0010Z\u001a\u00020GH\u0002J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u00106\u001a\u00020#H\u0002J\u001a\u0010^\u001a\u00020-2\u0006\u0010_\u001a\u00020`2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0010\u0010a\u001a\u00020-2\u0006\u0010F\u001a\u00020GH\u0016J\u0016\u0010b\u001a\u00020-2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020e0dH\u0002R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006g"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderParentFragment$Callbacks;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Callbacks;", "Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderConfigurationCallbacks;", "Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderCallbacks;", "Lcom/robinhood/android/equityadvancedorder/callbacks/EquityActivityBackgroundCallbacks;", "Lcom/robinhood/tooltips/TooltipActivity;", "<init>", "()V", "duxo", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "orderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "orderConfigurationContextFactory", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "getOrderConfigurationContextFactory", "()Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "setOrderConfigurationContextFactory", "(Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;)V", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "getBwWebViewManager", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "setBwWebViewManager", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "setTooltipManager", "(Lcom/robinhood/tooltips/TooltipManager;)V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "startOrderBuilder", "Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "startOrderSelectMenu", "accountNumber", "shareQuantity", "Ljava/math/BigDecimal;", "onDialogDismissed", "id", "", "showOrderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Resolved;", "setOrderConfiguration", "onOrderConfigurationResult", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "startOrderConfigurationSelection", "editRecurringOrder", "setRecurringOrderConfiguration", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "onReviewingStateChanged", "isReviewing", "", "getShareBasedOrderFragmentInstance", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderParentFragment;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "isStreamlined", "getDirectIpoFragmentInstance", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderParentFragment;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$DirectIpoOrderConfiguration;", "getDollarBasedOrderFragmentInstance", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment;", "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "getRecurringOrderFragmentInstance", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment;", "getAdvancedOrderFragmentInstance", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "showOrder", "fragment", "Landroidx/fragment/app/Fragment;", "useAnimation", "orderConfigurationContextSingle", "Lio/reactivex/Single;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory$OrderConfigurationContext;", "bindState", "state", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;", "setActivityBackground", "handleDuxoEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityEvent;", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityOrderActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, EquityShareOrderParentFragment.Callbacks, EquityDollarOrderParentFragment.Callbacks, RecurringOrderParentFragment.Callbacks, EquityOrderConfigurationCallbacks, EquityOrderCallbacks, EquityActivityBackgroundCallbacks, TooltipActivity {
    private static final String SCREEN_NAME = "OrderActivity";
    private static final String TAG_ACCOUNT_NOT_APPROVED = "equity-trading-account-not-approved";
    private static final String TAG_SUBZERO_KILLSWITCH = "equity-trading-subzero-killswitch";
    public BwWebViewManager bwWebViewManager;
    private EquityOrderConfiguration orderConfiguration;
    public OrderConfigurationContextFactory orderConfigurationContextFactory;
    private EquityOrderSide side;
    public TooltipManager tooltipManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EquityOrderActivityDuxo.class);
    private final String screenName = SCREEN_NAME;

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void onReviewingStateChanged(boolean isReviewing) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDuxoEvent(final Event<EquityOrderActivityEvent> event) {
        EventConsumer<EquityOrderActivityEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof EquityOrderActivityEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivity$handleDuxoEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m19264invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19264invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                EquityOrderActivityEvent equityOrderActivityEvent = (EquityOrderActivityEvent) event.getData();
                if (equityOrderActivityEvent instanceof EquityOrderActivityEvent.AccountNotApproved) {
                    RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this).setId(C29365R.id.dialog_id_order_account_not_approved).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C11048R.string.error_description_something_went_wrong, new Object[0]);
                    FragmentManager supportFragmentManager = this.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(message, supportFragmentManager, "equity-trading-account-not-approved", false, 4, null);
                    return;
                }
                if (equityOrderActivityEvent instanceof EquityOrderActivityEvent.QuoteFetchError) {
                    this.setOrderConfiguration(new AdvancedOrder.LimitNew(((EquityOrderActivityEvent.QuoteFetchError) equityOrderActivityEvent).getAccountNumber(), null, null, null, null, false, 30, null));
                } else if (equityOrderActivityEvent instanceof EquityOrderActivityEvent.SubzeroKillswitchEvent) {
                    RhDialogFragment.Builder theme = RhDialogFragment.INSTANCE.create(this).setId(C29365R.id.dialog_id_subzero_killswitch).setTitle(C29365R.string.short_selling_unavailable_alert_title, new Object[0]).setMessage(C29365R.string.short_selling_unavailable_alert_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                    FragmentManager supportFragmentManager2 = this.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(theme, supportFragmentManager2, "equity-trading-subzero-killswitch", false, 4, null).setCancelable(false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderActivityDuxo getDuxo() {
        return (EquityOrderActivityDuxo) this.duxo.getValue();
    }

    public final OrderConfigurationContextFactory getOrderConfigurationContextFactory() {
        OrderConfigurationContextFactory orderConfigurationContextFactory = this.orderConfigurationContextFactory;
        if (orderConfigurationContextFactory != null) {
            return orderConfigurationContextFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderConfigurationContextFactory");
        return null;
    }

    public final void setOrderConfigurationContextFactory(OrderConfigurationContextFactory orderConfigurationContextFactory) {
        Intrinsics.checkNotNullParameter(orderConfigurationContextFactory, "<set-?>");
        this.orderConfigurationContextFactory = orderConfigurationContextFactory;
    }

    public final BwWebViewManager getBwWebViewManager() {
        BwWebViewManager bwWebViewManager = this.bwWebViewManager;
        if (bwWebViewManager != null) {
            return bwWebViewManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bwWebViewManager");
        return null;
    }

    public final void setBwWebViewManager(BwWebViewManager bwWebViewManager) {
        Intrinsics.checkNotNullParameter(bwWebViewManager, "<set-?>");
        this.bwWebViewManager = bwWebViewManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.tooltips.TooltipActivity
    public TooltipManager getTooltipManager() {
        TooltipManager tooltipManager = this.tooltipManager;
        if (tooltipManager != null) {
            return tooltipManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tooltipManager");
        return null;
    }

    public void setTooltipManager(TooltipManager tooltipManager) {
        Intrinsics.checkNotNullParameter(tooltipManager, "<set-?>");
        this.tooltipManager = tooltipManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
        toolbar.setBackground(new ColorDrawable(0));
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C20649R.layout.activity_equity_order);
        BaseActivity.collectDuxoState$default(this, null, new C293681(savedInstanceState, null), 1, null);
        BaseActivity.collectDuxoState$default(this, null, new C293692(null), 1, null);
        if (((EquityOrderActivityIntentKey) INSTANCE.getExtras((Activity) this)).getRetainAdvanceChart()) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C293703(null));
        }
    }

    /* compiled from: EquityOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivity$onCreate$1", m3645f = "EquityOrderActivity.kt", m3646l = {95}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivity$onCreate$1 */
    static final class C293681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bundle $savedInstanceState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C293681(Bundle bundle, Continuation<? super C293681> continuation) {
            super(2, continuation);
            this.$savedInstanceState = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderActivity.this.new C293681(this.$savedInstanceState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C293681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityOrderActivityViewState> stateFlow = EquityOrderActivity.this.getDuxo().getStateFlow();
                final EquityOrderActivity equityOrderActivity = EquityOrderActivity.this;
                final Bundle bundle = this.$savedInstanceState;
                FlowCollector<? super EquityOrderActivityViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivity.onCreate.1.1
                    public final Object emit(EquityOrderActivityViewState equityOrderActivityViewState, Continuation<? super Unit> continuation) {
                        equityOrderActivity.bindState(equityOrderActivityViewState, bundle);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((EquityOrderActivityViewState) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: EquityOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivity$onCreate$2", m3645f = "EquityOrderActivity.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivity$onCreate$2 */
    static final class C293692 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C293692(Continuation<? super C293692> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderActivity.this.new C293692(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C293692) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityOrderActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivity$onCreate$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ EquityOrderActivity $tmp0;

            AnonymousClass1(EquityOrderActivity equityOrderActivity) {
                this.$tmp0 = equityOrderActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, EquityOrderActivity.class, "handleDuxoEvent", "handleDuxoEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<EquityOrderActivityEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleDuxoEvent = C293692.invokeSuspend$handleDuxoEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleDuxoEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleDuxoEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<EquityOrderActivityEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleDuxoEvent(EquityOrderActivity equityOrderActivity, Event event, Continuation continuation) {
            equityOrderActivity.handleDuxoEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(EquityOrderActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityOrderActivity.this);
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

    /* compiled from: EquityOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivity$onCreate$3", m3645f = "EquityOrderActivity.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivity$onCreate$3 */
    static final class C293703 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C293703(Continuation<? super C293703> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderActivity.this.new C293703(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C293703) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = EquityOrderActivity.this.getBwWebViewManager();
                this.label = 1;
                if (bwWebViewManager.retainUntilCanceled(this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks
    public void startOrderBuilder(final Buildable orderConfiguration) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(true);
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(orderConfigurationContextSingle(orderConfiguration.getAccountNumber())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderActivity.startOrderBuilder$lambda$0(this.f$0, orderConfiguration, (OrderConfigurationContextFactory.OrderConfigurationContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startOrderBuilder$lambda$0(EquityOrderActivity equityOrderActivity, Buildable buildable, OrderConfigurationContextFactory.OrderConfigurationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhToolbar rhToolbar = equityOrderActivity.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(false);
        OrderBuilderAndSelectFragment.Companion companion = OrderBuilderAndSelectFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        EquityOrderFlowSource flowSource = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) equityOrderActivity)).getFlowSource();
        Order orderToModify = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) equityOrderActivity)).getOrderToModify();
        equityOrderActivity.replaceFragment(companion.newInstance((Parcelable) new OrderBuilderAndSelectFragment.Args(it, buildable, flowSource, orderToModify != null ? orderToModify.getId() : null)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks
    public void startOrderSelectMenu(String accountNumber, BigDecimal shareQuantity) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(true);
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(orderConfigurationContextSingle(accountNumber)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderActivity.startOrderSelectMenu$lambda$1(this.f$0, (OrderConfigurationContextFactory.OrderConfigurationContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startOrderSelectMenu$lambda$1(EquityOrderActivity equityOrderActivity, OrderConfigurationContextFactory.OrderConfigurationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhToolbar rhToolbar = equityOrderActivity.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(false);
        OrderBuilderAndSelectFragment.Companion companion = OrderBuilderAndSelectFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        EquityOrderFlowSource flowSource = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) equityOrderActivity)).getFlowSource();
        Order orderToModify = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) equityOrderActivity)).getOrderToModify();
        equityOrderActivity.replaceFragment(companion.newInstance((Parcelable) new OrderBuilderAndSelectFragment.Args(it, null, flowSource, orderToModify != null ? orderToModify.getId() : null)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C29365R.id.dialog_id_order_account_not_approved) {
            finish();
        } else if (id == C29365R.id.dialog_id_subzero_killswitch) {
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void showOrderConfiguration(EquityOrderConfiguration.Resolved orderConfiguration, String accountNumber, EquityOrderSide side) {
        boolean z;
        Fragment recurringOrderFragmentInstance;
        if (isStateSaved()) {
            return;
        }
        if (Intrinsics.areEqual(this.orderConfiguration, orderConfiguration)) {
            EquityOrderSide equityOrderSide = this.side;
            if (equityOrderSide == null) {
                Intrinsics.throwUninitializedPropertyAccessException("side");
                equityOrderSide = null;
            }
            if (equityOrderSide == side) {
                return;
            }
        }
        if (this.orderConfiguration == null) {
            z = false;
        } else {
            AdvancedOrder.Draft draft = orderConfiguration instanceof AdvancedOrder.Draft ? (AdvancedOrder.Draft) orderConfiguration : null;
            if (draft != null && !draft.getAutoValidate()) {
                z = true;
            }
        }
        this.orderConfiguration = orderConfiguration;
        if (orderConfiguration instanceof EquityOrderConfiguration.DirectIpoOrderConfiguration) {
            if (accountNumber == null) {
                return;
            } else {
                recurringOrderFragmentInstance = getDirectIpoFragmentInstance((EquityOrderConfiguration.DirectIpoOrderConfiguration) orderConfiguration, accountNumber);
            }
        } else if (orderConfiguration instanceof AdvancedOrder.Complete) {
            recurringOrderFragmentInstance = getShareBasedOrderFragmentInstance((ShareBasedOrderConfiguration) orderConfiguration, true, side);
        } else if (orderConfiguration instanceof AdvancedOrder) {
            recurringOrderFragmentInstance = getAdvancedOrderFragmentInstance((AdvancedOrder) orderConfiguration, side);
        } else if (orderConfiguration instanceof DollarBased) {
            recurringOrderFragmentInstance = getDollarBasedOrderFragmentInstance((DollarBased) orderConfiguration, side);
        } else if (orderConfiguration instanceof ShareBasedOrderConfiguration) {
            recurringOrderFragmentInstance = getShareBasedOrderFragmentInstance((ShareBasedOrderConfiguration) orderConfiguration, false, side);
        } else {
            if (!(orderConfiguration instanceof EquityOrderConfiguration.Recurring)) {
                throw new NoWhenBranchMatchedException();
            }
            recurringOrderFragmentInstance = getRecurringOrderFragmentInstance(((EquityOrderConfiguration.Recurring) orderConfiguration).getConfiguration());
        }
        showOrder(recurringOrderFragmentInstance, !z);
    }

    @Override // com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks
    public void setOrderConfiguration(EquityOrderConfiguration orderConfiguration) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        if (Intrinsics.areEqual(this.orderConfiguration, orderConfiguration)) {
            popEntireFragmentBackstack();
        } else {
            getDuxo().setOrderConfiguration(orderConfiguration);
        }
    }

    @Override // com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderConfigurationCallbacks
    public void onOrderConfigurationResult(EquityOrderConfiguration configuration) {
        ShareBasedOrderConfiguration shareBasedOrderConfigurationMutateShareQuantity;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        EquityOrderConfiguration equityOrderConfiguration = this.orderConfiguration;
        if ((configuration instanceof ShareBasedOrderConfiguration) && (equityOrderConfiguration instanceof ShareBasedOrderConfiguration)) {
            BigDecimal shareQuantity = ((ShareBasedOrderConfiguration) equityOrderConfiguration).getShareQuantity();
            configuration = (shareQuantity == null || (shareBasedOrderConfigurationMutateShareQuantity = ((ShareBasedOrderConfiguration) configuration).mutateShareQuantity(shareQuantity)) == null) ? (ShareBasedOrderConfiguration) configuration : shareBasedOrderConfigurationMutateShareQuantity;
        }
        setOrderConfiguration(configuration);
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void startOrderConfigurationSelection(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(true);
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(orderConfigurationContextSingle(accountNumber)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderActivity.startOrderConfigurationSelection$lambda$3(this.f$0, (OrderConfigurationContextFactory.OrderConfigurationContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startOrderConfigurationSelection$lambda$3(EquityOrderActivity equityOrderActivity, OrderConfigurationContextFactory.OrderConfigurationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhToolbar rhToolbar = equityOrderActivity.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(false);
        OrderBuilderAndSelectFragment.Companion companion = OrderBuilderAndSelectFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        EquityOrderFlowSource flowSource = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) equityOrderActivity)).getFlowSource();
        Order orderToModify = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) equityOrderActivity)).getOrderToModify();
        equityOrderActivity.replaceFragment(companion.newInstance((Parcelable) new OrderBuilderAndSelectFragment.Args(it, null, flowSource, orderToModify != null ? orderToModify.getId() : null)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void editRecurringOrder(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new RecurringGenericCreationFragmentKey(new InvestmentTarget(((EquityOrderActivityIntentKey) INSTANCE.getExtras((Activity) this)).getInstrumentId(), null, ApiAssetType.EQUITY), RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, false, null, null, null, "", true, ForceIntro.FALSE, false, null, false, false, false, null, false, false, 130560, null), null, 2, null));
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void setRecurringOrderConfiguration(RecurringOrderConfiguration orderConfiguration) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        setOrderConfiguration(new EquityOrderConfiguration.Recurring(orderConfiguration));
    }

    private final EquityShareOrderParentFragment getShareBasedOrderFragmentInstance(ShareBasedOrderConfiguration orderConfiguration, boolean isStreamlined, EquityOrderSide side) {
        EquityShareOrderParentFragment.Companion companion = EquityShareOrderParentFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        UUID instrumentId = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getInstrumentId();
        String completionUrl = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getCompletionUrl();
        boolean isPreIpo = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getIsPreIpo();
        String accountNumber = orderConfiguration.getAccountNumber();
        EquityOrderFlowSource flowSource = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getFlowSource();
        Order orderToModify = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getOrderToModify();
        return companion.newInstance(orderConfiguration, instrumentId, side, completionUrl, isPreIpo, accountNumber, isStreamlined, flowSource, orderToModify != null ? orderToModify.getId() : null, ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getRefId(), orderConfiguration.getTaxLots(), ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getSkipConfirmation());
    }

    private final DirectIpoOrderParentFragment getDirectIpoFragmentInstance(EquityOrderConfiguration.DirectIpoOrderConfiguration orderConfiguration, String accountNumber) {
        return (DirectIpoOrderParentFragment) DirectIpoOrderParentFragment.INSTANCE.newInstance((Parcelable) new DirectIpoOrderParentFragment.Args(accountNumber, ((EquityOrderActivityIntentKey) INSTANCE.getExtras((Activity) this)).getInstrumentId(), orderConfiguration.getSource()));
    }

    private final EquityDollarOrderParentFragment getDollarBasedOrderFragmentInstance(DollarBased orderConfiguration, EquityOrderSide side) {
        EquityDollarOrderParentFragment.Companion companion = EquityDollarOrderParentFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        return companion.newInstance(orderConfiguration, ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getInstrumentId(), side, ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getCompletionUrl(), ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getIsPreIpo(), orderConfiguration.getAccountNumber(), ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getFlowSource(), ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getRefId(), ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getSkipConfirmation());
    }

    private final RecurringOrderParentFragment getRecurringOrderFragmentInstance(RecurringOrderConfiguration orderConfiguration) {
        return (RecurringOrderParentFragment) RecurringOrderParentFragment.INSTANCE.newInstance((Parcelable) new RecurringOrderParentFragment.Args(new InvestmentTarget(((EquityOrderActivityIntentKey) INSTANCE.getExtras((Activity) this)).getInstrumentId(), null, ApiAssetType.EQUITY), orderConfiguration, "EquityOrderActivity"));
    }

    private final EquityAdvancedOrderFragment getAdvancedOrderFragmentInstance(AdvancedOrder advancedOrder, EquityOrderSide equityOrderSide) {
        EquityAdvancedOrderFragment.Companion companion = EquityAdvancedOrderFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        UUID instrumentId = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getInstrumentId();
        EquityOrderFlowSource flowSource = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getFlowSource();
        UUID refId = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getRefId();
        Order orderToModify = ((EquityOrderActivityIntentKey) companion2.getExtras((Activity) this)).getOrderToModify();
        return (EquityAdvancedOrderFragment) companion.newInstance((Parcelable) new EquityAdvancedOrderFragment.Args(advancedOrder, instrumentId, equityOrderSide, flowSource, refId, orderToModify != null ? orderToModify.getId() : null));
    }

    static /* synthetic */ void showOrder$default(EquityOrderActivity equityOrderActivity, Fragment fragment, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        equityOrderActivity.showOrder(fragment, z);
    }

    private final void showOrder(Fragment fragment, boolean useAnimation) {
        popEntireFragmentBackstack();
        new ReplaceFragmentBuilder(fragment).setUseDefaultAnimation(useAnimation).setAddToBackstack(false).buildAndExecute(this);
    }

    private final Single<OrderConfigurationContextFactory.OrderConfigurationContext> orderConfigurationContextSingle(String accountNumber) {
        EquityOrderSide equityOrderSide;
        OrderConfigurationContextFactory orderConfigurationContextFactory = getOrderConfigurationContextFactory();
        Companion companion = INSTANCE;
        UUID instrumentId = ((EquityOrderActivityIntentKey) companion.getExtras((Activity) this)).getInstrumentId();
        EquityOrderSide equityOrderSide2 = this.side;
        if (equityOrderSide2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("side");
            equityOrderSide2 = null;
        }
        Single<OrderConfigurationContextFactory.OrderConfigurationContext> singleCreate = orderConfigurationContextFactory.create(instrumentId, equityOrderSide2, accountNumber, ((EquityOrderActivityIntentKey) companion.getExtras((Activity) this)).getRefId());
        UUID instrumentId2 = ((EquityOrderActivityIntentKey) companion.getExtras((Activity) this)).getInstrumentId();
        EquityOrderSide equityOrderSide3 = this.side;
        if (equityOrderSide3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("side");
            equityOrderSide = null;
        } else {
            equityOrderSide = equityOrderSide3;
        }
        Single<OrderConfigurationContextFactory.OrderConfigurationContext> singleOnErrorReturnItem = singleCreate.onErrorReturnItem(new OrderConfigurationContextFactory.OrderConfigurationContext(instrumentId2, equityOrderSide, accountNumber, false, null, false, null, ((EquityOrderActivityIntentKey) companion.getExtras((Activity) this)).getRefId(), 120, null));
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        return singleOnErrorReturnItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(EquityOrderActivityViewState state, Bundle savedInstanceState) {
        EquityOrderSide side = state.getSide();
        if (side == null) {
            side = ((EquityOrderActivityIntentKey) INSTANCE.getExtras((Activity) this)).getSide();
        }
        this.side = side;
        EquityOrderConfiguration.Resolved currentOrderConfiguration = state.getCurrentOrderConfiguration();
        if (currentOrderConfiguration != null) {
            String accountNumber = state.getAccountNumber();
            EquityOrderSide equityOrderSide = this.side;
            if (equityOrderSide == null) {
                Intrinsics.throwUninitializedPropertyAccessException("side");
                equityOrderSide = null;
            }
            showOrderConfiguration(currentOrderConfiguration, accountNumber, equityOrderSide);
        }
    }

    @Override // com.robinhood.android.equityadvancedorder.callbacks.EquityActivityBackgroundCallbacks
    public void setActivityBackground(boolean isReviewing) {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setUseDesignSystemTheme(!isReviewing);
        }
    }

    /* compiled from: EquityOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivity;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "<init>", "()V", "TAG_ACCOUNT_NOT_APPROVED", "", "TAG_SUBZERO_KILLSWITCH", "SCREEN_NAME", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<EquityOrderActivity, EquityOrderActivityIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public EquityOrderActivityIntentKey getExtras(EquityOrderActivity equityOrderActivity) {
            return (EquityOrderActivityIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, equityOrderActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, EquityOrderActivityIntentKey equityOrderActivityIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, equityOrderActivityIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, EquityOrderActivityIntentKey equityOrderActivityIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, equityOrderActivityIntentKey);
        }
    }
}
