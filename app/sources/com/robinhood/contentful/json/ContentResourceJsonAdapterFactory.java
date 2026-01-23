package com.robinhood.contentful.json;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.binding.ContentTypeBindingRegistry;
import com.robinhood.contentful.json.ContentResourceJsonAdapterFactory;
import com.robinhood.contentful.model.AssetMetadata;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentResource4;
import com.robinhood.contentful.model.ContentResource6;
import com.robinhood.contentful.model.ContentTypeMetadata;
import com.robinhood.contentful.model.ContentTypeResource;
import com.robinhood.contentful.model.EntryMetadata;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.LinkMetadata;
import com.robinhood.contentful.model.ResourceArray;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.model.ResourceMetadata;
import com.robinhood.contentful.model.ResourceMetadata2;
import com.robinhood.contentful.model.SpaceMetadata;
import com.robinhood.contentful.model.SpaceResource;
import com.robinhood.utils.extensions.Moshi3;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ContentResourceJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/json/ContentResourceJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "contentTypeBindingRegistry", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "<init>", "(Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ContentResourceJsonAdapterFactory implements JsonAdapter.Factory {
    private final ContentTypeBindingRegistry contentTypeBindingRegistry;

    public ContentResourceJsonAdapterFactory(ContentTypeBindingRegistry contentTypeBindingRegistry) {
        Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
        this.contentTypeBindingRegistry = contentTypeBindingRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ContentResourceJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0014J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\t\u001a6\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \f*\b\u0012\u0002\b\u0003\u0018\u00010\u000b0\u000b \f*\u001a\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \f*\b\u0012\u0002\b\u0003\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\r\u001a\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e¢\u0006\u0002\b\u00100\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0002\b\u00100\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\nX\u0082\u0004¢\u0006\u0002\n\u0000Rj\u0010\u0015\u001a^\u0012(\u0012&\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018 \f*\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00160\u0016 \f*.\u0012(\u0012&\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018 \f*\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00160\u0016\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\n8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, m3636d2 = {"Lcom/robinhood/contentful/json/ContentResourceJsonAdapterFactory$Adapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/contentful/model/ContentResource;", "moshi", "Lcom/squareup/moshi/Moshi;", "contentTypeBindingRegistry", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "<init>", "(Lcom/squareup/moshi/Moshi;Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;)V", "assetContentAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/contentful/model/AssetResource$Content;", "kotlin.jvm.PlatformType", "contentTypeFieldsAdapter", "", "Lcom/robinhood/contentful/model/ContentTypeResource$Field;", "Lkotlin/jvm/JvmSuppressWildcards;", "localeEntryAdapter", "Lcom/robinhood/contentful/model/SpaceResource$LocaleEntry;", "resourceMetadataAdapter", "Lcom/robinhood/contentful/model/ResourceMetadata;", "genericMapAdapter", "", "", "", "contentResourceListAdapter", "getContentResourceListAdapter$annotations", "()V", "getContentResourceListAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "contentResourceListAdapter$delegate", "Lkotlin/Lazy;", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes15.dex */
    static final class Adapter extends NullSafeJsonAdapter<ContentResource> {
        private final JsonAdapter<AssetResource.Content<?>> assetContentAdapter;

        /* renamed from: contentResourceListAdapter$delegate, reason: from kotlin metadata */
        private final Lazy contentResourceListAdapter;
        private final ContentTypeBindingRegistry contentTypeBindingRegistry;
        private final JsonAdapter<List<ContentTypeResource.Field<?>>> contentTypeFieldsAdapter;
        private final JsonAdapter<Map<String, Object>> genericMapAdapter;
        private final JsonAdapter<List<SpaceResource.LocaleEntry>> localeEntryAdapter;
        private final Moshi moshi;
        private final JsonAdapter<ResourceMetadata<?>> resourceMetadataAdapter;
        private static final JsonReader.Options OPTIONS = JsonReader.Options.m3152of("sys", "total", "skip", "limit", "items", "includes", "name", "displayField", "fields", "locales");
        private static final JsonReader.Options ARRAY_INCLUDES_OPTIONS = JsonReader.Options.m3152of(ContentResource.Type.Asset.INSTANCE.getIdentifier(), ContentResource.Type.Entry.INSTANCE.getIdentifier());

        private static /* synthetic */ void getContentResourceListAdapter$annotations() {
        }

        public Adapter(Moshi moshi, ContentTypeBindingRegistry contentTypeBindingRegistry) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
            this.moshi = moshi;
            this.contentTypeBindingRegistry = contentTypeBindingRegistry;
            this.assetContentAdapter = moshi.adapter(AssetResource.Content.class);
            Types types = Types.INSTANCE;
            JsonAdapter<List<ContentTypeResource.Field<?>>> jsonAdapterAdapter = moshi.adapter(new TypeToken<List<? extends ContentTypeResource.Field<?>>>() { // from class: com.robinhood.contentful.json.ContentResourceJsonAdapterFactory$Adapter$special$$inlined$getAdapter$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
            this.contentTypeFieldsAdapter = jsonAdapterAdapter;
            JsonAdapter<List<SpaceResource.LocaleEntry>> jsonAdapterAdapter2 = moshi.adapter(new TypeToken<List<? extends SpaceResource.LocaleEntry>>() { // from class: com.robinhood.contentful.json.ContentResourceJsonAdapterFactory$Adapter$special$$inlined$getAdapter$2
            }.getType());
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
            this.localeEntryAdapter = jsonAdapterAdapter2;
            JsonAdapter<ResourceMetadata<?>> jsonAdapterAdapter3 = moshi.adapter(new TypeToken<ResourceMetadata<?>>() { // from class: com.robinhood.contentful.json.ContentResourceJsonAdapterFactory$Adapter$special$$inlined$getAdapter$3
            }.getType());
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
            this.resourceMetadataAdapter = jsonAdapterAdapter3;
            this.genericMapAdapter = moshi.adapter(com.squareup.moshi.Types.newParameterizedType(Map.class, String.class, Object.class));
            this.contentResourceListAdapter = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.contentful.json.ContentResourceJsonAdapterFactory$Adapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContentResourceJsonAdapterFactory.Adapter.contentResourceListAdapter_delegate$lambda$0(this.f$0);
                }
            });
        }

        private final JsonAdapter<List<ContentResource>> getContentResourceListAdapter() {
            return (JsonAdapter) this.contentResourceListAdapter.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final JsonAdapter contentResourceListAdapter_delegate$lambda$0(Adapter adapter) {
            Moshi moshi = adapter.moshi;
            Types types = Types.INSTANCE;
            JsonAdapter jsonAdapterAdapter = moshi.adapter(new TypeToken<List<? extends ContentResource>>() { // from class: com.robinhood.contentful.json.ContentResourceJsonAdapterFactory$Adapter$contentResourceListAdapter_delegate$lambda$0$$inlined$getAdapter$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
            return jsonAdapterAdapter;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public ContentResource readFrom(JsonReader reader) throws IOException {
            JsonAdapter<Map<String, Object>> jsonAdapterAdapter;
            Intrinsics.checkNotNullParameter(reader, "reader");
            JsonReader jsonReaderPeekJson = reader.peekJson();
            Intrinsics.checkNotNullExpressionValue(jsonReaderPeekJson, "peekJson(...)");
            jsonReaderPeekJson.beginObject();
            Integer numValueOf = null;
            ResourceMetadata<?> resourceMetadataFromJson = null;
            while (jsonReaderPeekJson.hasNext()) {
                int iSelectName = jsonReaderPeekJson.selectName(OPTIONS);
                if (iSelectName == 0) {
                    resourceMetadataFromJson = this.resourceMetadataAdapter.fromJson(jsonReaderPeekJson);
                } else if (1 > iSelectName || iSelectName >= 10) {
                    Moshi3.skipNameAndValue(jsonReaderPeekJson);
                } else {
                    jsonReaderPeekJson.skipValue();
                }
            }
            Unit unit = Unit.INSTANCE;
            jsonReaderPeekJson.endObject();
            if (resourceMetadataFromJson == null) {
                Moshi3.throwRequiredProperty(reader, "sys");
                throw new ExceptionsH();
            }
            ResourceArray.Includes empty = ResourceArray.Includes.INSTANCE.getEMPTY();
            reader.beginObject();
            ResourceArray.Includes includes = empty;
            AssetResource.Content<?> contentFromJson = null;
            Integer numValueOf2 = null;
            Map<String, Object> mapFromJson = null;
            List<ContentTypeResource.Field<?>> listFromJson = null;
            Integer numValueOf3 = null;
            List<SpaceResource.LocaleEntry> listFromJson2 = null;
            List<ContentResource> listFromJson3 = null;
            String strNextString = null;
            String strNextString2 = null;
            while (reader.hasNext()) {
                switch (reader.selectName(OPTIONS)) {
                    case 0:
                        reader.skipValue();
                        break;
                    case 1:
                        numValueOf = Integer.valueOf(reader.nextInt());
                        break;
                    case 2:
                        numValueOf2 = Integer.valueOf(reader.nextInt());
                        break;
                    case 3:
                        numValueOf3 = Integer.valueOf(reader.nextInt());
                        break;
                    case 4:
                        listFromJson3 = getContentResourceListAdapter().fromJson(reader);
                        break;
                    case 5:
                        List<ContentResource> listEmptyList = CollectionsKt.emptyList();
                        List<ContentResource> listEmptyList2 = CollectionsKt.emptyList();
                        reader.beginObject();
                        while (reader.hasNext()) {
                            int iSelectName2 = reader.selectName(ARRAY_INCLUDES_OPTIONS);
                            if (iSelectName2 == 0) {
                                List<ContentResource> listFromJson4 = getContentResourceListAdapter().fromJson(reader);
                                Intrinsics.checkNotNull(listFromJson4, "null cannot be cast to non-null type kotlin.collections.List<com.robinhood.contentful.model.AssetResource<*>>");
                                listEmptyList = listFromJson4;
                            } else if (iSelectName2 == 1) {
                                List<ContentResource> listFromJson5 = getContentResourceListAdapter().fromJson(reader);
                                Intrinsics.checkNotNull(listFromJson5, "null cannot be cast to non-null type kotlin.collections.List<com.robinhood.contentful.model.EntryResource<*>>");
                                listEmptyList2 = listFromJson5;
                            }
                        }
                        Unit unit2 = Unit.INSTANCE;
                        reader.endObject();
                        includes = new ResourceArray.Includes(listEmptyList, listEmptyList2);
                        break;
                    case 6:
                        strNextString = reader.nextString();
                        break;
                    case 7:
                        strNextString2 = reader.nextString();
                        break;
                    case 8:
                        ResourceMetadata<?> resourceMetadata = resourceMetadataFromJson;
                        if (resourceMetadata instanceof AssetMetadata) {
                            contentFromJson = this.assetContentAdapter.fromJson(reader);
                            break;
                        } else if (resourceMetadata instanceof ContentTypeMetadata) {
                            listFromJson = this.contentTypeFieldsAdapter.fromJson(reader);
                            break;
                        } else if (resourceMetadata instanceof EntryMetadata) {
                            Class<?> type2 = this.contentTypeBindingRegistry.getType(((EntryMetadata) resourceMetadata).getContentType().getSys().getId());
                            if (type2 == null || (jsonAdapterAdapter = this.moshi.adapter((Class) type2)) == null) {
                                jsonAdapterAdapter = this.genericMapAdapter;
                            }
                            mapFromJson = jsonAdapterAdapter.fromJson(reader);
                            break;
                        } else {
                            reader.skipValue();
                            break;
                        }
                        break;
                    case 9:
                        listFromJson2 = this.localeEntryAdapter.fromJson(reader);
                        break;
                    default:
                        Moshi3.skipNameAndValue(reader);
                        break;
                }
            }
            Unit unit3 = Unit.INSTANCE;
            reader.endObject();
            ResourceMetadata<?> resourceMetadata2 = resourceMetadataFromJson;
            if (resourceMetadata2 instanceof ResourceMetadata2) {
                if (numValueOf == null) {
                    Moshi3.throwRequiredProperty(reader, "total");
                    throw new ExceptionsH();
                }
                int iIntValue = numValueOf.intValue();
                if (numValueOf2 == null) {
                    Moshi3.throwRequiredProperty(reader, "skip");
                    throw new ExceptionsH();
                }
                int iIntValue2 = numValueOf2.intValue();
                if (numValueOf3 == null) {
                    Moshi3.throwRequiredProperty(reader, "limit");
                    throw new ExceptionsH();
                }
                int iIntValue3 = numValueOf3.intValue();
                List<ContentResource> list = listFromJson3;
                if (list != null) {
                    return new ResourceArray(iIntValue, iIntValue2, iIntValue3, list, includes);
                }
                Moshi3.throwRequiredProperty(reader, "items");
                throw new ExceptionsH();
            }
            if (resourceMetadata2 instanceof AssetMetadata) {
                AssetMetadata assetMetadata = (AssetMetadata) resourceMetadata2;
                AssetResource.Content<?> content = contentFromJson;
                if (content != null) {
                    return new AssetResource(assetMetadata, content);
                }
                Moshi3.throwRequiredProperty(reader, "fields");
                throw new ExceptionsH();
            }
            if (resourceMetadata2 instanceof ContentTypeMetadata) {
                ContentTypeMetadata contentTypeMetadata = (ContentTypeMetadata) resourceMetadata2;
                if (strNextString == null) {
                    Moshi3.throwRequiredProperty(reader, "name");
                    throw new ExceptionsH();
                }
                if (strNextString2 == null) {
                    Moshi3.throwRequiredProperty(reader, "displayField");
                    throw new ExceptionsH();
                }
                List<ContentTypeResource.Field<?>> list2 = listFromJson;
                if (list2 == null) {
                    Moshi3.throwRequiredProperty(reader, "fields");
                    throw new ExceptionsH();
                }
                List<ContentTypeResource.Field<?>> list3 = list2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                for (Object obj : list3) {
                    linkedHashMap.put(((ContentTypeResource.Field) obj).getId(), obj);
                }
                return new ContentTypeResource(contentTypeMetadata, strNextString, strNextString2, linkedHashMap, this.contentTypeBindingRegistry.getType(contentTypeMetadata.getId()));
            }
            String str = strNextString;
            if (resourceMetadata2 instanceof EntryMetadata) {
                EntryMetadata entryMetadata = (EntryMetadata) resourceMetadata2;
                if (mapFromJson != null) {
                    return new EntryResource(entryMetadata, mapFromJson);
                }
                Moshi3.throwRequiredProperty(reader, "fields");
                throw new ExceptionsH();
            }
            if (!(resourceMetadata2 instanceof SpaceMetadata)) {
                if (resourceMetadata2 instanceof LinkMetadata) {
                    return new ResourceLink((LinkMetadata) resourceMetadata2);
                }
                throw new NoWhenBranchMatchedException();
            }
            SpaceMetadata spaceMetadata = (SpaceMetadata) resourceMetadata2;
            if (str == null) {
                Moshi3.throwRequiredProperty(reader, "name");
                throw new ExceptionsH();
            }
            List<SpaceResource.LocaleEntry> list4 = listFromJson2;
            if (list4 != null) {
                return new SpaceResource(spaceMetadata, str, list4);
            }
            Moshi3.throwRequiredProperty(reader, "locales");
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, ContentResource value) throws IOException {
            JsonAdapter jsonAdapterAdapter;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginObject();
            writer.name("sys");
            this.resourceMetadataAdapter.toJson(writer, (JsonWriter) value.getSys());
            if (value instanceof ResourceArray) {
                writer.name("total");
                ResourceArray resourceArray = (ResourceArray) value;
                writer.value(Integer.valueOf(resourceArray.getTotal()));
                writer.name("skip");
                writer.value(Integer.valueOf(resourceArray.getSkip()));
                writer.name("limit");
                writer.value(Integer.valueOf(resourceArray.getLimit()));
                writer.name("items");
                getContentResourceListAdapter().toJson(writer, (JsonWriter) resourceArray.getItems());
                ResourceArray.Includes includes = resourceArray.getIncludes();
                if (!includes.getAssets().isEmpty() || !includes.getEntries().isEmpty()) {
                    JsonWriter jsonWriterName = writer.name("includes");
                    Intrinsics.checkNotNullExpressionValue(jsonWriterName, "name(...)");
                    jsonWriterName.beginObject();
                    if (!includes.getAssets().isEmpty()) {
                        jsonWriterName.name(ContentResource.Type.Asset.INSTANCE.getIdentifier());
                        getContentResourceListAdapter().toJson(jsonWriterName, (JsonWriter) includes.getAssets());
                    }
                    if (!includes.getEntries().isEmpty()) {
                        jsonWriterName.name(ContentResource.Type.Entry.INSTANCE.getIdentifier());
                        getContentResourceListAdapter().toJson(jsonWriterName, (JsonWriter) includes.getEntries());
                    }
                    jsonWriterName.endObject();
                }
            } else {
                if (!(value instanceof ContentResource6)) {
                    throw new NoWhenBranchMatchedException();
                }
                ContentResource6 contentResource6 = (ContentResource6) value;
                if (contentResource6 instanceof ContentResource4) {
                    ContentResource4 contentResource4 = (ContentResource4) value;
                    if (contentResource4 instanceof AssetResource) {
                        writer.name("fields");
                        this.assetContentAdapter.toJson(writer, (JsonWriter) ((AssetResource) value).getContent());
                    } else if (contentResource4 instanceof ContentTypeResource) {
                        writer.name("name");
                        ContentTypeResource contentTypeResource = (ContentTypeResource) value;
                        writer.value(contentTypeResource.getName());
                        writer.name("displayField");
                        writer.value(contentTypeResource.getDisplayField());
                        writer.name("fields");
                        this.contentTypeFieldsAdapter.toJson(writer, (JsonWriter) CollectionsKt.toList(contentTypeResource.getFields().values()));
                    } else if (contentResource4 instanceof EntryResource) {
                        EntryResource entryResource = (EntryResource) value;
                        Class<?> type2 = this.contentTypeBindingRegistry.getType(entryResource.getSys().getContentType().getSys().getId());
                        if (type2 == null || (jsonAdapterAdapter = this.moshi.adapter((Class) type2)) == null) {
                            jsonAdapterAdapter = entryResource.getValue() instanceof Map ? this.genericMapAdapter : this.moshi.adapter((Class) entryResource.getValue().getClass());
                        }
                        Intrinsics.checkNotNull(jsonAdapterAdapter, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<kotlin.Any>");
                        writer.name("fields");
                        jsonAdapterAdapter.toJson(writer, (JsonWriter) entryResource.getValue());
                    } else {
                        throw new AssertionError("Won't let this be exhaustive?");
                    }
                } else if (!(contentResource6 instanceof ResourceLink)) {
                    if (contentResource6 instanceof SpaceResource) {
                        writer.name("name");
                        SpaceResource spaceResource = (SpaceResource) value;
                        writer.value(spaceResource.getName());
                        writer.name("locales");
                        this.localeEntryAdapter.toJson(writer, (JsonWriter) spaceResource.getLocales());
                    } else {
                        throw new AssertionError("Won't let this be exhaustive?");
                    }
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
        Class<?> rawType = com.squareup.moshi.Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (ContentResource.class.isAssignableFrom(rawType)) {
            return new Adapter(moshi, this.contentTypeBindingRegistry);
        }
        return null;
    }
}
