package com.robinhood.android.account.p060ui;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.view.ViewScrollChangeEvent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.account.C8066R;
import com.robinhood.android.account.databinding.FragmentAccountNavigationBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.sparkle.SparkleImageView;
import com.robinhood.android.gold.contracts.GoldSettingsIntentKey;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.SettingsAdapter;
import com.robinhood.android.settings.p254ui.SettingsPlaceholderAdapter;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.account.contracts.AccountNavigationTabFragmentKey;
import com.robinhood.shared.settings.iibsettings.SettingsItemLoggingUtils;
import com.robinhood.shared.settings.libsettings.C39787R;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountNavigationFragment.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020@H\u0016J\u001a\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010F\u001a\u00020;H\u0016J\u0010\u0010G\u001a\u00020;2\u0006\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020;H\u0016J\u0018\u0010K\u001a\u00020;2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020;2\u0006\u0010N\u001a\u00020OH\u0016J \u0010Q\u001a\u00020;2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020VH\u0016J\u0018\u0010W\u001a\u00020;2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020CH\u0016J&\u0010[\u001a\u00020;2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020;0aH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b(\u0010)R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020.X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020.X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0014\u00103\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00100R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountNavigationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "getLogOnceEventLogger", "()Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger$delegate", "Lkotlin/Lazy;", "duxo", "Lcom/robinhood/android/account/ui/AccountNavigationDuxo;", "getDuxo", "()Lcom/robinhood/android/account/ui/AccountNavigationDuxo;", "duxo$delegate", "binding", "Lcom/robinhood/android/account/databinding/FragmentAccountNavigationBinding;", "getBinding", "()Lcom/robinhood/android/account/databinding/FragmentAccountNavigationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "sentPromoAppearAnalytics", "", "", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "navigationAdapter", "Lcom/robinhood/android/settings/ui/SettingsAdapter;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "animateToolbarVisibility", "getAnimateToolbarVisibility", "isCrypto", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "bind", "state", "Lcom/robinhood/android/account/ui/AccountNavigationViewState;", "scrollToTop", "onSettingsActionTriggered", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "settingsItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;", "onSettingsActionAppeared", "onToggleClicked", "toggleItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ToggleItem;", "newToggleState", "toggleView", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "onValueItemClicked", "valueItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ValueItem;", "rowView", "onSelectOneItemClicked", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;", "selection", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem$Option;", "stopLoading", "Lkotlin/Function0;", "Companion", "feature-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountNavigationFragment extends BaseFragment implements Scrollable, SettingsAdapter.Callbacks {
    public AnalyticsLogger analytics;
    private final boolean animateToolbarVisibility;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public CrossSellLaunchManager crossSellLaunchManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: logOnceEventLogger$delegate, reason: from kotlin metadata */
    private final Lazy logOnceEventLogger;
    private final SettingsAdapter navigationAdapter;
    private final Set<String> sentPromoAppearAnalytics;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountNavigationFragment.class, "binding", "getBinding()Lcom/robinhood/android/account/databinding/FragmentAccountNavigationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onSelectOneItemClicked(TypedSettingsItem.SelectOneItem item, TypedSettingsItem.SelectOneItem.Option selection, Function0<Unit> stopLoading) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(stopLoading, "stopLoading");
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onToggleClicked(TypedSettingsItem.ToggleItem toggleItem, boolean newToggleState, RdsToggleView toggleView) {
        Intrinsics.checkNotNullParameter(toggleItem, "toggleItem");
        Intrinsics.checkNotNullParameter(toggleView, "toggleView");
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onValueItemClicked(TypedSettingsItem.ValueItem valueItem, View rowView) {
        Intrinsics.checkNotNullParameter(valueItem, "valueItem");
        Intrinsics.checkNotNullParameter(rowView, "rowView");
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onAccordionItemExpandedStateChanged(TypedSettingsItem.AccordionItem accordionItem, boolean z) {
        SettingsAdapter.Callbacks.DefaultImpls.onAccordionItemExpandedStateChanged(this, accordionItem, z);
    }

    public AccountNavigationFragment() {
        super(C8066R.layout.fragment_account_navigation);
        this.logOnceEventLogger = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.account.ui.AccountNavigationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountNavigationFragment.logOnceEventLogger_delegate$lambda$0(this.f$0);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, AccountNavigationDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AccountNavigationFragment2.INSTANCE);
        this.sentPromoAppearAnalytics = new LinkedHashSet();
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.account.ui.AccountNavigationFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountNavigationFragment.toolbarScrollAnimator_delegate$lambda$1(this.f$0);
            }
        });
        this.navigationAdapter = new SettingsAdapter(this);
        this.useDesignSystemToolbar = true;
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

    private final LogOnceEventLogger getLogOnceEventLogger() {
        return (LogOnceEventLogger) this.logOnceEventLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceEventLogger logOnceEventLogger_delegate$lambda$0(AccountNavigationFragment accountNavigationFragment) {
        return new LogOnceEventLogger(accountNavigationFragment.getEventLogger());
    }

    private final AccountNavigationDuxo getDuxo() {
        return (AccountNavigationDuxo) this.duxo.getValue();
    }

    private final FragmentAccountNavigationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAccountNavigationBinding) value;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$1(AccountNavigationFragment accountNavigationFragment) {
        RhToolbar rhToolbar = accountNavigationFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, accountNavigationFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getAnimateToolbarVisibility() {
        return this.animateToolbarVisibility;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return ((AccountNavigationTabFragmentKey) INSTANCE.getArgs((Fragment) this)).isCrypto();
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C39787R.string.account_nav_header_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        NestedScrollView contentRoot = getBinding().contentRoot;
        Intrinsics.checkNotNullExpressionValue(contentRoot, "contentRoot");
        LifecycleHost.DefaultImpls.bind$default(this, RxView.scrollChangeEvents(contentRoot), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountNavigationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountNavigationFragment.onViewCreated$lambda$3(this.f$0, (ViewScrollChangeEvent) obj);
            }
        });
        RecyclerView navigationRecyclerView = getBinding().navigationRecyclerView;
        Intrinsics.checkNotNullExpressionValue(navigationRecyclerView, "navigationRecyclerView");
        bindAdapter(navigationRecyclerView, new SettingsPlaceholderAdapter(true));
        this.sentPromoAppearAnalytics.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(AccountNavigationFragment accountNavigationFragment, ViewScrollChangeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        accountNavigationFragment.getToolbarScrollAnimator().onScroll(event.getScrollY());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<AccountNavigationViewState> observableDoFinally = getDuxo().getStates().doFinally(new Action() { // from class: com.robinhood.android.account.ui.AccountNavigationFragment.onResume.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.setBusy(IdlingResourceType.ACCOUNT_NAVIGATION_ACCOUNT_LOADED, false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnFastPath(observableDoFinally), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C81812(this));
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        NestedScrollView contentRoot = getBinding().contentRoot;
        Intrinsics.checkNotNullExpressionValue(contentRoot, "contentRoot");
        toolbarScrollAnimator.dispatchScroll(contentRoot);
        CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, IacAlertSheetLocation.TOP_LEVEL_ACCOUNT, null, null, null, null, null, null, null, 508, null);
    }

    /* compiled from: AccountNavigationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.ui.AccountNavigationFragment$onResume$2 */
    /* synthetic */ class C81812 extends FunctionReferenceImpl implements Function1<AccountNavigationViewState, Unit> {
        C81812(Object obj) {
            super(1, obj, AccountNavigationFragment.class, "bind", "bind(Lcom/robinhood/android/account/ui/AccountNavigationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AccountNavigationViewState accountNavigationViewState) throws Throwable {
            invoke2(accountNavigationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AccountNavigationViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AccountNavigationFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final AccountNavigationViewState state) throws Throwable {
        Throwable thConsume;
        if (state.getShowSettingsPlaceholder()) {
            RecyclerView navigationRecyclerView = getBinding().navigationRecyclerView;
            Intrinsics.checkNotNullExpressionValue(navigationRecyclerView, "navigationRecyclerView");
            bindAdapter(navigationRecyclerView, new SettingsPlaceholderAdapter(true));
        } else {
            RecyclerView navigationRecyclerView2 = getBinding().navigationRecyclerView;
            Intrinsics.checkNotNullExpressionValue(navigationRecyclerView2, "navigationRecyclerView");
            bindAdapter(navigationRecyclerView2, this.navigationAdapter);
            SettingsAdapter settingsAdapter = this.navigationAdapter;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            settingsAdapter.submitList(state.getSettingsItems(resources));
        }
        UiEvent<Throwable> settingsLoadError = state.getSettingsLoadError();
        if (settingsLoadError != null && (thConsume = settingsLoadError.consume()) != null) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, 0, null, 56, null);
        }
        SparkleImageView goldBadge = getBinding().goldBadge;
        Intrinsics.checkNotNullExpressionValue(goldBadge, "goldBadge");
        goldBadge.setVisibility(state.getShow24kGoldBadge() ? 0 : 8);
        SparkleImageView goldBadge2 = getBinding().goldBadge;
        Intrinsics.checkNotNullExpressionValue(goldBadge2, "goldBadge");
        OnClickListeners.onClick(goldBadge2, new Function0() { // from class: com.robinhood.android.account.ui.AccountNavigationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountNavigationFragment.bind$lambda$5(state, this);
            }
        });
        IdlingResourceCounters2.setBusy(IdlingResourceType.ACCOUNT_NAVIGATION_ACCOUNT_LOADED, !state.getHasAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5(AccountNavigationViewState accountNavigationViewState, AccountNavigationFragment accountNavigationFragment) {
        if (accountNavigationViewState.getHasGold()) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(accountNavigationFragment.getAnalytics(), "account", AnalyticsStrings.BUTTON_ACCOUNT_GOLD_SETTINGS, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            Navigator navigator = accountNavigationFragment.getNavigator();
            Context contextRequireContext = accountNavigationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GoldSettingsIntentKey(false, true, null, 5, null), null, false, null, null, 60, null);
        } else {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(accountNavigationFragment.getAnalytics(), "account", AnalyticsStrings.BUTTON_ACCOUNT_GOLD_UPSELL_ICON, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            Navigator navigator2 = accountNavigationFragment.getNavigator();
            Context contextRequireContext2 = accountNavigationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new GoldUpgradeIntentKey("account_settings", "settings", null, null, null, false, 60, null), null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        getBinding().contentRoot.smoothScrollTo(0, 0);
    }

    /* compiled from: AccountNavigationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountNavigationFragment$onSettingsActionTriggered$1", m3645f = "AccountNavigationFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.ui.AccountNavigationFragment$onSettingsActionTriggered$1 */
    static final class C81821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GenericAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C81821(GenericAction genericAction, Continuation<? super C81821> continuation) {
            super(2, continuation);
            this.$action = genericAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountNavigationFragment.this.new C81821(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C81821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Navigator navigator = AccountNavigationFragment.this.getNavigator();
                Context contextRequireContext = AccountNavigationFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Uri uri = ((GenericAction.DeeplinkAction) this.$action).getUri();
                NavigationType navigationType = NavigationType.PUSH;
                this.label = 1;
                if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, uri, false, false, navigationType, this, 12, null) == coroutine_suspended) {
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

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onSettingsActionTriggered(GenericAction action, TypedSettingsItem settingsItem) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(settingsItem, "settingsItem");
        if (action instanceof GenericAction.DeeplinkAction) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C81821(action, null), 3, null);
        } else if (action instanceof GenericAction.InfoAlertAction) {
            GenericAction.InfoAlertAction infoAlertAction = (GenericAction.InfoAlertAction) action;
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(infoAlertAction.getAlert(), true, false, 0, 12, (DefaultConstructorMarker) null), null, 2, null).show(requireActivity().getSupportFragmentManager(), infoAlertAction.getAlert().getTitle());
        } else {
            throw new IllegalStateException("Item action not supported in account menu settings");
        }
        SettingsItemLoggingUtils.logSettingsItemTap(getEventLogger(), settingsItem);
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onSettingsActionAppeared(TypedSettingsItem settingsItem) {
        Intrinsics.checkNotNullParameter(settingsItem, "settingsItem");
        SettingsItemLoggingUtils.logSettingsItemAppearOnce(getLogOnceEventLogger(), settingsItem);
    }

    /* compiled from: AccountNavigationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountNavigationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/account/ui/AccountNavigationFragment;", "Lcom/robinhood/shared/account/contracts/AccountNavigationTabFragmentKey;", "<init>", "()V", "feature-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountNavigationFragment, AccountNavigationTabFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AccountNavigationTabFragmentKey accountNavigationTabFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, accountNavigationTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountNavigationTabFragmentKey getArgs(AccountNavigationFragment accountNavigationFragment) {
            return (AccountNavigationTabFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountNavigationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountNavigationFragment newInstance(AccountNavigationTabFragmentKey accountNavigationTabFragmentKey) {
            return (AccountNavigationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, accountNavigationTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountNavigationFragment accountNavigationFragment, AccountNavigationTabFragmentKey accountNavigationTabFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountNavigationFragment, accountNavigationTabFragmentKey);
        }
    }
}
