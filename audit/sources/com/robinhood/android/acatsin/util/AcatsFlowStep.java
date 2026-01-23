package com.robinhood.android.acatsin.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AcatsFlowStep.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "", "shouldPromptForLockScreen", "", "<init>", "(Ljava/lang/String;IZ)V", "getShouldPromptForLockScreen", "()Z", "INTRO_SWIPIES_BONUS_ONLY", "INTRO_SWIPIES", "INTRO_CONSOLIDATED", "AVAILABLE_DESTINATIONS", "BROKERAGE_SEARCH", "MANUAL_BROKERAGE_ENTRY", "PLAID_INTRO", "PLAID_ACCOUNT_NUMBER", "ENTER_ACCOUNT_NUMBER", "CONFIRM_ACCOUNT_NAME", "ACCOUNT_CONTENTS", "POSITION_CHECKLIST_INELIGIBLE_ALTERNATE", "POSITION_CHECKLIST_NOT_SURE_ALTERNATE", "PLAID_PARTIAL_TRANSFER_SUPPORTED", "CONFIRM_ELIGIBLE", "RECONFIRM_ELIGIBLE", "CANNOT_COMPLETE_CONFIRMATION", "PLAID_PARTIAL_TRANSFER_EDIT", "PARTIAL_TRANSFER_FLOW", "ENABLE_MARGIN", "ENABLE_OPTIONS", "AGREEMENT", "REVIEW_AND_SUBMIT", "CONFIRMATION", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsFlowStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AcatsFlowStep[] $VALUES;
    public static final AcatsFlowStep ACCOUNT_CONTENTS;
    public static final AcatsFlowStep ENABLE_MARGIN;
    public static final AcatsFlowStep ENTER_ACCOUNT_NUMBER;
    public static final AcatsFlowStep PLAID_INTRO;
    public static final AcatsFlowStep POSITION_CHECKLIST_NOT_SURE_ALTERNATE;
    private final boolean shouldPromptForLockScreen;
    public static final AcatsFlowStep INTRO_SWIPIES_BONUS_ONLY = new AcatsFlowStep("INTRO_SWIPIES_BONUS_ONLY", 0, false, 1, null);
    public static final AcatsFlowStep INTRO_SWIPIES = new AcatsFlowStep("INTRO_SWIPIES", 1, false, 1, null);
    public static final AcatsFlowStep INTRO_CONSOLIDATED = new AcatsFlowStep("INTRO_CONSOLIDATED", 2, false, 1, null);
    public static final AcatsFlowStep AVAILABLE_DESTINATIONS = new AcatsFlowStep("AVAILABLE_DESTINATIONS", 3, false, 1, null);
    public static final AcatsFlowStep BROKERAGE_SEARCH = new AcatsFlowStep("BROKERAGE_SEARCH", 4, false, 1, null);
    public static final AcatsFlowStep MANUAL_BROKERAGE_ENTRY = new AcatsFlowStep("MANUAL_BROKERAGE_ENTRY", 5, false, 1, null);
    public static final AcatsFlowStep PLAID_ACCOUNT_NUMBER = new AcatsFlowStep("PLAID_ACCOUNT_NUMBER", 7, false);
    public static final AcatsFlowStep CONFIRM_ACCOUNT_NAME = new AcatsFlowStep("CONFIRM_ACCOUNT_NAME", 9, false);
    public static final AcatsFlowStep POSITION_CHECKLIST_INELIGIBLE_ALTERNATE = new AcatsFlowStep("POSITION_CHECKLIST_INELIGIBLE_ALTERNATE", 11, false, 1, null);
    public static final AcatsFlowStep PLAID_PARTIAL_TRANSFER_SUPPORTED = new AcatsFlowStep("PLAID_PARTIAL_TRANSFER_SUPPORTED", 13, false, 1, null);
    public static final AcatsFlowStep CONFIRM_ELIGIBLE = new AcatsFlowStep("CONFIRM_ELIGIBLE", 14, false, 1, null);
    public static final AcatsFlowStep RECONFIRM_ELIGIBLE = new AcatsFlowStep("RECONFIRM_ELIGIBLE", 15, false, 1, null);
    public static final AcatsFlowStep CANNOT_COMPLETE_CONFIRMATION = new AcatsFlowStep("CANNOT_COMPLETE_CONFIRMATION", 16, false, 1, null);
    public static final AcatsFlowStep PLAID_PARTIAL_TRANSFER_EDIT = new AcatsFlowStep("PLAID_PARTIAL_TRANSFER_EDIT", 17, false, 1, null);
    public static final AcatsFlowStep PARTIAL_TRANSFER_FLOW = new AcatsFlowStep("PARTIAL_TRANSFER_FLOW", 18, false, 1, null);
    public static final AcatsFlowStep ENABLE_OPTIONS = new AcatsFlowStep("ENABLE_OPTIONS", 20, false, 1, null);
    public static final AcatsFlowStep AGREEMENT = new AcatsFlowStep("AGREEMENT", 21, false, 1, null);
    public static final AcatsFlowStep REVIEW_AND_SUBMIT = new AcatsFlowStep("REVIEW_AND_SUBMIT", 22, false, 1, null);
    public static final AcatsFlowStep CONFIRMATION = new AcatsFlowStep("CONFIRMATION", 23, false, 1, null);

    private static final /* synthetic */ AcatsFlowStep[] $values() {
        return new AcatsFlowStep[]{INTRO_SWIPIES_BONUS_ONLY, INTRO_SWIPIES, INTRO_CONSOLIDATED, AVAILABLE_DESTINATIONS, BROKERAGE_SEARCH, MANUAL_BROKERAGE_ENTRY, PLAID_INTRO, PLAID_ACCOUNT_NUMBER, ENTER_ACCOUNT_NUMBER, CONFIRM_ACCOUNT_NAME, ACCOUNT_CONTENTS, POSITION_CHECKLIST_INELIGIBLE_ALTERNATE, POSITION_CHECKLIST_NOT_SURE_ALTERNATE, PLAID_PARTIAL_TRANSFER_SUPPORTED, CONFIRM_ELIGIBLE, RECONFIRM_ELIGIBLE, CANNOT_COMPLETE_CONFIRMATION, PLAID_PARTIAL_TRANSFER_EDIT, PARTIAL_TRANSFER_FLOW, ENABLE_MARGIN, ENABLE_OPTIONS, AGREEMENT, REVIEW_AND_SUBMIT, CONFIRMATION};
    }

    public static EnumEntries<AcatsFlowStep> getEntries() {
        return $ENTRIES;
    }

    private AcatsFlowStep(String str, int i, boolean z) {
        this.shouldPromptForLockScreen = z;
    }

    /* synthetic */ AcatsFlowStep(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? true : z);
    }

    public final boolean getShouldPromptForLockScreen() {
        return this.shouldPromptForLockScreen;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        PLAID_INTRO = new AcatsFlowStep("PLAID_INTRO", 6, false, 1, defaultConstructorMarker);
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z = false;
        ENTER_ACCOUNT_NUMBER = new AcatsFlowStep("ENTER_ACCOUNT_NUMBER", 8, z, i, defaultConstructorMarker2);
        ACCOUNT_CONTENTS = new AcatsFlowStep("ACCOUNT_CONTENTS", 10, z, i, defaultConstructorMarker2);
        POSITION_CHECKLIST_NOT_SURE_ALTERNATE = new AcatsFlowStep("POSITION_CHECKLIST_NOT_SURE_ALTERNATE", 12, false, 1, defaultConstructorMarker);
        ENABLE_MARGIN = new AcatsFlowStep("ENABLE_MARGIN", 19, false, 1, defaultConstructorMarker);
        AcatsFlowStep[] acatsFlowStepArr$values = $values();
        $VALUES = acatsFlowStepArr$values;
        $ENTRIES = EnumEntries2.enumEntries(acatsFlowStepArr$values);
    }

    public static AcatsFlowStep valueOf(String str) {
        return (AcatsFlowStep) Enum.valueOf(AcatsFlowStep.class, str);
    }

    public static AcatsFlowStep[] values() {
        return (AcatsFlowStep[]) $VALUES.clone();
    }
}
