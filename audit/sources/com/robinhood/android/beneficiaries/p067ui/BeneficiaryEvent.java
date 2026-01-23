package com.robinhood.android.beneficiaries.p067ui;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowEmailViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustDateViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustNameViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustTaxIdentifierViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.p067ui.trustflow.BeneficiaryTrustFlowToolbarViewState;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryEvent.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "", "ShowErrorAlertDialog", "NavigateToCreateParentBeneficiaryListFragment", "NavigateToCreateParentBeneficiaryAddFragment", "NavigateToCreateParentBeneficiaryUpdateFragment", "NavigateToCreateParentBeneficiaryDetailsFragment", "NavigateBackFromBeneficiaryFlowFragment", "NavigateToBeneficiaryIntroFlow", "NavigateToTrustNameScreen", "NavigateToTrustDateScreen", "NavigateToTrustTaxIdentifierScreen", "NavigateToTrustEmailScreen", "NavigateToIndividualFlow", "NavigateToAdditionalAccountsScreen", "NavigateToAdditionalAgreementScreen", "NavigateToLoadingScreen", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateBackFromBeneficiaryFlowFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToAdditionalAccountsScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToAdditionalAgreementScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToBeneficiaryIntroFlow;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToCreateParentBeneficiaryAddFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToCreateParentBeneficiaryDetailsFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToCreateParentBeneficiaryListFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToCreateParentBeneficiaryUpdateFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToIndividualFlow;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToLoadingScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToTrustDateScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToTrustEmailScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToTrustNameScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToTrustTaxIdentifierScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$ShowErrorAlertDialog;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BeneficiaryEvent {

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$ShowErrorAlertDialog;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowErrorAlertDialog implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final Exception exception;

        public static /* synthetic */ ShowErrorAlertDialog copy$default(ShowErrorAlertDialog showErrorAlertDialog, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = showErrorAlertDialog.exception;
            }
            return showErrorAlertDialog.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        public final ShowErrorAlertDialog copy(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new ShowErrorAlertDialog(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowErrorAlertDialog) && Intrinsics.areEqual(this.exception, ((ShowErrorAlertDialog) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "ShowErrorAlertDialog(exception=" + this.exception + ")";
        }

        public ShowErrorAlertDialog(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final Exception getException() {
            return this.exception;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToCreateParentBeneficiaryListFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "accountNumber", "", "hasMultipleAccounts", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getHasMultipleAccounts", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToCreateParentBeneficiaryListFragment implements BeneficiaryEvent {
        public static final int $stable = 0;
        private final String accountNumber;
        private final boolean hasMultipleAccounts;

        public static /* synthetic */ NavigateToCreateParentBeneficiaryListFragment copy$default(NavigateToCreateParentBeneficiaryListFragment navigateToCreateParentBeneficiaryListFragment, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCreateParentBeneficiaryListFragment.accountNumber;
            }
            if ((i & 2) != 0) {
                z = navigateToCreateParentBeneficiaryListFragment.hasMultipleAccounts;
            }
            return navigateToCreateParentBeneficiaryListFragment.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasMultipleAccounts() {
            return this.hasMultipleAccounts;
        }

        public final NavigateToCreateParentBeneficiaryListFragment copy(String accountNumber, boolean hasMultipleAccounts) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new NavigateToCreateParentBeneficiaryListFragment(accountNumber, hasMultipleAccounts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToCreateParentBeneficiaryListFragment)) {
                return false;
            }
            NavigateToCreateParentBeneficiaryListFragment navigateToCreateParentBeneficiaryListFragment = (NavigateToCreateParentBeneficiaryListFragment) other;
            return Intrinsics.areEqual(this.accountNumber, navigateToCreateParentBeneficiaryListFragment.accountNumber) && this.hasMultipleAccounts == navigateToCreateParentBeneficiaryListFragment.hasMultipleAccounts;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.hasMultipleAccounts);
        }

        public String toString() {
            return "NavigateToCreateParentBeneficiaryListFragment(accountNumber=" + this.accountNumber + ", hasMultipleAccounts=" + this.hasMultipleAccounts + ")";
        }

        public NavigateToCreateParentBeneficiaryListFragment(String accountNumber, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.hasMultipleAccounts = z;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getHasMultipleAccounts() {
            return this.hasMultipleAccounts;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToCreateParentBeneficiaryAddFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToCreateParentBeneficiaryAddFragment implements BeneficiaryEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ NavigateToCreateParentBeneficiaryAddFragment copy$default(NavigateToCreateParentBeneficiaryAddFragment navigateToCreateParentBeneficiaryAddFragment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCreateParentBeneficiaryAddFragment.accountNumber;
            }
            return navigateToCreateParentBeneficiaryAddFragment.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final NavigateToCreateParentBeneficiaryAddFragment copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new NavigateToCreateParentBeneficiaryAddFragment(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToCreateParentBeneficiaryAddFragment) && Intrinsics.areEqual(this.accountNumber, ((NavigateToCreateParentBeneficiaryAddFragment) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "NavigateToCreateParentBeneficiaryAddFragment(accountNumber=" + this.accountNumber + ")";
        }

        public NavigateToCreateParentBeneficiaryAddFragment(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToCreateParentBeneficiaryUpdateFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "accountNumber", "", "beneficiaryId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getBeneficiaryId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToCreateParentBeneficiaryUpdateFragment implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID beneficiaryId;

        public static /* synthetic */ NavigateToCreateParentBeneficiaryUpdateFragment copy$default(NavigateToCreateParentBeneficiaryUpdateFragment navigateToCreateParentBeneficiaryUpdateFragment, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCreateParentBeneficiaryUpdateFragment.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = navigateToCreateParentBeneficiaryUpdateFragment.beneficiaryId;
            }
            return navigateToCreateParentBeneficiaryUpdateFragment.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getBeneficiaryId() {
            return this.beneficiaryId;
        }

        public final NavigateToCreateParentBeneficiaryUpdateFragment copy(String accountNumber, UUID beneficiaryId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            return new NavigateToCreateParentBeneficiaryUpdateFragment(accountNumber, beneficiaryId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToCreateParentBeneficiaryUpdateFragment)) {
                return false;
            }
            NavigateToCreateParentBeneficiaryUpdateFragment navigateToCreateParentBeneficiaryUpdateFragment = (NavigateToCreateParentBeneficiaryUpdateFragment) other;
            return Intrinsics.areEqual(this.accountNumber, navigateToCreateParentBeneficiaryUpdateFragment.accountNumber) && Intrinsics.areEqual(this.beneficiaryId, navigateToCreateParentBeneficiaryUpdateFragment.beneficiaryId);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.beneficiaryId.hashCode();
        }

        public String toString() {
            return "NavigateToCreateParentBeneficiaryUpdateFragment(accountNumber=" + this.accountNumber + ", beneficiaryId=" + this.beneficiaryId + ")";
        }

        public NavigateToCreateParentBeneficiaryUpdateFragment(String accountNumber, UUID beneficiaryId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.accountNumber = accountNumber;
            this.beneficiaryId = beneficiaryId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getBeneficiaryId() {
            return this.beneficiaryId;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToCreateParentBeneficiaryDetailsFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "accountNumber", "", "beneficiaryId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getBeneficiaryId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToCreateParentBeneficiaryDetailsFragment implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID beneficiaryId;

        public static /* synthetic */ NavigateToCreateParentBeneficiaryDetailsFragment copy$default(NavigateToCreateParentBeneficiaryDetailsFragment navigateToCreateParentBeneficiaryDetailsFragment, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCreateParentBeneficiaryDetailsFragment.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = navigateToCreateParentBeneficiaryDetailsFragment.beneficiaryId;
            }
            return navigateToCreateParentBeneficiaryDetailsFragment.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getBeneficiaryId() {
            return this.beneficiaryId;
        }

        public final NavigateToCreateParentBeneficiaryDetailsFragment copy(String accountNumber, UUID beneficiaryId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            return new NavigateToCreateParentBeneficiaryDetailsFragment(accountNumber, beneficiaryId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToCreateParentBeneficiaryDetailsFragment)) {
                return false;
            }
            NavigateToCreateParentBeneficiaryDetailsFragment navigateToCreateParentBeneficiaryDetailsFragment = (NavigateToCreateParentBeneficiaryDetailsFragment) other;
            return Intrinsics.areEqual(this.accountNumber, navigateToCreateParentBeneficiaryDetailsFragment.accountNumber) && Intrinsics.areEqual(this.beneficiaryId, navigateToCreateParentBeneficiaryDetailsFragment.beneficiaryId);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.beneficiaryId.hashCode();
        }

        public String toString() {
            return "NavigateToCreateParentBeneficiaryDetailsFragment(accountNumber=" + this.accountNumber + ", beneficiaryId=" + this.beneficiaryId + ")";
        }

        public NavigateToCreateParentBeneficiaryDetailsFragment(String accountNumber, UUID beneficiaryId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.accountNumber = accountNumber;
            this.beneficiaryId = beneficiaryId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getBeneficiaryId() {
            return this.beneficiaryId;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateBackFromBeneficiaryFlowFragment;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateBackFromBeneficiaryFlowFragment implements BeneficiaryEvent {
        public static final int $stable = 0;
        public static final NavigateBackFromBeneficiaryFlowFragment INSTANCE = new NavigateBackFromBeneficiaryFlowFragment();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateBackFromBeneficiaryFlowFragment);
        }

        public int hashCode() {
            return 319936995;
        }

        public String toString() {
            return "NavigateBackFromBeneficiaryFlowFragment";
        }

        private NavigateBackFromBeneficiaryFlowFragment() {
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToBeneficiaryIntroFlow;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToBeneficiaryIntroFlow implements BeneficiaryEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ NavigateToBeneficiaryIntroFlow copy$default(NavigateToBeneficiaryIntroFlow navigateToBeneficiaryIntroFlow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToBeneficiaryIntroFlow.accountNumber;
            }
            return navigateToBeneficiaryIntroFlow.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final NavigateToBeneficiaryIntroFlow copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new NavigateToBeneficiaryIntroFlow(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToBeneficiaryIntroFlow) && Intrinsics.areEqual(this.accountNumber, ((NavigateToBeneficiaryIntroFlow) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "NavigateToBeneficiaryIntroFlow(accountNumber=" + this.accountNumber + ")";
        }

        public NavigateToBeneficiaryIntroFlow(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToTrustNameScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "trustNameViewState", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;", "toolbarViewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;)V", "getTrustNameViewState", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;", "getToolbarViewState", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToTrustNameScreen implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final BeneficiaryTrustFlowToolbarViewState toolbarViewState;
        private final BeneficiaryFlowTrustNameViewModel trustNameViewState;

        public static /* synthetic */ NavigateToTrustNameScreen copy$default(NavigateToTrustNameScreen navigateToTrustNameScreen, BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel, BeneficiaryTrustFlowToolbarViewState beneficiaryTrustFlowToolbarViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowTrustNameViewModel = navigateToTrustNameScreen.trustNameViewState;
            }
            if ((i & 2) != 0) {
                beneficiaryTrustFlowToolbarViewState = navigateToTrustNameScreen.toolbarViewState;
            }
            return navigateToTrustNameScreen.copy(beneficiaryFlowTrustNameViewModel, beneficiaryTrustFlowToolbarViewState);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowTrustNameViewModel getTrustNameViewState() {
            return this.trustNameViewState;
        }

        /* renamed from: component2, reason: from getter */
        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }

        public final NavigateToTrustNameScreen copy(BeneficiaryFlowTrustNameViewModel trustNameViewState, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(trustNameViewState, "trustNameViewState");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            return new NavigateToTrustNameScreen(trustNameViewState, toolbarViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToTrustNameScreen)) {
                return false;
            }
            NavigateToTrustNameScreen navigateToTrustNameScreen = (NavigateToTrustNameScreen) other;
            return Intrinsics.areEqual(this.trustNameViewState, navigateToTrustNameScreen.trustNameViewState) && Intrinsics.areEqual(this.toolbarViewState, navigateToTrustNameScreen.toolbarViewState);
        }

        public int hashCode() {
            return (this.trustNameViewState.hashCode() * 31) + this.toolbarViewState.hashCode();
        }

        public String toString() {
            return "NavigateToTrustNameScreen(trustNameViewState=" + this.trustNameViewState + ", toolbarViewState=" + this.toolbarViewState + ")";
        }

        public NavigateToTrustNameScreen(BeneficiaryFlowTrustNameViewModel trustNameViewState, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(trustNameViewState, "trustNameViewState");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            this.trustNameViewState = trustNameViewState;
            this.toolbarViewState = toolbarViewState;
        }

        public final BeneficiaryFlowTrustNameViewModel getTrustNameViewState() {
            return this.trustNameViewState;
        }

        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToTrustDateScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "trustDateViewState", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "toolbarViewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;)V", "getTrustDateViewState", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "getToolbarViewState", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToTrustDateScreen implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final BeneficiaryTrustFlowToolbarViewState toolbarViewState;
        private final BeneficiaryFlowTrustDateViewModel trustDateViewState;

        public static /* synthetic */ NavigateToTrustDateScreen copy$default(NavigateToTrustDateScreen navigateToTrustDateScreen, BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel, BeneficiaryTrustFlowToolbarViewState beneficiaryTrustFlowToolbarViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowTrustDateViewModel = navigateToTrustDateScreen.trustDateViewState;
            }
            if ((i & 2) != 0) {
                beneficiaryTrustFlowToolbarViewState = navigateToTrustDateScreen.toolbarViewState;
            }
            return navigateToTrustDateScreen.copy(beneficiaryFlowTrustDateViewModel, beneficiaryTrustFlowToolbarViewState);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowTrustDateViewModel getTrustDateViewState() {
            return this.trustDateViewState;
        }

        /* renamed from: component2, reason: from getter */
        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }

        public final NavigateToTrustDateScreen copy(BeneficiaryFlowTrustDateViewModel trustDateViewState, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(trustDateViewState, "trustDateViewState");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            return new NavigateToTrustDateScreen(trustDateViewState, toolbarViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToTrustDateScreen)) {
                return false;
            }
            NavigateToTrustDateScreen navigateToTrustDateScreen = (NavigateToTrustDateScreen) other;
            return Intrinsics.areEqual(this.trustDateViewState, navigateToTrustDateScreen.trustDateViewState) && Intrinsics.areEqual(this.toolbarViewState, navigateToTrustDateScreen.toolbarViewState);
        }

        public int hashCode() {
            return (this.trustDateViewState.hashCode() * 31) + this.toolbarViewState.hashCode();
        }

        public String toString() {
            return "NavigateToTrustDateScreen(trustDateViewState=" + this.trustDateViewState + ", toolbarViewState=" + this.toolbarViewState + ")";
        }

        public NavigateToTrustDateScreen(BeneficiaryFlowTrustDateViewModel trustDateViewState, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(trustDateViewState, "trustDateViewState");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            this.trustDateViewState = trustDateViewState;
            this.toolbarViewState = toolbarViewState;
        }

        public final BeneficiaryFlowTrustDateViewModel getTrustDateViewState() {
            return this.trustDateViewState;
        }

        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToTrustTaxIdentifierScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "taxIdentifierViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "toolbarViewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;)V", "getTaxIdentifierViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "getToolbarViewState", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToTrustTaxIdentifierScreen implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final BeneficiaryFlowTrustTaxIdentifierViewModel taxIdentifierViewModel;
        private final BeneficiaryTrustFlowToolbarViewState toolbarViewState;

        public static /* synthetic */ NavigateToTrustTaxIdentifierScreen copy$default(NavigateToTrustTaxIdentifierScreen navigateToTrustTaxIdentifierScreen, BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel, BeneficiaryTrustFlowToolbarViewState beneficiaryTrustFlowToolbarViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowTrustTaxIdentifierViewModel = navigateToTrustTaxIdentifierScreen.taxIdentifierViewModel;
            }
            if ((i & 2) != 0) {
                beneficiaryTrustFlowToolbarViewState = navigateToTrustTaxIdentifierScreen.toolbarViewState;
            }
            return navigateToTrustTaxIdentifierScreen.copy(beneficiaryFlowTrustTaxIdentifierViewModel, beneficiaryTrustFlowToolbarViewState);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowTrustTaxIdentifierViewModel getTaxIdentifierViewModel() {
            return this.taxIdentifierViewModel;
        }

        /* renamed from: component2, reason: from getter */
        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }

        public final NavigateToTrustTaxIdentifierScreen copy(BeneficiaryFlowTrustTaxIdentifierViewModel taxIdentifierViewModel, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(taxIdentifierViewModel, "taxIdentifierViewModel");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            return new NavigateToTrustTaxIdentifierScreen(taxIdentifierViewModel, toolbarViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToTrustTaxIdentifierScreen)) {
                return false;
            }
            NavigateToTrustTaxIdentifierScreen navigateToTrustTaxIdentifierScreen = (NavigateToTrustTaxIdentifierScreen) other;
            return Intrinsics.areEqual(this.taxIdentifierViewModel, navigateToTrustTaxIdentifierScreen.taxIdentifierViewModel) && Intrinsics.areEqual(this.toolbarViewState, navigateToTrustTaxIdentifierScreen.toolbarViewState);
        }

        public int hashCode() {
            return (this.taxIdentifierViewModel.hashCode() * 31) + this.toolbarViewState.hashCode();
        }

        public String toString() {
            return "NavigateToTrustTaxIdentifierScreen(taxIdentifierViewModel=" + this.taxIdentifierViewModel + ", toolbarViewState=" + this.toolbarViewState + ")";
        }

        public NavigateToTrustTaxIdentifierScreen(BeneficiaryFlowTrustTaxIdentifierViewModel taxIdentifierViewModel, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(taxIdentifierViewModel, "taxIdentifierViewModel");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            this.taxIdentifierViewModel = taxIdentifierViewModel;
            this.toolbarViewState = toolbarViewState;
        }

        public final BeneficiaryFlowTrustTaxIdentifierViewModel getTaxIdentifierViewModel() {
            return this.taxIdentifierViewModel;
        }

        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToTrustEmailScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "emailViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "toolbarViewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;)V", "getEmailViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "getToolbarViewState", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToTrustEmailScreen implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final BeneficiaryFlowEmailViewModel emailViewModel;
        private final BeneficiaryTrustFlowToolbarViewState toolbarViewState;

        public static /* synthetic */ NavigateToTrustEmailScreen copy$default(NavigateToTrustEmailScreen navigateToTrustEmailScreen, BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, BeneficiaryTrustFlowToolbarViewState beneficiaryTrustFlowToolbarViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowEmailViewModel = navigateToTrustEmailScreen.emailViewModel;
            }
            if ((i & 2) != 0) {
                beneficiaryTrustFlowToolbarViewState = navigateToTrustEmailScreen.toolbarViewState;
            }
            return navigateToTrustEmailScreen.copy(beneficiaryFlowEmailViewModel, beneficiaryTrustFlowToolbarViewState);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowEmailViewModel getEmailViewModel() {
            return this.emailViewModel;
        }

        /* renamed from: component2, reason: from getter */
        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }

        public final NavigateToTrustEmailScreen copy(BeneficiaryFlowEmailViewModel emailViewModel, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(emailViewModel, "emailViewModel");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            return new NavigateToTrustEmailScreen(emailViewModel, toolbarViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToTrustEmailScreen)) {
                return false;
            }
            NavigateToTrustEmailScreen navigateToTrustEmailScreen = (NavigateToTrustEmailScreen) other;
            return Intrinsics.areEqual(this.emailViewModel, navigateToTrustEmailScreen.emailViewModel) && Intrinsics.areEqual(this.toolbarViewState, navigateToTrustEmailScreen.toolbarViewState);
        }

        public int hashCode() {
            return (this.emailViewModel.hashCode() * 31) + this.toolbarViewState.hashCode();
        }

        public String toString() {
            return "NavigateToTrustEmailScreen(emailViewModel=" + this.emailViewModel + ", toolbarViewState=" + this.toolbarViewState + ")";
        }

        public NavigateToTrustEmailScreen(BeneficiaryFlowEmailViewModel emailViewModel, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(emailViewModel, "emailViewModel");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            this.emailViewModel = emailViewModel;
            this.toolbarViewState = toolbarViewState;
        }

        public final BeneficiaryFlowEmailViewModel getEmailViewModel() {
            return this.emailViewModel;
        }

        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToIndividualFlow;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "apiCreateBeneficiaryConfiguration", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;)V", "getApiCreateBeneficiaryConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToIndividualFlow implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration;

        public static /* synthetic */ NavigateToIndividualFlow copy$default(NavigateToIndividualFlow navigateToIndividualFlow, ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCreateBeneficiaryConfiguration = navigateToIndividualFlow.apiCreateBeneficiaryConfiguration;
            }
            return navigateToIndividualFlow.copy(apiCreateBeneficiaryConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCreateBeneficiaryConfiguration getApiCreateBeneficiaryConfiguration() {
            return this.apiCreateBeneficiaryConfiguration;
        }

        public final NavigateToIndividualFlow copy(ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            Intrinsics.checkNotNullParameter(apiCreateBeneficiaryConfiguration, "apiCreateBeneficiaryConfiguration");
            return new NavigateToIndividualFlow(apiCreateBeneficiaryConfiguration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToIndividualFlow) && Intrinsics.areEqual(this.apiCreateBeneficiaryConfiguration, ((NavigateToIndividualFlow) other).apiCreateBeneficiaryConfiguration);
        }

        public int hashCode() {
            return this.apiCreateBeneficiaryConfiguration.hashCode();
        }

        public String toString() {
            return "NavigateToIndividualFlow(apiCreateBeneficiaryConfiguration=" + this.apiCreateBeneficiaryConfiguration + ")";
        }

        public NavigateToIndividualFlow(ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            Intrinsics.checkNotNullParameter(apiCreateBeneficiaryConfiguration, "apiCreateBeneficiaryConfiguration");
            this.apiCreateBeneficiaryConfiguration = apiCreateBeneficiaryConfiguration;
        }

        public final ApiCreateBeneficiaryConfiguration getApiCreateBeneficiaryConfiguration() {
            return this.apiCreateBeneficiaryConfiguration;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToAdditionalAccountsScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "accountNumber", "", "beneficiaryUuid", "Ljava/util/UUID;", "accountViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;", "toolbarViewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;)V", "getAccountNumber", "()Ljava/lang/String;", "getBeneficiaryUuid", "()Ljava/util/UUID;", "getAccountViewModel", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;", "getToolbarViewState", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToAdditionalAccountsScreen implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final String accountNumber;
        private final ApiCreateBeneficiaryAccountViewModel accountViewModel;
        private final UUID beneficiaryUuid;
        private final BeneficiaryTrustFlowToolbarViewState toolbarViewState;

        public static /* synthetic */ NavigateToAdditionalAccountsScreen copy$default(NavigateToAdditionalAccountsScreen navigateToAdditionalAccountsScreen, String str, UUID uuid, ApiCreateBeneficiaryAccountViewModel apiCreateBeneficiaryAccountViewModel, BeneficiaryTrustFlowToolbarViewState beneficiaryTrustFlowToolbarViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToAdditionalAccountsScreen.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = navigateToAdditionalAccountsScreen.beneficiaryUuid;
            }
            if ((i & 4) != 0) {
                apiCreateBeneficiaryAccountViewModel = navigateToAdditionalAccountsScreen.accountViewModel;
            }
            if ((i & 8) != 0) {
                beneficiaryTrustFlowToolbarViewState = navigateToAdditionalAccountsScreen.toolbarViewState;
            }
            return navigateToAdditionalAccountsScreen.copy(str, uuid, apiCreateBeneficiaryAccountViewModel, beneficiaryTrustFlowToolbarViewState);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getBeneficiaryUuid() {
            return this.beneficiaryUuid;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiCreateBeneficiaryAccountViewModel getAccountViewModel() {
            return this.accountViewModel;
        }

        /* renamed from: component4, reason: from getter */
        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }

        public final NavigateToAdditionalAccountsScreen copy(String accountNumber, UUID beneficiaryUuid, ApiCreateBeneficiaryAccountViewModel accountViewModel, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountViewModel, "accountViewModel");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            return new NavigateToAdditionalAccountsScreen(accountNumber, beneficiaryUuid, accountViewModel, toolbarViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToAdditionalAccountsScreen)) {
                return false;
            }
            NavigateToAdditionalAccountsScreen navigateToAdditionalAccountsScreen = (NavigateToAdditionalAccountsScreen) other;
            return Intrinsics.areEqual(this.accountNumber, navigateToAdditionalAccountsScreen.accountNumber) && Intrinsics.areEqual(this.beneficiaryUuid, navigateToAdditionalAccountsScreen.beneficiaryUuid) && Intrinsics.areEqual(this.accountViewModel, navigateToAdditionalAccountsScreen.accountViewModel) && Intrinsics.areEqual(this.toolbarViewState, navigateToAdditionalAccountsScreen.toolbarViewState);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            UUID uuid = this.beneficiaryUuid;
            return ((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.accountViewModel.hashCode()) * 31) + this.toolbarViewState.hashCode();
        }

        public String toString() {
            return "NavigateToAdditionalAccountsScreen(accountNumber=" + this.accountNumber + ", beneficiaryUuid=" + this.beneficiaryUuid + ", accountViewModel=" + this.accountViewModel + ", toolbarViewState=" + this.toolbarViewState + ")";
        }

        public NavigateToAdditionalAccountsScreen(String accountNumber, UUID uuid, ApiCreateBeneficiaryAccountViewModel accountViewModel, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountViewModel, "accountViewModel");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            this.accountNumber = accountNumber;
            this.beneficiaryUuid = uuid;
            this.accountViewModel = accountViewModel;
            this.toolbarViewState = toolbarViewState;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getBeneficiaryUuid() {
            return this.beneficiaryUuid;
        }

        public final ApiCreateBeneficiaryAccountViewModel getAccountViewModel() {
            return this.accountViewModel;
        }

        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToAdditionalAgreementScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "agreement", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;I)V", "getAgreement", "()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToAdditionalAgreementScreen implements BeneficiaryEvent {
        public static final int $stable = 8;
        private final ApiBeneficiaryAgreementViewModel agreement;
        private final int index;

        public static /* synthetic */ NavigateToAdditionalAgreementScreen copy$default(NavigateToAdditionalAgreementScreen navigateToAdditionalAgreementScreen, ApiBeneficiaryAgreementViewModel apiBeneficiaryAgreementViewModel, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                apiBeneficiaryAgreementViewModel = navigateToAdditionalAgreementScreen.agreement;
            }
            if ((i2 & 2) != 0) {
                i = navigateToAdditionalAgreementScreen.index;
            }
            return navigateToAdditionalAgreementScreen.copy(apiBeneficiaryAgreementViewModel, i);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiBeneficiaryAgreementViewModel getAgreement() {
            return this.agreement;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final NavigateToAdditionalAgreementScreen copy(ApiBeneficiaryAgreementViewModel agreement, int index) {
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            return new NavigateToAdditionalAgreementScreen(agreement, index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToAdditionalAgreementScreen)) {
                return false;
            }
            NavigateToAdditionalAgreementScreen navigateToAdditionalAgreementScreen = (NavigateToAdditionalAgreementScreen) other;
            return Intrinsics.areEqual(this.agreement, navigateToAdditionalAgreementScreen.agreement) && this.index == navigateToAdditionalAgreementScreen.index;
        }

        public int hashCode() {
            return (this.agreement.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "NavigateToAdditionalAgreementScreen(agreement=" + this.agreement + ", index=" + this.index + ")";
        }

        public NavigateToAdditionalAgreementScreen(ApiBeneficiaryAgreementViewModel agreement, int i) {
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            this.agreement = agreement;
            this.index = i;
        }

        public final ApiBeneficiaryAgreementViewModel getAgreement() {
            return this.agreement;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    /* compiled from: BeneficiaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent$NavigateToLoadingScreen;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToLoadingScreen implements BeneficiaryEvent {
        public static final int $stable = 0;
        public static final NavigateToLoadingScreen INSTANCE = new NavigateToLoadingScreen();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToLoadingScreen);
        }

        public int hashCode() {
            return -977310402;
        }

        public String toString() {
            return "NavigateToLoadingScreen";
        }

        private NavigateToLoadingScreen() {
        }
    }
}
