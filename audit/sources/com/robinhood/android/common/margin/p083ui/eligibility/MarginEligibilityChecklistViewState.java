package com.robinhood.android.common.margin.p083ui.eligibility;

import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLinkAccountType;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginEligibilityChecklistViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState$Error;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState$Loaded;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState$Loading;", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class MarginEligibilityChecklistViewState {
    public static final int $stable = 0;

    public /* synthetic */ MarginEligibilityChecklistViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarginEligibilityChecklistViewState() {
    }

    /* compiled from: MarginEligibilityChecklistViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState$Loading;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends MarginEligibilityChecklistViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1202837399;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: MarginEligibilityChecklistViewState.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J'\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState$Loaded;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState;", "account", "Lcom/robinhood/models/db/Account;", "eligibilityCheckResults", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getEligibilityCheckResults", "()Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "isMultiUserAccount", "", "()Z", "toAccountTypeForTransfer", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "getToAccountTypeForTransfer", "()Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "getChecklistTitle", "", "res", "Landroid/content/res/Resources;", "marginEligibilityCheck", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityCheck;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends MarginEligibilityChecklistViewState {
        public static final int $stable = 8;
        private final Account account;
        private final CountryCode.Supported countryCode;
        private final ApiMarginEligibility eligibilityCheckResults;

        /* compiled from: MarginEligibilityChecklistViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MarginEligibilityCheck.values().length];
                try {
                    iArr[MarginEligibilityCheck.IDENTITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MarginEligibilityCheck.REVIEW_PROFILE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MarginEligibilityCheck.BALANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MarginEligibilityCheck.TRADES.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MarginEligibilityCheck.KNOWLEDGE_EXPERIENCE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, Account account, ApiMarginEligibility apiMarginEligibility, CountryCode.Supported supported, int i, Object obj) {
            if ((i & 1) != 0) {
                account = loaded.account;
            }
            if ((i & 2) != 0) {
                apiMarginEligibility = loaded.eligibilityCheckResults;
            }
            if ((i & 4) != 0) {
                supported = loaded.countryCode;
            }
            return loaded.copy(account, apiMarginEligibility, supported);
        }

        /* renamed from: component1, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiMarginEligibility getEligibilityCheckResults() {
            return this.eligibilityCheckResults;
        }

        /* renamed from: component3, reason: from getter */
        public final CountryCode.Supported getCountryCode() {
            return this.countryCode;
        }

        public final Loaded copy(Account account, ApiMarginEligibility eligibilityCheckResults, CountryCode.Supported countryCode) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(eligibilityCheckResults, "eligibilityCheckResults");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new Loaded(account, eligibilityCheckResults, countryCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.account, loaded.account) && Intrinsics.areEqual(this.eligibilityCheckResults, loaded.eligibilityCheckResults) && Intrinsics.areEqual(this.countryCode, loaded.countryCode);
        }

        public int hashCode() {
            return (((this.account.hashCode() * 31) + this.eligibilityCheckResults.hashCode()) * 31) + this.countryCode.hashCode();
        }

        public String toString() {
            return "Loaded(account=" + this.account + ", eligibilityCheckResults=" + this.eligibilityCheckResults + ", countryCode=" + this.countryCode + ")";
        }

        public final Account getAccount() {
            return this.account;
        }

        public final ApiMarginEligibility getEligibilityCheckResults() {
            return this.eligibilityCheckResults;
        }

        public final CountryCode.Supported getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(Account account, ApiMarginEligibility eligibilityCheckResults, CountryCode.Supported countryCode) {
            super(null);
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(eligibilityCheckResults, "eligibilityCheckResults");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.account = account;
            this.eligibilityCheckResults = eligibilityCheckResults;
            this.countryCode = countryCode;
        }

        private final BrokerageAccountType getBrokerageAccountType() {
            return this.account.getBrokerageAccountType();
        }

        private final boolean isMultiUserAccount() {
            return getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
        }

        public final TransferFundsDeepLinkAccountType getToAccountTypeForTransfer() {
            if (this.account.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                return TransferFundsDeepLinkAccountType.JOINT_TENANCY_WITH_ROS;
            }
            return TransferFundsDeepLinkAccountType.BROKERAGE;
        }

        public final String getChecklistTitle(Resources res, MarginEligibilityCheck marginEligibilityCheck) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(res, "res");
            Intrinsics.checkNotNullParameter(marginEligibilityCheck, "marginEligibilityCheck");
            int i = WhenMappings.$EnumSwitchMapping$0[marginEligibilityCheck.ordinal()];
            if (i == 1) {
                if (isMultiUserAccount()) {
                    String string2 = res.getString(C11223R.string.margin_eligibility_verifying_multiple_identities_title);
                    Intrinsics.checkNotNull(string2);
                    return string2;
                }
                String string3 = res.getString(C11223R.string.margin_eligibility_verifying_identity_title);
                Intrinsics.checkNotNull(string3);
                return string3;
            }
            if (i == 2) {
                if (this.countryCode.isRhsg() && isMultiUserAccount()) {
                    String string4 = res.getString(C11223R.string.gated_margin_eligibility_checking_profile_multiple_title_apac);
                    Intrinsics.checkNotNull(string4);
                    return string4;
                }
                if (this.countryCode.isRhsg()) {
                    String string5 = res.getString(C11223R.string.gated_margin_eligibility_checking_profile_title_apac);
                    Intrinsics.checkNotNull(string5);
                    return string5;
                }
                if (isMultiUserAccount()) {
                    String string6 = res.getString(C11223R.string.margin_eligibility_checking_profile_multiple_title);
                    Intrinsics.checkNotNull(string6);
                    return string6;
                }
                String string7 = res.getString(C11223R.string.margin_eligibility_checking_profile_title);
                Intrinsics.checkNotNull(string7);
                return string7;
            }
            if (i == 3) {
                if (this.countryCode.isRhsg()) {
                    String string8 = res.getString(C11223R.string.gated_margin_eligibility_confirming_balance_title_apac);
                    Intrinsics.checkNotNull(string8);
                    return string8;
                }
                String string9 = res.getString(C11223R.string.margin_eligibility_confirming_balance_title, AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence().getText(res));
                Intrinsics.checkNotNull(string9);
                return string9;
            }
            if (i == 4) {
                String string10 = res.getString(C11223R.string.margin_eligibility_reviewing_trades_title, AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence().getText(res));
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String string11 = res.getString(C11223R.string.checking_margin_eligibility);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            return string11;
        }
    }

    /* compiled from: MarginEligibilityChecklistViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState$Error;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends MarginEligibilityChecklistViewState {
        public static final int $stable = 8;
        private final Throwable exception;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.exception;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        public final Error copy(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Error(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.exception + ")";
        }

        public final Throwable getException() {
            return this.exception;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }
    }
}
