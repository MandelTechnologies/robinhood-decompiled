package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import java.io.IOException;
import java.lang.reflect.Constructor;
import kotlin.collections.SetsKt;
import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter */
/* loaded from: classes18.dex */
public final class C43678x99b5be6e extends JsonAdapter<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> {
    private volatile Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> constructorRef;
    private final JsonAdapter<ErrorDetails> nullableErrorDetailsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("title", "code", ErrorBundle.DETAIL_ENTRY);
    private final JsonAdapter<String> stringAdapter;

    public C43678x99b5be6e(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "title");
        this.nullableStringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "code");
        this.nullableErrorDetailsAdapter = moshi.adapter(ErrorDetails.class, SetsKt.emptySet(), ErrorBundle.DETAIL_ENTRY);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(87);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError fromJson(JsonReader jsonReader) throws NoSuchMethodException, IOException, SecurityException {
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        ErrorDetails errorDetailsFromJson = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
                i &= -2;
            } else if (iSelectName == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (iSelectName == 2) {
                errorDetailsFromJson = this.nullableErrorDetailsAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(strFromJson, strFromJson2, errorDetailsFromJson);
        }
        Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError.class.getDeclaredConstructor(String.class, String.class, ErrorDetails.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(strFromJson, strFromJson2, errorDetailsFromJson, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError unknownError) throws IOException {
        if (unknownError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) unknownError.getTitle());
        jsonWriter.name("code");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) unknownError.getCode());
        jsonWriter.name(ErrorBundle.DETAIL_ENTRY);
        this.nullableErrorDetailsAdapter.toJson(jsonWriter, (JsonWriter) unknownError.getDetails());
        jsonWriter.endObject();
    }
}
