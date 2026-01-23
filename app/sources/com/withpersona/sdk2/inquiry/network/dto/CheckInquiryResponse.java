package com.withpersona.sdk2.inquiry.network.dto;

import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckInquiryResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "token", "", "included", "", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;Ljava/lang/String;Ljava/util/List;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "getToken", "()Ljava/lang/String;", "getIncluded", "()Ljava/util/List;", "Data", "Attributes", "WaitForTransitionConfig", "PollingMode", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CheckInquiryResponse {
    private final Data data;
    private final List<Included> included;
    private final String token;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckInquiryResponse(Data data, String str, List<? extends Included> list) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.token = str;
        this.included = list;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getToken() {
        return this.token;
    }

    public final List<Included> getIncluded() {
        return this.included;
    }

    /* compiled from: CheckInquiryResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "", "id", "", "type", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;)V", "getId", "()Ljava/lang/String;", "getType", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Data {
        private final Attributes attributes;
        private final String id;
        private final String type;

        public Data(String id, String type2, Attributes attributes) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.id = id;
            this.type = type2;
            this.attributes = attributes;
        }

        public final String getId() {
            return this.id;
        }

        public final String getType() {
            return this.type;
        }

        public /* synthetic */ Data(String str, String str2, Attributes attributes, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? new Attributes(null, null, NextStep.Unknown.INSTANCE, null, new WaitForTransitionConfig(null, null, PollingMode.None), null) : attributes);
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }
    }

    /* compiled from: CheckInquiryResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "", "selectedCountryCode", "", "status", "nextStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "fields", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "waitForTransitionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "environment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;Ljava/lang/String;)V", "getSelectedCountryCode", "()Ljava/lang/String;", "getStatus", "getNextStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "getFields", "()Ljava/util/Map;", "getWaitForTransitionConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "getEnvironment", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Attributes {
        private final String environment;
        private final Map<String, InquiryField> fields;
        private final NextStep nextStep;
        private final String selectedCountryCode;
        private final String status;
        private final WaitForTransitionConfig waitForTransitionConfig;

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(String str, String str2, NextStep nextStep, Map<String, ? extends InquiryField> map, @Json(name = "waitForTransition") WaitForTransitionConfig waitForTransitionConfig, String str3) {
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            Intrinsics.checkNotNullParameter(waitForTransitionConfig, "waitForTransitionConfig");
            this.selectedCountryCode = str;
            this.status = str2;
            this.nextStep = nextStep;
            this.fields = map;
            this.waitForTransitionConfig = waitForTransitionConfig;
            this.environment = str3;
        }

        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        public final String getStatus() {
            return this.status;
        }

        public final NextStep getNextStep() {
            return this.nextStep;
        }

        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        public final WaitForTransitionConfig getWaitForTransitionConfig() {
            return this.waitForTransitionConfig;
        }

        public final String getEnvironment() {
            return this.environment;
        }
    }

    /* compiled from: CheckInquiryResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "", "intervalMs", "", "maxAttempts", "pollingMode", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;)V", "getIntervalMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxAttempts", "getPollingMode", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class WaitForTransitionConfig {
        private final Long intervalMs;
        private final Long maxAttempts;
        private final PollingMode pollingMode;

        public WaitForTransitionConfig(Long l, Long l2, PollingMode pollingMode) {
            Intrinsics.checkNotNullParameter(pollingMode, "pollingMode");
            this.intervalMs = l;
            this.maxAttempts = l2;
            this.pollingMode = pollingMode;
        }

        public final Long getIntervalMs() {
            return this.intervalMs;
        }

        public final Long getMaxAttempts() {
            return this.maxAttempts;
        }

        public final PollingMode getPollingMode() {
            return this.pollingMode;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckInquiryResponse.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "", "<init>", "(Ljava/lang/String;I)V", "Blocking", "Background", "None", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class PollingMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PollingMode[] $VALUES;

        @Json(name = "blocking")
        public static final PollingMode Blocking = new PollingMode("Blocking", 0);

        @Json(name = "background")
        public static final PollingMode Background = new PollingMode("Background", 1);

        @Json(name = ApiRenderablePlatforms.VERSIONS_NONE)
        public static final PollingMode None = new PollingMode("None", 2);

        private static final /* synthetic */ PollingMode[] $values() {
            return new PollingMode[]{Blocking, Background, None};
        }

        public static EnumEntries<PollingMode> getEntries() {
            return $ENTRIES;
        }

        private PollingMode(String str, int i) {
        }

        static {
            PollingMode[] pollingModeArr$values = $values();
            $VALUES = pollingModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(pollingModeArr$values);
        }

        public static PollingMode valueOf(String str) {
            return (PollingMode) Enum.valueOf(PollingMode.class, str);
        }

        public static PollingMode[] values() {
            return (PollingMode[]) $VALUES.clone();
        }
    }
}
