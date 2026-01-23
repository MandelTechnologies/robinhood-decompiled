package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MessageJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005BE\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00050\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0002\u0010\u001cR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/squareup/wire/MessageJsonAdapter;", "M", "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/moshi/JsonAdapter;", "messageAdapter", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "jsonAdapters", "", "", "redactedFieldsAdapter", "", "<init>", "(Lcom/squareup/wire/internal/RuntimeMessageAdapter;Ljava/util/List;Lcom/squareup/moshi/JsonAdapter;)V", "jsonNames", "jsonAlternateNames", "options", "Lcom/squareup/moshi/JsonReader$Options;", "toJson", "", "out", "Lcom/squareup/moshi/JsonWriter;", "message", "(Lcom/squareup/moshi/JsonWriter;Lcom/squareup/wire/Message;)V", "fromJson", "input", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Lcom/squareup/wire/Message;", "wire-moshi-adapter"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class MessageJsonAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends JsonAdapter<M> {
    private final List<JsonAdapter<Object>> jsonAdapters;
    private final List<String> jsonAlternateNames;
    private final List<String> jsonNames;
    private final RuntimeMessageAdapter<M, B> messageAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<List<String>> redactedFieldsAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageJsonAdapter(RuntimeMessageAdapter<M, B> messageAdapter, List<? extends JsonAdapter<Object>> jsonAdapters, JsonAdapter<List<String>> redactedFieldsAdapter) {
        Intrinsics.checkNotNullParameter(messageAdapter, "messageAdapter");
        Intrinsics.checkNotNullParameter(jsonAdapters, "jsonAdapters");
        Intrinsics.checkNotNullParameter(redactedFieldsAdapter, "redactedFieldsAdapter");
        this.messageAdapter = messageAdapter;
        this.jsonAdapters = jsonAdapters;
        this.redactedFieldsAdapter = redactedFieldsAdapter;
        List<String> jsonNames = messageAdapter.getJsonNames();
        this.jsonNames = jsonNames;
        this.jsonAlternateNames = messageAdapter.getJsonAlternateNames();
        ArrayList arrayList = new ArrayList();
        int size = jsonNames.size();
        for (int i = 0; i < size; i++) {
            String str = this.jsonNames.get(i);
            arrayList.add(str);
            String str2 = this.jsonAlternateNames.get(i);
            if (str2 == null) {
                str2 = str + (char) 0;
            }
            arrayList.add(str2);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of((String[]) Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "run(...)");
        this.options = optionsM3152of;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(final JsonWriter out, M message) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        RedactingJsonAdapter redactingJsonAdapter = (RedactingJsonAdapter) out.tag(RedactingJsonAdapter.class);
        JsonAdapter<List<String>> jsonAdapter = Intrinsics.areEqual(redactingJsonAdapter != null ? Boolean.valueOf(redactingJsonAdapter.getEnabled()) : null, Boolean.TRUE) ? this.redactedFieldsAdapter : null;
        out.beginObject();
        this.messageAdapter.writeAllFields(message, this.jsonAdapters, jsonAdapter, new Function3() { // from class: com.squareup.wire.MessageJsonAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MessageJsonAdapter.toJson$lambda$1(out, (String) obj, obj2, (JsonAdapter) obj3);
            }
        });
        out.endObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toJson$lambda$1(JsonWriter jsonWriter, String name, Object obj, JsonAdapter jsonAdapter) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(jsonAdapter, "jsonAdapter");
        jsonWriter.name(name);
        jsonAdapter.toJson(jsonWriter, (JsonWriter) obj);
        return Unit.INSTANCE;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public M fromJson(JsonReader input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        B bNewBuilder = this.messageAdapter.newBuilder();
        input.beginObject();
        while (input.hasNext()) {
            int iSelectName = input.selectName(this.options);
            if (iSelectName == -1) {
                input.skipName();
                input.skipValue();
            } else {
                int i = iSelectName / 2;
                Object objFromJson = this.jsonAdapters.get(i).fromJson(input);
                if (objFromJson != null) {
                    this.messageAdapter.getFieldBindingsArray()[i].set(bNewBuilder, objFromJson);
                }
            }
        }
        input.endObject();
        return (M) bNewBuilder.build();
    }
}
