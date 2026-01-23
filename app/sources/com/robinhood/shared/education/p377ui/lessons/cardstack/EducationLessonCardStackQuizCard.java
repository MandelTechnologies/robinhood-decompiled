package com.robinhood.shared.education.p377ui.lessons.cardstack;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationLessonCardStackQuizCardBinding;
import com.robinhood.shared.education.p377ui.lessons.cardstack.CardStackCardView;
import com.robinhood.shared.education.p377ui.quiz.EducationQuizView;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EducationLessonCardStackQuizCard.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0014J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackQuizCard;", "Lcom/robinhood/android/designsystem/card/RdsCardView;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/CardStackCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;", "callbacks", "getCallbacks", "()Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;", "setCallbacks", "(Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;)V", "binding", "Lcom/robinhood/shared/education/databinding/MergeEducationLessonCardStackQuizCardBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/MergeEducationLessonCardStackQuizCardBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "onSizeChanged", "", "w", "", "h", "oldw", "oldh", "bind", "state", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection$Quiz;", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonCardStackQuizCard extends Hammer_EducationLessonCardStackQuizCard implements CardStackCardView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private EducationQuizView.Callbacks callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationLessonCardStackQuizCard.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/MergeEducationLessonCardStackQuizCardBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.shared.education.p377ui.lessons.cardstack.CardStackCardView
    public void animateContentAppear(long j, Function0<Unit> function0) {
        CardStackCardView.DefaultImpls.animateContentAppear(this, j, function0);
    }

    @Override // com.robinhood.shared.education.p377ui.lessons.cardstack.CardStackCardView
    public void hideContent() {
        CardStackCardView.DefaultImpls.hideContent(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonCardStackQuizCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C38790R.layout.merge_education_lesson_card_stack_quiz_card, true);
        this.binding = ViewBinding5.viewBinding(this, EducationLessonCardStackQuizCard2.INSTANCE);
        getBinding().quizView.setVisibility(4);
    }

    public final EducationQuizView.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(EducationQuizView.Callbacks callbacks) {
        getBinding().quizView.setCallbacks(callbacks);
        this.callbacks = callbacks;
    }

    private final MergeEducationLessonCardStackQuizCardBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationLessonCardStackQuizCardBinding) value;
    }

    @Override // com.robinhood.shared.education.p377ui.lessons.cardstack.CardStackCardView
    public View getContentView() {
        EducationQuizView quizView = getBinding().quizView;
        Intrinsics.checkNotNullExpressionValue(quizView, "quizView");
        return quizView;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        ViewGroup.LayoutParams layoutParams = getBinding().quizView.getLayoutParams();
        layoutParams.width = (w - getContentPaddingLeft()) - getContentPaddingRight();
        getBinding().quizView.setLayoutParams(layoutParams);
    }

    public final void bind(EducationLessonSection.Quiz state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().quizView.bind(state);
    }

    /* compiled from: EducationLessonCardStackQuizCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackQuizCard$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackQuizCard;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EducationLessonCardStackQuizCard> {
        private final /* synthetic */ Inflater<EducationLessonCardStackQuizCard> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EducationLessonCardStackQuizCard inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EducationLessonCardStackQuizCard) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C38790R.layout.include_education_lesson_card_stack_quiz);
        }
    }
}
