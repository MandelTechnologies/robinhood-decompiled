package com.withpersona.sdk2.inquiry.p424ui.network;

import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransitionInquiryRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", Constants.REFERRER_API_META, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "getMeta", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "Data", "Attributes", "Meta", "Companion", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TransitionInquiryRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Data data;
    private final Meta meta;

    public TransitionInquiryRequest(Data data, Meta meta) {
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

    /* compiled from: TransitionInquiryRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "", "attributes", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;)V", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Data {
        private final Attributes attributes;

        public Data(Attributes attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.attributes = attributes;
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }
    }

    /* compiled from: TransitionInquiryRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "", "componentParams", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "<init>", "(Ljava/util/Map;)V", "getComponentParams", "()Ljava/util/Map;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Attributes {
        private final Map<String, ComponentParam> componentParams;

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(Map<String, ? extends ComponentParam> map) {
            this.componentParams = map;
        }

        public final Map<String, ComponentParam> getComponentParams() {
            return this.componentParams;
        }
    }

    /* compiled from: TransitionInquiryRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "", "fromComponent", "", "fromStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFromComponent", "()Ljava/lang/String;", "getFromStep", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Meta {
        private final String fromComponent;
        private final String fromStep;

        public Meta(String fromComponent, String fromStep) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
        }

        public final String getFromComponent() {
            return this.fromComponent;
        }

        public final String getFromStep() {
            return this.fromStep;
        }
    }

    /* compiled from: TransitionInquiryRequest.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\n¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "fromComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "componentParams", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "fromStep", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransitionInquiryRequest create(UiComponent fromComponent, Map<String, ? extends ComponentParam> componentParams, String fromStep) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(componentParams, "componentParams");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            return new TransitionInquiryRequest(new Data(new Attributes(componentParams)), new Meta(fromComponent.getName(), fromStep));
        }
    }
}
