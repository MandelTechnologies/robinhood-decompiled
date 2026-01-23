package com.robinhood.utils.moshi.jsonadapter;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.extensions.Lists4;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: IntLabelsPolymorphicJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002*+BM\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00042\u0006\u0010\u001c\u001a\u00020\tJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010 J\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\"J.\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u000b2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&2\u0006\u0010(\u001a\u00020)H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001b\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/IntLabelsPolymorphicJsonAdapterFactory;", "T", "Lcom/squareup/moshi/JsonAdapter$Factory;", "baseType", "Ljava/lang/Class;", "labelKey", "", "labels", "", "", "subtypes", "Ljava/lang/reflect/Type;", "fallbackJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "<init>", "(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/JsonAdapter;)V", "getBaseType", "()Ljava/lang/Class;", "getLabelKey", "()Ljava/lang/String;", "getLabels", "()Ljava/util/List;", "getSubtypes", "getFallbackJsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "withSubtype", "subtype", AnnotatedPrivateKey.LABEL, "withFallbackJsonAdapter", "withDefaultValue", "defaultValue", "(Ljava/lang/Object;)Lcom/robinhood/utils/moshi/jsonadapter/IntLabelsPolymorphicJsonAdapterFactory;", "buildFallbackJsonAdapter", "(Ljava/lang/Object;)Lcom/squareup/moshi/JsonAdapter;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "type", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "IntLabelsPolymorphicJsonAdapter", "Companion", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IntLabelsPolymorphicJsonAdapterFactory<T> implements JsonAdapter.Factory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Class<T> baseType;
    private final JsonAdapter<Object> fallbackJsonAdapter;
    private final String labelKey;
    private final List<Integer> labels;
    private final List<Type> subtypes;

    /* JADX WARN: Multi-variable type inference failed */
    public IntLabelsPolymorphicJsonAdapterFactory(Class<T> baseType, String labelKey, List<Integer> labels, List<? extends Type> subtypes, JsonAdapter<Object> jsonAdapter) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter(labelKey, "labelKey");
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(subtypes, "subtypes");
        this.baseType = baseType;
        this.labelKey = labelKey;
        this.labels = labels;
        this.subtypes = subtypes;
        this.fallbackJsonAdapter = jsonAdapter;
    }

    public final Class<T> getBaseType() {
        return this.baseType;
    }

    public final String getLabelKey() {
        return this.labelKey;
    }

    public final List<Integer> getLabels() {
        return this.labels;
    }

    public final List<Type> getSubtypes() {
        return this.subtypes;
    }

    public final JsonAdapter<Object> getFallbackJsonAdapter() {
        return this.fallbackJsonAdapter;
    }

    public final IntLabelsPolymorphicJsonAdapterFactory<T> withSubtype(Class<? extends T> subtype, int label) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        if (this.labels.contains(Integer.valueOf(label))) {
            throw new IllegalStateException("Labels must be unique.");
        }
        return new IntLabelsPolymorphicJsonAdapterFactory<>(this.baseType, this.labelKey, CollectionsKt.plus((Collection<? extends Integer>) Lists4.toArrayList(this.labels), Integer.valueOf(label)), CollectionsKt.plus((Collection<? extends Class<? extends T>>) Lists4.toArrayList(this.subtypes), subtype), this.fallbackJsonAdapter);
    }

    public final IntLabelsPolymorphicJsonAdapterFactory<T> withFallbackJsonAdapter(JsonAdapter<Object> fallbackJsonAdapter) {
        return new IntLabelsPolymorphicJsonAdapterFactory<>(this.baseType, this.labelKey, this.labels, this.subtypes, fallbackJsonAdapter);
    }

    public final IntLabelsPolymorphicJsonAdapterFactory<T> withDefaultValue(T defaultValue) {
        return withFallbackJsonAdapter(buildFallbackJsonAdapter(defaultValue));
    }

    private final JsonAdapter<Object> buildFallbackJsonAdapter(final T defaultValue) {
        return new JsonAdapter<Object>() { // from class: com.robinhood.utils.moshi.jsonadapter.IntLabelsPolymorphicJsonAdapterFactory.buildFallbackJsonAdapter.1
            @Override // com.squareup.moshi.JsonAdapter
            public Object fromJson(JsonReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                reader.skipValue();
                return defaultValue;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter writer, Object value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                throw new IllegalArgumentException("Expected one of " + this.getSubtypes() + " but found " + value + ", a " + (value != null ? value.getClass() : null) + ". Register this subtype.");
            }
        };
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        if (!Intrinsics.areEqual(Types.getRawType(type2), this.baseType) || !annotations.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.subtypes.size());
        Iterator<Type> it = this.subtypes.iterator();
        while (it.hasNext()) {
            JsonAdapter<T> jsonAdapterAdapter = moshi.adapter(it.next());
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
            arrayList.add(jsonAdapterAdapter);
        }
        return new IntLabelsPolymorphicJsonAdapter(this.labelKey, this.labels, this.subtypes, arrayList, this.fallbackJsonAdapter).nullSafe();
    }

    /* compiled from: IntLabelsPolymorphicJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0006\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001b\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/IntLabelsPolymorphicJsonAdapterFactory$IntLabelsPolymorphicJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "labelKey", "", "labels", "", "", "subtypes", "Ljava/lang/reflect/Type;", "jsonAdapters", "fallbackJsonAdapter", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/JsonAdapter;)V", "getLabelKey", "()Ljava/lang/String;", "getLabels", "()Ljava/util/List;", "getSubtypes", "getJsonAdapters", "getFallbackJsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "labelKeyOptions", "Lcom/squareup/moshi/JsonReader$Options;", "getLabelKeyOptions", "()Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "labelIndex", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes12.dex */
    public static final class IntLabelsPolymorphicJsonAdapter extends JsonAdapter<Object> {
        private final JsonAdapter<Object> fallbackJsonAdapter;
        private final List<JsonAdapter<Object>> jsonAdapters;
        private final String labelKey;
        private final JsonReader.Options labelKeyOptions;
        private final List<Integer> labels;
        private final List<Type> subtypes;

        public final String getLabelKey() {
            return this.labelKey;
        }

        public final List<Integer> getLabels() {
            return this.labels;
        }

        public final List<Type> getSubtypes() {
            return this.subtypes;
        }

        public final List<JsonAdapter<Object>> getJsonAdapters() {
            return this.jsonAdapters;
        }

        public final JsonAdapter<Object> getFallbackJsonAdapter() {
            return this.fallbackJsonAdapter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IntLabelsPolymorphicJsonAdapter(String labelKey, List<Integer> labels, List<? extends Type> subtypes, List<? extends JsonAdapter<Object>> jsonAdapters, JsonAdapter<Object> jsonAdapter) {
            Intrinsics.checkNotNullParameter(labelKey, "labelKey");
            Intrinsics.checkNotNullParameter(labels, "labels");
            Intrinsics.checkNotNullParameter(subtypes, "subtypes");
            Intrinsics.checkNotNullParameter(jsonAdapters, "jsonAdapters");
            this.labelKey = labelKey;
            this.labels = labels;
            this.subtypes = subtypes;
            this.jsonAdapters = jsonAdapters;
            this.fallbackJsonAdapter = jsonAdapter;
            JsonReader.Options optionsM3152of = JsonReader.Options.m3152of(labelKey);
            Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
            this.labelKeyOptions = optionsM3152of;
        }

        public final JsonReader.Options getLabelKeyOptions() {
            return this.labelKeyOptions;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            JsonReader jsonReaderPeekJson = reader.peekJson();
            jsonReaderPeekJson.setFailOnUnknown(false);
            try {
                Intrinsics.checkNotNull(jsonReaderPeekJson);
                int iLabelIndex = labelIndex(jsonReaderPeekJson);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(jsonReaderPeekJson, null);
                if (iLabelIndex == -1) {
                    JsonAdapter<Object> jsonAdapter = this.fallbackJsonAdapter;
                    if (jsonAdapter != null) {
                        return jsonAdapter.fromJson(reader);
                    }
                    return null;
                }
                return this.jsonAdapters.get(iLabelIndex).fromJson(reader);
            } finally {
            }
        }

        private final int labelIndex(JsonReader reader) throws IOException {
            reader.beginObject();
            while (reader.hasNext()) {
                if (reader.selectName(this.labelKeyOptions) == -1) {
                    reader.skipName();
                    reader.skipValue();
                } else {
                    int iNextInt = reader.nextInt();
                    int iIndexOf = this.labels.indexOf(Integer.valueOf(iNextInt));
                    if (iIndexOf != -1 || this.fallbackJsonAdapter != null) {
                        return iIndexOf;
                    }
                    throw new JsonDataException("Expected one of " + this.labels + " for key '" + this.labelKey + "' but found '" + iNextInt + "'. Register a subtype for this label.");
                }
            }
            throw new JsonDataException("Missing label for " + this.labelKey);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, Object value) throws IOException {
            JsonAdapter<Object> jsonAdapter;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNull(value);
            int iIndexOf = this.subtypes.indexOf(value.getClass());
            if (iIndexOf == -1) {
                jsonAdapter = this.fallbackJsonAdapter;
                if (jsonAdapter == null) {
                    throw new IllegalArgumentException(("Expected one of " + this.subtypes + " but found " + value + ", a " + value.getClass() + ". Register this subtype.").toString());
                }
            } else {
                jsonAdapter = this.jsonAdapters.get(iIndexOf);
            }
            writer.beginObject();
            if (jsonAdapter != this.fallbackJsonAdapter) {
                writer.name(this.labelKey).value(this.labels.get(iIndexOf));
            }
            int iBeginFlatten = writer.beginFlatten();
            jsonAdapter.toJson(writer, (JsonWriter) value);
            writer.endFlatten(iBeginFlatten);
            writer.endObject();
        }

        public String toString() {
            return "IntLabelsPolymorphicJsonAdapter(" + this.labelKey + ")";
        }
    }

    /* compiled from: IntLabelsPolymorphicJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/IntLabelsPolymorphicJsonAdapterFactory$Companion;", "", "<init>", "()V", "of", "Lcom/robinhood/utils/moshi/jsonadapter/IntLabelsPolymorphicJsonAdapterFactory;", "T", "baseType", "Ljava/lang/Class;", "labelKey", "", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: of */
        public final <T> IntLabelsPolymorphicJsonAdapterFactory<T> m2983of(Class<T> baseType, String labelKey) {
            Intrinsics.checkNotNullParameter(baseType, "baseType");
            Intrinsics.checkNotNullParameter(labelKey, "labelKey");
            return new IntLabelsPolymorphicJsonAdapterFactory<>(baseType, labelKey, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null);
        }
    }
}
