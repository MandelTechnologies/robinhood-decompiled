package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import java.io.IOException;
import kotlin.collections.SetsKt;
import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededErrorJsonAdapter */
/* loaded from: classes18.dex */
public final class C43676x269d3c3 extends JsonAdapter<GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError> {
    private final JsonAdapter<GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details> detailsAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("title", "code", ErrorBundle.DETAIL_ENTRY);
    private final JsonAdapter<String> stringAdapter;

    public C43676x269d3c3(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "title");
        this.detailsAdapter = moshi.adapter(GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details.class, SetsKt.emptySet(), ErrorBundle.DETAIL_ENTRY);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(97);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details detailsFromJson = null;
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
            } else if (iSelectName == 1) {
                strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson2 == null) {
                    throw Util.unexpectedNull("code", "code", jsonReader);
                }
            } else if (iSelectName == 2 && (detailsFromJson = this.detailsAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(ErrorBundle.DETAIL_ENTRY, ErrorBundle.DETAIL_ENTRY, jsonReader);
            }
        }
        jsonReader.endObject();
        if (strFromJson == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (strFromJson2 == null) {
            throw Util.missingProperty("code", "code", jsonReader);
        }
        if (detailsFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError(strFromJson, strFromJson2, detailsFromJson);
        }
        throw Util.missingProperty(ErrorBundle.DETAIL_ENTRY, ErrorBundle.DETAIL_ENTRY, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError pageLimitExceededError) throws IOException {
        if (pageLimitExceededError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pageLimitExceededError.getTitle());
        jsonWriter.name("code");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pageLimitExceededError.getCode());
        jsonWriter.name(ErrorBundle.DETAIL_ENTRY);
        this.detailsAdapter.toJson(jsonWriter, (JsonWriter) pageLimitExceededError.getDetails());
        jsonWriter.endObject();
    }
}
