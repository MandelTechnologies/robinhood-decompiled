package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.io.IOException;
import kotlin.collections.SetsKt;

/* loaded from: classes18.dex */
public final class InternalErrorInfo_PermissionErrorInfoJsonAdapter extends JsonAdapter<InternalErrorInfo.PermissionErrorInfo> {
    private final JsonReader.Options options = JsonReader.Options.m3152of("message");
    private final JsonAdapter<String> stringAdapter;

    public InternalErrorInfo_PermissionErrorInfoJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "message");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InternalErrorInfo.PermissionErrorInfo");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public InternalErrorInfo.PermissionErrorInfo fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0 && (strFromJson = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("message", "message", jsonReader);
            }
        }
        jsonReader.endObject();
        if (strFromJson != null) {
            return new InternalErrorInfo.PermissionErrorInfo(strFromJson);
        }
        throw Util.missingProperty("message", "message", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, InternalErrorInfo.PermissionErrorInfo permissionErrorInfo) throws IOException {
        if (permissionErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("message");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) permissionErrorInfo.getMessage());
        jsonWriter.endObject();
    }
}
