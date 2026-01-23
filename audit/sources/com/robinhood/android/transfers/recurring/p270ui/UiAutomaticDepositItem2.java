package com.robinhood.android.transfers.recurring.p270ui;

import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiAutomaticDepositItem.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"getFrequencyDescription", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/AutomaticDeposit;", "toUiAutomaticDepositListItem", "Lcom/robinhood/android/transfers/recurring/ui/UiAutomaticDepositItem;", "Lcom/robinhood/models/ui/AutomaticDepositWithBankInfo;", "account", "Lcom/robinhood/models/db/Account;", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.UiAutomaticDepositItemKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UiAutomaticDepositItem2 {

    /* compiled from: UiAutomaticDepositItem.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.recurring.ui.UiAutomaticDepositItemKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAutomaticDeposit.Frequency.values().length];
            try {
                iArr[ApiAutomaticDeposit.Frequency.BIWEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.QUARTERLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.ONCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getFrequencyDescription(AutomaticDeposit automaticDeposit) {
        Intrinsics.checkNotNullParameter(automaticDeposit, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[automaticDeposit.getFrequency().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C9631R.string.ach_transfer_automatic_deposit_two_weeks, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C9631R.string.ach_transfer_automatic_deposit_month, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C9631R.string.ach_transfer_automatic_deposit_week, new Object[0]);
        }
        if (i == 4) {
            return StringResource.INSTANCE.invoke(C9631R.string.ach_transfer_automatic_deposit_quarter, new Object[0]);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C9631R.string.ach_transfer_automatic_deposit_once, new Object[0]);
    }

    public static final UiAutomaticDepositItem toUiAutomaticDepositListItem(AutomaticDepositWithBankInfo automaticDepositWithBankInfo, Account account) {
        Intrinsics.checkNotNullParameter(automaticDepositWithBankInfo, "<this>");
        return new UiAutomaticDepositItem(automaticDepositWithBankInfo.getAutomaticDeposit().getId(), account, automaticDepositWithBankInfo.getAutomaticDeposit().getAmount(), automaticDepositWithBankInfo.getAutomaticDeposit().getDestinationAccount().getAccountType(), getFrequencyDescription(automaticDepositWithBankInfo.getAutomaticDeposit()));
    }
}
