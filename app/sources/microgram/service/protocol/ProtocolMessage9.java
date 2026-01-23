package microgram.service.protocol;

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
import microgram.MicrogramError;
import microgram.service.protocol.ProtocolMessage6;

/* compiled from: ProtocolMessage.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"microgram/service/protocol/Response.Termination.Error.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/service/protocol/Response$Termination$Error;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: microgram.service.protocol.Response$Termination$Error$$serializer, reason: use source file name */
/* loaded from: classes14.dex */
public /* synthetic */ class ProtocolMessage9 implements PluginHelperInterfaces<ProtocolMessage6.Termination.Error> {
    public static final ProtocolMessage9 INSTANCE;
    private static final SerialDescriptor descriptor;

    private ProtocolMessage9() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ProtocolMessage9 protocolMessage9 = new ProtocolMessage9();
        INSTANCE = protocolMessage9;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.service.protocol.Response.Termination.Error", protocolMessage9, 2);
        pluginGeneratedSerialDescriptor.addElement("code", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MicrogramError.CodeSerializer.INSTANCE, StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final ProtocolMessage6.Termination.Error deserialize(Decoding2 decoder) {
        MicrogramError microgramError;
        String strDecodeStringElement;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        if (decodingBeginStructure.decodeSequentially()) {
            microgramError = (MicrogramError) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, MicrogramError.CodeSerializer.INSTANCE, null);
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            microgramError = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    microgramError = (MicrogramError) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, MicrogramError.CodeSerializer.INSTANCE, microgramError);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                }
            }
            strDecodeStringElement = strDecodeStringElement2;
            i = i2;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new ProtocolMessage6.Termination.Error(i, microgramError, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, ProtocolMessage6.Termination.Error value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        ProtocolMessage6.Termination.Error.write$Self$microgram_service(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
