package com.robinhood.idl.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.json.JsonDecoder;

/* compiled from: UnsignedIntAsStringSerializer.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/idl/serialization/UnsignedIntAsStringSerializer;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "power32", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Integer;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class UnsignedIntAsStringSerializer implements KSerializer<Integer> {
    public static final UnsignedIntAsStringSerializer INSTANCE = new UnsignedIntAsStringSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("UnsignedAsString[kotlin.Int]", SerialKinds2.STRING.INSTANCE);
    private static final long power32 = 4294967296L;

    private UnsignedIntAsStringSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer3
    public /* bridge */ /* synthetic */ void serialize(Encoding4 encoding4, Object obj) {
        serialize(encoding4, ((Number) obj).intValue());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoding4 encoder, int value) {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (value < 0) {
            objValueOf = Long.valueOf(value + power32);
        } else {
            objValueOf = Integer.valueOf(value);
        }
        encoder.encodeString(objValueOf.toString());
    }

    @Override // kotlinx.serialization.KSerializer2
    public Integer deserialize(Decoding2 decoder) throws NumberFormatException {
        long j;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder instanceof JsonDecoder) {
            String content = JsonSerializerHelpers.decodeJsonPrimitive(JsonSerializerHelpers.asJsonDecoder(decoder)).getContent();
            try {
                j = Long.parseLong(content);
            } catch (ArithmeticException e) {
                throw new SerializationExceptions2("Decode failed: " + content, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new SerializationExceptions2("Decode failed: " + content, e2);
            } catch (NumberFormatException e3) {
                throw new SerializationExceptions2("Decode failed: " + content, e3);
            }
        } else {
            String strDecodeString = decoder.decodeString();
            try {
                j = Long.parseLong(strDecodeString);
            } catch (ArithmeticException e4) {
                throw new SerializationExceptions2("Decode failed: " + strDecodeString, e4);
            } catch (IndexOutOfBoundsException e5) {
                throw new SerializationExceptions2("Decode failed: " + strDecodeString, e5);
            } catch (NumberFormatException e6) {
                throw new SerializationExceptions2("Decode failed: " + strDecodeString, e6);
            }
        }
        return Integer.valueOf((int) j);
    }
}
