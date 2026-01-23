package com.robinhood.contentful.json;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentTypeResource;
import com.robinhood.utils.extensions.Moshi3;
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
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContentTypeFieldJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/contentful/json/ContentTypeFieldJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ContentTypeFieldJsonAdapterFactory implements JsonAdapter.Factory {
    public static final ContentTypeFieldJsonAdapterFactory INSTANCE = new ContentTypeFieldJsonAdapterFactory();

    private ContentTypeFieldJsonAdapterFactory() {
    }

    /* compiled from: ContentTypeFieldJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0014\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0014J\u0018\u0010\u000f\u001a\u00020\u000b*\u00020\r2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J.\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\t*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013R\u0016\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/contentful/json/ContentTypeFieldJsonAdapterFactory$Adapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "readArrayElementType", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "appendType", "type", "toFieldType", "typeIdentifier", "", "elementType", "linkTypeIdentifier", "OPTIONS", "Lcom/squareup/moshi/JsonReader$Options;", "kotlin.jvm.PlatformType", "OPTIONS_FIELD_TYPE", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes15.dex */
    private static final class Adapter extends NullSafeJsonAdapter<ContentTypeResource.Field<?>> {
        public static final Adapter INSTANCE = new Adapter();
        private static final JsonReader.Options OPTIONS = JsonReader.Options.m3152of("id", "name", "type", "localized", "required", "disabled", "omitted", "items", "linkType");
        private static final JsonReader.Options OPTIONS_FIELD_TYPE = JsonReader.Options.m3152of("type", "items", "linkType");

        private Adapter() {
        }

        private final ContentTypeResource.Field.Type<?> readArrayElementType(JsonReader reader) throws IOException {
            reader.beginObject();
            String strNextString = null;
            ContentTypeResource.Field.Type<?> arrayElementType = null;
            String strNextString2 = null;
            while (reader.hasNext()) {
                int iSelectName = reader.selectName(OPTIONS_FIELD_TYPE);
                if (iSelectName == 0) {
                    strNextString = reader.nextString();
                } else if (iSelectName == 1) {
                    arrayElementType = INSTANCE.readArrayElementType(reader);
                } else if (iSelectName == 2) {
                    strNextString2 = reader.nextString();
                } else {
                    Moshi3.skipNameAndValue(reader);
                }
            }
            Unit unit = Unit.INSTANCE;
            reader.endObject();
            if (strNextString != null) {
                return toFieldType(reader, strNextString, arrayElementType, strNextString2);
            }
            Moshi3.throwRequiredProperty(reader, "type");
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public ContentTypeResource.Field<?> readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            reader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            boolean zNextBoolean = false;
            boolean zNextBoolean2 = false;
            boolean zNextBoolean3 = false;
            boolean zNextBoolean4 = false;
            ContentTypeResource.Field.Type<?> arrayElementType = null;
            while (reader.hasNext()) {
                switch (reader.selectName(OPTIONS)) {
                    case 0:
                        strNextString3 = reader.nextString();
                        break;
                    case 1:
                        strNextString4 = reader.nextString();
                        break;
                    case 2:
                        strNextString = reader.nextString();
                        break;
                    case 3:
                        zNextBoolean = reader.nextBoolean();
                        break;
                    case 4:
                        zNextBoolean2 = reader.nextBoolean();
                        break;
                    case 5:
                        zNextBoolean3 = reader.nextBoolean();
                        break;
                    case 6:
                        zNextBoolean4 = reader.nextBoolean();
                        break;
                    case 7:
                        arrayElementType = INSTANCE.readArrayElementType(reader);
                        break;
                    case 8:
                        strNextString2 = reader.nextString();
                        break;
                    default:
                        Moshi3.skipNameAndValue(reader);
                        break;
                }
            }
            Unit unit = Unit.INSTANCE;
            reader.endObject();
            String str = strNextString2;
            if (strNextString3 == null) {
                Moshi3.throwRequiredProperty(reader, "id");
                throw new ExceptionsH();
            }
            if (strNextString4 == null) {
                Moshi3.throwRequiredProperty(reader, "name");
                throw new ExceptionsH();
            }
            if (strNextString != null) {
                return new ContentTypeResource.Field<>(strNextString3, strNextString4, toFieldType(reader, strNextString, arrayElementType, str), zNextBoolean, zNextBoolean2, zNextBoolean3, zNextBoolean4);
            }
            Moshi3.throwRequiredProperty(reader, "type");
            throw new ExceptionsH();
        }

        private final void appendType(JsonWriter jsonWriter, ContentTypeResource.Field.Type<?> type2) throws IOException {
            jsonWriter.name("type");
            jsonWriter.value(type2.getIdentifier());
            if ((type2 instanceof ContentTypeResource.Field.Type.Boolean) || (type2 instanceof ContentTypeResource.Field.Type.Date) || (type2 instanceof ContentTypeResource.Field.Type.Integer) || (type2 instanceof ContentTypeResource.Field.Type.Number) || (type2 instanceof ContentTypeResource.Field.Type.Object) || (type2 instanceof ContentTypeResource.Field.Type.RichText) || (type2 instanceof ContentTypeResource.Field.Type.Symbol) || (type2 instanceof ContentTypeResource.Field.Type.Text)) {
                return;
            }
            if (type2 instanceof ContentTypeResource.Field.Type.Array) {
                JsonWriter jsonWriterName = jsonWriter.name("items");
                Intrinsics.checkNotNullExpressionValue(jsonWriterName, "name(...)");
                jsonWriterName.beginObject();
                INSTANCE.appendType(jsonWriterName, ((ContentTypeResource.Field.Type.Array) type2).getElementType());
                jsonWriterName.endObject();
                return;
            }
            if (!(type2 instanceof ContentTypeResource.Field.Type.Link)) {
                throw new NoWhenBranchMatchedException();
            }
            jsonWriter.name("linkType");
            jsonWriter.value(((ContentTypeResource.Field.Type.Link) type2).getReferentType().getIdentifier());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, ContentTypeResource.Field<?> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginObject();
            writer.name("id");
            writer.value(value.getId());
            writer.name("name");
            writer.value(value.getName());
            writer.name("localized");
            writer.value(value.isLocalized());
            writer.name("required");
            writer.value(value.isRequired());
            writer.name("disabled");
            writer.value(value.isDisabled());
            writer.name("omitted");
            writer.value(value.isOmitted());
            INSTANCE.appendType(writer, value.getType());
            writer.endObject();
        }

        public final ContentTypeResource.Field.Type<?> toFieldType(JsonReader jsonReader, String typeIdentifier, ContentTypeResource.Field.Type<?> type2, String str) {
            Intrinsics.checkNotNullParameter(jsonReader, "<this>");
            Intrinsics.checkNotNullParameter(typeIdentifier, "typeIdentifier");
            ContentTypeResource.Field.Type.Boolean r0 = ContentTypeResource.Field.Type.Boolean.INSTANCE;
            if (Intrinsics.areEqual(typeIdentifier, r0.getIdentifier())) {
                return r0;
            }
            ContentTypeResource.Field.Type.Date date = ContentTypeResource.Field.Type.Date.INSTANCE;
            if (Intrinsics.areEqual(typeIdentifier, date.getIdentifier())) {
                return date;
            }
            ContentTypeResource.Field.Type.Integer integer = ContentTypeResource.Field.Type.Integer.INSTANCE;
            if (Intrinsics.areEqual(typeIdentifier, integer.getIdentifier())) {
                return integer;
            }
            ContentTypeResource.Field.Type.Number number = ContentTypeResource.Field.Type.Number.INSTANCE;
            if (Intrinsics.areEqual(typeIdentifier, number.getIdentifier())) {
                return number;
            }
            ContentTypeResource.Field.Type.Object object = ContentTypeResource.Field.Type.Object.INSTANCE;
            if (Intrinsics.areEqual(typeIdentifier, object.getIdentifier())) {
                return object;
            }
            ContentTypeResource.Field.Type.RichText richText = ContentTypeResource.Field.Type.RichText.INSTANCE;
            if (Intrinsics.areEqual(typeIdentifier, richText.getIdentifier())) {
                return richText;
            }
            ContentTypeResource.Field.Type.Symbol symbol = ContentTypeResource.Field.Type.Symbol.INSTANCE;
            if (Intrinsics.areEqual(typeIdentifier, symbol.getIdentifier())) {
                return symbol;
            }
            ContentTypeResource.Field.Type.Text text = ContentTypeResource.Field.Type.Text.INSTANCE;
            if (Intrinsics.areEqual(typeIdentifier, text.getIdentifier())) {
                return text;
            }
            if (Intrinsics.areEqual(typeIdentifier, ContentTypeResource.Field.Type.Array.identifier)) {
                if (type2 != null) {
                    return new ContentTypeResource.Field.Type.Array(type2);
                }
                Moshi3.throwRequiredProperty(jsonReader, "items");
                throw new ExceptionsH();
            }
            if (!Intrinsics.areEqual(typeIdentifier, "Link")) {
                throw new JsonDataException("Unknown type " + typeIdentifier + " at " + jsonReader.getPath());
            }
            if (str == null) {
                Moshi3.throwRequiredProperty(jsonReader, "linkType");
                throw new ExceptionsH();
            }
            if (Intrinsics.areEqual(str, ContentResource.Type.Array.INSTANCE.getIdentifier())) {
                throw new JsonDataException("Array not supported here: " + jsonReader.getPath());
            }
            ContentResource.Type type3 = ContentResource.Type.Asset.INSTANCE;
            if (!Intrinsics.areEqual(str, type3.getIdentifier())) {
                type3 = ContentResource.Type.ContentType.INSTANCE;
                if (!Intrinsics.areEqual(str, type3.getIdentifier())) {
                    type3 = ContentResource.Type.Entry.INSTANCE;
                    if (!Intrinsics.areEqual(str, type3.getIdentifier())) {
                        type3 = ContentResource.Type.Environment.INSTANCE;
                        if (!Intrinsics.areEqual(str, type3.getIdentifier())) {
                            if (Intrinsics.areEqual(str, "Link")) {
                                throw new JsonDataException("Link not supported here: " + jsonReader.getPath());
                            }
                            type3 = ContentResource.Type.Space.INSTANCE;
                            if (!Intrinsics.areEqual(str, type3.getIdentifier())) {
                                throw new JsonDataException("Unknown resource type " + str + " at " + jsonReader.getPath());
                            }
                        }
                    }
                }
            }
            return new ContentTypeResource.Field.Type.Link(type3);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Class<?> rawType = Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (ContentTypeResource.Field.class.isAssignableFrom(rawType)) {
            return Adapter.INSTANCE;
        }
        return null;
    }
}
