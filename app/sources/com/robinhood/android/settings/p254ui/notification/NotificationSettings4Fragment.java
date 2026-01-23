package com.robinhood.android.settings.p254ui.notification;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.NotificationSettings4Adapter;
import com.robinhood.android.settings.p254ui.notification.NotificationSettings4ViewState;
import com.robinhood.android.settings.util.extensions.Statuses;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.shared.settings.iibsettings.NotificationSettingsCallbacks;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
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

/* compiled from: NotificationSettings4Fragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J\u001a\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u000206H\u0016J\u0010\u0010C\u001a\u0002062\u0006\u0010D\u001a\u00020(H\u0016J\u0010\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020GH\u0016J \u0010H\u001a\u0002062\u0006\u0010I\u001a\u00020,2\u0006\u0010J\u001a\u00020,2\u0006\u0010K\u001a\u00020LH\u0016J \u0010M\u001a\u0002062\u0006\u0010N\u001a\u00020,2\u0006\u0010J\u001a\u00020,2\u0006\u0010O\u001a\u00020,H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\u0004\u0018\u00010(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001d\u0010+\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001c\u001a\u0004\b2\u00103R\u0014\u0010?\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010.R\u0016\u0010A\u001a\u0004\u0018\u00010,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010.¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Fragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Adapter$Callbacks;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "callbacks", "Lcom/robinhood/shared/settings/iibsettings/NotificationSettingsCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/settings/iibsettings/NotificationSettingsCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Duxo;", "getDuxo", "()Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Duxo;", "duxo$delegate", "Lkotlin/Lazy;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "adapter", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Adapter;", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "subPageReferenceArg", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "getSubPageReferenceArg", "()Lcom/robinhood/shared/settings/contracts/SubPageReference;", "settingsIdArg", "", "getSettingsIdArg", "()Ljava/lang/String;", "settingsIdArg$delegate", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "screenName", "getScreenName", "screenDescription", "getScreenDescription", "onSubPageClicked", "subPageReference", "onActionTriggered", "action", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "onSettingsToggled", "sectionId", "itemId", "status", "Lcom/robinhood/models/api/ApiNotificationSettingsToggleSettingsItem$Status;", "onSettingsSelected", "parentId", "value", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationSettings4Fragment extends BaseFragment implements NotificationSettings4Adapter.Callbacks {
    private final NotificationSettings4Adapter adapter;
    public AnalyticsLogger analytics;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;

    /* renamed from: settingsIdArg$delegate, reason: from kotlin metadata */
    private final Lazy settingsIdArg;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    public SurveyManager3 userLeapManager;
    private VisibleItemsManager<NotificationSettings4FragmentKey4, NotificationSettings4FragmentKey4> visibleItemsManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NotificationSettings4Fragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/settings/iibsettings/NotificationSettingsCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationSettings4Fragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationSettings4FragmentKey4 onViewCreated$lambda$5(NotificationSettings4FragmentKey4 VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return VisibleItemsManager;
    }

    public NotificationSettings4Fragment() {
        super(C28315R.layout.fragment_notification_settings_4);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(NotificationSettingsCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Fragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, NotificationSettings4Duxo.class);
        this.recyclerView = bindView(C28315R.id.recycler_view);
        this.adapter = new NotificationSettings4Adapter(this);
        this.settingsIdArg = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Fragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationSettings4Fragment.settingsIdArg_delegate$lambda$0(this.f$0);
            }
        });
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Fragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationSettings4Fragment.toolbarScrollAnimator_delegate$lambda$1(this.f$0);
            }
        });
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

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final NotificationSettingsCallbacks getCallbacks() {
        return (NotificationSettingsCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final NotificationSettings4Duxo getDuxo() {
        return (NotificationSettings4Duxo) this.duxo.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[1]);
    }

    private final NotificationSettings4FragmentKey3 getSubPageReferenceArg() {
        return ((NotificationSettings4FragmentKey) INSTANCE.getArgs((Fragment) this)).getSubPageReference();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSettingsIdArg() {
        return (String) this.settingsIdArg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String settingsIdArg_delegate$lambda$0(NotificationSettings4Fragment notificationSettings4Fragment) {
        NotificationSettings4FragmentKey3 subPageReferenceArg = notificationSettings4Fragment.getSubPageReferenceArg();
        if (subPageReferenceArg != null) {
            return subPageReferenceArg.getId();
        }
        return null;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$1(NotificationSettings4Fragment notificationSettings4Fragment) {
        RhToolbar rhToolbar = notificationSettings4Fragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, notificationSettings4Fragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 52, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ToolbarScrollAnimator.subscribe$default(getToolbarScrollAnimator(), getRecyclerView(), this, null, 4, null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getScarletContextWrapper());
        bindAdapter(getRecyclerView(), this.adapter);
        getRecyclerView().setItemAnimator(null);
        getRecyclerView().setLayoutManager(linearLayoutManager);
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(getRecyclerView()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Fragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Fragment.onViewCreated$lambda$3(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        if (getSettingsIdArg() != null) {
            VisibleItemsManager<NotificationSettings4FragmentKey4, NotificationSettings4FragmentKey4> visibleItemsManager = new VisibleItemsManager<>(linearLayoutManager, new Function0() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Fragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(NotificationSettings4Fragment.onViewCreated$lambda$4(this.f$0));
                }
            }, new C284023(this.adapter), new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Fragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NotificationSettings4Fragment.onViewCreated$lambda$5((NotificationSettings4FragmentKey4) obj);
                }
            });
            visibleItemsManager.setCallbacks(new VisibleItemsManager.Callbacks<NotificationSettings4FragmentKey4>() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Fragment$onViewCreated$5$1
                @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
                public void onItemDisappeared(NotificationSettings4FragmentKey4 item, long durationVisible) {
                    Intrinsics.checkNotNullParameter(item, "item");
                }

                @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
                public void onItemAppeared(NotificationSettings4FragmentKey4 item) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    if ((item instanceof NotificationSettings4FragmentKey4.Padding) || (item instanceof NotificationSettings4FragmentKey4.SectionTitle) || (item instanceof NotificationSettings4FragmentKey4.TitleSubtitle)) {
                        return;
                    }
                    if (item instanceof NotificationSettings4FragmentKey4.Toggle) {
                        AnalyticsLogger analytics = this.this$0.getAnalytics();
                        String settingsIdArg = this.this$0.getSettingsIdArg();
                        Intrinsics.checkNotNull(settingsIdArg);
                        NotificationSettings4FragmentKey4.Toggle toggle = (NotificationSettings4FragmentKey4.Toggle) item;
                        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analytics, AnalyticsStrings.BUTTON_GROUP_TOGGLE_SETTING, settingsIdArg, toggle.getSectionId(), null, toggle.getId(), null, Statuses.asAnalyticsTag(toggle.getStatus()), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
                        return;
                    }
                    if (item instanceof NotificationSettings4FragmentKey4.SubPageEntry) {
                        return;
                    }
                    if (item instanceof NotificationSettings4FragmentKey4.RadioGroup) {
                        NotificationSettings4FragmentKey4.RadioGroup radioGroup = (NotificationSettings4FragmentKey4.RadioGroup) item;
                        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.this$0.getAnalytics(), "multi_choice_setting", radioGroup.getParentId(), radioGroup.getId(), null, null, null, radioGroup.getSelectedValue(), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, null);
                    } else if (!(item instanceof NotificationSettings4FragmentKey4.SubtitleRichText)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            });
            this.visibleItemsManager = visibleItemsManager;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(NotificationSettings4Fragment notificationSettings4Fragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleItemsManager<NotificationSettings4FragmentKey4, NotificationSettings4FragmentKey4> visibleItemsManager = notificationSettings4Fragment.visibleItemsManager;
        if (visibleItemsManager != null) {
            visibleItemsManager.update();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: NotificationSettings4Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettings4Fragment$onViewCreated$3 */
    /* synthetic */ class C284023 extends FunctionReferenceImpl implements Function1<Integer, NotificationSettings4FragmentKey4> {
        C284023(Object obj) {
            super(1, obj, NotificationSettings4Adapter.class, "getItem", "getItem(I)Lcom/robinhood/shared/settings/contracts/ViewType;", 0);
        }

        public final NotificationSettings4FragmentKey4 invoke(int i) {
            return ((NotificationSettings4Adapter) this.receiver).getItem(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ NotificationSettings4FragmentKey4 invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$4(NotificationSettings4Fragment notificationSettings4Fragment) {
        return notificationSettings4Fragment.adapter.getSize();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getToolbarScrollAnimator().dispatchScroll(getRecyclerView());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.notification.NotificationSettings4Fragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettings4Fragment.onResume$lambda$7(this.f$0, (NotificationSettings4ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(NotificationSettings4Fragment notificationSettings4Fragment, NotificationSettings4ViewState viewState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        NotificationSettings4ViewState.PageContent pageContent = viewState.getPageContent();
        notificationSettings4Fragment.adapter.submitList(pageContent.getViewTypes());
        FragmentActivity fragmentActivityRequireActivity = notificationSettings4Fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhToolbar rhToolbar = Contexts7.requireBaseActivityBaseContext(fragmentActivityRequireActivity).getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setTitle(pageContent.getToolbarTitle());
        ErrorHandlers.handleErrorEvent(notificationSettings4Fragment.getActivityErrorHandler(), viewState.getNotificationSettingsError());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return NotificationSettings4ComposeDuxo2.notificationSettingsScreenName(((NotificationSettings4FragmentKey) INSTANCE.getArgs((Fragment) this)).getSubPageReference());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return getSettingsIdArg();
    }

    @Override // com.robinhood.android.settings.ui.notification.NotificationSettings4Adapter.Callbacks
    public void onSubPageClicked(NotificationSettings4FragmentKey3 subPageReference) {
        Intrinsics.checkNotNullParameter(subPageReference, "subPageReference");
        if (Intrinsics.areEqual(subPageReference.getId(), NotificationSettings4FragmentKey.SETTINGS_MUTED)) {
            NotificationSettingsCallbacks callbacks = getCallbacks();
            if (callbacks != null) {
                callbacks.onNotificationSettings4MutedClicked();
                return;
            }
            return;
        }
        NotificationSettingsCallbacks callbacks2 = getCallbacks();
        if (callbacks2 != null) {
            callbacks2.onNotificationSettings4SubPageClicked(subPageReference);
        }
    }

    @Override // com.robinhood.android.settings.ui.notification.NotificationSettings4Adapter.Callbacks
    public void onActionTriggered(ApiGenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        NotificationSettingsCallbacks callbacks = getCallbacks();
        if (callbacks != null) {
            callbacks.onNotificationSettings4ActionTriggered(action);
        }
    }

    @Override // com.robinhood.android.settings.ui.notification.NotificationSettings4Adapter.Callbacks
    public void onSettingsToggled(String sectionId, String itemId, ApiNotificationSettingsToggleSettingsItem.Status status) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(status, "status");
        AnalyticsLogger analytics = getAnalytics();
        String settingsIdArg = getSettingsIdArg();
        Intrinsics.checkNotNull(settingsIdArg);
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_TOGGLE_SETTING, settingsIdArg, sectionId, null, itemId, null, Statuses.asAnalyticsTag(status), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null);
        getDuxo().toggleItem(itemId, status);
        if ((Intrinsics.areEqual(itemId, NotificationSettings4ComposeDuxo.PUSH_HOLDINGS_ID_CRYPTO_PRICE_MOVEMENTS) || Intrinsics.areEqual(itemId, NotificationSettings4ComposeDuxo.PUSH_WATCHLIST_ID_CRYPTO_PRICE_MOVEMENTS)) && status == ApiNotificationSettingsToggleSettingsItem.Status.OFF) {
            getUserLeapManager().presentSurveyIfNecessary(this, Survey.CRYPTO_ALERT_CHURN_SETTING);
        }
    }

    @Override // com.robinhood.android.settings.ui.notification.NotificationSettings4Adapter.Callbacks
    public void onSettingsSelected(String parentId, String itemId, String value) {
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(value, "value");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), "multi_choice_setting", parentId, itemId, null, null, null, value, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, null);
        getDuxo().selectItem(itemId, CollectionsKt.listOf(value));
    }

    /* compiled from: NotificationSettings4Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Fragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4Fragment;", "Lcom/robinhood/shared/settings/contracts/NotificationSettings4FragmentKey;", "<init>", "()V", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<NotificationSettings4Fragment, NotificationSettings4FragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(NotificationSettings4FragmentKey notificationSettings4FragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, notificationSettings4FragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public NotificationSettings4FragmentKey getArgs(NotificationSettings4Fragment notificationSettings4Fragment) {
            return (NotificationSettings4FragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, notificationSettings4Fragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NotificationSettings4Fragment newInstance(NotificationSettings4FragmentKey notificationSettings4FragmentKey) {
            return (NotificationSettings4Fragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, notificationSettings4FragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NotificationSettings4Fragment notificationSettings4Fragment, NotificationSettings4FragmentKey notificationSettings4FragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, notificationSettings4Fragment, notificationSettings4FragmentKey);
        }
    }
}
