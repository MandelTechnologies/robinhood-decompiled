package com.robinhood.staticcontent.model.directipo;

import android.net.Uri;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectIpoOnboardingJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\n0\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboardingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboarding;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "resourceLinkOfEntryResourceOfMultipleDensityImageAssetAdapter", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/directipo/MultipleDensityImageAsset;", "stringAdapter", "", "markdownContentAdapter", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "listOfResourceLinkOfEntryResourceOfDirectIpoOnboardingStepAdapter", "", "Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboardingStep;", "uriAdapter", "Landroid/net/Uri;", "resourceLinkOfEntryResourceOfDirectIpoOnboardingLearnMoreAdapter", "Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboardingLearnMore;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.directipo.DirectIpoOnboardingJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<DirectIpoOnboarding> {
    private final JsonAdapter<List<ResourceLink<EntryResource<DirectIpoOnboardingStep>>>> listOfResourceLinkOfEntryResourceOfDirectIpoOnboardingStepAdapter;
    private final JsonAdapter<MarkdownContent> markdownContentAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<ResourceLink<EntryResource<DirectIpoOnboardingLearnMore>>> resourceLinkOfEntryResourceOfDirectIpoOnboardingLearnMoreAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<MultipleDensityImageAsset>>> resourceLinkOfEntryResourceOfMultipleDensityImageAssetAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Uri> uriAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("mobileIntroImageAsset", "mobileIntroForegroundColor", "mobileIntroBackgroundColor", "title", "descriptionMarkdown", "steps", "viewAvailableIPOsUrl", "viewAvailableIPOsButtonTitle", "learnMore");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<ResourceLink<EntryResource<MultipleDensityImageAsset>>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, MultipleDensityImageAsset.class)), SetsKt.emptySet(), "mobileIntroImageAsset");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.resourceLinkOfEntryResourceOfMultipleDensityImageAssetAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "mobileIntroForegroundColor");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<MarkdownContent> jsonAdapterAdapter3 = moshi.adapter(MarkdownContent.class, SetsKt.emptySet(), "descriptionMarkdown");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.markdownContentAdapter = jsonAdapterAdapter3;
        JsonAdapter<List<ResourceLink<EntryResource<DirectIpoOnboardingStep>>>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(List.class, Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, DirectIpoOnboardingStep.class))), SetsKt.emptySet(), "steps");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.listOfResourceLinkOfEntryResourceOfDirectIpoOnboardingStepAdapter = jsonAdapterAdapter4;
        JsonAdapter<Uri> jsonAdapterAdapter5 = moshi.adapter(Uri.class, SetsKt.emptySet(), "viewAvailableIPOsUrl");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.uriAdapter = jsonAdapterAdapter5;
        JsonAdapter<ResourceLink<EntryResource<DirectIpoOnboardingLearnMore>>> jsonAdapterAdapter6 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, DirectIpoOnboardingLearnMore.class)), SetsKt.emptySet(), "learnMore");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.resourceLinkOfEntryResourceOfDirectIpoOnboardingLearnMoreAdapter = jsonAdapterAdapter6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DirectIpoOnboarding");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public DirectIpoOnboarding fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ResourceLink<EntryResource<MultipleDensityImageAsset>> resourceLinkFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        MarkdownContent markdownContentFromJson = null;
        List<ResourceLink<EntryResource<DirectIpoOnboardingStep>>> listFromJson = null;
        Uri uriFromJson = null;
        String strFromJson4 = null;
        ResourceLink<EntryResource<DirectIpoOnboardingLearnMore>> resourceLinkFromJson2 = null;
        while (true) {
            ResourceLink<EntryResource<MultipleDensityImageAsset>> resourceLink = resourceLinkFromJson;
            String str = strFromJson;
            String str2 = strFromJson2;
            String str3 = strFromJson3;
            if (reader.hasNext()) {
                MarkdownContent markdownContent = markdownContentFromJson;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                    case 0:
                        resourceLinkFromJson = this.resourceLinkOfEntryResourceOfMultipleDensityImageAssetAdapter.fromJson(reader);
                        if (resourceLinkFromJson == null) {
                            throw Util.unexpectedNull("mobileIntroImageAsset", "mobileIntroImageAsset", reader);
                        }
                        markdownContentFromJson = markdownContent;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                    case 1:
                        strFromJson = this.stringAdapter.fromJson(reader);
                        if (strFromJson == null) {
                            throw Util.unexpectedNull("mobileIntroForegroundColor", "mobileIntroForegroundColor", reader);
                        }
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                    case 2:
                        strFromJson2 = this.stringAdapter.fromJson(reader);
                        if (strFromJson2 == null) {
                            throw Util.unexpectedNull("mobileIntroBackgroundColor", "mobileIntroBackgroundColor", reader);
                        }
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        strFromJson = str;
                        strFromJson3 = str3;
                    case 3:
                        strFromJson3 = this.stringAdapter.fromJson(reader);
                        if (strFromJson3 == null) {
                            throw Util.unexpectedNull("title", "title", reader);
                        }
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        strFromJson = str;
                        strFromJson2 = str2;
                    case 4:
                        markdownContentFromJson = this.markdownContentAdapter.fromJson(reader);
                        if (markdownContentFromJson == null) {
                            throw Util.unexpectedNull("descriptionMarkdown", "descriptionMarkdown", reader);
                        }
                        resourceLinkFromJson = resourceLink;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                    case 5:
                        listFromJson = this.listOfResourceLinkOfEntryResourceOfDirectIpoOnboardingStepAdapter.fromJson(reader);
                        if (listFromJson == null) {
                            throw Util.unexpectedNull("steps", "steps", reader);
                        }
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                    case 6:
                        uriFromJson = this.uriAdapter.fromJson(reader);
                        if (uriFromJson == null) {
                            throw Util.unexpectedNull("viewAvailableIPOsUrl", "viewAvailableIPOsUrl", reader);
                        }
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                    case 7:
                        strFromJson4 = this.stringAdapter.fromJson(reader);
                        if (strFromJson4 == null) {
                            throw Util.unexpectedNull("viewAvailableIPOsButtonTitle", "viewAvailableIPOsButtonTitle", reader);
                        }
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                    case 8:
                        resourceLinkFromJson2 = this.resourceLinkOfEntryResourceOfDirectIpoOnboardingLearnMoreAdapter.fromJson(reader);
                        if (resourceLinkFromJson2 == null) {
                            throw Util.unexpectedNull("learnMore", "learnMore", reader);
                        }
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                    default:
                        markdownContentFromJson = markdownContent;
                        resourceLinkFromJson = resourceLink;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                }
            } else {
                MarkdownContent markdownContent2 = markdownContentFromJson;
                reader.endObject();
                if (resourceLink == null) {
                    throw Util.missingProperty("mobileIntroImageAsset", "mobileIntroImageAsset", reader);
                }
                if (str == null) {
                    throw Util.missingProperty("mobileIntroForegroundColor", "mobileIntroForegroundColor", reader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("mobileIntroBackgroundColor", "mobileIntroBackgroundColor", reader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("title", "title", reader);
                }
                if (markdownContent2 == null) {
                    throw Util.missingProperty("descriptionMarkdown", "descriptionMarkdown", reader);
                }
                if (listFromJson == null) {
                    throw Util.missingProperty("steps", "steps", reader);
                }
                if (uriFromJson == null) {
                    throw Util.missingProperty("viewAvailableIPOsUrl", "viewAvailableIPOsUrl", reader);
                }
                if (strFromJson4 == null) {
                    throw Util.missingProperty("viewAvailableIPOsButtonTitle", "viewAvailableIPOsButtonTitle", reader);
                }
                if (resourceLinkFromJson2 != null) {
                    return new DirectIpoOnboarding(resourceLink, str, str2, str3, markdownContent2, listFromJson, uriFromJson, strFromJson4, resourceLinkFromJson2);
                }
                throw Util.missingProperty("learnMore", "learnMore", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, DirectIpoOnboarding value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("mobileIntroImageAsset");
        this.resourceLinkOfEntryResourceOfMultipleDensityImageAssetAdapter.toJson(writer, (JsonWriter) value_.getMobileIntroImageAsset());
        writer.name("mobileIntroForegroundColor");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getMobileIntroForegroundColor());
        writer.name("mobileIntroBackgroundColor");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getMobileIntroBackgroundColor());
        writer.name("title");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTitle());
        writer.name("descriptionMarkdown");
        this.markdownContentAdapter.toJson(writer, (JsonWriter) value_.getDescriptionMarkdown());
        writer.name("steps");
        this.listOfResourceLinkOfEntryResourceOfDirectIpoOnboardingStepAdapter.toJson(writer, (JsonWriter) value_.getSteps());
        writer.name("viewAvailableIPOsUrl");
        this.uriAdapter.toJson(writer, (JsonWriter) value_.getViewAvailableIPOsUrl());
        writer.name("viewAvailableIPOsButtonTitle");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getViewAvailableIPOsButtonTitle());
        writer.name("learnMore");
        this.resourceLinkOfEntryResourceOfDirectIpoOnboardingLearnMoreAdapter.toJson(writer, (JsonWriter) value_.getLearnMore());
        writer.endObject();
    }
}
