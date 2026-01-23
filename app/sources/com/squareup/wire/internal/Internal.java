package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.WireEnum;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import p479j$.time.Duration;
import p479j$.time.Instant;

@Metadata(m3635d1 = {"com/squareup/wire/internal/Internal__InternalJvmKt", "com/squareup/wire/internal/Internal__InternalKt"}, m3637k = 4, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Internal {
    @JvmName
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m26823redactElements(List<? extends T> list, ProtoAdapter<T> protoAdapter) {
        return Internal2.m26825redactElements(list, protoAdapter);
    }

    @JvmName
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m26824redactElements(Map<K, ? extends V> map, ProtoAdapter<V> protoAdapter) {
        return Internal2.m26826redactElements(map, protoAdapter);
    }

    public static final String boxedOneOfClassName(String str) {
        return Internal2.boxedOneOfClassName(str);
    }

    public static final String boxedOneOfKeyFieldName(String str, String str2) {
        return Internal2.boxedOneOfKeyFieldName(str, str2);
    }

    public static final String boxedOneOfKeysFieldName(String str) {
        return Internal2.boxedOneOfKeysFieldName(str);
    }

    public static final void checkElementsNotNull(List<?> list) {
        Internal2.checkElementsNotNull(list);
    }

    public static final void checkElementsNotNull(Map<?, ?> map) {
        Internal2.checkElementsNotNull(map);
    }

    public static final boolean commonEquals(Duration duration, Object obj) {
        return Internal2.commonEquals(duration, obj);
    }

    public static final boolean commonEquals(Instant instant, Object obj) {
        return Internal2.commonEquals(instant, obj);
    }

    public static final int commonHashCode(Duration duration) {
        return Internal2.commonHashCode(duration);
    }

    public static final int commonHashCode(Instant instant) {
        return Internal2.commonHashCode(instant);
    }

    @Deprecated
    public static final <T> List<T> copyOf(String str, List<? extends T> list) {
        return Internal2.copyOf(str, list);
    }

    public static final <T> List<T> copyOf(List<? extends T> list) {
        return Internal2.copyOf(list);
    }

    @Deprecated
    public static final <K, V> Map<K, V> copyOf(String str, Map<K, ? extends V> map) {
        return Internal2.copyOf(str, map);
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, ? extends V> map) {
        return Internal2.copyOf(map);
    }

    public static final int countNonNull(Object obj, Object obj2) {
        return Internal2.countNonNull(obj, obj2);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3) {
        return Internal2.countNonNull(obj, obj2, obj3);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... objArr) {
        return Internal2.countNonNull(obj, obj2, obj3, obj4, objArr);
    }

    public static final double decodePrimitive_double(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_double(protoReader32);
    }

    public static final double decodePrimitive_double(ProtoReader protoReader) {
        return Internal2.decodePrimitive_double(protoReader);
    }

    public static final int decodePrimitive_fixed32(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_fixed32(protoReader32);
    }

    public static final int decodePrimitive_fixed32(ProtoReader protoReader) {
        return Internal2.decodePrimitive_fixed32(protoReader);
    }

    public static final long decodePrimitive_fixed64(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_fixed64(protoReader32);
    }

    public static final long decodePrimitive_fixed64(ProtoReader protoReader) {
        return Internal2.decodePrimitive_fixed64(protoReader);
    }

    public static final float decodePrimitive_float(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_float(protoReader32);
    }

    public static final float decodePrimitive_float(ProtoReader protoReader) {
        return Internal2.decodePrimitive_float(protoReader);
    }

    public static final int decodePrimitive_int32(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_int32(protoReader32);
    }

    public static final int decodePrimitive_int32(ProtoReader protoReader) {
        return Internal2.decodePrimitive_int32(protoReader);
    }

    public static final long decodePrimitive_int64(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_int64(protoReader32);
    }

    public static final long decodePrimitive_int64(ProtoReader protoReader) {
        return Internal2.decodePrimitive_int64(protoReader);
    }

    public static final int decodePrimitive_sfixed32(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_sfixed32(protoReader32);
    }

    public static final int decodePrimitive_sfixed32(ProtoReader protoReader) {
        return Internal2.decodePrimitive_sfixed32(protoReader);
    }

    public static final long decodePrimitive_sfixed64(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_sfixed64(protoReader32);
    }

    public static final long decodePrimitive_sfixed64(ProtoReader protoReader) {
        return Internal2.decodePrimitive_sfixed64(protoReader);
    }

    public static final int decodePrimitive_sint32(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_sint32(protoReader32);
    }

    public static final int decodePrimitive_sint32(ProtoReader protoReader) {
        return Internal2.decodePrimitive_sint32(protoReader);
    }

    public static final long decodePrimitive_sint64(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_sint64(protoReader32);
    }

    public static final long decodePrimitive_sint64(ProtoReader protoReader) {
        return Internal2.decodePrimitive_sint64(protoReader);
    }

    public static final int decodePrimitive_uint32(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_uint32(protoReader32);
    }

    public static final int decodePrimitive_uint32(ProtoReader protoReader) {
        return Internal2.decodePrimitive_uint32(protoReader);
    }

    public static final long decodePrimitive_uint64(ProtoReader32 protoReader32) {
        return Internal2.decodePrimitive_uint64(protoReader32);
    }

    public static final long decodePrimitive_uint64(ProtoReader protoReader) {
        return Internal2.decodePrimitive_uint64(protoReader);
    }

    public static final void encodeArray_double(double[] dArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_double(dArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_fixed32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_fixed32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_fixed64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_fixed64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_float(float[] fArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_float(fArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_int32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_int32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_int64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_int64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sfixed32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_sfixed32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sfixed64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_sfixed64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sint32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_sint32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sint64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_sint64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_uint32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_uint32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_uint64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        Internal2.encodeArray_uint64(jArr, reverseProtoWriter, i);
    }

    public static final boolean equals(Object obj, Object obj2) {
        return Internal2.equals(obj, obj2);
    }

    public static final <E extends WireEnum> E getIdentityOrNull(Class<E> cls) {
        return (E) InternalJvm.getIdentityOrNull(cls);
    }

    public static final <T> List<T> immutableCopyOf(String str, List<? extends T> list) {
        return Internal2.immutableCopyOf(str, list);
    }

    public static final <K, V> Map<K, V> immutableCopyOf(String str, Map<K, ? extends V> map) {
        return Internal2.immutableCopyOf(str, map);
    }

    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(String str, Map<K, ? extends V> map) {
        return Internal2.immutableCopyOfMapWithStructValues(str, map);
    }

    public static final <T> T immutableCopyOfStruct(String str, T t) {
        return (T) Internal2.immutableCopyOfStruct(str, t);
    }

    public static final IllegalStateException missingRequiredFields(Object... objArr) {
        return Internal2.missingRequiredFields(objArr);
    }

    public static final <T> List<T> newMutableList() {
        return Internal2.newMutableList();
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return Internal2.newMutableMap();
    }

    public static final <T> void redactElements(List<T> list, ProtoAdapter<T> protoAdapter) {
        InternalJvm.redactElements(list, protoAdapter);
    }

    public static final <T> void redactElements(Map<?, T> map, ProtoAdapter<T> protoAdapter) {
        InternalJvm.redactElements(map, protoAdapter);
    }

    public static final String sanitize(String str) {
        return Internal2.sanitize(str);
    }

    public static final String sanitize(List<String> list) {
        return Internal2.sanitize(list);
    }
}
