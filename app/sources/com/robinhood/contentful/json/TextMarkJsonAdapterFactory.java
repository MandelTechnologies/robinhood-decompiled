package com.robinhood.contentful.json;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.model.TextMark;
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
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TextMarkJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/contentful/json/TextMarkJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "SetAdapter", "Adapter", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class TextMarkJsonAdapterFactory implements JsonAdapter.Factory {
    public static final TextMarkJsonAdapterFactory INSTANCE = new TextMarkJsonAdapterFactory();

    private TextMarkJsonAdapterFactory() {
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        if (Intrinsics.areEqual(type2, TextMark.class)) {
            return Adapter.INSTANCE;
        }
        if (!(type2 instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type2;
        if (!Intrinsics.areEqual(parameterizedType.getRawType(), Set.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        Object objFirst = ArraysKt.first(actualTypeArguments);
        Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
        Class<?> rawType = Types.getRawType((Type) objFirst);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (Intrinsics.areEqual(rawType, TextMark.class)) {
            return SetAdapter.INSTANCE;
        }
        return null;
    }

    /* compiled from: TextMarkJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/contentful/json/TextMarkJsonAdapterFactory$SetAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "", "Lcom/robinhood/contentful/model/TextMark;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes15.dex */
    private static final class SetAdapter extends NullSafeJsonAdapter<Set<? extends TextMark>> {
        public static final SetAdapter INSTANCE = new SetAdapter();

        private SetAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public Set<? extends TextMark> readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            EnumSet enumSetNoneOf = EnumSet.noneOf(TextMark.class);
            Intrinsics.checkNotNullExpressionValue(enumSetNoneOf, "noneOf(...)");
            Adapter adapter = Adapter.INSTANCE;
            reader.beginArray();
            while (reader.hasNext()) {
                enumSetNoneOf.add(adapter.fromJson(reader));
            }
            reader.endArray();
            return enumSetNoneOf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, Set<? extends TextMark> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginArray();
            Iterator<? extends TextMark> it = value.iterator();
            while (it.hasNext()) {
                Adapter.INSTANCE.toJson(writer, (JsonWriter) it.next());
            }
            writer.endArray();
        }
    }

    /* compiled from: TextMarkJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/json/TextMarkJsonAdapterFactory$Adapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/contentful/model/TextMark;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "OPTIONS", "Lcom/squareup/moshi/JsonReader$Options;", "kotlin.jvm.PlatformType", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes15.dex */
    private static final class Adapter extends NullSafeJsonAdapter<TextMark> {
        public static final Adapter INSTANCE = new Adapter();
        private static final JsonReader.Options OPTIONS = JsonReader.Options.m3152of("type");

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public TextMark readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            reader.beginObject();
            TextMark textMark = null;
            String strNextString = null;
            while (reader.hasNext()) {
                if (reader.selectName(OPTIONS) == 0) {
                    strNextString = reader.nextString();
                } else {
                    Moshi3.skipNameAndValue(reader);
                }
            }
            Unit unit = Unit.INSTANCE;
            reader.endObject();
            if (strNextString == null) {
                Moshi3.throwRequiredProperty(reader, "type");
                throw new ExceptionsH();
            }
            TextMark[] textMarkArrValues = TextMark.values();
            int length = textMarkArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                TextMark textMark2 = textMarkArrValues[i];
                if (Intrinsics.areEqual(textMark2.getType(), strNextString)) {
                    textMark = textMark2;
                    break;
                }
                i++;
            }
            if (textMark != null) {
                return textMark;
            }
            throw new JsonDataException("Unsupported mark: " + ((Object) strNextString));
        }

        private Adapter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, TextMark value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginObject();
            writer.name("type");
            writer.value(value.getType());
            writer.endObject();
        }
    }
}
