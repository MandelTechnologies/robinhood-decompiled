package com.robinhood.staticcontent.model.productmarketing;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
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

/* compiled from: ProductMarketing_FeatureJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing_FeatureJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "markdownContentAdapter", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "nullableResourceLinkOfEntryResourceOfDisclosureAdapter", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "nullableStringAdapter", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.productmarketing.ProductMarketing_FeatureJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ProductMarketing.Feature> {
    private final JsonAdapter<MarkdownContent> markdownContentAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<Disclosure>>> nullableResourceLinkOfEntryResourceOfDisclosureAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("title", "identifier", "content", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "iconKey");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "title");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<MarkdownContent> jsonAdapterAdapter2 = moshi.adapter(MarkdownContent.class, SetsKt.emptySet(), "content");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.markdownContentAdapter = jsonAdapterAdapter2;
        JsonAdapter<ResourceLink<EntryResource<Disclosure>>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, Disclosure.class)), SetsKt.emptySet(), OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableResourceLinkOfEntryResourceOfDisclosureAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "iconKey");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ProductMarketing.Feature");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ProductMarketing.Feature fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        MarkdownContent markdownContentFromJson = null;
        ResourceLink<EntryResource<Disclosure>> resourceLinkFromJson = null;
        String strFromJson3 = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("title", "title", reader);
                }
            } else if (iSelectName == 1) {
                strFromJson2 = this.stringAdapter.fromJson(reader);
                if (strFromJson2 == null) {
                    throw Util.unexpectedNull("identifier", "identifier", reader);
                }
            } else if (iSelectName == 2) {
                markdownContentFromJson = this.markdownContentAdapter.fromJson(reader);
                if (markdownContentFromJson == null) {
                    throw Util.unexpectedNull("content", "content", reader);
                }
            } else if (iSelectName == 3) {
                resourceLinkFromJson = this.nullableResourceLinkOfEntryResourceOfDisclosureAdapter.fromJson(reader);
            } else if (iSelectName == 4) {
                strFromJson3 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (strFromJson == null) {
            throw Util.missingProperty("title", "title", reader);
        }
        if (strFromJson2 == null) {
            throw Util.missingProperty("identifier", "identifier", reader);
        }
        if (markdownContentFromJson != null) {
            return new ProductMarketing.Feature(strFromJson, strFromJson2, markdownContentFromJson, resourceLinkFromJson, strFromJson3);
        }
        throw Util.missingProperty("content", "content", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ProductMarketing.Feature value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("title");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTitle());
        writer.name("identifier");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getIdentifier());
        writer.name("content");
        this.markdownContentAdapter.toJson(writer, (JsonWriter) value_.getContent());
        writer.name(OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE);
        this.nullableResourceLinkOfEntryResourceOfDisclosureAdapter.toJson(writer, (JsonWriter) value_.getDisclosure());
        writer.name("iconKey");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getIconKey());
        writer.endObject();
    }
}
