package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class NonNullJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NonNullJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonReader.Token.NULL) {
            throw new JsonDataException("Unexpected null at " + jsonReader.getPath());
        }
        return this.delegate.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, T t) throws IOException {
        if (t == null) {
            throw new JsonDataException("Unexpected null at " + jsonWriter.getPath());
        }
        this.delegate.toJson(jsonWriter, (JsonWriter) t);
    }

    public String toString() {
        return this.delegate + ".nonNull()";
    }
}
