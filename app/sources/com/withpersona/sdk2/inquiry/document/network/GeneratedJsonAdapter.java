package com.withpersona.sdk2.inquiry.document.network;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateDocumentResponseJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "dataAdapter", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "nullableListOfDocumentFileDataAdapter", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponseJsonAdapter, reason: from toString */
/* loaded from: classes18.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<CreateDocumentResponse> {
    private final JsonAdapter<CreateDocumentResponse.Data> dataAdapter;
    private final JsonAdapter<List<DocumentFileData>> nullableListOfDocumentFileDataAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of(WebsocketGatewayConstants.DATA_KEY, "included");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<CreateDocumentResponse.Data> jsonAdapterAdapter = moshi.adapter(CreateDocumentResponse.Data.class, SetsKt.emptySet(), WebsocketGatewayConstants.DATA_KEY);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.dataAdapter = jsonAdapterAdapter;
        JsonAdapter<List<DocumentFileData>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, DocumentFileData.class), SetsKt.emptySet(), "included");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableListOfDocumentFileDataAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CreateDocumentResponse");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public CreateDocumentResponse fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CreateDocumentResponse.Data dataFromJson = null;
        List<DocumentFileData> listFromJson = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                dataFromJson = this.dataAdapter.fromJson(reader);
                if (dataFromJson == null) {
                    throw Util.unexpectedNull("data_", WebsocketGatewayConstants.DATA_KEY, reader);
                }
            } else if (iSelectName == 1) {
                listFromJson = this.nullableListOfDocumentFileDataAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (dataFromJson != null) {
            return new CreateDocumentResponse(dataFromJson, listFromJson);
        }
        throw Util.missingProperty("data_", WebsocketGatewayConstants.DATA_KEY, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CreateDocumentResponse value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name(WebsocketGatewayConstants.DATA_KEY);
        this.dataAdapter.toJson(writer, (JsonWriter) value_.getData());
        writer.name("included");
        this.nullableListOfDocumentFileDataAdapter.toJson(writer, (JsonWriter) value_.getIncluded());
        writer.endObject();
    }
}
