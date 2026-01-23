package com.robinhood.shared.education.p377ui.lessons.standard;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSectionFooter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonStandardFooterData.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData;", "", "<init>", "()V", "None", "NextButton", "BackAndNextButton", "CtaButtons", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$BackAndNextButton;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$CtaButtons;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$NextButton;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$None;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class EducationLessonStandardFooterData {
    public static final int $stable = 0;

    public /* synthetic */ EducationLessonStandardFooterData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EducationLessonStandardFooterData() {
    }

    /* compiled from: EducationLessonStandardFooterData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$None;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class None extends EducationLessonStandardFooterData {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 1113442978;
        }

        public String toString() {
            return "None";
        }

        private None() {
            super(null);
        }
    }

    /* compiled from: EducationLessonStandardFooterData.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\r\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$NextButton;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData;", "sectionFooter", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSectionFooter;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSectionFooter;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getSectionFooter", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSectionFooter;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NextButton extends EducationLessonStandardFooterData {
        public static final int $stable = 8;
        private final Context eventContext;
        private final EducationSectionFooter sectionFooter;

        public static /* synthetic */ NextButton copy$default(NextButton nextButton, EducationSectionFooter educationSectionFooter, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                educationSectionFooter = nextButton.sectionFooter;
            }
            if ((i & 2) != 0) {
                context = nextButton.eventContext;
            }
            return nextButton.copy(educationSectionFooter, context);
        }

        /* renamed from: component1, reason: from getter */
        public final EducationSectionFooter getSectionFooter() {
            return this.sectionFooter;
        }

        /* renamed from: component2, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        public final NextButton copy(EducationSectionFooter sectionFooter, Context eventContext) {
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            return new NextButton(sectionFooter, eventContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NextButton)) {
                return false;
            }
            NextButton nextButton = (NextButton) other;
            return Intrinsics.areEqual(this.sectionFooter, nextButton.sectionFooter) && Intrinsics.areEqual(this.eventContext, nextButton.eventContext);
        }

        public int hashCode() {
            EducationSectionFooter educationSectionFooter = this.sectionFooter;
            return ((educationSectionFooter == null ? 0 : educationSectionFooter.hashCode()) * 31) + this.eventContext.hashCode();
        }

        public String toString() {
            return "NextButton(sectionFooter=" + this.sectionFooter + ", eventContext=" + this.eventContext + ")";
        }

        public final EducationSectionFooter getSectionFooter() {
            return this.sectionFooter;
        }

        public final Context getEventContext() {
            return this.eventContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NextButton(EducationSectionFooter educationSectionFooter, Context eventContext) {
            super(null);
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            this.sectionFooter = educationSectionFooter;
            this.eventContext = eventContext;
        }
    }

    /* compiled from: EducationLessonStandardFooterData.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\r\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$BackAndNextButton;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData;", "sectionFooter", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSectionFooter;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSectionFooter;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getSectionFooter", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSectionFooter;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BackAndNextButton extends EducationLessonStandardFooterData {
        public static final int $stable = 8;
        private final Context eventContext;
        private final EducationSectionFooter sectionFooter;

        public static /* synthetic */ BackAndNextButton copy$default(BackAndNextButton backAndNextButton, EducationSectionFooter educationSectionFooter, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                educationSectionFooter = backAndNextButton.sectionFooter;
            }
            if ((i & 2) != 0) {
                context = backAndNextButton.eventContext;
            }
            return backAndNextButton.copy(educationSectionFooter, context);
        }

        /* renamed from: component1, reason: from getter */
        public final EducationSectionFooter getSectionFooter() {
            return this.sectionFooter;
        }

        /* renamed from: component2, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        public final BackAndNextButton copy(EducationSectionFooter sectionFooter, Context eventContext) {
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            return new BackAndNextButton(sectionFooter, eventContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackAndNextButton)) {
                return false;
            }
            BackAndNextButton backAndNextButton = (BackAndNextButton) other;
            return Intrinsics.areEqual(this.sectionFooter, backAndNextButton.sectionFooter) && Intrinsics.areEqual(this.eventContext, backAndNextButton.eventContext);
        }

        public int hashCode() {
            EducationSectionFooter educationSectionFooter = this.sectionFooter;
            return ((educationSectionFooter == null ? 0 : educationSectionFooter.hashCode()) * 31) + this.eventContext.hashCode();
        }

        public String toString() {
            return "BackAndNextButton(sectionFooter=" + this.sectionFooter + ", eventContext=" + this.eventContext + ")";
        }

        public final EducationSectionFooter getSectionFooter() {
            return this.sectionFooter;
        }

        public final Context getEventContext() {
            return this.eventContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackAndNextButton(EducationSectionFooter educationSectionFooter, Context eventContext) {
            super(null);
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            this.sectionFooter = educationSectionFooter;
            this.eventContext = eventContext;
        }
    }

    /* compiled from: EducationLessonStandardFooterData.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$CtaButtons;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData;", "primaryCta", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$CtaButton;", "secondaryCta", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/contentful/markdown/MarkdownContent;", "learningLesson", "Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "eventItemPosition", "", "eventItemCount", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$CtaButton;Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$CtaButton;Lcom/robinhood/contentful/markdown/MarkdownContent;Lcom/robinhood/rosetta/eventlogging/LearningLesson;II)V", "getPrimaryCta", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$CtaButton;", "getSecondaryCta", "getDisclosure", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getLearningLesson", "()Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "getEventItemPosition", "()I", "getEventItemCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CtaButtons extends EducationLessonStandardFooterData {
        public static final int $stable = 8;
        private final MarkdownContent disclosure;
        private final int eventItemCount;
        private final int eventItemPosition;
        private final LearningLesson learningLesson;
        private final EducationLesson.CtaButton primaryCta;
        private final EducationLesson.CtaButton secondaryCta;

        public static /* synthetic */ CtaButtons copy$default(CtaButtons ctaButtons, EducationLesson.CtaButton ctaButton, EducationLesson.CtaButton ctaButton2, MarkdownContent markdownContent, LearningLesson learningLesson, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                ctaButton = ctaButtons.primaryCta;
            }
            if ((i3 & 2) != 0) {
                ctaButton2 = ctaButtons.secondaryCta;
            }
            if ((i3 & 4) != 0) {
                markdownContent = ctaButtons.disclosure;
            }
            if ((i3 & 8) != 0) {
                learningLesson = ctaButtons.learningLesson;
            }
            if ((i3 & 16) != 0) {
                i = ctaButtons.eventItemPosition;
            }
            if ((i3 & 32) != 0) {
                i2 = ctaButtons.eventItemCount;
            }
            int i4 = i;
            int i5 = i2;
            return ctaButtons.copy(ctaButton, ctaButton2, markdownContent, learningLesson, i4, i5);
        }

        /* renamed from: component1, reason: from getter */
        public final EducationLesson.CtaButton getPrimaryCta() {
            return this.primaryCta;
        }

        /* renamed from: component2, reason: from getter */
        public final EducationLesson.CtaButton getSecondaryCta() {
            return this.secondaryCta;
        }

        /* renamed from: component3, reason: from getter */
        public final MarkdownContent getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component4, reason: from getter */
        public final LearningLesson getLearningLesson() {
            return this.learningLesson;
        }

        /* renamed from: component5, reason: from getter */
        public final int getEventItemPosition() {
            return this.eventItemPosition;
        }

        /* renamed from: component6, reason: from getter */
        public final int getEventItemCount() {
            return this.eventItemCount;
        }

        public final CtaButtons copy(EducationLesson.CtaButton primaryCta, EducationLesson.CtaButton secondaryCta, MarkdownContent disclosure, LearningLesson learningLesson, int eventItemPosition, int eventItemCount) {
            Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            return new CtaButtons(primaryCta, secondaryCta, disclosure, learningLesson, eventItemPosition, eventItemCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CtaButtons)) {
                return false;
            }
            CtaButtons ctaButtons = (CtaButtons) other;
            return Intrinsics.areEqual(this.primaryCta, ctaButtons.primaryCta) && Intrinsics.areEqual(this.secondaryCta, ctaButtons.secondaryCta) && Intrinsics.areEqual(this.disclosure, ctaButtons.disclosure) && Intrinsics.areEqual(this.learningLesson, ctaButtons.learningLesson) && this.eventItemPosition == ctaButtons.eventItemPosition && this.eventItemCount == ctaButtons.eventItemCount;
        }

        public int hashCode() {
            int iHashCode = this.primaryCta.hashCode() * 31;
            EducationLesson.CtaButton ctaButton = this.secondaryCta;
            int iHashCode2 = (((iHashCode + (ctaButton == null ? 0 : ctaButton.hashCode())) * 31) + this.disclosure.hashCode()) * 31;
            LearningLesson learningLesson = this.learningLesson;
            return ((((iHashCode2 + (learningLesson != null ? learningLesson.hashCode() : 0)) * 31) + Integer.hashCode(this.eventItemPosition)) * 31) + Integer.hashCode(this.eventItemCount);
        }

        public String toString() {
            return "CtaButtons(primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", disclosure=" + this.disclosure + ", learningLesson=" + this.learningLesson + ", eventItemPosition=" + this.eventItemPosition + ", eventItemCount=" + this.eventItemCount + ")";
        }

        public final EducationLesson.CtaButton getPrimaryCta() {
            return this.primaryCta;
        }

        public final EducationLesson.CtaButton getSecondaryCta() {
            return this.secondaryCta;
        }

        public final MarkdownContent getDisclosure() {
            return this.disclosure;
        }

        public final LearningLesson getLearningLesson() {
            return this.learningLesson;
        }

        public final int getEventItemPosition() {
            return this.eventItemPosition;
        }

        public final int getEventItemCount() {
            return this.eventItemCount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CtaButtons(EducationLesson.CtaButton primaryCta, EducationLesson.CtaButton ctaButton, MarkdownContent disclosure, LearningLesson learningLesson, int i, int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            this.primaryCta = primaryCta;
            this.secondaryCta = ctaButton;
            this.disclosure = disclosure;
            this.learningLesson = learningLesson;
            this.eventItemPosition = i;
            this.eventItemCount = i2;
        }
    }
}
