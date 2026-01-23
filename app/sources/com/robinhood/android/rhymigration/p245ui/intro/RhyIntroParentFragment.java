package com.robinhood.android.rhymigration.p245ui.intro;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.jakewharton.rxbinding3.viewpager2.RxViewPager2;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.FragmentRhyIntroParentBinding;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.android.rhymigration.p245ui.intro.RhyContrastIntroFragment;
import com.robinhood.android.rhymigration.p245ui.intro.RhyIntroParentFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RhyIntroParentFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u000234B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020&H\u0016J\b\u0010+\u001a\u00020\"H\u0002J\b\u0010,\u001a\u00020\"H\u0002J\t\u0010-\u001a\u00020\u0016H\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyContrastIntroFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/rhymigration/databinding/FragmentRhyIntroParentBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyIntroParentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroParentFragment$Callbacks;", "callbacks$delegate", "tilesAdapter", "Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroTilesFragmentAdapter;", "onSeparatePlayedFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onSeparatePlayed", "onSaveInstanceState", "outState", "configViewPager", "logViewPagerSelected", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyIntroParentFragment extends BaseFragment implements RegionGated, RhyContrastIntroFragment.Callbacks, AutoLoggableFragment {
    private static final String EXTRA_SEPARATE_IS_EVER_DISPLAYED = "newWayIsEverDisplayed";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    private final StateFlow2<Boolean> onSeparatePlayedFlow;
    private RhyIntroTilesFragmentAdapter tilesAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyIntroParentFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyIntroParentBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RhyIntroParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroParentFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyIntroParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroParentFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "onReviewChangesClicked", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends PageDataCallbacks {
        void onReviewChangesClicked();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public RhyIntroParentFragment() {
        super(C27577R.layout.fragment_rhy_intro_parent);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RhyIntroParentFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RhyIntroParentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.onSeparatePlayedFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentRhyIntroParentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyIntroParentBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name screenName = INSTANCE.getScreenName(getBinding().rhyIntroViewPager.getCurrentItem());
        if (screenName == null) {
            screenName = Screen.Name.RHY_MIGRATION_FEATURE_REWARDS;
        }
        return new Screen(screenName, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null) {
            new MutablePropertyReference0Impl(this.onSeparatePlayedFlow) { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment.onViewCreated.2
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((StateFlow2) this.receiver).getValue();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((StateFlow2) this.receiver).setValue(obj);
                }
            }.set(Boolean.valueOf(savedInstanceState.getBoolean(EXTRA_SEPARATE_IS_EVER_DISPLAYED)));
        }
        configViewPager();
        ImageView rhyIntroDownBtn = getBinding().rhyIntroDownBtn;
        Intrinsics.checkNotNullExpressionValue(rhyIntroDownBtn, "rhyIntroDownBtn");
        OnClickListeners.onClick(rhyIntroDownBtn, new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyIntroParentFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        getBinding().rhyIntroReviewChangesBtn.setText(getCallbacks().getContrastPage().getPrimaryCtaText());
        RdsButton rdsButton = getBinding().rhyIntroReviewChangesBtn;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyIntroParentFragment.onViewCreated$lambda$4$lambda$2(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyIntroParentFragment.onViewCreated$lambda$4$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RhyIntroParentFragment rhyIntroParentFragment) {
        ViewPager2 viewPager2 = rhyIntroParentFragment.getBinding().rhyIntroViewPager;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$4$lambda$2(RhyIntroParentFragment rhyIntroParentFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, RhyOnboardingLoggingUtils.getEventContext$default(rhyIntroParentFragment, (AgreementContext) null, (String) null, 3, (Object) null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(RhyIntroParentFragment rhyIntroParentFragment) {
        rhyIntroParentFragment.getCallbacks().onReviewChangesClicked();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ViewPager2 rhyIntroViewPager = getBinding().rhyIntroViewPager;
        Intrinsics.checkNotNullExpressionValue(rhyIntroViewPager, "rhyIntroViewPager");
        Observable<Integer> observableRefCount = RxViewPager2.pageSelections(rhyIntroViewPager).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable<Integer> observableDistinctUntilChanged = observableRefCount.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyIntroParentFragment.onStart$lambda$5(this.f$0, (Integer) obj);
            }
        });
        getLifecycleScope().launchWhenStarted(new C276242(observableRefCount, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RhyIntroParentFragment rhyIntroParentFragment, Integer num) {
        rhyIntroParentFragment.logViewPagerSelected();
        return Unit.INSTANCE;
    }

    /* compiled from: RhyIntroParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$onStart$2", m3645f = "RhyIntroParentFragment.kt", m3646l = {112}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$onStart$2 */
    static final class C276242 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<Integer> $pageSelections;
        int label;
        final /* synthetic */ RhyIntroParentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C276242(Observable<Integer> observable, RhyIntroParentFragment rhyIntroParentFragment, Continuation<? super C276242> continuation) {
            super(2, continuation);
            this.$pageSelections = observable;
            this.this$0 = rhyIntroParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C276242(this.$pageSelections, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C276242) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flowCombine(Context7.buffer$default(RxConvert.asFlow(this.$pageSelections), Integer.MAX_VALUE, null, 2, null), this.this$0.onSeparatePlayedFlow, new AnonymousClass1(this.this$0, null)));
                final RhyIntroParentFragment rhyIntroParentFragment = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment.onStart.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        rhyIntroParentFragment.getBinding().getRoot().transitionToState(i2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: RhyIntroParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "selectedPage", "kotlin.jvm.PlatformType", "newWayIsEverDisplayedValue", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$onStart$2$1", m3645f = "RhyIntroParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Integer, Boolean, Continuation<? super Integer>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ RhyIntroParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RhyIntroParentFragment rhyIntroParentFragment, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = rhyIntroParentFragment;
            }

            public final Object invoke(Integer num, boolean z, Continuation<? super Integer> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = num;
                anonymousClass1.Z$0 = z;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Boolean bool, Continuation<? super Integer> continuation) {
                return invoke(num, bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                int i;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Integer num = (Integer) this.L$0;
                    boolean z = this.Z$0;
                    RhyIntroTilesFragmentAdapter rhyIntroTilesFragmentAdapter = this.this$0.tilesAdapter;
                    if (rhyIntroTilesFragmentAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tilesAdapter");
                        rhyIntroTilesFragmentAdapter = null;
                    }
                    boolean z2 = num != null && num.intValue() == rhyIntroTilesFragmentAdapter.getSize() - 1;
                    if (z2 && !z) {
                        i = C27577R.id.rhy_hide_btn_state;
                    } else if (z2) {
                        i = C27577R.id.rhy_show_open_btn_state;
                    } else {
                        i = C27577R.id.rhy_show_down_arrow_state;
                    }
                    return boxing.boxInt(i);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.rhymigration.ui.intro.RhyContrastIntroFragment.Callbacks
    public void onSeparatePlayed() {
        this.onSeparatePlayedFlow.setValue(Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(EXTRA_SEPARATE_IS_EVER_DISPLAYED, this.onSeparatePlayedFlow.getValue().booleanValue());
    }

    private final void configViewPager() {
        ViewPager2 viewPager2 = getBinding().rhyIntroViewPager;
        this.tilesAdapter = new RhyIntroTilesFragmentAdapter(this);
        Intrinsics.checkNotNull(viewPager2);
        RhyIntroTilesFragmentAdapter rhyIntroTilesFragmentAdapter = this.tilesAdapter;
        if (rhyIntroTilesFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tilesAdapter");
            rhyIntroTilesFragmentAdapter = null;
        }
        bindAdapter(viewPager2, rhyIntroTilesFragmentAdapter);
        viewPager2.setOffscreenPageLimit(1);
    }

    private final void logViewPagerSelected() {
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), 13, null);
    }

    /* compiled from: RhyIntroParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroParentFragment$Companion;", "", "<init>", "()V", "EXTRA_SEPARATE_IS_EVER_DISPLAYED", "", "newInstance", "Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroParentFragment;", "getScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "pageIdx", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RhyIntroParentFragment newInstance() {
            return new RhyIntroParentFragment();
        }

        public final Screen.Name getScreenName(int pageIdx) {
            if (pageIdx == 0) {
                return Screen.Name.RHY_MIGRATION_FEATURE_REWARDS;
            }
            if (pageIdx == 1) {
                return Screen.Name.RHY_MIGRATION_FEATURE_DIRECT_DEPOSIT;
            }
            if (pageIdx != 2) {
                return null;
            }
            return Screen.Name.RHY_MIGRATION_CONTRAST_MULTIPLE_ACCOUNTS;
        }
    }
}
