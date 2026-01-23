package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(m3635d1 = {"kotlinx/serialization/SerializersKt__SerializersJvmKt", "kotlinx/serialization/SerializersKt__SerializersKt"}, m3637k = 4, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SerializersKt {
    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(KClass<Object> kClass, List<? extends KSerializer<Object>> list, Function0<? extends KClassifier> function0) {
        return Serializers5.parametrizedSerializerOrNull(kClass, list, function0);
    }

    public static final <T> KSerializer<T> serializer(KClass<T> kClass) {
        return Serializers5.serializer(kClass);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, Type type2) {
        return SerializersJvm.serializer(serializersModule, type2);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, KType kType) {
        return Serializers5.serializer(serializersModule, kType);
    }

    public static final <T> KSerializer<T> serializerOrNull(KClass<T> kClass) {
        return Serializers5.serializerOrNull(kClass);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, Type type2) {
        return SerializersJvm.serializerOrNull(serializersModule, type2);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, KType kType) {
        return Serializers5.serializerOrNull(serializersModule, kType);
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule serializersModule, List<? extends KType> list, boolean z) {
        return Serializers5.serializersForParameters(serializersModule, list, z);
    }
}
