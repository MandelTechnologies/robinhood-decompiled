package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionDuxo;
import com.robinhood.android.internalassettransfers.maritalstatus.models.UiMaritalStatusQuestion;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent;", "", "AlertSheetWarning", "AccountsSelected", "NavigateToFragment", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent$AccountsSelected;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent$AlertSheetWarning;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent$NavigateToFragment;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface AccountSelectionEvent {

    /* compiled from: AccountSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent$AlertSheetWarning;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent;", "alertSheetData", "Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "primaryButtonAction", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;", "secondaryButtonAction", "<init>", "(Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;)V", "getAlertSheetData", "()Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "getPrimaryButtonAction", "()Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo$AlertSheetAction;", "getSecondaryButtonAction", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlertSheetWarning implements AccountSelectionEvent {
        public static final int $stable = StringResource.$stable;
        private final AccountFeatureParityBottomSheetData alertSheetData;
        private final AccountSelectionDuxo.AlertSheetAction primaryButtonAction;
        private final AccountSelectionDuxo.AlertSheetAction secondaryButtonAction;

        public static /* synthetic */ AlertSheetWarning copy$default(AlertSheetWarning alertSheetWarning, AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, AccountSelectionDuxo.AlertSheetAction alertSheetAction, AccountSelectionDuxo.AlertSheetAction alertSheetAction2, int i, Object obj) {
            if ((i & 1) != 0) {
                accountFeatureParityBottomSheetData = alertSheetWarning.alertSheetData;
            }
            if ((i & 2) != 0) {
                alertSheetAction = alertSheetWarning.primaryButtonAction;
            }
            if ((i & 4) != 0) {
                alertSheetAction2 = alertSheetWarning.secondaryButtonAction;
            }
            return alertSheetWarning.copy(accountFeatureParityBottomSheetData, alertSheetAction, alertSheetAction2);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountFeatureParityBottomSheetData getAlertSheetData() {
            return this.alertSheetData;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountSelectionDuxo.AlertSheetAction getPrimaryButtonAction() {
            return this.primaryButtonAction;
        }

        /* renamed from: component3, reason: from getter */
        public final AccountSelectionDuxo.AlertSheetAction getSecondaryButtonAction() {
            return this.secondaryButtonAction;
        }

        public final AlertSheetWarning copy(AccountFeatureParityBottomSheetData alertSheetData, AccountSelectionDuxo.AlertSheetAction primaryButtonAction, AccountSelectionDuxo.AlertSheetAction secondaryButtonAction) {
            Intrinsics.checkNotNullParameter(alertSheetData, "alertSheetData");
            Intrinsics.checkNotNullParameter(primaryButtonAction, "primaryButtonAction");
            return new AlertSheetWarning(alertSheetData, primaryButtonAction, secondaryButtonAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertSheetWarning)) {
                return false;
            }
            AlertSheetWarning alertSheetWarning = (AlertSheetWarning) other;
            return Intrinsics.areEqual(this.alertSheetData, alertSheetWarning.alertSheetData) && Intrinsics.areEqual(this.primaryButtonAction, alertSheetWarning.primaryButtonAction) && Intrinsics.areEqual(this.secondaryButtonAction, alertSheetWarning.secondaryButtonAction);
        }

        public int hashCode() {
            int iHashCode = ((this.alertSheetData.hashCode() * 31) + this.primaryButtonAction.hashCode()) * 31;
            AccountSelectionDuxo.AlertSheetAction alertSheetAction = this.secondaryButtonAction;
            return iHashCode + (alertSheetAction == null ? 0 : alertSheetAction.hashCode());
        }

        public String toString() {
            return "AlertSheetWarning(alertSheetData=" + this.alertSheetData + ", primaryButtonAction=" + this.primaryButtonAction + ", secondaryButtonAction=" + this.secondaryButtonAction + ")";
        }

        public AlertSheetWarning(AccountFeatureParityBottomSheetData alertSheetData, AccountSelectionDuxo.AlertSheetAction primaryButtonAction, AccountSelectionDuxo.AlertSheetAction alertSheetAction) {
            Intrinsics.checkNotNullParameter(alertSheetData, "alertSheetData");
            Intrinsics.checkNotNullParameter(primaryButtonAction, "primaryButtonAction");
            this.alertSheetData = alertSheetData;
            this.primaryButtonAction = primaryButtonAction;
            this.secondaryButtonAction = alertSheetAction;
        }

        public final AccountFeatureParityBottomSheetData getAlertSheetData() {
            return this.alertSheetData;
        }

        public final AccountSelectionDuxo.AlertSheetAction getPrimaryButtonAction() {
            return this.primaryButtonAction;
        }

        public final AccountSelectionDuxo.AlertSheetAction getSecondaryButtonAction() {
            return this.secondaryButtonAction;
        }
    }

    /* compiled from: AccountSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent$AccountsSelected;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "martialStatusQuestion", "Lcom/robinhood/android/internalassettransfers/maritalstatus/models/UiMaritalStatusQuestion;", "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/maritalstatus/models/UiMaritalStatusQuestion;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;)V", "getSourceAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSinkAccount", "getMartialStatusQuestion", "()Lcom/robinhood/android/internalassettransfers/maritalstatus/models/UiMaritalStatusQuestion;", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountsSelected implements AccountSelectionEvent {
        public static final int $stable = 8;
        private final EligibleAssets eligibleAssets;
        private final UiMaritalStatusQuestion martialStatusQuestion;
        private final UiIatAccount sinkAccount;
        private final UiIatAccount sourceAccount;

        public static /* synthetic */ AccountsSelected copy$default(AccountsSelected accountsSelected, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, UiMaritalStatusQuestion uiMaritalStatusQuestion, EligibleAssets eligibleAssets, int i, Object obj) {
            if ((i & 1) != 0) {
                uiIatAccount = accountsSelected.sourceAccount;
            }
            if ((i & 2) != 0) {
                uiIatAccount2 = accountsSelected.sinkAccount;
            }
            if ((i & 4) != 0) {
                uiMaritalStatusQuestion = accountsSelected.martialStatusQuestion;
            }
            if ((i & 8) != 0) {
                eligibleAssets = accountsSelected.eligibleAssets;
            }
            return accountsSelected.copy(uiIatAccount, uiIatAccount2, uiMaritalStatusQuestion, eligibleAssets);
        }

        /* renamed from: component1, reason: from getter */
        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final UiMaritalStatusQuestion getMartialStatusQuestion() {
            return this.martialStatusQuestion;
        }

        /* renamed from: component4, reason: from getter */
        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }

        public final AccountsSelected copy(UiIatAccount sourceAccount, UiIatAccount sinkAccount, UiMaritalStatusQuestion martialStatusQuestion, EligibleAssets eligibleAssets) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            return new AccountsSelected(sourceAccount, sinkAccount, martialStatusQuestion, eligibleAssets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountsSelected)) {
                return false;
            }
            AccountsSelected accountsSelected = (AccountsSelected) other;
            return Intrinsics.areEqual(this.sourceAccount, accountsSelected.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, accountsSelected.sinkAccount) && Intrinsics.areEqual(this.martialStatusQuestion, accountsSelected.martialStatusQuestion) && Intrinsics.areEqual(this.eligibleAssets, accountsSelected.eligibleAssets);
        }

        public int hashCode() {
            int iHashCode = ((this.sourceAccount.hashCode() * 31) + this.sinkAccount.hashCode()) * 31;
            UiMaritalStatusQuestion uiMaritalStatusQuestion = this.martialStatusQuestion;
            return ((iHashCode + (uiMaritalStatusQuestion == null ? 0 : uiMaritalStatusQuestion.hashCode())) * 31) + this.eligibleAssets.hashCode();
        }

        public String toString() {
            return "AccountsSelected(sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", martialStatusQuestion=" + this.martialStatusQuestion + ", eligibleAssets=" + this.eligibleAssets + ")";
        }

        public AccountsSelected(UiIatAccount sourceAccount, UiIatAccount sinkAccount, UiMaritalStatusQuestion uiMaritalStatusQuestion, EligibleAssets eligibleAssets) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            this.sourceAccount = sourceAccount;
            this.sinkAccount = sinkAccount;
            this.martialStatusQuestion = uiMaritalStatusQuestion;
            this.eligibleAssets = eligibleAssets;
        }

        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final UiMaritalStatusQuestion getMartialStatusQuestion() {
            return this.martialStatusQuestion;
        }

        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }
    }

    /* compiled from: AccountSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent$NavigateToFragment;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToFragment implements AccountSelectionEvent {
        public static final int $stable = 8;
        private final LegacyFragmentKey fragmentKey;

        public static /* synthetic */ NavigateToFragment copy$default(NavigateToFragment navigateToFragment, LegacyFragmentKey legacyFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                legacyFragmentKey = navigateToFragment.fragmentKey;
            }
            return navigateToFragment.copy(legacyFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final LegacyFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final NavigateToFragment copy(LegacyFragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new NavigateToFragment(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToFragment) && Intrinsics.areEqual(this.fragmentKey, ((NavigateToFragment) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "NavigateToFragment(fragmentKey=" + this.fragmentKey + ")";
        }

        public NavigateToFragment(LegacyFragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final LegacyFragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }
}
