package com.robinhood.android.acatsin.util;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsFlowStep.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"getDisplayStep", "", "Lcom/robinhood/android/acatsin/util/AcatsFlow;", "step", "Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "lib-acats-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.util.AcatsFlowStepKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsFlowStep3 {

    /* compiled from: AcatsFlowStep.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.util.AcatsFlowStepKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AcatsFlowStep.values().length];
            try {
                iArr[AcatsFlowStep.INTRO_SWIPIES_BONUS_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AcatsFlowStep.INTRO_SWIPIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AcatsFlowStep.INTRO_CONSOLIDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AcatsFlowStep.CONFIRMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AcatsFlowStep.AVAILABLE_DESTINATIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AcatsFlowStep.BROKERAGE_SEARCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AcatsFlowStep.MANUAL_BROKERAGE_ENTRY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_INTRO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_ACCOUNT_NUMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AcatsFlowStep.ENTER_ACCOUNT_NUMBER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AcatsFlowStep.CONFIRM_ACCOUNT_NAME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AcatsFlowStep.ACCOUNT_CONTENTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AcatsFlowStep.POSITION_CHECKLIST_INELIGIBLE_ALTERNATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AcatsFlowStep.POSITION_CHECKLIST_NOT_SURE_ALTERNATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_PARTIAL_TRANSFER_SUPPORTED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AcatsFlowStep.CONFIRM_ELIGIBLE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AcatsFlowStep.RECONFIRM_ELIGIBLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AcatsFlowStep.CANNOT_COMPLETE_CONFIRMATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AcatsFlowStep.PLAID_PARTIAL_TRANSFER_EDIT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AcatsFlowStep.PARTIAL_TRANSFER_FLOW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AcatsFlowStep.ENABLE_MARGIN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AcatsFlowStep.ENABLE_OPTIONS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AcatsFlowStep.AGREEMENT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AcatsFlowStep.REVIEW_AND_SUBMIT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AcatsFlowStep2.values().length];
            try {
                iArr2[AcatsFlowStep2.ACATS_IN_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[AcatsFlowStep2.ACATS_IN_CO_OWNER_CONFIRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getDisplayStep(AcatsFlowStep2 acatsFlowStep2, AcatsFlowStep step) {
        Intrinsics.checkNotNullParameter(acatsFlowStep2, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        int i = WhenMappings.$EnumSwitchMapping$1[acatsFlowStep2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[step.ordinal()];
            if (i2 != 23) {
                return i2 != 24 ? -1 : 1;
            }
            return 2;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[step.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return -1;
            case 5:
                return 1;
            case 6:
            case 7:
                return 2;
            case 8:
            case 9:
            case 10:
                return 3;
            case 11:
                return 4;
            case 12:
                return 5;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6;
            case 23:
                return 7;
            case 24:
                return 8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
