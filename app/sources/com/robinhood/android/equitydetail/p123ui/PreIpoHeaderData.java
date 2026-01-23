package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.models.p320db.bonfire.StockDetailHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/PreIpoHeaderData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "ipoHeader", "Lcom/robinhood/models/db/bonfire/StockDetailHeader;", "<init>", "(Lcom/robinhood/models/db/bonfire/StockDetailHeader;)V", "getIpoHeader", "()Lcom/robinhood/models/db/bonfire/StockDetailHeader;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreIpoHeaderData extends DetailData {
    public static final int $stable = 8;
    private final StockDetailHeader ipoHeader;

    public static /* synthetic */ PreIpoHeaderData copy$default(PreIpoHeaderData preIpoHeaderData, StockDetailHeader stockDetailHeader, int i, Object obj) {
        if ((i & 1) != 0) {
            stockDetailHeader = preIpoHeaderData.ipoHeader;
        }
        return preIpoHeaderData.copy(stockDetailHeader);
    }

    /* renamed from: component1, reason: from getter */
    public final StockDetailHeader getIpoHeader() {
        return this.ipoHeader;
    }

    public final PreIpoHeaderData copy(StockDetailHeader ipoHeader) {
        Intrinsics.checkNotNullParameter(ipoHeader, "ipoHeader");
        return new PreIpoHeaderData(ipoHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PreIpoHeaderData) && Intrinsics.areEqual(this.ipoHeader, ((PreIpoHeaderData) other).ipoHeader);
    }

    public int hashCode() {
        return this.ipoHeader.hashCode();
    }

    public String toString() {
        return "PreIpoHeaderData(ipoHeader=" + this.ipoHeader + ")";
    }

    public final StockDetailHeader getIpoHeader() {
        return this.ipoHeader;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreIpoHeaderData(StockDetailHeader ipoHeader) {
        super(null);
        Intrinsics.checkNotNullParameter(ipoHeader, "ipoHeader");
        this.ipoHeader = ipoHeader;
    }
}
