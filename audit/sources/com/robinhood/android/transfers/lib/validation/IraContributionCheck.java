package com.robinhood.android.transfers.lib.validation;

import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IraContributionCheck.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/IraContributionCheck;", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "ExceedsContributionLimit", "NoEnoki", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class IraContributionCheck implements TransferCheck {
    public static final IraContributionCheck INSTANCE = new IraContributionCheck();

    private IraContributionCheck() {
    }

    @Override // com.robinhood.android.transfers.lib.validation.TransferCheck
    public ValidationFailure check(TransferValidationInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        IraContributionQuestionnaireResult.IraContribution iraContribution = input.getIraContribution();
        if ((iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.IndirectRollover) || iraContribution == null) {
            return null;
        }
        if (!(iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.OneTimeContribution)) {
            throw new NoWhenBranchMatchedException();
        }
        Money contributionLimit = ((IraContributionQuestionnaireResult.IraContribution.OneTimeContribution) iraContribution).getContributionLimit();
        if (contributionLimit != null && input.getAmount().compareTo(contributionLimit.getDecimalValue()) > 0) {
            return new ExceedsContributionLimit(contributionLimit);
        }
        TransferAccount sinkAccount = input.getSinkAccount();
        if (sinkAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ManagementInfo managementInfo = sinkAccount.getManagementInfo();
        boolean z = (managementInfo != null ? managementInfo.getManagement_type() : null) == ManagementType.MANAGED;
        if (input.isInInterEntityMatchExperiment() || z) {
            return null;
        }
        TransferAccount sourceAccount = input.getSourceAccount();
        if (sourceAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (sourceAccount.isEnokiEnabled() || input.getOverrideNoEnokiAlert()) {
            return null;
        }
        return NoEnoki.INSTANCE;
    }

    /* compiled from: IraContributionCheck.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/IraContributionCheck$ExceedsContributionLimit;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "contributionLimit", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getContributionLimit", "()Lcom/robinhood/models/util/Money;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExceedsContributionLimit implements ValidationFailure {
        private final Money contributionLimit;

        public static /* synthetic */ ExceedsContributionLimit copy$default(ExceedsContributionLimit exceedsContributionLimit, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                money = exceedsContributionLimit.contributionLimit;
            }
            return exceedsContributionLimit.copy(money);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getContributionLimit() {
            return this.contributionLimit;
        }

        public final ExceedsContributionLimit copy(Money contributionLimit) {
            Intrinsics.checkNotNullParameter(contributionLimit, "contributionLimit");
            return new ExceedsContributionLimit(contributionLimit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExceedsContributionLimit) && Intrinsics.areEqual(this.contributionLimit, ((ExceedsContributionLimit) other).contributionLimit);
        }

        public int hashCode() {
            return this.contributionLimit.hashCode();
        }

        public String toString() {
            return "ExceedsContributionLimit(contributionLimit=" + this.contributionLimit + ")";
        }

        public ExceedsContributionLimit(Money contributionLimit) {
            Intrinsics.checkNotNullParameter(contributionLimit, "contributionLimit");
            this.contributionLimit = contributionLimit;
        }

        public final Money getContributionLimit() {
            return this.contributionLimit;
        }

        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        public void showAlert(BaseActivity activity, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setId(C30383R.id.dialog_id_ira_contribution_exceeded).setTitle(C30383R.string.transfer_ira_contribution_exceeded_error_title, Money.format$default(this.contributionLimit, null, false, null, false, 0, null, false, null, false, false, 1023, null)).setMessage(C30383R.string.transfer_ira_contribution_exceeded_error_message, new Object[0]).setPositiveButton(C11048R.string.general_label_contact_support, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "iraContributionLimitExceeded", false, 4, null);
        }
    }

    /* compiled from: IraContributionCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/IraContributionCheck$NoEnoki;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "<init>", "()V", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NoEnoki implements ValidationFailure {
        public static final NoEnoki INSTANCE = new NoEnoki();

        private NoEnoki() {
        }

        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        public void showAlert(BaseActivity activity, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setId(C30383R.id.dialog_id_ira_contribution_no_enoki).setTitle(C30383R.string.transfer_ira_contribution_no_enoki_error_title, new Object[0]).setMessage(C30383R.string.transfer_ira_contribution_no_enoki_error_message, new Object[0]).setPositiveButton(C30383R.string.transfer_ira_contribution_no_enoki_choose_different_account, new Object[0]).setNegativeButton(C30383R.string.transfer_ira_contribution_no_enoki_transfer, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "iraContributionNoEnoki", false, 4, null);
        }
    }
}
