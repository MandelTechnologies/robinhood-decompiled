package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes21.dex */
abstract class CollectionJsonAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {
    public static final JsonAdapter.Factory FACTORY = new JsonAdapter.Factory() { // from class: com.squareup.moshi.CollectionJsonAdapter.1
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter<?> create(Type type2, Set<? extends Annotation> set, Moshi moshi) {
            Class<?> rawType = Types.getRawType(type2);
            if (!set.isEmpty()) {
                return null;
            }
            if (rawType == List.class || rawType == Collection.class) {
                return CollectionJsonAdapter.newArrayListAdapter(type2, moshi).nullSafe();
            }
            if (rawType == Set.class) {
                return CollectionJsonAdapter.newLinkedHashSetAdapter(type2, moshi).nullSafe();
            }
            return null;
        }
    };
    private final JsonAdapter<T> elementAdapter;

    abstract C newCollection();

    private CollectionJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.elementAdapter = jsonAdapter;
    }

    static <T> JsonAdapter<Collection<T>> newArrayListAdapter(Type type2, Moshi moshi) {
        return new CollectionJsonAdapter<Collection<T>, T>(moshi.adapter(Types.collectionElementType(type2, Collection.class))) { // from class: com.squareup.moshi.CollectionJsonAdapter.2
            @Override // com.squareup.moshi.JsonAdapter
            public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
                return super.fromJson(jsonReader);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.squareup.moshi.JsonAdapter
            public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
                super.toJson(jsonWriter, (JsonWriter) obj);
            }

            @Override // com.squareup.moshi.CollectionJsonAdapter
            Collection<T> newCollection() {
                return new ArrayList();
            }
        };
    }

    static <T> JsonAdapter<Set<T>> newLinkedHashSetAdapter(Type type2, Moshi moshi) {
        return new CollectionJsonAdapter<Set<T>, T>(moshi.adapter(Types.collectionElementType(type2, Collection.class))) { // from class: com.squareup.moshi.CollectionJsonAdapter.3
            @Override // com.squareup.moshi.JsonAdapter
            public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
                return super.fromJson(jsonReader);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.squareup.moshi.JsonAdapter
            public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, Object obj) throws IOException {
                super.toJson(jsonWriter, (JsonWriter) obj);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.squareup.moshi.CollectionJsonAdapter
            public Set<T> newCollection() {
                return new LinkedHashSet();
            }
        };
    }

    @Override // com.squareup.moshi.JsonAdapter
    public C fromJson(JsonReader jsonReader) throws IOException {
        C c = (C) newCollection();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            c.add(this.elementAdapter.fromJson(jsonReader));
        }
        jsonReader.endArray();
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void toJson(JsonWriter jsonWriter, C c) throws IOException {
        jsonWriter.beginArray();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            this.elementAdapter.toJson(jsonWriter, (JsonWriter) it.next());
        }
        jsonWriter.endArray();
    }

    public String toString() {
        return this.elementAdapter + ".collection()";
    }
}
