package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.UStrings;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.json.internal.JsonExceptions4;

/* compiled from: JsonElementSerializers.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lkotlinx/serialization/json/JsonLiteralSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonLiteral;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.serialization.json.JsonLiteralSerializer, reason: use source file name */
/* loaded from: classes14.dex */
final class JsonElementSerializers4 implements KSerializer<JsonElement4> {
    public static final JsonElementSerializers4 INSTANCE = new JsonElementSerializers4();
    private static final SerialDescriptor descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", SerialKinds2.STRING.INSTANCE);

    private JsonElementSerializers4() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, JsonElement4 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializers3.verify(encoder);
        if (value.getIsString()) {
            encoder.encodeString(value.getContent());
            return;
        }
        if (value.getCoerceToInlineType() != null) {
            encoder.encodeInline(value.getCoerceToInlineType()).encodeString(value.getContent());
            return;
        }
        Long longOrNull = StringsKt.toLongOrNull(value.getContent());
        if (longOrNull != null) {
            encoder.encodeLong(longOrNull.longValue());
            return;
        }
        ULong uLongOrNull = UStrings.toULongOrNull(value.getContent());
        if (uLongOrNull != null) {
            encoder.encodeInline(BuiltinSerializers.serializer(ULong.INSTANCE).getDescriptor()).encodeLong(uLongOrNull.getData());
            return;
        }
        Double doubleOrNull = StringsKt.toDoubleOrNull(value.getContent());
        if (doubleOrNull != null) {
            encoder.encodeDouble(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(value.getContent());
        if (booleanStrictOrNull != null) {
            encoder.encodeBoolean(booleanStrictOrNull.booleanValue());
        } else {
            encoder.encodeString(value.getContent());
        }
    }

    @Override // kotlinx.serialization.KSerializer2
    public JsonElement4 deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementDecodeJsonElement = JsonElementSerializers3.asJsonDecoder(decoder).decodeJsonElement();
        if (!(jsonElementDecodeJsonElement instanceof JsonElement4)) {
            throw JsonExceptions4.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(jsonElementDecodeJsonElement.getClass()), jsonElementDecodeJsonElement.toString());
        }
        return (JsonElement4) jsonElementDecodeJsonElement;
    }
}
