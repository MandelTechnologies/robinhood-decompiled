package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.progressIndicators;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ProgressIndicatorFormat;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressIndicatorJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicatorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicator;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "textAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$Text;", "progressIndicatorTypeAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicatorType;", "longAdapter", "", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.progressIndicators.ProgressIndicatorJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ProgressIndicator> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<ProgressIndicatorType> progressIndicatorTypeAdapter;
    private final JsonAdapter<ProgressIndicatorFormat.Text> textAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("progressMessage", "indicatorType", "timestamp");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<ProgressIndicatorFormat.Text> jsonAdapterAdapter = moshi.adapter(ProgressIndicatorFormat.Text.class, SetsKt.emptySet(), "progressMessage");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.textAdapter = jsonAdapterAdapter;
        JsonAdapter<ProgressIndicatorType> jsonAdapterAdapter2 = moshi.adapter(ProgressIndicatorType.class, SetsKt.emptySet(), "indicatorType");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.progressIndicatorTypeAdapter = jsonAdapterAdapter2;
        JsonAdapter<Long> jsonAdapterAdapter3 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "timestamp");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.longAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ProgressIndicator");
        sb.append(')');
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ProgressIndicator fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ProgressIndicatorFormat.Text textFromJson = null;
        ProgressIndicatorType progressIndicatorTypeFromJson = null;
        Long lFromJson = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                textFromJson = this.textAdapter.fromJson(reader);
                if (textFromJson == null) {
                    throw Util.unexpectedNull("progressMessage", "progressMessage", reader);
                }
            } else if (iSelectName == 1) {
                progressIndicatorTypeFromJson = this.progressIndicatorTypeAdapter.fromJson(reader);
                if (progressIndicatorTypeFromJson == null) {
                    throw Util.unexpectedNull("indicatorType", "indicatorType", reader);
                }
            } else if (iSelectName == 2 && (lFromJson = this.longAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("timestamp", "timestamp", reader);
            }
        }
        reader.endObject();
        if (textFromJson == null) {
            throw Util.missingProperty("progressMessage", "progressMessage", reader);
        }
        if (progressIndicatorTypeFromJson == null) {
            throw Util.missingProperty("indicatorType", "indicatorType", reader);
        }
        if (lFromJson != null) {
            return new ProgressIndicator(textFromJson, progressIndicatorTypeFromJson, lFromJson.longValue());
        }
        throw Util.missingProperty("timestamp", "timestamp", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ProgressIndicator value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("progressMessage");
        this.textAdapter.toJson(writer, (JsonWriter) value_.getProgressMessage());
        writer.name("indicatorType");
        this.progressIndicatorTypeAdapter.toJson(writer, (JsonWriter) value_.getIndicatorType());
        writer.name("timestamp");
        this.longAdapter.toJson(writer, (JsonWriter) Long.valueOf(value_.getTimestamp()));
        writer.endObject();
    }
}
