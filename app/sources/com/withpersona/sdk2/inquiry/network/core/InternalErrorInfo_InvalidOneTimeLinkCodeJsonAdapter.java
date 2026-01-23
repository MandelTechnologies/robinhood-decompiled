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
public final class InternalErrorInfo_InvalidOneTimeLinkCodeJsonAdapter extends JsonAdapter<InternalErrorInfo.InvalidOneTimeLinkCode> {
    private final JsonReader.Options options = JsonReader.Options.m3152of("oneTimeLinkCode");
    private final JsonAdapter<String> stringAdapter;

    public InternalErrorInfo_InvalidOneTimeLinkCodeJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "oneTimeLinkCode");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(62);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InternalErrorInfo.InvalidOneTimeLinkCode");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public InternalErrorInfo.InvalidOneTimeLinkCode fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0 && (strFromJson = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("oneTimeLinkCode", "oneTimeLinkCode", jsonReader);
            }
        }
        jsonReader.endObject();
        if (strFromJson != null) {
            return new InternalErrorInfo.InvalidOneTimeLinkCode(strFromJson);
        }
        throw Util.missingProperty("oneTimeLinkCode", "oneTimeLinkCode", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, InternalErrorInfo.InvalidOneTimeLinkCode invalidOneTimeLinkCode) throws IOException {
        if (invalidOneTimeLinkCode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("oneTimeLinkCode");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) invalidOneTimeLinkCode.getOneTimeLinkCode());
        jsonWriter.endObject();
    }
}
