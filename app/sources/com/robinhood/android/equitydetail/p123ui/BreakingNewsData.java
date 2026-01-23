package com.robinhood.android.equitydetail.p123ui;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/BreakingNewsData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "accountNumber", "", "assetId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getAssetId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BreakingNewsData extends DetailData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID assetId;

    public static /* synthetic */ BreakingNewsData copy$default(BreakingNewsData breakingNewsData, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = breakingNewsData.accountNumber;
        }
        if ((i & 2) != 0) {
            uuid = breakingNewsData.assetId;
        }
        return breakingNewsData.copy(str, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getAssetId() {
        return this.assetId;
    }

    public final BreakingNewsData copy(String accountNumber, UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        return new BreakingNewsData(accountNumber, assetId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreakingNewsData)) {
            return false;
        }
        BreakingNewsData breakingNewsData = (BreakingNewsData) other;
        return Intrinsics.areEqual(this.accountNumber, breakingNewsData.accountNumber) && Intrinsics.areEqual(this.assetId, breakingNewsData.assetId);
    }

    public int hashCode() {
        String str = this.accountNumber;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.assetId.hashCode();
    }

    public String toString() {
        return "BreakingNewsData(accountNumber=" + this.accountNumber + ", assetId=" + this.assetId + ")";
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getAssetId() {
        return this.assetId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BreakingNewsData(String str, UUID assetId) {
        super(null);
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.accountNumber = str;
        this.assetId = assetId;
    }
}
