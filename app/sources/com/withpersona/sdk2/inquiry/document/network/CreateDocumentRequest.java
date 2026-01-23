package com.withpersona.sdk2.inquiry.document.network;

import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateDocumentRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", Constants.REFERRER_API_META, "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "getMeta", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "Data", "Attributes", "Meta", "Companion", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CreateDocumentRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Data data;
    private final Meta meta;

    public CreateDocumentRequest(Data data, Meta meta) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    public final Data getData() {
        return this.data;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    /* compiled from: CreateDocumentRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "", "type", "", "attributes", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;)V", "getType", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Data {
        private final Attributes attributes;
        private final String type;

        public Data(String type2, Attributes attributes) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.type = type2;
            this.attributes = attributes;
        }

        public final String getType() {
            return this.type;
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }
    }

    /* compiled from: CreateDocumentRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "", "kind", "", "fileLimit", "", "<init>", "(Ljava/lang/String;I)V", "getKind", "()Ljava/lang/String;", "getFileLimit", "()I", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Attributes {
        private final int fileLimit;
        private final String kind;

        public Attributes(String kind, int i) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.kind = kind;
            this.fileLimit = i;
        }

        public final String getKind() {
            return this.kind;
        }

        public final int getFileLimit() {
            return this.fileLimit;
        }
    }

    /* compiled from: CreateDocumentRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "", "fieldKeyDocument", "", "<init>", "(Ljava/lang/String;)V", "getFieldKeyDocument", "()Ljava/lang/String;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Meta {
        private final String fieldKeyDocument;

        public Meta(String fieldKeyDocument) {
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            this.fieldKeyDocument = fieldKeyDocument;
        }

        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }
    }

    /* compiled from: CreateDocumentRequest.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "type", "", "kind", "fileLimit", "", "fieldKeyDocument", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CreateDocumentRequest create(String type2, String kind, int fileLimit, String fieldKeyDocument) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            return new CreateDocumentRequest(new Data(type2, new Attributes(kind, fileLimit)), new Meta(fieldKeyDocument));
        }
    }
}
