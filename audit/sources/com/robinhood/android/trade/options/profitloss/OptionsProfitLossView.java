package com.robinhood.android.trade.options.profitloss;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.upsell.plchart.ProfitAndLossChartEducationFragment;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.Rotation;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionsProfitLossChartAnalysisFragmentKey;
import com.robinhood.android.optionsplchart.C24771R;
import com.robinhood.android.optionsplchart.databinding.MergeMultilegShoppingCartProfitLossBinding;
import com.robinhood.android.optionsplchart.databinding.MergeMultilegShoppingCartProfitLossSmallBinding;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2;
import com.robinhood.disposer.DisposerKt;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: OptionsProfitLossView.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001KB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u00105R\u0014\u0010J\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext$NormalDevice;", "Landroid/view/ViewGroup;", "parent", "", "chartVisible", "", "setChartVisibility", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext$NormalDevice;Landroid/view/ViewGroup;Z)V", "Lcom/robinhood/disposer/LifecycleHost;", "lifecycleHost", "initializeViews", "(Landroid/view/ViewGroup;Lcom/robinhood/disposer/LifecycleHost;)V", "analysisBtnEnabled", "Lcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;", "analysisBtnFragmentKey", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "profitLossChartParams", "refreshUi", "(ZLcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;)V", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;", "sourceForLogging", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;", "getSourceForLogging", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;", "setSourceForLogging", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;)V", "j$/time/Instant", "lastExpanded", "Lj$/time/Instant;", "getLastExpanded", "()Lj$/time/Instant;", "setLastExpanded", "(Lj$/time/Instant;)V", "shouldUseSmallLayout", "Z", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext;", "profitLossChartContext", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext;", "getProfitLossChartContext", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext;", "getSource", "source", "getChartContainerVisibility", "()Z", "chartContainerVisibility", "ProfitLossChartContext", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionsProfitLossView extends Hammer_OptionsProfitLossView implements OptionsProfitLossAnalytics2 {
    public static final int $stable = 8;
    public AnalyticsLogger analytics;
    public EventLogger eventLogger;
    private Instant lastExpanded;
    public Navigator navigator;
    private final ProfitLossChartContext profitLossChartContext;
    private final boolean shouldUseSmallLayout;
    private OptionsProfitLossAnalytics2.Source sourceForLogging;

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logChartDisappear(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logChartDisappear(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossAnalysisBtnAppear(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossAnalysisBtnAppear(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossAnalysisBtnTap(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossAnalysisBtnTap(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarAppear(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarAppear(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarCollapse(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarCollapse(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarCollapse(EventLogger eventLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarCollapse(this, eventLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarError(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarError(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarExpand(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarExpand(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarExpand(EventLogger eventLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarExpand(this, eventLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void onInfoBarClickWithLogging(OptionsProfitLossInfoBar optionsProfitLossInfoBar, AnalyticsLogger analyticsLogger, EventLogger eventLogger, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        OptionsProfitLossAnalytics2.DefaultImpls.onInfoBarClickWithLogging(this, optionsProfitLossInfoBar, analyticsLogger, eventLogger, function1, function12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsProfitLossView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        this.lastExpanded = instantNow;
        boolean z = getResources().getBoolean(C24771R.bool.options_chart_screen_is_small_device);
        this.shouldUseSmallLayout = z;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C24771R.styleable.OptionsProfitLossView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!typedArrayObtainStyledAttributes.getBoolean(C24771R.styleable.OptionsProfitLossView_allowSmallLayout, true) || !z) {
            ViewGroups.inflate(this, C24771R.layout.merge_multileg_shopping_cart_profit_loss, true);
            MergeMultilegShoppingCartProfitLossBinding mergeMultilegShoppingCartProfitLossBindingBind = MergeMultilegShoppingCartProfitLossBinding.bind(this);
            Intrinsics.checkNotNullExpressionValue(mergeMultilegShoppingCartProfitLossBindingBind, "bind(...)");
            this.profitLossChartContext = new ProfitLossChartContext.NormalDevice(mergeMultilegShoppingCartProfitLossBindingBind);
            Integer resourceIdOrNull = TypedArrays3.getResourceIdOrNull(typedArrayObtainStyledAttributes, C24771R.styleable.OptionsProfitLossView_spacerLayout);
            if (resourceIdOrNull != null) {
                ContextSystemServices.getLayoutInflater(context).inflate(resourceIdOrNull.intValue(), (ViewGroup) mergeMultilegShoppingCartProfitLossBindingBind.multilegShoppingCartProfitLossSpacer, true);
            }
        } else {
            ViewGroups.inflate(this, C24771R.layout.merge_multileg_shopping_cart_profit_loss_small, true);
            MergeMultilegShoppingCartProfitLossSmallBinding mergeMultilegShoppingCartProfitLossSmallBindingBind = MergeMultilegShoppingCartProfitLossSmallBinding.bind(this);
            Intrinsics.checkNotNullExpressionValue(mergeMultilegShoppingCartProfitLossSmallBindingBind, "bind(...)");
            this.profitLossChartContext = new ProfitLossChartContext.SmallDevice(mergeMultilegShoppingCartProfitLossSmallBindingBind);
        }
        typedArrayObtainStyledAttributes.recycle();
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

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final OptionsProfitLossAnalytics2.Source getSourceForLogging() {
        return this.sourceForLogging;
    }

    public final void setSourceForLogging(OptionsProfitLossAnalytics2.Source source) {
        this.sourceForLogging = source;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public OptionsProfitLossAnalytics2.Source getSource() {
        OptionsProfitLossAnalytics2.Source source = this.sourceForLogging;
        return source == null ? OptionsProfitLossAnalytics2.Source.SHOPPING_CART : source;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public Instant getLastExpanded() {
        return this.lastExpanded;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void setLastExpanded(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<set-?>");
        this.lastExpanded = instant;
    }

    public final ProfitLossChartContext getProfitLossChartContext() {
        return this.profitLossChartContext;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public boolean getChartContainerVisibility() {
        ProfitLossChartContext profitLossChartContext = this.profitLossChartContext;
        ProfitLossChartContext.NormalDevice normalDevice = profitLossChartContext instanceof ProfitLossChartContext.NormalDevice ? (ProfitLossChartContext.NormalDevice) profitLossChartContext : null;
        if (normalDevice != null) {
            return normalDevice.getChartContainerVisibility();
        }
        return false;
    }

    public final void initializeViews(final ViewGroup parent, LifecycleHost lifecycleHost) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(lifecycleHost, "lifecycleHost");
        ProfitLossChartContext profitLossChartContext = this.profitLossChartContext;
        if (profitLossChartContext instanceof ProfitLossChartContext.SmallDevice) {
            logOptionsProfitLossAnalysisBtnAppear(getAnalytics());
            return;
        }
        if (!(profitLossChartContext instanceof ProfitLossChartContext.NormalDevice)) {
            throw new NoWhenBranchMatchedException();
        }
        DisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(((ProfitLossChartContext.NormalDevice) profitLossChartContext).getBindings().multilegShoppingCartProfitLossChart.getProfitLossAdditionalInfoObs()), lifecycleHost.getLifecycleEvents(), DisposerKt.getCurrentEvent(lifecycleHost.getLifecycleEvents()).getTerminalEvent()).subscribeKotlin(new C298721(((ProfitLossChartContext.NormalDevice) this.profitLossChartContext).getBindings().multilegShoppingCartProfitLossInfoBar));
        DisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(((ProfitLossChartContext.NormalDevice) this.profitLossChartContext).getBindings().multilegShoppingCartProfitLossInfoBar.getShouldForceCollapseChartObs()), lifecycleHost.getLifecycleEvents(), DisposerKt.getCurrentEvent(lifecycleHost.getLifecycleEvents()).getTerminalEvent()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossView.initializeViews$lambda$0(this.f$0, parent, (Unit) obj);
            }
        });
        logOptionsProfitLossInfoBarAppear(getAnalytics());
        OptionsProfitLossInfoBar multilegShoppingCartProfitLossInfoBar = ((ProfitLossChartContext.NormalDevice) this.profitLossChartContext).getBindings().multilegShoppingCartProfitLossInfoBar;
        Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossInfoBar, "multilegShoppingCartProfitLossInfoBar");
        onInfoBarClickWithLogging(multilegShoppingCartProfitLossInfoBar, getAnalytics(), getEventLogger(), new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossView.initializeViews$lambda$1(this.f$0, parent, ((Boolean) obj).booleanValue());
            }
        }, Views.getActivityErrorHandler(this));
        RdsButton multilegShoppingCartProfitLossLearnMore = ((ProfitLossChartContext.NormalDevice) this.profitLossChartContext).getBindings().multilegShoppingCartProfitLossLearnMore;
        Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossLearnMore, "multilegShoppingCartProfitLossLearnMore");
        OnClickListeners.onClick(multilegShoppingCartProfitLossLearnMore, new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitLossView.initializeViews$lambda$2(this.f$0);
            }
        });
    }

    /* compiled from: OptionsProfitLossView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossView$initializeViews$1 */
    /* synthetic */ class C298721 extends FunctionReferenceImpl implements Function1<ProfitLossAdditionalInfo, Unit> {
        C298721(Object obj) {
            super(1, obj, OptionsProfitLossInfoBar.class, "updateInfo", "updateInfo(Lcom/robinhood/android/trade/options/profitloss/ProfitLossAdditionalInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProfitLossAdditionalInfo profitLossAdditionalInfo) {
            invoke2(profitLossAdditionalInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ProfitLossAdditionalInfo p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionsProfitLossInfoBar) this.receiver).updateInfo(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeViews$lambda$0(OptionsProfitLossView optionsProfitLossView, ViewGroup viewGroup, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionsProfitLossView.setChartVisibility((ProfitLossChartContext.NormalDevice) optionsProfitLossView.profitLossChartContext, viewGroup, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeViews$lambda$1(OptionsProfitLossView optionsProfitLossView, ViewGroup viewGroup, boolean z) {
        optionsProfitLossView.setChartVisibility((ProfitLossChartContext.NormalDevice) optionsProfitLossView.profitLossChartContext, viewGroup, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeViews$lambda$2(OptionsProfitLossView optionsProfitLossView) {
        OptionsProfitLossAnalytics.logOptionsProfitLossLearnMoreTap(optionsProfitLossView.getAnalytics());
        Context context = optionsProfitLossView.getContext();
        ProfitAndLossChartEducationFragment.Companion companion = ProfitAndLossChartEducationFragment.INSTANCE;
        Context context2 = optionsProfitLossView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        context.startActivity(companion.getIntent(context2, optionsProfitLossView.getNavigator()), null);
        return Unit.INSTANCE;
    }

    public final void refreshUi(boolean analysisBtnEnabled, final OptionsProfitLossChartAnalysisFragmentKey analysisBtnFragmentKey, ApiOptionsProfitLossChartRequestParams profitLossChartParams) {
        ProfitLossChartContext profitLossChartContext = this.profitLossChartContext;
        if (profitLossChartContext instanceof ProfitLossChartContext.SmallDevice) {
            RdsButton multilegShoppingCartProfitLossAnalysisBtn = ((ProfitLossChartContext.SmallDevice) profitLossChartContext).getBindings().multilegShoppingCartProfitLossAnalysisBtn;
            Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossAnalysisBtn, "multilegShoppingCartProfitLossAnalysisBtn");
            multilegShoppingCartProfitLossAnalysisBtn.setEnabled(analysisBtnEnabled);
            if (analysisBtnFragmentKey != null) {
                OnClickListeners.onClick(multilegShoppingCartProfitLossAnalysisBtn, new Function0() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossView$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsProfitLossView.refreshUi$lambda$3(this.f$0, analysisBtnFragmentKey);
                    }
                });
                return;
            } else {
                multilegShoppingCartProfitLossAnalysisBtn.setOnClickListener(null);
                return;
            }
        }
        if (!(profitLossChartContext instanceof ProfitLossChartContext.NormalDevice)) {
            throw new NoWhenBranchMatchedException();
        }
        OptionsProfitLossChartView multilegShoppingCartProfitLossChart = ((ProfitLossChartContext.NormalDevice) profitLossChartContext).getBindings().multilegShoppingCartProfitLossChart;
        Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossChart, "multilegShoppingCartProfitLossChart");
        if (profitLossChartParams != null) {
            multilegShoppingCartProfitLossChart.updateRequestParams(profitLossChartParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$3(OptionsProfitLossView optionsProfitLossView, OptionsProfitLossChartAnalysisFragmentKey optionsProfitLossChartAnalysisFragmentKey) {
        optionsProfitLossView.logOptionsProfitLossAnalysisBtnTap(optionsProfitLossView.getAnalytics());
        Navigator navigator = optionsProfitLossView.getNavigator();
        Context context = optionsProfitLossView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, optionsProfitLossChartAnalysisFragmentKey, false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    private final void setChartVisibility(ProfitLossChartContext.NormalDevice normalDevice, ViewGroup viewGroup, boolean z) {
        if (normalDevice.getChartContainerVisibility() == z) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossView$setChartVisibility$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossView$setChartVisibility$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        Transitions2.add(transitionSet, new Fade());
        Transitions2.add(transitionSet, new Rotation());
        Transitions2.add(transitionSet, new ChangeBounds());
        transitionSet.setInterpolator((TimeInterpolator) Interpolators.INSTANCE.getFastOutSlowIn());
        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
        normalDevice.setChartContainerVisibility(z);
        normalDevice.getBindings().multilegShoppingCartProfitLossInfoBar.setChartExpanded(z);
        if (z) {
            return;
        }
        logChartDisappear(getAnalytics());
    }

    /* compiled from: OptionsProfitLossView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext;", "", "<init>", "()V", "SmallDevice", "NormalDevice", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext$NormalDevice;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext$SmallDevice;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ProfitLossChartContext {
        public static final int $stable = 0;

        public /* synthetic */ ProfitLossChartContext(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ProfitLossChartContext() {
        }

        /* compiled from: OptionsProfitLossView.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext$SmallDevice;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext;", "bindings", "Lcom/robinhood/android/optionsplchart/databinding/MergeMultilegShoppingCartProfitLossSmallBinding;", "<init>", "(Lcom/robinhood/android/optionsplchart/databinding/MergeMultilegShoppingCartProfitLossSmallBinding;)V", "getBindings", "()Lcom/robinhood/android/optionsplchart/databinding/MergeMultilegShoppingCartProfitLossSmallBinding;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SmallDevice extends ProfitLossChartContext {
            public static final int $stable = 8;
            private final MergeMultilegShoppingCartProfitLossSmallBinding bindings;

            public final MergeMultilegShoppingCartProfitLossSmallBinding getBindings() {
                return this.bindings;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SmallDevice(MergeMultilegShoppingCartProfitLossSmallBinding bindings) {
                super(null);
                Intrinsics.checkNotNullParameter(bindings, "bindings");
                this.bindings = bindings;
            }
        }

        /* compiled from: OptionsProfitLossView.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext$NormalDevice;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossView$ProfitLossChartContext;", "bindings", "Lcom/robinhood/android/optionsplchart/databinding/MergeMultilegShoppingCartProfitLossBinding;", "<init>", "(Lcom/robinhood/android/optionsplchart/databinding/MergeMultilegShoppingCartProfitLossBinding;)V", "getBindings", "()Lcom/robinhood/android/optionsplchart/databinding/MergeMultilegShoppingCartProfitLossBinding;", "value", "", "chartContainerVisibility", "getChartContainerVisibility", "()Z", "setChartContainerVisibility", "(Z)V", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class NormalDevice extends ProfitLossChartContext {
            public static final int $stable = 8;
            private final MergeMultilegShoppingCartProfitLossBinding bindings;

            public final MergeMultilegShoppingCartProfitLossBinding getBindings() {
                return this.bindings;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalDevice(MergeMultilegShoppingCartProfitLossBinding bindings) {
                super(null);
                Intrinsics.checkNotNullParameter(bindings, "bindings");
                this.bindings = bindings;
            }

            public final boolean getChartContainerVisibility() {
                OptionsProfitLossChartView multilegShoppingCartProfitLossChart = this.bindings.multilegShoppingCartProfitLossChart;
                Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossChart, "multilegShoppingCartProfitLossChart");
                return multilegShoppingCartProfitLossChart.getVisibility() == 0;
            }

            public final void setChartContainerVisibility(boolean z) {
                if (z) {
                    OptionsProfitLossChartView multilegShoppingCartProfitLossChart = this.bindings.multilegShoppingCartProfitLossChart;
                    Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossChart, "multilegShoppingCartProfitLossChart");
                    multilegShoppingCartProfitLossChart.setVisibility(0);
                    RdsButton multilegShoppingCartProfitLossLearnMore = this.bindings.multilegShoppingCartProfitLossLearnMore;
                    Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossLearnMore, "multilegShoppingCartProfitLossLearnMore");
                    multilegShoppingCartProfitLossLearnMore.setVisibility(0);
                    FrameLayout multilegShoppingCartProfitLossSpacer = this.bindings.multilegShoppingCartProfitLossSpacer;
                    Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossSpacer, "multilegShoppingCartProfitLossSpacer");
                    multilegShoppingCartProfitLossSpacer.setVisibility(4);
                    return;
                }
                OptionsProfitLossChartView multilegShoppingCartProfitLossChart2 = this.bindings.multilegShoppingCartProfitLossChart;
                Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossChart2, "multilegShoppingCartProfitLossChart");
                multilegShoppingCartProfitLossChart2.setVisibility(8);
                RdsButton multilegShoppingCartProfitLossLearnMore2 = this.bindings.multilegShoppingCartProfitLossLearnMore;
                Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossLearnMore2, "multilegShoppingCartProfitLossLearnMore");
                multilegShoppingCartProfitLossLearnMore2.setVisibility(8);
                FrameLayout multilegShoppingCartProfitLossSpacer2 = this.bindings.multilegShoppingCartProfitLossSpacer;
                Intrinsics.checkNotNullExpressionValue(multilegShoppingCartProfitLossSpacer2, "multilegShoppingCartProfitLossSpacer");
                multilegShoppingCartProfitLossSpacer2.setVisibility(8);
            }
        }
    }
}
