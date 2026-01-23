package com.robinhood.shared.education.p377ui.lessons.cardstack;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.quiz.EducationQuizView;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EducationLessonCardStackAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "callbacks", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;", "<init>", "(Lcom/robinhood/shared/education/ui/quiz/EducationQuizView$Callbacks;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "SectionViewType", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonCardStackAdapter extends ListAdapter<EducationLessonSection, SimpleViewHolder> {
    public static final int $stable = 8;
    private final EducationQuizView.Callbacks callbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonCardStackAdapter(EducationQuizView.Callbacks callbacks) {
        super(DiffCallbacks.Equality.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        SectionViewType sectionViewType;
        if (position == getSize() - 1) {
            return SectionViewType.COMPLETION.ordinal();
        }
        EducationLessonSection item = getItem(position);
        if (item instanceof EducationLessonSection.Info) {
            sectionViewType = SectionViewType.INFO;
        } else {
            if (!(item instanceof EducationLessonSection.Quiz)) {
                if ((item instanceof EducationLessonSection.Timeline) || (item instanceof EducationLessonSection.Exercise) || (item instanceof EducationLessonSection.Interstitial) || (item instanceof EducationLessonSection.V1Item)) {
                    Preconditions.INSTANCE.failUnexpectedItemKotlin("Data should not be info or quiz");
                    throw new ExceptionsH();
                }
                if (item != null) {
                    throw new NoWhenBranchMatchedException();
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin("Data should not be null");
                throw new ExceptionsH();
            }
            sectionViewType = SectionViewType.QUIZ;
        }
        return sectionViewType.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate$default;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == SectionViewType.QUIZ.ordinal()) {
            EducationLessonCardStackQuizCard educationLessonCardStackQuizCardInflate = EducationLessonCardStackQuizCard.INSTANCE.inflate(parent);
            educationLessonCardStackQuizCardInflate.setCallbacks(this.callbacks);
            viewInflate$default = educationLessonCardStackQuizCardInflate;
        } else if (viewType == SectionViewType.INFO.ordinal()) {
            viewInflate$default = EducationLessonCardStackInfoCard.INSTANCE.inflate(parent);
        } else if (viewType == SectionViewType.COMPLETION.ordinal()) {
            viewInflate$default = ViewGroups.inflate$default(parent, C38790R.layout.include_education_lesson_card_stack_completion_placeholder, false, 2, null);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
            throw new ExceptionsH();
        }
        ViewsKt.setLoggingConfig(viewInflate$default, new AutoLoggingConfig(true, false));
        return new SimpleViewHolder(viewInflate$default);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (position == getSize() - 1) {
            return;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        EducationLessonSection item = getItem(position);
        if (item instanceof EducationLessonSection.Quiz) {
            ((EducationLessonCardStackQuizCard) itemView).bind((EducationLessonSection.Quiz) item);
            return;
        }
        if (item instanceof EducationLessonSection.Info) {
            ((EducationLessonCardStackInfoCard) itemView).bind((EducationLessonSection.Info) item);
        } else if (!(item instanceof EducationLessonSection.Exercise) && !(item instanceof EducationLessonSection.Interstitial) && !(item instanceof EducationLessonSection.Timeline) && !(item instanceof EducationLessonSection.V1Item)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EducationLessonCardStackAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackAdapter$SectionViewType;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "QUIZ", "COMPLETION", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SectionViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SectionViewType[] $VALUES;
        public static final SectionViewType INFO = new SectionViewType("INFO", 0);
        public static final SectionViewType QUIZ = new SectionViewType("QUIZ", 1);
        public static final SectionViewType COMPLETION = new SectionViewType("COMPLETION", 2);

        private static final /* synthetic */ SectionViewType[] $values() {
            return new SectionViewType[]{INFO, QUIZ, COMPLETION};
        }

        public static EnumEntries<SectionViewType> getEntries() {
            return $ENTRIES;
        }

        private SectionViewType(String str, int i) {
        }

        static {
            SectionViewType[] sectionViewTypeArr$values = $values();
            $VALUES = sectionViewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sectionViewTypeArr$values);
        }

        public static SectionViewType valueOf(String str) {
            return (SectionViewType) Enum.valueOf(SectionViewType.class, str);
        }

        public static SectionViewType[] values() {
            return (SectionViewType[]) $VALUES.clone();
        }
    }
}
