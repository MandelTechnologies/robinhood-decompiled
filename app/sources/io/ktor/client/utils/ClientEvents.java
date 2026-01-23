package io.ktor.client.utils;

import io.ktor.client.request.HttpRequest2;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.Events3;
import kotlin.Metadata;

/* compiled from: ClientEvents.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, m3636d2 = {"HttpRequestCreated", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/request/HttpRequestBuilder;", "getHttpRequestCreated", "()Lio/ktor/events/EventDefinition;", "HttpRequestIsReadyForSending", "getHttpRequestIsReadyForSending", "HttpResponseCancelled", "Lio/ktor/client/statement/HttpResponse;", "getHttpResponseCancelled", "HttpResponseReceiveFailed", "Lio/ktor/client/utils/HttpResponseReceiveFail;", "getHttpResponseReceiveFailed", "HttpResponseReceived", "getHttpResponseReceived", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.utils.ClientEventsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ClientEvents {
    private static final Events3<HttpRequest2> HttpRequestCreated = new Events3<>();
    private static final Events3<HttpRequest2> HttpRequestIsReadyForSending = new Events3<>();
    private static final Events3<HttpResponse> HttpResponseReceived = new Events3<>();
    private static final Events3<ClientEvents2> HttpResponseReceiveFailed = new Events3<>();
    private static final Events3<HttpResponse> HttpResponseCancelled = new Events3<>();

    public static final Events3<HttpRequest2> getHttpRequestCreated() {
        return HttpRequestCreated;
    }

    public static final Events3<HttpRequest2> getHttpRequestIsReadyForSending() {
        return HttpRequestIsReadyForSending;
    }

    public static final Events3<HttpResponse> getHttpResponseReceived() {
        return HttpResponseReceived;
    }

    public static final Events3<ClientEvents2> getHttpResponseReceiveFailed() {
        return HttpResponseReceiveFailed;
    }

    public static final Events3<HttpResponse> getHttpResponseCancelled() {
        return HttpResponseCancelled;
    }
}
