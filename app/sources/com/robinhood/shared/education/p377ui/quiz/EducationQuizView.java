package com.robinhood.shared.education.p377ui.quiz;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationQuizViewBinding;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: EducationQuizView.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u0001:\u000245B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010*\u001a\u00020+H\u0014J\b\u0010,\u001a\u00020+H\u0014J\u000e\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u00020+2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020+2\u0006\u00101\u001a\u000202H\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b(\u0010)¨\u00066"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/quiz/EducationQuizView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;", "setCallbacks", "(Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "duxo", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizDuxo;", "getDuxo", "()Lcom/robinhood/shared/education/ui/quiz/EducationQuizDuxo;", "setDuxo", "(Lcom/robinhood/shared/education/ui/quiz/EducationQuizDuxo;)V", "displayAsCard", "", "binding", "Lcom/robinhood/shared/education/databinding/MergeEducationQuizViewBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/MergeEducationQuizViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "answersAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizAnswerButton;", "Lcom/robinhood/shared/education/ui/quiz/QuizAnswerViewState;", "answerFeedbackBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getAnswerFeedbackBackgroundDrawable$annotations", "()V", "onAttachedToWindow", "", "onDetachedFromWindow", "bind", "quiz", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection$Quiz;", "bindViewState", "state", "Lcom/robinhood/shared/education/ui/quiz/EducationLessonSectionQuizViewState;", "bindAnswerFeedback", "Callbacks", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationQuizView extends Hammer_EducationQuizView {
    private static final int FEEDBACK_CARD_OPACITY_DAY = 25;
    private static final int FEEDBACK_CARD_OPACITY_NIGHT = 50;
    private final GradientDrawable answerFeedbackBackgroundDrawable;
    private final GenericListAdapter<EducationQuizAnswerButton, QuizAnswerViewState> answersAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    private boolean displayAsCard;
    public EducationQuizDuxo duxo;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationQuizView.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/MergeEducationQuizViewBinding;", 0))};
    public static final int $stable = 8;

    /* compiled from: EducationQuizView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;", "", "onQuizAnswerTap", "", "answer", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationQuizAnswer;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onQuizAnswerTap(EducationQuizAnswer answer);
    }

    private static /* synthetic */ void getAnswerFeedbackBackgroundDrawable$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationQuizView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C38790R.layout.merge_education_quiz_view, true);
        this.binding = ViewBinding5.viewBinding(this, EducationQuizView2.INSTANCE);
        setOrientation(1);
        int[] EducationQuizView = C38790R.styleable.EducationQuizView;
        Intrinsics.checkNotNullExpressionValue(EducationQuizView, "EducationQuizView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EducationQuizView, 0, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C38790R.styleable.EducationQuizView_displayAsCard, false);
        this.displayAsCard = z;
        setGravity(z ? 16 : 8388611);
        getBinding().quizTitleTxt.setGravity(this.displayAsCard ? 17 : 8388611);
        getBinding().quizContentTxt.setGravity(this.displayAsCard ? 17 : 8388611);
        typedArrayObtainStyledAttributes.recycle();
        GenericListAdapter<EducationQuizAnswerButton, QuizAnswerViewState> genericListAdapterM2985of = GenericListAdapter.INSTANCE.m2985of(C38790R.layout.include_education_quiz_answer_button, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.shared.education.ui.quiz.EducationQuizView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationQuizView.answersAdapter$lambda$1((QuizAnswerViewState) obj);
            }
        }), new Function2() { // from class: com.robinhood.shared.education.ui.quiz.EducationQuizView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EducationQuizView.answersAdapter$lambda$3(this.f$0, (EducationQuizAnswerButton) obj, (QuizAnswerViewState) obj2);
            }
        });
        this.answersAdapter = genericListAdapterM2985of;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(getResources().getDimension(C13997R.dimen.card_corner_radius));
        gradientDrawable.setAlpha(25);
        this.answerFeedbackBackgroundDrawable = gradientDrawable;
        RecyclerView recyclerView = getBinding().quizAnswersRecyclerView;
        recyclerView.setAdapter(genericListAdapterM2985of);
        recyclerView.setItemAnimator(null);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
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

    public final EducationQuizDuxo getDuxo() {
        EducationQuizDuxo educationQuizDuxo = this.duxo;
        if (educationQuizDuxo != null) {
            return educationQuizDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(EducationQuizDuxo educationQuizDuxo) {
        Intrinsics.checkNotNullParameter(educationQuizDuxo, "<set-?>");
        this.duxo = educationQuizDuxo;
    }

    private final MergeEducationQuizViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationQuizViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object answersAdapter$lambda$1(QuizAnswerViewState byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getAnswer().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit answersAdapter$lambda$3(final EducationQuizView educationQuizView, EducationQuizAnswerButton of, final QuizAnswerViewState item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setExcludeFromAutomaticAppearLogging(educationQuizView.displayAsCard);
        of.bind(item, !educationQuizView.displayAsCard);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.shared.education.ui.quiz.EducationQuizView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationQuizView.answersAdapter$lambda$3$lambda$2(this.f$0, item);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit answersAdapter$lambda$3$lambda$2(EducationQuizView educationQuizView, QuizAnswerViewState quizAnswerViewState) {
        educationQuizView.getDuxo().selectQuizAnswer(quizAnswerViewState.getAnswer());
        Callbacks callbacks = educationQuizView.callbacks;
        if (callbacks != null) {
            callbacks.onQuizAnswerTap(quizAnswerViewState.getAnswer());
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.quiz.EducationQuizView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationQuizView.onAttachedToWindow$lambda$6(this.f$0, (DayNightOverlay) obj);
            }
        });
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new C389212(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$6(EducationQuizView educationQuizView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        educationQuizView.answerFeedbackBackgroundDrawable.setAlpha(DayNightChanges.isDay(it) ? 25 : 50);
        return Unit.INSTANCE;
    }

    /* compiled from: EducationQuizView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.quiz.EducationQuizView$onAttachedToWindow$2 */
    /* synthetic */ class C389212 extends FunctionReferenceImpl implements Function1<EducationLessonSectionQuizViewState, Unit> {
        C389212(Object obj) {
            super(1, obj, EducationQuizView.class, "bindViewState", "bindViewState(Lcom/robinhood/shared/education/ui/quiz/EducationLessonSectionQuizViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EducationLessonSectionQuizViewState educationQuizViewState) {
            invoke2(educationQuizViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EducationLessonSectionQuizViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationQuizView) this.receiver).bindViewState(p0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.answersAdapter.submitList(CollectionsKt.emptyList());
    }

    public final void bind(EducationLessonSection.Quiz quiz) {
        Intrinsics.checkNotNullParameter(quiz, "quiz");
        getDuxo().updateQuiz(quiz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(final EducationLessonSectionQuizViewState state) {
        MergeEducationQuizViewBinding binding = getBinding();
        RhTextView quizHeaderTxt = binding.quizHeaderTxt;
        Intrinsics.checkNotNullExpressionValue(quizHeaderTxt, "quizHeaderTxt");
        TextViewsKt.setVisibilityText(quizHeaderTxt, !this.displayAsCard ? state.getHeader() : null);
        binding.quizTitleTxt.setText(state.getTitle());
        RdsInlineDefinitionTextView quizContentTxt = binding.quizContentTxt;
        Intrinsics.checkNotNullExpressionValue(quizContentTxt, "quizContentTxt");
        quizContentTxt.setVisibility(!this.displayAsCard ? 0 : 8);
        binding.quizContentTxt.setSpannableString(new SpannableString(Markwons.toSpanned$default(getMarkwon(), state.getQuestion(), null, 2, null)));
        this.answersAdapter.submitList(state.getDisplayedAnswers(), new Runnable() { // from class: com.robinhood.shared.education.ui.quiz.EducationQuizView.bindViewState.2
            @Override // java.lang.Runnable
            public final void run() {
                if (state.getShouldAnimate()) {
                    Transitions2.beginDelayedTransition(this, new AutoTransition());
                }
                this.bindAnswerFeedback(state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindAnswerFeedback(EducationLessonSectionQuizViewState state) {
        EducationQuizAnswer answer;
        MergeEducationQuizViewBinding binding = getBinding();
        LinearLayout quizAnswerFeedbackCard = binding.quizAnswerFeedbackCard;
        Intrinsics.checkNotNullExpressionValue(quizAnswerFeedbackCard, "quizAnswerFeedbackCard");
        quizAnswerFeedbackCard.setVisibility(state.getShowFeedbackCard() ? 0 : 8);
        binding.quizAnswerFeedbackCard.setForeground(this.displayAsCard ? null : getContext().getDrawable(C38790R.drawable.education_card_border));
        QuizAnswerViewState currentQuestionSelectedAnswer = state.getCurrentQuestionSelectedAnswer();
        if (currentQuestionSelectedAnswer == null || (answer = currentQuestionSelectedAnswer.getAnswer()) == null) {
            return;
        }
        GradientDrawable gradientDrawable = this.answerFeedbackBackgroundDrawable;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(ColorStateList.valueOf(EducationQuizAnswers.getFeedbackColor(answer, context)));
        binding.quizAnswerFeedbackTxt.setBackground(this.answerFeedbackBackgroundDrawable);
        binding.quizAnswerFeedbackTxt.setText(Markwons.toSpanned$default(getMarkwon(), answer.getContent(), null, 2, null));
    }
}
