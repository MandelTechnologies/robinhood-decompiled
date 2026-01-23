package com.robinhood.android.retirement.onboarding.accountselection;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpAccountSelection;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.contracts.RetirementAccountComparison;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.onboarding.RetirementSignUpStep;
import com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment;
import com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionEvent;
import com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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

/* compiled from: RetirementSignUpFlowAccountSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003<=>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\r\u00102\u001a\u00020-H\u0017¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020-2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020-H\u0016J\b\u0010;\u001a\u00020-H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006?²\u0006\n\u0010@\u001a\u00020AX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment;", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStepComposeFragment;", "Lcom/robinhood/android/retirement/onboarding/accountselection/AccountSelectionCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "step", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "getStep", "()Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "steps", "", "getSteps", "()Ljava/util/List;", "hideProgressBar", "", "getHideProgressBar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "callbacks", "Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "consumeEvents", "event", "Lcom/robinhood/android/retirement/onboarding/accountselection/AccountSelectionEvent;", "onAccountSelected", "type", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAccountComparisonClicked", "onMaybeLaterPressed", "Callbacks", "Args", "Companion", "feature-retirement-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/retirement/onboarding/accountselection/AccountSelectionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowAccountSelectionFragment extends RetirementSignUpStepComposeFragment implements AccountSelectionCallbacks, AutoLoggableFragment {
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RetirementSignUpFlowAccountSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final RetirementSignUpStep step = RetirementSignUpStep.ACCOUNT_SELECTION;
    private final Screen eventScreen = new Screen(Screen.Name.RETIREMENT_ACCOUNT_SELECTION, null, null, null, 14, null);
    private final UserInteractionEventData screenEventData = new UserInteractionEventData(null, getEventScreen(), null, null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 109, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RetirementSignUpFlowAccountSelectionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementSignUpFlowAccountSelectionDuxo.class);

    /* compiled from: RetirementSignUpFlowAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment$Callbacks;", "", "onAccountTypeSelected", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "descriptionLoggingIdentifier", "", "steps", "", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountTypeSelected(BrokerageAccountType accountType, String descriptionLoggingIdentifier, List<? extends RetirementSignUpStep> steps);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RetirementSignUpFlowAccountSelectionFragment retirementSignUpFlowAccountSelectionFragment, int i, Composer composer, int i2) {
        retirementSignUpFlowAccountSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
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

    @Override // com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment
    public RetirementSignUpStep getStep() {
        return this.step;
    }

    @Override // com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment
    public List<RetirementSignUpStep> getSteps() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getSteps();
    }

    @Override // com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment
    public boolean getHideProgressBar() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getHideProgressBar();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return this.screenEventData;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetirementSignUpFlowAccountSelectionDuxo getDuxo() {
        return (RetirementSignUpFlowAccountSelectionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getUserLeapManager().track(TrackingEvent.SAW_RET_ACCOUNT_SELECTION_SCREEN);
        BaseFragment.collectDuxoState$default(this, null, new C270611(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C270622(null), 1, null);
    }

    /* compiled from: RetirementSignUpFlowAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment$onViewCreated$1", m3645f = "RetirementSignUpFlowAccountSelectionFragment.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment$onViewCreated$1 */
    static final class C270611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C270611(Continuation<? super C270611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementSignUpFlowAccountSelectionFragment.this.new C270611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C270611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AccountSelectionViewState> stateFlow = RetirementSignUpFlowAccountSelectionFragment.this.getDuxo().getStateFlow();
                final RetirementSignUpFlowAccountSelectionFragment retirementSignUpFlowAccountSelectionFragment = RetirementSignUpFlowAccountSelectionFragment.this;
                FlowCollector<? super AccountSelectionViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AccountSelectionViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AccountSelectionViewState accountSelectionViewState, Continuation<? super Unit> continuation) {
                        RhToolbar rhToolbar = retirementSignUpFlowAccountSelectionFragment.getRhToolbar();
                        if (rhToolbar != null) {
                            rhToolbar.setLoadingViewVisible(accountSelectionViewState.isLoading());
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

    /* compiled from: RetirementSignUpFlowAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment$onViewCreated$2", m3645f = "RetirementSignUpFlowAccountSelectionFragment.kt", m3646l = {80}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment$onViewCreated$2 */
    static final class C270622 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C270622(Continuation<? super C270622> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementSignUpFlowAccountSelectionFragment.this.new C270622(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C270622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AccountSelectionEvent>> eventFlow = RetirementSignUpFlowAccountSelectionFragment.this.getDuxo().getEventFlow();
                final RetirementSignUpFlowAccountSelectionFragment retirementSignUpFlowAccountSelectionFragment = RetirementSignUpFlowAccountSelectionFragment.this;
                FlowCollector<? super Event<AccountSelectionEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AccountSelectionEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<AccountSelectionEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AccountSelectionEvent> eventConsumerInvoke;
                        if (event != null) {
                            final RetirementSignUpFlowAccountSelectionFragment retirementSignUpFlowAccountSelectionFragment2 = retirementSignUpFlowAccountSelectionFragment;
                            if ((event.getData() instanceof AccountSelectionEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m18159invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m18159invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        retirementSignUpFlowAccountSelectionFragment2.consumeEvents((AccountSelectionEvent) event.getData());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSelectionViewState ComposeContent$lambda$0(SnapshotState4<AccountSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(56342718);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(56342718, i2, -1, "com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.ComposeContent (RetirementSignUpFlowAccountSelectionFragment.kt:86)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1487835017, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1487835017, i3, -1, "com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.ComposeContent.<anonymous> (RetirementSignUpFlowAccountSelectionFragment.kt:89)");
                    }
                    SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer2, 0, 1);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiControllerRememberSystemUiController, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), false, null, 6, null);
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                    final RetirementSignUpFlowAccountSelectionFragment retirementSignUpFlowAccountSelectionFragment = RetirementSignUpFlowAccountSelectionFragment.this;
                    final SnapshotState4<AccountSelectionViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    ScaffoldKt.m5625Scaffold27mzLpw(modifierNavigationBarsPadding, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(1662771783, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final PaddingValues paddingValues, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i5 & 6) == 0) {
                                i5 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1662771783, i5, -1, "com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.ComposeContent.<anonymous>.<anonymous> (RetirementSignUpFlowAccountSelectionFragment.kt:97)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, retirementSignUpFlowAccountSelectionFragment.getEventScreen(), null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 53, null);
                            final RetirementSignUpFlowAccountSelectionFragment retirementSignUpFlowAccountSelectionFragment2 = retirementSignUpFlowAccountSelectionFragment;
                            final SnapshotState4<AccountSelectionViewState> snapshotState42 = snapshotState4;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-63285262, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-63285262, i6, -1, "com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (RetirementSignUpFlowAccountSelectionFragment.kt:103)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                    Companion companion = RetirementSignUpFlowAccountSelectionFragment.INSTANCE;
                                    AccountSelectionKt.AccountSelectionScreen(modifierPadding, ((Args) companion.getArgs((Fragment) retirementSignUpFlowAccountSelectionFragment2)).getAccountSelection(), RetirementSignUpFlowAccountSelectionFragment.ComposeContent$lambda$0(snapshotState42).isLoading(), retirementSignUpFlowAccountSelectionFragment2, ((Args) companion.getArgs((Fragment) retirementSignUpFlowAccountSelectionFragment2)).getShowMaybeLaterButton(), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 0, 12582912, 32766);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowAccountSelectionFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeEvents(AccountSelectionEvent event) {
        if (event instanceof AccountSelectionEvent.AccountTypeSelected) {
            AccountSelectionEvent.AccountTypeSelected accountTypeSelected = (AccountSelectionEvent.AccountTypeSelected) event;
            getCallbacks().onAccountTypeSelected(accountTypeSelected.getSignUpFlow().getAccount_type(), accountTypeSelected.getSignUpFlow().getAccount_description_view_model().getLogging_identifier(), getSteps());
        } else {
            if (!(event instanceof AccountSelectionEvent.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((AccountSelectionEvent.Error) event).getThrowable(), false, 2, null);
        }
    }

    @Override // com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionCallbacks
    public void onAccountSelected(BrokerageAccountType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        getDuxo().onAccountTypeSelected(type2);
    }

    @Override // com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionCallbacks
    public void onAccountComparisonClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, RetirementAccountComparison.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
    }

    @Override // com.robinhood.android.retirement.onboarding.accountselection.AccountSelectionCallbacks
    public void onMaybeLaterPressed() {
        requireActivity().finish();
    }

    /* compiled from: RetirementSignUpFlowAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment$Args;", "Landroid/os/Parcelable;", "accountSelection", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpAccountSelection;", "steps", "", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "showMaybeLaterButton", "", "hideProgressBar", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpAccountSelection;Ljava/util/List;ZZ)V", "getAccountSelection", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpAccountSelection;", "getSteps", "()Ljava/util/List;", "getShowMaybeLaterButton", "()Z", "getHideProgressBar", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiRetirementSignUpAccountSelection accountSelection;
        private final boolean hideProgressBar;
        private final boolean showMaybeLaterButton;
        private final List<RetirementSignUpStep> steps;

        /* compiled from: RetirementSignUpFlowAccountSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ApiRetirementSignUpAccountSelection apiRetirementSignUpAccountSelection = (ApiRetirementSignUpAccountSelection) parcel.readParcelable(Args.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RetirementSignUpStep.valueOf(parcel.readString()));
                }
                return new Args(apiRetirementSignUpAccountSelection, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, ApiRetirementSignUpAccountSelection apiRetirementSignUpAccountSelection, List list, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                apiRetirementSignUpAccountSelection = args.accountSelection;
            }
            if ((i & 2) != 0) {
                list = args.steps;
            }
            if ((i & 4) != 0) {
                z = args.showMaybeLaterButton;
            }
            if ((i & 8) != 0) {
                z2 = args.hideProgressBar;
            }
            return args.copy(apiRetirementSignUpAccountSelection, list, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementSignUpAccountSelection getAccountSelection() {
            return this.accountSelection;
        }

        public final List<RetirementSignUpStep> component2() {
            return this.steps;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowMaybeLaterButton() {
            return this.showMaybeLaterButton;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHideProgressBar() {
            return this.hideProgressBar;
        }

        public final Args copy(ApiRetirementSignUpAccountSelection accountSelection, List<? extends RetirementSignUpStep> steps, boolean showMaybeLaterButton, boolean hideProgressBar) {
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            Intrinsics.checkNotNullParameter(steps, "steps");
            return new Args(accountSelection, steps, showMaybeLaterButton, hideProgressBar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountSelection, args.accountSelection) && Intrinsics.areEqual(this.steps, args.steps) && this.showMaybeLaterButton == args.showMaybeLaterButton && this.hideProgressBar == args.hideProgressBar;
        }

        public int hashCode() {
            return (((((this.accountSelection.hashCode() * 31) + this.steps.hashCode()) * 31) + Boolean.hashCode(this.showMaybeLaterButton)) * 31) + Boolean.hashCode(this.hideProgressBar);
        }

        public String toString() {
            return "Args(accountSelection=" + this.accountSelection + ", steps=" + this.steps + ", showMaybeLaterButton=" + this.showMaybeLaterButton + ", hideProgressBar=" + this.hideProgressBar + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.accountSelection, flags);
            List<RetirementSignUpStep> list = this.steps;
            dest.writeInt(list.size());
            Iterator<RetirementSignUpStep> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeInt(this.showMaybeLaterButton ? 1 : 0);
            dest.writeInt(this.hideProgressBar ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(ApiRetirementSignUpAccountSelection accountSelection, List<? extends RetirementSignUpStep> steps, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.accountSelection = accountSelection;
            this.steps = steps;
            this.showMaybeLaterButton = z;
            this.hideProgressBar = z2;
        }

        public /* synthetic */ Args(ApiRetirementSignUpAccountSelection apiRetirementSignUpAccountSelection, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(apiRetirementSignUpAccountSelection, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }

        public final ApiRetirementSignUpAccountSelection getAccountSelection() {
            return this.accountSelection;
        }

        public final List<RetirementSignUpStep> getSteps() {
            return this.steps;
        }

        public final boolean getShowMaybeLaterButton() {
            return this.showMaybeLaterButton;
        }

        public final boolean getHideProgressBar() {
            return this.hideProgressBar;
        }
    }

    /* compiled from: RetirementSignUpFlowAccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment;", "Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment$Args;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RetirementSignUpFlowAccountSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RetirementSignUpFlowAccountSelectionFragment retirementSignUpFlowAccountSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, retirementSignUpFlowAccountSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementSignUpFlowAccountSelectionFragment newInstance(Args args) {
            return (RetirementSignUpFlowAccountSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementSignUpFlowAccountSelectionFragment retirementSignUpFlowAccountSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, retirementSignUpFlowAccountSelectionFragment, args);
        }
    }
}
