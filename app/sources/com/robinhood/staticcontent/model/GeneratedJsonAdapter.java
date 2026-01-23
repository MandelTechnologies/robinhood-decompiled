package com.robinhood.staticcontent.model;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MobileContentPageJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0011\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/MobileContentPageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/MobileContentPage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "nullableStringAdapter", "nullableMarkdownContentAdapter", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "nullableListOfResourceLinkOfEntryResourceOfTitleAndBodyAdapter", "", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/TitleAndBody;", "nullableResourceLinkOfEntryResourceOfDisclosureAdapter", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.MobileContentPageJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<MobileContentPage> {
    private final JsonAdapter<List<ResourceLink<EntryResource<TitleAndBody>>>> nullableListOfResourceLinkOfEntryResourceOfTitleAndBodyAdapter;
    private final JsonAdapter<MarkdownContent> nullableMarkdownContentAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<Disclosure>>> nullableResourceLinkOfEntryResourceOfDisclosureAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("title", "subtitle", CarResultComposable2.BODY, "primaryCTA", "secondaryCTA", "pageFeatures", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE);
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "title");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "subtitle");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<MarkdownContent> jsonAdapterAdapter3 = moshi.adapter(MarkdownContent.class, SetsKt.emptySet(), CarResultComposable2.BODY);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableMarkdownContentAdapter = jsonAdapterAdapter3;
        JsonAdapter<List<ResourceLink<EntryResource<TitleAndBody>>>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(List.class, Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, TitleAndBody.class))), SetsKt.emptySet(), "pageFeatures");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableListOfResourceLinkOfEntryResourceOfTitleAndBodyAdapter = jsonAdapterAdapter4;
        JsonAdapter<ResourceLink<EntryResource<Disclosure>>> jsonAdapterAdapter5 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, Disclosure.class)), SetsKt.emptySet(), OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableResourceLinkOfEntryResourceOfDisclosureAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("MobileContentPage");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public MobileContentPage fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        MarkdownContent markdownContentFromJson = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        List<ResourceLink<EntryResource<TitleAndBody>>> listFromJson = null;
        ResourceLink<EntryResource<Disclosure>> resourceLinkFromJson = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull("title", "title", reader);
                    }
                    break;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    markdownContentFromJson = this.nullableMarkdownContentAdapter.fromJson(reader);
                    break;
                case 3:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw Util.unexpectedNull("primaryCta", "primaryCTA", reader);
                    }
                    break;
                case 4:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    listFromJson = this.nullableListOfResourceLinkOfEntryResourceOfTitleAndBodyAdapter.fromJson(reader);
                    break;
                case 6:
                    resourceLinkFromJson = this.nullableResourceLinkOfEntryResourceOfDisclosureAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (strFromJson == null) {
            throw Util.missingProperty("title", "title", reader);
        }
        if (strFromJson3 != null) {
            return new MobileContentPage(strFromJson, strFromJson2, markdownContentFromJson, strFromJson3, strFromJson4, listFromJson, resourceLinkFromJson);
        }
        throw Util.missingProperty("primaryCta", "primaryCTA", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, MobileContentPage value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("title");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTitle());
        writer.name("subtitle");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getSubtitle());
        writer.name(CarResultComposable2.BODY);
        this.nullableMarkdownContentAdapter.toJson(writer, (JsonWriter) value_.getBody());
        writer.name("primaryCTA");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getPrimaryCta());
        writer.name("secondaryCTA");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getSecondaryCta());
        writer.name("pageFeatures");
        this.nullableListOfResourceLinkOfEntryResourceOfTitleAndBodyAdapter.toJson(writer, (JsonWriter) value_.getPageFeatures());
        writer.name(OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE);
        this.nullableResourceLinkOfEntryResourceOfDisclosureAdapter.toJson(writer, (JsonWriter) value_.getDisclosure());
        writer.endObject();
    }
}
