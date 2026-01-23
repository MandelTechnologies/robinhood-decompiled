package com.withpersona.sdk2.inquiry.document.network;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateDocumentResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "included", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;Ljava/util/List;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "getIncluded", "()Ljava/util/List;", "Data", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CreateDocumentResponse {
    private final Data data;
    private final List<DocumentFileData> included;

    public CreateDocumentResponse(Data data, List<DocumentFileData> list) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.included = list;
    }

    public final Data getData() {
        return this.data;
    }

    public final List<DocumentFileData> getIncluded() {
        return this.included;
    }

    /* compiled from: CreateDocumentResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Data {
        private final String id;

        public Data(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }
    }
}
