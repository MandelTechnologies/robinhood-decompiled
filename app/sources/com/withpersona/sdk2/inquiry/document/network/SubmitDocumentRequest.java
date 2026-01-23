package com.withpersona.sdk2.inquiry.document.network;

import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubmitDocumentRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0003\f\r\u000eB\u001b\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", Constants.REFERRER_API_META, "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "getMeta", "()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "Data", "Meta", "Companion", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SubmitDocumentRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Data data;
    private final Meta meta;

    public SubmitDocumentRequest(Data data, Meta meta) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SubmitDocumentRequest(Data data, Meta meta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Data(null, 1, 0 == true ? 1 : 0) : data, meta);
    }

    public final Data getData() {
        return this.data;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    /* compiled from: SubmitDocumentRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Data {
        private final String type;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Data(String type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
        }

        public /* synthetic */ Data(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "inquiry" : str);
        }

        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: SubmitDocumentRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "", "fromStep", "", "fromComponent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFromStep", "()Ljava/lang/String;", "getFromComponent", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Meta {
        private final String fromComponent;
        private final String fromStep;

        public Meta(String fromStep, String fromComponent) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
        }

        public final String getFromStep() {
            return this.fromStep;
        }

        public final String getFromComponent() {
            return this.fromComponent;
        }
    }

    /* compiled from: SubmitDocumentRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "fromStep", "", "fromComponent", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SubmitDocumentRequest create(String fromStep, String fromComponent) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            return new SubmitDocumentRequest(null, new Meta(fromStep, fromComponent), 1, 0 == true ? 1 : 0);
        }
    }
}
