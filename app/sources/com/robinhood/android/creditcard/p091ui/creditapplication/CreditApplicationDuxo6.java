package com.robinhood.android.creditcard.p091ui.creditapplication;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationsResponse;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse2;
import com.robinhood.android.models.creditcard.api.graphql.PremiumCreditLimitChoice;
import com.robinhood.android.models.creditcard.api.idverification.IdVerificationData;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditApplicationDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "", "NoAccess", "InviteExpired", "PromptUpdate", "Identity", "RunEligibilityPrompt", "AddressChallengeEntry", "IdentityContestEntry", "CreditFreezePrompt", "FraudAlertPhonePrompt", "ApplicationReviewNotice", "SsnVerification", "SsnVerified", "AdverseActionNotice", "LimitRevealPrompt", "FinalTermsPrompt", "SolidGoldDelay", "ShippingAddressEntry", "DownloadAppNotice", "AdditionalVerificationScreen", "AccountSelection", "UnexpectedError", "Loading", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$AccountSelection;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$AdditionalVerificationScreen;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$AddressChallengeEntry;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$AdverseActionNotice;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$ApplicationReviewNotice;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$CreditFreezePrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$DownloadAppNotice;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$FinalTermsPrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$FraudAlertPhonePrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$Identity;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$IdentityContestEntry;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$InviteExpired;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$LimitRevealPrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$Loading;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$NoAccess;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$PromptUpdate;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$RunEligibilityPrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$ShippingAddressEntry;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$SolidGoldDelay;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$SsnVerification;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$SsnVerified;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$UnexpectedError;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface CreditApplicationDuxo6 {

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$NoAccess;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$NoAccess */
    public static final /* data */ class NoAccess implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final NoAccess INSTANCE = new NoAccess();

        public boolean equals(Object other) {
            return this == other || (other instanceof NoAccess);
        }

        public int hashCode() {
            return -1779749328;
        }

        public String toString() {
            return "NoAccess";
        }

        private NoAccess() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$InviteExpired;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$InviteExpired */
    public static final /* data */ class InviteExpired implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final InviteExpired INSTANCE = new InviteExpired();

        public boolean equals(Object other) {
            return this == other || (other instanceof InviteExpired);
        }

        public int hashCode() {
            return 2024522513;
        }

        public String toString() {
            return "InviteExpired";
        }

        private InviteExpired() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$PromptUpdate;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "dismissable", "", "<init>", "(Z)V", "getDismissable", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$PromptUpdate, reason: from toString */
    public static final /* data */ class PromptUpdate implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        private final boolean dismissable;

        public static /* synthetic */ PromptUpdate copy$default(PromptUpdate promptUpdate, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = promptUpdate.dismissable;
            }
            return promptUpdate.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getDismissable() {
            return this.dismissable;
        }

        public final PromptUpdate copy(boolean dismissable) {
            return new PromptUpdate(dismissable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PromptUpdate) && this.dismissable == ((PromptUpdate) other).dismissable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.dismissable);
        }

        public String toString() {
            return "PromptUpdate(dismissable=" + this.dismissable + ")";
        }

        public PromptUpdate(boolean z) {
            this.dismissable = z;
        }

        public final boolean getDismissable() {
            return this.dismissable;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$Identity;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "prefill", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;", "authUser", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;)V", "getPrefill", "()Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;", "getAuthUser", "()Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$Identity, reason: from toString */
    public static final /* data */ class Identity implements CreditApplicationDuxo6 {
        public static final int $stable = 8;
        private final CreditApplicationsResponse.AuthIdentityObject.CreditCustomer authUser;
        private final IdentityDetailsPrefillResponse2 prefill;

        public static /* synthetic */ Identity copy$default(Identity identity, IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse2, CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer, int i, Object obj) {
            if ((i & 1) != 0) {
                identityDetailsPrefillResponse2 = identity.prefill;
            }
            if ((i & 2) != 0) {
                creditCustomer = identity.authUser;
            }
            return identity.copy(identityDetailsPrefillResponse2, creditCustomer);
        }

        /* renamed from: component1, reason: from getter */
        public final IdentityDetailsPrefillResponse2 getPrefill() {
            return this.prefill;
        }

        /* renamed from: component2, reason: from getter */
        public final CreditApplicationsResponse.AuthIdentityObject.CreditCustomer getAuthUser() {
            return this.authUser;
        }

        public final Identity copy(IdentityDetailsPrefillResponse2 prefill, CreditApplicationsResponse.AuthIdentityObject.CreditCustomer authUser) {
            Intrinsics.checkNotNullParameter(prefill, "prefill");
            return new Identity(prefill, authUser);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Identity)) {
                return false;
            }
            Identity identity = (Identity) other;
            return Intrinsics.areEqual(this.prefill, identity.prefill) && Intrinsics.areEqual(this.authUser, identity.authUser);
        }

        public int hashCode() {
            int iHashCode = this.prefill.hashCode() * 31;
            CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer = this.authUser;
            return iHashCode + (creditCustomer == null ? 0 : creditCustomer.hashCode());
        }

        public String toString() {
            return "Identity(prefill=" + this.prefill + ", authUser=" + this.authUser + ")";
        }

        public Identity(IdentityDetailsPrefillResponse2 prefill, CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer) {
            Intrinsics.checkNotNullParameter(prefill, "prefill");
            this.prefill = prefill;
            this.authUser = creditCustomer;
        }

        public final IdentityDetailsPrefillResponse2 getPrefill() {
            return this.prefill;
        }

        public final CreditApplicationsResponse.AuthIdentityObject.CreditCustomer getAuthUser() {
            return this.authUser;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$RunEligibilityPrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "authUser", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;)V", "getAuthUser", "()Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$RunEligibilityPrompt, reason: from toString */
    public static final /* data */ class RunEligibilityPrompt implements CreditApplicationDuxo6 {
        public static final int $stable = 8;
        private final CreditApplicationsResponse.AuthIdentityObject.CreditCustomer authUser;

        public static /* synthetic */ RunEligibilityPrompt copy$default(RunEligibilityPrompt runEligibilityPrompt, CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer, int i, Object obj) {
            if ((i & 1) != 0) {
                creditCustomer = runEligibilityPrompt.authUser;
            }
            return runEligibilityPrompt.copy(creditCustomer);
        }

        /* renamed from: component1, reason: from getter */
        public final CreditApplicationsResponse.AuthIdentityObject.CreditCustomer getAuthUser() {
            return this.authUser;
        }

        public final RunEligibilityPrompt copy(CreditApplicationsResponse.AuthIdentityObject.CreditCustomer authUser) {
            return new RunEligibilityPrompt(authUser);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RunEligibilityPrompt) && Intrinsics.areEqual(this.authUser, ((RunEligibilityPrompt) other).authUser);
        }

        public int hashCode() {
            CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer = this.authUser;
            if (creditCustomer == null) {
                return 0;
            }
            return creditCustomer.hashCode();
        }

        public String toString() {
            return "RunEligibilityPrompt(authUser=" + this.authUser + ")";
        }

        public RunEligibilityPrompt(CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer) {
            this.authUser = creditCustomer;
        }

        public final CreditApplicationsResponse.AuthIdentityObject.CreditCustomer getAuthUser() {
            return this.authUser;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$AddressChallengeEntry;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$AddressChallengeEntry */
    public static final /* data */ class AddressChallengeEntry implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final AddressChallengeEntry INSTANCE = new AddressChallengeEntry();

        public boolean equals(Object other) {
            return this == other || (other instanceof AddressChallengeEntry);
        }

        public int hashCode() {
            return 1180322072;
        }

        public String toString() {
            return "AddressChallengeEntry";
        }

        private AddressChallengeEntry() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$IdentityContestEntry;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "state", "Lcom/robinhood/android/models/creditcard/api/idverification/IdVerificationData;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/idverification/IdVerificationData;)V", "getState", "()Lcom/robinhood/android/models/creditcard/api/idverification/IdVerificationData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$IdentityContestEntry, reason: from toString */
    public static final /* data */ class IdentityContestEntry implements CreditApplicationDuxo6 {
        public static final int $stable = 8;
        private final IdVerificationData state;

        public static /* synthetic */ IdentityContestEntry copy$default(IdentityContestEntry identityContestEntry, IdVerificationData idVerificationData, int i, Object obj) {
            if ((i & 1) != 0) {
                idVerificationData = identityContestEntry.state;
            }
            return identityContestEntry.copy(idVerificationData);
        }

        /* renamed from: component1, reason: from getter */
        public final IdVerificationData getState() {
            return this.state;
        }

        public final IdentityContestEntry copy(IdVerificationData state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new IdentityContestEntry(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdentityContestEntry) && Intrinsics.areEqual(this.state, ((IdentityContestEntry) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "IdentityContestEntry(state=" + this.state + ")";
        }

        public IdentityContestEntry(IdVerificationData state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final IdVerificationData getState() {
            return this.state;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$CreditFreezePrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$CreditFreezePrompt */
    public static final /* data */ class CreditFreezePrompt implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final CreditFreezePrompt INSTANCE = new CreditFreezePrompt();

        public boolean equals(Object other) {
            return this == other || (other instanceof CreditFreezePrompt);
        }

        public int hashCode() {
            return 639663711;
        }

        public String toString() {
            return "CreditFreezePrompt";
        }

        private CreditFreezePrompt() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$FraudAlertPhonePrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "phoneLast4", "", "<init>", "(Ljava/lang/String;)V", "getPhoneLast4", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$FraudAlertPhonePrompt, reason: from toString */
    public static final /* data */ class FraudAlertPhonePrompt implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        private final String phoneLast4;

        public static /* synthetic */ FraudAlertPhonePrompt copy$default(FraudAlertPhonePrompt fraudAlertPhonePrompt, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fraudAlertPhonePrompt.phoneLast4;
            }
            return fraudAlertPhonePrompt.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhoneLast4() {
            return this.phoneLast4;
        }

        public final FraudAlertPhonePrompt copy(String phoneLast4) {
            Intrinsics.checkNotNullParameter(phoneLast4, "phoneLast4");
            return new FraudAlertPhonePrompt(phoneLast4);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FraudAlertPhonePrompt) && Intrinsics.areEqual(this.phoneLast4, ((FraudAlertPhonePrompt) other).phoneLast4);
        }

        public int hashCode() {
            return this.phoneLast4.hashCode();
        }

        public String toString() {
            return "FraudAlertPhonePrompt(phoneLast4=" + this.phoneLast4 + ")";
        }

        public FraudAlertPhonePrompt(String phoneLast4) {
            Intrinsics.checkNotNullParameter(phoneLast4, "phoneLast4");
            this.phoneLast4 = phoneLast4;
        }

        public final String getPhoneLast4() {
            return this.phoneLast4;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$ApplicationReviewNotice;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$ApplicationReviewNotice */
    public static final /* data */ class ApplicationReviewNotice implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final ApplicationReviewNotice INSTANCE = new ApplicationReviewNotice();

        public boolean equals(Object other) {
            return this == other || (other instanceof ApplicationReviewNotice);
        }

        public int hashCode() {
            return -1325811019;
        }

        public String toString() {
            return "ApplicationReviewNotice";
        }

        private ApplicationReviewNotice() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$SsnVerification;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$SsnVerification */
    public static final /* data */ class SsnVerification implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final SsnVerification INSTANCE = new SsnVerification();

        public boolean equals(Object other) {
            return this == other || (other instanceof SsnVerification);
        }

        public int hashCode() {
            return -1626060482;
        }

        public String toString() {
            return "SsnVerification";
        }

        private SsnVerification() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$SsnVerified;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$SsnVerified */
    public static final /* data */ class SsnVerified implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final SsnVerified INSTANCE = new SsnVerified();

        public boolean equals(Object other) {
            return this == other || (other instanceof SsnVerified);
        }

        public int hashCode() {
            return 903060331;
        }

        public String toString() {
            return "SsnVerified";
        }

        private SsnVerified() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$AdverseActionNotice;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "isSolidGold", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$AdverseActionNotice, reason: from toString */
    public static final /* data */ class AdverseActionNotice implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        private final boolean isSolidGold;

        public static /* synthetic */ AdverseActionNotice copy$default(AdverseActionNotice adverseActionNotice, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = adverseActionNotice.isSolidGold;
            }
            return adverseActionNotice.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSolidGold() {
            return this.isSolidGold;
        }

        public final AdverseActionNotice copy(boolean isSolidGold) {
            return new AdverseActionNotice(isSolidGold);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdverseActionNotice) && this.isSolidGold == ((AdverseActionNotice) other).isSolidGold;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSolidGold);
        }

        public String toString() {
            return "AdverseActionNotice(isSolidGold=" + this.isSolidGold + ")";
        }

        public AdverseActionNotice(boolean z) {
            this.isSolidGold = z;
        }

        public final boolean isSolidGold() {
            return this.isSolidGold;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$LimitRevealPrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "limit", "", "premiumCreditLimitChoices", "", "Lcom/robinhood/android/models/creditcard/api/graphql/PremiumCreditLimitChoice;", "premiumCreditLimitExpiresAt", "<init>", "(JLjava/util/List;Ljava/lang/Long;)V", "getLimit", "()J", "getPremiumCreditLimitChoices", "()Ljava/util/List;", "getPremiumCreditLimitExpiresAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(JLjava/util/List;Ljava/lang/Long;)Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$LimitRevealPrompt;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$LimitRevealPrompt, reason: from toString */
    public static final /* data */ class LimitRevealPrompt implements CreditApplicationDuxo6 {
        public static final int $stable = 8;
        private final long limit;
        private final List<PremiumCreditLimitChoice> premiumCreditLimitChoices;
        private final Long premiumCreditLimitExpiresAt;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LimitRevealPrompt copy$default(LimitRevealPrompt limitRevealPrompt, long j, List list, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                j = limitRevealPrompt.limit;
            }
            if ((i & 2) != 0) {
                list = limitRevealPrompt.premiumCreditLimitChoices;
            }
            if ((i & 4) != 0) {
                l = limitRevealPrompt.premiumCreditLimitExpiresAt;
            }
            return limitRevealPrompt.copy(j, list, l);
        }

        /* renamed from: component1, reason: from getter */
        public final long getLimit() {
            return this.limit;
        }

        public final List<PremiumCreditLimitChoice> component2() {
            return this.premiumCreditLimitChoices;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getPremiumCreditLimitExpiresAt() {
            return this.premiumCreditLimitExpiresAt;
        }

        public final LimitRevealPrompt copy(long limit, List<PremiumCreditLimitChoice> premiumCreditLimitChoices, Long premiumCreditLimitExpiresAt) {
            Intrinsics.checkNotNullParameter(premiumCreditLimitChoices, "premiumCreditLimitChoices");
            return new LimitRevealPrompt(limit, premiumCreditLimitChoices, premiumCreditLimitExpiresAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LimitRevealPrompt)) {
                return false;
            }
            LimitRevealPrompt limitRevealPrompt = (LimitRevealPrompt) other;
            return this.limit == limitRevealPrompt.limit && Intrinsics.areEqual(this.premiumCreditLimitChoices, limitRevealPrompt.premiumCreditLimitChoices) && Intrinsics.areEqual(this.premiumCreditLimitExpiresAt, limitRevealPrompt.premiumCreditLimitExpiresAt);
        }

        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.limit) * 31) + this.premiumCreditLimitChoices.hashCode()) * 31;
            Long l = this.premiumCreditLimitExpiresAt;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "LimitRevealPrompt(limit=" + this.limit + ", premiumCreditLimitChoices=" + this.premiumCreditLimitChoices + ", premiumCreditLimitExpiresAt=" + this.premiumCreditLimitExpiresAt + ")";
        }

        public LimitRevealPrompt(long j, List<PremiumCreditLimitChoice> premiumCreditLimitChoices, Long l) {
            Intrinsics.checkNotNullParameter(premiumCreditLimitChoices, "premiumCreditLimitChoices");
            this.limit = j;
            this.premiumCreditLimitChoices = premiumCreditLimitChoices;
            this.premiumCreditLimitExpiresAt = l;
        }

        public final long getLimit() {
            return this.limit;
        }

        public final List<PremiumCreditLimitChoice> getPremiumCreditLimitChoices() {
            return this.premiumCreditLimitChoices;
        }

        public final Long getPremiumCreditLimitExpiresAt() {
            return this.premiumCreditLimitExpiresAt;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$FinalTermsPrompt;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "annualFeeMicro", "", "<init>", "(J)V", "getAnnualFeeMicro", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$FinalTermsPrompt, reason: from toString */
    public static final /* data */ class FinalTermsPrompt implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        private final long annualFeeMicro;

        public static /* synthetic */ FinalTermsPrompt copy$default(FinalTermsPrompt finalTermsPrompt, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = finalTermsPrompt.annualFeeMicro;
            }
            return finalTermsPrompt.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAnnualFeeMicro() {
            return this.annualFeeMicro;
        }

        public final FinalTermsPrompt copy(long annualFeeMicro) {
            return new FinalTermsPrompt(annualFeeMicro);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinalTermsPrompt) && this.annualFeeMicro == ((FinalTermsPrompt) other).annualFeeMicro;
        }

        public int hashCode() {
            return Long.hashCode(this.annualFeeMicro);
        }

        public String toString() {
            return "FinalTermsPrompt(annualFeeMicro=" + this.annualFeeMicro + ")";
        }

        public FinalTermsPrompt(long j) {
            this.annualFeeMicro = j;
        }

        public final long getAnnualFeeMicro() {
            return this.annualFeeMicro;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$SolidGoldDelay;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$SolidGoldDelay */
    public static final /* data */ class SolidGoldDelay implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final SolidGoldDelay INSTANCE = new SolidGoldDelay();

        public boolean equals(Object other) {
            return this == other || (other instanceof SolidGoldDelay);
        }

        public int hashCode() {
            return -435538429;
        }

        public String toString() {
            return "SolidGoldDelay";
        }

        private SolidGoldDelay() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$ShippingAddressEntry;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "isSolidGold", "", "entryPointSource", "", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;ZLjava/lang/String;)V", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "()Z", "getEntryPointSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$ShippingAddressEntry, reason: from toString */
    public static final /* data */ class ShippingAddressEntry implements CreditApplicationDuxo6 {
        public static final int $stable = 8;
        private final AddressType address;
        private final String entryPointSource;
        private final boolean isSolidGold;

        public static /* synthetic */ ShippingAddressEntry copy$default(ShippingAddressEntry shippingAddressEntry, AddressType addressType, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                addressType = shippingAddressEntry.address;
            }
            if ((i & 2) != 0) {
                z = shippingAddressEntry.isSolidGold;
            }
            if ((i & 4) != 0) {
                str = shippingAddressEntry.entryPointSource;
            }
            return shippingAddressEntry.copy(addressType, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressType getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSolidGold() {
            return this.isSolidGold;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntryPointSource() {
            return this.entryPointSource;
        }

        public final ShippingAddressEntry copy(AddressType address, boolean isSolidGold, String entryPointSource) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new ShippingAddressEntry(address, isSolidGold, entryPointSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShippingAddressEntry)) {
                return false;
            }
            ShippingAddressEntry shippingAddressEntry = (ShippingAddressEntry) other;
            return Intrinsics.areEqual(this.address, shippingAddressEntry.address) && this.isSolidGold == shippingAddressEntry.isSolidGold && Intrinsics.areEqual(this.entryPointSource, shippingAddressEntry.entryPointSource);
        }

        public int hashCode() {
            int iHashCode = ((this.address.hashCode() * 31) + Boolean.hashCode(this.isSolidGold)) * 31;
            String str = this.entryPointSource;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ShippingAddressEntry(address=" + this.address + ", isSolidGold=" + this.isSolidGold + ", entryPointSource=" + this.entryPointSource + ")";
        }

        public ShippingAddressEntry(AddressType address, boolean z, String str) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
            this.isSolidGold = z;
            this.entryPointSource = str;
        }

        public final AddressType getAddress() {
            return this.address;
        }

        public final boolean isSolidGold() {
            return this.isSolidGold;
        }

        public final String getEntryPointSource() {
            return this.entryPointSource;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$DownloadAppNotice;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "appStoreUrl", "", "<init>", "(Ljava/lang/String;)V", "getAppStoreUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$DownloadAppNotice, reason: from toString */
    public static final /* data */ class DownloadAppNotice implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        private final String appStoreUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public DownloadAppNotice() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ DownloadAppNotice copy$default(DownloadAppNotice downloadAppNotice, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downloadAppNotice.appStoreUrl;
            }
            return downloadAppNotice.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppStoreUrl() {
            return this.appStoreUrl;
        }

        public final DownloadAppNotice copy(String appStoreUrl) {
            return new DownloadAppNotice(appStoreUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DownloadAppNotice) && Intrinsics.areEqual(this.appStoreUrl, ((DownloadAppNotice) other).appStoreUrl);
        }

        public int hashCode() {
            String str = this.appStoreUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "DownloadAppNotice(appStoreUrl=" + this.appStoreUrl + ")";
        }

        public DownloadAppNotice(String str) {
            this.appStoreUrl = str;
        }

        public /* synthetic */ DownloadAppNotice(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getAppStoreUrl() {
            return this.appStoreUrl;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$AdditionalVerificationScreen;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$AdditionalVerificationScreen */
    public static final /* data */ class AdditionalVerificationScreen implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final AdditionalVerificationScreen INSTANCE = new AdditionalVerificationScreen();

        public boolean equals(Object other) {
            return this == other || (other instanceof AdditionalVerificationScreen);
        }

        public int hashCode() {
            return 1117383449;
        }

        public String toString() {
            return "AdditionalVerificationScreen";
        }

        private AdditionalVerificationScreen() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$AccountSelection;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "accounts", "", "Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/Account;", "<init>", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$AccountSelection, reason: from toString */
    public static final /* data */ class AccountSelection implements CreditApplicationDuxo6 {
        public static final int $stable = 8;
        private final List<Account> accounts;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AccountSelection copy$default(AccountSelection accountSelection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = accountSelection.accounts;
            }
            return accountSelection.copy(list);
        }

        public final List<Account> component1() {
            return this.accounts;
        }

        public final AccountSelection copy(List<Account> accounts2) {
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            return new AccountSelection(accounts2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountSelection) && Intrinsics.areEqual(this.accounts, ((AccountSelection) other).accounts);
        }

        public int hashCode() {
            return this.accounts.hashCode();
        }

        public String toString() {
            return "AccountSelection(accounts=" + this.accounts + ")";
        }

        public AccountSelection(List<Account> accounts2) {
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            this.accounts = accounts2;
        }

        public final List<Account> getAccounts() {
            return this.accounts;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$UnexpectedError;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$UnexpectedError */
    public static final /* data */ class UnexpectedError implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final UnexpectedError INSTANCE = new UnexpectedError();

        public boolean equals(Object other) {
            return this == other || (other instanceof UnexpectedError);
        }

        public int hashCode() {
            return -338541012;
        }

        public String toString() {
            return "UnexpectedError";
        }

        private UnexpectedError() {
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent$Loading;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationEvent$Loading */
    public static final /* data */ class Loading implements CreditApplicationDuxo6 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1799400497;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }
}
