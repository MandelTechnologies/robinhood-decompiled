package com.robinhood.shared.education.p377ui.lessons.standard;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.shared.education.extensions.EducationLessonSections;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EducationLessonStandardSectionPagerAdapter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H\u0016R&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078\u0006@GX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardSectionPagerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "<init>", "()V", "value", "", "itemBottomPadding", "getItemBottomPadding", "()I", "setItemBottomPadding", "(I)V", "learningLesson", "Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "getLearningLesson", "()Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "setLearningLesson", "(Lcom/robinhood/rosetta/eventlogging/LearningLesson;)V", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "SectionViewType", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonStandardSectionPagerAdapter extends ListAdapter<EducationLessonSection, SimpleViewHolder> {
    public static final int $stable = 8;
    private int itemBottomPadding;
    private LearningLesson learningLesson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonStandardSectionPagerAdapter() {
        super(DiffCallbacks.Equality.INSTANCE);
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
    }

    public final int getItemBottomPadding() {
        return this.itemBottomPadding;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItemBottomPadding(int i) {
        if (this.itemBottomPadding != i) {
            this.itemBottomPadding = i;
            notifyDataSetChanged();
        }
    }

    public final LearningLesson getLearningLesson() {
        return this.learningLesson;
    }

    public final void setLearningLesson(LearningLesson learningLesson) {
        this.learningLesson = learningLesson;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        SectionViewType sectionViewType;
        EducationLessonSection item = getItem(position);
        if (item instanceof EducationLessonSection.Info) {
            sectionViewType = SectionViewType.INFO;
        } else if (item instanceof EducationLessonSection.Quiz) {
            sectionViewType = SectionViewType.QUIZ;
        } else if (item instanceof EducationLessonSection.Timeline) {
            sectionViewType = SectionViewType.TIMELINE;
        } else if (item instanceof EducationLessonSection.Exercise) {
            sectionViewType = SectionViewType.EXERCISE;
        } else {
            if (!(item instanceof EducationLessonSection.Interstitial)) {
                if (!(item instanceof EducationLessonSection.V1Item)) {
                    throw new NoWhenBranchMatchedException();
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin("Data should not be v1 section");
                throw new ExceptionsH();
            }
            sectionViewType = SectionViewType.INTERSTITIAL;
        }
        return sectionViewType.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == SectionViewType.INFO.ordinal()) {
            viewInflate = EducationLessonStandardInfoView.INSTANCE.inflate(parent);
        } else if (viewType == SectionViewType.TIMELINE.ordinal()) {
            viewInflate = EducationLessonStandardTimelineView.INSTANCE.inflate(parent);
        } else {
            if (viewType != SectionViewType.QUIZ.ordinal()) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                throw new ExceptionsH();
            }
            viewInflate = EducationLessonStandardQuizView.INSTANCE.inflate(parent);
        }
        ViewsKt.setLoggingConfig(viewInflate, new AutoLoggingConfig(false, false, 1, null));
        return new SimpleViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final EducationLessonSection item = getItem(position);
        if (item instanceof EducationLessonSection.Info) {
            ((EducationLessonStandardInfoView) itemView).bind((EducationLessonSection.Info) item, this.itemBottomPadding);
        } else if (item instanceof EducationLessonSection.Timeline) {
            ((EducationLessonStandardTimelineView) itemView).bind((EducationLessonSection.Timeline) item, this.itemBottomPadding);
        } else if (item instanceof EducationLessonSection.Quiz) {
            ((EducationLessonStandardQuizView) itemView).bind((EducationLessonSection.Quiz) item, this.itemBottomPadding);
        } else if (!(item instanceof EducationLessonSection.Exercise) && !(item instanceof EducationLessonSection.Interstitial) && !(item instanceof EducationLessonSection.V1Item)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewsKt.eventData$default(itemView, false, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardSectionPagerAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardSectionPagerAdapter.onBindViewHolder$lambda$0(item, position, this);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onBindViewHolder$lambda$0(EducationLessonSection educationLessonSection, int i, EducationLessonStandardSectionPagerAdapter educationLessonStandardSectionPagerAdapter) {
        Component component = new Component(Component.ComponentType.LEARNING_SECTION, null, null, 6, null);
        int i2 = i + 1;
        LearningSection protobuf = EducationLessonSections.toProtobuf(educationLessonSection, i2, educationLessonStandardSectionPagerAdapter.getSize());
        LearningLesson learningLesson = educationLessonStandardSectionPagerAdapter.learningLesson;
        return new UserInteractionEventDescriptor(null, null, null, new Context(i2, educationLessonStandardSectionPagerAdapter.getSize(), 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, learningLesson, protobuf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -201326596, -1, -1, -1, -1, -1, 16383, null), component, null, 39, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EducationLessonStandardSectionPagerAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardSectionPagerAdapter$SectionViewType;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "QUIZ", "TIMELINE", "EXERCISE", "INTERSTITIAL", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SectionViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SectionViewType[] $VALUES;
        public static final SectionViewType INFO = new SectionViewType("INFO", 0);
        public static final SectionViewType QUIZ = new SectionViewType("QUIZ", 1);
        public static final SectionViewType TIMELINE = new SectionViewType("TIMELINE", 2);
        public static final SectionViewType EXERCISE = new SectionViewType("EXERCISE", 3);
        public static final SectionViewType INTERSTITIAL = new SectionViewType("INTERSTITIAL", 4);

        private static final /* synthetic */ SectionViewType[] $values() {
            return new SectionViewType[]{INFO, QUIZ, TIMELINE, EXERCISE, INTERSTITIAL};
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
