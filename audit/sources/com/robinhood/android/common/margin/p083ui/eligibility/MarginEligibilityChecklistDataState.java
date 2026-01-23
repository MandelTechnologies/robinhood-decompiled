package com.robinhood.android.common.margin.p083ui.eligibility;

import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginEligibilityChecklistViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDataState;", "", "account", "Lcom/robinhood/models/db/Account;", "eligibilityCheckResults", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "exception", "", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/lang/Throwable;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getEligibilityCheckResults", "()Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getException", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MarginEligibilityChecklistDataState {
    public static final int $stable = 8;
    private final Account account;
    private final CountryCode.Supported countryCode;
    private final ApiMarginEligibility eligibilityCheckResults;
    private final Throwable exception;

    public MarginEligibilityChecklistDataState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MarginEligibilityChecklistDataState copy$default(MarginEligibilityChecklistDataState marginEligibilityChecklistDataState, Account account, ApiMarginEligibility apiMarginEligibility, CountryCode.Supported supported, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            account = marginEligibilityChecklistDataState.account;
        }
        if ((i & 2) != 0) {
            apiMarginEligibility = marginEligibilityChecklistDataState.eligibilityCheckResults;
        }
        if ((i & 4) != 0) {
            supported = marginEligibilityChecklistDataState.countryCode;
        }
        if ((i & 8) != 0) {
            th = marginEligibilityChecklistDataState.exception;
        }
        return marginEligibilityChecklistDataState.copy(account, apiMarginEligibility, supported, th);
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

    /* renamed from: component4, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    public final MarginEligibilityChecklistDataState copy(Account account, ApiMarginEligibility eligibilityCheckResults, CountryCode.Supported countryCode, Throwable exception) {
        return new MarginEligibilityChecklistDataState(account, eligibilityCheckResults, countryCode, exception);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginEligibilityChecklistDataState)) {
            return false;
        }
        MarginEligibilityChecklistDataState marginEligibilityChecklistDataState = (MarginEligibilityChecklistDataState) other;
        return Intrinsics.areEqual(this.account, marginEligibilityChecklistDataState.account) && Intrinsics.areEqual(this.eligibilityCheckResults, marginEligibilityChecklistDataState.eligibilityCheckResults) && Intrinsics.areEqual(this.countryCode, marginEligibilityChecklistDataState.countryCode) && Intrinsics.areEqual(this.exception, marginEligibilityChecklistDataState.exception);
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        ApiMarginEligibility apiMarginEligibility = this.eligibilityCheckResults;
        int iHashCode2 = (iHashCode + (apiMarginEligibility == null ? 0 : apiMarginEligibility.hashCode())) * 31;
        CountryCode.Supported supported = this.countryCode;
        int iHashCode3 = (iHashCode2 + (supported == null ? 0 : supported.hashCode())) * 31;
        Throwable th = this.exception;
        return iHashCode3 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "MarginEligibilityChecklistDataState(account=" + this.account + ", eligibilityCheckResults=" + this.eligibilityCheckResults + ", countryCode=" + this.countryCode + ", exception=" + this.exception + ")";
    }

    public MarginEligibilityChecklistDataState(Account account, ApiMarginEligibility apiMarginEligibility, CountryCode.Supported supported, Throwable th) {
        this.account = account;
        this.eligibilityCheckResults = apiMarginEligibility;
        this.countryCode = supported;
        this.exception = th;
    }

    public /* synthetic */ MarginEligibilityChecklistDataState(Account account, ApiMarginEligibility apiMarginEligibility, CountryCode.Supported supported, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : apiMarginEligibility, (i & 4) != 0 ? null : supported, (i & 8) != 0 ? null : th);
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

    public final Throwable getException() {
        return this.exception;
    }
}
