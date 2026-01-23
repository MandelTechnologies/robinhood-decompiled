package com.robinhood.utils.moshi.jsonadapter;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.extensions.TypesKt;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.ReflectJvmMapping;

/* compiled from: WrappedValue.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0001\u0006R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/WrappedValue;", "T", "", "value", "getValue", "()Ljava/lang/Object;", "JsonAdapterFactory", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface WrappedValue<T> {
    /* renamed from: getValue */
    T getValue2();

    /* compiled from: WrappedValue.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/WrappedValue$JsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class JsonAdapterFactory implements JsonAdapter.Factory {
        public static final JsonAdapterFactory INSTANCE = new JsonAdapterFactory();

        private JsonAdapterFactory() {
        }

        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Class<?> rawType = _MoshiKotlinTypesExtensionsKt.getRawType(type2);
            if (!WrappedValue.class.isAssignableFrom(rawType) || rawType.isInterface() || Modifier.isAbstract(rawType.getModifiers())) {
                return null;
            }
            KClass kotlinClass = JvmClassMapping.getKotlinClass(rawType);
            if (!kotlinClass.isData()) {
                throw new IllegalArgumentException(("Concrete value wrapper classes must be a `data class`: " + kotlinClass).toString());
            }
            KFunction primaryConstructor = KClasses.getPrimaryConstructor(kotlinClass);
            if (primaryConstructor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object objSingleOrNull = CollectionsKt.singleOrNull((List<? extends Object>) primaryConstructor.getParameters());
            if (objSingleOrNull == null) {
                throw new IllegalArgumentException(("Value wrapper data class constructors must contain a single parameter: " + kotlinClass).toString());
            }
            KParameter kParameter = (KParameter) objSingleOrNull;
            if (!Intrinsics.areEqual(kParameter.getName(), "value")) {
                throw new IllegalArgumentException(("Single value wrapper data class constructor parameter must be named `value`: " + kotlinClass).toString());
            }
            Type typeBindingVariablesFrom = TypesKt.bindingVariablesFrom(ReflectJvmMapping.getJavaType(kParameter.getType()), type2);
            Constructor javaConstructor = ReflectJvmMapping.getJavaConstructor(primaryConstructor);
            Intrinsics.checkNotNull(javaConstructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<out com.robinhood.utils.moshi.jsonadapter.WrappedValue<kotlin.Any>>");
            JsonAdapter<T> jsonAdapterAdapter = moshi.adapter(typeBindingVariablesFrom, CollectionsKt.toSet(kParameter.getAnnotations()));
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
            return new Adapter(javaConstructor, jsonAdapterAdapter);
        }

        /* compiled from: WrappedValue.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u0002*\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B%\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00018\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0002H\u0014¢\u0006\u0002\u0010\u0015R\u0016\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/WrappedValue$JsonAdapterFactory$Adapter;", "T", "", "W", "Lcom/robinhood/utils/moshi/jsonadapter/WrappedValue;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "constructor", "Ljava/lang/reflect/Constructor;", "valueJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "<init>", "(Ljava/lang/reflect/Constructor;Lcom/squareup/moshi/JsonAdapter;)V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Lcom/robinhood/utils/moshi/jsonadapter/WrappedValue;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Lcom/robinhood/utils/moshi/jsonadapter/WrappedValue;)V", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        private static final class Adapter<T, W extends WrappedValue<? extends T>> extends NullSafeJsonAdapter<W> {
            private final Constructor<? extends W> constructor;
            private final JsonAdapter<T> valueJsonAdapter;

            public Adapter(Constructor<? extends W> constructor, JsonAdapter<T> valueJsonAdapter) {
                Intrinsics.checkNotNullParameter(constructor, "constructor");
                Intrinsics.checkNotNullParameter(valueJsonAdapter, "valueJsonAdapter");
                this.constructor = constructor;
                this.valueJsonAdapter = valueJsonAdapter;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
            public W readFrom(JsonReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return this.constructor.newInstance(this.valueJsonAdapter.fromJson(reader));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
            public void writeTo(JsonWriter writer, W value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                this.valueJsonAdapter.toJson(writer, (JsonWriter) value.getValue2());
            }
        }
    }
}
