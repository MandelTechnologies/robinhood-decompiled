package com.squareup.moshi.kotlin.reflect;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty4;
import kotlin.reflect.KProperty7;

/* compiled from: KotlinJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002%&BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0005\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR-\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R+\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, m3636d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/reflect/KFunction;", "constructor", "", "Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "", "allBindings", "nonIgnoredBindings", "Lcom/squareup/moshi/JsonReader$Options;", "options", "<init>", "(Lkotlin/reflect/KFunction;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/JsonReader$Options;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/KFunction;", "getConstructor", "()Lkotlin/reflect/KFunction;", "Ljava/util/List;", "getAllBindings", "()Ljava/util/List;", "getNonIgnoredBindings", "Lcom/squareup/moshi/JsonReader$Options;", "getOptions", "()Lcom/squareup/moshi/JsonReader$Options;", "Binding", "IndexedParameterMap", "moshi-kotlin"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class KotlinJsonAdapter<T> extends JsonAdapter<T> {
    private final List<Binding<T, Object>> allBindings;
    private final KFunction<T> constructor;
    private final List<Binding<T, Object>> nonIgnoredBindings;
    private final JsonReader.Options options;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinJsonAdapter(KFunction<? extends T> constructor, List<Binding<T, Object>> allBindings, List<Binding<T, Object>> nonIgnoredBindings, JsonReader.Options options) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(allBindings, "allBindings");
        Intrinsics.checkNotNullParameter(nonIgnoredBindings, "nonIgnoredBindings");
        Intrinsics.checkNotNullParameter(options, "options");
        this.constructor = constructor;
        this.allBindings = allBindings;
        this.nonIgnoredBindings = nonIgnoredBindings;
        this.options = options;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader reader) throws IOException {
        T tCallBy;
        Intrinsics.checkNotNullParameter(reader, "reader");
        int size = this.constructor.getParameters().size();
        int size2 = this.allBindings.size();
        Object[] objArr = new Object[size2];
        for (int i = 0; i < size2; i++) {
            objArr[i] = KotlinJsonAdapter3.ABSENT_VALUE;
        }
        reader.beginObject();
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else {
                Binding<T, Object> binding = this.nonIgnoredBindings.get(iSelectName);
                int propertyIndex = binding.getPropertyIndex();
                if (objArr[propertyIndex] != KotlinJsonAdapter3.ABSENT_VALUE) {
                    throw new JsonDataException("Multiple values for '" + binding.getProperty().getName() + "' at " + reader.getPath());
                }
                Object objFromJson = binding.getAdapter().fromJson(reader);
                objArr[propertyIndex] = objFromJson;
                if (objFromJson == null && !binding.getProperty().getReturnType().isMarkedNullable()) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull(binding.getProperty().getName(), binding.getJsonName(), reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "unexpectedNull(\n        …         reader\n        )");
                    throw jsonDataExceptionUnexpectedNull;
                }
            }
        }
        reader.endObject();
        boolean z = this.allBindings.size() == size;
        for (int i2 = 0; i2 < size; i2++) {
            if (objArr[i2] == KotlinJsonAdapter3.ABSENT_VALUE) {
                if (this.constructor.getParameters().get(i2).isOptional()) {
                    z = false;
                } else {
                    if (!this.constructor.getParameters().get(i2).getType().isMarkedNullable()) {
                        String name = this.constructor.getParameters().get(i2).getName();
                        Binding<T, Object> binding2 = this.allBindings.get(i2);
                        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(name, binding2 != null ? binding2.getJsonName() : null, reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "missingProperty(\n       …       reader\n          )");
                        throw jsonDataExceptionMissingProperty;
                    }
                    objArr[i2] = null;
                }
            }
        }
        if (z) {
            tCallBy = this.constructor.call(Arrays.copyOf(objArr, size2));
        } else {
            tCallBy = this.constructor.callBy(new IndexedParameterMap(this.constructor.getParameters(), objArr));
        }
        int size3 = this.allBindings.size();
        while (size < size3) {
            Binding binding3 = this.allBindings.get(size);
            Intrinsics.checkNotNull(binding3);
            binding3.set(tCallBy, objArr[size]);
            size++;
        }
        return tCallBy;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, T value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value == null");
        }
        writer.beginObject();
        for (Binding<T, Object> binding : this.allBindings) {
            if (binding != null) {
                writer.name(binding.getJsonName());
                binding.getAdapter().toJson(writer, (JsonWriter) binding.get(value));
            }
        }
        writer.endObject();
    }

    public String toString() {
        return "KotlinJsonAdapter(" + this.constructor.getReturnType() + ')';
    }

    /* compiled from: KotlinJsonAdapter.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jb\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u001c¨\u0006."}, m3636d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "K", "P", "", "", "jsonName", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "Lkotlin/reflect/KProperty1;", "property", "Lkotlin/reflect/KParameter;", "parameter", "", "propertyIndex", "<init>", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KParameter;I)V", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "result", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "copy", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KParameter;I)Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJsonName", "Lcom/squareup/moshi/JsonAdapter;", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/reflect/KProperty1;", "getProperty", "()Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/KParameter;", "getParameter", "()Lkotlin/reflect/KParameter;", "I", "getPropertyIndex", "moshi-kotlin"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final /* data */ class Binding<K, P> {
        private final JsonAdapter<P> adapter;
        private final String jsonName;
        private final KParameter parameter;
        private final KProperty7<K, P> property;
        private final int propertyIndex;

        public static /* synthetic */ Binding copy$default(Binding binding, String str, JsonAdapter jsonAdapter, KProperty7 kProperty7, KParameter kParameter, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = binding.jsonName;
            }
            if ((i2 & 2) != 0) {
                jsonAdapter = binding.adapter;
            }
            if ((i2 & 4) != 0) {
                kProperty7 = binding.property;
            }
            if ((i2 & 8) != 0) {
                kParameter = binding.parameter;
            }
            if ((i2 & 16) != 0) {
                i = binding.propertyIndex;
            }
            int i3 = i;
            KProperty7 kProperty72 = kProperty7;
            return binding.copy(str, jsonAdapter, kProperty72, kParameter, i3);
        }

        public final Binding<K, P> copy(String jsonName, JsonAdapter<P> adapter, KProperty7<K, ? extends P> property, KParameter parameter, int propertyIndex) {
            Intrinsics.checkNotNullParameter(jsonName, "jsonName");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(property, "property");
            return new Binding<>(jsonName, adapter, property, parameter, propertyIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Binding)) {
                return false;
            }
            Binding binding = (Binding) other;
            return Intrinsics.areEqual(this.jsonName, binding.jsonName) && Intrinsics.areEqual(this.adapter, binding.adapter) && Intrinsics.areEqual(this.property, binding.property) && Intrinsics.areEqual(this.parameter, binding.parameter) && this.propertyIndex == binding.propertyIndex;
        }

        public int hashCode() {
            int iHashCode = ((((this.jsonName.hashCode() * 31) + this.adapter.hashCode()) * 31) + this.property.hashCode()) * 31;
            KParameter kParameter = this.parameter;
            return ((iHashCode + (kParameter == null ? 0 : kParameter.hashCode())) * 31) + Integer.hashCode(this.propertyIndex);
        }

        public String toString() {
            return "Binding(jsonName=" + this.jsonName + ", adapter=" + this.adapter + ", property=" + this.property + ", parameter=" + this.parameter + ", propertyIndex=" + this.propertyIndex + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Binding(String jsonName, JsonAdapter<P> adapter, KProperty7<K, ? extends P> property, KParameter kParameter, int i) {
            Intrinsics.checkNotNullParameter(jsonName, "jsonName");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(property, "property");
            this.jsonName = jsonName;
            this.adapter = adapter;
            this.property = property;
            this.parameter = kParameter;
            this.propertyIndex = i;
        }

        public final String getJsonName() {
            return this.jsonName;
        }

        public final JsonAdapter<P> getAdapter() {
            return this.adapter;
        }

        public final KProperty7<K, P> getProperty() {
            return this.property;
        }

        public final int getPropertyIndex() {
            return this.propertyIndex;
        }

        public final P get(K value) {
            return this.property.get(value);
        }

        public final void set(K result, P value) {
            if (value != KotlinJsonAdapter3.ABSENT_VALUE) {
                KProperty7<K, P> kProperty7 = this.property;
                Intrinsics.checkNotNull(kProperty7, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding, P of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding>");
                ((KProperty4) kProperty7).set(result, value);
            }
        }
    }

    /* compiled from: KotlinJsonAdapter.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016R(\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$IndexedParameterMap;", "Lkotlin/collections/AbstractMutableMap;", "Lkotlin/reflect/KParameter;", "", "parameterKeys", "", "parameterValues", "", "(Ljava/util/List;[Ljava/lang/Object;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "[Ljava/lang/Object;", "containsKey", "", "key", "get", "put", "value", "moshi-kotlin"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes12.dex */
    public static final class IndexedParameterMap extends AbstractMutableMap<KParameter, Object> {
        private final List<KParameter> parameterKeys;
        private final Object[] parameterValues;

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(KParameter key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof KParameter) {
                return containsKey((KParameter) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof KParameter) {
                return get((KParameter) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof KParameter) ? obj2 : getOrDefault((KParameter) obj, obj2);
        }

        public /* bridge */ Object getOrDefault(KParameter kParameter, Object obj) {
            return super.getOrDefault((Object) kParameter, (KParameter) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof KParameter) {
                return remove((KParameter) obj);
            }
            return null;
        }

        public /* bridge */ Object remove(KParameter kParameter) {
            return super.remove((Object) kParameter);
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof KParameter) {
                return remove((KParameter) obj, obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(KParameter kParameter, Object obj) {
            return super.remove((Object) kParameter, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IndexedParameterMap(List<? extends KParameter> parameterKeys, Object[] parameterValues) {
            Intrinsics.checkNotNullParameter(parameterKeys, "parameterKeys");
            Intrinsics.checkNotNullParameter(parameterValues, "parameterValues");
            this.parameterKeys = parameterKeys;
            this.parameterValues = parameterValues;
        }

        @Override // kotlin.collections.AbstractMutableMap
        public Set<Map.Entry<KParameter, Object>> getEntries() {
            List<KParameter> list = this.parameterKeys;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new AbstractMap.SimpleEntry((KParameter) t, this.parameterValues[i]));
                i = i2;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t2 : arrayList) {
                if (((AbstractMap.SimpleEntry) t2).getValue() != KotlinJsonAdapter3.ABSENT_VALUE) {
                    linkedHashSet.add(t2);
                }
            }
            return linkedHashSet;
        }

        public boolean containsKey(KParameter key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.parameterValues[key.getIndex()] != KotlinJsonAdapter3.ABSENT_VALUE;
        }

        public Object get(KParameter key) {
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = this.parameterValues[key.getIndex()];
            if (obj != KotlinJsonAdapter3.ABSENT_VALUE) {
                return obj;
            }
            return null;
        }
    }
}
