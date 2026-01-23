package com.robinhood.android.recommendations.p224ui.reentry;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.C25981x5b5412;
import com.robinhood.android.recommendations.p224ui.reentry.RecommendationsReentryChangeAnswerDialogFragment;
import com.robinhood.android.recommendations.p224ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsExistingAnswers;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsReentryQuestionnaireConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003=>?B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010+\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020,2\u0006\u00102\u001a\u000203H\u0002J\u0018\u00104\u001a\u00020,2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0016J\u0018\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "duxo", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsReentryQuestionnaireConfirmationFragmentBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsReentryQuestionnaireConfirmationFragmentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Landroid/view/View;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsExistingAnswers$QuestionAnswerSummary;", "onStart", "", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "setViewState", "state", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationViewState;", "onUpdateAnswerForReentry", "questionId", "Ljava/util/UUID;", "newAnswerId", "onChangeAnswerForReentry", "question", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Question;", "currentAnswer", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Answer;", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsReentryQuestionnaireConfirmationFragment extends BaseFragment implements RecommendationsReentryChangeAnswerDialogFragment.Callbacks, AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsReentryQuestionnaireConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsReentryQuestionnaireConfirmationFragmentBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsReentryQuestionnaireConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GenericListAdapter<View, UiRecommendationsExistingAnswers.QuestionAnswerSummary> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    private final boolean excludeFromAutoScreenDisappearEventLogging;
    public Markwon markwon;
    private Snackbar snackbar;

    /* compiled from: RecommendationsReentryQuestionnaireConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment$Callbacks;", "", "onSubmitQuestionnaireForReentry", "", "questionsAndAnswers", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSubmitQuestionnaireForReentry(List<Tuples2<UUID, UUID>> questionsAndAnswers);
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

    public RecommendationsReentryQuestionnaireConfirmationFragment() {
        super(C25978R.layout.f4863xed7c750a);
        this.duxo = OldDuxos.oldDuxo(this, RecommendationsReentryQuestionnaireConfirmationDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RecommendationsReentryQuestionnaireConfirmationFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RecommendationsReentryQuestionnaireConfirmationFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.eventScreen = new Screen(Screen.Name.RECS_REENTRY_CONFIRMATION, null, null, null, 14, null);
        this.excludeFromAutoScreenDisappearEventLogging = true;
        this.adapter = GenericListAdapter.INSTANCE.m2985of(C25978R.layout.reentry_question_summary_row, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsReentryQuestionnaireConfirmationFragment.adapter$lambda$3(this.f$0, (View) obj, (UiRecommendationsExistingAnswers.QuestionAnswerSummary) obj2);
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

    public final RecommendationsReentryQuestionnaireConfirmationDuxo getDuxo() {
        return (RecommendationsReentryQuestionnaireConfirmationDuxo) this.duxo.getValue();
    }

    public final C25981x5b5412 getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (C25981x5b5412) value;
    }

    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$3(final RecommendationsReentryQuestionnaireConfirmationFragment recommendationsReentryQuestionnaireConfirmationFragment, View of, final UiRecommendationsExistingAnswers.QuestionAnswerSummary summary) {
        SpannableString spannableString;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(summary, "summary");
        RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) of.findViewById(C25978R.id.label_txt);
        ((TextView) of.findViewById(C25978R.id.value_txt)).setText(summary.getAnswer());
        String questionTooltip = summary.getQuestionTooltip();
        if (questionTooltip != null && questionTooltip.length() != 0) {
            spannableString = new SpannableString(Markwons.toSpanned$default(recommendationsReentryQuestionnaireConfirmationFragment.getMarkwon(), new MarkdownContent("[" + summary.getQuestion() + "](<||" + summary.getQuestionTooltip() + ">)"), null, 2, null));
        } else {
            spannableString = new SpannableString(summary.getQuestion());
        }
        rdsInlineDefinitionTextView.setSpannableString(spannableString);
        ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsReentryQuestionnaireConfirmationFragment.adapter$lambda$3$lambda$1(summary);
            }
        }, 1, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsReentryQuestionnaireConfirmationFragment.adapter$lambda$3$lambda$2(summary, recommendationsReentryQuestionnaireConfirmationFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor adapter$lambda$3$lambda$1(UiRecommendationsExistingAnswers.QuestionAnswerSummary questionAnswerSummary) {
        return new UserInteractionEventDescriptor(questionAnswerSummary.getQuestionToAnswerIds().getFirst().toString(), null, UserInteractionEventData.Action.EDIT, null, new Component(Component.ComponentType.ROW, null, null, 6, null), null, 42, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$3$lambda$2(UiRecommendationsExistingAnswers.QuestionAnswerSummary questionAnswerSummary, RecommendationsReentryQuestionnaireConfirmationFragment recommendationsReentryQuestionnaireConfirmationFragment) {
        Tuples2<UUID, UUID> questionToAnswerIds = questionAnswerSummary.getQuestionToAnswerIds();
        UUID uuidComponent1 = questionToAnswerIds.component1();
        UUID uuidComponent2 = questionToAnswerIds.component2();
        Snackbar snackbar = recommendationsReentryQuestionnaireConfirmationFragment.snackbar;
        if (snackbar != null) {
            snackbar.dismiss();
        }
        recommendationsReentryQuestionnaireConfirmationFragment.getDuxo().onChangeAnswerEvent(uuidComponent1, uuidComponent2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C261601(this));
    }

    /* compiled from: RecommendationsReentryQuestionnaireConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment$onStart$1 */
    /* synthetic */ class C261601 extends FunctionReferenceImpl implements Function1<RecommendationsReentryQuestionnaireConfirmationViewState, Unit> {
        C261601(Object obj) {
            super(1, obj, RecommendationsReentryQuestionnaireConfirmationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecommendationsReentryQuestionnaireConfirmationViewState recommendationsReentryQuestionnaireConfirmationViewState) {
            invoke2(recommendationsReentryQuestionnaireConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecommendationsReentryQuestionnaireConfirmationViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsReentryQuestionnaireConfirmationFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        LinearLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        RecyclerView list = getBinding().list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        bindAdapter(list, this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final RecommendationsReentryQuestionnaireConfirmationViewState state) {
        Tuples2<UiRecommendationsQuestionnaire.Question, UiRecommendationsQuestionnaire.Answer> tuples2Consume;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(state.isLoading());
        }
        C25981x5b5412 binding = getBinding();
        binding.title.setText(state.getTitle());
        binding.subtitle.setText(state.getSubtitle());
        binding.disclosure.setText(getMarkwon().toMarkdown(state.getDisclosureMarkdown()));
        binding.confirmBtn.setLoading(state.isLoading());
        binding.confirmBtn.setText(state.getConfirmBtnTitle());
        RdsButton confirmBtn = binding.confirmBtn;
        Intrinsics.checkNotNullExpressionValue(confirmBtn, "confirmBtn");
        ViewsKt.eventData$default(confirmBtn, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsReentryQuestionnaireConfirmationFragment.setViewState$lambda$6$lambda$4();
            }
        }, 1, null);
        RdsButton confirmBtn2 = binding.confirmBtn;
        Intrinsics.checkNotNullExpressionValue(confirmBtn2, "confirmBtn");
        OnClickListeners.onClick(confirmBtn2, new Function0() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsReentryQuestionnaireConfirmationFragment.setViewState$lambda$6$lambda$5(this.f$0, state);
            }
        });
        this.adapter.submitList(state.getQuestionAnswerSummaries());
        UiEvent<Tuples2<UiRecommendationsQuestionnaire.Question, UiRecommendationsQuestionnaire.Answer>> changeAnswerEvent = state.getChangeAnswerEvent();
        if (changeAnswerEvent == null || (tuples2Consume = changeAnswerEvent.consume()) == null) {
            return;
        }
        onChangeAnswerForReentry(tuples2Consume.component1(), tuples2Consume.component2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor setViewState$lambda$6$lambda$4() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$6$lambda$5(RecommendationsReentryQuestionnaireConfirmationFragment recommendationsReentryQuestionnaireConfirmationFragment, RecommendationsReentryQuestionnaireConfirmationViewState recommendationsReentryQuestionnaireConfirmationViewState) {
        recommendationsReentryQuestionnaireConfirmationFragment.getCallbacks().onSubmitQuestionnaireForReentry(recommendationsReentryQuestionnaireConfirmationViewState.getQuestionsAndAnswers());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryChangeAnswerDialogFragment.Callbacks
    public void onUpdateAnswerForReentry(UUID questionId, UUID newAnswerId) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(newAnswerId, "newAnswerId");
        getDuxo().updateAnswer(questionId, newAnswerId);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        String string2 = getResources().getString(C25978R.string.recommendations_reentry_answer_updated_snackbar_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Snackbar snackbarMake = Snackbars.make(fragmentActivityRequireActivity, string2, -1);
        this.snackbar = snackbarMake;
        if (snackbarMake != null) {
            snackbarMake.show();
        }
    }

    private final void onChangeAnswerForReentry(UiRecommendationsQuestionnaire.Question question, UiRecommendationsQuestionnaire.Answer currentAnswer) {
        RecommendationsReentryChangeAnswerDialogFragment recommendationsReentryChangeAnswerDialogFragment = (RecommendationsReentryChangeAnswerDialogFragment) RecommendationsReentryChangeAnswerDialogFragment.INSTANCE.newInstance((Parcelable) new RecommendationsReentryChangeAnswerDialogFragment.Args(question, currentAnswer));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recommendationsReentryChangeAnswerDialogFragment.show(childFragmentManager, "recs-reentry-change-answer-dialog");
    }

    /* compiled from: RecommendationsReentryQuestionnaireConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment$Args;", "Landroid/os/Parcelable;", "existingAnswers", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsExistingAnswers;", "<init>", "(Lcom/robinhood/recommendations/models/ui/UiRecommendationsExistingAnswers;)V", "getExistingAnswers", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsExistingAnswers;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiRecommendationsExistingAnswers existingAnswers;

        /* compiled from: RecommendationsReentryQuestionnaireConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiRecommendationsExistingAnswers) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UiRecommendationsExistingAnswers uiRecommendationsExistingAnswers, int i, Object obj) {
            if ((i & 1) != 0) {
                uiRecommendationsExistingAnswers = args.existingAnswers;
            }
            return args.copy(uiRecommendationsExistingAnswers);
        }

        /* renamed from: component1, reason: from getter */
        public final UiRecommendationsExistingAnswers getExistingAnswers() {
            return this.existingAnswers;
        }

        public final Args copy(UiRecommendationsExistingAnswers existingAnswers) {
            Intrinsics.checkNotNullParameter(existingAnswers, "existingAnswers");
            return new Args(existingAnswers);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.existingAnswers, ((Args) other).existingAnswers);
        }

        public int hashCode() {
            return this.existingAnswers.hashCode();
        }

        public String toString() {
            return "Args(existingAnswers=" + this.existingAnswers + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.existingAnswers, flags);
        }

        public Args(UiRecommendationsExistingAnswers existingAnswers) {
            Intrinsics.checkNotNullParameter(existingAnswers, "existingAnswers");
            this.existingAnswers = existingAnswers;
        }

        public final UiRecommendationsExistingAnswers getExistingAnswers() {
            return this.existingAnswers;
        }
    }

    /* compiled from: RecommendationsReentryQuestionnaireConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsReentryQuestionnaireConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsReentryQuestionnaireConfirmationFragment recommendationsReentryQuestionnaireConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsReentryQuestionnaireConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsReentryQuestionnaireConfirmationFragment newInstance(Args args) {
            return (RecommendationsReentryQuestionnaireConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsReentryQuestionnaireConfirmationFragment recommendationsReentryQuestionnaireConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsReentryQuestionnaireConfirmationFragment, args);
        }
    }
}
