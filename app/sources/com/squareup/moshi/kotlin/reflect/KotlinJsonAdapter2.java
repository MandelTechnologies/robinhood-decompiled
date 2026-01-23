package com.squareup.moshi.kotlin.reflect;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty4;
import kotlin.reflect.KProperty7;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;

/* compiled from: KotlinJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "moshi-kotlin"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory, reason: use source file name */
/* loaded from: classes21.dex */
public final class KotlinJsonAdapter2 implements JsonAdapter.Factory {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c7  */
    @Override // com.squareup.moshi.JsonAdapter.Factory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) throws NoSuchMethodException, ClassNotFoundException {
        Object next;
        String name;
        KClassifier classifier;
        Type javaType;
        Object next2;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Object obj = null;
        if (!annotations.isEmpty()) {
            return null;
        }
        Class<?> rawType = _MoshiKotlinTypesExtensionsKt.getRawType(type2);
        if (rawType.isInterface() || rawType.isEnum() || !rawType.isAnnotationPresent(KotlinJsonAdapter3.KOTLIN_METADATA) || Util.isPlatformType(rawType)) {
            return null;
        }
        try {
            JsonAdapter<?> jsonAdapterGeneratedAdapter = Util.generatedAdapter(moshi, type2, rawType);
            if (jsonAdapterGeneratedAdapter != null) {
                return jsonAdapterGeneratedAdapter;
            }
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof ClassNotFoundException)) {
                throw e;
            }
        }
        if (rawType.isLocalClass()) {
            throw new IllegalArgumentException(("Cannot serialize local class or object expression " + rawType.getName()).toString());
        }
        KClass kotlinClass = JvmClassMapping.getKotlinClass(rawType);
        if (kotlinClass.isAbstract()) {
            throw new IllegalArgumentException(("Cannot serialize abstract class " + rawType.getName()).toString());
        }
        if (kotlinClass.isInner()) {
            throw new IllegalArgumentException(("Cannot serialize inner class " + rawType.getName()).toString());
        }
        if (kotlinClass.getObjectInstance() != null) {
            throw new IllegalArgumentException(("Cannot serialize object declaration " + rawType.getName()).toString());
        }
        if (kotlinClass.isSealed()) {
            throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + rawType.getName() + ". Please register an adapter.").toString());
        }
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(kotlinClass);
        if (primaryConstructor == null) {
            return null;
        }
        List<KParameter> parameters = primaryConstructor.getParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(parameters, 10)), 16));
        for (Object obj2 : parameters) {
            linkedHashMap.put(((KParameter) obj2).getName(), obj2);
        }
        boolean z = true;
        KCallablesJvm.setAccessible(primaryConstructor, true);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (KProperty7 kProperty7 : KClasses.getMemberProperties(kotlinClass)) {
            KParameter kParameter = (KParameter) linkedHashMap.get(kProperty7.getName());
            KCallablesJvm.setAccessible(kProperty7, z);
            Iterator<T> it = kProperty7.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = obj;
                    break;
                }
                next = it.next();
                if (((Annotation) next) instanceof Json) {
                    break;
                }
            }
            Json json = (Json) next;
            List mutableList = CollectionsKt.toMutableList((Collection) kProperty7.getAnnotations());
            if (kParameter != null) {
                CollectionsKt.addAll(mutableList, kParameter.getAnnotations());
                if (json == null) {
                    Iterator<T> it2 = kParameter.getAnnotations().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((Annotation) next2) instanceof Json) {
                            break;
                        }
                    }
                    json = (Json) next2;
                }
            }
            Field javaField = ReflectJvmMapping.getJavaField(kProperty7);
            if (Modifier.isTransient(javaField != null ? javaField.getModifiers() : 0)) {
                if (kParameter != null && !kParameter.isOptional()) {
                    throw new IllegalArgumentException(("No default value for transient constructor " + kParameter).toString());
                }
            } else if (json == null || json.ignore() != z) {
                if (kParameter != null && !Intrinsics.areEqual(kParameter.getType(), kProperty7.getReturnType())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('\'');
                    sb.append(kProperty7.getName());
                    sb.append("' has a constructor parameter of type ");
                    Intrinsics.checkNotNull(kParameter);
                    sb.append(kParameter.getType());
                    sb.append(" but a property of type ");
                    sb.append(kProperty7.getReturnType());
                    sb.append('.');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if ((kProperty7 instanceof KProperty4) || kParameter != null) {
                    if (json == null || (name = json.name()) == null) {
                        name = kProperty7.getName();
                        String str = name;
                        classifier = kProperty7.getReturnType().getClassifier();
                        if (!(classifier instanceof KClass)) {
                            KClass kClass = (KClass) classifier;
                            if (kClass.isValue()) {
                                javaType = JvmClassMapping.getJavaClass(kClass);
                                if (!kProperty7.getReturnType().getArguments().isEmpty()) {
                                    List<KTypeProjection> arguments = kProperty7.getReturnType().getArguments();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<T> it3 = arguments.iterator();
                                    while (it3.hasNext()) {
                                        KType type3 = ((KTypeProjection) it3.next()).getType();
                                        Type javaType2 = type3 != null ? ReflectJvmMapping.getJavaType(type3) : null;
                                        if (javaType2 != null) {
                                            arrayList.add(javaType2);
                                        }
                                    }
                                    Type[] typeArr = (Type[]) arrayList.toArray(new Type[0]);
                                    javaType = Types.newParameterizedType(javaType, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                                }
                            } else {
                                javaType = ReflectJvmMapping.getJavaType(kProperty7.getReturnType());
                            }
                        } else {
                            if (!(classifier instanceof KTypeParameter)) {
                                throw new IllegalStateException("Not possible!");
                            }
                            javaType = ReflectJvmMapping.getJavaType(kProperty7.getReturnType());
                        }
                        JsonAdapter adapter = moshi.adapter(Util.resolve(type2, rawType, javaType), Util.jsonAnnotations((Annotation[]) mutableList.toArray(new Annotation[0])), kProperty7.getName());
                        String name2 = kProperty7.getName();
                        Intrinsics.checkNotNullExpressionValue(adapter, "adapter");
                        Intrinsics.checkNotNull(kProperty7, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>");
                        linkedHashMap2.put(name2, new KotlinJsonAdapter.Binding(str, adapter, kProperty7, kParameter, kParameter == null ? kParameter.getIndex() : -1));
                        obj = null;
                        z = true;
                    } else {
                        if (Intrinsics.areEqual(name, "\u0000")) {
                            name = null;
                        }
                        if (name == null) {
                        }
                        String str2 = name;
                        classifier = kProperty7.getReturnType().getClassifier();
                        if (!(classifier instanceof KClass)) {
                        }
                        JsonAdapter adapter2 = moshi.adapter(Util.resolve(type2, rawType, javaType), Util.jsonAnnotations((Annotation[]) mutableList.toArray(new Annotation[0])), kProperty7.getName());
                        String name22 = kProperty7.getName();
                        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter");
                        Intrinsics.checkNotNull(kProperty7, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>");
                        linkedHashMap2.put(name22, new KotlinJsonAdapter.Binding(str2, adapter2, kProperty7, kParameter, kParameter == null ? kParameter.getIndex() : -1));
                        obj = null;
                        z = true;
                    }
                }
            } else if (kParameter != null && !kParameter.isOptional()) {
                throw new IllegalArgumentException(("No default value for ignored constructor " + kParameter).toString());
            }
            obj = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (KParameter kParameter2 : primaryConstructor.getParameters()) {
            KotlinJsonAdapter.Binding binding = (KotlinJsonAdapter.Binding) TypeIntrinsics.asMutableMap(linkedHashMap2).remove(kParameter2.getName());
            if (binding == null && !kParameter2.isOptional()) {
                throw new IllegalArgumentException(("No property for required constructor " + kParameter2).toString());
            }
            arrayList2.add(binding);
        }
        int size = arrayList2.size();
        Iterator it4 = linkedHashMap2.entrySet().iterator();
        while (true) {
            int i = size;
            if (!it4.hasNext()) {
                break;
            }
            size = i + 1;
            arrayList2.add(KotlinJsonAdapter.Binding.copy$default((KotlinJsonAdapter.Binding) ((Map.Entry) it4.next()).getValue(), null, null, null, null, i, 15, null));
        }
        List listFilterNotNull = CollectionsKt.filterNotNull(arrayList2);
        List list = listFilterNotNull;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((KotlinJsonAdapter.Binding) it5.next()).getJsonName());
        }
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        JsonReader.Options options = JsonReader.Options.m3152of((String[]) Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullExpressionValue(options, "options");
        return new KotlinJsonAdapter(primaryConstructor, arrayList2, listFilterNotNull, options).nullSafe();
    }
}
