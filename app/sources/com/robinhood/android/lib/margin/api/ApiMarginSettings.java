package com.robinhood.android.lib.margin.api;

import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.models.util.Money;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiMarginSettings.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginSettings;", "", "accountNumber", "", "isMarginInvestingEnabled", "", "isMarginSpendingEnabled", "userSetMarginInvestingLimit", "Lcom/robinhood/models/util/Money;", "userSetMarginSpendingLimit", "<init>", "(Ljava/lang/String;ZZLcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "getAccountNumber", "()Ljava/lang/String;", "()Z", "getUserSetMarginInvestingLimit", "()Lcom/robinhood/models/util/Money;", "getUserSetMarginSpendingLimit", "toDbModel", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApiMarginSettings {
    private final String accountNumber;
    private final boolean isMarginInvestingEnabled;
    private final boolean isMarginSpendingEnabled;
    private final Money userSetMarginInvestingLimit;
    private final Money userSetMarginSpendingLimit;

    public static /* synthetic */ ApiMarginSettings copy$default(ApiMarginSettings apiMarginSettings, String str, boolean z, boolean z2, Money money, Money money2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiMarginSettings.accountNumber;
        }
        if ((i & 2) != 0) {
            z = apiMarginSettings.isMarginInvestingEnabled;
        }
        if ((i & 4) != 0) {
            z2 = apiMarginSettings.isMarginSpendingEnabled;
        }
        if ((i & 8) != 0) {
            money = apiMarginSettings.userSetMarginInvestingLimit;
        }
        if ((i & 16) != 0) {
            money2 = apiMarginSettings.userSetMarginSpendingLimit;
        }
        Money money3 = money2;
        boolean z3 = z2;
        return apiMarginSettings.copy(str, z, z3, money, money3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsMarginSpendingEnabled() {
        return this.isMarginSpendingEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getUserSetMarginInvestingLimit() {
        return this.userSetMarginInvestingLimit;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getUserSetMarginSpendingLimit() {
        return this.userSetMarginSpendingLimit;
    }

    public final ApiMarginSettings copy(@Json(name = "account_number") String accountNumber, @Json(name = "user_enabled_margin") boolean isMarginInvestingEnabled, @Json(name = "user_enabled_margin_spending") boolean isMarginSpendingEnabled, @Json(name = "user_set_margin_limit") Money userSetMarginInvestingLimit, @Json(name = "user_set_margin_spending_limit") Money userSetMarginSpendingLimit) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new ApiMarginSettings(accountNumber, isMarginInvestingEnabled, isMarginSpendingEnabled, userSetMarginInvestingLimit, userSetMarginSpendingLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMarginSettings)) {
            return false;
        }
        ApiMarginSettings apiMarginSettings = (ApiMarginSettings) other;
        return Intrinsics.areEqual(this.accountNumber, apiMarginSettings.accountNumber) && this.isMarginInvestingEnabled == apiMarginSettings.isMarginInvestingEnabled && this.isMarginSpendingEnabled == apiMarginSettings.isMarginSpendingEnabled && Intrinsics.areEqual(this.userSetMarginInvestingLimit, apiMarginSettings.userSetMarginInvestingLimit) && Intrinsics.areEqual(this.userSetMarginSpendingLimit, apiMarginSettings.userSetMarginSpendingLimit);
    }

    public int hashCode() {
        int iHashCode = ((((this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.isMarginInvestingEnabled)) * 31) + Boolean.hashCode(this.isMarginSpendingEnabled)) * 31;
        Money money = this.userSetMarginInvestingLimit;
        int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.userSetMarginSpendingLimit;
        return iHashCode2 + (money2 != null ? money2.hashCode() : 0);
    }

    public String toString() {
        return "ApiMarginSettings(accountNumber=" + this.accountNumber + ", isMarginInvestingEnabled=" + this.isMarginInvestingEnabled + ", isMarginSpendingEnabled=" + this.isMarginSpendingEnabled + ", userSetMarginInvestingLimit=" + this.userSetMarginInvestingLimit + ", userSetMarginSpendingLimit=" + this.userSetMarginSpendingLimit + ")";
    }

    public ApiMarginSettings(@Json(name = "account_number") String accountNumber, @Json(name = "user_enabled_margin") boolean z, @Json(name = "user_enabled_margin_spending") boolean z2, @Json(name = "user_set_margin_limit") Money money, @Json(name = "user_set_margin_spending_limit") Money money2) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.isMarginInvestingEnabled = z;
        this.isMarginSpendingEnabled = z2;
        this.userSetMarginInvestingLimit = money;
        this.userSetMarginSpendingLimit = money2;
    }

    public /* synthetic */ ApiMarginSettings(String str, boolean z, boolean z2, Money money, Money money2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : money2);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean isMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    public final boolean isMarginSpendingEnabled() {
        return this.isMarginSpendingEnabled;
    }

    public final Money getUserSetMarginInvestingLimit() {
        return this.userSetMarginInvestingLimit;
    }

    public final Money getUserSetMarginSpendingLimit() {
        return this.userSetMarginSpendingLimit;
    }

    public final MarginSettings toDbModel() {
        return new MarginSettings(this.accountNumber, this.isMarginInvestingEnabled, this.userSetMarginInvestingLimit, this.isMarginSpendingEnabled, this.userSetMarginSpendingLimit);
    }
}
