package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoSavedAddressesStore.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RecentAddressListRequest;", "", "currencyCode", "", "<init>", "(Ljava/lang/String;)V", "getCurrencyCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class RecentAddressListRequest {
    private final String currencyCode;

    public static /* synthetic */ RecentAddressListRequest copy$default(RecentAddressListRequest recentAddressListRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentAddressListRequest.currencyCode;
        }
        return recentAddressListRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final RecentAddressListRequest copy(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new RecentAddressListRequest(currencyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecentAddressListRequest) && Intrinsics.areEqual(this.currencyCode, ((RecentAddressListRequest) other).currencyCode);
    }

    public int hashCode() {
        return this.currencyCode.hashCode();
    }

    public String toString() {
        return "RecentAddressListRequest(currencyCode=" + this.currencyCode + ")";
    }

    public RecentAddressListRequest(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.currencyCode = currencyCode;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }
}
