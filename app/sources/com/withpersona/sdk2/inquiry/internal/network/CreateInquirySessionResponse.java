package com.withpersona.sdk2.inquiry.internal.network;

import com.adjust.sdk.Constants;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateInquirySessionResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", Constants.REFERRER_API_META, "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "getMeta", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "Data", "Meta", "Attributes", "GpsCollectionRequirement", "GpsPrecisionRequirement", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CreateInquirySessionResponse {
    private final Data data;
    private final Meta meta;

    public CreateInquirySessionResponse(Data data, Meta meta) {
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

    /* compiled from: CreateInquirySessionResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "", "id", "", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;)V", "getId", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Data {
        private final Attributes attributes;
        private final String id;

        public Data(String id, Attributes attributes) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.id = id;
            this.attributes = attributes;
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: CreateInquirySessionResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "", "accessToken", "", "<init>", "(Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Meta {
        private final String accessToken;

        public Meta(String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            this.accessToken = accessToken;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }
    }

    /* compiled from: CreateInquirySessionResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "", "gpsCollectionRequirement", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "gpsPrecisionRequirement", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "playIntegrityProjectId", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;Ljava/lang/String;)V", "getGpsCollectionRequirement", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "getGpsPrecisionRequirement", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "getPlayIntegrityProjectId", "()Ljava/lang/String;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Attributes {
        private final GpsCollectionRequirement gpsCollectionRequirement;
        private final GpsPrecisionRequirement gpsPrecisionRequirement;
        private final String playIntegrityProjectId;

        public Attributes() {
            this(null, null, null, 7, null);
        }

        public Attributes(GpsCollectionRequirement gpsCollectionRequirement, GpsPrecisionRequirement gpsPrecisionRequirement, String str) {
            this.gpsCollectionRequirement = gpsCollectionRequirement;
            this.gpsPrecisionRequirement = gpsPrecisionRequirement;
            this.playIntegrityProjectId = str;
        }

        public /* synthetic */ Attributes(GpsCollectionRequirement gpsCollectionRequirement, GpsPrecisionRequirement gpsPrecisionRequirement, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gpsCollectionRequirement, (i & 2) != 0 ? null : gpsPrecisionRequirement, (i & 4) != 0 ? null : str);
        }

        public final GpsCollectionRequirement getGpsCollectionRequirement() {
            return this.gpsCollectionRequirement;
        }

        public final GpsPrecisionRequirement getGpsPrecisionRequirement() {
            return this.gpsPrecisionRequirement;
        }

        public final String getPlayIntegrityProjectId() {
            return this.playIntegrityProjectId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateInquirySessionResponse.kt */
    @JsonClass(generateAdapter = false)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRE", "OPTIONAL", "NONE", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class GpsCollectionRequirement {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GpsCollectionRequirement[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final GpsCollectionRequirement REQUIRE = new GpsCollectionRequirement("REQUIRE", 0);
        public static final GpsCollectionRequirement OPTIONAL = new GpsCollectionRequirement("OPTIONAL", 1);
        public static final GpsCollectionRequirement NONE = new GpsCollectionRequirement("NONE", 2);

        private static final /* synthetic */ GpsCollectionRequirement[] $values() {
            return new GpsCollectionRequirement[]{REQUIRE, OPTIONAL, NONE};
        }

        public static EnumEntries<GpsCollectionRequirement> getEntries() {
            return $ENTRIES;
        }

        private GpsCollectionRequirement(String str, int i) {
        }

        static {
            GpsCollectionRequirement[] gpsCollectionRequirementArr$values = $values();
            $VALUES = gpsCollectionRequirementArr$values;
            $ENTRIES = EnumEntries2.enumEntries(gpsCollectionRequirementArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: CreateInquirySessionResponse.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Companion extends JsonAdapter<GpsCollectionRequirement> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, GpsCollectionRequirement value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public GpsCollectionRequirement fromJson(JsonReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object jsonValue = reader.readJsonValue();
                return Intrinsics.areEqual(jsonValue, "require") ? GpsCollectionRequirement.REQUIRE : Intrinsics.areEqual(jsonValue, "optional") ? GpsCollectionRequirement.OPTIONAL : GpsCollectionRequirement.NONE;
            }
        }

        public static GpsCollectionRequirement valueOf(String str) {
            return (GpsCollectionRequirement) Enum.valueOf(GpsCollectionRequirement.class, str);
        }

        public static GpsCollectionRequirement[] values() {
            return (GpsCollectionRequirement[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateInquirySessionResponse.kt */
    @JsonClass(generateAdapter = false)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "", "<init>", "(Ljava/lang/String;I)V", "ROUGH", "PRECISE", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class GpsPrecisionRequirement {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GpsPrecisionRequirement[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final GpsPrecisionRequirement ROUGH = new GpsPrecisionRequirement("ROUGH", 0);
        public static final GpsPrecisionRequirement PRECISE = new GpsPrecisionRequirement("PRECISE", 1);

        private static final /* synthetic */ GpsPrecisionRequirement[] $values() {
            return new GpsPrecisionRequirement[]{ROUGH, PRECISE};
        }

        public static EnumEntries<GpsPrecisionRequirement> getEntries() {
            return $ENTRIES;
        }

        private GpsPrecisionRequirement(String str, int i) {
        }

        static {
            GpsPrecisionRequirement[] gpsPrecisionRequirementArr$values = $values();
            $VALUES = gpsPrecisionRequirementArr$values;
            $ENTRIES = EnumEntries2.enumEntries(gpsPrecisionRequirementArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: CreateInquirySessionResponse.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Companion extends JsonAdapter<GpsPrecisionRequirement> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.JsonAdapter
            @ToJson
            public void toJson(JsonWriter writer, GpsPrecisionRequirement value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.moshi.JsonAdapter
            @FromJson
            public GpsPrecisionRequirement fromJson(JsonReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Intrinsics.areEqual(reader.readJsonValue(), "rough") ? GpsPrecisionRequirement.ROUGH : GpsPrecisionRequirement.PRECISE;
            }
        }

        public static GpsPrecisionRequirement valueOf(String str) {
            return (GpsPrecisionRequirement) Enum.valueOf(GpsPrecisionRequirement.class, str);
        }

        public static GpsPrecisionRequirement[] values() {
            return (GpsPrecisionRequirement[]) $VALUES.clone();
        }
    }
}
