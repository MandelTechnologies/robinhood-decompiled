package com.robinhood.android.retirement.p239ui.signup.swipeys;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.contracts.RetirementSignupFragmentKey;
import com.robinhood.android.retirement.p239ui.GenericRetirementTabFragment;
import com.robinhood.android.retirement.p239ui.signup.GenericRetirementTabFragments;
import com.robinhood.android.retirement.p239ui.signup.RetirementSignUpEvent;
import com.robinhood.android.retirement.p239ui.signup.swipeys.RetirementSignUpViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RetirementSignUpFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002>?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020*2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020*H\u0016J\b\u00104\u001a\u00020*H\u0016J\u001a\u00105\u001a\u00020*2\u0006\u00106\u001a\u0002072\b\u00101\u001a\u0004\u0018\u000102H\u0016J\r\u00108\u001a\u00020*H\u0017¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020*H\u0016J\b\u0010;\u001a\u00020*H\u0016J\u0010\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020/H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006@²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpFragment;", "Lcom/robinhood/android/retirement/ui/GenericRetirementTabFragment;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpScreenCallbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "duxo", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDialogDismissed", "id", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onCtaClicked", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "onSwipe", "newIndex", "Callbacks", "Companion", "feature-retirement-tab_externalDebug", "viewState", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementSignUpFragment extends GenericRetirementTabFragment implements RetirementSignUpScreenCallbacks {
    public CrossSellLaunchManager crossSellLaunchManager;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RetirementSignUpFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementSignUpDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: RetirementSignUpFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpFragment$Callbacks;", "", "onSignUpLoadError", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSignUpLoadError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RetirementSignUpFragment retirementSignUpFragment, int i, Composer composer, int i2) {
        retirementSignUpFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.RETIREMENT_ONBOARDING_SWIPEY, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.retirement.p239ui.GenericRetirementTabFragment, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 109, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetirementSignUpDuxo getDuxo() {
        return (RetirementSignUpDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            getCallbacks().onSignUpLoadError();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getUserLeapManager().track(TrackingEvent.SAW_RET_VALUE_PROPS);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getUserLeapManager().track(TrackingEvent.SAW_RET_VALUE_PROPS);
        CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, IacAlertSheetLocation.RETIREMENT_ONBOARDING, null, null, null, null, null, null, null, 508, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetStatusBarStyleOverride();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetirementSignUpViewState ComposeContent$lambda$0(SnapshotState4<? extends RetirementSignUpViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: RetirementSignUpFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment$onViewCreated$1", m3645f = "RetirementSignUpFragment.kt", m3646l = {88}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment$onViewCreated$1 */
    static final class C272751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C272751(Continuation<? super C272751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementSignUpFragment.this.new C272751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C272751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<RetirementSignUpEvent>> eventFlow = RetirementSignUpFragment.this.getDuxo().getEventFlow();
                final RetirementSignUpFragment retirementSignUpFragment = RetirementSignUpFragment.this;
                FlowCollector<? super Event<RetirementSignUpEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<RetirementSignUpEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<RetirementSignUpEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<RetirementSignUpEvent> eventConsumerInvoke;
                        if (event != null) {
                            final RetirementSignUpFragment retirementSignUpFragment2 = retirementSignUpFragment;
                            if ((event.getData() instanceof RetirementSignUpEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m18222invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m18222invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        GenericRetirementTabFragments.consumeSignUpEvent(retirementSignUpFragment2, (RetirementSignUpEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C272751(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C272762(null), 1, null);
    }

    /* compiled from: RetirementSignUpFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment$onViewCreated$2", m3645f = "RetirementSignUpFragment.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment$onViewCreated$2 */
    static final class C272762 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C272762(Continuation<? super C272762> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementSignUpFragment.this.new C272762(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C272762) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<RetirementSignUpViewState> stateFlow = RetirementSignUpFragment.this.getDuxo().getStateFlow();
                final RetirementSignUpFragment retirementSignUpFragment = RetirementSignUpFragment.this;
                FlowCollector<? super RetirementSignUpViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((RetirementSignUpViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(RetirementSignUpViewState retirementSignUpViewState, Continuation<? super Unit> continuation) {
                        String survey_tracking_event;
                        if ((retirementSignUpViewState instanceof RetirementSignUpViewState.Loaded) && (survey_tracking_event = ((RetirementSignUpViewState.Loaded) retirementSignUpViewState).getResponse().getSurvey_tracking_event()) != null) {
                            retirementSignUpFragment.getUserLeapManager().track(survey_tracking_event);
                        }
                        return Unit.INSTANCE;
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(486804024);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(486804024, i2, -1, "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment.ComposeContent (RetirementSignUpFragment.kt:105)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            ActionHandlingFragment2.ContentWithDialog(this, ComposableLambda3.rememberComposableLambda(-583459564, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-583459564, i3, -1, "com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment.ComposeContent.<anonymous> (RetirementSignUpFragment.kt:108)");
                    }
                    RetirementSignUpScreenKt.RetirementSignUpScreen(RetirementSignUpFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle), RetirementSignUpFragment.this, null, composer2, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.retirement.p239ui.signup.swipeys.RetirementSignUpScreenCallbacks
    public void onCtaClicked() {
        getDuxo().onCtaClick();
        getUserLeapManager().track(TrackingEvent.CLICK_RET_VALUE_PROPS_GET_STARTED);
        RetirementLastKnownEntryPointManager.INSTANCE.setLastKnownEntryPoint(RetirementLastKnownEntryPointManager.DASHBOARD_SWIPEY_CTA);
    }

    @Override // com.robinhood.android.retirement.p239ui.signup.swipeys.RetirementSignUpScreenCallbacks
    public void retry() {
        getDuxo().fetchSwipeys();
    }

    @Override // com.robinhood.android.retirement.p239ui.signup.swipeys.RetirementSignUpScreenCallbacks
    public void onSwipe(int newIndex) {
        getDuxo().onSwipe(newIndex);
    }

    /* compiled from: RetirementSignUpFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpFragment;", "Lcom/robinhood/android/retirement/contracts/RetirementSignupFragmentKey;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RetirementSignUpFragment, RetirementSignupFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RetirementSignupFragmentKey retirementSignupFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, retirementSignupFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RetirementSignupFragmentKey getArgs(RetirementSignUpFragment retirementSignUpFragment) {
            return (RetirementSignupFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, retirementSignUpFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementSignUpFragment newInstance(RetirementSignupFragmentKey retirementSignupFragmentKey) {
            return (RetirementSignUpFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, retirementSignupFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementSignUpFragment retirementSignUpFragment, RetirementSignupFragmentKey retirementSignupFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, retirementSignUpFragment, retirementSignupFragmentKey);
        }
    }
}
