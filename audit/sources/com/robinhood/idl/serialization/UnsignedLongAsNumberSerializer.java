package com.robinhood.idl.serialization;

import com.ionspin.kotlin.bignum.BigNumber;
import com.ionspin.kotlin.bignum.decimal.BigDecimalExtensions;
import com.ionspin.kotlin.bignum.decimal.DecimalMode;
import com.ionspin.kotlin.bignum.integer.BigInteger;
import com.ionspin.kotlin.bignum.integer.BigIntegerExtensions;
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
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonEncoder;

/* compiled from: UnsignedLongAsNumberSerializer.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/idl/serialization/UnsignedLongAsNumberSerializer;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "power64", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "maxLong", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "toLiteral", "", "value", "toLiteral$core", "fromLiteral", "fromLiteral$core", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Long;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class UnsignedLongAsNumberSerializer implements KSerializer<Long> {
    public static final UnsignedLongAsNumberSerializer INSTANCE = new UnsignedLongAsNumberSerializer();
    private static final BigInteger power64 = BigIntegerExtensions.toBigInteger$default("18446744073709551616", 0, 1, null);
    private static final BigInteger maxLong = BigIntegerExtensions.toBigInteger(Long.MAX_VALUE);
    private static final SerialDescriptor descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("UnsignedAsNumber[kotlin.Long]", SerialKinds2.STRING.INSTANCE);

    private UnsignedLongAsNumberSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer3
    public /* bridge */ /* synthetic */ void serialize(Encoding4 encoding4, Object obj) {
        serialize(encoding4, ((Number) obj).longValue());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final String toLiteral$core(long value) {
        BigInteger bigInteger;
        if (value < 0) {
            bigInteger = power64.add(BigIntegerExtensions.toBigInteger(value));
        } else {
            bigInteger = BigIntegerExtensions.toBigInteger(value);
        }
        return bigInteger.toString();
    }

    public final long fromLiteral$core(String value) {
        BigInteger bigInteger;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            bigInteger = BigIntegerExtensions.toBigInteger$default(value, 0, 1, null);
        } catch (NumberFormatException unused) {
            try {
                bigInteger = BigDecimalExtensions.toBigDecimal$default(value, (Long) null, (DecimalMode) null, 3, (Object) null).toBigInteger();
            } catch (ArithmeticException e) {
                throw new SerializationExceptions2("Decode failed: " + value, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new SerializationExceptions2("Decode failed: " + value, e2);
            } catch (NumberFormatException e3) {
                throw new SerializationExceptions2("Decode failed: " + value, e3);
            }
        }
        return bigInteger.compareTo(maxLong) > 0 ? ((BigInteger) bigInteger.minus((BigNumber) power64)).longValue(false) : bigInteger.longValue(false);
    }

    public void serialize(Encoding4 encoder, long value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (encoder instanceof JsonEncoder) {
            JsonSerializerHelpers.asJsonEncoder(encoder).encodeJsonElement(JsonElement3.JsonUnquotedLiteral(toLiteral$core(value)));
        } else {
            encoder.encodeLong(value);
        }
    }

    @Override // kotlinx.serialization.KSerializer2
    public Long deserialize(Decoding2 decoder) {
        long jFromLiteral$core;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder instanceof JsonDecoder) {
            jFromLiteral$core = fromLiteral$core(JsonSerializerHelpers.decodeJsonPrimitive(JsonSerializerHelpers.asJsonDecoder(decoder)).getContent());
        } else {
            jFromLiteral$core = fromLiteral$core(decoder.decodeString());
        }
        return Long.valueOf(jFromLiteral$core);
    }
}
