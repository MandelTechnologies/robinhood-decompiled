package com.robinhood.referral.singular;

import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributionRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/referral/singular/AttributionRequest;", "", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "", SingularAttributionManager.PRODUCT_PARAM_KEY, "campaign", "metadata", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getDeviceId", "()Ljava/lang/String;", "getProduct", "getCampaign", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AttributionRequest {
    private final String campaign;
    private final String deviceId;
    private final Map<String, String> metadata;
    private final String product;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttributionRequest copy$default(AttributionRequest attributionRequest, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attributionRequest.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = attributionRequest.product;
        }
        if ((i & 4) != 0) {
            str3 = attributionRequest.campaign;
        }
        if ((i & 8) != 0) {
            map = attributionRequest.metadata;
        }
        return attributionRequest.copy(str, str2, str3, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCampaign() {
        return this.campaign;
    }

    public final Map<String, String> component4() {
        return this.metadata;
    }

    public final AttributionRequest copy(@Json(name = "device_id") String deviceId, @Json(name = SingularAttributionManager.PRODUCT_PARAM_KEY) String product, @Json(name = "campaign") String campaign, @Json(name = "query_params") Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(product, "product");
        return new AttributionRequest(deviceId, product, campaign, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributionRequest)) {
            return false;
        }
        AttributionRequest attributionRequest = (AttributionRequest) other;
        return Intrinsics.areEqual(this.deviceId, attributionRequest.deviceId) && Intrinsics.areEqual(this.product, attributionRequest.product) && Intrinsics.areEqual(this.campaign, attributionRequest.campaign) && Intrinsics.areEqual(this.metadata, attributionRequest.metadata);
    }

    public int hashCode() {
        int iHashCode = ((this.deviceId.hashCode() * 31) + this.product.hashCode()) * 31;
        String str = this.campaign;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "AttributionRequest(deviceId=" + this.deviceId + ", product=" + this.product + ", campaign=" + this.campaign + ", metadata=" + this.metadata + ")";
    }

    public AttributionRequest(@Json(name = "device_id") String deviceId, @Json(name = SingularAttributionManager.PRODUCT_PARAM_KEY) String product, @Json(name = "campaign") String str, @Json(name = "query_params") Map<String, String> map) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.deviceId = deviceId;
        this.product = product;
        this.campaign = str;
        this.metadata = map;
    }

    public /* synthetic */ AttributionRequest(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : map);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getCampaign() {
        return this.campaign;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }
}
