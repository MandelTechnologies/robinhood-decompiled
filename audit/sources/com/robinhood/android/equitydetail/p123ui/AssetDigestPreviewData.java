package com.robinhood.android.equitydetail.p123ui;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/AssetDigestPreviewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AssetDigestPreviewData extends DetailData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID instrumentId;

    public static /* synthetic */ AssetDigestPreviewData copy$default(AssetDigestPreviewData assetDigestPreviewData, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetDigestPreviewData.accountNumber;
        }
        if ((i & 2) != 0) {
            uuid = assetDigestPreviewData.instrumentId;
        }
        return assetDigestPreviewData.copy(str, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final AssetDigestPreviewData copy(String accountNumber, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new AssetDigestPreviewData(accountNumber, instrumentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetDigestPreviewData)) {
            return false;
        }
        AssetDigestPreviewData assetDigestPreviewData = (AssetDigestPreviewData) other;
        return Intrinsics.areEqual(this.accountNumber, assetDigestPreviewData.accountNumber) && Intrinsics.areEqual(this.instrumentId, assetDigestPreviewData.instrumentId);
    }

    public int hashCode() {
        return (this.accountNumber.hashCode() * 31) + this.instrumentId.hashCode();
    }

    public String toString() {
        return "AssetDigestPreviewData(accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ")";
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDigestPreviewData(String accountNumber, UUID instrumentId) {
        super(null);
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.accountNumber = accountNumber;
        this.instrumentId = instrumentId;
    }
}
