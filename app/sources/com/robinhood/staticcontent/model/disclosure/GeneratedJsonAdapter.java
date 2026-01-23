package com.robinhood.staticcontent.model.disclosure;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DisclosureJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/disclosure/DisclosureJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "stringAdapter", "markdownContentAdapter", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "nullableIntAdapter", "", "nullableBooleanAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.disclosure.DisclosureJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<Disclosure> {
    private final JsonAdapter<MarkdownContent> markdownContentAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("button", "title", "identifier", "content", "version", "is_link", "additionalData");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "button");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "title");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<MarkdownContent> jsonAdapterAdapter3 = moshi.adapter(MarkdownContent.class, SetsKt.emptySet(), "content");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.markdownContentAdapter = jsonAdapterAdapter3;
        JsonAdapter<Integer> jsonAdapterAdapter4 = moshi.adapter(Integer.class, SetsKt.emptySet(), "version");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableIntAdapter = jsonAdapterAdapter4;
        JsonAdapter<Boolean> jsonAdapterAdapter5 = moshi.adapter(Boolean.class, SetsKt.emptySet(), "is_link");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableBooleanAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Disclosure");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Disclosure fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        MarkdownContent markdownContentFromJson = null;
        Integer numFromJson = null;
        Boolean boolFromJson = null;
        String strFromJson4 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw Util.unexpectedNull("title", "title", reader);
                    }
                    break;
                case 2:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw Util.unexpectedNull("identifier", "identifier", reader);
                    }
                    break;
                case 3:
                    markdownContentFromJson = this.markdownContentAdapter.fromJson(reader);
                    if (markdownContentFromJson == null) {
                        throw Util.unexpectedNull("content", "content", reader);
                    }
                    break;
                case 4:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (strFromJson2 == null) {
            throw Util.missingProperty("title", "title", reader);
        }
        if (strFromJson3 == null) {
            throw Util.missingProperty("identifier", "identifier", reader);
        }
        if (markdownContentFromJson != null) {
            return new Disclosure(strFromJson, strFromJson2, strFromJson3, markdownContentFromJson, numFromJson, boolFromJson, strFromJson4);
        }
        throw Util.missingProperty("content", "content", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, Disclosure value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("button");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getButton());
        writer.name("title");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTitle());
        writer.name("identifier");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getIdentifier());
        writer.name("content");
        this.markdownContentAdapter.toJson(writer, (JsonWriter) value_.getContent());
        writer.name("version");
        this.nullableIntAdapter.toJson(writer, (JsonWriter) value_.getVersion());
        writer.name("is_link");
        this.nullableBooleanAdapter.toJson(writer, (JsonWriter) value_.is_link());
        writer.name("additionalData");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getAdditionalData());
        writer.endObject();
    }
}
