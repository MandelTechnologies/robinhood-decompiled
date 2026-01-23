package com.robinhood.shared.equities.subzero;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiEquitySsr.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ApiEquitySsr;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/equities/subzero/ApiEquitySsrData;", "<init>", "(Lcom/robinhood/shared/equities/subzero/ApiEquitySsrData;)V", "getData", "()Lcom/robinhood/shared/equities/subzero/ApiEquitySsrData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ApiEquitySsr {
    private final ApiEquitySsrData data;

    public static /* synthetic */ ApiEquitySsr copy$default(ApiEquitySsr apiEquitySsr, ApiEquitySsrData apiEquitySsrData, int i, Object obj) {
        if ((i & 1) != 0) {
            apiEquitySsrData = apiEquitySsr.data;
        }
        return apiEquitySsr.copy(apiEquitySsrData);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiEquitySsrData getData() {
        return this.data;
    }

    public final ApiEquitySsr copy(ApiEquitySsrData data) {
        return new ApiEquitySsr(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiEquitySsr) && Intrinsics.areEqual(this.data, ((ApiEquitySsr) other).data);
    }

    public int hashCode() {
        ApiEquitySsrData apiEquitySsrData = this.data;
        if (apiEquitySsrData == null) {
            return 0;
        }
        return apiEquitySsrData.hashCode();
    }

    public String toString() {
        return "ApiEquitySsr(data=" + this.data + ")";
    }

    public ApiEquitySsr(ApiEquitySsrData apiEquitySsrData) {
        this.data = apiEquitySsrData;
    }

    public final ApiEquitySsrData getData() {
        return this.data;
    }
}
