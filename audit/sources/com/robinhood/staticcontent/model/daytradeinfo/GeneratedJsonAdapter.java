package com.robinhood.staticcontent.model.daytradeinfo;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
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

/* compiled from: DayTradeInfoJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000e0\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfo;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "markdownContentAdapter", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "resourceLinkOfAssetResourceOfNullableAnyAdapter", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "listOfResourceLinkOfEntryResourceOfDayTradeInfoStepAdapter", "", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfoStep;", "resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfoJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<DayTradeInfo> {
    private final JsonAdapter<List<ResourceLink<EntryResource<DayTradeInfoStep>>>> listOfResourceLinkOfEntryResourceOfDayTradeInfoStepAdapter;
    private final JsonAdapter<MarkdownContent> markdownContentAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<ResourceLink<AssetResource<?>>> resourceLinkOfAssetResourceOfNullableAnyAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<DayTradeInfoStep>>> resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("identifier", "introTitle", "introDescriptionMarkdown", "mobileIntroImageAssetLight", "mobileIntroImageAssetDark", "steps", "cashManagementStep", "cashManagementInterestStep", "recommendProtectionStep", "protectionEnabledStep");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "identifier");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<MarkdownContent> jsonAdapterAdapter2 = moshi.adapter(MarkdownContent.class, SetsKt.emptySet(), "introDescriptionMarkdown");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.markdownContentAdapter = jsonAdapterAdapter2;
        JsonAdapter<ResourceLink<AssetResource<?>>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(AssetResource.class, Types.subtypeOf(Object.class))), SetsKt.emptySet(), "mobileIntroImageAssetLight");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.resourceLinkOfAssetResourceOfNullableAnyAdapter = jsonAdapterAdapter3;
        JsonAdapter<List<ResourceLink<EntryResource<DayTradeInfoStep>>>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(List.class, Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, DayTradeInfoStep.class))), SetsKt.emptySet(), "steps");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.listOfResourceLinkOfEntryResourceOfDayTradeInfoStepAdapter = jsonAdapterAdapter4;
        JsonAdapter<ResourceLink<EntryResource<DayTradeInfoStep>>> jsonAdapterAdapter5 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, DayTradeInfoStep.class)), SetsKt.emptySet(), "cashManagementStep");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DayTradeInfo");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public DayTradeInfo fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        MarkdownContent markdownContentFromJson = null;
        ResourceLink<AssetResource<?>> resourceLinkFromJson = null;
        ResourceLink<AssetResource<?>> resourceLinkFromJson2 = null;
        List<ResourceLink<EntryResource<DayTradeInfoStep>>> listFromJson = null;
        ResourceLink<EntryResource<DayTradeInfoStep>> resourceLinkFromJson3 = null;
        ResourceLink<EntryResource<DayTradeInfoStep>> resourceLinkFromJson4 = null;
        ResourceLink<EntryResource<DayTradeInfoStep>> resourceLinkFromJson5 = null;
        ResourceLink<EntryResource<DayTradeInfoStep>> resourceLinkFromJson6 = null;
        while (true) {
            String str = strFromJson;
            String str2 = strFromJson2;
            MarkdownContent markdownContent = markdownContentFromJson;
            ResourceLink<AssetResource<?>> resourceLink = resourceLinkFromJson;
            ResourceLink<AssetResource<?>> resourceLink2 = resourceLinkFromJson2;
            List<ResourceLink<EntryResource<DayTradeInfoStep>>> list = listFromJson;
            if (reader.hasNext()) {
                ResourceLink<EntryResource<DayTradeInfoStep>> resourceLink3 = resourceLinkFromJson3;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(reader);
                        if (strFromJson == null) {
                            throw Util.unexpectedNull("identifier", "identifier", reader);
                        }
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                    case 1:
                        strFromJson2 = this.stringAdapter.fromJson(reader);
                        if (strFromJson2 == null) {
                            throw Util.unexpectedNull("introTitle", "introTitle", reader);
                        }
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                    case 2:
                        markdownContentFromJson = this.markdownContentAdapter.fromJson(reader);
                        if (markdownContentFromJson == null) {
                            throw Util.unexpectedNull("introDescriptionMarkdown", "introDescriptionMarkdown", reader);
                        }
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        strFromJson2 = str2;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                    case 3:
                        resourceLinkFromJson = this.resourceLinkOfAssetResourceOfNullableAnyAdapter.fromJson(reader);
                        if (resourceLinkFromJson == null) {
                            throw Util.unexpectedNull("mobileIntroImageAssetLight", "mobileIntroImageAssetLight", reader);
                        }
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                    case 4:
                        resourceLinkFromJson2 = this.resourceLinkOfAssetResourceOfNullableAnyAdapter.fromJson(reader);
                        if (resourceLinkFromJson2 == null) {
                            throw Util.unexpectedNull("mobileIntroImageAssetDark", "mobileIntroImageAssetDark", reader);
                        }
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        listFromJson = list;
                    case 5:
                        listFromJson = this.listOfResourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.fromJson(reader);
                        if (listFromJson == null) {
                            throw Util.unexpectedNull("steps", "steps", reader);
                        }
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                    case 6:
                        resourceLinkFromJson3 = this.resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.fromJson(reader);
                        if (resourceLinkFromJson3 == null) {
                            throw Util.unexpectedNull("cashManagementStep", "cashManagementStep", reader);
                        }
                        strFromJson = str;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                    case 7:
                        resourceLinkFromJson4 = this.resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.fromJson(reader);
                        if (resourceLinkFromJson4 == null) {
                            throw Util.unexpectedNull("cashManagementInterestStep", "cashManagementInterestStep", reader);
                        }
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                    case 8:
                        resourceLinkFromJson5 = this.resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.fromJson(reader);
                        if (resourceLinkFromJson5 == null) {
                            throw Util.unexpectedNull("recommendProtectionStep", "recommendProtectionStep", reader);
                        }
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                    case 9:
                        resourceLinkFromJson6 = this.resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.fromJson(reader);
                        if (resourceLinkFromJson6 == null) {
                            throw Util.unexpectedNull("protectionEnabledStep", "protectionEnabledStep", reader);
                        }
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                    default:
                        resourceLinkFromJson3 = resourceLink3;
                        strFromJson = str;
                        strFromJson2 = str2;
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        listFromJson = list;
                }
            } else {
                ResourceLink<EntryResource<DayTradeInfoStep>> resourceLink4 = resourceLinkFromJson3;
                reader.endObject();
                if (str == null) {
                    throw Util.missingProperty("identifier", "identifier", reader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("introTitle", "introTitle", reader);
                }
                if (markdownContent == null) {
                    throw Util.missingProperty("introDescriptionMarkdown", "introDescriptionMarkdown", reader);
                }
                if (resourceLink == null) {
                    throw Util.missingProperty("mobileIntroImageAssetLight", "mobileIntroImageAssetLight", reader);
                }
                if (resourceLink2 == null) {
                    throw Util.missingProperty("mobileIntroImageAssetDark", "mobileIntroImageAssetDark", reader);
                }
                if (list == null) {
                    throw Util.missingProperty("steps", "steps", reader);
                }
                if (resourceLink4 == null) {
                    throw Util.missingProperty("cashManagementStep", "cashManagementStep", reader);
                }
                if (resourceLinkFromJson4 == null) {
                    throw Util.missingProperty("cashManagementInterestStep", "cashManagementInterestStep", reader);
                }
                if (resourceLinkFromJson5 == null) {
                    throw Util.missingProperty("recommendProtectionStep", "recommendProtectionStep", reader);
                }
                if (resourceLinkFromJson6 != null) {
                    return new DayTradeInfo(str, str2, markdownContent, resourceLink, resourceLink2, list, resourceLink4, resourceLinkFromJson4, resourceLinkFromJson5, resourceLinkFromJson6);
                }
                throw Util.missingProperty("protectionEnabledStep", "protectionEnabledStep", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, DayTradeInfo value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("identifier");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getIdentifier());
        writer.name("introTitle");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getIntroTitle());
        writer.name("introDescriptionMarkdown");
        this.markdownContentAdapter.toJson(writer, (JsonWriter) value_.getIntroDescriptionMarkdown());
        writer.name("mobileIntroImageAssetLight");
        this.resourceLinkOfAssetResourceOfNullableAnyAdapter.toJson(writer, (JsonWriter) value_.getMobileIntroImageAssetLight());
        writer.name("mobileIntroImageAssetDark");
        this.resourceLinkOfAssetResourceOfNullableAnyAdapter.toJson(writer, (JsonWriter) value_.getMobileIntroImageAssetDark());
        writer.name("steps");
        this.listOfResourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.toJson(writer, (JsonWriter) value_.getSteps());
        writer.name("cashManagementStep");
        this.resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.toJson(writer, (JsonWriter) value_.getCashManagementStep());
        writer.name("cashManagementInterestStep");
        this.resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.toJson(writer, (JsonWriter) value_.getCashManagementInterestStep());
        writer.name("recommendProtectionStep");
        this.resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.toJson(writer, (JsonWriter) value_.getRecommendProtectionStep());
        writer.name("protectionEnabledStep");
        this.resourceLinkOfEntryResourceOfDayTradeInfoStepAdapter.toJson(writer, (JsonWriter) value_.getProtectionEnabledStep());
        writer.endObject();
    }
}
