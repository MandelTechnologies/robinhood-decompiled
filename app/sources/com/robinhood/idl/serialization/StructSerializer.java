package com.robinhood.idl.serialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement2;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElement7;

/* compiled from: StructSerializer.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0002*\u00020\u0017H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/idl/serialization/StructSerializer;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "listSerializer", "", "mapSerializer", "", "", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "toValue", "Lkotlinx/serialization/json/JsonElement;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class StructSerializer implements KSerializer<Object> {
    public static final StructSerializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static final KSerializer<List<Object>> listSerializer;
    private static final KSerializer<Map<String, Object>> mapSerializer;

    private StructSerializer() {
    }

    static {
        StructSerializer structSerializer = new StructSerializer();
        INSTANCE = structSerializer;
        descriptor = SerialDescriptors3.SerialDescriptor("Struct[kotlin.Any]", JsonElement.INSTANCE.serializer().getDescriptor());
        listSerializer = BuiltinSerializers.ListSerializer(structSerializer);
        mapSerializer = BuiltinSerializers.MapSerializer(BuiltinSerializers.serializer(StringCompanionObject.INSTANCE), structSerializer);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer2
    public Object deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return toValue(JsonSerializerHelpers.asJsonDecoder(decoder).decodeJsonElement());
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (value == null) {
            encoder.encodeNull();
            return;
        }
        if (value instanceof Boolean) {
            encoder.encodeBoolean(((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Double) {
            encoder.encodeDouble(((Number) value).doubleValue());
            return;
        }
        if (value instanceof Float) {
            encoder.encodeFloat(((Number) value).floatValue());
            return;
        }
        if (value instanceof Long) {
            encoder.encodeLong(((Number) value).longValue());
            return;
        }
        if (value instanceof Integer) {
            encoder.encodeInt(((Number) value).intValue());
            return;
        }
        if (value instanceof String) {
            encoder.encodeString((String) value);
            return;
        }
        if (value instanceof List) {
            listSerializer.serialize(encoder, value);
            return;
        }
        if (value instanceof Map) {
            KSerializer<Map<String, Object>> kSerializer = mapSerializer;
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            kSerializer.serialize(encoder, (Map) value);
        } else {
            throw new IllegalArgumentException("struct value must be a JSON type (null, Boolean, Double, String, List, or Map) but was " + Reflection.getOrCreateKotlinClass(value.getClass()) + ": " + value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object toValue(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonElement2)) {
            if (!(jsonElement instanceof JsonElement6)) {
                if (!(jsonElement instanceof JsonElement7)) {
                    throw new NoWhenBranchMatchedException();
                }
                JsonElement7 jsonElement7 = (JsonElement7) jsonElement;
                String contentOrNull = JsonElement3.getContentOrNull(jsonElement7);
                if (contentOrNull == null) {
                    return null;
                }
                if (jsonElement7.getIsString()) {
                    return contentOrNull;
                }
                Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(contentOrNull);
                if (booleanStrictOrNull != null) {
                    return booleanStrictOrNull;
                }
                Double doubleOrNull = StringsKt.toDoubleOrNull(contentOrNull);
                if (doubleOrNull != null) {
                    return doubleOrNull;
                }
                throw new SerializationExceptions2("Decode failed: " + contentOrNull);
            }
            Map map = (Map) jsonElement;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), INSTANCE.toValue((JsonElement) entry.getValue()));
            }
            return linkedHashMap;
        }
        Iterable iterable = (Iterable) jsonElement;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.toValue((JsonElement) it.next()));
        }
        return arrayList;
    }
}
