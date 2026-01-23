package com.robinhood.idl.serialization;

import com.robinhood.idl.Dto2;
import com.squareup.wire.WireEnum;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.json.JsonDecoder;

/* compiled from: EnumDtoSerializer.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0004*\u0012\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¢\u0006\u0002\u0010 R\u0010\u0010\u000b\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/idl/serialization/EnumDtoSerializer;", "D", "Lcom/robinhood/idl/EnumDto;", "P", "", "Lcom/squareup/wire/WireEnum;", "Lkotlinx/serialization/KSerializer;", "serialName", "", "entries", "Lkotlin/enums/EnumEntries;", "zeroValue", "<init>", "(Ljava/lang/String;Lkotlin/enums/EnumEntries;Ljava/lang/Enum;)V", "Ljava/lang/Enum;", "byName", "", "byValue", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class EnumDtoSerializer<D extends Enum<D> & Dto2<? extends P>, P extends Enum<P> & WireEnum> implements KSerializer<D> {
    private final Map<String, D> byName;
    private final Map<Integer, D> byValue;
    private final SerialDescriptor descriptor;

    /* JADX INFO: Incorrect field signature: TD; */
    private final Enum zeroValue;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Lkotlin/enums/EnumEntries<TD;>;TD;)V */
    public EnumDtoSerializer(String serialName, EnumEntries entries, Enum zeroValue) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(zeroValue, "zeroValue");
        this.zeroValue = zeroValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(((Enum) obj).name(), obj);
        }
        this.byName = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (Object obj2 : entries) {
            linkedHashMap2.put(Integer.valueOf(((WireEnum) ((Dto2) ((Enum) obj2)).toProto()).getValue()), obj2);
        }
        this.byValue = linkedHashMap2;
        this.descriptor = SerialDescriptors3.PrimitiveSerialDescriptor(serialName, SerialKinds2.STRING.INSTANCE);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlinx/serialization/encoding/Encoder;TD;)V */
    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, Enum value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.name());
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlinx/serialization/encoding/Decoder;)TD; */
    @Override // kotlinx.serialization.KSerializer2
    public Enum deserialize(Decoding2 decoder) {
        String strDecodeString;
        Enum r0;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder instanceof JsonDecoder) {
            strDecodeString = JsonSerializerHelpers.decodeJsonPrimitive(JsonSerializerHelpers.asJsonDecoder(decoder)).getContent();
        } else {
            strDecodeString = decoder.decodeString();
        }
        Integer intOrNull = StringsKt.toIntOrNull(strDecodeString);
        if (intOrNull != null && (r0 = (Enum) this.byValue.get(Integer.valueOf(intOrNull.intValue()))) != null) {
            return r0;
        }
        Enum r3 = (Enum) this.byName.get(strDecodeString);
        return r3 == null ? this.zeroValue : r3;
    }
}
