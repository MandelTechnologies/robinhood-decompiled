package com.twilio.twilsock.client;

import java.util.List;
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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/twilio/twilsock/client/InitMessageHeaders.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/twilio/twilsock/client/InitMessageHeaders;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes12.dex */
public final class InitMessageHeaders$$serializer implements PluginHelperInterfaces<InitMessageHeaders> {
    public static final InitMessageHeaders$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        InitMessageHeaders$$serializer initMessageHeaders$$serializer = new InitMessageHeaders$$serializer();
        INSTANCE = initMessageHeaders$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.twilio.twilsock.client.InitMessageHeaders", initMessageHeaders$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("capabilities", false);
        pluginGeneratedSerialDescriptor.addElement("token", false);
        pluginGeneratedSerialDescriptor.addElement("continuation_token", true);
        pluginGeneratedSerialDescriptor.addElement("registrations", true);
        pluginGeneratedSerialDescriptor.addElement("tweaks", true);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InitMessageHeaders$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InitMessageHeaders.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[0];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializer, stringSerializer, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(kSerializerArr[3]), BuiltinSerializers.getNullable(JsonElementSerializers6.INSTANCE), BuiltinSerializers.getNullable(ClientMetadata$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public InitMessageHeaders deserialize(Decoding2 decoder) {
        int i;
        List list;
        String str;
        String str2;
        List list2;
        JsonElement6 jsonElement6;
        ClientMetadata clientMetadata;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = InitMessageHeaders.$childSerializers;
        int i2 = 5;
        int i3 = 0;
        List list3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            List list4 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            List list5 = (List) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            JsonElement6 jsonElement62 = (JsonElement6) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, JsonElementSerializers6.INSTANCE, null);
            list2 = list5;
            list = list4;
            clientMetadata = (ClientMetadata) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ClientMetadata$$serializer.INSTANCE, null);
            jsonElement6 = jsonElement62;
            str2 = str3;
            i = 63;
            str = strDecodeStringElement;
        } else {
            int i4 = 1;
            int i5 = 0;
            String strDecodeStringElement2 = null;
            String str4 = null;
            List list6 = null;
            JsonElement6 jsonElement63 = null;
            ClientMetadata clientMetadata2 = null;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 5;
                    case 0:
                        list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], list3);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 5;
                    case 1:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i5 |= 2;
                        i3 = i6;
                    case 2:
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str4);
                        i5 |= 4;
                        i3 = i6;
                    case 3:
                        list6 = (List) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], list6);
                        i5 |= 8;
                        i3 = i6;
                    case 4:
                        jsonElement63 = (JsonElement6) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, JsonElementSerializers6.INSTANCE, jsonElement63);
                        i5 |= 16;
                        i3 = i6;
                    case 5:
                        clientMetadata2 = (ClientMetadata) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, ClientMetadata$$serializer.INSTANCE, clientMetadata2);
                        i5 |= 32;
                        i3 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            list = list3;
            str = strDecodeStringElement2;
            str2 = str4;
            list2 = list6;
            jsonElement6 = jsonElement63;
            clientMetadata = clientMetadata2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new InitMessageHeaders(i, list, str, str2, list2, jsonElement6, clientMetadata, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, InitMessageHeaders value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        InitMessageHeaders.write$Self$twilsock_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
