package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.internal.JsonFormatter;
import com.squareup.wire.internal.JsonIntegration;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoshiJsonIntegration.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0001:\u0003\u0016\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J(\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J4\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0016J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016¨\u0006\u0019"}, m3636d2 = {"Lcom/squareup/wire/MoshiJsonIntegration;", "Lcom/squareup/wire/internal/JsonIntegration;", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/JsonAdapter;", "", "<init>", "()V", "frameworkAdapter", "framework", "type", "Ljava/lang/reflect/Type;", "listAdapter", "elementAdapter", "skipNull", "", "mapAdapter", "keyFormatter", "Lcom/squareup/wire/internal/JsonFormatter;", "valueAdapter", "structAdapter", "formatterAdapter", "jsonStringAdapter", "FormatterJsonAdapter", "ListJsonAdapter", "MapJsonAdapter", "wire-moshi-adapter"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MoshiJsonIntegration extends JsonIntegration<Moshi, JsonAdapter<Object>> {
    public static final MoshiJsonIntegration INSTANCE = new MoshiJsonIntegration();

    private MoshiJsonIntegration() {
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public /* bridge */ /* synthetic */ JsonAdapter<Object> formatterAdapter(JsonFormatter jsonFormatter) {
        return formatterAdapter((JsonFormatter<?>) jsonFormatter);
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public /* bridge */ /* synthetic */ JsonAdapter<Object> mapAdapter(Moshi moshi, JsonFormatter jsonFormatter, JsonAdapter<Object> jsonAdapter) {
        return mapAdapter2(moshi, (JsonFormatter<?>) jsonFormatter, jsonAdapter);
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> frameworkAdapter(Moshi framework, Type type2) {
        Intrinsics.checkNotNullParameter(framework, "framework");
        Intrinsics.checkNotNullParameter(type2, "type");
        JsonAdapter<Object> jsonAdapterNullSafe = framework.adapter(type2).nullSafe();
        Intrinsics.checkNotNullExpressionValue(jsonAdapterNullSafe, "nullSafe(...)");
        return jsonAdapterNullSafe;
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> listAdapter(JsonAdapter<Object> elementAdapter, boolean skipNull) {
        Intrinsics.checkNotNullParameter(elementAdapter, "elementAdapter");
        JsonAdapter<List<? extends T>> jsonAdapterNullSafe = new ListJsonAdapter(elementAdapter, skipNull).nullSafe();
        Intrinsics.checkNotNull(jsonAdapterNullSafe, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<kotlin.Any?>");
        return jsonAdapterNullSafe;
    }

    /* renamed from: mapAdapter, reason: avoid collision after fix types in other method */
    public JsonAdapter<Object> mapAdapter2(Moshi framework, JsonFormatter<?> keyFormatter, JsonAdapter<Object> valueAdapter) {
        Intrinsics.checkNotNullParameter(framework, "framework");
        Intrinsics.checkNotNullParameter(keyFormatter, "keyFormatter");
        Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
        JsonAdapter<Map<K, ? extends V>> jsonAdapterNullSafe = new MapJsonAdapter(keyFormatter, valueAdapter).nullSafe();
        Intrinsics.checkNotNull(jsonAdapterNullSafe, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<kotlin.Any?>");
        return jsonAdapterNullSafe;
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> structAdapter(Moshi framework) {
        Intrinsics.checkNotNullParameter(framework, "framework");
        JsonAdapter<Object> jsonAdapterNullSafe = framework.adapter(Object.class).serializeNulls().nullSafe();
        Intrinsics.checkNotNullExpressionValue(jsonAdapterNullSafe, "nullSafe(...)");
        return jsonAdapterNullSafe;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> formatterAdapter(JsonFormatter<?> jsonStringAdapter) {
        Intrinsics.checkNotNullParameter(jsonStringAdapter, "jsonStringAdapter");
        JsonAdapter<T> jsonAdapterNullSafe = new FormatterJsonAdapter(jsonStringAdapter).nullSafe();
        Intrinsics.checkNotNull(jsonAdapterNullSafe, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<kotlin.Any?>");
        return jsonAdapterNullSafe;
    }

    /* compiled from: MoshiJsonIntegration.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/squareup/wire/MoshiJsonIntegration$FormatterJsonAdapter;", "T", "", "Lcom/squareup/moshi/JsonAdapter;", "formatter", "Lcom/squareup/wire/internal/JsonFormatter;", "<init>", "(Lcom/squareup/wire/internal/JsonFormatter;)V", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "wire-moshi-adapter"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private static final class FormatterJsonAdapter<T> extends JsonAdapter<T> {
        private final JsonFormatter<T> formatter;

        public FormatterJsonAdapter(JsonFormatter<T> formatter) {
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            this.formatter = formatter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, T value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            JsonFormatter<T> jsonFormatter = this.formatter;
            Intrinsics.checkNotNull(value);
            Object stringOrNumber = jsonFormatter.toStringOrNumber(value);
            if (stringOrNumber instanceof Number) {
                writer.value((Number) stringOrNumber);
            } else {
                Intrinsics.checkNotNull(stringOrNumber, "null cannot be cast to non-null type kotlin.String");
                writer.value((String) stringOrNumber);
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            String strNextString = reader.nextString();
            try {
                JsonFormatter<T> jsonFormatter = this.formatter;
                Intrinsics.checkNotNull(strNextString);
                return jsonFormatter.fromString(strNextString);
            } catch (RuntimeException unused) {
                throw new JsonDataException("decode failed: " + strNextString + " at path " + reader.getPath());
            }
        }
    }

    /* compiled from: MoshiJsonIntegration.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u00030\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/squareup/wire/MoshiJsonIntegration$ListJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "", "single", "skipNull", "", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Z)V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "wire-moshi-adapter"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private static final class ListJsonAdapter<T> extends JsonAdapter<List<? extends T>> {
        private final JsonAdapter<T> single;
        private final boolean skipNull;

        public ListJsonAdapter(JsonAdapter<T> single, boolean z) {
            Intrinsics.checkNotNullParameter(single, "single");
            this.single = single;
            this.skipNull = z;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public List<T> fromJson(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            ArrayList arrayList = new ArrayList();
            reader.beginArray();
            while (reader.hasNext()) {
                T tFromJson = this.single.fromJson(reader);
                if (tFromJson != null || !this.skipNull) {
                    arrayList.add(tFromJson);
                }
            }
            reader.endArray();
            return arrayList;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, List<? extends T> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.beginArray();
            Intrinsics.checkNotNull(value);
            Iterator<? extends T> it = value.iterator();
            while (it.hasNext()) {
                this.single.toJson(writer, (JsonWriter) it.next());
            }
            writer.endArray();
        }
    }

    /* compiled from: MoshiJsonIntegration.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00050\u0004B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/squareup/wire/MoshiJsonIntegration$MapJsonAdapter;", "K", "", "V", "Lcom/squareup/moshi/JsonAdapter;", "", "keyFormatter", "Lcom/squareup/wire/internal/JsonFormatter;", "valueAdapter", "<init>", "(Lcom/squareup/wire/internal/JsonFormatter;Lcom/squareup/moshi/JsonAdapter;)V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "wire-moshi-adapter"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    private static final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, ? extends V>> {
        private final JsonFormatter<K> keyFormatter;
        private final JsonAdapter<V> valueAdapter;

        public MapJsonAdapter(JsonFormatter<K> keyFormatter, JsonAdapter<V> valueAdapter) {
            Intrinsics.checkNotNullParameter(keyFormatter, "keyFormatter");
            Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
            this.keyFormatter = keyFormatter;
            this.valueAdapter = valueAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Map<K, V> fromJson(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            reader.beginObject();
            while (reader.hasNext()) {
                String strNextName = reader.nextName();
                JsonFormatter<K> jsonFormatter = this.keyFormatter;
                Intrinsics.checkNotNull(strNextName);
                K kFromString = jsonFormatter.fromString(strNextName);
                Intrinsics.checkNotNull(kFromString, "null cannot be cast to non-null type K of com.squareup.wire.MoshiJsonIntegration.MapJsonAdapter");
                V vFromJson = this.valueAdapter.fromJson(reader);
                Intrinsics.checkNotNull(vFromJson);
                Intrinsics.checkNotNullExpressionValue(vFromJson, "CHECK_NOT_NULL(...)");
                linkedHashMap.put(kFromString, vFromJson);
            }
            reader.endObject();
            return linkedHashMap;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, Map<K, ? extends V> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.beginObject();
            Intrinsics.checkNotNull(value);
            for (Map.Entry<K, ? extends V> entry : value.entrySet()) {
                K key = entry.getKey();
                V value2 = entry.getValue();
                writer.name(this.keyFormatter.toStringOrNumber(key).toString());
                this.valueAdapter.toJson(writer, (JsonWriter) value2);
            }
            writer.endObject();
        }
    }
}
