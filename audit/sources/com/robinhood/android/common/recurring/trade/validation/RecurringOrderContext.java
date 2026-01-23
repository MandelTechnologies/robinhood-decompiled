package com.robinhood.android.common.recurring.trade.validation;

import com.robinhood.android.common.recurring.trade.RecurringOrderViewState;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.api.ApiInvestmentScheduleRequest;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderContext.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003JE\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "", "apiRequest", "Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;", "account", "Lcom/robinhood/models/db/Account;", "amountType", "Lcom/robinhood/recurring/models/AmountType;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "investmentTargetData", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;", "overrideBuyingPowerCheck", "", "<init>", "(Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;Lcom/robinhood/models/db/Account;Lcom/robinhood/recurring/models/AmountType;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;Z)V", "getApiRequest", "()Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getAmountType", "()Lcom/robinhood/recurring/models/AmountType;", "getUnifiedAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getInvestmentTargetData", "()Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData;", "getOverrideBuyingPowerCheck", "()Z", "isCrypto", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "buyingPower", "Lcom/robinhood/models/util/Money;", "getBuyingPower", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderContext {
    public static final int $stable = 8;
    private final Account account;
    private final AmountType amountType;
    private final ApiInvestmentScheduleRequest apiRequest;
    private final Money buyingPower;
    private final RecurringOrderViewState.InvestmentTargetData investmentTargetData;
    private final boolean overrideBuyingPowerCheck;
    private final UnifiedAccountV2 unifiedAccount;

    public static /* synthetic */ RecurringOrderContext copy$default(RecurringOrderContext recurringOrderContext, ApiInvestmentScheduleRequest apiInvestmentScheduleRequest, Account account, AmountType amountType, UnifiedAccountV2 unifiedAccountV2, RecurringOrderViewState.InvestmentTargetData investmentTargetData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            apiInvestmentScheduleRequest = recurringOrderContext.apiRequest;
        }
        if ((i & 2) != 0) {
            account = recurringOrderContext.account;
        }
        if ((i & 4) != 0) {
            amountType = recurringOrderContext.amountType;
        }
        if ((i & 8) != 0) {
            unifiedAccountV2 = recurringOrderContext.unifiedAccount;
        }
        if ((i & 16) != 0) {
            investmentTargetData = recurringOrderContext.investmentTargetData;
        }
        if ((i & 32) != 0) {
            z = recurringOrderContext.overrideBuyingPowerCheck;
        }
        RecurringOrderViewState.InvestmentTargetData investmentTargetData2 = investmentTargetData;
        boolean z2 = z;
        return recurringOrderContext.copy(apiInvestmentScheduleRequest, account, amountType, unifiedAccountV2, investmentTargetData2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiInvestmentScheduleRequest getApiRequest() {
        return this.apiRequest;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component3, reason: from getter */
    public final AmountType getAmountType() {
        return this.amountType;
    }

    /* renamed from: component4, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final RecurringOrderViewState.InvestmentTargetData getInvestmentTargetData() {
        return this.investmentTargetData;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getOverrideBuyingPowerCheck() {
        return this.overrideBuyingPowerCheck;
    }

    public final RecurringOrderContext copy(ApiInvestmentScheduleRequest apiRequest, Account account, AmountType amountType, UnifiedAccountV2 unifiedAccount, RecurringOrderViewState.InvestmentTargetData investmentTargetData, boolean overrideBuyingPowerCheck) {
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(unifiedAccount, "unifiedAccount");
        Intrinsics.checkNotNullParameter(investmentTargetData, "investmentTargetData");
        return new RecurringOrderContext(apiRequest, account, amountType, unifiedAccount, investmentTargetData, overrideBuyingPowerCheck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderContext)) {
            return false;
        }
        RecurringOrderContext recurringOrderContext = (RecurringOrderContext) other;
        return Intrinsics.areEqual(this.apiRequest, recurringOrderContext.apiRequest) && Intrinsics.areEqual(this.account, recurringOrderContext.account) && this.amountType == recurringOrderContext.amountType && Intrinsics.areEqual(this.unifiedAccount, recurringOrderContext.unifiedAccount) && Intrinsics.areEqual(this.investmentTargetData, recurringOrderContext.investmentTargetData) && this.overrideBuyingPowerCheck == recurringOrderContext.overrideBuyingPowerCheck;
    }

    public int hashCode() {
        return (((((((((this.apiRequest.hashCode() * 31) + this.account.hashCode()) * 31) + this.amountType.hashCode()) * 31) + this.unifiedAccount.hashCode()) * 31) + this.investmentTargetData.hashCode()) * 31) + Boolean.hashCode(this.overrideBuyingPowerCheck);
    }

    public String toString() {
        return "RecurringOrderContext(apiRequest=" + this.apiRequest + ", account=" + this.account + ", amountType=" + this.amountType + ", unifiedAccount=" + this.unifiedAccount + ", investmentTargetData=" + this.investmentTargetData + ", overrideBuyingPowerCheck=" + this.overrideBuyingPowerCheck + ")";
    }

    public RecurringOrderContext(ApiInvestmentScheduleRequest apiRequest, Account account, AmountType amountType, UnifiedAccountV2 unifiedAccount, RecurringOrderViewState.InvestmentTargetData investmentTargetData, boolean z) {
        Money accountBuyingPower;
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(unifiedAccount, "unifiedAccount");
        Intrinsics.checkNotNullParameter(investmentTargetData, "investmentTargetData");
        this.apiRequest = apiRequest;
        this.account = account;
        this.amountType = amountType;
        this.unifiedAccount = unifiedAccount;
        this.investmentTargetData = investmentTargetData;
        this.overrideBuyingPowerCheck = z;
        if (investmentTargetData instanceof RecurringOrderViewState.InvestmentTargetData.Equity) {
            InstrumentBuyingPower instrumentBuyingPower = ((RecurringOrderViewState.InvestmentTargetData.Equity) investmentTargetData).getInstrumentBuyingPower();
            if (instrumentBuyingPower == null || (accountBuyingPower = instrumentBuyingPower.getBuyingPowerAmount()) == null) {
                accountBuyingPower = unifiedAccount.getAccountBuyingPower();
            }
        } else if (investmentTargetData instanceof RecurringOrderViewState.InvestmentTargetData.Crypto) {
            CryptoBuyingPower cryptoBuyingPower = ((RecurringOrderViewState.InvestmentTargetData.Crypto) investmentTargetData).getCryptoBuyingPower();
            if (cryptoBuyingPower == null || (accountBuyingPower = cryptoBuyingPower.getBuyingPower()) == null) {
                accountBuyingPower = unifiedAccount.getCryptoBuyingPower();
            }
        } else {
            if (!Intrinsics.areEqual(investmentTargetData, RecurringOrderViewState.InvestmentTargetData.BrokerageCash.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            accountBuyingPower = unifiedAccount.getAccountBuyingPower();
        }
        this.buyingPower = accountBuyingPower;
    }

    public final ApiInvestmentScheduleRequest getApiRequest() {
        return this.apiRequest;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final AmountType getAmountType() {
        return this.amountType;
    }

    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final RecurringOrderViewState.InvestmentTargetData getInvestmentTargetData() {
        return this.investmentTargetData;
    }

    public final boolean getOverrideBuyingPowerCheck() {
        return this.overrideBuyingPowerCheck;
    }

    public final boolean isCrypto() {
        RecurringOrderViewState.InvestmentTargetData investmentTargetData = this.investmentTargetData;
        if (investmentTargetData instanceof RecurringOrderViewState.InvestmentTargetData.Crypto) {
            return true;
        }
        if ((investmentTargetData instanceof RecurringOrderViewState.InvestmentTargetData.Equity) || Intrinsics.areEqual(investmentTargetData, RecurringOrderViewState.InvestmentTargetData.BrokerageCash.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isBrokerageCashTransfer() {
        RecurringOrderViewState.InvestmentTargetData investmentTargetData = this.investmentTargetData;
        if (Intrinsics.areEqual(investmentTargetData, RecurringOrderViewState.InvestmentTargetData.BrokerageCash.INSTANCE)) {
            return true;
        }
        if ((investmentTargetData instanceof RecurringOrderViewState.InvestmentTargetData.Equity) || (investmentTargetData instanceof RecurringOrderViewState.InvestmentTargetData.Crypto)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Money getBuyingPower() {
        return this.buyingPower;
    }
}
