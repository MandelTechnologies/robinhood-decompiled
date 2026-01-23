package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FileAsset_UnknownAssetJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset_UnknownAssetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$UnknownAsset;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "nullableStringAdapter", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset_UnknownAssetJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<FileAsset.UnknownAsset> {
    private volatile Constructor<FileAsset.UnknownAsset> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("id", "url", "name", "mimeType", "rawMimeType");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "url");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("FileAsset.UnknownAsset");
        sb.append(')');
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public FileAsset.UnknownAsset fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        int i = -1;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("id", "id", reader);
                }
                i &= -2;
            } else if (iSelectName == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                i &= -5;
            } else if (iSelectName == 2) {
                strFromJson3 = this.stringAdapter.fromJson(reader);
                if (strFromJson3 == null) {
                    throw Util.unexpectedNull("name", "name", reader);
                }
                i &= -9;
            } else if (iSelectName == 3) {
                strFromJson4 = this.stringAdapter.fromJson(reader);
                if (strFromJson4 == null) {
                    throw Util.unexpectedNull("mimeType", "mimeType", reader);
                }
                i &= -17;
            } else if (iSelectName == 4) {
                strFromJson5 = this.stringAdapter.fromJson(reader);
                if (strFromJson5 == null) {
                    throw Util.unexpectedNull("rawMimeType", "rawMimeType", reader);
                }
                i &= -65;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i == -94) {
            Intrinsics.checkNotNull(strFromJson, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(strFromJson3, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(strFromJson4, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(strFromJson5, "null cannot be cast to non-null type kotlin.String");
            return new FileAsset.UnknownAsset(strFromJson, null, strFromJson2, strFromJson3, strFromJson4, null, strFromJson5, 34, null);
        }
        String str = strFromJson4;
        String str2 = strFromJson5;
        String str3 = strFromJson3;
        String str4 = strFromJson2;
        Constructor<FileAsset.UnknownAsset> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = FileAsset.UnknownAsset.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, File.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        FileAsset.UnknownAsset unknownAssetNewInstance = declaredConstructor.newInstance(strFromJson, null, str4, str3, str, null, str2, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(unknownAssetNewInstance, "newInstance(...)");
        return unknownAssetNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, FileAsset.UnknownAsset value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getId());
        writer.name("url");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getUrl());
        writer.name("name");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getName());
        writer.name("mimeType");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getMimeType());
        writer.name("rawMimeType");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getRawMimeType());
        writer.endObject();
    }
}
