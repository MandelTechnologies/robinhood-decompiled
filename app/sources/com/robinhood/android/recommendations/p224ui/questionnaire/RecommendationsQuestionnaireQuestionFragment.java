package com.robinhood.android.recommendations.p224ui.questionnaire;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.transition.TransitionSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsQuestionnaireQuestionBinding;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnairePage;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnaireViewState;
import com.robinhood.android.recommendations.p224ui.utils.Constants;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsQuestionnaireQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u0003456B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0019H\u0002J\u000e\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,J\u0018\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002000/0.J\u000e\u00101\u001a\u00020#2\u0006\u00102\u001a\u000203R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireQuestionBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Answer;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAnswerSelection", "answer", "addSharedElement", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "getNextFlowSharedElements", "", "Lkotlin/Pair;", "", "animateProgress", "transitionInfo", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsQuestionnaireQuestionFragment extends BaseFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsQuestionnaireQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireQuestionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsQuestionnaireQuestionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float LOTTIE_ANIMATION_SPEED = 2.0f;
    private final GenericListAdapter<RdsRowView, UiRecommendationsQuestionnaire.Answer> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean excludeFromAutoScreenDisappearEventLogging;
    public Markwon markwon;

    /* compiled from: RecommendationsQuestionnaireQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment$Callbacks;", "", "onQuestionAnswered", "", "questionId", "Ljava/util/UUID;", "answerId", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onQuestionAnswered(UUID questionId, UUID answerId);
    }

    /* compiled from: RecommendationsQuestionnaireQuestionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.values().length];
            try {
                iArr[RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
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

    public RecommendationsQuestionnaireQuestionFragment() {
        super(C25978R.layout.fragment_recommendations_questionnaire_question);
        this.binding = ViewBinding5.viewBinding(this, RecommendationsQuestionnaireQuestionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireQuestionFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireQuestionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsQuestionnaireQuestionFragment.adapter$lambda$2(this.f$0, (RdsRowView) obj, (UiRecommendationsQuestionnaire.Answer) obj2);
            }
        });
        this.excludeFromAutoScreenDisappearEventLogging = true;
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

    private final FragmentRecommendationsQuestionnaireQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsQuestionnaireQuestionBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final RecommendationsQuestionnaireQuestionFragment recommendationsQuestionnaireQuestionFragment, RdsRowView of, final UiRecommendationsQuestionnaire.Answer answer) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(answer, "answer");
        of.setTrailingIconDrawable(ViewsKt.getDrawable(of, C20690R.drawable.ic_rds_caret_right_16dp));
        ScarletManager2.overrideAttribute(of, C13997R.attr.trailingIconTint, ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3());
        of.setPrimaryText(answer.getTitle());
        of.setSecondaryText(answer.getSubtitle());
        com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireQuestionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsQuestionnaireQuestionFragment.adapter$lambda$2$lambda$0(answer);
            }
        }, 1, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireQuestionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsQuestionnaireQuestionFragment.adapter$lambda$2$lambda$1(this.f$0, answer);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor adapter$lambda$2$lambda$0(UiRecommendationsQuestionnaire.Answer answer) {
        Component.ComponentType componentType = Component.ComponentType.ROW;
        String string2 = answer.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(componentType, string2, null, 4, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(RecommendationsQuestionnaireQuestionFragment recommendationsQuestionnaireQuestionFragment, UiRecommendationsQuestionnaire.Answer answer) {
        recommendationsQuestionnaireQuestionFragment.onAnswerSelection(answer);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.RECS_INVESTOR_PROFILE_QUESTION;
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getQuestionPage().getQuestionId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        postponeEnterTransition();
        SimpleSlide simpleSlide = new SimpleSlide(8388613);
        simpleSlide.setInterpolator(Interpolators.INSTANCE.getFastOutSlowIn());
        setEnterTransition(simpleSlide);
        setSharedElementEnterTransition(new TransitionSet());
        setSharedElementReturnTransition(new TransitionSet());
        FragmentRecommendationsQuestionnaireQuestionBinding binding = getBinding();
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        RhTextView rhTextView = binding.title;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getQuestionPage().getTitle());
        RdsInlineDefinitionTextView rdsInlineDefinitionTextView = binding.subtitle;
        Intrinsics.checkNotNull(rdsInlineDefinitionTextView);
        String subtitle = ((Args) companion.getArgs((Fragment) this)).getQuestionPage().getSubtitle();
        rdsInlineDefinitionTextView.setVisibility(subtitle == null || subtitle.length() == 0 ? 8 : 0);
        String subtitle2 = ((Args) companion.getArgs((Fragment) this)).getQuestionPage().getSubtitle();
        if (subtitle2 == null) {
            subtitle2 = "";
        }
        rdsInlineDefinitionTextView.setSpannableString(new SpannableString(Markwons.toSpanned$default(getMarkwon(), new MarkdownContent(subtitle2), null, 2, null)));
        RecyclerView questionList = binding.questionList;
        Intrinsics.checkNotNullExpressionValue(questionList, "questionList");
        bindAdapter(questionList, this.adapter);
        binding.questionList.setItemAnimator(null);
        binding.disclosureTxt.setText(getMarkwon().toMarkdown(((Args) companion.getArgs((Fragment) this)).getQuestionPage().getDisclosureMarkdown()));
        final LottieAnimationView lottieAnimationView = binding.sharedElementLottie;
        Intrinsics.checkNotNull(lottieAnimationView);
        OneShotPreDrawListener.add(lottieAnimationView, new Runnable() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireQuestionFragment$onViewCreated$lambda$8$lambda$7$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.startPostponedEnterTransition();
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireQuestionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireQuestionFragment.onViewCreated$lambda$8$lambda$7$lambda$6(lottieAnimationView, (DayNightOverlay) obj);
            }
        });
        lottieAnimationView.setTransitionName(Constants.RECS_MAIN_SHARED_LOTTIE_TRANSITION_NAME);
        animateProgress(((Args) companion.getArgs((Fragment) this)).getTransitionInfo());
        this.adapter.submitList(((Args) companion.getArgs((Fragment) this)).getQuestionPage().getAllowedAnswers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$7$lambda$6(LottieAnimationView lottieAnimationView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LottieUrl lottieUrl = DayNightChanges.isDay(it) ? LottieUrl.RECS_PROGRESSION_ORB_DAY : LottieUrl.RECS_PROGRESSION_ORB_NIGHT;
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, lottieUrl);
        return Unit.INSTANCE;
    }

    private final void onAnswerSelection(UiRecommendationsQuestionnaire.Answer answer) {
        getCallbacks().onQuestionAnswered(((Args) INSTANCE.getArgs((Fragment) this)).getQuestionPage().getQuestionId(), answer.getId());
    }

    public final void addSharedElement(FragmentTransaction fragmentTransaction) {
        Intrinsics.checkNotNullParameter(fragmentTransaction, "fragmentTransaction");
        fragmentTransaction.addSharedElement(getBinding().sharedElementLottie, Constants.RECS_MAIN_SHARED_LOTTIE_TRANSITION_NAME);
    }

    public final List<Tuples2<View, String>> getNextFlowSharedElements() {
        return CollectionsKt.listOf(Tuples4.m3642to(getBinding().sharedElementLottie, getBinding().sharedElementLottie.getTransitionName()));
    }

    public final void animateProgress(RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo) {
        Intrinsics.checkNotNullParameter(transitionInfo, "transitionInfo");
        LottieAnimationView lottieAnimationView = getBinding().sharedElementLottie;
        if (transitionInfo.getMinProgress() == transitionInfo.getMaxProgress()) {
            lottieAnimationView.setProgress(transitionInfo.getMinProgress());
            return;
        }
        lottieAnimationView.setMinAndMaxProgress(transitionInfo.getMinProgress(), transitionInfo.getMaxProgress());
        lottieAnimationView.setSpeed(WhenMappings.$EnumSwitchMapping$0[transitionInfo.getType().ordinal()] == 1 ? 2.0f : -2.0f);
        lottieAnimationView.playAnimation();
    }

    /* compiled from: RecommendationsQuestionnaireQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment$Args;", "Landroid/os/Parcelable;", "questionPage", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$QuestionPage;", "transitionInfo", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;", "<init>", "(Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$QuestionPage;Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;)V", "getQuestionPage", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$QuestionPage;", "getTransitionInfo", "()Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState$TransitionInfo;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final RecommendationsQuestionnairePage.QuestionPage questionPage;
        private final RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo;

        /* compiled from: RecommendationsQuestionnaireQuestionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(RecommendationsQuestionnairePage.QuestionPage.CREATOR.createFromParcel(parcel), RecommendationsQuestionnaireViewState.TransitionInfo.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, RecommendationsQuestionnairePage.QuestionPage questionPage, RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                questionPage = args.questionPage;
            }
            if ((i & 2) != 0) {
                transitionInfo = args.transitionInfo;
            }
            return args.copy(questionPage, transitionInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final RecommendationsQuestionnairePage.QuestionPage getQuestionPage() {
            return this.questionPage;
        }

        /* renamed from: component2, reason: from getter */
        public final RecommendationsQuestionnaireViewState.TransitionInfo getTransitionInfo() {
            return this.transitionInfo;
        }

        public final Args copy(RecommendationsQuestionnairePage.QuestionPage questionPage, RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo) {
            Intrinsics.checkNotNullParameter(questionPage, "questionPage");
            Intrinsics.checkNotNullParameter(transitionInfo, "transitionInfo");
            return new Args(questionPage, transitionInfo);
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
            return Intrinsics.areEqual(this.questionPage, args.questionPage) && Intrinsics.areEqual(this.transitionInfo, args.transitionInfo);
        }

        public int hashCode() {
            return (this.questionPage.hashCode() * 31) + this.transitionInfo.hashCode();
        }

        public String toString() {
            return "Args(questionPage=" + this.questionPage + ", transitionInfo=" + this.transitionInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.questionPage.writeToParcel(dest, flags);
            this.transitionInfo.writeToParcel(dest, flags);
        }

        public Args(RecommendationsQuestionnairePage.QuestionPage questionPage, RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo) {
            Intrinsics.checkNotNullParameter(questionPage, "questionPage");
            Intrinsics.checkNotNullParameter(transitionInfo, "transitionInfo");
            this.questionPage = questionPage;
            this.transitionInfo = transitionInfo;
        }

        public final RecommendationsQuestionnairePage.QuestionPage getQuestionPage() {
            return this.questionPage;
        }

        public final RecommendationsQuestionnaireViewState.TransitionInfo getTransitionInfo() {
            return this.transitionInfo;
        }
    }

    /* compiled from: RecommendationsQuestionnaireQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireQuestionFragment$Args;", "<init>", "()V", "LOTTIE_ANIMATION_SPEED", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsQuestionnaireQuestionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsQuestionnaireQuestionFragment recommendationsQuestionnaireQuestionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsQuestionnaireQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsQuestionnaireQuestionFragment newInstance(Args args) {
            return (RecommendationsQuestionnaireQuestionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsQuestionnaireQuestionFragment recommendationsQuestionnaireQuestionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsQuestionnaireQuestionFragment, args);
        }
    }
}
