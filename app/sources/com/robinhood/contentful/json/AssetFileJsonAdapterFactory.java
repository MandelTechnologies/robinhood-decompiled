package com.robinhood.contentful.json;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.GenericDetail;
import com.robinhood.contentful.model.ImageDetail;
import com.robinhood.utils.extensions.Moshi3;
import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AssetFileJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/contentful/json/AssetFileJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class AssetFileJsonAdapterFactory implements JsonAdapter.Factory {
    public static final AssetFileJsonAdapterFactory INSTANCE = new AssetFileJsonAdapterFactory();

    private AssetFileJsonAdapterFactory() {
    }

    /* compiled from: AssetFileJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00172\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0017B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u001c\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0004*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/contentful/json/AssetFileJsonAdapterFactory$Adapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/contentful/model/AssetResource$File;", "genericDetailAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/contentful/model/GenericDetail;", "imageDetailAdapter", "Lcom/robinhood/contentful/model/ImageDetail;", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V", "assetAdapter", "Lcom/robinhood/contentful/model/AssetDetail;", "Lokhttp3/MediaType;", "getAssetAdapter", "(Lokhttp3/MediaType;)Lcom/squareup/moshi/JsonAdapter;", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes15.dex */
    private static final class Adapter extends NullSafeJsonAdapter<AssetResource.File<?>> {
        private static final JsonReader.Options OPTIONS = JsonReader.Options.m3152of("url", ErrorBundle.DETAIL_ENTRY, "fileName", "contentType");
        private final JsonAdapter<GenericDetail> genericDetailAdapter;
        private final JsonAdapter<ImageDetail> imageDetailAdapter;

        public Adapter(JsonAdapter<GenericDetail> genericDetailAdapter, JsonAdapter<ImageDetail> imageDetailAdapter) {
            Intrinsics.checkNotNullParameter(genericDetailAdapter, "genericDetailAdapter");
            Intrinsics.checkNotNullParameter(imageDetailAdapter, "imageDetailAdapter");
            this.genericDetailAdapter = genericDetailAdapter;
            this.imageDetailAdapter = imageDetailAdapter;
        }

        private final JsonAdapter<? extends AssetDetail> getAssetAdapter(MediaType mediaType) {
            return Intrinsics.areEqual(mediaType.getType(), "image") ? this.imageDetailAdapter : this.genericDetailAdapter;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public AssetResource.File<?> readFrom(JsonReader reader) throws IOException {
            JsonAdapter<? extends AssetDetail> assetAdapter;
            Intrinsics.checkNotNullParameter(reader, "reader");
            JsonReader jsonReaderPeekJson = reader.peekJson();
            Intrinsics.checkNotNullExpressionValue(jsonReaderPeekJson, "peekJson(...)");
            jsonReaderPeekJson.beginObject();
            String strNextString = null;
            MediaType mediaType = null;
            while (jsonReaderPeekJson.hasNext()) {
                int iSelectName = jsonReaderPeekJson.selectName(OPTIONS);
                if (iSelectName == 0) {
                    jsonReaderPeekJson.skipValue();
                } else if (iSelectName == 1) {
                    jsonReaderPeekJson.skipValue();
                } else if (iSelectName == 2) {
                    jsonReaderPeekJson.skipValue();
                } else if (iSelectName == 3) {
                    MediaType.Companion companion = MediaType.INSTANCE;
                    String strNextString2 = jsonReaderPeekJson.nextString();
                    Intrinsics.checkNotNullExpressionValue(strNextString2, "nextString(...)");
                    mediaType = companion.get(strNextString2);
                } else {
                    Moshi3.skipNameAndValue(jsonReaderPeekJson);
                }
            }
            Unit unit = Unit.INSTANCE;
            jsonReaderPeekJson.endObject();
            reader.beginObject();
            HttpUrl httpUrl = null;
            AssetDetail assetDetailFromJson = null;
            while (reader.hasNext()) {
                int iSelectName2 = reader.selectName(OPTIONS);
                if (iSelectName2 == 0) {
                    HttpUrl.Companion companion2 = HttpUrl.INSTANCE;
                    String strNextString3 = reader.nextString();
                    Intrinsics.checkNotNullExpressionValue(strNextString3, "nextString(...)");
                    httpUrl = companion2.get("https:" + StringsKt.removePrefix(strNextString3, "https://"));
                } else if (iSelectName2 != 1) {
                    if (iSelectName2 == 2) {
                        strNextString = reader.nextString();
                    } else if (iSelectName2 == 3) {
                        reader.skipValue();
                    } else {
                        Moshi3.skipNameAndValue(reader);
                    }
                } else if (mediaType == null || (assetAdapter = getAssetAdapter(mediaType)) == null || (assetDetailFromJson = assetAdapter.fromJson(reader)) == null) {
                    Moshi3.throwRequiredProperty(reader, "contentType");
                    throw new ExceptionsH();
                }
            }
            Unit unit2 = Unit.INSTANCE;
            reader.endObject();
            if (mediaType == null) {
                Moshi3.throwRequiredProperty(reader, "contentType");
                throw new ExceptionsH();
            }
            if (strNextString == null) {
                Moshi3.throwRequiredProperty(reader, "fileName");
                throw new ExceptionsH();
            }
            if (httpUrl == null) {
                Moshi3.throwRequiredProperty(reader, "url");
                throw new ExceptionsH();
            }
            if (assetDetailFromJson != null) {
                return new AssetResource.File<>(mediaType, strNextString, httpUrl, assetDetailFromJson);
            }
            Moshi3.throwRequiredProperty(reader, ErrorBundle.DETAIL_ENTRY);
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, AssetResource.File<?> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            HttpUrl url = value.getUrl();
            AssetDetail details = value.getDetails();
            String fileName = value.getFileName();
            MediaType mediaType = value.getMediaType();
            writer.beginObject();
            writer.name("url");
            writer.value(StringsKt.substringAfter$default(url.getUrl(), url.getScheme() + ":", (String) null, 2, (Object) null));
            writer.name(ErrorBundle.DETAIL_ENTRY);
            if (details instanceof GenericDetail) {
                this.genericDetailAdapter.toJson(writer, (JsonWriter) details);
            } else {
                if (!(details instanceof ImageDetail)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.imageDetailAdapter.toJson(writer, (JsonWriter) details);
            }
            writer.name("fileName");
            writer.value(fileName);
            writer.name("contentType");
            writer.value(mediaType.getMediaType());
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
        if (!AssetResource.File.class.isAssignableFrom(rawType)) {
            return null;
        }
        JsonAdapter jsonAdapterAdapter = moshi.adapter(GenericDetail.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        JsonAdapter jsonAdapterAdapter2 = moshi.adapter(ImageDetail.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        return new Adapter(jsonAdapterAdapter, jsonAdapterAdapter2);
    }
}
