package com.twilio.twilsock.client;

import com.twilio.twilsock.util.HttpRequest;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/twilio/twilsock/client/UpstreamRequestMessageHeaders;", "", "seen1", "", "activeGrant", "", "httpRequest", "Lcom/twilio/twilsock/util/HttpRequest;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/twilio/twilsock/util/HttpRequest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/twilio/twilsock/util/HttpRequest;)V", "getActiveGrant$annotations", "()V", "getActiveGrant", "()Ljava/lang/String;", "getHttpRequest$annotations", "getHttpRequest", "()Lcom/twilio/twilsock/util/HttpRequest;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class UpstreamRequestMessageHeaders {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String activeGrant;
    private final HttpRequest httpRequest;

    public static /* synthetic */ UpstreamRequestMessageHeaders copy$default(UpstreamRequestMessageHeaders upstreamRequestMessageHeaders, String str, HttpRequest httpRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upstreamRequestMessageHeaders.activeGrant;
        }
        if ((i & 2) != 0) {
            httpRequest = upstreamRequestMessageHeaders.httpRequest;
        }
        return upstreamRequestMessageHeaders.copy(str, httpRequest);
    }

    @SerialName("active_grant")
    public static /* synthetic */ void getActiveGrant$annotations() {
    }

    @SerialName("http_request")
    @Serializable(with = HttpRequestSerializer.class)
    public static /* synthetic */ void getHttpRequest$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getActiveGrant() {
        return this.activeGrant;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpRequest getHttpRequest() {
        return this.httpRequest;
    }

    public final UpstreamRequestMessageHeaders copy(String activeGrant, HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(activeGrant, "activeGrant");
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        return new UpstreamRequestMessageHeaders(activeGrant, httpRequest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamRequestMessageHeaders)) {
            return false;
        }
        UpstreamRequestMessageHeaders upstreamRequestMessageHeaders = (UpstreamRequestMessageHeaders) other;
        return Intrinsics.areEqual(this.activeGrant, upstreamRequestMessageHeaders.activeGrant) && Intrinsics.areEqual(this.httpRequest, upstreamRequestMessageHeaders.httpRequest);
    }

    public int hashCode() {
        return (this.activeGrant.hashCode() * 31) + this.httpRequest.hashCode();
    }

    public String toString() {
        return "UpstreamRequestMessageHeaders(activeGrant=" + this.activeGrant + ", httpRequest=" + this.httpRequest + ')';
    }

    /* compiled from: TwilsockProtocol.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/UpstreamRequestMessageHeaders$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/UpstreamRequestMessageHeaders;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UpstreamRequestMessageHeaders> serializer() {
            return UpstreamRequestMessageHeaders$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ UpstreamRequestMessageHeaders(int i, @SerialName("active_grant") String str, @SerialName("http_request") @Serializable(with = HttpRequestSerializer.class) HttpRequest httpRequest, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, UpstreamRequestMessageHeaders$$serializer.INSTANCE.getDescriptor());
        }
        this.activeGrant = str;
        this.httpRequest = httpRequest;
    }

    public UpstreamRequestMessageHeaders(String activeGrant, HttpRequest httpRequest) {
        Intrinsics.checkNotNullParameter(activeGrant, "activeGrant");
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        this.activeGrant = activeGrant;
        this.httpRequest = httpRequest;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$twilsock_release(UpstreamRequestMessageHeaders self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.activeGrant);
        output.encodeSerializableElement(serialDesc, 1, HttpRequestSerializer.INSTANCE, self.httpRequest);
    }

    public final String getActiveGrant() {
        return this.activeGrant;
    }

    public final HttpRequest getHttpRequest() {
        return this.httpRequest;
    }
}
