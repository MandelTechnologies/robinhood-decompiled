package com.robinhood.android.onboarding.directipo.p203ui;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.AnalyticsTabOnPageChangeListener;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.onboarding.directipo.C22750R;
import com.robinhood.android.onboarding.directipo.databinding.FragmentDirectIpoOnboardingStepsBinding;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboarding;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboardingStep;
import com.robinhood.android.onboarding.directipo.p203ui.DirectIpoOnboardingStepView;
import com.robinhood.android.onboarding.directipo.p203ui.DirectIpoOnboardingStepsViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: DirectIpoOnboardingStepsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\"\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002>?B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0018\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020%H\u0016J\b\u00104\u001a\u000200H\u0016J\u0010\u00105\u001a\u00020%2\u0006\u00106\u001a\u000207H\u0002J\t\u00108\u001a\u000200H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Landroidx/core/view/MenuProvider;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "callbacks", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/onboarding/directipo/databinding/FragmentDirectIpoOnboardingStepsBinding;", "getBinding", "()Lcom/robinhood/android/onboarding/directipo/databinding/FragmentDirectIpoOnboardingStepsBinding;", "binding$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepView;", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingStep;", "pageChangeListener", "com/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsFragment$pageChangeListener$1", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsFragment$pageChangeListener$1;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onMenuItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onStart", "onBackPressed", "setViewState", "viewState", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DirectIpoOnboardingStepsFragment extends BaseFragment implements RegionGated, MenuProvider {
    private static final String TAG_LEARN_MORE = "directIpoLearnMore";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final GenericListAdapter<DirectIpoOnboardingStepView, UiDirectIpoOnboardingStep> adapter;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final DirectIpoOnboardingStepsFragment5 pageChangeListener;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOnboardingStepsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoOnboardingStepsFragment.class, "binding", "getBinding()Lcom/robinhood/android/onboarding/directipo/databinding/FragmentDirectIpoOnboardingStepsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoOnboardingStepsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsFragment$Callbacks;", "", "onViewAvailableIpos", "", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onViewAvailableIpos();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onPrepareMenu(Menu menu) {
        super.onPrepareMenu(menu);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$pageChangeListener$1] */
    public DirectIpoOnboardingStepsFragment() {
        super(C22750R.layout.fragment_direct_ipo_onboarding_steps);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, DirectIpoOnboardingStepsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DirectIpoOnboardingStepsFragment2.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        DirectIpoOnboardingStepView.Companion companion2 = DirectIpoOnboardingStepView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2986of(companion2, DiffCallbacks.Equality.INSTANCE);
        this.pageChangeListener = new ViewPager2.OnPageChangeCallback() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$pageChangeListener$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                this.this$0.getDuxo().setSelectedPage(position);
            }
        };
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DirectIpoOnboardingStepsDuxo getDuxo() {
        return (DirectIpoOnboardingStepsDuxo) this.duxo.getValue();
    }

    private final FragmentDirectIpoOnboardingStepsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoOnboardingStepsBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (Build.VERSION.SDK_INT >= 30) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        ViewPager2 viewPager2 = getBinding().directIpoOnboardingStepsViewPager;
        viewPager2.setAdapter(this.adapter);
        viewPager2.registerOnPageChangeCallback(this.pageChangeListener);
        final AnalyticsLogger analytics = getAnalytics();
        viewPager2.registerOnPageChangeCallback(new AnalyticsTabOnPageChangeListener(analytics) { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$onViewCreated$1$1
            @Override // com.robinhood.android.common.util.AnalyticsTabOnPageChangeListener
            protected String getTabName(int position) {
                return ((UiDirectIpoOnboarding) DirectIpoOnboardingStepsFragment.INSTANCE.getArgs((Fragment) this.this$0)).getSteps().get(position).getId();
            }
        });
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        if (fragmentActivityRequireActivity == null) {
            fragmentActivityRequireActivity = null;
        }
        if (fragmentActivityRequireActivity != null) {
            fragmentActivityRequireActivity.addMenuProvider(this, getViewLifecycleOwner(), Lifecycle.State.RESUMED);
        }
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(C22750R.menu.menu_direct_ipo_onboarding_steps, menu);
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != C22750R.id.direct_ipo_onboarding_learn_more) {
            return false;
        }
        DirectIpoOnboardingLearnMoreDialogFragment directIpoOnboardingLearnMoreDialogFragment = (DirectIpoOnboardingLearnMoreDialogFragment) DirectIpoOnboardingLearnMoreDialogFragment.INSTANCE.newInstance((Parcelable) ((UiDirectIpoOnboarding) INSTANCE.getArgs((Fragment) this)).getLearnMore());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        directIpoOnboardingLearnMoreDialogFragment.show(childFragmentManager, TAG_LEARN_MORE);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, RxView.layoutChanges(requireToolbar()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOnboardingStepsFragment.onStart$lambda$1(this.f$0, (Unit) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C227682(this));
        Observable<DirectIpoOnboardingStepsViewState> states = getDuxo().getStates();
        final C227693 c227693 = new PropertyReference1Impl() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment.onStart.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((DirectIpoOnboardingStepsViewState) obj).getCurrentProgress());
            }
        };
        Observable observableDistinctUntilChanged = states.map(new Function(c227693) { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c227693, "function");
                this.function = c227693;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOnboardingStepsFragment.onStart$lambda$2(this.f$0, (Integer) obj);
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((DirectIpoOnboardingStepsViewState) it).getContinueButtonAction());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((DirectIpoOnboardingStepsFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOnboardingStepsFragment.onStart$lambda$6(this.f$0, (DirectIpoOnboardingStepsViewState.ContinueButtonAction) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DirectIpoOnboardingStepsFragment directIpoOnboardingStepsFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RdsProgressBar directIpoOnboardingStepsProgressBar = directIpoOnboardingStepsFragment.getBinding().directIpoOnboardingStepsProgressBar;
        Intrinsics.checkNotNullExpressionValue(directIpoOnboardingStepsProgressBar, "directIpoOnboardingStepsProgressBar");
        RhToolbar rhToolbar = directIpoOnboardingStepsFragment.getRhToolbar();
        ViewsKt.setMarginTop(directIpoOnboardingStepsProgressBar, rhToolbar != null ? rhToolbar.getBottom() : 0);
        return Unit.INSTANCE;
    }

    /* compiled from: DirectIpoOnboardingStepsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$onStart$2 */
    /* synthetic */ class C227682 extends FunctionReferenceImpl implements Function1<DirectIpoOnboardingStepsViewState, Unit> {
        C227682(Object obj) {
            super(1, obj, DirectIpoOnboardingStepsFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectIpoOnboardingStepsViewState directIpoOnboardingStepsViewState) {
            invoke2(directIpoOnboardingStepsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectIpoOnboardingStepsViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoOnboardingStepsFragment) this.receiver).setViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(DirectIpoOnboardingStepsFragment directIpoOnboardingStepsFragment, Integer num) {
        RdsProgressBar rdsProgressBar = directIpoOnboardingStepsFragment.getBinding().directIpoOnboardingStepsProgressBar;
        Intrinsics.checkNotNull(num);
        rdsProgressBar.setProgress(num.intValue(), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(DirectIpoOnboardingStepsFragment directIpoOnboardingStepsFragment, final DirectIpoOnboardingStepsViewState.ContinueButtonAction continueButtonAction) {
        if (continueButtonAction instanceof DirectIpoOnboardingStepsViewState.ContinueButtonAction.Next) {
            final FragmentDirectIpoOnboardingStepsBinding binding = directIpoOnboardingStepsFragment.getBinding();
            binding.directIpoOnboardingStepsContinue.setText(directIpoOnboardingStepsFragment.getResources().getString(C11048R.string.general_label_next));
            RdsButton directIpoOnboardingStepsContinue = binding.directIpoOnboardingStepsContinue;
            Intrinsics.checkNotNullExpressionValue(directIpoOnboardingStepsContinue, "directIpoOnboardingStepsContinue");
            OnClickListeners.onClick(directIpoOnboardingStepsContinue, new Function0() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectIpoOnboardingStepsFragment.onStart$lambda$6$lambda$4$lambda$3(binding, continueButtonAction);
                }
            });
        } else {
            if (!(continueButtonAction instanceof DirectIpoOnboardingStepsViewState.ContinueButtonAction.Complete)) {
                throw new NoWhenBranchMatchedException();
            }
            FragmentDirectIpoOnboardingStepsBinding binding2 = directIpoOnboardingStepsFragment.getBinding();
            binding2.directIpoOnboardingStepsContinue.setText(((DirectIpoOnboardingStepsViewState.ContinueButtonAction.Complete) continueButtonAction).getButtonTitle());
            RdsButton directIpoOnboardingStepsContinue2 = binding2.directIpoOnboardingStepsContinue;
            Intrinsics.checkNotNullExpressionValue(directIpoOnboardingStepsContinue2, "directIpoOnboardingStepsContinue");
            OnClickListeners.onClick(directIpoOnboardingStepsContinue2, new DirectIpoOnboardingStepsFragment3(directIpoOnboardingStepsFragment.getCallbacks()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6$lambda$4$lambda$3(FragmentDirectIpoOnboardingStepsBinding fragmentDirectIpoOnboardingStepsBinding, DirectIpoOnboardingStepsViewState.ContinueButtonAction continueButtonAction) {
        fragmentDirectIpoOnboardingStepsBinding.directIpoOnboardingStepsViewPager.setCurrentItem(((DirectIpoOnboardingStepsViewState.ContinueButtonAction.Next) continueButtonAction).getNextPage(), true);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        int currentItem = getBinding().directIpoOnboardingStepsViewPager.getCurrentItem();
        if (currentItem > 0) {
            getBinding().directIpoOnboardingStepsViewPager.setCurrentItem(currentItem - 1, true);
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(DirectIpoOnboardingStepsViewState viewState) {
        getBinding().directIpoOnboardingStepsProgressBar.setMax(viewState.getMaxProgress());
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhToolbar.setTitle(viewState.getPageIndicatorText(resources));
        }
        this.adapter.submitList(viewState.getSteps());
    }

    /* compiled from: DirectIpoOnboardingStepsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsFragment;", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;", "<init>", "()V", "TAG_LEARN_MORE", "", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOnboardingStepsFragment, UiDirectIpoOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiDirectIpoOnboarding getArgs(DirectIpoOnboardingStepsFragment directIpoOnboardingStepsFragment) {
            return (UiDirectIpoOnboarding) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOnboardingStepsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOnboardingStepsFragment newInstance(UiDirectIpoOnboarding uiDirectIpoOnboarding) {
            return (DirectIpoOnboardingStepsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, uiDirectIpoOnboarding);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOnboardingStepsFragment directIpoOnboardingStepsFragment, UiDirectIpoOnboarding uiDirectIpoOnboarding) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOnboardingStepsFragment, uiDirectIpoOnboarding);
        }
    }
}
