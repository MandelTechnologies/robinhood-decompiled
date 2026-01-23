package com.robinhood.android.transfers.international.p266ui;

import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.util.Money;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferState;", "", "amount", "Lcom/robinhood/models/util/Money;", "currency", "Ljava/util/Currency;", "transferType", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "fxData", "Lcom/robinhood/android/transfers/international/ui/model/FxData;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/util/Currency;Lcom/robinhood/android/transfers/international/ui/model/TransferType;Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;Lcom/robinhood/android/transfers/international/ui/model/FxData;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getCurrency", "()Ljava/util/Currency;", "getTransferType", "()Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "getSourceAccount", "()Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "getSinkAccount", "getFxData", "()Lcom/robinhood/android/transfers/international/ui/model/FxData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternationalTransferState {
    public static final int $stable = 8;
    private final Money amount;
    private final Currency currency;
    private final FxData fxData;
    private final MultiCurrencyAccount sinkAccount;
    private final MultiCurrencyAccount sourceAccount;
    private final TransferType transferType;

    public InternationalTransferState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ InternationalTransferState copy$default(InternationalTransferState internationalTransferState, Money money, Currency currency, TransferType transferType, MultiCurrencyAccount multiCurrencyAccount, MultiCurrencyAccount multiCurrencyAccount2, FxData fxData, int i, Object obj) {
        if ((i & 1) != 0) {
            money = internationalTransferState.amount;
        }
        if ((i & 2) != 0) {
            currency = internationalTransferState.currency;
        }
        if ((i & 4) != 0) {
            transferType = internationalTransferState.transferType;
        }
        if ((i & 8) != 0) {
            multiCurrencyAccount = internationalTransferState.sourceAccount;
        }
        if ((i & 16) != 0) {
            multiCurrencyAccount2 = internationalTransferState.sinkAccount;
        }
        if ((i & 32) != 0) {
            fxData = internationalTransferState.fxData;
        }
        MultiCurrencyAccount multiCurrencyAccount3 = multiCurrencyAccount2;
        FxData fxData2 = fxData;
        return internationalTransferState.copy(money, currency, transferType, multiCurrencyAccount, multiCurrencyAccount3, fxData2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferType getTransferType() {
        return this.transferType;
    }

    /* renamed from: component4, reason: from getter */
    public final MultiCurrencyAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final MultiCurrencyAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final FxData getFxData() {
        return this.fxData;
    }

    public final InternationalTransferState copy(Money amount, Currency currency, TransferType transferType, MultiCurrencyAccount sourceAccount, MultiCurrencyAccount sinkAccount, FxData fxData) {
        return new InternationalTransferState(amount, currency, transferType, sourceAccount, sinkAccount, fxData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternationalTransferState)) {
            return false;
        }
        InternationalTransferState internationalTransferState = (InternationalTransferState) other;
        return Intrinsics.areEqual(this.amount, internationalTransferState.amount) && Intrinsics.areEqual(this.currency, internationalTransferState.currency) && this.transferType == internationalTransferState.transferType && Intrinsics.areEqual(this.sourceAccount, internationalTransferState.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, internationalTransferState.sinkAccount) && Intrinsics.areEqual(this.fxData, internationalTransferState.fxData);
    }

    public int hashCode() {
        Money money = this.amount;
        int iHashCode = (money == null ? 0 : money.hashCode()) * 31;
        Currency currency = this.currency;
        int iHashCode2 = (iHashCode + (currency == null ? 0 : currency.hashCode())) * 31;
        TransferType transferType = this.transferType;
        int iHashCode3 = (iHashCode2 + (transferType == null ? 0 : transferType.hashCode())) * 31;
        MultiCurrencyAccount multiCurrencyAccount = this.sourceAccount;
        int iHashCode4 = (iHashCode3 + (multiCurrencyAccount == null ? 0 : multiCurrencyAccount.hashCode())) * 31;
        MultiCurrencyAccount multiCurrencyAccount2 = this.sinkAccount;
        int iHashCode5 = (iHashCode4 + (multiCurrencyAccount2 == null ? 0 : multiCurrencyAccount2.hashCode())) * 31;
        FxData fxData = this.fxData;
        return iHashCode5 + (fxData != null ? fxData.hashCode() : 0);
    }

    public String toString() {
        return "InternationalTransferState(amount=" + this.amount + ", currency=" + this.currency + ", transferType=" + this.transferType + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", fxData=" + this.fxData + ")";
    }

    public InternationalTransferState(Money money, Currency currency, TransferType transferType, MultiCurrencyAccount multiCurrencyAccount, MultiCurrencyAccount multiCurrencyAccount2, FxData fxData) {
        this.amount = money;
        this.currency = currency;
        this.transferType = transferType;
        this.sourceAccount = multiCurrencyAccount;
        this.sinkAccount = multiCurrencyAccount2;
        this.fxData = fxData;
    }

    public /* synthetic */ InternationalTransferState(Money money, Currency currency, TransferType transferType, MultiCurrencyAccount multiCurrencyAccount, MultiCurrencyAccount multiCurrencyAccount2, FxData fxData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : currency, (i & 4) != 0 ? null : transferType, (i & 8) != 0 ? null : multiCurrencyAccount, (i & 16) != 0 ? null : multiCurrencyAccount2, (i & 32) != 0 ? null : fxData);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final TransferType getTransferType() {
        return this.transferType;
    }

    public final MultiCurrencyAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final MultiCurrencyAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final FxData getFxData() {
        return this.fxData;
    }
}
