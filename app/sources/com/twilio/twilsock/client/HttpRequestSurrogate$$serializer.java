package com.twilio.twilsock.client;

import com.twilio.twilsock.util.MultiMap;
import com.twilio.twilsock.util.http2;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/twilio/twilsock/client/HttpRequestSurrogate.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/twilio/twilsock/client/HttpRequestSurrogate;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes12.dex */
public final class HttpRequestSurrogate$$serializer implements PluginHelperInterfaces<HttpRequestSurrogate> {
    public static final HttpRequestSurrogate$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        HttpRequestSurrogate$$serializer httpRequestSurrogate$$serializer = new HttpRequestSurrogate$$serializer();
        INSTANCE = httpRequestSurrogate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.twilio.twilsock.client.HttpRequestSurrogate", httpRequestSurrogate$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("host", false);
        pluginGeneratedSerialDescriptor.addElement("path", false);
        pluginGeneratedSerialDescriptor.addElement("method", false);
        pluginGeneratedSerialDescriptor.addElement("params", false);
        pluginGeneratedSerialDescriptor.addElement("headers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HttpRequestSurrogate$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = HttpRequestSurrogate.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[2];
        KSerializer<?> kSerializer2 = kSerializerArr[3];
        KSerializer<?> kSerializer3 = kSerializerArr[4];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializer, kSerializer2, kSerializer3};
    }

    @Override // kotlinx.serialization.KSerializer2
    public HttpRequestSurrogate deserialize(Decoding2 decoder) {
        int i;
        String str;
        String str2;
        http2 http2Var;
        MultiMap multiMap;
        MultiMap multiMap2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = HttpRequestSurrogate.$childSerializers;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            http2 http2Var2 = (http2) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            MultiMap multiMap3 = (MultiMap) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            multiMap2 = (MultiMap) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            str = strDecodeStringElement2;
            multiMap = multiMap3;
            i = 31;
            http2Var = http2Var2;
            str2 = strDecodeStringElement3;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement4 = null;
            http2 http2Var3 = null;
            MultiMap multiMap4 = null;
            MultiMap multiMap5 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    http2Var3 = (http2) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], http2Var3);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    multiMap4 = (MultiMap) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], multiMap4);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    multiMap5 = (MultiMap) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], multiMap5);
                    i2 |= 16;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            http2Var = http2Var3;
            multiMap = multiMap4;
            multiMap2 = multiMap5;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new HttpRequestSurrogate(i, str, str2, http2Var, multiMap, multiMap2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, HttpRequestSurrogate value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        HttpRequestSurrogate.write$Self$twilsock_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
