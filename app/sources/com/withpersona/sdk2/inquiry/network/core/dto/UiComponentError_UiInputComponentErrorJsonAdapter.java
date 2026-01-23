package com.withpersona.sdk2.inquiry.network.core.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.io.IOException;
import kotlin.collections.SetsKt;

/* loaded from: classes18.dex */
public final class UiComponentError_UiInputComponentErrorJsonAdapter extends JsonAdapter<UiComponentError.UiInputComponentError> {
    private final JsonReader.Options options = JsonReader.Options.m3152of("name", "type", "message");
    private final JsonAdapter<String> stringAdapter;

    public UiComponentError_UiInputComponentErrorJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "name");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UiComponentError.UiInputComponentError");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public UiComponentError.UiInputComponentError fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (iSelectName == 1) {
                strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson2 == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (iSelectName == 2 && (strFromJson3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("message", "message", jsonReader);
            }
        }
        jsonReader.endObject();
        if (strFromJson == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (strFromJson2 == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (strFromJson3 != null) {
            return new UiComponentError.UiInputComponentError(strFromJson, strFromJson2, strFromJson3);
        }
        throw Util.missingProperty("message", "message", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, UiComponentError.UiInputComponentError uiInputComponentError) throws IOException {
        if (uiInputComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uiInputComponentError.getName());
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uiInputComponentError.getType());
        jsonWriter.name("message");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uiInputComponentError.getMessage());
        jsonWriter.endObject();
    }
}
