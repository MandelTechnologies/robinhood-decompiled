package com.salesforce.android.smi.network.internal.dto.response.remoteconfig;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FallbackMessageConfiguration.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/FallbackMessageConfiguration;", "", "isEnabled", "", "content", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getContent", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FallbackMessageConfiguration {
    private final String content;
    private final boolean isEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public FallbackMessageConfiguration() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FallbackMessageConfiguration copy$default(FallbackMessageConfiguration fallbackMessageConfiguration, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fallbackMessageConfiguration.isEnabled;
        }
        if ((i & 2) != 0) {
            str = fallbackMessageConfiguration.content;
        }
        return fallbackMessageConfiguration.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final FallbackMessageConfiguration copy(@Json(name = "isFallbackMessageEnabled") boolean isEnabled, @Json(name = "fallbackMessageContent") String content) {
        return new FallbackMessageConfiguration(isEnabled, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallbackMessageConfiguration)) {
            return false;
        }
        FallbackMessageConfiguration fallbackMessageConfiguration = (FallbackMessageConfiguration) other;
        return this.isEnabled == fallbackMessageConfiguration.isEnabled && Intrinsics.areEqual(this.content, fallbackMessageConfiguration.content);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEnabled) * 31;
        String str = this.content;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FallbackMessageConfiguration(isEnabled=" + this.isEnabled + ", content=" + this.content + ")";
    }

    public FallbackMessageConfiguration(@Json(name = "isFallbackMessageEnabled") boolean z, @Json(name = "fallbackMessageContent") String str) {
        this.isEnabled = z;
        this.content = str;
    }

    public /* synthetic */ FallbackMessageConfiguration(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final String getContent() {
        return this.content;
    }
}
