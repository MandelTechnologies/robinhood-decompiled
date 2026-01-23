package com.robinhood.android.advisory.onboarding.retirement.recommendation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: AccountRecommendationDecision.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationDecision;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/api/BrokerageAccountType;", "advisorRecommendation", "accountTypeSelection", "j$/time/Year", "taxYear", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/BrokerageAccountType;Lj$/time/Year;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component2", "component3", "()Lj$/time/Year;", "copy", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/BrokerageAccountType;Lj$/time/Year;)Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationDecision;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/api/BrokerageAccountType;", "getAdvisorRecommendation", "getAccountTypeSelection", "Lj$/time/Year;", "getTaxYear", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountRecommendationDecision implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountRecommendationDecision> CREATOR = new Creator();
    private final BrokerageAccountType accountTypeSelection;
    private final BrokerageAccountType advisorRecommendation;
    private final Year taxYear;

    /* compiled from: AccountRecommendationDecision.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountRecommendationDecision> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRecommendationDecision createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountRecommendationDecision(BrokerageAccountType.valueOf(parcel.readString()), BrokerageAccountType.valueOf(parcel.readString()), (Year) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRecommendationDecision[] newArray(int i) {
            return new AccountRecommendationDecision[i];
        }
    }

    public static /* synthetic */ AccountRecommendationDecision copy$default(AccountRecommendationDecision accountRecommendationDecision, BrokerageAccountType brokerageAccountType, BrokerageAccountType brokerageAccountType2, Year year, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = accountRecommendationDecision.advisorRecommendation;
        }
        if ((i & 2) != 0) {
            brokerageAccountType2 = accountRecommendationDecision.accountTypeSelection;
        }
        if ((i & 4) != 0) {
            year = accountRecommendationDecision.taxYear;
        }
        return accountRecommendationDecision.copy(brokerageAccountType, brokerageAccountType2, year);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getAdvisorRecommendation() {
        return this.advisorRecommendation;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getAccountTypeSelection() {
        return this.accountTypeSelection;
    }

    /* renamed from: component3, reason: from getter */
    public final Year getTaxYear() {
        return this.taxYear;
    }

    public final AccountRecommendationDecision copy(BrokerageAccountType advisorRecommendation, BrokerageAccountType accountTypeSelection, Year taxYear) {
        Intrinsics.checkNotNullParameter(advisorRecommendation, "advisorRecommendation");
        Intrinsics.checkNotNullParameter(accountTypeSelection, "accountTypeSelection");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        return new AccountRecommendationDecision(advisorRecommendation, accountTypeSelection, taxYear);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRecommendationDecision)) {
            return false;
        }
        AccountRecommendationDecision accountRecommendationDecision = (AccountRecommendationDecision) other;
        return this.advisorRecommendation == accountRecommendationDecision.advisorRecommendation && this.accountTypeSelection == accountRecommendationDecision.accountTypeSelection && Intrinsics.areEqual(this.taxYear, accountRecommendationDecision.taxYear);
    }

    public int hashCode() {
        return (((this.advisorRecommendation.hashCode() * 31) + this.accountTypeSelection.hashCode()) * 31) + this.taxYear.hashCode();
    }

    public String toString() {
        return "AccountRecommendationDecision(advisorRecommendation=" + this.advisorRecommendation + ", accountTypeSelection=" + this.accountTypeSelection + ", taxYear=" + this.taxYear + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.advisorRecommendation.name());
        dest.writeString(this.accountTypeSelection.name());
        dest.writeSerializable(this.taxYear);
    }

    public AccountRecommendationDecision(BrokerageAccountType advisorRecommendation, BrokerageAccountType accountTypeSelection, Year taxYear) {
        Intrinsics.checkNotNullParameter(advisorRecommendation, "advisorRecommendation");
        Intrinsics.checkNotNullParameter(accountTypeSelection, "accountTypeSelection");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        this.advisorRecommendation = advisorRecommendation;
        this.accountTypeSelection = accountTypeSelection;
        this.taxYear = taxYear;
    }

    public final BrokerageAccountType getAdvisorRecommendation() {
        return this.advisorRecommendation;
    }

    public final BrokerageAccountType getAccountTypeSelection() {
        return this.accountTypeSelection;
    }

    public final Year getTaxYear() {
        return this.taxYear;
    }
}
