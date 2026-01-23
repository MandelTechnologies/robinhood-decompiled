package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMarkers;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.ArrayMapOwner3;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.utils.collections;

/* compiled from: TypeAttributes.kt */
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttributes2<?>, TypeAttributes2<?>> implements Iterable<TypeAttributes2<?>>, KMarkers {
    public static final Companion Companion = new Companion(null);
    private static final TypeAttributes Empty = new TypeAttributes((List<? extends TypeAttributes2<?>>) CollectionsKt.emptyList());

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends TypeAttributes2<?>>) list);
    }

    private TypeAttributes(List<? extends TypeAttributes2<?>> list) {
        for (TypeAttributes2<?> typeAttributes2 : list) {
            registerComponent((KClass) typeAttributes2.getKey(), (KAnnotatedElement) typeAttributes2);
        }
    }

    /* compiled from: TypeAttributes.kt */
    @SourceDebugExtension
    public static final class Companion extends ArrayMapOwner3<TypeAttributes2<?>, TypeAttributes2<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMapOwner3
        public int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String key, Function1<? super String, Integer> compute) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Integer numInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(numInvoke.intValue()));
                        iIntValue = numInvoke.intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        public final TypeAttributes getEmpty() {
            return TypeAttributes.Empty;
        }

        public final TypeAttributes create(List<? extends TypeAttributes2<?>> attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            if (attributes.isEmpty()) {
                return getEmpty();
            }
            return new TypeAttributes(attributes, null);
        }
    }

    private TypeAttributes(TypeAttributes2<?> typeAttributes2) {
        this((List<? extends TypeAttributes2<?>>) CollectionsKt.listOf(typeAttributes2));
    }

    public final boolean contains(TypeAttributes2<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return getArrayMap().get(Companion.getId((KClass) attribute.getKey())) != null;
    }

    public final TypeAttributes plus(TypeAttributes2<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (contains(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(attribute);
        }
        return Companion.create(CollectionsKt.plus((Collection<? extends TypeAttributes2<?>>) CollectionsKt.toList(this), attribute));
    }

    public final TypeAttributes remove(TypeAttributes2<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (!isEmpty()) {
            ArrayMap<TypeAttributes2<?>> arrayMap = getArrayMap();
            ArrayList arrayList = new ArrayList();
            for (TypeAttributes2<?> typeAttributes2 : arrayMap) {
                if (!Intrinsics.areEqual(typeAttributes2, attribute)) {
                    arrayList.add(typeAttributes2);
                }
            }
            if (arrayList.size() != getArrayMap().getSize()) {
                return Companion.create(arrayList);
            }
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMapOwner
    protected ArrayMapOwner3<TypeAttributes2<?>, TypeAttributes2<?>> getTypeRegistry() {
        return Companion;
    }

    public final TypeAttributes intersect(TypeAttributes other) {
        TypeAttributes2 typeAttributes2Intersect;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttributes2<?> typeAttributes2 = getArrayMap().get(iIntValue);
            TypeAttributes2<?> typeAttributes22 = other.getArrayMap().get(iIntValue);
            if (typeAttributes2 == null) {
                typeAttributes2Intersect = typeAttributes22 != null ? typeAttributes22.intersect(typeAttributes2) : null;
            } else {
                typeAttributes2Intersect = typeAttributes2.intersect(typeAttributes22);
            }
            collections.addIfNotNull(arrayList, typeAttributes2Intersect);
        }
        return Companion.create(arrayList);
    }

    public final TypeAttributes add(TypeAttributes other) {
        TypeAttributes2 typeAttributes2Add;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttributes2<?> typeAttributes2 = getArrayMap().get(iIntValue);
            TypeAttributes2<?> typeAttributes22 = other.getArrayMap().get(iIntValue);
            if (typeAttributes2 == null) {
                typeAttributes2Add = typeAttributes22 != null ? typeAttributes22.add(typeAttributes2) : null;
            } else {
                typeAttributes2Add = typeAttributes2.add(typeAttributes22);
            }
            collections.addIfNotNull(arrayList, typeAttributes2Add);
        }
        return Companion.create(arrayList);
    }
}
