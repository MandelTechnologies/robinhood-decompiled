package com.robinhood.utils.moshi.jsonadapter;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ObjectJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\nH\u0014¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011R\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/ObjectJsonAdapter;", "T", "", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "instance", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ObjectJsonAdapter<T> extends NullSafeJsonAdapter<T> {
    private final T instance;

    public ObjectJsonAdapter(T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.instance = instance;
    }

    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    protected T readFrom(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        while (reader.hasNext()) {
            reader.skipName();
            reader.skipValue();
        }
        reader.endObject();
        return this.instance;
    }

    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    protected void writeTo(JsonWriter writer, T value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.beginObject().endObject();
    }
}
