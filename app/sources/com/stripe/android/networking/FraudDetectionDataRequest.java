package com.stripe.android.networking;

import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.networking.NetworkConstants2;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: FraudDetectionDataRequest.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b'\u0010(R0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010(\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, m3636d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "", "", "", "params", "guid", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "Ljava/io/OutputStream;", "outputStream", "", "writePostBody", "(Ljava/io/OutputStream;)V", "Ljava/util/Map;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;", "headersFactory", "Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "", "", "retryResponseCodes", "Ljava/lang/Iterable;", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "headers", "getHeaders", "()Ljava/util/Map;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "getJsonBody", "jsonBody", "", "getPostBodyBytes", "()[B", "postBodyBytes", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class FraudDetectionDataRequest extends StripeRequest {
    private final Map<String, String> headers;
    private final RequestHeadersFactory.FraudDetection headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Map<String, Object> params;
    private Map<String, String> postHeaders;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public FraudDetectionDataRequest(Map<String, ? extends Object> params, String guid) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(guid, "guid");
        this.params = params;
        RequestHeadersFactory.FraudDetection fraudDetection = new RequestHeadersFactory.FraudDetection(guid);
        this.headersFactory = fraudDetection;
        this.method = StripeRequest.Method.POST;
        this.mimeType = StripeRequest.MimeType.Json;
        this.retryResponseCodes = NetworkConstants2.getDEFAULT_RETRY_CODES();
        this.url = "https://m.stripe.com/6";
        this.headers = fraudDetection.create();
        this.postHeaders = fraudDetection.createPostHeader();
    }

    private final String getJsonBody() {
        return String.valueOf(StripeJsonUtils.INSTANCE.mapToJsonObject(this.params));
    }

    private final byte[] getPostBodyBytes() throws InvalidRequestException {
        try {
            byte[] bytes = getJsonBody().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            throw new InvalidRequestException(null, null, 0, "Unable to encode parameters to " + Charsets.UTF_8.name() + ". Please contact support@stripe.com for assistance.", e, 7, null);
        }
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        return this.url;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        outputStream.write(getPostBodyBytes());
        outputStream.flush();
    }

    /* compiled from: FraudDetectionDataRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequest$Companion;", "", "()V", "URL", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
