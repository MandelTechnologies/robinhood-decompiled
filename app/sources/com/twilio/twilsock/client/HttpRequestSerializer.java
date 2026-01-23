package com.twilio.twilsock.client;

import com.twilio.twilsock.util.HttpRequest;
import com.twilio.twilsock.util.MultiMap2;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLBuilder2;
import io.ktor.http.URLUtils2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/twilio/twilsock/client/HttpRequestSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/util/HttpRequest;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final class HttpRequestSerializer implements KSerializer<HttpRequest> {
    public static final HttpRequestSerializer INSTANCE = new HttpRequestSerializer();
    private static final SerialDescriptor descriptor = HttpRequestSurrogate.INSTANCE.serializer().getDescriptor();

    private HttpRequestSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, HttpRequest value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        URLBuilder URLBuilder = URLUtils2.URLBuilder(value.getUrl());
        encoder.encodeSerializableValue(HttpRequestSurrogate.INSTANCE.serializer(), new HttpRequestSurrogate(URLBuilder.getHost(), URLBuilder2.getEncodedPath(URLBuilder), value.getMethod(), MultiMap2.toMultiMap(URLBuilder.getEncodedParameters()), value.getHeaders()));
    }

    @Override // kotlinx.serialization.KSerializer2
    public HttpRequest deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new IllegalStateException("never used");
    }
}
