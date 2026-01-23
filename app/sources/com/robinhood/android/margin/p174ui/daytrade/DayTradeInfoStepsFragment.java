package com.robinhood.android.margin.p174ui.daytrade;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.chip.ChipGroup;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.margin.C20999R;
import com.robinhood.android.margin.databinding.FragmentDayTradeInfoStepBinding;
import com.robinhood.android.margin.model.UiDayTradeDisclosure;
import com.robinhood.android.margin.model.UiDayTradeInfo;
import com.robinhood.android.margin.model.UiDayTradeInfoStep;
import com.robinhood.android.margin.model.UiDayTradeInfoVariant;
import com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoStepsViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DayTradeInfoStepsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 P2\u00020\u0001:\u0003NOPB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u00020,2\u0006\u00100\u001a\u0002012\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00102\u001a\u00020,H\u0016J\u0018\u00103\u001a\u00020,2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0014J\u0010\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020=H\u0002J\u001a\u0010>\u001a\u00020,2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020*H\u0002J\b\u0010B\u001a\u00020*H\u0016J\u0018\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0002J\u0012\u0010H\u001a\u00020,2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0018\u0010K\u001a\u00020,2\u0006\u0010L\u001a\u00020(2\u0006\u0010M\u001a\u00020(H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b$\u0010%R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/margin/databinding/FragmentDayTradeInfoStepBinding;", "getBinding", "()Lcom/robinhood/android/margin/databinding/FragmentDayTradeInfoStepBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsDuxo;", "getDuxo", "()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment$Callbacks;", "callbacks$delegate", "lastBoundStep", "", "isSkipVisible", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onResume", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "bindStep", "step", "Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;", "bindDisclosure", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/android/margin/model/UiDayTradeDisclosure;", "useModal", "onBackPressed", "bindVariant", "variant", "Lcom/robinhood/android/margin/model/UiDayTradeInfoVariant;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "bindContinueButtonAction", "action", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction;", "bindProgress", "currentProgress", "maxProgress", "Callbacks", "Args", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DayTradeInfoStepsFragment extends BaseFragment {
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public ImageLoader imageLoader;
    private boolean isSkipVisible;
    private int lastBoundStep;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DayTradeInfoStepsFragment.class, "binding", "getBinding()Lcom/robinhood/android/margin/databinding/FragmentDayTradeInfoStepBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DayTradeInfoStepsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DayTradeInfoStepsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment$Callbacks;", "", "onCompleteSteps", "", "stage", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStage;", "onSkipPressed", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCompleteSteps(DayTradeInfoStage stage);

        void onSkipPressed(DayTradeInfoStage stage);
    }

    public DayTradeInfoStepsFragment() {
        super(C20999R.layout.fragment_day_trade_info_step);
        this.binding = ViewBinding5.viewBinding(this, DayTradeInfoStepsFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, DayTradeInfoStepsDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
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

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
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

    private final FragmentDayTradeInfoStepBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDayTradeInfoStepBinding) value;
    }

    private final DayTradeInfoStepsDuxo getDuxo() {
        return (DayTradeInfoStepsDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment.onViewCreated.1
            @Override // io.reactivex.functions.Function
            public final Tuples2<Integer, UiDayTradeInfoStep> apply(DayTradeInfoStepsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Tuples2<>(Integer.valueOf(it.getSelectedStep()), it.getCurrentStep());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsFragment.onViewCreated$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        ObservableSource map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment.onViewCreated.3
            @Override // io.reactivex.functions.Function
            public final Optional<UiDayTradeInfoVariant> apply(DayTradeInfoStepsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getCurrentVariant());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged2 = observables.combineLatest(map, requireBaseActivity().getDayNightStyleChanges()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsFragment.onViewCreated$lambda$3(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment.onViewCreated.5
            @Override // io.reactivex.functions.Function
            public final Optional<DayTradeInfoStepsViewState.ContinueButtonAction> apply(DayTradeInfoStepsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getContinueButtonAction());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsFragment.onViewCreated$lambda$4(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment.onViewCreated.7
            @Override // io.reactivex.functions.Function
            public final Tuples2<Integer, Integer> apply(DayTradeInfoStepsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Tuples2<>(Integer.valueOf(it.getProgressCurrent()), Integer.valueOf(it.getProgressMax()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsFragment.onViewCreated$lambda$5(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment.onViewCreated.9
            @Override // io.reactivex.functions.Function
            public final Tuples2<UiDayTradeDisclosure, Boolean> apply(DayTradeInfoStepsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiDayTradeInfoStep currentStep = it.getCurrentStep();
                return new Tuples2<>(currentStep != null ? currentStep.getDisclosure() : null, Boolean.valueOf(it.getShowDisclosureModal()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsFragment.onViewCreated$lambda$6(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged6 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment.onViewCreated.11
            @Override // io.reactivex.functions.Function
            public final Boolean apply(DayTradeInfoStepsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShowSkip());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsFragment.onViewCreated$lambda$7(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged7 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment.onViewCreated.13
            @Override // io.reactivex.functions.Function
            public final Boolean apply(DayTradeInfoStepsViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShowProgressBar());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged7), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsFragment.onViewCreated$lambda$8(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DayTradeInfoStepsFragment.onViewCreated$lambda$9(this.f$0, (DayTradeInfoStepsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, Tuples2 tuples2) {
        dayTradeInfoStepsFragment.lastBoundStep = ((Number) tuples2.getFirst()).intValue();
        UiDayTradeInfoStep uiDayTradeInfoStep = (UiDayTradeInfoStep) tuples2.getSecond();
        if (uiDayTradeInfoStep != null) {
            dayTradeInfoStepsFragment.bindStep(uiDayTradeInfoStep);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, Tuples2 tuples2) {
        Optional optional = (Optional) tuples2.component1();
        DayNightOverlay dayNightOverlay = (DayNightOverlay) tuples2.component2();
        UiDayTradeInfoVariant uiDayTradeInfoVariant = (UiDayTradeInfoVariant) optional.getOrNull();
        if (uiDayTradeInfoVariant != null) {
            dayTradeInfoStepsFragment.bindVariant(uiDayTradeInfoVariant, dayNightOverlay);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, Optional optional) {
        dayTradeInfoStepsFragment.bindContinueButtonAction((DayTradeInfoStepsViewState.ContinueButtonAction) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, Tuples2 tuples2) {
        dayTradeInfoStepsFragment.bindProgress(((Number) tuples2.getFirst()).intValue(), ((Number) tuples2.getSecond()).intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, Tuples2 tuples2) {
        dayTradeInfoStepsFragment.bindDisclosure((UiDayTradeDisclosure) tuples2.getFirst(), ((Boolean) tuples2.getSecond()).booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        dayTradeInfoStepsFragment.isSkipVisible = bool.booleanValue();
        dayTradeInfoStepsFragment.requireBaseActivity().invalidateOptionsMenu();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, Boolean bool) {
        RdsProgressBar dayTradeStepsProgressBar = dayTradeInfoStepsFragment.getBinding().dayTradeStepsProgressBar;
        Intrinsics.checkNotNullExpressionValue(dayTradeStepsProgressBar, "dayTradeStepsProgressBar");
        Intrinsics.checkNotNull(bool);
        dayTradeStepsProgressBar.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, DayTradeInfoStepsViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        UiEvent<Unit> pdtEnableChangeComplete = state.getPdtEnableChangeComplete();
        if ((pdtEnableChangeComplete != null ? pdtEnableChangeComplete.consume() : null) != null) {
            dayTradeInfoStepsFragment.getCallbacks().onCompleteSteps(((Args) INSTANCE.getArgs((Fragment) dayTradeInfoStepsFragment)).getStage());
        }
        UiEvent<Unit> pdtEnableChangeError = state.getPdtEnableChangeError();
        if ((pdtEnableChangeError != null ? pdtEnableChangeError.consume() : null) != null) {
            FragmentActivity fragmentActivityRequireActivity = dayTradeInfoStepsFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            String string2 = dayTradeInfoStepsFragment.getString(C20999R.string.margin_day_trade_v2_protection_change_failed);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Snackbars.showLarge(fragmentActivityRequireActivity, string2, 0);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireBaseActivity().invalidateOptionsMenu();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        if (this.isSkipVisible) {
            inflater.inflate(C20999R.menu.menu_education_step, menu);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C20999R.id.education_step_skip) {
            getCallbacks().onSkipPressed(((Args) INSTANCE.getArgs((Fragment) this)).getStage());
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private final void bindStep(UiDayTradeInfoStep step) {
        getAnalytics().buildScreenTransitionEvent(AnalyticsStrings.SCREEN_TRANSITION_EVENT_DISAPPEAR, "PDT_EDUCATION", step.getTitle()).send();
        getBinding().dayTradeInfoV2StepTitle.setText(step.getTitle());
        getBinding().dayTradeChipGroup.removeAllViews();
        if (step.getVariants().size() >= 2) {
            final int i = 0;
            getBinding().dayTradeChipContainer.setVisibility(0);
            for (Object obj : step.getVariants()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ChipGroup chipGroup = getBinding().dayTradeChipGroup;
                RdsChip.Companion companion = RdsChip.INSTANCE;
                ChipGroup dayTradeChipGroup = getBinding().dayTradeChipGroup;
                Intrinsics.checkNotNullExpressionValue(dayTradeChipGroup, "dayTradeChipGroup");
                final RdsChip rdsChipInflate = companion.inflate((ViewGroup) dayTradeChipGroup);
                rdsChipInflate.setTag(Integer.valueOf(i));
                rdsChipInflate.setText(((UiDayTradeInfoVariant) obj).getTitle());
                OnClickListeners.onClick(rdsChipInflate, new Function0() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DayTradeInfoStepsFragment.bindStep$lambda$13$lambda$12$lambda$11(rdsChipInflate, this, i);
                    }
                });
                if (i == 0) {
                    rdsChipInflate.setSelected(true);
                }
                chipGroup.addView(rdsChipInflate);
                i = i2;
            }
            return;
        }
        getBinding().dayTradeChipContainer.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep$lambda$13$lambda$12$lambda$11(RdsChip rdsChip, DayTradeInfoStepsFragment dayTradeInfoStepsFragment, int i) {
        if (!rdsChip.isSelected()) {
            ChipGroup dayTradeChipGroup = dayTradeInfoStepsFragment.getBinding().dayTradeChipGroup;
            Intrinsics.checkNotNullExpressionValue(dayTradeChipGroup, "dayTradeChipGroup");
            for (View view : ViewGroup2.getChildren(dayTradeChipGroup)) {
                view.setSelected(Intrinsics.areEqual(rdsChip, view));
            }
            dayTradeInfoStepsFragment.getDuxo().setSelectedVariant(i);
        }
        return Unit.INSTANCE;
    }

    private final void bindDisclosure(final UiDayTradeDisclosure disclosure, boolean useModal) {
        RhTextView dayTradeDisclosure = getBinding().dayTradeDisclosure;
        Intrinsics.checkNotNullExpressionValue(dayTradeDisclosure, "dayTradeDisclosure");
        dayTradeDisclosure.setVisibility(disclosure != null && !useModal ? 0 : 8);
        RdsButton dayTradeDisclosureButton = getBinding().dayTradeDisclosureButton;
        Intrinsics.checkNotNullExpressionValue(dayTradeDisclosureButton, "dayTradeDisclosureButton");
        dayTradeDisclosureButton.setVisibility(disclosure != null && useModal ? 0 : 8);
        if (disclosure != null) {
            if (useModal) {
                RdsButton rdsButton = getBinding().dayTradeDisclosureButton;
                rdsButton.setText(disclosure.getButtonText());
                Intrinsics.checkNotNull(rdsButton);
                OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DayTradeInfoStepsFragment.bindDisclosure$lambda$15$lambda$14(this.f$0, disclosure);
                    }
                });
                Intrinsics.checkNotNull(rdsButton);
                return;
            }
            getBinding().dayTradeDisclosure.setText(Markwons.toSpanned$default(getMarkwon(), disclosure.getDisclosureMarkdown(), null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDisclosure$lambda$15$lambda$14(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, UiDayTradeDisclosure uiDayTradeDisclosure) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = dayTradeInfoStepsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(uiDayTradeDisclosure.getButtonText()).setMessage(Markwons.toSpanned$default(dayTradeInfoStepsFragment.getMarkwon(), uiDayTradeDisclosure.getDisclosureMarkdown(), null, 2, null)).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
        FragmentManager childFragmentManager = dayTradeInfoStepsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "day-trade-disclosure-modal", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.lastBoundStep > 0) {
            getDuxo().setSelectedStep(this.lastBoundStep - 1);
            return true;
        }
        return super.onBackPressed();
    }

    private final void bindVariant(UiDayTradeInfoVariant variant, DayNightOverlay dayNightOverlay) {
        getBinding().dayTradeInfoV2VariantDescription.setText(Markwons.toSpanned$default(getMarkwon(), variant.getDescription(), null, 2, null));
        ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(variant.imageUrlForDayNightOverlay(dayNightOverlay));
        ImageView dayTradeInfoV2VariantImage = getBinding().dayTradeInfoV2VariantImage;
        Intrinsics.checkNotNullExpressionValue(dayTradeInfoV2VariantImage, "dayTradeInfoV2VariantImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, dayTradeInfoV2VariantImage, null, null, 6, null);
    }

    private final void bindContinueButtonAction(final DayTradeInfoStepsViewState.ContinueButtonAction action) {
        RdsButton rdsButton = getBinding().dayTradeContinue;
        if (action == null || Intrinsics.areEqual(action, DayTradeInfoStepsViewState.ContinueButtonAction.Complete.INSTANCE)) {
            rdsButton.setText(getString(C20999R.string.margin_day_trade_v2_exit_button));
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DayTradeInfoStepsFragment.bindContinueButtonAction$lambda$20$lambda$16(this.f$0);
                }
            });
            return;
        }
        if (action instanceof DayTradeInfoStepsViewState.ContinueButtonAction.Next) {
            rdsButton.setText(getString(C11048R.string.general_label_continue));
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DayTradeInfoStepsFragment.bindContinueButtonAction$lambda$20$lambda$17(this.f$0, action);
                }
            });
        } else if (Intrinsics.areEqual(action, DayTradeInfoStepsViewState.ContinueButtonAction.Confirm.INSTANCE)) {
            rdsButton.setText(getString(C20999R.string.margin_day_trade_v2_got_it));
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DayTradeInfoStepsFragment.bindContinueButtonAction$lambda$20$lambda$18(this.f$0);
                }
            });
        } else {
            if (!Intrinsics.areEqual(action, DayTradeInfoStepsViewState.ContinueButtonAction.EnablePdt.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            rdsButton.setText(getString(C20999R.string.margin_day_trade_v2_enable_protection));
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DayTradeInfoStepsFragment.bindContinueButtonAction$lambda$20$lambda$19(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindContinueButtonAction$lambda$20$lambda$16(DayTradeInfoStepsFragment dayTradeInfoStepsFragment) {
        dayTradeInfoStepsFragment.getCallbacks().onCompleteSteps(((Args) INSTANCE.getArgs((Fragment) dayTradeInfoStepsFragment)).getStage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindContinueButtonAction$lambda$20$lambda$17(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, DayTradeInfoStepsViewState.ContinueButtonAction continueButtonAction) {
        dayTradeInfoStepsFragment.getDuxo().setSelectedStep(((DayTradeInfoStepsViewState.ContinueButtonAction.Next) continueButtonAction).getNextPage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindContinueButtonAction$lambda$20$lambda$18(DayTradeInfoStepsFragment dayTradeInfoStepsFragment) {
        dayTradeInfoStepsFragment.getCallbacks().onCompleteSteps(((Args) INSTANCE.getArgs((Fragment) dayTradeInfoStepsFragment)).getStage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindContinueButtonAction$lambda$20$lambda$19(DayTradeInfoStepsFragment dayTradeInfoStepsFragment) {
        dayTradeInfoStepsFragment.getDuxo().setDayTradeProtectionEnabled(true);
        return Unit.INSTANCE;
    }

    private final void bindProgress(int currentProgress, int maxProgress) {
        RdsProgressBar rdsProgressBar = getBinding().dayTradeStepsProgressBar;
        rdsProgressBar.setProgress(currentProgress);
        rdsProgressBar.setMax(maxProgress);
    }

    /* compiled from: DayTradeInfoStepsFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment$Args;", "Landroid/os/Parcelable;", "dayTradeInfo", "Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "stage", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStage;", "accountNumber", "", "<init>", "(Lcom/robinhood/android/margin/model/UiDayTradeInfo;Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStage;Ljava/lang/String;)V", "getDayTradeInfo", "()Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "getStage", "()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStage;", "getAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UiDayTradeInfo dayTradeInfo;
        private final DayTradeInfoStage stage;

        /* compiled from: DayTradeInfoStepsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(UiDayTradeInfo.CREATOR.createFromParcel(parcel), DayTradeInfoStage.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.dayTradeInfo.writeToParcel(dest, flags);
            dest.writeString(this.stage.name());
            dest.writeString(this.accountNumber);
        }

        public Args(UiDayTradeInfo dayTradeInfo, DayTradeInfoStage stage, String str) {
            Intrinsics.checkNotNullParameter(dayTradeInfo, "dayTradeInfo");
            Intrinsics.checkNotNullParameter(stage, "stage");
            this.dayTradeInfo = dayTradeInfo;
            this.stage = stage;
            this.accountNumber = str;
        }

        public final UiDayTradeInfo getDayTradeInfo() {
            return this.dayTradeInfo;
        }

        public final DayTradeInfoStage getStage() {
            return this.stage;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: DayTradeInfoStepsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsFragment$Args;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DayTradeInfoStepsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DayTradeInfoStepsFragment dayTradeInfoStepsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dayTradeInfoStepsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DayTradeInfoStepsFragment newInstance(Args args) {
            return (DayTradeInfoStepsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DayTradeInfoStepsFragment dayTradeInfoStepsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dayTradeInfoStepsFragment, args);
        }
    }
}
