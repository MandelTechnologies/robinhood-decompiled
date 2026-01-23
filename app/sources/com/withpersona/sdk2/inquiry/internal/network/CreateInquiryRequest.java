package com.withpersona.sdk2.inquiry.internal.network;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateInquiryRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0003\b\t\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "Data", "Attributes", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CreateInquiryRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Data data;

    public CreateInquiryRequest(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final Data getData() {
        return this.data;
    }

    /* compiled from: CreateInquiryRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Attributes;", "attributes", "", "type", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Attributes;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Attributes;", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Adapter", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Data {

        /* renamed from: Adapter, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Attributes attributes;
        private final String type;

        /* compiled from: CreateInquiryRequest.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;", "", "<init>", "()V", "toJson", "", "jsonWriter", "Lcom/squareup/moshi/JsonWriter;", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$Data$Adapter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @ToJson
            public final void toJson(JsonWriter jsonWriter, Data data) throws IOException {
                Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
                Intrinsics.checkNotNullParameter(data, "data");
                jsonWriter.beginObject();
                jsonWriter.name("attributes");
                jsonWriter.beginObject();
                String templateId = data.getAttributes().getTemplateId();
                if (templateId != null) {
                    jsonWriter.name("inquiryTemplateId").value(templateId);
                }
                String templateVersion = data.getAttributes().getTemplateVersion();
                if (templateVersion != null) {
                    jsonWriter.name("inquiryTemplateVersionId").value(templateVersion);
                }
                jsonWriter.name("environment").value(data.getAttributes().getEnvironment());
                String environmentId = data.getAttributes().getEnvironmentId();
                if (environmentId != null) {
                    jsonWriter.name("environment_id").value(environmentId);
                }
                String accountId = data.getAttributes().getAccountId();
                if (accountId != null) {
                    jsonWriter.name("accountId").value(accountId);
                }
                String referenceId = data.getAttributes().getReferenceId();
                if (referenceId != null) {
                    jsonWriter.name("referenceId").value(referenceId);
                }
                String note = data.getAttributes().getNote();
                if (note != null) {
                    jsonWriter.name("note").value(note);
                }
                if (data.getAttributes().getFields() != null) {
                    jsonWriter.name("fields");
                    InquiryFieldMap.INSTANCE.toJson(jsonWriter, new InquiryFieldMap(data.getAttributes().getFields()));
                }
                if (data.getAttributes().getThemeSetId() != null) {
                    jsonWriter.name("themeSetId").value(data.getAttributes().getThemeSetId());
                }
                jsonWriter.endObject();
                jsonWriter.endObject();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @FromJson
            public final Data fromJson(JsonReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                reader.beginObject();
                String strNextString = "";
                String strNextString2 = strNextString;
                while (reader.hasNext()) {
                    String strNextName = reader.nextName();
                    if (Intrinsics.areEqual(strNextName, "templateId")) {
                        strNextString = reader.nextString();
                    } else if (Intrinsics.areEqual(strNextName, "environment")) {
                        strNextString2 = reader.nextString();
                    } else {
                        reader.skipValue();
                    }
                }
                reader.endObject();
                return new Data(new Attributes(strNextString, null, strNextString2, "", null, null, null, null, null, 498, null), null, 2, 0 == true ? 1 : 0);
            }
        }

        public Data(Attributes attributes, String type2) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.attributes = attributes;
            this.type = type2;
        }

        public /* synthetic */ Data(Attributes attributes, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(attributes, (i & 2) != 0 ? "inquiry" : str);
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }
    }

    /* compiled from: CreateInquiryRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Attributes;", "", "templateId", "", "templateVersion", "environment", "environmentId", "accountId", "referenceId", "note", "fields", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getTemplateId", "()Ljava/lang/String;", "getTemplateVersion", "getEnvironment", "getEnvironmentId", "getAccountId", "getReferenceId", "getNote", "getFields", "()Ljava/util/Map;", "getThemeSetId", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Attributes {
        private final String accountId;
        private final String environment;
        private final String environmentId;
        private final Map<String, InquiryField> fields;
        private final String note;
        private final String referenceId;
        private final String templateId;
        private final String templateVersion;
        private final String themeSetId;

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(String str, String str2, String environment, String str3, String str4, String str5, String str6, Map<String, ? extends InquiryField> map, String str7) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            this.templateId = str;
            this.templateVersion = str2;
            this.environment = environment;
            this.environmentId = str3;
            this.accountId = str4;
            this.referenceId = str5;
            this.note = str6;
            this.fields = map;
            this.themeSetId = str7;
        }

        public /* synthetic */ Attributes(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : map, (i & 256) != 0 ? null : str8);
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        public final String getEnvironment() {
            return this.environment;
        }

        public final String getEnvironmentId() {
            return this.environmentId;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final String getReferenceId() {
            return this.referenceId;
        }

        public final String getNote() {
            return this.note;
        }

        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        public final String getThemeSetId() {
            return this.themeSetId;
        }
    }

    /* compiled from: CreateInquiryRequest.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "templateId", "", "templateVersion", "environment", "environmentId", "accountId", "referenceId", "fields", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "themeSetId", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CreateInquiryRequest create(String templateId, String templateVersion, String environment, String environmentId, String accountId, String referenceId, Map<String, ? extends InquiryField> fields, String themeSetId) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            return new CreateInquiryRequest(new Data(new Attributes(templateId, templateVersion, environment, environmentId, accountId, referenceId, null, fields, themeSetId, 64, null), null, 2, 0 == true ? 1 : 0));
        }
    }
}
