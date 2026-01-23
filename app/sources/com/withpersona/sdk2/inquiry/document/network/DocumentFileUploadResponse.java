package com.withpersona.sdk2.inquiry.document.network;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentFileUploadResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DocumentFileUploadResponse {
    private final DocumentFileData data;

    public DocumentFileUploadResponse(DocumentFileData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final DocumentFileData getData() {
        return this.data;
    }
}
