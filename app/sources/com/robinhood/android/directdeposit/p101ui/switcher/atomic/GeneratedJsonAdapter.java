package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import com.robinhood.android.directdeposit.p101ui.switcher.atomic.TransactEvent;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransactEvent_Interaction_PayloadJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent_Interaction_PayloadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$Payload;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "interactionTypeAdapter", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$InteractionType;", "mapOfStringAnyAdapter", "", "", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.directdeposit.ui.switcher.atomic.TransactEvent_Interaction_PayloadJsonAdapter, reason: from toString */
/* loaded from: classes27.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<TransactEvent.Interaction.Payload> {
    public static final int $stable = 8;
    private final JsonAdapter<TransactEvent.Interaction.InteractionType> interactionTypeAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("name", "value");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<TransactEvent.Interaction.InteractionType> jsonAdapterAdapter = moshi.adapter(TransactEvent.Interaction.InteractionType.class, SetsKt.emptySet(), "type");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.interactionTypeAdapter = jsonAdapterAdapter;
        JsonAdapter<Map<String, Object>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), SetsKt.emptySet(), "value");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.mapOfStringAnyAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TransactEvent.Interaction.Payload");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public TransactEvent.Interaction.Payload fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TransactEvent.Interaction.InteractionType interactionTypeFromJson = null;
        Map<String, Object> mapFromJson = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                interactionTypeFromJson = this.interactionTypeAdapter.fromJson(reader);
                if (interactionTypeFromJson == null) {
                    throw Util.unexpectedNull("type", "name", reader);
                }
            } else if (iSelectName == 1 && (mapFromJson = this.mapOfStringAnyAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("value__", "value", reader);
            }
        }
        reader.endObject();
        if (interactionTypeFromJson == null) {
            throw Util.missingProperty("type", "name", reader);
        }
        if (mapFromJson != null) {
            return new TransactEvent.Interaction.Payload(interactionTypeFromJson, mapFromJson);
        }
        throw Util.missingProperty("value__", "value", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, TransactEvent.Interaction.Payload value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("name");
        this.interactionTypeAdapter.toJson(writer, (JsonWriter) value_.getType());
        writer.name("value");
        this.mapOfStringAnyAdapter.toJson(writer, (JsonWriter) value_.getValue());
        writer.endObject();
    }
}
