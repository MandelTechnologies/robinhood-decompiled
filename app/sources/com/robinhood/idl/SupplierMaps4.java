package com.robinhood.idl;

import com.robinhood.idl.Dto;
import com.squareup.wire.ProtoAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: SupplierMaps.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\b\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\b\u00050\u0001j\u0002`\t*\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\nH\u0007¢\u0006\u0002\b\u000b\u001a:\u0010\b\u001a!\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0003¢\u0006\u0002\b\u00050\u0001j\u0002`\f*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\nH\u0007¢\u0006\u0002\b\r\u001aL\u0010\r\u001a!\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0003¢\u0006\u0002\b\u00050\u0001j\u0002`\f*%\u0012\u0004\u0012\u00020\u0002\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\b\u00050\u0001j\u0002`\t*H\u0010\u0000\"!\u0012\u0004\u0012\u00020\u0002\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\b\u00050\u00012!\u0012\u0004\u0012\u00020\u0002\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\b\u00050\u0001*@\u0010\u0006\"\u001d\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0003¢\u0006\u0002\b\u00050\u00012\u001d\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0003¢\u0006\u0002\b\u00050\u0001¨\u0006\u000e"}, m3636d2 = {"DtoCreatorSupplierMap", "", "", "Lkotlin/Function0;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lkotlin/jvm/JvmSuppressWildcards;", "ProtoAdapterSupplierMap", "Lcom/squareup/wire/ProtoAdapter;", "toSupplierMap", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "", "toDtoCreatorSupplierMap", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "toProtoAdapterSupplierMap", "core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.idl.SupplierMapsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SupplierMaps4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Dto.SerializableCreator toSupplierMap$lambda$2$lambda$1(Dto.SerializableCreator serializableCreator) {
        return serializableCreator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter toSupplierMap$lambda$5$lambda$4(ProtoAdapter protoAdapter) {
        return protoAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter toProtoAdapterSupplierMap$lambda$7$lambda$6(Function0 function0) {
        return ((Dto.SerializableCreator) function0.invoke()).getProtoAdapter();
    }

    public static final Map<String, Function0<ProtoAdapter<?>>> toProtoAdapterSupplierMap(Map<String, Function0<Dto.SerializableCreator<?, ?>>> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            final Function0 function0 = (Function0) entry.getValue();
            linkedHashMap.put(key, new Function0() { // from class: com.robinhood.idl.SupplierMapsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SupplierMaps4.toProtoAdapterSupplierMap$lambda$7$lambda$6(function0);
                }
            });
        }
        return linkedHashMap;
    }

    @JvmName
    public static final Map<String, Function0<Dto.SerializableCreator<?, ?>>> toDtoCreatorSupplierMap(Iterable<? extends Dto.SerializableCreator<?, ?>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (final Dto.SerializableCreator<?, ?> serializableCreator : iterable) {
            String typeUrl = serializableCreator.getProtoAdapter().getTypeUrl();
            if (typeUrl == null) {
                throw new IllegalArgumentException(("Proto type of " + serializableCreator + " must have a typeUrl").toString());
            }
            Tuples2 tuples2M3642to = Tuples4.m3642to(typeUrl, new Function0() { // from class: com.robinhood.idl.SupplierMapsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SupplierMaps4.toSupplierMap$lambda$2$lambda$1(serializableCreator);
                }
            });
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }

    @JvmName
    public static final Map<String, Function0<ProtoAdapter<?>>> toProtoAdapterSupplierMap(Iterable<? extends ProtoAdapter<?>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (final ProtoAdapter<?> protoAdapter : iterable) {
            String typeUrl = protoAdapter.getTypeUrl();
            if (typeUrl == null) {
                throw new IllegalArgumentException(("Proto type of " + protoAdapter + " must have a typeUrl").toString());
            }
            Tuples2 tuples2M3642to = Tuples4.m3642to(typeUrl, new Function0() { // from class: com.robinhood.idl.SupplierMapsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SupplierMaps4.toSupplierMap$lambda$5$lambda$4(protoAdapter);
                }
            });
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }
}
