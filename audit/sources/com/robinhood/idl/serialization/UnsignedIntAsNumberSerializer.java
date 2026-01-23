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

/* compiled from: UnsignedIntAsNumberSerializer.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/idl/serialization/UnsignedIntAsNumberSerializer;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "power32", "", "maxInt", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Integer;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class UnsignedIntAsNumberSerializer implements KSerializer<Integer> {
    public static final UnsignedIntAsNumberSerializer INSTANCE = new UnsignedIntAsNumberSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("UnsignedAsNumber[kotlin.Int]", SerialKinds2.STRING.INSTANCE);
    private static final long maxInt = 2147483647L;
    private static final long power32 = 4294967296L;

    private UnsignedIntAsNumberSerializer() {
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
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeLong(value < 0 ? value + power32 : value);
    }

    @Override // kotlinx.serialization.KSerializer2
    public Integer deserialize(Decoding2 decoder) throws NumberFormatException {
        double d;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder instanceof JsonDecoder) {
            String content = JsonSerializerHelpers.decodeJsonPrimitive(JsonSerializerHelpers.asJsonDecoder(decoder)).getContent();
            try {
                d = Double.parseDouble(content);
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
                d = Double.parseDouble(strDecodeString);
            } catch (ArithmeticException e4) {
                throw new SerializationExceptions2("Decode failed: " + strDecodeString, e4);
            } catch (IndexOutOfBoundsException e5) {
                throw new SerializationExceptions2("Decode failed: " + strDecodeString, e5);
            } catch (NumberFormatException e6) {
                throw new SerializationExceptions2("Decode failed: " + strDecodeString, e6);
            }
        }
        long j = (long) d;
        if (j >= maxInt) {
            j -= power32;
        }
        return Integer.valueOf((int) j);
    }
}
