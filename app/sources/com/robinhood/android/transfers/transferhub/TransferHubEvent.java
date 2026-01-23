package com.robinhood.android.transfers.transferhub;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferHubEvent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "", "<init>", "()V", "Intent", "NavigateToDeposits", "NavigateToWithdrawals", "RecurringDeposit", "AchRelationshipDocumentVerificationAction", "NavigateToAcatsIn", "NavigateToMoneyMovement", "NavigateToWires", "NavigateToRetirementAccountTransfer", "NavigateToDirectDeposits", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$AchRelationshipDocumentVerificationAction;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$Intent;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToAcatsIn;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToDeposits;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToDirectDeposits;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToMoneyMovement;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToRetirementAccountTransfer;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToWires;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToWithdrawals;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$RecurringDeposit;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class TransferHubEvent {
    public static final int $stable = 0;

    public /* synthetic */ TransferHubEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TransferHubEvent() {
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$Intent;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Intent extends TransferHubEvent {
        public static final int $stable = 8;
        private final IntentKey intentKey;

        public static /* synthetic */ Intent copy$default(Intent intent, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = intent.intentKey;
            }
            return intent.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getIntentKey() {
            return this.intentKey;
        }

        public final Intent copy(IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            return new Intent(intentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Intent) && Intrinsics.areEqual(this.intentKey, ((Intent) other).intentKey);
        }

        public int hashCode() {
            return this.intentKey.hashCode();
        }

        public String toString() {
            return "Intent(intentKey=" + this.intentKey + ")";
        }

        public final IntentKey getIntentKey() {
            return this.intentKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Intent(IntentKey intentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            this.intentKey = intentKey;
        }
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToDeposits;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "prefillInfo", "Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;", "<init>", "(Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;)V", "getPrefillInfo", "()Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToDeposits extends TransferHubEvent {
        public static final int $stable = 0;
        private final TransferHubEvent2 prefillInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToDeposits() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NavigateToDeposits copy$default(NavigateToDeposits navigateToDeposits, TransferHubEvent2 transferHubEvent2, int i, Object obj) {
            if ((i & 1) != 0) {
                transferHubEvent2 = navigateToDeposits.prefillInfo;
            }
            return navigateToDeposits.copy(transferHubEvent2);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferHubEvent2 getPrefillInfo() {
            return this.prefillInfo;
        }

        public final NavigateToDeposits copy(TransferHubEvent2 prefillInfo) {
            return new NavigateToDeposits(prefillInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToDeposits) && Intrinsics.areEqual(this.prefillInfo, ((NavigateToDeposits) other).prefillInfo);
        }

        public int hashCode() {
            TransferHubEvent2 transferHubEvent2 = this.prefillInfo;
            if (transferHubEvent2 == null) {
                return 0;
            }
            return transferHubEvent2.hashCode();
        }

        public String toString() {
            return "NavigateToDeposits(prefillInfo=" + this.prefillInfo + ")";
        }

        public /* synthetic */ NavigateToDeposits(TransferHubEvent2 transferHubEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : transferHubEvent2);
        }

        public final TransferHubEvent2 getPrefillInfo() {
            return this.prefillInfo;
        }

        public NavigateToDeposits(TransferHubEvent2 transferHubEvent2) {
            super(null);
            this.prefillInfo = transferHubEvent2;
        }
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToWithdrawals;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "prefillInfo", "Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;", "<init>", "(Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;)V", "getPrefillInfo", "()Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToWithdrawals extends TransferHubEvent {
        public static final int $stable = 0;
        private final TransferHubEvent2 prefillInfo;

        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToWithdrawals() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NavigateToWithdrawals copy$default(NavigateToWithdrawals navigateToWithdrawals, TransferHubEvent2 transferHubEvent2, int i, Object obj) {
            if ((i & 1) != 0) {
                transferHubEvent2 = navigateToWithdrawals.prefillInfo;
            }
            return navigateToWithdrawals.copy(transferHubEvent2);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferHubEvent2 getPrefillInfo() {
            return this.prefillInfo;
        }

        public final NavigateToWithdrawals copy(TransferHubEvent2 prefillInfo) {
            return new NavigateToWithdrawals(prefillInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToWithdrawals) && Intrinsics.areEqual(this.prefillInfo, ((NavigateToWithdrawals) other).prefillInfo);
        }

        public int hashCode() {
            TransferHubEvent2 transferHubEvent2 = this.prefillInfo;
            if (transferHubEvent2 == null) {
                return 0;
            }
            return transferHubEvent2.hashCode();
        }

        public String toString() {
            return "NavigateToWithdrawals(prefillInfo=" + this.prefillInfo + ")";
        }

        public /* synthetic */ NavigateToWithdrawals(TransferHubEvent2 transferHubEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : transferHubEvent2);
        }

        public final TransferHubEvent2 getPrefillInfo() {
            return this.prefillInfo;
        }

        public NavigateToWithdrawals(TransferHubEvent2 transferHubEvent2) {
            super(null);
            this.prefillInfo = transferHubEvent2;
        }
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$RecurringDeposit;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "navigationKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getNavigationKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RecurringDeposit extends TransferHubEvent {
        public static final int $stable = 8;
        private final FragmentKey fragmentKey;
        private final IntentKey navigationKey;

        /* JADX WARN: Multi-variable type inference failed */
        public RecurringDeposit() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RecurringDeposit copy$default(RecurringDeposit recurringDeposit, FragmentKey fragmentKey, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = recurringDeposit.fragmentKey;
            }
            if ((i & 2) != 0) {
                intentKey = recurringDeposit.navigationKey;
            }
            return recurringDeposit.copy(fragmentKey, intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        /* renamed from: component2, reason: from getter */
        public final IntentKey getNavigationKey() {
            return this.navigationKey;
        }

        public final RecurringDeposit copy(FragmentKey fragmentKey, IntentKey navigationKey) {
            return new RecurringDeposit(fragmentKey, navigationKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecurringDeposit)) {
                return false;
            }
            RecurringDeposit recurringDeposit = (RecurringDeposit) other;
            return Intrinsics.areEqual(this.fragmentKey, recurringDeposit.fragmentKey) && Intrinsics.areEqual(this.navigationKey, recurringDeposit.navigationKey);
        }

        public int hashCode() {
            FragmentKey fragmentKey = this.fragmentKey;
            int iHashCode = (fragmentKey == null ? 0 : fragmentKey.hashCode()) * 31;
            IntentKey intentKey = this.navigationKey;
            return iHashCode + (intentKey != null ? intentKey.hashCode() : 0);
        }

        public String toString() {
            return "RecurringDeposit(fragmentKey=" + this.fragmentKey + ", navigationKey=" + this.navigationKey + ")";
        }

        public /* synthetic */ RecurringDeposit(FragmentKey fragmentKey, IntentKey intentKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : fragmentKey, (i & 2) != 0 ? null : intentKey);
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final IntentKey getNavigationKey() {
            return this.navigationKey;
        }

        public RecurringDeposit(FragmentKey fragmentKey, IntentKey intentKey) {
            super(null);
            this.fragmentKey = fragmentKey;
            this.navigationKey = intentKey;
        }
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$AchRelationshipDocumentVerificationAction;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "actionOrError", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction;", "", "<init>", "(Lcom/robinhood/utils/Either;)V", "getActionOrError", "()Lcom/robinhood/utils/Either;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AchRelationshipDocumentVerificationAction extends TransferHubEvent {
        public static final int $stable = 8;
        private final Either<com.robinhood.android.transfers.AchRelationshipDocumentVerificationAction, Throwable> actionOrError;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AchRelationshipDocumentVerificationAction copy$default(AchRelationshipDocumentVerificationAction achRelationshipDocumentVerificationAction, Either either, int i, Object obj) {
            if ((i & 1) != 0) {
                either = achRelationshipDocumentVerificationAction.actionOrError;
            }
            return achRelationshipDocumentVerificationAction.copy(either);
        }

        public final Either<com.robinhood.android.transfers.AchRelationshipDocumentVerificationAction, Throwable> component1() {
            return this.actionOrError;
        }

        public final AchRelationshipDocumentVerificationAction copy(Either<? extends com.robinhood.android.transfers.AchRelationshipDocumentVerificationAction, ? extends Throwable> actionOrError) {
            Intrinsics.checkNotNullParameter(actionOrError, "actionOrError");
            return new AchRelationshipDocumentVerificationAction(actionOrError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AchRelationshipDocumentVerificationAction) && Intrinsics.areEqual(this.actionOrError, ((AchRelationshipDocumentVerificationAction) other).actionOrError);
        }

        public int hashCode() {
            return this.actionOrError.hashCode();
        }

        public String toString() {
            return "AchRelationshipDocumentVerificationAction(actionOrError=" + this.actionOrError + ")";
        }

        public final Either<com.robinhood.android.transfers.AchRelationshipDocumentVerificationAction, Throwable> getActionOrError() {
            return this.actionOrError;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AchRelationshipDocumentVerificationAction(Either<? extends com.robinhood.android.transfers.AchRelationshipDocumentVerificationAction, ? extends Throwable> actionOrError) {
            super(null);
            Intrinsics.checkNotNullParameter(actionOrError, "actionOrError");
            this.actionOrError = actionOrError;
        }
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToAcatsIn;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigateToAcatsIn extends TransferHubEvent {
        public static final int $stable = 0;
        public static final NavigateToAcatsIn INSTANCE = new NavigateToAcatsIn();

        private NavigateToAcatsIn() {
            super(null);
        }
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToMoneyMovement;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigateToMoneyMovement extends TransferHubEvent {
        public static final int $stable = 0;
        public static final NavigateToMoneyMovement INSTANCE = new NavigateToMoneyMovement();

        private NavigateToMoneyMovement() {
            super(null);
        }
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToWires;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigateToWires extends TransferHubEvent {
        public static final int $stable = 0;
        public static final NavigateToWires INSTANCE = new NavigateToWires();

        private NavigateToWires() {
            super(null);
        }
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToRetirementAccountTransfer;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigateToRetirementAccountTransfer extends TransferHubEvent {
        public static final int $stable = 0;
        public static final NavigateToRetirementAccountTransfer INSTANCE = new NavigateToRetirementAccountTransfer();

        private NavigateToRetirementAccountTransfer() {
            super(null);
        }
    }

    /* compiled from: TransferHubEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/TransferHubEvent$NavigateToDirectDeposits;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigateToDirectDeposits extends TransferHubEvent {
        public static final int $stable = 0;
        public static final NavigateToDirectDeposits INSTANCE = new NavigateToDirectDeposits();

        private NavigateToDirectDeposits() {
            super(null);
        }
    }
}
