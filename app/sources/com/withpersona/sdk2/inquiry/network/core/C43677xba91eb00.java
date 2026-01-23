package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import java.io.IOException;
import kotlin.collections.SetsKt;

/* renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededError_DetailsJsonAdapter */
/* loaded from: classes18.dex */
public final class C43677xba91eb00 extends JsonAdapter<GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("page_limit");

    public C43677xba91eb00(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "pageLimit");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(105);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0 && (numFromJson = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("pageLimit", "page_limit", jsonReader);
            }
        }
        jsonReader.endObject();
        if (numFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details(numFromJson.intValue());
        }
        throw Util.missingProperty("pageLimit", "page_limit", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details details) throws IOException {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("page_limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(details.getPageLimit()));
        jsonWriter.endObject();
    }
}
