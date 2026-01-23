package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import java.io.IOException;
import kotlin.collections.SetsKt;

/* renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter */
/* loaded from: classes18.dex */
public final class C43669xa14fbf1c extends JsonAdapter<GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.m3152of("min_dimension_size", "max_dimension_size");

    public C43669xa14fbf1c(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "minDimensionSize");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(113);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                numFromJson = this.intAdapter.fromJson(jsonReader);
                if (numFromJson == null) {
                    throw Util.unexpectedNull("minDimensionSize", "min_dimension_size", jsonReader);
                }
            } else if (iSelectName == 1 && (numFromJson2 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("maxDimensionSize", "max_dimension_size", jsonReader);
            }
        }
        jsonReader.endObject();
        if (numFromJson == null) {
            throw Util.missingProperty("minDimensionSize", "min_dimension_size", jsonReader);
        }
        int iIntValue = numFromJson.intValue();
        if (numFromJson2 != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details(iIntValue, numFromJson2.intValue());
        }
        throw Util.missingProperty("maxDimensionSize", "max_dimension_size", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details details) throws IOException {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("min_dimension_size");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(details.getMinDimensionSize()));
        jsonWriter.name("max_dimension_size");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(details.getMaxDimensionSize()));
        jsonWriter.endObject();
    }
}
