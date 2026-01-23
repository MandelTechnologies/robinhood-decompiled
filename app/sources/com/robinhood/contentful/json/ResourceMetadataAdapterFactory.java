package com.robinhood.contentful.json;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.binding.ContentTypeBindingRegistry;
import com.robinhood.contentful.model.AssetMetadata;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentTypeMetadata;
import com.robinhood.contentful.model.EntryMetadata;
import com.robinhood.contentful.model.LinkMetadata;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.model.ResourceMetadata;
import com.robinhood.contentful.model.ResourceMetadata2;
import com.robinhood.contentful.model.ResourceMetadata5;
import com.robinhood.contentful.model.ResourceMetadata7;
import com.robinhood.contentful.model.SpaceMetadata;
import com.robinhood.contentful.model.SpaceResource;
import com.robinhood.utils.extensions.Moshi3;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: ResourceMetadataAdapterFactory.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/json/ResourceMetadataAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "contentTypeBindingRegistry", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "<init>", "(Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ResourceMetadataAdapterFactory implements JsonAdapter.Factory {
    private final ContentTypeBindingRegistry contentTypeBindingRegistry;

    public ResourceMetadataAdapterFactory(ContentTypeBindingRegistry contentTypeBindingRegistry) {
        Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
        this.contentTypeBindingRegistry = contentTypeBindingRegistry;
    }

    /* compiled from: ResourceMetadataAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u001c2\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u001cBQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/contentful/json/ResourceMetadataAdapterFactory$Adapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/contentful/model/ResourceMetadata;", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "contentTypeBindingRegistry", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/contentful/model/ResourceLink;", "resourceLinkAdapter", "j$/time/Instant", "instantAdapter", "Ljava/util/Locale;", "localeAdapter", "Lcom/robinhood/contentful/model/SpaceResource;", "spaceLinkAdapter", "<init>", "(Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "readFrom", "(Lcom/squareup/moshi/JsonReader;)Lcom/robinhood/contentful/model/ResourceMetadata;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "writeTo", "(Lcom/squareup/moshi/JsonWriter;Lcom/robinhood/contentful/model/ResourceMetadata;)V", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "Lcom/squareup/moshi/JsonAdapter;", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes15.dex */
    private static final class Adapter extends NullSafeJsonAdapter<ResourceMetadata<?>> {
        private static final JsonReader.Options OPTIONS = JsonReader.Options.m3152of("type", "id", "space", "revision", "createdAt", "updatedAt", "environment", "locale", "contentType", "linkType");
        private final ContentTypeBindingRegistry contentTypeBindingRegistry;
        private final JsonAdapter<Instant> instantAdapter;
        private final JsonAdapter<Locale> localeAdapter;
        private final JsonAdapter<ResourceLink<?>> resourceLinkAdapter;
        private final JsonAdapter<ResourceLink<SpaceResource>> spaceLinkAdapter;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public ResourceMetadata<?> readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            reader.beginObject();
            String strNextString = null;
            ResourceLink<SpaceResource> resourceLinkFromJson = null;
            String strNextString2 = null;
            Integer numValueOf = null;
            ResourceLink<?> resourceLinkFromJson2 = null;
            String strNextString3 = null;
            Instant instantFromJson = null;
            Instant instantFromJson2 = null;
            Locale localeFromJson = null;
            ResourceLink<?> resourceLink = null;
            while (reader.hasNext()) {
                switch (reader.selectName(OPTIONS)) {
                    case 0:
                        strNextString = reader.nextString();
                        break;
                    case 1:
                        strNextString2 = reader.nextString();
                        break;
                    case 2:
                        resourceLinkFromJson = this.spaceLinkAdapter.fromJson(reader);
                        break;
                    case 3:
                        numValueOf = Integer.valueOf(reader.nextInt());
                        break;
                    case 4:
                        instantFromJson = this.instantAdapter.fromJson(reader);
                        break;
                    case 5:
                        instantFromJson2 = this.instantAdapter.fromJson(reader);
                        break;
                    case 6:
                        resourceLinkFromJson2 = this.resourceLinkAdapter.fromJson(reader);
                        if (resourceLinkFromJson2 == null) {
                            Moshi3.throwRequiredProperty(reader, "environment");
                            throw new ExceptionsH();
                        }
                        break;
                    case 7:
                        localeFromJson = this.localeAdapter.fromJson(reader);
                        break;
                    case 8:
                        ResourceLink<?> resourceLinkFromJson3 = this.resourceLinkAdapter.fromJson(reader);
                        if (resourceLinkFromJson3 == null) {
                            Moshi3.throwRequiredProperty(reader, "contentType");
                            throw new ExceptionsH();
                        }
                        resourceLink = resourceLinkFromJson3;
                        break;
                    case 9:
                        strNextString3 = reader.nextString();
                        break;
                    default:
                        Moshi3.skipNameAndValue(reader);
                        break;
                }
            }
            Unit unit = Unit.INSTANCE;
            reader.endObject();
            if (Intrinsics.areEqual(strNextString, ContentResource.Type.Array.INSTANCE.getIdentifier())) {
                return ResourceMetadata2.INSTANCE;
            }
            ContentResource.Type type2 = ContentResource.Type.Asset.INSTANCE;
            ResourceLink<SpaceResource> resourceLink2 = resourceLinkFromJson;
            String str = strNextString2;
            Integer num = numValueOf;
            ResourceLink<?> resourceLink3 = resourceLinkFromJson2;
            Instant instant = instantFromJson;
            if (Intrinsics.areEqual(strNextString, type2.getIdentifier())) {
                if (str == null) {
                    Moshi3.throwRequiredProperty(reader, "id");
                    throw new ExceptionsH();
                }
                ResourceLink<SpaceResource> resourceLink4 = resourceLink2;
                if (resourceLink4 == null) {
                    Moshi3.throwRequiredProperty(reader, "space");
                    throw new ExceptionsH();
                }
                if (resourceLink3 == null) {
                    Moshi3.throwRequiredProperty(reader, "environment");
                    throw new ExceptionsH();
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    Instant instant2 = instant;
                    if (instant2 == null) {
                        Moshi3.throwRequiredProperty(reader, "createdAt");
                        throw new ExceptionsH();
                    }
                    Instant instant3 = instantFromJson2;
                    if (instant3 != null) {
                        return new AssetMetadata(str, resourceLink4, resourceLink3, iIntValue, instant2, instant3, localeFromJson);
                    }
                    Moshi3.throwRequiredProperty(reader, "updatedAt");
                    throw new ExceptionsH();
                }
                Moshi3.throwRequiredProperty(reader, "revision");
                throw new ExceptionsH();
            }
            ContentResource.Type.ContentType contentType = ContentResource.Type.ContentType.INSTANCE;
            if (Intrinsics.areEqual(strNextString, contentType.getIdentifier())) {
                if (str == null) {
                    Moshi3.throwRequiredProperty(reader, "id");
                    throw new ExceptionsH();
                }
                ResourceLink<SpaceResource> resourceLink5 = resourceLink2;
                if (resourceLink5 == null) {
                    Moshi3.throwRequiredProperty(reader, "space");
                    throw new ExceptionsH();
                }
                if (resourceLink3 == null) {
                    Moshi3.throwRequiredProperty(reader, "environment");
                    throw new ExceptionsH();
                }
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    Instant instant4 = instant;
                    if (instant4 == null) {
                        Moshi3.throwRequiredProperty(reader, "createdAt");
                        throw new ExceptionsH();
                    }
                    Instant instant5 = instantFromJson2;
                    if (instant5 != null) {
                        return new ContentTypeMetadata(str, resourceLink5, resourceLink3, iIntValue2, instant4, instant5, localeFromJson);
                    }
                    Moshi3.throwRequiredProperty(reader, "updatedAt");
                    throw new ExceptionsH();
                }
                Moshi3.throwRequiredProperty(reader, "revision");
                throw new ExceptionsH();
            }
            ContentResource.Type.Entry entry = ContentResource.Type.Entry.INSTANCE;
            if (Intrinsics.areEqual(strNextString, entry.getIdentifier())) {
                if (str == null) {
                    Moshi3.throwRequiredProperty(reader, "id");
                    throw new ExceptionsH();
                }
                ResourceLink<SpaceResource> resourceLink6 = resourceLink2;
                if (resourceLink6 == null) {
                    Moshi3.throwRequiredProperty(reader, "space");
                    throw new ExceptionsH();
                }
                if (resourceLink3 == null) {
                    Moshi3.throwRequiredProperty(reader, "environment");
                    throw new ExceptionsH();
                }
                if (num != null) {
                    int iIntValue3 = num.intValue();
                    Instant instant6 = instant;
                    if (instant6 == null) {
                        Moshi3.throwRequiredProperty(reader, "createdAt");
                        throw new ExceptionsH();
                    }
                    Instant instant7 = instantFromJson2;
                    if (instant7 == null) {
                        Moshi3.throwRequiredProperty(reader, "updatedAt");
                        throw new ExceptionsH();
                    }
                    if (resourceLink == null) {
                        Moshi3.throwRequiredProperty(reader, "contentType");
                        throw new ExceptionsH();
                    }
                    ContentTypeBindingRegistry contentTypeBindingRegistry = this.contentTypeBindingRegistry;
                    Intrinsics.checkNotNull(resourceLink);
                    return new EntryMetadata(str, resourceLink6, resourceLink3, iIntValue3, instant6, instant7, localeFromJson, contentTypeBindingRegistry.getType(resourceLink.getSys().getId()), resourceLink);
                }
                Moshi3.throwRequiredProperty(reader, "revision");
                throw new ExceptionsH();
            }
            if (!Intrinsics.areEqual(strNextString, "Link")) {
                if (Intrinsics.areEqual(strNextString, ContentResource.Type.Space.INSTANCE.getIdentifier())) {
                    if (str != null) {
                        return new SpaceMetadata(str);
                    }
                    Moshi3.throwRequiredProperty(reader, "id");
                    throw new ExceptionsH();
                }
                throw new JsonDataException("Unsupported metadata type " + ((Object) strNextString) + " at " + reader.getPath());
            }
            if (str == null) {
                Moshi3.throwRequiredProperty(reader, "id");
                throw new ExceptionsH();
            }
            if (!Intrinsics.areEqual(strNextString3, type2.getIdentifier())) {
                if (Intrinsics.areEqual(strNextString3, contentType.getIdentifier())) {
                    type2 = contentType;
                } else if (Intrinsics.areEqual(strNextString3, entry.getIdentifier())) {
                    type2 = entry;
                } else {
                    type2 = ContentResource.Type.Environment.INSTANCE;
                    if (!Intrinsics.areEqual(strNextString3, type2.getIdentifier())) {
                        type2 = ContentResource.Type.Space.INSTANCE;
                        if (!Intrinsics.areEqual(strNextString3, type2.getIdentifier())) {
                            throw new JsonDataException("Unsupported link type " + ((Object) strNextString3) + " at " + reader.getPath());
                        }
                    }
                }
            }
            return new LinkMetadata(str, type2);
        }

        public Adapter(ContentTypeBindingRegistry contentTypeBindingRegistry, JsonAdapter<ResourceLink<?>> resourceLinkAdapter, JsonAdapter<Instant> instantAdapter, JsonAdapter<Locale> localeAdapter, JsonAdapter<ResourceLink<SpaceResource>> spaceLinkAdapter) {
            Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
            Intrinsics.checkNotNullParameter(resourceLinkAdapter, "resourceLinkAdapter");
            Intrinsics.checkNotNullParameter(instantAdapter, "instantAdapter");
            Intrinsics.checkNotNullParameter(localeAdapter, "localeAdapter");
            Intrinsics.checkNotNullParameter(spaceLinkAdapter, "spaceLinkAdapter");
            this.contentTypeBindingRegistry = contentTypeBindingRegistry;
            this.resourceLinkAdapter = resourceLinkAdapter;
            this.instantAdapter = instantAdapter;
            this.localeAdapter = localeAdapter;
            this.spaceLinkAdapter = spaceLinkAdapter;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, ResourceMetadata<?> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginObject();
            writer.name("type");
            writer.value(value.getType().getIdentifier());
            if (!(value instanceof ResourceMetadata2)) {
                if (!(value instanceof ResourceMetadata7)) {
                    throw new NoWhenBranchMatchedException();
                }
                writer.name("id");
                ResourceMetadata7 resourceMetadata7 = (ResourceMetadata7) value;
                writer.value(resourceMetadata7.getId());
                if (resourceMetadata7 instanceof ResourceMetadata5) {
                    writer.name("space");
                    ResourceMetadata5 resourceMetadata5 = (ResourceMetadata5) value;
                    this.spaceLinkAdapter.toJson(writer, (JsonWriter) resourceMetadata5.getSpace());
                    writer.name("revision");
                    writer.value(Integer.valueOf(resourceMetadata5.getRevision()));
                    writer.name("createdAt");
                    this.instantAdapter.toJson(writer, (JsonWriter) resourceMetadata5.getCreatedAt());
                    writer.name("updatedAt");
                    this.instantAdapter.toJson(writer, (JsonWriter) resourceMetadata5.getUpdatedAt());
                    writer.name("environment");
                    this.resourceLinkAdapter.toJson(writer, (JsonWriter) resourceMetadata5.getEnvironment());
                    writer.name("locale");
                    this.localeAdapter.toJson(writer, (JsonWriter) resourceMetadata5.getLocale());
                    if (!(resourceMetadata5 instanceof AssetMetadata) && !(resourceMetadata5 instanceof ContentTypeMetadata)) {
                        if (!(resourceMetadata5 instanceof EntryMetadata)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        writer.name("contentType");
                        this.resourceLinkAdapter.toJson(writer, (JsonWriter) ((EntryMetadata) value).getContentType());
                    }
                } else if (!(resourceMetadata7 instanceof SpaceMetadata)) {
                    if (!(resourceMetadata7 instanceof LinkMetadata)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    writer.name("linkType");
                    writer.value(((LinkMetadata) value).getReferentType().getIdentifier());
                }
            }
            writer.endObject();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Class<?> rawType = Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (!ResourceMetadata.class.isAssignableFrom(rawType)) {
            return null;
        }
        ContentTypeBindingRegistry contentTypeBindingRegistry = this.contentTypeBindingRegistry;
        JsonAdapter jsonAdapterAdapter = moshi.adapter(ResourceLink.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        com.robinhood.utils.extensions.Types types = com.robinhood.utils.extensions.Types.INSTANCE;
        JsonAdapter jsonAdapterAdapter2 = moshi.adapter(new TypeToken<Instant>() { // from class: com.robinhood.contentful.json.ResourceMetadataAdapterFactory$create$$inlined$getAdapter$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        JsonAdapter jsonAdapterAdapter3 = moshi.adapter(new TypeToken<Locale>() { // from class: com.robinhood.contentful.json.ResourceMetadataAdapterFactory$create$$inlined$getAdapter$2
        }.getType());
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        JsonAdapter jsonAdapterAdapter4 = moshi.adapter(new TypeToken<ResourceLink<SpaceResource>>() { // from class: com.robinhood.contentful.json.ResourceMetadataAdapterFactory$create$$inlined$getAdapter$3
        }.getType());
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        return new Adapter(contentTypeBindingRegistry, jsonAdapterAdapter, jsonAdapterAdapter2, jsonAdapterAdapter3, jsonAdapterAdapter4);
    }
}
