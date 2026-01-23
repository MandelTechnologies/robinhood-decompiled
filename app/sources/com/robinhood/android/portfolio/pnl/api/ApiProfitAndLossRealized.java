package com.robinhood.android.portfolio.pnl.api;

import com.robinhood.models.serverdriven.experimental.api.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiProfitAndLossRealized.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ApiProfitAndLossRealized;", "", "account_number", "", "past_month", "Lcom/robinhood/models/serverdriven/experimental/api/Money;", "year_to_date", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Money;Lcom/robinhood/models/serverdriven/experimental/api/Money;)V", "getAccount_number", "()Ljava/lang/String;", "getPast_month", "()Lcom/robinhood/models/serverdriven/experimental/api/Money;", "getYear_to_date", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiProfitAndLossRealized {
    private final String account_number;
    private final Money past_month;
    private final Money year_to_date;

    public static /* synthetic */ ApiProfitAndLossRealized copy$default(ApiProfitAndLossRealized apiProfitAndLossRealized, String str, Money money, Money money2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiProfitAndLossRealized.account_number;
        }
        if ((i & 2) != 0) {
            money = apiProfitAndLossRealized.past_month;
        }
        if ((i & 4) != 0) {
            money2 = apiProfitAndLossRealized.year_to_date;
        }
        return apiProfitAndLossRealized.copy(str, money, money2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccount_number() {
        return this.account_number;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getPast_month() {
        return this.past_month;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getYear_to_date() {
        return this.year_to_date;
    }

    public final ApiProfitAndLossRealized copy(String account_number, Money past_month, Money year_to_date) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(past_month, "past_month");
        Intrinsics.checkNotNullParameter(year_to_date, "year_to_date");
        return new ApiProfitAndLossRealized(account_number, past_month, year_to_date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiProfitAndLossRealized)) {
            return false;
        }
        ApiProfitAndLossRealized apiProfitAndLossRealized = (ApiProfitAndLossRealized) other;
        return Intrinsics.areEqual(this.account_number, apiProfitAndLossRealized.account_number) && Intrinsics.areEqual(this.past_month, apiProfitAndLossRealized.past_month) && Intrinsics.areEqual(this.year_to_date, apiProfitAndLossRealized.year_to_date);
    }

    public int hashCode() {
        return (((this.account_number.hashCode() * 31) + this.past_month.hashCode()) * 31) + this.year_to_date.hashCode();
    }

    public String toString() {
        return "ApiProfitAndLossRealized(account_number=" + this.account_number + ", past_month=" + this.past_month + ", year_to_date=" + this.year_to_date + ")";
    }

    public ApiProfitAndLossRealized(String account_number, Money past_month, Money year_to_date) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(past_month, "past_month");
        Intrinsics.checkNotNullParameter(year_to_date, "year_to_date");
        this.account_number = account_number;
        this.past_month = past_month;
        this.year_to_date = year_to_date;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Money getPast_month() {
        return this.past_month;
    }

    public final Money getYear_to_date() {
        return this.year_to_date;
    }
}
