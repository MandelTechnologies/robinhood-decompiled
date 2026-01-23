package com.robinhood.idl.serialization;

import com.robinhood.idl.Dto;
import com.robinhood.idl.SupplierMaps4;
import com.squareup.wire.AnyMessage;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElement7;
import kotlinx.serialization.json.JsonElementBuilders;
import kotlinx.serialization.json.JsonElementBuilders2;

/* compiled from: AnyMessageSerializer.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B2\u0012)\u0010\u0003\u001a%\u0012\u0004\u0012\u00020\u0005\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\b\b0\u0004j\u0002`\t¢\u0006\u0004\b\n\u0010\u000bB\u001f\b\u0016\u0012\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\r¢\u0006\u0004\b\n\u0010\u000eB-\b\u0016\u0012\"\u0010\f\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u000f\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\n\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000H\u0086\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R1\u0010\u0003\u001a%\u0012\u0004\u0012\u00020\u0005\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\b\b0\u0004j\u0002`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/idl/serialization/AnyMessageSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/wire/AnyMessage;", "supplierMap", "", "", "Lkotlin/Function0;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "<init>", "(Ljava/util/Map;)V", "bindings", "", "(Ljava/lang/Iterable;)V", "", "([Lcom/robinhood/idl/Dto$SerializableCreator;)V", "plus", "other", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "Component", "Companion", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class AnyMessageSerializer implements KSerializer<AnyMessage> {
    private static final Json JSON = Json6.Json$default(null, new Function1() { // from class: com.robinhood.idl.serialization.AnyMessageSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AnyMessageSerializer.JSON$lambda$1((Json4) obj);
        }
    }, 1, null);
    private final SerialDescriptor descriptor;
    private final Map<String, Function0<Dto.SerializableCreator<?, ?>>> supplierMap;

    public AnyMessageSerializer(Map<String, Function0<Dto.SerializableCreator<?, ?>>> supplierMap) {
        Intrinsics.checkNotNullParameter(supplierMap, "supplierMap");
        this.supplierMap = supplierMap;
        this.descriptor = SerialDescriptors3.SerialDescriptor("com.squareup.wire.AnyMessage", JsonElement.INSTANCE.serializer().getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnyMessageSerializer(Iterable<? extends Dto.SerializableCreator<?, ?>> bindings) {
        this(SupplierMaps4.toDtoCreatorSupplierMap(bindings));
        Intrinsics.checkNotNullParameter(bindings, "bindings");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnyMessageSerializer(Dto.SerializableCreator<?, ?>... bindings) {
        this(ArraysKt.asList(bindings));
        Intrinsics.checkNotNullParameter(bindings, "bindings");
    }

    public final AnyMessageSerializer plus(AnyMessageSerializer other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new AnyMessageSerializer((Map<String, Function0<Dto.SerializableCreator<?, ?>>>) MapsKt.plus(this.supplierMap, other.supplierMap));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, AnyMessage value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String typeUrl = value.getTypeUrl();
        Function0<Dto.SerializableCreator<?, ?>> function0 = this.supplierMap.get(typeUrl);
        Dto.SerializableCreator<?, ?> serializableCreatorInvoke = function0 != null ? function0.invoke() : null;
        if (serializableCreatorInvoke == null) {
            throw new SerializationExceptions2("Cannot find type for url: " + typeUrl);
        }
        Dto dto = (Dto) serializableCreatorInvoke.fromProto(serializableCreatorInvoke.getProtoAdapter().decode(value.getValue()));
        JsonElementBuilders2 jsonElementBuilders2 = new JsonElementBuilders2();
        for (Map.Entry<String, JsonElement> entry : JsonElement3.getJsonObject(JSON.encodeToJsonElement(serializableCreatorInvoke.getDefaultSerializer(), dto)).entrySet()) {
            jsonElementBuilders2.put(entry.getKey(), entry.getValue());
        }
        JsonElementBuilders.put(jsonElementBuilders2, "@type", typeUrl);
        encoder.encodeSerializableValue(JsonElement6.INSTANCE.serializer(), jsonElementBuilders2.build());
    }

    @Override // kotlinx.serialization.KSerializer2
    public AnyMessage deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementDecodeJsonElement = JsonSerializerHelpers.asJsonDecoder(decoder).decodeJsonElement();
        if (!(jsonElementDecodeJsonElement instanceof JsonElement6)) {
            throw new SerializationExceptions2("Expected object");
        }
        JsonElement jsonElement = (JsonElement) ((JsonElement6) jsonElementDecodeJsonElement).get((Object) "@type");
        if (!(jsonElement instanceof JsonElement7)) {
            throw new SerializationExceptions2("expected @type");
        }
        String content = ((JsonElement7) jsonElement).getContent();
        Function0<Dto.SerializableCreator<?, ?>> function0 = this.supplierMap.get(content);
        Dto.SerializableCreator<?, ?> serializableCreatorInvoke = function0 != null ? function0.invoke() : null;
        if (serializableCreatorInvoke == null) {
            throw new SerializationExceptions2("Cannot resolve type: " + content);
        }
        return new AnyMessage(content, serializableCreatorInvoke.getProtoAdapter().encodeByteString(((Dto) JSON.decodeFromJsonElement(serializableCreatorInvoke.getDefaultSerializer(), jsonElementDecodeJsonElement)).toProto()));
    }

    /* compiled from: AnyMessageSerializer.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0005H\u0017J\u0010\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0017R,\u0010\u0007\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\b*\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/idl/serialization/AnyMessageSerializer$Component;", "", "provideAnyMessageSerializer", "Lcom/robinhood/idl/serialization/AnyMessageSerializer;", "bindings", "", "Lcom/robinhood/idl/Dto$SerializableCreator;", "bindIntoMap", "Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "getBindIntoMap", "(Lcom/robinhood/idl/serialization/AnyMessageSerializer;)Lkotlin/Pair;", "provideNothingDtoCreatorIntoSet", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Component {
        Tuples2<KClass<?>, KSerializer<?>> getBindIntoMap(AnyMessageSerializer anyMessageSerializer);

        AnyMessageSerializer provideAnyMessageSerializer(Set<? extends Dto.SerializableCreator<?, ?>> bindings);

        Dto.SerializableCreator<?, ?> provideNothingDtoCreatorIntoSet();

        /* compiled from: AnyMessageSerializer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static AnyMessageSerializer provideAnyMessageSerializer(Component component, Set<? extends Dto.SerializableCreator<?, ?>> bindings) {
                Intrinsics.checkNotNullParameter(bindings, "bindings");
                return new AnyMessageSerializer(bindings);
            }

            public static Tuples2<KClass<?>, KSerializer<?>> getBindIntoMap(Component component, AnyMessageSerializer receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                return Tuples4.m3642to(Reflection.getOrCreateKotlinClass(AnyMessage.class), receiver);
            }

            public static Dto.SerializableCreator<?, ?> provideNothingDtoCreatorIntoSet(Component component) {
                return AnyMessageSerializer3.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JSON$lambda$1(Json4 Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setCoerceInputValues(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }
}
