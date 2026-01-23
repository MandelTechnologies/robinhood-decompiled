package com.robinhood.android.recommendations.p224ui.risk;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.ChangeTransform;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsRiskProfileBinding;
import com.robinhood.android.recommendations.p224ui.risk.RecommendationsRiskProfileFragment;
import com.robinhood.android.recommendations.p224ui.utils.Constants;
import com.robinhood.android.recommendations.p224ui.utils.UtilsKt;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsRiskProfile;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: RecommendationsRiskProfileFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0003<=>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020-H\u0016J\u001a\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0018\u00103\u001a\u00020-2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020-H\u0002J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020;H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsRiskProfileBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsRiskProfileBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileDuxo;", "getDuxo", "()Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "volatilityTarget", "", "getVolatilityTarget", "()I", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Landroid/view/View;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile$QuestionAnswerSummary;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "setViewState", "viewState", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileViewState;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "repeatRiskSheen", "setDisclosureLinkContent", "disclosureLink", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile$Link;", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsRiskProfileFragment extends BaseFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsRiskProfileFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsRiskProfileBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsRiskProfileFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TransitionSet ENTER_TRANSITION;
    private static final TransitionSet EXIT_TRANSITION;
    private static final long FADE_ENTER_DURATION_MS = 1000;
    private static final long FADE_EXIT_DURATION_MS = 500;
    private static final int INDICATOR_SPACING = 5;
    private static final long RISK_SHEEN_PERIOD = 3000;
    private static final long SCROLL_DURATION_MS = 300;
    private static final TransitionSet SHARED_ELEMENT_ENTER_TRANSITION;
    private static final TransitionSet SHARED_ELEMENT_ENTER_TRANSITION_LOTTIE;
    private static final TransitionSet SHARED_ELEMENT_ENTER_TRANSITION_OTHERS;
    private static final long SLIDE_DELAY_MS = 300;
    private static final long SLIDE_DURATION_MS = 500;
    private final GenericListAdapter<View, UiRecommendationsRiskProfile.QuestionAnswerSummary> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    private final boolean excludeFromAutoScreenDisappearEventLogging;
    public Markwon markwon;

    /* compiled from: RecommendationsRiskProfileFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00072\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment$Callbacks;", "", "startWalkthroughFlow", "", "portfolioRecommendation", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio;", "sharedElements", "", "Lkotlin/Pair;", "Landroid/view/View;", "", "sharedElementLottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void startWalkthroughFlow(UiRecommendationsPortfolio portfolioRecommendation, List<? extends Tuples2<? extends View, String>> sharedElements, LottieUrl sharedElementLottieUrl);
    }

    /* compiled from: RecommendationsRiskProfileFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    public RecommendationsRiskProfileFragment() {
        super(C25978R.layout.fragment_recommendations_risk_profile);
        this.binding = ViewBinding5.viewBinding(this, RecommendationsRiskProfileFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RecommendationsRiskProfileFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, RecommendationsRiskProfileDuxo.class);
        this.adapter = GenericListAdapter.INSTANCE.m2985of(C25978R.layout.risk_question_summary_row, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsRiskProfileFragment.adapter$lambda$1(this.f$0, (View) obj, (UiRecommendationsRiskProfile.QuestionAnswerSummary) obj2);
            }
        });
        this.eventScreen = new Screen(Screen.Name.RECS_RISK_PROFILE, null, null, null, 14, null);
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

    static {
        TransitionSet duration = new TransitionSet().addTransition(new Fade(1)).setDuration(1000L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        ENTER_TRANSITION = duration;
        TransitionSet duration2 = new TransitionSet().addTransition(new Fade(2)).setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(duration2, "setDuration(...)");
        EXIT_TRANSITION = duration2;
        TransitionSet transitionSetAddTarget = new TransitionSet().addTransition(new ChangeBounds()).addTransition(new ChangeImageTransform()).addTransition(new ChangeTransform()).addTarget(C25978R.id.shared_element_lottie);
        Intrinsics.checkNotNullExpressionValue(transitionSetAddTarget, "addTarget(...)");
        SHARED_ELEMENT_ENTER_TRANSITION_LOTTIE = transitionSetAddTarget;
        TransitionSet transitionSetAddTransition = new TransitionSet().addTransition(new ChangeBounds());
        ChangeTransform changeTransform = new ChangeTransform();
        changeTransform.setReparentWithOverlay(false);
        TransitionSet transitionSetAddTarget2 = transitionSetAddTransition.addTransition(changeTransform).addTarget(C25978R.id.background).addTarget(C25978R.id.continue_btn);
        Intrinsics.checkNotNullExpressionValue(transitionSetAddTarget2, "addTarget(...)");
        SHARED_ELEMENT_ENTER_TRANSITION_OTHERS = transitionSetAddTarget2;
        TransitionSet startDelay = new TransitionSet().addTransition(transitionSetAddTarget).addTransition(transitionSetAddTarget2).setDuration(500L).setStartDelay(300L);
        Intrinsics.checkNotNullExpressionValue(startDelay, "setStartDelay(...)");
        SHARED_ELEMENT_ENTER_TRANSITION = startDelay;
    }

    private final FragmentRecommendationsRiskProfileBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsRiskProfileBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final RecommendationsRiskProfileDuxo getDuxo() {
        return (RecommendationsRiskProfileDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getVolatilityTarget() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getRiskProfile().getVolatilityTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(RecommendationsRiskProfileFragment recommendationsRiskProfileFragment, View of, UiRecommendationsRiskProfile.QuestionAnswerSummary summary) {
        SpannableString spannableString;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(summary, "summary");
        RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) of.findViewById(C25978R.id.summary_name_text);
        TextView textView = (TextView) of.findViewById(C25978R.id.summary_value_text);
        String questionTooltip = summary.getQuestionTooltip();
        if (questionTooltip != null && questionTooltip.length() != 0) {
            spannableString = new SpannableString(Markwons.toSpanned$default(recommendationsRiskProfileFragment.getMarkwon(), new MarkdownContent("[" + summary.getQuestion() + "](<||" + summary.getQuestionTooltip() + ">)"), null, 2, null));
        } else {
            spannableString = new SpannableString(summary.getQuestion());
        }
        rdsInlineDefinitionTextView.setSpannableString(spannableString);
        textView.setText(summary.getAnswer());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        postponeEnterTransition();
        setEnterTransition(ENTER_TRANSITION);
        setExitTransition(EXIT_TRANSITION);
        setSharedElementEnterTransition(SHARED_ELEMENT_ENTER_TRANSITION);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(Observables.INSTANCE.combineLatest(getDuxo().getStates(), requireBaseActivity().getDayNightStyleChanges())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileFragment.onResume$lambda$2(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(RecommendationsRiskProfileFragment recommendationsRiskProfileFragment, Tuples2 tuples2) throws Throwable {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        recommendationsRiskProfileFragment.setViewState((RecommendationsRiskProfileViewState) tuples2.component1(), (DayNightOverlay) tuples2.component2());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final FragmentRecommendationsRiskProfileBinding binding = getBinding();
        FrameLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        RhTextView rhTextView = binding.titleTxt;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getRiskProfile().getTitle());
        binding.descriptionTxt.setText(((Args) companion.getArgs((Fragment) this)).getRiskProfile().getDescription());
        binding.questionSummaryTxt.setText(((Args) companion.getArgs((Fragment) this)).getRiskProfile().getQuestionnaireSummaryTitle());
        LinearLayout continueBtnContainer = binding.continueBtnContainer;
        Intrinsics.checkNotNullExpressionValue(continueBtnContainer, "continueBtnContainer");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(continueBtnContainer, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        binding.continueBtn.setText(((Args) companion.getArgs((Fragment) this)).getRiskProfile().getContinueButtonTitle());
        RdsButton continueBtn = binding.continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        ViewsKt.eventData$default(continueBtn, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsRiskProfileFragment.onViewCreated$lambda$8$lambda$3();
            }
        }, 1, null);
        RdsButton continueBtn2 = binding.continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn2, "continueBtn");
        OnClickListeners.onClick(continueBtn2, new Function0() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsRiskProfileFragment.onViewCreated$lambda$8$lambda$4(this.f$0);
            }
        });
        setDisclosureLinkContent(((Args) companion.getArgs((Fragment) this)).getRiskProfile().getDisclosureLink());
        RecyclerView list = binding.list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        bindAdapter(list, this.adapter);
        binding.list.setItemAnimator(null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileFragment.onViewCreated$lambda$8$lambda$6(binding, this, (DayNightOverlay) obj);
            }
        });
        LottieAnimationView sheenLottie = binding.sheenLottie;
        Intrinsics.checkNotNullExpressionValue(sheenLottie, "sheenLottie");
        LottieAnimationViewsKt.setRemoteUrl(sheenLottie, LottieUrl.RECS_RISK_SHEEN);
        binding.sheenLottie.setMinAndMaxFrame(UtilsKt.getSheenStartFrame(getVolatilityTarget()), UtilsKt.getSheenEndFrame(getVolatilityTarget()));
        repeatRiskSheen();
        Iterator<T> it = ((Args) companion.getArgs((Fragment) this)).getSharedElements().iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            ViewCompat.requireViewById(binding.getRoot(), ((Number) tuples2.getFirst()).intValue()).setTransitionName((String) tuples2.getSecond());
        }
        this.adapter.submitList(((Args) INSTANCE.getArgs((Fragment) this)).getRiskProfile().getQuestionnaireSummaryItems());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$8$lambda$3() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$4(RecommendationsRiskProfileFragment recommendationsRiskProfileFragment) {
        recommendationsRiskProfileFragment.getDuxo().loadWalkthrough();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$6(FragmentRecommendationsRiskProfileBinding fragmentRecommendationsRiskProfileBinding, final RecommendationsRiskProfileFragment recommendationsRiskProfileFragment, DayNightOverlay dayNightOverlay) {
        LottieUrl lottieUrl;
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        int i = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i == 1) {
            lottieUrl = LottieUrl.RECS_RISK_INDICATOR_DAY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lottieUrl = LottieUrl.RECS_RISK_INDICATOR_NIGHT;
        }
        LottieAnimationView indicatorLottie = fragmentRecommendationsRiskProfileBinding.indicatorLottie;
        Intrinsics.checkNotNullExpressionValue(indicatorLottie, "indicatorLottie");
        LottieAnimationViewsKt.setRemoteUrl(indicatorLottie, lottieUrl);
        fragmentRecommendationsRiskProfileBinding.indicatorLottie.setFrame((recommendationsRiskProfileFragment.getVolatilityTarget() - 1) * 5);
        LottieAnimationView sharedElementLottie = fragmentRecommendationsRiskProfileBinding.sharedElementLottie;
        Intrinsics.checkNotNullExpressionValue(sharedElementLottie, "sharedElementLottie");
        LottieAnimationViewsKt.setRemoteUrl(sharedElementLottie, RiskLoaderLottieUtils.getRiskToPortfolioLottieUrl(recommendationsRiskProfileFragment.getVolatilityTarget(), dayNightOverlay));
        final LottieAnimationView sharedElementLottie2 = fragmentRecommendationsRiskProfileBinding.sharedElementLottie;
        Intrinsics.checkNotNullExpressionValue(sharedElementLottie2, "sharedElementLottie");
        OneShotPreDrawListener.add(sharedElementLottie2, new Runnable() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$onViewCreated$lambda$8$lambda$6$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                recommendationsRiskProfileFragment.startPostponedEnterTransition();
            }
        });
        return Unit.INSTANCE;
    }

    private final void setViewState(RecommendationsRiskProfileViewState viewState, final DayNightOverlay dayNightOverlay) throws Throwable {
        final UiRecommendationsPortfolio uiRecommendationsPortfolioConsume;
        Throwable thConsume;
        getBinding().continueBtn.setLoading(viewState.isLoading());
        UiEvent<Throwable> errorEvent = viewState.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, 0, null, 56, null);
        }
        UiEvent<UiRecommendationsPortfolio> startWalkthroughEvent = viewState.getStartWalkthroughEvent();
        if (startWalkthroughEvent == null || (uiRecommendationsPortfolioConsume = startWalkthroughEvent.consume()) == null) {
            return;
        }
        getBinding().continueBtn.setLoading(true);
        getBinding().scrollView.smoothScrollTo(0, 0, 300);
        final LottieAnimationView lottieAnimationView = getBinding().sharedElementLottie;
        lottieAnimationView.setTransitionName(Constants.RECS_MAIN_SHARED_LOTTIE_TRANSITION_NAME);
        Intrinsics.checkNotNull(lottieAnimationView);
        lottieAnimationView.postDelayed(new Runnable() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$setViewState$lambda$12$lambda$11$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                RecommendationsRiskProfileFragment.Callbacks callbacks = this.this$0.getCallbacks();
                UiRecommendationsPortfolio uiRecommendationsPortfolio = uiRecommendationsPortfolioConsume;
                LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                callbacks.startWalkthroughFlow(uiRecommendationsPortfolio, CollectionsKt.listOf(Tuples4.m3642to(lottieAnimationView2, lottieAnimationView2.getTransitionName())), RiskLoaderLottieUtils.getRiskToPortfolioLottieUrl(this.this$0.getVolatilityTarget(), dayNightOverlay));
            }
        }, 300L);
    }

    private final void repeatRiskSheen() {
        Observable<Long> observableInterval = Observable.interval(3000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableInterval, "interval(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableInterval), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileFragment.repeatRiskSheen$lambda$13(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit repeatRiskSheen$lambda$13(RecommendationsRiskProfileFragment recommendationsRiskProfileFragment, Long l) {
        recommendationsRiskProfileFragment.getBinding().sheenLottie.playAnimation();
        return Unit.INSTANCE;
    }

    private final void setDisclosureLinkContent(final UiRecommendationsRiskProfile.Link disclosureLink) {
        FragmentRecommendationsRiskProfileBinding binding = getBinding();
        binding.disclosureBtn.setText(disclosureLink.getText());
        ServerToBentoAssetMapper2.Companion companion = ServerToBentoAssetMapper2.INSTANCE;
        ServerToBentoAssetMapper2 icon = disclosureLink.getIcon();
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = companion.fromServerValue(icon != null ? icon.getServerValue() : null);
        Integer numValueOf = serverToBentoAssetMapper2FromServerValue != null ? Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId()) : null;
        RdsTextButton disclosureBtn = binding.disclosureBtn;
        Intrinsics.checkNotNullExpressionValue(disclosureBtn, "disclosureBtn");
        TextViewsKt.setDrawableEnd(disclosureBtn, numValueOf != null ? AppCompatResources.getDrawable(requireContext(), numValueOf.intValue()) : null);
        RdsTextButton disclosureBtn2 = binding.disclosureBtn;
        Intrinsics.checkNotNullExpressionValue(disclosureBtn2, "disclosureBtn");
        OnClickListeners.onClick(disclosureBtn2, new Function0() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsRiskProfileFragment.setDisclosureLinkContent$lambda$16$lambda$15(this.f$0, disclosureLink);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDisclosureLinkContent$lambda$16$lambda$15(RecommendationsRiskProfileFragment recommendationsRiskProfileFragment, UiRecommendationsRiskProfile.Link link) {
        Navigator navigator = recommendationsRiskProfileFragment.getNavigator();
        android.content.Context contextRequireContext = recommendationsRiskProfileFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(link.getUrl()), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: RecommendationsRiskProfileFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment$Args;", "Landroid/os/Parcelable;", "submissionId", "Ljava/util/UUID;", "riskProfile", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "sharedElements", "", "Lkotlin/Pair;", "", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;Ljava/util/List;)V", "getSubmissionId", "()Ljava/util/UUID;", "getRiskProfile", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "getSharedElements", "()Ljava/util/List;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiRecommendationsRiskProfile riskProfile;
        private final List<Tuples2<Integer, String>> sharedElements;
        private final UUID submissionId;

        /* compiled from: RecommendationsRiskProfileFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                UiRecommendationsRiskProfile uiRecommendationsRiskProfile = (UiRecommendationsRiskProfile) parcel.readParcelable(Args.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new Args(uuid, uiRecommendationsRiskProfile, arrayList);
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
            dest.writeSerializable(this.submissionId);
            dest.writeParcelable(this.riskProfile, flags);
            List<Tuples2<Integer, String>> list = this.sharedElements;
            dest.writeInt(list.size());
            Iterator<Tuples2<Integer, String>> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }

        public Args(UUID submissionId, UiRecommendationsRiskProfile riskProfile, List<Tuples2<Integer, String>> sharedElements) {
            Intrinsics.checkNotNullParameter(submissionId, "submissionId");
            Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
            Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
            this.submissionId = submissionId;
            this.riskProfile = riskProfile;
            this.sharedElements = sharedElements;
        }

        public final UUID getSubmissionId() {
            return this.submissionId;
        }

        public final UiRecommendationsRiskProfile getRiskProfile() {
            return this.riskProfile;
        }

        public final List<Tuples2<Integer, String>> getSharedElements() {
            return this.sharedElements;
        }
    }

    /* compiled from: RecommendationsRiskProfileFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment$Args;", "<init>", "()V", "INDICATOR_SPACING", "", "FADE_ENTER_DURATION_MS", "", "FADE_EXIT_DURATION_MS", "SLIDE_DURATION_MS", "SLIDE_DELAY_MS", "RISK_SHEEN_PERIOD", "SCROLL_DURATION_MS", "ENTER_TRANSITION", "Landroidx/transition/TransitionSet;", "EXIT_TRANSITION", "SHARED_ELEMENT_ENTER_TRANSITION_LOTTIE", "SHARED_ELEMENT_ENTER_TRANSITION_OTHERS", "SHARED_ELEMENT_ENTER_TRANSITION", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsRiskProfileFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsRiskProfileFragment recommendationsRiskProfileFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsRiskProfileFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsRiskProfileFragment newInstance(Args args) {
            return (RecommendationsRiskProfileFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsRiskProfileFragment recommendationsRiskProfileFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsRiskProfileFragment, args);
        }
    }
}
