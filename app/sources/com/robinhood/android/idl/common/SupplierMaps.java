package com.robinhood.android.idl.common;

import com.squareup.wire.ProtoAdapter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMarkers;

/* compiled from: SupplierMaps.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B.\u0012%\u0010\u0004\u001a!\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0005¢\u0006\u0002\b\u00060\u0001j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002J\u0014\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R-\u0010\u0004\u001a!\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0005¢\u0006\u0002\b\u00060\u0001j\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/idl/common/ProtoAdapterSupplierMapAdapter;", "", "", "Lcom/squareup/wire/ProtoAdapter;", "supplierMap", "Lkotlin/Function0;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "<init>", "(Ljava/util/Map;)V", "keys", "", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "isEmpty", "", "containsKey", "key", "get", "containsValue", "", "value", "entries", "getEntries", "()Ljava/lang/Void;", "values", "getValues", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.common.ProtoAdapterSupplierMapAdapter, reason: use source file name */
/* loaded from: classes10.dex */
final class SupplierMaps implements Map<String, ProtoAdapter<?>>, KMarkers {
    private final Map<String, Function0<ProtoAdapter<?>>> supplierMap;

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: compute, reason: avoid collision after fix types in other method */
    public ProtoAdapter<?> compute2(String str, BiFunction<? super String, ? super ProtoAdapter<?>, ? extends ProtoAdapter<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ ProtoAdapter<?> compute(String str, BiFunction<? super String, ? super ProtoAdapter<?>, ? extends ProtoAdapter<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public ProtoAdapter<?> computeIfAbsent2(String str, Function<? super String, ? extends ProtoAdapter<?>> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ ProtoAdapter<?> computeIfAbsent(String str, Function<? super String, ? extends ProtoAdapter<?>> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public ProtoAdapter<?> computeIfPresent2(String str, BiFunction<? super String, ? super ProtoAdapter<?>, ? extends ProtoAdapter<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ ProtoAdapter<?> computeIfPresent(String str, BiFunction<? super String, ? super ProtoAdapter<?>, ? extends ProtoAdapter<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    public ProtoAdapter<?> merge2(String str, ProtoAdapter<?> protoAdapter, BiFunction<? super ProtoAdapter<?>, ? super ProtoAdapter<?>, ? extends ProtoAdapter<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ ProtoAdapter<?> merge(String str, ProtoAdapter<?> protoAdapter, BiFunction<? super ProtoAdapter<?>, ? super ProtoAdapter<?>, ? extends ProtoAdapter<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public ProtoAdapter<?> put2(String str, ProtoAdapter<?> protoAdapter) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ ProtoAdapter<?> put(String str, ProtoAdapter<?> protoAdapter) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends ProtoAdapter<?>> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public ProtoAdapter<?> putIfAbsent2(String str, ProtoAdapter<?> protoAdapter) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ ProtoAdapter<?> putIfAbsent(String str, ProtoAdapter<?> protoAdapter) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public ProtoAdapter<?> remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public ProtoAdapter<?> replace2(String str, ProtoAdapter<?> protoAdapter) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ ProtoAdapter<?> replace(String str, ProtoAdapter<?> protoAdapter) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, ProtoAdapter<?> protoAdapter, ProtoAdapter<?> protoAdapter2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(String str, ProtoAdapter<?> protoAdapter, ProtoAdapter<?> protoAdapter2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super ProtoAdapter<?>, ? extends ProtoAdapter<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SupplierMaps(Map<String, Function0<ProtoAdapter<?>>> supplierMap) {
        Intrinsics.checkNotNullParameter(supplierMap, "supplierMap");
        this.supplierMap = supplierMap;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof ProtoAdapter) {
            return ((Boolean) containsValue((ProtoAdapter<?>) obj)).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, java.util.Set<java.util.Map$Entry<java.lang.String, com.squareup.wire.ProtoAdapter<?>>>] */
    @Override // java.util.Map
    /* renamed from: entrySet, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ Set<Map.Entry<String, ProtoAdapter<?>>> entrySet2() {
        return getEntries();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public final /* bridge */ ProtoAdapter<?> get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ ProtoAdapter<?> get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, java.util.Collection<com.squareup.wire.ProtoAdapter<?>>] */
    @Override // java.util.Map
    /* renamed from: values, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ Collection<ProtoAdapter<?>> values2() {
        return getValues();
    }

    public Set<String> getKeys() {
        return this.supplierMap.keySet();
    }

    public int getSize() {
        return keySet().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return keySet().isEmpty();
    }

    public boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return keySet().contains(key);
    }

    public ProtoAdapter<?> get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Function0<ProtoAdapter<?>> function0 = this.supplierMap.get(key);
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public Void containsValue(ProtoAdapter<?> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException();
    }

    public Void getEntries() {
        throw new UnsupportedOperationException();
    }

    public Void getValues() {
        throw new UnsupportedOperationException();
    }
}
