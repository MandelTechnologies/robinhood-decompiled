package com.robinhood.android.investorprofile.p162ui.questionnaire.splash;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireSplashViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u00010B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J:\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0013HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b%\u0010$¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState;", "", "isBlocking", "", "questionnaireContext", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "isInAssetRedesignExperiment", "<init>", "(ZLjava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/Boolean;)V", "()Z", "getQuestionnaireContext", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "titleTextRes", "", "getTitleTextRes", "()I", "summaryText", "Lcom/robinhood/utils/resource/StringResource;", "getSummaryText", "()Lcom/robinhood/utils/resource/StringResource;", "imageBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "getImageBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", "illustration", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration;", "getIllustration", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration;", "useElevatedThemeForHeader", "getUseElevatedThemeForHeader", "(Landroidx/compose/runtime/Composer;I)Z", "isDayHeaderOverride", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/Boolean;)Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState;", "equals", "other", "hashCode", "toString", "Illustration", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class QuestionnaireSplashViewState {
    public static final int $stable = 0;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean isBlocking;
    private final Boolean isInAssetRedesignExperiment;
    private final String questionnaireContext;

    public static /* synthetic */ QuestionnaireSplashViewState copy$default(QuestionnaireSplashViewState questionnaireSplashViewState, boolean z, String str, BrokerageAccountType brokerageAccountType, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = questionnaireSplashViewState.isBlocking;
        }
        if ((i & 2) != 0) {
            str = questionnaireSplashViewState.questionnaireContext;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = questionnaireSplashViewState.brokerageAccountType;
        }
        if ((i & 8) != 0) {
            bool = questionnaireSplashViewState.isInAssetRedesignExperiment;
        }
        return questionnaireSplashViewState.copy(z, str, brokerageAccountType, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBlocking() {
        return this.isBlocking;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuestionnaireContext() {
        return this.questionnaireContext;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsInAssetRedesignExperiment() {
        return this.isInAssetRedesignExperiment;
    }

    public final QuestionnaireSplashViewState copy(boolean isBlocking, String questionnaireContext, BrokerageAccountType brokerageAccountType, Boolean isInAssetRedesignExperiment) {
        Intrinsics.checkNotNullParameter(questionnaireContext, "questionnaireContext");
        return new QuestionnaireSplashViewState(isBlocking, questionnaireContext, brokerageAccountType, isInAssetRedesignExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireSplashViewState)) {
            return false;
        }
        QuestionnaireSplashViewState questionnaireSplashViewState = (QuestionnaireSplashViewState) other;
        return this.isBlocking == questionnaireSplashViewState.isBlocking && Intrinsics.areEqual(this.questionnaireContext, questionnaireSplashViewState.questionnaireContext) && this.brokerageAccountType == questionnaireSplashViewState.brokerageAccountType && Intrinsics.areEqual(this.isInAssetRedesignExperiment, questionnaireSplashViewState.isInAssetRedesignExperiment);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isBlocking) * 31) + this.questionnaireContext.hashCode()) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode2 = (iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        Boolean bool = this.isInAssetRedesignExperiment;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "QuestionnaireSplashViewState(isBlocking=" + this.isBlocking + ", questionnaireContext=" + this.questionnaireContext + ", brokerageAccountType=" + this.brokerageAccountType + ", isInAssetRedesignExperiment=" + this.isInAssetRedesignExperiment + ")";
    }

    public QuestionnaireSplashViewState(boolean z, String questionnaireContext, BrokerageAccountType brokerageAccountType, Boolean bool) {
        Intrinsics.checkNotNullParameter(questionnaireContext, "questionnaireContext");
        this.isBlocking = z;
        this.questionnaireContext = questionnaireContext;
        this.brokerageAccountType = brokerageAccountType;
        this.isInAssetRedesignExperiment = bool;
    }

    public /* synthetic */ QuestionnaireSplashViewState(boolean z, String str, BrokerageAccountType brokerageAccountType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, brokerageAccountType, (i & 8) != 0 ? null : bool);
    }

    public final boolean isBlocking() {
        return this.isBlocking;
    }

    public final String getQuestionnaireContext() {
        return this.questionnaireContext;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final Boolean isInAssetRedesignExperiment() {
        return this.isInAssetRedesignExperiment;
    }

    public final int getTitleTextRes() {
        String str = this.questionnaireContext;
        int iHashCode = str.hashCode();
        if (iHashCode != -938609828) {
            if (iHashCode != -701892103) {
                if (iHashCode == 1391458831 && str.equals(QuestionnaireContexts.FUTURES_UK_KNOWLEDGE_QUIZ)) {
                    return C19641R.string.questionnaire_splash_futures_knowledge_quiz_title;
                }
            } else if (str.equals(QuestionnaireContexts.FUTURES_UK_SUITABILITY)) {
                return C19641R.string.questionnaire_splash_futures_uk_title;
            }
        } else if (str.equals(QuestionnaireContexts.AML_REFRESH)) {
            return C19641R.string.investor_profile_refresh_splash_title;
        }
        return C19641R.string.questionnaire_splash_title;
    }

    public final StringResource getSummaryText() {
        int i;
        if (Intrinsics.areEqual(this.questionnaireContext, QuestionnaireContexts.AML_REFRESH)) {
            i = C19641R.string.investor_profile_refresh_splash_summary;
        } else if (Intrinsics.areEqual(this.questionnaireContext, QuestionnaireContexts.FUTURES_UK_SUITABILITY)) {
            i = C19641R.string.questionnaire_splash_futures_uk_message;
        } else if (Intrinsics.areEqual(this.questionnaireContext, QuestionnaireContexts.FUTURES_UK_KNOWLEDGE_QUIZ)) {
            i = C19641R.string.questionnaire_splash_futures_knowledge_quiz_message;
        } else {
            i = (!this.isBlocking || this.brokerageAccountType == null) ? C19641R.string.questionnaire_splash_summary_non_blocking : C19641R.string.questionnaire_splash_summary_blocking;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        return companion.invoke(i, companion.invoke(brokerageAccountType != null ? BrokerageAccountTypes2.getDisplayNameInSentenceWithAccountRes(brokerageAccountType) : C19641R.string.questionnaire_splash_summary_default_account, new Object[0]));
    }

    @JvmName
    public final long getImageBackgroundColor(Composer composer, int i) {
        long jM21371getBg0d7_KjU;
        composer.startReplaceGroup(-270243861);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-270243861, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashViewState.<get-imageBackgroundColor> (QuestionnaireSplashViewState.kt:59)");
        }
        String str = this.questionnaireContext;
        if (Intrinsics.areEqual(str, QuestionnaireContexts.FUTURES_UK_SUITABILITY) || Intrinsics.areEqual(str, QuestionnaireContexts.FUTURES_UK_KNOWLEDGE_QUIZ)) {
            composer.startReplaceGroup(-2006306067);
            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2006305109);
            Boolean bool = this.isInAssetRedesignExperiment;
            if (bool == null || Intrinsics.areEqual(bool, Boolean.TRUE)) {
                composer.startReplaceGroup(-2065841213);
                jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2065783615);
                jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getJade();
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21371getBg0d7_KjU;
    }

    public final Illustration getIllustration() {
        String str = this.questionnaireContext;
        if (Intrinsics.areEqual(str, QuestionnaireContexts.FUTURES_UK_SUITABILITY) || Intrinsics.areEqual(str, QuestionnaireContexts.FUTURES_UK_KNOWLEDGE_QUIZ)) {
            return new Illustration.Lottie(LottieUrl.FUTURES_UK_QUESTIONNAIRE_SPLASH_DAY, LottieUrl.FUTURES_UK_QUESTIONNAIRE_SPLASH_NIGHT);
        }
        Boolean bool = this.isInAssetRedesignExperiment;
        if (bool == null) {
            return Illustration.Empty.INSTANCE;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return new Illustration.Image(C19641R.drawable.questionnaire_splash_intro_redesign);
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return new Illustration.Image(C19641R.drawable.suitability_splash);
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmName
    public final boolean getUseElevatedThemeForHeader(Composer composer, int i) {
        composer.startReplaceGroup(-1662648896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1662648896, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashViewState.<get-useElevatedThemeForHeader> (QuestionnaireSplashViewState.kt:90)");
        }
        boolean isDay = Intrinsics.areEqual(this.isInAssetRedesignExperiment, Boolean.TRUE) ? BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay() : false;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return isDay;
    }

    @JvmName
    public final boolean isDayHeaderOverride(Composer composer, int i) {
        composer.startReplaceGroup(-1498805542);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1498805542, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashViewState.<get-isDayHeaderOverride> (QuestionnaireSplashViewState.kt:99)");
        }
        composer.startReplaceGroup(-1538080872);
        boolean z = Intrinsics.areEqual(this.isInAssetRedesignExperiment, Boolean.TRUE) && BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay();
        composer.endReplaceGroup();
        boolean isDay = z ? false : BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return isDay;
    }

    /* compiled from: QuestionnaireSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration;", "", "Empty", "Lottie", "Image", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration$Empty;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration$Image;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration$Lottie;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Illustration {

        /* compiled from: QuestionnaireSplashViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration$Empty;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Empty implements Illustration {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();

            public boolean equals(Object other) {
                return this == other || (other instanceof Empty);
            }

            public int hashCode() {
                return -1807664408;
            }

            public String toString() {
                return "Empty";
            }

            private Empty() {
            }
        }

        /* compiled from: QuestionnaireSplashViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration$Lottie;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration;", "dayUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "nightUrl", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;Lcom/robinhood/shared/remote/assets/LottieUrl;)V", "getDayUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getNightUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Lottie implements Illustration {
            public static final int $stable = 0;
            private final LottieUrl dayUrl;
            private final LottieUrl nightUrl;

            public static /* synthetic */ Lottie copy$default(Lottie lottie, LottieUrl lottieUrl, LottieUrl lottieUrl2, int i, Object obj) {
                if ((i & 1) != 0) {
                    lottieUrl = lottie.dayUrl;
                }
                if ((i & 2) != 0) {
                    lottieUrl2 = lottie.nightUrl;
                }
                return lottie.copy(lottieUrl, lottieUrl2);
            }

            /* renamed from: component1, reason: from getter */
            public final LottieUrl getDayUrl() {
                return this.dayUrl;
            }

            /* renamed from: component2, reason: from getter */
            public final LottieUrl getNightUrl() {
                return this.nightUrl;
            }

            public final Lottie copy(LottieUrl dayUrl, LottieUrl nightUrl) {
                Intrinsics.checkNotNullParameter(dayUrl, "dayUrl");
                Intrinsics.checkNotNullParameter(nightUrl, "nightUrl");
                return new Lottie(dayUrl, nightUrl);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Lottie)) {
                    return false;
                }
                Lottie lottie = (Lottie) other;
                return this.dayUrl == lottie.dayUrl && this.nightUrl == lottie.nightUrl;
            }

            public int hashCode() {
                return (this.dayUrl.hashCode() * 31) + this.nightUrl.hashCode();
            }

            public String toString() {
                return "Lottie(dayUrl=" + this.dayUrl + ", nightUrl=" + this.nightUrl + ")";
            }

            public Lottie(LottieUrl dayUrl, LottieUrl nightUrl) {
                Intrinsics.checkNotNullParameter(dayUrl, "dayUrl");
                Intrinsics.checkNotNullParameter(nightUrl, "nightUrl");
                this.dayUrl = dayUrl;
                this.nightUrl = nightUrl;
            }

            public final LottieUrl getDayUrl() {
                return this.dayUrl;
            }

            public final LottieUrl getNightUrl() {
                return this.nightUrl;
            }
        }

        /* compiled from: QuestionnaireSplashViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration$Image;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState$Illustration;", "imageRes", "", "<init>", "(I)V", "getImageRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Image implements Illustration {
            public static final int $stable = 0;
            private final int imageRes;

            public static /* synthetic */ Image copy$default(Image image, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = image.imageRes;
                }
                return image.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getImageRes() {
                return this.imageRes;
            }

            public final Image copy(int imageRes) {
                return new Image(imageRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Image) && this.imageRes == ((Image) other).imageRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.imageRes);
            }

            public String toString() {
                return "Image(imageRes=" + this.imageRes + ")";
            }

            public Image(int i) {
                this.imageRes = i;
            }

            public final int getImageRes() {
                return this.imageRes;
            }
        }
    }
}
