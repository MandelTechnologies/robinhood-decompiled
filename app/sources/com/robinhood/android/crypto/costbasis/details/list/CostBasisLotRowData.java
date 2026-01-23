package com.robinhood.android.crypto.costbasis.details.list;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisDetailsListComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/list/CostBasisLotRowData;", "", "id", "", "amount", "amountInFiat", InquiryField.DateField.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAmount", "getAmountInFiat", "getDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CostBasisLotRowData {
    public static final int $stable = 0;
    private final String amount;
    private final String amountInFiat;
    private final String date;
    private final String id;

    public static /* synthetic */ CostBasisLotRowData copy$default(CostBasisLotRowData costBasisLotRowData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costBasisLotRowData.id;
        }
        if ((i & 2) != 0) {
            str2 = costBasisLotRowData.amount;
        }
        if ((i & 4) != 0) {
            str3 = costBasisLotRowData.amountInFiat;
        }
        if ((i & 8) != 0) {
            str4 = costBasisLotRowData.date;
        }
        return costBasisLotRowData.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmountInFiat() {
        return this.amountInFiat;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final CostBasisLotRowData copy(String id, String amount, String amountInFiat, String date) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountInFiat, "amountInFiat");
        Intrinsics.checkNotNullParameter(date, "date");
        return new CostBasisLotRowData(id, amount, amountInFiat, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostBasisLotRowData)) {
            return false;
        }
        CostBasisLotRowData costBasisLotRowData = (CostBasisLotRowData) other;
        return Intrinsics.areEqual(this.id, costBasisLotRowData.id) && Intrinsics.areEqual(this.amount, costBasisLotRowData.amount) && Intrinsics.areEqual(this.amountInFiat, costBasisLotRowData.amountInFiat) && Intrinsics.areEqual(this.date, costBasisLotRowData.date);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.amount.hashCode()) * 31) + this.amountInFiat.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "CostBasisLotRowData(id=" + this.id + ", amount=" + this.amount + ", amountInFiat=" + this.amountInFiat + ", date=" + this.date + ")";
    }

    public CostBasisLotRowData(String id, String amount, String amountInFiat, String date) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountInFiat, "amountInFiat");
        Intrinsics.checkNotNullParameter(date, "date");
        this.id = id;
        this.amount = amount;
        this.amountInFiat = amountInFiat;
        this.date = date;
    }

    public final String getId() {
        return this.id;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getAmountInFiat() {
        return this.amountInFiat;
    }

    public final String getDate() {
        return this.date;
    }
}
