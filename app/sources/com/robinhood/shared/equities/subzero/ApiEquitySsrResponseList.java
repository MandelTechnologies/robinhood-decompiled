package com.robinhood.shared.equities.subzero;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiEquitySsr.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ApiEquitySsrResponseList;", "", WebsocketGatewayConstants.DATA_KEY, "", "Lcom/robinhood/shared/equities/subzero/ApiEquitySsr;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ApiEquitySsrResponseList {
    private final List<ApiEquitySsr> data;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiEquitySsrResponseList copy$default(ApiEquitySsrResponseList apiEquitySsrResponseList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = apiEquitySsrResponseList.data;
        }
        return apiEquitySsrResponseList.copy(list);
    }

    public final List<ApiEquitySsr> component1() {
        return this.data;
    }

    public final ApiEquitySsrResponseList copy(List<ApiEquitySsr> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new ApiEquitySsrResponseList(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiEquitySsrResponseList) && Intrinsics.areEqual(this.data, ((ApiEquitySsrResponseList) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "ApiEquitySsrResponseList(data=" + this.data + ")";
    }

    public ApiEquitySsrResponseList(List<ApiEquitySsr> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final List<ApiEquitySsr> getData() {
        return this.data;
    }
}
