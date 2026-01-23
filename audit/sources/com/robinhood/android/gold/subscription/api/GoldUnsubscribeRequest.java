package com.robinhood.android.gold.subscription.api;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiModels.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/api/GoldUnsubscribeRequest;", "", "subscriptionId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getSubscriptionId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GoldUnsubscribeRequest {
    private final UUID subscriptionId;

    public static /* synthetic */ GoldUnsubscribeRequest copy$default(GoldUnsubscribeRequest goldUnsubscribeRequest, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = goldUnsubscribeRequest.subscriptionId;
        }
        return goldUnsubscribeRequest.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSubscriptionId() {
        return this.subscriptionId;
    }

    public final GoldUnsubscribeRequest copy(@Json(name = "subscription_id") UUID subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        return new GoldUnsubscribeRequest(subscriptionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GoldUnsubscribeRequest) && Intrinsics.areEqual(this.subscriptionId, ((GoldUnsubscribeRequest) other).subscriptionId);
    }

    public int hashCode() {
        return this.subscriptionId.hashCode();
    }

    public String toString() {
        return "GoldUnsubscribeRequest(subscriptionId=" + this.subscriptionId + ")";
    }

    public GoldUnsubscribeRequest(@Json(name = "subscription_id") UUID subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.subscriptionId = subscriptionId;
    }

    public final UUID getSubscriptionId() {
        return this.subscriptionId;
    }
}
