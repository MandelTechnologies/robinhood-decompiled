package com.twilio.twilsock.client;

import com.robinhood.referral.SingularAttributionManager;
import java.util.Set;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/twilio/twilsock/client/InitRegistration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/twilio/twilsock/client/InitRegistration;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes12.dex */
public final class InitRegistration$$serializer implements PluginHelperInterfaces<InitRegistration> {
    public static final InitRegistration$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        InitRegistration$$serializer initRegistration$$serializer = new InitRegistration$$serializer();
        INSTANCE = initRegistration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.twilio.twilsock.client.InitRegistration", initRegistration$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(SingularAttributionManager.PRODUCT_PARAM_KEY, false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("notification_protocol_version", false);
        pluginGeneratedSerialDescriptor.addElement("message_types", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InitRegistration$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = InitRegistration.$childSerializers[3];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, IntSerializer.INSTANCE, kSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public InitRegistration deserialize(Decoding2 decoder) {
        int i;
        int i2;
        String str;
        String str2;
        Set set;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = InitRegistration.$childSerializers;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            int iDecodeIntElement = decodingBeginStructure.decodeIntElement(descriptor2, 2);
            set = (Set) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            str = strDecodeStringElement;
            i = iDecodeIntElement;
            i2 = 15;
            str2 = strDecodeStringElement2;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            Set set2 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = decodingBeginStructure.decodeIntElement(descriptor2, 2);
                    i3 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    set2 = (Set) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], set2);
                    i3 |= 8;
                }
            }
            i = iDecodeIntElement2;
            i2 = i3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            set = set2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new InitRegistration(i2, str, str2, i, set, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, InitRegistration value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        InitRegistration.write$Self$twilsock_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
