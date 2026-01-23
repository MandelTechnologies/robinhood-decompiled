package com.robinhood.android.idl.common;

import com.robinhood.idl.Dto;
import com.squareup.moshi.JsonAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireJsonAdapterFactory;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SupplierMaps.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*!\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0002\b\u00060\u0002j\u0002`\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\\\u0010\n\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\u0004¢\u0006\u0002\b\u00060\u0002j\u0002`\f2*\u0010\r\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u000e\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"jsonAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "writeIdentityValues", "", "createDtoCreatorSupplierMap", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "typeUrlToClassNameMapShards", "", "([Ljava/util/Map;)Ljava/util/Map;", "lib-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.idl.common.SupplierMapsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SupplierMaps2 {
    public static /* synthetic */ JsonAdapter.Factory jsonAdapterFactory$default(Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return jsonAdapterFactory(map, z);
    }

    public static final JsonAdapter.Factory jsonAdapterFactory(Map<String, Function0<ProtoAdapter<?>>> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new WireJsonAdapterFactory(new SupplierMaps(map), z);
    }

    public static final Map<String, Function0<Dto.SerializableCreator<?, ?>>> createDtoCreatorSupplierMap(Map<String, String>... typeUrlToClassNameMapShards) {
        Intrinsics.checkNotNullParameter(typeUrlToClassNameMapShards, "typeUrlToClassNameMapShards");
        int size = 0;
        for (Map<String, String> map : typeUrlToClassNameMapShards) {
            size += map.size();
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(size);
        for (Map<String, String> map2 : typeUrlToClassNameMapShards) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                final String value = entry.getValue();
                final Lazy lazy = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.idl.common.SupplierMapsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SupplierMaps2.createDtoCreatorSupplierMap$lambda$2$lambda$1(value);
                    }
                });
                mapCreateMapBuilder.put(key, new PropertyReference0Impl(lazy) { // from class: com.robinhood.android.idl.common.SupplierMapsKt$createDtoCreatorSupplierMap$2$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return ((Lazy) this.receiver).getValue();
                    }
                });
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dto.SerializableCreator createDtoCreatorSupplierMap$lambda$2$lambda$1(String str) throws IllegalAccessException, IllegalArgumentException {
        Object obj = Class.forName(str).getDeclaredField("Companion").get(null);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.idl.Dto.SerializableCreator<*, *>");
        return (Dto.SerializableCreator) obj;
    }
}
