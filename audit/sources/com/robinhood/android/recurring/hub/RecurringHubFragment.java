package com.robinhood.android.recurring.hub;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recurring.contracts.RecurringFragmentKeys;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowIntentKey;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.android.recurring.hub.RecurringHubViewState;
import com.robinhood.android.recurring.hub.databinding.FragmentRecurringHubBinding;
import com.robinhood.android.recurring.hub.p225ui.RecurringInvestmentsStatsView;
import com.robinhood.android.recurring.hub.p225ui.UiInvestmentSchedules;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks;
import com.robinhood.shared.recurring.contracts.RecurringHubFragmentKey;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: RecurringHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00103\u001a\u0002002\u0006\u00104\u001a\u000205H\u0016J\u001a\u00106\u001a\u0002002\u0006\u00107\u001a\u0002082\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00109\u001a\u000200H\u0016J\u0010\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u000200H\u0016J\u0018\u0010>\u001a\u0002002\u0006\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u000200H\u0016J\u0010\u0010C\u001a\u0002002\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u000200H\u0002J\u0010\u0010G\u001a\u0002002\u0006\u0010?\u001a\u00020*H\u0002J\b\u0010H\u001a\u000200H\u0002J\u0010\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020KH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020&X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/account/contracts/switcher/LocalAccountSwitcherCallbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/recurring/hub/databinding/FragmentRecurringHubBinding;", "getBinding", "()Lcom/robinhood/android/recurring/hub/databinding/FragmentRecurringHubBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "statsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/recurring/hub/ui/RecurringInvestmentsStatsView;", "Lcom/robinhood/android/recurring/hub/ui/UiInvestmentSchedules;", "scheduleAdapter", "Lcom/robinhood/android/recurring/hub/RecurringHubAdapter;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "duxo", "Lcom/robinhood/android/recurring/hub/RecurringHubDuxo;", "getDuxo", "()Lcom/robinhood/android/recurring/hub/RecurringHubDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "offsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "onDestroyView", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onAccountSelected", "accountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAllAccountsSelected", "bind", "state", "Lcom/robinhood/android/recurring/hub/RecurringHubViewState;", "showAccountSelection", "startInvestFlow", "logStartButtonTap", "showRecurringAccountSelectionBottomSheet", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Companion", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecurringHubFragment extends BaseFragment implements LocalAccountSwitcherCallbacks {
    private CompositeAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final AppBarLayout.OnOffsetChangedListener offsetChangedListener;
    private RecurringHubAdapter scheduleAdapter;
    private final GenericListAdapter<RecurringInvestmentsStatsView, UiInvestmentSchedules> statsAdapter;
    private final boolean useDesignSystemToolbar;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringHubFragment.class, "binding", "getBinding()Lcom/robinhood/android/recurring/hub/databinding/FragmentRecurringHubBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringHubViewState.State.values().length];
            try {
                iArr[RecurringHubViewState.State.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringHubViewState.State.NON_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringHubViewState.State.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringHubViewState.State.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        LocalAccountSwitcherCallbacks.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks, com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        LocalAccountSwitcherCallbacks.DefaultImpls.onRefreshAccountsClicked(this);
    }

    public RecurringHubFragment() {
        super(C26221R.layout.fragment_recurring_hub);
        this.binding = ViewBinding5.viewBinding(this, RecurringHubFragment3.INSTANCE);
        this.statsAdapter = GenericListAdapter.INSTANCE.m2986of(RecurringInvestmentsStatsView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubFragment.statsAdapter$lambda$0((UiInvestmentSchedules) obj);
            }
        }));
        this.duxo = OldDuxos.oldDuxo(this, RecurringHubDuxo.class);
        this.useDesignSystemToolbar = true;
        this.offsetChangedListener = new AppBarLayout.OnOffsetChangedListener() { // from class: com.robinhood.android.recurring.hub.RecurringHubFragment$offsetChangedListener$1
            @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                float fAbs = Math.abs(i) / appBarLayout.getTotalScrollRange();
                this.this$0.getBinding().investmentScheduleHistoryCollapsingTitle.setAlpha(1.0f - fAbs);
                RhToolbar rhToolbar = this.this$0.getRhToolbar();
                if (rhToolbar != null) {
                    rhToolbar.setTitleAlpha(fAbs);
                }
            }
        };
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
    public final FragmentRecurringHubBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringHubBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object statsAdapter$lambda$0(UiInvestmentSchedules byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getId();
    }

    private final RecurringHubDuxo getDuxo() {
        return (RecurringHubDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return Screen.Name.RECURRING_HUB.toString();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null) {
            scarletContextWrapper = requireActivity();
            Intrinsics.checkNotNullExpressionValue(scarletContextWrapper, "requireActivity(...)");
        }
        this.scheduleAdapter = new RecurringHubAdapter(scarletContextWrapper, getNavigator());
        GenericListAdapter<RecurringInvestmentsStatsView, UiInvestmentSchedules> genericListAdapter = this.statsAdapter;
        RecurringHubAdapter recurringHubAdapter = this.scheduleAdapter;
        if (recurringHubAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
            recurringHubAdapter = null;
        }
        this.adapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{genericListAdapter, recurringHubAdapter});
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
        FragmentRecurringHubBinding binding = getBinding();
        binding.investmentScheduleLoadingView.show();
        binding.investmentScheduleHistoryBarLayout.addOnOffsetChangedListener(this.offsetChangedListener);
        RecyclerView recyclerView = binding.investmentScheduleHistoryList;
        CompositeAdapter compositeAdapter = this.adapter;
        if (compositeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            compositeAdapter = null;
        }
        recyclerView.setAdapter(compositeAdapter);
        RdsButton investmentScheduleErrorBtn = binding.investmentScheduleErrorBtn;
        Intrinsics.checkNotNullExpressionValue(investmentScheduleErrorBtn, "investmentScheduleErrorBtn");
        OnClickListeners.onClick(investmentScheduleErrorBtn, new Function0() { // from class: com.robinhood.android.recurring.hub.RecurringHubFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringHubFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(RecurringHubFragment recurringHubFragment) {
        recurringHubFragment.getDuxo().update();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().investmentScheduleHistoryBarLayout.removeOnOffsetChangedListener(this.offsetChangedListener);
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitleAlpha(0.0f);
        toolbar.setTitle(getString(C26221R.string.investment_schedule_history_title));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RecurringHubAdapter recurringHubAdapter = this.scheduleAdapter;
        if (recurringHubAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
            recurringHubAdapter = null;
        }
        RecurringHubAdapter.submitCryptoList$default(recurringHubAdapter, CollectionsKt.emptyList(), false, 2, null);
        RecurringHubAdapter.submitStockAndEtfList$default(recurringHubAdapter, CollectionsKt.emptyList(), false, 2, null);
        Observable<RecurringHubViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C262342(this));
        getUserLeapManager().presentSurveyIfNecessary(this, Survey.RECURRING_INVESTMENTS_MANAGE);
    }

    /* compiled from: RecurringHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recurring.hub.RecurringHubFragment$onResume$2 */
    /* synthetic */ class C262342 extends FunctionReferenceImpl implements Function1<RecurringHubViewState, Unit> {
        C262342(Object obj) {
            super(1, obj, RecurringHubFragment.class, "bind", "bind(Lcom/robinhood/android/recurring/hub/RecurringHubViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringHubViewState recurringHubViewState) throws Resources.NotFoundException {
            invoke2(recurringHubViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringHubViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringHubFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().accountSelected(accountNumber);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        getDuxo().clearAccountSelection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final RecurringHubViewState state) throws Resources.NotFoundException {
        ScarletManager scarletManager;
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            scarletManager = getScarletManager();
        }
        final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
        FragmentRecurringHubBinding binding = getBinding();
        int i = WhenMappings.$EnumSwitchMapping$0[state.getState().ordinal()];
        RecurringHubAdapter recurringHubAdapter = null;
        if (i == 1) {
            LinearLayout investmentScheduleEmptyContentContainer = binding.investmentScheduleEmptyContentContainer;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleEmptyContentContainer, "investmentScheduleEmptyContentContainer");
            investmentScheduleEmptyContentContainer.setVisibility(0);
            CoordinatorLayout investmentScheduleHistoryListContainer = binding.investmentScheduleHistoryListContainer;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleHistoryListContainer, "investmentScheduleHistoryListContainer");
            investmentScheduleHistoryListContainer.setVisibility(8);
            RecurringHubAdapter recurringHubAdapter2 = this.scheduleAdapter;
            if (recurringHubAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
                recurringHubAdapter2 = null;
            }
            recurringHubAdapter2.setShowCrypto(state.isCryptoFeatureEnabled());
            RecurringHubAdapter recurringHubAdapter3 = this.scheduleAdapter;
            if (recurringHubAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
                recurringHubAdapter3 = null;
            }
            RecurringHubAdapter.submitCryptoList$default(recurringHubAdapter3, CollectionsKt.emptyList(), false, 2, null);
            RecurringHubAdapter recurringHubAdapter4 = this.scheduleAdapter;
            if (recurringHubAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
            } else {
                recurringHubAdapter = recurringHubAdapter4;
            }
            recurringHubAdapter.submitStockAndEtfList(CollectionsKt.emptyList(), state.isEtfEnabled());
            binding.investmentScheduleLoadingView.hide();
        } else if (i == 2) {
            LinearLayout investmentScheduleEmptyContentContainer2 = binding.investmentScheduleEmptyContentContainer;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleEmptyContentContainer2, "investmentScheduleEmptyContentContainer");
            investmentScheduleEmptyContentContainer2.setVisibility(8);
            CoordinatorLayout investmentScheduleHistoryListContainer2 = binding.investmentScheduleHistoryListContainer;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleHistoryListContainer2, "investmentScheduleHistoryListContainer");
            investmentScheduleHistoryListContainer2.setVisibility(0);
            this.statsAdapter.submitList(CollectionsKt.listOf(state.getUiInvestmentSchedules()));
            RecurringHubAdapter recurringHubAdapter5 = this.scheduleAdapter;
            if (recurringHubAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
                recurringHubAdapter5 = null;
            }
            recurringHubAdapter5.setShowCrypto(state.isCryptoFeatureEnabled());
            RecurringHubAdapter recurringHubAdapter6 = this.scheduleAdapter;
            if (recurringHubAdapter6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
                recurringHubAdapter6 = null;
            }
            RecurringHubAdapter.submitCryptoList$default(recurringHubAdapter6, state.getCryptoHistoryEvents(), false, 2, null);
            RecurringHubAdapter recurringHubAdapter7 = this.scheduleAdapter;
            if (recurringHubAdapter7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scheduleAdapter");
            } else {
                recurringHubAdapter = recurringHubAdapter7;
            }
            recurringHubAdapter.submitStockAndEtfList(state.getStocksAndEtfHistoryEvents(), state.isEtfEnabled());
            binding.investmentScheduleLoadingView.hide();
            binding.investmentScheduleHistoryList.scrollToPosition(0);
        } else if (i == 3) {
            LinearLayout investmentScheduleEmptyContentContainer3 = binding.investmentScheduleEmptyContentContainer;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleEmptyContentContainer3, "investmentScheduleEmptyContentContainer");
            investmentScheduleEmptyContentContainer3.setVisibility(8);
            LinearLayout investmentScheduleErrorContentContainer = binding.investmentScheduleErrorContentContainer;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleErrorContentContainer, "investmentScheduleErrorContentContainer");
            investmentScheduleErrorContentContainer.setVisibility(8);
            binding.investmentScheduleLoadingView.show();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            LinearLayout investmentScheduleEmptyContentContainer4 = binding.investmentScheduleEmptyContentContainer;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleEmptyContentContainer4, "investmentScheduleEmptyContentContainer");
            investmentScheduleEmptyContentContainer4.setVisibility(8);
            CoordinatorLayout investmentScheduleHistoryListContainer3 = binding.investmentScheduleHistoryListContainer;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleHistoryListContainer3, "investmentScheduleHistoryListContainer");
            investmentScheduleHistoryListContainer3.setVisibility(8);
            LinearLayout investmentScheduleErrorContentContainer2 = binding.investmentScheduleErrorContentContainer;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleErrorContentContainer2, "investmentScheduleErrorContentContainer");
            investmentScheduleErrorContentContainer2.setVisibility(0);
            binding.investmentScheduleLoadingView.hide();
        }
        ComposeView investmentScheduleAccountSelector = binding.investmentScheduleAccountSelector;
        Intrinsics.checkNotNullExpressionValue(investmentScheduleAccountSelector, "investmentScheduleAccountSelector");
        investmentScheduleAccountSelector.setVisibility(state.getShowAccountSelector() ? 0 : 8);
        if (state.getShowAccountSelector()) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            final String selectedAccountSelectionOption = state.getSelectedAccountSelectionOption(resources);
            binding.investmentScheduleAccountSelector.setContent(ComposableLambda3.composableLambdaInstance(587992889, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recurring.hub.RecurringHubFragment$bind$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i2) {
                    if ((i2 & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(587992889, i2, -1, "com.robinhood.android.recurring.hub.RecurringHubFragment.bind.<anonymous>.<anonymous> (RecurringHubFragment.kt:190)");
                    }
                    Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                    final RecurringHubFragment recurringHubFragment = this;
                    final RecurringHubViewState recurringHubViewState = state;
                    final String str = selectedAccountSelectionOption;
                    BentoTheme2.BentoTheme(observable, null, ComposableLambda3.rememberComposableLambda(-1779898901, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recurring.hub.RecurringHubFragment$bind$1$1.1

                        /* compiled from: RecurringHubFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.recurring.hub.RecurringHubFragment$bind$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ String $selectedAccountState;
                            final /* synthetic */ RecurringHubViewState $state;
                            final /* synthetic */ RecurringHubFragment this$0;

                            AnonymousClass1(RecurringHubFragment recurringHubFragment, RecurringHubViewState recurringHubViewState, String str) {
                                this.this$0 = recurringHubFragment;
                                this.$state = recurringHubViewState;
                                this.$selectedAccountState = str;
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
                                    ComposerKt.traceEventStart(-520784778, i, -1, "com.robinhood.android.recurring.hub.RecurringHubFragment.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringHubFragment.kt:192)");
                                }
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changed(this.$state);
                                final RecurringHubFragment recurringHubFragment = this.this$0;
                                final RecurringHubViewState recurringHubViewState = this.$state;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = 
                                          (r0v4 'recurringHubFragment' com.robinhood.android.recurring.hub.RecurringHubFragment A[DONT_INLINE])
                                          (r1v1 'recurringHubViewState' com.robinhood.android.recurring.hub.RecurringHubViewState A[DONT_INLINE])
                                         A[MD:(com.robinhood.android.recurring.hub.RecurringHubFragment, com.robinhood.android.recurring.hub.RecurringHubViewState):void (m)] (LINE:195) call: com.robinhood.android.recurring.hub.RecurringHubFragment$bind$1$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.recurring.hub.RecurringHubFragment, com.robinhood.android.recurring.hub.RecurringHubViewState):void type: CONSTRUCTOR in method: com.robinhood.android.recurring.hub.RecurringHubFragment.bind.1.1.1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes11.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.recurring.hub.RecurringHubFragment$bind$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 25 more
                                        */
                                    /*
                                        this = this;
                                        r0 = r13 & 3
                                        r1 = 2
                                        if (r0 != r1) goto L10
                                        boolean r0 = r12.getSkipping()
                                        if (r0 != 0) goto Lc
                                        goto L10
                                    Lc:
                                        r12.skipToGroupEnd()
                                        return
                                    L10:
                                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r0 == 0) goto L1f
                                        r0 = -1
                                        java.lang.String r1 = "com.robinhood.android.recurring.hub.RecurringHubFragment.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringHubFragment.kt:192)"
                                        r2 = -520784778(0xffffffffe0f57476, float:-1.4149513E20)
                                        androidx.compose.runtime.ComposerKt.traceEventStart(r2, r13, r0, r1)
                                    L1f:
                                        r13 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                        r12.startReplaceGroup(r13)
                                        com.robinhood.android.recurring.hub.RecurringHubFragment r13 = r11.this$0
                                        boolean r13 = r12.changedInstance(r13)
                                        com.robinhood.android.recurring.hub.RecurringHubViewState r0 = r11.$state
                                        boolean r0 = r12.changed(r0)
                                        r13 = r13 | r0
                                        com.robinhood.android.recurring.hub.RecurringHubFragment r0 = r11.this$0
                                        com.robinhood.android.recurring.hub.RecurringHubViewState r1 = r11.$state
                                        java.lang.Object r2 = r12.rememberedValue()
                                        if (r13 != 0) goto L44
                                        androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.INSTANCE
                                        java.lang.Object r13 = r13.getEmpty()
                                        if (r2 != r13) goto L4c
                                    L44:
                                        com.robinhood.android.recurring.hub.RecurringHubFragment$bind$1$1$1$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.android.recurring.hub.RecurringHubFragment$bind$1$1$1$1$$ExternalSyntheticLambda0
                                        r2.<init>(r0, r1)
                                        r12.updateRememberedValue(r2)
                                    L4c:
                                        r3 = r2
                                        kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                                        r12.endReplaceGroup()
                                        java.lang.String r7 = r11.$selectedAccountState
                                        r9 = 0
                                        r10 = 14
                                        r4 = 0
                                        r5 = 0
                                        r6 = 0
                                        r8 = r12
                                        com.robinhood.compose.bento.component.BentoChip.BentoDropdownChip(r3, r4, r5, r6, r7, r8, r9, r10)
                                        boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r12 == 0) goto L67
                                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                                    L67:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.recurring.hub.RecurringHubFragment2.C262331.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(RecurringHubFragment recurringHubFragment, RecurringHubViewState recurringHubViewState) {
                                    Resources resources = recurringHubFragment.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                    recurringHubFragment.showRecurringAccountSelectionBottomSheet(recurringHubViewState.getAccountSwitcherData(resources));
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3) {
                                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1779898901, i3, -1, "com.robinhood.android.recurring.hub.RecurringHubFragment.bind.<anonymous>.<anonymous>.<anonymous> (RecurringHubFragment.kt:191)");
                                }
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-520784778, true, new AnonymousClass1(recurringHubFragment, recurringHubViewState, str), composer2, 54), composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            RdsButton investmentScheduleStartInvestmentBtn = binding.investmentScheduleStartInvestmentBtn;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleStartInvestmentBtn, "investmentScheduleStartInvestmentBtn");
            investmentScheduleStartInvestmentBtn.setVisibility(state.getShowInvestFlowCta() ? 0 : 8);
            RdsButton investmentScheduleStartInvestmentBtn2 = binding.investmentScheduleStartInvestmentBtn;
            Intrinsics.checkNotNullExpressionValue(investmentScheduleStartInvestmentBtn2, "investmentScheduleStartInvestmentBtn");
            OnClickListeners.onClick(investmentScheduleStartInvestmentBtn2, new Function0() { // from class: com.robinhood.android.recurring.hub.RecurringHubFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringHubFragment.bind$lambda$7$lambda$6(this.f$0, state);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$7$lambda$6(RecurringHubFragment recurringHubFragment, RecurringHubViewState recurringHubViewState) {
            recurringHubFragment.logStartButtonTap();
            if (recurringHubViewState.getSelectedAccountNumber() != null) {
                recurringHubFragment.startInvestFlow(recurringHubViewState.getSelectedAccountNumber());
            } else {
                recurringHubFragment.showAccountSelection();
            }
            return Unit.INSTANCE;
        }

        private final void showAccountSelection() {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, RecurringFragmentKeys.INSTANCE, false, false, false, false, null, false, null, null, 1012, null);
        }

        private final void startInvestFlow(String accountNumber) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new InvestFlowIntentKey((InvestFlowStep) null, true, false, false, (List) null, accountNumber, (BigDecimal) null, (InvestFlowFrequency) null, false, (AllocationStrategy) null, (InvestFlowLoggingParams) null, 2013, (DefaultConstructorMarker) null), null, false, null, null, 60, null);
        }

        private final void logStartButtonTap() {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_RECURRING_FIND_INVESTMENT, new Screen(Screen.Name.RECURRING_HUB, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void showRecurringAccountSelectionBottomSheet(AccountSwitcherData accountSwitcherData) {
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(accountSwitcherData), null, 2, null).show(getChildFragmentManager(), "account-switcher");
        }

        /* compiled from: RecurringHubFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/recurring/hub/RecurringHubFragment;", "Lcom/robinhood/shared/recurring/contracts/RecurringHubFragmentKey;", "<init>", "()V", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements FragmentResolverWithArgsCompanion<RecurringHubFragment, RecurringHubFragmentKey> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
            public Fragment createFragment(RecurringHubFragmentKey recurringHubFragmentKey) {
                return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, recurringHubFragmentKey);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public RecurringHubFragmentKey getArgs(RecurringHubFragment recurringHubFragment) {
                return (RecurringHubFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, recurringHubFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
            public RecurringHubFragment newInstance(RecurringHubFragmentKey recurringHubFragmentKey) {
                return (RecurringHubFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, recurringHubFragmentKey);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
            public void setArgs(RecurringHubFragment recurringHubFragment, RecurringHubFragmentKey recurringHubFragmentKey) {
                FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, recurringHubFragment, recurringHubFragmentKey);
            }
        }
    }
