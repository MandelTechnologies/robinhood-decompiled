package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.io.IOException;
import java.lang.reflect.Constructor;
import kotlin.collections.SetsKt;

/* loaded from: classes18.dex */
public final class InternalErrorInfo_NetworkErrorInfoJsonAdapter extends JsonAdapter<InternalErrorInfo.NetworkErrorInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InternalErrorInfo.NetworkErrorInfo> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<ErrorResponse.Error> nullableErrorAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("code", "message", "isRecoverable", "responseError");

    public InternalErrorInfo_NetworkErrorInfoJsonAdapter(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "code");
        this.nullableStringAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "message");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isRecoverable");
        this.nullableErrorAdapter = moshi.adapter(ErrorResponse.Error.class, SetsKt.emptySet(), "responseError");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(56);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InternalErrorInfo.NetworkErrorInfo");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public InternalErrorInfo.NetworkErrorInfo fromJson(JsonReader jsonReader) throws NoSuchMethodException, IOException, SecurityException {
        jsonReader.beginObject();
        Integer numFromJson = null;
        String strFromJson = null;
        Boolean boolFromJson = null;
        ErrorResponse.Error errorFromJson = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                numFromJson = this.intAdapter.fromJson(jsonReader);
                if (numFromJson == null) {
                    throw Util.unexpectedNull("code", "code", jsonReader);
                }
            } else if (iSelectName == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (iSelectName == 2) {
                boolFromJson = this.booleanAdapter.fromJson(jsonReader);
                if (boolFromJson == null) {
                    throw Util.unexpectedNull("isRecoverable", "isRecoverable", jsonReader);
                }
            } else if (iSelectName == 3) {
                errorFromJson = this.nullableErrorAdapter.fromJson(jsonReader);
                i = -9;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (numFromJson == null) {
                throw Util.missingProperty("code", "code", jsonReader);
            }
            int iIntValue = numFromJson.intValue();
            if (boolFromJson != null) {
                return new InternalErrorInfo.NetworkErrorInfo(iIntValue, strFromJson, boolFromJson.booleanValue(), errorFromJson);
            }
            throw Util.missingProperty("isRecoverable", "isRecoverable", jsonReader);
        }
        Constructor<InternalErrorInfo.NetworkErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            declaredConstructor = InternalErrorInfo.NetworkErrorInfo.class.getDeclaredConstructor(cls2, String.class, Boolean.TYPE, ErrorResponse.Error.class, cls2, cls);
            this.constructorRef = declaredConstructor;
        }
        if (numFromJson == null) {
            throw Util.missingProperty("code", "code", jsonReader);
        }
        if (boolFromJson != null) {
            return declaredConstructor.newInstance(numFromJson, strFromJson, boolFromJson, errorFromJson, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("isRecoverable", "isRecoverable", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, InternalErrorInfo.NetworkErrorInfo networkErrorInfo) throws IOException {
        if (networkErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("code");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(networkErrorInfo.getCode()));
        jsonWriter.name("message");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) networkErrorInfo.getMessage());
        jsonWriter.name("isRecoverable");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(networkErrorInfo.isRecoverable()));
        jsonWriter.name("responseError");
        this.nullableErrorAdapter.toJson(jsonWriter, (JsonWriter) networkErrorInfo.getResponseError());
        jsonWriter.endObject();
    }
}
