package com.robinhood.userleap.survey;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrackingEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\b\u0086\u0081\u0002\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00061"}, m3636d2 = {"Lcom/robinhood/userleap/survey/TrackingEvent;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "SAW_RET_VALUE_PROPS", "CLICK_RET_VALUE_PROPS_GET_STARTED", "SAW_RET_SIGN_UP", "FINISHED_RET_SIGN_UP", "FINISHED_CONTRIBUTION", "INVESTED_RECS_RET", "INVESTED_RET_INVEST_FLOW", "ROLLOVER_START", "ROLLOVER_END_DIY", "ROLLOVER_END_CAPITALIZE", "SAW_RET_UPDATED_3PERC_CARD", "SAW_MATCH_RATE_SELECTION_SCREEN", "SIGNED_UP_FOR_RET_1PERC_MATCH", "SIGNED_UP_FOR_RET_3PERC_MATCH", "SAW_1M_RET_GOLD_BOTTOM_SHEET", "SAW_RET_ACCOUNT_ELIGIBILITY_QUIZ", "SAW_RET_ACCOUNT_DESCRIPTION_SCREEN", "SAW_RET_ACCOUNT_SELECTION_SCREEN", "SAW_RET_AGREEMENTS_SCREEN", "SAW_MATCH_OPTIONS_IN_CONTRIBUTION", "SELECTED_1_PERC_FULLSCREEN_CONTRIBUTIONS", "SELECTED_3_PERC_FULLSCREEN_CONTRIBUTIONS", "SAW_MATCH_SELECTION_AGREEMENTS_AND_CONTRIBUTION", "ADVISORY_SEEN_AGREEMENTS_INDIVIDUAL", "ADVISORY_SEEN_AGREEMENTS_ROTH", "ADVISORY_SEEN_AGREEMENTS_TRAD", "ADVISORY_POST_AGREEMENTS_INDIVIDUAL", "ADVISORY_POST_AGREEMENTS_ROTH", "ADVISORY_POST_AGREEMENTS_TRAD", "ADVISORY_FUNDED_INVESTED_FOLLOW_UP_INDIVIDUAL", "ADVISORY_FUNDED_INVESTED_FOLLOW_UP_ROTH", "ADVISORY_FUNDED_INVESTED_FOLLOW_UP_TRAD", "ADVISORY_UNFUNDED_FOLLOW_UP_INDIVIDUAL", "ADVISORY_UNFUNDED_FOLLOW_UP_ROTH", "ADVISORY_UNFUNDED_FOLLOW_UP_TRAD", "ADVISORY_SAW_VALUE_PROP_NON_GOLD", "ADVISORY_SAW_VALUE_PROP_GOLD", "ADVISORY_TAP_CTA_VALUE_PROP_NON_GOLD", "ADVISORY_TAP_CTA_VALUE_PROP_GOLD", "Companion", "lib-userleap_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TrackingEvent implements RhEnum<TrackingEvent> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrackingEvent[] $VALUES;
    private final String serverValue;
    public static final TrackingEvent SAW_RET_VALUE_PROPS = new TrackingEvent("SAW_RET_VALUE_PROPS", 0, "saw-ret-value-props");
    public static final TrackingEvent CLICK_RET_VALUE_PROPS_GET_STARTED = new TrackingEvent("CLICK_RET_VALUE_PROPS_GET_STARTED", 1, "ret-value-props-click-get-started");
    public static final TrackingEvent SAW_RET_SIGN_UP = new TrackingEvent("SAW_RET_SIGN_UP", 2, "saw-ret-sign-up");
    public static final TrackingEvent FINISHED_RET_SIGN_UP = new TrackingEvent("FINISHED_RET_SIGN_UP", 3, "finished-ret-sign-up");
    public static final TrackingEvent FINISHED_CONTRIBUTION = new TrackingEvent("FINISHED_CONTRIBUTION", 4, "finished-contribution");
    public static final TrackingEvent INVESTED_RECS_RET = new TrackingEvent("INVESTED_RECS_RET", 5, "invested-recs-ret");
    public static final TrackingEvent INVESTED_RET_INVEST_FLOW = new TrackingEvent("INVESTED_RET_INVEST_FLOW", 6, "invested-ret-invest-flow");
    public static final TrackingEvent ROLLOVER_START = new TrackingEvent("ROLLOVER_START", 7, "rollover-start");
    public static final TrackingEvent ROLLOVER_END_DIY = new TrackingEvent("ROLLOVER_END_DIY", 8, "rollover-end-diy");
    public static final TrackingEvent ROLLOVER_END_CAPITALIZE = new TrackingEvent("ROLLOVER_END_CAPITALIZE", 9, "rollover-end-capitalize");
    public static final TrackingEvent SAW_RET_UPDATED_3PERC_CARD = new TrackingEvent("SAW_RET_UPDATED_3PERC_CARD", 10, "saw-ret-updated-3perc-card");
    public static final TrackingEvent SAW_MATCH_RATE_SELECTION_SCREEN = new TrackingEvent("SAW_MATCH_RATE_SELECTION_SCREEN", 11, "saw-match-rate-selection-screen");
    public static final TrackingEvent SIGNED_UP_FOR_RET_1PERC_MATCH = new TrackingEvent("SIGNED_UP_FOR_RET_1PERC_MATCH", 12, "signed-up-for-ret-1perc-match");
    public static final TrackingEvent SIGNED_UP_FOR_RET_3PERC_MATCH = new TrackingEvent("SIGNED_UP_FOR_RET_3PERC_MATCH", 13, "signed-up-for-ret-3perc-match");
    public static final TrackingEvent SAW_1M_RET_GOLD_BOTTOM_SHEET = new TrackingEvent("SAW_1M_RET_GOLD_BOTTOM_SHEET", 14, "saw-1m-ret-gold-bottom-sheet");
    public static final TrackingEvent SAW_RET_ACCOUNT_ELIGIBILITY_QUIZ = new TrackingEvent("SAW_RET_ACCOUNT_ELIGIBILITY_QUIZ", 15, "saw-ret-account-eligibility-quiz");
    public static final TrackingEvent SAW_RET_ACCOUNT_DESCRIPTION_SCREEN = new TrackingEvent("SAW_RET_ACCOUNT_DESCRIPTION_SCREEN", 16, "saw-ret-account-description-screen");
    public static final TrackingEvent SAW_RET_ACCOUNT_SELECTION_SCREEN = new TrackingEvent("SAW_RET_ACCOUNT_SELECTION_SCREEN", 17, "saw-ret-account-selection-screen");
    public static final TrackingEvent SAW_RET_AGREEMENTS_SCREEN = new TrackingEvent("SAW_RET_AGREEMENTS_SCREEN", 18, "saw-ret-agreements-screen");
    public static final TrackingEvent SAW_MATCH_OPTIONS_IN_CONTRIBUTION = new TrackingEvent("SAW_MATCH_OPTIONS_IN_CONTRIBUTION", 19, "saw-match-options-in-contributions");
    public static final TrackingEvent SELECTED_1_PERC_FULLSCREEN_CONTRIBUTIONS = new TrackingEvent("SELECTED_1_PERC_FULLSCREEN_CONTRIBUTIONS", 20, "selected-1-perc-fullscreen-contributions");
    public static final TrackingEvent SELECTED_3_PERC_FULLSCREEN_CONTRIBUTIONS = new TrackingEvent("SELECTED_3_PERC_FULLSCREEN_CONTRIBUTIONS", 21, "selected-3-perc-fullscreen-contributions");
    public static final TrackingEvent SAW_MATCH_SELECTION_AGREEMENTS_AND_CONTRIBUTION = new TrackingEvent("SAW_MATCH_SELECTION_AGREEMENTS_AND_CONTRIBUTION", 22, "saw-match-selection-agreements-and-contribution");
    public static final TrackingEvent ADVISORY_SEEN_AGREEMENTS_INDIVIDUAL = new TrackingEvent("ADVISORY_SEEN_AGREEMENTS_INDIVIDUAL", 23, "saw-advisory-agreements-individual");
    public static final TrackingEvent ADVISORY_SEEN_AGREEMENTS_ROTH = new TrackingEvent("ADVISORY_SEEN_AGREEMENTS_ROTH", 24, "saw-advisory-agreements-roth");
    public static final TrackingEvent ADVISORY_SEEN_AGREEMENTS_TRAD = new TrackingEvent("ADVISORY_SEEN_AGREEMENTS_TRAD", 25, "saw-advisory-agreements-trad");
    public static final TrackingEvent ADVISORY_POST_AGREEMENTS_INDIVIDUAL = new TrackingEvent("ADVISORY_POST_AGREEMENTS_INDIVIDUAL", 26, "agreed-to-advisory-agreements-individual");
    public static final TrackingEvent ADVISORY_POST_AGREEMENTS_ROTH = new TrackingEvent("ADVISORY_POST_AGREEMENTS_ROTH", 27, "agreed-to-advisory-agreements-roth");
    public static final TrackingEvent ADVISORY_POST_AGREEMENTS_TRAD = new TrackingEvent("ADVISORY_POST_AGREEMENTS_TRAD", 28, "agreed-to-advisory-agreements-trad");
    public static final TrackingEvent ADVISORY_FUNDED_INVESTED_FOLLOW_UP_INDIVIDUAL = new TrackingEvent("ADVISORY_FUNDED_INVESTED_FOLLOW_UP_INDIVIDUAL", 29, "advisory-funded-invested-follow-up-individual-event");
    public static final TrackingEvent ADVISORY_FUNDED_INVESTED_FOLLOW_UP_ROTH = new TrackingEvent("ADVISORY_FUNDED_INVESTED_FOLLOW_UP_ROTH", 30, "advisory-funded-invested-follow-up-roth-event");
    public static final TrackingEvent ADVISORY_FUNDED_INVESTED_FOLLOW_UP_TRAD = new TrackingEvent("ADVISORY_FUNDED_INVESTED_FOLLOW_UP_TRAD", 31, "advisory-funded-invested-follow-up-trad-event");
    public static final TrackingEvent ADVISORY_UNFUNDED_FOLLOW_UP_INDIVIDUAL = new TrackingEvent("ADVISORY_UNFUNDED_FOLLOW_UP_INDIVIDUAL", 32, "advisory-unfunded-follow-up-individual-event");
    public static final TrackingEvent ADVISORY_UNFUNDED_FOLLOW_UP_ROTH = new TrackingEvent("ADVISORY_UNFUNDED_FOLLOW_UP_ROTH", 33, "advisory-unfunded-follow-up-roth-event");
    public static final TrackingEvent ADVISORY_UNFUNDED_FOLLOW_UP_TRAD = new TrackingEvent("ADVISORY_UNFUNDED_FOLLOW_UP_TRAD", 34, "advisory-unfunded-follow-up-trad-event");
    public static final TrackingEvent ADVISORY_SAW_VALUE_PROP_NON_GOLD = new TrackingEvent("ADVISORY_SAW_VALUE_PROP_NON_GOLD", 35, "saw-advisory-value-prop-non-gold");
    public static final TrackingEvent ADVISORY_SAW_VALUE_PROP_GOLD = new TrackingEvent("ADVISORY_SAW_VALUE_PROP_GOLD", 36, "saw-advisory-value-prop-gold");
    public static final TrackingEvent ADVISORY_TAP_CTA_VALUE_PROP_NON_GOLD = new TrackingEvent("ADVISORY_TAP_CTA_VALUE_PROP_NON_GOLD", 37, "tap-continue-advisory-value-prop-non-gold");
    public static final TrackingEvent ADVISORY_TAP_CTA_VALUE_PROP_GOLD = new TrackingEvent("ADVISORY_TAP_CTA_VALUE_PROP_GOLD", 38, "tap-continue-advisory-value-prop-gold");

    private static final /* synthetic */ TrackingEvent[] $values() {
        return new TrackingEvent[]{SAW_RET_VALUE_PROPS, CLICK_RET_VALUE_PROPS_GET_STARTED, SAW_RET_SIGN_UP, FINISHED_RET_SIGN_UP, FINISHED_CONTRIBUTION, INVESTED_RECS_RET, INVESTED_RET_INVEST_FLOW, ROLLOVER_START, ROLLOVER_END_DIY, ROLLOVER_END_CAPITALIZE, SAW_RET_UPDATED_3PERC_CARD, SAW_MATCH_RATE_SELECTION_SCREEN, SIGNED_UP_FOR_RET_1PERC_MATCH, SIGNED_UP_FOR_RET_3PERC_MATCH, SAW_1M_RET_GOLD_BOTTOM_SHEET, SAW_RET_ACCOUNT_ELIGIBILITY_QUIZ, SAW_RET_ACCOUNT_DESCRIPTION_SCREEN, SAW_RET_ACCOUNT_SELECTION_SCREEN, SAW_RET_AGREEMENTS_SCREEN, SAW_MATCH_OPTIONS_IN_CONTRIBUTION, SELECTED_1_PERC_FULLSCREEN_CONTRIBUTIONS, SELECTED_3_PERC_FULLSCREEN_CONTRIBUTIONS, SAW_MATCH_SELECTION_AGREEMENTS_AND_CONTRIBUTION, ADVISORY_SEEN_AGREEMENTS_INDIVIDUAL, ADVISORY_SEEN_AGREEMENTS_ROTH, ADVISORY_SEEN_AGREEMENTS_TRAD, ADVISORY_POST_AGREEMENTS_INDIVIDUAL, ADVISORY_POST_AGREEMENTS_ROTH, ADVISORY_POST_AGREEMENTS_TRAD, ADVISORY_FUNDED_INVESTED_FOLLOW_UP_INDIVIDUAL, ADVISORY_FUNDED_INVESTED_FOLLOW_UP_ROTH, ADVISORY_FUNDED_INVESTED_FOLLOW_UP_TRAD, ADVISORY_UNFUNDED_FOLLOW_UP_INDIVIDUAL, ADVISORY_UNFUNDED_FOLLOW_UP_ROTH, ADVISORY_UNFUNDED_FOLLOW_UP_TRAD, ADVISORY_SAW_VALUE_PROP_NON_GOLD, ADVISORY_SAW_VALUE_PROP_GOLD, ADVISORY_TAP_CTA_VALUE_PROP_NON_GOLD, ADVISORY_TAP_CTA_VALUE_PROP_GOLD};
    }

    public static EnumEntries<TrackingEvent> getEntries() {
        return $ENTRIES;
    }

    private TrackingEvent(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        TrackingEvent[] trackingEventArr$values = $values();
        $VALUES = trackingEventArr$values;
        $ENTRIES = EnumEntries2.enumEntries(trackingEventArr$values);
        INSTANCE = new Companion(null);
    }

    public static TrackingEvent valueOf(String str) {
        return (TrackingEvent) Enum.valueOf(TrackingEvent.class, str);
    }

    public static TrackingEvent[] values() {
        return (TrackingEvent[]) $VALUES.clone();
    }
}
