package com.salesforce.android.smi.remote.internal.dto.request;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

/* compiled from: RevokeTokenRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/RevokeTokenRequest;", "", "<init>", "()V", "deregisterDevice", "", "getDeregisterDevice", "()Z", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RevokeTokenRequest {
    private final boolean deregisterDevice;

    public final boolean getDeregisterDevice() {
        return this.deregisterDevice;
    }
}
