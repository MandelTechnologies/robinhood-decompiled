package com.robinhood.android.common.recurring.utils;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiPaycheckInvestmentSchedules.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u0016\u0010\t\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004\"\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m3636d2 = {"editExistingScheduleDialogTitleText", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "getEditExistingScheduleDialogTitleText", "(Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;)I", "editExistingScheduleDialogMessageText", "Lcom/robinhood/utils/resource/StringResource;", "directDepositRelationship", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "editExistingIndividualScheduleDialogMessageText", "editExistingScheduleDialogPrimaryCtaText", "getEditExistingScheduleDialogPrimaryCtaText", "editExistingScheduleDialogSecondaryCtaText", "getEditExistingScheduleDialogSecondaryCtaText", "feature-lib-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.utils.UiPaycheckInvestmentSchedulesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class UiPaycheckInvestmentSchedules {

    /* compiled from: UiPaycheckInvestmentSchedules.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.utils.UiPaycheckInvestmentSchedulesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiAssetType.values().length];
            try {
                iArr[ApiAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getEditExistingScheduleDialogTitleText(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule) {
        Intrinsics.checkNotNullParameter(uiPaycheckInvestmentSchedule, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[uiPaycheckInvestmentSchedule.getBrokerageAccountType().ordinal()];
        if (i == 1) {
            return C11595R.string.recurring_dialog_existing_schedule_title_roth_ira;
        }
        if (i == 2) {
            return C11595R.string.recurring_dialog_existing_schedule_title_traditional_ira;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[uiPaycheckInvestmentSchedule.getInvestmentTarget().getTargetType().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return C11595R.string.recurring_dialog_existing_schedule_title;
        }
        if (i2 == 3) {
            return C11595R.string.recurring_dialog_existing_schedule_title_brokerage_cash;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("This flow doesn't support tokenized stocks");
    }

    public static final StringResource editExistingScheduleDialogMessageText(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule, DirectDepositRelationship directDepositRelationship) {
        Intrinsics.checkNotNullParameter(uiPaycheckInvestmentSchedule, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[uiPaycheckInvestmentSchedule.getBrokerageAccountType().ordinal()];
        if (i == 1) {
            if (directDepositRelationship == null) {
                return StringResource.INSTANCE.invoke(C11595R.string.f4045xde7fe991, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_dialog_existing_schedule_message_roth_ira_cash, directDepositRelationship.getOriginatorName());
        }
        if (i != 2) {
            return editExistingIndividualScheduleDialogMessageText(uiPaycheckInvestmentSchedule, directDepositRelationship);
        }
        if (directDepositRelationship == null) {
            return StringResource.INSTANCE.invoke(C11595R.string.f4046x36951865, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C11595R.string.recurring_dialog_existing_schedule_message_traditional_ira_cash, directDepositRelationship.getOriginatorName());
    }

    private static final StringResource editExistingIndividualScheduleDialogMessageText(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule, DirectDepositRelationship directDepositRelationship) {
        int i = WhenMappings.$EnumSwitchMapping$0[uiPaycheckInvestmentSchedule.getInvestmentTarget().getTargetType().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("This flow doesn't support tokenized stocks");
            }
            if (directDepositRelationship == null) {
                return StringResource.INSTANCE.invoke(C11595R.string.f4043x7abafe6b, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_dialog_existing_schedule_message_brokerage_cash, directDepositRelationship.getOriginatorName());
        }
        String instrumentSymbol = uiPaycheckInvestmentSchedule.getInvestmentTarget().getInstrumentSymbol();
        if (instrumentSymbol == null) {
            if (directDepositRelationship == null) {
                return StringResource.INSTANCE.invoke(C11595R.string.f4044xae9b5343, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_dialog_existing_schedule_message_no_symbol, directDepositRelationship.getOriginatorName());
        }
        if (directDepositRelationship == null) {
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_dialog_existing_schedule_message_no_dd_relationship, instrumentSymbol);
        }
        return StringResource.INSTANCE.invoke(C11595R.string.recurring_dialog_existing_schedule_message, instrumentSymbol, directDepositRelationship.getOriginatorName());
    }

    public static final int getEditExistingScheduleDialogPrimaryCtaText(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule) {
        Intrinsics.checkNotNullParameter(uiPaycheckInvestmentSchedule, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[uiPaycheckInvestmentSchedule.getBrokerageAccountType().ordinal()];
        if (i == 1 || i == 2) {
            return C11595R.string.recurring_dialog_existing_schedule_primary_cta_retirement_cash;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[uiPaycheckInvestmentSchedule.getInvestmentTarget().getTargetType().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return C11595R.string.recurring_dialog_existing_schedule_primary_cta;
        }
        if (i2 == 3) {
            return C11595R.string.recurring_dialog_existing_schedule_primary_cta_brokerage_cash;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("This flow doesn't support tokenized stocks");
    }

    public static final int getEditExistingScheduleDialogSecondaryCtaText(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule) {
        Intrinsics.checkNotNullParameter(uiPaycheckInvestmentSchedule, "<this>");
        return C11595R.string.recurring_dialog_existing_schedule_secondary_cta;
    }
}
