package com.robinhood.utils.moshi.jsonadapter;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.ImmutableSet3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ImmutableSetJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/ImmutableSetJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ImmutableSetJsonAdapterFactory implements JsonAdapter.Factory {
    public static final ImmutableSetJsonAdapterFactory INSTANCE = new ImmutableSetJsonAdapterFactory();

    private ImmutableSetJsonAdapterFactory() {
    }

    /* compiled from: ImmutableSetJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\nH\u0014J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/ImmutableSetJsonAdapterFactory$Adapter;", "E", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lkotlinx/collections/immutable/ImmutableSet;", "valueAdapter", "Lcom/squareup/moshi/JsonAdapter;", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class Adapter<E> extends NullSafeJsonAdapter<ImmutableSet<? extends E>> {
        private final JsonAdapter<E> valueAdapter;

        public Adapter(JsonAdapter<E> valueAdapter) {
            Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
            this.valueAdapter = valueAdapter;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public ImmutableSet<E> readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            ImmutableSet3.Builder builder = extensions2.persistentSetOf().builder();
            reader.beginArray();
            while (reader.hasNext()) {
                builder.add(this.valueAdapter.fromJson(reader));
            }
            reader.endArray();
            return builder.build();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, ImmutableSet<? extends E> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginArray();
            Iterator<? extends E> it = value.iterator();
            while (it.hasNext()) {
                this.valueAdapter.toJson(writer, (JsonWriter) it.next());
            }
            writer.endArray();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Class<?> rawType = Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (!ImmutableSet.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        JsonAdapter jsonAdapterAdapter = moshi.adapter((Type) ArraysKt.single(actualTypeArguments));
        Intrinsics.checkNotNull(jsonAdapterAdapter);
        return new Adapter(jsonAdapterAdapter);
    }
}
