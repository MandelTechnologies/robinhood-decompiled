package com.robinhood.staticcontent.model.safetylabelslesson;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiSafetyLabelsLessonSectionJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/safetylabelslesson/ApiSafetyLabelsLessonSectionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/safetylabelslesson/ApiSafetyLabelsLessonSection;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "contentTypeAdapter", "Lcom/robinhood/staticcontent/model/safetylabelslesson/ContentType;", "nullableMarkdownContentAdapter", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "nullableResourceLinkOfEntryResourceOfApiSafetyLabelsLessonSlideAdapter", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/safetylabelslesson/ApiSafetyLabelsLessonSlide;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.safetylabelslesson.ApiSafetyLabelsLessonSectionJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ApiSafetyLabelsLessonSection> {
    private final JsonAdapter<ApiSafetyLabelsLessonSection2> contentTypeAdapter;
    private final JsonAdapter<MarkdownContent> nullableMarkdownContentAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>>> nullableResourceLinkOfEntryResourceOfApiSafetyLabelsLessonSlideAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("identifier", "type", "content", "slides");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "identifier");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<ApiSafetyLabelsLessonSection2> jsonAdapterAdapter2 = moshi.adapter(ApiSafetyLabelsLessonSection2.class, SetsKt.emptySet(), "type");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.contentTypeAdapter = jsonAdapterAdapter2;
        JsonAdapter<MarkdownContent> jsonAdapterAdapter3 = moshi.adapter(MarkdownContent.class, SetsKt.emptySet(), "content");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableMarkdownContentAdapter = jsonAdapterAdapter3;
        JsonAdapter<ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, ApiSafetyLabelsLessonSlide.class)), SetsKt.emptySet(), "slides");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableResourceLinkOfEntryResourceOfApiSafetyLabelsLessonSlideAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ApiSafetyLabelsLessonSection");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ApiSafetyLabelsLessonSection fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        ApiSafetyLabelsLessonSection2 apiSafetyLabelsLessonSection2FromJson = null;
        MarkdownContent markdownContentFromJson = null;
        ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>> resourceLinkFromJson = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("identifier", "identifier", reader);
                }
            } else if (iSelectName == 1) {
                apiSafetyLabelsLessonSection2FromJson = this.contentTypeAdapter.fromJson(reader);
                if (apiSafetyLabelsLessonSection2FromJson == null) {
                    throw Util.unexpectedNull("type", "type", reader);
                }
            } else if (iSelectName == 2) {
                markdownContentFromJson = this.nullableMarkdownContentAdapter.fromJson(reader);
            } else if (iSelectName == 3) {
                resourceLinkFromJson = this.nullableResourceLinkOfEntryResourceOfApiSafetyLabelsLessonSlideAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (strFromJson == null) {
            throw Util.missingProperty("identifier", "identifier", reader);
        }
        if (apiSafetyLabelsLessonSection2FromJson != null) {
            return new ApiSafetyLabelsLessonSection(strFromJson, apiSafetyLabelsLessonSection2FromJson, markdownContentFromJson, resourceLinkFromJson);
        }
        throw Util.missingProperty("type", "type", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ApiSafetyLabelsLessonSection value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("identifier");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getIdentifier());
        writer.name("type");
        this.contentTypeAdapter.toJson(writer, (JsonWriter) value_.getType());
        writer.name("content");
        this.nullableMarkdownContentAdapter.toJson(writer, (JsonWriter) value_.getContent());
        writer.name("slides");
        this.nullableResourceLinkOfEntryResourceOfApiSafetyLabelsLessonSlideAdapter.toJson(writer, (JsonWriter) value_.getSlides());
        writer.endObject();
    }
}
