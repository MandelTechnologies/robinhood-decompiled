package com.robinhood.android.transfers.recurring.p270ui;

import android.content.res.Resources;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.ach.format.BankAccountTypes;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.UiAutomaticDeposit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;

/* compiled from: UiAutomaticDeposits.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\n\u001a\u0019\u0010\u0012\u001a\u00020\u0011*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/models/api/ApiAutomaticDeposit$DestinationAccountType;", "", "getDestinationAccountDisplayStringResource", "(Lcom/robinhood/models/api/ApiAutomaticDeposit$DestinationAccountType;)Ljava/lang/Integer;", "Landroid/content/res/Resources;", "resources", "", "getDestinationAccountDisplayString", "(Lcom/robinhood/models/api/ApiAutomaticDeposit$DestinationAccountType;Landroid/content/res/Resources;)Ljava/lang/String;", "Lcom/robinhood/models/ui/UiAutomaticDeposit;", "(Lcom/robinhood/models/ui/UiAutomaticDeposit;Landroid/content/res/Resources;)Ljava/lang/String;", "getFrequencyDisplayString", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "(Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Landroid/content/res/Resources;)Ljava/lang/String;", "getAchRelationshipDisplayName", "j$/time/Clock", Card.Icon.CLOCK, "", "canBeSkipped", "(Lcom/robinhood/models/ui/UiAutomaticDeposit;Lj$/time/Clock;)Z", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.UiAutomaticDepositsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UiAutomaticDeposits {

    /* compiled from: UiAutomaticDeposits.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.recurring.ui.UiAutomaticDepositsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiAutomaticDeposit.DestinationAccountType.values().length];
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_ROTH_INHERITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_TRADITIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_TRADITIONAL_INHERITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.RHY_ACCOUNT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiAutomaticDeposit.DestinationAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiAutomaticDeposit.Frequency.values().length];
            try {
                iArr2[ApiAutomaticDeposit.Frequency.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ApiAutomaticDeposit.Frequency.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Integer getDestinationAccountDisplayStringResource(ApiAutomaticDeposit.DestinationAccountType destinationAccountType) {
        Intrinsics.checkNotNullParameter(destinationAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[destinationAccountType.ordinal()]) {
            case 1:
                return Integer.valueOf(C8179R.string.account_type_individual);
            case 2:
            case 3:
                return Integer.valueOf(C8179R.string.account_type_ira_roth);
            case 4:
            case 5:
                return Integer.valueOf(C8179R.string.account_type_ira_traditional);
            case 6:
                return Integer.valueOf(C8179R.string.account_type_joint_tenancy_with_ros_short);
            case 7:
                return Integer.valueOf(C8179R.string.account_type_spending);
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getDestinationAccountDisplayString(ApiAutomaticDeposit.DestinationAccountType destinationAccountType, Resources resources) {
        Intrinsics.checkNotNullParameter(destinationAccountType, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Integer destinationAccountDisplayStringResource = getDestinationAccountDisplayStringResource(destinationAccountType);
        if (destinationAccountDisplayStringResource != null) {
            return resources.getString(destinationAccountDisplayStringResource.intValue());
        }
        return null;
    }

    public static final String getDestinationAccountDisplayString(UiAutomaticDeposit uiAutomaticDeposit, Resources resources) {
        Intrinsics.checkNotNullParameter(uiAutomaticDeposit, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return getDestinationAccountDisplayString(uiAutomaticDeposit.getAutomaticDeposit().getDestinationAccount().getAccountType(), resources);
    }

    public static final String getFrequencyDisplayString(UiAutomaticDeposit uiAutomaticDeposit, Resources resources) {
        Intrinsics.checkNotNullParameter(uiAutomaticDeposit, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return getFrequencyDisplayString(uiAutomaticDeposit.getAutomaticDeposit().getFrequency(), resources);
    }

    public static final String getFrequencyDisplayString(ApiAutomaticDeposit.Frequency frequency, Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i2 = WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        if (i2 == 1) {
            i = C30383R.string.automatic_deposit_frequency_once;
        } else if (i2 == 2) {
            i = C30383R.string.automatic_deposit_frequency_weekly;
        } else if (i2 == 3) {
            i = C30383R.string.automatic_deposit_frequency_biweekly;
        } else if (i2 == 4) {
            i = C30383R.string.automatic_deposit_frequency_monthly;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C30383R.string.automatic_deposit_frequency_quarterly;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getAchRelationshipDisplayName(UiAutomaticDeposit uiAutomaticDeposit, Resources resources) {
        Intrinsics.checkNotNullParameter(uiAutomaticDeposit, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return BankAccountTypes.getTypeAndLastFourDisplayString(uiAutomaticDeposit.getBackingPaymentInstrument().getBankAccountType(), resources, uiAutomaticDeposit.getBackingPaymentInstrument().getBankAccountNumber());
    }

    public static final boolean canBeSkipped(UiAutomaticDeposit uiAutomaticDeposit, Clock clock) {
        Intrinsics.checkNotNullParameter(uiAutomaticDeposit, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        return uiAutomaticDeposit.getAutomaticDeposit().canBeSkipped(clock);
    }
}
