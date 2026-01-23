package com.robinhood.shared.education.p377ui.lessons.standard;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.education.CryptoLearnAndEarnLoggingData;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.converters.engagement.LearningLessons;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.extensions.EducationLessonSections;
import com.robinhood.shared.education.p377ui.AnimationState;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardFooterData;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardHeaderData;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardHeaderData2;
import com.robinhood.shared.education.p377ui.onboarding.CryptoLearnAndEarnUtils;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonHeaderMedia;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSectionFooter;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSectionHeaderMedia;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import okhttp3.HttpUrl;

/* compiled from: EducationLessonStandardViewState.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 \u007f2\u00020\u0001:\u0003}~\u007fBk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010f\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J)\u0010g\u001a\u00020T2\b\u0010h\u001a\u0004\u0018\u00010i2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010j\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010kJ\b\u0010l\u001a\u00020TH\u0002J\t\u0010m\u001a\u00020\u0003HÂ\u0003J\t\u0010n\u001a\u00020\u0005HÂ\u0003J\t\u0010o\u001a\u00020\u0005HÂ\u0003J\t\u0010p\u001a\u00020\bHÆ\u0003J\t\u0010q\u001a\u00020\bHÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0002\u0010sJ\t\u0010t\u001a\u00020\rHÆ\u0003J\u0011\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÂ\u0003J\t\u0010v\u001a\u00020\u0012HÂ\u0003Jr\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001¢\u0006\u0002\u0010xJ\u0013\u0010y\u001a\u00020\u00122\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010{\u001a\u00020\bHÖ\u0001J\t\u0010|\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u00103\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001dR\u0011\u00107\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001dR\u0016\u00109\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010<\u001a\u0004\u0018\u00010=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010J\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\bK\u0010*R\u0015\u0010L\u001a\u00060Mj\u0002`N¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u000e\u0010Q\u001a\u00020RX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010S\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010W\u001a\u00020X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0013\u0010[\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\\\u00105R\u0019\u0010]\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0019\u0010a\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bc\u0010`R\u0019\u0010d\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\be\u0010`¨\u0006\u0080\u0001"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState;", "", "status", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status;", "source", "", "contentfulId", "sectionPosition", "", "previousSectionPosition", "totalFrames", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "earnabilityCheckEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationEarnability;", "hasShownCryptoLearnAndEarnOnboarding", "", "<init>", "(Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Float;Lcom/robinhood/android/designsystem/style/DayNightOverlay;Lcom/robinhood/udf/UiEvent;Z)V", "getSectionPosition", "()I", "getPreviousSectionPosition", "Ljava/lang/Float;", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "showLoading", "getShowLoading", "()Z", "showError", "getShowError", "showLesson", "getShowLesson", "educationLesson", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "getEducationLesson", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "educationReward", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$Reward;", "foregroundColor", "getForegroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "backgroundColor", "getBackgroundColor", "lessonSectionItems", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection;", "getLessonSectionItems", "()Ljava/util/List;", "trackingId", "getTrackingId", "()Ljava/lang/String;", "isOnCompletionPage", "shouldMarkAsComplete", "getShouldMarkAsComplete", "currentSectionItem", "getCurrentSectionItem", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection;", "eventLearningLesson", "Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "getEventLearningLesson", "()Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "eventLearningSection", "Lcom/robinhood/rosetta/eventlogging/LearningSection;", "learnAndEarnLoggingData", "Lcom/robinhood/education/CryptoLearnAndEarnLoggingData;", "getLearnAndEarnLoggingData", "()Lcom/robinhood/education/CryptoLearnAndEarnLoggingData;", "isFirstSection", "isFinalSection", "progress", "maxProgress", "percentComplete", "getPercentComplete", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "defaultNoneHeaderData", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData$None;", "currentSectionHeader", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData;", "getCurrentSectionHeader", "()Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData;", "currentSectionFooter", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData;", "getCurrentSectionFooter", "()Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData;", "exitSurveyEvent", "getExitSurveyEvent", "educationErrorAlertEvent", "", "getEducationErrorAlertEvent", "()Lcom/robinhood/udf/UiEvent;", "rewardStateDialogEvent", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$RewardUnavailableDialogState;", "getRewardStateDialogEvent", "showCryptoLearnAndEarnOnboardingEvent", "getShowCryptoLearnAndEarnOnboardingEvent", "createSectionItems", "createContinuousLessonHeaderAnimation", "animationUrl", "Lokhttp3/HttpUrl;", "animationStartingFrame", "(Lokhttp3/HttpUrl;FLjava/lang/Integer;)Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData;", "createSectionDefinedLessonHeader", "component1", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Float;", "component7", "component8", "component9", "copy", "(Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Float;Lcom/robinhood/android/designsystem/style/DayNightOverlay;Lcom/robinhood/udf/UiEvent;Z)Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState;", "equals", "other", "hashCode", "toString", "Status", "RewardUnavailableDialogState", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class EducationLessonStandardViewState {
    private final Integer backgroundColor;
    private final String contentfulId;
    private final DayNightOverlay dayNightOverlay;
    private final EducationLessonStandardHeaderData.None defaultNoneHeaderData;
    private final UiEvent<ApiEducationEarnability> earnabilityCheckEvent;
    private final EducationLesson educationLesson;
    private final EducationLesson.Reward educationReward;
    private final Context eventContext;
    private final LearningLesson eventLearningLesson;
    private final LearningSection eventLearningSection;
    private final Integer foregroundColor;
    private final boolean hasShownCryptoLearnAndEarnOnboarding;
    private final boolean isFinalSection;
    private final boolean isFirstSection;
    private final boolean isOnCompletionPage;
    private final List<EducationLessonSection> lessonSectionItems;
    private final int maxProgress;
    private final Integer percentComplete;
    private final int previousSectionPosition;
    private final int progress;
    private final int sectionPosition;
    private final boolean shouldMarkAsComplete;
    private final boolean showError;
    private final boolean showLesson;
    private final boolean showLoading;
    private final String source;
    private final Status status;
    private final Float totalFrames;
    private final String trackingId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String CRYPTO_LEARN_AND_TRADE_1_DOLLAR_LESSON_ID = "4a77CuDKxWQYM9iljCBc8f";
    private static final String CRYPTO_LEARN_AND_TRADE_5_DOLLAR_LESSON_ID = "6JpX4b8n0gM2x1Yp0yEw2A";
    private static final String CRYPTO_LEARN_AND_TRADE_LESSON_ID = "3wMUsx1SbX6VYo9AzArOuN";
    private static final Set<String> SHOULD_SHOW_ERROR_ALERT = SetsKt.setOf((Object[]) new String[]{CRYPTO_LEARN_AND_TRADE_1_DOLLAR_LESSON_ID, CRYPTO_LEARN_AND_TRADE_5_DOLLAR_LESSON_ID, CRYPTO_LEARN_AND_TRADE_LESSON_ID});

    /* compiled from: EducationLessonStandardViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

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
            int[] iArr2 = new int[EducationLessonHeaderMedia.LessonHeaderMediaType.values().length];
            try {
                iArr2[EducationLessonHeaderMedia.LessonHeaderMediaType.ANIMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EducationLessonHeaderMedia.LessonHeaderMediaType.SECTION_DEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiEducationEarnability.RewardState.values().length];
            try {
                iArr3[ApiEducationEarnability.RewardState.REWARD_CLAIMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.USER_RESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.USER_NO_CRYPTO_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.REWARD_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.USER_HAS_FUNDED_IRA_ACCOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.USER_HAS_IRA_ACCOUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.USER_NO_IRA_ACCOUNT.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.SLIP_LEARN_AND_EARN_NOT_ELIGIBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.ELIGIBILITY_REQUIREMENT_NOT_MET.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.USER_ACCOUNT_RESTRICTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.USER_CAN_CLAIM.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[ApiEducationEarnability.RewardState.DEFAULT.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[EducationSectionHeaderMedia.SectionHeaderMediaType.values().length];
            try {
                iArr4[EducationSectionHeaderMedia.SectionHeaderMediaType.ANIMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[EducationSectionHeaderMedia.SectionHeaderMediaType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public EducationLessonStandardViewState() {
        this(null, null, null, 0, 0, null, null, null, false, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    private final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    private final String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    private final String getContentfulId() {
        return this.contentfulId;
    }

    /* renamed from: component6, reason: from getter */
    private final Float getTotalFrames() {
        return this.totalFrames;
    }

    private final UiEvent<ApiEducationEarnability> component8() {
        return this.earnabilityCheckEvent;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getHasShownCryptoLearnAndEarnOnboarding() {
        return this.hasShownCryptoLearnAndEarnOnboarding;
    }

    public static /* synthetic */ EducationLessonStandardViewState copy$default(EducationLessonStandardViewState educationLessonStandardViewState, Status status, String str, String str2, int i, int i2, Float f, DayNightOverlay dayNightOverlay, UiEvent uiEvent, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            status = educationLessonStandardViewState.status;
        }
        if ((i3 & 2) != 0) {
            str = educationLessonStandardViewState.source;
        }
        if ((i3 & 4) != 0) {
            str2 = educationLessonStandardViewState.contentfulId;
        }
        if ((i3 & 8) != 0) {
            i = educationLessonStandardViewState.sectionPosition;
        }
        if ((i3 & 16) != 0) {
            i2 = educationLessonStandardViewState.previousSectionPosition;
        }
        if ((i3 & 32) != 0) {
            f = educationLessonStandardViewState.totalFrames;
        }
        if ((i3 & 64) != 0) {
            dayNightOverlay = educationLessonStandardViewState.dayNightOverlay;
        }
        if ((i3 & 128) != 0) {
            uiEvent = educationLessonStandardViewState.earnabilityCheckEvent;
        }
        if ((i3 & 256) != 0) {
            z = educationLessonStandardViewState.hasShownCryptoLearnAndEarnOnboarding;
        }
        UiEvent uiEvent2 = uiEvent;
        boolean z2 = z;
        Float f2 = f;
        DayNightOverlay dayNightOverlay2 = dayNightOverlay;
        int i4 = i2;
        String str3 = str2;
        return educationLessonStandardViewState.copy(status, str, str3, i, i4, f2, dayNightOverlay2, uiEvent2, z2);
    }

    /* renamed from: component4, reason: from getter */
    public final int getSectionPosition() {
        return this.sectionPosition;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPreviousSectionPosition() {
        return this.previousSectionPosition;
    }

    /* renamed from: component7, reason: from getter */
    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public final EducationLessonStandardViewState copy(Status status, String source, String contentfulId, int sectionPosition, int previousSectionPosition, Float totalFrames, DayNightOverlay dayNightOverlay, UiEvent<ApiEducationEarnability> earnabilityCheckEvent, boolean hasShownCryptoLearnAndEarnOnboarding) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        return new EducationLessonStandardViewState(status, source, contentfulId, sectionPosition, previousSectionPosition, totalFrames, dayNightOverlay, earnabilityCheckEvent, hasShownCryptoLearnAndEarnOnboarding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationLessonStandardViewState)) {
            return false;
        }
        EducationLessonStandardViewState educationLessonStandardViewState = (EducationLessonStandardViewState) other;
        return Intrinsics.areEqual(this.status, educationLessonStandardViewState.status) && Intrinsics.areEqual(this.source, educationLessonStandardViewState.source) && Intrinsics.areEqual(this.contentfulId, educationLessonStandardViewState.contentfulId) && this.sectionPosition == educationLessonStandardViewState.sectionPosition && this.previousSectionPosition == educationLessonStandardViewState.previousSectionPosition && Intrinsics.areEqual((Object) this.totalFrames, (Object) educationLessonStandardViewState.totalFrames) && this.dayNightOverlay == educationLessonStandardViewState.dayNightOverlay && Intrinsics.areEqual(this.earnabilityCheckEvent, educationLessonStandardViewState.earnabilityCheckEvent) && this.hasShownCryptoLearnAndEarnOnboarding == educationLessonStandardViewState.hasShownCryptoLearnAndEarnOnboarding;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.status.hashCode() * 31) + this.source.hashCode()) * 31) + this.contentfulId.hashCode()) * 31) + Integer.hashCode(this.sectionPosition)) * 31) + Integer.hashCode(this.previousSectionPosition)) * 31;
        Float f = this.totalFrames;
        int iHashCode2 = (((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + this.dayNightOverlay.hashCode()) * 31;
        UiEvent<ApiEducationEarnability> uiEvent = this.earnabilityCheckEvent;
        return ((iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasShownCryptoLearnAndEarnOnboarding);
    }

    public String toString() {
        return "EducationLessonStandardViewState(status=" + this.status + ", source=" + this.source + ", contentfulId=" + this.contentfulId + ", sectionPosition=" + this.sectionPosition + ", previousSectionPosition=" + this.previousSectionPosition + ", totalFrames=" + this.totalFrames + ", dayNightOverlay=" + this.dayNightOverlay + ", earnabilityCheckEvent=" + this.earnabilityCheckEvent + ", hasShownCryptoLearnAndEarnOnboarding=" + this.hasShownCryptoLearnAndEarnOnboarding + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EducationLessonStandardViewState(Status status, String source, String contentfulId, int i, int i2, Float f, DayNightOverlay dayNightOverlay, UiEvent<ApiEducationEarnability> uiEvent, boolean z) {
        Integer numValueOf;
        Integer numValueOf2;
        LearningLesson protobuf;
        EducationLesson lesson;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        this.status = status;
        this.source = source;
        this.contentfulId = contentfulId;
        this.sectionPosition = i;
        this.previousSectionPosition = i2;
        this.totalFrames = f;
        this.dayNightOverlay = dayNightOverlay;
        this.earnabilityCheckEvent = uiEvent;
        this.hasShownCryptoLearnAndEarnOnboarding = z;
        this.showLoading = status instanceof Status.Loading;
        boolean z2 = false;
        this.showError = (status instanceof Status.Failure) && !SHOULD_SHOW_ERROR_ALERT.contains(contentfulId);
        boolean z3 = status instanceof Status.Success;
        this.showLesson = z3;
        Status.Success success = status instanceof Status.Success ? (Status.Success) status : null;
        EducationLesson lesson2 = success != null ? success.getLesson() : null;
        this.educationLesson = lesson2;
        Status.Success success2 = status instanceof Status.Success ? (Status.Success) status : null;
        this.educationReward = (success2 == null || (lesson = success2.getLesson()) == null) ? null : lesson.getReward();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[dayNightOverlay.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = lesson2 != null ? Integer.valueOf(lesson2.getNightForegroundColor()) : null;
        } else if (lesson2 != null) {
            numValueOf = Integer.valueOf(lesson2.getDayForegroundColor());
        }
        this.foregroundColor = numValueOf;
        int i4 = iArr[dayNightOverlay.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf2 = lesson2 != null ? Integer.valueOf(lesson2.getNightBackgroundColor()) : null;
        } else if (lesson2 != null) {
            numValueOf2 = Integer.valueOf(lesson2.getDayBackgroundColor());
        }
        this.backgroundColor = numValueOf2;
        List<EducationLessonSection> listCreateSectionItems = createSectionItems();
        this.lessonSectionItems = listCreateSectionItems;
        this.trackingId = lesson2 != null ? lesson2.getTrackingId() : null;
        boolean z4 = z3 && i == CollectionsKt.getLastIndex(listCreateSectionItems);
        this.isOnCompletionPage = z4;
        this.shouldMarkAsComplete = (!z4 || lesson2 == null || lesson2.isCompleted()) ? false : true;
        if (lesson2 != null) {
            protobuf = LearningLessons.toProtobuf(lesson2, lesson2.isCompleted() || z4);
        } else {
            protobuf = null;
        }
        this.eventLearningLesson = protobuf;
        EducationLessonSection currentSectionItem = getCurrentSectionItem();
        LearningSection protobuf2 = currentSectionItem != null ? EducationLessonSections.toProtobuf(currentSectionItem, i + 1, listCreateSectionItems.size()) : null;
        this.eventLearningSection = protobuf2;
        this.isFirstSection = i == 0;
        if (!listCreateSectionItems.isEmpty() && i == CollectionsKt.getLastIndex(listCreateSectionItems)) {
            z2 = true;
        }
        this.isFinalSection = z2;
        int i5 = i + 1;
        this.progress = i5;
        int size = listCreateSectionItems.size();
        this.maxProgress = size;
        this.percentComplete = size > 0 ? Integer.valueOf((i5 * 100) / size) : null;
        Context context = new Context(i + 1, listCreateSectionItems.size(), 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, protobuf, protobuf2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -201326596, -1, -1, -1, -1, -1, 16383, null);
        this.eventContext = context;
        this.defaultNoneHeaderData = new EducationLessonStandardHeaderData.None(numValueOf, numValueOf2, i5, size, context);
    }

    public /* synthetic */ EducationLessonStandardViewState(Status status, String str, String str2, int i, int i2, Float f, DayNightOverlay dayNightOverlay, UiEvent uiEvent, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Status.Loading.INSTANCE : status, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : f, (i3 & 64) != 0 ? DayNightOverlay.DAY : dayNightOverlay, (i3 & 128) != 0 ? null : uiEvent, (i3 & 256) != 0 ? true : z);
    }

    public final int getSectionPosition() {
        return this.sectionPosition;
    }

    public final int getPreviousSectionPosition() {
        return this.previousSectionPosition;
    }

    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final boolean getShowLesson() {
        return this.showLesson;
    }

    public final EducationLesson getEducationLesson() {
        return this.educationLesson;
    }

    public final Integer getForegroundColor() {
        return this.foregroundColor;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<EducationLessonSection> getLessonSectionItems() {
        return this.lessonSectionItems;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    /* renamed from: isOnCompletionPage, reason: from getter */
    public final boolean getIsOnCompletionPage() {
        return this.isOnCompletionPage;
    }

    public final boolean getShouldMarkAsComplete() {
        return this.shouldMarkAsComplete;
    }

    private final EducationLessonSection getCurrentSectionItem() {
        return (EducationLessonSection) CollectionsKt.getOrNull(this.lessonSectionItems, this.sectionPosition);
    }

    public final LearningLesson getEventLearningLesson() {
        return this.eventLearningLesson;
    }

    public final CryptoLearnAndEarnLoggingData getLearnAndEarnLoggingData() {
        EducationLesson educationLesson = this.educationLesson;
        if (educationLesson == null || educationLesson.getReward() == null || !CryptoLearnAndEarnUtils.INSTANCE.isCryptoLearnAndEarn(educationLesson)) {
            return null;
        }
        return new CryptoLearnAndEarnLoggingData(this.eventContext, this.source);
    }

    public final Integer getPercentComplete() {
        return this.percentComplete;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    public final EducationLessonStandardHeaderData getCurrentSectionHeader() {
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
                EducationLessonHeaderMedia educationLessonHeaderMedia2 = (EducationLessonHeaderMedia) next;
                if (educationLessonHeaderMedia2.getMediaType() != EducationLessonHeaderMedia.LessonHeaderMediaType.UNKNOWN && educationLessonHeaderMedia2.getMediaType() != EducationLessonHeaderMedia.LessonHeaderMediaType.IMAGE) {
                    break;
                }
            }
            educationLessonHeaderMedia = (EducationLessonHeaderMedia) next;
        }
        EducationLessonHeaderMedia.LessonHeaderMediaType mediaType = educationLessonHeaderMedia != null ? educationLessonHeaderMedia.getMediaType() : null;
        int i = mediaType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[mediaType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return createSectionDefinedLessonHeader();
            }
            return this.defaultNoneHeaderData;
        }
        HttpUrl assetUrl = educationLessonHeaderMedia.getAssetUrl();
        Float f = this.totalFrames;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        EducationLessonSection currentSectionItem = getCurrentSectionItem();
        return createContinuousLessonHeaderAnimation(assetUrl, fFloatValue, currentSectionItem != null ? currentSectionItem.getAnimationStartingFrame() : null);
    }

    public final EducationLessonStandardFooterData getCurrentSectionFooter() {
        EducationSectionFooter sectionFooter;
        Context eventContext;
        Context eventContext2;
        if (this.educationLesson == null) {
            return EducationLessonStandardFooterData.None.INSTANCE;
        }
        if (this.isFinalSection) {
            return new EducationLessonStandardFooterData.CtaButtons(this.educationLesson.getPrimaryCta(), this.educationLesson.getSecondaryCta(), this.educationLesson.getDisclosure(), this.eventLearningLesson, this.sectionPosition + 1, this.lessonSectionItems.size());
        }
        if (this.isFirstSection) {
            EducationLessonSection currentSectionItem = getCurrentSectionItem();
            sectionFooter = currentSectionItem != null ? currentSectionItem.getSectionFooter() : null;
            CryptoLearnAndEarnLoggingData learnAndEarnLoggingData = getLearnAndEarnLoggingData();
            if (learnAndEarnLoggingData == null || (eventContext2 = learnAndEarnLoggingData.getEventContext()) == null) {
                eventContext2 = this.eventContext;
            }
            return new EducationLessonStandardFooterData.NextButton(sectionFooter, eventContext2);
        }
        if (this.sectionPosition < CollectionsKt.getLastIndex(this.lessonSectionItems)) {
            EducationLessonSection currentSectionItem2 = getCurrentSectionItem();
            sectionFooter = currentSectionItem2 != null ? currentSectionItem2.getSectionFooter() : null;
            CryptoLearnAndEarnLoggingData learnAndEarnLoggingData2 = getLearnAndEarnLoggingData();
            if (learnAndEarnLoggingData2 == null || (eventContext = learnAndEarnLoggingData2.getEventContext()) == null) {
                eventContext = this.eventContext;
            }
            return new EducationLessonStandardFooterData.BackAndNextButton(sectionFooter, eventContext);
        }
        return EducationLessonStandardFooterData.None.INSTANCE;
    }

    public final String getExitSurveyEvent() {
        EducationLesson educationLesson = this.educationLesson;
        if (educationLesson == null) {
            return null;
        }
        if (this.isOnCompletionPage) {
            return educationLesson.getCompletionSurveyEvent();
        }
        return educationLesson.getEarlyExitSurveyEvent();
    }

    public final UiEvent<Throwable> getEducationErrorAlertEvent() {
        Throwable error;
        if (!SHOULD_SHOW_ERROR_ALERT.contains(this.contentfulId)) {
            return null;
        }
        Status status = this.status;
        Status.Failure failure = status instanceof Status.Failure ? (Status.Failure) status : null;
        if (failure == null || (error = failure.getError()) == null) {
            return null;
        }
        return new UiEvent<>(error);
    }

    public final UiEvent<RewardUnavailableDialogState> getRewardStateDialogEvent() {
        ApiEducationEarnability apiEducationEarnabilityConsume;
        UiEvent<ApiEducationEarnability> uiEvent = this.earnabilityCheckEvent;
        if (uiEvent == null || (apiEducationEarnabilityConsume = uiEvent.consume()) == null || this.sectionPosition != 0 || this.educationReward == null) {
            return null;
        }
        AlertAction<GenericAction> alert_view = apiEducationEarnabilityConsume.getAlert_view();
        if (alert_view != null) {
            return new UiEvent<>(new RewardUnavailableDialogState.ServerAlert(alert_view));
        }
        switch (WhenMappings.$EnumSwitchMapping$2[apiEducationEarnabilityConsume.getCrypto_earnability().ordinal()]) {
            case 1:
                StringResource.Companion companion = StringResource.INSTANCE;
                return new UiEvent<>(new RewardUnavailableDialogState.ClientAlert(0, companion.invoke(C38790R.string.education_rewards_earnability_reward_claimed_title, new Object[0]), companion.invoke(this.educationReward.getClaimedMessage()), companion.invoke(C11048R.string.general_label_got_it, new Object[0]), null, 17, null));
            case 2:
                StringResource.Companion companion2 = StringResource.INSTANCE;
                return new UiEvent<>(new RewardUnavailableDialogState.ClientAlert(0, companion2.invoke(C38790R.string.education_rewards_earnability_account_restrictions_title, apiEducationEarnabilityConsume.getCurrency_code()), companion2.invoke(this.educationReward.getNotAvailableDueToUserRestrictionMessage()), companion2.invoke(C11048R.string.general_label_continue, new Object[0]), null, 17, null));
            case 3:
                int i = C38790R.id.dialog_education_reward_unavailable_rhc_required;
                StringResource.Companion companion3 = StringResource.INSTANCE;
                return new UiEvent<>(new RewardUnavailableDialogState.ClientAlert(i, companion3.invoke(C38790R.string.education_rewards_earnability_rhc_required_title, new Object[0]), companion3.invoke(C38790R.string.education_rewards_earnability_rhc_required_message, new Object[0]), companion3.invoke(C38790R.string.education_rewards_earnability_rhc_required_review_agreement, new Object[0]), companion3.invoke(C38790R.string.education_rewards_earnability_rhc_required_continue, new Object[0])));
            case 4:
                StringResource.Companion companion4 = StringResource.INSTANCE;
                return new UiEvent<>(new RewardUnavailableDialogState.ClientAlert(0, companion4.invoke(C38790R.string.education_rewards_earnability_no_longer_available, new Object[0]), companion4.invoke(this.educationReward.getNotAvailableMessage()), companion4.invoke(C11048R.string.general_label_continue, new Object[0]), null, 17, null));
            case 5:
                StringResource.Companion companion5 = StringResource.INSTANCE;
                return new UiEvent<>(new RewardUnavailableDialogState.ClientAlert(0, companion5.invoke(C38790R.string.education_rewards_earnability_funded_ira_title, new Object[0]), companion5.invoke(C38790R.string.education_rewards_earnability_funded_ira_subtitle, new Object[0]), companion5.invoke(C11048R.string.general_label_continue, new Object[0]), null, 17, null));
            case 6:
                StringResource.Companion companion6 = StringResource.INSTANCE;
                return new UiEvent<>(new RewardUnavailableDialogState.ClientAlert(0, companion6.invoke(C38790R.string.education_rewards_earnability_existing_ira_title, new Object[0]), companion6.invoke(C38790R.string.education_rewards_earnability_existing_ira_subtitle, new Object[0]), companion6.invoke(C11048R.string.general_label_continue, new Object[0]), null, 17, null));
            case 7:
                int i2 = C38790R.id.dialog_education_reward_no_ira;
                StringResource.Companion companion7 = StringResource.INSTANCE;
                return new UiEvent<>(new RewardUnavailableDialogState.ClientAlert(i2, companion7.invoke(C38790R.string.education_rewards_earnability_no_ira_title, new Object[0]), companion7.invoke(C38790R.string.education_rewards_earnability_no_ira_subtitle, new Object[0]), companion7.invoke(C38790R.string.education_rewards_earnability_open_ira_cta, new Object[0]), null, 16, null));
            case 8:
                int i3 = C38790R.id.dialog_education_reward_slip_no_eligible;
                StringResource.Companion companion8 = StringResource.INSTANCE;
                return new UiEvent<>(new RewardUnavailableDialogState.ClientAlert(i3, companion8.invoke(C38790R.string.education_rewards_earnability_slip_no_eligible_title, new Object[0]), companion8.invoke(C38790R.string.education_rewards_earnability_slip_no_eligible_subtitle, new Object[0]), companion8.invoke(C38790R.string.education_rewards_earnability_slip_no_eligible_primary, new Object[0]), companion8.invoke(C38790R.string.education_rewards_earnability_slip_no_eligible_secondary, new Object[0])));
            case 9:
            case 10:
            case 11:
            case 12:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final UiEvent<CryptoLearnAndEarnLoggingData> getShowCryptoLearnAndEarnOnboardingEvent() {
        EducationLesson educationLesson = this.educationLesson;
        if (educationLesson == null || this.hasShownCryptoLearnAndEarnOnboarding || this.educationReward == null || getLearnAndEarnLoggingData() == null || !CryptoLearnAndEarnUtils.INSTANCE.isCryptoLearnAndEarn(educationLesson)) {
            return null;
        }
        CryptoLearnAndEarnLoggingData learnAndEarnLoggingData = getLearnAndEarnLoggingData();
        Intrinsics.checkNotNull(learnAndEarnLoggingData);
        return new UiEvent<>(learnAndEarnLoggingData);
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
            } else if (educationLessonSection instanceof EducationLessonSection.Timeline) {
                info = EducationLessonSection.Timeline.copy$default((EducationLessonSection.Timeline) educationLessonSection, null, null, null, null, null, null, null, this.foregroundColor.intValue(), 0, null, 895, null);
            } else if (educationLessonSection instanceof EducationLessonSection.Quiz) {
                info = EducationLessonSection.Quiz.copy$default((EducationLessonSection.Quiz) educationLessonSection, null, null, null, null, null, null, null, null, this.foregroundColor.intValue(), 0, null, 1791, null);
            } else {
                String id = educationLessonSection.getId();
                List<EducationSectionHeaderMedia> headerMedia = educationLessonSection.getHeaderMedia();
                String title = educationLessonSection.getTitle();
                MarkdownContent content = educationLessonSection.getContent();
                Integer animationStartingFrame = educationLessonSection.getAnimationStartingFrame();
                EducationSectionFooter sectionFooter = educationLessonSection.getSectionFooter();
                Integer num = this.foregroundColor;
                info = new EducationLessonSection.Info(id, headerMedia, title, content, animationStartingFrame, educationLessonSection.getInfoTagText(), sectionFooter, "", num.intValue(), num.intValue());
            }
            arrayList.add(info);
        }
        List<EducationLessonSection> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        List<EducationLessonSection> list = mutableList;
        String str = this.educationLesson.getReward() == null ? "completion_section" : "lesson_completion_section";
        EducationLessonSection educationLessonSection2 = (EducationLessonSection) CollectionsKt.lastOrNull((List) mutableList);
        List<EducationSectionHeaderMedia> headerMedia2 = educationLessonSection2 != null ? educationLessonSection2.getHeaderMedia() : null;
        String completionTitle = this.educationLesson.getCompletionTitle();
        MarkdownContent completionMessage = this.educationLesson.getCompletionMessage();
        Integer num2 = this.foregroundColor;
        list.add(new EducationLessonSection.Info(str, headerMedia2, completionTitle, completionMessage, null, null, null, "", num2.intValue(), num2.intValue(), 32, null));
        return mutableList;
    }

    private final EducationLessonStandardHeaderData createContinuousLessonHeaderAnimation(HttpUrl animationUrl, float totalFrames, Integer animationStartingFrame) {
        AnimationState section;
        List<EducationLessonSection> sections;
        EducationLessonSection educationLessonSection;
        if (animationUrl == null) {
            return this.defaultNoneHeaderData;
        }
        EducationLesson educationLesson = this.educationLesson;
        float fCoerceIn = (((educationLesson == null || (sections = educationLesson.getSections()) == null || (educationLessonSection = (EducationLessonSection) CollectionsKt.getOrNull(sections, this.previousSectionPosition)) == null) ? null : educationLessonSection.getAnimationStartingFrame()) == null || totalFrames <= 0.0f) ? 0.0f : RangesKt.coerceIn(r0.intValue() / totalFrames, 0.0f, 1.0f);
        if (this.isFinalSection) {
            section = AnimationState.Complete.INSTANCE;
        } else {
            section = new AnimationState.Section(RangesKt.coerceIn((animationStartingFrame != null ? animationStartingFrame.intValue() : 0) / totalFrames, 0.0f, 1.0f));
        }
        return new EducationLessonStandardHeaderData.LessonAnimation(animationUrl.getUrl(), fCoerceIn, section, this.foregroundColor, this.backgroundColor, this.progress, this.maxProgress, this.eventContext);
    }

    private final EducationLessonStandardHeaderData createSectionDefinedLessonHeader() {
        HttpUrl completionAnimation;
        EducationSectionHeaderMedia educationSectionHeaderMedia;
        Object animation;
        Object next;
        List<EducationLessonSection> list = this.lessonSectionItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            String url = null;
            url = null;
            if (it.hasNext()) {
                List<EducationSectionHeaderMedia> headerMedia = ((EducationLessonSection) it.next()).getHeaderMedia();
                if (headerMedia != null) {
                    Iterator<T> it2 = headerMedia.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((EducationSectionHeaderMedia) next).getMediaType() != EducationSectionHeaderMedia.SectionHeaderMediaType.UNKNOWN) {
                            break;
                        }
                    }
                    educationSectionHeaderMedia = (EducationSectionHeaderMedia) next;
                } else {
                    educationSectionHeaderMedia = null;
                }
                EducationSectionHeaderMedia.SectionHeaderMediaType mediaType = educationSectionHeaderMedia != null ? educationSectionHeaderMedia.getMediaType() : null;
                int i = mediaType == null ? -1 : WhenMappings.$EnumSwitchMapping$3[mediaType.ordinal()];
                if (i == 1) {
                    animation = new EducationLessonStandardHeaderData2.Animation(String.valueOf(educationSectionHeaderMedia.getAssetUrl()));
                } else if (i == 2) {
                    animation = new EducationLessonStandardHeaderData2.Image(String.valueOf(educationSectionHeaderMedia.getAssetUrl()));
                } else {
                    return this.defaultNoneHeaderData;
                }
                arrayList.add(animation);
            } else {
                EducationLesson educationLesson = this.educationLesson;
                if (educationLesson != null && (completionAnimation = educationLesson.getCompletionAnimation()) != null) {
                    url = completionAnimation.getUrl();
                }
                return new EducationLessonStandardHeaderData.SectionAsset(arrayList, url, this.foregroundColor, this.backgroundColor, this.sectionPosition, this.isFinalSection, this.progress, this.maxProgress, this.eventContext);
            }
        }
    }

    /* compiled from: EducationLessonStandardViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status$Failure;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status$Loading;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status$Success;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Status {
        public static final int $stable = 0;

        public /* synthetic */ Status(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: EducationLessonStandardViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status$Loading;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status;", "<init>", "()V", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends Status {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private Status() {
        }

        /* compiled from: EducationLessonStandardViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status$Success;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status;", "lesson", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;)V", "getLesson", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: EducationLessonStandardViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status$Failure;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Status;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends Status {
            public static final int $stable = 8;
            private final Throwable error;

            /* JADX WARN: Multi-variable type inference failed */
            public Failure() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = failure.error;
                }
                return failure.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final Failure copy(Throwable error) {
                return new Failure(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
            }

            public int hashCode() {
                Throwable th = this.error;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public String toString() {
                return "Failure(error=" + this.error + ")";
            }

            public Failure(Throwable th) {
                super(null);
                this.error = th;
            }

            public /* synthetic */ Failure(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : th);
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: EducationLessonStandardViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$RewardUnavailableDialogState;", "", "<init>", "()V", "ServerAlert", "ClientAlert", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$RewardUnavailableDialogState$ClientAlert;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$RewardUnavailableDialogState$ServerAlert;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class RewardUnavailableDialogState {
        public static final int $stable = 0;

        public /* synthetic */ RewardUnavailableDialogState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: EducationLessonStandardViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$RewardUnavailableDialogState$ServerAlert;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$RewardUnavailableDialogState;", "alertAction", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;)V", "getAlertAction", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ServerAlert extends RewardUnavailableDialogState {
            public static final int $stable = 8;
            private final AlertAction<GenericAction> alertAction;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ServerAlert copy$default(ServerAlert serverAlert, AlertAction alertAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    alertAction = serverAlert.alertAction;
                }
                return serverAlert.copy(alertAction);
            }

            public final AlertAction<GenericAction> component1() {
                return this.alertAction;
            }

            public final ServerAlert copy(AlertAction<? extends GenericAction> alertAction) {
                Intrinsics.checkNotNullParameter(alertAction, "alertAction");
                return new ServerAlert(alertAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ServerAlert) && Intrinsics.areEqual(this.alertAction, ((ServerAlert) other).alertAction);
            }

            public int hashCode() {
                return this.alertAction.hashCode();
            }

            public String toString() {
                return "ServerAlert(alertAction=" + this.alertAction + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ServerAlert(AlertAction<? extends GenericAction> alertAction) {
                super(null);
                Intrinsics.checkNotNullParameter(alertAction, "alertAction");
                this.alertAction = alertAction;
            }

            public final AlertAction<GenericAction> getAlertAction() {
                return this.alertAction;
            }
        }

        private RewardUnavailableDialogState() {
        }

        /* compiled from: EducationLessonStandardViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$RewardUnavailableDialogState$ClientAlert;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$RewardUnavailableDialogState;", "dialogId", "", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "messageText", "primaryButtonText", "secondaryButtonText", "<init>", "(ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getDialogId", "()I", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "getMessageText", "getPrimaryButtonText", "getSecondaryButtonText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ClientAlert extends RewardUnavailableDialogState {
            public static final int $stable = StringResource.$stable;
            private final int dialogId;
            private final StringResource messageText;
            private final StringResource primaryButtonText;
            private final StringResource secondaryButtonText;
            private final StringResource titleText;

            public static /* synthetic */ ClientAlert copy$default(ClientAlert clientAlert, int i, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = clientAlert.dialogId;
                }
                if ((i2 & 2) != 0) {
                    stringResource = clientAlert.titleText;
                }
                if ((i2 & 4) != 0) {
                    stringResource2 = clientAlert.messageText;
                }
                if ((i2 & 8) != 0) {
                    stringResource3 = clientAlert.primaryButtonText;
                }
                if ((i2 & 16) != 0) {
                    stringResource4 = clientAlert.secondaryButtonText;
                }
                StringResource stringResource5 = stringResource4;
                StringResource stringResource6 = stringResource2;
                return clientAlert.copy(i, stringResource, stringResource6, stringResource3, stringResource5);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDialogId() {
                return this.dialogId;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getTitleText() {
                return this.titleText;
            }

            /* renamed from: component3, reason: from getter */
            public final StringResource getMessageText() {
                return this.messageText;
            }

            /* renamed from: component4, reason: from getter */
            public final StringResource getPrimaryButtonText() {
                return this.primaryButtonText;
            }

            /* renamed from: component5, reason: from getter */
            public final StringResource getSecondaryButtonText() {
                return this.secondaryButtonText;
            }

            public final ClientAlert copy(int dialogId, StringResource titleText, StringResource messageText, StringResource primaryButtonText, StringResource secondaryButtonText) {
                Intrinsics.checkNotNullParameter(titleText, "titleText");
                Intrinsics.checkNotNullParameter(messageText, "messageText");
                Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
                return new ClientAlert(dialogId, titleText, messageText, primaryButtonText, secondaryButtonText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClientAlert)) {
                    return false;
                }
                ClientAlert clientAlert = (ClientAlert) other;
                return this.dialogId == clientAlert.dialogId && Intrinsics.areEqual(this.titleText, clientAlert.titleText) && Intrinsics.areEqual(this.messageText, clientAlert.messageText) && Intrinsics.areEqual(this.primaryButtonText, clientAlert.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, clientAlert.secondaryButtonText);
            }

            public int hashCode() {
                int iHashCode = ((((((Integer.hashCode(this.dialogId) * 31) + this.titleText.hashCode()) * 31) + this.messageText.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31;
                StringResource stringResource = this.secondaryButtonText;
                return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
            }

            public String toString() {
                return "ClientAlert(dialogId=" + this.dialogId + ", titleText=" + this.titleText + ", messageText=" + this.messageText + ", primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ")";
            }

            public /* synthetic */ ClientAlert(int i, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? C38790R.id.dialog_education_reward_unavailable : i, stringResource, stringResource2, stringResource3, (i2 & 16) != 0 ? null : stringResource4);
            }

            public final int getDialogId() {
                return this.dialogId;
            }

            public final StringResource getTitleText() {
                return this.titleText;
            }

            public final StringResource getMessageText() {
                return this.messageText;
            }

            public final StringResource getPrimaryButtonText() {
                return this.primaryButtonText;
            }

            public final StringResource getSecondaryButtonText() {
                return this.secondaryButtonText;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClientAlert(int i, StringResource titleText, StringResource messageText, StringResource primaryButtonText, StringResource stringResource) {
                super(null);
                Intrinsics.checkNotNullParameter(titleText, "titleText");
                Intrinsics.checkNotNullParameter(messageText, "messageText");
                Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
                this.dialogId = i;
                this.titleText = titleText;
                this.messageText = messageText;
                this.primaryButtonText = primaryButtonText;
                this.secondaryButtonText = stringResource;
            }
        }
    }

    /* compiled from: EducationLessonStandardViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState$Companion;", "", "<init>", "()V", "CRYPTO_LEARN_AND_TRADE_1_DOLLAR_LESSON_ID", "", "CRYPTO_LEARN_AND_TRADE_5_DOLLAR_LESSON_ID", "CRYPTO_LEARN_AND_TRADE_LESSON_ID", "SHOULD_SHOW_ERROR_ALERT", "", "getSHOULD_SHOW_ERROR_ALERT", "()Ljava/util/Set;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<String> getSHOULD_SHOW_ERROR_ALERT() {
            return EducationLessonStandardViewState.SHOULD_SHOW_ERROR_ALERT;
        }
    }
}
