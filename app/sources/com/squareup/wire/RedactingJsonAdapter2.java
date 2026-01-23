package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RedactingJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"redacting", "Lcom/squareup/moshi/JsonAdapter;", "T", "wire-moshi-adapter"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.squareup.wire.RedactingJsonAdapterKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class RedactingJsonAdapter2 {
    public static final <T> JsonAdapter<T> redacting(final JsonAdapter<T> jsonAdapter) {
        Intrinsics.checkNotNullParameter(jsonAdapter, "<this>");
        return new JsonAdapter<T>() { // from class: com.squareup.wire.RedactingJsonAdapterKt.redacting.1
            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return jsonAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter writer, T value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                RedactingJsonAdapter redactingJsonAdapter = (RedactingJsonAdapter) writer.tag(RedactingJsonAdapter.class);
                if (redactingJsonAdapter == null) {
                    redactingJsonAdapter = new RedactingJsonAdapter();
                    writer.setTag(RedactingJsonAdapter.class, redactingJsonAdapter);
                }
                boolean enabled = redactingJsonAdapter.getEnabled();
                redactingJsonAdapter.setEnabled(true);
                try {
                    jsonAdapter.toJson(writer, (JsonWriter) value);
                } finally {
                    redactingJsonAdapter.setEnabled(enabled);
                }
            }
        };
    }
}
