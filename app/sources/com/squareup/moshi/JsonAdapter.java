package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;

/* loaded from: classes21.dex */
public abstract class JsonAdapter<T> {

    public interface Factory {
        JsonAdapter<?> create(Type type2, Set<? extends Annotation> set, Moshi moshi);
    }

    public abstract T fromJson(JsonReader jsonReader) throws IOException;

    boolean isLenient() {
        return false;
    }

    public abstract void toJson(JsonWriter jsonWriter, T t) throws IOException;

    public final T fromJson(BufferedSource bufferedSource) throws IOException {
        return fromJson(JsonReader.m3151of(bufferedSource));
    }

    public final T fromJson(String str) throws IOException {
        JsonReader jsonReaderM3151of = JsonReader.m3151of(new Buffer().writeUtf8(str));
        T tFromJson = fromJson(jsonReaderM3151of);
        if (isLenient() || jsonReaderM3151of.peek() == JsonReader.Token.END_DOCUMENT) {
            return tFromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final void toJson(BufferedSink bufferedSink, T t) throws IOException {
        toJson(JsonWriter.m3153of(bufferedSink), (JsonWriter) t);
    }

    public final String toJson(T t) {
        Buffer buffer = new Buffer();
        try {
            toJson((BufferedSink) buffer, (Buffer) t);
            return buffer.readUtf8();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final Object toJsonValue(T t) {
        JsonValueWriter jsonValueWriter = new JsonValueWriter();
        try {
            toJson((JsonWriter) jsonValueWriter, (JsonValueWriter) t);
            return jsonValueWriter.root();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new JsonValueReader(obj));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final JsonAdapter<T> serializeNulls() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.1
            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader jsonReader) throws IOException {
                return (T) this.fromJson(jsonReader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, T t) throws IOException {
                boolean serializeNulls = jsonWriter.getSerializeNulls();
                jsonWriter.setSerializeNulls(true);
                try {
                    this.toJson(jsonWriter, (JsonWriter) t);
                } finally {
                    jsonWriter.setSerializeNulls(serializeNulls);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            boolean isLenient() {
                return this.isLenient();
            }

            public String toString() {
                return this + ".serializeNulls()";
            }
        };
    }

    public final JsonAdapter<T> nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    public final JsonAdapter<T> nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    public final JsonAdapter<T> lenient() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.2
            @Override // com.squareup.moshi.JsonAdapter
            boolean isLenient() {
                return true;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader jsonReader) throws IOException {
                boolean zIsLenient = jsonReader.isLenient();
                jsonReader.setLenient(true);
                try {
                    return (T) this.fromJson(jsonReader);
                } finally {
                    jsonReader.setLenient(zIsLenient);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, T t) throws IOException {
                boolean zIsLenient = jsonWriter.isLenient();
                jsonWriter.setLenient(true);
                try {
                    this.toJson(jsonWriter, (JsonWriter) t);
                } finally {
                    jsonWriter.setLenient(zIsLenient);
                }
            }

            public String toString() {
                return this + ".lenient()";
            }
        };
    }

    public final JsonAdapter<T> failOnUnknown() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.3
            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader jsonReader) throws IOException {
                boolean zFailOnUnknown = jsonReader.failOnUnknown();
                jsonReader.setFailOnUnknown(true);
                try {
                    return (T) this.fromJson(jsonReader);
                } finally {
                    jsonReader.setFailOnUnknown(zFailOnUnknown);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, T t) throws IOException {
                this.toJson(jsonWriter, (JsonWriter) t);
            }

            @Override // com.squareup.moshi.JsonAdapter
            boolean isLenient() {
                return this.isLenient();
            }

            public String toString() {
                return this + ".failOnUnknown()";
            }
        };
    }

    public JsonAdapter<T> indent(final String str) {
        if (str == null) {
            throw new NullPointerException("indent == null");
        }
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.4
            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader jsonReader) throws IOException {
                return (T) this.fromJson(jsonReader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, T t) throws IOException {
                String indent = jsonWriter.getIndent();
                jsonWriter.setIndent(str);
                try {
                    this.toJson(jsonWriter, (JsonWriter) t);
                } finally {
                    jsonWriter.setIndent(indent);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            boolean isLenient() {
                return this.isLenient();
            }

            public String toString() {
                return this + ".indent(\"" + str + "\")";
            }
        };
    }
}
