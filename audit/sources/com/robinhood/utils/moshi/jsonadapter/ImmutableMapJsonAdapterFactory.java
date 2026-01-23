package com.robinhood.utils.moshi.jsonadapter;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ImmutableMapJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/ImmutableMapJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ImmutableMapJsonAdapterFactory implements JsonAdapter.Factory {
    public static final ImmutableMapJsonAdapterFactory INSTANCE = new ImmutableMapJsonAdapterFactory();

    private ImmutableMapJsonAdapterFactory() {
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        if (!(type2 instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type2;
        Type rawType = parameterizedType.getRawType();
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (!ImmutableMap.class.isAssignableFrom(_MoshiKotlinTypesExtensionsKt.getRawType(rawType))) {
            return null;
        }
        Type type3 = parameterizedType.getActualTypeArguments()[0];
        Type type4 = parameterizedType.getActualTypeArguments()[1];
        JsonAdapter jsonAdapterAdapter = moshi.adapter(type3);
        JsonAdapter jsonAdapterAdapter2 = moshi.adapter(type4);
        Intrinsics.checkNotNull(jsonAdapterAdapter);
        Intrinsics.checkNotNull(jsonAdapterAdapter2);
        return new Adapter(jsonAdapterAdapter, jsonAdapterAdapter2);
    }

    /* compiled from: ImmutableMapJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0014J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/ImmutableMapJsonAdapterFactory$Adapter;", "K", "V", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lkotlinx/collections/immutable/ImmutableMap;", "keyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "valueAdapter", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes12.dex */
    private static final class Adapter<K, V> extends NullSafeJsonAdapter<ImmutableMap<K, ? extends V>> {
        private final JsonAdapter<K> keyAdapter;
        private final JsonAdapter<V> valueAdapter;

        public Adapter(JsonAdapter<K> keyAdapter, JsonAdapter<V> valueAdapter) {
            Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
            Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
            this.keyAdapter = keyAdapter;
            this.valueAdapter = valueAdapter;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public ImmutableMap<K, V> readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            ImmutableMap3.Builder builder = extensions2.persistentMapOf().builder();
            JsonAdapter<K> jsonAdapterLenient = this.keyAdapter.lenient();
            reader.setLenient(true);
            reader.beginObject();
            while (reader.hasNext()) {
                K kFromJson = jsonAdapterLenient.fromJson(reader.nextName());
                V vFromJson = this.valueAdapter.fromJson(reader);
                if (kFromJson == null || vFromJson == null) {
                    break;
                }
                builder.put(kFromJson, vFromJson);
            }
            reader.endObject();
            return builder.build();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, ImmutableMap<K, ? extends V> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginObject();
            Iterator<T> it = value.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                writer.name(String.valueOf(this.keyAdapter.toJsonValue(entry.getKey())));
                this.valueAdapter.toJson(writer, (JsonWriter) entry.getValue());
            }
            writer.endObject();
        }
    }
}
