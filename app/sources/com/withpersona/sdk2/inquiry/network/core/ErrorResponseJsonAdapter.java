package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import java.io.IOException;
import java.util.List;
import kotlin.collections.SetsKt;

/* loaded from: classes18.dex */
public final class ErrorResponseJsonAdapter extends JsonAdapter<ErrorResponse> {
    private final JsonAdapter<List<ErrorResponse.Error>> nullableListOfErrorAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("errors");

    public ErrorResponseJsonAdapter(Moshi moshi) {
        this.nullableListOfErrorAdapter = moshi.adapter(Types.newParameterizedType(List.class, ErrorResponse.Error.class), SetsKt.emptySet(), "errors");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ErrorResponse");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ErrorResponse fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        List<ErrorResponse.Error> listFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                listFromJson = this.nullableListOfErrorAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new ErrorResponse(listFromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, ErrorResponse errorResponse) throws IOException {
        if (errorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("errors");
        this.nullableListOfErrorAdapter.toJson(jsonWriter, (JsonWriter) errorResponse.getErrors());
        jsonWriter.endObject();
    }
}
