package com.robinhood.android.transfers.lib.validation;

import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PdtWarningCheck.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/PdtWarningCheck;", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "<init>", "()V", "hasShownWarning", "", "check", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "Failure", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PdtWarningCheck implements TransferCheck {
    private boolean hasShownWarning;

    @Override // com.robinhood.android.transfers.lib.validation.TransferCheck
    public ValidationFailure check(TransferValidationInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.isMemberPdtRevampV1() || this.hasShownWarning) {
            return null;
        }
        TransferAccount sourceAccount = input.getSourceAccount();
        if (sourceAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!sourceAccount.isIraOrRhsAccount()) {
            return null;
        }
        TransferAccount sinkAccount = input.getSinkAccount();
        if (sinkAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!sinkAccount.isExternal() || input.getUnifiedBalances() == null || input.getPortfolio() == null || !input.getUnifiedBalances().getBrokerageBalances().isPatternDayTrader()) {
            return null;
        }
        BigDecimal bigDecimalSubtract = input.getPortfolio().getEquity().subtract(input.getAmount());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimalSubtract.compareTo(Portfolio.MINIMUM_BALANCE_FOR_PDT_EXEMPTION) < 0) {
            return new Failure(this, input.getSourceAccount().getType());
        }
        return null;
    }

    /* compiled from: PdtWarningCheck.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/PdtWarningCheck$Failure;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "accountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "<init>", "(Lcom/robinhood/android/transfers/lib/validation/PdtWarningCheck;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;)V", "getAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public final class Failure implements ValidationFailure {
        private final ApiTransferAccount.TransferAccountType accountType;
        final /* synthetic */ PdtWarningCheck this$0;

        /* compiled from: PdtWarningCheck.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
                try {
                    iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Failure(PdtWarningCheck pdtWarningCheck, ApiTransferAccount.TransferAccountType accountType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.this$0 = pdtWarningCheck;
            this.accountType = accountType;
        }

        public final ApiTransferAccount.TransferAccountType getAccountType() {
            return this.accountType;
        }

        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        public void showAlert(BaseActivity activity, EventLogger eventLogger) throws Resources.NotFoundException {
            int i;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Resources resources = activity.getResources();
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.accountType.ordinal()];
            if (i2 == 1) {
                i = C8179R.string.account_type_ira_roth;
            } else if (i2 == 2) {
                i = C8179R.string.account_type_ira_traditional;
            } else if (i2 == 3) {
                i = C8179R.string.account_type_joint_tenancy_with_ros_short;
            } else {
                i = C8179R.string.account_type_individual;
            }
            String string2 = resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = activity.getString(C30383R.string.margin_day_trade_pdt_withdrawal_warning, string2);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(activity).setId(C30383R.id.dialog_id_ach_transfer_pdt_warning).setMessage(string3);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, supportFragmentManager, "pdtWithdrawalWarning", false, 4, null);
            this.this$0.hasShownWarning = true;
        }
    }
}
