package com.twilio.twilsock.client;

import com.twilio.util.AccountDescriptor;
import com.twilio.util.AccountDescriptor2;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/twilio/twilsock/client/ServerReplyHeaders.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/twilio/twilsock/client/ServerReplyHeaders;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes12.dex */
public final class ServerReplyHeaders$$serializer implements PluginHelperInterfaces<ServerReplyHeaders> {
    public static final ServerReplyHeaders$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ServerReplyHeaders$$serializer serverReplyHeaders$$serializer = new ServerReplyHeaders$$serializer();
        INSTANCE = serverReplyHeaders$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.twilio.twilsock.client.ServerReplyHeaders", serverReplyHeaders$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("http_status", true);
        pluginGeneratedSerialDescriptor.addElement("continuation_token", true);
        pluginGeneratedSerialDescriptor.addElement("http_headers", true);
        pluginGeneratedSerialDescriptor.addElement("account_descriptor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ServerReplyHeaders$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> nullable = BuiltinSerializers.getNullable(AccountDescriptor2.INSTANCE);
        Status$$serializer status$$serializer = Status$$serializer.INSTANCE;
        return new KSerializer[]{status$$serializer, status$$serializer, StringSerializer.INSTANCE, JsonElementSerializers6.INSTANCE, nullable};
    }

    @Override // kotlinx.serialization.KSerializer2
    public ServerReplyHeaders deserialize(Decoding2 decoder) {
        int i;
        Status status;
        Status status2;
        String str;
        JsonElement6 jsonElement6;
        AccountDescriptor accountDescriptor;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        Status status3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            Status$$serializer status$$serializer = Status$$serializer.INSTANCE;
            Status status4 = (Status) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, status$$serializer, null);
            Status status5 = (Status) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, status$$serializer, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            status2 = status5;
            jsonElement6 = (JsonElement6) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, JsonElementSerializers6.INSTANCE, null);
            accountDescriptor = (AccountDescriptor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, AccountDescriptor2.INSTANCE, null);
            str = strDecodeStringElement;
            i = 31;
            status = status4;
        } else {
            boolean z = true;
            int i2 = 0;
            Status status6 = null;
            String strDecodeStringElement2 = null;
            JsonElement6 jsonElement62 = null;
            AccountDescriptor accountDescriptor2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    status3 = (Status) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, Status$$serializer.INSTANCE, status3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    status6 = (Status) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, Status$$serializer.INSTANCE, status6);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    jsonElement62 = (JsonElement6) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, JsonElementSerializers6.INSTANCE, jsonElement62);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    accountDescriptor2 = (AccountDescriptor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, AccountDescriptor2.INSTANCE, accountDescriptor2);
                    i2 |= 16;
                }
            }
            i = i2;
            status = status3;
            status2 = status6;
            str = strDecodeStringElement2;
            jsonElement6 = jsonElement62;
            accountDescriptor = accountDescriptor2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new ServerReplyHeaders(i, status, status2, str, jsonElement6, accountDescriptor, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, ServerReplyHeaders value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        ServerReplyHeaders.write$Self$twilsock_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
