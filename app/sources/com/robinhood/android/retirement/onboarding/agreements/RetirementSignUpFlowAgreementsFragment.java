package com.robinhood.android.retirement.onboarding.agreements;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.onboarding.RetirementSignUpStep;
import com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSignedAgreements;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.AsyncResult;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: RetirementSignUpFlowAgreementsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003HIJB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\r\u0010=\u001a\u000208H\u0017¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u0002082\u0006\u0010@\u001a\u00020AH\u0016J\u0018\u0010B\u001a\u0002082\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u000fH\u0016J\u0010\u0010F\u001a\u0002082\u0006\u0010G\u001a\u00020'H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006K²\u0006\u0010\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment;", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStepComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementInteractions;", "<init>", "()V", "step", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "getStep", "()Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "steps", "", "getSteps", "()Ljava/util/List;", "hideProgressBar", "", "getHideProgressBar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "callbacks", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "currentScrollProgress", "", "stepProgress", "getStepProgress", "()F", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onAgreeClicked", "signedAgreements", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "onSlipToggled", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "enabled", "onDeepestScrollIncremented", "scrollProgress", "Callbacks", "Args", "Companion", "feature-retirement-onboarding_externalDebug", "state", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowAgreementsFragment extends RetirementSignUpStepComposeFragment implements AutoLoggableFragment, RetirementSignUpFlowAgreementScreen {
    private float currentScrollProgress;
    public EventLogger eventLogger;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RetirementSignUpFlowAgreementsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final RetirementSignUpStep step = RetirementSignUpStep.AGREEMENTS;
    private final Screen eventScreen = new Screen(Screen.Name.RETIREMENT_REVIEW_AGREEMENTS, null, null, null, 14, null);
    private final UserInteractionEventData screenEventData = new UserInteractionEventData(null, getEventScreen(), null, null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 109, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementSignUpFlowAgreementDuxo.class);

    /* compiled from: RetirementSignUpFlowAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment$Callbacks;", "", "onAgreementsSigned", "", "signedAgreements", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAgreementsSigned(RetirementSignUpFlowSignedAgreements signedAgreements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RetirementSignUpFlowAgreementsFragment retirementSignUpFlowAgreementsFragment, int i, Composer composer, int i2) {
        retirementSignUpFlowAgreementsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
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
    public final RetirementSignUpFlowAgreementDuxo getDuxo() {
        return (RetirementSignUpFlowAgreementDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment
    public float getStepProgress() {
        return Float.max(this.currentScrollProgress, 0.1f);
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getUserLeapManager().track(TrackingEvent.SAW_RET_AGREEMENTS_SCREEN);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-612946732);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-612946732, i2, -1, "com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment.ComposeContent (RetirementSignUpFlowAgreementsFragment.kt:73)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(331460703, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(331460703, i3, -1, "com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment.ComposeContent.<anonymous> (RetirementSignUpFlowAgreementsFragment.kt:77)");
                    }
                    final AsyncResult asyncResultComposeContent$lambda$0 = RetirementSignUpFlowAgreementsFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (asyncResultComposeContent$lambda$0 instanceof AsyncResult.Failure) {
                        composer2.startReplaceGroup(416079037);
                        RetirementSignUpFlowAgreementDuxo duxo = RetirementSignUpFlowAgreementsFragment.this.getDuxo();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(duxo);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RetirementSignUpFlowAgreementsFragment2(duxo);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        ErrorScreenComposable.ErrorScreenComposable(null, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                        composer2.endReplaceGroup();
                    } else if (asyncResultComposeContent$lambda$0 instanceof AsyncResult.Loading) {
                        composer2.startReplaceGroup(416223869);
                        LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(null, false, true, composer2, 384, 3);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(asyncResultComposeContent$lambda$0 instanceof AsyncResult.Success)) {
                            composer2.startReplaceGroup(706157020);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(416381473);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, RetirementSignUpFlowAgreementsFragment.this.getEventScreen(), null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 53, null);
                        final RetirementSignUpFlowAgreementsFragment retirementSignUpFlowAgreementsFragment = RetirementSignUpFlowAgreementsFragment.this;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(428377674, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment.ComposeContent.1.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(428377674, i4, -1, "com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment.ComposeContent.<anonymous>.<anonymous> (RetirementSignUpFlowAgreementsFragment.kt:93)");
                                }
                                RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen((RetirementAgreementsViewState) ((AsyncResult.Success) asyncResultComposeContent$lambda$0).getValue(), retirementSignUpFlowAgreementsFragment, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        composer2.endReplaceGroup();
                    }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowAgreementsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsyncResult<RetirementAgreementsViewState> ComposeContent$lambda$0(SnapshotState4<? extends AsyncResult<RetirementAgreementsViewState>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreen
    public void onAgreeClicked(RetirementSignUpFlowSignedAgreements signedAgreements) {
        Intrinsics.checkNotNullParameter(signedAgreements, "signedAgreements");
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.SUBMIT, getEventScreen(), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, RetirementAgreementsDataState3.toLoggingContext(signedAgreements.getSlipCheckboxStates()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1025, 16383, null), false, 44, null);
        getCallbacks().onAgreementsSigned(signedAgreements);
    }

    @Override // com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreen
    public void onSlipToggled(BrokerageAccountType accountType, boolean enabled) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        getDuxo().onSlipToggled(accountType, enabled);
    }

    @Override // com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreen
    public void onDeepestScrollIncremented(float scrollProgress) {
        this.currentScrollProgress = scrollProgress;
        configureToolbar(requireToolbar());
    }

    /* compiled from: RetirementSignUpFlowAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment$Args;", "Landroid/os/Parcelable;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "steps", "", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "hideProgressBar", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Z)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSteps", "()Ljava/util/List;", "getHideProgressBar", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType accountType;
        private final boolean hideProgressBar;
        private final List<RetirementSignUpStep> steps;

        /* compiled from: RetirementSignUpFlowAgreementsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BrokerageAccountType brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RetirementSignUpStep.valueOf(parcel.readString()));
                }
                return new Args(brokerageAccountTypeValueOf, arrayList, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, BrokerageAccountType brokerageAccountType, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = args.accountType;
            }
            if ((i & 2) != 0) {
                list = args.steps;
            }
            if ((i & 4) != 0) {
                z = args.hideProgressBar;
            }
            return args.copy(brokerageAccountType, list, z);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final List<RetirementSignUpStep> component2() {
            return this.steps;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHideProgressBar() {
            return this.hideProgressBar;
        }

        public final Args copy(BrokerageAccountType accountType, List<? extends RetirementSignUpStep> steps, boolean hideProgressBar) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(steps, "steps");
            return new Args(accountType, steps, hideProgressBar);
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
            return this.accountType == args.accountType && Intrinsics.areEqual(this.steps, args.steps) && this.hideProgressBar == args.hideProgressBar;
        }

        public int hashCode() {
            return (((this.accountType.hashCode() * 31) + this.steps.hashCode()) * 31) + Boolean.hashCode(this.hideProgressBar);
        }

        public String toString() {
            return "Args(accountType=" + this.accountType + ", steps=" + this.steps + ", hideProgressBar=" + this.hideProgressBar + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountType.name());
            List<RetirementSignUpStep> list = this.steps;
            dest.writeInt(list.size());
            Iterator<RetirementSignUpStep> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeInt(this.hideProgressBar ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(BrokerageAccountType accountType, List<? extends RetirementSignUpStep> steps, boolean z) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.accountType = accountType;
            this.steps = steps;
            this.hideProgressBar = z;
        }

        public /* synthetic */ Args(BrokerageAccountType brokerageAccountType, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(brokerageAccountType, list, (i & 4) != 0 ? false : z);
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final List<RetirementSignUpStep> getSteps() {
            return this.steps;
        }

        public final boolean getHideProgressBar() {
            return this.hideProgressBar;
        }
    }

    /* compiled from: RetirementSignUpFlowAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment$Args;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RetirementSignUpFlowAgreementsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RetirementSignUpFlowAgreementsFragment retirementSignUpFlowAgreementsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, retirementSignUpFlowAgreementsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementSignUpFlowAgreementsFragment newInstance(Args args) {
            return (RetirementSignUpFlowAgreementsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementSignUpFlowAgreementsFragment retirementSignUpFlowAgreementsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, retirementSignUpFlowAgreementsFragment, args);
        }
    }
}
