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

/* renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter */
/* loaded from: classes18.dex */
public final class C43665xa6a39fa9 extends JsonAdapter<GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("uploaded_file_type", "enabled_file_types");
    private final JsonAdapter<String> stringAdapter;

    public C43665xa6a39fa9(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "uploadedFileType");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), SetsKt.emptySet(), "enabledFileTypes");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(104);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strFromJson = null;
        List<String> listFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("uploadedFileType", "uploaded_file_type", jsonReader);
                }
            } else if (iSelectName == 1 && (listFromJson = this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("enabledFileTypes", "enabled_file_types", jsonReader);
            }
        }
        jsonReader.endObject();
        if (strFromJson == null) {
            throw Util.missingProperty("uploadedFileType", "uploaded_file_type", jsonReader);
        }
        if (listFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details(strFromJson, listFromJson);
        }
        throw Util.missingProperty("enabledFileTypes", "enabled_file_types", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details details) throws IOException {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("uploaded_file_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) details.getUploadedFileType());
        jsonWriter.name("enabled_file_types");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) details.getEnabledFileTypes());
        jsonWriter.endObject();
    }
}
