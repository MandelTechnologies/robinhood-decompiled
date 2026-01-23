package com.robinhood.android.paycheckhub.p213ui;

import android.content.res.ColorStateList;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiPaycheckInvestmentSchedules.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"paycheckRecurringPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "getPaycheckRecurringPrimaryText", "(Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;)Lcom/robinhood/utils/resource/StringResource;", "paycheckRecurringSecondaryText", "getPaycheckRecurringSecondaryText", "paycheckRecurringMetadataPrimaryText", "", "getPaycheckRecurringMetadataPrimaryText", "(Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;)Ljava/lang/String;", "paycheckRecurringPrimaryMetadataTextColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Landroid/content/res/ColorStateList;", "getPaycheckRecurringPrimaryMetadataTextColor", "(Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;)Lcom/robinhood/scarlet/util/resource/ResourceReference;", "feature-paycheck-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.paycheckhub.ui.UiPaycheckInvestmentSchedulesKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiPaycheckInvestmentSchedules2 {

    /* compiled from: UiPaycheckInvestmentSchedules.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.paycheckhub.ui.UiPaycheckInvestmentSchedulesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getPaycheckRecurringPrimaryText(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule) {
        Intrinsics.checkNotNullParameter(uiPaycheckInvestmentSchedule, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[uiPaycheckInvestmentSchedule.getBrokerageAccountType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (uiPaycheckInvestmentSchedule.getInvestmentTarget().getTargetType() == ApiAssetType.BROKERAGE_CASH) {
                    return StringResource.INSTANCE.invoke(C25434R.string.paycheck_recurring_hub_brokerage_cash_recurring_transfer, new Object[0]);
                }
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C25434R.string.instrument_buy;
                String instrumentSymbol = uiPaycheckInvestmentSchedule.getInvestmentTarget().getInstrumentSymbol();
                Intrinsics.checkNotNull(instrumentSymbol);
                return companion.invoke(i, instrumentSymbol);
            case 6:
                return StringResource.INSTANCE.invoke(C25434R.string.paycheck_recurring_hub_roth_ira_cash_recurring_transfer, new Object[0]);
            case 7:
                return StringResource.INSTANCE.invoke(C25434R.string.paycheck_recurring_hub_traditional_ira_cash_recurring_transfer, new Object[0]);
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource getPaycheckRecurringSecondaryText(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule) {
        Intrinsics.checkNotNullParameter(uiPaycheckInvestmentSchedule, "<this>");
        if (uiPaycheckInvestmentSchedule.isPaused()) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_label_paused, new Object[0]);
        }
        String directDepositOriginatorName = uiPaycheckInvestmentSchedule.getDirectDepositOriginatorName();
        if (directDepositOriginatorName != null) {
            return StringResource.INSTANCE.invoke(C25434R.string.paycheck_originator_format, directDepositOriginatorName);
        }
        return null;
    }

    public static final String getPaycheckRecurringMetadataPrimaryText(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule) {
        Intrinsics.checkNotNullParameter(uiPaycheckInvestmentSchedule, "<this>");
        return uiPaycheckInvestmentSchedule.getInvestmentScheduleAmount().format();
    }

    public static final ResourceReferences4<ColorStateList> getPaycheckRecurringPrimaryMetadataTextColor(UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule) {
        int i;
        Intrinsics.checkNotNullParameter(uiPaycheckInvestmentSchedule, "<this>");
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        if (uiPaycheckInvestmentSchedule.isPaused()) {
            i = C20690R.attr.colorForeground3;
        } else {
            i = C20690R.attr.colorForeground1;
        }
        return ResourceReferences5.toColorStateList(new ThemedResourceReference(color, i));
    }
}
