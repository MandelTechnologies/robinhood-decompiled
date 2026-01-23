package com.robinhood.shared.equities.subzero;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiFundamentalsShort.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortResponseList;", "", "status", "", WebsocketGatewayConstants.DATA_KEY, "", "Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShort;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getStatus", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ApiFundamentalsShortResponseList {
    private final List<ApiFundamentalsShort> data;
    private final String status;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiFundamentalsShortResponseList copy$default(ApiFundamentalsShortResponseList apiFundamentalsShortResponseList, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiFundamentalsShortResponseList.status;
        }
        if ((i & 2) != 0) {
            list = apiFundamentalsShortResponseList.data;
        }
        return apiFundamentalsShortResponseList.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final List<ApiFundamentalsShort> component2() {
        return this.data;
    }

    public final ApiFundamentalsShortResponseList copy(String status, List<ApiFundamentalsShort> data) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(data, "data");
        return new ApiFundamentalsShortResponseList(status, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiFundamentalsShortResponseList)) {
            return false;
        }
        ApiFundamentalsShortResponseList apiFundamentalsShortResponseList = (ApiFundamentalsShortResponseList) other;
        return Intrinsics.areEqual(this.status, apiFundamentalsShortResponseList.status) && Intrinsics.areEqual(this.data, apiFundamentalsShortResponseList.data);
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "ApiFundamentalsShortResponseList(status=" + this.status + ", data=" + this.data + ")";
    }

    public ApiFundamentalsShortResponseList(String status, List<ApiFundamentalsShort> data) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(data, "data");
        this.status = status;
        this.data = data;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<ApiFundamentalsShort> getData() {
        return this.data;
    }
}
