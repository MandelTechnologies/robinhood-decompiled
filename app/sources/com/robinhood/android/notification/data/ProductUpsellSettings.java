package com.robinhood.android.notification.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p479j$.time.Duration;

/* compiled from: ProductUpsellSettings.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellSettings;", "", "lastSeenAt", "", "seenCount", "", "allowedIntervalBetweenPrompts", "<init>", "(JIJ)V", "getLastSeenAt", "()J", "setLastSeenAt", "(J)V", "getSeenCount", "()I", "setSeenCount", "(I)V", "getAllowedIntervalBetweenPrompts", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-lib-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProductUpsellSettings {
    private final long allowedIntervalBetweenPrompts;
    private long lastSeenAt;
    private int seenCount;

    public ProductUpsellSettings() {
        this(0L, 0, 0L, 7, null);
    }

    public static /* synthetic */ ProductUpsellSettings copy$default(ProductUpsellSettings productUpsellSettings, long j, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = productUpsellSettings.lastSeenAt;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            i = productUpsellSettings.seenCount;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j2 = productUpsellSettings.allowedIntervalBetweenPrompts;
        }
        return productUpsellSettings.copy(j3, i3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getLastSeenAt() {
        return this.lastSeenAt;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeenCount() {
        return this.seenCount;
    }

    /* renamed from: component3, reason: from getter */
    public final long getAllowedIntervalBetweenPrompts() {
        return this.allowedIntervalBetweenPrompts;
    }

    public final ProductUpsellSettings copy(@Json(name = "last_seen_at") long lastSeenAt, @Json(name = "seen_count") int seenCount, @Json(name = "allowed_interval_between_prompts") long allowedIntervalBetweenPrompts) {
        return new ProductUpsellSettings(lastSeenAt, seenCount, allowedIntervalBetweenPrompts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductUpsellSettings)) {
            return false;
        }
        ProductUpsellSettings productUpsellSettings = (ProductUpsellSettings) other;
        return this.lastSeenAt == productUpsellSettings.lastSeenAt && this.seenCount == productUpsellSettings.seenCount && this.allowedIntervalBetweenPrompts == productUpsellSettings.allowedIntervalBetweenPrompts;
    }

    public int hashCode() {
        return (((Long.hashCode(this.lastSeenAt) * 31) + Integer.hashCode(this.seenCount)) * 31) + Long.hashCode(this.allowedIntervalBetweenPrompts);
    }

    public String toString() {
        return "ProductUpsellSettings(lastSeenAt=" + this.lastSeenAt + ", seenCount=" + this.seenCount + ", allowedIntervalBetweenPrompts=" + this.allowedIntervalBetweenPrompts + ")";
    }

    public ProductUpsellSettings(@Json(name = "last_seen_at") long j, @Json(name = "seen_count") int i, @Json(name = "allowed_interval_between_prompts") long j2) {
        this.lastSeenAt = j;
        this.seenCount = i;
        this.allowedIntervalBetweenPrompts = j2;
    }

    public final long getLastSeenAt() {
        return this.lastSeenAt;
    }

    public final void setLastSeenAt(long j) {
        this.lastSeenAt = j;
    }

    public final int getSeenCount() {
        return this.seenCount;
    }

    public final void setSeenCount(int i) {
        this.seenCount = i;
    }

    public final long getAllowedIntervalBetweenPrompts() {
        return this.allowedIntervalBetweenPrompts;
    }

    public /* synthetic */ ProductUpsellSettings(long j, int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? Duration.ofDays(5L).toMillis() : j2);
    }
}
