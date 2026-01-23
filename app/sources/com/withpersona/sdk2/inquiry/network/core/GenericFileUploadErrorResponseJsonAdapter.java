package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import java.io.IOException;
import java.util.List;
import kotlin.collections.SetsKt;

/* loaded from: classes18.dex */
public final class GenericFileUploadErrorResponseJsonAdapter extends JsonAdapter<GenericFileUploadErrorResponse> {
    private final JsonAdapter<List<GenericFileUploadErrorResponse.DocumentErrorResponse>> listOfDocumentErrorResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("errors");

    public GenericFileUploadErrorResponseJsonAdapter(Moshi moshi) {
        this.listOfDocumentErrorResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, GenericFileUploadErrorResponse.DocumentErrorResponse.class), SetsKt.emptySet(), "errors");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        List<GenericFileUploadErrorResponse.DocumentErrorResponse> listFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0 && (listFromJson = this.listOfDocumentErrorResponseAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("errors", "errors", jsonReader);
            }
        }
        jsonReader.endObject();
        if (listFromJson != null) {
            return new GenericFileUploadErrorResponse(listFromJson);
        }
        throw Util.missingProperty("errors", "errors", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse genericFileUploadErrorResponse) throws IOException {
        if (genericFileUploadErrorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("errors");
        this.listOfDocumentErrorResponseAdapter.toJson(jsonWriter, (JsonWriter) genericFileUploadErrorResponse.getErrors());
        jsonWriter.endObject();
    }
}
