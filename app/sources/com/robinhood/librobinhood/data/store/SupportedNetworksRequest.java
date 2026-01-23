package com.robinhood.librobinhood.data.store;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SupportedNetworksRequest;", "", "currencyCode", "", PlaceTypes.ADDRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyCode", "()Ljava/lang/String;", "getAddress", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class SupportedNetworksRequest {
    private final String address;
    private final String currencyCode;

    public static /* synthetic */ SupportedNetworksRequest copy$default(SupportedNetworksRequest supportedNetworksRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportedNetworksRequest.currencyCode;
        }
        if ((i & 2) != 0) {
            str2 = supportedNetworksRequest.address;
        }
        return supportedNetworksRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final SupportedNetworksRequest copy(String currencyCode, String address) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new SupportedNetworksRequest(currencyCode, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedNetworksRequest)) {
            return false;
        }
        SupportedNetworksRequest supportedNetworksRequest = (SupportedNetworksRequest) other;
        return Intrinsics.areEqual(this.currencyCode, supportedNetworksRequest.currencyCode) && Intrinsics.areEqual(this.address, supportedNetworksRequest.address);
    }

    public int hashCode() {
        int iHashCode = this.currencyCode.hashCode() * 31;
        String str = this.address;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SupportedNetworksRequest(currencyCode=" + this.currencyCode + ", address=" + this.address + ")";
    }

    public SupportedNetworksRequest(String currencyCode, String str) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.currencyCode = currencyCode;
        this.address = str;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getAddress() {
        return this.address;
    }
}
