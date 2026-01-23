package com.robinhood.staticcontent.model.productupsell;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.productupsell.ProductUpsellResource;
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

/* compiled from: ProductUpsellResourceJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productupsell/ProductUpsellResourceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/productupsell/ProductUpsellResource;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "resourceLinkOfAssetResourceOfNullableAnyAdapter", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "resourceLinkOfEntryResourceOfCtaButtonAdapter", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/productupsell/ProductUpsellResource$CtaButton;", "nullableResourceLinkOfEntryResourceOfCtaButtonAdapter", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.productupsell.ProductUpsellResourceJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ProductUpsellResource> {
    private final JsonAdapter<ResourceLink<EntryResource<ProductUpsellResource.CtaButton>>> nullableResourceLinkOfEntryResourceOfCtaButtonAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<ResourceLink<AssetResource<?>>> resourceLinkOfAssetResourceOfNullableAnyAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<ProductUpsellResource.CtaButton>>> resourceLinkOfEntryResourceOfCtaButtonAdapter;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of(CarResultComposable2.BODY, "headerImage", "identifier", "primaryCta", "secondaryCta", "title");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), CarResultComposable2.BODY);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<ResourceLink<AssetResource<?>>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(AssetResource.class, Types.subtypeOf(Object.class))), SetsKt.emptySet(), "headerImage");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.resourceLinkOfAssetResourceOfNullableAnyAdapter = jsonAdapterAdapter2;
        JsonAdapter<ResourceLink<EntryResource<ProductUpsellResource.CtaButton>>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, ProductUpsellResource.CtaButton.class)), SetsKt.emptySet(), "primaryCta");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.resourceLinkOfEntryResourceOfCtaButtonAdapter = jsonAdapterAdapter3;
        JsonAdapter<ResourceLink<EntryResource<ProductUpsellResource.CtaButton>>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, ProductUpsellResource.CtaButton.class)), SetsKt.emptySet(), "secondaryCta");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableResourceLinkOfEntryResourceOfCtaButtonAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ProductUpsellResource");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ProductUpsellResource fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        ResourceLink<AssetResource<?>> resourceLinkFromJson = null;
        String strFromJson2 = null;
        ResourceLink<EntryResource<ProductUpsellResource.CtaButton>> resourceLinkFromJson2 = null;
        ResourceLink<EntryResource<ProductUpsellResource.CtaButton>> resourceLinkFromJson3 = null;
        String strFromJson3 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull(CarResultComposable2.BODY, CarResultComposable2.BODY, reader);
                    }
                    break;
                case 1:
                    resourceLinkFromJson = this.resourceLinkOfAssetResourceOfNullableAnyAdapter.fromJson(reader);
                    if (resourceLinkFromJson == null) {
                        throw Util.unexpectedNull("headerImage", "headerImage", reader);
                    }
                    break;
                case 2:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw Util.unexpectedNull("identifier", "identifier", reader);
                    }
                    break;
                case 3:
                    resourceLinkFromJson2 = this.resourceLinkOfEntryResourceOfCtaButtonAdapter.fromJson(reader);
                    if (resourceLinkFromJson2 == null) {
                        throw Util.unexpectedNull("primaryCta", "primaryCta", reader);
                    }
                    break;
                case 4:
                    resourceLinkFromJson3 = this.nullableResourceLinkOfEntryResourceOfCtaButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw Util.unexpectedNull("title", "title", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (strFromJson == null) {
            throw Util.missingProperty(CarResultComposable2.BODY, CarResultComposable2.BODY, reader);
        }
        if (resourceLinkFromJson == null) {
            throw Util.missingProperty("headerImage", "headerImage", reader);
        }
        if (strFromJson2 == null) {
            throw Util.missingProperty("identifier", "identifier", reader);
        }
        if (resourceLinkFromJson2 == null) {
            throw Util.missingProperty("primaryCta", "primaryCta", reader);
        }
        if (strFromJson3 != null) {
            return new ProductUpsellResource(strFromJson, resourceLinkFromJson, strFromJson2, resourceLinkFromJson2, resourceLinkFromJson3, strFromJson3);
        }
        throw Util.missingProperty("title", "title", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ProductUpsellResource value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name(CarResultComposable2.BODY);
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getBody());
        writer.name("headerImage");
        this.resourceLinkOfAssetResourceOfNullableAnyAdapter.toJson(writer, (JsonWriter) value_.getHeaderImage());
        writer.name("identifier");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getIdentifier());
        writer.name("primaryCta");
        this.resourceLinkOfEntryResourceOfCtaButtonAdapter.toJson(writer, (JsonWriter) value_.getPrimaryCta());
        writer.name("secondaryCta");
        this.nullableResourceLinkOfEntryResourceOfCtaButtonAdapter.toJson(writer, (JsonWriter) value_.getSecondaryCta());
        writer.name("title");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTitle());
        writer.endObject();
    }
}
