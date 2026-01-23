package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: JsonElementSerializers.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lkotlinx/serialization/json/JsonElementSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@PublishedApi
/* renamed from: kotlinx.serialization.json.JsonElementSerializer, reason: use source file name */
/* loaded from: classes23.dex */
public final class JsonElementSerializers2 implements KSerializer<JsonElement> {
    public static final JsonElementSerializers2 INSTANCE = new JsonElementSerializers2();
    private static final SerialDescriptor descriptor = SerialDescriptors3.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", SerialKinds.SEALED.INSTANCE, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return JsonElementSerializers2.descriptor$lambda$5((SerialDescriptors) obj);
        }
    });

    private JsonElementSerializers2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor$lambda$5(SerialDescriptors buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        SerialDescriptors.element$default(buildSerialDescriptor, "JsonPrimitive", JsonElementSerializers3.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializers2.descriptor$lambda$5$lambda$0();
            }
        }), null, false, 12, null);
        SerialDescriptors.element$default(buildSerialDescriptor, "JsonNull", JsonElementSerializers3.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializers2.descriptor$lambda$5$lambda$1();
            }
        }), null, false, 12, null);
        SerialDescriptors.element$default(buildSerialDescriptor, "JsonLiteral", JsonElementSerializers3.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializers2.descriptor$lambda$5$lambda$2();
            }
        }), null, false, 12, null);
        SerialDescriptors.element$default(buildSerialDescriptor, "JsonObject", JsonElementSerializers3.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializers2.descriptor$lambda$5$lambda$3();
            }
        }), null, false, 12, null);
        SerialDescriptors.element$default(buildSerialDescriptor, "JsonArray", JsonElementSerializers3.defer(new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonElementSerializers2.descriptor$lambda$5$lambda$4();
            }
        }), null, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$0() {
        return JsonElementSerializers7.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$1() {
        return JsonElementSerializers5.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$2() {
        return JsonElementSerializers4.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$3() {
        return JsonElementSerializers6.INSTANCE.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor$lambda$5$lambda$4() {
        return JsonElementSerializers.INSTANCE.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, JsonElement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializers3.verify(encoder);
        if (value instanceof JsonElement7) {
            encoder.encodeSerializableValue(JsonElementSerializers7.INSTANCE, value);
        } else if (value instanceof JsonElement6) {
            encoder.encodeSerializableValue(JsonElementSerializers6.INSTANCE, value);
        } else {
            if (!(value instanceof JsonElement2)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.encodeSerializableValue(JsonElementSerializers.INSTANCE, value);
        }
    }

    @Override // kotlinx.serialization.KSerializer2
    public JsonElement deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return JsonElementSerializers3.asJsonDecoder(decoder).decodeJsonElement();
    }
}
