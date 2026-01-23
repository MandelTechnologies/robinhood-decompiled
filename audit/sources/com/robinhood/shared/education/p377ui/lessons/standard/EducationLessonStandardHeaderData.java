package com.robinhood.shared.education.p377ui.lessons.standard;

import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.education.p377ui.AnimationState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonStandardHeaderData.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B=\b\u0004\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0003\u0018\u0019\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData;", "", "foregroundColor", "", "backgroundColor", "progress", "progressBarMax", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;IILcom/robinhood/rosetta/eventlogging/Context;)V", "getForegroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "getProgress", "()I", "getProgressBarMax", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "None", "LessonAnimation", "SectionAsset", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData$LessonAnimation;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData$None;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData$SectionAsset;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class EducationLessonStandardHeaderData {
    public static final int $stable = 8;
    private final Integer backgroundColor;
    private final Context eventContext;
    private final Integer foregroundColor;
    private final int progress;
    private final int progressBarMax;

    public /* synthetic */ EducationLessonStandardHeaderData(Integer num, Integer num2, int i, int i2, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, i, i2, context);
    }

    private EducationLessonStandardHeaderData(Integer num, Integer num2, int i, int i2, Context context) {
        this.foregroundColor = num;
        this.backgroundColor = num2;
        this.progress = i;
        this.progressBarMax = i2;
        this.eventContext = context;
    }

    public final Integer getForegroundColor() {
        return this.foregroundColor;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getProgressBarMax() {
        return this.progressBarMax;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    /* compiled from: EducationLessonStandardHeaderData.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData$None;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData;", "foregroundColor", "", "backgroundColor", "progress", "progressBarMax", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;IILcom/robinhood/rosetta/eventlogging/Context;)V", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class None extends EducationLessonStandardHeaderData {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public None(Integer num, Integer num2, int i, int i2, Context eventContext) {
            super(num, num2, i, i2, eventContext, null);
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        }
    }

    /* compiled from: EducationLessonStandardHeaderData.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData$LessonAnimation;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData;", "animationUrl", "", "currentProgress", "", "animationState", "Lcom/robinhood/shared/education/ui/AnimationState;", "foregroundColor", "", "backgroundColor", "progress", "progressBarMax", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Ljava/lang/String;FLcom/robinhood/shared/education/ui/AnimationState;Ljava/lang/Integer;Ljava/lang/Integer;IILcom/robinhood/rosetta/eventlogging/Context;)V", "getAnimationUrl", "()Ljava/lang/String;", "getCurrentProgress", "()F", "getAnimationState", "()Lcom/robinhood/shared/education/ui/AnimationState;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LessonAnimation extends EducationLessonStandardHeaderData {
        public static final int $stable = 8;
        private final AnimationState animationState;
        private final String animationUrl;
        private final float currentProgress;

        public final String getAnimationUrl() {
            return this.animationUrl;
        }

        public final float getCurrentProgress() {
            return this.currentProgress;
        }

        public final AnimationState getAnimationState() {
            return this.animationState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LessonAnimation(String animationUrl, float f, AnimationState animationState, Integer num, Integer num2, int i, int i2, Context eventContext) {
            super(num, num2, i, i2, eventContext, null);
            Intrinsics.checkNotNullParameter(animationUrl, "animationUrl");
            Intrinsics.checkNotNullParameter(animationState, "animationState");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            this.animationUrl = animationUrl;
            this.currentProgress = f;
            this.animationState = animationState;
        }
    }

    /* compiled from: EducationLessonStandardHeaderData.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData$SectionAsset;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData;", "assetUrls", "", "Lcom/robinhood/shared/education/ui/lessons/standard/SectionAssetUrl;", "completionAnimationUrl", "", "foregroundColor", "", "backgroundColor", "sectionPosition", "isFinalSection", "", "progress", "progressBarMax", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;IZIILcom/robinhood/rosetta/eventlogging/Context;)V", "getAssetUrls", "()Ljava/util/List;", "getCompletionAnimationUrl", "()Ljava/lang/String;", "getSectionPosition", "()I", "()Z", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SectionAsset extends EducationLessonStandardHeaderData {
        public static final int $stable = 8;
        private final List<EducationLessonStandardHeaderData2> assetUrls;
        private final String completionAnimationUrl;
        private final boolean isFinalSection;
        private final int sectionPosition;

        public final List<EducationLessonStandardHeaderData2> getAssetUrls() {
            return this.assetUrls;
        }

        public final String getCompletionAnimationUrl() {
            return this.completionAnimationUrl;
        }

        public final int getSectionPosition() {
            return this.sectionPosition;
        }

        /* renamed from: isFinalSection, reason: from getter */
        public final boolean getIsFinalSection() {
            return this.isFinalSection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SectionAsset(List<? extends EducationLessonStandardHeaderData2> assetUrls, String str, Integer num, Integer num2, int i, boolean z, int i2, int i3, Context eventContext) {
            super(num, num2, i2, i3, eventContext, null);
            Intrinsics.checkNotNullParameter(assetUrls, "assetUrls");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            this.assetUrls = assetUrls;
            this.completionAnimationUrl = str;
            this.sectionPosition = i;
            this.isFinalSection = z;
        }
    }
}
