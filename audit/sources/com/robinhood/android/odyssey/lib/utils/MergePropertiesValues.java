package com.robinhood.android.odyssey.lib.utils;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty7;
import kotlin.reflect.full.KClasses;

/* compiled from: MergePropertiesValues.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\u0018\u0001H\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0006\u0010\u0005\u001a\u0002H\u0001H\u0000¢\u0006\u0002\u0010\u0006\u001a(\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u0004\u0018\u0001H\u00012\u0006\u0010\u0005\u001a\u0002H\u0001H\u0080\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"mergePropertiesValues", "T", "", "type", "Lkotlin/reflect/KClass;", "other", "(Ljava/lang/Object;Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.utils.MergePropertiesValuesKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class MergePropertiesValues {
    public static final <T> T mergePropertiesValues(T t, KClass<T> type2, T other) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(other, "other");
        if (t == null) {
            return other;
        }
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(type2);
        if (primaryConstructor == null) {
            throw new IllegalArgumentException((type2 + " must have a primary constructor").toString());
        }
        Collection memberProperties = KClasses.getMemberProperties(type2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(memberProperties, 10)), 16));
        for (T t2 : memberProperties) {
            linkedHashMap.put(((KProperty7) t2).getName(), t2);
        }
        List<KParameter> parameters = primaryConstructor.getParameters();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(parameters, 10)), 16));
        for (T t3 : parameters) {
            String name = ((KParameter) t3).getName();
            Intrinsics.checkNotNull(name);
            KProperty7 kProperty7 = (KProperty7) MapsKt.getValue(linkedHashMap, name);
            Object obj = kProperty7.get(other);
            if (obj == null) {
                obj = kProperty7.get(t);
            }
            linkedHashMap2.put(t3, obj);
        }
        return (T) primaryConstructor.callBy(linkedHashMap2);
    }

    public static final /* synthetic */ <T> T mergePropertiesValues(T t, T other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) mergePropertiesValues(t, Reflection.getOrCreateKotlinClass(Object.class), other);
    }
}
