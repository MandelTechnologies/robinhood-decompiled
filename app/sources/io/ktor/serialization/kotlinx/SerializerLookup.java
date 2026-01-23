package io.ktor.serialization.kotlinx;

import io.ktor.util.reflect.TypeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: SerializerLookup.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001\"\b\b\u0000\u0010\t*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\t0\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, m3636d2 = {"guessSerializer", "Lkotlinx/serialization/KSerializer;", "", "value", "module", "Lkotlinx/serialization/modules/SerializersModule;", "elementSerializer", "", "maybeNullable", "T", "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", "serializerForTypeInfo", "ktor-serialization-kotlinx"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.serialization.kotlinx.SerializerLookupKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class SerializerLookup {
    public static final KSerializer<?> serializerForTypeInfo(SerializersModule serializersModule, TypeInfo typeInfo) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(typeInfo, "typeInfo");
        KType kotlinType = typeInfo.getKotlinType();
        if (kotlinType != null) {
            KSerializer<?> kSerializerSerializerOrNull = kotlinType.getArguments().isEmpty() ? null : SerializersKt.serializerOrNull(serializersModule, kotlinType);
            if (kSerializerSerializerOrNull != null) {
                return kSerializerSerializerOrNull;
            }
        }
        KSerializer contextual$default = SerializersModule.getContextual$default(serializersModule, typeInfo.getType(), null, 2, null);
        return contextual$default != null ? maybeNullable(contextual$default, typeInfo) : maybeNullable(SerializersKt.serializer(typeInfo.getType()), typeInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> KSerializer<?> maybeNullable(KSerializer<T> kSerializer, TypeInfo typeInfo) {
        KType kotlinType = typeInfo.getKotlinType();
        return (kotlinType == null || !kotlinType.isMarkedNullable()) ? kSerializer : BuiltinSerializers.getNullable(kSerializer);
    }

    public static final KSerializer<Object> guessSerializer(Object obj, SerializersModule module) {
        KSerializer<Object> kSerializerSerializer;
        Intrinsics.checkNotNullParameter(module, "module");
        if (obj == null) {
            kSerializerSerializer = BuiltinSerializers.getNullable(BuiltinSerializers.serializer(StringCompanionObject.INSTANCE));
        } else if (obj instanceof List) {
            kSerializerSerializer = BuiltinSerializers.ListSerializer(elementSerializer((Collection) obj, module));
        } else if (obj instanceof Object[]) {
            Object objFirstOrNull = ArraysKt.firstOrNull((Object[]) obj);
            if (objFirstOrNull == null || (kSerializerSerializer = guessSerializer(objFirstOrNull, module)) == null) {
                kSerializerSerializer = BuiltinSerializers.ListSerializer(BuiltinSerializers.serializer(StringCompanionObject.INSTANCE));
            }
        } else if (obj instanceof Set) {
            kSerializerSerializer = BuiltinSerializers.SetSerializer(elementSerializer((Collection) obj, module));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            kSerializerSerializer = BuiltinSerializers.MapSerializer(elementSerializer(map.keySet(), module), elementSerializer(map.values(), module));
        } else {
            KSerializer<Object> contextual$default = SerializersModule.getContextual$default(module, Reflection.getOrCreateKotlinClass(obj.getClass()), null, 2, null);
            kSerializerSerializer = contextual$default == null ? SerializersKt.serializer(Reflection.getOrCreateKotlinClass(obj.getClass())) : contextual$default;
        }
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerSerializer;
    }

    private static final KSerializer<?> elementSerializer(Collection<?> collection, SerializersModule serializersModule) {
        Collection<?> collection2 = collection;
        List listFilterNotNull = CollectionsKt.filterNotNull(collection2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10));
        Iterator it = listFilterNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add(guessSerializer(it.next(), serializersModule));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((KSerializer) obj).getDescriptor().getSerialName())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((KSerializer) it2.next()).getDescriptor().getSerialName());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        KSerializer<String> kSerializerSerializer = (KSerializer) CollectionsKt.singleOrNull((List) arrayList2);
        if (kSerializerSerializer == null) {
            kSerializerSerializer = BuiltinSerializers.serializer(StringCompanionObject.INSTANCE);
        }
        if (kSerializerSerializer.getDescriptor().isNullable()) {
            return kSerializerSerializer;
        }
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return kSerializerSerializer;
        }
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            if (it3.next() == null) {
                return BuiltinSerializers.getNullable(kSerializerSerializer);
            }
        }
        return kSerializerSerializer;
    }
}
