package com.twilio.twilsock.client;

import com.singular.sdk.internal.Constants;
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

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/twilio/twilsock/client/ClientMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/twilio/twilsock/client/ClientMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes12.dex */
public final class ClientMetadata$$serializer implements PluginHelperInterfaces<ClientMetadata> {
    public static final ClientMetadata$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ClientMetadata$$serializer clientMetadata$$serializer = new ClientMetadata$$serializer();
        INSTANCE = clientMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.twilio.twilsock.client.ClientMetadata", clientMetadata$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("env", true);
        pluginGeneratedSerialDescriptor.addElement("envv", true);
        pluginGeneratedSerialDescriptor.addElement("os", true);
        pluginGeneratedSerialDescriptor.addElement("osv", true);
        pluginGeneratedSerialDescriptor.addElement("osa", true);
        pluginGeneratedSerialDescriptor.addElement("dev", true);
        pluginGeneratedSerialDescriptor.addElement("devv", true);
        pluginGeneratedSerialDescriptor.addElement("devt", true);
        pluginGeneratedSerialDescriptor.addElement("app", true);
        pluginGeneratedSerialDescriptor.addElement("appv", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement(Constants.RequestParamsKeys.SDK_VERSION_KEY, true);
        pluginGeneratedSerialDescriptor.addElement("sdkv", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ClientMetadata$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public ClientMetadata deserialize(Decoding2 decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i;
        String str14;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        if (decodingBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str15 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            String str16 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            String str17 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            String str18 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            String str19 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            String str20 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            String str21 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            String str22 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            String str23 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            String str24 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            String str25 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            String str26 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            str13 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 12, stringSerializer, null);
            i = 8191;
            str3 = str25;
            str8 = str24;
            str5 = str22;
            str6 = str21;
            str9 = str20;
            str10 = str18;
            str4 = str23;
            str7 = str19;
            str11 = str17;
            str12 = str16;
            str = str15;
            str2 = str26;
        } else {
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            boolean z = true;
            String str38 = null;
            int i2 = 0;
            String str39 = null;
            while (z) {
                String str40 = str27;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        str27 = str40;
                        z = false;
                        str28 = str28;
                        i2 = i2;
                        continue;
                    case 0:
                        str27 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, str40);
                        i2 |= 1;
                        str28 = str28;
                        continue;
                    case 1:
                        str39 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str39);
                        i2 |= 2;
                        str27 = str40;
                        continue;
                    case 2:
                        str14 = str39;
                        str38 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str38);
                        i2 |= 4;
                        break;
                    case 3:
                        str14 = str39;
                        str37 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str37);
                        i2 |= 8;
                        break;
                    case 4:
                        str14 = str39;
                        str34 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str34);
                        i2 |= 16;
                        break;
                    case 5:
                        str14 = str39;
                        str36 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str36);
                        i2 |= 32;
                        break;
                    case 6:
                        str14 = str39;
                        str33 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, str33);
                        i2 |= 64;
                        break;
                    case 7:
                        str14 = str39;
                        str32 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, str32);
                        i2 |= 128;
                        break;
                    case 8:
                        str14 = str39;
                        str31 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, str31);
                        i2 |= 256;
                        break;
                    case 9:
                        str14 = str39;
                        str35 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, str35);
                        i2 |= 512;
                        break;
                    case 10:
                        str14 = str39;
                        str30 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, str30);
                        i2 |= 1024;
                        break;
                    case 11:
                        str14 = str39;
                        str29 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, str29);
                        i2 |= 2048;
                        break;
                    case 12:
                        str14 = str39;
                        str28 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, str28);
                        i2 |= 4096;
                        break;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
                str27 = str40;
                str39 = str14;
            }
            str = str27;
            str2 = str29;
            str3 = str30;
            str4 = str31;
            str5 = str32;
            str6 = str33;
            str7 = str34;
            str8 = str35;
            str9 = str36;
            str10 = str37;
            str11 = str38;
            str12 = str39;
            str13 = str28;
            i = i2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new ClientMetadata(i, str, str12, str11, str10, str7, str9, str6, str5, str4, str8, str3, str2, str13, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, ClientMetadata value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        ClientMetadata.write$Self$twilsock_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
