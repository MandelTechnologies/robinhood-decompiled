package com.robinhood.android.lib.margin.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.util.Money;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiMarginInvestingInfo.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003Jy\u0010-\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\u00072\b\b\u0003\u0010\r\u001a\u00020\u00072\b\b\u0003\u0010\u000e\u001a\u00020\u00072\b\b\u0003\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "Landroid/os/Parcelable;", "accountNumber", "", "activeInterestRate", "Ljava/math/BigDecimal;", "marginAvailable", "Lcom/robinhood/models/util/Money;", "amountBorrowed", "buyingPowerWithMargin", "buyingPowerWithUserSetLimit", "goldInterestExemptionAmount", "marginMaintenance", "optionsCollateral", "todaysDayTradeLimit", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)V", "getAccountNumber", "()Ljava/lang/String;", "getActiveInterestRate", "()Ljava/math/BigDecimal;", "getMarginAvailable", "()Lcom/robinhood/models/util/Money;", "getAmountBorrowed", "getBuyingPowerWithMargin", "getBuyingPowerWithUserSetLimit", "getGoldInterestExemptionAmount", "getMarginMaintenance", "getOptionsCollateral", "getTodaysDayTradeLimit", "getDisplayCurrency", "()Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApiMarginInvestingInfo implements Parcelable {
    public static final Parcelable.Creator<ApiMarginInvestingInfo> CREATOR = new Creator();
    private final String accountNumber;
    private final BigDecimal activeInterestRate;
    private final Money amountBorrowed;
    private final Money buyingPowerWithMargin;
    private final Money buyingPowerWithUserSetLimit;
    private final DisplayCurrency displayCurrency;
    private final Money goldInterestExemptionAmount;
    private final Money marginAvailable;
    private final Money marginMaintenance;
    private final Money optionsCollateral;
    private final Money todaysDayTradeLimit;

    /* compiled from: ApiMarginInvestingInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiMarginInvestingInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiMarginInvestingInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiMarginInvestingInfo(parcel.readString(), (BigDecimal) parcel.readSerializable(), (Money) parcel.readParcelable(ApiMarginInvestingInfo.class.getClassLoader()), (Money) parcel.readParcelable(ApiMarginInvestingInfo.class.getClassLoader()), (Money) parcel.readParcelable(ApiMarginInvestingInfo.class.getClassLoader()), (Money) parcel.readParcelable(ApiMarginInvestingInfo.class.getClassLoader()), (Money) parcel.readParcelable(ApiMarginInvestingInfo.class.getClassLoader()), (Money) parcel.readParcelable(ApiMarginInvestingInfo.class.getClassLoader()), (Money) parcel.readParcelable(ApiMarginInvestingInfo.class.getClassLoader()), (Money) parcel.readParcelable(ApiMarginInvestingInfo.class.getClassLoader()), DisplayCurrency.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiMarginInvestingInfo[] newArray(int i) {
            return new ApiMarginInvestingInfo[i];
        }
    }

    public static /* synthetic */ ApiMarginInvestingInfo copy$default(ApiMarginInvestingInfo apiMarginInvestingInfo, String str, BigDecimal bigDecimal, Money money, Money money2, Money money3, Money money4, Money money5, Money money6, Money money7, Money money8, DisplayCurrency displayCurrency, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiMarginInvestingInfo.accountNumber;
        }
        if ((i & 2) != 0) {
            bigDecimal = apiMarginInvestingInfo.activeInterestRate;
        }
        if ((i & 4) != 0) {
            money = apiMarginInvestingInfo.marginAvailable;
        }
        if ((i & 8) != 0) {
            money2 = apiMarginInvestingInfo.amountBorrowed;
        }
        if ((i & 16) != 0) {
            money3 = apiMarginInvestingInfo.buyingPowerWithMargin;
        }
        if ((i & 32) != 0) {
            money4 = apiMarginInvestingInfo.buyingPowerWithUserSetLimit;
        }
        if ((i & 64) != 0) {
            money5 = apiMarginInvestingInfo.goldInterestExemptionAmount;
        }
        if ((i & 128) != 0) {
            money6 = apiMarginInvestingInfo.marginMaintenance;
        }
        if ((i & 256) != 0) {
            money7 = apiMarginInvestingInfo.optionsCollateral;
        }
        if ((i & 512) != 0) {
            money8 = apiMarginInvestingInfo.todaysDayTradeLimit;
        }
        if ((i & 1024) != 0) {
            displayCurrency = apiMarginInvestingInfo.displayCurrency;
        }
        Money money9 = money8;
        DisplayCurrency displayCurrency2 = displayCurrency;
        Money money10 = money6;
        Money money11 = money7;
        Money money12 = money4;
        Money money13 = money5;
        Money money14 = money3;
        Money money15 = money;
        return apiMarginInvestingInfo.copy(str, bigDecimal, money15, money2, money14, money12, money13, money10, money11, money9, displayCurrency2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final Money getTodaysDayTradeLimit() {
        return this.todaysDayTradeLimit;
    }

    /* renamed from: component11, reason: from getter */
    public final DisplayCurrency getDisplayCurrency() {
        return this.displayCurrency;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getActiveInterestRate() {
        return this.activeInterestRate;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getMarginAvailable() {
        return this.marginAvailable;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getAmountBorrowed() {
        return this.amountBorrowed;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getBuyingPowerWithMargin() {
        return this.buyingPowerWithMargin;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getBuyingPowerWithUserSetLimit() {
        return this.buyingPowerWithUserSetLimit;
    }

    /* renamed from: component7, reason: from getter */
    public final Money getGoldInterestExemptionAmount() {
        return this.goldInterestExemptionAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final Money getMarginMaintenance() {
        return this.marginMaintenance;
    }

    /* renamed from: component9, reason: from getter */
    public final Money getOptionsCollateral() {
        return this.optionsCollateral;
    }

    public final ApiMarginInvestingInfo copy(@Json(name = "account_number") String accountNumber, @Json(name = "active_interest_rate") BigDecimal activeInterestRate, @Json(name = "margin_available") Money marginAvailable, @Json(name = "amount_borrowed") Money amountBorrowed, @Json(name = "buying_power_with_margin") Money buyingPowerWithMargin, @Json(name = "buying_power_with_user_set_limit") Money buyingPowerWithUserSetLimit, @Json(name = "gold_interest_exemption_amount") Money goldInterestExemptionAmount, @Json(name = "margin_maintenance") Money marginMaintenance, @Json(name = "options_collateral") Money optionsCollateral, @Json(name = "todays_day_trade_limit") Money todaysDayTradeLimit, @Json(name = "display_currency") DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(marginAvailable, "marginAvailable");
        Intrinsics.checkNotNullParameter(amountBorrowed, "amountBorrowed");
        Intrinsics.checkNotNullParameter(buyingPowerWithMargin, "buyingPowerWithMargin");
        Intrinsics.checkNotNullParameter(buyingPowerWithUserSetLimit, "buyingPowerWithUserSetLimit");
        Intrinsics.checkNotNullParameter(goldInterestExemptionAmount, "goldInterestExemptionAmount");
        Intrinsics.checkNotNullParameter(marginMaintenance, "marginMaintenance");
        Intrinsics.checkNotNullParameter(optionsCollateral, "optionsCollateral");
        Intrinsics.checkNotNullParameter(todaysDayTradeLimit, "todaysDayTradeLimit");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        return new ApiMarginInvestingInfo(accountNumber, activeInterestRate, marginAvailable, amountBorrowed, buyingPowerWithMargin, buyingPowerWithUserSetLimit, goldInterestExemptionAmount, marginMaintenance, optionsCollateral, todaysDayTradeLimit, displayCurrency);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMarginInvestingInfo)) {
            return false;
        }
        ApiMarginInvestingInfo apiMarginInvestingInfo = (ApiMarginInvestingInfo) other;
        return Intrinsics.areEqual(this.accountNumber, apiMarginInvestingInfo.accountNumber) && Intrinsics.areEqual(this.activeInterestRate, apiMarginInvestingInfo.activeInterestRate) && Intrinsics.areEqual(this.marginAvailable, apiMarginInvestingInfo.marginAvailable) && Intrinsics.areEqual(this.amountBorrowed, apiMarginInvestingInfo.amountBorrowed) && Intrinsics.areEqual(this.buyingPowerWithMargin, apiMarginInvestingInfo.buyingPowerWithMargin) && Intrinsics.areEqual(this.buyingPowerWithUserSetLimit, apiMarginInvestingInfo.buyingPowerWithUserSetLimit) && Intrinsics.areEqual(this.goldInterestExemptionAmount, apiMarginInvestingInfo.goldInterestExemptionAmount) && Intrinsics.areEqual(this.marginMaintenance, apiMarginInvestingInfo.marginMaintenance) && Intrinsics.areEqual(this.optionsCollateral, apiMarginInvestingInfo.optionsCollateral) && Intrinsics.areEqual(this.todaysDayTradeLimit, apiMarginInvestingInfo.todaysDayTradeLimit) && this.displayCurrency == apiMarginInvestingInfo.displayCurrency;
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        BigDecimal bigDecimal = this.activeInterestRate;
        return ((((((((((((((((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.marginAvailable.hashCode()) * 31) + this.amountBorrowed.hashCode()) * 31) + this.buyingPowerWithMargin.hashCode()) * 31) + this.buyingPowerWithUserSetLimit.hashCode()) * 31) + this.goldInterestExemptionAmount.hashCode()) * 31) + this.marginMaintenance.hashCode()) * 31) + this.optionsCollateral.hashCode()) * 31) + this.todaysDayTradeLimit.hashCode()) * 31) + this.displayCurrency.hashCode();
    }

    public String toString() {
        return "ApiMarginInvestingInfo(accountNumber=" + this.accountNumber + ", activeInterestRate=" + this.activeInterestRate + ", marginAvailable=" + this.marginAvailable + ", amountBorrowed=" + this.amountBorrowed + ", buyingPowerWithMargin=" + this.buyingPowerWithMargin + ", buyingPowerWithUserSetLimit=" + this.buyingPowerWithUserSetLimit + ", goldInterestExemptionAmount=" + this.goldInterestExemptionAmount + ", marginMaintenance=" + this.marginMaintenance + ", optionsCollateral=" + this.optionsCollateral + ", todaysDayTradeLimit=" + this.todaysDayTradeLimit + ", displayCurrency=" + this.displayCurrency + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.activeInterestRate);
        dest.writeParcelable(this.marginAvailable, flags);
        dest.writeParcelable(this.amountBorrowed, flags);
        dest.writeParcelable(this.buyingPowerWithMargin, flags);
        dest.writeParcelable(this.buyingPowerWithUserSetLimit, flags);
        dest.writeParcelable(this.goldInterestExemptionAmount, flags);
        dest.writeParcelable(this.marginMaintenance, flags);
        dest.writeParcelable(this.optionsCollateral, flags);
        dest.writeParcelable(this.todaysDayTradeLimit, flags);
        dest.writeString(this.displayCurrency.name());
    }

    public ApiMarginInvestingInfo(@Json(name = "account_number") String accountNumber, @Json(name = "active_interest_rate") BigDecimal bigDecimal, @Json(name = "margin_available") Money marginAvailable, @Json(name = "amount_borrowed") Money amountBorrowed, @Json(name = "buying_power_with_margin") Money buyingPowerWithMargin, @Json(name = "buying_power_with_user_set_limit") Money buyingPowerWithUserSetLimit, @Json(name = "gold_interest_exemption_amount") Money goldInterestExemptionAmount, @Json(name = "margin_maintenance") Money marginMaintenance, @Json(name = "options_collateral") Money optionsCollateral, @Json(name = "todays_day_trade_limit") Money todaysDayTradeLimit, @Json(name = "display_currency") DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(marginAvailable, "marginAvailable");
        Intrinsics.checkNotNullParameter(amountBorrowed, "amountBorrowed");
        Intrinsics.checkNotNullParameter(buyingPowerWithMargin, "buyingPowerWithMargin");
        Intrinsics.checkNotNullParameter(buyingPowerWithUserSetLimit, "buyingPowerWithUserSetLimit");
        Intrinsics.checkNotNullParameter(goldInterestExemptionAmount, "goldInterestExemptionAmount");
        Intrinsics.checkNotNullParameter(marginMaintenance, "marginMaintenance");
        Intrinsics.checkNotNullParameter(optionsCollateral, "optionsCollateral");
        Intrinsics.checkNotNullParameter(todaysDayTradeLimit, "todaysDayTradeLimit");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        this.accountNumber = accountNumber;
        this.activeInterestRate = bigDecimal;
        this.marginAvailable = marginAvailable;
        this.amountBorrowed = amountBorrowed;
        this.buyingPowerWithMargin = buyingPowerWithMargin;
        this.buyingPowerWithUserSetLimit = buyingPowerWithUserSetLimit;
        this.goldInterestExemptionAmount = goldInterestExemptionAmount;
        this.marginMaintenance = marginMaintenance;
        this.optionsCollateral = optionsCollateral;
        this.todaysDayTradeLimit = todaysDayTradeLimit;
        this.displayCurrency = displayCurrency;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BigDecimal getActiveInterestRate() {
        return this.activeInterestRate;
    }

    public final Money getMarginAvailable() {
        return this.marginAvailable;
    }

    public final Money getAmountBorrowed() {
        return this.amountBorrowed;
    }

    public final Money getBuyingPowerWithMargin() {
        return this.buyingPowerWithMargin;
    }

    public final Money getBuyingPowerWithUserSetLimit() {
        return this.buyingPowerWithUserSetLimit;
    }

    public final Money getGoldInterestExemptionAmount() {
        return this.goldInterestExemptionAmount;
    }

    public final Money getMarginMaintenance() {
        return this.marginMaintenance;
    }

    public final Money getOptionsCollateral() {
        return this.optionsCollateral;
    }

    public final Money getTodaysDayTradeLimit() {
        return this.todaysDayTradeLimit;
    }

    public final DisplayCurrency getDisplayCurrency() {
        return this.displayCurrency;
    }
}
