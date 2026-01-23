package com.robinhood.android.margin.upgrade.p175uk.investorprofile;

import com.robinhood.android.margin.upgrade.C21137R;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UkMarginOnboardingQuestionnaireSplashStyle.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireSplashStyle;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "subtitleRes", "imageRes", "<init>", "(Ljava/lang/String;IIII)V", "getTitleRes", "()I", "getSubtitleRes", "getImageRes", "INVESTOR_PROFILE", "MARGIN_INVESTING_EXPERIENCE", "MARGIN_KNOWLEDGE", "toScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UkMarginOnboardingQuestionnaireSplashStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UkMarginOnboardingQuestionnaireSplashStyle[] $VALUES;
    public static final UkMarginOnboardingQuestionnaireSplashStyle INVESTOR_PROFILE = new UkMarginOnboardingQuestionnaireSplashStyle("INVESTOR_PROFILE", 0, C21137R.string.review_investor_profile_title, C21137R.string.review_investor_profile_body, C21137R.drawable.margin_suitability_splash);
    public static final UkMarginOnboardingQuestionnaireSplashStyle MARGIN_INVESTING_EXPERIENCE = new UkMarginOnboardingQuestionnaireSplashStyle("MARGIN_INVESTING_EXPERIENCE", 1, C21137R.string.uk_margin_experience_questionnaire_title, C21137R.string.uk_margin_experience_questionnaire_body, C21137R.drawable.margin_investing_experience_splash);
    public static final UkMarginOnboardingQuestionnaireSplashStyle MARGIN_KNOWLEDGE = new UkMarginOnboardingQuestionnaireSplashStyle("MARGIN_KNOWLEDGE", 2, C21137R.string.uk_margin_knowledge_questionnaire_title, C21137R.string.uk_margin_knowledge_questionnaire_body, C21137R.drawable.margin_knowledge_splash);
    private final int imageRes;
    private final int subtitleRes;
    private final int titleRes;

    /* compiled from: UkMarginOnboardingQuestionnaireSplashStyle.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UkMarginOnboardingQuestionnaireSplashStyle.values().length];
            try {
                iArr[UkMarginOnboardingQuestionnaireSplashStyle.INVESTOR_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_INVESTING_EXPERIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_KNOWLEDGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ UkMarginOnboardingQuestionnaireSplashStyle[] $values() {
        return new UkMarginOnboardingQuestionnaireSplashStyle[]{INVESTOR_PROFILE, MARGIN_INVESTING_EXPERIENCE, MARGIN_KNOWLEDGE};
    }

    public static EnumEntries<UkMarginOnboardingQuestionnaireSplashStyle> getEntries() {
        return $ENTRIES;
    }

    private UkMarginOnboardingQuestionnaireSplashStyle(String str, int i, int i2, int i3, int i4) {
        this.titleRes = i2;
        this.subtitleRes = i3;
        this.imageRes = i4;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    public final int getImageRes() {
        return this.imageRes;
    }

    static {
        UkMarginOnboardingQuestionnaireSplashStyle[] ukMarginOnboardingQuestionnaireSplashStyleArr$values = $values();
        $VALUES = ukMarginOnboardingQuestionnaireSplashStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(ukMarginOnboardingQuestionnaireSplashStyleArr$values);
    }

    public final Screen.Name toScreenName() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return Screen.Name.UK_MARGIN_ONBOARDING_INVESTOR_PROFILE_SPLASH;
        }
        if (i == 2) {
            return Screen.Name.UK_MARGIN_ONBOARDING_EXPERIENCE_TEST_SPLASH;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Screen.Name.UK_MARGIN_ONBOARDING_KNOWLEDGE_TEST_SPLASH;
    }

    public static UkMarginOnboardingQuestionnaireSplashStyle valueOf(String str) {
        return (UkMarginOnboardingQuestionnaireSplashStyle) Enum.valueOf(UkMarginOnboardingQuestionnaireSplashStyle.class, str);
    }

    public static UkMarginOnboardingQuestionnaireSplashStyle[] values() {
        return (UkMarginOnboardingQuestionnaireSplashStyle[]) $VALUES.clone();
    }
}
