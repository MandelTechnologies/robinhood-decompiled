package com.robinhood.idl;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Response.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/idl/Response;", "T", "", WebsocketGatewayConstants.DATA_KEY, "metadata", "", "", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/util/Map;)Lcom/robinhood/idl/Response;", "equals", "", "other", "hashCode", "", "toString", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Response<T> {
    private final T data;
    private final Map<String, String> metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, Object obj, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = response.data;
        }
        if ((i & 2) != 0) {
            map = response.metadata;
        }
        return response.copy(obj, map);
    }

    public final T component1() {
        return this.data;
    }

    public final Map<String, String> component2() {
        return this.metadata;
    }

    public final Response<T> copy(T data, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new Response<>(data, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return Intrinsics.areEqual(this.data, response.data) && Intrinsics.areEqual(this.metadata, response.metadata);
    }

    public int hashCode() {
        T t = this.data;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "Response(data=" + this.data + ", metadata=" + this.metadata + ")";
    }

    public Response(T t, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.data = t;
        this.metadata = metadata;
    }

    public final T getData() {
        return this.data;
    }

    public /* synthetic */ Response(Object obj, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }
}
