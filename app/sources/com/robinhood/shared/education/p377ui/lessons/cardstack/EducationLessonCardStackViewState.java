package com.robinhood.shared.education.p377ui.lessons.cardstack;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.education.CryptoLearnAndEarnLoggingData;
import com.robinhood.rosetta.converters.engagement.LearningLessons;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.extensions.EducationLessonSections;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationClaimRewardResult;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonHeaderMedia;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer2;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSectionHeaderMedia;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: EducationLessonCardStackViewState.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0004uvwxB\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\t\u0010e\u001a\u00020\u0003HÂ\u0003J\t\u0010f\u001a\u00020\u0005HÂ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0019\u0010j\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0011HÂ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0013HÂ\u0003J\t\u0010m\u001a\u00020\u0015HÂ\u0003J\t\u0010n\u001a\u00020\u0017HÂ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u009d\u0001\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010q\u001a\u00020\u00152\b\u0010r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010s\u001a\u00020\u0007HÖ\u0001J\t\u0010t\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0014\u0010.\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0015\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u001a\u00104\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b5\u00102R\u001a\u00106\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b7\u00102R\u0011\u00108\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b8\u0010$R\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001cR\u0014\u0010E\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010$R\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010K\u001a\u0004\u0018\u00010L¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010O\u001a\u0004\u0018\u00010P¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010S\u001a\u0004\u0018\u00010P¢\u0006\b\n\u0000\u001a\u0004\bT\u0010RR\u0013\u0010U\u001a\u0004\u0018\u00010V¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010[\u001a\u00060\\j\u0002`]¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0013\u0010`\u001a\u0004\u0018\u00010a8F¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006y"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState;", "", "status", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status;", "source", "", "sectionPosition", "", "showNextButtonEvent", "Lcom/robinhood/udf/UiEvent;", "", "hideNextButtonEvent", "quizAnswers", "Ljava/util/HashSet;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationQuizAnswer;", "Lkotlin/collections/HashSet;", "earnabilityRewardState", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationEarnability$RewardState;", "claimRewardResult", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult;", "hasRequestedRewardClaim", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "postRewardDeeplink", "<init>", "(Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status;Ljava/lang/String;ILcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/util/HashSet;Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationEarnability$RewardState;Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult;ZLcom/robinhood/android/designsystem/style/DayNightOverlay;Ljava/lang/String;)V", "getSectionPosition", "()I", "getShowNextButtonEvent", "()Lcom/robinhood/udf/UiEvent;", "getHideNextButtonEvent", "getQuizAnswers", "()Ljava/util/HashSet;", "showLoading", "getShowLoading", "()Z", "showError", "getShowError", "educationLesson", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "trackingId", "getTrackingId", "()Ljava/lang/String;", "progress", "getProgress", "maxProgress", "getMaxProgress", "percentComplete", "getPercentComplete", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "foregroundColor", "getForegroundColor", "backgroundColor", "getBackgroundColor", "isDayTheme", "backgroundImageUrl", "Lokhttp3/HttpUrl;", "getBackgroundImageUrl", "()Lokhttp3/HttpUrl;", "lessonSectionItems", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection;", "getLessonSectionItems", "()Ljava/util/List;", "showCompletion", "correctQuizResponseCount", "getCorrectQuizResponseCount", "wasQuizPassed", "getWasQuizPassed", "lessonCompletionState", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState;", "getLessonCompletionState", "()Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState;", "completionSection", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection$Info;", "getCompletionSection", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection$Info;", "primaryCta", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$CtaButton;", "getPrimaryCta", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$CtaButton;", "secondaryCta", "getSecondaryCta", "eventLearningLesson", "Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "getEventLearningLesson", "()Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "eventLearningSection", "Lcom/robinhood/rosetta/eventlogging/LearningSection;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "learnAndEarnLoggingData", "Lcom/robinhood/education/CryptoLearnAndEarnLoggingData;", "getLearnAndEarnLoggingData", "()Lcom/robinhood/education/CryptoLearnAndEarnLoggingData;", "createSectionItems", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "Status", "LessonCompletionState", "ClaimRewardResult", "RewardState", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class EducationLessonCardStackViewState {
    public static final int $stable = 8;
    private final Integer backgroundColor;
    private final ClaimRewardResult claimRewardResult;
    private final EducationLessonSection.Info completionSection;
    private final DayNightOverlay dayNightOverlay;
    private final ApiEducationEarnability.RewardState earnabilityRewardState;
    private final EducationLesson educationLesson;
    private final Context eventContext;
    private final LearningLesson eventLearningLesson;
    private final LearningSection eventLearningSection;
    private final Integer foregroundColor;
    private final boolean hasRequestedRewardClaim;
    private final UiEvent<Unit> hideNextButtonEvent;
    private final List<EducationLessonSection> lessonSectionItems;
    private final Integer percentComplete;
    private final String postRewardDeeplink;
    private final EducationLesson.CtaButton primaryCta;
    private final HashSet<EducationQuizAnswer> quizAnswers;
    private final EducationLesson.CtaButton secondaryCta;
    private final int sectionPosition;
    private final boolean showCompletion;
    private final boolean showError;
    private final boolean showLoading;
    private final UiEvent<Unit> showNextButtonEvent;
    private final String source;
    private final Status status;
    private final String trackingId;

    /* compiled from: EducationLessonCardStackViewState.kt */
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

    public EducationLessonCardStackViewState() {
        this(null, null, 0, null, null, null, null, null, false, null, null, 2047, null);
    }

    /* renamed from: component1, reason: from getter */
    private final Status getStatus() {
        return this.status;
    }

    /* renamed from: component10, reason: from getter */
    private final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    /* renamed from: component11, reason: from getter */
    private final String getPostRewardDeeplink() {
        return this.postRewardDeeplink;
    }

    /* renamed from: component2, reason: from getter */
    private final String getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    private final ApiEducationEarnability.RewardState getEarnabilityRewardState() {
        return this.earnabilityRewardState;
    }

    /* renamed from: component8, reason: from getter */
    private final ClaimRewardResult getClaimRewardResult() {
        return this.claimRewardResult;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getHasRequestedRewardClaim() {
        return this.hasRequestedRewardClaim;
    }

    public static /* synthetic */ EducationLessonCardStackViewState copy$default(EducationLessonCardStackViewState educationLessonCardStackViewState, Status status, String str, int i, UiEvent uiEvent, UiEvent uiEvent2, HashSet hashSet, ApiEducationEarnability.RewardState rewardState, ClaimRewardResult claimRewardResult, boolean z, DayNightOverlay dayNightOverlay, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            status = educationLessonCardStackViewState.status;
        }
        if ((i2 & 2) != 0) {
            str = educationLessonCardStackViewState.source;
        }
        if ((i2 & 4) != 0) {
            i = educationLessonCardStackViewState.sectionPosition;
        }
        if ((i2 & 8) != 0) {
            uiEvent = educationLessonCardStackViewState.showNextButtonEvent;
        }
        if ((i2 & 16) != 0) {
            uiEvent2 = educationLessonCardStackViewState.hideNextButtonEvent;
        }
        if ((i2 & 32) != 0) {
            hashSet = educationLessonCardStackViewState.quizAnswers;
        }
        if ((i2 & 64) != 0) {
            rewardState = educationLessonCardStackViewState.earnabilityRewardState;
        }
        if ((i2 & 128) != 0) {
            claimRewardResult = educationLessonCardStackViewState.claimRewardResult;
        }
        if ((i2 & 256) != 0) {
            z = educationLessonCardStackViewState.hasRequestedRewardClaim;
        }
        if ((i2 & 512) != 0) {
            dayNightOverlay = educationLessonCardStackViewState.dayNightOverlay;
        }
        if ((i2 & 1024) != 0) {
            str2 = educationLessonCardStackViewState.postRewardDeeplink;
        }
        DayNightOverlay dayNightOverlay2 = dayNightOverlay;
        String str3 = str2;
        ClaimRewardResult claimRewardResult2 = claimRewardResult;
        boolean z2 = z;
        HashSet hashSet2 = hashSet;
        ApiEducationEarnability.RewardState rewardState2 = rewardState;
        UiEvent uiEvent3 = uiEvent2;
        int i3 = i;
        return educationLessonCardStackViewState.copy(status, str, i3, uiEvent, uiEvent3, hashSet2, rewardState2, claimRewardResult2, z2, dayNightOverlay2, str3);
    }

    /* renamed from: component3, reason: from getter */
    public final int getSectionPosition() {
        return this.sectionPosition;
    }

    public final UiEvent<Unit> component4() {
        return this.showNextButtonEvent;
    }

    public final UiEvent<Unit> component5() {
        return this.hideNextButtonEvent;
    }

    public final HashSet<EducationQuizAnswer> component6() {
        return this.quizAnswers;
    }

    public final EducationLessonCardStackViewState copy(Status status, String source, int sectionPosition, UiEvent<Unit> showNextButtonEvent, UiEvent<Unit> hideNextButtonEvent, HashSet<EducationQuizAnswer> quizAnswers, ApiEducationEarnability.RewardState earnabilityRewardState, ClaimRewardResult claimRewardResult, boolean hasRequestedRewardClaim, DayNightOverlay dayNightOverlay, String postRewardDeeplink) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(quizAnswers, "quizAnswers");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        return new EducationLessonCardStackViewState(status, source, sectionPosition, showNextButtonEvent, hideNextButtonEvent, quizAnswers, earnabilityRewardState, claimRewardResult, hasRequestedRewardClaim, dayNightOverlay, postRewardDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationLessonCardStackViewState)) {
            return false;
        }
        EducationLessonCardStackViewState educationLessonCardStackViewState = (EducationLessonCardStackViewState) other;
        return Intrinsics.areEqual(this.status, educationLessonCardStackViewState.status) && Intrinsics.areEqual(this.source, educationLessonCardStackViewState.source) && this.sectionPosition == educationLessonCardStackViewState.sectionPosition && Intrinsics.areEqual(this.showNextButtonEvent, educationLessonCardStackViewState.showNextButtonEvent) && Intrinsics.areEqual(this.hideNextButtonEvent, educationLessonCardStackViewState.hideNextButtonEvent) && Intrinsics.areEqual(this.quizAnswers, educationLessonCardStackViewState.quizAnswers) && this.earnabilityRewardState == educationLessonCardStackViewState.earnabilityRewardState && Intrinsics.areEqual(this.claimRewardResult, educationLessonCardStackViewState.claimRewardResult) && this.hasRequestedRewardClaim == educationLessonCardStackViewState.hasRequestedRewardClaim && this.dayNightOverlay == educationLessonCardStackViewState.dayNightOverlay && Intrinsics.areEqual(this.postRewardDeeplink, educationLessonCardStackViewState.postRewardDeeplink);
    }

    public int hashCode() {
        int iHashCode = ((((this.status.hashCode() * 31) + this.source.hashCode()) * 31) + Integer.hashCode(this.sectionPosition)) * 31;
        UiEvent<Unit> uiEvent = this.showNextButtonEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.hideNextButtonEvent;
        int iHashCode3 = (((iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + this.quizAnswers.hashCode()) * 31;
        ApiEducationEarnability.RewardState rewardState = this.earnabilityRewardState;
        int iHashCode4 = (iHashCode3 + (rewardState == null ? 0 : rewardState.hashCode())) * 31;
        ClaimRewardResult claimRewardResult = this.claimRewardResult;
        int iHashCode5 = (((((iHashCode4 + (claimRewardResult == null ? 0 : claimRewardResult.hashCode())) * 31) + Boolean.hashCode(this.hasRequestedRewardClaim)) * 31) + this.dayNightOverlay.hashCode()) * 31;
        String str = this.postRewardDeeplink;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "EducationLessonCardStackViewState(status=" + this.status + ", source=" + this.source + ", sectionPosition=" + this.sectionPosition + ", showNextButtonEvent=" + this.showNextButtonEvent + ", hideNextButtonEvent=" + this.hideNextButtonEvent + ", quizAnswers=" + this.quizAnswers + ", earnabilityRewardState=" + this.earnabilityRewardState + ", claimRewardResult=" + this.claimRewardResult + ", hasRequestedRewardClaim=" + this.hasRequestedRewardClaim + ", dayNightOverlay=" + this.dayNightOverlay + ", postRewardDeeplink=" + this.postRewardDeeplink + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EducationLessonCardStackViewState(Status status, String source, int i, UiEvent<Unit> uiEvent, UiEvent<Unit> uiEvent2, HashSet<EducationQuizAnswer> quizAnswers, ApiEducationEarnability.RewardState rewardState, ClaimRewardResult claimRewardResult, boolean z, DayNightOverlay dayNightOverlay, String str) {
        Integer numValueOf;
        Integer numValueOf2;
        EducationLessonSection.Info info;
        LearningLesson protobuf;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(quizAnswers, "quizAnswers");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        this.status = status;
        this.source = source;
        this.sectionPosition = i;
        this.showNextButtonEvent = uiEvent;
        this.hideNextButtonEvent = uiEvent2;
        this.quizAnswers = quizAnswers;
        this.earnabilityRewardState = rewardState;
        this.claimRewardResult = claimRewardResult;
        this.hasRequestedRewardClaim = z;
        this.dayNightOverlay = dayNightOverlay;
        this.postRewardDeeplink = str;
        this.showLoading = status instanceof Status.Loading;
        this.showError = status instanceof Status.Failure;
        Status.Success success = status instanceof Status.Success ? (Status.Success) status : null;
        EducationLesson lesson = success != null ? success.getLesson() : null;
        this.educationLesson = lesson;
        this.trackingId = lesson != null ? lesson.getTrackingId() : null;
        this.percentComplete = getMaxProgress() > 0 ? Integer.valueOf(RangesKt.coerceAtMost((getProgress() * 100) / getMaxProgress(), 100)) : null;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[dayNightOverlay.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = lesson != null ? Integer.valueOf(lesson.getNightForegroundColor()) : null;
        } else if (lesson != null) {
            numValueOf = Integer.valueOf(lesson.getDayForegroundColor());
        }
        this.foregroundColor = numValueOf;
        int i3 = iArr[dayNightOverlay.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf2 = lesson != null ? Integer.valueOf(lesson.getNightBackgroundColor()) : null;
        } else if (lesson != null) {
            numValueOf2 = Integer.valueOf(lesson.getDayBackgroundColor());
        }
        this.backgroundColor = numValueOf2;
        List<EducationLessonSection> listCreateSectionItems = createSectionItems();
        this.lessonSectionItems = listCreateSectionItems;
        boolean z2 = (status instanceof Status.Success) && i == CollectionsKt.getLastIndex(listCreateSectionItems);
        this.showCompletion = z2;
        if (Intrinsics.areEqual(getLessonCompletionState(), LessonCompletionState.ShowFinalSection.INSTANCE)) {
            Object objLast = CollectionsKt.last((List<? extends Object>) listCreateSectionItems);
            info = objLast instanceof EducationLessonSection.Info ? (EducationLessonSection.Info) objLast : null;
        }
        this.completionSection = info;
        this.primaryCta = lesson != null ? lesson.getPrimaryCta() : null;
        this.secondaryCta = lesson != null ? lesson.getSecondaryCta() : null;
        if (lesson != null) {
            protobuf = LearningLessons.toProtobuf(lesson, lesson.isCompleted() || z2);
        } else {
            protobuf = null;
        }
        this.eventLearningLesson = protobuf;
        EducationLessonSection educationLessonSection = (EducationLessonSection) CollectionsKt.getOrNull(listCreateSectionItems, i);
        LearningSection protobuf2 = educationLessonSection != null ? EducationLessonSections.toProtobuf(educationLessonSection, i + 1, listCreateSectionItems.size()) : null;
        this.eventLearningSection = protobuf2;
        this.eventContext = new Context(i + 1, listCreateSectionItems.size(), 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, protobuf, protobuf2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -201326596, -1, -1, -1, -1, -1, 16383, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EducationLessonCardStackViewState(com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState.Status r3, java.lang.String r4, int r5, com.robinhood.udf.UiEvent r6, com.robinhood.udf.UiEvent r7, java.util.HashSet r8, com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability.RewardState r9, com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState.ClaimRewardResult r10, boolean r11, com.robinhood.android.designsystem.style.DayNightOverlay r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r2 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L6
            com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState$Status$Loading r3 = com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState.Status.Loading.INSTANCE
        L6:
            r15 = r14 & 2
            if (r15 == 0) goto Lc
            java.lang.String r4 = ""
        Lc:
            r15 = r14 & 4
            r0 = 0
            if (r15 == 0) goto L12
            r5 = r0
        L12:
            r15 = r14 & 8
            r1 = 0
            if (r15 == 0) goto L18
            r6 = r1
        L18:
            r15 = r14 & 16
            if (r15 == 0) goto L1d
            r7 = r1
        L1d:
            r15 = r14 & 32
            if (r15 == 0) goto L26
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
        L26:
            r15 = r14 & 64
            if (r15 == 0) goto L2b
            r9 = r1
        L2b:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L30
            r10 = r1
        L30:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L35
            r11 = r0
        L35:
            r15 = r14 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L3b
            com.robinhood.android.designsystem.style.DayNightOverlay r12 = com.robinhood.android.designsystem.style.DayNightOverlay.DAY
        L3b:
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L4c
            r15 = r1
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L58
        L4c:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L58:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.education.p377ui.lessons.cardstack.EducationLessonCardStackViewState.<init>(com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState$Status, java.lang.String, int, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, java.util.HashSet, com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability$RewardState, com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState$ClaimRewardResult, boolean, com.robinhood.android.designsystem.style.DayNightOverlay, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getSectionPosition() {
        return this.sectionPosition;
    }

    public final UiEvent<Unit> getShowNextButtonEvent() {
        return this.showNextButtonEvent;
    }

    public final UiEvent<Unit> getHideNextButtonEvent() {
        return this.hideNextButtonEvent;
    }

    public final HashSet<EducationQuizAnswer> getQuizAnswers() {
        return this.quizAnswers;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    private final int getProgress() {
        return this.sectionPosition + 1;
    }

    private final int getMaxProgress() {
        List<EducationLessonSection> sections;
        EducationLesson educationLesson = this.educationLesson;
        if (educationLesson == null || (sections = educationLesson.getSections()) == null) {
            return 0;
        }
        return sections.size();
    }

    public final Integer getPercentComplete() {
        return this.percentComplete;
    }

    public final Integer getForegroundColor() {
        return this.foregroundColor;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean isDayTheme() {
        return this.dayNightOverlay == DayNightOverlay.DAY;
    }

    public final HttpUrl getBackgroundImageUrl() {
        EducationLessonHeaderMedia educationLessonHeaderMedia;
        List<EducationLessonHeaderMedia> headerMedia;
        Object next;
        EducationLesson educationLesson = this.educationLesson;
        if (educationLesson == null || (headerMedia = educationLesson.getHeaderMedia()) == null) {
            educationLessonHeaderMedia = null;
        } else {
            Iterator<T> it = headerMedia.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((EducationLessonHeaderMedia) next).getMediaType() == EducationLessonHeaderMedia.LessonHeaderMediaType.IMAGE) {
                    break;
                }
            }
            educationLessonHeaderMedia = (EducationLessonHeaderMedia) next;
        }
        if (educationLessonHeaderMedia != null) {
            return educationLessonHeaderMedia.getAssetUrl();
        }
        return null;
    }

    public final List<EducationLessonSection> getLessonSectionItems() {
        return this.lessonSectionItems;
    }

    private final int getCorrectQuizResponseCount() {
        HashSet<EducationQuizAnswer> hashSet = this.quizAnswers;
        int i = 0;
        if (hashSet != null && hashSet.isEmpty()) {
            return 0;
        }
        Iterator<T> it = hashSet.iterator();
        while (it.hasNext()) {
            if (((EducationQuizAnswer) it.next()).getCorrectness() == EducationQuizAnswer2.CORRECT && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    private final boolean getWasQuizPassed() {
        int correctQuizResponseCount = getCorrectQuizResponseCount();
        Status status = this.status;
        Intrinsics.checkNotNull(status, "null cannot be cast to non-null type com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState.Status.Success");
        return correctQuizResponseCount >= ((Status.Success) status).getLesson().getQuizPassThreshold();
    }

    public final LessonCompletionState getLessonCompletionState() {
        boolean z = (this.status instanceof Status.Success) && this.sectionPosition == CollectionsKt.getLastIndex(this.lessonSectionItems);
        EducationLesson educationLesson = this.educationLesson;
        EducationLesson.Reward reward = educationLesson != null ? educationLesson.getReward() : null;
        boolean z2 = reward != null;
        boolean z3 = this.claimRewardResult != null;
        boolean z4 = this.earnabilityRewardState != ApiEducationEarnability.RewardState.DEFAULT;
        if (z && z2 && !z3 && getWasQuizPassed()) {
            return new LessonCompletionState.TryRewardClaim(this.hasRequestedRewardClaim ? null : new UiEvent(Unit.INSTANCE));
        }
        if (!z || !z2 || !z4) {
            if (z) {
                return LessonCompletionState.ShowFinalSection.INSTANCE;
            }
            return LessonCompletionState.NotComplete.INSTANCE;
        }
        Intrinsics.checkNotNull(reward);
        ClaimRewardResult claimRewardResult = this.claimRewardResult;
        int correctQuizResponseCount = getCorrectQuizResponseCount();
        int size = this.quizAnswers.size();
        Status status = this.status;
        Intrinsics.checkNotNull(status, "null cannot be cast to non-null type com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackViewState.Status.Success");
        return new LessonCompletionState.ShowRewardState(new RewardState(reward, claimRewardResult, correctQuizResponseCount, size, ((Status.Success) status).getLesson().getQuizPassThreshold(), this.postRewardDeeplink));
    }

    public final EducationLessonSection.Info getCompletionSection() {
        return this.completionSection;
    }

    public final EducationLesson.CtaButton getPrimaryCta() {
        return this.primaryCta;
    }

    public final EducationLesson.CtaButton getSecondaryCta() {
        return this.secondaryCta;
    }

    public final LearningLesson getEventLearningLesson() {
        return this.eventLearningLesson;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    public final CryptoLearnAndEarnLoggingData getLearnAndEarnLoggingData() {
        EducationLesson educationLesson = this.educationLesson;
        if ((educationLesson != null ? educationLesson.getReward() : null) != null) {
            return new CryptoLearnAndEarnLoggingData(this.eventContext, this.source);
        }
        return null;
    }

    private final List<EducationLessonSection> createSectionItems() {
        Object info;
        EducationLesson educationLesson = this.educationLesson;
        if (educationLesson == null || this.foregroundColor == null) {
            return CollectionsKt.emptyList();
        }
        List<EducationLessonSection> sections = educationLesson.getSections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
        for (EducationLessonSection educationLessonSection : sections) {
            if (educationLessonSection instanceof EducationLessonSection.Info) {
                info = EducationLessonSection.Info.copy$default((EducationLessonSection.Info) educationLessonSection, null, null, null, null, null, null, null, null, this.foregroundColor.intValue(), 0, 767, null);
            } else if (educationLessonSection instanceof EducationLessonSection.Quiz) {
                info = EducationLessonSection.Quiz.copy$default((EducationLessonSection.Quiz) educationLessonSection, null, null, null, null, null, null, null, null, this.foregroundColor.intValue(), 0, null, 1791, null);
            } else {
                String id = educationLessonSection.getId();
                List<EducationSectionHeaderMedia> headerMedia = educationLessonSection.getHeaderMedia();
                String title = educationLessonSection.getTitle();
                MarkdownContent content = educationLessonSection.getContent();
                Integer animationStartingFrame = educationLessonSection.getAnimationStartingFrame();
                Integer num = this.foregroundColor;
                info = new EducationLessonSection.Info(id, headerMedia, title, content, animationStartingFrame, null, null, "", num.intValue(), num.intValue(), 32, null);
            }
            arrayList.add(info);
        }
        List<EducationLessonSection> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        List<EducationLessonSection> list = mutableList;
        String str = this.educationLesson.getReward() == null ? "completion_section" : "quiz_completion_section";
        String completionTitle = this.educationLesson.getCompletionTitle();
        String completionTitle2 = this.educationLesson.getCompletionTitle();
        MarkdownContent completionMessage = this.educationLesson.getCompletionMessage();
        Integer num2 = this.foregroundColor;
        list.add(new EducationLessonSection.Info(str, null, completionTitle, completionMessage, null, null, null, completionTitle2, num2.intValue(), num2.intValue(), 32, null));
        return mutableList;
    }

    /* compiled from: EducationLessonCardStackViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status$Failure;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status$Loading;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status$Success;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Status {
        public static final int $stable = 0;

        public /* synthetic */ Status(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status$Loading;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading extends Status {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 702540931;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
                super(null);
            }
        }

        private Status() {
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status$Success;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status;", "lesson", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;)V", "getLesson", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Status {
            public static final int $stable = 8;
            private final EducationLesson lesson;

            public static /* synthetic */ Success copy$default(Success success, EducationLesson educationLesson, int i, Object obj) {
                if ((i & 1) != 0) {
                    educationLesson = success.lesson;
                }
                return success.copy(educationLesson);
            }

            /* renamed from: component1, reason: from getter */
            public final EducationLesson getLesson() {
                return this.lesson;
            }

            public final Success copy(EducationLesson lesson) {
                Intrinsics.checkNotNullParameter(lesson, "lesson");
                return new Success(lesson);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.lesson, ((Success) other).lesson);
            }

            public int hashCode() {
                return this.lesson.hashCode();
            }

            public String toString() {
                return "Success(lesson=" + this.lesson + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(EducationLesson lesson) {
                super(null);
                Intrinsics.checkNotNullParameter(lesson, "lesson");
                this.lesson = lesson;
            }

            public final EducationLesson getLesson() {
                return this.lesson;
            }
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status$Failure;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$Status;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends Status {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            public boolean equals(Object other) {
                return this == other || (other instanceof Failure);
            }

            public int hashCode() {
                return -720683823;
            }

            public String toString() {
                return "Failure";
            }

            private Failure() {
                super(null);
            }
        }
    }

    /* compiled from: EducationLessonCardStackViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState;", "", "<init>", "()V", "NotComplete", "ShowFinalSection", "TryRewardClaim", "ShowRewardState", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState$NotComplete;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState$ShowFinalSection;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState$ShowRewardState;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState$TryRewardClaim;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class LessonCompletionState {
        public static final int $stable = 0;

        public /* synthetic */ LessonCompletionState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState$NotComplete;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotComplete extends LessonCompletionState {
            public static final int $stable = 0;
            public static final NotComplete INSTANCE = new NotComplete();

            public boolean equals(Object other) {
                return this == other || (other instanceof NotComplete);
            }

            public int hashCode() {
                return 1228568600;
            }

            public String toString() {
                return "NotComplete";
            }

            private NotComplete() {
                super(null);
            }
        }

        private LessonCompletionState() {
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState$ShowFinalSection;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowFinalSection extends LessonCompletionState {
            public static final int $stable = 0;
            public static final ShowFinalSection INSTANCE = new ShowFinalSection();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowFinalSection);
            }

            public int hashCode() {
                return -1975469888;
            }

            public String toString() {
                return "ShowFinalSection";
            }

            private ShowFinalSection() {
                super(null);
            }
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState$TryRewardClaim;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState;", "claimEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getClaimEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TryRewardClaim extends LessonCompletionState {
            public static final int $stable = 8;
            private final UiEvent<Unit> claimEvent;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TryRewardClaim copy$default(TryRewardClaim tryRewardClaim, UiEvent uiEvent, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiEvent = tryRewardClaim.claimEvent;
                }
                return tryRewardClaim.copy(uiEvent);
            }

            public final UiEvent<Unit> component1() {
                return this.claimEvent;
            }

            public final TryRewardClaim copy(UiEvent<Unit> claimEvent) {
                return new TryRewardClaim(claimEvent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TryRewardClaim) && Intrinsics.areEqual(this.claimEvent, ((TryRewardClaim) other).claimEvent);
            }

            public int hashCode() {
                UiEvent<Unit> uiEvent = this.claimEvent;
                if (uiEvent == null) {
                    return 0;
                }
                return uiEvent.hashCode();
            }

            public String toString() {
                return "TryRewardClaim(claimEvent=" + this.claimEvent + ")";
            }

            public TryRewardClaim(UiEvent<Unit> uiEvent) {
                super(null);
                this.claimEvent = uiEvent;
            }

            public final UiEvent<Unit> getClaimEvent() {
                return this.claimEvent;
            }
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState$ShowRewardState;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$LessonCompletionState;", "rewardState", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState;", "<init>", "(Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState;)V", "getRewardState", "()Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowRewardState extends LessonCompletionState {
            public static final int $stable = 8;
            private final RewardState rewardState;

            public static /* synthetic */ ShowRewardState copy$default(ShowRewardState showRewardState, RewardState rewardState, int i, Object obj) {
                if ((i & 1) != 0) {
                    rewardState = showRewardState.rewardState;
                }
                return showRewardState.copy(rewardState);
            }

            /* renamed from: component1, reason: from getter */
            public final RewardState getRewardState() {
                return this.rewardState;
            }

            public final ShowRewardState copy(RewardState rewardState) {
                Intrinsics.checkNotNullParameter(rewardState, "rewardState");
                return new ShowRewardState(rewardState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowRewardState) && Intrinsics.areEqual(this.rewardState, ((ShowRewardState) other).rewardState);
            }

            public int hashCode() {
                return this.rewardState.hashCode();
            }

            public String toString() {
                return "ShowRewardState(rewardState=" + this.rewardState + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowRewardState(RewardState rewardState) {
                super(null);
                Intrinsics.checkNotNullParameter(rewardState, "rewardState");
                this.rewardState = rewardState;
            }

            public final RewardState getRewardState() {
                return this.rewardState;
            }
        }
    }

    /* compiled from: EducationLessonCardStackViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult;", "", "<init>", "()V", "ResultReceived", "NetworkError", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult$NetworkError;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult$ResultReceived;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ClaimRewardResult {
        public static final int $stable = 0;

        public /* synthetic */ ClaimRewardResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult$ResultReceived;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult;", "claimResult", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationClaimRewardResult;", "<init>", "(Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationClaimRewardResult;)V", "getClaimResult", "()Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationClaimRewardResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ResultReceived extends ClaimRewardResult {
            public static final int $stable = 8;
            private final ApiEducationClaimRewardResult claimResult;

            public static /* synthetic */ ResultReceived copy$default(ResultReceived resultReceived, ApiEducationClaimRewardResult apiEducationClaimRewardResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiEducationClaimRewardResult = resultReceived.claimResult;
                }
                return resultReceived.copy(apiEducationClaimRewardResult);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiEducationClaimRewardResult getClaimResult() {
                return this.claimResult;
            }

            public final ResultReceived copy(ApiEducationClaimRewardResult claimResult) {
                Intrinsics.checkNotNullParameter(claimResult, "claimResult");
                return new ResultReceived(claimResult);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResultReceived) && Intrinsics.areEqual(this.claimResult, ((ResultReceived) other).claimResult);
            }

            public int hashCode() {
                return this.claimResult.hashCode();
            }

            public String toString() {
                return "ResultReceived(claimResult=" + this.claimResult + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResultReceived(ApiEducationClaimRewardResult claimResult) {
                super(null);
                Intrinsics.checkNotNullParameter(claimResult, "claimResult");
                this.claimResult = claimResult;
            }

            public final ApiEducationClaimRewardResult getClaimResult() {
                return this.claimResult;
            }
        }

        private ClaimRewardResult() {
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult$NetworkError;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NetworkError extends ClaimRewardResult {
            public static final int $stable = 0;
            public static final NetworkError INSTANCE = new NetworkError();

            public boolean equals(Object other) {
                return this == other || (other instanceof NetworkError);
            }

            public int hashCode() {
                return 1009543587;
            }

            public String toString() {
                return "NetworkError";
            }

            private NetworkError() {
                super(null);
            }
        }
    }

    /* compiled from: EducationLessonCardStackViewState.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002;<B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0002J\t\u00100\u001a\u00020\u0003HÂ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u00102\u001a\u00020\u0007HÂ\u0003J\t\u00103\u001a\u00020\u0007HÂ\u0003J\t\u00104\u001a\u00020\u0007HÂ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÂ\u0003JI\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u00107\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0007HÖ\u0001J\t\u0010:\u001a\u00020\u000bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0011\u0010#\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0013\u0010$\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006="}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState;", "", "reward", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$Reward;", "claimRewardResult", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult;", "correctQuizResponseCount", "", "totalNumberOfQuizQuestions", "quizPassThreshold", "postRewardDeeplink", "", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$Reward;Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$ClaimRewardResult;IIILjava/lang/String;)V", "apiClaimResult", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationClaimRewardResult;", "rewardState", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationEarnability$RewardState;", "currencyCode", "status", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState$Status;", "getStatus", "()Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState$Status;", "postDoneButtonDeeplink", "getPostDoneButtonDeeplink", "()Ljava/lang/String;", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "messageText", "getMessageText", "isTryAgainButtonVisible", "", "()Z", "isInfoBannerVisible", "infoBannerText", "getInfoBannerText", "rewardResultCardState", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState$RewardResultCardState;", "getRewardResultCardState", "()Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState$RewardResultCardState;", "rewardLoggingComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getRewardLoggingComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "formatSuccessText", "successText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "RewardResultCardState", "Status", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RewardState {
        public static final int $stable = 8;
        private final ApiEducationClaimRewardResult apiClaimResult;
        private final ClaimRewardResult claimRewardResult;
        private final int correctQuizResponseCount;
        private final String currencyCode;
        private final String postRewardDeeplink;
        private final int quizPassThreshold;
        private final EducationLesson.Reward reward;
        private final ApiEducationEarnability.RewardState rewardState;
        private final int totalNumberOfQuizQuestions;

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Status.values().length];
                try {
                    iArr[Status.SUCCESSFULLY_CLAIMED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Status.QUIZ_NOT_PASSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Status.NETWORK_ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Status.NO_LONGER_AVAILABLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Status.ALREADY_CLAIMED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Status.NOT_ELIGIBLE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Status.NO_CRYPTO_ACCOUNT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Status.GENERIC_ERROR.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        private final EducationLesson.Reward getReward() {
            return this.reward;
        }

        /* renamed from: component2, reason: from getter */
        private final ClaimRewardResult getClaimRewardResult() {
            return this.claimRewardResult;
        }

        /* renamed from: component3, reason: from getter */
        private final int getCorrectQuizResponseCount() {
            return this.correctQuizResponseCount;
        }

        /* renamed from: component4, reason: from getter */
        private final int getTotalNumberOfQuizQuestions() {
            return this.totalNumberOfQuizQuestions;
        }

        /* renamed from: component5, reason: from getter */
        private final int getQuizPassThreshold() {
            return this.quizPassThreshold;
        }

        /* renamed from: component6, reason: from getter */
        private final String getPostRewardDeeplink() {
            return this.postRewardDeeplink;
        }

        public static /* synthetic */ RewardState copy$default(RewardState rewardState, EducationLesson.Reward reward, ClaimRewardResult claimRewardResult, int i, int i2, int i3, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                reward = rewardState.reward;
            }
            if ((i4 & 2) != 0) {
                claimRewardResult = rewardState.claimRewardResult;
            }
            if ((i4 & 4) != 0) {
                i = rewardState.correctQuizResponseCount;
            }
            if ((i4 & 8) != 0) {
                i2 = rewardState.totalNumberOfQuizQuestions;
            }
            if ((i4 & 16) != 0) {
                i3 = rewardState.quizPassThreshold;
            }
            if ((i4 & 32) != 0) {
                str = rewardState.postRewardDeeplink;
            }
            int i5 = i3;
            String str2 = str;
            return rewardState.copy(reward, claimRewardResult, i, i2, i5, str2);
        }

        public final RewardState copy(EducationLesson.Reward reward, ClaimRewardResult claimRewardResult, int correctQuizResponseCount, int totalNumberOfQuizQuestions, int quizPassThreshold, String postRewardDeeplink) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            return new RewardState(reward, claimRewardResult, correctQuizResponseCount, totalNumberOfQuizQuestions, quizPassThreshold, postRewardDeeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RewardState)) {
                return false;
            }
            RewardState rewardState = (RewardState) other;
            return Intrinsics.areEqual(this.reward, rewardState.reward) && Intrinsics.areEqual(this.claimRewardResult, rewardState.claimRewardResult) && this.correctQuizResponseCount == rewardState.correctQuizResponseCount && this.totalNumberOfQuizQuestions == rewardState.totalNumberOfQuizQuestions && this.quizPassThreshold == rewardState.quizPassThreshold && Intrinsics.areEqual(this.postRewardDeeplink, rewardState.postRewardDeeplink);
        }

        public int hashCode() {
            int iHashCode = this.reward.hashCode() * 31;
            ClaimRewardResult claimRewardResult = this.claimRewardResult;
            int iHashCode2 = (((((((iHashCode + (claimRewardResult == null ? 0 : claimRewardResult.hashCode())) * 31) + Integer.hashCode(this.correctQuizResponseCount)) * 31) + Integer.hashCode(this.totalNumberOfQuizQuestions)) * 31) + Integer.hashCode(this.quizPassThreshold)) * 31;
            String str = this.postRewardDeeplink;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "RewardState(reward=" + this.reward + ", claimRewardResult=" + this.claimRewardResult + ", correctQuizResponseCount=" + this.correctQuizResponseCount + ", totalNumberOfQuizQuestions=" + this.totalNumberOfQuizQuestions + ", quizPassThreshold=" + this.quizPassThreshold + ", postRewardDeeplink=" + this.postRewardDeeplink + ")";
        }

        public RewardState(EducationLesson.Reward reward, ClaimRewardResult claimRewardResult, int i, int i2, int i3, String str) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            this.reward = reward;
            this.claimRewardResult = claimRewardResult;
            this.correctQuizResponseCount = i;
            this.totalNumberOfQuizQuestions = i2;
            this.quizPassThreshold = i3;
            this.postRewardDeeplink = str;
            ClaimRewardResult.ResultReceived resultReceived = claimRewardResult instanceof ClaimRewardResult.ResultReceived ? (ClaimRewardResult.ResultReceived) claimRewardResult : null;
            ApiEducationClaimRewardResult claimResult = resultReceived != null ? resultReceived.getClaimResult() : null;
            this.apiClaimResult = claimResult;
            this.rewardState = claimResult != null ? claimResult.getCrypto_earnability() : null;
            this.currencyCode = claimResult != null ? claimResult.getCurrency_code() : null;
        }

        public final Status getStatus() {
            if (this.claimRewardResult instanceof ClaimRewardResult.NetworkError) {
                return Status.NETWORK_ERROR;
            }
            ApiEducationEarnability.RewardState rewardState = this.rewardState;
            return rewardState == ApiEducationEarnability.RewardState.USER_CAN_CLAIM ? Status.SUCCESSFULLY_CLAIMED : rewardState == ApiEducationEarnability.RewardState.REWARD_NOT_AVAILABLE ? Status.NO_LONGER_AVAILABLE : rewardState == ApiEducationEarnability.RewardState.REWARD_CLAIMED ? Status.ALREADY_CLAIMED : rewardState == ApiEducationEarnability.RewardState.USER_RESTRICTED ? Status.NOT_ELIGIBLE : rewardState == ApiEducationEarnability.RewardState.USER_NO_CRYPTO_ACCOUNT ? Status.NO_CRYPTO_ACCOUNT : this.correctQuizResponseCount < this.quizPassThreshold ? Status.QUIZ_NOT_PASSED : Status.GENERIC_ERROR;
        }

        public final String getPostDoneButtonDeeplink() {
            switch (WhenMappings.$EnumSwitchMapping$0[getStatus().ordinal()]) {
                case 1:
                    return this.postRewardDeeplink;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final StringResource getTitleText() {
            switch (WhenMappings.$EnumSwitchMapping$0[getStatus().ordinal()]) {
                case 1:
                    return StringResource.INSTANCE.invoke(formatSuccessText(this.reward.getClaimTitle()));
                case 2:
                case 8:
                    return StringResource.INSTANCE.invoke(C38790R.string.education_rewards_try_again_title, new Object[0]);
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return StringResource.INSTANCE.invoke(C38790R.string.education_rewards_congrats, new Object[0]);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final StringResource getMessageText() {
            String upperCase;
            switch (WhenMappings.$EnumSwitchMapping$0[getStatus().ordinal()]) {
                case 1:
                    return StringResource.INSTANCE.invoke(formatSuccessText(this.reward.getClaimSubtitle()));
                case 2:
                    return StringResource.INSTANCE.invoke(C38790R.string.education_rewards_try_again_message, Integer.valueOf(this.correctQuizResponseCount), Integer.valueOf(this.totalNumberOfQuizQuestions), Integer.valueOf(this.quizPassThreshold));
                case 3:
                    return StringResource.INSTANCE.invoke(C38790R.string.education_rewards_claim_failure_message, Integer.valueOf(this.correctQuizResponseCount), Integer.valueOf(this.totalNumberOfQuizQuestions));
                case 4:
                case 5:
                case 6:
                case 7:
                    String str = this.currencyCode;
                    if (str != null) {
                        upperCase = str.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    } else {
                        upperCase = null;
                    }
                    return Intrinsics.areEqual(upperCase, "AVAX") ? StringResource.INSTANCE.invoke(C38790R.string.education_rewards_not_eligible_message_avax, new Object[0]) : Intrinsics.areEqual(upperCase, "USDC") ? StringResource.INSTANCE.invoke(C38790R.string.education_rewards_not_eligible_message_usdc, new Object[0]) : StringResource.INSTANCE.invoke("");
                case 8:
                    return StringResource.INSTANCE.invoke("");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final boolean isTryAgainButtonVisible() {
            return getStatus() == Status.QUIZ_NOT_PASSED;
        }

        public final boolean isInfoBannerVisible() {
            return getInfoBannerText() != null;
        }

        public final StringResource getInfoBannerText() {
            switch (WhenMappings.$EnumSwitchMapping$0[getStatus().ordinal()]) {
                case 1:
                case 2:
                case 7:
                    return null;
                case 3:
                case 8:
                    return StringResource.INSTANCE.invoke(C38790R.string.education_rewards_claim_failure_info, new Object[0]);
                case 4:
                    return StringResource.INSTANCE.invoke(this.reward.getNotAvailableMessage());
                case 5:
                    return StringResource.INSTANCE.invoke(this.reward.getClaimedMessage());
                case 6:
                    return StringResource.INSTANCE.invoke(this.reward.getNotAvailableDueToUserRestrictionMessage());
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final RewardResultCardState getRewardResultCardState() {
            if (getStatus() != Status.SUCCESSFULLY_CLAIMED) {
                return null;
            }
            String typeTitle = this.reward.getTypeTitle();
            ApiEducationClaimRewardResult apiEducationClaimRewardResult = this.apiClaimResult;
            Intrinsics.checkNotNull(apiEducationClaimRewardResult);
            return new RewardResultCardState(typeTitle, apiEducationClaimRewardResult.getDisplay_format(), this.apiClaimResult.getCurrency_name(), this.apiClaimResult.getFiat_display_value());
        }

        public final Component getRewardLoggingComponent() {
            String str;
            switch (WhenMappings.$EnumSwitchMapping$0[getStatus().ordinal()]) {
                case 1:
                    str = "rewards-earned";
                    break;
                case 2:
                    str = "try-again";
                    break;
                case 3:
                    str = "rewards-something-wrong";
                    break;
                case 4:
                    str = "rewards-unavailable";
                    break;
                case 5:
                    str = "rewards-claimed";
                    break;
                case 6:
                    str = "restricted-account";
                    break;
                case 7:
                    str = "no-rhc-account";
                    break;
                case 8:
                    str = "";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new Component(null, str, null, 5, null);
        }

        private final String formatSuccessText(String successText) {
            ApiEducationClaimRewardResult apiEducationClaimRewardResult = this.apiClaimResult;
            Intrinsics.checkNotNull(apiEducationClaimRewardResult);
            return StringsKt.replace$default(successText, "%@", apiEducationClaimRewardResult.getFiat_display_value(), false, 4, (Object) null);
        }

        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState$RewardResultCardState;", "", "rewardTypeTitle", "", "rewardAssetAmount", "rewardAssetName", "rewardAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRewardTypeTitle", "()Ljava/lang/String;", "getRewardAssetAmount", "getRewardAssetName", "getRewardAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RewardResultCardState {
            public static final int $stable = 0;
            private final String rewardAmount;
            private final String rewardAssetAmount;
            private final String rewardAssetName;
            private final String rewardTypeTitle;

            public static /* synthetic */ RewardResultCardState copy$default(RewardResultCardState rewardResultCardState, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rewardResultCardState.rewardTypeTitle;
                }
                if ((i & 2) != 0) {
                    str2 = rewardResultCardState.rewardAssetAmount;
                }
                if ((i & 4) != 0) {
                    str3 = rewardResultCardState.rewardAssetName;
                }
                if ((i & 8) != 0) {
                    str4 = rewardResultCardState.rewardAmount;
                }
                return rewardResultCardState.copy(str, str2, str3, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getRewardTypeTitle() {
                return this.rewardTypeTitle;
            }

            /* renamed from: component2, reason: from getter */
            public final String getRewardAssetAmount() {
                return this.rewardAssetAmount;
            }

            /* renamed from: component3, reason: from getter */
            public final String getRewardAssetName() {
                return this.rewardAssetName;
            }

            /* renamed from: component4, reason: from getter */
            public final String getRewardAmount() {
                return this.rewardAmount;
            }

            public final RewardResultCardState copy(String rewardTypeTitle, String rewardAssetAmount, String rewardAssetName, String rewardAmount) {
                Intrinsics.checkNotNullParameter(rewardTypeTitle, "rewardTypeTitle");
                Intrinsics.checkNotNullParameter(rewardAssetAmount, "rewardAssetAmount");
                Intrinsics.checkNotNullParameter(rewardAssetName, "rewardAssetName");
                Intrinsics.checkNotNullParameter(rewardAmount, "rewardAmount");
                return new RewardResultCardState(rewardTypeTitle, rewardAssetAmount, rewardAssetName, rewardAmount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RewardResultCardState)) {
                    return false;
                }
                RewardResultCardState rewardResultCardState = (RewardResultCardState) other;
                return Intrinsics.areEqual(this.rewardTypeTitle, rewardResultCardState.rewardTypeTitle) && Intrinsics.areEqual(this.rewardAssetAmount, rewardResultCardState.rewardAssetAmount) && Intrinsics.areEqual(this.rewardAssetName, rewardResultCardState.rewardAssetName) && Intrinsics.areEqual(this.rewardAmount, rewardResultCardState.rewardAmount);
            }

            public int hashCode() {
                return (((((this.rewardTypeTitle.hashCode() * 31) + this.rewardAssetAmount.hashCode()) * 31) + this.rewardAssetName.hashCode()) * 31) + this.rewardAmount.hashCode();
            }

            public String toString() {
                return "RewardResultCardState(rewardTypeTitle=" + this.rewardTypeTitle + ", rewardAssetAmount=" + this.rewardAssetAmount + ", rewardAssetName=" + this.rewardAssetName + ", rewardAmount=" + this.rewardAmount + ")";
            }

            public RewardResultCardState(String rewardTypeTitle, String rewardAssetAmount, String rewardAssetName, String rewardAmount) {
                Intrinsics.checkNotNullParameter(rewardTypeTitle, "rewardTypeTitle");
                Intrinsics.checkNotNullParameter(rewardAssetAmount, "rewardAssetAmount");
                Intrinsics.checkNotNullParameter(rewardAssetName, "rewardAssetName");
                Intrinsics.checkNotNullParameter(rewardAmount, "rewardAmount");
                this.rewardTypeTitle = rewardTypeTitle;
                this.rewardAssetAmount = rewardAssetAmount;
                this.rewardAssetName = rewardAssetName;
                this.rewardAmount = rewardAmount;
            }

            public final String getRewardTypeTitle() {
                return this.rewardTypeTitle;
            }

            public final String getRewardAssetAmount() {
                return this.rewardAssetAmount;
            }

            public final String getRewardAssetName() {
                return this.rewardAssetName;
            }

            public final String getRewardAmount() {
                return this.rewardAmount;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: EducationLessonCardStackViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState$RewardState$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESSFULLY_CLAIMED", "QUIZ_NOT_PASSED", "NETWORK_ERROR", "NO_LONGER_AVAILABLE", "ALREADY_CLAIMED", "NOT_ELIGIBLE", "NO_CRYPTO_ACCOUNT", "GENERIC_ERROR", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status SUCCESSFULLY_CLAIMED = new Status("SUCCESSFULLY_CLAIMED", 0);
            public static final Status QUIZ_NOT_PASSED = new Status("QUIZ_NOT_PASSED", 1);
            public static final Status NETWORK_ERROR = new Status("NETWORK_ERROR", 2);
            public static final Status NO_LONGER_AVAILABLE = new Status("NO_LONGER_AVAILABLE", 3);
            public static final Status ALREADY_CLAIMED = new Status("ALREADY_CLAIMED", 4);
            public static final Status NOT_ELIGIBLE = new Status("NOT_ELIGIBLE", 5);
            public static final Status NO_CRYPTO_ACCOUNT = new Status("NO_CRYPTO_ACCOUNT", 6);
            public static final Status GENERIC_ERROR = new Status("GENERIC_ERROR", 7);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{SUCCESSFULLY_CLAIMED, QUIZ_NOT_PASSED, NETWORK_ERROR, NO_LONGER_AVAILABLE, ALREADY_CLAIMED, NOT_ELIGIBLE, NO_CRYPTO_ACCOUNT, GENERIC_ERROR};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i) {
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }
    }
}
