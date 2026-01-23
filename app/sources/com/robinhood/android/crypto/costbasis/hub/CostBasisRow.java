package com.robinhood.android.crypto.costbasis.hub;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisHubDataState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CostBasisRow;", "", "id", "", "accountId", "currencySymbol", "amount", "summaryAdditionalText", "formattedDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAccountId", "getCurrencySymbol", "getAmount", "getSummaryAdditionalText", "getFormattedDate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CostBasisRow {
    public static final int $stable = 0;
    private final String accountId;
    private final String amount;
    private final String currencySymbol;
    private final String formattedDate;
    private final String id;
    private final String summaryAdditionalText;

    public static /* synthetic */ CostBasisRow copy$default(CostBasisRow costBasisRow, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costBasisRow.id;
        }
        if ((i & 2) != 0) {
            str2 = costBasisRow.accountId;
        }
        if ((i & 4) != 0) {
            str3 = costBasisRow.currencySymbol;
        }
        if ((i & 8) != 0) {
            str4 = costBasisRow.amount;
        }
        if ((i & 16) != 0) {
            str5 = costBasisRow.summaryAdditionalText;
        }
        if ((i & 32) != 0) {
            str6 = costBasisRow.formattedDate;
        }
        String str7 = str5;
        String str8 = str6;
        return costBasisRow.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSummaryAdditionalText() {
        return this.summaryAdditionalText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFormattedDate() {
        return this.formattedDate;
    }

    public final CostBasisRow copy(String id, String accountId, String currencySymbol, String amount, String summaryAdditionalText, String formattedDate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(summaryAdditionalText, "summaryAdditionalText");
        return new CostBasisRow(id, accountId, currencySymbol, amount, summaryAdditionalText, formattedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostBasisRow)) {
            return false;
        }
        CostBasisRow costBasisRow = (CostBasisRow) other;
        return Intrinsics.areEqual(this.id, costBasisRow.id) && Intrinsics.areEqual(this.accountId, costBasisRow.accountId) && Intrinsics.areEqual(this.currencySymbol, costBasisRow.currencySymbol) && Intrinsics.areEqual(this.amount, costBasisRow.amount) && Intrinsics.areEqual(this.summaryAdditionalText, costBasisRow.summaryAdditionalText) && Intrinsics.areEqual(this.formattedDate, costBasisRow.formattedDate);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.currencySymbol.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.summaryAdditionalText.hashCode()) * 31;
        String str = this.formattedDate;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CostBasisRow(id=" + this.id + ", accountId=" + this.accountId + ", currencySymbol=" + this.currencySymbol + ", amount=" + this.amount + ", summaryAdditionalText=" + this.summaryAdditionalText + ", formattedDate=" + this.formattedDate + ")";
    }

    public CostBasisRow(String id, String accountId, String currencySymbol, String amount, String summaryAdditionalText, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(summaryAdditionalText, "summaryAdditionalText");
        this.id = id;
        this.accountId = accountId;
        this.currencySymbol = currencySymbol;
        this.amount = amount;
        this.summaryAdditionalText = summaryAdditionalText;
        this.formattedDate = str;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ CostBasisRow(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, str3, str4, str5, str6);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getSummaryAdditionalText() {
        return this.summaryAdditionalText;
    }

    public final String getFormattedDate() {
        return this.formattedDate;
    }
}
