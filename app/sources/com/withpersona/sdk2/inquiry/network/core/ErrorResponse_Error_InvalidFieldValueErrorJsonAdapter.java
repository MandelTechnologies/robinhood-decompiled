package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.io.IOException;
import java.util.Map;
import kotlin.collections.SetsKt;
import org.bouncycastle.i18n.ErrorBundle;

/* loaded from: classes18.dex */
public final class ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter extends JsonAdapter<ErrorResponse.Error.InvalidFieldValueError> {
    private final JsonAdapter<Map<String, UiComponentError>> nullableMapOfStringUiComponentErrorAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("title", ErrorBundle.DETAIL_ENTRY);

    public ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter(Moshi moshi) {
        this.nullableStringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "title");
        this.nullableMapOfStringUiComponentErrorAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, UiComponentError.class), SetsKt.emptySet(), ErrorBundle.DETAIL_ENTRY);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ErrorResponse.Error.InvalidFieldValueError");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ErrorResponse.Error.InvalidFieldValueError fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strFromJson = null;
        Map<String, UiComponentError> mapFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (iSelectName == 1) {
                mapFromJson = this.nullableMapOfStringUiComponentErrorAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new ErrorResponse.Error.InvalidFieldValueError(strFromJson, mapFromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, ErrorResponse.Error.InvalidFieldValueError invalidFieldValueError) throws IOException {
        if (invalidFieldValueError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) invalidFieldValueError.getTitle());
        jsonWriter.name(ErrorBundle.DETAIL_ENTRY);
        this.nullableMapOfStringUiComponentErrorAdapter.toJson(jsonWriter, (JsonWriter) invalidFieldValueError.getDetails());
        jsonWriter.endObject();
    }
}
