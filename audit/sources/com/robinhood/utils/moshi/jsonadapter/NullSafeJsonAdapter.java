package com.robinhood.utils.moshi.jsonadapter;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NullSafeJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0007H$¢\u0006\u0002\u0010\bJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "readFrom", "writeTo", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class NullSafeJsonAdapter<T> extends JsonAdapter<T> {
    protected abstract T readFrom(JsonReader reader) throws IOException;

    protected abstract void writeTo(JsonWriter writer, T value) throws IOException;

    @Override // com.squareup.moshi.JsonAdapter
    public final T fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.peek() == JsonReader.Token.NULL) {
            return (T) reader.nextNull();
        }
        return readFrom(reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter writer, T value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            writer.nullValue();
        } else {
            writeTo(writer, value);
        }
    }
}
