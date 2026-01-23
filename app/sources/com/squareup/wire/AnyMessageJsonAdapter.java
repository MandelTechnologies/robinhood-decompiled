package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.AnyMessage;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.reflect.KClass;

/* compiled from: AnyMessageJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0007*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/squareup/wire/AnyMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/wire/AnyMessage;", "moshi", "Lcom/squareup/moshi/Moshi;", "typeUrlToAdapter", "", "", "Lcom/squareup/wire/ProtoAdapter;", "<init>", "(Lcom/squareup/moshi/Moshi;Ljava/util/Map;)V", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "readStringNamed", "name", "wire-moshi-adapter"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class AnyMessageJsonAdapter extends JsonAdapter<AnyMessage> {
    private final Moshi moshi;
    private final Map<String, ProtoAdapter<?>> typeUrlToAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public AnyMessageJsonAdapter(Moshi moshi, Map<String, ? extends ProtoAdapter<?>> typeUrlToAdapter) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(typeUrlToAdapter, "typeUrlToAdapter");
        this.moshi = moshi;
        this.typeUrlToAdapter = typeUrlToAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, AnyMessage value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            writer.nullValue();
            return;
        }
        writer.beginObject();
        writer.name("@type");
        writer.value(value.getTypeUrl());
        ProtoAdapter<?> protoAdapter = this.typeUrlToAdapter.get(value.getTypeUrl());
        if (protoAdapter == null) {
            throw new JsonDataException("Cannot find type for url: " + value.getTypeUrl() + " in " + writer.getPath());
        }
        Moshi moshi = this.moshi;
        KClass<?> type2 = protoAdapter.getType();
        Intrinsics.checkNotNull(type2);
        JsonAdapter jsonAdapterAdapter = moshi.adapter(JvmClassMapping.getJavaClass(type2));
        Intrinsics.checkNotNull(jsonAdapterAdapter, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<com.squareup.wire.Message<*, *>>");
        int iBeginFlatten = writer.beginFlatten();
        Object objUnpack = value.unpack(protoAdapter);
        Intrinsics.checkNotNull(objUnpack, "null cannot be cast to non-null type com.squareup.wire.Message<*, *>");
        jsonAdapterAdapter.toJson(writer, (JsonWriter) objUnpack);
        writer.endFlatten(iBeginFlatten);
        writer.endObject();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public AnyMessage fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
            return null;
        }
        JsonReader jsonReaderPeekJson = reader.peekJson();
        try {
            Intrinsics.checkNotNull(jsonReaderPeekJson);
            String stringNamed = readStringNamed(jsonReaderPeekJson, "@type");
            Closeable.closeFinally(jsonReaderPeekJson, null);
            if (stringNamed == null) {
                throw new JsonDataException("expected @type in " + reader.getPath());
            }
            ProtoAdapter<?> protoAdapter = this.typeUrlToAdapter.get(stringNamed);
            if (protoAdapter == null) {
                throw new JsonDataException("Cannot resolve type: " + stringNamed + " in " + reader.getPath());
            }
            Moshi moshi = this.moshi;
            KClass<?> type2 = protoAdapter.getType();
            Intrinsics.checkNotNull(type2);
            JsonAdapter jsonAdapterAdapter = moshi.adapter(JvmClassMapping.getJavaClass(type2));
            Intrinsics.checkNotNull(jsonAdapterAdapter, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<com.squareup.wire.Message<*, *>>");
            Message<?, ?> message = (Message) jsonAdapterAdapter.fromJson(reader);
            AnyMessage.Companion companion = AnyMessage.INSTANCE;
            Intrinsics.checkNotNull(message);
            return companion.pack(message);
        } finally {
        }
    }

    private final String readStringNamed(JsonReader jsonReader, String str) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (Intrinsics.areEqual(jsonReader.nextName(), str)) {
                return jsonReader.nextString();
            }
            jsonReader.skipValue();
        }
        return null;
    }
}
