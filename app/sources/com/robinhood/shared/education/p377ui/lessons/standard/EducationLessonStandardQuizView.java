package com.robinhood.shared.education.p377ui.lessons.standard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationLessonStandardSectionQuizViewBinding;
import com.robinhood.shared.education.p377ui.quiz.EducationQuizView;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EducationLessonStandardQuizView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0014R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardQuizView;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardSectionQuizViewBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardSectionQuizViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttachedToWindow", "", "bind", "state", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection$Quiz;", "bottomPadding", "", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonStandardQuizView extends NestedScrollView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationLessonStandardQuizView.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardSectionQuizViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonStandardQuizView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C38790R.layout.merge_education_lesson_standard_section_quiz_view, true);
        this.binding = ViewBinding5.viewBinding(this, EducationLessonStandardQuizView2.INSTANCE);
    }

    private final MergeEducationLessonStandardSectionQuizViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationLessonStandardSectionQuizViewBinding) value;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (canScrollVertically(-1)) {
            scrollTo(0, 0);
        }
    }

    public final void bind(EducationLessonSection.Quiz state, int bottomPadding) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().quizView.bind(state);
        EducationQuizView quizView = getBinding().quizView;
        Intrinsics.checkNotNullExpressionValue(quizView, "quizView");
        ViewsKt.setBottomPadding(quizView, bottomPadding);
    }

    /* compiled from: EducationLessonStandardQuizView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardQuizView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardQuizView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EducationLessonStandardQuizView> {
        private final /* synthetic */ Inflater<EducationLessonStandardQuizView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EducationLessonStandardQuizView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EducationLessonStandardQuizView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C38790R.layout.include_education_lesson_standard_section_quiz);
        }
    }
}
