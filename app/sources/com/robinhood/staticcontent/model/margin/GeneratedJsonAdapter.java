package com.robinhood.staticcontent.model.margin;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.margin.MarginInterestRateComparison;
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

/* compiled from: MarginInterestRateComparisonJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparisonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparison;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableMarkdownContentAdapter", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "listOfResourceLinkOfEntryResourceOfBrokerageInterestRateItemAdapter", "", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparison$BrokerageInterestRateItem;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.margin.MarginInterestRateComparisonJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<MarginInterestRateComparison> {
    private final JsonAdapter<List<ResourceLink<EntryResource<MarginInterestRateComparison.BrokerageInterestRateItem>>>> listOfResourceLinkOfEntryResourceOfBrokerageInterestRateItemAdapter;
    private final JsonAdapter<MarkdownContent> nullableMarkdownContentAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("title", "description", "brokerageInterestRate", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE);
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "title");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter;
        JsonAdapter<MarkdownContent> jsonAdapterAdapter2 = moshi.adapter(MarkdownContent.class, SetsKt.emptySet(), "description");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableMarkdownContentAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<ResourceLink<EntryResource<MarginInterestRateComparison.BrokerageInterestRateItem>>>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, MarginInterestRateComparison.BrokerageInterestRateItem.class))), SetsKt.emptySet(), "brokerageInterestRate");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.listOfResourceLinkOfEntryResourceOfBrokerageInterestRateItemAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("MarginInterestRateComparison");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public MarginInterestRateComparison fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        MarkdownContent markdownContentFromJson = null;
        List<ResourceLink<EntryResource<MarginInterestRateComparison.BrokerageInterestRateItem>>> listFromJson = null;
        MarkdownContent markdownContentFromJson2 = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (iSelectName == 1) {
                markdownContentFromJson = this.nullableMarkdownContentAdapter.fromJson(reader);
            } else if (iSelectName == 2) {
                listFromJson = this.listOfResourceLinkOfEntryResourceOfBrokerageInterestRateItemAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw Util.unexpectedNull("brokerageInterestRate", "brokerageInterestRate", reader);
                }
            } else if (iSelectName == 3) {
                markdownContentFromJson2 = this.nullableMarkdownContentAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (listFromJson != null) {
            return new MarginInterestRateComparison(strFromJson, markdownContentFromJson, listFromJson, markdownContentFromJson2);
        }
        throw Util.missingProperty("brokerageInterestRate", "brokerageInterestRate", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, MarginInterestRateComparison value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("title");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getTitle());
        writer.name("description");
        this.nullableMarkdownContentAdapter.toJson(writer, (JsonWriter) value_.getDescription());
        writer.name("brokerageInterestRate");
        this.listOfResourceLinkOfEntryResourceOfBrokerageInterestRateItemAdapter.toJson(writer, (JsonWriter) value_.getBrokerageInterestRate());
        writer.name(OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE);
        this.nullableMarkdownContentAdapter.toJson(writer, (JsonWriter) value_.getDisclosure());
        writer.endObject();
    }
}
