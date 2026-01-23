package com.robinhood.utils.extensions;

import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Moshi.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a#\u0010\u0007\u001a\u00020\u0004\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0086\b\u001a\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\n\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u0001H\u0086\b\u001a4\u0010\f\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\b0\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a4\u0010\u000f\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\b0\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001aN\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\b\"\u0010\b\u0001\u0010\u0011*\n\u0012\u0006\b\u0000\u0012\u0002H\b0\u0012*\u00020\r2\u0006\u0010\u0013\u001a\u0002H\u00112\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\b0\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u0005*\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a\u0012\u0010\u0016\u001a\u00020\u0017*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019\u001a/\u0010\u001a\u001a\u00020\u0005*\u00020\r2\u001d\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a/\u0010\u001c\u001a\u00020\u0005*\u00020\r2\u001d\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a\n\u0010\u001d\u001a\u00020\u0005*\u00020\r\u001a)\u0010\u001e\u001a\u00020\u0005*\u00020\u001f2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010 \u001a\u00020\u0005*\u00020\u001f2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010!\u001a\u00020\u0005*\u00020\u001f2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, m3636d2 = {"Moshi", "Lcom/squareup/moshi/Moshi;", "block", "Lkotlin/Function1;", "Lcom/squareup/moshi/Moshi$Builder;", "", "Lkotlin/ExtensionFunctionType;", "addAdapter", "T", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "getAdapter", "visitObject", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "visitArray", "readArrayTo", "C", "", "destination", "(Lcom/squareup/moshi/JsonReader;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "readObject", "throwRequiredProperty", "", "key", "", "forEachName", "Lkotlin/Function2;", "visitObjectNames", "skipNameAndValue", "writeObject", "Lcom/squareup/moshi/JsonWriter;", "writeArray", "flatten", "lib-serialization-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.MoshiKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Moshi3 {
    public static final Moshi Moshi(Function1<? super Moshi.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
        block.invoke(builderAdd);
        Moshi moshiBuild = builderAdd.build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        return moshiBuild;
    }

    public static final /* synthetic */ <T> Moshi.Builder addAdapter(Moshi.Builder builder, JsonAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Types types = Types.INSTANCE;
        Intrinsics.needClassReification();
        Moshi.Builder builderAdd = builder.add(new TypeToken<T>() { // from class: com.robinhood.utils.extensions.MoshiKt$addAdapter$$inlined$typeLiteral$1
        }.getType(), adapter);
        Intrinsics.checkNotNullExpressionValue(builderAdd, "add(...)");
        return builderAdd;
    }

    public static final /* synthetic */ <T> JsonAdapter<T> getAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "<this>");
        Types types = Types.INSTANCE;
        Intrinsics.needClassReification();
        JsonAdapter<T> jsonAdapterAdapter = moshi.adapter(new TypeToken<T>() { // from class: com.robinhood.utils.extensions.MoshiKt$getAdapter$$inlined$typeLiteral$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        return jsonAdapterAdapter;
    }

    public static final void readObject(JsonReader jsonReader, Function1<? super JsonReader, Unit> block) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            block.invoke(jsonReader);
        }
        Unit unit = Unit.INSTANCE;
        jsonReader.endObject();
    }

    public static final <T> T visitObject(JsonReader jsonReader, Function1<? super JsonReader, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jsonReader.beginObject();
        T tInvoke = block.invoke(jsonReader);
        jsonReader.endObject();
        return tInvoke;
    }

    public static final void visitObjectNames(JsonReader jsonReader, Function2<? super JsonReader, ? super String, Unit> block) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Intrinsics.checkNotNullExpressionValue(strNextName, "nextName(...)");
            block.invoke(jsonReader, strNextName);
        }
        Unit unit = Unit.INSTANCE;
        jsonReader.endObject();
    }

    public static final <T, C extends Collection<? super T>> C readArrayTo(JsonReader jsonReader, C destination, Function1<? super JsonReader, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(block, "block");
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            destination.add(block.invoke(jsonReader));
        }
        jsonReader.endArray();
        return destination;
    }

    public static final <T> T visitArray(JsonReader jsonReader, Function1<? super JsonReader, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jsonReader.beginArray();
        T tInvoke = block.invoke(jsonReader);
        jsonReader.endArray();
        return tInvoke;
    }

    public static final Void throwRequiredProperty(JsonReader jsonReader, String key) {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        throw new JsonDataException("Required property '" + key + "' is missing at " + jsonReader.getPath());
    }

    public static final void forEachName(JsonReader jsonReader, Function2<? super JsonReader, ? super String, Unit> block) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Intrinsics.checkNotNullExpressionValue(strNextName, "nextName(...)");
            block.invoke(jsonReader, strNextName);
        }
    }

    public static final void skipNameAndValue(JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        jsonReader.skipName();
        jsonReader.skipValue();
    }

    public static final void writeObject(JsonWriter jsonWriter, Function1<? super JsonWriter, Unit> block) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jsonWriter.beginObject();
        block.invoke(jsonWriter);
        jsonWriter.endObject();
    }

    public static final void writeArray(JsonWriter jsonWriter, Function1<? super JsonWriter, Unit> block) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jsonWriter.beginArray();
        block.invoke(jsonWriter);
        jsonWriter.endArray();
    }

    public static final void flatten(JsonWriter jsonWriter, Function1<? super JsonWriter, Unit> block) {
        Intrinsics.checkNotNullParameter(jsonWriter, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int iBeginFlatten = jsonWriter.beginFlatten();
        block.invoke(jsonWriter);
        jsonWriter.endFlatten(iBeginFlatten);
    }
}
