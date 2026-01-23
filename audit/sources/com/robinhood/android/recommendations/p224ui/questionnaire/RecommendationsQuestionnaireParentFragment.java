package com.robinhood.android.recommendations.p224ui.questionnaire;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnairePage;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnaireParentFragment;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnaireQuestionFragment;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnaireSectionCoverFragment;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnaireViewState;
import com.robinhood.android.recommendations.p224ui.questionnaire.landing.RecommendationsQuestionnaireLandingFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsQuestionnaireParentFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003=>?B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020#H\u0016J\b\u0010(\u001a\u00020\u001aH\u0016J\b\u0010)\u001a\u00020#H\u0016J\b\u0010*\u001a\u00020#H\u0016J\u0018\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u000201H\u0002J\u001a\u00102\u001a\u00020#2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0010\u00107\u001a\u00020#2\u0006\u00103\u001a\u000204H\u0002J\u0018\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020:2\u0006\u00103\u001a\u000204H\u0002J\u0018\u0010;\u001a\u00020#2\u0006\u00109\u001a\u00020<2\u0006\u00103\u001a\u000204H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireSectionCoverFragment$Callbacks;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "duxo", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireDuxo;", "getDuxo", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "returningFromRiskScreen", "getReturningFromRiskScreen", "()Z", "setReturningFromRiskScreen", "(Z)V", "returningFromRiskScreen$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "onBackPressed", "onStartQuestionnaire", "onContinuePressed", "onQuestionAnswered", "questionId", "Ljava/util/UUID;", "answerId", "setViewState", "viewState", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState;", "transitionPage", "transitionInfo", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;", "currentPage", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage;", "attemptToAnimateProgress", "launchSectionCoverPage", "page", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$SectionCoverPage;", "launchQuestionPage", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$QuestionPage;", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsQuestionnaireParentFragment extends BaseFragment implements RecommendationsQuestionnaireLandingFragment.Callbacks, RecommendationsQuestionnaireSectionCoverFragment.Callbacks, RecommendationsQuestionnaireQuestionFragment.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsQuestionnaireParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecommendationsQuestionnaireParentFragment.class, "returningFromRiskScreen", "getReturningFromRiskScreen()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: returningFromRiskScreen$delegate, reason: from kotlin metadata */
    private final Interfaces3 returningFromRiskScreen;
    public SurveyManager3 userLeapManager;

    /* compiled from: RecommendationsQuestionnaireParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u001a\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006\u0018\u00010\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment$Callbacks;", "", "startRiskProfileLandingFlow", "", "questionsAndAnswers", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "sharedElements", "Landroid/view/View;", "", "generateNewSubmissionId", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void generateNewSubmissionId();

        void startRiskProfileLandingFlow(List<Tuples2<UUID, UUID>> questionsAndAnswers, List<? extends Tuples2<? extends View, String>> sharedElements);
    }

    /* compiled from: RecommendationsQuestionnaireParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.values().length];
            try {
                iArr[RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.RETURN_FROM_NEXT_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.BACKWARDS_IN_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RecommendationsQuestionnaireParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.duxo = OldDuxos.oldDuxo(this, RecommendationsQuestionnaireDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RecommendationsQuestionnaireParentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.returningFromRiskScreen = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);
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

    private final RecommendationsQuestionnaireDuxo getDuxo() {
        return (RecommendationsQuestionnaireDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean getReturningFromRiskScreen() {
        return ((Boolean) this.returningFromRiskScreen.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setReturningFromRiskScreen(boolean z) {
        this.returningFromRiskScreen.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            RecommendationsQuestionnaireLandingFragment.Companion companion = RecommendationsQuestionnaireLandingFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new RecommendationsQuestionnaireLandingFragment.Args(((Args) companion2.getArgs((Fragment) this)).getSource(), ((Args) companion2.getArgs((Fragment) this)).getLoggingId())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C261231(this));
    }

    /* compiled from: RecommendationsQuestionnaireParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireParentFragment$onStart$1 */
    /* synthetic */ class C261231 extends FunctionReferenceImpl implements Function1<RecommendationsQuestionnaireViewState, Unit> {
        C261231(Object obj) {
            super(1, obj, RecommendationsQuestionnaireParentFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecommendationsQuestionnaireViewState recommendationsQuestionnaireViewState) throws Throwable {
            invoke2(recommendationsQuestionnaireViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecommendationsQuestionnaireViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsQuestionnaireParentFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getReturningFromRiskScreen()) {
            setReturningFromRiskScreen(false);
            getDuxo().returnToFlow();
            getCallbacks().generateNewSubmissionId();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().previousPage();
        return true;
    }

    @Override // com.robinhood.android.recommendations.ui.questionnaire.landing.RecommendationsQuestionnaireLandingFragment.Callbacks
    public void onStartQuestionnaire() {
        getDuxo().startIntroPage();
    }

    @Override // com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireSectionCoverFragment.Callbacks
    public void onContinuePressed() {
        RecommendationsQuestionnaireDuxo.nextPage$default(getDuxo(), null, 1, null);
    }

    @Override // com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireQuestionFragment.Callbacks
    public void onQuestionAnswered(UUID questionId, UUID answerId) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(answerId, "answerId");
        getDuxo().nextPage(Tuples4.m3642to(questionId, answerId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecommendationsQuestionnaireViewState viewState) throws Throwable {
        RecommendationsQuestionnaireViewState.TransitionInfo transitionInfoConsume;
        Throwable thConsume;
        UiEvent<Throwable> errorEvent = viewState.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, 0, null, 56, null);
        }
        UiEvent<Unit> onBackEvent = viewState.getOnBackEvent();
        if ((onBackEvent != null ? onBackEvent.consume() : null) != null) {
            popLastFragment();
            return;
        }
        UiEvent<Unit> onExitFlowEvent = viewState.getOnExitFlowEvent();
        if ((onExitFlowEvent != null ? onExitFlowEvent.consume() : null) != null) {
            getUserLeapManager().setPendingSurvey(Survey.RECOMMENDATIONS_EXIT_INTRO);
            requireActivity().finish();
        }
        UiEvent<Unit> onNextFlowEvent = viewState.getOnNextFlowEvent();
        if ((onNextFlowEvent != null ? onNextFlowEvent.consume() : null) != null) {
            setReturningFromRiskScreen(true);
            Fragment currentFragment = getCurrentFragment();
            RecommendationsQuestionnaireQuestionFragment recommendationsQuestionnaireQuestionFragment = currentFragment instanceof RecommendationsQuestionnaireQuestionFragment ? (RecommendationsQuestionnaireQuestionFragment) currentFragment : null;
            getCallbacks().startRiskProfileLandingFlow(MapsKt.toList(viewState.getAnsweredQuestions()), recommendationsQuestionnaireQuestionFragment != null ? recommendationsQuestionnaireQuestionFragment.getNextFlowSharedElements() : null);
            return;
        }
        UiEvent<RecommendationsQuestionnaireViewState.TransitionInfo> onTransitionEvent = viewState.getOnTransitionEvent();
        if (onTransitionEvent == null || (transitionInfoConsume = onTransitionEvent.consume()) == null) {
            return;
        }
        transitionPage(transitionInfoConsume, viewState.getCurrentPage());
    }

    private final void transitionPage(RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo, RecommendationsQuestionnairePage currentPage) {
        int i = WhenMappings.$EnumSwitchMapping$0[transitionInfo.getType().ordinal()];
        if (i == 1) {
            attemptToAnimateProgress(transitionInfo);
            return;
        }
        if (i == 2) {
            super.onBackPressed();
            attemptToAnimateProgress(transitionInfo);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (currentPage != null) {
                if (currentPage instanceof RecommendationsQuestionnairePage.SectionCoverPage) {
                    launchSectionCoverPage((RecommendationsQuestionnairePage.SectionCoverPage) currentPage, transitionInfo);
                } else {
                    if (!(currentPage instanceof RecommendationsQuestionnairePage.QuestionPage)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    launchQuestionPage((RecommendationsQuestionnairePage.QuestionPage) currentPage, transitionInfo);
                }
            }
        }
    }

    private final void attemptToAnimateProgress(RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo) {
        Fragment currentFragment = getCurrentFragment();
        RecommendationsQuestionnaireQuestionFragment recommendationsQuestionnaireQuestionFragment = currentFragment instanceof RecommendationsQuestionnaireQuestionFragment ? (RecommendationsQuestionnaireQuestionFragment) currentFragment : null;
        if (recommendationsQuestionnaireQuestionFragment != null) {
            recommendationsQuestionnaireQuestionFragment.animateProgress(transitionInfo);
        }
    }

    private final void launchSectionCoverPage(RecommendationsQuestionnairePage.SectionCoverPage page, RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo) {
        replaceFragment(RecommendationsQuestionnaireSectionCoverFragment.INSTANCE.newInstance((Parcelable) new RecommendationsQuestionnaireSectionCoverFragment.Args(page, transitionInfo)));
    }

    private final void launchQuestionPage(RecommendationsQuestionnairePage.QuestionPage page, RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo) {
        RecommendationsQuestionnaireQuestionFragment recommendationsQuestionnaireQuestionFragment = (RecommendationsQuestionnaireQuestionFragment) RecommendationsQuestionnaireQuestionFragment.INSTANCE.newInstance((Parcelable) new RecommendationsQuestionnaireQuestionFragment.Args(page, transitionInfo));
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            SimpleSlide simpleSlide = new SimpleSlide(8388611);
            simpleSlide.setInterpolator(Interpolators.INSTANCE.getFastOutSlowIn());
            currentFragment.setExitTransition(simpleSlide);
        }
        ReplaceFragmentBuilder replaceFragmentBuilder = new ReplaceFragmentBuilder(recommendationsQuestionnaireQuestionFragment);
        Fragment currentFragment2 = getCurrentFragment();
        final RecommendationsQuestionnaireQuestionFragment recommendationsQuestionnaireQuestionFragment2 = currentFragment2 instanceof RecommendationsQuestionnaireQuestionFragment ? (RecommendationsQuestionnaireQuestionFragment) currentFragment2 : null;
        if (recommendationsQuestionnaireQuestionFragment2 != null) {
            replaceFragmentBuilder.setModifier(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireParentFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendationsQuestionnaireParentFragment.launchQuestionPage$lambda$2(recommendationsQuestionnaireQuestionFragment2, (FragmentTransaction) obj);
                }
            });
        }
        replaceFragmentBuilder.buildAndExecute(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchQuestionPage$lambda$2(RecommendationsQuestionnaireQuestionFragment recommendationsQuestionnaireQuestionFragment, FragmentTransaction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        recommendationsQuestionnaireQuestionFragment.addSharedElement(it);
        it.setReorderingAllowed(true);
        return Unit.INSTANCE;
    }

    /* compiled from: RecommendationsQuestionnaireParentFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment$Args;", "Landroid/os/Parcelable;", "source", "", "loggingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getLoggingId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String loggingId;
        private final String source;

        /* compiled from: RecommendationsQuestionnaireParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                str2 = args.loggingId;
            }
            return args.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLoggingId() {
            return this.loggingId;
        }

        public final Args copy(String source, String loggingId) {
            return new Args(source, loggingId);
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
            return Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.loggingId, args.loggingId);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.loggingId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(source=" + this.source + ", loggingId=" + this.loggingId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.loggingId);
        }

        public Args(String str, String str2) {
            this.source = str;
            this.loggingId = str2;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getLoggingId() {
            return this.loggingId;
        }
    }

    /* compiled from: RecommendationsQuestionnaireParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireParentFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsQuestionnaireParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsQuestionnaireParentFragment recommendationsQuestionnaireParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsQuestionnaireParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsQuestionnaireParentFragment newInstance(Args args) {
            return (RecommendationsQuestionnaireParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsQuestionnaireParentFragment recommendationsQuestionnaireParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsQuestionnaireParentFragment, args);
        }
    }
}
