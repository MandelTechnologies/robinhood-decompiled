package com.robinhood.android.rhymigration.p245ui.intro;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.FragmentRhyContrastIntroBinding;
import com.robinhood.android.rhymigration.model.Bound;
import com.robinhood.android.rhymigration.model.UiRhyMigrationContrastPage;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.staticcontent.p403ui.NoUnderlineMarkwon;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RhyContrastIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0003RSTB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u000207H\u0016J\b\u0010=\u001a\u000207H\u0002J\b\u0010>\u001a\u000207H\u0002J*\u0010?\u001a\u0002072\u0006\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020B2\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010DH\u0002J\u0010\u0010E\u001a\u0002072\u0006\u0010F\u001a\u00020 H\u0002J\b\u0010G\u001a\u00020 H\u0002J\"\u0010C\u001a\u000207*\u00020H2\u0014\u0010I\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010K\u0012\u0004\u0012\u0002070JH\u0002J\t\u0010L\u001a\u00020 H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR+\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\f038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NX\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "binding", "Lcom/robinhood/android/rhymigration/databinding/FragmentRhyContrastIntroBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyContrastIntroBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment$Callbacks;", "callbacks$delegate", "pageCallbacks", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "getPageCallbacks", "()Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "pageCallbacks$delegate", "<set-?>", "", "hasSeparatePlayed", "getHasSeparatePlayed", "()Z", "setHasSeparatePlayed", "(Z)V", "hasSeparatePlayed$delegate", "Lkotlin/properties/ReadWriteProperty;", "page", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "getPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "page$delegate", "Lkotlin/Lazy;", "combinedToSeparateTransitionBound", "Lcom/robinhood/android/rhymigration/model/Bound;", "getCombinedToSeparateTransitionBound", "()Lcom/robinhood/android/rhymigration/model/Bound;", "animationAssetUrlObservable", "Lio/reactivex/Observable;", "getAnimationAssetUrlObservable", "()Lio/reactivex/Observable;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "playAnimation", "replayAnimation", "playAnimationBound", "bound", "repeatCount", "", "onAnimationEnd", "Lkotlin/Function0;", "updateReplayButtonVisibility", "isVisible", "shouldUseSmallAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "block", "Lkotlin/Function1;", "Landroid/animation/Animator;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyContrastIntroFragment extends BaseFragment implements RegionGated {
    public static final double ANIMATION_CUTOFF_SIZE_INCHES = 1.75d;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: hasSeparatePlayed$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasSeparatePlayed;

    @NoUnderlineMarkwon
    public Markwon markwon;

    /* renamed from: page$delegate, reason: from kotlin metadata */
    private final Lazy page;

    /* renamed from: pageCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 pageCallbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyContrastIntroFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyContrastIntroBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RhyContrastIntroFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RhyContrastIntroFragment.class, "pageCallbacks", "getPageCallbacks()Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhyContrastIntroFragment.class, "hasSeparatePlayed", "getHasSeparatePlayed()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyContrastIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment$Callbacks;", "", "onSeparatePlayed", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSeparatePlayed();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RhyContrastIntroFragment() {
        super(C27577R.layout.fragment_rhy_contrast_intro);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RhyContrastIntroFragment4.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.pageCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(PageDataCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof PageDataCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.hasSeparatePlayed = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[3]);
        this.page = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyContrastIntroFragment.page_delegate$lambda$0(this.f$0);
            }
        });
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreen().getName().name();
    }

    private final FragmentRhyContrastIntroBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyContrastIntroBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final PageDataCallbacks getPageCallbacks() {
        return (PageDataCallbacks) this.pageCallbacks.getValue(this, $$delegatedProperties[2]);
    }

    private final boolean getHasSeparatePlayed() {
        return ((Boolean) this.hasSeparatePlayed.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHasSeparatePlayed(boolean z) {
        this.hasSeparatePlayed.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiRhyMigrationContrastPage getPage() {
        return (UiRhyMigrationContrastPage) this.page.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiRhyMigrationContrastPage page_delegate$lambda$0(RhyContrastIntroFragment rhyContrastIntroFragment) {
        return rhyContrastIntroFragment.getPageCallbacks().getContrastPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bound getCombinedToSeparateTransitionBound() {
        return new Bound(getPage().getCombinedLoop().getStart(), getPage().getCombinedToSeparateTransition().getEnd());
    }

    private final Observable<String> getAnimationAssetUrlObservable() {
        Observables observables = Observables.INSTANCE;
        Observable<DayNightOverlay> dayNightStyleChanges = requireBaseActivity().getDayNightStyleChanges();
        LottieAnimationView rhyContrastIntroAnimation = getBinding().rhyContrastIntroAnimation;
        Intrinsics.checkNotNullExpressionValue(rhyContrastIntroAnimation, "rhyContrastIntroAnimation");
        ObservableSource map = RxView.layoutChanges(rhyContrastIntroAnimation).map(new Function() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$animationAssetUrlObservable$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(this.this$0.shouldUseSmallAnimation());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<String> observableDistinctUntilChanged = observables.combineLatest(dayNightStyleChanges, map).map(new Function() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$animationAssetUrlObservable$2

            /* compiled from: RhyContrastIntroFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$animationAssetUrlObservable$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DayNightOverlay.values().length];
                    try {
                        iArr[DayNightOverlay.DAY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final String apply(Tuples2<? extends DayNightOverlay, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                DayNightOverlay dayNightOverlayComponent1 = tuples2.component1();
                Boolean boolComponent2 = tuples2.component2();
                int i = WhenMappings.$EnumSwitchMapping$0[dayNightOverlayComponent1.ordinal()];
                if (i == 1) {
                    return boolComponent2.booleanValue() ? this.this$0.getPage().getAnimationAssetSmallDevice() : this.this$0.getPage().getAnimationAsset();
                }
                if (i == 2) {
                    return boolComponent2.booleanValue() ? this.this$0.getPage().getAnimationAssetSmallDeviceDark() : this.this$0.getPage().getAnimationAssetDark();
                }
                throw new NoWhenBranchMatchedException();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().rhyContrastIntroTitle.setText(getPage().getTitle());
        getBinding().rhyContrastIntroSubtitle.setText(Markwons.toSpanned$default(getMarkwon(), getPage().getSubtitle(), null, 2, null));
        RdsTextButton rhyContrastReplayBtn = getBinding().rhyContrastReplayBtn;
        Intrinsics.checkNotNullExpressionValue(rhyContrastReplayBtn, "rhyContrastReplayBtn");
        OnClickListeners.onClick(rhyContrastReplayBtn, new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyContrastIntroFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxView.layoutChanges(requireToolbar()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyContrastIntroFragment.onViewCreated$lambda$2(this.f$0, (Unit) obj);
            }
        });
        Observable<String> observableDistinctUntilChanged = getAnimationAssetUrlObservable().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyContrastIntroFragment.onViewCreated$lambda$3(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RhyContrastIntroFragment rhyContrastIntroFragment) {
        rhyContrastIntroFragment.replayAnimation();
        rhyContrastIntroFragment.updateReplayButtonVisibility(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(RhyContrastIntroFragment rhyContrastIntroFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhTextView rhyContrastIntroTitle = rhyContrastIntroFragment.getBinding().rhyContrastIntroTitle;
        Intrinsics.checkNotNullExpressionValue(rhyContrastIntroTitle, "rhyContrastIntroTitle");
        RhToolbar rhToolbar = rhyContrastIntroFragment.getRhToolbar();
        ViewsKt.setMarginTop(rhyContrastIntroTitle, rhToolbar != null ? rhToolbar.getBottom() : 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(RhyContrastIntroFragment rhyContrastIntroFragment, String str) {
        rhyContrastIntroFragment.getBinding().rhyContrastIntroAnimation.setAnimationFromUrl(str);
        rhyContrastIntroFragment.playAnimation();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        final LottieAnimationView lottieAnimationView = getBinding().rhyContrastIntroAnimation;
        lottieAnimationView.removeAllUpdateListeners();
        lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$onResume$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (lottieAnimationView.getFrame() <= this.getCombinedToSeparateTransitionBound().getEnd() || lottieAnimationView.getFrame() >= this.getPage().getSeparateLoop().getEnd()) {
                    if (lottieAnimationView.getFrame() == this.getPage().getSeparateLoop().getEnd()) {
                        this.updateReplayButtonVisibility(false);
                    }
                } else {
                    this.setHasSeparatePlayed(true);
                    this.getCallbacks().onSeparatePlayed();
                }
            }
        });
        if (getHasSeparatePlayed()) {
            return;
        }
        playAnimation();
    }

    private final void playAnimation() {
        playAnimationBound$default(this, getPage().getSeparateLoop(), -1, null, 4, null);
    }

    private final void replayAnimation() {
        playAnimationBound(getPage().getSeparateToCombinedTransition(), 0, new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyContrastIntroFragment.replayAnimation$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit replayAnimation$lambda$5(RhyContrastIntroFragment rhyContrastIntroFragment) {
        rhyContrastIntroFragment.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void playAnimationBound$default(RhyContrastIntroFragment rhyContrastIntroFragment, Bound bound, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        rhyContrastIntroFragment.playAnimationBound(bound, i, function0);
    }

    private final void playAnimationBound(Bound bound, int repeatCount, final Function0<Unit> onAnimationEnd) {
        LottieAnimationView lottieAnimationView = getBinding().rhyContrastIntroAnimation;
        lottieAnimationView.setMinAndMaxFrame(bound.getStart(), bound.getEnd());
        lottieAnimationView.setRepeatCount(repeatCount);
        lottieAnimationView.playAnimation();
        if (onAnimationEnd != null) {
            Intrinsics.checkNotNull(lottieAnimationView);
            onAnimationEnd(lottieAnimationView, new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyContrastIntroFragment.playAnimationBound$lambda$7$lambda$6(onAnimationEnd, (Animator) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playAnimationBound$lambda$7$lambda$6(Function0 function0, Animator animator) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReplayButtonVisibility(final boolean isVisible) {
        final RdsTextButton rdsTextButton = getBinding().rhyContrastReplayBtn;
        rdsTextButton.animate().alpha(isVisible ? 1.0f : 0.0f).setDuration(200L).withStartAction(new Runnable() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$updateReplayButtonVisibility$1$1
            @Override // java.lang.Runnable
            public final void run() {
                if (isVisible) {
                    RdsTextButton rdsTextButton2 = rdsTextButton;
                    Intrinsics.checkNotNull(rdsTextButton2);
                    rdsTextButton2.setVisibility(isVisible ? 0 : 8);
                }
            }
        }).withEndAction(new Runnable() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment$updateReplayButtonVisibility$1$2
            @Override // java.lang.Runnable
            public final void run() {
                if (isVisible) {
                    return;
                }
                RdsTextButton rdsTextButton2 = rdsTextButton;
                Intrinsics.checkNotNull(rdsTextButton2);
                rdsTextButton2.setVisibility(isVisible ? 0 : 8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldUseSmallAnimation() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return ((double) (((float) getBinding().rhyContrastIntroAnimation.getHeight()) / Activity.getDisplayMetrics(fragmentActivityRequireActivity).ydpi)) < 1.75d;
    }

    private final void onAnimationEnd(LottieAnimationView lottieAnimationView, final Function1<? super Animator, Unit> function1) {
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment.onAnimationEnd.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                function1.invoke(animation);
            }
        });
    }

    /* compiled from: RhyContrastIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment$Args;", "Landroid/os/Parcelable;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Screen screen;

        /* compiled from: RhyContrastIntroFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Screen) parcel.readSerializable());
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
            dest.writeSerializable(this.screen);
        }

        public Args(Screen screen) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.screen = screen;
        }

        public final Screen getScreen() {
            return this.screen;
        }
    }

    /* compiled from: RhyContrastIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment$Args;", "<init>", "()V", "ANIMATION_CUTOFF_SIZE_INCHES", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyContrastIntroFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhyContrastIntroFragment rhyContrastIntroFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyContrastIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyContrastIntroFragment newInstance(Args args) {
            return (RhyContrastIntroFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyContrastIntroFragment rhyContrastIntroFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyContrastIntroFragment, args);
        }
    }
}
