package com.robinhood.android.transfers.p271ui.retirement.contributions;

import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.validation.ValidationFailure;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateRetirementContributionEvent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "", "ValidationFailureEvent", "StartRolloverEvent", "SelectYearEvent", "CreateContributionErrorEvent", "CreateContributionSuccessEvent", "FinishEvent", "BackEvent", "ShowRewardReminder", "LaunchGoldMatchFlow", "ContinueInFullscreenMatchSelection", "ShowAcatsClawbackAlert", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$BackEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$ContinueInFullscreenMatchSelection;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$CreateContributionErrorEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$CreateContributionSuccessEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$FinishEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$LaunchGoldMatchFlow;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$SelectYearEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$ShowAcatsClawbackAlert;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$ShowRewardReminder;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$StartRolloverEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$ValidationFailureEvent;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface CreateRetirementContributionEvent {

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$ValidationFailureEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "failure", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "<init>", "(Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;)V", "getFailure", "()Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationFailureEvent implements CreateRetirementContributionEvent {
        public static final int $stable = 8;
        private final ValidationFailure failure;

        public static /* synthetic */ ValidationFailureEvent copy$default(ValidationFailureEvent validationFailureEvent, ValidationFailure validationFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                validationFailure = validationFailureEvent.failure;
            }
            return validationFailureEvent.copy(validationFailure);
        }

        /* renamed from: component1, reason: from getter */
        public final ValidationFailure getFailure() {
            return this.failure;
        }

        public final ValidationFailureEvent copy(ValidationFailure failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new ValidationFailureEvent(failure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidationFailureEvent) && Intrinsics.areEqual(this.failure, ((ValidationFailureEvent) other).failure);
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return "ValidationFailureEvent(failure=" + this.failure + ")";
        }

        public ValidationFailureEvent(ValidationFailure failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.failure = failure;
        }

        public final ValidationFailure getFailure() {
            return this.failure;
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$StartRolloverEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "transferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "<init>", "(Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)V", "getTransferConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartRolloverEvent implements CreateRetirementContributionEvent {
        public static final int $stable = 8;
        private final TransferConfiguration transferConfiguration;

        public static /* synthetic */ StartRolloverEvent copy$default(StartRolloverEvent startRolloverEvent, TransferConfiguration transferConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                transferConfiguration = startRolloverEvent.transferConfiguration;
            }
            return startRolloverEvent.copy(transferConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferConfiguration getTransferConfiguration() {
            return this.transferConfiguration;
        }

        public final StartRolloverEvent copy(TransferConfiguration transferConfiguration) {
            Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
            return new StartRolloverEvent(transferConfiguration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartRolloverEvent) && Intrinsics.areEqual(this.transferConfiguration, ((StartRolloverEvent) other).transferConfiguration);
        }

        public int hashCode() {
            return this.transferConfiguration.hashCode();
        }

        public String toString() {
            return "StartRolloverEvent(transferConfiguration=" + this.transferConfiguration + ")";
        }

        public StartRolloverEvent(TransferConfiguration transferConfiguration) {
            Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
            this.transferConfiguration = transferConfiguration;
        }

        public final TransferConfiguration getTransferConfiguration() {
            return this.transferConfiguration;
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$SelectYearEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectYearEvent implements CreateRetirementContributionEvent {
        public static final int $stable = 8;
        private final TransferAccount account;

        public static /* synthetic */ SelectYearEvent copy$default(SelectYearEvent selectYearEvent, TransferAccount transferAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = selectYearEvent.account;
            }
            return selectYearEvent.copy(transferAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getAccount() {
            return this.account;
        }

        public final SelectYearEvent copy(TransferAccount account) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new SelectYearEvent(account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectYearEvent) && Intrinsics.areEqual(this.account, ((SelectYearEvent) other).account);
        }

        public int hashCode() {
            return this.account.hashCode();
        }

        public String toString() {
            return "SelectYearEvent(account=" + this.account + ")";
        }

        public SelectYearEvent(TransferAccount account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
        }

        public final TransferAccount getAccount() {
            return this.account;
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$CreateContributionErrorEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreateContributionErrorEvent implements CreateRetirementContributionEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ CreateContributionErrorEvent copy$default(CreateContributionErrorEvent createContributionErrorEvent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = createContributionErrorEvent.error;
            }
            return createContributionErrorEvent.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final CreateContributionErrorEvent copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new CreateContributionErrorEvent(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateContributionErrorEvent) && Intrinsics.areEqual(this.error, ((CreateContributionErrorEvent) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "CreateContributionErrorEvent(error=" + this.error + ")";
        }

        public CreateContributionErrorEvent(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$CreateContributionSuccessEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "<init>", "(Lcom/robinhood/models/ui/bonfire/PostTransferFlow;)V", "getPostTransferFlow", "()Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreateContributionSuccessEvent implements CreateRetirementContributionEvent {
        public static final int $stable = 8;
        private final PostTransferFlow postTransferFlow;

        public static /* synthetic */ CreateContributionSuccessEvent copy$default(CreateContributionSuccessEvent createContributionSuccessEvent, PostTransferFlow postTransferFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                postTransferFlow = createContributionSuccessEvent.postTransferFlow;
            }
            return createContributionSuccessEvent.copy(postTransferFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }

        public final CreateContributionSuccessEvent copy(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            return new CreateContributionSuccessEvent(postTransferFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateContributionSuccessEvent) && Intrinsics.areEqual(this.postTransferFlow, ((CreateContributionSuccessEvent) other).postTransferFlow);
        }

        public int hashCode() {
            return this.postTransferFlow.hashCode();
        }

        public String toString() {
            return "CreateContributionSuccessEvent(postTransferFlow=" + this.postTransferFlow + ")";
        }

        public CreateContributionSuccessEvent(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            this.postTransferFlow = postTransferFlow;
        }

        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$FinishEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FinishEvent implements CreateRetirementContributionEvent {
        public static final int $stable = 0;
        public static final FinishEvent INSTANCE = new FinishEvent();

        private FinishEvent() {
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$BackEvent;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BackEvent implements CreateRetirementContributionEvent {
        public static final int $stable = 0;
        public static final BackEvent INSTANCE = new BackEvent();

        private BackEvent() {
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$ShowRewardReminder;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowRewardReminder implements CreateRetirementContributionEvent {
        public static final int $stable = 0;
        public static final ShowRewardReminder INSTANCE = new ShowRewardReminder();

        private ShowRewardReminder() {
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$LaunchGoldMatchFlow;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "launchExtras", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras;", "<init>", "(Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras;)V", "getLaunchExtras", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/MatchSelectionActivity$Extras;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchGoldMatchFlow implements CreateRetirementContributionEvent {
        public static final int $stable = 8;
        private final MatchSelectionActivity.Extras launchExtras;

        public static /* synthetic */ LaunchGoldMatchFlow copy$default(LaunchGoldMatchFlow launchGoldMatchFlow, MatchSelectionActivity.Extras extras, int i, Object obj) {
            if ((i & 1) != 0) {
                extras = launchGoldMatchFlow.launchExtras;
            }
            return launchGoldMatchFlow.copy(extras);
        }

        /* renamed from: component1, reason: from getter */
        public final MatchSelectionActivity.Extras getLaunchExtras() {
            return this.launchExtras;
        }

        public final LaunchGoldMatchFlow copy(MatchSelectionActivity.Extras launchExtras) {
            Intrinsics.checkNotNullParameter(launchExtras, "launchExtras");
            return new LaunchGoldMatchFlow(launchExtras);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchGoldMatchFlow) && Intrinsics.areEqual(this.launchExtras, ((LaunchGoldMatchFlow) other).launchExtras);
        }

        public int hashCode() {
            return this.launchExtras.hashCode();
        }

        public String toString() {
            return "LaunchGoldMatchFlow(launchExtras=" + this.launchExtras + ")";
        }

        public LaunchGoldMatchFlow(MatchSelectionActivity.Extras launchExtras) {
            Intrinsics.checkNotNullParameter(launchExtras, "launchExtras");
            this.launchExtras = launchExtras;
        }

        public final MatchSelectionActivity.Extras getLaunchExtras() {
            return this.launchExtras;
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$ContinueInFullscreenMatchSelection;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "bundle", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "<init>", "(Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;)V", "getBundle", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContinueInFullscreenMatchSelection implements CreateRetirementContributionEvent {
        public static final int $stable = 8;
        private final ContributionBundle bundle;

        public static /* synthetic */ ContinueInFullscreenMatchSelection copy$default(ContinueInFullscreenMatchSelection continueInFullscreenMatchSelection, ContributionBundle contributionBundle, int i, Object obj) {
            if ((i & 1) != 0) {
                contributionBundle = continueInFullscreenMatchSelection.bundle;
            }
            return continueInFullscreenMatchSelection.copy(contributionBundle);
        }

        /* renamed from: component1, reason: from getter */
        public final ContributionBundle getBundle() {
            return this.bundle;
        }

        public final ContinueInFullscreenMatchSelection copy(ContributionBundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new ContinueInFullscreenMatchSelection(bundle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContinueInFullscreenMatchSelection) && Intrinsics.areEqual(this.bundle, ((ContinueInFullscreenMatchSelection) other).bundle);
        }

        public int hashCode() {
            return this.bundle.hashCode();
        }

        public String toString() {
            return "ContinueInFullscreenMatchSelection(bundle=" + this.bundle + ")";
        }

        public ContinueInFullscreenMatchSelection(ContributionBundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.bundle = bundle;
        }

        public final ContributionBundle getBundle() {
            return this.bundle;
        }
    }

    /* compiled from: CreateRetirementContributionEvent.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent$ShowAcatsClawbackAlert;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "alertAction", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplayRTPUpsellAction;", "bundle", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;)V", "getAlertAction", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "getBundle", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAcatsClawbackAlert implements CreateRetirementContributionEvent {
        public static final int $stable = 8;
        private final AlertAction<DisplayRTPUpsellAction> alertAction;
        private final ContributionBundle bundle;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowAcatsClawbackAlert copy$default(ShowAcatsClawbackAlert showAcatsClawbackAlert, AlertAction alertAction, ContributionBundle contributionBundle, int i, Object obj) {
            if ((i & 1) != 0) {
                alertAction = showAcatsClawbackAlert.alertAction;
            }
            if ((i & 2) != 0) {
                contributionBundle = showAcatsClawbackAlert.bundle;
            }
            return showAcatsClawbackAlert.copy(alertAction, contributionBundle);
        }

        public final AlertAction<DisplayRTPUpsellAction> component1() {
            return this.alertAction;
        }

        /* renamed from: component2, reason: from getter */
        public final ContributionBundle getBundle() {
            return this.bundle;
        }

        public final ShowAcatsClawbackAlert copy(AlertAction<? extends DisplayRTPUpsellAction> alertAction, ContributionBundle bundle) {
            Intrinsics.checkNotNullParameter(alertAction, "alertAction");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new ShowAcatsClawbackAlert(alertAction, bundle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowAcatsClawbackAlert)) {
                return false;
            }
            ShowAcatsClawbackAlert showAcatsClawbackAlert = (ShowAcatsClawbackAlert) other;
            return Intrinsics.areEqual(this.alertAction, showAcatsClawbackAlert.alertAction) && Intrinsics.areEqual(this.bundle, showAcatsClawbackAlert.bundle);
        }

        public int hashCode() {
            return (this.alertAction.hashCode() * 31) + this.bundle.hashCode();
        }

        public String toString() {
            return "ShowAcatsClawbackAlert(alertAction=" + this.alertAction + ", bundle=" + this.bundle + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ShowAcatsClawbackAlert(AlertAction<? extends DisplayRTPUpsellAction> alertAction, ContributionBundle bundle) {
            Intrinsics.checkNotNullParameter(alertAction, "alertAction");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.alertAction = alertAction;
            this.bundle = bundle;
        }

        public final AlertAction<DisplayRTPUpsellAction> getAlertAction() {
            return this.alertAction;
        }

        public final ContributionBundle getBundle() {
            return this.bundle;
        }
    }
}
