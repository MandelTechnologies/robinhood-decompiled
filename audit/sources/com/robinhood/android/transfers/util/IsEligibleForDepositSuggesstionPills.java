package com.robinhood.android.transfers.util;

import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsEligibleForDepositSuggesstionPills.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"isEligibleForDepositSuggestionPills", "", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.util.IsEligibleForDepositSuggesstionPillsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class IsEligibleForDepositSuggesstionPills {

    /* compiled from: IsEligibleForDepositSuggesstionPills.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.util.IsEligibleForDepositSuggesstionPillsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MAXTransferContext.EntryPoint.values().length];
            try {
                iArr[MAXTransferContext.EntryPoint.TRANSFER_HUB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.RECURRING_TRANSFER_HUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.SPENDING_HOME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.SPENDING_HOME_WITH_ACTION_BAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_PUSH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_EMAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_INBOX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.RHS_RECURRING_UPSELL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.RHY_RECURRING_UPSELL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.SPENDING_INCENTIVE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.BUYING_POWER_DETAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.EQUITY_ORDER_CONFIRMATION_FUNDING_UPSELL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.CRYPTO_ORDER_CONFIRMATION_FUNDING_UPSELL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.ADVISORY_DASHBOARD_DEPOSIT_BUTTON.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isEligibleForDepositSuggestionPills(MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[entryPoint.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }
}
