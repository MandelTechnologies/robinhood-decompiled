package com.stripe.android.core.networking;

import com.robinhood.android.car.result.CarResultComposable2;
import com.stripe.android.core.networking.RequestId;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: StripeResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001)B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u0017\u0010#\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010!R\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeResponse;", "ResponseBody", "", "", "code", CarResultComposable2.BODY, "", "", "", "headers", "<init>", "(ILjava/lang/Object;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "key", "getHeaderValue", "(Ljava/lang/String;)Ljava/util/List;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "Ljava/lang/Object;", "getBody", "()Ljava/lang/Object;", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "isOk", "Z", "()Z", "isError", "isRateLimited", "Lcom/stripe/android/core/networking/RequestId;", "requestId", "Lcom/stripe/android/core/networking/RequestId;", "getRequestId", "()Lcom/stripe/android/core/networking/RequestId;", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class StripeResponse<ResponseBody> {
    private final ResponseBody body;
    private final int code;
    private final Map<String, List<String>> headers;
    private final boolean isError;
    private final boolean isOk;
    private final boolean isRateLimited;
    private final RequestId requestId;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeResponse)) {
            return false;
        }
        StripeResponse stripeResponse = (StripeResponse) other;
        return this.code == stripeResponse.code && Intrinsics.areEqual(this.body, stripeResponse.body) && Intrinsics.areEqual(this.headers, stripeResponse.headers);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        ResponseBody responsebody = this.body;
        return ((iHashCode + (responsebody == null ? 0 : responsebody.hashCode())) * 31) + this.headers.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StripeResponse(int i, ResponseBody responsebody, Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.code = i;
        this.body = responsebody;
        this.headers = headers;
        this.isOk = i == 200;
        this.isError = i < 200 || i >= 300;
        this.isRateLimited = i == 429;
        RequestId.Companion companion = RequestId.INSTANCE;
        List<String> headerValue = getHeaderValue("Request-Id");
        this.requestId = companion.fromString(headerValue != null ? (String) CollectionsKt.firstOrNull((List) headerValue) : null);
    }

    public final int getCode() {
        return this.code;
    }

    public final ResponseBody getBody() {
        return this.body;
    }

    /* renamed from: isOk, reason: from getter */
    public final boolean getIsOk() {
        return this.isOk;
    }

    /* renamed from: isError, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public final RequestId getRequestId() {
        return this.requestId;
    }

    public String toString() {
        return "Request-Id: " + this.requestId + ", Status Code: " + this.code;
    }

    public final List<String> getHeaderValue(String key) {
        Object next;
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<T> it = this.headers.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.equals((String) ((Map.Entry) next).getKey(), key, true)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (List) entry.getValue();
        }
        return null;
    }
}
