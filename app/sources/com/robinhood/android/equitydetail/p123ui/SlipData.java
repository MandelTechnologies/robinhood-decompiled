package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.models.api.bonfire.ApiStockDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/SlipData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "accountNumber", "", "tickerSymbol", "locality", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getTickerSymbol", "getLocality", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SlipData extends DetailData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final String locality;
    private final ApiStockDetail.Section section;
    private final String tickerSymbol;

    public static /* synthetic */ SlipData copy$default(SlipData slipData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slipData.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = slipData.tickerSymbol;
        }
        if ((i & 4) != 0) {
            str3 = slipData.locality;
        }
        return slipData.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTickerSymbol() {
        return this.tickerSymbol;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    public final SlipData copy(String accountNumber, String tickerSymbol, String locality) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(tickerSymbol, "tickerSymbol");
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new SlipData(accountNumber, tickerSymbol, locality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipData)) {
            return false;
        }
        SlipData slipData = (SlipData) other;
        return Intrinsics.areEqual(this.accountNumber, slipData.accountNumber) && Intrinsics.areEqual(this.tickerSymbol, slipData.tickerSymbol) && Intrinsics.areEqual(this.locality, slipData.locality);
    }

    public int hashCode() {
        return (((this.accountNumber.hashCode() * 31) + this.tickerSymbol.hashCode()) * 31) + this.locality.hashCode();
    }

    public String toString() {
        return "SlipData(accountNumber=" + this.accountNumber + ", tickerSymbol=" + this.tickerSymbol + ", locality=" + this.locality + ")";
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getTickerSymbol() {
        return this.tickerSymbol;
    }

    public final String getLocality() {
        return this.locality;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipData(String accountNumber, String tickerSymbol, String locality) {
        super(null);
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(tickerSymbol, "tickerSymbol");
        Intrinsics.checkNotNullParameter(locality, "locality");
        this.accountNumber = accountNumber;
        this.tickerSymbol = tickerSymbol;
        this.locality = locality;
        this.section = ApiStockDetail.Section.SLIP;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }
}
