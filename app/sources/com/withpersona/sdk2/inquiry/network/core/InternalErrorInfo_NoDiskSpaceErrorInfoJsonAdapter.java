package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.io.IOException;
import java.lang.reflect.Constructor;
import kotlin.collections.SetsKt;

/* loaded from: classes18.dex */
public final class InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter extends JsonAdapter<InternalErrorInfo.NoDiskSpaceErrorInfo> {
    private volatile Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.m3152of("message");
    private final JsonAdapter<String> stringAdapter;

    public InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "message");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InternalErrorInfo.NoDiskSpaceErrorInfo");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public InternalErrorInfo.NoDiskSpaceErrorInfo fromJson(JsonReader jsonReader) throws NoSuchMethodException, IOException, SecurityException {
        jsonReader.beginObject();
        String strFromJson = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("message", "message", jsonReader);
                }
                i = -2;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            return new InternalErrorInfo.NoDiskSpaceErrorInfo(strFromJson);
        }
        Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InternalErrorInfo.NoDiskSpaceErrorInfo.class.getDeclaredConstructor(String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(strFromJson, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, InternalErrorInfo.NoDiskSpaceErrorInfo noDiskSpaceErrorInfo) throws IOException {
        if (noDiskSpaceErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("message");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) noDiskSpaceErrorInfo.getMessage());
        jsonWriter.endObject();
    }
}
