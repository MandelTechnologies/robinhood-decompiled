package com.squareup.wire;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.PrimitiveRanges2;
import okio.ByteString;

/* compiled from: KotlinConstructorBuilder.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001\u001dB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\rJ\r\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/squareup/wire/KotlinConstructorBuilder;", "M", "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "messageType", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "fieldValueMap", "", "", "Lkotlin/Pair;", "Lcom/squareup/wire/WireField;", "", "repeatedFieldValueMap", "", "mapFieldKeyValueMap", "set", "", "field", "value", "clobberOtherIsOneOfs", "get", "build", "()Lcom/squareup/wire/Message;", "declaredProtoFields", "", "Lcom/squareup/wire/KotlinConstructorBuilder$ProtoField;", "ProtoField", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class KotlinConstructorBuilder<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message.Builder<M, B> {
    private final Map<Integer, Tuples2<WireField, Object>> fieldValueMap;
    private final Map<Integer, Tuples2<WireField, Map<?, ?>>> mapFieldKeyValueMap;
    private final Class<M> messageType;
    private final Map<Integer, Tuples2<WireField, List<?>>> repeatedFieldValueMap;

    public KotlinConstructorBuilder(Class<M> messageType) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        this.messageType = messageType;
        int length = messageType.getDeclaredFields().length;
        this.fieldValueMap = new LinkedHashMap(length);
        this.repeatedFieldValueMap = new LinkedHashMap(length);
        this.mapFieldKeyValueMap = new LinkedHashMap(length);
    }

    public final void set(WireField field, Object value) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (KotlinConstructorBuilder2.isMap(field)) {
            Map<Integer, Tuples2<WireField, Map<?, ?>>> map = this.mapFieldKeyValueMap;
            Integer numValueOf = Integer.valueOf(field.tag());
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            map.put(numValueOf, Tuples4.m3642to(field, TypeIntrinsics.asMutableMap(value)));
            return;
        }
        if (field.label().isRepeated()) {
            Map<Integer, Tuples2<WireField, List<?>>> map2 = this.repeatedFieldValueMap;
            Integer numValueOf2 = Integer.valueOf(field.tag());
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.MutableList<*>");
            map2.put(numValueOf2, Tuples4.m3642to(field, TypeIntrinsics.asMutableList(value)));
            return;
        }
        this.fieldValueMap.put(Integer.valueOf(field.tag()), Tuples4.m3642to(field, value));
        if (value == null || !field.label().isOneOf()) {
            return;
        }
        clobberOtherIsOneOfs(field);
    }

    private final void clobberOtherIsOneOfs(WireField field) {
        Collection<Tuples2<WireField, Object>> collectionValues = this.fieldValueMap.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add((WireField) ((Tuples2) it.next()).getFirst());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            WireField wireField = (WireField) obj;
            if (Intrinsics.areEqual(wireField.oneofName(), field.oneofName()) && wireField.tag() != field.tag()) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.fieldValueMap.remove(Integer.valueOf(((WireField) it2.next()).tag()));
        }
    }

    public final Object get(WireField field) {
        List<?> second;
        Map<?, ?> second2;
        Intrinsics.checkNotNullParameter(field, "field");
        if (KotlinConstructorBuilder2.isMap(field)) {
            Tuples2<WireField, Map<?, ?>> tuples2 = this.mapFieldKeyValueMap.get(Integer.valueOf(field.tag()));
            return (tuples2 == null || (second2 = tuples2.getSecond()) == null) ? MapsKt.emptyMap() : second2;
        }
        if (field.label().isRepeated()) {
            Tuples2<WireField, List<?>> tuples22 = this.repeatedFieldValueMap.get(Integer.valueOf(field.tag()));
            return (tuples22 == null || (second = tuples22.getSecond()) == null) ? CollectionsKt.emptyList() : second;
        }
        Tuples2<WireField, Object> tuples23 = this.fieldValueMap.get(Integer.valueOf(field.tag()));
        Object second3 = tuples23 != null ? tuples23.getSecond() : null;
        return (second3 == null && field.label() == WireField.Label.OMIT_IDENTITY) ? ProtoAdapter.INSTANCE.get(field.adapter()).getIdentity() : second3;
    }

    @Override // com.squareup.wire.Message.Builder
    public M build() throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        List<ProtoField> listDeclaredProtoFields = declaredProtoFields(this.messageType);
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator<ProtoField> it = listDeclaredProtoFields.iterator();
        while (it.hasNext()) {
            arrayDeque.add(it.next());
        }
        List<ProtoField> list = listDeclaredProtoFields;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ProtoField) it2.next()).getType());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<M> cls = this.messageType;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(clsArr);
        spreadBuilder.add(ByteString.class);
        Constructor<M> declaredConstructor = cls.getDeclaredConstructor((Class[]) spreadBuilder.toArray(new Class[spreadBuilder.size()]));
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(0, clsArr.length);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, 10));
        Iterator<Integer> it3 = primitiveRanges2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((PrimitiveIterators6) it3).nextInt() == listDeclaredProtoFields.size() ? buildUnknownFields() : get(((ProtoField) arrayDeque.removeFirst()).getWireField()));
        }
        Object[] array2 = arrayList2.toArray(new Object[0]);
        M mNewInstance = declaredConstructor.newInstance(Arrays.copyOf(array2, array2.length));
        Intrinsics.checkNotNull(mNewInstance, "null cannot be cast to non-null type M of com.squareup.wire.KotlinConstructorBuilder");
        return mNewInstance;
    }

    private final List<ProtoField> declaredProtoFields(Class<M> cls) {
        ProtoField protoField;
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : declaredAnnotations) {
                if (annotation instanceof WireField) {
                    arrayList2.add(annotation);
                }
            }
            WireField wireField = (WireField) CollectionsKt.firstOrNull((List) arrayList2);
            if (wireField != null) {
                Class<?> type2 = field.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                protoField = new ProtoField(type2, wireField);
            } else {
                protoField = null;
            }
            if (protoField != null) {
                arrayList.add(protoField);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.squareup.wire.KotlinConstructorBuilder$declaredProtoFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t).getWireField().schemaIndex()), Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t2).getWireField().schemaIndex()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KotlinConstructorBuilder.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/squareup/wire/KotlinConstructorBuilder$ProtoField;", "", "type", "Ljava/lang/Class;", "wireField", "Lcom/squareup/wire/WireField;", "<init>", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)V", "getType", "()Ljava/lang/Class;", "getWireField", "()Lcom/squareup/wire/WireField;", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    static final class ProtoField {
        private final Class<?> type;
        private final WireField wireField;

        public ProtoField(Class<?> type2, WireField wireField) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(wireField, "wireField");
            this.type = type2;
            this.wireField = wireField;
        }

        public final Class<?> getType() {
            return this.type;
        }

        public final WireField getWireField() {
            return this.wireField;
        }
    }
}
