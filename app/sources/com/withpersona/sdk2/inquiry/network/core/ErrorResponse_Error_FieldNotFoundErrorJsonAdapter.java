package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import java.io.IOException;
import kotlin.collections.SetsKt;
import org.bouncycastle.i18n.ErrorBundle;

/* loaded from: classes18.dex */
public final class ErrorResponse_Error_FieldNotFoundErrorJsonAdapter extends JsonAdapter<ErrorResponse.Error.FieldNotFoundError> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("title", ErrorBundle.DETAIL_ENTRY);

    public ErrorResponse_Error_FieldNotFoundErrorJsonAdapter(Moshi moshi) {
        this.nullableStringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "title");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ErrorResponse.Error.FieldNotFoundError");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ErrorResponse.Error.FieldNotFoundError fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (iSelectName == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new ErrorResponse.Error.FieldNotFoundError(strFromJson, strFromJson2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, ErrorResponse.Error.FieldNotFoundError fieldNotFoundError) throws IOException {
        if (fieldNotFoundError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) fieldNotFoundError.getTitle());
        jsonWriter.name(ErrorBundle.DETAIL_ENTRY);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) fieldNotFoundError.getDetails());
        jsonWriter.endObject();
    }
}
